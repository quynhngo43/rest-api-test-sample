package gss.workshop.testing.utils;

import java.util.HashMap;
import java.util.Map;

public class RestUtils {
  /**
   * Building params of a http request
   *
   * @param map map data of params
   * @return HashMap<String, String> return params under a hashmap
   */
  public static HashMap<String, String> addParams(Map map) {
    return new HashMap<String, String>(map);
  }
}
