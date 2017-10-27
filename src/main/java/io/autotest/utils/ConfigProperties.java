package io.autotest.utils;

import java.io.IOException;
import java.util.Properties;

public class ConfigProperties {
  private static final String DRIVER_NAME = "driver.name";
  private static final String CONFIG_FILE_NAME = "config.properties";
  private static ConfigProperties instance = null;
  private Properties props;

  private ConfigProperties() {
    try {
      props = new Properties();
      props.load(Thread.currentThread().getContextClassLoader().getResourceAsStream(CONFIG_FILE_NAME));
    } catch (IOException e) {
      throw new RuntimeException("Unable to load configuration file", e);
    }
  }

  public static ConfigProperties getInstance() {
    if (instance == null) {
      instance = new ConfigProperties();
    }
    return instance;
  }

  private String getProperty(final String key) {
    return props.getProperty(key);
  }

  public String getDriverName() {
    return getProperty(DRIVER_NAME);
  }

}
