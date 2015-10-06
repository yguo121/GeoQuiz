package com.example.think.geoquiz;

/**
 * Created by think on 2015/9/23.
 */
public class TrueFalse {

    //mQustion holds resource ID of a string resource for the question.
    private int mQuestion;

    private boolean mAnswerTrue;

    public TrueFalse(int question, boolean answerTrue) {
        mQuestion = question;
        mAnswerTrue = answerTrue;
    }

    public int getQuestion() {
        return mQuestion;
    }

    public void setQuestion(int question) {
        mQuestion = question;
    }

    public boolean isAnswerTrue() {
        return mAnswerTrue;
    }

    public void setAnswerTrue(boolean answerTrue) {
        mAnswerTrue = answerTrue;
    }


}
