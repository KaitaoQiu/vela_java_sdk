

# BuildPushImageSpec


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**buildArgs** | **List&lt;String&gt;** | Specify the build args |  [optional] |
|**context** | [**Context**](Context.md) |  |  |
|**credentials** | [**Credentials**](Credentials.md) |  |  [optional] |
|**dockerfile** | **String** | Specify the dockerfile |  |
|**image** | **String** | Specify the image |  |
|**kanikoExecutor** | **String** | Specify the kaniko executor image, default to oamdev/kaniko-executor:v1.9.1 |  |
|**platform** | **String** | Specify the platform to build |  [optional] |
|**verbosity** | [**VerbosityEnum**](#VerbosityEnum) | Specify the verbosity level |  |



## Enum: VerbosityEnum

| Name | Value |
|---- | -----|
| INFO | &quot;info&quot; |
| PANIC | &quot;panic&quot; |
| FATAL | &quot;fatal&quot; |
| ERROR | &quot;error&quot; |
| WARN | &quot;warn&quot; |
| DEBUG | &quot;debug&quot; |
| TRACE | &quot;trace&quot; |



