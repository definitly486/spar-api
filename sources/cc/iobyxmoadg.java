package cc;

/* JADX INFO: loaded from: classes2.dex */
public final class iobyxmoadg implements nc.iobyxmoadg {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    public static final nc.iobyxmoadg f19579iobyxmoadg = new iobyxmoadg();

    /* JADX INFO: renamed from: cc.iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
    private static final class C0353iobyxmoadg implements mc.ppxfxbqfkf {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        static final C0353iobyxmoadg f19582iobyxmoadg = new C0353iobyxmoadg();

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private static final mc.zoijcleaow f19585zoijcleaow = mc.zoijcleaow.wkgbmnqykc("rolloutId");

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        private static final mc.zoijcleaow f19583ppxfxbqfkf = mc.zoijcleaow.wkgbmnqykc("parameterKey");

        /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
        private static final mc.zoijcleaow f19584wkgbmnqykc = mc.zoijcleaow.wkgbmnqykc("parameterValue");

        /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
        private static final mc.zoijcleaow f19580eablkybsjg = mc.zoijcleaow.wkgbmnqykc("variantId");

        /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
        private static final mc.zoijcleaow f19581gxszxtbevo = mc.zoijcleaow.wkgbmnqykc("templateVersion");

        private C0353iobyxmoadg() {
        }

        @Override // mc.ppxfxbqfkf
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public void encode(dxjokdxxww dxjokdxxwwVar, mc.wkgbmnqykc wkgbmnqykcVar) {
            wkgbmnqykcVar.add(f19585zoijcleaow, dxjokdxxwwVar.eablkybsjg());
            wkgbmnqykcVar.add(f19583ppxfxbqfkf, dxjokdxxwwVar.ppxfxbqfkf());
            wkgbmnqykcVar.add(f19584wkgbmnqykc, dxjokdxxwwVar.wkgbmnqykc());
            wkgbmnqykcVar.add(f19580eablkybsjg, dxjokdxxwwVar.lqeggnwhkg());
            wkgbmnqykcVar.add(f19581gxszxtbevo, dxjokdxxwwVar.gxszxtbevo());
        }
    }

    private iobyxmoadg() {
    }

    @Override // nc.iobyxmoadg
    public void configure(nc.zoijcleaow zoijcleaowVar) {
        C0353iobyxmoadg c0353iobyxmoadg = C0353iobyxmoadg.f19582iobyxmoadg;
        zoijcleaowVar.registerEncoder(dxjokdxxww.class, c0353iobyxmoadg);
        zoijcleaowVar.registerEncoder(zoijcleaow.class, c0353iobyxmoadg);
    }
}
