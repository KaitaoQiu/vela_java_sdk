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
import java.util.ArrayList;
import java.util.List;
import sdk.kubevela.storage.model.DataSource;
import sdk.kubevela.storage.model.DataSourceRef;
import sdk.kubevela.storage.model.Resources;
import sdk.kubevela.storage.model.Selector;

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
 * Pvc
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-10-16T03:51:01.040889Z[Etc/UTC]")
public class Pvc {
  public static final String SERIALIZED_NAME_ACCESS_MODES = "accessModes";
  @SerializedName(SERIALIZED_NAME_ACCESS_MODES)
  private List<String> accessModes = new ArrayList<>(Arrays.asList("ReadWriteOnce"));

  public static final String SERIALIZED_NAME_DATA_SOURCE = "dataSource";
  @SerializedName(SERIALIZED_NAME_DATA_SOURCE)
  private DataSource dataSource;

  public static final String SERIALIZED_NAME_DATA_SOURCE_REF = "dataSourceRef";
  @SerializedName(SERIALIZED_NAME_DATA_SOURCE_REF)
  private DataSourceRef dataSourceRef;

  public static final String SERIALIZED_NAME_MOUNT_ONLY = "mountOnly";
  @SerializedName(SERIALIZED_NAME_MOUNT_ONLY)
  private Boolean mountOnly = false;

  public static final String SERIALIZED_NAME_MOUNT_PATH = "mountPath";
  @SerializedName(SERIALIZED_NAME_MOUNT_PATH)
  private String mountPath;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_RESOURCES = "resources";
  @SerializedName(SERIALIZED_NAME_RESOURCES)
  private Resources resources;

  public static final String SERIALIZED_NAME_SELECTOR = "selector";
  @SerializedName(SERIALIZED_NAME_SELECTOR)
  private Selector selector;

  public static final String SERIALIZED_NAME_STORAGE_CLASS_NAME = "storageClassName";
  @SerializedName(SERIALIZED_NAME_STORAGE_CLASS_NAME)
  private String storageClassName;

  public static final String SERIALIZED_NAME_SUB_PATH = "subPath";
  @SerializedName(SERIALIZED_NAME_SUB_PATH)
  private String subPath;

  public static final String SERIALIZED_NAME_VOLUME_MODE = "volumeMode";
  @SerializedName(SERIALIZED_NAME_VOLUME_MODE)
  private String volumeMode = "Filesystem";

  public static final String SERIALIZED_NAME_VOLUME_NAME = "volumeName";
  @SerializedName(SERIALIZED_NAME_VOLUME_NAME)
  private String volumeName;

  public Pvc() {
  }

  public Pvc accessModes(List<String> accessModes) {
    
    this.accessModes = accessModes;
    return this;
  }

  public Pvc addAccessModesItem(String accessModesItem) {
    this.accessModes.add(accessModesItem);
    return this;
  }

   /**
   * Get accessModes
   * @return accessModes
  **/
  @javax.annotation.Nonnull

  public List<String> getAccessModes() {
    return accessModes;
  }


  public void setAccessModes(List<String> accessModes) {
    this.accessModes = accessModes;
  }


  public Pvc dataSource(DataSource dataSource) {
    
    this.dataSource = dataSource;
    return this;
  }

   /**
   * Get dataSource
   * @return dataSource
  **/
  @javax.annotation.Nullable

  public DataSource getDataSource() {
    return dataSource;
  }


  public void setDataSource(DataSource dataSource) {
    this.dataSource = dataSource;
  }


  public Pvc dataSourceRef(DataSourceRef dataSourceRef) {
    
    this.dataSourceRef = dataSourceRef;
    return this;
  }

   /**
   * Get dataSourceRef
   * @return dataSourceRef
  **/
  @javax.annotation.Nullable

  public DataSourceRef getDataSourceRef() {
    return dataSourceRef;
  }


  public void setDataSourceRef(DataSourceRef dataSourceRef) {
    this.dataSourceRef = dataSourceRef;
  }


  public Pvc mountOnly(Boolean mountOnly) {
    
    this.mountOnly = mountOnly;
    return this;
  }

