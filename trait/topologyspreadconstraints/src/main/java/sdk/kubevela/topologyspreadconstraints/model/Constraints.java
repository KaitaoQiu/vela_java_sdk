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


package sdk.kubevela.topologyspreadconstraints.model;

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
import sdk.kubevela.topologyspreadconstraints.model.LabSelector;

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

import sdk.kubevela.topologyspreadconstraints.JSON;

/**
 * Constraints
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-10-16T03:51:09.944465Z[Etc/UTC]")
public class Constraints {
  public static final String SERIALIZED_NAME_LABEL_SELECTOR = "labelSelector";
  @SerializedName(SERIALIZED_NAME_LABEL_SELECTOR)
  private LabSelector labelSelector;

  public static final String SERIALIZED_NAME_MATCH_LABEL_KEYS = "matchLabelKeys";
  @SerializedName(SERIALIZED_NAME_MATCH_LABEL_KEYS)
  private List<String> matchLabelKeys = null;

  public static final String SERIALIZED_NAME_MAX_SKEW = "maxSkew";
  @SerializedName(SERIALIZED_NAME_MAX_SKEW)
  private Integer maxSkew;

  public static final String SERIALIZED_NAME_MIN_DOMAINS = "minDomains";
  @SerializedName(SERIALIZED_NAME_MIN_DOMAINS)
  private Integer minDomains;

  /**
   * Indicate how we will treat Pod&#39;s nodeAffinity/nodeSelector when calculating pod topology spread skew
   */
  @JsonAdapter(NodeAffinityPolicyEnum.Adapter.class)
  public enum NodeAffinityPolicyEnum {
    HONOR("Honor"),
    
    IGNORE("Ignore");

    private String value;

    NodeAffinityPolicyEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static NodeAffinityPolicyEnum fromValue(String value) {
      for (NodeAffinityPolicyEnum b : NodeAffinityPolicyEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<NodeAffinityPolicyEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final NodeAffinityPolicyEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public NodeAffinityPolicyEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return NodeAffinityPolicyEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_NODE_AFFINITY_POLICY = "nodeAffinityPolicy";
  @SerializedName(SERIALIZED_NAME_NODE_AFFINITY_POLICY)
  private NodeAffinityPolicyEnum nodeAffinityPolicy = NodeAffinityPolicyEnum.HONOR;

  /**
   * Indicate how we will treat node taints when calculating pod topology spread skew
   */
  @JsonAdapter(NodeTaintsPolicyEnum.Adapter.class)
  public enum NodeTaintsPolicyEnum {
    HONOR("Honor"),
    
    IGNORE("Ignore");

    private String value;

    NodeTaintsPolicyEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static NodeTaintsPolicyEnum fromValue(String value) {
      for (NodeTaintsPolicyEnum b : NodeTaintsPolicyEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<NodeTaintsPolicyEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final NodeTaintsPolicyEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public NodeTaintsPolicyEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return NodeTaintsPolicyEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_NODE_TAINTS_POLICY = "nodeTaintsPolicy";
  @SerializedName(SERIALIZED_NAME_NODE_TAINTS_POLICY)
  private NodeTaintsPolicyEnum nodeTaintsPolicy = NodeTaintsPolicyEnum.HONOR;

  public static final String SERIALIZED_NAME_TOPOLOGY_KEY = "topologyKey";
  @SerializedName(SERIALIZED_NAME_TOPOLOGY_KEY)
  private String topologyKey;

  /**
   * Indicate how to deal with a Pod if it doesn&#39;t satisfy the spread constraint
   */
  @JsonAdapter(WhenUnsatisfiableEnum.Adapter.class)
  public enum WhenUnsatisfiableEnum {
    DONOTSCHEDULE("DoNotSchedule"),
    
    SCHEDULEANYWAY("ScheduleAnyway");

    private String value;

    WhenUnsatisfiableEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static WhenUnsatisfiableEnum fromValue(String value) {
      for (WhenUnsatisfiableEnum b : WhenUnsatisfiableEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<WhenUnsatisfiableEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final WhenUnsatisfiableEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public WhenUnsatisfiableEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return WhenUnsatisfiableEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_WHEN_UNSATISFIABLE = "whenUnsatisfiable";
  @SerializedName(SERIALIZED_NAME_WHEN_UNSATISFIABLE)
  private WhenUnsatisfiableEnum whenUnsatisfiable = WhenUnsatisfiableEnum.DONOTSCHEDULE;

  public Constraints() {
  }

  public Constraints labelSelector(LabSelector labelSelector) {
    
    this.labelSelector = labelSelector;
    return this;
  }

   /**
   * Get labelSelector
   * @return labelSelector
  **/
  @javax.annotation.Nonnull

  public LabSelector getLabelSelector() {
    return labelSelector;
  }


  public void setLabelSelector(LabSelector labelSelector) {
    this.labelSelector = labelSelector;
  }


  public Constraints matchLabelKeys(List<String> matchLabelKeys) {
    
    this.matchLabelKeys = matchLabelKeys;
    return this;
  }

  public Constraints addMatchLabelKeysItem(String matchLabelKeysItem) {
    if (this.matchLabelKeys == null) {
      this.matchLabelKeys = new ArrayList<>();
    }
    this.matchLabelKeys.add(matchLabelKeysItem);
    return this;
  }

   /**
   * A list of pod label keys to select the pods over which spreading will be calculated
   * @return matchLabelKeys
  **/
  @javax.annotation.Nullable

  public List<String> getMatchLabelKeys() {
    return matchLabelKeys;
  }


  public void setMatchLabelKeys(List<String> matchLabelKeys) {
    this.matchLabelKeys = matchLabelKeys;
  }


  public Constraints maxSkew(Integer maxSkew) {
    
    this.maxSkew = maxSkew;
    return this;
  }

   /**
   * Describe the degree to which Pods may be unevenly distributed
   * @return maxSkew
  **/
  @javax.annotation.Nonnull

  public Integer getMaxSkew() {
    return maxSkew;
  }


  public void setMaxSkew(Integer maxSkew) {
    this.maxSkew = maxSkew;
  }


  public Constraints minDomains(Integer minDomains) {
    
    this.minDomains = minDomains;
    return this;
  }

   /**
   * Indicate a minimum number of eligible domains
   * @return minDomains
  **/
  @javax.annotation.Nullable

  public Integer getMinDomains() {
    return minDomains;
  }


  public void setMinDomains(Integer minDomains) {
    this.minDomains = minDomains;
  }


  public Constraints nodeAffinityPolicy(NodeAffinityPolicyEnum nodeAffinityPolicy) {
    
    this.nodeAffinityPolicy = nodeAffinityPolicy;
    return this;
  }

   /**
   * Indicate how we will treat Pod&#39;s nodeAffinity/nodeSelector when calculating pod topology spread skew
   * @return nodeAffinityPolicy
  **/
  @javax.annotation.Nullable

  public NodeAffinityPolicyEnum getNodeAffinityPolicy() {
    return nodeAffinityPolicy;
  }


  public void setNodeAffinityPolicy(NodeAffinityPolicyEnum nodeAffinityPolicy) {
    this.nodeAffinityPolicy = nodeAffinityPolicy;
  }


  public Constraints nodeTaintsPolicy(NodeTaintsPolicyEnum nodeTaintsPolicy) {
    
    this.nodeTaintsPolicy = nodeTaintsPolicy;
    return this;
  }

   /**
   * Indicate how we will treat node taints when calculating pod topology spread skew
   * @return nodeTaintsPolicy
  **/
  @javax.annotation.Nullable

  public NodeTaintsPolicyEnum getNodeTaintsPolicy() {
    return nodeTaintsPolicy;
  }


  public void setNodeTaintsPolicy(NodeTaintsPolicyEnum nodeTaintsPolicy) {
    this.nodeTaintsPolicy = nodeTaintsPolicy;
  }


  public Constraints topologyKey(String topologyKey) {
    
    this.topologyKey = topologyKey;
    return this;
  }

   /**
   * Specify the key of node labels
   * @return topologyKey
  **/
  @javax.annotation.Nonnull

  public String getTopologyKey() {
    return topologyKey;
  }


  public void setTopologyKey(String topologyKey) {
    this.topologyKey = topologyKey;
  }


  public Constraints whenUnsatisfiable(WhenUnsatisfiableEnum whenUnsatisfiable) {
    
    this.whenUnsatisfiable = whenUnsatisfiable;
    return this;
  }

   /**
   * Indicate how to deal with a Pod if it doesn&#39;t satisfy the spread constraint
   * @return whenUnsatisfiable
  **/
  @javax.annotation.Nonnull

  public WhenUnsatisfiableEnum getWhenUnsatisfiable() {
    return whenUnsatisfiable;
  }


  public void setWhenUnsatisfiable(WhenUnsatisfiableEnum whenUnsatisfiable) {
    this.whenUnsatisfiable = whenUnsatisfiable;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Constraints constraints = (Constraints) o;
    return Objects.equals(this.labelSelector, constraints.labelSelector) &&
        Objects.equals(this.matchLabelKeys, constraints.matchLabelKeys) &&
        Objects.equals(this.maxSkew, constraints.maxSkew) &&
        Objects.equals(this.minDomains, constraints.minDomains) &&
        Objects.equals(this.nodeAffinityPolicy, constraints.nodeAffinityPolicy) &&
        Objects.equals(this.nodeTaintsPolicy, constraints.nodeTaintsPolicy) &&
        Objects.equals(this.topologyKey, constraints.topologyKey) &&
        Objects.equals(this.whenUnsatisfiable, constraints.whenUnsatisfiable);
  }

  @Override
  public int hashCode() {
    return Objects.hash(labelSelector, matchLabelKeys, maxSkew, minDomains, nodeAffinityPolicy, nodeTaintsPolicy, topologyKey, whenUnsatisfiable);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Constraints {\n");
    sb.append("    labelSelector: ").append(toIndentedString(labelSelector)).append("\n");
    sb.append("    matchLabelKeys: ").append(toIndentedString(matchLabelKeys)).append("\n");
    sb.append("    maxSkew: ").append(toIndentedString(maxSkew)).append("\n");
    sb.append("    minDomains: ").append(toIndentedString(minDomains)).append("\n");
    sb.append("    nodeAffinityPolicy: ").append(toIndentedString(nodeAffinityPolicy)).append("\n");
    sb.append("    nodeTaintsPolicy: ").append(toIndentedString(nodeTaintsPolicy)).append("\n");
    sb.append("    topologyKey: ").append(toIndentedString(topologyKey)).append("\n");
    sb.append("    whenUnsatisfiable: ").append(toIndentedString(whenUnsatisfiable)).append("\n");
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
    openapiFields.add("labelSelector");
    openapiFields.add("matchLabelKeys");
    openapiFields.add("maxSkew");
    openapiFields.add("minDomains");
    openapiFields.add("nodeAffinityPolicy");
    openapiFields.add("nodeTaintsPolicy");
    openapiFields.add("topologyKey");
    openapiFields.add("whenUnsatisfiable");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("labelSelector");
    openapiRequiredFields.add("maxSkew");
    openapiRequiredFields.add("topologyKey");
    openapiRequiredFields.add("whenUnsatisfiable");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to Constraints
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!Constraints.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in Constraints is not found in the empty JSON string", Constraints.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!Constraints.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `Constraints` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : Constraints.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      // validate the required field `labelSelector`
      LabSelector.validateJsonObject(jsonObj.getAsJsonObject("labelSelector"));
      // ensure the optional json data is an array if present
      if (jsonObj.get("matchLabelKeys") != null && !jsonObj.get("matchLabelKeys").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `matchLabelKeys` to be an array in the JSON string but got `%s`", jsonObj.get("matchLabelKeys").toString()));
      }
      if ((jsonObj.get("nodeAffinityPolicy") != null && !jsonObj.get("nodeAffinityPolicy").isJsonNull()) && !jsonObj.get("nodeAffinityPolicy").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `nodeAffinityPolicy` to be a primitive type in the JSON string but got `%s`", jsonObj.get("nodeAffinityPolicy").toString()));
      }
      if ((jsonObj.get("nodeTaintsPolicy") != null && !jsonObj.get("nodeTaintsPolicy").isJsonNull()) && !jsonObj.get("nodeTaintsPolicy").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `nodeTaintsPolicy` to be a primitive type in the JSON string but got `%s`", jsonObj.get("nodeTaintsPolicy").toString()));
      }
      if (!jsonObj.get("topologyKey").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `topologyKey` to be a primitive type in the JSON string but got `%s`", jsonObj.get("topologyKey").toString()));
      }
      if (!jsonObj.get("whenUnsatisfiable").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `whenUnsatisfiable` to be a primitive type in the JSON string but got `%s`", jsonObj.get("whenUnsatisfiable").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!Constraints.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Constraints' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Constraints> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Constraints.class));

       return (TypeAdapter<T>) new TypeAdapter<Constraints>() {
           @Override
           public void write(JsonWriter out, Constraints value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public Constraints read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of Constraints given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of Constraints
  * @throws IOException if the JSON string is invalid with respect to Constraints
  */
  public static Constraints fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Constraints.class);
  }

 /**
  * Convert an instance of Constraints to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
