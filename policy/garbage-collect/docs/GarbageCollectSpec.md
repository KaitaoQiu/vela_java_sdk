

# GarbageCollectSpec


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**applicationRevisionLimit** | **Integer** | If set, it will override the default revision limit number and customize this number for the current application |  [optional] |
|**continueOnFailure** | **Boolean** | If is set, continue to execute gc when the workflow fails, by default gc will be executed only after the workflow succeeds |  |
|**keepLegacyResource** | **Boolean** | If is set, outdated versioned resourcetracker will not be recycled automatically, outdated resources will be kept until resourcetracker be deleted manually |  |
|**rules** | [**List&lt;GarbageCollectPolicyRule&gt;**](GarbageCollectPolicyRule.md) | Specify the list of rules to control gc strategy at resource level, if one resource is controlled by multiple rules, first rule will be used |  [optional] |



