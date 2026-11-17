package com.google.zxing;

/* JADX INFO: loaded from: classes2.dex */
public final class FormatException extends ReaderException {

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
    private static final FormatException f25233jyumaefscl;

    static {
        FormatException formatException = new FormatException();
        f25233jyumaefscl = formatException;
        formatException.setStackTrace(ReaderException.f25235yggfygwlhe);
    }

    private FormatException() {
    }

    public static FormatException iobyxmoadg() {
        return ReaderException.f25236zdlpuopuiu ? new FormatException() : f25233jyumaefscl;
    }
}
