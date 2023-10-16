

# Constraints


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**labelSelector** | [**LabSelector**](LabSelector.md) |  |  |
|**matchLabelKeys** | **List&lt;String&gt;** | A list of pod label keys to select the pods over which spreading will be calculated |  [optional] |
|**maxSkew** | **Integer** | Describe the degree to which Pods may be unevenly distributed |  |
|**minDomains** | **Integer** | Indicate a minimum number of eligible domains |  [optional] |
|**nodeAffinityPolicy** | [**NodeAffinityPolicyEnum**](#NodeAffinityPolicyEnum) | Indicate how we will treat Pod&#39;s nodeAffinity/nodeSelector when calculating pod topology spread skew |  [optional] |
|**nodeTaintsPolicy** | [**NodeTaintsPolicyEnum**](#NodeTaintsPolicyEnum) | Indicate how we will treat node taints when calculating pod topology spread skew |  [optional] |
|**topologyKey** | **String** | Specify the key of node labels |  |
|**whenUnsatisfiable** | [**WhenUnsatisfiableEnum**](#WhenUnsatisfiableEnum) | Indicate how to deal with a Pod if it doesn&#39;t satisfy the spread constraint |  |



## Enum: NodeAffinityPolicyEnum

| Name | Value |
|---- | -----|
| HONOR | &quot;Honor&quot; |
| IGNORE | &quot;Ignore&quot; |



## Enum: NodeTaintsPolicyEnum

| Name | Value |
|---- | -----|
| HONOR | &quot;Honor&quot; |
| IGNORE | &quot;Ignore&quot; |



## Enum: WhenUnsatisfiableEnum

| Name | Value |
|---- | -----|
| DONOTSCHEDULE | &quot;DoNotSchedule&quot; |
| SCHEDULEANYWAY | &quot;ScheduleAnyway&quot; |



