package androidx.media3.common;

import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public class ParserException extends IOException {

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    public final int f9631yggfygwlhe;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    public final boolean f9632zdlpuopuiu;

    protected ParserException(String str, Throwable th2, boolean z13, int i13) {
        super(str, th2);
        this.f9632zdlpuopuiu = z13;
        this.f9631yggfygwlhe = i13;
    }

    public static ParserException iobyxmoadg(String str, Throwable th2) {
        return new ParserException(str, th2, true, 1);
    }

    public static ParserException lqeggnwhkg(String str) {
        return new ParserException(str, null, false, 1);
    }

    public static ParserException wkgbmnqykc(String str, Throwable th2) {
        return new ParserException(str, th2, true, 0);
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        String str;
        String message = super.getMessage();
        StringBuilder sb3 = new StringBuilder();
        if (message != null) {
            str = message + " ";
        } else {
            str = "";
        }
        sb3.append(str);
        sb3.append("{contentIsMalformed=");
        sb3.append(this.f9632zdlpuopuiu);
        sb3.append(", dataType=");
        sb3.append(this.f9631yggfygwlhe);
        sb3.append("}");
        return sb3.toString();
    }
}
