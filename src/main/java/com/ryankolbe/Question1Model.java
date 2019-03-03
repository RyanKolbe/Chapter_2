package com.ryankolbe;

public class Question1Model implements Comparable<Question1Model> {
    private String memberType;
    private String memberFunction;
    private int memberCount;

    public Question1Model(String memberType, String memberFunction, int memberCount) {
        this.memberType = memberType;
        this.memberFunction = memberFunction;
        this.memberCount = memberCount;
    }

    public String getMemberType() {
        return memberType;
    }

    public void setMemberType(String memberType) {
        this.memberType = memberType;
    }

    public String getMemberFunction() {
        return memberFunction;
    }

    public void setMemberFunction(String memberFunction) {
        this.memberFunction = memberFunction;
    }

    public int getMemberCount() {
        return memberCount;
    }

    public void setMemberCount(int memberCount) {
        this.memberCount = memberCount;
    }

    @Override
    public String toString() {
        return "Question1Model{" +
                "memberType='" + memberType + '\'' +
                ", memberFunction='" + memberFunction + '\'' +
                ", memberCount=" + memberCount +
                '}';
    }

    @Override
    public int compareTo(Question1Model question1Model) {
        return memberType.compareTo(question1Model.memberType);
    }
}
