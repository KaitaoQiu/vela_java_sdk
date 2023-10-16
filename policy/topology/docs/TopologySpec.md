

# TopologySpec


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**allowEmpty** | **Boolean** | Ignore empty cluster error |  [optional] |
|**clusterLabelSelector** | **Map&lt;String, String&gt;** | Specify the label selector for clusters |  [optional] |
|**clusterSelector** | **Map&lt;String, String&gt;** | Deprecated: Use clusterLabelSelector instead. |  [optional] |
|**clusters** | **List&lt;String&gt;** | Specify the names of the clusters to select. |  [optional] |
|**namespace** | **String** | Specify the target namespace to deploy in the selected clusters, default inherit the original namespace. |  [optional] |



