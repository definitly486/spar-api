package io.appmetrica.analytics.impl;

/* JADX INFO: loaded from: classes3.dex */
public final class Dl {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f45660a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f45661b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Integer f45662c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Integer f45663d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f45664e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Boolean f45665f;

    public Dl(String str, String str2, Integer num, Integer num2, String str3, Boolean bool) {
        this.f45660a = str;
        this.f45661b = str2;
        this.f45662c = num;
        this.f45663d = num2;
        this.f45664e = str3;
        this.f45665f = bool;
    }

    public Dl(StackTraceElement stackTraceElement) {
        this(stackTraceElement.getClassName(), stackTraceElement.getFileName(), Integer.valueOf(stackTraceElement.getLineNumber()), null, stackTraceElement.getMethodName(), Boolean.valueOf(stackTraceElement.isNativeMethod()));
    }
}
