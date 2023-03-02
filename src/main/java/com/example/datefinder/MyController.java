package com.example.datefinder;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import java.time.LocalDate;
import java.time.format.*;

@RestController
public class MyController {
    @GetMapping("/")
    static String getDate(){
        LocalDate date = LocalDate.now();
        date = date.plusDays(100);
        DateTimeFormatter format1 = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        String S = date.format(format1);
        return S;
    }
}
