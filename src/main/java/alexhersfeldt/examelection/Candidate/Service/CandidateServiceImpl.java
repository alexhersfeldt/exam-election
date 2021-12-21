package alexhersfeldt.examelection.Candidate.Service;

import alexhersfeldt.examelection.Candidate.DTO.AddCandidateDTO;
import alexhersfeldt.examelection.Candidate.DTO.CandidateDTO;
import alexhersfeldt.examelection.Candidate.DTO.EditCandidateDTO;
import alexhersfeldt.examelection.Candidate.Entity.Candidate;
import alexhersfeldt.examelection.Candidate.Repo.CandidateRepo;
import alexhersfeldt.examelection.Party.DTO.PartyDTO;
import alexhersfeldt.examelection.Party.Entity.Party;
import alexhersfeldt.examelection.Party.Repo.PartyRepo;
import org.modelmapper.ModelMapper;
import org.modelmapper.config.Configuration;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class CandidateServiceImpl implements CandidateService {

    CandidateRepo repo;
    PartyRepo partyRepo;
    ModelMapper modelMapper;


    public CandidateServiceImpl(CandidateRepo repo, PartyRepo partyRepo) {
        this.partyRepo = partyRepo;
        this.repo = repo;
        modelMapper = new ModelMapper();
        modelMapper.getConfiguration()
                .setFieldMatchingEnabled(true)
                .setFieldAccessLevel(Configuration.AccessLevel.PRIVATE);
    }

    @Override
    public CandidateDTO getCandidate(int id) {
        return modelMapper.map((repo.findById(id)), CandidateDTO.class);
    }

    @Override
    public List<CandidateDTO> getAllCandidatesByPartyId(int id) {
        List<Candidate> candidates = repo.findAllByPartyId(id);
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
        Candidate candidate = new Candidate(null,dto.getName(), 0, partyRepo.findById(dto.getPartyId()));
        repo.save(candidate);
        return dto;
    }

    @Override
    public EditCandidateDTO editCandidate(EditCandidateDTO dto, int id) {
        Candidate candidateOrg = repo.findById(id);
        candidateOrg.setName(dto.getName());
        return modelMapper.map(candidateOrg, EditCandidateDTO.class);
    }

    @Override
    public void deleteCandidate(int id) {
        repo.deleteById(id);
    }
}
