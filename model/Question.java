package fr.doranco.qcmapp.model;

import java.util.List;

public class Question {
    private String question;
    private List<String> responsesList;
    private int correctAnswerIndex;


    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public List<String> getResponsesList() {
        return responsesList;
    }

    public void setResponsesList(List<String> responsesList) {
        this.responsesList = responsesList;
    }

    public int getCorrectAnswerIndex() {
        return correctAnswerIndex;
    }

    public void setCorrectAnswerIndex(int correctAnswerIndex) {
        this.correctAnswerIndex = correctAnswerIndex;
    }
}
