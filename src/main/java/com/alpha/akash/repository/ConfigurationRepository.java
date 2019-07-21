package com.alpha.akash.repository;

import com.alpha.akash.entity.ConfigurationData;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * @author : akashdhar
 * @date : 21-07-2019
 * @time : 12:02 PM
 */
public interface ConfigurationRepository extends CrudRepository<ConfigurationData, String> {
    List<ConfigurationData> findByApp(String app);
}
