package com.langmy.jFinal.common.model.base;

import com.jfinal.plugin.activerecord.Model;
import com.jfinal.plugin.activerecord.IBean;

/**
 * Generated by JFinal, do not modify this file.
 */
@SuppressWarnings("serial")
public abstract class BaseValicode<M extends BaseValicode<M>> extends Model<M> implements IBean {

	public void setId(java.lang.Integer id) {
		set("id", id);
	}

	public java.lang.Integer getId() {
		return get("id");
	}

	public void setCode(java.lang.String code) {
		set("code", code);
	}

	public java.lang.String getCode() {
		return get("code");
	}

	public void setInTime(java.util.Date inTime) {
		set("in_time", inTime);
	}

	public java.util.Date getInTime() {
		return get("in_time");
	}

	public void setStatus(java.lang.Integer status) {
		set("status", status);
	}

	public java.lang.Integer getStatus() {
		return get("status");
	}

	public void setType(java.lang.String type) {
		set("type", type);
	}

	public java.lang.String getType() {
		return get("type");
	}

	public void setExpireTime(java.util.Date expireTime) {
		set("expire_time", expireTime);
	}

	public java.util.Date getExpireTime() {
		return get("expire_time");
	}

	public void setTarget(java.lang.String target) {
		set("target", target);
	}

	public java.lang.String getTarget() {
		return get("target");
	}

}
