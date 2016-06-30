package com.langmy.jFinal.common.model.base;

import com.jfinal.plugin.activerecord.Model;
import com.jfinal.plugin.activerecord.IBean;

/**
 * Generated by JFinal, do not modify this file.
 */
@SuppressWarnings("serial")
public abstract class BaseArea<M extends BaseArea<M>> extends Model<M> implements IBean {

	public void setAreaId(java.math.BigInteger areaId) {
		set("areaId", areaId);
	}

	public java.math.BigInteger getAreaId() {
		return get("areaId");
	}

	public void setName(java.lang.String name) {
		set("name", name);
	}

	public java.lang.String getName() {
		return get("name");
	}

	public void setPinyin(java.lang.String pinyin) {
		set("pinyin", pinyin);
	}

	public java.lang.String getPinyin() {
		return get("pinyin");
	}

	public void setPid(java.lang.Long pid) {
		set("pid", pid);
	}

	public java.lang.Long getPid() {
		return get("pid");
	}

	public void setAreaCode(java.lang.String areaCode) {
		set("area_code", areaCode);
	}

	public java.lang.String getAreaCode() {
		return get("area_code");
	}

	public void setZipCode(java.lang.String zipCode) {
		set("zip_code", zipCode);
	}

	public java.lang.String getZipCode() {
		return get("zip_code");
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
