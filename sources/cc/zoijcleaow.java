package cc;

/* JADX INFO: loaded from: classes2.dex */
final class zoijcleaow extends dxjokdxxww {

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private final String f19627eablkybsjg;

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    private final long f19628gxszxtbevo;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final String f19629ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final String f19630wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final String f19631zoijcleaow;

    zoijcleaow(String str, String str2, String str3, String str4, long j13) {
        if (str == null) {
            throw new NullPointerException("Null rolloutId");
        }
        this.f19631zoijcleaow = str;
        if (str2 == null) {
            throw new NullPointerException("Null parameterKey");
        }
        this.f19629ppxfxbqfkf = str2;
        if (str3 == null) {
            throw new NullPointerException("Null parameterValue");
        }
        this.f19630wkgbmnqykc = str3;
        if (str4 == null) {
            throw new NullPointerException("Null variantId");
        }
        this.f19627eablkybsjg = str4;
        this.f19628gxszxtbevo = j13;
    }

    @Override // cc.dxjokdxxww
    public String eablkybsjg() {
        return this.f19631zoijcleaow;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof dxjokdxxww)) {
            return false;
        }
        dxjokdxxww dxjokdxxwwVar = (dxjokdxxww) obj;
        return this.f19631zoijcleaow.equals(dxjokdxxwwVar.eablkybsjg()) && this.f19629ppxfxbqfkf.equals(dxjokdxxwwVar.ppxfxbqfkf()) && this.f19630wkgbmnqykc.equals(dxjokdxxwwVar.wkgbmnqykc()) && this.f19627eablkybsjg.equals(dxjokdxxwwVar.lqeggnwhkg()) && this.f19628gxszxtbevo == dxjokdxxwwVar.gxszxtbevo();
    }

    @Override // cc.dxjokdxxww
    public long gxszxtbevo() {
        return this.f19628gxszxtbevo;
    }

    public int hashCode() {
        int iHashCode = (((((((this.f19631zoijcleaow.hashCode() ^ 1000003) * 1000003) ^ this.f19629ppxfxbqfkf.hashCode()) * 1000003) ^ this.f19630wkgbmnqykc.hashCode()) * 1000003) ^ this.f19627eablkybsjg.hashCode()) * 1000003;
        long j13 = this.f19628gxszxtbevo;
        return iHashCode ^ ((int) (j13 ^ (j13 >>> 32)));
    }

    @Override // cc.dxjokdxxww
    public String lqeggnwhkg() {
        return this.f19627eablkybsjg;
    }

    @Override // cc.dxjokdxxww
    public String ppxfxbqfkf() {
        return this.f19629ppxfxbqfkf;
    }

    public String toString() {
        return "RolloutAssignment{rolloutId=" + this.f19631zoijcleaow + ", parameterKey=" + this.f19629ppxfxbqfkf + ", parameterValue=" + this.f19630wkgbmnqykc + ", variantId=" + this.f19627eablkybsjg + ", templateVersion=" + this.f19628gxszxtbevo + "}";
    }

    @Override // cc.dxjokdxxww
    public String wkgbmnqykc() {
        return this.f19630wkgbmnqykc;
    }
}
