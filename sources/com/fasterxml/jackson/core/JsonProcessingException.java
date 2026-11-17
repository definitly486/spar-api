package com.fasterxml.jackson.core;

import k9.iobyxmoadg;

/* JADX INFO: loaded from: classes2.dex */
public class JsonProcessingException extends JacksonException {
    private static final long serialVersionUID = 123;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    protected iobyxmoadg f21796zdlpuopuiu;

    @Override // java.lang.Throwable
    public String getMessage() {
        String message = super.getMessage();
        if (message == null) {
            message = "N/A";
        }
        iobyxmoadg iobyxmoadgVarIobyxmoadg = iobyxmoadg();
        String strWkgbmnqykc = wkgbmnqykc();
        if (iobyxmoadgVarIobyxmoadg == null && strWkgbmnqykc == null) {
            return message;
        }
        StringBuilder sb3 = new StringBuilder(100);
        sb3.append(message);
        if (strWkgbmnqykc != null) {
            sb3.append(strWkgbmnqykc);
        }
        if (iobyxmoadgVarIobyxmoadg != null) {
            sb3.append('\n');
            sb3.append(" at ");
            sb3.append(iobyxmoadgVarIobyxmoadg.toString());
        }
        return sb3.toString();
    }

    public iobyxmoadg iobyxmoadg() {
        return this.f21796zdlpuopuiu;
    }

    @Override // java.lang.Throwable
    public String toString() {
        return getClass().getName() + ": " + getMessage();
    }

    protected String wkgbmnqykc() {
        return null;
    }
}
