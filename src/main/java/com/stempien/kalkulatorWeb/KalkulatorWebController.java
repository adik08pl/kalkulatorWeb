package com.stempien.kalkulatorWeb;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class KalkulatorWebController {
    @GetMapping("kalkulator")
    @ResponseBody
    public String hello(@RequestParam Integer number1,@RequestParam Integer number2, @RequestParam int equation) {
        String answer = "wynik: ";
        switch (equation) {
            case 1:
                answer += number1 + number2;
                break;
            case 2:
                answer += number1 - number2;
                break;
            case 3:
                answer += number1 * number2;
                break;
            case 4:
                if (number2 != 0)
                    answer += (double)(number1 / number2);
                else
                    answer = "Nie można dzielić przez 0";
                break;
            default:
                answer="Error 400 Bad request";
        }
        return answer;
    }
}

