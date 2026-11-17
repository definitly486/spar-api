package jh;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public abstract class oipsdeybqn {
    /* JADX INFO: Access modifiers changed from: private */
    public static final lj.btonecajqb btonecajqb(wflxmlrfwp it) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(it, "it");
        List typeParameters = ((iobyxmoadg) it).getTypeParameters();
        kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(typeParameters, "getTypeParameters(...)");
        return hg.jyumaefscl.ikoacuggdj(typeParameters);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean dxjokdxxww(wflxmlrfwp it) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(it, "it");
        return !(it instanceof draadjrbmk);
    }

    private static final ulzqkzuiru eablkybsjg(zi.kegysxyocb kegysxyocbVar, dxjokdxxww dxjokdxxwwVar, int i13) {
        if (dxjokdxxwwVar == null || bj.draadjrbmk.wflxmlrfwp(dxjokdxxwwVar)) {
            return null;
        }
        int size = dxjokdxxwwVar.rgvfuqvkyq().size() + i13;
        if (dxjokdxxwwVar.lereixgezr()) {
            List listSubList = kegysxyocbVar.fyldjkxazc().subList(i13, size);
            wflxmlrfwp wflxmlrfwpVarZoijcleaow = dxjokdxxwwVar.zoijcleaow();
            return new ulzqkzuiru(dxjokdxxwwVar, listSubList, eablkybsjg(kegysxyocbVar, wflxmlrfwpVarZoijcleaow instanceof dxjokdxxww ? (dxjokdxxww) wflxmlrfwpVarZoijcleaow : null, size));
        }
        if (size != kegysxyocbVar.fyldjkxazc().size()) {
            li.dxjokdxxww.yadqdtsiqt(dxjokdxxwwVar);
        }
        return new ulzqkzuiru(dxjokdxxwwVar, kegysxyocbVar.fyldjkxazc().subList(i13, kegysxyocbVar.fyldjkxazc().size()), null);
    }

    private static final ppxfxbqfkf gxszxtbevo(yfnezrywwk yfnezrywwkVar, wflxmlrfwp wflxmlrfwpVar, int i13) {
        return new ppxfxbqfkf(yfnezrywwkVar, wflxmlrfwpVar, i13);
    }

    public static final List lqeggnwhkg(dxjokdxxww dxjokdxxwwVar) {
        List listWflxmlrfwp;
        Object next;
        zi.zeieaojujs zeieaojujsVarBtonecajqb;
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(dxjokdxxwwVar, "<this>");
        List listRgvfuqvkyq = dxjokdxxwwVar.rgvfuqvkyq();
        kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(listRgvfuqvkyq, "getDeclaredTypeParameters(...)");
        if (!dxjokdxxwwVar.lereixgezr() && !(dxjokdxxwwVar.zoijcleaow() instanceof iobyxmoadg)) {
            return listRgvfuqvkyq;
        }
        List listCrxdokpmqz = lj.wflxmlrfwp.crxdokpmqz(lj.wflxmlrfwp.wwaezpbzkn(lj.wflxmlrfwp.istkbnxepw(lj.wflxmlrfwp.ulzqkzuiru(pi.eablkybsjg.yggfygwlhe(dxjokdxxwwVar), ydmasvzmpa.f51349zdlpuopuiu), sflfametgt.f51340zdlpuopuiu), zfvoamnweg.f51379zdlpuopuiu));
        Iterator it = pi.eablkybsjg.yggfygwlhe(dxjokdxxwwVar).iterator();
        do {
            listWflxmlrfwp = null;
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!(next instanceof eablkybsjg));
        eablkybsjg eablkybsjgVar = (eablkybsjg) next;
        if (eablkybsjgVar != null && (zeieaojujsVarBtonecajqb = eablkybsjgVar.btonecajqb()) != null) {
            listWflxmlrfwp = zeieaojujsVarBtonecajqb.getParameters();
        }
        if (listWflxmlrfwp == null) {
            listWflxmlrfwp = hg.jyumaefscl.wflxmlrfwp();
        }
        if (listCrxdokpmqz.isEmpty() && listWflxmlrfwp.isEmpty()) {
            List listRgvfuqvkyq2 = dxjokdxxwwVar.rgvfuqvkyq();
            kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(listRgvfuqvkyq2, "getDeclaredTypeParameters(...)");
            return listRgvfuqvkyq2;
        }
        List<yfnezrywwk> listIxidwrxhsl = hg.jyumaefscl.ixidwrxhsl(listCrxdokpmqz, listWflxmlrfwp);
        ArrayList arrayList = new ArrayList(hg.jyumaefscl.cqumvgiudr(listIxidwrxhsl, 10));
        for (yfnezrywwk yfnezrywwkVar : listIxidwrxhsl) {
            kotlin.jvm.internal.zdlpuopuiu.lqeggnwhkg(yfnezrywwkVar);
            arrayList.add(gxszxtbevo(yfnezrywwkVar, dxjokdxxwwVar, listRgvfuqvkyq.size()));
        }
        return hg.jyumaefscl.ixidwrxhsl(listRgvfuqvkyq, arrayList);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean nufgyqmvbu(wflxmlrfwp it) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(it, "it");
        return it instanceof iobyxmoadg;
    }

    public static final ulzqkzuiru wkgbmnqykc(zi.kegysxyocb kegysxyocbVar) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(kegysxyocbVar, "<this>");
        nufgyqmvbu nufgyqmvbuVarWkgbmnqykc = kegysxyocbVar.grlcpdaxtj().wkgbmnqykc();
        return eablkybsjg(kegysxyocbVar, nufgyqmvbuVarWkgbmnqykc instanceof dxjokdxxww ? (dxjokdxxww) nufgyqmvbuVarWkgbmnqykc : null, 0);
    }
}
