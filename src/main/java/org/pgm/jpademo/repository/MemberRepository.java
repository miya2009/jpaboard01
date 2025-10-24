package org.pgm.jpademo.repository;

import org.pgm.jpademo.domain.Member;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface MemberRepository extends JpaRepository<Member,Long> {
    Member findByName(String name);
    //Member findByUsername(String username);
    List<Member> findByNameLike(String name);


}
