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
  "idAttachment",
  "color",
  "idUploadedBackground",
  "size",
  "brightness",
  "idPlugin"
})
@Generated("jsonschema2pojo")
public class Cover {

  @JsonProperty("idAttachment")
  private Object idAttachment;

  @JsonProperty("color")
  private Object color;

  @JsonProperty("idUploadedBackground")
  private Object idUploadedBackground;

  @JsonProperty("size")
  private String size;

  @JsonProperty("brightness")
  private String brightness;

  @JsonProperty("idPlugin")
  private Object idPlugin;

  @JsonIgnore private Map<String, Object> additionalProperties = new HashMap<String, Object>();

  @JsonProperty("idAttachment")
  public Object getIdAttachment() {
    return idAttachment;
  }

  @JsonProperty("idAttachment")
  public void setIdAttachment(Object idAttachment) {
    this.idAttachment = idAttachment;
  }

  public Cover withIdAttachment(Object idAttachment) {
    this.idAttachment = idAttachment;
    return this;
  }

  @JsonProperty("color")
  public Object getColor() {
    return color;
  }

  @JsonProperty("color")
  public void setColor(Object color) {
    this.color = color;
  }

  public Cover withColor(Object color) {
    this.color = color;
    return this;
  }

  @JsonProperty("idUploadedBackground")
  public Object getIdUploadedBackground() {
    return idUploadedBackground;
  }

  @JsonProperty("idUploadedBackground")
  public void setIdUploadedBackground(Object idUploadedBackground) {
    this.idUploadedBackground = idUploadedBackground;
  }

  public Cover withIdUploadedBackground(Object idUploadedBackground) {
    this.idUploadedBackground = idUploadedBackground;
    return this;
  }

  @JsonProperty("size")
  public String getSize() {
    return size;
  }

  @JsonProperty("size")
  public void setSize(String size) {
    this.size = size;
  }

  public Cover withSize(String size) {
    this.size = size;
    return this;
  }

  @JsonProperty("brightness")
  public String getBrightness() {
    return brightness;
  }

  @JsonProperty("brightness")
  public void setBrightness(String brightness) {
    this.brightness = brightness;
  }

  public Cover withBrightness(String brightness) {
    this.brightness = brightness;
    return this;
  }

  @JsonProperty("idPlugin")
  public Object getIdPlugin() {
    return idPlugin;
  }

  @JsonProperty("idPlugin")
  public void setIdPlugin(Object idPlugin) {
    this.idPlugin = idPlugin;
  }

  public Cover withIdPlugin(Object idPlugin) {
    this.idPlugin = idPlugin;
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

  public Cover withAdditionalProperty(String name, Object value) {
    this.additionalProperties.put(name, value);
    return this;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append(Cover.class.getName())
        .append('@')
        .append(Integer.toHexString(System.identityHashCode(this)))
        .append('[');
    sb.append("idAttachment");
    sb.append('=');
    sb.append(((this.idAttachment == null) ? "<null>" : this.idAttachment));
    sb.append(',');
    sb.append("color");
    sb.append('=');
    sb.append(((this.color == null) ? "<null>" : this.color));
    sb.append(',');
    sb.append("idUploadedBackground");
    sb.append('=');
    sb.append(((this.idUploadedBackground == null) ? "<null>" : this.idUploadedBackground));
    sb.append(',');
    sb.append("size");
    sb.append('=');
    sb.append(((this.size == null) ? "<null>" : this.size));
    sb.append(',');
    sb.append("brightness");
    sb.append('=');
    sb.append(((this.brightness == null) ? "<null>" : this.brightness));
    sb.append(',');
    sb.append("idPlugin");
    sb.append('=');
    sb.append(((this.idPlugin == null) ? "<null>" : this.idPlugin));
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
            + ((this.idUploadedBackground == null) ? 0 : this.idUploadedBackground.hashCode()));
    result = ((result * 31) + ((this.brightness == null) ? 0 : this.brightness.hashCode()));
    result = ((result * 31) + ((this.color == null) ? 0 : this.color.hashCode()));
    result = ((result * 31) + ((this.size == null) ? 0 : this.size.hashCode()));
    result = ((result * 31) + ((this.idAttachment == null) ? 0 : this.idAttachment.hashCode()));
    result = ((result * 31) + ((this.idPlugin == null) ? 0 : this.idPlugin.hashCode()));
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
    if ((other instanceof Cover) == false) {
      return false;
    }
    Cover rhs = ((Cover) other);
    return ((((((((this.idUploadedBackground == rhs.idUploadedBackground)
                                || ((this.idUploadedBackground != null)
                                    && this.idUploadedBackground.equals(rhs.idUploadedBackground)))
                            && ((this.brightness == rhs.brightness)
                                || ((this.brightness != null)
                                    && this.brightness.equals(rhs.brightness))))
                        && ((this.color == rhs.color)
                            || ((this.color != null) && this.color.equals(rhs.color))))
                    && ((this.size == rhs.size)
                        || ((this.size != null) && this.size.equals(rhs.size))))
                && ((this.idAttachment == rhs.idAttachment)
                    || ((this.idAttachment != null) && this.idAttachment.equals(rhs.idAttachment))))
            && ((this.idPlugin == rhs.idPlugin)
                || ((this.idPlugin != null) && this.idPlugin.equals(rhs.idPlugin))))
        && ((this.additionalProperties == rhs.additionalProperties)
            || ((this.additionalProperties != null)
                && this.additionalProperties.equals(rhs.additionalProperties))));
  }
}
