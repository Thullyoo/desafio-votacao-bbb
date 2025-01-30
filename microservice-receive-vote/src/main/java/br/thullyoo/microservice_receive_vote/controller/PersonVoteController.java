package br.thullyoo.microservice_receive_vote.controller;

import br.thullyoo.microservice_receive_vote.dto.PersonByVote;
import br.thullyoo.microservice_receive_vote.model.PersonVote;
import br.thullyoo.microservice_receive_vote.services.PersonVoteService;
import br.thullyoo.microservice_receive_vote.services.VoteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/person")
public class PersonVoteController {

    @Autowired
    private PersonVoteService personVoteService;

    @Autowired
    private VoteService voteService;

    @PostMapping
    public ResponseEntity<PersonVote> register(@RequestParam int id, String name){
        return ResponseEntity.status(HttpStatus.OK).body(personVoteService.register(new PersonVote(id, name)));
    }

    @GetMapping
    public ResponseEntity<List<PersonByVote>> getAllPersonByVote(){
        return ResponseEntity.status(HttpStatus.OK).body(voteService.getPersonByVote());
    }
}
