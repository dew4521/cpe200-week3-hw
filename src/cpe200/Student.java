package cpe200;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Student {

    public Student() {
        this("","",1990,false);
        // implement here
    }
    public Student(String Sn,String id,int Sb,boolean Sa)
    {
        this.Sname = !Sn.equalsIgnoreCase("")?Sn:"John Doe";
        this.Sid = isValidStudent_id(id)?id:"560610000";
        this.Sactive = Sa;
        this.Sbirth = isValidYOB(Sb)?Sb:1990;

    }

    // implement all missing constructors here

    // implement all get and set methods here

    @Override
    public String toString() {
        String o = Sname+" ("+Sid+") was born in "+Sbirth+" is an INACTIVE student.";

        return o;
    }

    public void setName(String Sn)
    {
        this.Sname = !Sn.equalsIgnoreCase("")?Sn:this.Sname;
    }

    public String getName()
    {
        return Sname;
    }

    public void setStudent_id(String Sid)
    {
    this.Sid = isValidStudent_id(Sid)?Sid:this.Sid;
    }

    public String getStudent_id()
    {
        return Sid;
    }

    public void setYearOfBirth(int Sb)
    {
    this.Sbirth = isValidYOB(Sb)?Sb:this.Sbirth;
    }

    public int getYearOfBirth()
    {
        return Sbirth;
    }

    public boolean isActive()
    {
        return Sactive;
    }

    private boolean isValidStudent_id(String Sid) {
             Pattern p = Pattern.compile(idREGEX);
             Matcher m = p.matcher(Sid);
             return m.matches();
    }

    private boolean isValidYOB(int yob) {
        return yob<1989?false:true;
    }

    private static final String idREGEX = "5[6-9]{1}061[0-2]{1}\\d{3}";

    private String Sname;
    private String Sid;
    private int Sbirth;
    private boolean Sactive;

    // declare your attributes here

}
