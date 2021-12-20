package alexhersfeldt.examelection.Candidate.DTO;

import alexhersfeldt.examelection.Party.DTO.PartyDTO;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class CandidateDTO {
    String name;
    PartyDTO partyDTO;
}