package org.pgm.jpademo.repository;

import org.pgm.jpademo.domain.Item;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ItemRepository extends JpaRepository<Item,Long> {

}
