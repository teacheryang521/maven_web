package com.pro.serivce;

import java.util.List;

import com.pro.dao.WorkorderMapper;
import com.pro.pojo.Workorder;

public class WorkServiceImpl implements WorkService {

	//定义一个workMapper对象
	private WorkorderMapper workMapper;
	
	@Override
	public List<Workorder> getList() {
		
		return workMapper.getWorks();
	}
	
	
	public WorkorderMapper getWorkMapper() {
		return workMapper;
	}
	public void setWorkMapper(WorkorderMapper workMapper) {
		this.workMapper = workMapper;
	}

}
