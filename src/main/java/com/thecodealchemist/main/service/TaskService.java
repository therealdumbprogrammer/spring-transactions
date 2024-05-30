package com.thecodealchemist.main.service;

import com.thecodealchemist.main.dao.TaskRepository;
import com.thecodealchemist.main.entity.Task;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Service
public class TaskService {

    @Autowired
    private TaskRepository taskRepository;

    @Autowired
    private ServiceHelper helper;

    @Transactional(readOnly = true)
    public void saveTask(String title) {
        Task t = new Task();
        t.setTitle(title);

        taskRepository.save(t);

        helper.m1();
    }


}
