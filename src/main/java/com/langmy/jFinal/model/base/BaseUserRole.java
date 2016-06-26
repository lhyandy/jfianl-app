package com.langmy.jFinal.model.base;

import cn.dreampie.web.model.Model;
import com.jfinal.plugin.activerecord.IBean;

/**
 * Generated by JFinal, do not modify this file.
 */
@SuppressWarnings("serial")
public abstract class BaseUserRole<M extends BaseUserRole<M>> extends Model<M> implements IBean {

	public void setId(java.math.BigInteger id) {
		set("id", id);
	}

	public java.math.BigInteger getId() {
		return get("id");
	}

	public void setUserId(java.lang.Long userId) {
		set("user_id", userId);
	}

	public java.lang.Long getUserId() {
		return get("user_id");
	}

	public void setRoleId(java.lang.Long roleId) {
		set("role_id", roleId);
	}

	public java.lang.Long getRoleId() {
		return get("role_id");
	}

}
