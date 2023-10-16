

# Exec

Instructions for assessing container health by executing a command. Either this attribute or the httpGet attribute or the tcpSocket attribute MUST be specified. This attribute is mutually exclusive with both the httpGet attribute and the tcpSocket attribute.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**command** | **List&lt;String&gt;** | A command to be executed inside the container to assess its health. Each space delimited token of the command is a separate array element. Commands exiting 0 are considered to be successful probes, whilst all other exit codes are considered failures. |  |



