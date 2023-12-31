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
 * At
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-10-16T03:50:22.794956Z[Etc/UTC]")
public class At {
  public static final String SERIALIZED_NAME_AT_MOBILES = "atMobiles";
  @SerializedName(SERIALIZED_NAME_AT_MOBILES)
  private List<String> atMobiles = null;

  public static final String SERIALIZED_NAME_IS_AT_ALL = "isAtAll";
  @SerializedName(SERIALIZED_NAME_IS_AT_ALL)
  private Boolean isAtAll;

  public At() {
  }

  public At atMobiles(List<String> atMobiles) {
    
    this.atMobiles = atMobiles;
    return this;
  }

  public At addAtMobilesItem(String atMobilesItem) {
    if (this.atMobiles == null) {
      this.atMobiles = new ArrayList<>();
    }
    this.atMobiles.add(atMobilesItem);
    return this;
  }

   /**
   * Get atMobiles
   * @return atMobiles
  **/
  @javax.annotation.Nullable

  public List<String> getAtMobiles() {
    return atMobiles;
  }


  public void setAtMobiles(List<String> atMobiles) {
    this.atMobiles = atMobiles;
  }


  public At isAtAll(Boolean isAtAll) {
    
    this.isAtAll = isAtAll;
    return this;
  }

   /**
   * Get isAtAll
   * @return isAtAll
  **/
  @javax.annotation.Nullable

  public Boolean getIsAtAll() {
    return isAtAll;
  }


  public void setIsAtAll(Boolean isAtAll) {
    this.isAtAll = isAtAll;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    At at = (At) o;
    return Objects.equals(this.atMobiles, at.atMobiles) &&
        Objects.equals(this.isAtAll, at.isAtAll);
  }

  @Override
  public int hashCode() {
    return Objects.hash(atMobiles, isAtAll);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class At {\n");
    sb.append("    atMobiles: ").append(toIndentedString(atMobiles)).append("\n");
    sb.append("    isAtAll: ").append(toIndentedString(isAtAll)).append("\n");
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
    openapiFields.add("atMobiles");
    openapiFields.add("isAtAll");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to At
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!At.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in At is not found in the empty JSON string", At.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!At.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `At` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("atMobiles") != null && !jsonObj.get("atMobiles").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `atMobiles` to be an array in the JSON string but got `%s`", jsonObj.get("atMobiles").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!At.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'At' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<At> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(At.class));

       return (TypeAdapter<T>) new TypeAdapter<At>() {
           @Override
           public void write(JsonWriter out, At value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public At read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of At given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of At
  * @throws IOException if the JSON string is invalid with respect to At
  */
  public static At fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, At.class);
  }

 /**
  * Convert an instance of At to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

