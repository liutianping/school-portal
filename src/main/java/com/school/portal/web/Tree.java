package com.school.portal.web;


//id:1, pId:0, name:"系统管理",
//open:true, iconOpen:"../../js/ztree/css/zTreeStyle/img/diy/1_open.png",
//iconClose:"../../js/ztree/css/zTreeStyle/img/diy/1_close.png"
public class Tree {
	private int id;
	private int pId;
	private String name;
	private boolean open;
	private String iconOpen;
	private String iconClose;
	private String icon;
	private String target;
	
	public Tree() {}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getpId() {
		return pId;
	}

	public void setpId(int pId) {
		this.pId = pId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public boolean isOpen() {
		return open;
	}

	public void setOpen(boolean open) {
		this.open = open;
	}

	public String getIconOpen() {
		return iconOpen;
	}

	public void setIconOpen(String iconOpen) {
		this.iconOpen = iconOpen;
	}

	public String getIconClose() {
		return iconClose;
	}

	public void setIconClose(String iconClose) {
		this.iconClose = iconClose;
	}

	public String getIcon() {
		return icon;
	}

	public void setIcon(String icon) {
		this.icon = icon;
	}

	public String getTarget() {
		return target;
	}

	public void setTarget(String target) {
		this.target = target;
	}
}
