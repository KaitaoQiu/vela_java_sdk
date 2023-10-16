import dev.oam.core.models.*;
import io.kubernetes.client.util.generic.GenericKubernetesApi;
import sdk.kubevela.service_account.model.ServiceAccountSpec;
import sdk.kubevela.service_account.model.AbstractOpenApiSchema;
import sdk.kubevela.service_account.model.Privileges;

import sdk.kubevela.worker.model.WorkerSpec;
import io.kubernetes.client.openapi.ApiClient;
import io.kubernetes.client.openapi.ApiException;
import io.kubernetes.client.openapi.apis.CustomObjectsApi;
import io.kubernetes.client.openapi.models.V1ObjectMeta;
import dev.oam.core.models.V1beta1TraitDefinition;
import dev.oam.core.models.V1beta1ComponentDefinition;
import io.kubernetes.client.util.Config;

import java.io.IOException;
import java.util.Collections;
import io.kubernetes.client.openapi.apis.CustomObjectsApi;


class workerComponent extends V1beta1ComponentDefinition {
    private WorkerSpec workerSpec;

    public WorkerSpec getWorkerSpec() {
        return workerSpec;
    }

    public void setWorkerSpec(WorkerSpec workerSpec) {
        this.workerSpec = workerSpec;
    }

    public String toJson() {
        return workerSpec.toJson();
    }
}

public class sample {
    public static void main(String[] args) throws ApiException, IOException {
        WorkerSpec workerSpec = new WorkerSpec().image("nginx:latest");

        workerComponent simpleComponent = new workerComponent();
        simpleComponent.setWorkerSpec(workerSpec);

        V1beta1ApplicationSpecComponents componentDefinition = new V1beta1ApplicationSpecComponents();
        componentDefinition.setProperties(workerSpec);

        V1beta1Application application = new V1beta1Application()
                .apiVersion("core.oam.dev/v1beta1")
                .kind("Application")
                .metadata(new V1ObjectMeta().name("my-application"))
                .spec(new V1beta1ApplicationSpec()
                        .addComponentsItem(componentDefinition)  // Add WorkerComponent
                );
        System.out.println("Application: " + application);
        ApiClient client = Config.defaultClient();
        CustomObjectsApi customObjectsApi = new CustomObjectsApi(client);
        try {
            customObjectsApi.createNamespacedCustomObject(
                    "core.oam.dev",
                    "v1beta1",
                    "sample_namespace",
                    "applications",
                    application,
                    "pretty",
                    "true",
                    null
            );
        } catch (ApiException e) {
            throw new RuntimeException(e);
        }
    }
}