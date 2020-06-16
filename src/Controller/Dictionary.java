package Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
public class Dictionary {
    @GetMapping("/run")
    public String show(){
        String a = "";
        return "/Dictionary";
    }
    @GetMapping("/translate")
    public String run(@RequestParam String english, Model model){
        Map<String, String> hashMap = new HashMap<>();
        hashMap.put("i", "tôi");
        hashMap.put("miss", "nhớ");
        hashMap.put("you", "bạn");
        hashMap.put("as", "giống");
        hashMap.put("well", "như vậy");
        String result = hashMap.get(english);
        if(result != null){
            model.addAttribute("vietnamese", result);
        }
        else{
            model.addAttribute("vietnamese", "have no result");
        }
        return "/Dictionary";
    }
}
