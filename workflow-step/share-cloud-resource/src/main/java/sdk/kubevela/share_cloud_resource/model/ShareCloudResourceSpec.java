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


package sdk.kubevela.share_cloud_resource.model;

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
import sdk.kubevela.share_cloud_resource.model.Placements;

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

import sdk.kubevela.share_cloud_resource.JSON;

/**
 * ShareCloudResourceSpec
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-10-16T03:50:52.248471Z[Etc/UTC]")
public class ShareCloudResourceSpec {
  public static final String SERIALIZED_NAME_ENV = "env";
  @SerializedName(SERIALIZED_NAME_ENV)
  private String env;

  public static final String SERIALIZED_NAME_PLACEMENTS = "placements";
  @SerializedName(SERIALIZED_NAME_PLACEMENTS)
  private List<Placements> placements = new ArrayList<>();

  public static final String SERIALIZED_NAME_POLICY = "policy";
  @SerializedName(SERIALIZED_NAME_POLICY)
  private String policy = "";

  public ShareCloudResourceSpec() {
  }

  public ShareCloudResourceSpec env(String env) {
    
    this.env = env;
    return this;
  }

   /**
   * Declare the name of the env in policy
   * @return env
  **/
  @javax.annotation.Nonnull

  public String getEnv() {
    return env;
  }


  public void setEnv(String env) {
    this.env = env;
  }


  public ShareCloudResourceSpec placements(List<Placements> placements) {
    
    this.placements = placements;
    return this;
  }

  public ShareCloudResourceSpec addPlacementsItem(Placements placementsItem) {
    this.placements.add(placementsItem);
    return this;
  }

   /**
   * Declare the location to bind
   * @return placements
  **/
  @javax.annotation.Nonnull

  public List<Placements> getPlacements() {
    return placements;
  }


  public void setPlacements(List<Placements> placements) {
    this.placements = placements;
  }


  public ShareCloudResourceSpec policy(String policy) {
    
    this.policy = policy;
    return this;
  }

   /**
   * Declare the name of the env-binding policy, if empty, the first env-binding policy will be used
   * @return policy
  **/
  @javax.annotation.Nonnull

  public String getPolicy() {
    return policy;
  }


  public void setPolicy(String policy) {
    this.policy = policy;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ShareCloudResourceSpec shareCloudResourceSpec = (ShareCloudResourceSpec) o;
    return Objects.equals(this.env, shareCloudResourceSpec.env) &&
        Objects.equals(this.placements, shareCloudResourceSpec.placements) &&
        Objects.equals(this.policy, shareCloudResourceSpec.policy);
  }

  @Override
  public int hashCode() {
    return Objects.hash(env, placements, policy);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ShareCloudResourceSpec {\n");
    sb.append("    env: ").append(toIndentedString(env)).append("\n");
    sb.append("    placements: ").append(toIndentedString(placements)).append("\n");
    sb.append("    policy: ").append(toIndentedString(policy)).append("\n");
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
    openapiFields.add("env");
    openapiFields.add("placements");
    openapiFields.add("policy");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("env");
    openapiRequiredFields.add("placements");
    openapiRequiredFields.add("policy");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to ShareCloudResourceSpec
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!ShareCloudResourceSpec.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ShareCloudResourceSpec is not found in the empty JSON string", ShareCloudResourceSpec.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!ShareCloudResourceSpec.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ShareCloudResourceSpec` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : ShareCloudResourceSpec.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (!jsonObj.get("env").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `env` to be a primitive type in the JSON string but got `%s`", jsonObj.get("env").toString()));
      }
      // ensure the json data is an array
      if (!jsonObj.get("placements").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `placements` to be an array in the JSON string but got `%s`", jsonObj.get("placements").toString()));
      }

      JsonArray jsonArrayplacements = jsonObj.getAsJsonArray("placements");
      // validate the required field `placements` (array)
      for (int i = 0; i < jsonArrayplacements.size(); i++) {
        Placements.validateJsonObject(jsonArrayplacements.get(i).getAsJsonObject());
      };
      if (!jsonObj.get("policy").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `policy` to be a primitive type in the JSON string but got `%s`", jsonObj.get("policy").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ShareCloudResourceSpec.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ShareCloudResourceSpec' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ShareCloudResourceSpec> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ShareCloudResourceSpec.class));

       return (TypeAdapter<T>) new TypeAdapter<ShareCloudResourceSpec>() {
           @Override
           public void write(JsonWriter out, ShareCloudResourceSpec value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ShareCloudResourceSpec read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ShareCloudResourceSpec given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ShareCloudResourceSpec
  * @throws IOException if the JSON string is invalid with respect to ShareCloudResourceSpec
  */
  public static ShareCloudResourceSpec fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ShareCloudResourceSpec.class);
  }

 /**
  * Convert an instance of ShareCloudResourceSpec to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

