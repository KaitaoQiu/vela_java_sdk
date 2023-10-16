

# DeploySpec


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**auto** | **Boolean** | If set to false, the workflow will suspend automatically before this step, default to be true. |  |
|**ignoreTerraformComponent** | **Boolean** | If set false, this step will apply the components with the terraform workload. |  |
|**parallelism** | **Integer** | Maximum number of concurrent delivered components. |  |
|**policies** | **List&lt;String&gt;** | Declare the policies that used for this deployment. If not specified, the components will be deployed to the hub cluster. |  |



