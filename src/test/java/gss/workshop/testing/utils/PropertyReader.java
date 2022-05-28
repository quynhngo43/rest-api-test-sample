package gss.workshop.testing.utils;

import java.io.InputStream;
import java.util.Properties;

public class PropertyReader {

  private static volatile PropertyReader propertyReaderInstance;

  private PropertyReader() {}

  public static synchronized PropertyReader getInstance() {
    if (propertyReaderInstance == null) {
      propertyReaderInstance = new PropertyReader();
    }
    return propertyReaderInstance;
  }

  /**
   * Get property value based on property name
   *
   * @param propertyName name of the property
   * @return value of the property
   */
  public String getProperty(String propertyName) {
    Properties prop = new Properties();
    try {
      InputStream inputStream =
          getClass().getClassLoader().getResourceAsStream("application.properties");
      prop.load(inputStream);
      if (prop.getProperty(propertyName) != null) {
        return prop.getProperty(propertyName);
      }
    } catch (Exception e) {
      System.out.println("Property not found");
    }
    return null;
  }
}
