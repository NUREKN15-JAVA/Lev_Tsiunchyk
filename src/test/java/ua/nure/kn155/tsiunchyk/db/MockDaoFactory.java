package test.java.ua.nure.kn155.tsiunchyk.db;

import com.mockobjects.dynamic.Mock;
import main.java.ua.nure.verkhohliad.db.DAOFactory;
import main.java.ua.nure.verkhohliad.db.UserDAO;

public class MockDaoFactory extends DAOFactory {
    private Mock mockUserDAO;

    public MockDaoFactory() {
        mockUserDAO = new Mock(UserDAO.class);
    }

    public Mock getMockUserDAO() {
        return mockUserDAO;
    }

    @Override
    public UserDAO getUserDAO() {
        return (UserDAO) mockUserDAO.proxy();
    }
}