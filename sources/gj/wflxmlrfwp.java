package gj;

import java.util.List;
import jh.iyctptxqzt;

/* JADX INFO: loaded from: classes3.dex */
final class wflxmlrfwp implements gxszxtbevo {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    public static final wflxmlrfwp f37584iobyxmoadg = new wflxmlrfwp();

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private static final String f37585zoijcleaow = "should not have varargs or parameters with default values";

    private wflxmlrfwp() {
    }

    @Override // gj.gxszxtbevo
    public String getDescription() {
        return f37585zoijcleaow;
    }

    @Override // gj.gxszxtbevo
    public boolean iobyxmoadg(jh.lereixgezr functionDescriptor) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(functionDescriptor, "functionDescriptor");
        List<iyctptxqzt> listDxjokdxxww = functionDescriptor.dxjokdxxww();
        kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(listDxjokdxxww, "getValueParameters(...)");
        if (listDxjokdxxww != null && listDxjokdxxww.isEmpty()) {
            return true;
        }
        for (iyctptxqzt iyctptxqztVar : listDxjokdxxww) {
            kotlin.jvm.internal.zdlpuopuiu.lqeggnwhkg(iyctptxqztVar);
            if (pi.eablkybsjg.gxszxtbevo(iyctptxqztVar) || iyctptxqztVar.iyctptxqzt() != null) {
                return false;
            }
        }
        return true;
    }

    @Override // gj.gxszxtbevo
    public String zoijcleaow(jh.lereixgezr lereixgezrVar) {
        return gxszxtbevo.iobyxmoadg.iobyxmoadg(this, lereixgezrVar);
    }
}
