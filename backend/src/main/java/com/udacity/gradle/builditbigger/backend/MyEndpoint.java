package com.udacity.gradle.builditbigger.backend;

import com.example.jokesmithy.JokeSmith;
import com.google.api.server.spi.config.Api;
import com.google.api.server.spi.config.ApiMethod;
import com.google.api.server.spi.config.ApiNamespace;

import javax.inject.Named;

/** An endpoint class we are exposing */
@Api(
        name = "myApi",
        version = "v1",
        namespace = @ApiNamespace(
                ownerDomain = "backend.builditbigger.gradle.udacity.com",
                ownerName = "backend.builditbigger.gradle.udacity.com",
                packagePath = ""
        )
)
public class MyEndpoint {

    /** A simple endpoint method that takes a name and says Hi back */
    @ApiMethod(name = "sayHi")
    public MyBean sayHi(@Named("name") String name) {
        JokeSmith newJoke = new JokeSmith();
        String joke = newJoke.getJoke();
        MyBean response = new MyBean();
        response.setData(joke);
        /*MyBean response = new MyBean();
        response.setData("Hi, " + name);*/

        return response;
    }

    @ApiMethod(name = "getAJoke")
    public MyBean getAJoke() {
        JokeSmith newJoke = new JokeSmith();
        String joke = newJoke.getJoke();
        MyBean response = new MyBean();
        response.setData(joke);

        return response;
    }

    @ApiMethod(name = "hereWeGo")
    public Jokes hereWeGo() {
        String joke = new JokeSmith().getJoke();
        Jokes response = new Jokes();
        response.setJoke(joke);

        return response;
    }

}
