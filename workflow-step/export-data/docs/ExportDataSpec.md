

# ExportDataSpec


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**data** | **Object** | Specify the data to export |  |
|**kind** | [**KindEnum**](#KindEnum) | Specify the kind of the export destination |  |
|**name** | **String** | Specify the name of the export destination |  [optional] |
|**namespace** | **String** | Specify the namespace of the export destination |  [optional] |
|**topology** | **String** | Specify the topology to export |  [optional] |



## Enum: KindEnum

| Name | Value |
|---- | -----|
| CONFIGMAP | &quot;ConfigMap&quot; |
| SECRET | &quot;Secret&quot; |



