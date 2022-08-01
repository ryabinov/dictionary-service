package ru.sitronics.tn.dictionaryservice.controller.base;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import ru.sitronics.tn.dictionaryservice.model.base.BaseEntityLongId;
import ru.sitronics.tn.dictionaryservice.model.base.Dictionary;

import java.util.List;

public interface CustomDictController <E extends BaseEntityLongId> {
    @GetMapping
    ResponseEntity<List<E>> get();

    @GetMapping("/{id}")
    ResponseEntity<E> get(@PathVariable Long id);

    @PostMapping
    ResponseEntity<E> save(@RequestBody E entity);

    @PatchMapping("/{id}")
    ResponseEntity<E> update(@PathVariable Long id, @RequestBody E entity);

    @DeleteMapping("/{id}")
    ResponseEntity<E> delete(@PathVariable Long id);
}
