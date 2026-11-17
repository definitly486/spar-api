package org.jose4j.json.internal.json_simple.parser;

/* JADX INFO: loaded from: classes3.dex */
public class ParseException extends Exception {
    private static final long serialVersionUID = -7880698968187728547L;

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
    private int f74133jyumaefscl;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    private Object f74134yggfygwlhe;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    private int f74135zdlpuopuiu;

    public ParseException(int i13, int i14, Object obj) {
        this.f74133jyumaefscl = i13;
        this.f74135zdlpuopuiu = i14;
        this.f74134yggfygwlhe = obj;
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        StringBuilder sb3 = new StringBuilder();
        int i13 = this.f74135zdlpuopuiu;
        if (i13 == 0) {
            sb3.append("Unexpected character (");
            sb3.append(this.f74134yggfygwlhe);
            sb3.append(") at position ");
            sb3.append(this.f74133jyumaefscl);
            sb3.append(".");
        } else if (i13 == 1) {
            sb3.append("Unexpected token ");
            sb3.append(this.f74134yggfygwlhe);
            sb3.append(" at position ");
            sb3.append(this.f74133jyumaefscl);
            sb3.append(".");
        } else if (i13 != 2) {
            sb3.append("Unknown error at position ");
            sb3.append(this.f74133jyumaefscl);
            sb3.append(".");
        } else {
            sb3.append("Unexpected exception at position ");
            sb3.append(this.f74133jyumaefscl);
            sb3.append(": ");
            sb3.append(this.f74134yggfygwlhe);
        }
        return sb3.toString();
    }
}
