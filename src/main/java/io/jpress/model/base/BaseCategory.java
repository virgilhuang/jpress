
package io.jpress.model.base;

import io.jboot.db.model.JbootModel;
import com.jfinal.plugin.activerecord.IBean;

/**
 *  Auto generated, do not modify this file.
 */
@SuppressWarnings("serial")
public class BaseCategory<M extends BaseCategory<M>> extends JbootModel<M> implements IBean {

	public static final String ACTION_ADD = "category:add";
	public static final String ACTION_DELETE = "category:delete";
	public static final String ACTION_UPDATE = "category:update";

	@Override
	protected String addAction() {
		return ACTION_ADD;
	}

	@Override
	protected String deleteAction() {
		return ACTION_DELETE;
	}

	@Override
	protected String updateAction() {
		return ACTION_UPDATE;
	}

	public void setId(java.math.BigInteger id) {
		set("id", id);
	}

	public java.math.BigInteger getId() {
		return get("id");
	}

	public void setTitle(java.lang.String title) {
		set("title", title);
	}

	public java.lang.String getTitle() {
		return getStr("title");
	}

	public void setText(java.lang.String text) {
		set("text", text);
	}

	public java.lang.String getText() {
		return getStr("text");
	}

	public void setSlug(java.lang.String slug) {
		set("slug", slug);
	}

	public java.lang.String getSlug() {
		return getStr("slug");
	}

	public void setType(java.lang.String type) {
		set("type", type);
	}

	public java.lang.String getType() {
		return getStr("type");
	}

	public void setIcon(java.lang.String icon) {
		set("icon", icon);
	}

	public java.lang.String getIcon() {
		return getStr("icon");
	}

	public void setContentModule(java.lang.String contentModule) {
		set("content_module", contentModule);
	}

	public java.lang.String getContentModule() {
		return getStr("content_module");
	}

	public void setContentCount(java.lang.Long contentCount) {
		set("content_count", contentCount);
	}

	public java.lang.Long getContentCount() {
		return getLong("content_count");
	}

	public void setOrderNumber(java.lang.Integer orderNumber) {
		set("order_number", orderNumber);
	}

	public java.lang.Integer getOrderNumber() {
		return getInt("order_number");
	}

	public void setParentId(java.math.BigInteger parentId) {
		set("parent_id", parentId);
	}

	public java.math.BigInteger getParentId() {
		return get("parent_id");
	}

	public void setObjectId(java.math.BigInteger objectId) {
		set("object_id", objectId);
	}

	public java.math.BigInteger getObjectId() {
		return get("object_id");
	}

	public void setFlag(java.lang.String flag) {
		set("flag", flag);
	}

	public java.lang.String getFlag() {
		return getStr("flag");
	}

	public void setLat(java.math.BigDecimal lat) {
		set("lat", lat);
	}

	public java.math.BigDecimal getLat() {
		return get("lat");
	}

	public void setLng(java.math.BigDecimal lng) {
		set("lng", lng);
	}

	public java.math.BigDecimal getLng() {
		return get("lng");
	}

	public void setMetaKeywords(java.lang.String metaKeywords) {
		set("meta_keywords", metaKeywords);
	}

	public java.lang.String getMetaKeywords() {
		return getStr("meta_keywords");
	}

	public void setMetaDescription(java.lang.String metaDescription) {
		set("meta_description", metaDescription);
	}

	public java.lang.String getMetaDescription() {
		return getStr("meta_description");
	}

	public void setCreated(java.util.Date created) {
		set("created", created);
	}

	public java.util.Date getCreated() {
		return get("created");
	}

}
