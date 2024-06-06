package com.devsuperior.sistema;

import com.devsuperior.sistema.entities.Order;
import com.devsuperior.sistema.services.OrderService;
import com.devsuperior.sistema.services.ShippingService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import java.util.Locale;
import java.util.Scanner;

@SpringBootApplication
@ComponentScan({"com.devsuperior"})
public class SistemaApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(SistemaApplication.class, args);

	}

	@Override
	public void run(String... args) throws Exception {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.println("ENTRADA - DADOS DO PEDIDO");
		System.out.print("Código: ");
		int code = sc.nextInt();
		System.out.print("Valor Básico: ");
		double basic = sc.nextDouble();
		System.out.print("Desconto: ");
		double discount = sc.nextDouble();

		Order order = new Order(code,basic,discount);
		ShippingService shippingService = new ShippingService();
		OrderService orderService = new OrderService(shippingService);

		System.out.println("Saída");
		System.out.printf("Pedido código %d", order.getCode());
		System.out.printf("\nValor Total: R$ %.2f", orderService.total(order));






	}
}
