package com.revature.dao;

import com.revature.pojo.Message;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IMessageDao extends JpaRepository<Message,Integer> {
}
