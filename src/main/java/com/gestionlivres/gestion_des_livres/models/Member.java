package com.gestionlivres.gestion_des_livres.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.time.LocalDate;
import java.util.Date;

@Entity
public class Member {

    @Id@GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idMember;
    private String nameMember;
    private String gender;
    private Date dateOfBirthMember;
    private Date joiningDateMember;

    public Member(){
        super();
    }
    public Member(String nameMember, String gender, Date dateOfBirthMember, Date joiningDateMember) {
        this.nameMember = nameMember;
        this.gender = gender;
        this.dateOfBirthMember = dateOfBirthMember;
        this.joiningDateMember = joiningDateMember;
    }

    public Long getIdMember() {
        return idMember;
    }

    public void setIdMember(Long idMember) {
        this.idMember = idMember;
    }

    public String getNameMember() {
        return nameMember;
    }

    public void setNameMember(String nameMember) {
        nameMember = nameMember;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Date getDateOfBirthMember() {
        return dateOfBirthMember;
    }

    public void setDateOfBirthMember(Date dateOfBirthMember) {
        this.dateOfBirthMember = dateOfBirthMember;
    }

    public Date getJoiningDateMember() {
        return joiningDateMember;
    }

    public void setJoiningDateMember(Date joiningDateMember) {
        this.joiningDateMember = joiningDateMember;
    }
}
