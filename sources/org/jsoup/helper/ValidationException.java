package org.jsoup.helper;

import java.util.ArrayList;
import vl.zoijcleaow;

/* JADX INFO: loaded from: classes3.dex */
public class ValidationException extends IllegalArgumentException {

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    public static final String f74139zdlpuopuiu = zoijcleaow.class.getName();

    public ValidationException(String str) {
        super(str);
    }

    @Override // java.lang.Throwable
    public synchronized Throwable fillInStackTrace() {
        try {
            super.fillInStackTrace();
            StackTraceElement[] stackTrace = getStackTrace();
            ArrayList arrayList = new ArrayList();
            for (StackTraceElement stackTraceElement : stackTrace) {
                if (!stackTraceElement.getClassName().equals(f74139zdlpuopuiu)) {
                    arrayList.add(stackTraceElement);
                }
            }
            setStackTrace((StackTraceElement[]) arrayList.toArray(new StackTraceElement[0]));
        } catch (Throwable th2) {
            throw th2;
        }
        return this;
    }
}
