package pro.sky.java.course2.examinerservice.service;

import org.springframework.stereotype.Service;
import pro.sky.java.course2.examinerservice.model.Question;

import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Service
public class ExaminerServiceImpl implements ExaminerService {
    private final List<QuestionService> questionServices;

    public ExaminerServiceImpl(List<QuestionService> questionServices) {
        this.questionServices = questionServices;
    }

    @Override
    public Collection<Question> getQuestion(int numbersOfQuestions) {
        Set<Question> questionsForExam = new HashSet<>();
        while (questionsForExam.size() < numbersOfQuestions) {
            for (QuestionService q : questionServices) {
                if (questionsForExam.size() < numbersOfQuestions) {
                    questionsForExam.add(q.getRandomQuestion());
                }
            }
        }
        return questionsForExam;
    }
}
