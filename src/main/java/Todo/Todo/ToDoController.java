package Todo.Todo;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ToDoController {


    @GetMapping("/")
    public String getToDo(){
        return "To-do Application !";
    }
}
