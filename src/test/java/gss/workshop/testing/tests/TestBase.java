package gss.workshop.testing.tests;

import static io.restassured.RestAssured.baseURI;

import gss.workshop.testing.utils.PropertyReader;

public class TestBase {

  protected static PropertyReader prop;
  protected static String token;
  protected static String key;
  protected static String version;

  public TestBase() {
    prop = PropertyReader.getInstance();
    baseURI = prop.getProperty("baseURI");
    token = prop.getProperty("token");
    key = prop.getProperty("key");
    version = prop.getProperty("version");
  }
}
