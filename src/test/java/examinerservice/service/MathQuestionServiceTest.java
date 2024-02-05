package examinerservice.service;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoExtension;
import pro.sky.java.course2.examinerservice.exceptions.MethodNotAllowedException;
import pro.sky.java.course2.examinerservice.model.Question;
import pro.sky.java.course2.examinerservice.service.MathQuestionService;


import static org.assertj.core.api.Assertions.assertThatExceptionOfType;

@ExtendWith(MockitoExtension.class)
class MathQuestionServiceTest {

    @InjectMocks
    private MathQuestionService mathQuestionService;

    @Test
    void add() {
        assertThatExceptionOfType(MethodNotAllowedException.class).isThrownBy(() -> mathQuestionService.add("2+2= ", "4"));
    }
    @Test
    void addObj() {
        assertThatExceptionOfType(MethodNotAllowedException.class).isThrownBy(() -> mathQuestionService.add(new Question("2+2= ", "4")));
    }
    @Test
    void remove() {
        assertThatExceptionOfType(MethodNotAllowedException.class).isThrownBy(() -> mathQuestionService.remove(new Question("2+2= ", "4")));
    }
    @Test
    void getAll() {
        assertThatExceptionOfType(MethodNotAllowedException.class).isThrownBy(() -> mathQuestionService.getAll());
    }

}