package androidx.constraintlayout.core.parser;

/* JADX INFO: loaded from: classes.dex */
public class CLParsingException extends Exception {

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
    private final String f7526jyumaefscl;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    private final int f7527yggfygwlhe;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    private final String f7528zdlpuopuiu;

    public String iobyxmoadg() {
        return this.f7528zdlpuopuiu + " (" + this.f7526jyumaefscl + " at line " + this.f7527yggfygwlhe + ")";
    }

    @Override // java.lang.Throwable
    public String toString() {
        return "CLParsingException (" + hashCode() + ") : " + iobyxmoadg();
    }
}
