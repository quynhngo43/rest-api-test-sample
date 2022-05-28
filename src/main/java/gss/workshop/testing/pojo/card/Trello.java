package gss.workshop.testing.pojo.card;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import java.util.HashMap;
import java.util.Map;
import javax.annotation.processing.Generated;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({"board", "card"})
@Generated("jsonschema2pojo")
public class Trello {

  @JsonProperty("board")
  private Integer board;

  @JsonProperty("card")
  private Integer card;

  @JsonIgnore private Map<String, Object> additionalProperties = new HashMap<String, Object>();

  @JsonProperty("board")
  public Integer getBoard() {
    return board;
  }

  @JsonProperty("board")
  public void setBoard(Integer board) {
    this.board = board;
  }

  public Trello withBoard(Integer board) {
    this.board = board;
    return this;
  }

  @JsonProperty("card")
  public Integer getCard() {
    return card;
  }

  @JsonProperty("card")
  public void setCard(Integer card) {
    this.card = card;
  }

  public Trello withCard(Integer card) {
    this.card = card;
    return this;
  }

  @JsonAnyGetter
  public Map<String, Object> getAdditionalProperties() {
    return this.additionalProperties;
  }

  @JsonAnySetter
  public void setAdditionalProperty(String name, Object value) {
    this.additionalProperties.put(name, value);
  }

  public Trello withAdditionalProperty(String name, Object value) {
    this.additionalProperties.put(name, value);
    return this;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append(Trello.class.getName())
        .append('@')
        .append(Integer.toHexString(System.identityHashCode(this)))
        .append('[');
    sb.append("board");
    sb.append('=');
    sb.append(((this.board == null) ? "<null>" : this.board));
    sb.append(',');
    sb.append("card");
    sb.append('=');
    sb.append(((this.card == null) ? "<null>" : this.card));
    sb.append(',');
    sb.append("additionalProperties");
    sb.append('=');
    sb.append(((this.additionalProperties == null) ? "<null>" : this.additionalProperties));
    sb.append(',');
    if (sb.charAt((sb.length() - 1)) == ',') {
      sb.setCharAt((sb.length() - 1), ']');
    } else {
      sb.append(']');
    }
    return sb.toString();
  }

  @Override
  public int hashCode() {
    int result = 1;
    result =
        ((result * 31)
            + ((this.additionalProperties == null) ? 0 : this.additionalProperties.hashCode()));
    result = ((result * 31) + ((this.board == null) ? 0 : this.board.hashCode()));
    result = ((result * 31) + ((this.card == null) ? 0 : this.card.hashCode()));
    return result;
  }

  @Override
  public boolean equals(Object other) {
    if (other == this) {
      return true;
    }
    if ((other instanceof Trello) == false) {
      return false;
    }
    Trello rhs = ((Trello) other);
    return ((((this.additionalProperties == rhs.additionalProperties)
                || ((this.additionalProperties != null)
                    && this.additionalProperties.equals(rhs.additionalProperties)))
            && ((this.board == rhs.board)
                || ((this.board != null) && this.board.equals(rhs.board))))
        && ((this.card == rhs.card) || ((this.card != null) && this.card.equals(rhs.card))));
  }
}
