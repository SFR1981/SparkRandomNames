import spark.ModelAndView;
import spark.template.velocity.VelocityTemplateEngine;

import java.util.ArrayList;
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

            return new ModelAndView(model, "one.vtl");
        }, velocityTemplateEngine);

        get("/two", (req, res) -> {

            HashMap<String, Object> model = new HashMap<>();
            String names = name.getRandomPair();
            model.put("names", names);

            return new ModelAndView(model, "two.vtl");
        }, velocityTemplateEngine);

            get("/:n", (req, res) -> {

            HashMap<String, Object> model = new HashMap<>();
            int number = Integer.parseInt(req.params(":n"));
            ArrayList<String> nameList = new ArrayList<>();
            for (int i = 1; i <= number; i++) {
                nameList.add(name.getRandomName());
            }
            String names = String.join(", " , nameList);
            model.put("result", names);
            return new ModelAndView(model, "result.vtl");
        }, velocityTemplateEngine);


    }
}

