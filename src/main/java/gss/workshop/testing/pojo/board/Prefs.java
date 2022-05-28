package gss.workshop.testing.pojo.board;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.annotation.processing.Generated;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
  "permissionLevel",
  "hideVotes",
  "voting",
  "comments",
  "invitations",
  "selfJoin",
  "cardCovers",
  "isTemplate",
  "cardAging",
  "calendarFeedEnabled",
  "isPluginHeaderShortcutsEnabled",
  "enabledPluginBoardButtons",
  "background",
  "backgroundImage",
  "backgroundImageScaled",
  "backgroundTile",
  "backgroundBrightness",
  "backgroundColor",
  "backgroundBottomColor",
  "backgroundTopColor",
  "canBePublic",
  "canBeEnterprise",
  "canBeOrg",
  "canBePrivate",
  "canInvite"
})
@Generated("jsonschema2pojo")
public class Prefs {

  @JsonProperty("permissionLevel")
  private String permissionLevel;

  @JsonProperty("hideVotes")
  private Boolean hideVotes;

  @JsonProperty("voting")
  private String voting;

  @JsonProperty("comments")
  private String comments;

  @JsonProperty("invitations")
  private String invitations;

  @JsonProperty("selfJoin")
  private Boolean selfJoin;

  @JsonProperty("cardCovers")
  private Boolean cardCovers;

  @JsonProperty("isTemplate")
  private Boolean isTemplate;

  @JsonProperty("cardAging")
  private String cardAging;

  @JsonProperty("calendarFeedEnabled")
  private Boolean calendarFeedEnabled;

  @JsonProperty("isPluginHeaderShortcutsEnabled")
  private Boolean isPluginHeaderShortcutsEnabled;

  @JsonProperty("enabledPluginBoardButtons")
  private List<Object> enabledPluginBoardButtons = new ArrayList<Object>();

  @JsonProperty("background")
  private String background;

  @JsonProperty("backgroundImage")
  private Object backgroundImage;

  @JsonProperty("backgroundImageScaled")
  private Object backgroundImageScaled;

  @JsonProperty("backgroundTile")
  private Boolean backgroundTile;

  @JsonProperty("backgroundBrightness")
  private String backgroundBrightness;

  @JsonProperty("backgroundColor")
  private String backgroundColor;

  @JsonProperty("backgroundBottomColor")
  private String backgroundBottomColor;

  @JsonProperty("backgroundTopColor")
  private String backgroundTopColor;

  @JsonProperty("canBePublic")
  private Boolean canBePublic;

  @JsonProperty("canBeEnterprise")
  private Boolean canBeEnterprise;

  @JsonProperty("canBeOrg")
  private Boolean canBeOrg;

  @JsonProperty("canBePrivate")
  private Boolean canBePrivate;

  @JsonProperty("canInvite")
  private Boolean canInvite;

  @JsonIgnore private Map<String, Object> additionalProperties = new HashMap<String, Object>();

  @JsonProperty("permissionLevel")
  public String getPermissionLevel() {
    return permissionLevel;
  }

  @JsonProperty("permissionLevel")
  public void setPermissionLevel(String permissionLevel) {
    this.permissionLevel = permissionLevel;
  }

  public Prefs withPermissionLevel(String permissionLevel) {
    this.permissionLevel = permissionLevel;
    return this;
  }

  @JsonProperty("hideVotes")
  public Boolean getHideVotes() {
    return hideVotes;
  }

  @JsonProperty("hideVotes")
  public void setHideVotes(Boolean hideVotes) {
    this.hideVotes = hideVotes;
  }

  public Prefs withHideVotes(Boolean hideVotes) {
    this.hideVotes = hideVotes;
    return this;
  }

  @JsonProperty("voting")
  public String getVoting() {
    return voting;
  }

  @JsonProperty("voting")
  public void setVoting(String voting) {
    this.voting = voting;
  }

  public Prefs withVoting(String voting) {
    this.voting = voting;
    return this;
  }

