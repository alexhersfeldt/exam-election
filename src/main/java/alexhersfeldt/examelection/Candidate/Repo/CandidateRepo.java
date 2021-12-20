package alexhersfeldt.examelection.Candidate.Repo;

import alexhersfeldt.examelection.Candidate.DTO.CandidateDTO;
import alexhersfeldt.examelection.Candidate.Entity.Candidate;
import alexhersfeldt.examelection.Party.DTO.PartyDTO;
import alexhersfeldt.examelection.Party.Entity.Party;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CandidateRepo extends JpaRepository<Candidate, Integer> {
    Candidate findById(int id);
    List<Candidate> findAllByParty(Party party);
    List<Candidate> findAll();

}
