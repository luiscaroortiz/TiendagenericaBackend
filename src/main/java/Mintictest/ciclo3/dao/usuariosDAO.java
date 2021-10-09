package Mintictest.ciclo3.dao;


import Mintictest.ciclo3.model.usuarios;
import org.springframework.data.jpa.repository.JpaRepository;
//modificacion de integer a long
public interface usuariosDAO extends JpaRepository<usuarios, Long>{
	
}
