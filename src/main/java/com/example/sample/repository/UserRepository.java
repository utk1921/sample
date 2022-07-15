package com.example.sample.repository;

import com.example.sample.entity.UserRecord;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<UserRecord, String>
{
}
