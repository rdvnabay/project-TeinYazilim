package mini.project.teinyazilim.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import mini.project.teinyazilim.business.abstracts.AuthService;
import mini.project.teinyazilim.entities.dtos.UserForLoginDto;

@RestController
@RequestMapping("/api/auth")
public class AuthController {
    @Autowired
    private AuthService authService;
    public AuthController(AuthService authService) {
        this.authService = authService;
    }

    @PostMapping("/login")
    public ResponseEntity<?> login(@RequestBody UserForLoginDto userForLoginDto){
        return ResponseEntity.ok(this.authService.login(userForLoginDto));
    }
}
