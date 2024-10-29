package com.todospring.todospring;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TodoController {

    private static final List<TodoSpring> todoItems = new ArrayList<>();
    static {
        todoItems.add(new TodoSpring("Print list", 1));
        todoItems.add(new TodoSpring("Add new item", 2));
        todoItems.add(new TodoSpring("Remove from list", 3));
        todoItems.add(new TodoSpring("Quit", 4));
    }

    @GetMapping("/todo")
    String getTodo(Model model) {
        model.addAttribute("todoItems", todoItems);
        return "todo";
    }
    
}
