package roboto;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by xhan91 on 2017-04-25.
 */
@RestController
public class Controller {

    @RequestMapping(value = "/roboto", method = RequestMethod.GET)
    public String robotoo() {
        return "I'm roboto!";
    }

    @RequestMapping(value = "/roboto", method=RequestMethod.POST)
    public String roboto(@RequestParam("payload") String payload) {
        String command = payload.split(" ")[0];
        switch (command) {
            case "roll":
                return "100";
        }
        return "not roll";
    }

}
