

# StartupProbeSpec


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**containerName** | **String** | Specify the name of the target container, if not set, use the component name |  |
|**exec** | [**Exec**](Exec.md) |  |  [optional] |
|**failureThreshold** | **Integer** | Minimum consecutive failures for the probe to be considered failed after having succeeded. Minimum value is 1. |  |
|**grpc** | [**Grpc**](Grpc.md) |  |  [optional] |
|**httpGet** | [**HttpGet**](HttpGet.md) |  |  [optional] |
|**initialDelaySeconds** | **Integer** | Number of seconds after the container has started before liveness probes are initiated. Minimum value is 0. |  |
|**periodSeconds** | **Integer** | How often, in seconds, to execute the probe. Minimum value is 1. |  |
|**successThreshold** | **Integer** | Minimum consecutive successes for the probe to be considered successful after having failed.  Minimum value is 1. |  |
|**tcpSocket** | [**TcpSocket**](TcpSocket.md) |  |  [optional] |
|**terminationGracePeriodSeconds** | **Integer** | Optional duration in seconds the pod needs to terminate gracefully upon probe failure. Set this value longer than the expected cleanup time for your process. |  [optional] |
|**timeoutSeconds** | **Integer** | Number of seconds after which the probe times out. Minimum value is 1. |  |
|**probes** | [**List&lt;StartupProbeParams&gt;**](StartupProbeParams.md) | Specify the startup probe for multiple containers |  |



