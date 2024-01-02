package tu.nd207638.demospring1;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController()
public class GoodbyeController {
    @RequestMapping("/")
    public String sayGoodbye(){
        String name = "Tu";
        String  html = "<h2>{{name}}</h2>";
        html = html.replace("{{name}}","Tu");
        html = html.replace("h2","h6");
        return html;
    }
}
