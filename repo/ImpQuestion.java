package fr.doranco.qcmapp.repo;

import java.util.Arrays;
import java.util.List;

import fr.doranco.qcmapp.model.Question;

// produite==> List<Question>
public class ImpQuestion implements IQuestions {


    private Question question1;
    private Question question2;
    private Question question3;
    private Question question4;

    public Question getQuestion1() {
        return question1;
    }

    public Question getQuestion2() {
        return question2;
    }

    public Question getQuestion3() {
        return question3;
    }

    public Question getQuestion4() {
        return question4;
    }

    public void setQuestion1(Question question1) {
        List<String> q1 = Arrays.asList(" Albert LEBRUN", "Paul DOUMER", "Rémé coty", "Paul DOUMER");
        question1.setResponsesList(Arrays.asList(" Albert LEBRUN", "Paul DOUMER", "Rémé coty", "Paul DOUMER"));
        question1.setQuestion("quel est le premier président français de la " +
                "4e République ?");
        question1.setCorrectAnswerIndex(q1.indexOf("Rémé coty"));
        this.question1 = question1;
    }

    public void setQuestion2(Question question2) {

        List<String> q2 = Arrays.asList(" 15", "24", "27", "32");
        question2.setResponsesList(q2);
        question2.setQuestion("combien existe-t-il de pays dans l'Union " +
                "Européen ? ");
        question2.setCorrectAnswerIndex(q2.indexOf("27"));
        this.question2 = question2;
    }

    public void setQuestion3(Question question3) {

        List<String> q3 = Arrays.asList(" l'artchi ", "le silbo", "rotokas",
                "le piraha");
        question3.setResponsesList(q3);
        question3.setQuestion("Quelle est la langue la moins parlée au monde " +
                "?");
        question3.setCorrectAnswerIndex(q3.indexOf("l'artchi"));
        this.question3 = question3;
    }


    public void setQuestion4(Question question4) {

        List<String> q4 = Arrays.asList("USA", "Chine", "Inde", "Indonésie");
        question4.setResponsesList(q4);
        question4.setQuestion("Quel est le pays le plus peuplé du monde ?");
        question4.setCorrectAnswerIndex(q4.indexOf("chine"));
        this.question4 = question4;
    }

    @Override
    public List<Question> GenerateQuestions() {
        List<Question> questionList = Arrays.asList(question1, question2, question3,
                question4);
        return questionList;
    }


}
//int responseIndex = (int) view.getTag();