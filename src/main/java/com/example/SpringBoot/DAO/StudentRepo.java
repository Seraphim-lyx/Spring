/**
 * 
 */
package com.example.SpringBoot.DAO;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author searphimlyx
 *
 */
@Repository
@Transactional
public interface StudentRepo extends JpaRepository<Student, Integer>, JpaSpecificationExecutor<Student> {
	public List<Student> findByNameLike(String name);
	public List<Student> findByNameContaining(String name);
	public List<Student> findByNameLikeAndAgeGreaterThan(String name, Integer age);

}
