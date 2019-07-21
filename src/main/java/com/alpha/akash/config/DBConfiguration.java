package com.alpha.akash.config;

import com.alpha.akash.entity.ConfigurationData;
import com.alpha.akash.repository.ConfigurationRepository;
import org.slf4j.LoggerFactory;
import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.*;
import java.util.stream.Collectors;

import com.alpha.akash.exception.NoSuchKeyException;

/**
 * @author : akashdhar
 * @date : 21-07-2019
 * @time : 12:18 PM
 */
public class DBConfiguration extends Configuration {

    private static Logger logger = LoggerFactory.getLogger(DBConfiguration.class);

    public String type;

    @Autowired
    private ConfigurationRepository configurationRepository;

    public Map<String, String> inMemoryConfigMap = new HashMap<>();

    public DBConfiguration(String app) {
        super(app);
    }

    private String checkAndGetValue(String key) {
        if (!inMemoryConfigMap.containsKey(key)) {
            throw new NoSuchKeyException(String.format("Configuration key '%s' not found", key));
        }
        return inMemoryConfigMap.get(key);
    }

    private String checkAndGetValue(String key, Object defaultValue) {
        if (!inMemoryConfigMap.containsKey(key)) {
            String configTemplate = "Configuration key '%s' not found. Defaulting to '%s'";
            logger.warn(String.format(configTemplate, key, defaultValue.toString()));
        }
        return inMemoryConfigMap.get(key);
    }

    @Override
    public int getInt(String key) {
        return Integer.valueOf(checkAndGetValue(key));
    }

    @Override
    public int getInt(String key, int defaultValue) {
        return Integer.valueOf(checkAndGetValue(key, defaultValue));
    }

    @Override
    public long getLong(String key) {
        return Long.valueOf(checkAndGetValue(key));
    }

    @Override
    public long getLong(String key, long defaultValue) {
        return Long.valueOf(checkAndGetValue(key, defaultValue));
    }

    @Override
    public String getString(String key) {
        return String.valueOf(checkAndGetValue(key));
    }

    @Override
    public String getString(String key, String defaultValue) {
        return String.valueOf(checkAndGetValue(key, defaultValue));
    }

    @Override
    public boolean getBoolean(String key) {
        return Boolean.valueOf(checkAndGetValue(key));
    }

    @Override
    public boolean getBoolean(String key, String defaultValue) {
        return Boolean.valueOf(checkAndGetValue(key, defaultValue));
    }

    @Override
    public List<String> getList(String key) {
        String listValue = checkAndGetValue(key);
        String[] commaSeparatedArr = listValue.split(",");
        return Arrays.stream(commaSeparatedArr).collect(Collectors.toList());
    }

    @Override
    public Set<String> getSet(String key) {
        return new HashSet<>(getList(key));
    }

    @Override
    public void set(String key, String value) {
        ConfigurationData configurationData = configurationRepository.findById(key).get();
        configurationData.setConfigValue(value);
        configurationRepository.save(configurationData);
    }

    @Override
    public void refresh() {
        inMemoryConfigMap.clear();
        List<ConfigurationData> configurationData = configurationRepository.findByApp(getApp());
        logger.info("Reloading config: {}", configurationData);
        configurationData.forEach(config -> inMemoryConfigMap.put(config.getConfigKey(), config.getConfigValue()));
    }
}
