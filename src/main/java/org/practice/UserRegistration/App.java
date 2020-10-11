package org.practice.UserRegistration;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
		ApplicationContext context = new AnnotationConfigApplicationContext(UserConfiguration.class);
		User user = (User) context.getBean(User.class);
		System.out.println(user.description());
    }
}
