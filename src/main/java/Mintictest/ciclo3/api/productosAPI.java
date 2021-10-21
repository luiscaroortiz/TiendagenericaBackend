package Mintictest.ciclo3.api;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import Mintictest.ciclo3.dao.productosDAO;
import Mintictest.ciclo3.model.productos;


@RestController
@RequestMapping ("productos")
public class productosAPI {
	
	@Autowired
	private productosDAO productosDAO;
	
	@PostMapping ("/guardar")
	public void guardar(@RequestBody productos productos) {
		productosDAO.save(productos);
		
	}
	
	@GetMapping("/listar")
	public List <productos> listar(){
		return productosDAO.findAll();
		
	}
	
	@DeleteMapping ("/eliminar/{id}")
	public void eliminar (@PathVariable ("id") Long id) {
		productosDAO.deleteById(id);
	}

	@PutMapping ("/actualizar")
	public void actualizar (@RequestBody productos productos) {
		productosDAO.save(productos);
	}

}
