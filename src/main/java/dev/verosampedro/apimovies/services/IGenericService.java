package dev.verosampedro.apimovies.services;

import java.util.List;

import dev.verosampedro.apimovies.messages.Message;

public interface IGenericService<T> {
    public List<T> getAll();
    public T getById(Long id) throws Exception;
    public T save(T obj);
    public T update(Long id, T obj) throws Exception;
    public Message delete (Long id) throws Exception;
    public T getByTitle(String title) throws Exception;
}
