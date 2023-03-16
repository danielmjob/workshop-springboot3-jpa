package com.educandoweb.course.entities.enums;

public enum OrderStatus {

	// Aconselhavel que o codigo seja controlado manualmente para evitar erros posteriores
	
	WAITING_PAYMENT(1),
	PAID(2),
	SHIPPED(3),
	DELIVERED(4),
	CANCELED(5);
	
	private int code;
	
	// Em enums existe um construtor especial que é privado(private) diferente do comum que é publico
	
	private OrderStatus(int code) {
		this.code = code;
	}
	
	public int getCode() {
		return code;
	}
	
	public static OrderStatus valueOf(int code) {
		//percorre todos os valores do OrderStatus
		for (OrderStatus value : OrderStatus.values()) {
			
			if(value.getCode() == code) {
				return value;
			}
			
		}
		
		throw new IllegalArgumentException("Invalid OrderStatus code"); // caso seja informado um código inexistente
	}
	
	
}

