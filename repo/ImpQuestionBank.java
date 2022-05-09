package fr.doranco.qcmapp.repo;

import java.util.List;

import fr.doranco.qcmapp.model.Question;


public class ImpQuestionBank implements IQuestionBank {


    ImpQuestion impQuestion = new ImpQuestion();

    Question question1 = new Question();
    Question question2 = new Question();
    Question question3 = new Question();
    Question question4 = new Question();

    @Override
    public List<Question> questionsList() {
        impQuestion.setQuestion1(question1);
        impQuestion.setQuestion3(question3);
        impQuestion.setQuestion4(question4);
        impQuestion.setQuestion2(question2);


        List<Question> questionList = impQuestion.GenerateQuestions();
        return questionList;
    }

    @Override
    public Question getNextQuestion(int index) {


        Question question = questionsList().get(index);
        return question;
    }

    @Override
    public int getTotalOfAllQuestions() {
        int totalQ = questionsList().size();
        return totalQ;
    }
}
