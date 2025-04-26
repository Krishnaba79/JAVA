package com.example.Dao;

import java.util.List;
import com.example.model.Mother;
import com.example.model.Child;

public interface MotherChildDao {
    void addMother(Mother mother);
    void addChild(Child child);
    List<Mother> getAllMothers();
    List<Child> getAllChildren();
    void updateMother(Mother mother);
    void updateChild(Child child);
    void deleteMother(int id);
    void deleteChild(int id);
