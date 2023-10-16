

# SidecarSpec


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**args** | **List&lt;String&gt;** | Specify the args in the sidecar |  [optional] |
|**cmd** | **List&lt;String&gt;** | Specify the commands run in the sidecar |  [optional] |
|**env** | [**List&lt;Env&gt;**](Env.md) | Specify the env in the sidecar |  [optional] |
|**image** | **String** | Specify the image of sidecar container |  |
|**livenessProbe** | [**HealthProbe**](HealthProbe.md) |  |  [optional] |
|**name** | **String** | Specify the name of sidecar container |  |
|**readinessProbe** | [**HealthProbe**](HealthProbe.md) |  |  [optional] |
|**volumes** | [**List&lt;Volumes&gt;**](Volumes.md) | Specify the shared volume path |  [optional] |



