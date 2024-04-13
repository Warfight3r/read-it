package com.blog.readIt;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;
import com.blog.readIt.repository.UserRepository;

@EnableMongoRepositories(basePackages = { "com.blog.readIt.repository"})
@SpringBootApplication(exclude = { SecurityAutoConfiguration.class })
public class ReadItApplication implements CommandLineRunner{
	@Autowired
	private MongoTemplate mongoTemplate;
	
	@Autowired
	private UserRepository userRepository;
	
	public static void main(String[] args) {
		SpringApplication.run(ReadItApplication.class, args);
	}
	
	@Override
	public void run(String... args) throws Exception {
		System.out.println("-------SHIVAM-----------"+ mongoTemplate.getCollectionNames());
		
		System.out.println(userRepository.findByName("Shivam Dube"));
		
//		System.out.println(userRepository.findByQtyGreaterThan(20));
//		
//		System.out.println(userRepository.findByQtyBetween(15, 30));
//		
//		System.out.println(userRepository.findByQtyLessThanAndGreater(15, 30));
		
//		Query query = new Query();
//		query.addCriteria(Criteria.where("qty").lt(20).gt(15));
//		List<Users> users = mongoTemplate.find(query,Users.class);
//		
//		System.out.println("product : ---"+ users);
	}
}