/*
 *    Copyright (c) 2018-2025, JYF All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions are met:
 *
 * Redistributions of source code must retain the above copyright notice,
 * this list of conditions and the following disclaimer.
 * Redistributions in binary form must reproduce the above copyright
 * notice, this list of conditions and the following disclaimer in the
 * documentation and/or other materials provided with the distribution.
 * Neither the name of the ova4cloud.com developer nor the names of its
 * contributors may be used to endorse or promote products derived from
 * this software without specific prior written permission.
 * Author: JYF (wangiegie@gmail.com)
 */

package com.alibaba.nacos.config;

/**
 * @author JYF
 * @date 2021-10-31
 * <p>
 * 覆盖nacos 默认配置
 */
public interface ConfigConstants {

	/**
	 * The System property name of Standalone mode
	 */
	String STANDALONE_MODE = "nacos.standalone";

	/**
	 * 是否开启认证
	 */
	String AUTH_ENABLED = "nacos.core.auth.enabled";

	/**
	 * 日志目录
	 */
	String LOG_BASEDIR = "server.tomcat.basedir";

}
