package time.no.see.shiro.filter;

import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import org.apache.shiro.web.filter.authc.UserFilter;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;

import time.no.see.encry.EncryHelper;
import time.no.see.model.User;
import time.no.see.model.result.ResultMsg;
import time.no.see.service.LoginUserService;

public class LoginUserFilter extends UserFilter {
	
	@Autowired
	LoginUserService loginUserService;
	
	@Override
	protected boolean onAccessDenied(ServletRequest request, ServletResponse response) throws Exception {
		String username = request.getParameter("username");
		System.out.println(username);
		String password = request.getParameter("password");
		System.out.println(password);
		User user = loginUserService.getUserByUsername(username);
		String hex = EncryHelper.encryptPassword(password,user.getSalt());
		ResultMsg resultMsg = new ResultMsg();
		resultMsg.setSuccessOffail(false);
		//如果密码一致则返回登录成功消息
		if(user.getPassword().equals(hex)) {
			resultMsg.setSuccessOffail(true);
		}
		resultMsg.setCode("20000");
		JSONObject jsonObject = new JSONObject(resultMsg);
		response.getWriter().write(jsonObject.toString());
		return false;

	}

	public LoginUserService getLoginUserService() {
		return loginUserService;
	}

	public void setLoginUserService(LoginUserService loginUserService) {
		this.loginUserService = loginUserService;
	}

	
	
	
}
