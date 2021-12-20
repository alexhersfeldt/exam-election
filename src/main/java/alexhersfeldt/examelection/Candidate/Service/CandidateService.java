package alexhersfeldt.examelection.Candidate.Service;

import alexhersfeldt.examelection.Candidate.DTO.AddCandidateDTO;
import alexhersfeldt.examelection.Candidate.DTO.CandidateDTO;
import alexhersfeldt.examelection.Candidate.DTO.EditCandidateDTO;
import alexhersfeldt.examelection.Candidate.Entity.Candidate;
import alexhersfeldt.examelection.Party.DTO.PartyDTO;
import alexhersfeldt.examelection.Party.Entity.Party;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface CandidateService {
    CandidateDTO getCandidate(int id);
    List<CandidateDTO> getAllCandidatesByParty(PartyDTO partydto);
    List<CandidateDTO> getAllCandidates();
    AddCandidateDTO addCandidate(AddCandidateDTO dto);
    EditCandidateDTO editCandidate(EditCandidateDTO dto, int id);
    void deleteCandidate(int id);


}
