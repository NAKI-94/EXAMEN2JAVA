package co.com.ps.C22JA.service;

import co.com.ps.C22JA.entity.Usuario;
import co.com.ps.C22JA.repositorio.UsuarioRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
@RequiredArgsConstructor
public class UsuarioService implements IUsuarioService {

    private final UsuarioRepository usuarioRepository;
    @Override
    public Usuario getUsuario(Long id) {
        return usuarioRepository.getReferenceById(id);
    }

    @Override
    public List<Usuario> getAllUsuario() {
        return usuarioRepository.findAll();
    }

    @Override
    public Usuario saveUsuario(Usuario usuario) {
        return usuarioRepository.save(usuario);
    }

    @Override
    public Usuario updateUsuario(Usuario usuario) {
        Usuario p=  usuarioRepository.getReferenceById(usuario.getId());
        p.setNombre(usuario.getNombre());
        p.setEmail(usuario.getEmail());

        if (p==null){
            return null;
        } else {
            return usuarioRepository.save(usuario);
        }
    }

    @Override
    public void deleteUsuario(Long id) {
        usuarioRepository.deleteById(id);
    }
}
