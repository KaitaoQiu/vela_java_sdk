

# CheckMetricsSpec


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**condition** | **String** | Condition is an expression which determines if a measurement is considered successful. eg: &gt;&#x3D;0.95 |  |
|**duration** | **String** | Duration defines the duration of time required for this step to be considered successful. |  [optional] |
|**failDuration** | **String** | FailDuration is the duration of time that, if the check fails, will result in the step being marked as failed. |  [optional] |
|**metricEndpoint** | [**MetricEndpoint**](MetricEndpoint.md) |  |  [optional] |
|**query** | **String** | Query is a raw prometheus query to perform |  |



