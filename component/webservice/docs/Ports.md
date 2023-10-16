

# Ports


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**expose** | **Boolean** | Specify if the port should be exposed |  |
|**name** | **String** | Name of the port |  [optional] |
|**nodePort** | **Integer** | exposed node port. Only Valid when exposeType is NodePort |  [optional] |
|**port** | **Integer** | Number of port to expose on the pod&#39;s IP address |  |
|**protocol** | [**ProtocolEnum**](#ProtocolEnum) | Protocol for port. Must be UDP, TCP, or SCTP |  |



## Enum: ProtocolEnum

| Name | Value |
|---- | -----|
| TCP | &quot;TCP&quot; |
| UDP | &quot;UDP&quot; |
| SCTP | &quot;SCTP&quot; |



