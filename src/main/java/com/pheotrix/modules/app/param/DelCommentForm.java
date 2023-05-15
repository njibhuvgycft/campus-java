package com.pheotrix.modules.app.param;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
@ApiModel(value = "用户删除自己评论")
public class DelCommentForm {

    @ApiModelProperty(value = "用户评论id")
    private Integer id;

}
