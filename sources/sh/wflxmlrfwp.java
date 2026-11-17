package sh;

import java.util.Collection;

/* JADX INFO: loaded from: classes3.dex */
public final class wflxmlrfwp {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    public static final wflxmlrfwp f106634iobyxmoadg = new wflxmlrfwp();

    private wflxmlrfwp() {
    }

    private final boolean eablkybsjg(jh.zoijcleaow zoijcleaowVar) {
        if (hg.jyumaefscl.xrmfcynszj(btonecajqb.f106504iobyxmoadg.ppxfxbqfkf(), pi.eablkybsjg.gtknphoqwx(zoijcleaowVar)) && zoijcleaowVar.dxjokdxxww().isEmpty()) {
            return true;
        }
        if (!gh.dxjokdxxww.metgxyhuhe(zoijcleaowVar)) {
            return false;
        }
        Collection collectionEablkybsjg = zoijcleaowVar.eablkybsjg();
        kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(collectionEablkybsjg, "getOverriddenDescriptors(...)");
        Collection<jh.zoijcleaow> collection = collectionEablkybsjg;
        if (!collection.isEmpty()) {
            for (jh.zoijcleaow zoijcleaowVar2 : collection) {
                wflxmlrfwp wflxmlrfwpVar = f106634iobyxmoadg;
                kotlin.jvm.internal.zdlpuopuiu.lqeggnwhkg(zoijcleaowVar2);
                if (wflxmlrfwpVar.wkgbmnqykc(zoijcleaowVar2)) {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean ppxfxbqfkf(jh.zoijcleaow it) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(it, "it");
        return f106634iobyxmoadg.wkgbmnqykc(it);
    }

    public final boolean wkgbmnqykc(jh.zoijcleaow callableMemberDescriptor) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(callableMemberDescriptor, "callableMemberDescriptor");
        if (btonecajqb.f106504iobyxmoadg.wkgbmnqykc().contains(callableMemberDescriptor.getName())) {
            return eablkybsjg(callableMemberDescriptor);
        }
        return false;
    }

    public final String zoijcleaow(jh.zoijcleaow zoijcleaowVar) {
        ii.gxszxtbevo gxszxtbevoVar;
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(zoijcleaowVar, "<this>");
        gh.dxjokdxxww.metgxyhuhe(zoijcleaowVar);
        jh.zoijcleaow zoijcleaowVarDxjokdxxww = pi.eablkybsjg.dxjokdxxww(pi.eablkybsjg.iwizpuwonk(zoijcleaowVar), false, draadjrbmk.f106519zdlpuopuiu, 1, null);
        if (zoijcleaowVarDxjokdxxww == null || (gxszxtbevoVar = (ii.gxszxtbevo) btonecajqb.f106504iobyxmoadg.iobyxmoadg().get(pi.eablkybsjg.ojitshcjhn(zoijcleaowVarDxjokdxxww))) == null) {
            return null;
        }
        return gxszxtbevoVar.zoijcleaow();
    }
}
