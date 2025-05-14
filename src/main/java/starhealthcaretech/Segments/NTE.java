package starhealthcaretech.Segments;

import java.util.List;

import starhealthcaretech.DataTypes.CE;
import starhealthcaretech.HL7Helper.HL7util;

public class NTE implements HL7SegmentInterface{
    private String setIdNTE;             // NTE.1
    private String sourceOfComment;      // NTE.2
    private List<String> comment;              // NTE.3
    private CE commentType;          // NTE.4

    // Getters and Setters

    public String getSetIdNTE() {
        return setIdNTE;
    }

    public void setSetIdNTE(String setIdNTE) {
        this.setIdNTE = setIdNTE;
    }

    public String getSourceOfComment() {
        return sourceOfComment;
    }

    public void setSourceOfComment(String sourceOfComment) {
        this.sourceOfComment = sourceOfComment;
    }

    public List<String> getComment() {
        return comment;
    }

    public void setComment(List<String> comment) {
        this.comment = comment;
    }

    public CE getCommentType() {
        return commentType;
    }

    public void setCommentType(CE commentType) {
        this.commentType = commentType;
    }

    @Override
    public String toHL7() {
        return "NTE" + HL7util.processAllFields(this);
    }

}
