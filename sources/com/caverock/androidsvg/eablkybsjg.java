package com.caverock.androidsvg;

/* JADX INFO: loaded from: classes2.dex */
public class eablkybsjg {

    /* JADX INFO: renamed from: btonecajqb, reason: collision with root package name */
    public static final eablkybsjg f21361btonecajqb;

    /* JADX INFO: renamed from: dxjokdxxww, reason: collision with root package name */
    public static final eablkybsjg f21362dxjokdxxww;

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    public static final eablkybsjg f21363eablkybsjg;

    /* JADX INFO: renamed from: gtknphoqwx, reason: collision with root package name */
    public static final eablkybsjg f21364gtknphoqwx;

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    public static final eablkybsjg f21365gxszxtbevo;

    /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
    public static final eablkybsjg f21366lqeggnwhkg;

    /* JADX INFO: renamed from: nufgyqmvbu, reason: collision with root package name */
    public static final eablkybsjg f21367nufgyqmvbu;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    public static final eablkybsjg f21368ppxfxbqfkf = new eablkybsjg(null, null);

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    public static final eablkybsjg f21369wkgbmnqykc = new eablkybsjg(iobyxmoadg.none, null);

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private iobyxmoadg f21370iobyxmoadg;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private zoijcleaow f21371zoijcleaow;

    public enum iobyxmoadg {
        none,
        xMinYMin,
        xMidYMin,
        xMaxYMin,
        xMinYMid,
        xMidYMid,
        xMaxYMid,
        xMinYMax,
        xMidYMax,
        xMaxYMax
    }

    public enum zoijcleaow {
        meet,
        slice
    }

    static {
        iobyxmoadg iobyxmoadgVar = iobyxmoadg.xMidYMid;
        zoijcleaow zoijcleaowVar = zoijcleaow.meet;
        f21363eablkybsjg = new eablkybsjg(iobyxmoadgVar, zoijcleaowVar);
        iobyxmoadg iobyxmoadgVar2 = iobyxmoadg.xMinYMin;
        f21365gxszxtbevo = new eablkybsjg(iobyxmoadgVar2, zoijcleaowVar);
        f21366lqeggnwhkg = new eablkybsjg(iobyxmoadg.xMaxYMax, zoijcleaowVar);
        f21367nufgyqmvbu = new eablkybsjg(iobyxmoadg.xMidYMin, zoijcleaowVar);
        f21362dxjokdxxww = new eablkybsjg(iobyxmoadg.xMidYMax, zoijcleaowVar);
        zoijcleaow zoijcleaowVar2 = zoijcleaow.slice;
        f21361btonecajqb = new eablkybsjg(iobyxmoadgVar, zoijcleaowVar2);
        f21364gtknphoqwx = new eablkybsjg(iobyxmoadgVar2, zoijcleaowVar2);
    }

    eablkybsjg(iobyxmoadg iobyxmoadgVar, zoijcleaow zoijcleaowVar) {
        this.f21370iobyxmoadg = iobyxmoadgVar;
        this.f21371zoijcleaow = zoijcleaowVar;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        eablkybsjg eablkybsjgVar = (eablkybsjg) obj;
        return this.f21370iobyxmoadg == eablkybsjgVar.f21370iobyxmoadg && this.f21371zoijcleaow == eablkybsjgVar.f21371zoijcleaow;
    }

    public iobyxmoadg iobyxmoadg() {
        return this.f21370iobyxmoadg;
    }

    public String toString() {
        return this.f21370iobyxmoadg + " " + this.f21371zoijcleaow;
    }

    public zoijcleaow zoijcleaow() {
        return this.f21371zoijcleaow;
    }
}
