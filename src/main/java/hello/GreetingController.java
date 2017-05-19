package hello;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class GreetingController {
	@Autowired
	PersonRepository repository;
    @RequestMapping("/")
    public String greeting( Model model) {
    	repository.deleteAll();
    	repository.save(new Person("Nowak", "Jakub", "Olkusz"));
    	repository.save(new Person("Nowak", "Michal", "Rzeszow"));
    	repository.save(new Person("Kowal", "Krzysztof", "Nowy Sacz"));
    	repository.save(new Person("Polchlopek", "Mateusz", "Jaslo"));
		model.addAttribute("table", repository.findAll());
		model.addAttribute("table2", repository.findBylname("Nowak"));
		model.addAttribute("table3", repository.findByFnameAndLname("Krzysztof","Kowal"));
        return "greeting";
    }
}