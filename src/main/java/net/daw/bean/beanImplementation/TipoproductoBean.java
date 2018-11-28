/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.daw.bean.beanImplementation;

import java.sql.Connection;
import java.sql.ResultSet;
import net.daw.bean.genericBeanImplementation.GenericBeanImplementation;
import net.daw.bean.publicBeanInterface.BeanInterface;
import net.daw.helper.EncodingHelper;

/**
 *
 * @author a044531896d
 */
public class TipoproductoBean extends GenericBeanImplementation implements BeanInterface{
    	private int id;
	private String desc;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}
        public TipoproductoBean fill(ResultSet oResultSet, Connection oConnection, Integer expand) throws Exception {
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
