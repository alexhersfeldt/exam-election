package alexhersfeldt.examelection.Party.Service;


import alexhersfeldt.examelection.Party.DTO.PartyDTO;
import alexhersfeldt.examelection.Party.Entity.Party;
import alexhersfeldt.examelection.Party.Repo.PartyRepo;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class PartyServiceImpl implements PartyService{
    PartyRepo repo;
    ModelMapper modelMapper;

    @Override
    public PartyDTO getById(int id) {
        Party party = repo.findById(id);
        return modelMapper.map(party, PartyDTO.class);
    }

    @Override
    public List<Party> getAll() {
        return repo.findAll();
    }
}
