/*
 * Copyright (c) 2020 ova4cloud Authors. All Rights Reserved.
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

package com.ova4cloud.ova.common.security.component;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.ser.std.StdSerializer;
import com.ova4cloud.ova.common.core.constant.CommonConstants;
import com.ova4cloud.ova.common.security.exception.OvaAuth2Exception;
import lombok.SneakyThrows;

/**
 * @author JYF
 * @date 2019/2/1
 * <p>
 * OAuth2 异常格式化
 */
public class OvaAuth2ExceptionSerializer extends StdSerializer<OvaAuth2Exception> {

	public OvaAuth2ExceptionSerializer() {
		super(OvaAuth2Exception.class);
	}

	@Override
	@SneakyThrows
	public void serialize(OvaAuth2Exception value, JsonGenerator gen, SerializerProvider provider) {
		gen.writeStartObject();
		gen.writeObjectField("code", CommonConstants.FAIL);
		gen.writeStringField("msg", value.getMessage());
		gen.writeStringField("data", value.getErrorCode());
		gen.writeEndObject();
	}

}