   /**
   * Get mountOnly
   * @return mountOnly
  **/
  @javax.annotation.Nonnull

  public Boolean getMountOnly() {
    return mountOnly;
  }


  public void setMountOnly(Boolean mountOnly) {
    this.mountOnly = mountOnly;
  }


  public Pvc mountPath(String mountPath) {
    
    this.mountPath = mountPath;
    return this;
  }

   /**
   * Get mountPath
   * @return mountPath
  **/
  @javax.annotation.Nonnull

  public String getMountPath() {
    return mountPath;
  }


  public void setMountPath(String mountPath) {
    this.mountPath = mountPath;
  }


  public Pvc name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @javax.annotation.Nonnull

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public Pvc resources(Resources resources) {
    
    this.resources = resources;
    return this;
  }

   /**
   * Get resources
   * @return resources
  **/
  @javax.annotation.Nullable

  public Resources getResources() {
    return resources;
  }


  public void setResources(Resources resources) {
    this.resources = resources;
  }


  public Pvc selector(Selector selector) {
    
    this.selector = selector;
    return this;
  }

   /**
   * Get selector
   * @return selector
  **/
  @javax.annotation.Nullable

  public Selector getSelector() {
    return selector;
  }


  public void setSelector(Selector selector) {
    this.selector = selector;
  }


  public Pvc storageClassName(String storageClassName) {
    
    this.storageClassName = storageClassName;
    return this;
  }

   /**
   * Get storageClassName
   * @return storageClassName
  **/
  @javax.annotation.Nullable

  public String getStorageClassName() {
    return storageClassName;
  }


  public void setStorageClassName(String storageClassName) {
    this.storageClassName = storageClassName;
  }


  public Pvc subPath(String subPath) {
    
    this.subPath = subPath;
    return this;
  }

   /**
   * Get subPath
   * @return subPath
  **/
  @javax.annotation.Nullable

  public String getSubPath() {
    return subPath;
  }


  public void setSubPath(String subPath) {
    this.subPath = subPath;
  }


  public Pvc volumeMode(String volumeMode) {
    
    this.volumeMode = volumeMode;
    return this;
  }

   /**
   * Get volumeMode
   * @return volumeMode
  **/
  @javax.annotation.Nonnull

  public String getVolumeMode() {
    return volumeMode;
  }


  public void setVolumeMode(String volumeMode) {
    this.volumeMode = volumeMode;
  }


  public Pvc volumeName(String volumeName) {
    
    this.volumeName = volumeName;
    return this;
  }

   /**
   * Get volumeName
   * @return volumeName
  **/
  @javax.annotation.Nullable

  public String getVolumeName() {
    return volumeName;
  }


