package com.langmy.jFinal.model.base;

import cn.dreampie.web.model.Model;
import com.jfinal.plugin.activerecord.IBean;

/**
 * Generated by JFinal, do not modify this file.
 */
@SuppressWarnings("serial")
public abstract class BaseTaskGroup<M extends BaseTaskGroup<M>> extends Model<M> implements IBean {

	public void setId(java.math.BigInteger id) {
		set("id", id);
	}

	public java.math.BigInteger getId() {
		return get("id");
	}

	public void setUserId(java.lang.Integer userId) {
		set("user_id", userId);
	}

	public java.lang.Integer getUserId() {
		return get("user_id");
	}

	public void setJobs(java.lang.String jobs) {
		set("jobs", jobs);
	}

	public java.lang.String getJobs() {
		return get("jobs");
	}

	public void setIsLeader(java.lang.Integer isLeader) {
		set("is_leader", isLeader);
	}

	public java.lang.Integer getIsLeader() {
		return get("is_leader");
	}

	public void setRemark(java.lang.String remark) {
		set("remark", remark);
	}

	public java.lang.String getRemark() {
		return get("remark");
	}

	public void setCreatedAt(java.util.Date createdAt) {
		set("created_at", createdAt);
	}

	public java.util.Date getCreatedAt() {
		return get("created_at");
	}

	public void setUpdatedAt(java.util.Date updatedAt) {
		set("updated_at", updatedAt);
	}

	public java.util.Date getUpdatedAt() {
		return get("updated_at");
	}

	public void setDeletedAt(java.util.Date deletedAt) {
		set("deleted_at", deletedAt);
	}

	public java.util.Date getDeletedAt() {
		return get("deleted_at");
	}

}
