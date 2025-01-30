package br.thullyoo.microservice_receive_vote.services;

import br.thullyoo.microservice_receive_vote.model.PersonVote;
import br.thullyoo.microservice_receive_vote.repository.PersonVoteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonVoteService {

    @Autowired
    private PersonVoteRepository personVoteRepository;

    public PersonVote register(PersonVote personVote){
        personVoteRepository.save(personVote);
        return personVote;
    }

}
