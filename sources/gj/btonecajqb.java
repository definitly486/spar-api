package gj;

import jh.iyctptxqzt;
import zi.kegysxyocb;

/* JADX INFO: loaded from: classes3.dex */
final class btonecajqb implements gxszxtbevo {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    public static final btonecajqb f37538iobyxmoadg = new btonecajqb();

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private static final String f37539zoijcleaow = "second parameter must be of type KProperty<*> or its supertype";

    private btonecajqb() {
    }

    @Override // gj.gxszxtbevo
    public String getDescription() {
        return f37539zoijcleaow;
    }

    @Override // gj.gxszxtbevo
    public boolean iobyxmoadg(jh.lereixgezr functionDescriptor) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(functionDescriptor, "functionDescriptor");
        iyctptxqzt iyctptxqztVar = (iyctptxqzt) functionDescriptor.dxjokdxxww().get(1);
        gh.agtfadlqog.zoijcleaow zoijcleaowVar = gh.agtfadlqog.f37183gtknphoqwx;
        kotlin.jvm.internal.zdlpuopuiu.lqeggnwhkg(iyctptxqztVar);
        kegysxyocb kegysxyocbVarIobyxmoadg = zoijcleaowVar.iobyxmoadg(pi.eablkybsjg.kcexrzcfyt(iyctptxqztVar));
        if (kegysxyocbVarIobyxmoadg == null) {
            return false;
        }
        kegysxyocb type = iyctptxqztVar.getType();
        kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(type, "getType(...)");
        return ej.wkgbmnqykc.iwizpuwonk(kegysxyocbVarIobyxmoadg, ej.wkgbmnqykc.pmvmpeiblj(type));
    }

    @Override // gj.gxszxtbevo
    public String zoijcleaow(jh.lereixgezr lereixgezrVar) {
        return gxszxtbevo.iobyxmoadg.iobyxmoadg(this, lereixgezrVar);
    }
}
