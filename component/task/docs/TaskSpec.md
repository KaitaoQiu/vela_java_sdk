

# TaskSpec


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**annotations** | **Map&lt;String, String&gt;** | Specify the annotations in the workload |  [optional] |
|**cmd** | **List&lt;String&gt;** | Commands to run in the container |  [optional] |
|**count** | **Integer** | Specify number of tasks to run in parallel +short&#x3D;c |  |
|**cpu** | **String** | Number of CPU units for the service, like &#x60;0.5&#x60; (0.5 CPU core), &#x60;1&#x60; (1 CPU core) |  [optional] |
|**env** | [**List&lt;Env&gt;**](Env.md) | Define arguments by using environment variables |  [optional] |
|**image** | **String** | Which image would you like to use for your service +short&#x3D;i |  |
|**imagePullPolicy** | [**ImagePullPolicyEnum**](#ImagePullPolicyEnum) | Specify image pull policy for your service |  [optional] |
|**imagePullSecrets** | **List&lt;String&gt;** | Specify image pull secrets for your service |  [optional] |
|**labels** | **Map&lt;String, String&gt;** | Specify the labels in the workload |  [optional] |
|**livenessProbe** | [**HealthProbe**](HealthProbe.md) |  |  [optional] |
|**memory** | **String** | Specifies the attributes of the memory resource required for the container. |  [optional] |
|**readinessProbe** | [**HealthProbe**](HealthProbe.md) |  |  [optional] |
|**restart** | **String** | Define the job restart policy, the value can only be Never or OnFailure. By default, it&#39;s Never. |  |
|**volumes** | [**List&lt;Volumes&gt;**](Volumes.md) | Declare volumes and volumeMounts |  [optional] |



## Enum: ImagePullPolicyEnum

| Name | Value |
|---- | -----|
| ALWAYS | &quot;Always&quot; |
| NEVER | &quot;Never&quot; |
| IFNOTPRESENT | &quot;IfNotPresent&quot; |



