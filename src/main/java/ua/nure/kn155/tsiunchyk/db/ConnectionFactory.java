package ua.nure.kn155.tsiunchyk.db;

import java.sql.Connection;

public interface ConnectionFactory {
   Connection createConnection() throws DataBaseException;
}
