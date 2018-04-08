package com.app.dao;

import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.List;

@Repository
@Transactional
public class PermissionDAO {
    @Autowired
    private SessionFactory sessionFactory;

    private Session getSession() {
        return sessionFactory.getCurrentSession();
    }


    public List<String> getTableNames(String schemaName) throws Exception {
        SQLQuery query = this.getSession().createSQLQuery("SELECT table_name FROM information_schema.tables "
                + "WHERE table_type = 'base table' AND table_schema= :schemaName");
        return query.setString("schemaName", schemaName).list();

    }
}
