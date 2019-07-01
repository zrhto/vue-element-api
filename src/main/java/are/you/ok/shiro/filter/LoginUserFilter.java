package are.you.ok.shiro.filter;

import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import org.apache.shiro.web.filter.authc.UserFilter;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;

import are.you.ok.entry.EncryHelper;
import are.you.ok.model.result.Result_token;
import are.you.ok.model.result.Token_;
import time.no.see.model.beans.User;
import time.no.see.service.LoginUserService;

public class LoginUserFilter extends UserFilter {
	
	@Autowired
	LoginUserService loginUserService;
	
	@Override
	protected boolean onAccessDenied(ServletRequest request, ServletResponse response) throws Exception {
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		User user = loginUserService.getUserByUsername(username);
		String hex = EncryHelper.encryptPassword(password,user.getSalt());
		//如果密码一致则返回登录成功消息
		Result_token result = new Result_token();
		result.setCode(20000);
		Token_ token = new Token_();
		token.setToken(username);
		result.setData(token);
		if(user.getPassword().equals(hex)) {
			response.getWriter().write(new JSONObject(result).toString());
		}
		return false;

	}


	
	
	
}
