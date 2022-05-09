package fr.doranco.qcmapp.repo;

import java.util.List;

import fr.doranco.qcmapp.model.Question;

public interface IQuestionBank {
    public List<Question> questionsList();

    public Question getNextQuestion(int index);

    public int getTotalOfAllQuestions();


}
