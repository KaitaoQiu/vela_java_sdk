

# K8sObject


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**cluster** | **String** | If specified, fetch the Kubernetes objects from the cluster. Otherwise, fetch from the local cluster. |  [optional] |
|**group** | **String** | The group name for the Kubernetes objects |  [optional] |
|**labelSelector** | **Map&lt;String, String&gt;** | If specified, fetch the Kubernetes objects according to the label selector, exclusive to name |  [optional] |
|**name** | **String** | If specified, fetch the Kubernetes objects with the name, exclusive to labelSelector |  [optional] |
|**namespace** | **String** | If specified, fetch the Kubernetes objects from the namespace. Otherwise, fetch from the application&#39;s namespace. |  [optional] |
|**resource** | **String** | The resource type for the Kubernetes objects |  [optional] |



