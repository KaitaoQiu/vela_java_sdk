

# Privileges


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**apiGroups** | **List&lt;String&gt;** | Specify the apiGroups of the resource |  [optional] |
|**nonResourceURLs** | **List&lt;String&gt;** | Specify the resource url to be allowed |  [optional] |
|**resourceNames** | **List&lt;String&gt;** | Specify the resourceNames to be allowed |  [optional] |
|**resources** | **List&lt;String&gt;** | Specify the resources to be allowed |  [optional] |
|**scope** | [**ScopeEnum**](#ScopeEnum) | Specify the scope of the privileges, default to be namespace scope |  |
|**verbs** | **List&lt;String&gt;** | Specify the verbs to be allowed for the resource |  |



## Enum: ScopeEnum

| Name | Value |
|---- | -----|
| NAMESPACE | &quot;namespace&quot; |
| CLUSTER | &quot;cluster&quot; |



