package alexhersfeldt.examelection.Candidate.DTO;

import alexhersfeldt.examelection.Party.Entity.Party;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class CandidateDTO {
    String name;
    Party party;
}