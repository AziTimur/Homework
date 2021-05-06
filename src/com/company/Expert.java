package com.company;

public class Expert extends Student{
    private String spec;

    public Expert(String name, int age, String national, String instruments, int cours, Gender gender,String spec) {
        super(name, age, national, instruments, cours, gender);
        this.spec=spec;
    }



    public String getSpec() {
        return spec;
    }


    @Override
    public String getInfo() {
        return   super.getInfo()+ " "+getNational()+" "+getInstruments()+" "+getCours()+"й курс "+getGender()+" "+getSpec();
    }
}
