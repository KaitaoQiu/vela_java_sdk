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


package sdk.kubevela.read_only.model;

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

import sdk.kubevela.read_only.JSON;

/**
 * RuleSelector
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-10-16T03:50:35.028166Z[Etc/UTC]")
public class RuleSelector {
  public static final String SERIALIZED_NAME_COMPONENT_NAMES = "componentNames";
  @SerializedName(SERIALIZED_NAME_COMPONENT_NAMES)
  private List<String> componentNames = null;

  public static final String SERIALIZED_NAME_COMPONENT_TYPES = "componentTypes";
  @SerializedName(SERIALIZED_NAME_COMPONENT_TYPES)
  private List<String> componentTypes = null;

  public static final String SERIALIZED_NAME_OAM_TYPES = "oamTypes";
  @SerializedName(SERIALIZED_NAME_OAM_TYPES)
  private List<String> oamTypes = null;

  public static final String SERIALIZED_NAME_RESOURCE_NAMES = "resourceNames";
  @SerializedName(SERIALIZED_NAME_RESOURCE_NAMES)
  private List<String> resourceNames = null;

  public static final String SERIALIZED_NAME_RESOURCE_TYPES = "resourceTypes";
  @SerializedName(SERIALIZED_NAME_RESOURCE_TYPES)
  private List<String> resourceTypes = null;

  public static final String SERIALIZED_NAME_TRAIT_TYPES = "traitTypes";
  @SerializedName(SERIALIZED_NAME_TRAIT_TYPES)
  private List<String> traitTypes = null;

  public RuleSelector() {
  }

  public RuleSelector componentNames(List<String> componentNames) {
    
    this.componentNames = componentNames;
    return this;
  }

  public RuleSelector addComponentNamesItem(String componentNamesItem) {
    if (this.componentNames == null) {
      this.componentNames = new ArrayList<>();
    }
    this.componentNames.add(componentNamesItem);
    return this;
  }

   /**
   * Select resources by component names
   * @return componentNames
  **/
  @javax.annotation.Nullable

  public List<String> getComponentNames() {
    return componentNames;
  }


  public void setComponentNames(List<String> componentNames) {
    this.componentNames = componentNames;
  }


  public RuleSelector componentTypes(List<String> componentTypes) {
    
    this.componentTypes = componentTypes;
    return this;
  }

  public RuleSelector addComponentTypesItem(String componentTypesItem) {
    if (this.componentTypes == null) {
      this.componentTypes = new ArrayList<>();
    }
    this.componentTypes.add(componentTypesItem);
    return this;
  }

   /**
   * Select resources by component types
   * @return componentTypes
  **/
  @javax.annotation.Nullable

  public List<String> getComponentTypes() {
    return componentTypes;
  }


  public void setComponentTypes(List<String> componentTypes) {
    this.componentTypes = componentTypes;
  }


  public RuleSelector oamTypes(List<String> oamTypes) {
    
    this.oamTypes = oamTypes;
    return this;
  }

  public RuleSelector addOamTypesItem(String oamTypesItem) {
    if (this.oamTypes == null) {
      this.oamTypes = new ArrayList<>();
    }
    this.oamTypes.add(oamTypesItem);
    return this;
  }

   /**
   * Select resources by oamTypes (COMPONENT or TRAIT)
   * @return oamTypes
  **/
  @javax.annotation.Nullable

  public List<String> getOamTypes() {
    return oamTypes;
  }


  public void setOamTypes(List<String> oamTypes) {
    this.oamTypes = oamTypes;
  }


  public RuleSelector resourceNames(List<String> resourceNames) {
    
    this.resourceNames = resourceNames;
    return this;
  }

  public RuleSelector addResourceNamesItem(String resourceNamesItem) {
    if (this.resourceNames == null) {
      this.resourceNames = new ArrayList<>();
    }
    this.resourceNames.add(resourceNamesItem);
    return this;
  }

   /**
   * Select resources by their names
   * @return resourceNames
  **/
  @javax.annotation.Nullable

  public List<String> getResourceNames() {
    return resourceNames;
  }


  public void setResourceNames(List<String> resourceNames) {
    this.resourceNames = resourceNames;
  }


  public RuleSelector resourceTypes(List<String> resourceTypes) {
    
    this.resourceTypes = resourceTypes;
    return this;
  }

  public RuleSelector addResourceTypesItem(String resourceTypesItem) {
    if (this.resourceTypes == null) {
      this.resourceTypes = new ArrayList<>();
    }
    this.resourceTypes.add(resourceTypesItem);
    return this;
  }

   /**
   * Select resources by resource types (like Deployment)
   * @return resourceTypes
  **/
  @javax.annotation.Nullable

  public List<String> getResourceTypes() {
    return resourceTypes;
  }


  public void setResourceTypes(List<String> resourceTypes) {
    this.resourceTypes = resourceTypes;
  }


  public RuleSelector traitTypes(List<String> traitTypes) {
    
    this.traitTypes = traitTypes;
    return this;
  }

  public RuleSelector addTraitTypesItem(String traitTypesItem) {
    if (this.traitTypes == null) {
      this.traitTypes = new ArrayList<>();
    }
    this.traitTypes.add(traitTypesItem);
    return this;
  }

   /**
   * Select resources by trait types
   * @return traitTypes
  **/
  @javax.annotation.Nullable

  public List<String> getTraitTypes() {
    return traitTypes;
  }


  public void setTraitTypes(List<String> traitTypes) {
    this.traitTypes = traitTypes;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RuleSelector ruleSelector = (RuleSelector) o;
    return Objects.equals(this.componentNames, ruleSelector.componentNames) &&
        Objects.equals(this.componentTypes, ruleSelector.componentTypes) &&
        Objects.equals(this.oamTypes, ruleSelector.oamTypes) &&
        Objects.equals(this.resourceNames, ruleSelector.resourceNames) &&
        Objects.equals(this.resourceTypes, ruleSelector.resourceTypes) &&
        Objects.equals(this.traitTypes, ruleSelector.traitTypes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(componentNames, componentTypes, oamTypes, resourceNames, resourceTypes, traitTypes);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RuleSelector {\n");
    sb.append("    componentNames: ").append(toIndentedString(componentNames)).append("\n");
    sb.append("    componentTypes: ").append(toIndentedString(componentTypes)).append("\n");
    sb.append("    oamTypes: ").append(toIndentedString(oamTypes)).append("\n");
    sb.append("    resourceNames: ").append(toIndentedString(resourceNames)).append("\n");
    sb.append("    resourceTypes: ").append(toIndentedString(resourceTypes)).append("\n");
    sb.append("    traitTypes: ").append(toIndentedString(traitTypes)).append("\n");
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
    openapiFields.add("componentNames");
    openapiFields.add("componentTypes");
    openapiFields.add("oamTypes");
    openapiFields.add("resourceNames");
    openapiFields.add("resourceTypes");
    openapiFields.add("traitTypes");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to RuleSelector
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!RuleSelector.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in RuleSelector is not found in the empty JSON string", RuleSelector.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!RuleSelector.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `RuleSelector` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("componentNames") != null && !jsonObj.get("componentNames").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `componentNames` to be an array in the JSON string but got `%s`", jsonObj.get("componentNames").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("componentTypes") != null && !jsonObj.get("componentTypes").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `componentTypes` to be an array in the JSON string but got `%s`", jsonObj.get("componentTypes").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("oamTypes") != null && !jsonObj.get("oamTypes").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `oamTypes` to be an array in the JSON string but got `%s`", jsonObj.get("oamTypes").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("resourceNames") != null && !jsonObj.get("resourceNames").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `resourceNames` to be an array in the JSON string but got `%s`", jsonObj.get("resourceNames").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("resourceTypes") != null && !jsonObj.get("resourceTypes").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `resourceTypes` to be an array in the JSON string but got `%s`", jsonObj.get("resourceTypes").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("traitTypes") != null && !jsonObj.get("traitTypes").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `traitTypes` to be an array in the JSON string but got `%s`", jsonObj.get("traitTypes").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!RuleSelector.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'RuleSelector' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<RuleSelector> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(RuleSelector.class));

       return (TypeAdapter<T>) new TypeAdapter<RuleSelector>() {
           @Override
           public void write(JsonWriter out, RuleSelector value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public RuleSelector read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of RuleSelector given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of RuleSelector
  * @throws IOException if the JSON string is invalid with respect to RuleSelector
  */
  public static RuleSelector fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, RuleSelector.class);
  }

 /**
  * Convert an instance of RuleSelector to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

