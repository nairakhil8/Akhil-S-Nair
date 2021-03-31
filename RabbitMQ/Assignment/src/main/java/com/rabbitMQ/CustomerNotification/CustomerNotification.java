package com.rabbitMQ.CustomerNotification;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.rabbitMQ.Config.MessageConfig;
import com.rabbitMQ.Model.Customer;
import com.rabbitMQ.Repository.CustomerRepository;


@Component
public class CustomerNotification {
	
	@Autowired
	private CustomerRepository repository;

	@RabbitListener(queues=MessageConfig.QUEUE)
	public void consumeMessageFromQueue(Customer customer){
		repository.save(customer);
		
	}
}
