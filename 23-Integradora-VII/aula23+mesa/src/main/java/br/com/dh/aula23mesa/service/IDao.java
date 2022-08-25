package br.com.dh.aula23mesa.service;

import java.util.List;

public interface IDao<T> {
    T salvar(T t);
    List<T> buscarTodos();
    String excluir(Integer id);
}