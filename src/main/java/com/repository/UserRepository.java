package com.scb.bank.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.scb.bank.dto.UserResponseDto;
import com.scb.bank.entity.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long>{

	//List<User> findByFirstName(String firstName);
	
	/*
	 * @Query("select new com.scb.bank.dto.UserResponseDto(firstName, count(*)) from User where firstName=:firstName"
	 * ) List<UserResponseDto> getCustomUser(@Param("firstName") String firstName);
	 */
	
	/*
	 * List<User> findByFirstNameContains(String firstName);
	 * 
	 * List<User> findByFirstNameAndLastName(String firstName, String lastName);
	 */
	
	/*
	 * @Query("from User where firstName=:firstName and lastName=:lastName")
	 * List<User> getUsersByName(@Param("firstName") String
	 * firstName, @Param("lastName") String lastName);
	 * 
	 * @Query(value =
	 * "select u from user u where u.first_name = :firstName and u.last_name = :lastName"
	 * , nativeQuery = true) List<User> getUsersByNameSql(@Param("firstName") String
	 * firstName, @Param("lastName") String lastName);
	 */
	
	
	
	/*
	 * List<User> findByFirstNameOrLastName(String firstName, String lastName);
	 * 
	 * List<User> findByFirstNameContainsOrLastNameContains(String firstName, String
	 * lastName);
	 */
}
