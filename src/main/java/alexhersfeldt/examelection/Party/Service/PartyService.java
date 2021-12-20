package alexhersfeldt.examelection.Party.Service;

import alexhersfeldt.examelection.Party.DTO.PartyDTO;

import java.util.List;

public interface PartyService {
    PartyDTO getById(int id);
    List<PartyDTO> getAllParties();

}
