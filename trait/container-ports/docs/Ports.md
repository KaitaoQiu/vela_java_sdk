

# Ports


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**containerPort** | **Integer** | Number of port to expose on the pod&#39;s IP address |  |
|**hostIP** | **String** | What host IP to bind the external port to. |  [optional] |
|**hostPort** | **Integer** | Number of port to expose on the host |  [optional] |
|**protocol** | [**ProtocolEnum**](#ProtocolEnum) | Protocol for port. Must be UDP, TCP, or SCTP |  |



## Enum: ProtocolEnum

| Name | Value |
|---- | -----|
| TCP | &quot;TCP&quot; |
| UDP | &quot;UDP&quot; |
| SCTP | &quot;SCTP&quot; |



