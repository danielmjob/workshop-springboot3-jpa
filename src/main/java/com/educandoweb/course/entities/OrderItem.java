package com.educandoweb.course.entities;

import java.io.Serializable;
import java.util.Objects;

import com.educandoweb.course.entities.pk.OrderItemPK;
import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;


@Entity
@Table(name = "tb_order_item")
public class OrderItem implements Serializable{
	
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private OrderItemPK id = new OrderItemPK(); 
						// Vindo da classe auxiliar de chave primária composta, deve ser criada e ja instanciada 
								//	atenção para as particularidades dela nesse código
									// como a ausencia dela no construtor e nos gets/sets (acesso será indireto)
	

	private Integer quantity;
	private Double price;
	
	public OrderItem() {
		
	}
	
	// quando for gerar o construtor automático, não colocar o Id
		// pois a forma correta nesse caso é inserir as duas classes originais e não a auxiliar(Order e Product)
			// conforme feito abaixo
				// lembrando que esses atributos no construtor estão acessando a classe auxiliar e não as classes principais

	public OrderItem(Order order, Product product, Integer quantity, Double price) {
		super();
		id.setOrder(order);
		id.setProduct(product);
		this.quantity = quantity;
		this.price = price;
	}
	
	//quando for gerar os gets/sets automáticos, não colocar o Id
		// mesmo não tendo diretamente as declaração das classes Order e Product
			// ha uma forma de fazer o get e set delas conforme feito abaixo
				// lembrando que esses gets/sets estão acessando a classe auxiliar e não as classes principais
	
	@JsonIgnore // para evitar loop infinito
	public Order getOrder(){
		return id.getOrder();
	}
	
	public void setOrder(Order order) {
		id.setOrder(order);
	}
	
	
	public Product getProduct(){
		return id.getProduct();
	}
	
	public void setProduct(Product product){
		id.setProduct(product);
	}
	
	// gets/sets normais da classe
	
	public Integer getQuantity() {
		return quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}
	
	// Deve usar o nome get no metodo devido a plataforma java enterprise só entender dessa forma
	public Double getSubTotal() {
		return price * quantity;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		OrderItem other = (OrderItem) obj;
		return Objects.equals(id, other.id);
	}
	
	
	
}
