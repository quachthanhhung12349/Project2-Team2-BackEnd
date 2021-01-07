package com.revature.dao;

import com.revature.pojo.Forum;
import com.revature.pojo.Message;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IforumDao2 extends JpaRepository<Message,Integer> {
}
