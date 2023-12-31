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
 * MountToEnvs1
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-10-16T03:51:01.040889Z[Etc/UTC]")
public class MountToEnvs1 {
  public static final String SERIALIZED_NAME_ENV_NAME = "envName";
  @SerializedName(SERIALIZED_NAME_ENV_NAME)
  private String envName;

  public static final String SERIALIZED_NAME_SECRET_KEY = "secretKey";
  @SerializedName(SERIALIZED_NAME_SECRET_KEY)
  private String secretKey;

  public MountToEnvs1() {
  }

  public MountToEnvs1 envName(String envName) {
    
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


  public MountToEnvs1 secretKey(String secretKey) {
    
    this.secretKey = secretKey;
    return this;
  }

   /**
   * Get secretKey
   * @return secretKey
  **/
  @javax.annotation.Nonnull

  public String getSecretKey() {
    return secretKey;
  }


  public void setSecretKey(String secretKey) {
    this.secretKey = secretKey;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MountToEnvs1 mountToEnvs1 = (MountToEnvs1) o;
    return Objects.equals(this.envName, mountToEnvs1.envName) &&
        Objects.equals(this.secretKey, mountToEnvs1.secretKey);
  }

  @Override
  public int hashCode() {
    return Objects.hash(envName, secretKey);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MountToEnvs1 {\n");
    sb.append("    envName: ").append(toIndentedString(envName)).append("\n");
    sb.append("    secretKey: ").append(toIndentedString(secretKey)).append("\n");
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
    openapiFields.add("envName");
    openapiFields.add("secretKey");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("envName");
    openapiRequiredFields.add("secretKey");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to MountToEnvs1
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!MountToEnvs1.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in MountToEnvs1 is not found in the empty JSON string", MountToEnvs1.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!MountToEnvs1.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `MountToEnvs1` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : MountToEnvs1.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (!jsonObj.get("envName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `envName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("envName").toString()));
      }
      if (!jsonObj.get("secretKey").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `secretKey` to be a primitive type in the JSON string but got `%s`", jsonObj.get("secretKey").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!MountToEnvs1.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'MountToEnvs1' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<MountToEnvs1> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(MountToEnvs1.class));

       return (TypeAdapter<T>) new TypeAdapter<MountToEnvs1>() {
           @Override
           public void write(JsonWriter out, MountToEnvs1 value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public MountToEnvs1 read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of MountToEnvs1 given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of MountToEnvs1
  * @throws IOException if the JSON string is invalid with respect to MountToEnvs1
  */
  public static MountToEnvs1 fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, MountToEnvs1.class);
  }

 /**
  * Convert an instance of MountToEnvs1 to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

