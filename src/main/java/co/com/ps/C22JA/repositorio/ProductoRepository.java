package co.com.ps.C22JA.repositorio;

import co.com.ps.C22JA.entity.Producto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductoRepository  extends JpaRepository<Producto,Long> {
}
