package com.educandoweb.course.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.educandoweb.course.entities.User;
import com.educandoweb.course.repositories.UserRepository;

@Service
public class UserService {
	
	@Autowired
	private UserRepository repository;
	
	public List<User> findAll(){
		return repository.findAll();
	}
	
	public User findbyId(Long id) {
		Optional<User> obj = repository.findById(id);
		return obj.get();
	}
	
	// inserir usuário
	public User insert(User obj) {
		return repository.save(obj);
	}
	
	// deletar ususário
	public void delete(Long id) {
		repository.deleteById(id);
	}
	
	// atualizar usuário
	public User update(Long id, User obj) {
		User entity = repository.getReferenceById(id); // prepara um objeto monitorado mas não altera o banco de dados
		updateData(entity, obj);
		return repository.save(entity);
	}

	// Criado aumtomaticamente com a correção do metodo update
	private void updateData(User entity, User obj) {
		
		// atenção na atualização não serão atualizados dados como Id e senha (de acordo com esse projeto nesse momento)
		
		entity.setName(obj.getName());
		entity.setEmail(obj.getEmail());
		entity.setPhone(obj.getPhone());
		
	}

}
