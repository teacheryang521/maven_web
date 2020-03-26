package com.pro.pojo;

import java.util.Date;

public class Workorder {
    private Integer id;

    private Integer projectid;

    @Override
	public String toString() {
		return "Workorder [id=" + id + ", projectid=" + projectid + ", executor=" + executor + ", description="
				+ description + ", orderlevel=" + orderlevel + ", createdate=" + createdate + "]";
	}

	private String executor;

    private String description;

    private Integer orderlevel;

    private Date createdate;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getProjectid() {
        return projectid;
    }

    public void setProjectid(Integer projectid) {
        this.projectid = projectid;
    }

    public String getExecutor() {
        return executor;
    }

    public void setExecutor(String executor) {
        this.executor = executor == null ? null : executor.trim();
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }

    public Integer getOrderlevel() {
        return orderlevel;
    }

    public void setOrderlevel(Integer orderlevel) {
        this.orderlevel = orderlevel;
    }

    public Date getCreatedate() {
        return createdate;
    }

    public void setCreatedate(Date createdate) {
        this.createdate = createdate;
    }

	public Workorder(Integer projectid, String executor, String description, Integer orderlevel,
			Date createdate) {
		super();
		this.projectid = projectid;
		this.executor = executor;
		this.description = description;
		this.orderlevel = orderlevel;
		this.createdate = createdate;
	}

	public Workorder() {
		super();
		// TODO Auto-generated constructor stub
	}
    
    
}