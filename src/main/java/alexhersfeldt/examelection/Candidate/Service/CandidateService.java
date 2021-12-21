package alexhersfeldt.examelection.Candidate.Service;

import alexhersfeldt.examelection.Candidate.DTO.AddCandidateDTO;
import alexhersfeldt.examelection.Candidate.DTO.CandidateDTO;
import alexhersfeldt.examelection.Candidate.DTO.EditCandidateDTO;
import alexhersfeldt.examelection.Party.DTO.PartyDTO;

import java.util.List;

public interface CandidateService {
    CandidateDTO getCandidate(int id);
    List<CandidateDTO> getAllCandidatesByPartyId(int id);
    List<CandidateDTO> getAllCandidates();
    AddCandidateDTO addCandidate(AddCandidateDTO dto);
    EditCandidateDTO editCandidate(EditCandidateDTO dto, int id);
    void deleteCandidate(int id);
}
