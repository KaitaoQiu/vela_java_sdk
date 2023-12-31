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
import java.util.ArrayList;
import java.util.List;
import sdk.kubevela.notification.model.Confirm;
import sdk.kubevela.notification.model.DispatchActionConfig;
import sdk.kubevela.notification.model.Option;
import sdk.kubevela.notification.model.TextType;

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
 * Elements
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-10-16T03:50:22.794956Z[Etc/UTC]")
public class Elements {
  public static final String SERIALIZED_NAME_ACTION_ID = "action_id";
  @SerializedName(SERIALIZED_NAME_ACTION_ID)
  private String actionId;

  public static final String SERIALIZED_NAME_ALT_TEXT = "alt_text";
  @SerializedName(SERIALIZED_NAME_ALT_TEXT)
  private String altText;

  public static final String SERIALIZED_NAME_CONFIRM = "confirm";
  @SerializedName(SERIALIZED_NAME_CONFIRM)
  private Confirm confirm;

  public static final String SERIALIZED_NAME_DISPATCH_ACTION_CONFIG = "dispatch_action_config";
  @SerializedName(SERIALIZED_NAME_DISPATCH_ACTION_CONFIG)
  private DispatchActionConfig dispatchActionConfig;

  public static final String SERIALIZED_NAME_IMAGE_URL = "image_url";
  @SerializedName(SERIALIZED_NAME_IMAGE_URL)
  private String imageUrl;

  public static final String SERIALIZED_NAME_INITIAL_DATE = "initial_date";
  @SerializedName(SERIALIZED_NAME_INITIAL_DATE)
  private String initialDate;

  public static final String SERIALIZED_NAME_INITIAL_OPTIONS = "initial_options";
  @SerializedName(SERIALIZED_NAME_INITIAL_OPTIONS)
  private List<Option> initialOptions = null;

  public static final String SERIALIZED_NAME_INITIAL_TIME = "initial_time";
  @SerializedName(SERIALIZED_NAME_INITIAL_TIME)
  private String initialTime;

  public static final String SERIALIZED_NAME_INITIAL_VALUE = "initial_value";
  @SerializedName(SERIALIZED_NAME_INITIAL_VALUE)
  private String initialValue;

  public static final String SERIALIZED_NAME_MAX_LENGTH = "max_length";
  @SerializedName(SERIALIZED_NAME_MAX_LENGTH)
  private Integer maxLength;

  public static final String SERIALIZED_NAME_MAX_SELECTED_ITEMS = "max_selected_items";
  @SerializedName(SERIALIZED_NAME_MAX_SELECTED_ITEMS)
  private Integer maxSelectedItems;

  public static final String SERIALIZED_NAME_MIN_LENGTH = "min_length";
  @SerializedName(SERIALIZED_NAME_MIN_LENGTH)
  private Integer minLength;

  public static final String SERIALIZED_NAME_MULTILINE = "multiline";
  @SerializedName(SERIALIZED_NAME_MULTILINE)
  private Boolean multiline;

  public static final String SERIALIZED_NAME_OPTION_GROUPS = "option_groups";
  @SerializedName(SERIALIZED_NAME_OPTION_GROUPS)
  private List<Option> optionGroups = null;

  public static final String SERIALIZED_NAME_OPTIONS = "options";
  @SerializedName(SERIALIZED_NAME_OPTIONS)
  private List<Option> options = null;

  public static final String SERIALIZED_NAME_PLACEHOLDER = "placeholder";
  @SerializedName(SERIALIZED_NAME_PLACEHOLDER)
  private TextType placeholder;

  public static final String SERIALIZED_NAME_STYLE = "style";
  @SerializedName(SERIALIZED_NAME_STYLE)
  private String style;

  public static final String SERIALIZED_NAME_TEXT = "text";
  @SerializedName(SERIALIZED_NAME_TEXT)
  private TextType text;

  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private String type;

  public static final String SERIALIZED_NAME_URL = "url";
  @SerializedName(SERIALIZED_NAME_URL)
  private String url;

  public static final String SERIALIZED_NAME_VALUE = "value";
  @SerializedName(SERIALIZED_NAME_VALUE)
  private String value;

  public Elements() {
  }

  public Elements actionId(String actionId) {
    
    this.actionId = actionId;
    return this;
  }

   /**
   * Get actionId
   * @return actionId
  **/
  @javax.annotation.Nullable

