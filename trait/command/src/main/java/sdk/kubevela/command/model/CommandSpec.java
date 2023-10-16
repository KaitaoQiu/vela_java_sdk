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


package sdk.kubevela.command.model;

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
import sdk.kubevela.command.model.CommandSpecOneOf;
import sdk.kubevela.command.model.PatchParams;

import javax.ws.rs.core.GenericType;

import java.io.IOException;
import java.lang.reflect.Type;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.HashMap;
import java.util.Map;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonParseException;
import com.google.gson.TypeAdapter;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;
import com.google.gson.JsonPrimitive;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;

import sdk.kubevela.command.JSON;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-10-16T03:49:22.356808Z[Etc/UTC]")
public class CommandSpec extends AbstractOpenApiSchema {
    private static final Logger log = Logger.getLogger(CommandSpec.class.getName());

    public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
        @SuppressWarnings("unchecked")
        @Override
        public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
            if (!CommandSpec.class.isAssignableFrom(type.getRawType())) {
                return null; // this class only serializes 'CommandSpec' and its subtypes
            }
            final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
            final TypeAdapter<CommandSpecOneOf> adapterCommandSpecOneOf = gson.getDelegateAdapter(this, TypeToken.get(CommandSpecOneOf.class));
            final TypeAdapter<PatchParams> adapterPatchParams = gson.getDelegateAdapter(this, TypeToken.get(PatchParams.class));

