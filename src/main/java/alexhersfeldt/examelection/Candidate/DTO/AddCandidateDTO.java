package alexhersfeldt.examelection.Candidate.DTO;

import alexhersfeldt.examelection.Party.Entity.Party;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class AddCandidateDTO {
    String name;
    Party party;
}
