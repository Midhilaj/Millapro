package com.createvirtualshop.millapro;

/**
 * Created by test on 12/31/16.
 */

public class MillaEmailcontent {
    String msubject,mmailbody,mtomailid;
public MillaEmailcontent(String to,String subject,String body) throws MillaInvaliedError {
    if(to==null||to.isEmpty()||to.trim().length()<1 || !MillaCheckValiedEmila.isValied(to)){
      throw new MillaInvaliedError("invalied email id")  ;
    }
    else if(subject==null||subject.isEmpty()||subject.trim().length()<1){
        throw new MillaInvaliedError("email subject is required");
    }
    else if(body==null||body.isEmpty()||body.trim().length()<1){
        throw new MillaInvaliedError("email body is required");
    }
    else{
        msubject=subject;
        mmailbody=body;
     mtomailid=to;
    }
}
    public String getMailbody() {
        return mmailbody;
    }

    public String getSubject() {
        return msubject;
    }

    public String getTomailid() {
        return mtomailid;
    }

    public void setMtomailid(String tomailid) {
        mtomailid = tomailid;
    }
    public MillaEmailcontent writeMtomailid(String tomailid){
        setMtomailid(tomailid);
        return this;
    }

    public MillaEmailcontent writeSubject(String subject){
        setSubject(subject);
        return  this;
    }
    public MillaEmailcontent writeBody(String Body){
        setMailbody(Body);
        return  this;
    }
    public void setSubject(String subject) {
        msubject = subject;
    }

    public void setMailbody(String body) {
        mmailbody = body;
    }

}
