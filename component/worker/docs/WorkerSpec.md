

# WorkerSpec


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**cmd** | **List&lt;String&gt;** | Commands to run in the container |  [optional] |
|**cpu** | **String** | Number of CPU units for the service, like &#x60;0.5&#x60; (0.5 CPU core), &#x60;1&#x60; (1 CPU core) |  [optional] |
|**env** | [**List&lt;Env&gt;**](Env.md) | Define arguments by using environment variables |  [optional] |
|**image** | **String** | Which image would you like to use for your service +short&#x3D;i |  |
|**imagePullPolicy** | **String** | Specify image pull policy for your service |  [optional] |
|**imagePullSecrets** | **List&lt;String&gt;** | Specify image pull secrets for your service |  [optional] |
|**livenessProbe** | [**HealthProbe**](HealthProbe.md) |  |  [optional] |
|**memory** | **String** | Specifies the attributes of the memory resource required for the container. |  [optional] |
|**readinessProbe** | [**HealthProbe**](HealthProbe.md) |  |  [optional] |
|**volumeMounts** | [**VolumeMounts**](VolumeMounts.md) |  |  [optional] |
|**volumes** | [**List&lt;Volumes&gt;**](Volumes.md) | Deprecated field, use volumeMounts instead. |  [optional] |



