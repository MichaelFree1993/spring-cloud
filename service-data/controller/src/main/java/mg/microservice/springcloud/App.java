package mg.microservice.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.ComponentScan;

/**
 * Hello world!
 *
 */
@SpringBootApplication
@EnableDiscoveryClient
@ComponentScan(basePackages = { "mg.microservice.springcloud"})
public class App 
{
    public static void main( String[] args )
    {

    	SpringApplication.run( App.class, args );
    }
}
