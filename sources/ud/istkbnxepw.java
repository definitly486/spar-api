package ud;

/* JADX INFO: loaded from: classes2.dex */
public final class istkbnxepw {

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private final eablkybsjg f113379eablkybsjg;

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    private final String f113380gxszxtbevo;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final String f113381iobyxmoadg;

    /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
    private final String f113382lqeggnwhkg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final int f113383ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final long f113384wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final String f113385zoijcleaow;

    public istkbnxepw(String sessionId, String firstSessionId, int i13, long j13, eablkybsjg dataCollectionStatus, String firebaseInstallationId, String firebaseAuthenticationToken) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(sessionId, "sessionId");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(firstSessionId, "firstSessionId");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(dataCollectionStatus, "dataCollectionStatus");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(firebaseInstallationId, "firebaseInstallationId");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(firebaseAuthenticationToken, "firebaseAuthenticationToken");
        this.f113381iobyxmoadg = sessionId;
        this.f113385zoijcleaow = firstSessionId;
        this.f113383ppxfxbqfkf = i13;
        this.f113384wkgbmnqykc = j13;
        this.f113379eablkybsjg = dataCollectionStatus;
        this.f113380gxszxtbevo = firebaseInstallationId;
        this.f113382lqeggnwhkg = firebaseAuthenticationToken;
    }

    public final String eablkybsjg() {
        return this.f113385zoijcleaow;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof istkbnxepw)) {
            return false;
        }
        istkbnxepw istkbnxepwVar = (istkbnxepw) obj;
        return kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f113381iobyxmoadg, istkbnxepwVar.f113381iobyxmoadg) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f113385zoijcleaow, istkbnxepwVar.f113385zoijcleaow) && this.f113383ppxfxbqfkf == istkbnxepwVar.f113383ppxfxbqfkf && this.f113384wkgbmnqykc == istkbnxepwVar.f113384wkgbmnqykc && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f113379eablkybsjg, istkbnxepwVar.f113379eablkybsjg) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f113380gxszxtbevo, istkbnxepwVar.f113380gxszxtbevo) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f113382lqeggnwhkg, istkbnxepwVar.f113382lqeggnwhkg);
    }

    public final String gxszxtbevo() {
        return this.f113381iobyxmoadg;
    }

    public int hashCode() {
        return (((((((((((this.f113381iobyxmoadg.hashCode() * 31) + this.f113385zoijcleaow.hashCode()) * 31) + Integer.hashCode(this.f113383ppxfxbqfkf)) * 31) + Long.hashCode(this.f113384wkgbmnqykc)) * 31) + this.f113379eablkybsjg.hashCode()) * 31) + this.f113380gxszxtbevo.hashCode()) * 31) + this.f113382lqeggnwhkg.hashCode();
    }

    public final eablkybsjg iobyxmoadg() {
        return this.f113379eablkybsjg;
    }

    public final int lqeggnwhkg() {
        return this.f113383ppxfxbqfkf;
    }

    public final String ppxfxbqfkf() {
        return this.f113382lqeggnwhkg;
    }

    public String toString() {
        return "SessionInfo(sessionId=" + this.f113381iobyxmoadg + ", firstSessionId=" + this.f113385zoijcleaow + ", sessionIndex=" + this.f113383ppxfxbqfkf + ", eventTimestampUs=" + this.f113384wkgbmnqykc + ", dataCollectionStatus=" + this.f113379eablkybsjg + ", firebaseInstallationId=" + this.f113380gxszxtbevo + ", firebaseAuthenticationToken=" + this.f113382lqeggnwhkg + ')';
    }

    public final String wkgbmnqykc() {
        return this.f113380gxszxtbevo;
    }

    public final long zoijcleaow() {
        return this.f113384wkgbmnqykc;
    }
}
