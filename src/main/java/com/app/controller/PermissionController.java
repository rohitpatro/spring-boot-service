package com.app.controller;

import java.util.List;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.app.service.PermissionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class PermissionController {

	@Autowired
	private PermissionService permissionService;

	
	@RequestMapping(value = "/{schemaName}", produces = MediaType.APPLICATION_JSON_VALUE)
	public List<String> getTableNames(
			@PathVariable("schemaName") @Valid @NotNull(message = "can't be null") String schemaName) throws Exception {
		return this.permissionService.getTableNames(schemaName);
	}

}
