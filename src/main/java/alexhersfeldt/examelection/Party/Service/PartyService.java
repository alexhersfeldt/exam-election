package alexhersfeldt.examelection.Party.Service;

import alexhersfeldt.examelection.Party.DTO.PartyDTO;
import alexhersfeldt.examelection.Party.Entity.Party;

import java.util.List;

public interface PartyService {
    PartyDTO getById(int id);
    List<Party> getAll();

}
