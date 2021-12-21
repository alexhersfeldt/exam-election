package alexhersfeldt.examelection.Party.Controller;

import alexhersfeldt.examelection.Party.Service.PartyService;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/api/party", produces = MediaType.APPLICATION_JSON_VALUE)
@Api(value = "Parties")
public class PartyController {

    @Autowired
    PartyService partyService;

    @GetMapping(path = "/all")
    public ResponseEntity<?> getAllParties() {
        return new ResponseEntity<>(
                partyService.getAll(),
                HttpStatus.OK
        );
    }
}
