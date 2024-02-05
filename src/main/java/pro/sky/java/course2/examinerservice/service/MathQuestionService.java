package pro.sky.java.course2.examinerservice.service;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import pro.sky.java.course2.examinerservice.exceptions.MethodNotAllowedException;
import pro.sky.java.course2.examinerservice.model.Question;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Random;

@Service
@Component
public class MathQuestionService implements QuestionService {
    private final Random random = new Random();


    public Question add(String question, String answer) {
        throw new MethodNotAllowedException();
    }

    public Question add(Question question) {
        throw new MethodNotAllowedException();
    }


    public Question remove(Question question) {
        throw new MethodNotAllowedException();
    }


    public Collection<Question> getAll() {
        throw new MethodNotAllowedException();
    }

    @Override
    public Question getRandomQuestion() {
        int value1 = random.nextInt(100);
        int value2 = random.nextInt(100);
        List<Question> questionList = new ArrayList<>(List.of(
                new Question(value1 + " + " + value2 + "=", String.valueOf(value1 + value2)),
                new Question(value1 + " - " + value2 + "=", String.valueOf(value1 - value2)),
                new Question(value1 + " * " + value2 + "=", String.valueOf(value1 * value2)),
                new Question(value1 + " / " + value2 + "=", String.valueOf(value1 / value2)))
        );
        int numberOfQuestions = random.nextInt(questionList.size());
        return questionList.get(numberOfQuestions);
    }
}
