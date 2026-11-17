package com.fasterxml.jackson.databind;

import androidx.appcompat.app.yggfygwlhe;
import com.fasterxml.jackson.core.JsonProcessingException;
import java.util.Iterator;
import java.util.LinkedList;

/* JADX INFO: loaded from: classes2.dex */
public class JsonMappingException extends JsonProcessingException {
    private static final long serialVersionUID = 1;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    protected LinkedList f21797yggfygwlhe;

    public StringBuilder dxjokdxxww(StringBuilder sb3) {
        lqeggnwhkg(sb3);
        return sb3;
    }

    @Override // java.lang.Throwable
    public String getLocalizedMessage() {
        return nufgyqmvbu();
    }

    @Override // com.fasterxml.jackson.core.JsonProcessingException, java.lang.Throwable
    public String getMessage() {
        return nufgyqmvbu();
    }

    protected void lqeggnwhkg(StringBuilder sb3) {
        LinkedList linkedList = this.f21797yggfygwlhe;
        if (linkedList == null) {
            return;
        }
        Iterator it = linkedList.iterator();
        if (it.hasNext()) {
            yggfygwlhe.iobyxmoadg(it.next());
            throw null;
        }
    }

    protected String nufgyqmvbu() {
        String message = super.getMessage();
        if (this.f21797yggfygwlhe == null) {
            return message;
        }
        StringBuilder sb3 = message == null ? new StringBuilder() : new StringBuilder(message);
        sb3.append(" (through reference chain: ");
        StringBuilder sbDxjokdxxww = dxjokdxxww(sb3);
        sbDxjokdxxww.append(')');
        return sbDxjokdxxww.toString();
    }

    @Override // com.fasterxml.jackson.core.JsonProcessingException, java.lang.Throwable
    public String toString() {
        return getClass().getName() + ": " + getMessage();
    }
}
