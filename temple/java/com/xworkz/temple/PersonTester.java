package com.xworkz.temple;

import java.util.List;

import com.xworkz.temple.entity.PersonEntity;
import com.xworkz.temple.repository.PersonRepository;
import com.xworkz.temple.repository.PersonRepositoryImpl;

public class PersonTester {

	public static void main(String[] args) {
		PersonEntity entity=new PersonEntity(1, "Nikita","nikita.xworkz@gmail.com", 8050172934f);
		PersonEntity entity1=new PersonEntity(2, "Anita","anita.xworkz@gmail.com", 6789087654f);
		PersonEntity entity2=new PersonEntity(3, "Kavya","kavya.xworkz@gmail.com", 6987654328f);
		PersonEntity entity3=new PersonEntity(4, "Madhu","madhu.xworkz@gmail.com", 9876543897f);
		
		PersonRepository person=new PersonRepositoryImpl();
		//person.persist(entity);
	//	person.persist(entity1);
	//	person.persist(entity2);
	//	person.persist(entity3);
		
		//Object obj=person.findByName("Nikita");
	//	System.out.println(obj);
		
		//person.deleteById(4);
		
		List<PersonEntity> per=person.getAll();
		System.out.println(per);
		
		

	}

}
