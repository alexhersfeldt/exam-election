package alexhersfeldt.examelection.Candidate.DTO;

import alexhersfeldt.examelection.Party.DTO.PartyDTO;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class AddCandidateDTO {
    String name;
    PartyDTO partyDTO;
}
