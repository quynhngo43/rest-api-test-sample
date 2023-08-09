package gss.workshop.testing.tests;

import static io.restassured.RestAssured.baseURI;

import gss.workshop.testing.utils.PropertyReader;

public class TestBase {

  protected static PropertyReader prop;
  protected static String token;
  protected static String key;
  protected static String version;
  protected static final int SUCCESSFUL_RESPONSE = 200;
  protected static final int NOT_FOUND_RESPONSE = 404;
  protected static final Object NULL_VALUE = null;
  protected static final String TODO_NAME = "Todo";
  protected static final String DONE_NAME = "Done";
  protected static final String PRIVATE_VALUE = "private";

  public TestBase() {
    prop = PropertyReader.getInstance();
    baseURI = prop.getProperty("baseURI");
    token = prop.getProperty("token");
    key = prop.getProperty("key");
    version = prop.getProperty("version");
  }
}
