package com.example.demo;

import com.github.javafaker.Faker;
import lombok.SneakyThrows;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.net.InetAddress;
import java.util.ArrayList;
import java.util.List;

@RestController
public class KubernetesController {
    List<String> words = new ArrayList<>();

    @GetMapping
    @SneakyThrows
    public Info getInfo() {
        words.add(new Faker().lorem().sentence(4));
        return new Info(InetAddress.getLocalHost().toString(), words,"new latest");
    }
}
