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


package sdk.kubevela.autoscale.model;

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

import sdk.kubevela.autoscale.JSON;

/**
 * Cron type auto-scaling. Just for &#x60;appfile&#x60;, not available for Cli usage
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-10-16T03:49:13.648143Z[Etc/UTC]")
public class Cron {
  public static final String SERIALIZED_NAME_DAYS = "days";
  @SerializedName(SERIALIZED_NAME_DAYS)
  private String days;

  public static final String SERIALIZED_NAME_DURATION = "duration";
  @SerializedName(SERIALIZED_NAME_DURATION)
  private String duration;

  public static final String SERIALIZED_NAME_REPLICAS = "replicas";
  @SerializedName(SERIALIZED_NAME_REPLICAS)
  private Integer replicas;

  public static final String SERIALIZED_NAME_START_AT = "startAt";
  @SerializedName(SERIALIZED_NAME_START_AT)
  private String startAt;

  public static final String SERIALIZED_NAME_TIMEZONE = "timezone";
  @SerializedName(SERIALIZED_NAME_TIMEZONE)
  private String timezone;

  public Cron() {
  }

  public Cron days(String days) {
    
    this.days = days;
    return this;
  }

   /**
   * Several workdays or weekends, like \&quot;Monday, Tuesday\&quot;
   * @return days
  **/
  @javax.annotation.Nonnull

  public String getDays() {
    return days;
  }


  public void setDays(String days) {
    this.days = days;
  }


  public Cron duration(String duration) {
    
    this.duration = duration;
    return this;
  }

   /**
   * For how long the scaling will last
   * @return duration
  **/
  @javax.annotation.Nonnull

  public String getDuration() {
    return duration;
  }


  public void setDuration(String duration) {
    this.duration = duration;
  }


  public Cron replicas(Integer replicas) {
    
    this.replicas = replicas;
    return this;
  }

   /**
   * The target replicas to be scaled to
   * @return replicas
  **/
  @javax.annotation.Nonnull

  public Integer getReplicas() {
    return replicas;
  }


  public void setReplicas(Integer replicas) {
    this.replicas = replicas;
  }


  public Cron startAt(String startAt) {
    
    this.startAt = startAt;
    return this;
  }

   /**
   * The time to start scaling, like &#x60;08:00&#x60;
   * @return startAt
  **/
  @javax.annotation.Nonnull

  public String getStartAt() {
    return startAt;
  }


  public void setStartAt(String startAt) {
    this.startAt = startAt;
  }


  public Cron timezone(String timezone) {
    
    this.timezone = timezone;
    return this;
  }

   /**
   * Timezone, like \&quot;America/Los_Angeles\&quot;
   * @return timezone
  **/
  @javax.annotation.Nonnull

  public String getTimezone() {
    return timezone;
  }


  public void setTimezone(String timezone) {
    this.timezone = timezone;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Cron cron = (Cron) o;
    return Objects.equals(this.days, cron.days) &&
        Objects.equals(this.duration, cron.duration) &&
        Objects.equals(this.replicas, cron.replicas) &&
        Objects.equals(this.startAt, cron.startAt) &&
        Objects.equals(this.timezone, cron.timezone);
  }

  @Override
  public int hashCode() {
    return Objects.hash(days, duration, replicas, startAt, timezone);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Cron {\n");
    sb.append("    days: ").append(toIndentedString(days)).append("\n");
    sb.append("    duration: ").append(toIndentedString(duration)).append("\n");
    sb.append("    replicas: ").append(toIndentedString(replicas)).append("\n");
    sb.append("    startAt: ").append(toIndentedString(startAt)).append("\n");
    sb.append("    timezone: ").append(toIndentedString(timezone)).append("\n");
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
    openapiFields.add("days");
    openapiFields.add("duration");
    openapiFields.add("replicas");
    openapiFields.add("startAt");
    openapiFields.add("timezone");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("days");
    openapiRequiredFields.add("duration");
    openapiRequiredFields.add("replicas");
    openapiRequiredFields.add("startAt");
    openapiRequiredFields.add("timezone");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to Cron
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!Cron.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in Cron is not found in the empty JSON string", Cron.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!Cron.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `Cron` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : Cron.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (!jsonObj.get("days").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `days` to be a primitive type in the JSON string but got `%s`", jsonObj.get("days").toString()));
      }
      if (!jsonObj.get("duration").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `duration` to be a primitive type in the JSON string but got `%s`", jsonObj.get("duration").toString()));
      }
      if (!jsonObj.get("startAt").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `startAt` to be a primitive type in the JSON string but got `%s`", jsonObj.get("startAt").toString()));
      }
      if (!jsonObj.get("timezone").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `timezone` to be a primitive type in the JSON string but got `%s`", jsonObj.get("timezone").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!Cron.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Cron' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Cron> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Cron.class));

       return (TypeAdapter<T>) new TypeAdapter<Cron>() {
           @Override
           public void write(JsonWriter out, Cron value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public Cron read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of Cron given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of Cron
  * @throws IOException if the JSON string is invalid with respect to Cron
  */
  public static Cron fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Cron.class);
  }

 /**
  * Convert an instance of Cron to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
