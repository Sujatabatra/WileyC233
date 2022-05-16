package com.sujata.demo;

import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.ApplicationContext;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import com.sujata.entity.Husband;
import com.sujata.entity.Wife;
import com.sujata.persistence.HusbandDao;
import com.sujata.persistence.WifeDao;



@SpringBootApplication
@EntityScan(basePackages = "com.sujata.entity")
@EnableJpaRepositories(basePackages = "com.sujata.persistence")
public class SpringbootDatajpaFirstProjectApplication implements CommandLineRunner{

	@Autowired
	private WifeDao wifeDao;
	@Autowired
	private HusbandDao husbandDao;
	
	public static void main(String[] args) {
		SpringApplication.run(SpringbootDatajpaFirstProjectApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
				
		Wife wife1=new Wife("w001","Wife1");
		Wife wife2=new Wife("w002","Wife2");
		Wife wife3=new Wife("w003","Wife3");
		Wife wife4=new Wife("w004","Wife4");
		
		Husband h1=new Husband(1, "Husband A", wife4);
		Husband h2=new Husband(2, "Husband A", wife3);
		Husband h3=new Husband(3, "Husband A", wife2);
		Husband h4=new Husband(4, "Husband A", wife1);
		
		wifeDao.save(wife1);
		wifeDao.save(wife2);
		wifeDao.save(wife3);
		wifeDao.save(wife4);
		
		husbandDao.save(h1);
		husbandDao.save(h2);
		husbandDao.save(h3);
		husbandDao.save(h4);
	}

}
