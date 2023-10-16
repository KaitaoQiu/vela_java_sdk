

# K8sUpdateStrategySpec


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**strategy** | [**Strategy**](Strategy.md) |  |  |
|**targetAPIVersion** | **String** | Specify the apiVersion of target |  |
|**targetKind** | [**TargetKindEnum**](#TargetKindEnum) | Specify the kind of target |  |



## Enum: TargetKindEnum

| Name | Value |
|---- | -----|
| DEPLOYMENT | &quot;Deployment&quot; |
| STATEFULSET | &quot;StatefulSet&quot; |
| DAEMONSET | &quot;DaemonSet&quot; |



