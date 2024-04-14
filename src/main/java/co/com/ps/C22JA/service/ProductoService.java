package co.com.ps.C22JA.service;

import co.com.ps.C22JA.entity.Producto;

import co.com.ps.C22JA.repositorio.ProductoRepository;
import lombok.RequiredArgsConstructor;

import org.springframework.stereotype.Service;

import java.util.List;
@Service
@RequiredArgsConstructor

public class ProductoService implements IProdructoService {

    private final ProductoRepository productoRepository;

    @Override
    public Producto getProducto(Long id) {

        return productoRepository.getReferenceById(id);
    }

    @Override
    public List<Producto> getAllProducto() {
        return productoRepository.findAll();
    }



    @Override
    public Producto saveProducto(Producto producto) {
        return productoRepository.save(producto);
    }

    @Override
    public Producto updateProducto(Producto producto) {
        Producto p=  productoRepository.getReferenceById(producto.getId());
        p.setNombre(producto.getNombre());
        p.setPrecio(producto.getPrecio());

        if (p==null){
            return null;
        } else {
            return productoRepository.save(producto);
        }
    }

    @Override
    public void deleteProducto(Long id) {
        productoRepository.deleteById(id);
    }


}