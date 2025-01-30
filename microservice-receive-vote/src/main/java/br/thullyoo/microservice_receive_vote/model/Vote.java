package br.thullyoo.microservice_receive_vote.model;

import br.thullyoo.microservice_receive_vote.dto.VoteReceive;
import jakarta.persistence.*;

import java.util.UUID;

@Entity
@Table(name = "TB_VOTES")
public class Vote{

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    public UUID id;

    public String document;

    @ManyToOne
    @JoinColumn(name = "person_id")
    public PersonVote person;

    public Vote() {
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getDocument() {
        return document;
    }

    public void setDocument(String document) {
        this.document = document;
    }

    public PersonVote getPerson() {
        return person;
    }

    public void setPerson(PersonVote person) {
        this.person = person;
    }

    @Override
    public String toString() {
        return "Vote{" +
                "vote=" + id +
                ", document='" + document + '\'' +
                ", person=" + person +
                '}';
    }
}
