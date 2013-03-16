/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package citalyser.queryresult;

import citalyser.model.Journal;
import citalyser.model.Paper;
import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author KRISHNA
 */
public class JournalResult extends QueryResult<Journal> implements Serializable {

    private Journal journal;

    @Override
    public void setContents(Journal e) {
        this.journal = e;
    }

    @Override
    public Journal getContents() {
        return this.journal;
    }
    
    @Override
    public void appendContents(Journal j){
        ArrayList<Paper> p = this.journal.getPaperCollection().getPapers();
        ArrayList<Paper> temp = j.getPaperCollection().getPapers();
        int i;
        for(i=0; i<temp.size(); i++){
            p.add(temp.get(i));
        }
    }
}
