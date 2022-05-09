package fr.doranco.qcmapp.metier;

import java.util.List;

import fr.doranco.qcmapp.activity.*;
import fr.doranco.qcmapp.model.Question;
import fr.doranco.qcmapp.repo.IQuestionBank;
import fr.doranco.qcmapp.repo.ImpQuestionBank;

public final class DataQuiz {

    public static  IQuestionBank QuestionBank = new ImpQuestionBank();

}
