import spark.ModelAndView;
import spark.template.velocity.VelocityTemplateEngine;

import java.util.HashMap;

import static spark.Spark.get;
import static spark.Spark.staticFileLocation;

public class NameController {


    public static void main(String[] args) {
        VelocityTemplateEngine velocityTemplateEngine = new VelocityTemplateEngine();
        staticFileLocation("/public");

        Name name = new Name();


        get("/one", (req, res) -> {

            HashMap<String, Object> model = new HashMap<>();
            String name1 = name.getRandomName();
            model.put("name", name1);
            return new ModelAndView(model, "public/one.vtl");
        }, velocityTemplateEngine);


    }
}

