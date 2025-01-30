package br.thullyoo.microservice_receive_vote.repository;

import br.thullyoo.microservice_receive_vote.model.Vote;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface VoteRepository extends JpaRepository<Vote, UUID> {
}
