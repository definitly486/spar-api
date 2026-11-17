package n4;

import y2.yadqdtsiqt;

/* JADX INFO: loaded from: classes.dex */
final class jyumaefscl {

    /* JADX INFO: renamed from: agtfadlqog, reason: collision with root package name */
    public yggfygwlhe f68606agtfadlqog;

    /* JADX INFO: renamed from: draadjrbmk, reason: collision with root package name */
    public boolean f68608draadjrbmk;

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    public int f68610eablkybsjg;

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    public int f68612gxszxtbevo;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    public ppxfxbqfkf f68613iobyxmoadg;

    /* JADX INFO: renamed from: oxmwwwfdhm, reason: collision with root package name */
    public boolean f68617oxmwwwfdhm;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    public long f68618ppxfxbqfkf;

    /* JADX INFO: renamed from: rgvfuqvkyq, reason: collision with root package name */
    public boolean f68619rgvfuqvkyq;

    /* JADX INFO: renamed from: vdvldrhtss, reason: collision with root package name */
    public long f68620vdvldrhtss;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    public long f68622wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    public long f68623zoijcleaow;

    /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
    public long[] f68614lqeggnwhkg = new long[0];

    /* JADX INFO: renamed from: nufgyqmvbu, reason: collision with root package name */
    public int[] f68615nufgyqmvbu = new int[0];

    /* JADX INFO: renamed from: dxjokdxxww, reason: collision with root package name */
    public int[] f68609dxjokdxxww = new int[0];

    /* JADX INFO: renamed from: btonecajqb, reason: collision with root package name */
    public long[] f68607btonecajqb = new long[0];

    /* JADX INFO: renamed from: gtknphoqwx, reason: collision with root package name */
    public boolean[] f68611gtknphoqwx = new boolean[0];

    /* JADX INFO: renamed from: wflxmlrfwp, reason: collision with root package name */
    public boolean[] f68621wflxmlrfwp = new boolean[0];

    /* JADX INFO: renamed from: ojitshcjhn, reason: collision with root package name */
    public final yadqdtsiqt f68616ojitshcjhn = new yadqdtsiqt();

    public void eablkybsjg(int i13, int i14) {
        this.f68610eablkybsjg = i13;
        this.f68612gxszxtbevo = i14;
        if (this.f68615nufgyqmvbu.length < i13) {
            this.f68614lqeggnwhkg = new long[i13];
            this.f68615nufgyqmvbu = new int[i13];
        }
        if (this.f68609dxjokdxxww.length < i14) {
            int i15 = (i14 * 125) / 100;
            this.f68609dxjokdxxww = new int[i15];
            this.f68607btonecajqb = new long[i15];
            this.f68611gtknphoqwx = new boolean[i15];
            this.f68621wflxmlrfwp = new boolean[i15];
        }
    }

    public void gxszxtbevo() {
        this.f68610eablkybsjg = 0;
        this.f68620vdvldrhtss = 0L;
        this.f68617oxmwwwfdhm = false;
        this.f68608draadjrbmk = false;
        this.f68619rgvfuqvkyq = false;
        this.f68606agtfadlqog = null;
    }

    public void iobyxmoadg(t3.vdvldrhtss vdvldrhtssVar) {
        vdvldrhtssVar.readFully(this.f68616ojitshcjhn.eablkybsjg(), 0, this.f68616ojitshcjhn.lqeggnwhkg());
        this.f68616ojitshcjhn.sopmlzcsov(0);
        this.f68619rgvfuqvkyq = false;
    }

    public boolean lqeggnwhkg(int i13) {
        return this.f68608draadjrbmk && this.f68621wflxmlrfwp[i13];
    }

    public long ppxfxbqfkf(int i13) {
        return this.f68607btonecajqb[i13];
    }

    public void wkgbmnqykc(int i13) {
        this.f68616ojitshcjhn.tzroggbefp(i13);
        this.f68608draadjrbmk = true;
        this.f68619rgvfuqvkyq = true;
    }

    public void zoijcleaow(yadqdtsiqt yadqdtsiqtVar) {
        yadqdtsiqtVar.draadjrbmk(this.f68616ojitshcjhn.eablkybsjg(), 0, this.f68616ojitshcjhn.lqeggnwhkg());
        this.f68616ojitshcjhn.sopmlzcsov(0);
        this.f68619rgvfuqvkyq = false;
    }
}
