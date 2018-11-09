package com.example.SpringBoot;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.test.context.junit4.SpringRunner;

import com.example.SpringBoot.DAO.StudentRepo;
import com.example.SpringBoot.Service.StudentService;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = Application.class)
@EnableAsync
public class ApplicationTests{

	Logger logger = LoggerFactory.getLogger(this.getClass());
	
	@Autowired
	StudentRepo st;
	
	@Autowired
	StudentService ss;
	
	@Test
	public void contextLoads() {
//		Pageable page = PageRequest.of(0, 10, Sort.by(Direction.DESC, "age"));
//		st.findAll(page).forEach((e)->System.out.println(e.getAge()));
//		st.findByNameLikeAndAgeGreaterThan("%bc", 100).forEach(e->System.out.println(e.getId()));
		ss.findBySpec().forEach(e->System.out.println(e.getDate()));

	}

}
