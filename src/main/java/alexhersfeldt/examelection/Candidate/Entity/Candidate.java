package alexhersfeldt.examelection.Candidate.Entity;

import alexhersfeldt.examelection.Party.Entity.Party;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "Candidate")
public class Candidate {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(nullable = false)
    private String name;

    @Column
    private int votes;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "partyId", referencedColumnName = "id")
    private Party party;

}
