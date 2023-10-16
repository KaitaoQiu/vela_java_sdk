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


package sdk.kubevela.webhook.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import sdk.kubevela.webhook.model.SecretRef;
import sdk.kubevela.webhook.model.UrlOneOf;
import sdk.kubevela.webhook.model.UrlOneOf1;

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

import sdk.kubevela.webhook.JSON;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-10-16T03:51:15.245607Z[Etc/UTC]")
public class Url extends AbstractOpenApiSchema {
    private static final Logger log = Logger.getLogger(Url.class.getName());

    public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
        @SuppressWarnings("unchecked")
        @Override
        public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
            if (!Url.class.isAssignableFrom(type.getRawType())) {
                return null; // this class only serializes 'Url' and its subtypes
            }
            final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
            final TypeAdapter<UrlOneOf> adapterUrlOneOf = gson.getDelegateAdapter(this, TypeToken.get(UrlOneOf.class));
            final TypeAdapter<UrlOneOf1> adapterUrlOneOf1 = gson.getDelegateAdapter(this, TypeToken.get(UrlOneOf1.class));

            return (TypeAdapter<T>) new TypeAdapter<Url>() {
                @Override
                public void write(JsonWriter out, Url value) throws IOException {
                    if (value == null || value.getActualInstance() == null) {
                        elementAdapter.write(out, null);
                        return;
                    }

                    // check if the actual instance is of the type `UrlOneOf`
                    if (value.getActualInstance() instanceof UrlOneOf) {
                        JsonObject obj = adapterUrlOneOf.toJsonTree((UrlOneOf)value.getActualInstance()).getAsJsonObject();
                        elementAdapter.write(out, obj);
                        return;
                    }

                    // check if the actual instance is of the type `UrlOneOf1`
                    if (value.getActualInstance() instanceof UrlOneOf1) {
                        JsonObject obj = adapterUrlOneOf1.toJsonTree((UrlOneOf1)value.getActualInstance()).getAsJsonObject();
                        elementAdapter.write(out, obj);
                        return;
                    }

                    throw new IOException("Failed to serialize as the type doesn't match oneOf schemas: UrlOneOf, UrlOneOf1");
                }

                @Override
                public Url read(JsonReader in) throws IOException {
                    Object deserialized = null;
                    JsonObject jsonObject = elementAdapter.read(in).getAsJsonObject();

                    int match = 0;
                    ArrayList<String> errorMessages = new ArrayList<>();
                    TypeAdapter actualAdapter = elementAdapter;

                    // deserialize UrlOneOf
                    try {
                        // validate the JSON object to see if any exception is thrown
                        UrlOneOf.validateJsonObject(jsonObject);
                        actualAdapter = adapterUrlOneOf;
                        match++;
                        log.log(Level.FINER, "Input data matches schema 'UrlOneOf'");
                    } catch (Exception e) {
                        // deserialization failed, continue
                        errorMessages.add(String.format("Deserialization for UrlOneOf failed with `%s`.", e.getMessage()));
                        log.log(Level.FINER, "Input data does not match schema 'UrlOneOf'", e);
                    }

                    // deserialize UrlOneOf1
                    try {
                        // validate the JSON object to see if any exception is thrown
                        UrlOneOf1.validateJsonObject(jsonObject);
                        actualAdapter = adapterUrlOneOf1;
                        match++;
                        log.log(Level.FINER, "Input data matches schema 'UrlOneOf1'");
                    } catch (Exception e) {
                        // deserialization failed, continue
                        errorMessages.add(String.format("Deserialization for UrlOneOf1 failed with `%s`.", e.getMessage()));
                        log.log(Level.FINER, "Input data does not match schema 'UrlOneOf1'", e);
                    }

                    if (match == 1) {
                        Url ret = new Url();
                        ret.setActualInstance(actualAdapter.fromJsonTree(jsonObject));
                        return ret;
                    }

                    throw new IOException(String.format("Failed deserialization for Url: %d classes match result, expected 1. Detailed failure message for oneOf schemas: %s. JSON: %s", match, errorMessages, jsonObject.toString()));
                }
            }.nullSafe();
        }
    }

    // store a list of schema names defined in oneOf
    public static final Map<String, GenericType> schemas = new HashMap<String, GenericType>();

    public Url() {
        super("oneOf", Boolean.FALSE);
    }

    public Url(UrlOneOf o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    public Url(UrlOneOf1 o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    static {
        schemas.put("UrlOneOf", new GenericType<UrlOneOf>() {
        });
        schemas.put("UrlOneOf1", new GenericType<UrlOneOf1>() {
        });
    }

    @Override
    public Map<String, GenericType> getSchemas() {
        return Url.schemas;
    }

    /**
     * Set the instance that matches the oneOf child schema, check
     * the instance parameter is valid against the oneOf child schemas:
     * UrlOneOf, UrlOneOf1
     *
     * It could be an instance of the 'oneOf' schemas.
     * The oneOf child schemas may themselves be a composed schema (allOf, anyOf, oneOf).
     */
    @Override
    public void setActualInstance(Object instance) {
        if (instance instanceof UrlOneOf) {
            super.setActualInstance(instance);
            return;
        }

        if (instance instanceof UrlOneOf1) {
            super.setActualInstance(instance);
            return;
        }

        throw new RuntimeException("Invalid instance type. Must be UrlOneOf, UrlOneOf1");
    }

    /**
     * Get the actual instance, which can be the following:
     * UrlOneOf, UrlOneOf1
     *
     * @return The actual instance (UrlOneOf, UrlOneOf1)
     */
    @Override
    public Object getActualInstance() {
        return super.getActualInstance();
    }

    /**
     * Get the actual instance of `UrlOneOf`. If the actual instance is not `UrlOneOf`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `UrlOneOf`
     * @throws ClassCastException if the instance is not `UrlOneOf`
     */
    public UrlOneOf getUrlOneOf() throws ClassCastException {
        return (UrlOneOf)super.getActualInstance();
    }

    /**
     * Get the actual instance of `UrlOneOf1`. If the actual instance is not `UrlOneOf1`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `UrlOneOf1`
     * @throws ClassCastException if the instance is not `UrlOneOf1`
     */
    public UrlOneOf1 getUrlOneOf1() throws ClassCastException {
        return (UrlOneOf1)super.getActualInstance();
    }


 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to Url
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
    // validate oneOf schemas one by one
    int validCount = 0;
    ArrayList<String> errorMessages = new ArrayList<>();
    // validate the json string with UrlOneOf
    try {
      UrlOneOf.validateJsonObject(jsonObj);
      validCount++;
    } catch (Exception e) {
      errorMessages.add(String.format("Deserialization for UrlOneOf failed with `%s`.", e.getMessage()));
      // continue to the next one
    }
    // validate the json string with UrlOneOf1
    try {
      UrlOneOf1.validateJsonObject(jsonObj);
      validCount++;
    } catch (Exception e) {
      errorMessages.add(String.format("Deserialization for UrlOneOf1 failed with `%s`.", e.getMessage()));
      // continue to the next one
    }
    if (validCount != 1) {
      throw new IOException(String.format("The JSON string is invalid for Url with oneOf schemas: UrlOneOf, UrlOneOf1. %d class(es) match the result, expected 1. Detailed failure message for oneOf schemas: %s. JSON: %s", validCount, errorMessages, jsonObj.toString()));
    }
  }

 /**
  * Create an instance of Url given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of Url
  * @throws IOException if the JSON string is invalid with respect to Url
  */
  public static Url fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Url.class);
  }

 /**
  * Convert an instance of Url to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

