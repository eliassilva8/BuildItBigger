package com.udacity.gradle.builditbigger.backend;

import com.eliassilva.jokeprovider.JokeProvider;
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
    
    @ApiMethod(name = "getJoke")
    public MyBean getJoke() {
        JokeProvider jokeProvider = new JokeProvider();
        MyBean response = new MyBean();
        response.setData(jokeProvider.getJoke());

        return response;
    }

}
