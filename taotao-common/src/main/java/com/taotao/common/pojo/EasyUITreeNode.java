package com.taotao.common.pojo;

/**
 * easyui 树形控件节点对象
 * @author Administrator
 *
 */
public class EasyUITreeNode {
	/**
	 *节点ID 
	 */
	private Long id;
	/**
	 * 节点名称
	 */
	private String text;
	/**
	 * 是否有子节点 有子节点值为 “closed”,没有子节点：open
	 */
	private String state;
	public EasyUITreeNode() {
		super();
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getText() {
		return text;
	}
	public void setText(String text) {
		this.text = text;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}

	
}
