package com.raodao.vo;

import lombok.Data;

@Data
public class ResultVO {
	
	Object result;
	boolean success;
	
	// 생성자
	public ResultVO(boolean success, Object result) {
		this.result = result;
		this.success = false;
	}
}