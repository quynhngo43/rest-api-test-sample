package gss.workshop.testing.pojo.board;

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
  "id",
  "name",
  "desc",
  "descData",
  "closed",
  "idOrganization",
  "idEnterprise",
  "pinned",
  "url",
  "shortUrl",
  "prefs",
  "labelNames",
  "limits"
})
@Generated("jsonschema2pojo")
public class BoardCreationRes {

  @JsonProperty("id")
  private String id;

  @JsonProperty("name")
  private String name;

  @JsonProperty("desc")
  private String desc;

  @JsonProperty("descData")
  private Object descData;

  @JsonProperty("closed")
  private Boolean closed;

  @JsonProperty("idOrganization")
  private String idOrganization;

  @JsonProperty("idEnterprise")
  private Object idEnterprise;

  @JsonProperty("pinned")
  private Boolean pinned;

  @JsonProperty("url")
  private String url;

  @JsonProperty("shortUrl")
  private String shortUrl;

  @JsonProperty("prefs")
  private Prefs prefs;

  @JsonProperty("labelNames")
  private LabelNames labelNames;

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

  public BoardCreationRes withId(String id) {
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

  public BoardCreationRes withName(String name) {
    this.name = name;
    return this;
  }

  @JsonProperty("desc")
  public String getDesc() {
    return desc;
  }

  @JsonProperty("desc")
  public void setDesc(String desc) {
    this.desc = desc;
  }

  public BoardCreationRes withDesc(String desc) {
    this.desc = desc;
    return this;
  }

  @JsonProperty("descData")
  public Object getDescData() {
    return descData;
  }

  @JsonProperty("descData")
  public void setDescData(Object descData) {
    this.descData = descData;
  }

  public BoardCreationRes withDescData(Object descData) {
    this.descData = descData;
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

  public BoardCreationRes withClosed(Boolean closed) {
    this.closed = closed;
    return this;
  }

  @JsonProperty("idOrganization")
  public String getIdOrganization() {
    return idOrganization;
  }

  @JsonProperty("idOrganization")
  public void setIdOrganization(String idOrganization) {
    this.idOrganization = idOrganization;
  }

  public BoardCreationRes withIdOrganization(String idOrganization) {
    this.idOrganization = idOrganization;
    return this;
  }

  @JsonProperty("idEnterprise")
  public Object getIdEnterprise() {
    return idEnterprise;
  }

  @JsonProperty("idEnterprise")
  public void setIdEnterprise(Object idEnterprise) {
    this.idEnterprise = idEnterprise;
  }

  public BoardCreationRes withIdEnterprise(Object idEnterprise) {
    this.idEnterprise = idEnterprise;
    return this;
  }

  @JsonProperty("pinned")
  public Boolean getPinned() {
    return pinned;
  }

  @JsonProperty("pinned")
  public void setPinned(Boolean pinned) {
    this.pinned = pinned;
  }

  public BoardCreationRes withPinned(Boolean pinned) {
    this.pinned = pinned;
    return this;
  }

  @JsonProperty("url")
  public String getUrl() {
    return url;
  }

  @JsonProperty("url")
  public void setUrl(String url) {
    this.url = url;
  }

  public BoardCreationRes withUrl(String url) {
    this.url = url;
    return this;
  }

  @JsonProperty("shortUrl")
  public String getShortUrl() {
    return shortUrl;
  }

  @JsonProperty("shortUrl")
  public void setShortUrl(String shortUrl) {
    this.shortUrl = shortUrl;
  }

  public BoardCreationRes withShortUrl(String shortUrl) {
    this.shortUrl = shortUrl;
    return this;
  }

  @JsonProperty("prefs")
  public Prefs getPrefs() {
    return prefs;
  }

  @JsonProperty("prefs")
  public void setPrefs(Prefs prefs) {
    this.prefs = prefs;
  }

  public BoardCreationRes withPrefs(Prefs prefs) {
    this.prefs = prefs;
    return this;
  }

  @JsonProperty("labelNames")
  public LabelNames getLabelNames() {
    return labelNames;
  }

  @JsonProperty("labelNames")
  public void setLabelNames(LabelNames labelNames) {
    this.labelNames = labelNames;
  }

  public BoardCreationRes withLabelNames(LabelNames labelNames) {
    this.labelNames = labelNames;
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

  public BoardCreationRes withLimits(Limits limits) {
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

  public BoardCreationRes withAdditionalProperty(String name, Object value) {
    this.additionalProperties.put(name, value);
    return this;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append(BoardCreationRes.class.getName())
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
    sb.append("desc");
    sb.append('=');
    sb.append(((this.desc == null) ? "<null>" : this.desc));
    sb.append(',');
    sb.append("descData");
    sb.append('=');
    sb.append(((this.descData == null) ? "<null>" : this.descData));
    sb.append(',');
    sb.append("closed");
    sb.append('=');
    sb.append(((this.closed == null) ? "<null>" : this.closed));
    sb.append(',');
    sb.append("idOrganization");
    sb.append('=');
    sb.append(((this.idOrganization == null) ? "<null>" : this.idOrganization));
    sb.append(',');
    sb.append("idEnterprise");
    sb.append('=');
    sb.append(((this.idEnterprise == null) ? "<null>" : this.idEnterprise));
    sb.append(',');
    sb.append("pinned");
    sb.append('=');
    sb.append(((this.pinned == null) ? "<null>" : this.pinned));
    sb.append(',');
    sb.append("url");
    sb.append('=');
    sb.append(((this.url == null) ? "<null>" : this.url));
    sb.append(',');
    sb.append("shortUrl");
    sb.append('=');
    sb.append(((this.shortUrl == null) ? "<null>" : this.shortUrl));
    sb.append(',');
    sb.append("prefs");
    sb.append('=');
    sb.append(((this.prefs == null) ? "<null>" : this.prefs));
    sb.append(',');
    sb.append("labelNames");
    sb.append('=');
    sb.append(((this.labelNames == null) ? "<null>" : this.labelNames));
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
    result = ((result * 31) + ((this.descData == null) ? 0 : this.descData.hashCode()));
    result = ((result * 31) + ((this.pinned == null) ? 0 : this.pinned.hashCode()));
    result = ((result * 31) + ((this.labelNames == null) ? 0 : this.labelNames.hashCode()));
    result = ((result * 31) + ((this.shortUrl == null) ? 0 : this.shortUrl.hashCode()));
    result = ((result * 31) + ((this.url == null) ? 0 : this.url.hashCode()));
    result = ((result * 31) + ((this.prefs == null) ? 0 : this.prefs.hashCode()));
    result = ((result * 31) + ((this.idEnterprise == null) ? 0 : this.idEnterprise.hashCode()));
    result = ((result * 31) + ((this.name == null) ? 0 : this.name.hashCode()));
    result = ((result * 31) + ((this.idOrganization == null) ? 0 : this.idOrganization.hashCode()));
    result = ((result * 31) + ((this.closed == null) ? 0 : this.closed.hashCode()));
    result = ((result * 31) + ((this.id == null) ? 0 : this.id.hashCode()));
    result =
        ((result * 31)
            + ((this.additionalProperties == null) ? 0 : this.additionalProperties.hashCode()));
    result = ((result * 31) + ((this.limits == null) ? 0 : this.limits.hashCode()));
    result = ((result * 31) + ((this.desc == null) ? 0 : this.desc.hashCode()));
    return result;
  }

  @Override
  public boolean equals(Object other) {
    if (other == this) {
      return true;
    }
    if ((other instanceof BoardCreationRes) == false) {
      return false;
    }
    BoardCreationRes rhs = ((BoardCreationRes) other);
    return (((((((((((((((this.descData == rhs.descData)
                                                            || ((this.descData != null)
                                                                && this.descData.equals(
                                                                    rhs.descData)))
                                                        && ((this.pinned == rhs.pinned)
                                                            || ((this.pinned != null)
                                                                && this.pinned.equals(rhs.pinned))))
                                                    && ((this.labelNames == rhs.labelNames)
                                                        || ((this.labelNames != null)
                                                            && this.labelNames.equals(
                                                                rhs.labelNames))))
                                                && ((this.shortUrl == rhs.shortUrl)
                                                    || ((this.shortUrl != null)
                                                        && this.shortUrl.equals(rhs.shortUrl))))
                                            && ((this.url == rhs.url)
                                                || ((this.url != null)
                                                    && this.url.equals(rhs.url))))
                                        && ((this.prefs == rhs.prefs)
                                            || ((this.prefs != null)
                                                && this.prefs.equals(rhs.prefs))))
                                    && ((this.idEnterprise == rhs.idEnterprise)
                                        || ((this.idEnterprise != null)
                                            && this.idEnterprise.equals(rhs.idEnterprise))))
                                && ((this.name == rhs.name)
                                    || ((this.name != null) && this.name.equals(rhs.name))))
                            && ((this.idOrganization == rhs.idOrganization)
                                || ((this.idOrganization != null)
                                    && this.idOrganization.equals(rhs.idOrganization))))
                        && ((this.closed == rhs.closed)
                            || ((this.closed != null) && this.closed.equals(rhs.closed))))
                    && ((this.id == rhs.id) || ((this.id != null) && this.id.equals(rhs.id))))
                && ((this.additionalProperties == rhs.additionalProperties)
                    || ((this.additionalProperties != null)
                        && this.additionalProperties.equals(rhs.additionalProperties))))
            && ((this.limits == rhs.limits)
                || ((this.limits != null) && this.limits.equals(rhs.limits))))
        && ((this.desc == rhs.desc) || ((this.desc != null) && this.desc.equals(rhs.desc))));
  }
}