  @JsonProperty("comments")
  public String getComments() {
    return comments;
  }

  @JsonProperty("comments")
  public void setComments(String comments) {
    this.comments = comments;
  }

  public Prefs withComments(String comments) {
    this.comments = comments;
    return this;
  }

  @JsonProperty("invitations")
  public String getInvitations() {
    return invitations;
  }

  @JsonProperty("invitations")
  public void setInvitations(String invitations) {
    this.invitations = invitations;
  }

  public Prefs withInvitations(String invitations) {
    this.invitations = invitations;
    return this;
  }

  @JsonProperty("selfJoin")
  public Boolean getSelfJoin() {
    return selfJoin;
  }

  @JsonProperty("selfJoin")
  public void setSelfJoin(Boolean selfJoin) {
    this.selfJoin = selfJoin;
  }

  public Prefs withSelfJoin(Boolean selfJoin) {
    this.selfJoin = selfJoin;
    return this;
  }

  @JsonProperty("cardCovers")
  public Boolean getCardCovers() {
    return cardCovers;
  }

  @JsonProperty("cardCovers")
  public void setCardCovers(Boolean cardCovers) {
    this.cardCovers = cardCovers;
  }

  public Prefs withCardCovers(Boolean cardCovers) {
    this.cardCovers = cardCovers;
    return this;
  }

  @JsonProperty("isTemplate")
  public Boolean getIsTemplate() {
    return isTemplate;
  }

  @JsonProperty("isTemplate")
  public void setIsTemplate(Boolean isTemplate) {
    this.isTemplate = isTemplate;
  }

  public Prefs withIsTemplate(Boolean isTemplate) {
    this.isTemplate = isTemplate;
    return this;
  }

  @JsonProperty("cardAging")
  public String getCardAging() {
    return cardAging;
  }

  @JsonProperty("cardAging")
  public void setCardAging(String cardAging) {
    this.cardAging = cardAging;
  }

  public Prefs withCardAging(String cardAging) {
    this.cardAging = cardAging;
    return this;
  }

  @JsonProperty("calendarFeedEnabled")
  public Boolean getCalendarFeedEnabled() {
    return calendarFeedEnabled;
  }

  @JsonProperty("calendarFeedEnabled")
  public void setCalendarFeedEnabled(Boolean calendarFeedEnabled) {
    this.calendarFeedEnabled = calendarFeedEnabled;
  }

  public Prefs withCalendarFeedEnabled(Boolean calendarFeedEnabled) {
    this.calendarFeedEnabled = calendarFeedEnabled;
    return this;
  }

  @JsonProperty("isPluginHeaderShortcutsEnabled")
  public Boolean getIsPluginHeaderShortcutsEnabled() {
    return isPluginHeaderShortcutsEnabled;
  }

  @JsonProperty("isPluginHeaderShortcutsEnabled")
  public void setIsPluginHeaderShortcutsEnabled(Boolean isPluginHeaderShortcutsEnabled) {
    this.isPluginHeaderShortcutsEnabled = isPluginHeaderShortcutsEnabled;
  }

  public Prefs withIsPluginHeaderShortcutsEnabled(Boolean isPluginHeaderShortcutsEnabled) {
    this.isPluginHeaderShortcutsEnabled = isPluginHeaderShortcutsEnabled;
    return this;
  }

  @JsonProperty("enabledPluginBoardButtons")
  public List<Object> getEnabledPluginBoardButtons() {
    return enabledPluginBoardButtons;
  }

  @JsonProperty("enabledPluginBoardButtons")
  public void setEnabledPluginBoardButtons(List<Object> enabledPluginBoardButtons) {
    this.enabledPluginBoardButtons = enabledPluginBoardButtons;
  }

  public Prefs withEnabledPluginBoardButtons(List<Object> enabledPluginBoardButtons) {
    this.enabledPluginBoardButtons = enabledPluginBoardButtons;
    return this;
  }

  @JsonProperty("background")
  public String getBackground() {
    return background;
  }

