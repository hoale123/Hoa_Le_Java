package com.company.MonthConverter.controllers;

import com.company.MonthConverter.models.MathSolution;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

//import static org.springframework.http.ResponseEntity.status;
//import static org.springframework.test.web.client.match.MockRestRequestMatchers.content;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;


@RunWith(SpringRunner.class)
@WebMvcTest(MathSolutionController.class)
public class MathSolutionControllerTest {

    @Autowired
    private MockMvc mockMvc;

    private ObjectMapper mapper = new ObjectMapper();

    //ADD
    @Test
    public void shouldReturnSumOfTwoNumber() throws Exception{
        MathSolution inputs = new MathSolution();
        inputs.setOperand1(25);
        inputs.setOperand2(5);

        String inputJson = mapper.writeValueAsString(inputs);

        MathSolution outputExpected = new MathSolution(25,5,"add",30);

        String outputJson = mapper.writeValueAsString(outputExpected);

        mockMvc.perform(post("/add")
                .content(inputJson)
                .contentType(MediaType.APPLICATION_JSON)

        )
                .andDo(print())
                .andExpect(status().isOk())
                .andExpect(content().json(outputJson));
    }

    @Test
    public void shouldReturnErrorCode422InvalidRequestMissingOperandAdd() throws Exception{
        MathSolution inputs = new MathSolution();
        inputs.setOperand1(25);

        String inputJson = mapper.writeValueAsString(inputs);

        mockMvc.perform(post("/add")
                        .content(inputJson)
                        .contentType(MediaType.APPLICATION_JSON)

                )
                .andDo(print())
                .andExpect(status().isUnprocessableEntity());
    }


    //Subtract
    @Test
    public void shouldReturnDifferenceOfTwoNumber() throws Exception{
        MathSolution inputs = new MathSolution();
        inputs.setOperand1(25);
        inputs.setOperand2(5);

        String inputJson = mapper.writeValueAsString(inputs);

        MathSolution outputExpected = new MathSolution(25,5,"subtract",20);

        String outputJson = mapper.writeValueAsString(outputExpected);

        mockMvc.perform(post("/subtract")
                        .content(inputJson)
                        .contentType(MediaType.APPLICATION_JSON)

                )
                .andDo(print())
                .andExpect(status().isOk())
                .andExpect(content().json(outputJson));
    }

    @Test
    public void shouldReturnErrorCode422InvalidRequestMissingOperandSubtract() throws Exception{
        MathSolution inputs = new MathSolution();
        inputs.setOperand1(25);

        String inputJson = mapper.writeValueAsString(inputs);


        mockMvc.perform(post("/subtract")
                        .content(inputJson)
                        .contentType(MediaType.APPLICATION_JSON)

                )
                .andDo(print())
                .andExpect(status().isUnprocessableEntity());
    }


    //Multiply
    @Test
    public void shouldReturnMultiplyOfTwoNumber() throws Exception{
        MathSolution inputs = new MathSolution();
        inputs.setOperand1(25);
        inputs.setOperand2(5);

        String inputJson = mapper.writeValueAsString(inputs);

        MathSolution outputExpected = new MathSolution(25,5,"multiply",125);

        String outputJson = mapper.writeValueAsString(outputExpected);

        mockMvc.perform(post("/multiply")
                        .content(inputJson)
                        .contentType(MediaType.APPLICATION_JSON)

                )
                .andDo(print())
                .andExpect(status().isOk())
                .andExpect(content().json(outputJson));
    }

    @Test
    public void shouldReturnErrorCode422InvalidRequestMissingOperandMultiply() throws Exception{
        MathSolution inputs = new MathSolution();
        inputs.setOperand1(25);

        String inputJson = mapper.writeValueAsString(inputs);


        mockMvc.perform(post("/multiply")
                        .content(inputJson)
                        .contentType(MediaType.APPLICATION_JSON)

                )
                .andDo(print())
                .andExpect(status().isUnprocessableEntity());
    }

    //Divide
    @Test
    public void shouldReturnDivisionOfTwoNumber() throws Exception{
        MathSolution inputs = new MathSolution();
        inputs.setOperand1(25);
        inputs.setOperand2(5);

        String inputJson = mapper.writeValueAsString(inputs);

        MathSolution outputExpected = new MathSolution(25,5,"divide",5);

        String outputJson = mapper.writeValueAsString(outputExpected);

        mockMvc.perform(post("/divide")
                        .content(inputJson)
                        .contentType(MediaType.APPLICATION_JSON)

                )
                .andDo(print())
                .andExpect(status().isOk())
                .andExpect(content().json(outputJson));
    }

    @Test
    public void shouldReturnErrorCode422InvalidRequestMissingOperandDivide() throws Exception{
        MathSolution inputs = new MathSolution();
        inputs.setOperand1(25);

        String inputJson = mapper.writeValueAsString(inputs);


        mockMvc.perform(post("/divide")
                        .content(inputJson)
                        .contentType(MediaType.APPLICATION_JSON)

                )
                .andDo(print())
                .andExpect(status().isUnprocessableEntity());
    }

    @Test
    public void shouldReturnCaseDivideByZeroRequest() throws Exception{
        MathSolution inputs = new MathSolution();
        inputs.setOperand1(25);
        inputs.setOperand2(0);

        String inputJson = mapper.writeValueAsString(inputs);


        mockMvc.perform(post("/divide")
                        .content(inputJson)
                        .contentType(MediaType.APPLICATION_JSON)

                )
                .andDo(print())
                .andExpect(status().isUnprocessableEntity());
    }
}
