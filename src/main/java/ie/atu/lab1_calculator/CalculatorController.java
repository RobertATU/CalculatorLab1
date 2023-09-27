package ie.atu.lab1_calculator;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class CalculatorController {
    @GetMapping("/calculate")
    public String calculate(@RequestParam int num1,@RequestParam int num2, @RequestParam String operation){
        return "Operation: " + operation + " Total: " + (num1 * num2);
    }

}
