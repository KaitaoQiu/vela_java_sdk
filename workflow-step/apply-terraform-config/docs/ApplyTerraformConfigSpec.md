

# ApplyTerraformConfigSpec


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**deleteResource** | **Boolean** | whether to delete resource |  |
|**forceDelete** | **Boolean** | forceDelete will force delete Configuration no matter which state it is or whether it has provisioned some resources |  |
|**jobEnv** | **Object** | the envs for job |  [optional] |
|**providerRef** | [**ProviderRef**](ProviderRef.md) |  |  [optional] |
|**region** | **String** | region is cloud provider&#39;s region. It will override the region in the region field of providerRef |  [optional] |
|**source** | [**Source**](Source.md) |  |  |
|**variable** | **Object** | the variable in the configuration |  |
|**writeConnectionSecretToRef** | [**WriteConnectionSecretToRef**](WriteConnectionSecretToRef.md) |  |  [optional] |



