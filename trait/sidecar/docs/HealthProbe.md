

# HealthProbe


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**exec** | [**Exec**](Exec.md) |  |  [optional] |
|**failureThreshold** | **Integer** | Number of consecutive failures required to determine the container is not alive (liveness probe) or not ready (readiness probe). |  |
|**httpGet** | [**HttpGet**](HttpGet.md) |  |  [optional] |
|**initialDelaySeconds** | **Integer** | Number of seconds after the container is started before the first probe is initiated. |  |
|**periodSeconds** | **Integer** | How often, in seconds, to execute the probe. |  |
|**successThreshold** | **Integer** | Minimum consecutive successes for the probe to be considered successful after having failed. |  |
|**tcpSocket** | [**TcpSocket**](TcpSocket.md) |  |  [optional] |
|**timeoutSeconds** | **Integer** | Number of seconds after which the probe times out. |  |



