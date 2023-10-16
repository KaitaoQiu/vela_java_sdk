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


package sdk.kubevela.startup_probe.model;

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
import sdk.kubevela.startup_probe.model.StartupProbeParams;

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

import sdk.kubevela.startup_probe.JSON;

/**
 * StartupProbeSpecOneOf
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-10-16T03:50:57.519455Z[Etc/UTC]")
public class StartupProbeSpecOneOf {
  public static final String SERIALIZED_NAME_PROBES = "probes";
  @SerializedName(SERIALIZED_NAME_PROBES)
  private List<StartupProbeParams> probes = new ArrayList<>();

  public StartupProbeSpecOneOf() {
  }

  public StartupProbeSpecOneOf probes(List<StartupProbeParams> probes) {
    
    this.probes = probes;
    return this;
  }

  public StartupProbeSpecOneOf addProbesItem(StartupProbeParams probesItem) {
    this.probes.add(probesItem);
    return this;
  }

   /**
   * Specify the startup probe for multiple containers
   * @return probes
  **/
  @javax.annotation.Nonnull

  public List<StartupProbeParams> getProbes() {
    return probes;
  }


  public void setProbes(List<StartupProbeParams> probes) {
    this.probes = probes;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StartupProbeSpecOneOf startupProbeSpecOneOf = (StartupProbeSpecOneOf) o;
    return Objects.equals(this.probes, startupProbeSpecOneOf.probes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(probes);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StartupProbeSpecOneOf {\n");
    sb.append("    probes: ").append(toIndentedString(probes)).append("\n");
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
    openapiFields.add("probes");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("probes");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to StartupProbeSpecOneOf
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!StartupProbeSpecOneOf.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in StartupProbeSpecOneOf is not found in the empty JSON string", StartupProbeSpecOneOf.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!StartupProbeSpecOneOf.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `StartupProbeSpecOneOf` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : StartupProbeSpecOneOf.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      // ensure the json data is an array
      if (!jsonObj.get("probes").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `probes` to be an array in the JSON string but got `%s`", jsonObj.get("probes").toString()));
      }

      JsonArray jsonArrayprobes = jsonObj.getAsJsonArray("probes");
      // validate the required field `probes` (array)
      for (int i = 0; i < jsonArrayprobes.size(); i++) {
        StartupProbeParams.validateJsonObject(jsonArrayprobes.get(i).getAsJsonObject());
      };
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!StartupProbeSpecOneOf.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'StartupProbeSpecOneOf' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<StartupProbeSpecOneOf> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(StartupProbeSpecOneOf.class));

       return (TypeAdapter<T>) new TypeAdapter<StartupProbeSpecOneOf>() {
           @Override
           public void write(JsonWriter out, StartupProbeSpecOneOf value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public StartupProbeSpecOneOf read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of StartupProbeSpecOneOf given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of StartupProbeSpecOneOf
  * @throws IOException if the JSON string is invalid with respect to StartupProbeSpecOneOf
  */
  public static StartupProbeSpecOneOf fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, StartupProbeSpecOneOf.class);
  }

 /**
  * Convert an instance of StartupProbeSpecOneOf to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
