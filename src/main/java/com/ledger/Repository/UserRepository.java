package com.ledger.Repository;

import com.ledger.Model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.lang.classfile.Interfaces;
@Repository
public interface UserRepository extends JpaRepository<User,Long> {
}
