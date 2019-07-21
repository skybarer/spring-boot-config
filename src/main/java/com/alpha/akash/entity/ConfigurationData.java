package com.alpha.akash.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author : akashdhar
 * @date : 21-07-2019
 * @time : 12:52 PM
 */
@Entity
@Table(name = "TB_AKASH_CONFIGURATION")
@Data
public class ConfigurationData {
    private String app;
    @Id
    private String configKey;
    private String configValue;

    @Override
    public String toString() {
        return "ConfigurationData{" +
                "app='" + app + '\'' +
                ", configKey='" + configKey + '\'' +
                ", configValue='" + configValue + '\'' +
                '}';
    }
}
