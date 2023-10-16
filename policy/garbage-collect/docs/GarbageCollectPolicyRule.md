

# GarbageCollectPolicyRule


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**propagation** | [**PropagationEnum**](#PropagationEnum) | Specify the deletion propagation strategy for target resource to delete |  [optional] |
|**selector** | [**ResourcePolicyRuleSelector**](ResourcePolicyRuleSelector.md) |  |  |
|**strategy** | [**StrategyEnum**](#StrategyEnum) | Specify the strategy for target resource to recycle |  |



## Enum: PropagationEnum

| Name | Value |
|---- | -----|
| ORPHAN | &quot;orphan&quot; |
| CASCADING | &quot;cascading&quot; |



## Enum: StrategyEnum

| Name | Value |
|---- | -----|
| ONAPPUPDATE | &quot;onAppUpdate&quot; |
| ONAPPDELETE | &quot;onAppDelete&quot; |
| NEVER | &quot;never&quot; |



