package com.langmy.jFinal.common.model.base;

import com.jfinal.plugin.activerecord.Model;
import com.jfinal.plugin.activerecord.IBean;

/**
 * Generated by JFinal, do not modify this file.
 */
@SuppressWarnings("serial")
public abstract class BaseAdminUser<M extends BaseAdminUser<M>> extends Model<M> implements IBean {

	public void setId(java.lang.Integer id) {
		set("id", id);
	}

	public java.lang.Integer getId() {
		return get("id");
	}

	public void setUsername(java.lang.String username) {
		set("username", username);
	}

	public java.lang.String getUsername() {
		return get("username");
	}

	public void setPassword(java.lang.String password) {
		set("password", password);
	}

	public java.lang.String getPassword() {
		return get("password");
	}

	public void setSalt(java.lang.String salt) {
		set("salt", salt);
	}

	public java.lang.String getSalt() {
		return get("salt");
	}

	public void setInTime(java.util.Date inTime) {
		set("in_time", inTime);
	}

	public java.util.Date getInTime() {
		return get("in_time");
	}

}
