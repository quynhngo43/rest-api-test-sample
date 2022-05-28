# RestAssuredApi
1. Trello POJO classes of Board, Card and List were generated in the package "src/main/java/gss/workshop/testing/pojo". 
-> These classes are used for RestAssured response mapping to validate some attributes.
-> You do not need to change anything in this package.

2. Ignore App.java in src/main and AppTest.java in src/test.

3. RestClient.java ("src/test/java/gss/workshop/testing/requests") provided some main requests of GET, POST, PUT, DELETE which use RestAssured library.
-> You do not need to change anything in this package.
-> Review what was written in the class for understanding the meaning of it.

4. RequestFactory.java ("src/test/java/gss/workshop/testing/requests") provided 2 examples of sending the Board Creation Request and get the response.
-> Review the example, you see this class call RestClient.java to perform generic methods with its specific info, such as: param, path...
-> Follow the example, and fill your code to the rest of methods which is being set to return null. Please help correct them:
   - public static Response getBoardById(String boardId) { return null; }
   - public static Response deleteBoard(String boardId) { return null; }
   - public static Response createList(String boardId, String listName) { return null; }
   - public static Response createCard(String taskName, String listId) { return null; }
   - public static Response updateCard(String cardId, String listId) { return null; }

5. TestBase.java helps read some common variables which are stored in the resources/application.properties.
-> You do not need to change anything in this class.

6. ConvertUtils.java includes the method: "convertRestResponseToPojo" to convert RestAssured Response (which is got by methods implemented in the #4) to Trello Pojo object (#1). 
=> You will see how to use the method in the TrelloTests.java.

7. application.properties stores some variables which are read by the help of PropertyReader.java.
=> application.properties -> PUT your token and key to the file while implementing the test, then REMOVE key and token value when you push your code to GitHub.
=> application.properties -> add more other request paths that you need to use for doing tasks of #4.
=> PropertyReader.java -> You do not need to change anything in this class.

8. ValidationUtils.java -> call its methods to validate status code and string equal.

9. RestUtils.java -> call the method "addParams" to add more params to variable "param" hashmap of RequestFactory.java.

10. TrelloTests.java -> Complete the testflow which described in the @Test method of the class.