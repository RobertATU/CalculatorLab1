package ie.atu.lab1_calculator;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class CalculatorController {
    @GetMapping("/calculate")
    public String calculate(@RequestParam int num1,@RequestParam int num2, @RequestParam String operation){
        return "Operation: " + operation + " Total: " + operation(num1, num2, operation);
    }
    public int operation(int num1,int num2,String op){
        switch(op){

            case "add": num1 = num1 + num2;
            break;
            case "subtract": num1 = num1 - num2;
            break;
            case "multiply": num1 = num1 * num2;
            break;
            case "divide": num1 = num1 / num2;
            break;
        }
        return num1;
    }
    @GetMapping("/calculate/{num1}/{num2}/{operation}")
    public String greetByName(@PathVariable int num1,@PathVariable int num2,@PathVariable String operation ){
        return "Operation: " + operation + " Total: " + operation(num1, num2, operation);
    }

}
