package com.example.maxie.tipcal.fragments;

import com.example.maxie.tipcal.models.TipRecord;

/**
 * Created by MaxiE on 2/6/2016.
 */
public interface TipHistoryListFragmentListener {
    void addToList(TipRecord record);
    void clearList();
}
