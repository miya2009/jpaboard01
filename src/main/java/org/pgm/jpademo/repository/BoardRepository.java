package org.pgm.jpademo.repository;


import org.pgm.jpademo.domain.Board;
import org.pgm.jpademo.dto.PageRequestDTO;
import org.pgm.jpademo.repository.search.BoardSearch;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface BoardRepository extends JpaRepository<Board,Long>, BoardSearch {
    //@Query("select b from Board b where b.title like concat('%',:keyword,'%') or b.content like concat('%', :keyword, '%')")
    //List<Board> findByTitleAndContent(String keyword);

    @Query("select b from Board b where b.title like concat('%',:keyword,'%') or b.content like concat('%', :keyword, '%')")
    Page<Board> findKeyword(String keyword, Pageable pageable);
}
