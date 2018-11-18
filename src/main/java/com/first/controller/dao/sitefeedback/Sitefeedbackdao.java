package com.first.controller.dao.sitefeedback;

import com.first.controller.domain.Sitefeedback;

import java.util.List;

/**
 * Created by abhilasha on 06-10-2017.
 */
public interface Sitefeedbackdao {
    void insert(Sitefeedback s);
    public List<Sitefeedback> getAllfeedback();

}
