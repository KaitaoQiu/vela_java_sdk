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


package sdk.kubevela.hpa.model;

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

import sdk.kubevela.hpa.JSON;

/**
 * HpaSpec
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-10-16T03:50:00.365908Z[Etc/UTC]")
public class HpaSpec {
  public static final String SERIALIZED_NAME_CPU_UTIL = "cpuUtil";
  @SerializedName(SERIALIZED_NAME_CPU_UTIL)
  private Integer cpuUtil = 50;

  public static final String SERIALIZED_NAME_MAX = "max";
  @SerializedName(SERIALIZED_NAME_MAX)
  private Integer max = 10;

  public static final String SERIALIZED_NAME_MIN = "min";
  @SerializedName(SERIALIZED_NAME_MIN)
  private Integer min = 1;

  public HpaSpec() {
  }

  public HpaSpec cpuUtil(Integer cpuUtil) {
    
    this.cpuUtil = cpuUtil;
    return this;
  }

   /**
   * Get cpuUtil
   * @return cpuUtil
  **/
  @javax.annotation.Nonnull

  public Integer getCpuUtil() {
    return cpuUtil;
  }


  public void setCpuUtil(Integer cpuUtil) {
    this.cpuUtil = cpuUtil;
  }


  public HpaSpec max(Integer max) {
    
    this.max = max;
    return this;
  }

   /**
   * Get max
   * @return max
  **/
  @javax.annotation.Nonnull

  public Integer getMax() {
    return max;
  }


  public void setMax(Integer max) {
    this.max = max;
  }


  public HpaSpec min(Integer min) {
    
    this.min = min;
    return this;
  }

   /**
   * Get min
   * @return min
  **/
  @javax.annotation.Nonnull

  public Integer getMin() {
    return min;
  }


  public void setMin(Integer min) {
    this.min = min;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    HpaSpec hpaSpec = (HpaSpec) o;
    return Objects.equals(this.cpuUtil, hpaSpec.cpuUtil) &&
        Objects.equals(this.max, hpaSpec.max) &&
        Objects.equals(this.min, hpaSpec.min);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cpuUtil, max, min);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class HpaSpec {\n");
    sb.append("    cpuUtil: ").append(toIndentedString(cpuUtil)).append("\n");
    sb.append("    max: ").append(toIndentedString(max)).append("\n");
    sb.append("    min: ").append(toIndentedString(min)).append("\n");
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
    openapiFields.add("cpuUtil");
    openapiFields.add("max");
    openapiFields.add("min");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("cpuUtil");
    openapiRequiredFields.add("max");
    openapiRequiredFields.add("min");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to HpaSpec
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!HpaSpec.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in HpaSpec is not found in the empty JSON string", HpaSpec.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!HpaSpec.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `HpaSpec` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : HpaSpec.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!HpaSpec.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'HpaSpec' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<HpaSpec> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(HpaSpec.class));

       return (TypeAdapter<T>) new TypeAdapter<HpaSpec>() {
           @Override
           public void write(JsonWriter out, HpaSpec value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public HpaSpec read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of HpaSpec given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of HpaSpec
  * @throws IOException if the JSON string is invalid with respect to HpaSpec
  */
  public static HpaSpec fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, HpaSpec.class);
  }

 /**
  * Convert an instance of HpaSpec to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

