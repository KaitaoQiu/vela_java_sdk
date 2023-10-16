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


package sdk.kubevela.apply_once.model;

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
import sdk.kubevela.apply_once.model.ApplyOncePolicyRule;

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

import sdk.kubevela.apply_once.JSON;

/**
 * ApplyOnceSpec
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-10-16T03:49:10.138622Z[Etc/UTC]")
public class ApplyOnceSpec {
  public static final String SERIALIZED_NAME_ENABLE = "enable";
  @SerializedName(SERIALIZED_NAME_ENABLE)
  private Boolean enable = false;

  public static final String SERIALIZED_NAME_RULES = "rules";
  @SerializedName(SERIALIZED_NAME_RULES)
  private List<ApplyOncePolicyRule> rules = null;

  public ApplyOnceSpec() {
  }

  public ApplyOnceSpec enable(Boolean enable) {
    
    this.enable = enable;
    return this;
  }

   /**
   * Whether to enable apply-once for the whole application
   * @return enable
  **/
  @javax.annotation.Nonnull

  public Boolean getEnable() {
    return enable;
  }


  public void setEnable(Boolean enable) {
    this.enable = enable;
  }


  public ApplyOnceSpec rules(List<ApplyOncePolicyRule> rules) {
    
    this.rules = rules;
    return this;
  }

  public ApplyOnceSpec addRulesItem(ApplyOncePolicyRule rulesItem) {
    if (this.rules == null) {
      this.rules = new ArrayList<>();
    }
    this.rules.add(rulesItem);
    return this;
  }

   /**
   * Specify the rules for configuring apply-once policy in resource level
   * @return rules
  **/
  @javax.annotation.Nullable

  public List<ApplyOncePolicyRule> getRules() {
    return rules;
  }


  public void setRules(List<ApplyOncePolicyRule> rules) {
    this.rules = rules;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ApplyOnceSpec applyOnceSpec = (ApplyOnceSpec) o;
    return Objects.equals(this.enable, applyOnceSpec.enable) &&
        Objects.equals(this.rules, applyOnceSpec.rules);
  }

  @Override
  public int hashCode() {
    return Objects.hash(enable, rules);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ApplyOnceSpec {\n");
    sb.append("    enable: ").append(toIndentedString(enable)).append("\n");
    sb.append("    rules: ").append(toIndentedString(rules)).append("\n");
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
    openapiFields.add("enable");
    openapiFields.add("rules");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("enable");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to ApplyOnceSpec
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!ApplyOnceSpec.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ApplyOnceSpec is not found in the empty JSON string", ApplyOnceSpec.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!ApplyOnceSpec.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ApplyOnceSpec` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : ApplyOnceSpec.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (jsonObj.get("rules") != null && !jsonObj.get("rules").isJsonNull()) {
        JsonArray jsonArrayrules = jsonObj.getAsJsonArray("rules");
        if (jsonArrayrules != null) {
          // ensure the json data is an array
          if (!jsonObj.get("rules").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `rules` to be an array in the JSON string but got `%s`", jsonObj.get("rules").toString()));
          }

          // validate the optional field `rules` (array)
          for (int i = 0; i < jsonArrayrules.size(); i++) {
            ApplyOncePolicyRule.validateJsonObject(jsonArrayrules.get(i).getAsJsonObject());
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ApplyOnceSpec.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ApplyOnceSpec' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ApplyOnceSpec> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ApplyOnceSpec.class));

       return (TypeAdapter<T>) new TypeAdapter<ApplyOnceSpec>() {
           @Override
           public void write(JsonWriter out, ApplyOnceSpec value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ApplyOnceSpec read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ApplyOnceSpec given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ApplyOnceSpec
  * @throws IOException if the JSON string is invalid with respect to ApplyOnceSpec
  */
  public static ApplyOnceSpec fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ApplyOnceSpec.class);
  }

 /**
  * Convert an instance of ApplyOnceSpec to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

