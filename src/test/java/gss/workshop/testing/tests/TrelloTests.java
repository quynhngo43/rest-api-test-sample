package gss.workshop.testing.tests;

import gss.workshop.testing.pojo.board.BoardCreationRes;
import gss.workshop.testing.pojo.list.ListCreationRes;
import gss.workshop.testing.pojo.card.CardCreationRes;
import gss.workshop.testing.pojo.card.CardUpdateRes;
import gss.workshop.testing.pojo.board.BoardDeletionSuccessRes;

import gss.workshop.testing.requests.RequestFactory;
import gss.workshop.testing.utils.ConvertUtils;
import gss.workshop.testing.utils.OtherUtils;
import gss.workshop.testing.utils.ValidationUtils;
import io.restassured.response.Response;
import org.testng.annotations.Test;

public class TrelloTests extends TestBase {

  @Test
  public void trelloWorkflowTest() {
    // 1. Create new board without default list
    String boardName = OtherUtils.randomBoardName();
    Response resBoardCreation = RequestFactory.createBoard(boardName, false);

    // VP. Validate status code
    ValidationUtils.validateStatusCode(resBoardCreation, SUCCESSFUL_RESPONSE);

    // VP. Validate a board is created: Board name and permission level
    BoardCreationRes board =
        ConvertUtils.convertRestResponseToPojo(resBoardCreation, BoardCreationRes.class);
    ValidationUtils.validateObjectEqual(board.getName(), boardName);
    ValidationUtils.validateObjectEqual(board.getPrefs().getPermissionLevel(), PRIVATE_VALUE);

    // -> Store board Id
    String boardId = board.getId();
    System.out.println(String.format("Board Id of the new Board: %s", boardId));

    // 2. Create a TODO list
    Response resTodoListCreation = RequestFactory.createList(boardId, TODO_NAME);

    // VP. Validate status code
    ValidationUtils.validateStatusCode(resTodoListCreation, SUCCESSFUL_RESPONSE);

    // VP. Validate a list is created: name of list, closed attribute
    ListCreationRes todoList = ConvertUtils.convertRestResponseToPojo(resTodoListCreation, ListCreationRes.class);
    ValidationUtils.validateObjectEqual(todoList.getName(),TODO_NAME);
    ValidationUtils.validateObjectEqual(todoList.getClosed(),false);

    // VP. Validate the list was created inside the board: board Id
    ValidationUtils.validateObjectEqual(todoList.getIdBoard(), boardId);

    // 3. Create a DONE list
    Response resDoneListCreation = RequestFactory.createList(boardId, DONE_NAME);

    // VP. Validate status code
    ValidationUtils.validateStatusCode(resTodoListCreation, SUCCESSFUL_RESPONSE);

    // VP. Validate a list is created: name of list, "closed" property
    ListCreationRes doneList = ConvertUtils.convertRestResponseToPojo(resDoneListCreation, ListCreationRes.class);
    ValidationUtils.validateObjectEqual(doneList.getName(),DONE_NAME);
    ValidationUtils.validateObjectEqual(doneList.getClosed(),false);

    // VP. Validate the list was created inside the board: board Id
    ValidationUtils.validateObjectEqual(todoList.getIdBoard(), boardId);

    // 4. Create a new Card in TODO list
    String todoListId = todoList.getId();
    String cardName = OtherUtils.randomTaskName();
    Response resCardCreation = RequestFactory.createCard(cardName, todoListId);

    // VP. Validate status code
    ValidationUtils.validateStatusCode(resCardCreation, SUCCESSFUL_RESPONSE);

    // VP. Validate a card is created: task name, list id, board id
    CardCreationRes card = ConvertUtils.convertRestResponseToPojo(resCardCreation, CardCreationRes.class);
    ValidationUtils.validateObjectEqual(card.getName(), cardName);
    ValidationUtils.validateObjectEqual(card.getIdList(), todoListId);
    ValidationUtils.validateObjectEqual(card.getIdBoard(), boardId);

    // VP. Validate the card should have no votes or attachments
    ValidationUtils.validateObjectEqual(card.getBadges().getVotes(), 0);
    ValidationUtils.validateObjectEqual(card.getBadges().getAttachments(), 0);


    // 5. Move the card to DONE list
    String doneListId = doneList.getId();
    Response resCardMovement = RequestFactory.updateCard(card.getId(), doneListId);
    // VP. Validate status code
    ValidationUtils.validateStatusCode(resCardCreation, SUCCESSFUL_RESPONSE);

    // VP. Validate the card should have new list: list id
    CardUpdateRes cardUpdated = ConvertUtils.convertRestResponseToPojo(resCardMovement, CardUpdateRes.class);
    ValidationUtils.validateObjectEqual(cardUpdated.getIdList(), doneListId);

    // VP. Validate the card should preserve properties: name task, board Id, "closed" property
    ValidationUtils.validateObjectEqual(cardUpdated.getName(), cardName);
    ValidationUtils.validateObjectEqual(cardUpdated.getIdBoard(), boardId);
    ValidationUtils.validateObjectEqual(cardUpdated.getClosed(), false);


    // 6. Delete board
    Response resBoardDelete = RequestFactory.deleteBoard(boardId);

    // VP. Validate status code
    ValidationUtils.validateStatusCode(resBoardDelete, SUCCESSFUL_RESPONSE);
    BoardDeletionSuccessRes boardDeletionSuccessRes = ConvertUtils.convertRestResponseToPojo(resBoardDelete, BoardDeletionSuccessRes.class);

    // VP. Validate _null value
    ValidationUtils.validateObjectEqual(boardDeletionSuccessRes.getValue(), NULL_VALUE);

    //VP. Validate boardId is null
    ValidationUtils.validateStatusCode(RequestFactory.getBoardById(boardId), NOT_FOUND_RESPONSE);
  }
}
