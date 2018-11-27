package net.daw.bean.beanImplementation;

import java.sql.Connection;
import java.sql.ResultSet;

import com.google.gson.annotations.Expose;
import net.daw.bean.genericBeanImplementation.GenericBeanImplementation;
import net.daw.bean.publicBeanInterface.BeanInterface;

public class TipousuarioBean extends GenericBeanImplementation implements BeanInterface{

	@Expose
	private String desc;

	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}

	public TipousuarioBean fill(ResultSet oResultSet, Connection oConnection, Integer expand) throws Exception {
		this.setId(oResultSet.getInt("id"));
		this.setDesc(oResultSet.getString("desc"));
		return this;
	}
}
