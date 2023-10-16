

# CronTaskSpec


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**activeDeadlineSeconds** | **Integer** | The duration in seconds relative to the startTime that the job may be continuously active before the system tries to terminate it |  [optional] |
|**annotations** | **Map&lt;String, String&gt;** | Specify the annotations in the workload |  [optional] |
|**backoffLimit** | **Integer** | The number of retries before marking this job failed |  |
|**cmd** | **List&lt;String&gt;** | Commands to run in the container |  [optional] |
|**concurrencyPolicy** | [**ConcurrencyPolicyEnum**](#ConcurrencyPolicyEnum) | Specifies how to treat concurrent executions of a Job |  |
|**count** | **Integer** | Specify number of tasks to run in parallel +short&#x3D;c |  |
|**cpu** | **String** | Number of CPU units for the service, like &#x60;0.5&#x60; (0.5 CPU core), &#x60;1&#x60; (1 CPU core) |  [optional] |
|**env** | [**List&lt;Env&gt;**](Env.md) | Define arguments by using environment variables |  [optional] |
|**failedJobsHistoryLimit** | **Integer** | The number of failed finished jobs to retain |  |
|**hostAliases** | [**List&lt;HostAliases&gt;**](HostAliases.md) | An optional list of hosts and IPs that will be injected into the pod&#39;s hosts file |  [optional] |
|**image** | **String** | Which image would you like to use for your service +short&#x3D;i |  |
|**imagePullPolicy** | [**ImagePullPolicyEnum**](#ImagePullPolicyEnum) | Specify image pull policy for your service |  [optional] |
|**imagePullSecrets** | **List&lt;String&gt;** | Specify image pull secrets for your service |  [optional] |
|**labels** | **Map&lt;String, String&gt;** | Specify the labels in the workload |  [optional] |
|**livenessProbe** | [**HealthProbe**](HealthProbe.md) |  |  [optional] |
|**memory** | **String** | Specifies the attributes of the memory resource required for the container. |  [optional] |
|**readinessProbe** | [**HealthProbe**](HealthProbe.md) |  |  [optional] |
|**restart** | **String** | Define the job restart policy, the value can only be Never or OnFailure. By default, it&#39;s Never. |  |
|**schedule** | **String** | Specify the schedule in Cron format, see https://en.wikipedia.org/wiki/Cron |  |
|**startingDeadlineSeconds** | **Integer** | Specify deadline in seconds for starting the job if it misses scheduled |  [optional] |
|**successfulJobsHistoryLimit** | **Integer** | The number of successful finished jobs to retain |  |
|**suspend** | **Boolean** | suspend subsequent executions |  |
|**ttlSecondsAfterFinished** | **Integer** | Limits the lifetime of a Job that has finished |  [optional] |
|**volumes** | [**List&lt;Volumes&gt;**](Volumes.md) | Declare volumes and volumeMounts |  [optional] |



## Enum: ConcurrencyPolicyEnum

| Name | Value |
|---- | -----|
| ALLOW | &quot;Allow&quot; |
| FORBID | &quot;Forbid&quot; |
| REPLACE | &quot;Replace&quot; |



## Enum: ImagePullPolicyEnum

| Name | Value |
|---- | -----|
| ALWAYS | &quot;Always&quot; |
| NEVER | &quot;Never&quot; |
| IFNOTPRESENT | &quot;IfNotPresent&quot; |



