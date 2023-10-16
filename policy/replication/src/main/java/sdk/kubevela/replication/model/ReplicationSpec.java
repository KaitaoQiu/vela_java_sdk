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


package sdk.kubevela.replication.model;

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

import sdk.kubevela.replication.JSON;

/**
 * ReplicationSpec
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-10-16T03:50:38.527832Z[Etc/UTC]")
public class ReplicationSpec {
  public static final String SERIALIZED_NAME_KEYS = "keys";
  @SerializedName(SERIALIZED_NAME_KEYS)
  private List<String> keys = new ArrayList<>();

  public static final String SERIALIZED_NAME_SELECTOR = "selector";
  @SerializedName(SERIALIZED_NAME_SELECTOR)
  private List<String> selector = null;

  public ReplicationSpec() {
  }

  public ReplicationSpec keys(List<String> keys) {
    
    this.keys = keys;
    return this;
  }

  public ReplicationSpec addKeysItem(String keysItem) {
    this.keys.add(keysItem);
    return this;
  }

   /**
   * Spicify the keys of replication. Every key coresponds to a replication components
   * @return keys
  **/
  @javax.annotation.Nonnull

  public List<String> getKeys() {
    return keys;
  }


  public void setKeys(List<String> keys) {
    this.keys = keys;
  }


  public ReplicationSpec selector(List<String> selector) {
    
    this.selector = selector;
    return this;
  }

  public ReplicationSpec addSelectorItem(String selectorItem) {
    if (this.selector == null) {
      this.selector = new ArrayList<>();
    }
    this.selector.add(selectorItem);
    return this;
  }

   /**
   * Specify the components which will be replicated.
   * @return selector
  **/
  @javax.annotation.Nullable

  public List<String> getSelector() {
    return selector;
  }


  public void setSelector(List<String> selector) {
    this.selector = selector;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ReplicationSpec replicationSpec = (ReplicationSpec) o;
    return Objects.equals(this.keys, replicationSpec.keys) &&
        Objects.equals(this.selector, replicationSpec.selector);
  }

  @Override
  public int hashCode() {
    return Objects.hash(keys, selector);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ReplicationSpec {\n");
    sb.append("    keys: ").append(toIndentedString(keys)).append("\n");
    sb.append("    selector: ").append(toIndentedString(selector)).append("\n");
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
    openapiFields.add("keys");
    openapiFields.add("selector");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("keys");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to ReplicationSpec
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!ReplicationSpec.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ReplicationSpec is not found in the empty JSON string", ReplicationSpec.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!ReplicationSpec.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ReplicationSpec` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : ReplicationSpec.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      // ensure the required json array is present
      if (jsonObj.get("keys") == null) {
        throw new IllegalArgumentException("Expected the field `linkedContent` to be an array in the JSON string but got `null`");
      } else if (!jsonObj.get("keys").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `keys` to be an array in the JSON string but got `%s`", jsonObj.get("keys").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("selector") != null && !jsonObj.get("selector").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `selector` to be an array in the JSON string but got `%s`", jsonObj.get("selector").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ReplicationSpec.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ReplicationSpec' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ReplicationSpec> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ReplicationSpec.class));

       return (TypeAdapter<T>) new TypeAdapter<ReplicationSpec>() {
           @Override
           public void write(JsonWriter out, ReplicationSpec value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ReplicationSpec read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ReplicationSpec given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ReplicationSpec
  * @throws IOException if the JSON string is invalid with respect to ReplicationSpec
  */
  public static ReplicationSpec fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ReplicationSpec.class);
  }

 /**
  * Convert an instance of ReplicationSpec to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
