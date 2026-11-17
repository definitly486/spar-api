package sh;

/* JADX INFO: loaded from: classes3.dex */
public final class dxjokdxxww extends mbcevpiqjq {

    /* JADX INFO: renamed from: ojitshcjhn, reason: collision with root package name */
    public static final dxjokdxxww f106527ojitshcjhn = new dxjokdxxww();

    private dxjokdxxww() {
    }

    public static final jh.lereixgezr draadjrbmk(jh.lereixgezr functionDescriptor) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(functionDescriptor, "functionDescriptor");
        dxjokdxxww dxjokdxxwwVar = f106527ojitshcjhn;
        ii.gxszxtbevo name = functionDescriptor.getName();
        kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(name, "getName(...)");
        if (dxjokdxxwwVar.agtfadlqog(name)) {
            return (jh.lereixgezr) pi.eablkybsjg.dxjokdxxww(functionDescriptor, false, lqeggnwhkg.f106559zdlpuopuiu, 1, null);
        }
        return null;
    }

    private final boolean gtknphoqwx(jh.zoijcleaow zoijcleaowVar) {
        return hg.jyumaefscl.xrmfcynszj(mbcevpiqjq.f106567iobyxmoadg.eablkybsjg(), bi.istkbnxepw.wkgbmnqykc(zoijcleaowVar));
    }

    public static final mbcevpiqjq.zoijcleaow ojitshcjhn(jh.zoijcleaow zoijcleaowVar) {
        jh.zoijcleaow zoijcleaowVarDxjokdxxww;
        String strWkgbmnqykc;
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(zoijcleaowVar, "<this>");
        mbcevpiqjq.iobyxmoadg iobyxmoadgVar = mbcevpiqjq.f106567iobyxmoadg;
        if (!iobyxmoadgVar.wkgbmnqykc().contains(zoijcleaowVar.getName()) || (zoijcleaowVarDxjokdxxww = pi.eablkybsjg.dxjokdxxww(zoijcleaowVar, false, nufgyqmvbu.f106593zdlpuopuiu, 1, null)) == null || (strWkgbmnqykc = bi.istkbnxepw.wkgbmnqykc(zoijcleaowVarDxjokdxxww)) == null) {
            return null;
        }
        return iobyxmoadgVar.draadjrbmk(strWkgbmnqykc);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean rgvfuqvkyq(jh.zoijcleaow it) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(it, "it");
        return (it instanceof jh.lereixgezr) && f106527ojitshcjhn.gtknphoqwx(it);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean wflxmlrfwp(jh.zoijcleaow it) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(it, "it");
        return f106527ojitshcjhn.gtknphoqwx(it);
    }

    public final boolean agtfadlqog(ii.gxszxtbevo gxszxtbevoVar) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(gxszxtbevoVar, "<this>");
        return mbcevpiqjq.f106567iobyxmoadg.wkgbmnqykc().contains(gxszxtbevoVar);
    }
}
