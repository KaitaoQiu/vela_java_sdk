

# WebserviceSpec


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**addRevisionLabel** | **Boolean** |  |  |
|**annotations** | **Map&lt;String, String&gt;** | Specify the annotations in the workload |  [optional] |
|**args** | **List&lt;String&gt;** | Arguments to the entrypoint |  [optional] |
|**cmd** | **List&lt;String&gt;** | Commands to run in the container |  [optional] |
|**cpu** | **String** | Number of CPU units for the service, like &#x60;0.5&#x60; (0.5 CPU core), &#x60;1&#x60; (1 CPU core) |  [optional] |
|**env** | [**List&lt;Env&gt;**](Env.md) | Define arguments by using environment variables |  [optional] |
|**exposeType** | [**ExposeTypeEnum**](#ExposeTypeEnum) |  |  |
|**hostAliases** | [**List&lt;HostAliases&gt;**](HostAliases.md) | Specify the hostAliases to add |  [optional] |
|**image** | **String** | Which image would you like to use for your service +short&#x3D;i |  |
|**imagePullPolicy** | [**ImagePullPolicyEnum**](#ImagePullPolicyEnum) | Specify image pull policy for your service |  [optional] |
|**imagePullSecrets** | **List&lt;String&gt;** | Specify image pull secrets for your service |  [optional] |
|**labels** | **Map&lt;String, String&gt;** | Specify the labels in the workload |  [optional] |
|**livenessProbe** | [**HealthProbe**](HealthProbe.md) |  |  [optional] |
|**memory** | **String** | Specifies the attributes of the memory resource required for the container. |  [optional] |
|**port** | **Integer** |  |  [optional] |
|**ports** | [**List&lt;Ports&gt;**](Ports.md) | Which ports do you want customer traffic sent to, defaults to 80 |  [optional] |
|**readinessProbe** | [**HealthProbe**](HealthProbe.md) |  |  [optional] |
|**volumeMounts** | [**VolumeMounts**](VolumeMounts.md) |  |  [optional] |
|**volumes** | [**List&lt;Volumes&gt;**](Volumes.md) | Deprecated field, use volumeMounts instead. |  [optional] |



## Enum: ExposeTypeEnum

| Name | Value |
|---- | -----|
| CLUSTERIP | &quot;ClusterIP&quot; |
| NODEPORT | &quot;NodePort&quot; |
| LOADBALANCER | &quot;LoadBalancer&quot; |



## Enum: ImagePullPolicyEnum

| Name | Value |
|---- | -----|
| ALWAYS | &quot;Always&quot; |
| NEVER | &quot;Never&quot; |
| IFNOTPRESENT | &quot;IfNotPresent&quot; |



