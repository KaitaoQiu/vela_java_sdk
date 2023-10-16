

# HttpGet

Instructions for assessing container startup status by executing an HTTP GET request. Either this attribute or the exec attribute or the grpc attribute or the tcpSocket attribute MUST be specified. This attribute is mutually exclusive with the exec attribute and the tcpSocket attribute and the gRPC attribute.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**host** | **String** | The hostname to connect to, defaults to the pod IP. You probably want to set \&quot;Host\&quot; in httpHeaders instead. |  [optional] |
|**httpHeaders** | [**List&lt;HttpHeaders&gt;**](HttpHeaders.md) | Custom headers to set in the request. HTTP allows repeated headers. |  [optional] |
|**path** | **String** | The endpoint, relative to the port, to which the HTTP GET request should be directed. |  [optional] |
|**port** | **Integer** | The port numer to access on the host or container. |  |
|**scheme** | [**SchemeEnum**](#SchemeEnum) | The Scheme to use for connecting to the host. |  [optional] |



## Enum: SchemeEnum

| Name | Value |
|---- | -----|
| HTTP | &quot;HTTP&quot; |
| HTTPS | &quot;HTTPS&quot; |



