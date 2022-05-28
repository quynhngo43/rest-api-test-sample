package gss.workshop.testing.pojo.list;

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
@JsonPropertyOrder({"id", "name", "closed", "pos", "idBoard", "limits"})
@Generated("jsonschema2pojo")
public class ListCreationRes {

  @JsonProperty("id")
  private String id;

  @JsonProperty("name")
  private String name;

  @JsonProperty("closed")
  private Boolean closed;

  @JsonProperty("pos")
  private Integer pos;

  @JsonProperty("idBoard")
  private String idBoard;

  @JsonProperty("limits")
  private Limits limits;

  @JsonIgnore private Map<String, Object> additionalProperties = new HashMap<String, Object>();

  @JsonProperty("id")
  public String getId() {
    return id;
  }

  @JsonProperty("id")
  public void setId(String id) {
    this.id = id;
  }

  public ListCreationRes withId(String id) {
    this.id = id;
    return this;
  }

  @JsonProperty("name")
  public String getName() {
    return name;
  }

  @JsonProperty("name")
  public void setName(String name) {
    this.name = name;
  }

  public ListCreationRes withName(String name) {
    this.name = name;
    return this;
  }

  @JsonProperty("closed")
  public Boolean getClosed() {
    return closed;
  }

  @JsonProperty("closed")
  public void setClosed(Boolean closed) {
    this.closed = closed;
  }

  public ListCreationRes withClosed(Boolean closed) {
    this.closed = closed;
    return this;
  }

  @JsonProperty("pos")
  public Integer getPos() {
    return pos;
  }

  @JsonProperty("pos")
  public void setPos(Integer pos) {
    this.pos = pos;
  }

  public ListCreationRes withPos(Integer pos) {
    this.pos = pos;
    return this;
  }

  @JsonProperty("idBoard")
  public String getIdBoard() {
    return idBoard;
  }

  @JsonProperty("idBoard")
  public void setIdBoard(String idBoard) {
    this.idBoard = idBoard;
  }

  public ListCreationRes withIdBoard(String idBoard) {
    this.idBoard = idBoard;
    return this;
  }

  @JsonProperty("limits")
  public Limits getLimits() {
    return limits;
  }

  @JsonProperty("limits")
  public void setLimits(Limits limits) {
    this.limits = limits;
  }

  public ListCreationRes withLimits(Limits limits) {
    this.limits = limits;
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

  public ListCreationRes withAdditionalProperty(String name, Object value) {
    this.additionalProperties.put(name, value);
    return this;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append(ListCreationRes.class.getName())
        .append('@')
        .append(Integer.toHexString(System.identityHashCode(this)))
        .append('[');
    sb.append("id");
    sb.append('=');
    sb.append(((this.id == null) ? "<null>" : this.id));
    sb.append(',');
    sb.append("name");
    sb.append('=');
    sb.append(((this.name == null) ? "<null>" : this.name));
    sb.append(',');
    sb.append("closed");
    sb.append('=');
    sb.append(((this.closed == null) ? "<null>" : this.closed));
    sb.append(',');
    sb.append("pos");
    sb.append('=');
    sb.append(((this.pos == null) ? "<null>" : this.pos));
    sb.append(',');
    sb.append("idBoard");
    sb.append('=');
    sb.append(((this.idBoard == null) ? "<null>" : this.idBoard));
    sb.append(',');
    sb.append("limits");
    sb.append('=');
    sb.append(((this.limits == null) ? "<null>" : this.limits));
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
    result = ((result * 31) + ((this.idBoard == null) ? 0 : this.idBoard.hashCode()));
    result = ((result * 31) + ((this.pos == null) ? 0 : this.pos.hashCode()));
    result = ((result * 31) + ((this.name == null) ? 0 : this.name.hashCode()));
    result = ((result * 31) + ((this.closed == null) ? 0 : this.closed.hashCode()));
    result = ((result * 31) + ((this.id == null) ? 0 : this.id.hashCode()));
    result =
        ((result * 31)
            + ((this.additionalProperties == null) ? 0 : this.additionalProperties.hashCode()));
    result = ((result * 31) + ((this.limits == null) ? 0 : this.limits.hashCode()));
    return result;
  }

  @Override
  public boolean equals(Object other) {
    if (other == this) {
      return true;
    }
    if ((other instanceof ListCreationRes) == false) {
      return false;
    }
    ListCreationRes rhs = ((ListCreationRes) other);
    return ((((((((this.idBoard == rhs.idBoard)
                                || ((this.idBoard != null) && this.idBoard.equals(rhs.idBoard)))
                            && ((this.pos == rhs.pos)
                                || ((this.pos != null) && this.pos.equals(rhs.pos))))
                        && ((this.name == rhs.name)
                            || ((this.name != null) && this.name.equals(rhs.name))))
                    && ((this.closed == rhs.closed)
                        || ((this.closed != null) && this.closed.equals(rhs.closed))))
                && ((this.id == rhs.id) || ((this.id != null) && this.id.equals(rhs.id))))
            && ((this.additionalProperties == rhs.additionalProperties)
                || ((this.additionalProperties != null)
                    && this.additionalProperties.equals(rhs.additionalProperties))))
        && ((this.limits == rhs.limits)
            || ((this.limits != null) && this.limits.equals(rhs.limits))));
  }
}
