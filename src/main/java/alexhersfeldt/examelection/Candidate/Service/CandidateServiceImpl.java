package alexhersfeldt.examelection.Candidate.Service;

import alexhersfeldt.examelection.Candidate.DTO.AddCandidateDTO;
import alexhersfeldt.examelection.Candidate.DTO.CandidateDTO;
import alexhersfeldt.examelection.Candidate.DTO.EditCandidateDTO;
import alexhersfeldt.examelection.Candidate.Entity.Candidate;
import alexhersfeldt.examelection.Candidate.Repo.CandidateRepo;
import alexhersfeldt.examelection.Party.DTO.PartyDTO;
import alexhersfeldt.examelection.Party.Entity.Party;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.stream.Collectors;

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
        return modelMapper.map((repo.findById(id)), CandidateDTO.class);
    }

    @Override
    public List<CandidateDTO> getAllCandidatesByParty(PartyDTO partyDTO) {
        List<Candidate> candidates = repo.findAllByParty(modelMapper.map(partyDTO, Party.class));
        return candidates
                .stream()
                .map(candidate -> modelMapper.map(candidate, CandidateDTO.class))
                .collect(Collectors.toList());
    }

    @Override
    public List<CandidateDTO> getAllCandidates() {
        List<Candidate> candidates = repo.findAll();
        return candidates
                .stream()
                .map(candidate -> modelMapper.map(candidate, CandidateDTO.class))
                .collect(Collectors.toList());
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
        candidateOrg.setParty(modelMapper.map((dto.getPartyDTO()), Party.class));
        return modelMapper.map(candidateOrg, EditCandidateDTO.class);
    }

    @Override
    public void deleteCandidate(int id) {
        repo.deleteById(id);
    }
}
