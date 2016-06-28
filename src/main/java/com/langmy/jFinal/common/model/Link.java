package com.langmy.jFinal.common.model;

import com.langmy.jFinal.common.AppConstants;
import com.langmy.jFinal.common.model.base.BaseLink;

import java.util.List;

/**
 * Generated by JFinal.
 */
@SuppressWarnings("serial")
public class Link extends BaseLink<Link> {
	public static final Link dao = new Link();
	public List<Link> findAll() {
		return super.findByCache(
				AppConstants.LINKCACHE,
				AppConstants.LINKLISTKEY,
				"select * from sk_link order by display_index");
	}

	public Integer maxDisplayIndex() {
		return super.findFirst("select max(display_index) as display_index from sk_link").getInt("display_index");
	}
}
