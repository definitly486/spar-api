package dc;

/* JADX INFO: loaded from: classes2.dex */
final class cdpycssgdh extends lmojexxdyd.zoijcleaow {

    /* JADX INFO: renamed from: dxjokdxxww, reason: collision with root package name */
    private final String f27427dxjokdxxww;

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private final long f27428eablkybsjg;

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    private final boolean f27429gxszxtbevo;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final int f27430iobyxmoadg;

    /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
    private final int f27431lqeggnwhkg;

    /* JADX INFO: renamed from: nufgyqmvbu, reason: collision with root package name */
    private final String f27432nufgyqmvbu;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final int f27433ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final long f27434wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final String f27435zoijcleaow;

    cdpycssgdh(int i13, String str, int i14, long j13, long j14, boolean z13, int i15, String str2, String str3) {
        this.f27430iobyxmoadg = i13;
        if (str == null) {
            throw new NullPointerException("Null model");
        }
        this.f27435zoijcleaow = str;
        this.f27433ppxfxbqfkf = i14;
        this.f27434wkgbmnqykc = j13;
        this.f27428eablkybsjg = j14;
        this.f27429gxszxtbevo = z13;
        this.f27431lqeggnwhkg = i15;
        if (str2 == null) {
            throw new NullPointerException("Null manufacturer");
        }
        this.f27432nufgyqmvbu = str2;
        if (str3 == null) {
            throw new NullPointerException("Null modelClass");
        }
        this.f27427dxjokdxxww = str3;
    }

    @Override // dc.lmojexxdyd.zoijcleaow
    public long btonecajqb() {
        return this.f27434wkgbmnqykc;
    }

    @Override // dc.lmojexxdyd.zoijcleaow
    public int dxjokdxxww() {
        return this.f27431lqeggnwhkg;
    }

    @Override // dc.lmojexxdyd.zoijcleaow
    public boolean eablkybsjg() {
        return this.f27429gxszxtbevo;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof lmojexxdyd.zoijcleaow)) {
            return false;
        }
        lmojexxdyd.zoijcleaow zoijcleaowVar = (lmojexxdyd.zoijcleaow) obj;
        return this.f27430iobyxmoadg == zoijcleaowVar.iobyxmoadg() && this.f27435zoijcleaow.equals(zoijcleaowVar.lqeggnwhkg()) && this.f27433ppxfxbqfkf == zoijcleaowVar.zoijcleaow() && this.f27434wkgbmnqykc == zoijcleaowVar.btonecajqb() && this.f27428eablkybsjg == zoijcleaowVar.wkgbmnqykc() && this.f27429gxszxtbevo == zoijcleaowVar.eablkybsjg() && this.f27431lqeggnwhkg == zoijcleaowVar.dxjokdxxww() && this.f27432nufgyqmvbu.equals(zoijcleaowVar.gxszxtbevo()) && this.f27427dxjokdxxww.equals(zoijcleaowVar.nufgyqmvbu());
    }

    @Override // dc.lmojexxdyd.zoijcleaow
    public String gxszxtbevo() {
        return this.f27432nufgyqmvbu;
    }

    public int hashCode() {
        int iHashCode = (((((this.f27430iobyxmoadg ^ 1000003) * 1000003) ^ this.f27435zoijcleaow.hashCode()) * 1000003) ^ this.f27433ppxfxbqfkf) * 1000003;
        long j13 = this.f27434wkgbmnqykc;
        int i13 = (iHashCode ^ ((int) (j13 ^ (j13 >>> 32)))) * 1000003;
        long j14 = this.f27428eablkybsjg;
        return ((((((((i13 ^ ((int) (j14 ^ (j14 >>> 32)))) * 1000003) ^ (this.f27429gxszxtbevo ? 1231 : 1237)) * 1000003) ^ this.f27431lqeggnwhkg) * 1000003) ^ this.f27432nufgyqmvbu.hashCode()) * 1000003) ^ this.f27427dxjokdxxww.hashCode();
    }

    @Override // dc.lmojexxdyd.zoijcleaow
    public int iobyxmoadg() {
        return this.f27430iobyxmoadg;
    }

    @Override // dc.lmojexxdyd.zoijcleaow
    public String lqeggnwhkg() {
        return this.f27435zoijcleaow;
    }

    @Override // dc.lmojexxdyd.zoijcleaow
    public String nufgyqmvbu() {
        return this.f27427dxjokdxxww;
    }

    public String toString() {
        return "DeviceData{arch=" + this.f27430iobyxmoadg + ", model=" + this.f27435zoijcleaow + ", availableProcessors=" + this.f27433ppxfxbqfkf + ", totalRam=" + this.f27434wkgbmnqykc + ", diskSpace=" + this.f27428eablkybsjg + ", isEmulator=" + this.f27429gxszxtbevo + ", state=" + this.f27431lqeggnwhkg + ", manufacturer=" + this.f27432nufgyqmvbu + ", modelClass=" + this.f27427dxjokdxxww + "}";
    }

    @Override // dc.lmojexxdyd.zoijcleaow
    public long wkgbmnqykc() {
        return this.f27428eablkybsjg;
    }

    @Override // dc.lmojexxdyd.zoijcleaow
    public int zoijcleaow() {
        return this.f27433ppxfxbqfkf;
    }
}
