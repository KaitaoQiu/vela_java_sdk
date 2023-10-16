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


package sdk.kubevela.task.model;

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
import sdk.kubevela.task.model.HttpHeaders;

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

import sdk.kubevela.task.JSON;

/**
 * Instructions for assessing container health by executing an HTTP GET request. Either this attribute or the exec attribute or the tcpSocket attribute MUST be specified. This attribute is mutually exclusive with both the exec attribute and the tcpSocket attribute.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-10-16T03:51:06.388007Z[Etc/UTC]")
public class HttpGet {
  public static final String SERIALIZED_NAME_HTTP_HEADERS = "httpHeaders";
  @SerializedName(SERIALIZED_NAME_HTTP_HEADERS)
  private List<HttpHeaders> httpHeaders = null;

  public static final String SERIALIZED_NAME_PATH = "path";
  @SerializedName(SERIALIZED_NAME_PATH)
  private String path;

  public static final String SERIALIZED_NAME_PORT = "port";
  @SerializedName(SERIALIZED_NAME_PORT)
  private Integer port;

  public HttpGet() {
  }

  public HttpGet httpHeaders(List<HttpHeaders> httpHeaders) {
    
    this.httpHeaders = httpHeaders;
    return this;
  }

  public HttpGet addHttpHeadersItem(HttpHeaders httpHeadersItem) {
    if (this.httpHeaders == null) {
      this.httpHeaders = new ArrayList<>();
    }
    this.httpHeaders.add(httpHeadersItem);
    return this;
  }

   /**
   * Get httpHeaders
   * @return httpHeaders
  **/
  @javax.annotation.Nullable

  public List<HttpHeaders> getHttpHeaders() {
    return httpHeaders;
  }


  public void setHttpHeaders(List<HttpHeaders> httpHeaders) {
    this.httpHeaders = httpHeaders;
  }


  public HttpGet path(String path) {
    
    this.path = path;
    return this;
  }

   /**
   * The endpoint, relative to the port, to which the HTTP GET request should be directed.
   * @return path
  **/
  @javax.annotation.Nonnull

  public String getPath() {
    return path;
  }


  public void setPath(String path) {
    this.path = path;
  }


  public HttpGet port(Integer port) {
    
    this.port = port;
    return this;
  }

   /**
   * The TCP socket within the container to which the HTTP GET request should be directed.
   * @return port
  **/
  @javax.annotation.Nonnull

  public Integer getPort() {
    return port;
  }


  public void setPort(Integer port) {
    this.port = port;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    HttpGet httpGet = (HttpGet) o;
    return Objects.equals(this.httpHeaders, httpGet.httpHeaders) &&
        Objects.equals(this.path, httpGet.path) &&
        Objects.equals(this.port, httpGet.port);
  }

  @Override
  public int hashCode() {
    return Objects.hash(httpHeaders, path, port);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class HttpGet {\n");
    sb.append("    httpHeaders: ").append(toIndentedString(httpHeaders)).append("\n");
    sb.append("    path: ").append(toIndentedString(path)).append("\n");
    sb.append("    port: ").append(toIndentedString(port)).append("\n");
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
    openapiFields.add("httpHeaders");
    openapiFields.add("path");
    openapiFields.add("port");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("path");
    openapiRequiredFields.add("port");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to HttpGet
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!HttpGet.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in HttpGet is not found in the empty JSON string", HttpGet.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!HttpGet.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `HttpGet` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : HttpGet.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (jsonObj.get("httpHeaders") != null && !jsonObj.get("httpHeaders").isJsonNull()) {
        JsonArray jsonArrayhttpHeaders = jsonObj.getAsJsonArray("httpHeaders");
        if (jsonArrayhttpHeaders != null) {
          // ensure the json data is an array
          if (!jsonObj.get("httpHeaders").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `httpHeaders` to be an array in the JSON string but got `%s`", jsonObj.get("httpHeaders").toString()));
          }

          // validate the optional field `httpHeaders` (array)
          for (int i = 0; i < jsonArrayhttpHeaders.size(); i++) {
            HttpHeaders.validateJsonObject(jsonArrayhttpHeaders.get(i).getAsJsonObject());
          };
        }
      }
      if (!jsonObj.get("path").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `path` to be a primitive type in the JSON string but got `%s`", jsonObj.get("path").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!HttpGet.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'HttpGet' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<HttpGet> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(HttpGet.class));

       return (TypeAdapter<T>) new TypeAdapter<HttpGet>() {
           @Override
           public void write(JsonWriter out, HttpGet value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public HttpGet read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of HttpGet given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of HttpGet
  * @throws IOException if the JSON string is invalid with respect to HttpGet
  */
  public static HttpGet fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, HttpGet.class);
  }

 /**
  * Convert an instance of HttpGet to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

