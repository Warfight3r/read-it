package com.blog.readIt.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

import com.blog.readIt.bean.Users;

@Repository("userRepository")
public interface UserRepository extends MongoRepository<Users, String>{
	List<Users> findByName(String name);
	List<Users> findByEmail(String email);
	
//	List<Users> findByQtyGreaterThan(int blogs);
//	List<Users> findByQtyBetween(int qty, int qty2);
	
//	@Query("{ 'qty' : { $gt: ?0, $lt: ?1 } }")
//	List<Users> findByQtyLessThanAndGreater(int ageGt, int ageLT);
}
