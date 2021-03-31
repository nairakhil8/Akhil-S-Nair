package com.capgemini.RabbitMQAssignment.Repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.rabbitMQ.Model.Customer;

public interface CustomerRepository extends MongoRepository<Customer, Integer>{

}
