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


package sdk.kubevela.storage.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

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

import sdk.kubevela.storage.JSON;

/**
 * MountToEnv
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-10-16T03:51:01.040889Z[Etc/UTC]")
public class MountToEnv {
  public static final String SERIALIZED_NAME_CONFIG_MAP_KEY = "configMapKey";
  @SerializedName(SERIALIZED_NAME_CONFIG_MAP_KEY)
  private String configMapKey;

  public static final String SERIALIZED_NAME_ENV_NAME = "envName";
  @SerializedName(SERIALIZED_NAME_ENV_NAME)
  private String envName;

  public MountToEnv() {
  }

  public MountToEnv configMapKey(String configMapKey) {
    
    this.configMapKey = configMapKey;
    return this;
  }

   /**
   * Get configMapKey
   * @return configMapKey
  **/
  @javax.annotation.Nonnull

  public String getConfigMapKey() {
    return configMapKey;
  }


  public void setConfigMapKey(String configMapKey) {
    this.configMapKey = configMapKey;
  }


  public MountToEnv envName(String envName) {
    
    this.envName = envName;
    return this;
  }

   /**
   * Get envName
   * @return envName
  **/
  @javax.annotation.Nonnull

  public String getEnvName() {
    return envName;
  }


  public void setEnvName(String envName) {
    this.envName = envName;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MountToEnv mountToEnv = (MountToEnv) o;
    return Objects.equals(this.configMapKey, mountToEnv.configMapKey) &&
        Objects.equals(this.envName, mountToEnv.envName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(configMapKey, envName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MountToEnv {\n");
    sb.append("    configMapKey: ").append(toIndentedString(configMapKey)).append("\n");
    sb.append("    envName: ").append(toIndentedString(envName)).append("\n");
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
    openapiFields.add("configMapKey");
    openapiFields.add("envName");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("configMapKey");
    openapiRequiredFields.add("envName");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to MountToEnv
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!MountToEnv.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in MountToEnv is not found in the empty JSON string", MountToEnv.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!MountToEnv.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `MountToEnv` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : MountToEnv.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (!jsonObj.get("configMapKey").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `configMapKey` to be a primitive type in the JSON string but got `%s`", jsonObj.get("configMapKey").toString()));
      }
      if (!jsonObj.get("envName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `envName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("envName").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!MountToEnv.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'MountToEnv' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<MountToEnv> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(MountToEnv.class));

       return (TypeAdapter<T>) new TypeAdapter<MountToEnv>() {
           @Override
           public void write(JsonWriter out, MountToEnv value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public MountToEnv read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of MountToEnv given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of MountToEnv
  * @throws IOException if the JSON string is invalid with respect to MountToEnv
  */
  public static MountToEnv fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, MountToEnv.class);
  }

 /**
  * Convert an instance of MountToEnv to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

