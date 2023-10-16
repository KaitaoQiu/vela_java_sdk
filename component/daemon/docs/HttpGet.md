

# HttpGet

Instructions for assessing container health by executing an HTTP GET request. Either this attribute or the exec attribute or the tcpSocket attribute MUST be specified. This attribute is mutually exclusive with both the exec attribute and the tcpSocket attribute.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**host** | **String** |  |  [optional] |
|**httpHeaders** | [**List&lt;HttpHeaders&gt;**](HttpHeaders.md) |  |  [optional] |
|**path** | **String** | The endpoint, relative to the port, to which the HTTP GET request should be directed. |  |
|**port** | **Integer** | The TCP socket within the container to which the HTTP GET request should be directed. |  |
|**scheme** | **String** |  |  [optional] |



