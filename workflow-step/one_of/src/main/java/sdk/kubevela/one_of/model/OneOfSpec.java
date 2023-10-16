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


package sdk.kubevela.one_of.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import sdk.kubevela.one_of.model.Lark;

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

import sdk.kubevela.one_of.JSON;

/**
 * OneOfSpec
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-10-16T03:50:24.814685Z[Etc/UTC]")
public class OneOfSpec {
  public static final String SERIALIZED_NAME_LARK = "lark";
  @SerializedName(SERIALIZED_NAME_LARK)
  private Lark lark;

  public OneOfSpec() {
  }

  public OneOfSpec lark(Lark lark) {
    
    this.lark = lark;
    return this;
  }

   /**
   * Get lark
   * @return lark
  **/
  @javax.annotation.Nullable

  public Lark getLark() {
    return lark;
  }


  public void setLark(Lark lark) {
    this.lark = lark;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OneOfSpec oneOfSpec = (OneOfSpec) o;
    return Objects.equals(this.lark, oneOfSpec.lark);
  }

  @Override
  public int hashCode() {
    return Objects.hash(lark);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OneOfSpec {\n");
    sb.append("    lark: ").append(toIndentedString(lark)).append("\n");
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
    openapiFields.add("lark");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to OneOfSpec
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!OneOfSpec.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in OneOfSpec is not found in the empty JSON string", OneOfSpec.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!OneOfSpec.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `OneOfSpec` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      // validate the optional field `lark`
      if (jsonObj.get("lark") != null && !jsonObj.get("lark").isJsonNull()) {
        Lark.validateJsonObject(jsonObj.getAsJsonObject("lark"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!OneOfSpec.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'OneOfSpec' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<OneOfSpec> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(OneOfSpec.class));

       return (TypeAdapter<T>) new TypeAdapter<OneOfSpec>() {
           @Override
           public void write(JsonWriter out, OneOfSpec value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public OneOfSpec read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of OneOfSpec given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of OneOfSpec
  * @throws IOException if the JSON string is invalid with respect to OneOfSpec
  */
  public static OneOfSpec fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, OneOfSpec.class);
  }

 /**
  * Convert an instance of OneOfSpec to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
