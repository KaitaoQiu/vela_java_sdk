

# Grpc

Instructions for assessing container startup status by probing a gRPC service. Either this attribute or the exec attribute or the grpc attribute or the httpGet attribute MUST be specified. This attribute is mutually exclusive with the exec attribute and the httpGet attribute and the tcpSocket attribute.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**port** | **Integer** | The port number of the gRPC service. |  |
|**service** | **String** | The name of the service to place in the gRPC HealthCheckRequest |  [optional] |



