/*
 * Copyright 2020-2099 sa-token.cc
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package cn.dev33.satoken.exception;

/**
 * 一个异常：代表请求 path 无效或非法
 * 
 * @author click33
 * @since 1.37.0
 */
public class RequestPathInvalidException extends FirewallCheckException {

	/**
	 * 序列化版本号
	 */
	private static final long serialVersionUID = 8243974276159004739L;

	/** 具体无效的 path */
	private final String path;

	/**
	 * @return 具体无效的 path
	 */
	public String getPath() {
		return path;
	}

	public RequestPathInvalidException(String message, String path) {
		super(message);
		this.path = path;
	}

}
