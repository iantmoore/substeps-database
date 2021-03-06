package com.technophobia.substeps.database.runner;

import java.sql.Connection;

/**
 * Holder of database connections
 */
public interface DatabaseConnectionContext {

    Connection getConnection();

    void destroy();

}
