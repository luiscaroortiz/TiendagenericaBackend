package Mintictest.ciclo3.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import Mintictest.ciclo3.dao.usuariosDAO;
import Mintictest.ciclo3.model.usuarios;

import java.util.*;

@RestController
@RequestMapping ("usuarios")
public class usuariosAPI {
	
	@Autowired
	private usuariosDAO usuariosDAO;
	
	@PostMapping ("/guardar")
	public void guardar(@RequestBody usuarios usuarios) {
		usuariosDAO.save(usuarios);
		
	}
	
	@GetMapping("/listar")
	public List <usuarios> listar(){
		return usuariosDAO.findAll();
		
	}
	
	@DeleteMapping ("/eliminar/{id}")
	public void eliminar (@PathVariable ("id") Long id) {
		usuariosDAO.deleteById(id);
	}

	@PutMapping ("/actualizar")
	public void actualizar (@RequestBody usuarios usuarios) {
		usuariosDAO.save(usuarios);
	}
	
}
