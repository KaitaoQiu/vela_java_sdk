

# Tolerations


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**effect** | [**EffectEnum**](#EffectEnum) |  |  [optional] |
|**key** | **String** |  |  [optional] |
|**operator** | [**OperatorEnum**](#OperatorEnum) |  |  |
|**tolerationSeconds** | **Integer** | Specify the period of time the toleration |  [optional] |
|**value** | **String** |  |  [optional] |



## Enum: EffectEnum

| Name | Value |
|---- | -----|
| NOSCHEDULE | &quot;NoSchedule&quot; |
| PREFERNOSCHEDULE | &quot;PreferNoSchedule&quot; |
| NOEXECUTE | &quot;NoExecute&quot; |



## Enum: OperatorEnum

| Name | Value |
|---- | -----|
| EQUAL | &quot;Equal&quot; |
| EXISTS | &quot;Exists&quot; |



