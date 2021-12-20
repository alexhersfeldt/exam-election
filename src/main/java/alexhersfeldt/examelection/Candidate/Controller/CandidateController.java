package alexhersfeldt.examelection.Candidate.Controller;


import alexhersfeldt.examelection.Candidate.DTO.AddCandidateDTO;
import alexhersfeldt.examelection.Candidate.DTO.EditCandidateDTO;
import alexhersfeldt.examelection.Candidate.Service.CandidateService;
import alexhersfeldt.examelection.Candidate.Service.CandidateServiceImpl;
import alexhersfeldt.examelection.Party.Service.PartyService;
import alexhersfeldt.examelection.Party.Service.PartyServiceImpl;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "/api/candidate", produces = MediaType.APPLICATION_JSON_VALUE)
@Api(value = "Candidates")
public class CandidateController {


    @Autowired
    CandidateServiceImpl candidateService;
    @Autowired
    PartyServiceImpl partyService;




    @GetMapping("/{id}")
    private ResponseEntity<?> getCandidate(@PathVariable int id) {
        return new ResponseEntity<>(
                candidateService.getCandidate(id),
                HttpStatus.OK
        );
    }

    @GetMapping("/all")
    private ResponseEntity<?> getCandidates() {
        return new ResponseEntity<>(
                candidateService.getAllCandidates(),
                HttpStatus.OK
        );
    }

    @GetMapping("/party-{id}")
    private ResponseEntity<?> getCandidatesByParty(@PathVariable int id) {
        return new ResponseEntity<>(
                candidateService.getAllCandidatesByParty(partyService.getById(id)),
                HttpStatus.OK
                );
    }

    @PostMapping("/add")
    private ResponseEntity<?> addCandidate(@RequestBody AddCandidateDTO dto) {
        return new ResponseEntity<>(
                candidateService.addCandidate(dto),
                HttpStatus.CREATED
        );
    }

    @PutMapping("/edit/{id}")
    private ResponseEntity<?> editCandidate(@RequestBody EditCandidateDTO dto, @PathVariable int id) {
        return new ResponseEntity<>(
                candidateService.editCandidate(dto, id),
                HttpStatus.OK
        );
    }

    @DeleteMapping("/delete/{id}")
    private void deleteCandidate(@PathVariable int id){
        candidateService.deleteCandidate(id);
        }

}
