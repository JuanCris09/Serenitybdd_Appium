package starter.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import starter.ui.LoggedInArea;

public class LoggedInQuestions implements Question {
    @Override
    public String answeredBy(Actor actor) {
        return LoggedInArea.welcomeText.resolveFor(actor).getText();
    }
    public static Question<String> value(){
        return new LoggedInQuestions();
    }
}
