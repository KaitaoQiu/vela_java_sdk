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


package sdk.kubevela.worker.model;

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
import sdk.kubevela.worker.model.Env;
import sdk.kubevela.worker.model.HealthProbe;
import sdk.kubevela.worker.model.VolumeMounts;
import sdk.kubevela.worker.model.Volumes;

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

import sdk.kubevela.worker.JSON;

/**
 * WorkerSpec
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-10-16T03:51:20.792631Z[Etc/UTC]")
public class WorkerSpec {
  public static final String SERIALIZED_NAME_CMD = "cmd";
  @SerializedName(SERIALIZED_NAME_CMD)
  private List<String> cmd = null;

  public static final String SERIALIZED_NAME_CPU = "cpu";
  @SerializedName(SERIALIZED_NAME_CPU)
  private String cpu;

  public static final String SERIALIZED_NAME_ENV = "env";
  @SerializedName(SERIALIZED_NAME_ENV)
  private List<Env> env = null;

  public static final String SERIALIZED_NAME_IMAGE = "image";
  @SerializedName(SERIALIZED_NAME_IMAGE)
  private String image;

  public static final String SERIALIZED_NAME_IMAGE_PULL_POLICY = "imagePullPolicy";
  @SerializedName(SERIALIZED_NAME_IMAGE_PULL_POLICY)
  private String imagePullPolicy;

  public static final String SERIALIZED_NAME_IMAGE_PULL_SECRETS = "imagePullSecrets";
  @SerializedName(SERIALIZED_NAME_IMAGE_PULL_SECRETS)
  private List<String> imagePullSecrets = null;

  public static final String SERIALIZED_NAME_LIVENESS_PROBE = "livenessProbe";
  @SerializedName(SERIALIZED_NAME_LIVENESS_PROBE)
  private HealthProbe livenessProbe;

  public static final String SERIALIZED_NAME_MEMORY = "memory";
  @SerializedName(SERIALIZED_NAME_MEMORY)
  private String memory;

  public static final String SERIALIZED_NAME_READINESS_PROBE = "readinessProbe";
  @SerializedName(SERIALIZED_NAME_READINESS_PROBE)
  private HealthProbe readinessProbe;

  public static final String SERIALIZED_NAME_VOLUME_MOUNTS = "volumeMounts";
  @SerializedName(SERIALIZED_NAME_VOLUME_MOUNTS)
  private VolumeMounts volumeMounts;

  public static final String SERIALIZED_NAME_VOLUMES = "volumes";
  @SerializedName(SERIALIZED_NAME_VOLUMES)
  private List<Volumes> volumes = null;

  public WorkerSpec() {
  }

  public WorkerSpec cmd(List<String> cmd) {
    
    this.cmd = cmd;
    return this;
  }

  public WorkerSpec addCmdItem(String cmdItem) {
    if (this.cmd == null) {
      this.cmd = new ArrayList<>();
    }
    this.cmd.add(cmdItem);
    return this;
  }

   /**
   * Commands to run in the container
   * @return cmd
  **/
  @javax.annotation.Nullable

  public List<String> getCmd() {
    return cmd;
  }


  public void setCmd(List<String> cmd) {
    this.cmd = cmd;
  }


  public WorkerSpec cpu(String cpu) {
    
    this.cpu = cpu;
    return this;
  }

   /**
   * Number of CPU units for the service, like &#x60;0.5&#x60; (0.5 CPU core), &#x60;1&#x60; (1 CPU core)
   * @return cpu
  **/
  @javax.annotation.Nullable

  public String getCpu() {
    return cpu;
  }


  public void setCpu(String cpu) {
    this.cpu = cpu;
  }


  public WorkerSpec env(List<Env> env) {
    
    this.env = env;
    return this;
  }

  public WorkerSpec addEnvItem(Env envItem) {
    if (this.env == null) {
      this.env = new ArrayList<>();
    }
    this.env.add(envItem);
    return this;
  }

   /**
   * Define arguments by using environment variables
   * @return env
  **/
  @javax.annotation.Nullable

  public List<Env> getEnv() {
    return env;
  }


  public void setEnv(List<Env> env) {
    this.env = env;
  }


  public WorkerSpec image(String image) {
    
    this.image = image;
    return this;
  }

   /**
   * Which image would you like to use for your service +short&#x3D;i
   * @return image
  **/
  @javax.annotation.Nonnull

  public String getImage() {
    return image;
  }


  public void setImage(String image) {
    this.image = image;
  }


  public WorkerSpec imagePullPolicy(String imagePullPolicy) {
    
    this.imagePullPolicy = imagePullPolicy;
    return this;
  }

   /**
   * Specify image pull policy for your service
   * @return imagePullPolicy
  **/
  @javax.annotation.Nullable

  public String getImagePullPolicy() {
    return imagePullPolicy;
  }


  public void setImagePullPolicy(String imagePullPolicy) {
    this.imagePullPolicy = imagePullPolicy;
  }


  public WorkerSpec imagePullSecrets(List<String> imagePullSecrets) {
    
    this.imagePullSecrets = imagePullSecrets;
    return this;
  }

  public WorkerSpec addImagePullSecretsItem(String imagePullSecretsItem) {
    if (this.imagePullSecrets == null) {
      this.imagePullSecrets = new ArrayList<>();
    }
    this.imagePullSecrets.add(imagePullSecretsItem);
    return this;
  }

   /**
   * Specify image pull secrets for your service
   * @return imagePullSecrets
  **/
  @javax.annotation.Nullable

  public List<String> getImagePullSecrets() {
    return imagePullSecrets;
  }


  public void setImagePullSecrets(List<String> imagePullSecrets) {
    this.imagePullSecrets = imagePullSecrets;
  }


  public WorkerSpec livenessProbe(HealthProbe livenessProbe) {
    
    this.livenessProbe = livenessProbe;
    return this;
  }

   /**
   * Get livenessProbe
   * @return livenessProbe
  **/
  @javax.annotation.Nullable

  public HealthProbe getLivenessProbe() {
    return livenessProbe;
  }


  public void setLivenessProbe(HealthProbe livenessProbe) {
    this.livenessProbe = livenessProbe;
  }


  public WorkerSpec memory(String memory) {
    
    this.memory = memory;
    return this;
  }

   /**
   * Specifies the attributes of the memory resource required for the container.
   * @return memory
  **/
  @javax.annotation.Nullable

  public String getMemory() {
    return memory;
  }


  public void setMemory(String memory) {
    this.memory = memory;
  }


  public WorkerSpec readinessProbe(HealthProbe readinessProbe) {
    
    this.readinessProbe = readinessProbe;
    return this;
  }

   /**
   * Get readinessProbe
   * @return readinessProbe
  **/
  @javax.annotation.Nullable

  public HealthProbe getReadinessProbe() {
    return readinessProbe;
  }


  public void setReadinessProbe(HealthProbe readinessProbe) {
    this.readinessProbe = readinessProbe;
  }


  public WorkerSpec volumeMounts(VolumeMounts volumeMounts) {
    
    this.volumeMounts = volumeMounts;
    return this;
  }

   /**
   * Get volumeMounts
   * @return volumeMounts
  **/
  @javax.annotation.Nullable

  public VolumeMounts getVolumeMounts() {
    return volumeMounts;
  }


  public void setVolumeMounts(VolumeMounts volumeMounts) {
    this.volumeMounts = volumeMounts;
  }


  public WorkerSpec volumes(List<Volumes> volumes) {
    
    this.volumes = volumes;
    return this;
  }

  public WorkerSpec addVolumesItem(Volumes volumesItem) {
    if (this.volumes == null) {
      this.volumes = new ArrayList<>();
    }
    this.volumes.add(volumesItem);
    return this;
  }

   /**
   * Deprecated field, use volumeMounts instead.
   * @return volumes
  **/
  @javax.annotation.Nullable

  public List<Volumes> getVolumes() {
    return volumes;
  }


  public void setVolumes(List<Volumes> volumes) {
    this.volumes = volumes;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WorkerSpec workerSpec = (WorkerSpec) o;
    return Objects.equals(this.cmd, workerSpec.cmd) &&
        Objects.equals(this.cpu, workerSpec.cpu) &&
        Objects.equals(this.env, workerSpec.env) &&
        Objects.equals(this.image, workerSpec.image) &&
        Objects.equals(this.imagePullPolicy, workerSpec.imagePullPolicy) &&
        Objects.equals(this.imagePullSecrets, workerSpec.imagePullSecrets) &&
        Objects.equals(this.livenessProbe, workerSpec.livenessProbe) &&
        Objects.equals(this.memory, workerSpec.memory) &&
        Objects.equals(this.readinessProbe, workerSpec.readinessProbe) &&
        Objects.equals(this.volumeMounts, workerSpec.volumeMounts) &&
        Objects.equals(this.volumes, workerSpec.volumes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cmd, cpu, env, image, imagePullPolicy, imagePullSecrets, livenessProbe, memory, readinessProbe, volumeMounts, volumes);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WorkerSpec {\n");
    sb.append("    cmd: ").append(toIndentedString(cmd)).append("\n");
    sb.append("    cpu: ").append(toIndentedString(cpu)).append("\n");
    sb.append("    env: ").append(toIndentedString(env)).append("\n");
    sb.append("    image: ").append(toIndentedString(image)).append("\n");
    sb.append("    imagePullPolicy: ").append(toIndentedString(imagePullPolicy)).append("\n");
    sb.append("    imagePullSecrets: ").append(toIndentedString(imagePullSecrets)).append("\n");
    sb.append("    livenessProbe: ").append(toIndentedString(livenessProbe)).append("\n");
    sb.append("    memory: ").append(toIndentedString(memory)).append("\n");
    sb.append("    readinessProbe: ").append(toIndentedString(readinessProbe)).append("\n");
    sb.append("    volumeMounts: ").append(toIndentedString(volumeMounts)).append("\n");
    sb.append("    volumes: ").append(toIndentedString(volumes)).append("\n");
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
    openapiFields.add("cmd");
    openapiFields.add("cpu");
    openapiFields.add("env");
    openapiFields.add("image");
    openapiFields.add("imagePullPolicy");
    openapiFields.add("imagePullSecrets");
    openapiFields.add("livenessProbe");
    openapiFields.add("memory");
    openapiFields.add("readinessProbe");
    openapiFields.add("volumeMounts");
    openapiFields.add("volumes");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("image");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to WorkerSpec
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!WorkerSpec.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in WorkerSpec is not found in the empty JSON string", WorkerSpec.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!WorkerSpec.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `WorkerSpec` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : WorkerSpec.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("cmd") != null && !jsonObj.get("cmd").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `cmd` to be an array in the JSON string but got `%s`", jsonObj.get("cmd").toString()));
      }
      if ((jsonObj.get("cpu") != null && !jsonObj.get("cpu").isJsonNull()) && !jsonObj.get("cpu").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `cpu` to be a primitive type in the JSON string but got `%s`", jsonObj.get("cpu").toString()));
      }
      if (jsonObj.get("env") != null && !jsonObj.get("env").isJsonNull()) {
        JsonArray jsonArrayenv = jsonObj.getAsJsonArray("env");
        if (jsonArrayenv != null) {
          // ensure the json data is an array
          if (!jsonObj.get("env").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `env` to be an array in the JSON string but got `%s`", jsonObj.get("env").toString()));
          }

          // validate the optional field `env` (array)
          for (int i = 0; i < jsonArrayenv.size(); i++) {
            Env.validateJsonObject(jsonArrayenv.get(i).getAsJsonObject());
          };
        }
      }
      if (!jsonObj.get("image").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `image` to be a primitive type in the JSON string but got `%s`", jsonObj.get("image").toString()));
      }
      if ((jsonObj.get("imagePullPolicy") != null && !jsonObj.get("imagePullPolicy").isJsonNull()) && !jsonObj.get("imagePullPolicy").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `imagePullPolicy` to be a primitive type in the JSON string but got `%s`", jsonObj.get("imagePullPolicy").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("imagePullSecrets") != null && !jsonObj.get("imagePullSecrets").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `imagePullSecrets` to be an array in the JSON string but got `%s`", jsonObj.get("imagePullSecrets").toString()));
      }
      // validate the optional field `livenessProbe`
      if (jsonObj.get("livenessProbe") != null && !jsonObj.get("livenessProbe").isJsonNull()) {
        HealthProbe.validateJsonObject(jsonObj.getAsJsonObject("livenessProbe"));
      }
      if ((jsonObj.get("memory") != null && !jsonObj.get("memory").isJsonNull()) && !jsonObj.get("memory").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `memory` to be a primitive type in the JSON string but got `%s`", jsonObj.get("memory").toString()));
      }
      // validate the optional field `readinessProbe`
      if (jsonObj.get("readinessProbe") != null && !jsonObj.get("readinessProbe").isJsonNull()) {
        HealthProbe.validateJsonObject(jsonObj.getAsJsonObject("readinessProbe"));
      }
      // validate the optional field `volumeMounts`
      if (jsonObj.get("volumeMounts") != null && !jsonObj.get("volumeMounts").isJsonNull()) {
        VolumeMounts.validateJsonObject(jsonObj.getAsJsonObject("volumeMounts"));
      }
      if (jsonObj.get("volumes") != null && !jsonObj.get("volumes").isJsonNull()) {
        JsonArray jsonArrayvolumes = jsonObj.getAsJsonArray("volumes");
        if (jsonArrayvolumes != null) {
          // ensure the json data is an array
          if (!jsonObj.get("volumes").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `volumes` to be an array in the JSON string but got `%s`", jsonObj.get("volumes").toString()));
          }

          // validate the optional field `volumes` (array)
          for (int i = 0; i < jsonArrayvolumes.size(); i++) {
            Volumes.validateJsonObject(jsonArrayvolumes.get(i).getAsJsonObject());
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!WorkerSpec.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'WorkerSpec' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<WorkerSpec> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(WorkerSpec.class));

       return (TypeAdapter<T>) new TypeAdapter<WorkerSpec>() {
           @Override
           public void write(JsonWriter out, WorkerSpec value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public WorkerSpec read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of WorkerSpec given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of WorkerSpec
  * @throws IOException if the JSON string is invalid with respect to WorkerSpec
  */
  public static WorkerSpec fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, WorkerSpec.class);
  }

 /**
  * Convert an instance of WorkerSpec to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