  @JsonProperty("background")
  public void setBackground(String background) {
    this.background = background;
  }

  public Prefs withBackground(String background) {
    this.background = background;
    return this;
  }

  @JsonProperty("backgroundImage")
  public Object getBackgroundImage() {
    return backgroundImage;
  }

  @JsonProperty("backgroundImage")
  public void setBackgroundImage(Object backgroundImage) {
    this.backgroundImage = backgroundImage;
  }

  public Prefs withBackgroundImage(Object backgroundImage) {
    this.backgroundImage = backgroundImage;
    return this;
  }

  @JsonProperty("backgroundImageScaled")
  public Object getBackgroundImageScaled() {
    return backgroundImageScaled;
  }

  @JsonProperty("backgroundImageScaled")
  public void setBackgroundImageScaled(Object backgroundImageScaled) {
    this.backgroundImageScaled = backgroundImageScaled;
  }

  public Prefs withBackgroundImageScaled(Object backgroundImageScaled) {
    this.backgroundImageScaled = backgroundImageScaled;
    return this;
  }

  @JsonProperty("backgroundTile")
  public Boolean getBackgroundTile() {
    return backgroundTile;
  }

  @JsonProperty("backgroundTile")
  public void setBackgroundTile(Boolean backgroundTile) {
    this.backgroundTile = backgroundTile;
  }

  public Prefs withBackgroundTile(Boolean backgroundTile) {
    this.backgroundTile = backgroundTile;
    return this;
  }

  @JsonProperty("backgroundBrightness")
  public String getBackgroundBrightness() {
    return backgroundBrightness;
  }

  @JsonProperty("backgroundBrightness")
  public void setBackgroundBrightness(String backgroundBrightness) {
    this.backgroundBrightness = backgroundBrightness;
  }

  public Prefs withBackgroundBrightness(String backgroundBrightness) {
    this.backgroundBrightness = backgroundBrightness;
    return this;
  }

  @JsonProperty("backgroundColor")
  public String getBackgroundColor() {
    return backgroundColor;
  }

  @JsonProperty("backgroundColor")
  public void setBackgroundColor(String backgroundColor) {
    this.backgroundColor = backgroundColor;
  }

  public Prefs withBackgroundColor(String backgroundColor) {
    this.backgroundColor = backgroundColor;
    return this;
  }

  @JsonProperty("backgroundBottomColor")
  public String getBackgroundBottomColor() {
    return backgroundBottomColor;
  }

  @JsonProperty("backgroundBottomColor")
  public void setBackgroundBottomColor(String backgroundBottomColor) {
    this.backgroundBottomColor = backgroundBottomColor;
  }

  public Prefs withBackgroundBottomColor(String backgroundBottomColor) {
    this.backgroundBottomColor = backgroundBottomColor;
    return this;
  }

  @JsonProperty("backgroundTopColor")
  public String getBackgroundTopColor() {
    return backgroundTopColor;
  }

  @JsonProperty("backgroundTopColor")
  public void setBackgroundTopColor(String backgroundTopColor) {
    this.backgroundTopColor = backgroundTopColor;
  }

  public Prefs withBackgroundTopColor(String backgroundTopColor) {
    this.backgroundTopColor = backgroundTopColor;
    return this;
  }

  @JsonProperty("canBePublic")
  public Boolean getCanBePublic() {
    return canBePublic;
  }

  @JsonProperty("canBePublic")
  public void setCanBePublic(Boolean canBePublic) {
    this.canBePublic = canBePublic;
  }

  public Prefs withCanBePublic(Boolean canBePublic) {
    this.canBePublic = canBePublic;
    return this;
  }

  @JsonProperty("canBeEnterprise")
  public Boolean getCanBeEnterprise() {
    return canBeEnterprise;
  }

  @JsonProperty("canBeEnterprise")
  public void setCanBeEnterprise(Boolean canBeEnterprise) {
    this.canBeEnterprise = canBeEnterprise;
  }

