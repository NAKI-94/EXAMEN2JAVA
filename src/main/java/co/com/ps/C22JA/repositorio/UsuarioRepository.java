package co.com.ps.C22JA.repositorio;

import co.com.ps.C22JA.entity.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
//
public interface UsuarioRepository  extends JpaRepository<Usuario,Long> {
}