  public String getActionId() {
    return actionId;
  }


  public void setActionId(String actionId) {
    this.actionId = actionId;
  }


  public Elements altText(String altText) {
    
    this.altText = altText;
    return this;
  }

   /**
   * Get altText
   * @return altText
  **/
  @javax.annotation.Nullable

  public String getAltText() {
    return altText;
  }


  public void setAltText(String altText) {
    this.altText = altText;
  }


  public Elements confirm(Confirm confirm) {
    
    this.confirm = confirm;
    return this;
  }

   /**
   * Get confirm
   * @return confirm
  **/
  @javax.annotation.Nullable

  public Confirm getConfirm() {
    return confirm;
  }


  public void setConfirm(Confirm confirm) {
    this.confirm = confirm;
  }


  public Elements dispatchActionConfig(DispatchActionConfig dispatchActionConfig) {
    
    this.dispatchActionConfig = dispatchActionConfig;
    return this;
  }

   /**
   * Get dispatchActionConfig
   * @return dispatchActionConfig
  **/
  @javax.annotation.Nullable

  public DispatchActionConfig getDispatchActionConfig() {
    return dispatchActionConfig;
  }


  public void setDispatchActionConfig(DispatchActionConfig dispatchActionConfig) {
    this.dispatchActionConfig = dispatchActionConfig;
  }


  public Elements imageUrl(String imageUrl) {
    
    this.imageUrl = imageUrl;
    return this;
  }

   /**
   * Get imageUrl
   * @return imageUrl
  **/
  @javax.annotation.Nullable

  public String getImageUrl() {
    return imageUrl;
  }


  public void setImageUrl(String imageUrl) {
    this.imageUrl = imageUrl;
  }


  public Elements initialDate(String initialDate) {
    
    this.initialDate = initialDate;
    return this;
  }

   /**
   * Get initialDate
   * @return initialDate
  **/
  @javax.annotation.Nullable

  public String getInitialDate() {
    return initialDate;
  }


  public void setInitialDate(String initialDate) {
    this.initialDate = initialDate;
  }


  public Elements initialOptions(List<Option> initialOptions) {
    
    this.initialOptions = initialOptions;
    return this;
  }

  public Elements addInitialOptionsItem(Option initialOptionsItem) {
    if (this.initialOptions == null) {
      this.initialOptions = new ArrayList<>();
    }
    this.initialOptions.add(initialOptionsItem);
    return this;
  }

   /**
   * Get initialOptions
   * @return initialOptions
  **/
  @javax.annotation.Nullable

  public List<Option> getInitialOptions() {
    return initialOptions;
  }


  public void setInitialOptions(List<Option> initialOptions) {
    this.initialOptions = initialOptions;
  }


  public Elements initialTime(String initialTime) {
    
    this.initialTime = initialTime;
    return this;
  }

   /**
   * Get initialTime
   * @return initialTime
  **/
  @javax.annotation.Nullable

  public String getInitialTime() {
    return initialTime;
  }


  public void setInitialTime(String initialTime) {
    this.initialTime = initialTime;
  }


  public Elements initialValue(String initialValue) {
    
    this.initialValue = initialValue;
    return this;
  }

   /**
   * Get initialValue
   * @return initialValue
  **/
  @javax.annotation.Nullable

  public String getInitialValue() {
    return initialValue;
  }


  public void setInitialValue(String initialValue) {
    this.initialValue = initialValue;
  }


  public Elements maxLength(Integer maxLength) {
    
    this.maxLength = maxLength;
    return this;
  }

   /**
   * Get maxLength
   * @return maxLength
  **/
  @javax.annotation.Nullable

  public Integer getMaxLength() {
    return maxLength;
  }


  public void setMaxLength(Integer maxLength) {
    this.maxLength = maxLength;
  }


  public Elements maxSelectedItems(Integer maxSelectedItems) {
    
    this.maxSelectedItems = maxSelectedItems;
    return this;
  }

   /**
   * Get maxSelectedItems
   * @return maxSelectedItems
  **/
  @javax.annotation.Nullable

  public Integer getMaxSelectedItems() {
    return maxSelectedItems;
  }


  public void setMaxSelectedItems(Integer maxSelectedItems) {
    this.maxSelectedItems = maxSelectedItems;
  }


  public Elements minLength(Integer minLength) {
    
    this.minLength = minLength;
    return this;
  }

