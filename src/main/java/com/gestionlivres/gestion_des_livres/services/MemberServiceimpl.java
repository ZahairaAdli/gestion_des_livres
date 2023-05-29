package com.gestionlivres.gestion_des_livres.services;

import com.gestionlivres.gestion_des_livres.models.Member;
import com.gestionlivres.gestion_des_livres.repositories.MemberRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MemberServiceimpl implements MemberService {

    @Autowired
    MemberRepository memberRepository;
    @Override
    public Member saveMember(Member member) {
        return memberRepository.save(member);
    }

    @Override
    public Member updateMember(Member member) {
        return memberRepository.save(member) ;
    }

    @Override
    public Member getMember(Long id) {
        return memberRepository.findById(id).get();
    }

    @Override
    public List<Member> getAllMembers() {
        return memberRepository.findAll();
    }

    @Override
    public void deleteMemberById(Long id) {
        memberRepository.deleteById(id);

    }

    @Override
    public void deleteAllMembers() {
        memberRepository.deleteAll();

    }
}
