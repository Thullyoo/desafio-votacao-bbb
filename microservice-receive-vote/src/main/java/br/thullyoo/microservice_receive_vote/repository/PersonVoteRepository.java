package br.thullyoo.microservice_receive_vote.repository;

import br.thullyoo.microservice_receive_vote.model.PersonVote;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonVoteRepository extends JpaRepository<PersonVote, Integer> {
}