   /**
   * Get minLength
   * @return minLength
  **/
  @javax.annotation.Nullable

  public Integer getMinLength() {
    return minLength;
  }


  public void setMinLength(Integer minLength) {
    this.minLength = minLength;
  }


  public Elements multiline(Boolean multiline) {
    
    this.multiline = multiline;
    return this;
  }

   /**
   * Get multiline
   * @return multiline
  **/
  @javax.annotation.Nullable

  public Boolean getMultiline() {
    return multiline;
  }


  public void setMultiline(Boolean multiline) {
    this.multiline = multiline;
  }


  public Elements optionGroups(List<Option> optionGroups) {
    
    this.optionGroups = optionGroups;
    return this;
  }

  public Elements addOptionGroupsItem(Option optionGroupsItem) {
    if (this.optionGroups == null) {
      this.optionGroups = new ArrayList<>();
    }
    this.optionGroups.add(optionGroupsItem);
    return this;
  }

   /**
   * Get optionGroups
   * @return optionGroups
  **/
  @javax.annotation.Nullable

  public List<Option> getOptionGroups() {
    return optionGroups;
  }


  public void setOptionGroups(List<Option> optionGroups) {
    this.optionGroups = optionGroups;
  }


  public Elements options(List<Option> options) {
    
    this.options = options;
    return this;
  }

  public Elements addOptionsItem(Option optionsItem) {
    if (this.options == null) {
      this.options = new ArrayList<>();
    }
    this.options.add(optionsItem);
    return this;
  }

   /**
   * Get options
   * @return options
  **/
  @javax.annotation.Nullable

  public List<Option> getOptions() {
    return options;
  }


  public void setOptions(List<Option> options) {
    this.options = options;
  }


  public Elements placeholder(TextType placeholder) {
    
    this.placeholder = placeholder;
    return this;
  }

   /**
   * Get placeholder
   * @return placeholder
  **/
  @javax.annotation.Nullable

  public TextType getPlaceholder() {
    return placeholder;
  }


  public void setPlaceholder(TextType placeholder) {
    this.placeholder = placeholder;
  }


  public Elements style(String style) {
    
    this.style = style;
    return this;
  }

   /**
   * Get style
   * @return style
  **/
  @javax.annotation.Nullable

  public String getStyle() {
    return style;
  }


  public void setStyle(String style) {
    this.style = style;
  }


  public Elements text(TextType text) {
    
    this.text = text;
    return this;
  }

   /**
   * Get text
   * @return text
  **/
  @javax.annotation.Nullable

  public TextType getText() {
    return text;
  }


  public void setText(TextType text) {
    this.text = text;
  }


