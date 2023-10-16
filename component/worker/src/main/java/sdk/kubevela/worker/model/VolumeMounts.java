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


package sdk.kubevela.worker.model;

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
import sdk.kubevela.worker.model.ConfigMap;
import sdk.kubevela.worker.model.EmptyDir;
import sdk.kubevela.worker.model.HostPath;
import sdk.kubevela.worker.model.Pvc;
import sdk.kubevela.worker.model.Secret;

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

import sdk.kubevela.worker.JSON;

/**
 * VolumeMounts
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-10-16T03:51:20.792631Z[Etc/UTC]")
public class VolumeMounts {
  public static final String SERIALIZED_NAME_CONFIG_MAP = "configMap";
  @SerializedName(SERIALIZED_NAME_CONFIG_MAP)
  private List<ConfigMap> configMap = null;

  public static final String SERIALIZED_NAME_EMPTY_DIR = "emptyDir";
  @SerializedName(SERIALIZED_NAME_EMPTY_DIR)
  private List<EmptyDir> emptyDir = null;

  public static final String SERIALIZED_NAME_HOST_PATH = "hostPath";
  @SerializedName(SERIALIZED_NAME_HOST_PATH)
  private List<HostPath> hostPath = null;

  public static final String SERIALIZED_NAME_PVC = "pvc";
  @SerializedName(SERIALIZED_NAME_PVC)
  private List<Pvc> pvc = null;

  public static final String SERIALIZED_NAME_SECRET = "secret";
  @SerializedName(SERIALIZED_NAME_SECRET)
  private List<Secret> secret = null;

  public VolumeMounts() {
  }

  public VolumeMounts configMap(List<ConfigMap> configMap) {
    
    this.configMap = configMap;
    return this;
  }

  public VolumeMounts addConfigMapItem(ConfigMap configMapItem) {
    if (this.configMap == null) {
      this.configMap = new ArrayList<>();
    }
    this.configMap.add(configMapItem);
    return this;
  }

   /**
   * Mount ConfigMap type volume
   * @return configMap
  **/
  @javax.annotation.Nullable

  public List<ConfigMap> getConfigMap() {
    return configMap;
  }


  public void setConfigMap(List<ConfigMap> configMap) {
    this.configMap = configMap;
  }


  public VolumeMounts emptyDir(List<EmptyDir> emptyDir) {
    
    this.emptyDir = emptyDir;
    return this;
  }

  public VolumeMounts addEmptyDirItem(EmptyDir emptyDirItem) {
    if (this.emptyDir == null) {
      this.emptyDir = new ArrayList<>();
    }
    this.emptyDir.add(emptyDirItem);
    return this;
  }

   /**
   * Mount EmptyDir type volume
   * @return emptyDir
  **/
  @javax.annotation.Nullable

  public List<EmptyDir> getEmptyDir() {
    return emptyDir;
  }


  public void setEmptyDir(List<EmptyDir> emptyDir) {
    this.emptyDir = emptyDir;
  }


  public VolumeMounts hostPath(List<HostPath> hostPath) {
    
    this.hostPath = hostPath;
    return this;
  }

  public VolumeMounts addHostPathItem(HostPath hostPathItem) {
    if (this.hostPath == null) {
      this.hostPath = new ArrayList<>();
    }
    this.hostPath.add(hostPathItem);
    return this;
  }

   /**
   * Mount HostPath type volume
   * @return hostPath
  **/
  @javax.annotation.Nullable

  public List<HostPath> getHostPath() {
    return hostPath;
  }


  public void setHostPath(List<HostPath> hostPath) {
    this.hostPath = hostPath;
  }


  public VolumeMounts pvc(List<Pvc> pvc) {
    
    this.pvc = pvc;
    return this;
  }

  public VolumeMounts addPvcItem(Pvc pvcItem) {
    if (this.pvc == null) {
      this.pvc = new ArrayList<>();
    }
    this.pvc.add(pvcItem);
    return this;
  }

   /**
   * Mount PVC type volume
   * @return pvc
  **/
  @javax.annotation.Nullable

  public List<Pvc> getPvc() {
    return pvc;
  }


  public void setPvc(List<Pvc> pvc) {
    this.pvc = pvc;
  }


  public VolumeMounts secret(List<Secret> secret) {
    
    this.secret = secret;
    return this;
  }

  public VolumeMounts addSecretItem(Secret secretItem) {
    if (this.secret == null) {
      this.secret = new ArrayList<>();
    }
    this.secret.add(secretItem);
    return this;
  }

   /**
   * Mount Secret type volume
   * @return secret
  **/
  @javax.annotation.Nullable

  public List<Secret> getSecret() {
    return secret;
  }


  public void setSecret(List<Secret> secret) {
    this.secret = secret;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VolumeMounts volumeMounts = (VolumeMounts) o;
    return Objects.equals(this.configMap, volumeMounts.configMap) &&
        Objects.equals(this.emptyDir, volumeMounts.emptyDir) &&
        Objects.equals(this.hostPath, volumeMounts.hostPath) &&
        Objects.equals(this.pvc, volumeMounts.pvc) &&
        Objects.equals(this.secret, volumeMounts.secret);
  }

  @Override
  public int hashCode() {
    return Objects.hash(configMap, emptyDir, hostPath, pvc, secret);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VolumeMounts {\n");
    sb.append("    configMap: ").append(toIndentedString(configMap)).append("\n");
    sb.append("    emptyDir: ").append(toIndentedString(emptyDir)).append("\n");
    sb.append("    hostPath: ").append(toIndentedString(hostPath)).append("\n");
    sb.append("    pvc: ").append(toIndentedString(pvc)).append("\n");
    sb.append("    secret: ").append(toIndentedString(secret)).append("\n");
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
    openapiFields.add("configMap");
    openapiFields.add("emptyDir");
    openapiFields.add("hostPath");
    openapiFields.add("pvc");
    openapiFields.add("secret");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to VolumeMounts
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!VolumeMounts.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in VolumeMounts is not found in the empty JSON string", VolumeMounts.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!VolumeMounts.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `VolumeMounts` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if (jsonObj.get("configMap") != null && !jsonObj.get("configMap").isJsonNull()) {
        JsonArray jsonArrayconfigMap = jsonObj.getAsJsonArray("configMap");
        if (jsonArrayconfigMap != null) {
          // ensure the json data is an array
          if (!jsonObj.get("configMap").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `configMap` to be an array in the JSON string but got `%s`", jsonObj.get("configMap").toString()));
          }

          // validate the optional field `configMap` (array)
          for (int i = 0; i < jsonArrayconfigMap.size(); i++) {
            ConfigMap.validateJsonObject(jsonArrayconfigMap.get(i).getAsJsonObject());
          };
        }
      }
      if (jsonObj.get("emptyDir") != null && !jsonObj.get("emptyDir").isJsonNull()) {
        JsonArray jsonArrayemptyDir = jsonObj.getAsJsonArray("emptyDir");
        if (jsonArrayemptyDir != null) {
          // ensure the json data is an array
          if (!jsonObj.get("emptyDir").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `emptyDir` to be an array in the JSON string but got `%s`", jsonObj.get("emptyDir").toString()));
          }

          // validate the optional field `emptyDir` (array)
          for (int i = 0; i < jsonArrayemptyDir.size(); i++) {
            EmptyDir.validateJsonObject(jsonArrayemptyDir.get(i).getAsJsonObject());
          };
        }
      }
      if (jsonObj.get("hostPath") != null && !jsonObj.get("hostPath").isJsonNull()) {
        JsonArray jsonArrayhostPath = jsonObj.getAsJsonArray("hostPath");
        if (jsonArrayhostPath != null) {
          // ensure the json data is an array
          if (!jsonObj.get("hostPath").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `hostPath` to be an array in the JSON string but got `%s`", jsonObj.get("hostPath").toString()));
          }

          // validate the optional field `hostPath` (array)
          for (int i = 0; i < jsonArrayhostPath.size(); i++) {
            HostPath.validateJsonObject(jsonArrayhostPath.get(i).getAsJsonObject());
          };
        }
      }
      if (jsonObj.get("pvc") != null && !jsonObj.get("pvc").isJsonNull()) {
        JsonArray jsonArraypvc = jsonObj.getAsJsonArray("pvc");
        if (jsonArraypvc != null) {
          // ensure the json data is an array
          if (!jsonObj.get("pvc").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `pvc` to be an array in the JSON string but got `%s`", jsonObj.get("pvc").toString()));
          }

          // validate the optional field `pvc` (array)
          for (int i = 0; i < jsonArraypvc.size(); i++) {
            Pvc.validateJsonObject(jsonArraypvc.get(i).getAsJsonObject());
          };
        }
      }
      if (jsonObj.get("secret") != null && !jsonObj.get("secret").isJsonNull()) {
        JsonArray jsonArraysecret = jsonObj.getAsJsonArray("secret");
        if (jsonArraysecret != null) {
          // ensure the json data is an array
          if (!jsonObj.get("secret").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `secret` to be an array in the JSON string but got `%s`", jsonObj.get("secret").toString()));
          }

          // validate the optional field `secret` (array)
          for (int i = 0; i < jsonArraysecret.size(); i++) {
            Secret.validateJsonObject(jsonArraysecret.get(i).getAsJsonObject());
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!VolumeMounts.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'VolumeMounts' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<VolumeMounts> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(VolumeMounts.class));

       return (TypeAdapter<T>) new TypeAdapter<VolumeMounts>() {
           @Override
           public void write(JsonWriter out, VolumeMounts value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public VolumeMounts read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of VolumeMounts given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of VolumeMounts
  * @throws IOException if the JSON string is invalid with respect to VolumeMounts
  */
  public static VolumeMounts fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, VolumeMounts.class);
  }

 /**
  * Convert an instance of VolumeMounts to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

