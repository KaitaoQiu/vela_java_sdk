

# GatewaySpec


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**propertyClass** | **String** | Specify the class of ingress to use |  |
|**classInSpec** | **Boolean** | Set ingress class in &#39;.spec.ingressClassName&#39; instead of &#39;kubernetes.io/ingress.class&#39; annotation. |  |
|**domain** | **String** | Specify the domain you want to expose |  [optional] |
|**gatewayHost** | **String** | Specify the host of the ingress gateway, which is used to generate the endpoints when the host is empty. |  [optional] |
|**http** | **Map&lt;String, Integer&gt;** | Specify the mapping relationship between the http path and the workload port |  |
|**name** | **String** | Specify a unique name for this gateway, required to support multiple gateway traits on a component |  [optional] |
|**pathType** | [**PathTypeEnum**](#PathTypeEnum) | Specify a pathType for the ingress rules, defaults to \&quot;ImplementationSpecific\&quot; |  |
|**secretName** | **String** | Specify the secret name you want to quote to use tls. |  [optional] |



## Enum: PathTypeEnum

| Name | Value |
|---- | -----|
| IMPLEMENTATIONSPECIFIC | &quot;ImplementationSpecific&quot; |
| PREFIX | &quot;Prefix&quot; |
| EXACT | &quot;Exact&quot; |



