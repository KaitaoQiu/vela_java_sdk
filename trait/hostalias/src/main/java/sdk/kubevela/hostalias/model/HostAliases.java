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


package sdk.kubevela.hostalias.model;

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

import sdk.kubevela.hostalias.JSON;

/**
 * HostAliases
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-10-16T03:49:58.671427Z[Etc/UTC]")
public class HostAliases {
  public static final String SERIALIZED_NAME_HOSTNAMES = "hostnames";
  @SerializedName(SERIALIZED_NAME_HOSTNAMES)
  private List<String> hostnames = new ArrayList<>();

  public static final String SERIALIZED_NAME_IP = "ip";
  @SerializedName(SERIALIZED_NAME_IP)
  private String ip;

  public HostAliases() {
  }

  public HostAliases hostnames(List<String> hostnames) {
    
    this.hostnames = hostnames;
    return this;
  }

  public HostAliases addHostnamesItem(String hostnamesItem) {
    this.hostnames.add(hostnamesItem);
    return this;
  }

   /**
   * Get hostnames
   * @return hostnames
  **/
  @javax.annotation.Nonnull

  public List<String> getHostnames() {
    return hostnames;
  }


  public void setHostnames(List<String> hostnames) {
    this.hostnames = hostnames;
  }


  public HostAliases ip(String ip) {
    
    this.ip = ip;
    return this;
  }

   /**
   * Get ip
   * @return ip
  **/
  @javax.annotation.Nonnull

  public String getIp() {
    return ip;
  }


  public void setIp(String ip) {
    this.ip = ip;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    HostAliases hostAliases = (HostAliases) o;
    return Objects.equals(this.hostnames, hostAliases.hostnames) &&
        Objects.equals(this.ip, hostAliases.ip);
  }

  @Override
  public int hashCode() {
    return Objects.hash(hostnames, ip);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class HostAliases {\n");
    sb.append("    hostnames: ").append(toIndentedString(hostnames)).append("\n");
    sb.append("    ip: ").append(toIndentedString(ip)).append("\n");
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
    openapiFields.add("hostnames");
    openapiFields.add("ip");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("hostnames");
    openapiRequiredFields.add("ip");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to HostAliases
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!HostAliases.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in HostAliases is not found in the empty JSON string", HostAliases.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!HostAliases.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `HostAliases` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : HostAliases.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      // ensure the required json array is present
      if (jsonObj.get("hostnames") == null) {
        throw new IllegalArgumentException("Expected the field `linkedContent` to be an array in the JSON string but got `null`");
      } else if (!jsonObj.get("hostnames").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `hostnames` to be an array in the JSON string but got `%s`", jsonObj.get("hostnames").toString()));
      }
      if (!jsonObj.get("ip").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `ip` to be a primitive type in the JSON string but got `%s`", jsonObj.get("ip").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!HostAliases.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'HostAliases' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<HostAliases> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(HostAliases.class));

       return (TypeAdapter<T>) new TypeAdapter<HostAliases>() {
           @Override
           public void write(JsonWriter out, HostAliases value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public HostAliases read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of HostAliases given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of HostAliases
  * @throws IOException if the JSON string is invalid with respect to HostAliases
  */
  public static HostAliases fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, HostAliases.class);
  }

 /**
  * Convert an instance of HostAliases to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

