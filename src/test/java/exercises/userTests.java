package exercises;

import org.junit.jupiter.api.Test;

public class userTests {
    @Test
    void createUserSmokeTest() {

        /************************************************
         * Create a test that will send POST request and check 200 status code
         * body of the request should have closed to real data
         ************************************************/

    }

    @Test
    void createUserTest() {

        /************************************************
         * Create a test that will send POST request and check 200 status code
         * body of the request should have closed to real data
         * also check response has code = 200
         * type = unknown
         * message = not empty string
         ************************************************/

    }

    @Test
    void createUserPojoTest() {

        /************************************************
         * Create a test that will send POST request and check 200 status code
         * body of the request should have closed to real data
         * also check response has code = 200
         * type = unknown
         * message = not empty string
         * Send request body as User object
         ************************************************/

    }

    @Test
    void getUserTest() {

        /************************************************
         * Create a test that will send GET request and check 200 status code
         * send username as path param
         * Check all fields values and that id is any number
         ************************************************/

    }

    @Test
    void getUserExtendedTest() {

        /************************************************
         * Create a test that will send GET request and check 200 status code
         * send username as path param
         * Check all fields values comparing expected and actual users
         ************************************************/

    }

    @Test
    void updateUserTest() {

        /************************************************
         * Create a test that will send POST request to create user
         * Then send PUT request to update it
         * And use GET request to check that all fields actually updated!
         ************************************************/

    }

    @Test
    void deleteUserTest() {

        /************************************************
         * Create a test that will send POST request to create user
         * Then send DELETE request to delete user
         * And use GET request to check that there are no such user!
         ************************************************/

    }
}
