package vipkmwdibw;

import androidx.compose.runtime.c1;

/* JADX INFO: loaded from: classes.dex */
public final class btonecajqb {

    /* JADX INFO: renamed from: dxjokdxxww, reason: collision with root package name */
    private final androidx.compose.runtime.iwxlajgraz f117030dxjokdxxww;

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private final androidx.compose.runtime.iwxlajgraz f117031eablkybsjg;

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    private kcexrzcfyt f117032gxszxtbevo;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final ezmngbhpjk f117033iobyxmoadg;

    /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
    private long f117034lqeggnwhkg;

    /* JADX INFO: renamed from: nufgyqmvbu, reason: collision with root package name */
    private long f117035nufgyqmvbu = Long.MIN_VALUE;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final long f117036ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final tg.iobyxmoadg f117037wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final Object f117038zoijcleaow;

    public btonecajqb(Object obj, ezmngbhpjk ezmngbhpjkVar, kcexrzcfyt kcexrzcfytVar, long j13, Object obj2, long j14, boolean z13, tg.iobyxmoadg iobyxmoadgVar) {
        this.f117033iobyxmoadg = ezmngbhpjkVar;
        this.f117038zoijcleaow = obj2;
        this.f117036ppxfxbqfkf = j14;
        this.f117037wkgbmnqykc = iobyxmoadgVar;
        this.f117031eablkybsjg = c1.ppxfxbqfkf(obj, null, 2, null);
        this.f117032gxszxtbevo = zdlpuopuiu.eablkybsjg(kcexrzcfytVar);
        this.f117034lqeggnwhkg = j13;
        this.f117030dxjokdxxww = c1.ppxfxbqfkf(Boolean.valueOf(z13), null, 2, null);
    }

    public final void btonecajqb(long j13) {
        this.f117034lqeggnwhkg = j13;
    }

    public final void draadjrbmk(Object obj) {
        this.f117031eablkybsjg.setValue(obj);
    }

    public final void dxjokdxxww(long j13) {
        this.f117035nufgyqmvbu = j13;
    }

    public final Object eablkybsjg() {
        return this.f117031eablkybsjg.getValue();
    }

    public final void gtknphoqwx(boolean z13) {
        this.f117030dxjokdxxww.setValue(Boolean.valueOf(z13));
    }

    public final Object gxszxtbevo() {
        return this.f117033iobyxmoadg.zoijcleaow().invoke(this.f117032gxszxtbevo);
    }

    public final void iobyxmoadg() {
        gtknphoqwx(false);
        this.f117037wkgbmnqykc.invoke();
    }

    public final kcexrzcfyt lqeggnwhkg() {
        return this.f117032gxszxtbevo;
    }

    public final boolean nufgyqmvbu() {
        return ((Boolean) this.f117030dxjokdxxww.getValue()).booleanValue();
    }

    public final long ppxfxbqfkf() {
        return this.f117034lqeggnwhkg;
    }

    public final void wflxmlrfwp(kcexrzcfyt kcexrzcfytVar) {
        this.f117032gxszxtbevo = kcexrzcfytVar;
    }

    public final long wkgbmnqykc() {
        return this.f117036ppxfxbqfkf;
    }

    public final long zoijcleaow() {
        return this.f117035nufgyqmvbu;
    }
}
