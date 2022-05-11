package com.company.MonthConverter.controllers;

import com.company.MonthConverter.models.MathSolution;
import org.springframework.http.HttpStatus;
import org.springframework.http.converter.HttpMessageNotReadableException;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@RestController
public class MathSolutionController {

    @RequestMapping(value = "/add", method = RequestMethod.POST)
    @ResponseStatus(value = HttpStatus.OK)
    public MathSolution add(@RequestBody @Valid MathSolution mathSolution){
        try {
            Integer inputOperand1 = mathSolution.getOperand1();
            Integer inputOperand2 = mathSolution.getOperand2();

            if (inputOperand1 == null || inputOperand2 == null){
                throw new NumberFormatException("Value is not a number or blank");
            }

            mathSolution.setOperand1(inputOperand1);
            mathSolution.setOperand2(inputOperand2);
            mathSolution.setOperation("add");
//        mathSolution.setAnswer(inputOperand1 + inputOperand2);
            mathSolution.setAnswer(mathSolution.add(inputOperand1, inputOperand2));
            return mathSolution;
        } catch (HttpMessageNotReadableException e){
            throw e;
        }
    }

    @RequestMapping(value = "/subtract", method = RequestMethod.POST)
    @ResponseStatus(value = HttpStatus.OK)
    public MathSolution subtract(@RequestBody @Valid MathSolution mathSolution){
       try{
        Integer inputOperand1 = mathSolution.getOperand1();
        Integer inputOperand2 = mathSolution.getOperand2();

        if (inputOperand1 == null || inputOperand2 == null){
            throw new NumberFormatException("Value is not a number or blank.");
        }

        mathSolution.setOperand1(inputOperand1);
        mathSolution.setOperand2(inputOperand2);
        mathSolution.setOperation("subtract");
        mathSolution.setAnswer(mathSolution.subtract(inputOperand1,inputOperand2));
        return mathSolution;
    }catch (HttpMessageNotReadableException e){
        throw  e;
        }
    }
    @RequestMapping(value = "/multiply", method = RequestMethod.POST)
    @ResponseStatus(value = HttpStatus.OK)
    public MathSolution multiply(@RequestBody @Valid MathSolution mathSolution){
       try {
           Integer inputOperand1 = mathSolution.getOperand1();
           Integer inputOperand2 = mathSolution.getOperand2();

           if (inputOperand1 == null || inputOperand2 == null) {
               throw new NumberFormatException("Value is not a number or blank");
           }

           mathSolution.setOperand1(inputOperand1);
           mathSolution.setOperand2(inputOperand2);
           mathSolution.setOperation("multiply");
           mathSolution.setAnswer(mathSolution.multiply(inputOperand1, inputOperand2));
           return mathSolution;
       }catch (HttpMessageNotReadableException e){
           throw  e;
       }
    }
    @RequestMapping(value = "/divide", method = RequestMethod.POST)
    @ResponseStatus(value = HttpStatus.OK)
    public MathSolution divide(@RequestBody @Valid MathSolution mathSolution){
        try{
        Integer inputOperand1 = mathSolution.getOperand1();
        Integer inputOperand2 = mathSolution.getOperand2();

        if (inputOperand1 == null || inputOperand2 == null){
            throw new NumberFormatException("Value is not a number or blank");
        }
        if (inputOperand2 == 0){
            throw new IllegalArgumentException("can't divide by zero");
        }

        mathSolution.setOperand1(inputOperand1);
        mathSolution.setOperand2(inputOperand2);
        mathSolution.setOperation("divide");
        mathSolution.setAnswer(mathSolution.divide(inputOperand1,inputOperand2));
        return mathSolution;
    }catch (HttpMessageNotReadableException e){
        throw  e;
        }
    }

}
