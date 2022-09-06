package prueba.cinco.uno.interfaces;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import prueba.cinco.uno.datos.Bicicleta;

@Repository
public interface BicicletaRepository extends JpaRepository<Bicicleta, Long> {
}