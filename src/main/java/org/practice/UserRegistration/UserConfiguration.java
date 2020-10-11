package org.practice.UserRegistration;

import java.util.Date;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "org.practice.UserRegistration")
public class UserConfiguration {

	@Bean
	public Address address() {
		return new Address.AddressBuilder().setAddressline1("3800 Abc")
											.setCity("Cambridge")
											.setProvince("Ontario")
											.setCountry("Canada")
											.setPostalCode("N1N R1N")
											.build();
	}
	
	@Bean
	public User user() {
		return new User.UserBuilder().setfName("Sahaj")
									 .setlName("Sondhi")
									 .setDob(new Date())
									 .build();
	}
}
