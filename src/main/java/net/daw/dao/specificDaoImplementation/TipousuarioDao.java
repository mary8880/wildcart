package net.daw.dao.specificDaoImplementation;

import java.sql.Connection;
import java.util.ArrayList;
import net.daw.bean.beanImplementation.TipousuarioBean;
import net.daw.dao.genericDaoImplementation.GenericDaoImplementation;
import net.daw.dao.publicDaoInterface.DaoInterface;

public class TipousuarioDao extends GenericDaoImplementation implements DaoInterface {

    public TipousuarioDao(Connection oConnection, String ob) {
        super(oConnection, ob);

    }



}
