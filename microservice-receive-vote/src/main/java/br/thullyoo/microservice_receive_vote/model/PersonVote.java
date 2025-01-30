package br.thullyoo.microservice_receive_vote.model;

import jakarta.persistence.*;

@Entity
@Table(name = "TB_PERSONSVOTE")
public class PersonVote {

    @Id
    private int id;

    private String name;

    public PersonVote() {
    }

    public PersonVote(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "PersonVote{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
