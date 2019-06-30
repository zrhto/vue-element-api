package time.no.see.service;


import time.no.see.model.beans.User;

public interface LoginUserService {

	User getUserByUsername(String username);

}
