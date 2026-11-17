package sh;

import java.util.Map;
import jh.jztzpxfvev;

/* JADX INFO: loaded from: classes3.dex */
public final class gxszxtbevo extends mbcevpiqjq {

    /* JADX INFO: renamed from: ojitshcjhn, reason: collision with root package name */
    public static final gxszxtbevo f106533ojitshcjhn = new gxszxtbevo();

    private gxszxtbevo() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean draadjrbmk(jztzpxfvev jztzpxfvevVar, jh.zoijcleaow it) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(it, "it");
        return mbcevpiqjq.f106567iobyxmoadg.btonecajqb().containsKey(bi.istkbnxepw.wkgbmnqykc(jztzpxfvevVar));
    }

    public final ii.gxszxtbevo btonecajqb(jztzpxfvev functionDescriptor) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(functionDescriptor, "functionDescriptor");
        Map mapBtonecajqb = mbcevpiqjq.f106567iobyxmoadg.btonecajqb();
        String strWkgbmnqykc = bi.istkbnxepw.wkgbmnqykc(functionDescriptor);
        if (strWkgbmnqykc == null) {
            return null;
        }
        return (ii.gxszxtbevo) mapBtonecajqb.get(strWkgbmnqykc);
    }

    public final boolean gtknphoqwx(jztzpxfvev functionDescriptor) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(functionDescriptor, "functionDescriptor");
        return gh.dxjokdxxww.metgxyhuhe(functionDescriptor) && pi.eablkybsjg.dxjokdxxww(functionDescriptor, false, new eablkybsjg(functionDescriptor), 1, null) != null;
    }

    public final boolean wflxmlrfwp(jztzpxfvev jztzpxfvevVar) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(jztzpxfvevVar, "<this>");
        return kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(jztzpxfvevVar.getName().zoijcleaow(), "removeAt") && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(bi.istkbnxepw.wkgbmnqykc(jztzpxfvevVar), mbcevpiqjq.f106567iobyxmoadg.nufgyqmvbu().wkgbmnqykc());
    }
}
