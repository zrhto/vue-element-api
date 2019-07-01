package time.no.see.mapper;

import org.apache.ibatis.annotations.Mapper;

import time.no.see.model.beans.User;


@Mapper
public interface UserMapper {

	User getUserByUsername(String username);
	
	
}