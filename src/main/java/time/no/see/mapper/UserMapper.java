package time.no.see.mapper;

import org.apache.ibatis.annotations.Mapper;

import time.no.see.model.User;


@Mapper
public interface UserMapper {

	User getUserByUsername(String username);

}