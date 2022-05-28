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
@JsonPropertyOrder({
  "attachmentsByType",
  "location",
  "votes",
  "viewingMemberVoted",
  "subscribed",
  "fogbugz",
  "checkItems",
  "checkItemsChecked",
  "checkItemsEarliestDue",
  "comments",
  "attachments",
  "description",
  "due",
  "dueComplete",
  "start"
})
@Generated("jsonschema2pojo")
public class Badges {

  @JsonProperty("attachmentsByType")
  private AttachmentsByType attachmentsByType;

  @JsonProperty("location")
  private Boolean location;

  @JsonProperty("votes")
  private Integer votes;

  @JsonProperty("viewingMemberVoted")
  private Boolean viewingMemberVoted;

  @JsonProperty("subscribed")
  private Boolean subscribed;

  @JsonProperty("fogbugz")
  private String fogbugz;

  @JsonProperty("checkItems")
  private Integer checkItems;

  @JsonProperty("checkItemsChecked")
  private Integer checkItemsChecked;

  @JsonProperty("checkItemsEarliestDue")
  private Object checkItemsEarliestDue;

  @JsonProperty("comments")
  private Integer comments;

  @JsonProperty("attachments")
  private Integer attachments;

  @JsonProperty("description")
  private Boolean description;

  @JsonProperty("due")
  private Object due;

  @JsonProperty("dueComplete")
  private Boolean dueComplete;

  @JsonProperty("start")
  private Object start;

  @JsonIgnore private Map<String, Object> additionalProperties = new HashMap<String, Object>();

  @JsonProperty("attachmentsByType")
  public AttachmentsByType getAttachmentsByType() {
    return attachmentsByType;
  }

  @JsonProperty("attachmentsByType")
  public void setAttachmentsByType(AttachmentsByType attachmentsByType) {
    this.attachmentsByType = attachmentsByType;
  }

  public Badges withAttachmentsByType(AttachmentsByType attachmentsByType) {
    this.attachmentsByType = attachmentsByType;
    return this;
  }

  @JsonProperty("location")
  public Boolean getLocation() {
    return location;
  }

  @JsonProperty("location")
  public void setLocation(Boolean location) {
    this.location = location;
  }

  public Badges withLocation(Boolean location) {
    this.location = location;
    return this;
  }

  @JsonProperty("votes")
  public Integer getVotes() {
    return votes;
  }

  @JsonProperty("votes")
  public void setVotes(Integer votes) {
    this.votes = votes;
  }

  public Badges withVotes(Integer votes) {
    this.votes = votes;
    return this;
  }

  @JsonProperty("viewingMemberVoted")
  public Boolean getViewingMemberVoted() {
    return viewingMemberVoted;
  }

  @JsonProperty("viewingMemberVoted")
  public void setViewingMemberVoted(Boolean viewingMemberVoted) {
    this.viewingMemberVoted = viewingMemberVoted;
  }

  public Badges withViewingMemberVoted(Boolean viewingMemberVoted) {
    this.viewingMemberVoted = viewingMemberVoted;
    return this;
  }

  @JsonProperty("subscribed")
  public Boolean getSubscribed() {
    return subscribed;
  }

  @JsonProperty("subscribed")
  public void setSubscribed(Boolean subscribed) {
    this.subscribed = subscribed;
  }

  public Badges withSubscribed(Boolean subscribed) {
    this.subscribed = subscribed;
    return this;
  }

  @JsonProperty("fogbugz")
  public String getFogbugz() {
    return fogbugz;
  }

  @JsonProperty("fogbugz")
  public void setFogbugz(String fogbugz) {
    this.fogbugz = fogbugz;
  }

  public Badges withFogbugz(String fogbugz) {
    this.fogbugz = fogbugz;
    return this;
  }

  @JsonProperty("checkItems")
  public Integer getCheckItems() {
    return checkItems;
  }

  @JsonProperty("checkItems")
  public void setCheckItems(Integer checkItems) {
    this.checkItems = checkItems;
  }

  public Badges withCheckItems(Integer checkItems) {
    this.checkItems = checkItems;
    return this;
  }

  @JsonProperty("checkItemsChecked")
  public Integer getCheckItemsChecked() {
    return checkItemsChecked;
  }

  @JsonProperty("checkItemsChecked")
  public void setCheckItemsChecked(Integer checkItemsChecked) {
    this.checkItemsChecked = checkItemsChecked;
  }

  public Badges withCheckItemsChecked(Integer checkItemsChecked) {
    this.checkItemsChecked = checkItemsChecked;
    return this;
  }

  @JsonProperty("checkItemsEarliestDue")
  public Object getCheckItemsEarliestDue() {
    return checkItemsEarliestDue;
  }

