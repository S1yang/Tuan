package cn.edu.njust.tuan;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = DataSourceAutoConfiguration.class)
public class TuanApplication {

    public static void main(String[] args) {
        SpringApplication.run(TuanApplication.class, args);
    }

}
