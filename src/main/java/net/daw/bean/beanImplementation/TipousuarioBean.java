package net.daw.bean.beanImplementation;

import java.sql.Connection;
import java.sql.ResultSet;

import com.google.gson.annotations.Expose;
import net.daw.bean.genericBeanImplementation.GenericBeanImplementation;
import net.daw.bean.publicBeanInterface.BeanInterface;
import net.daw.helper.EncodingHelper;

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
        public String getColumns() {
		String strColumns="";
		strColumns += "id,";
		strColumns += "desc";	
		return strColumns;				
	}
        public String getValues() {
		String strColumns="";
		strColumns += "null,";
		strColumns += EncodingHelper.quotate(desc);	
		return strColumns;				
	}
        public String getPairs() {
		String strPairs="";
		strPairs += "id=" + id + ",";
		strPairs += "desc=" + EncodingHelper.quotate(desc);
		return strPairs;
		
	}
}
