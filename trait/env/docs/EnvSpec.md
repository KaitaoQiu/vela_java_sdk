

# EnvSpec


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**containerName** | **String** | Specify the name of the target container, if not set, use the component name |  |
|**env** | **Map&lt;String, String&gt;** | Specify the  environment variables to merge, if key already existing, override its value |  |
|**replace** | **Boolean** | Specify if replacing the whole environment settings for the container |  |
|**unset** | **List&lt;String&gt;** | Specify which existing environment variables to unset |  |
|**containers** | [**List&lt;PatchParams&gt;**](PatchParams.md) | Specify the environment variables for multiple containers |  |



