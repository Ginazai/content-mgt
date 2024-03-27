package ul.programacionVII.Repositorios;

import org.springframework.data.jpa.repository.JpaRepository;

import ul.programacionVII.Entidades.ContenidoEntidad;

public interface ContenidoRepositorio extends JpaRepository<ContenidoEntidad, Long>{
	
}
