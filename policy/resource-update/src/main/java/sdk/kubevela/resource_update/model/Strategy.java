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


package sdk.kubevela.resource_update.model;

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

import sdk.kubevela.resource_update.JSON;

/**
 * Strategy
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-10-16T03:50:41.953997Z[Etc/UTC]")
public class Strategy {
  /**
   * Specify the op for updating target resources
   */
  @JsonAdapter(OpEnum.Adapter.class)
  public enum OpEnum {
    PATCH("patch"),
    
    REPLACE("replace");

    private String value;

    OpEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static OpEnum fromValue(String value) {
      for (OpEnum b : OpEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<OpEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final OpEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public OpEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return OpEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_OP = "op";
  @SerializedName(SERIALIZED_NAME_OP)
  private OpEnum op = OpEnum.PATCH;

  public static final String SERIALIZED_NAME_RECREATE_FIELDS = "recreateFields";
  @SerializedName(SERIALIZED_NAME_RECREATE_FIELDS)
  private List<String> recreateFields = null;

  public Strategy() {
  }

  public Strategy op(OpEnum op) {
    
    this.op = op;
    return this;
  }

   /**
   * Specify the op for updating target resources
   * @return op
  **/
  @javax.annotation.Nonnull

  public OpEnum getOp() {
    return op;
  }


  public void setOp(OpEnum op) {
    this.op = op;
  }


  public Strategy recreateFields(List<String> recreateFields) {
    
    this.recreateFields = recreateFields;
    return this;
  }

  public Strategy addRecreateFieldsItem(String recreateFieldsItem) {
    if (this.recreateFields == null) {
      this.recreateFields = new ArrayList<>();
    }
    this.recreateFields.add(recreateFieldsItem);
    return this;
  }

   /**
   * Specify which fields would trigger recreation when updated
   * @return recreateFields
  **/
  @javax.annotation.Nullable

  public List<String> getRecreateFields() {
    return recreateFields;
  }


  public void setRecreateFields(List<String> recreateFields) {
    this.recreateFields = recreateFields;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Strategy strategy = (Strategy) o;
    return Objects.equals(this.op, strategy.op) &&
        Objects.equals(this.recreateFields, strategy.recreateFields);
  }

  @Override
  public int hashCode() {
    return Objects.hash(op, recreateFields);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Strategy {\n");
    sb.append("    op: ").append(toIndentedString(op)).append("\n");
    sb.append("    recreateFields: ").append(toIndentedString(recreateFields)).append("\n");
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
    openapiFields.add("op");
    openapiFields.add("recreateFields");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("op");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to Strategy
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!Strategy.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in Strategy is not found in the empty JSON string", Strategy.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!Strategy.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `Strategy` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : Strategy.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (!jsonObj.get("op").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `op` to be a primitive type in the JSON string but got `%s`", jsonObj.get("op").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("recreateFields") != null && !jsonObj.get("recreateFields").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `recreateFields` to be an array in the JSON string but got `%s`", jsonObj.get("recreateFields").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!Strategy.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Strategy' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Strategy> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Strategy.class));

       return (TypeAdapter<T>) new TypeAdapter<Strategy>() {
           @Override
           public void write(JsonWriter out, Strategy value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public Strategy read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of Strategy given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of Strategy
  * @throws IOException if the JSON string is invalid with respect to Strategy
  */
  public static Strategy fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Strategy.class);
  }

 /**
  * Convert an instance of Strategy to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

