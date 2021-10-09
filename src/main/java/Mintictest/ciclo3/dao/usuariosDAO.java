package Mintictest.ciclo3.dao;


import Mintictest.ciclo3.model.usuarios;
import org.springframework.data.jpa.repository.JpaRepository;

public interface usuariosDAO extends JpaRepository<usuarios, Long>{
	
}
