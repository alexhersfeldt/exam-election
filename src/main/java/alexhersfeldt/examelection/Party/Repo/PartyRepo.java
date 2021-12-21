package alexhersfeldt.examelection.Party.Repo;

import alexhersfeldt.examelection.Party.Entity.Party;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PartyRepo extends JpaRepository<Party, Integer> {
    Party findById(int id);
    Party findByName(String name);
    Party findBySymbol(String symbol);
}
