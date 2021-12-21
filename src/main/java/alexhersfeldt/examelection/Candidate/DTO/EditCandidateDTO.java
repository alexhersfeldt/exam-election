package alexhersfeldt.examelection.Candidate.DTO;


import alexhersfeldt.examelection.Candidate.Entity.Candidate;
import alexhersfeldt.examelection.Party.DTO.PartyDTO;
import alexhersfeldt.examelection.Party.Entity.Party;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class EditCandidateDTO {
    String name;
}
