

# MetricsSpec


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**enabled** | **Boolean** |  |  |
|**format** | **String** | Format of the metrics, default as prometheus +short&#x3D;f |  |
|**path** | **String** | The metrics path of the service |  |
|**port** | [**Port**](Port.md) |  |  |
|**scheme** | **String** | The way to retrieve data which can take the values &#x60;http&#x60; or &#x60;https&#x60; |  |
|**selector** | **Map&lt;String, String&gt;** | The label selector for the pods, will discovery automatically by default |  [optional] |