  public Prefs withCanBeEnterprise(Boolean canBeEnterprise) {
    this.canBeEnterprise = canBeEnterprise;
    return this;
  }

  @JsonProperty("canBeOrg")
  public Boolean getCanBeOrg() {
    return canBeOrg;
  }

  @JsonProperty("canBeOrg")
  public void setCanBeOrg(Boolean canBeOrg) {
    this.canBeOrg = canBeOrg;
  }

  public Prefs withCanBeOrg(Boolean canBeOrg) {
    this.canBeOrg = canBeOrg;
    return this;
  }

  @JsonProperty("canBePrivate")
  public Boolean getCanBePrivate() {
    return canBePrivate;
  }

  @JsonProperty("canBePrivate")
  public void setCanBePrivate(Boolean canBePrivate) {
    this.canBePrivate = canBePrivate;
  }

  public Prefs withCanBePrivate(Boolean canBePrivate) {
    this.canBePrivate = canBePrivate;
    return this;
  }

  @JsonProperty("canInvite")
  public Boolean getCanInvite() {
    return canInvite;
  }

  @JsonProperty("canInvite")
  public void setCanInvite(Boolean canInvite) {
    this.canInvite = canInvite;
  }

  public Prefs withCanInvite(Boolean canInvite) {
    this.canInvite = canInvite;
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

  public Prefs withAdditionalProperty(String name, Object value) {
    this.additionalProperties.put(name, value);
    return this;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append(Prefs.class.getName())
        .append('@')
        .append(Integer.toHexString(System.identityHashCode(this)))
        .append('[');
    sb.append("permissionLevel");
    sb.append('=');
    sb.append(((this.permissionLevel == null) ? "<null>" : this.permissionLevel));
    sb.append(',');
    sb.append("hideVotes");
    sb.append('=');
    sb.append(((this.hideVotes == null) ? "<null>" : this.hideVotes));
    sb.append(',');
    sb.append("voting");
    sb.append('=');
    sb.append(((this.voting == null) ? "<null>" : this.voting));
    sb.append(',');
    sb.append("comments");
    sb.append('=');
    sb.append(((this.comments == null) ? "<null>" : this.comments));
    sb.append(',');
    sb.append("invitations");
    sb.append('=');
    sb.append(((this.invitations == null) ? "<null>" : this.invitations));
    sb.append(',');
    sb.append("selfJoin");
    sb.append('=');
    sb.append(((this.selfJoin == null) ? "<null>" : this.selfJoin));
    sb.append(',');
    sb.append("cardCovers");
    sb.append('=');
    sb.append(((this.cardCovers == null) ? "<null>" : this.cardCovers));
    sb.append(',');
    sb.append("isTemplate");
    sb.append('=');
    sb.append(((this.isTemplate == null) ? "<null>" : this.isTemplate));
    sb.append(',');
    sb.append("cardAging");
    sb.append('=');
    sb.append(((this.cardAging == null) ? "<null>" : this.cardAging));
    sb.append(',');
    sb.append("calendarFeedEnabled");
    sb.append('=');
    sb.append(((this.calendarFeedEnabled == null) ? "<null>" : this.calendarFeedEnabled));
    sb.append(',');
    sb.append("isPluginHeaderShortcutsEnabled");
    sb.append('=');
    sb.append(
        ((this.isPluginHeaderShortcutsEnabled == null)
            ? "<null>"
            : this.isPluginHeaderShortcutsEnabled));
    sb.append(',');
    sb.append("enabledPluginBoardButtons");
    sb.append('=');
    sb.append(
        ((this.enabledPluginBoardButtons == null) ? "<null>" : this.enabledPluginBoardButtons));
    sb.append(',');
    sb.append("background");
    sb.append('=');
    sb.append(((this.background == null) ? "<null>" : this.background));
    sb.append(',');
    sb.append("backgroundImage");
    sb.append('=');
    sb.append(((this.backgroundImage == null) ? "<null>" : this.backgroundImage));
    sb.append(',');
    sb.append("backgroundImageScaled");
    sb.append('=');
    sb.append(((this.backgroundImageScaled == null) ? "<null>" : this.backgroundImageScaled));
    sb.append(',');
    sb.append("backgroundTile");
    sb.append('=');
    sb.append(((this.backgroundTile == null) ? "<null>" : this.backgroundTile));
    sb.append(',');
    sb.append("backgroundBrightness");
    sb.append('=');
    sb.append(((this.backgroundBrightness == null) ? "<null>" : this.backgroundBrightness));
    sb.append(',');
    sb.append("backgroundColor");
    sb.append('=');
    sb.append(((this.backgroundColor == null) ? "<null>" : this.backgroundColor));
    sb.append(',');
    sb.append("backgroundBottomColor");
    sb.append('=');
    sb.append(((this.backgroundBottomColor == null) ? "<null>" : this.backgroundBottomColor));
    sb.append(',');
    sb.append("backgroundTopColor");
    sb.append('=');
    sb.append(((this.backgroundTopColor == null) ? "<null>" : this.backgroundTopColor));
    sb.append(',');
    sb.append("canBePublic");
    sb.append('=');
    sb.append(((this.canBePublic == null) ? "<null>" : this.canBePublic));
    sb.append(',');
    sb.append("canBeEnterprise");
    sb.append('=');
    sb.append(((this.canBeEnterprise == null) ? "<null>" : this.canBeEnterprise));
    sb.append(',');
    sb.append("canBeOrg");
    sb.append('=');
    sb.append(((this.canBeOrg == null) ? "<null>" : this.canBeOrg));
    sb.append(',');
    sb.append("canBePrivate");
    sb.append('=');
    sb.append(((this.canBePrivate == null) ? "<null>" : this.canBePrivate));
    sb.append(',');
    sb.append("canInvite");
    sb.append('=');
    sb.append(((this.canInvite == null) ? "<null>" : this.canInvite));
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
            + ((this.isPluginHeaderShortcutsEnabled == null)
                ? 0
                : this.isPluginHeaderShortcutsEnabled.hashCode()));
    result =
        ((result * 31) + ((this.canBeEnterprise == null) ? 0 : this.canBeEnterprise.hashCode()));
    result = ((result * 31) + ((this.hideVotes == null) ? 0 : this.hideVotes.hashCode()));
    result =
        ((result * 31) + ((this.backgroundImage == null) ? 0 : this.backgroundImage.hashCode()));
    result = ((result * 31) + ((this.voting == null) ? 0 : this.voting.hashCode()));
    result = ((result * 31) + ((this.canBePublic == null) ? 0 : this.canBePublic.hashCode()));
    result = ((result * 31) + ((this.canBePrivate == null) ? 0 : this.canBePrivate.hashCode()));
    result =
        ((result * 31)
            + ((this.backgroundImageScaled == null) ? 0 : this.backgroundImageScaled.hashCode()));
    result = ((result * 31) + ((this.invitations == null) ? 0 : this.invitations.hashCode()));
    result = ((result * 31) + ((this.selfJoin == null) ? 0 : this.selfJoin.hashCode()));
    result =
        ((result * 31)
            + ((this.enabledPluginBoardButtons == null)
                ? 0
                : this.enabledPluginBoardButtons.hashCode()));
    result =
        ((result * 31)
            + ((this.backgroundBrightness == null) ? 0 : this.backgroundBrightness.hashCode()));
    result =
        ((result * 31) + ((this.backgroundColor == null) ? 0 : this.backgroundColor.hashCode()));
    result = ((result * 31) + ((this.comments == null) ? 0 : this.comments.hashCode()));
    result =
        ((result * 31)
            + ((this.backgroundTopColor == null) ? 0 : this.backgroundTopColor.hashCode()));
    result = ((result * 31) + ((this.canBeOrg == null) ? 0 : this.canBeOrg.hashCode()));
    result =
        ((result * 31)
            + ((this.backgroundBottomColor == null) ? 0 : this.backgroundBottomColor.hashCode()));
    result =
        ((result * 31)
            + ((this.calendarFeedEnabled == null) ? 0 : this.calendarFeedEnabled.hashCode()));
    result = ((result * 31) + ((this.backgroundTile == null) ? 0 : this.backgroundTile.hashCode()));
    result =
        ((result * 31) + ((this.permissionLevel == null) ? 0 : this.permissionLevel.hashCode()));
    result = ((result * 31) + ((this.cardAging == null) ? 0 : this.cardAging.hashCode()));
    result = ((result * 31) + ((this.canInvite == null) ? 0 : this.canInvite.hashCode()));
    result = ((result * 31) + ((this.isTemplate == null) ? 0 : this.isTemplate.hashCode()));
    result = ((result * 31) + ((this.background == null) ? 0 : this.background.hashCode()));
    result =
        ((result * 31)
            + ((this.additionalProperties == null) ? 0 : this.additionalProperties.hashCode()));
    result = ((result * 31) + ((this.cardCovers == null) ? 0 : this.cardCovers.hashCode()));
    return result;
  }

