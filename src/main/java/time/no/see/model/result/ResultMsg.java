package time.no.see.model.result;

public class ResultMsg {
	
	private String code;
	private String message;
	private boolean successOffail;
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public boolean isSuccessOffail() {
		return successOffail;
	}
	public void setSuccessOffail(boolean successOffail) {
		this.successOffail = successOffail;
	}
	
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	@Override
	public String toString() {
		return "ResultMsg [code=" + code + ", message=" + message + ", successOffail=" + successOffail + "]";
	}
}
