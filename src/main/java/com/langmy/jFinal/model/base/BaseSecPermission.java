package com.langmy.jFinal.model.base;

import cn.dreampie.web.model.Model;
import com.jfinal.plugin.activerecord.IBean;

/**
 * Generated by JFinal, do not modify this file.
 */
@SuppressWarnings("serial")
public abstract class BaseSecPermission<M extends BaseSecPermission<M>> extends Model<M> implements IBean {

	public void setId(java.math.BigInteger id) {
		set("id", id);
	}

	public java.math.BigInteger getId() {
		return get("id");
	}

	public void setName(java.lang.String name) {
		set("name", name);
	}

	public java.lang.String getName() {
		return get("name");
	}

	public void setValue(java.lang.String value) {
		set("value", value);
	}

	public java.lang.String getValue() {
		return get("value");
	}

	public void setUrl(java.lang.String url) {
		set("url", url);
	}

	public java.lang.String getUrl() {
		return get("url");
	}

	public void setIntro(java.lang.String intro) {
		set("intro", intro);
	}

	public java.lang.String getIntro() {
		return get("intro");
	}

	public void setPid(java.lang.Long pid) {
		set("pid", pid);
	}

	public java.lang.Long getPid() {
		return get("pid");
	}

	public void setLeftCode(java.lang.Long leftCode) {
		set("left_code", leftCode);
	}

	public java.lang.Long getLeftCode() {
		return get("left_code");
	}

	public void setRightCode(java.lang.Long rightCode) {
		set("right_code", rightCode);
	}

	public java.lang.Long getRightCode() {
		return get("right_code");
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
