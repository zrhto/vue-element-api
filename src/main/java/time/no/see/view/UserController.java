package time.no.see.view;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.json.JSONObject;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import are.you.ok.model.result.Result_userinfo;
import time.no.see.model.beans.UserInfo;

@Controller
public class UserController {
	
	private static Map<String,UserInfo> userInfo = new HashMap<String,UserInfo>();
	static {
		String[] role1 = new String[1];
		role1[0] = "admin";
		String[] role2 = new String[1];
		role2[0] = "admin";
		UserInfo userInfo1 = new UserInfo(role1,"I am a super administrator","https://wpimg.wallstcn.com/f778738c-e4f8-4870-b634-56703b4acafe.gif","Super Admin");
		UserInfo userInfo2 = new UserInfo(role2,"I am an editor","https://wpimg.wallstcn.com/f778738c-e4f8-4870-b634-56703b4acafe.gif","Normal Editor");
		userInfo.put("life-token", userInfo1);
		userInfo.put("editor-token", userInfo2);
	}
	
	@ResponseBody
	@RequestMapping("info")
	public Result_userinfo getUserInfo(String token) {
		String tokenkey = token+"-token";
		UserInfo userInfo2 = userInfo.get(tokenkey);
		Result_userinfo result_userinfo = new Result_userinfo();
		result_userinfo.setCode(20000);
		result_userinfo.setData(userInfo2);
		return result_userinfo;
	}
}	
