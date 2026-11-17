package ud;

/* JADX INFO: loaded from: classes2.dex */
public final class esjtqupxsv {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final String f113361iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final int f113362ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final long f113363wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final String f113364zoijcleaow;

    public esjtqupxsv(String sessionId, String firstSessionId, int i13, long j13) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(sessionId, "sessionId");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(firstSessionId, "firstSessionId");
        this.f113361iobyxmoadg = sessionId;
        this.f113364zoijcleaow = firstSessionId;
        this.f113362ppxfxbqfkf = i13;
        this.f113363wkgbmnqykc = j13;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof esjtqupxsv)) {
            return false;
        }
        esjtqupxsv esjtqupxsvVar = (esjtqupxsv) obj;
        return kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f113361iobyxmoadg, esjtqupxsvVar.f113361iobyxmoadg) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f113364zoijcleaow, esjtqupxsvVar.f113364zoijcleaow) && this.f113362ppxfxbqfkf == esjtqupxsvVar.f113362ppxfxbqfkf && this.f113363wkgbmnqykc == esjtqupxsvVar.f113363wkgbmnqykc;
    }

    public int hashCode() {
        return (((((this.f113361iobyxmoadg.hashCode() * 31) + this.f113364zoijcleaow.hashCode()) * 31) + Integer.hashCode(this.f113362ppxfxbqfkf)) * 31) + Long.hashCode(this.f113363wkgbmnqykc);
    }

    public final String iobyxmoadg() {
        return this.f113364zoijcleaow;
    }

    public final int ppxfxbqfkf() {
        return this.f113362ppxfxbqfkf;
    }

    public String toString() {
        return "SessionDetails(sessionId=" + this.f113361iobyxmoadg + ", firstSessionId=" + this.f113364zoijcleaow + ", sessionIndex=" + this.f113362ppxfxbqfkf + ", sessionStartTimestampUs=" + this.f113363wkgbmnqykc + ')';
    }

    public final long wkgbmnqykc() {
        return this.f113363wkgbmnqykc;
    }

    public final String zoijcleaow() {
        return this.f113361iobyxmoadg;
    }
}
