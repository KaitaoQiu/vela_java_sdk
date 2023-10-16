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


package sdk.kubevela.vela_cli.model;

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
import sdk.kubevela.vela_cli.model.Items;

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

import sdk.kubevela.vela_cli.JSON;

/**
 * Secret
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-10-16T03:51:11.814067Z[Etc/UTC]")
public class Secret {
  public static final String SERIALIZED_NAME_DEFAULT_MODE = "defaultMode";
  @SerializedName(SERIALIZED_NAME_DEFAULT_MODE)
  private Integer defaultMode = 420;

  public static final String SERIALIZED_NAME_ITEMS = "items";
  @SerializedName(SERIALIZED_NAME_ITEMS)
  private List<Items> items = null;

  public static final String SERIALIZED_NAME_MOUNT_PATH = "mountPath";
  @SerializedName(SERIALIZED_NAME_MOUNT_PATH)
  private String mountPath;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_SECRET_NAME = "secretName";
  @SerializedName(SERIALIZED_NAME_SECRET_NAME)
  private String secretName;

  public static final String SERIALIZED_NAME_SUB_PATH = "subPath";
  @SerializedName(SERIALIZED_NAME_SUB_PATH)
  private String subPath;

  public Secret() {
  }

  public Secret defaultMode(Integer defaultMode) {
    
    this.defaultMode = defaultMode;
    return this;
  }

   /**
   * Get defaultMode
   * @return defaultMode
  **/
  @javax.annotation.Nonnull

  public Integer getDefaultMode() {
    return defaultMode;
  }


  public void setDefaultMode(Integer defaultMode) {
    this.defaultMode = defaultMode;
  }


  public Secret items(List<Items> items) {
    
    this.items = items;
    return this;
  }

  public Secret addItemsItem(Items itemsItem) {
    if (this.items == null) {
      this.items = new ArrayList<>();
    }
    this.items.add(itemsItem);
    return this;
  }

   /**
   * Get items
   * @return items
  **/
  @javax.annotation.Nullable

  public List<Items> getItems() {
    return items;
  }


  public void setItems(List<Items> items) {
    this.items = items;
  }


  public Secret mountPath(String mountPath) {
    
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


  public Secret name(String name) {
    
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


  public Secret secretName(String secretName) {
    
    this.secretName = secretName;
    return this;
  }

   /**
   * Get secretName
   * @return secretName
  **/
  @javax.annotation.Nonnull

  public String getSecretName() {
    return secretName;
  }


  public void setSecretName(String secretName) {
    this.secretName = secretName;
  }


  public Secret subPath(String subPath) {
    
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



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Secret secret = (Secret) o;
    return Objects.equals(this.defaultMode, secret.defaultMode) &&
        Objects.equals(this.items, secret.items) &&
        Objects.equals(this.mountPath, secret.mountPath) &&
        Objects.equals(this.name, secret.name) &&
        Objects.equals(this.secretName, secret.secretName) &&
        Objects.equals(this.subPath, secret.subPath);
  }

  @Override
  public int hashCode() {
    return Objects.hash(defaultMode, items, mountPath, name, secretName, subPath);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Secret {\n");
    sb.append("    defaultMode: ").append(toIndentedString(defaultMode)).append("\n");
    sb.append("    items: ").append(toIndentedString(items)).append("\n");
    sb.append("    mountPath: ").append(toIndentedString(mountPath)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    secretName: ").append(toIndentedString(secretName)).append("\n");
    sb.append("    subPath: ").append(toIndentedString(subPath)).append("\n");
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
    openapiFields.add("defaultMode");
    openapiFields.add("items");
    openapiFields.add("mountPath");
    openapiFields.add("name");
    openapiFields.add("secretName");
    openapiFields.add("subPath");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("defaultMode");
    openapiRequiredFields.add("mountPath");
    openapiRequiredFields.add("name");
    openapiRequiredFields.add("secretName");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to Secret
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!Secret.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in Secret is not found in the empty JSON string", Secret.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!Secret.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `Secret` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : Secret.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (jsonObj.get("items") != null && !jsonObj.get("items").isJsonNull()) {
        JsonArray jsonArrayitems = jsonObj.getAsJsonArray("items");
        if (jsonArrayitems != null) {
          // ensure the json data is an array
          if (!jsonObj.get("items").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `items` to be an array in the JSON string but got `%s`", jsonObj.get("items").toString()));
          }

          // validate the optional field `items` (array)
          for (int i = 0; i < jsonArrayitems.size(); i++) {
            Items.validateJsonObject(jsonArrayitems.get(i).getAsJsonObject());
          };
        }
      }
      if (!jsonObj.get("mountPath").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `mountPath` to be a primitive type in the JSON string but got `%s`", jsonObj.get("mountPath").toString()));
      }
      if (!jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      if (!jsonObj.get("secretName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `secretName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("secretName").toString()));
      }
      if ((jsonObj.get("subPath") != null && !jsonObj.get("subPath").isJsonNull()) && !jsonObj.get("subPath").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `subPath` to be a primitive type in the JSON string but got `%s`", jsonObj.get("subPath").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!Secret.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Secret' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Secret> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Secret.class));

       return (TypeAdapter<T>) new TypeAdapter<Secret>() {
           @Override
           public void write(JsonWriter out, Secret value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public Secret read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of Secret given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of Secret
  * @throws IOException if the JSON string is invalid with respect to Secret
  */
  public static Secret fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Secret.class);
  }

 /**
  * Convert an instance of Secret to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

