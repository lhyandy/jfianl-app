package com.shoukeplus.jFinal.common.model.base;

import com.jfinal.plugin.activerecord.Model;
import com.jfinal.plugin.activerecord.IBean;

/**
 * Generated by JFinal, do not modify this file.
 */
@SuppressWarnings("serial")
public abstract class BaseLabelTopicId<M extends BaseLabelTopicId<M>> extends Model<M> implements IBean {

	public void setId(java.lang.Integer id) {
		set("id", id);
	}

	public java.lang.Integer getId() {
		return get("id");
	}

	public void setTid(java.lang.String tid) {
		set("tid", tid);
	}

	public java.lang.String getTid() {
		return get("tid");
	}

	public void setLid(java.lang.Integer lid) {
		set("lid", lid);
	}

	public java.lang.Integer getLid() {
		return get("lid");
	}

}
