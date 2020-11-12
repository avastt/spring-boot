package br.com.meuprojeto.forum;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.data.web.config.EnableSpringDataWebSupport;

import br.com.meuprojeto.forum.database.Db;

@SpringBootApplication
@EnableSpringDataWebSupport
@EnableCaching
public class ForumApplication {

	public static void main(String[] args) {
		
		Db db = new Db();
		
		db.getConnection();
		
		SpringApplication.run(ForumApplication.class, args);
	}

}