  public Elements type(String type) {
    
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @javax.annotation.Nonnull

  public String getType() {
    return type;
  }


  public void setType(String type) {
    this.type = type;
  }


  public Elements url(String url) {
    
    this.url = url;
    return this;
  }

   /**
   * Get url
   * @return url
  **/
  @javax.annotation.Nullable

  public String getUrl() {
    return url;
  }


  public void setUrl(String url) {
    this.url = url;
  }


  public Elements value(String value) {
    
    this.value = value;
    return this;
  }

   /**
   * Get value
   * @return value
  **/
  @javax.annotation.Nullable

  public String getValue() {
    return value;
  }


  public void setValue(String value) {
    this.value = value;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Elements elements = (Elements) o;
    return Objects.equals(this.actionId, elements.actionId) &&
        Objects.equals(this.altText, elements.altText) &&
        Objects.equals(this.confirm, elements.confirm) &&
        Objects.equals(this.dispatchActionConfig, elements.dispatchActionConfig) &&
        Objects.equals(this.imageUrl, elements.imageUrl) &&
        Objects.equals(this.initialDate, elements.initialDate) &&
        Objects.equals(this.initialOptions, elements.initialOptions) &&
        Objects.equals(this.initialTime, elements.initialTime) &&
        Objects.equals(this.initialValue, elements.initialValue) &&
        Objects.equals(this.maxLength, elements.maxLength) &&
        Objects.equals(this.maxSelectedItems, elements.maxSelectedItems) &&
        Objects.equals(this.minLength, elements.minLength) &&
        Objects.equals(this.multiline, elements.multiline) &&
        Objects.equals(this.optionGroups, elements.optionGroups) &&
        Objects.equals(this.options, elements.options) &&
        Objects.equals(this.placeholder, elements.placeholder) &&
        Objects.equals(this.style, elements.style) &&
        Objects.equals(this.text, elements.text) &&
        Objects.equals(this.type, elements.type) &&
        Objects.equals(this.url, elements.url) &&
        Objects.equals(this.value, elements.value);
  }

  @Override
  public int hashCode() {
    return Objects.hash(actionId, altText, confirm, dispatchActionConfig, imageUrl, initialDate, initialOptions, initialTime, initialValue, maxLength, maxSelectedItems, minLength, multiline, optionGroups, options, placeholder, style, text, type, url, value);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Elements {\n");
    sb.append("    actionId: ").append(toIndentedString(actionId)).append("\n");
    sb.append("    altText: ").append(toIndentedString(altText)).append("\n");
    sb.append("    confirm: ").append(toIndentedString(confirm)).append("\n");
    sb.append("    dispatchActionConfig: ").append(toIndentedString(dispatchActionConfig)).append("\n");
    sb.append("    imageUrl: ").append(toIndentedString(imageUrl)).append("\n");
    sb.append("    initialDate: ").append(toIndentedString(initialDate)).append("\n");
    sb.append("    initialOptions: ").append(toIndentedString(initialOptions)).append("\n");
    sb.append("    initialTime: ").append(toIndentedString(initialTime)).append("\n");
    sb.append("    initialValue: ").append(toIndentedString(initialValue)).append("\n");
    sb.append("    maxLength: ").append(toIndentedString(maxLength)).append("\n");
    sb.append("    maxSelectedItems: ").append(toIndentedString(maxSelectedItems)).append("\n");
    sb.append("    minLength: ").append(toIndentedString(minLength)).append("\n");
    sb.append("    multiline: ").append(toIndentedString(multiline)).append("\n");
    sb.append("    optionGroups: ").append(toIndentedString(optionGroups)).append("\n");
    sb.append("    options: ").append(toIndentedString(options)).append("\n");
    sb.append("    placeholder: ").append(toIndentedString(placeholder)).append("\n");
    sb.append("    style: ").append(toIndentedString(style)).append("\n");
    sb.append("    text: ").append(toIndentedString(text)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
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
    openapiFields.add("action_id");
    openapiFields.add("alt_text");
    openapiFields.add("confirm");
    openapiFields.add("dispatch_action_config");
    openapiFields.add("image_url");
    openapiFields.add("initial_date");
    openapiFields.add("initial_options");
    openapiFields.add("initial_time");
    openapiFields.add("initial_value");
    openapiFields.add("max_length");
    openapiFields.add("max_selected_items");
    openapiFields.add("min_length");
    openapiFields.add("multiline");
    openapiFields.add("option_groups");
    openapiFields.add("options");
    openapiFields.add("placeholder");
    openapiFields.add("style");
    openapiFields.add("text");
    openapiFields.add("type");
    openapiFields.add("url");
    openapiFields.add("value");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("type");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to Elements
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!Elements.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in Elements is not found in the empty JSON string", Elements.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!Elements.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `Elements` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : Elements.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if ((jsonObj.get("action_id") != null && !jsonObj.get("action_id").isJsonNull()) && !jsonObj.get("action_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `action_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("action_id").toString()));
      }
      if ((jsonObj.get("alt_text") != null && !jsonObj.get("alt_text").isJsonNull()) && !jsonObj.get("alt_text").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `alt_text` to be a primitive type in the JSON string but got `%s`", jsonObj.get("alt_text").toString()));
      }
      // validate the optional field `confirm`
      if (jsonObj.get("confirm") != null && !jsonObj.get("confirm").isJsonNull()) {
        Confirm.validateJsonObject(jsonObj.getAsJsonObject("confirm"));
      }
      // validate the optional field `dispatch_action_config`
      if (jsonObj.get("dispatch_action_config") != null && !jsonObj.get("dispatch_action_config").isJsonNull()) {
        DispatchActionConfig.validateJsonObject(jsonObj.getAsJsonObject("dispatch_action_config"));
      }
      if ((jsonObj.get("image_url") != null && !jsonObj.get("image_url").isJsonNull()) && !jsonObj.get("image_url").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `image_url` to be a primitive type in the JSON string but got `%s`", jsonObj.get("image_url").toString()));
      }
      if ((jsonObj.get("initial_date") != null && !jsonObj.get("initial_date").isJsonNull()) && !jsonObj.get("initial_date").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `initial_date` to be a primitive type in the JSON string but got `%s`", jsonObj.get("initial_date").toString()));
      }
      if (jsonObj.get("initial_options") != null && !jsonObj.get("initial_options").isJsonNull()) {
        JsonArray jsonArrayinitialOptions = jsonObj.getAsJsonArray("initial_options");
        if (jsonArrayinitialOptions != null) {
          // ensure the json data is an array
          if (!jsonObj.get("initial_options").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `initial_options` to be an array in the JSON string but got `%s`", jsonObj.get("initial_options").toString()));
          }

          // validate the optional field `initial_options` (array)
          for (int i = 0; i < jsonArrayinitialOptions.size(); i++) {
            Option.validateJsonObject(jsonArrayinitialOptions.get(i).getAsJsonObject());
          };
        }
      }
      if ((jsonObj.get("initial_time") != null && !jsonObj.get("initial_time").isJsonNull()) && !jsonObj.get("initial_time").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `initial_time` to be a primitive type in the JSON string but got `%s`", jsonObj.get("initial_time").toString()));
      }
      if ((jsonObj.get("initial_value") != null && !jsonObj.get("initial_value").isJsonNull()) && !jsonObj.get("initial_value").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `initial_value` to be a primitive type in the JSON string but got `%s`", jsonObj.get("initial_value").toString()));
      }
      if (jsonObj.get("option_groups") != null && !jsonObj.get("option_groups").isJsonNull()) {
        JsonArray jsonArrayoptionGroups = jsonObj.getAsJsonArray("option_groups");
        if (jsonArrayoptionGroups != null) {
          // ensure the json data is an array
          if (!jsonObj.get("option_groups").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `option_groups` to be an array in the JSON string but got `%s`", jsonObj.get("option_groups").toString()));
          }

          // validate the optional field `option_groups` (array)
          for (int i = 0; i < jsonArrayoptionGroups.size(); i++) {
            Option.validateJsonObject(jsonArrayoptionGroups.get(i).getAsJsonObject());
          };
        }
      }
      if (jsonObj.get("options") != null && !jsonObj.get("options").isJsonNull()) {
        JsonArray jsonArrayoptions = jsonObj.getAsJsonArray("options");
        if (jsonArrayoptions != null) {
          // ensure the json data is an array
          if (!jsonObj.get("options").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `options` to be an array in the JSON string but got `%s`", jsonObj.get("options").toString()));
          }

          // validate the optional field `options` (array)
          for (int i = 0; i < jsonArrayoptions.size(); i++) {
            Option.validateJsonObject(jsonArrayoptions.get(i).getAsJsonObject());
          };
        }
      }
      // validate the optional field `placeholder`
      if (jsonObj.get("placeholder") != null && !jsonObj.get("placeholder").isJsonNull()) {
        TextType.validateJsonObject(jsonObj.getAsJsonObject("placeholder"));
      }
      if ((jsonObj.get("style") != null && !jsonObj.get("style").isJsonNull()) && !jsonObj.get("style").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `style` to be a primitive type in the JSON string but got `%s`", jsonObj.get("style").toString()));
      }
      // validate the optional field `text`
      if (jsonObj.get("text") != null && !jsonObj.get("text").isJsonNull()) {
        TextType.validateJsonObject(jsonObj.getAsJsonObject("text"));
      }
      if (!jsonObj.get("type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("type").toString()));
      }
      if ((jsonObj.get("url") != null && !jsonObj.get("url").isJsonNull()) && !jsonObj.get("url").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `url` to be a primitive type in the JSON string but got `%s`", jsonObj.get("url").toString()));
      }
      if ((jsonObj.get("value") != null && !jsonObj.get("value").isJsonNull()) && !jsonObj.get("value").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `value` to be a primitive type in the JSON string but got `%s`", jsonObj.get("value").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!Elements.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Elements' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Elements> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Elements.class));

       return (TypeAdapter<T>) new TypeAdapter<Elements>() {
           @Override
           public void write(JsonWriter out, Elements value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public Elements read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of Elements given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of Elements
  * @throws IOException if the JSON string is invalid with respect to Elements
  */
  public static Elements fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Elements.class);
  }

 /**
  * Convert an instance of Elements to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

