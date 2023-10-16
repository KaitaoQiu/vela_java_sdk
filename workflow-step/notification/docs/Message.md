

# Message

Specify the message that you want to sent, refer to [dingtalk messaging](https://developers.dingtalk.com/document/robots/custom-robot-access/title-72m-8ag-pqw)

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**actionCard** | [**ActionCard**](ActionCard.md) |  |  [optional] |
|**at** | [**At**](At.md) |  |  [optional] |
|**feedCard** | [**FeedCard**](FeedCard.md) |  |  [optional] |
|**link** | [**Link**](Link.md) |  |  [optional] |
|**markdown** | [**Markdown**](Markdown.md) |  |  [optional] |
|**msgtype** | [**MsgtypeEnum**](#MsgtypeEnum) | msgType can be text, link, mardown, actionCard, feedCard |  |
|**text** | [**Text**](Text.md) |  |  [optional] |



## Enum: MsgtypeEnum

| Name | Value |
|---- | -----|
| TEXT | &quot;text&quot; |
| LINK | &quot;link&quot; |
| MARKDOWN | &quot;markdown&quot; |
| ACTIONCARD | &quot;actionCard&quot; |
| FEEDCARD | &quot;feedCard&quot; |



