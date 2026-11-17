package ac;

/* JADX INFO: loaded from: classes2.dex */
public class agtfadlqog implements vd.zoijcleaow {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final yadqdtsiqt f1314iobyxmoadg;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final wflxmlrfwp f1315zoijcleaow;

    public agtfadlqog(yadqdtsiqt yadqdtsiqtVar, gc.lqeggnwhkg lqeggnwhkgVar) {
        this.f1314iobyxmoadg = yadqdtsiqtVar;
        this.f1315zoijcleaow = new wflxmlrfwp(lqeggnwhkgVar);
    }

    public void eablkybsjg(String str) {
        this.f1315zoijcleaow.dxjokdxxww(str);
    }

    @Override // vd.zoijcleaow
    public boolean iobyxmoadg() {
        return this.f1314iobyxmoadg.wkgbmnqykc();
    }

    @Override // vd.zoijcleaow
    public void ppxfxbqfkf(vd.zoijcleaow.C2906zoijcleaow c2906zoijcleaow) {
        xb.lqeggnwhkg.gxszxtbevo().zoijcleaow("App Quality Sessions session changed: " + c2906zoijcleaow);
        this.f1315zoijcleaow.nufgyqmvbu(c2906zoijcleaow.iobyxmoadg());
    }

    public String wkgbmnqykc(String str) {
        return this.f1315zoijcleaow.ppxfxbqfkf(str);
    }

    @Override // vd.zoijcleaow
    public vd.zoijcleaow.iobyxmoadg zoijcleaow() {
        return vd.zoijcleaow.iobyxmoadg.CRASHLYTICS;
    }
}
