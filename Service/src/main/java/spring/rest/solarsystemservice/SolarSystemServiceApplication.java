package spring.rest.solarsystemservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class SolarSystemServiceApplication {

    public static void main(String[] args) {

        SpringApplication.run(SolarSystemServiceApplication.class, args);
    }

}
