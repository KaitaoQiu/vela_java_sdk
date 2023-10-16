

# Volumes


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**medium** | [**MediumEnum**](#MediumEnum) |  |  |
|**mountPath** | **String** |  |  |
|**name** | **String** |  |  |
|**type** | [**TypeEnum**](#TypeEnum) | Specify volume type, options: \&quot;pvc\&quot;,\&quot;configMap\&quot;,\&quot;secret\&quot;,\&quot;emptyDir\&quot;, default to emptyDir |  |



## Enum: MediumEnum

| Name | Value |
|---- | -----|
| EMPTY | &quot;&quot; |
| MEMORY | &quot;Memory&quot; |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| EMPTYDIR | &quot;emptyDir&quot; |
| PVC | &quot;pvc&quot; |
| CONFIGMAP | &quot;configMap&quot; |
| SECRET | &quot;secret&quot; |



