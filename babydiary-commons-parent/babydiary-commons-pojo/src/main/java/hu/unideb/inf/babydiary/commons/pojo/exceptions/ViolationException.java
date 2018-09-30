package hu.unideb.inf.babydiary.commons.pojo.exceptions;

import hu.unideb.inf.babydiary.commons.pojo.validator.Violation;

import java.util.List;

public class ViolationException extends BaseException {

    private List<Violation> errors;


    public ViolationException(List<Violation> violationList) {
        this.errors = violationList;
    }

    public List<Violation> getViolationList() {
        return this.errors;
    }

    public String toString() {
        return "ViolationResponse{errors=" + this.errors.toString() + '}';
    }
}
