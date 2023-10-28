package org.browniesygalletas.repositorio;

import org.browniesygalletas.modelo.Adiciones;
import org.browniesygalletas.modelo.Factura;
import org.browniesygalletas.modelo.Pedido;
import org.browniesygalletas.modelo.Producto;

import java.util.List;

public abstract class  ServiceUtil implements CrudFullRepositorio {
    @Override
    public void crearProducto(Producto producto) {

    }

    @Override
    public void eliminarProducto(Producto producto) {

    }

    @Override
    public List<Producto> listarProductos() {
        return null;
    }

    @Override
    public void modificarProducto(Producto producto) {

    }

    @Override
    public Producto obtenerProductoPorId(Integer id) {
        return null;
    }

    @Override
    public void crearAdicion(Adiciones adicion) {

    }

    @Override
    public void eliminarAdicion(Adiciones adicion) {

    }

    @Override
    public List<Adiciones> listarAdiciones() {
        return null;
    }

    @Override
    public void modificarAdiciones(Adiciones adicion) {

    }

    @Override
    public Adiciones obtenerAdicionPorId(Integer id) {
        return null;
    }

    @Override
    public Factura obtenerFacturaPorId(Integer id) {
        return null;
    }

    @Override
    public void crearPedido(Pedido pedido) {

    }
}
