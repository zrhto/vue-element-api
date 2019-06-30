package are.you.ok.model.result;

import time.no.see.model.beans.UserInfo;

public class Result_userinfo {
	
	private Integer code;
	private UserInfo data;
	
	public Integer getCode() {
		return code;
	}
	public void setCode(Integer code) {
		this.code = code;
	}
	public UserInfo getData() {
		return data;
	}
	public void setData(UserInfo data) {
		this.data = data;
	}
	@Override
	public String toString() {
		return "Result_userinfo [code=" + code + ", data=" + data + "]";
	}
	
	
}
