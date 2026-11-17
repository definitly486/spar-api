package j0;

/* JADX INFO: loaded from: classes.dex */
public final class cllcsxoeiz {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final hkdspvbjdz f50141iobyxmoadg;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final jpowsppfya f50142zoijcleaow;

    public cllcsxoeiz(hkdspvbjdz hkdspvbjdzVar, jpowsppfya jpowsppfyaVar) {
        this.f50141iobyxmoadg = hkdspvbjdzVar;
        this.f50142zoijcleaow = jpowsppfyaVar;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cllcsxoeiz)) {
            return false;
        }
        cllcsxoeiz cllcsxoeizVar = (cllcsxoeiz) obj;
        return kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f50142zoijcleaow, cllcsxoeizVar.f50142zoijcleaow) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f50141iobyxmoadg, cllcsxoeizVar.f50141iobyxmoadg);
    }

    public int hashCode() {
        hkdspvbjdz hkdspvbjdzVar = this.f50141iobyxmoadg;
        int iHashCode = (hkdspvbjdzVar != null ? hkdspvbjdzVar.hashCode() : 0) * 31;
        jpowsppfya jpowsppfyaVar = this.f50142zoijcleaow;
        return iHashCode + (jpowsppfyaVar != null ? jpowsppfyaVar.hashCode() : 0);
    }

    public final jpowsppfya iobyxmoadg() {
        return this.f50142zoijcleaow;
    }

    public String toString() {
        return "PlatformTextStyle(spanStyle=" + this.f50141iobyxmoadg + ", paragraphSyle=" + this.f50142zoijcleaow + ')';
    }

    public final hkdspvbjdz zoijcleaow() {
        return this.f50141iobyxmoadg;
    }

    public cllcsxoeiz(boolean z13) {
        this(null, new jpowsppfya(z13));
    }
}
