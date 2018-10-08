package hu.unideb.inf.babydiary.commons.pojo.validator;

import java.io.Serializable;

public class Violation implements Serializable {

    private String field;

    private String validationMessage;

    public Violation() {
    }

    public Violation(String field, String validationMessage) {
        this.field = field;
        this.validationMessage = validationMessage;
    }

    public String getField() {
        return field;
    }

    public void setField(String field) {
        this.field = field;
    }

    public String getValidationMessage() {
        return validationMessage;
    }

    public void setValidationMessage(String validationMessage) {
        this.validationMessage = validationMessage;
    }

    public static ViolationBuilder builder() {
        return new ViolationBuilder();
    }

    @Override
    public String toString() {
        StringBuilder sb=new StringBuilder();
        sb.append("field:").append(field).append("->").append(validationMessage);
        return sb.toString();
    }
    public static final class ViolationBuilder {
        private String field;
        private String validationMessage;

        private ViolationBuilder() {
        }

        public static ViolationBuilder aViolation() {
            return new ViolationBuilder();
        }

        public ViolationBuilder field(String field) {
            this.field = field;
            return this;
        }

        public ViolationBuilder validationMessage(String validationMessage) {
            this.validationMessage = validationMessage;
            return this;
        }

        public Violation build() {
            Violation violation = new Violation();
            violation.setField(field);
            violation.setValidationMessage(validationMessage);
            return violation;
        }
    }
}
