package com.babu.learning.spring.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;

public class DAOImpl {
	@Autowired
	protected JdbcTemplate jdbcTemplate;
}
