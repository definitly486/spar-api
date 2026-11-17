package com.fasterxml.jackson.databind.exc;

import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
public abstract class PropertyBindingException extends MismatchedInputException {

    /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
    protected transient String f21799iwizpuwonk;

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
    protected final Collection f21800jyumaefscl;

    @Override // com.fasterxml.jackson.core.JsonProcessingException
    public String wkgbmnqykc() {
        String str = this.f21799iwizpuwonk;
        if (str != null || this.f21800jyumaefscl == null) {
            return str;
        }
        StringBuilder sb3 = new StringBuilder(100);
        int size = this.f21800jyumaefscl.size();
        if (size == 1) {
            sb3.append(" (one known property: \"");
            sb3.append(String.valueOf(this.f21800jyumaefscl.iterator().next()));
            sb3.append('\"');
        } else {
            sb3.append(" (");
            sb3.append(size);
            sb3.append(" known properties: ");
            Iterator it = this.f21800jyumaefscl.iterator();
            while (it.hasNext()) {
                sb3.append('\"');
                sb3.append(String.valueOf(it.next()));
                sb3.append('\"');
                if (sb3.length() > 1000) {
                    sb3.append(" [truncated]");
                    break;
                }
                if (it.hasNext()) {
                    sb3.append(", ");
                }
            }
        }
        sb3.append("])");
        String string = sb3.toString();
        this.f21799iwizpuwonk = string;
        return string;
    }
}
