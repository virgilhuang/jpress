package io.jpress.model.base;

import io.jboot.db.model.JbootModel;
import com.jfinal.plugin.activerecord.IBean;

/**
 * Generated by Jboot, do not modify this file.
 */
@SuppressWarnings("serial")
public abstract class BaseActionlog<M extends BaseActionlog<M>> extends JbootModel<M> implements IBean {

    public static final String ACTION_ADD = "Actionlog:add";
    public static final String ACTION_DELETE = "Actionlog:delete";
    public static final String ACTION_UPDATE = "Actionlog:update";


    @Override
    public String addAction() {
        return ACTION_ADD;
    }

    @Override
    public String deleteAction() {
        return ACTION_DELETE;
    }

    @Override
    public String updateAction() {
        return ACTION_UPDATE;
    }


	public void setId(java.lang.String id) {
		set("id", id);
	}
	
	public java.lang.String getId() {
		return getStr("id");
	}

	public void setAction(java.lang.String action) {
		set("action", action);
	}
	
	public java.lang.String getAction() {
		return getStr("action");
	}

	public void setUserId(java.lang.String userId) {
		set("user_id", userId);
	}
	
	public java.lang.String getUserId() {
		return getStr("user_id");
	}

	public void setDataType(java.lang.String dataType) {
		set("data_type", dataType);
	}
	
	public java.lang.String getDataType() {
		return getStr("data_type");
	}

	public void setDataId(java.lang.String dataId) {
		set("data_id", dataId);
	}
	
	public java.lang.String getDataId() {
		return getStr("data_id");
	}

	public void setDataExt(java.lang.String dataExt) {
		set("data_ext", dataExt);
	}
	
	public java.lang.String getDataExt() {
		return getStr("data_ext");
	}

	public void setIp(java.lang.String ip) {
		set("ip", ip);
	}
	
	public java.lang.String getIp() {
		return getStr("ip");
	}

	public void setAgent(java.lang.String agent) {
		set("agent", agent);
	}
	
	public java.lang.String getAgent() {
		return getStr("agent");
	}

	public void setCreated(java.util.Date created) {
		set("created", created);
	}
	
	public java.util.Date getCreated() {
		return get("created");
	}

	public void setModified(java.util.Date modified) {
		set("modified", modified);
	}
	
	public java.util.Date getModified() {
		return get("modified");
	}

}
