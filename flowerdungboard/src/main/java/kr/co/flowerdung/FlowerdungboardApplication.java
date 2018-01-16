package kr.co.flowerdung;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("kr.co.flowerdung")
public class FlowerdungboardApplication {

	public static void main(String[] args) {
		SpringApplication.run(FlowerdungboardApplication.class, args);
	}
}
