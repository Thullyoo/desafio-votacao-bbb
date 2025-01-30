package br.thullyoo.microservice_receive_vote.services;

import br.thullyoo.microservice_receive_vote.consumer.VoteConsumer;
import br.thullyoo.microservice_receive_vote.dto.PersonByVote;
import br.thullyoo.microservice_receive_vote.dto.VoteReceive;
import br.thullyoo.microservice_receive_vote.model.PersonVote;
import br.thullyoo.microservice_receive_vote.model.Vote;
import br.thullyoo.microservice_receive_vote.repository.PersonVoteRepository;
import br.thullyoo.microservice_receive_vote.repository.VoteRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Optional;

@Service
public class VoteService {

    @Autowired
    private VoteRepository voteRepository;

    @Autowired
    private PersonVoteRepository personVoteRepository;


    @Transactional
    public Vote registerVote(VoteReceive voteReceive){

        voteRepository.findAll().forEach(p -> {
            if(Objects.equals(p.getDocument(), voteReceive.document())){
                throw new RuntimeException("User already voted");
            }
        });

        Optional<PersonVote> personVote = personVoteRepository.findById(voteReceive.id());

        if(personVote.isEmpty()){
            throw new RuntimeException("PersonVote not exists");

        }

        Vote vote = new Vote();
        vote.setPerson(personVote.get());
        vote.setDocument(voteReceive.document());

        voteRepository.save(vote);

        return voteRepository.save(vote);
    }

    public List<PersonByVote> getPersonByVote(){
        List<PersonVote> personVoteList = personVoteRepository.findAll();
        List<PersonByVote> personByVoteList = new ArrayList<>();
        List<Vote> voteList = voteRepository.findAll();
        for (PersonVote personVote : personVoteList){
            int quantityVotes = 0;
            for (Vote vote : voteList){
                if (vote.getPerson().getId() == personVote.getId()){
                    quantityVotes++;
                }
            }
            personByVoteList.add(new PersonByVote(personVote.getName(), quantityVotes));
        }
        return personByVoteList;
    }

}
