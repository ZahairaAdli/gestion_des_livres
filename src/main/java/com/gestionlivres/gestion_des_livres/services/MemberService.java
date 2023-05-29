package com.gestionlivres.gestion_des_livres.services;

import com.gestionlivres.gestion_des_livres.models.Member;

import java.util.List;

public interface MemberService {
    Member saveMember(Member member);
    Member updateMember(Member member);
    Member getMember(Long id);
    List<Member>getAllMembers();

    void deleteMemberById(Long id);
    void deleteAllMembers();
}
