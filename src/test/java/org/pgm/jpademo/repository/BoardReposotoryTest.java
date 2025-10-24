package org.pgm.jpademo.repository;

import lombok.extern.log4j.Log4j2;
import org.junit.jupiter.api.Test;
import org.pgm.jpademo.domain.Board;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;

import java.util.List;

@SpringBootTest
@Log4j2
public class BoardReposotoryTest {
    @Autowired
    private BoardRepository boardRepository;

    @Test
    public void SearchBoard(){
        Pageable pageable=PageRequest.of(0,5, Sort.by("bno").descending());
        Page<Board> result=boardRepository.search1(pageable);
        List<Board> boards=result.getContent();
        for(Board board:boards){
            log.info(board.toString());
        }
        log.info(result.stream().count());
        log.info(result.getSize());
    }

    @Test
    public void insertBoard() {
        Board board = Board.builder()
                .title("title1")
                .content("content1")
                .author("user00")
                .build();
        boardRepository.save(board);
    }
    @Test
    public void findLikeAll() {
//        List<Board> boards = boardRepository.findByTitleAndContent("2");
//        for (Board board : boards) {
//            log.info(board);
//        }
    }
}
