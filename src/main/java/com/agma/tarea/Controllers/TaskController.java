package com.agma.tarea.Controllers;

import com.agma.tarea.models.Task;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.*;

@RestController
@RequestMapping("/tasks")
public class TaskController {
    // Listado de tareas
    private final List<Task> tasks = new ArrayList<>();

    /** Agregar tarea a la lista */
    @PostMapping("/add")
    public ResponseEntity<Map<String, Object>> addTask(@RequestBody Map<String, String> request) {
        if (!request.containsKey("name") || !request.containsKey("description") || !request.containsKey("status")) {
            return ResponseEntity.badRequest().body(Map.of("message", "Faltan datos en la solicitud"));
        }

        Task task = new Task(request.get("name"), request.get("description"), request.get("status"));
        tasks.add(task);

        Map<String, Object> response = Map.of(
                "message", "Tarea agregada correctamente",
                "task", task
        );

        return ResponseEntity.ok(response);
    }

    /** Listar todas las tareas */
    @GetMapping
    public ResponseEntity<Map<String, Object>> getTasks() {
        Map<String, Object> json = Map.of("tasks", tasks);
        return ResponseEntity.ok(json);
    }
}
