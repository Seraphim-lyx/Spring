/**
 * 
 */
package com.example.SpringBoot.Service;

import java.util.List;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Path;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Service;

import com.example.SpringBoot.DAO.Student;
import com.example.SpringBoot.DAO.StudentRepo;

/**
 * @author searphimlyx
 *
 */
@Service
public class StudentService {

	@Autowired
	StudentRepo sp;
	
	public List<Student> findBySpec(){
		return sp.findAll(new Specification<Student>() {

			@Override
			public Predicate toPredicate(Root<Student> root, CriteriaQuery<?> query, CriteriaBuilder cb) {
				// TODO Auto-generated method stub
				Path<String> name = root.get("name");
				
				query.where(cb.equal(name, "abc"));
				return null;
				
			}
			
		});
	}
}
