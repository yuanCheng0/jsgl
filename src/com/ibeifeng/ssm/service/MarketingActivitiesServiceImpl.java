package com.ibeifeng.ssm.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.ibeifeng.ssm.mapper.MarketingActivitiesMapper;
import com.ibeifeng.ssm.pojo.MarketingActivities;

public class MarketingActivitiesServiceImpl implements
		MarketingActivitiesService {
	
	@Autowired
	private MarketingActivitiesMapper mac;

	@Override
	public MarketingActivities findById(Integer id) {
		// TODO Auto-generated method stub
		return mac.selectByPrimaryKey(id);
	}

	@Override
	public int add(MarketingActivities s) {
		// TODO Auto-generated method stub
		return mac.insertSelective(s);
	}

	@Override
	public int delete(MarketingActivities s) {
		// TODO Auto-generated method stub
		return mac.deleteByPrimaryKey(s.getActId());
	}

	@Override
	public int update(MarketingActivities s) {
		// TODO Auto-generated method stub
		return mac.updateByPrimaryKeySelective(s);
	}

	@Override
	public List<MarketingActivities> selectAll() {
		// TODO Auto-generated method stub
		return mac.selectMarketAll();
	}

	
}
