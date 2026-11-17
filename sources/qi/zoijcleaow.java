package qi;

import gh.ojitshcjhn;
import java.util.Iterator;
import java.util.List;
import jh.iyctptxqzt;
import jh.nufgyqmvbu;
import jh.wflxmlrfwp;
import jh.yfnezrywwk;
import kotlin.jvm.internal.zdlpuopuiu;
import li.dxjokdxxww;
import li.gtknphoqwx;
import zi.kegysxyocb;

/* JADX INFO: loaded from: classes3.dex */
public abstract class zoijcleaow {
    private static final boolean eablkybsjg(kegysxyocb kegysxyocbVar) {
        return wkgbmnqykc(kegysxyocbVar) || zoijcleaow(kegysxyocbVar, true);
    }

    public static final boolean gxszxtbevo(jh.zoijcleaow descriptor) {
        zdlpuopuiu.btonecajqb(descriptor, "descriptor");
        jh.wkgbmnqykc wkgbmnqykcVar = descriptor instanceof jh.wkgbmnqykc ? (jh.wkgbmnqykc) descriptor : null;
        if (wkgbmnqykcVar == null || jh.zdlpuopuiu.lqeggnwhkg(wkgbmnqykcVar.getVisibility())) {
            return false;
        }
        jh.eablkybsjg eablkybsjgVarJhduphickx = wkgbmnqykcVar.jhduphickx();
        zdlpuopuiu.dxjokdxxww(eablkybsjgVarJhduphickx, "getConstructedClass(...)");
        if (gtknphoqwx.lqeggnwhkg(eablkybsjgVarJhduphickx) || dxjokdxxww.lmojexxdyd(wkgbmnqykcVar.jhduphickx())) {
            return false;
        }
        List listDxjokdxxww = wkgbmnqykcVar.dxjokdxxww();
        zdlpuopuiu.dxjokdxxww(listDxjokdxxww, "getValueParameters(...)");
        if (listDxjokdxxww != null && listDxjokdxxww.isEmpty()) {
            return false;
        }
        Iterator it = listDxjokdxxww.iterator();
        while (it.hasNext()) {
            kegysxyocb type = ((iyctptxqzt) it.next()).getType();
            zdlpuopuiu.dxjokdxxww(type, "getType(...)");
            if (eablkybsjg(type)) {
                return true;
            }
        }
        return false;
    }

    private static final boolean iobyxmoadg(jh.eablkybsjg eablkybsjgVar) {
        return zdlpuopuiu.eablkybsjg(pi.eablkybsjg.ojitshcjhn(eablkybsjgVar), ojitshcjhn.f37252iwizpuwonk);
    }

    public static final boolean ppxfxbqfkf(wflxmlrfwp wflxmlrfwpVar) {
        zdlpuopuiu.btonecajqb(wflxmlrfwpVar, "<this>");
        return gtknphoqwx.lqeggnwhkg(wflxmlrfwpVar) && !iobyxmoadg((jh.eablkybsjg) wflxmlrfwpVar);
    }

    public static final boolean wkgbmnqykc(kegysxyocb kegysxyocbVar) {
        zdlpuopuiu.btonecajqb(kegysxyocbVar, "<this>");
        nufgyqmvbu nufgyqmvbuVarYlkuphrtab = kegysxyocbVar.grlcpdaxtj().ylkuphrtab();
        if (nufgyqmvbuVarYlkuphrtab != null) {
            return (gtknphoqwx.zoijcleaow(nufgyqmvbuVarYlkuphrtab) && ppxfxbqfkf(nufgyqmvbuVarYlkuphrtab)) || gtknphoqwx.dxjokdxxww(kegysxyocbVar);
        }
        return false;
    }

    private static final boolean zoijcleaow(kegysxyocb kegysxyocbVar, boolean z13) {
        nufgyqmvbu nufgyqmvbuVarYlkuphrtab = kegysxyocbVar.grlcpdaxtj().ylkuphrtab();
        yfnezrywwk yfnezrywwkVar = nufgyqmvbuVarYlkuphrtab instanceof yfnezrywwk ? (yfnezrywwk) nufgyqmvbuVarYlkuphrtab : null;
        if (yfnezrywwkVar == null) {
            return false;
        }
        return (z13 || !gtknphoqwx.wkgbmnqykc(yfnezrywwkVar)) && eablkybsjg(ej.wkgbmnqykc.ojitshcjhn(yfnezrywwkVar));
    }
}
