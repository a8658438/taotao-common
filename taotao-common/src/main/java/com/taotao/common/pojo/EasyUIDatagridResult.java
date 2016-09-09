package com.taotao.common.pojo;

import java.util.List;

/**
 * 
 * Easyui Datagrid所需要的数据格式类
 * @author Administrator
 *
 */
public class EasyUIDatagridResult {
	/**
	 * 数据总数量
	 */
	private long total;
	/**
	 * 数据集合
	 */
	private List<?> rows;
	
	public EasyUIDatagridResult() {
		super();
	}
	public long getTotal() {
		return total;
	}
	public void setTotal(long total) {
		this.total = total;
	}
	public List<?> getRows() {
		return rows;
	}
	public void setRows(List<?> rows) {
		this.rows = rows;
	}
	
	
}
