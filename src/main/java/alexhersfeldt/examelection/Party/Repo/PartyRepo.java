package alexhersfeldt.examelection.Party.Repo;

import alexhersfeldt.examelection.Party.Entity.Party;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PartyRepo extends JpaRepository<Party, Integer> {
    Party findById(int id);
}
