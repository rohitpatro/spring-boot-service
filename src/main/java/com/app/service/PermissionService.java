package com.app.service;

import com.app.dao.PermissionDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PermissionService {

    @Autowired
    private PermissionDAO permissionDAO;

    public List<String> getTableNames(String schemaName) throws Exception {
        return this.permissionDAO.getTableNames(schemaName);
    }
}
