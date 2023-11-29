package vn.edu.iuh.fit.week_05.backend.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import vn.edu.iuh.fit.week_05.backend.models.Candidate;
import vn.edu.iuh.fit.week_05.backend.repositories.CandidateRepository;

import java.util.List;

@RestController
@RequestMapping("/api/v1")
public class CandidateResource {
    @Autowired
    private CandidateRepository repository;
    @GetMapping("/candidates")
    public ResponseEntity<List<Candidate>> getAll(){
        List<Candidate> candidates = repository.findAll();
        if(candidates.isEmpty()){
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }
        return new ResponseEntity<List<Candidate>>(candidates, HttpStatus.OK);
    }
}
