package com.ibeifeng.ssm.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.ibeifeng.ssm.mapper.SourceofStudentsMapper;
import com.ibeifeng.ssm.pojo.SourceofStudents;

public class InfromalStuServiceImpl implements InfromalStuService {

	@Autowired
	private SourceofStudentsMapper sosStudent;

	@Override
	public SourceofStudents findById(Integer id) {
		// TODO Auto-generated method stub
		return sosStudent.selectByPrimaryKey(id);
	}

	@Override
	public int add(SourceofStudents s) {
		// TODO Auto-generated method stub
		return sosStudent.insertSelective(s);
	}

	@Override
	public int delete(SourceofStudents s) {
		// TODO Auto-generated method stub
		return sosStudent.deleteByPrimaryKey(s.getSosId());
	}

	@Override
	public int update(SourceofStudents s) {
		// TODO Auto-generated method stub
		return sosStudent.updateByPrimaryKeySelective(s);
	}

	@Override
	public List<SourceofStudents> selectAll() {
		// TODO Auto-generated method stub
		return sosStudent.findAll();		
	} 


}
