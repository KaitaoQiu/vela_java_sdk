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


package sdk.kubevela.metrics.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import sdk.kubevela.metrics.model.Port;

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

import sdk.kubevela.metrics.JSON;

/**
 * MetricsSpec
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-10-16T03:50:19.194506Z[Etc/UTC]")
public class MetricsSpec {
  public static final String SERIALIZED_NAME_ENABLED = "enabled";
  @SerializedName(SERIALIZED_NAME_ENABLED)
  private Boolean enabled = true;

  public static final String SERIALIZED_NAME_FORMAT = "format";
  @SerializedName(SERIALIZED_NAME_FORMAT)
  private String format = "prometheus";

  public static final String SERIALIZED_NAME_PATH = "path";
  @SerializedName(SERIALIZED_NAME_PATH)
  private String path = "/metrics";

  public static final String SERIALIZED_NAME_PORT = "port";
  @SerializedName(SERIALIZED_NAME_PORT)
  private Port port;

  public static final String SERIALIZED_NAME_SCHEME = "scheme";
  @SerializedName(SERIALIZED_NAME_SCHEME)
  private String scheme = "http";

  public static final String SERIALIZED_NAME_SELECTOR = "selector";
  @SerializedName(SERIALIZED_NAME_SELECTOR)
  private Map<String, String> selector = null;

  public MetricsSpec() {
  }

  public MetricsSpec enabled(Boolean enabled) {
    
    this.enabled = enabled;
    return this;
  }

   /**
   * Get enabled
   * @return enabled
  **/
  @javax.annotation.Nonnull

  public Boolean getEnabled() {
    return enabled;
  }


  public void setEnabled(Boolean enabled) {
    this.enabled = enabled;
  }


  public MetricsSpec format(String format) {
    
    this.format = format;
    return this;
  }

   /**
   * Format of the metrics, default as prometheus +short&#x3D;f
   * @return format
  **/
  @javax.annotation.Nonnull

  public String getFormat() {
    return format;
  }


  public void setFormat(String format) {
    this.format = format;
  }


  public MetricsSpec path(String path) {
    
    this.path = path;
    return this;
  }

   /**
   * The metrics path of the service
   * @return path
  **/
  @javax.annotation.Nonnull

  public String getPath() {
    return path;
  }


  public void setPath(String path) {
    this.path = path;
  }


  public MetricsSpec port(Port port) {
    
    this.port = port;
    return this;
  }

   /**
   * Get port
   * @return port
  **/
  @javax.annotation.Nonnull

  public Port getPort() {
    return port;
  }


  public void setPort(Port port) {
    this.port = port;
  }


  public MetricsSpec scheme(String scheme) {
    
    this.scheme = scheme;
    return this;
  }

   /**
   * The way to retrieve data which can take the values &#x60;http&#x60; or &#x60;https&#x60;
   * @return scheme
  **/
  @javax.annotation.Nonnull

  public String getScheme() {
    return scheme;
  }


  public void setScheme(String scheme) {
    this.scheme = scheme;
  }


  public MetricsSpec selector(Map<String, String> selector) {
    
    this.selector = selector;
    return this;
  }

  public MetricsSpec putSelectorItem(String key, String selectorItem) {
    if (this.selector == null) {
      this.selector = new HashMap<>();
    }
    this.selector.put(key, selectorItem);
    return this;
  }

   /**
   * The label selector for the pods, will discovery automatically by default
   * @return selector
  **/
  @javax.annotation.Nullable

  public Map<String, String> getSelector() {
    return selector;
  }


  public void setSelector(Map<String, String> selector) {
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
    MetricsSpec metricsSpec = (MetricsSpec) o;
    return Objects.equals(this.enabled, metricsSpec.enabled) &&
        Objects.equals(this.format, metricsSpec.format) &&
        Objects.equals(this.path, metricsSpec.path) &&
        Objects.equals(this.port, metricsSpec.port) &&
        Objects.equals(this.scheme, metricsSpec.scheme) &&
        Objects.equals(this.selector, metricsSpec.selector);
  }

  @Override
  public int hashCode() {
    return Objects.hash(enabled, format, path, port, scheme, selector);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MetricsSpec {\n");
    sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
    sb.append("    format: ").append(toIndentedString(format)).append("\n");
    sb.append("    path: ").append(toIndentedString(path)).append("\n");
    sb.append("    port: ").append(toIndentedString(port)).append("\n");
    sb.append("    scheme: ").append(toIndentedString(scheme)).append("\n");
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
    openapiFields.add("enabled");
    openapiFields.add("format");
    openapiFields.add("path");
    openapiFields.add("port");
    openapiFields.add("scheme");
    openapiFields.add("selector");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("enabled");
    openapiRequiredFields.add("format");
    openapiRequiredFields.add("path");
    openapiRequiredFields.add("port");
    openapiRequiredFields.add("scheme");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to MetricsSpec
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!MetricsSpec.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in MetricsSpec is not found in the empty JSON string", MetricsSpec.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!MetricsSpec.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `MetricsSpec` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : MetricsSpec.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (!jsonObj.get("format").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `format` to be a primitive type in the JSON string but got `%s`", jsonObj.get("format").toString()));
      }
      if (!jsonObj.get("path").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `path` to be a primitive type in the JSON string but got `%s`", jsonObj.get("path").toString()));
      }
      // validate the required field `port`
      Port.validateJsonObject(jsonObj.getAsJsonObject("port"));
      if (!jsonObj.get("scheme").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `scheme` to be a primitive type in the JSON string but got `%s`", jsonObj.get("scheme").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!MetricsSpec.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'MetricsSpec' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<MetricsSpec> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(MetricsSpec.class));

       return (TypeAdapter<T>) new TypeAdapter<MetricsSpec>() {
           @Override
           public void write(JsonWriter out, MetricsSpec value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public MetricsSpec read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of MetricsSpec given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of MetricsSpec
  * @throws IOException if the JSON string is invalid with respect to MetricsSpec
  */
  public static MetricsSpec fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, MetricsSpec.class);
  }

 /**
  * Convert an instance of MetricsSpec to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

