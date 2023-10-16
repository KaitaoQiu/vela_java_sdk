

# PatchParams


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**containerName** | **String** | Specify the name of the target container, if not set, use the component name |  |
|**image** | **String** | Specify the image of the container |  |
|**imagePullPolicy** | [**ImagePullPolicyEnum**](#ImagePullPolicyEnum) | Specify the image pull policy of the container |  |



## Enum: ImagePullPolicyEnum

| Name | Value |
|---- | -----|
| EMPTY | &quot;&quot; |
| IFNOTPRESENT | &quot;IfNotPresent&quot; |
| ALWAYS | &quot;Always&quot; |
| NEVER | &quot;Never&quot; |



