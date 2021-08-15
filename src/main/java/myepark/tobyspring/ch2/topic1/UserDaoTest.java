package myepark.tobyspring.ch2.topic1;

import java.sql.SQLException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class UserDaoTest {
  public static void main(String[] args) throws ClassNotFoundException, SQLException {
    ApplicationContext context = new GenericXmlApplicationContext("applicationContext.xml");

    UserDao dao = context.getBean("userDao", UserDao.class);

    User user = new User();
    user.setId("user");
    user.setName("백기선");
    user.setPassword("married");

    dao.add(user);

    System.out.println(user.getId() + " 등록 성공");

    User user2 = dao.get(user.getId());
    System.out.println(user.getName());
    System.out.println(user.getPassword());

    System.out.println(user2.getId() + " 조회 성공");
  }
}
