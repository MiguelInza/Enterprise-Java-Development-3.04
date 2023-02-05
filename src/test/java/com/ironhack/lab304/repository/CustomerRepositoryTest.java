package com.ironhack.lab304.repository;

import com.ironhack.lab304.model.Customer;
import com.ironhack.lab304.model.CustomerStatus;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
class CustomerRepositoryTest {

    private Customer testCustomer;
    @Autowired
    CustomerRepository customerRepository;

    @BeforeEach
    void setUp() {
        testCustomer = new Customer("Paco Paquito", CustomerStatus.SILVER);
    }

    @AfterEach
    void tearDown() {
        customerRepository.deleteById(testCustomer.getId());
    }

    @Test
    public void createCustomer_validCustomer_addedToDatabase() {
        //Customer customer = new Customer("David", CustomerStatus.GOLD);
        //customerRepository.save(customer);
        customerRepository.save(testCustomer);

        // Para recuperar de base de datos. Asi se coge un elemento de la base de datos con ese Id
        // Los optionals son como una promesa. El motivo es q no sabemos si nos van a delver algo
        //Optional<Customer> foundCustomer = customerRepository.findById(customer.getId());
        Optional<Customer> foundCustomer = customerRepository.findById(testCustomer.getId());
        assertTrue(foundCustomer.isPresent());
        //assertEquals("Paco Paquito", foundCustomer.get().getName());
        assertEquals(testCustomer.getName(), foundCustomer.get().getName());

        //customerRepository.deleteById(customer.getId());
    }


}