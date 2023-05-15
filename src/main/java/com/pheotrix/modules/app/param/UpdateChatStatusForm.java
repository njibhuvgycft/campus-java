package com.pheotrix.modules.app.param;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
@ApiModel(value = "更新私聊消息状态请求体")
public class UpdateChatStatusForm {

    @ApiModelProperty(value = "用户id")
    private Integer uid;

}
