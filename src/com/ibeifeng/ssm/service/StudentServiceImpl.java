package com.ibeifeng.ssm.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.ibeifeng.ssm.mapper.StudentMapper;
import com.ibeifeng.ssm.pojo.Student;

public class StudentServiceImpl implements StudentService{

	@Autowired
	private StudentMapper stumapper;
	@Override
	public Student findById(Integer id) {
		// TODO Auto-generated method stub
		return stumapper.selectByPrimaryKey(id);
	}

	@Override
	public int add(Student s) {
		// TODO Auto-generated method stub
		return stumapper.insertSelective(s);
	}

	@Override
	public int delete(Student s) {
		// TODO Auto-generated method stub
		return stumapper.deleteByPrimaryKey(s.getStuId());
	}

	@Override
	public int update(Student s) {
		// TODO Auto-generated method stub
		return stumapper.updateByPrimaryKeySelective(s);
	}

	@Override
	public List<Student> selectAll() {
		// TODO Auto-generated method stub
		
		
		
		return stumapper.selectAll();
	}

}