  @JsonProperty("checkItemsEarliestDue")
  public void setCheckItemsEarliestDue(Object checkItemsEarliestDue) {
    this.checkItemsEarliestDue = checkItemsEarliestDue;
  }

  public Badges withCheckItemsEarliestDue(Object checkItemsEarliestDue) {
    this.checkItemsEarliestDue = checkItemsEarliestDue;
    return this;
  }

  @JsonProperty("comments")
  public Integer getComments() {
    return comments;
  }

  @JsonProperty("comments")
  public void setComments(Integer comments) {
    this.comments = comments;
  }

  public Badges withComments(Integer comments) {
    this.comments = comments;
    return this;
  }

  @JsonProperty("attachments")
  public Integer getAttachments() {
    return attachments;
  }

  @JsonProperty("attachments")
  public void setAttachments(Integer attachments) {
    this.attachments = attachments;
  }

  public Badges withAttachments(Integer attachments) {
    this.attachments = attachments;
    return this;
  }

  @JsonProperty("description")
  public Boolean getDescription() {
    return description;
  }

  @JsonProperty("description")
  public void setDescription(Boolean description) {
    this.description = description;
  }

  public Badges withDescription(Boolean description) {
    this.description = description;
    return this;
  }

  @JsonProperty("due")
  public Object getDue() {
    return due;
  }

  @JsonProperty("due")
  public void setDue(Object due) {
    this.due = due;
  }

  public Badges withDue(Object due) {
    this.due = due;
    return this;
  }

  @JsonProperty("dueComplete")
  public Boolean getDueComplete() {
    return dueComplete;
  }

  @JsonProperty("dueComplete")
  public void setDueComplete(Boolean dueComplete) {
    this.dueComplete = dueComplete;
  }

  public Badges withDueComplete(Boolean dueComplete) {
    this.dueComplete = dueComplete;
    return this;
  }

  @JsonProperty("start")
  public Object getStart() {
    return start;
  }

  @JsonProperty("start")
  public void setStart(Object start) {
    this.start = start;
  }

