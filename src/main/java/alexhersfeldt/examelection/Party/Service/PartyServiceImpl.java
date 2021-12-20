package alexhersfeldt.examelection.Party.Service;


import alexhersfeldt.examelection.Party.DTO.PartyDTO;
import alexhersfeldt.examelection.Party.Repo.PartyRepo;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

@Service
public class PartyServiceImpl implements PartyService{
    PartyRepo repo;
    ModelMapper modelMapper;
    @Override
    public PartyDTO getById(int id) {
        return modelMapper.map(repo.getById(id), PartyDTO.class);
    }
}
