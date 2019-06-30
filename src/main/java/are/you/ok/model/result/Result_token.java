package are.you.ok.model.result;

public class Result_token {
	
	private Integer code;
	private Token_ data;
	public Integer getCode() {
		return code;
	}
	public void setCode(Integer code) {
		this.code = code;
	}
	public Token_ getData() {
		return data;
	}
	public void setData(Token_ data) {
		this.data = data;
	}
	@Override
	public String toString() {
		return "Result_token [code=" + code + ", data=" + data + "]";
	}
	
}
