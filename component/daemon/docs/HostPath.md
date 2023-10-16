

# HostPath


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**mountPath** | **String** |  |  |
|**mountPropagation** | [**MountPropagationEnum**](#MountPropagationEnum) |  |  [optional] |
|**name** | **String** |  |  |
|**path** | **String** |  |  |
|**readOnly** | **Boolean** |  |  [optional] |



## Enum: MountPropagationEnum

| Name | Value |
|---- | -----|
| NONE | &quot;None&quot; |
| HOSTTOCONTAINER | &quot;HostToContainer&quot; |
| BIDIRECTIONAL | &quot;Bidirectional&quot; |



