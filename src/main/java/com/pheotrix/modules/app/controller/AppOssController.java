package com.pheotrix.modules.app.controller;

import com.pheotrix.common.exception.MyException;
import com.pheotrix.common.utils.FileCheckUtil;
import com.pheotrix.common.utils.R;
import com.pheotrix.modules.oss.cloud.OSSFactory;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

/**
 * APP文件上传
 *
 */
@RestController
@RequestMapping("app/common")
@Api(tags = "App文件上传")
public class AppOssController {

	@Value("${oss.max-size}")
	private Long maxSize;


	@ApiOperation("上传文件")
	@PostMapping("/upload")
	public R upload(@RequestParam("Image") MultipartFile file) throws Exception {
		if (file.isEmpty()) {
			throw new MyException("上传文件不能为空");
		}
		FileCheckUtil.checkSize(maxSize, file.getSize());
		//上传文件
		String suffix = file.getOriginalFilename().substring(file.getOriginalFilename().lastIndexOf("."));
		String url = OSSFactory.build().uploadSuffix(file.getBytes(), suffix);

		return R.ok().put("result", url);
	}



}
