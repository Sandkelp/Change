package CloudControl.ChangeAPI;

import org.springframework.web.bind.annotation.RestController;

import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.PathVariable;

import org.springframework.web.bind.annotation.RequestMethod;


@RestController

public class ChangeController {

    @RequestMapping(value = "/change/{dollarVal}/{centVal}", method = RequestMethod.GET)

    
    public Change change(@PathVariable("dollarVal") int dollarVal, @PathVariable("centVal") int centVal){

        return new Change(dollarVal, centVal);

    }
    
}
