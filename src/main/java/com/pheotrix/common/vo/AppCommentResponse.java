package com.pheotrix.common.vo;

import com.baomidou.mybatisplus.annotation.TableId;
import com.pheotrix.modules.admin.entity.AppUserEntity;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

/**
 * 
 * 
 * @author pheotrix
 * @email 3582996245@qq.com
 * @date 2022-01-25 18:51:22
 */
@Data
public class AppCommentResponse implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * id
	 */
	@TableId
	private Long id;
	/**
	 * 父级id
	 */
	private Integer pid;
	/**
	 * 评论类型:1帖子
	 */
	private Integer type;
	/**
	 * 评论作者ID
	 */
	private Long uid;
	/**
	 * 被回复用户ID
	 */
	private Integer toUid;
	/**
	 * 评论帖子ID
	 */
	private Long postId;
	/**
	 * 评论内容
	 */
	private String content;
	/**
	 * 评论状态
	 */
	private Integer status;
	/**
	 * 创建时间
	 */
	private Date createTime;

	/**
	 * 子评论
	 */
	private List<AppChildrenCommentResponse> children;

	/**
	 * 评论用户信息
	 */
	private AppUserEntity userInfo;

	/**
	 * 点赞数
	 */
	private Integer thumbs;

	/**
	 * 评论是否点赞
	 */
	private Boolean isThumbs;
}
