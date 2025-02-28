package com.example.main.dao;

import java.util.List;

public interface IDao<T> {
  T update(T o);
  boolean create(T o);
  boolean delete(int id);
  List<T> findAll();
  T getById(int id);
}
