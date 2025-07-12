package org.example.reactiveapp;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import reactor.core.publisher.Mono;

@SpringBootTest
class ReactiveAppApplicationTests {

    @Test
    void contextLoads() {
    }

//Mono -> Publisher that has 0..1 items
    //Mono Created
    @Test
    public void WorkingMono(){
        Mono<String> mono = Mono.just("Hello").log();


        //consumer that subscribes mono
    mono.subscribe(data->{
        System.out.println("Data  is "+data);
    });

    }

}
