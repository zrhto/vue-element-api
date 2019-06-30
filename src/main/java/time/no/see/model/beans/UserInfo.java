package time.no.see.model.beans;

import java.util.Arrays;

public class UserInfo {
	private String[] roles;
	private String introduction;
	private String avatar;
	private String name;

	public String[] getRoles() {
		return roles;
	}

	public void setRoles(String[] roles) {
		this.roles = roles;
	}

	public String getIntroduction() {
		return introduction;
	}

	public void setIntroduction(String introduction) {
		this.introduction = introduction;
	}

	public String getAvatar() {
		return avatar;
	}

	public void setAvatar(String avatar) {
		this.avatar = avatar;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "UserInfo [roles=" + Arrays.toString(roles) + ", introduction=" + introduction + ", avatar=" + avatar
				+ ", name=" + name + "]";
	}

	public UserInfo(String[] roles, String introduction, String avatar, String name) {
		super();
		this.roles = roles;
		this.introduction = introduction;
		this.avatar = avatar;
		this.name = name;
	}

	public UserInfo() {
		super();
	}

}
