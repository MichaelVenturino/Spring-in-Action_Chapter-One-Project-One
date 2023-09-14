package com.example.chapteroneprojectone;

// Import necessary libraries for the test
import static org.hamcrest.Matchers.containsString;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.view;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.web.servlet.MockMvc;

// Define the test class for HomeController
@WebMvcTest(HomeController.class)
public class HomeControllerTest {

    // Inject the MockMvc instance for performing HTTP requests (GET requests for this version)
    @Autowired
    private MockMvc mockMvc;

    // Define a test case for the home page
    @Test
    public void testHomePage() throws Exception {
        // Perform an HTTP GET request to the root ("/") of the application
        mockMvc.perform(get("/"))

                // Assert that the HTTP response status is OK (200)
                .andExpect(status().isOk())

                // Assert that the view name returned is "home"
                .andExpect(view().name("home"))

                // Assert that the content of the response contains the specified text
                .andExpect(content().string(
                        containsString("Welcome to...")));
    }
}
