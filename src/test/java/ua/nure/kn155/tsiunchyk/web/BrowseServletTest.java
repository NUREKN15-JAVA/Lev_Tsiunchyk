package test.java.ua.nure.kn155.tsiunchyk.web;

import main.java.ua.nure.kn155.tsiunchyk.servlet.BrowseServlet;
import main.java.ua.nure.kn155.tsiunchyk.User;
import org.junit.Assert;
import org.junit.Test;

import java.util.Collection;
import java.util.Collections;
import java.util.Date;
import java.util.List;

public class BrowseServletTest extends MockServletTestCase {
    @Override
    protected void setUp() throws Exception {
        super.setUp();
        createServlet(BrowseServlet.class);
    }

    @Test
    public void testBrowse() {
        User user = new User(1000L, "Lev", "Tsiunchyk", new Date());
        List list = Collections.singletonList(user);
        getMockUserDAO().expectAndReturn("findAll", list);
        Collection collection = (Collection) getWebMockObjectFactory().getMockSession().getAttribute("users");
        Assert.assertNotNull("Couldn't find list of users in session", collection);
        Assert.assertSame(list, collection);
    }
}