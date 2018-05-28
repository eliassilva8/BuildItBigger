package com.udacity.gradle.builitbigger;

import android.test.AndroidTestCase;
import com.udacity.gradle.builditbigger.EndpointsAsyncTask;

import org.junit.Test;

import java.util.concurrent.ExecutionException;

/**
 * Created by Elias on 25/05/2018.
 */
public class AsyncTaskTest extends AndroidTestCase{

    @Test
    public void test() {
        EndpointsAsyncTask endpointsAsyncTask = new EndpointsAsyncTask();
        endpointsAsyncTask.execute(getContext());
        try {
            assertNotNull(endpointsAsyncTask.get());
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }
    }
}
