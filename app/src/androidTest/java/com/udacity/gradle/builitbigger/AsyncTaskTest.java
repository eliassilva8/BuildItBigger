package com.udacity.gradle.builitbigger;

import android.support.v4.util.Pair;
import android.test.AndroidTestCase;

import com.eliassilva.jokeprovider.JokeProvider;
import com.udacity.gradle.builditbigger.EndpointsAsyncTask;

import org.junit.Test;

import java.util.concurrent.ExecutionException;

/**
 * Created by Elias on 25/05/2018.
 */
public class AsyncTaskTest extends AndroidTestCase{

    @Test
    public void test() {
        JokeProvider jokeProvider = new JokeProvider();
        EndpointsAsyncTask endpointsAsyncTask = new EndpointsAsyncTask();
        endpointsAsyncTask.execute(new Pair(getContext(), jokeProvider.getJoke()));
        try {
            assertNotNull(endpointsAsyncTask.get());
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }
    }
}
