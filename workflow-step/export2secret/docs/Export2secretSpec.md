

# Export2secretSpec


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**cluster** | **String** | Specify the cluster of the secret |  |
|**data** | **Object** | Specify the data of secret |  |
|**dockerRegistry** | [**DockerRegistry**](DockerRegistry.md) |  |  [optional] |
|**kind** | [**KindEnum**](#KindEnum) | Specify the kind of the secret |  |
|**namespace** | **String** | Specify the namespace of the secret |  [optional] |
|**secretName** | **String** | Specify the name of the secret |  |
|**type** | **String** | Specify the type of the secret |  [optional] |



## Enum: KindEnum

| Name | Value |
|---- | -----|
| GENERIC | &quot;generic&quot; |
| DOCKER_REGISTRY | &quot;docker-registry&quot; |



