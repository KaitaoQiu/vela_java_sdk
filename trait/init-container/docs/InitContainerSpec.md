

# InitContainerSpec


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**appMountPath** | **String** | Specify the mount path of app container |  |
|**args** | **List&lt;String&gt;** | Specify the args run in the init container |  [optional] |
|**cmd** | **List&lt;String&gt;** | Specify the commands run in the init container |  [optional] |
|**env** | [**List&lt;Env&gt;**](Env.md) | Specify the env run in the init container |  [optional] |
|**extraVolumeMounts** | [**List&lt;ExtraVolumeMounts&gt;**](ExtraVolumeMounts.md) | Specify the extra volume mounts for the init container |  |
|**image** | **String** | Specify the image of init container |  |
|**imagePullPolicy** | [**ImagePullPolicyEnum**](#ImagePullPolicyEnum) | Specify image pull policy for your service |  |
|**initMountPath** | **String** | Specify the mount path of init container |  |
|**mountName** | **String** | Specify the mount name of shared volume |  |
|**name** | **String** | Specify the name of init container |  |



## Enum: ImagePullPolicyEnum

| Name | Value |
|---- | -----|
| IFNOTPRESENT | &quot;IfNotPresent&quot; |
| ALWAYS | &quot;Always&quot; |
| NEVER | &quot;Never&quot; |



