/*
 * Generated by cue.
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: no version
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package sdk.kubevela.notification.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import sdk.kubevela.notification.model.ActionCard;
import sdk.kubevela.notification.model.At;
import sdk.kubevela.notification.model.FeedCard;
import sdk.kubevela.notification.model.Link;
import sdk.kubevela.notification.model.Markdown;
import sdk.kubevela.notification.model.Text;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import sdk.kubevela.notification.JSON;

/**
 * Specify the message that you want to sent, refer to [dingtalk messaging](https://developers.dingtalk.com/document/robots/custom-robot-access/title-72m-8ag-pqw)
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-10-16T03:50:22.794956Z[Etc/UTC]")
public class Message {
  public static final String SERIALIZED_NAME_ACTION_CARD = "actionCard";
  @SerializedName(SERIALIZED_NAME_ACTION_CARD)
  private ActionCard actionCard;

  public static final String SERIALIZED_NAME_AT = "at";
  @SerializedName(SERIALIZED_NAME_AT)
  private At at;

  public static final String SERIALIZED_NAME_FEED_CARD = "feedCard";
  @SerializedName(SERIALIZED_NAME_FEED_CARD)
  private FeedCard feedCard;

  public static final String SERIALIZED_NAME_LINK = "link";
  @SerializedName(SERIALIZED_NAME_LINK)
  private Link link;

  public static final String SERIALIZED_NAME_MARKDOWN = "markdown";
  @SerializedName(SERIALIZED_NAME_MARKDOWN)
  private Markdown markdown;

  /**
   * msgType can be text, link, mardown, actionCard, feedCard
   */
  @JsonAdapter(MsgtypeEnum.Adapter.class)
  public enum MsgtypeEnum {
    TEXT("text"),
    
    LINK("link"),
    
    MARKDOWN("markdown"),
    
    ACTIONCARD("actionCard"),
    
    FEEDCARD("feedCard");

    private String value;

    MsgtypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static MsgtypeEnum fromValue(String value) {
      for (MsgtypeEnum b : MsgtypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<MsgtypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final MsgtypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public MsgtypeEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return MsgtypeEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_MSGTYPE = "msgtype";
  @SerializedName(SERIALIZED_NAME_MSGTYPE)
  private MsgtypeEnum msgtype = MsgtypeEnum.TEXT;

  public static final String SERIALIZED_NAME_TEXT = "text";
  @SerializedName(SERIALIZED_NAME_TEXT)
  private Text text;

  public Message() {
  }

  public Message actionCard(ActionCard actionCard) {
    
    this.actionCard = actionCard;
    return this;
  }

   /**
   * Get actionCard
   * @return actionCard
  **/
  @javax.annotation.Nullable

  public ActionCard getActionCard() {
    return actionCard;
  }


  public void setActionCard(ActionCard actionCard) {
    this.actionCard = actionCard;
  }


  public Message at(At at) {
    
    this.at = at;
    return this;
  }

   /**
   * Get at
   * @return at
  **/
  @javax.annotation.Nullable

  public At getAt() {
    return at;
  }


  public void setAt(At at) {
    this.at = at;
  }


  public Message feedCard(FeedCard feedCard) {
    
    this.feedCard = feedCard;
    return this;
  }

   /**
   * Get feedCard
   * @return feedCard
  **/
  @javax.annotation.Nullable

  public FeedCard getFeedCard() {
    return feedCard;
  }


  public void setFeedCard(FeedCard feedCard) {
    this.feedCard = feedCard;
  }


  public Message link(Link link) {
    
    this.link = link;
    return this;
  }

   /**
   * Get link
   * @return link
  **/
  @javax.annotation.Nullable

  public Link getLink() {
    return link;
  }


  public void setLink(Link link) {
    this.link = link;
  }


  public Message markdown(Markdown markdown) {
    
    this.markdown = markdown;
    return this;
  }

   /**
   * Get markdown
   * @return markdown
  **/
  @javax.annotation.Nullable

  public Markdown getMarkdown() {
    return markdown;
  }


  public void setMarkdown(Markdown markdown) {
    this.markdown = markdown;
  }


  public Message msgtype(MsgtypeEnum msgtype) {
    
    this.msgtype = msgtype;
    return this;
  }

   /**
   * msgType can be text, link, mardown, actionCard, feedCard
   * @return msgtype
  **/
  @javax.annotation.Nonnull

  public MsgtypeEnum getMsgtype() {
    return msgtype;
  }


  public void setMsgtype(MsgtypeEnum msgtype) {
    this.msgtype = msgtype;
  }


  public Message text(Text text) {
    
    this.text = text;
    return this;
  }

   /**
   * Get text
   * @return text
  **/
  @javax.annotation.Nullable

  public Text getText() {
    return text;
  }


  public void setText(Text text) {
    this.text = text;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Message message = (Message) o;
    return Objects.equals(this.actionCard, message.actionCard) &&
        Objects.equals(this.at, message.at) &&
        Objects.equals(this.feedCard, message.feedCard) &&
        Objects.equals(this.link, message.link) &&
        Objects.equals(this.markdown, message.markdown) &&
        Objects.equals(this.msgtype, message.msgtype) &&
        Objects.equals(this.text, message.text);
  }

  @Override
  public int hashCode() {
    return Objects.hash(actionCard, at, feedCard, link, markdown, msgtype, text);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Message {\n");
    sb.append("    actionCard: ").append(toIndentedString(actionCard)).append("\n");
    sb.append("    at: ").append(toIndentedString(at)).append("\n");
    sb.append("    feedCard: ").append(toIndentedString(feedCard)).append("\n");
    sb.append("    link: ").append(toIndentedString(link)).append("\n");
    sb.append("    markdown: ").append(toIndentedString(markdown)).append("\n");
    sb.append("    msgtype: ").append(toIndentedString(msgtype)).append("\n");
    sb.append("    text: ").append(toIndentedString(text)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }


  public static HashSet<String> openapiFields;
  public static HashSet<String> openapiRequiredFields;

  static {
    // a set of all properties/fields (JSON key names)
    openapiFields = new HashSet<String>();
    openapiFields.add("actionCard");
    openapiFields.add("at");
    openapiFields.add("feedCard");
    openapiFields.add("link");
    openapiFields.add("markdown");
    openapiFields.add("msgtype");
    openapiFields.add("text");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("msgtype");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to Message
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!Message.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in Message is not found in the empty JSON string", Message.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!Message.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `Message` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : Message.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      // validate the optional field `actionCard`
      if (jsonObj.get("actionCard") != null && !jsonObj.get("actionCard").isJsonNull()) {
        ActionCard.validateJsonObject(jsonObj.getAsJsonObject("actionCard"));
      }
      // validate the optional field `at`
      if (jsonObj.get("at") != null && !jsonObj.get("at").isJsonNull()) {
        At.validateJsonObject(jsonObj.getAsJsonObject("at"));
      }
      // validate the optional field `feedCard`
      if (jsonObj.get("feedCard") != null && !jsonObj.get("feedCard").isJsonNull()) {
        FeedCard.validateJsonObject(jsonObj.getAsJsonObject("feedCard"));
      }
      // validate the optional field `link`
      if (jsonObj.get("link") != null && !jsonObj.get("link").isJsonNull()) {
        Link.validateJsonObject(jsonObj.getAsJsonObject("link"));
      }
      // validate the optional field `markdown`
      if (jsonObj.get("markdown") != null && !jsonObj.get("markdown").isJsonNull()) {
        Markdown.validateJsonObject(jsonObj.getAsJsonObject("markdown"));
      }
      if (!jsonObj.get("msgtype").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `msgtype` to be a primitive type in the JSON string but got `%s`", jsonObj.get("msgtype").toString()));
      }
      // validate the optional field `text`
      if (jsonObj.get("text") != null && !jsonObj.get("text").isJsonNull()) {
        Text.validateJsonObject(jsonObj.getAsJsonObject("text"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!Message.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Message' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Message> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Message.class));

       return (TypeAdapter<T>) new TypeAdapter<Message>() {
           @Override
           public void write(JsonWriter out, Message value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public Message read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of Message given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of Message
  * @throws IOException if the JSON string is invalid with respect to Message
  */
  public static Message fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Message.class);
  }

 /**
  * Convert an instance of Message to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