            return (TypeAdapter<T>) new TypeAdapter<CommandSpec>() {
                @Override
                public void write(JsonWriter out, CommandSpec value) throws IOException {
                    if (value == null || value.getActualInstance() == null) {
                        elementAdapter.write(out, null);
                        return;
                    }

                    // check if the actual instance is of the type `CommandSpecOneOf`
                    if (value.getActualInstance() instanceof CommandSpecOneOf) {
                        JsonObject obj = adapterCommandSpecOneOf.toJsonTree((CommandSpecOneOf)value.getActualInstance()).getAsJsonObject();
                        elementAdapter.write(out, obj);
                        return;
                    }

                    // check if the actual instance is of the type `PatchParams`
                    if (value.getActualInstance() instanceof PatchParams) {
                        JsonObject obj = adapterPatchParams.toJsonTree((PatchParams)value.getActualInstance()).getAsJsonObject();
                        elementAdapter.write(out, obj);
                        return;
                    }

                    throw new IOException("Failed to serialize as the type doesn't match oneOf schemas: CommandSpecOneOf, PatchParams");
                }

                @Override
                public CommandSpec read(JsonReader in) throws IOException {
                    Object deserialized = null;
                    JsonObject jsonObject = elementAdapter.read(in).getAsJsonObject();

                    int match = 0;
                    ArrayList<String> errorMessages = new ArrayList<>();
                    TypeAdapter actualAdapter = elementAdapter;

                    // deserialize CommandSpecOneOf
                    try {
                        // validate the JSON object to see if any exception is thrown
                        CommandSpecOneOf.validateJsonObject(jsonObject);
                        actualAdapter = adapterCommandSpecOneOf;
                        match++;
                        log.log(Level.FINER, "Input data matches schema 'CommandSpecOneOf'");
                    } catch (Exception e) {
                        // deserialization failed, continue
                        errorMessages.add(String.format("Deserialization for CommandSpecOneOf failed with `%s`.", e.getMessage()));
                        log.log(Level.FINER, "Input data does not match schema 'CommandSpecOneOf'", e);
                    }

                    // deserialize PatchParams
                    try {
                        // validate the JSON object to see if any exception is thrown
                        PatchParams.validateJsonObject(jsonObject);
                        actualAdapter = adapterPatchParams;
                        match++;
                        log.log(Level.FINER, "Input data matches schema 'PatchParams'");
                    } catch (Exception e) {
                        // deserialization failed, continue
                        errorMessages.add(String.format("Deserialization for PatchParams failed with `%s`.", e.getMessage()));
                        log.log(Level.FINER, "Input data does not match schema 'PatchParams'", e);
                    }

                    if (match == 1) {
                        CommandSpec ret = new CommandSpec();
                        ret.setActualInstance(actualAdapter.fromJsonTree(jsonObject));
                        return ret;
                    }

                    throw new IOException(String.format("Failed deserialization for CommandSpec: %d classes match result, expected 1. Detailed failure message for oneOf schemas: %s. JSON: %s", match, errorMessages, jsonObject.toString()));
                }
            }.nullSafe();
        }
    }

    // store a list of schema names defined in oneOf
    public static final Map<String, GenericType> schemas = new HashMap<String, GenericType>();

    public CommandSpec() {
        super("oneOf", Boolean.FALSE);
    }

    public CommandSpec(CommandSpecOneOf o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    public CommandSpec(PatchParams o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    static {
        schemas.put("CommandSpecOneOf", new GenericType<CommandSpecOneOf>() {
        });
        schemas.put("PatchParams", new GenericType<PatchParams>() {
        });
    }

    @Override
    public Map<String, GenericType> getSchemas() {
        return CommandSpec.schemas;
    }

    /**
     * Set the instance that matches the oneOf child schema, check
     * the instance parameter is valid against the oneOf child schemas:
     * CommandSpecOneOf, PatchParams
     *
     * It could be an instance of the 'oneOf' schemas.
     * The oneOf child schemas may themselves be a composed schema (allOf, anyOf, oneOf).
     */
    @Override
    public void setActualInstance(Object instance) {
        if (instance instanceof CommandSpecOneOf) {
            super.setActualInstance(instance);
            return;
        }

        if (instance instanceof PatchParams) {
            super.setActualInstance(instance);
            return;
        }

        throw new RuntimeException("Invalid instance type. Must be CommandSpecOneOf, PatchParams");
    }

    /**
     * Get the actual instance, which can be the following:
     * CommandSpecOneOf, PatchParams
     *
     * @return The actual instance (CommandSpecOneOf, PatchParams)
     */
    @Override
    public Object getActualInstance() {
        return super.getActualInstance();
    }

    /**
     * Get the actual instance of `CommandSpecOneOf`. If the actual instance is not `CommandSpecOneOf`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `CommandSpecOneOf`
     * @throws ClassCastException if the instance is not `CommandSpecOneOf`
     */
    public CommandSpecOneOf getCommandSpecOneOf() throws ClassCastException {
        return (CommandSpecOneOf)super.getActualInstance();
    }

    /**
     * Get the actual instance of `PatchParams`. If the actual instance is not `PatchParams`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `PatchParams`
     * @throws ClassCastException if the instance is not `PatchParams`
     */
    public PatchParams getPatchParams() throws ClassCastException {
        return (PatchParams)super.getActualInstance();
    }


 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to CommandSpec
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
    // validate oneOf schemas one by one
    int validCount = 0;
    ArrayList<String> errorMessages = new ArrayList<>();
    // validate the json string with CommandSpecOneOf
    try {
      CommandSpecOneOf.validateJsonObject(jsonObj);
      validCount++;
    } catch (Exception e) {
      errorMessages.add(String.format("Deserialization for CommandSpecOneOf failed with `%s`.", e.getMessage()));
      // continue to the next one
    }
    // validate the json string with PatchParams
    try {
      PatchParams.validateJsonObject(jsonObj);
      validCount++;
    } catch (Exception e) {
      errorMessages.add(String.format("Deserialization for PatchParams failed with `%s`.", e.getMessage()));
      // continue to the next one
    }
    if (validCount != 1) {
      throw new IOException(String.format("The JSON string is invalid for CommandSpec with oneOf schemas: CommandSpecOneOf, PatchParams. %d class(es) match the result, expected 1. Detailed failure message for oneOf schemas: %s. JSON: %s", validCount, errorMessages, jsonObj.toString()));
    }
  }

 /**
  * Create an instance of CommandSpec given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of CommandSpec
  * @throws IOException if the JSON string is invalid with respect to CommandSpec
  */
  public static CommandSpec fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CommandSpec.class);
  }

 /**
  * Convert an instance of CommandSpec to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

