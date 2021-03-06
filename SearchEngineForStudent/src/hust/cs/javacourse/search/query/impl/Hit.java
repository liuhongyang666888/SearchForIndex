package hust.cs.javacourse.search.query.impl;

import hust.cs.javacourse.search.index.AbstractPosting;
import hust.cs.javacourse.search.index.AbstractTerm;
import hust.cs.javacourse.search.query.AbstractHit;
import java.util.Map;

public class Hit extends AbstractHit {
    public Hit()
    {
        super();
    }
    public Hit(int docId,String docPath)
    {
        super(docId,docPath);
    }
    public Hit(int docId,String docPath,Map<AbstractTerm,AbstractPosting> termPostingMapping)
    {
        super(docId,docPath,termPostingMapping);
    }
    @Override
    public int getDocId() {
        return this.docId;
    }

    @Override
    public String getDocPath() {
        return this.docPath;
    }

    @Override
    public String getContent() {
        return this.content;
    }

    @Override
    public void setContent(String content) {
    this.content = content;
    }

    @Override
    public double getScore() {
        return this.score;
    }

    @Override
    public void setScore(double score) {
        this.score = score;
    }

    @Override
    public Map<AbstractTerm, AbstractPosting> getTermPostingMapping() {
        return this.termPostingMapping;
    }

    @Override
    public String toString() {
        return this.docId+". "+"docPath: "+this.docPath +"\n"
                + "score: " +this.score+"\n"
                + this.termPostingMapping.toString()+"\n"
                +"Content:\n"+this.getContent()+"\n";

    }

    @Override
    public int compareTo(AbstractHit o) {
        return (int) (this.score -o.getScore());
    }
}
