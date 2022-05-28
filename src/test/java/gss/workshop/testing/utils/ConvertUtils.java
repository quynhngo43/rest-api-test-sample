package gss.workshop.testing.utils;

import com.sun.codemodel.JCodeModel;
import io.restassured.response.Response;
import java.io.File;
import java.io.IOException;
import java.net.URL;
import org.jsonschema2pojo.*;
import org.jsonschema2pojo.rules.RuleFactory;

public class ConvertUtils {

  /**
   * Mapping an http body response to a pojo class
   *
   * @param res Http response is returned after sending a certain request to specific service
   * @param contentClass The data type which is used for mapping res to
   * @param <T> Generic type of class
   * @return instance of T - POJO
   */
  public static <T> T convertRestResponseToPojo(Response res, Class<T> contentClass) {
    return res.thenReturn().as(contentClass);
  }

  /**
   * * Generate Pojo object from json file
   *
   * @param inputJsonUrl
   * @param outputJavaClassDirectory
   * @param packageName
   * @param javaClassName
   * @throws IOException
   */
  public static void convertJsonToJavaClass(
      URL inputJsonUrl, File outputJavaClassDirectory, String packageName, String javaClassName)
      throws IOException {
    JCodeModel jcodeModel = new JCodeModel();

    GenerationConfig config =
        new DefaultGenerationConfig() {
          @Override
          public boolean isGenerateBuilders() {
            return true;
          }

          @Override
          public SourceType getSourceType() {
            return SourceType.JSON;
          }
        };

    SchemaMapper mapper =
        new SchemaMapper(
            new RuleFactory(config, new Jackson2Annotator(config), new SchemaStore()),
            new SchemaGenerator());
    mapper.generate(jcodeModel, javaClassName, packageName, inputJsonUrl);

    jcodeModel.build(outputJavaClassDirectory);
  }
}
