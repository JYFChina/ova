/*
 * Copyright (c) 2020 pig4cloud Authors. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.ova4cloud.ova.admin.controller;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.ova4cloud.ova.admin.api.dto.SysLogDTO;
import com.ova4cloud.ova.admin.api.entity.SysLog;
import com.ova4cloud.ova.admin.service.SysLogService;
import com.ova4cloud.ova.common.core.util.R;
import com.ova4cloud.ova.common.security.annotation.Inner;
import io.swagger.annotations.Api;
import lombok.RequiredArgsConstructor;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.validation.Valid;

/**
 * <p>
 * 日志表 前端控制器
 * </p>
 *
 * @author JYF
 * @since 2020/2/1
 */
@RestController
@RequiredArgsConstructor
@RequestMapping("/log")
@Api(value = "log", tags = "日志管理模块")
public class LogController {

	private final SysLogService sysLogService;

	/**
	 * 简单分页查询
	 * @param page 分页对象
	 * @param sysLog 系统日志
	 * @return
	 */
	@GetMapping("/page")
	public R getLogPage(Page page, SysLogDTO sysLog) {
		return R.ok(sysLogService.getLogByPage(page, sysLog));
	}

	/**
	 * 删除日志
	 * @param id ID
	 * @return success/false
	 */
	@DeleteMapping("/{id}")
	@PreAuthorize("@pms.hasPermission('sys_log_del')")
	public R removeById(@PathVariable Long id) {
		return R.ok(sysLogService.removeById(id));
	}

	/**
	 * 插入日志
	 * @param sysLog 日志实体
	 * @return success/false
	 */
	@Inner
	@PostMapping
	public R save(@Valid @RequestBody SysLog sysLog) {
		return R.ok(sysLogService.save(sysLog));
	}

}
