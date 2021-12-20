package alexhersfeldt.examelection.Candidate.Service;

import alexhersfeldt.examelection.Candidate.DTO.AddCandidateDTO;
import alexhersfeldt.examelection.Candidate.DTO.CandidateDTO;
import alexhersfeldt.examelection.Candidate.DTO.EditCandidateDTO;
import alexhersfeldt.examelection.Candidate.Entity.Candidate;
import alexhersfeldt.examelection.Candidate.Repo.CandidateRepo;
import alexhersfeldt.examelection.Party.Entity.Party;
import org.modelmapper.ModelMapper;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import javax.persistence.EntityNotFoundException;
import java.util.List;

@Service
public class CandidateServiceImpl implements CandidateService {

    CandidateRepo repo;
    ModelMapper modelMapper;
    CandidateService service;

    public CandidateServiceImpl(CandidateRepo repo, CandidateService service) {
        this.repo = repo;
        this.service = service;
        modelMapper = new ModelMapper();
    }

    @Override
    public CandidateDTO getCandidate(int id) {

        return null;
    }

    @Override
    public List<CandidateDTO> getAllCandidatesByParty(Party party) {
        return null;
    }

    @Override
    public List<CandidateDTO> getAllCandidates() {
        return null;
    }

    @Override
    public AddCandidateDTO addCandidate(AddCandidateDTO dto) {
        repo.save(modelMapper.map(dto, Candidate.class ));
        return dto;
    }

    @Override
    public EditCandidateDTO editCandidate(EditCandidateDTO dto, int id) {
        Candidate candidateOrg = repo.findById(id);
        candidateOrg.setName(dto.getName());
        candidateOrg.setParty(dto.getParty());
        return modelMapper.map(candidateOrg, EditCandidateDTO.class);
    }


    @Override
    public void deleteCandidate(int id) {
        repo.deleteById(id);
    }
}
