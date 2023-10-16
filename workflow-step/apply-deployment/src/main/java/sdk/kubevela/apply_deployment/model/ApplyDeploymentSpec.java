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


package sdk.kubevela.apply_deployment.model;

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

import sdk.kubevela.apply_deployment.JSON;

/**
 * ApplyDeploymentSpec
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-10-16T03:49:06.824047Z[Etc/UTC]")
public class ApplyDeploymentSpec {
  public static final String SERIALIZED_NAME_CLUSTER = "cluster";
  @SerializedName(SERIALIZED_NAME_CLUSTER)
  private String cluster = "";

  public static final String SERIALIZED_NAME_CMD = "cmd";
  @SerializedName(SERIALIZED_NAME_CMD)
  private List<String> cmd = null;

  public static final String SERIALIZED_NAME_IMAGE = "image";
  @SerializedName(SERIALIZED_NAME_IMAGE)
  private String image;

  public static final String SERIALIZED_NAME_REPLICAS = "replicas";
  @SerializedName(SERIALIZED_NAME_REPLICAS)
  private Integer replicas = 1;

  public ApplyDeploymentSpec() {
  }

  public ApplyDeploymentSpec cluster(String cluster) {
    
    this.cluster = cluster;
    return this;
  }

   /**
   * Get cluster
   * @return cluster
  **/
  @javax.annotation.Nonnull

  public String getCluster() {
    return cluster;
  }


  public void setCluster(String cluster) {
    this.cluster = cluster;
  }


  public ApplyDeploymentSpec cmd(List<String> cmd) {
    
    this.cmd = cmd;
    return this;
  }

  public ApplyDeploymentSpec addCmdItem(String cmdItem) {
    if (this.cmd == null) {
      this.cmd = new ArrayList<>();
    }
    this.cmd.add(cmdItem);
    return this;
  }

   /**
   * Get cmd
   * @return cmd
  **/
  @javax.annotation.Nullable

  public List<String> getCmd() {
    return cmd;
  }


  public void setCmd(List<String> cmd) {
    this.cmd = cmd;
  }


  public ApplyDeploymentSpec image(String image) {
    
    this.image = image;
    return this;
  }

   /**
   * Get image
   * @return image
  **/
  @javax.annotation.Nonnull

  public String getImage() {
    return image;
  }


  public void setImage(String image) {
    this.image = image;
  }


  public ApplyDeploymentSpec replicas(Integer replicas) {
    
    this.replicas = replicas;
    return this;
  }

   /**
   * Get replicas
   * @return replicas
  **/
  @javax.annotation.Nonnull

  public Integer getReplicas() {
    return replicas;
  }


  public void setReplicas(Integer replicas) {
    this.replicas = replicas;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ApplyDeploymentSpec applyDeploymentSpec = (ApplyDeploymentSpec) o;
    return Objects.equals(this.cluster, applyDeploymentSpec.cluster) &&
        Objects.equals(this.cmd, applyDeploymentSpec.cmd) &&
        Objects.equals(this.image, applyDeploymentSpec.image) &&
        Objects.equals(this.replicas, applyDeploymentSpec.replicas);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cluster, cmd, image, replicas);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ApplyDeploymentSpec {\n");
    sb.append("    cluster: ").append(toIndentedString(cluster)).append("\n");
    sb.append("    cmd: ").append(toIndentedString(cmd)).append("\n");
    sb.append("    image: ").append(toIndentedString(image)).append("\n");
    sb.append("    replicas: ").append(toIndentedString(replicas)).append("\n");
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
    openapiFields.add("cluster");
    openapiFields.add("cmd");
    openapiFields.add("image");
    openapiFields.add("replicas");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("cluster");
    openapiRequiredFields.add("image");
    openapiRequiredFields.add("replicas");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to ApplyDeploymentSpec
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!ApplyDeploymentSpec.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ApplyDeploymentSpec is not found in the empty JSON string", ApplyDeploymentSpec.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!ApplyDeploymentSpec.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ApplyDeploymentSpec` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : ApplyDeploymentSpec.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (!jsonObj.get("cluster").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `cluster` to be a primitive type in the JSON string but got `%s`", jsonObj.get("cluster").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("cmd") != null && !jsonObj.get("cmd").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `cmd` to be an array in the JSON string but got `%s`", jsonObj.get("cmd").toString()));
      }
      if (!jsonObj.get("image").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `image` to be a primitive type in the JSON string but got `%s`", jsonObj.get("image").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ApplyDeploymentSpec.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ApplyDeploymentSpec' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ApplyDeploymentSpec> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ApplyDeploymentSpec.class));

       return (TypeAdapter<T>) new TypeAdapter<ApplyDeploymentSpec>() {
           @Override
           public void write(JsonWriter out, ApplyDeploymentSpec value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ApplyDeploymentSpec read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ApplyDeploymentSpec given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ApplyDeploymentSpec
  * @throws IOException if the JSON string is invalid with respect to ApplyDeploymentSpec
  */
  public static ApplyDeploymentSpec fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ApplyDeploymentSpec.class);
  }

 /**
  * Convert an instance of ApplyDeploymentSpec to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

