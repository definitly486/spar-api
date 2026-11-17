package com.google.zxing;

/* JADX INFO: loaded from: classes2.dex */
public abstract class ReaderException extends Exception {

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    protected static final StackTraceElement[] f25235yggfygwlhe;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    protected static final boolean f25236zdlpuopuiu;

    static {
        f25236zdlpuopuiu = System.getProperty("surefire.test.class.path") != null;
        f25235yggfygwlhe = new StackTraceElement[0];
    }

    ReaderException() {
    }

    @Override // java.lang.Throwable
    public final synchronized Throwable fillInStackTrace() {
        return null;
    }
}
