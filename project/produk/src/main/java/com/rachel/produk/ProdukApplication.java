package com.rachel.produk;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class ProdukApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProdukApplication.class, args);
	}

}
