package net.youssfi.ecom;

import net.youssfi.ecom.entities.Customer;
import net.youssfi.ecom.entities.Product;
import net.youssfi.ecom.repository.CustomerRepository;
import net.youssfi.ecom.repository.ProductRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class EcomApplication {

    public static void main(String[] args) {
        SpringApplication.run(EcomApplication.class, args);
    }

    @Bean
    CommandLineRunner start(CustomerRepository customerRepository,
                            ProductRepository productRepository) {
        return args -> {
            // Customers
            customerRepository.save(Customer.builder()
                    .name("Mohamed").email("med@gmail.com").build());
            customerRepository.save(Customer.builder()
                    .name("Imane").email("imane@gmail.com").build());
            customerRepository.save(Customer.builder()
                    .name("Yassine").email("yassine@gmail.com").build());

            // Products
            productRepository.save(Product.builder()
                    .name("Computer").price(34000).quantity(12).build());
            productRepository.save(Product.builder()
                    .name("Printer").price(1200).quantity(10).build());
            productRepository.save(Product.builder()
                    .name("Smart Phone").price(11000).quantity(6).build());
        };
    }
}
