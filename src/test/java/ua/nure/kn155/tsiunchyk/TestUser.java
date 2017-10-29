package ua.nure.kn155.tsiunchyk;

import java.util.Calendar;
import java.util.Date;

import junit.framework.TestCase;

public class TestUser extends TestCase {
private static final int AGE=19;
private Date date;
private User user;
 
 @Override
 protected void setUp() throws Exception{
	 super.setUp();
	 user=new User();
	 Calendar calendar = Calendar.getInstance() ;
	 calendar.set(1998, Calendar.AUGUST, 2);
	 date=calendar.getTime();
 }
 
 public void testGetFullName(){
	 user.setFirstName("Lev");
	 user.setLastName("Tsiunchyk");
	 assertEquals("Tsiunchyk, Lev",user.getFullName());
 }
 
 public void testGetFullNameNull(){
	 try{
		 user.setLastName("Tsiunchyk");
		 user.getFullName();
		 fail("Missing exception");
	 }catch(IllegalStateException e){
		assertEquals(e.getMessage(),"firstName is null or lastName is null");
	 }
 }
 
 public void testGetAge(){
	 user.setDate(date);
	 assertEquals(AGE, user.getAge());
 }
}
