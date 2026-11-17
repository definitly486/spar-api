package sd;

/* JADX INFO: loaded from: classes2.dex */
public final class iobyxmoadg implements nc.iobyxmoadg {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    public static final nc.iobyxmoadg f105993iobyxmoadg = new iobyxmoadg();

    /* JADX INFO: renamed from: sd.iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
    private static final class C2597iobyxmoadg implements mc.ppxfxbqfkf {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        static final C2597iobyxmoadg f105996iobyxmoadg = new C2597iobyxmoadg();

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private static final mc.zoijcleaow f105999zoijcleaow = mc.zoijcleaow.wkgbmnqykc("rolloutId");

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        private static final mc.zoijcleaow f105997ppxfxbqfkf = mc.zoijcleaow.wkgbmnqykc("variantId");

        /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
        private static final mc.zoijcleaow f105998wkgbmnqykc = mc.zoijcleaow.wkgbmnqykc("parameterKey");

        /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
        private static final mc.zoijcleaow f105994eablkybsjg = mc.zoijcleaow.wkgbmnqykc("parameterValue");

        /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
        private static final mc.zoijcleaow f105995gxszxtbevo = mc.zoijcleaow.wkgbmnqykc("templateVersion");

        private C2597iobyxmoadg() {
        }

        @Override // mc.ppxfxbqfkf
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public void encode(wkgbmnqykc wkgbmnqykcVar, mc.wkgbmnqykc wkgbmnqykcVar2) {
            wkgbmnqykcVar2.add(f105999zoijcleaow, wkgbmnqykcVar.wkgbmnqykc());
            wkgbmnqykcVar2.add(f105997ppxfxbqfkf, wkgbmnqykcVar.gxszxtbevo());
            wkgbmnqykcVar2.add(f105998wkgbmnqykc, wkgbmnqykcVar.zoijcleaow());
            wkgbmnqykcVar2.add(f105994eablkybsjg, wkgbmnqykcVar.ppxfxbqfkf());
            wkgbmnqykcVar2.add(f105995gxszxtbevo, wkgbmnqykcVar.eablkybsjg());
        }
    }

    private iobyxmoadg() {
    }

    @Override // nc.iobyxmoadg
    public void configure(nc.zoijcleaow zoijcleaowVar) {
        C2597iobyxmoadg c2597iobyxmoadg = C2597iobyxmoadg.f105996iobyxmoadg;
        zoijcleaowVar.registerEncoder(wkgbmnqykc.class, c2597iobyxmoadg);
        zoijcleaowVar.registerEncoder(zoijcleaow.class, c2597iobyxmoadg);
    }
}
