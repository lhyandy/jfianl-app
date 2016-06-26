package com.langmy.jFinal.model.base;

import cn.dreampie.web.model.Model;
import com.jfinal.plugin.activerecord.IBean;

/**
 * Generated by JFinal, do not modify this file.
 */
@SuppressWarnings("serial")
public abstract class BaseSideTaskAssist<M extends BaseSideTaskAssist<M>> extends Model<M> implements IBean {

	public void setId(java.math.BigInteger id) {
		set("id", id);
	}

	public java.math.BigInteger getId() {
		return get("id");
	}

	public void setSideTaskId(java.lang.Integer sideTaskId) {
		set("side_task_id", sideTaskId);
	}

	public java.lang.Integer getSideTaskId() {
		return get("side_task_id");
	}

	public void setAssistUserId(java.lang.Integer assistUserId) {
		set("assist_user_id", assistUserId);
	}

	public java.lang.Integer getAssistUserId() {
		return get("assist_user_id");
	}

	public void setBeginAt(java.util.Date beginAt) {
		set("begin_at", beginAt);
	}

	public java.util.Date getBeginAt() {
		return get("begin_at");
	}

	public void setEndAt(java.util.Date endAt) {
		set("end_at", endAt);
	}

	public java.util.Date getEndAt() {
		return get("end_at");
	}

	public void setActualBeginAt(java.util.Date actualBeginAt) {
		set("actual_begin_at", actualBeginAt);
	}

	public java.util.Date getActualBeginAt() {
		return get("actual_begin_at");
	}

	public void setActualEndAt(java.util.Date actualEndAt) {
		set("actual_end_at", actualEndAt);
	}

	public java.util.Date getActualEndAt() {
		return get("actual_end_at");
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
