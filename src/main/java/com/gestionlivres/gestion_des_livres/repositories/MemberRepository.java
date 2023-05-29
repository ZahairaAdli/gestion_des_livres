package com.gestionlivres.gestion_des_livres.repositories;

import com.gestionlivres.gestion_des_livres.models.Member;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MemberRepository extends JpaRepository<Member, Long> {
}
