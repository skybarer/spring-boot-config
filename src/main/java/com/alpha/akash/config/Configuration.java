package com.alpha.akash.config;

import java.util.List;
import java.util.Set;

public abstract class Configuration {
    private String app;
    private String value;

    public Configuration(String app) {
        this.app = app;
    }

    public abstract int getInt(String key);

    public abstract int getInt(String key, int defaultValue);

    public abstract long getLong(String key);

    public abstract long getLong(String key, long defaultValue);

    public abstract String getString(String key);

    public abstract String getString(String key, String defaultValue);

    public abstract boolean getBoolean(String key);

    public abstract boolean getBoolean(String key, String defaultValue);

    public abstract List<String> getList(String key);

    public abstract Set<String> getSet(String key);

    public abstract void set(String key, String value);

    public abstract void refresh();

    public String get(String key) {
        return getString(key);
    }

    public String get(String key, String defaultValue) {
        return getString(key, defaultValue);
    }

    public String getApp() {
        return app;
    }

}
