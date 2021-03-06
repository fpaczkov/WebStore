package com.packt.webstore.domain.repository.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.packt.webstore.domain.Customer;
import com.packt.webstore.domain.repository.CustomerRepository;

@Repository
public class InMemoryCustomerRepository implements CustomerRepository{

	private List<Customer> listOfCustomers = new ArrayList<Customer>();
	
	public InMemoryCustomerRepository() {
		Customer JanKowalski = new Customer("C1234","Jan Kowalski", "Warszawska 1");
		JanKowalski.setNoOfOrdersMode(true);

		Customer MichalWisniewski = new Customer("C1234","Michal Wisniewski", "Warszawska 1");
		MichalWisniewski.setNoOfOrdersMode(true);
		
		listOfCustomers.add(JanKowalski);
		listOfCustomers.add(MichalWisniewski);
	}
	
	public List<Customer> getAllCustomers(){
		return listOfCustomers;
	}
	
	public Customer getCustomerByName(String name){
		for(Customer customer: listOfCustomers){
			if(customer.getName().equalsIgnoreCase(name)){
				return customer;
			}
		}
		return null;
	}
}
