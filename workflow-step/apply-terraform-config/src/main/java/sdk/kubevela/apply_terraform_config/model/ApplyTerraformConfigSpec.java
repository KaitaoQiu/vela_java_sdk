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


package sdk.kubevela.apply_terraform_config.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import sdk.kubevela.apply_terraform_config.model.ProviderRef;
import sdk.kubevela.apply_terraform_config.model.Source;
import sdk.kubevela.apply_terraform_config.model.WriteConnectionSecretToRef;

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

import sdk.kubevela.apply_terraform_config.JSON;

/**
 * ApplyTerraformConfigSpec
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-10-16T03:49:11.929831Z[Etc/UTC]")
public class ApplyTerraformConfigSpec {
  public static final String SERIALIZED_NAME_DELETE_RESOURCE = "deleteResource";
  @SerializedName(SERIALIZED_NAME_DELETE_RESOURCE)
  private Boolean deleteResource = true;

  public static final String SERIALIZED_NAME_FORCE_DELETE = "forceDelete";
  @SerializedName(SERIALIZED_NAME_FORCE_DELETE)
  private Boolean forceDelete = false;

  public static final String SERIALIZED_NAME_JOB_ENV = "jobEnv";
  @SerializedName(SERIALIZED_NAME_JOB_ENV)
  private Object jobEnv;

  public static final String SERIALIZED_NAME_PROVIDER_REF = "providerRef";
  @SerializedName(SERIALIZED_NAME_PROVIDER_REF)
  private ProviderRef providerRef;

  public static final String SERIALIZED_NAME_REGION = "region";
  @SerializedName(SERIALIZED_NAME_REGION)
  private String region;

  public static final String SERIALIZED_NAME_SOURCE = "source";
  @SerializedName(SERIALIZED_NAME_SOURCE)
  private Source source;

  public static final String SERIALIZED_NAME_VARIABLE = "variable";
  @SerializedName(SERIALIZED_NAME_VARIABLE)
  private Object variable;

  public static final String SERIALIZED_NAME_WRITE_CONNECTION_SECRET_TO_REF = "writeConnectionSecretToRef";
  @SerializedName(SERIALIZED_NAME_WRITE_CONNECTION_SECRET_TO_REF)
  private WriteConnectionSecretToRef writeConnectionSecretToRef;

  public ApplyTerraformConfigSpec() {
  }

  public ApplyTerraformConfigSpec deleteResource(Boolean deleteResource) {
    
    this.deleteResource = deleteResource;
    return this;
  }

   /**
   * whether to delete resource
   * @return deleteResource
  **/
  @javax.annotation.Nonnull

  public Boolean getDeleteResource() {
    return deleteResource;
  }


  public void setDeleteResource(Boolean deleteResource) {
    this.deleteResource = deleteResource;
  }


  public ApplyTerraformConfigSpec forceDelete(Boolean forceDelete) {
    
    this.forceDelete = forceDelete;
    return this;
  }

   /**
   * forceDelete will force delete Configuration no matter which state it is or whether it has provisioned some resources
   * @return forceDelete
  **/
  @javax.annotation.Nonnull

  public Boolean getForceDelete() {
    return forceDelete;
  }


  public void setForceDelete(Boolean forceDelete) {
    this.forceDelete = forceDelete;
  }


  public ApplyTerraformConfigSpec jobEnv(Object jobEnv) {
    
    this.jobEnv = jobEnv;
    return this;
  }

   /**
   * the envs for job
   * @return jobEnv
  **/
  @javax.annotation.Nullable

  public Object getJobEnv() {
    return jobEnv;
  }


  public void setJobEnv(Object jobEnv) {
    this.jobEnv = jobEnv;
  }


  public ApplyTerraformConfigSpec providerRef(ProviderRef providerRef) {
    
    this.providerRef = providerRef;
    return this;
  }

   /**
   * Get providerRef
   * @return providerRef
  **/
  @javax.annotation.Nullable

  public ProviderRef getProviderRef() {
    return providerRef;
  }


  public void setProviderRef(ProviderRef providerRef) {
    this.providerRef = providerRef;
  }


  public ApplyTerraformConfigSpec region(String region) {
    
    this.region = region;
    return this;
  }

   /**
   * region is cloud provider&#39;s region. It will override the region in the region field of providerRef
   * @return region
  **/
  @javax.annotation.Nullable

  public String getRegion() {
    return region;
  }


  public void setRegion(String region) {
    this.region = region;
  }


  public ApplyTerraformConfigSpec source(Source source) {
    
    this.source = source;
    return this;
  }

   /**
   * Get source
   * @return source
  **/
  @javax.annotation.Nonnull

  public Source getSource() {
    return source;
  }


  public void setSource(Source source) {
    this.source = source;
  }


  public ApplyTerraformConfigSpec variable(Object variable) {
    
    this.variable = variable;
    return this;
  }

   /**
   * the variable in the configuration
   * @return variable
  **/
  @javax.annotation.Nonnull

  public Object getVariable() {
    return variable;
  }


  public void setVariable(Object variable) {
    this.variable = variable;
  }


  public ApplyTerraformConfigSpec writeConnectionSecretToRef(WriteConnectionSecretToRef writeConnectionSecretToRef) {
    
    this.writeConnectionSecretToRef = writeConnectionSecretToRef;
    return this;
  }

   /**
   * Get writeConnectionSecretToRef
   * @return writeConnectionSecretToRef
  **/
  @javax.annotation.Nullable

  public WriteConnectionSecretToRef getWriteConnectionSecretToRef() {
    return writeConnectionSecretToRef;
  }


  public void setWriteConnectionSecretToRef(WriteConnectionSecretToRef writeConnectionSecretToRef) {
    this.writeConnectionSecretToRef = writeConnectionSecretToRef;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ApplyTerraformConfigSpec applyTerraformConfigSpec = (ApplyTerraformConfigSpec) o;
    return Objects.equals(this.deleteResource, applyTerraformConfigSpec.deleteResource) &&
        Objects.equals(this.forceDelete, applyTerraformConfigSpec.forceDelete) &&
        Objects.equals(this.jobEnv, applyTerraformConfigSpec.jobEnv) &&
        Objects.equals(this.providerRef, applyTerraformConfigSpec.providerRef) &&
        Objects.equals(this.region, applyTerraformConfigSpec.region) &&
        Objects.equals(this.source, applyTerraformConfigSpec.source) &&
        Objects.equals(this.variable, applyTerraformConfigSpec.variable) &&
        Objects.equals(this.writeConnectionSecretToRef, applyTerraformConfigSpec.writeConnectionSecretToRef);
  }

  @Override
  public int hashCode() {
    return Objects.hash(deleteResource, forceDelete, jobEnv, providerRef, region, source, variable, writeConnectionSecretToRef);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ApplyTerraformConfigSpec {\n");
    sb.append("    deleteResource: ").append(toIndentedString(deleteResource)).append("\n");
    sb.append("    forceDelete: ").append(toIndentedString(forceDelete)).append("\n");
    sb.append("    jobEnv: ").append(toIndentedString(jobEnv)).append("\n");
    sb.append("    providerRef: ").append(toIndentedString(providerRef)).append("\n");
    sb.append("    region: ").append(toIndentedString(region)).append("\n");
    sb.append("    source: ").append(toIndentedString(source)).append("\n");
    sb.append("    variable: ").append(toIndentedString(variable)).append("\n");
    sb.append("    writeConnectionSecretToRef: ").append(toIndentedString(writeConnectionSecretToRef)).append("\n");
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
    openapiFields.add("deleteResource");
    openapiFields.add("forceDelete");
    openapiFields.add("jobEnv");
    openapiFields.add("providerRef");
    openapiFields.add("region");
    openapiFields.add("source");
    openapiFields.add("variable");
    openapiFields.add("writeConnectionSecretToRef");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("deleteResource");
    openapiRequiredFields.add("forceDelete");
    openapiRequiredFields.add("source");
    openapiRequiredFields.add("variable");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to ApplyTerraformConfigSpec
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!ApplyTerraformConfigSpec.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ApplyTerraformConfigSpec is not found in the empty JSON string", ApplyTerraformConfigSpec.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!ApplyTerraformConfigSpec.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ApplyTerraformConfigSpec` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : ApplyTerraformConfigSpec.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      // validate the optional field `providerRef`
      if (jsonObj.get("providerRef") != null && !jsonObj.get("providerRef").isJsonNull()) {
        ProviderRef.validateJsonObject(jsonObj.getAsJsonObject("providerRef"));
      }
      if ((jsonObj.get("region") != null && !jsonObj.get("region").isJsonNull()) && !jsonObj.get("region").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `region` to be a primitive type in the JSON string but got `%s`", jsonObj.get("region").toString()));
      }
      // validate the required field `source`
      Source.validateJsonObject(jsonObj.getAsJsonObject("source"));
      // validate the optional field `writeConnectionSecretToRef`
      if (jsonObj.get("writeConnectionSecretToRef") != null && !jsonObj.get("writeConnectionSecretToRef").isJsonNull()) {
        WriteConnectionSecretToRef.validateJsonObject(jsonObj.getAsJsonObject("writeConnectionSecretToRef"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ApplyTerraformConfigSpec.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ApplyTerraformConfigSpec' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ApplyTerraformConfigSpec> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ApplyTerraformConfigSpec.class));

       return (TypeAdapter<T>) new TypeAdapter<ApplyTerraformConfigSpec>() {
           @Override
           public void write(JsonWriter out, ApplyTerraformConfigSpec value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ApplyTerraformConfigSpec read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ApplyTerraformConfigSpec given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ApplyTerraformConfigSpec
  * @throws IOException if the JSON string is invalid with respect to ApplyTerraformConfigSpec
  */
  public static ApplyTerraformConfigSpec fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ApplyTerraformConfigSpec.class);
  }

 /**
  * Convert an instance of ApplyTerraformConfigSpec to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
