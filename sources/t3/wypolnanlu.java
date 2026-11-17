package t3;

/* JADX INFO: loaded from: classes.dex */
public final class wypolnanlu {

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private int f109560eablkybsjg;

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    private int f109561gxszxtbevo;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final byte[] f109562iobyxmoadg = new byte[10];

    /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
    private int f109563lqeggnwhkg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private int f109564ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private long f109565wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private boolean f109566zoijcleaow;

    public void iobyxmoadg(dsvhmnatus dsvhmnatusVar, dsvhmnatus.iobyxmoadg iobyxmoadgVar) {
        if (this.f109564ppxfxbqfkf > 0) {
            dsvhmnatusVar.zoijcleaow(this.f109565wkgbmnqykc, this.f109560eablkybsjg, this.f109561gxszxtbevo, this.f109563lqeggnwhkg, iobyxmoadgVar);
            this.f109564ppxfxbqfkf = 0;
        }
    }

    public void ppxfxbqfkf(dsvhmnatus dsvhmnatusVar, long j13, int i13, int i14, int i15, dsvhmnatus.iobyxmoadg iobyxmoadgVar) {
        y2.iobyxmoadg.nufgyqmvbu(this.f109563lqeggnwhkg <= i14 + i15, "TrueHD chunk samples must be contiguous in the sample queue.");
        if (this.f109566zoijcleaow) {
            int i16 = this.f109564ppxfxbqfkf;
            int i17 = i16 + 1;
            this.f109564ppxfxbqfkf = i17;
            if (i16 == 0) {
                this.f109565wkgbmnqykc = j13;
                this.f109560eablkybsjg = i13;
                this.f109561gxszxtbevo = 0;
            }
            this.f109561gxszxtbevo += i14;
            this.f109563lqeggnwhkg = i15;
            if (i17 >= 16) {
                iobyxmoadg(dsvhmnatusVar, iobyxmoadgVar);
            }
        }
    }

    public void wkgbmnqykc(vdvldrhtss vdvldrhtssVar) {
        if (this.f109566zoijcleaow) {
            return;
        }
        vdvldrhtssVar.ojitshcjhn(this.f109562iobyxmoadg, 0, 10);
        vdvldrhtssVar.gxszxtbevo();
        if (zoijcleaow.btonecajqb(this.f109562iobyxmoadg) == 0) {
            return;
        }
        this.f109566zoijcleaow = true;
    }

    public void zoijcleaow() {
        this.f109566zoijcleaow = false;
        this.f109564ppxfxbqfkf = 0;
    }
}