  @Override
  public boolean equals(Object other) {
    if (other == this) {
      return true;
    }
    if ((other instanceof Prefs) == false) {
      return false;
    }
    Prefs rhs = ((Prefs) other);
    return (((((((((((((((((((((((((((this.isPluginHeaderShortcutsEnabled
                                                                                                                == rhs.isPluginHeaderShortcutsEnabled)
                                                                                                            || ((this
                                                                                                                        .isPluginHeaderShortcutsEnabled
                                                                                                                    != null)
                                                                                                                && this
                                                                                                                    .isPluginHeaderShortcutsEnabled
                                                                                                                    .equals(
                                                                                                                        rhs.isPluginHeaderShortcutsEnabled)))
                                                                                                        && ((this
                                                                                                                    .canBeEnterprise
                                                                                                                == rhs.canBeEnterprise)
                                                                                                            || ((this
                                                                                                                        .canBeEnterprise
                                                                                                                    != null)
                                                                                                                && this
                                                                                                                    .canBeEnterprise
                                                                                                                    .equals(
                                                                                                                        rhs.canBeEnterprise))))
                                                                                                    && ((this
                                                                                                                .hideVotes
                                                                                                            == rhs.hideVotes)
                                                                                                        || ((this
                                                                                                                    .hideVotes
                                                                                                                != null)
                                                                                                            && this
                                                                                                                .hideVotes
                                                                                                                .equals(
                                                                                                                    rhs.hideVotes))))
                                                                                                && ((this
                                                                                                            .backgroundImage
                                                                                                        == rhs.backgroundImage)
                                                                                                    || ((this
                                                                                                                .backgroundImage
                                                                                                            != null)
                                                                                                        && this
                                                                                                            .backgroundImage
                                                                                                            .equals(
                                                                                                                rhs.backgroundImage))))
                                                                                            && ((this
                                                                                                        .voting
                                                                                                    == rhs.voting)
                                                                                                || ((this
                                                                                                            .voting
                                                                                                        != null)
                                                                                                    && this
                                                                                                        .voting
                                                                                                        .equals(
                                                                                                            rhs.voting))))
                                                                                        && ((this
                                                                                                    .canBePublic
                                                                                                == rhs.canBePublic)
                                                                                            || ((this
                                                                                                        .canBePublic
                                                                                                    != null)
                                                                                                && this
                                                                                                    .canBePublic
                                                                                                    .equals(
                                                                                                        rhs.canBePublic))))
                                                                                    && ((this
                                                                                                .canBePrivate
                                                                                            == rhs.canBePrivate)
                                                                                        || ((this
                                                                                                    .canBePrivate
                                                                                                != null)
                                                                                            && this
                                                                                                .canBePrivate
                                                                                                .equals(
                                                                                                    rhs.canBePrivate))))
                                                                                && ((this
                                                                                            .backgroundImageScaled
                                                                                        == rhs.backgroundImageScaled)
                                                                                    || ((this
                                                                                                .backgroundImageScaled
                                                                                            != null)
                                                                                        && this
                                                                                            .backgroundImageScaled
                                                                                            .equals(
                                                                                                rhs.backgroundImageScaled))))
                                                                            && ((this.invitations
                                                                                    == rhs.invitations)
                                                                                || ((this
                                                                                            .invitations
                                                                                        != null)
                                                                                    && this
                                                                                        .invitations
                                                                                        .equals(
                                                                                            rhs.invitations))))
                                                                        && ((this.selfJoin
                                                                                == rhs.selfJoin)
                                                                            || ((this.selfJoin
                                                                                    != null)
                                                                                && this.selfJoin
                                                                                    .equals(
                                                                                        rhs.selfJoin))))
                                                                    && ((this
                                                                                .enabledPluginBoardButtons
                                                                            == rhs.enabledPluginBoardButtons)
                                                                        || ((this
                                                                                    .enabledPluginBoardButtons
                                                                                != null)
                                                                            && this
                                                                                .enabledPluginBoardButtons
                                                                                .equals(
                                                                                    rhs.enabledPluginBoardButtons))))
                                                                && ((this.backgroundBrightness
                                                                        == rhs.backgroundBrightness)
                                                                    || ((this.backgroundBrightness
                                                                            != null)
                                                                        && this.backgroundBrightness
                                                                            .equals(
                                                                                rhs.backgroundBrightness))))
                                                            && ((this.backgroundColor
                                                                    == rhs.backgroundColor)
                                                                || ((this.backgroundColor != null)
                                                                    && this.backgroundColor.equals(
                                                                        rhs.backgroundColor))))
                                                        && ((this.comments == rhs.comments)
                                                            || ((this.comments != null)
                                                                && this.comments.equals(
                                                                    rhs.comments))))
                                                    && ((this.backgroundTopColor
                                                            == rhs.backgroundTopColor)
                                                        || ((this.backgroundTopColor != null)
                                                            && this.backgroundTopColor.equals(
                                                                rhs.backgroundTopColor))))
                                                && ((this.canBeOrg == rhs.canBeOrg)
                                                    || ((this.canBeOrg != null)
                                                        && this.canBeOrg.equals(rhs.canBeOrg))))
                                            && ((this.backgroundBottomColor
                                                    == rhs.backgroundBottomColor)
                                                || ((this.backgroundBottomColor != null)
                                                    && this.backgroundBottomColor.equals(
                                                        rhs.backgroundBottomColor))))
                                        && ((this.calendarFeedEnabled == rhs.calendarFeedEnabled)
                                            || ((this.calendarFeedEnabled != null)
                                                && this.calendarFeedEnabled.equals(
                                                    rhs.calendarFeedEnabled))))
                                    && ((this.backgroundTile == rhs.backgroundTile)
                                        || ((this.backgroundTile != null)
                                            && this.backgroundTile.equals(rhs.backgroundTile))))
                                && ((this.permissionLevel == rhs.permissionLevel)
                                    || ((this.permissionLevel != null)
                                        && this.permissionLevel.equals(rhs.permissionLevel))))
                            && ((this.cardAging == rhs.cardAging)
                                || ((this.cardAging != null)
                                    && this.cardAging.equals(rhs.cardAging))))
                        && ((this.canInvite == rhs.canInvite)
                            || ((this.canInvite != null) && this.canInvite.equals(rhs.canInvite))))
                    && ((this.isTemplate == rhs.isTemplate)
                        || ((this.isTemplate != null) && this.isTemplate.equals(rhs.isTemplate))))
                && ((this.background == rhs.background)
                    || ((this.background != null) && this.background.equals(rhs.background))))
            && ((this.additionalProperties == rhs.additionalProperties)
                || ((this.additionalProperties != null)
                    && this.additionalProperties.equals(rhs.additionalProperties))))
        && ((this.cardCovers == rhs.cardCovers)
            || ((this.cardCovers != null) && this.cardCovers.equals(rhs.cardCovers))));
  }
}
