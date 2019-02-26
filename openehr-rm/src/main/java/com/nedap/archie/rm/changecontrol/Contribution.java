package com.nedap.archie.rm.changecontrol;

import com.nedap.archie.rm.RMObject;
import com.nedap.archie.rm.support.identification.ObjectRef;
import com.nedap.archie.rm.generic.AuditDetails;
import com.nedap.archie.rm.support.identification.HierObjectId;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by pieter.bos on 08/07/16.
 */
@XmlType(name="CONTRIBUTION", propOrder = {
        "uid",
        "versions",
        "audit"
})
@XmlAccessorType(XmlAccessType.FIELD)
public class Contribution extends RMObject {

    private HierObjectId uid;
    private List<ObjectRef> versions = new ArrayList<>();
    private AuditDetails audit;

    public HierObjectId getUid() {
        return uid;
    }

    public void setUid(HierObjectId uid) {
        this.uid = uid;
    }

    public List<ObjectRef> getVersions() {
        return versions;
    }

    public void setVersions(List<ObjectRef> versions) {
        this.versions = versions;
    }

    public AuditDetails getAudit() {
        return audit;
    }

    public void setAudit(AuditDetails audit) {
        this.audit = audit;
    }
}
