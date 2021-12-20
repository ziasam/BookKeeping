package com.fproject.crudoperationspringboot.repository;

import org.springframework.data.repository.CrudRepository;
import com.fproject.crudoperationspringboot.model.Books;
//repository that extends CrudRepository
public interface BooksRepository extends CrudRepository<Books, Integer>
{
}