  public void setVolumeName(String volumeName) {
    this.volumeName = volumeName;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Pvc pvc = (Pvc) o;
    return Objects.equals(this.accessModes, pvc.accessModes) &&
        Objects.equals(this.dataSource, pvc.dataSource) &&
        Objects.equals(this.dataSourceRef, pvc.dataSourceRef) &&
        Objects.equals(this.mountOnly, pvc.mountOnly) &&
        Objects.equals(this.mountPath, pvc.mountPath) &&
        Objects.equals(this.name, pvc.name) &&
        Objects.equals(this.resources, pvc.resources) &&
        Objects.equals(this.selector, pvc.selector) &&
        Objects.equals(this.storageClassName, pvc.storageClassName) &&
        Objects.equals(this.subPath, pvc.subPath) &&
        Objects.equals(this.volumeMode, pvc.volumeMode) &&
        Objects.equals(this.volumeName, pvc.volumeName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accessModes, dataSource, dataSourceRef, mountOnly, mountPath, name, resources, selector, storageClassName, subPath, volumeMode, volumeName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Pvc {\n");
    sb.append("    accessModes: ").append(toIndentedString(accessModes)).append("\n");
    sb.append("    dataSource: ").append(toIndentedString(dataSource)).append("\n");
    sb.append("    dataSourceRef: ").append(toIndentedString(dataSourceRef)).append("\n");
    sb.append("    mountOnly: ").append(toIndentedString(mountOnly)).append("\n");
    sb.append("    mountPath: ").append(toIndentedString(mountPath)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    resources: ").append(toIndentedString(resources)).append("\n");
    sb.append("    selector: ").append(toIndentedString(selector)).append("\n");
    sb.append("    storageClassName: ").append(toIndentedString(storageClassName)).append("\n");
    sb.append("    subPath: ").append(toIndentedString(subPath)).append("\n");
    sb.append("    volumeMode: ").append(toIndentedString(volumeMode)).append("\n");
    sb.append("    volumeName: ").append(toIndentedString(volumeName)).append("\n");
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
    openapiFields.add("accessModes");
    openapiFields.add("dataSource");
    openapiFields.add("dataSourceRef");
    openapiFields.add("mountOnly");
    openapiFields.add("mountPath");
    openapiFields.add("name");
    openapiFields.add("resources");
    openapiFields.add("selector");
    openapiFields.add("storageClassName");
    openapiFields.add("subPath");
    openapiFields.add("volumeMode");
    openapiFields.add("volumeName");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("accessModes");
    openapiRequiredFields.add("mountOnly");
    openapiRequiredFields.add("mountPath");
    openapiRequiredFields.add("name");
    openapiRequiredFields.add("volumeMode");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to Pvc
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!Pvc.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in Pvc is not found in the empty JSON string", Pvc.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!Pvc.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `Pvc` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : Pvc.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      // ensure the required json array is present
      if (jsonObj.get("accessModes") == null) {
        throw new IllegalArgumentException("Expected the field `linkedContent` to be an array in the JSON string but got `null`");
      } else if (!jsonObj.get("accessModes").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `accessModes` to be an array in the JSON string but got `%s`", jsonObj.get("accessModes").toString()));
      }
      // validate the optional field `dataSource`
      if (jsonObj.get("dataSource") != null && !jsonObj.get("dataSource").isJsonNull()) {
        DataSource.validateJsonObject(jsonObj.getAsJsonObject("dataSource"));
      }
      // validate the optional field `dataSourceRef`
      if (jsonObj.get("dataSourceRef") != null && !jsonObj.get("dataSourceRef").isJsonNull()) {
        DataSourceRef.validateJsonObject(jsonObj.getAsJsonObject("dataSourceRef"));
      }
      if (!jsonObj.get("mountPath").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `mountPath` to be a primitive type in the JSON string but got `%s`", jsonObj.get("mountPath").toString()));
      }
      if (!jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      // validate the optional field `resources`
      if (jsonObj.get("resources") != null && !jsonObj.get("resources").isJsonNull()) {
        Resources.validateJsonObject(jsonObj.getAsJsonObject("resources"));
      }
      // validate the optional field `selector`
      if (jsonObj.get("selector") != null && !jsonObj.get("selector").isJsonNull()) {
        Selector.validateJsonObject(jsonObj.getAsJsonObject("selector"));
      }
      if ((jsonObj.get("storageClassName") != null && !jsonObj.get("storageClassName").isJsonNull()) && !jsonObj.get("storageClassName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `storageClassName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("storageClassName").toString()));
      }
      if ((jsonObj.get("subPath") != null && !jsonObj.get("subPath").isJsonNull()) && !jsonObj.get("subPath").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `subPath` to be a primitive type in the JSON string but got `%s`", jsonObj.get("subPath").toString()));
      }
      if (!jsonObj.get("volumeMode").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `volumeMode` to be a primitive type in the JSON string but got `%s`", jsonObj.get("volumeMode").toString()));
      }
      if ((jsonObj.get("volumeName") != null && !jsonObj.get("volumeName").isJsonNull()) && !jsonObj.get("volumeName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `volumeName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("volumeName").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!Pvc.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Pvc' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Pvc> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Pvc.class));

       return (TypeAdapter<T>) new TypeAdapter<Pvc>() {
           @Override
           public void write(JsonWriter out, Pvc value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public Pvc read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of Pvc given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of Pvc
  * @throws IOException if the JSON string is invalid with respect to Pvc
  */
  public static Pvc fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Pvc.class);
  }

 /**
  * Convert an instance of Pvc to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

