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


package sdk.kubevela.cpuscaler.model;

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

import sdk.kubevela.cpuscaler.JSON;

/**
 * CpuscalerSpec
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-10-16T03:49:27.525965Z[Etc/UTC]")
public class CpuscalerSpec {
  public static final String SERIALIZED_NAME_CPU_UTIL = "cpuUtil";
  @SerializedName(SERIALIZED_NAME_CPU_UTIL)
  private Integer cpuUtil = 50;

  public static final String SERIALIZED_NAME_MAX = "max";
  @SerializedName(SERIALIZED_NAME_MAX)
  private Integer max = 10;

  public static final String SERIALIZED_NAME_MIN = "min";
  @SerializedName(SERIALIZED_NAME_MIN)
  private Integer min = 1;

  public static final String SERIALIZED_NAME_TARGET_A_P_I_VERSION = "targetAPIVersion";
  @SerializedName(SERIALIZED_NAME_TARGET_A_P_I_VERSION)
  private String targetAPIVersion = "apps/v1";

  public static final String SERIALIZED_NAME_TARGET_KIND = "targetKind";
  @SerializedName(SERIALIZED_NAME_TARGET_KIND)
  private String targetKind = "Deployment";

  public CpuscalerSpec() {
  }

  public CpuscalerSpec cpuUtil(Integer cpuUtil) {
    
    this.cpuUtil = cpuUtil;
    return this;
  }

   /**
   * Specify the average CPU utilization, for example, 50 means the CPU usage is 50%
   * @return cpuUtil
  **/
  @javax.annotation.Nonnull

  public Integer getCpuUtil() {
    return cpuUtil;
  }


  public void setCpuUtil(Integer cpuUtil) {
    this.cpuUtil = cpuUtil;
  }


  public CpuscalerSpec max(Integer max) {
    
    this.max = max;
    return this;
  }

   /**
   * Specify the maximum number of of replicas to which the autoscaler can scale up
   * @return max
  **/
  @javax.annotation.Nonnull

  public Integer getMax() {
    return max;
  }


  public void setMax(Integer max) {
    this.max = max;
  }


  public CpuscalerSpec min(Integer min) {
    
    this.min = min;
    return this;
  }

   /**
   * Specify the minimal number of replicas to which the autoscaler can scale down
   * @return min
  **/
  @javax.annotation.Nonnull

  public Integer getMin() {
    return min;
  }


  public void setMin(Integer min) {
    this.min = min;
  }


  public CpuscalerSpec targetAPIVersion(String targetAPIVersion) {
    
    this.targetAPIVersion = targetAPIVersion;
    return this;
  }

   /**
   * Specify the apiVersion of scale target
   * @return targetAPIVersion
  **/
  @javax.annotation.Nonnull

  public String getTargetAPIVersion() {
    return targetAPIVersion;
  }


  public void setTargetAPIVersion(String targetAPIVersion) {
    this.targetAPIVersion = targetAPIVersion;
  }


  public CpuscalerSpec targetKind(String targetKind) {
    
    this.targetKind = targetKind;
    return this;
  }

   /**
   * Specify the kind of scale target
   * @return targetKind
  **/
  @javax.annotation.Nonnull

  public String getTargetKind() {
    return targetKind;
  }


  public void setTargetKind(String targetKind) {
    this.targetKind = targetKind;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CpuscalerSpec cpuscalerSpec = (CpuscalerSpec) o;
    return Objects.equals(this.cpuUtil, cpuscalerSpec.cpuUtil) &&
        Objects.equals(this.max, cpuscalerSpec.max) &&
        Objects.equals(this.min, cpuscalerSpec.min) &&
        Objects.equals(this.targetAPIVersion, cpuscalerSpec.targetAPIVersion) &&
        Objects.equals(this.targetKind, cpuscalerSpec.targetKind);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cpuUtil, max, min, targetAPIVersion, targetKind);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CpuscalerSpec {\n");
    sb.append("    cpuUtil: ").append(toIndentedString(cpuUtil)).append("\n");
    sb.append("    max: ").append(toIndentedString(max)).append("\n");
    sb.append("    min: ").append(toIndentedString(min)).append("\n");
    sb.append("    targetAPIVersion: ").append(toIndentedString(targetAPIVersion)).append("\n");
    sb.append("    targetKind: ").append(toIndentedString(targetKind)).append("\n");
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
    openapiFields.add("targetAPIVersion");
    openapiFields.add("targetKind");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("cpuUtil");
    openapiRequiredFields.add("max");
    openapiRequiredFields.add("min");
    openapiRequiredFields.add("targetAPIVersion");
    openapiRequiredFields.add("targetKind");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to CpuscalerSpec
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!CpuscalerSpec.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in CpuscalerSpec is not found in the empty JSON string", CpuscalerSpec.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!CpuscalerSpec.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `CpuscalerSpec` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : CpuscalerSpec.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (!jsonObj.get("targetAPIVersion").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `targetAPIVersion` to be a primitive type in the JSON string but got `%s`", jsonObj.get("targetAPIVersion").toString()));
      }
      if (!jsonObj.get("targetKind").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `targetKind` to be a primitive type in the JSON string but got `%s`", jsonObj.get("targetKind").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CpuscalerSpec.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CpuscalerSpec' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CpuscalerSpec> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CpuscalerSpec.class));

       return (TypeAdapter<T>) new TypeAdapter<CpuscalerSpec>() {
           @Override
           public void write(JsonWriter out, CpuscalerSpec value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CpuscalerSpec read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of CpuscalerSpec given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of CpuscalerSpec
  * @throws IOException if the JSON string is invalid with respect to CpuscalerSpec
  */
  public static CpuscalerSpec fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CpuscalerSpec.class);
  }

 /**
  * Convert an instance of CpuscalerSpec to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

