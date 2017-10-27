package io.autotest.utils;

import java.util.HashMap;
import java.util.Map;

/**
 * The type Context.
 */
public class Context {
  private static final ThreadLocal<Map<String, Object>> CONTEXT = new ThreadLocal<Map<String, Object>>() {
    @Override
    protected Map<String, Object> initialValue() {
      return new HashMap<>();
    }
  };

  /**
   * Put variable.
   *
   * @param key   the key
   * @param value the value
   */
  public static void putVariable(String key, Object value) {
    Map<String, Object> scope = CONTEXT.get();
    scope.put(key, value);
  }

  /**
   * Gets variable.
   *
   * @param key the key
   * @return the variable
   */
  public static Object getVariable(String key) {
    Map<String, Object> scope = CONTEXT.get();
    return scope.get(key);
  }

}
