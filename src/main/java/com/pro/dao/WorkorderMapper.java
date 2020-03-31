package com.pro.dao;

import java.util.List;

import com.pro.pojo.Workorder;


/**
 * 工单详细信息类
 * @author Administrator
 *
 */
public interface WorkorderMapper {
	public List<Workorder>  getWorks();
	public int editWork(Workorder work);
}