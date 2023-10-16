

# TcpSocket

Instructions for assessing container startup status by probing a TCP socket. Either this attribute or the exec attribute or the tcpSocket attribute or the httpGet attribute MUST be specified. This attribute is mutually exclusive with the exec attribute and the httpGet attribute and the gRPC attribute.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**host** | **String** | Host name to connect to, defaults to the pod IP. |  [optional] |
|**port** | **String** | Number or name of the port to access on the container. |  |



