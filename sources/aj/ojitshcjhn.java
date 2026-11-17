package aj;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import jh.yfnezrywwk;
import zi.grlcpdaxtj;
import zi.ikoacuggdj;
import zi.iwxlajgraz;
import zi.kegysxyocb;
import zi.mhtqkkgtqm;
import zi.ntlheqmsrt;
import zi.nuxfzjnpeb;
import zi.wizcaqwiak;

/* JADX INFO: loaded from: classes3.dex */
public abstract class ojitshcjhn {
    private static final List iobyxmoadg(grlcpdaxtj grlcpdaxtjVar, dj.zoijcleaow zoijcleaowVar) {
        if (grlcpdaxtjVar.fyldjkxazc().size() != grlcpdaxtjVar.grlcpdaxtj().getParameters().size()) {
            return null;
        }
        List listFyldjkxazc = grlcpdaxtjVar.fyldjkxazc();
        if (listFyldjkxazc == null || !listFyldjkxazc.isEmpty()) {
            Iterator it = listFyldjkxazc.iterator();
            while (it.hasNext()) {
                if (((iwxlajgraz) it.next()).ppxfxbqfkf() != mhtqkkgtqm.INVARIANT) {
                    List parameters = grlcpdaxtjVar.grlcpdaxtj().getParameters();
                    kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(parameters, "getParameters(...)");
                    List<gg.vdvldrhtss> listW = hg.jyumaefscl.w(listFyldjkxazc, parameters);
                    ArrayList arrayList = new ArrayList(hg.jyumaefscl.cqumvgiudr(listW, 10));
                    for (gg.vdvldrhtss vdvldrhtssVar : listW) {
                        iwxlajgraz iwxlajgrazVarWkgbmnqykc = (iwxlajgraz) vdvldrhtssVar.iobyxmoadg();
                        yfnezrywwk yfnezrywwkVar = (yfnezrywwk) vdvldrhtssVar.wkgbmnqykc();
                        if (iwxlajgrazVarWkgbmnqykc.ppxfxbqfkf() != mhtqkkgtqm.INVARIANT) {
                            grlcpdaxtj grlcpdaxtjVarJrbgnlbqoe = (iwxlajgrazVarWkgbmnqykc.zoijcleaow() || iwxlajgrazVarWkgbmnqykc.ppxfxbqfkf() != mhtqkkgtqm.IN_VARIANCE) ? null : iwxlajgrazVarWkgbmnqykc.getType().jrbgnlbqoe();
                            kotlin.jvm.internal.zdlpuopuiu.lqeggnwhkg(yfnezrywwkVar);
                            iwxlajgrazVarWkgbmnqykc = ej.wkgbmnqykc.wkgbmnqykc(new dxjokdxxww(zoijcleaowVar, grlcpdaxtjVarJrbgnlbqoe, iwxlajgrazVarWkgbmnqykc, yfnezrywwkVar));
                        }
                        arrayList.add(iwxlajgrazVarWkgbmnqykc);
                    }
                    wizcaqwiak wizcaqwiakVarPpxfxbqfkf = nuxfzjnpeb.f130098ppxfxbqfkf.zoijcleaow(grlcpdaxtjVar.grlcpdaxtj(), arrayList).ppxfxbqfkf();
                    int size = listFyldjkxazc.size();
                    for (int i13 = 0; i13 < size; i13++) {
                        iwxlajgraz iwxlajgrazVar = (iwxlajgraz) listFyldjkxazc.get(i13);
                        iwxlajgraz iwxlajgrazVar2 = (iwxlajgraz) arrayList.get(i13);
                        if (iwxlajgrazVar.ppxfxbqfkf() != mhtqkkgtqm.INVARIANT) {
                            List upperBounds = ((yfnezrywwk) grlcpdaxtjVar.grlcpdaxtj().getParameters().get(i13)).getUpperBounds();
                            kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(upperBounds, "getUpperBounds(...)");
                            ArrayList arrayList2 = new ArrayList();
                            Iterator it2 = upperBounds.iterator();
                            while (it2.hasNext()) {
                                arrayList2.add(gxszxtbevo.iobyxmoadg.f2058iobyxmoadg.iobyxmoadg(wizcaqwiakVarPpxfxbqfkf.agtfadlqog((kegysxyocb) it2.next(), mhtqkkgtqm.INVARIANT).jrbgnlbqoe()));
                            }
                            if (!iwxlajgrazVar.zoijcleaow() && iwxlajgrazVar.ppxfxbqfkf() == mhtqkkgtqm.OUT_VARIANCE) {
                                arrayList2.add(gxszxtbevo.iobyxmoadg.f2058iobyxmoadg.iobyxmoadg(iwxlajgrazVar.getType().jrbgnlbqoe()));
                            }
                            kegysxyocb type = iwxlajgrazVar2.getType();
                            kotlin.jvm.internal.zdlpuopuiu.nufgyqmvbu(type, "null cannot be cast to non-null type org.jetbrains.kotlin.types.checker.NewCapturedType");
                            ((dxjokdxxww) type).grlcpdaxtj().ojitshcjhn(arrayList2);
                        }
                    }
                    return arrayList;
                }
            }
        }
        return null;
    }

    private static final ikoacuggdj ppxfxbqfkf(grlcpdaxtj grlcpdaxtjVar, List list) {
        return ntlheqmsrt.gtknphoqwx(grlcpdaxtjVar.ipoelvxyzq(), grlcpdaxtjVar.grlcpdaxtj(), list, grlcpdaxtjVar.mhtqkkgtqm(), null, 16, null);
    }

    public static final ikoacuggdj zoijcleaow(ikoacuggdj type, dj.zoijcleaow status) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(type, "type");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(status, "status");
        List listIobyxmoadg = iobyxmoadg(type, status);
        if (listIobyxmoadg != null) {
            return ppxfxbqfkf(type, listIobyxmoadg);
        }
        return null;
    }
}
