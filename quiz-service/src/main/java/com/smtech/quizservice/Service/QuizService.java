package com.smtech.quizservice.Service;

import com.smtech.quizservice.Dao.QuizDao;
import com.smtech.quizservice.Model.QuestionWrapper;
import com.smtech.quizservice.Model.Quiz;
import com.smtech.quizservice.Model.Responce;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class QuizService {

    @Autowired
    QuizDao quizDao;

    public ResponseEntity<String>createQuiz(String category,int numQ,String String){
        List<Question> questions=quizDao.findRandomQuestionByCategory(category,numQ);

        Quiz quiz=new Quiz();
        quiz.setTitle(title);
        quiz.setQuestions(questions);
        quizDao.save(quiz);

        return new ResponseEntity<>("success", HttpStatus.CREATED);
    }

    public ResponseEntity<Integer> calculateResult(Integer id, List<Responce>responces){
        List<QuestionWrapper>questionWrappers=new ArrayList<>();
        return new ResponseEntity<>(questionWrappers,HttpStatus.OK);
    }
}
