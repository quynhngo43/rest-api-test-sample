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
@JsonPropertyOrder({"trello"})
@Generated("jsonschema2pojo")
public class AttachmentsByType {

  @JsonProperty("trello")
  private Trello trello;

  @JsonIgnore private Map<String, Object> additionalProperties = new HashMap<String, Object>();

  @JsonProperty("trello")
  public Trello getTrello() {
    return trello;
  }

  @JsonProperty("trello")
  public void setTrello(Trello trello) {
    this.trello = trello;
  }

  public AttachmentsByType withTrello(Trello trello) {
    this.trello = trello;
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

  public AttachmentsByType withAdditionalProperty(String name, Object value) {
    this.additionalProperties.put(name, value);
    return this;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append(AttachmentsByType.class.getName())
        .append('@')
        .append(Integer.toHexString(System.identityHashCode(this)))
        .append('[');
    sb.append("trello");
    sb.append('=');
    sb.append(((this.trello == null) ? "<null>" : this.trello));
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
    result = ((result * 31) + ((this.trello == null) ? 0 : this.trello.hashCode()));
    result =
        ((result * 31)
            + ((this.additionalProperties == null) ? 0 : this.additionalProperties.hashCode()));
    return result;
  }

  @Override
  public boolean equals(Object other) {
    if (other == this) {
      return true;
    }
    if ((other instanceof AttachmentsByType) == false) {
      return false;
    }
    AttachmentsByType rhs = ((AttachmentsByType) other);
    return (((this.trello == rhs.trello)
            || ((this.trello != null) && this.trello.equals(rhs.trello)))
        && ((this.additionalProperties == rhs.additionalProperties)
            || ((this.additionalProperties != null)
                && this.additionalProperties.equals(rhs.additionalProperties))));
  }
}
