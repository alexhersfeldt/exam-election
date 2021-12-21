package alexhersfeldt.examelection.Candidate.DTO;

import alexhersfeldt.examelection.Party.DTO.PartyDTO;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CandidateDTO {
    String name;
    int partyId;
}