  public Badges withStart(Object start) {
    this.start = start;
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

  public Badges withAdditionalProperty(String name, Object value) {
    this.additionalProperties.put(name, value);
    return this;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append(Badges.class.getName())
        .append('@')
        .append(Integer.toHexString(System.identityHashCode(this)))
        .append('[');
    sb.append("attachmentsByType");
    sb.append('=');
    sb.append(((this.attachmentsByType == null) ? "<null>" : this.attachmentsByType));
    sb.append(',');
    sb.append("location");
    sb.append('=');
    sb.append(((this.location == null) ? "<null>" : this.location));
    sb.append(',');
    sb.append("votes");
    sb.append('=');
    sb.append(((this.votes == null) ? "<null>" : this.votes));
    sb.append(',');
    sb.append("viewingMemberVoted");
    sb.append('=');
    sb.append(((this.viewingMemberVoted == null) ? "<null>" : this.viewingMemberVoted));
    sb.append(',');
    sb.append("subscribed");
    sb.append('=');
    sb.append(((this.subscribed == null) ? "<null>" : this.subscribed));
    sb.append(',');
    sb.append("fogbugz");
    sb.append('=');
    sb.append(((this.fogbugz == null) ? "<null>" : this.fogbugz));
    sb.append(',');
    sb.append("checkItems");
    sb.append('=');
    sb.append(((this.checkItems == null) ? "<null>" : this.checkItems));
    sb.append(',');
    sb.append("checkItemsChecked");
    sb.append('=');
    sb.append(((this.checkItemsChecked == null) ? "<null>" : this.checkItemsChecked));
    sb.append(',');
    sb.append("checkItemsEarliestDue");
    sb.append('=');
    sb.append(((this.checkItemsEarliestDue == null) ? "<null>" : this.checkItemsEarliestDue));
    sb.append(',');
    sb.append("comments");
    sb.append('=');
    sb.append(((this.comments == null) ? "<null>" : this.comments));
    sb.append(',');
    sb.append("attachments");
    sb.append('=');
    sb.append(((this.attachments == null) ? "<null>" : this.attachments));
    sb.append(',');
    sb.append("description");
    sb.append('=');
    sb.append(((this.description == null) ? "<null>" : this.description));
    sb.append(',');
    sb.append("due");
    sb.append('=');
    sb.append(((this.due == null) ? "<null>" : this.due));
    sb.append(',');
    sb.append("dueComplete");
    sb.append('=');
    sb.append(((this.dueComplete == null) ? "<null>" : this.dueComplete));
    sb.append(',');
    sb.append("start");
    sb.append('=');
    sb.append(((this.start == null) ? "<null>" : this.start));
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
    result = ((result * 31) + ((this.comments == null) ? 0 : this.comments.hashCode()));
    result = ((result * 31) + ((this.attachments == null) ? 0 : this.attachments.hashCode()));
    result =
        ((result * 31)
            + ((this.attachmentsByType == null) ? 0 : this.attachmentsByType.hashCode()));
    result = ((result * 31) + ((this.dueComplete == null) ? 0 : this.dueComplete.hashCode()));
    result = ((result * 31) + ((this.start == null) ? 0 : this.start.hashCode()));
    result = ((result * 31) + ((this.description == null) ? 0 : this.description.hashCode()));
    result =
        ((result * 31)
            + ((this.checkItemsEarliestDue == null) ? 0 : this.checkItemsEarliestDue.hashCode()));
    result = ((result * 31) + ((this.subscribed == null) ? 0 : this.subscribed.hashCode()));
    result = ((result * 31) + ((this.due == null) ? 0 : this.due.hashCode()));
    result =
        ((result * 31)
            + ((this.viewingMemberVoted == null) ? 0 : this.viewingMemberVoted.hashCode()));
    result = ((result * 31) + ((this.location == null) ? 0 : this.location.hashCode()));
    result = ((result * 31) + ((this.votes == null) ? 0 : this.votes.hashCode()));
    result = ((result * 31) + ((this.fogbugz == null) ? 0 : this.fogbugz.hashCode()));
    result =
        ((result * 31)
            + ((this.additionalProperties == null) ? 0 : this.additionalProperties.hashCode()));
    result = ((result * 31) + ((this.checkItems == null) ? 0 : this.checkItems.hashCode()));
    result =
        ((result * 31)
            + ((this.checkItemsChecked == null) ? 0 : this.checkItemsChecked.hashCode()));
    return result;
  }

  @Override
  public boolean equals(Object other) {
    if (other == this) {
      return true;
    }
    if ((other instanceof Badges) == false) {
      return false;
    }
    Badges rhs = ((Badges) other);
    return (((((((((((((((((this.comments == rhs.comments)
                                                                    || ((this.comments != null)
                                                                        && this.comments.equals(
                                                                            rhs.comments)))
                                                                && ((this.attachments
                                                                        == rhs.attachments)
                                                                    || ((this.attachments != null)
                                                                        && this.attachments.equals(
                                                                            rhs.attachments))))
                                                            && ((this.attachmentsByType
                                                                    == rhs.attachmentsByType)
                                                                || ((this.attachmentsByType != null)
                                                                    && this.attachmentsByType
                                                                        .equals(
                                                                            rhs.attachmentsByType))))
                                                        && ((this.dueComplete == rhs.dueComplete)
                                                            || ((this.dueComplete != null)
                                                                && this.dueComplete.equals(
                                                                    rhs.dueComplete))))
                                                    && ((this.start == rhs.start)
                                                        || ((this.start != null)
                                                            && this.start.equals(rhs.start))))
                                                && ((this.description == rhs.description)
                                                    || ((this.description != null)
                                                        && this.description.equals(
                                                            rhs.description))))
                                            && ((this.checkItemsEarliestDue
                                                    == rhs.checkItemsEarliestDue)
                                                || ((this.checkItemsEarliestDue != null)
                                                    && this.checkItemsEarliestDue.equals(
                                                        rhs.checkItemsEarliestDue))))
                                        && ((this.subscribed == rhs.subscribed)
                                            || ((this.subscribed != null)
                                                && this.subscribed.equals(rhs.subscribed))))
                                    && ((this.due == rhs.due)
                                        || ((this.due != null) && this.due.equals(rhs.due))))
                                && ((this.viewingMemberVoted == rhs.viewingMemberVoted)
                                    || ((this.viewingMemberVoted != null)
                                        && this.viewingMemberVoted.equals(rhs.viewingMemberVoted))))
                            && ((this.location == rhs.location)
                                || ((this.location != null) && this.location.equals(rhs.location))))
                        && ((this.votes == rhs.votes)
                            || ((this.votes != null) && this.votes.equals(rhs.votes))))
                    && ((this.fogbugz == rhs.fogbugz)
                        || ((this.fogbugz != null) && this.fogbugz.equals(rhs.fogbugz))))
                && ((this.additionalProperties == rhs.additionalProperties)
                    || ((this.additionalProperties != null)
                        && this.additionalProperties.equals(rhs.additionalProperties))))
            && ((this.checkItems == rhs.checkItems)
                || ((this.checkItems != null) && this.checkItems.equals(rhs.checkItems))))
        && ((this.checkItemsChecked == rhs.checkItemsChecked)
            || ((this.checkItemsChecked != null)
                && this.checkItemsChecked.equals(rhs.checkItemsChecked))));
  }
}
