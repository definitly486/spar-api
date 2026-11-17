package com.fasterxml.jackson.databind.deser;

import androidx.appcompat.app.yggfygwlhe;
import com.fasterxml.jackson.databind.JsonMappingException;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public class UnresolvedForwardReference extends JsonMappingException {
    private static final long serialVersionUID = 1;

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
    private List f21798jyumaefscl;

    @Override // com.fasterxml.jackson.databind.JsonMappingException, com.fasterxml.jackson.core.JsonProcessingException, java.lang.Throwable
    public String getMessage() {
        String message = super.getMessage();
        if (this.f21798jyumaefscl == null) {
            return message;
        }
        StringBuilder sb3 = new StringBuilder(message);
        Iterator it = this.f21798jyumaefscl.iterator();
        if (it.hasNext()) {
            yggfygwlhe.iobyxmoadg(it.next());
            throw null;
        }
        sb3.append('.');
        return sb3.toString();
    }
}
