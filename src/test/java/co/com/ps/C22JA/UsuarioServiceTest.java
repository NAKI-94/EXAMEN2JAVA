package co.com.ps.C22JA;


import co.com.ps.C22JA.entity.Usuario;
import co.com.ps.C22JA.repositorio.UsuarioRepository;

import co.com.ps.C22JA.service.UsuarioService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class UsuarioServiceTest {
    private UsuarioRepository usuarioRepository;
    private UsuarioService usuarioService;

    @BeforeEach
    public void setUp() {
        usuarioRepository = mock(UsuarioRepository.class);
        usuarioService = new UsuarioService(usuarioRepository);
    }

    @Test
    public void testGetUsuario() {
        Usuario usuario = new Usuario();
        usuario.setId(1L);
        usuario.setNombre("Producto de prueba");


        when(usuarioRepository.getReferenceById(1L)).thenReturn(usuario);

        Usuario resultado = usuarioService.getUsuario(1L);

        assertNotNull(resultado);
        assertEquals("Producto de prueba", resultado.getNombre());
        assertEquals(100.0, resultado.getNombre());
    }

    @Test
    public void testGetAllUsuario() {
        List<Usuario> listaUsuario = new ArrayList<>();
        listaUsuario.add(new Usuario(1L,"cristhian", "quina@gmail.com"));
        listaUsuario.add(new Usuario(2L,"david","quina@gmail.com"));

        when(usuarioRepository.findAll()).thenReturn(listaUsuario);

        List<Usuario> resultado = usuarioService.getAllUsuario();

        assertNotNull(resultado);
        assertEquals(2, resultado.size());
    }
}
