package com.vitormwxn.desafio01;

import com.vitormwxn.desafio01.entities.Order;
import com.vitormwxn.desafio01.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Locale;
import java.util.Scanner;

@SpringBootApplication
public class Desafio01Application implements CommandLineRunner {

	@Autowired
	private OrderService orderService;

	public static void main(String[] args) {
		SpringApplication.run(Desafio01Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Locale.setDefault(Locale.US);
		Scanner scanner = new Scanner(System.in);

		System.out.println("Entre com o código do pedido");
		int orderCode = scanner.nextInt();
		System.out.println("Entre com o valor básico");
		double basicValue = scanner.nextDouble();
		System.out.println("Entre com a porcentagem de desconto");
		double discount = scanner.nextDouble();

		Order order = new Order(orderCode, basicValue , discount);

		double total = orderService.total(order);

		System.out.println("Pedido código: " + order.getCode());
		System.out.println("Valor total: R$ " + String.format("%.2f", total));

		scanner.close();
	}
}
