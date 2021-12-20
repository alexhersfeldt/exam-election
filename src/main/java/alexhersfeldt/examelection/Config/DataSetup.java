package alexhersfeldt.examelection.Config;

import alexhersfeldt.examelection.Candidate.Repo.CandidateRepo;
import alexhersfeldt.examelection.Party.Repo.PartyRepo;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DataSetup  implements CommandLineRunner {

    PartyRepo partyRepo;
    CandidateRepo candidateRepo;

    public DataSetup(PartyRepo partyRepo, CandidateRepo candidateRepo) {
        this.partyRepo = partyRepo;
        this.candidateRepo = candidateRepo;
    }

    @Override
    public void run(String... args) throws Exception {


    }
}
