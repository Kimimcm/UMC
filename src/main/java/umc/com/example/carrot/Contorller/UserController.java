package umc.com.example.carrot.Contorller;
import umc.com.example.carrot.entity.User;
import umc.com.example.carrot.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RequiredArgsConstructor
@RestController
public class UserController {

    private final UserService userService;


    @RequestMapping("/")
    public String index() {
        return "Hello!";
    }

    @PostMapping("/users")
    public Long create(@RequestBody User user) {
        return userService.save(user);
    }

    @GetMapping("/users/{id}")
    public User read(@PathVariable Long id) {
        return userService.findById(id);
    }

    @PostMapping("/users/{id}/update")
    public Long update(@PathVariable Long id, @RequestBody User user) {
        return userService.update(id, user);
    }

    @PostMapping("/users/{id}/delete")
    public Long delete(@PathVariable Long id) {
        userService.delete(id);
        return id;
    }
}