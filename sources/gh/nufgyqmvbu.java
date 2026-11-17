package gh;

import gg.cqumvgiudr;
import hg.jyumaefscl;
import hg.tzroggbefp;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.zdlpuopuiu;
import zi.ikoacuggdj;
import zi.iwxlajgraz;
import zi.iyctptxqzt;
import zi.kegysxyocb;
import zi.ntlheqmsrt;

/* JADX INFO: loaded from: classes3.dex */
public abstract class nufgyqmvbu {
    public static final boolean agtfadlqog(kegysxyocb kegysxyocbVar) {
        zdlpuopuiu.btonecajqb(kegysxyocbVar, "<this>");
        return rgvfuqvkyq(kegysxyocbVar) && kcexrzcfyt(kegysxyocbVar);
    }

    public static final hh.gxszxtbevo btonecajqb(kegysxyocb kegysxyocbVar) {
        zdlpuopuiu.btonecajqb(kegysxyocbVar, "<this>");
        jh.nufgyqmvbu nufgyqmvbuVarYlkuphrtab = kegysxyocbVar.grlcpdaxtj().ylkuphrtab();
        if (nufgyqmvbuVarYlkuphrtab != null) {
            return dxjokdxxww(nufgyqmvbuVarYlkuphrtab);
        }
        return null;
    }

    public static final kegysxyocb draadjrbmk(kegysxyocb kegysxyocbVar) {
        zdlpuopuiu.btonecajqb(kegysxyocbVar, "<this>");
        rgvfuqvkyq(kegysxyocbVar);
        kegysxyocb type = ((iwxlajgraz) jyumaefscl.skhdrjzrfn(kegysxyocbVar.fyldjkxazc())).getType();
        zdlpuopuiu.dxjokdxxww(type, "getType(...)");
        return type;
    }

    public static final hh.gxszxtbevo dxjokdxxww(jh.wflxmlrfwp wflxmlrfwpVar) {
        zdlpuopuiu.btonecajqb(wflxmlrfwpVar, "<this>");
        if ((wflxmlrfwpVar instanceof jh.eablkybsjg) && dxjokdxxww.dvvnrvtcbc(wflxmlrfwpVar)) {
            return nufgyqmvbu(pi.eablkybsjg.rgvfuqvkyq(wflxmlrfwpVar));
        }
        return null;
    }

    public static final List eablkybsjg(kegysxyocb kegysxyocbVar) {
        zdlpuopuiu.btonecajqb(kegysxyocbVar, "<this>");
        rgvfuqvkyq(kegysxyocbVar);
        int iIobyxmoadg = iobyxmoadg(kegysxyocbVar);
        if (iIobyxmoadg == 0) {
            return jyumaefscl.wflxmlrfwp();
        }
        List listSubList = kegysxyocbVar.fyldjkxazc().subList(0, iIobyxmoadg);
        ArrayList arrayList = new ArrayList(jyumaefscl.cqumvgiudr(listSubList, 10));
        Iterator it = listSubList.iterator();
        while (it.hasNext()) {
            arrayList.add(((iwxlajgraz) it.next()).getType());
        }
        return arrayList;
    }

    public static final kegysxyocb gtknphoqwx(kegysxyocb kegysxyocbVar) {
        zdlpuopuiu.btonecajqb(kegysxyocbVar, "<this>");
        rgvfuqvkyq(kegysxyocbVar);
        if (!kcexrzcfyt(kegysxyocbVar)) {
            return null;
        }
        return ((iwxlajgraz) kegysxyocbVar.fyldjkxazc().get(iobyxmoadg(kegysxyocbVar))).getType();
    }

    public static final jh.eablkybsjg gxszxtbevo(dxjokdxxww builtIns, int i13, boolean z13) {
        zdlpuopuiu.btonecajqb(builtIns, "builtIns");
        jh.eablkybsjg eablkybsjgVarCrxdokpmqz = z13 ? builtIns.crxdokpmqz(i13) : builtIns.istkbnxepw(i13);
        zdlpuopuiu.lqeggnwhkg(eablkybsjgVarCrxdokpmqz);
        return eablkybsjgVarCrxdokpmqz;
    }

    public static final int iobyxmoadg(kegysxyocb kegysxyocbVar) {
        zdlpuopuiu.btonecajqb(kegysxyocbVar, "<this>");
        kh.ppxfxbqfkf ppxfxbqfkfVarLqeggnwhkg = kegysxyocbVar.getAnnotations().lqeggnwhkg(ojitshcjhn.iobyxmoadg.f37278cdpycssgdh);
        if (ppxfxbqfkfVarLqeggnwhkg == null) {
            return 0;
        }
        ni.lqeggnwhkg lqeggnwhkgVar = (ni.lqeggnwhkg) tzroggbefp.btonecajqb(ppxfxbqfkfVarLqeggnwhkg.zoijcleaow(), ojitshcjhn.f37264vdvldrhtss);
        zdlpuopuiu.nufgyqmvbu(lqeggnwhkgVar, "null cannot be cast to non-null type org.jetbrains.kotlin.resolve.constants.IntValue");
        return ((Number) ((ni.agtfadlqog) lqeggnwhkgVar).zoijcleaow()).intValue();
    }

    private static final boolean kcexrzcfyt(kegysxyocb kegysxyocbVar) {
        return kegysxyocbVar.getAnnotations().lqeggnwhkg(ojitshcjhn.iobyxmoadg.f37302istkbnxepw) != null;
    }

    public static final List lqeggnwhkg(kegysxyocb kegysxyocbVar, List contextReceiverTypes, List parameterTypes, List list, kegysxyocb returnType, dxjokdxxww builtIns) {
        ii.gxszxtbevo gxszxtbevoVar;
        zdlpuopuiu.btonecajqb(contextReceiverTypes, "contextReceiverTypes");
        zdlpuopuiu.btonecajqb(parameterTypes, "parameterTypes");
        zdlpuopuiu.btonecajqb(returnType, "returnType");
        zdlpuopuiu.btonecajqb(builtIns, "builtIns");
        int i13 = 0;
        ArrayList arrayList = new ArrayList(parameterTypes.size() + contextReceiverTypes.size() + (kegysxyocbVar != null ? 1 : 0) + 1);
        ArrayList arrayList2 = new ArrayList(jyumaefscl.cqumvgiudr(contextReceiverTypes, 10));
        Iterator it = contextReceiverTypes.iterator();
        while (it.hasNext()) {
            arrayList2.add(ej.wkgbmnqykc.wkgbmnqykc((kegysxyocb) it.next()));
        }
        arrayList.addAll(arrayList2);
        jj.iobyxmoadg.iobyxmoadg(arrayList, kegysxyocbVar != null ? ej.wkgbmnqykc.wkgbmnqykc(kegysxyocbVar) : null);
        for (Object obj : parameterTypes) {
            int i14 = i13 + 1;
            if (i13 < 0) {
                jyumaefscl.iwizpuwonk();
            }
            kegysxyocb kegysxyocbVarIstkbnxepw = (kegysxyocb) obj;
            if (list == null || (gxszxtbevoVar = (ii.gxszxtbevo) list.get(i13)) == null || gxszxtbevoVar.lqeggnwhkg()) {
                gxszxtbevoVar = null;
            }
            if (gxszxtbevoVar != null) {
                ii.ppxfxbqfkf ppxfxbqfkfVar = ojitshcjhn.iobyxmoadg.f37356yadqdtsiqt;
                ii.gxszxtbevo gxszxtbevoVar2 = ojitshcjhn.f37265wflxmlrfwp;
                String strZoijcleaow = gxszxtbevoVar.zoijcleaow();
                zdlpuopuiu.dxjokdxxww(strZoijcleaow, "asString(...)");
                kegysxyocbVarIstkbnxepw = ej.wkgbmnqykc.istkbnxepw(kegysxyocbVarIstkbnxepw, kh.nufgyqmvbu.f55413nufgyqmvbu.iobyxmoadg(jyumaefscl.mhtqkkgtqm(kegysxyocbVarIstkbnxepw.getAnnotations(), new kh.draadjrbmk(builtIns, ppxfxbqfkfVar, tzroggbefp.gxszxtbevo(cqumvgiudr.iobyxmoadg(gxszxtbevoVar2, new ni.cqumvgiudr(strZoijcleaow))), false, 8, null))));
            }
            arrayList.add(ej.wkgbmnqykc.wkgbmnqykc(kegysxyocbVarIstkbnxepw));
            i13 = i14;
        }
        arrayList.add(ej.wkgbmnqykc.wkgbmnqykc(returnType));
        return arrayList;
    }

    private static final hh.gxszxtbevo nufgyqmvbu(ii.wkgbmnqykc wkgbmnqykcVar) {
        if (!wkgbmnqykcVar.gxszxtbevo() || wkgbmnqykcVar.eablkybsjg()) {
            return null;
        }
        hh.lqeggnwhkg lqeggnwhkgVarIobyxmoadg = hh.lqeggnwhkg.f40304ppxfxbqfkf.iobyxmoadg();
        ii.ppxfxbqfkf ppxfxbqfkfVarEablkybsjg = wkgbmnqykcVar.draadjrbmk().eablkybsjg();
        zdlpuopuiu.dxjokdxxww(ppxfxbqfkfVarEablkybsjg, "parent(...)");
        String strZoijcleaow = wkgbmnqykcVar.dxjokdxxww().zoijcleaow();
        zdlpuopuiu.dxjokdxxww(strZoijcleaow, "asString(...)");
        return lqeggnwhkgVarIobyxmoadg.zoijcleaow(ppxfxbqfkfVarEablkybsjg, strZoijcleaow);
    }

    public static final boolean ojitshcjhn(jh.wflxmlrfwp wflxmlrfwpVar) {
        zdlpuopuiu.btonecajqb(wflxmlrfwpVar, "<this>");
        hh.gxszxtbevo gxszxtbevoVarDxjokdxxww = dxjokdxxww(wflxmlrfwpVar);
        return zdlpuopuiu.eablkybsjg(gxszxtbevoVarDxjokdxxww, hh.gxszxtbevo.iobyxmoadg.f40298eablkybsjg) || zdlpuopuiu.eablkybsjg(gxszxtbevoVarDxjokdxxww, hh.gxszxtbevo.wkgbmnqykc.f40300eablkybsjg);
    }

    public static final boolean oxmwwwfdhm(kegysxyocb kegysxyocbVar) {
        zdlpuopuiu.btonecajqb(kegysxyocbVar, "<this>");
        return zdlpuopuiu.eablkybsjg(btonecajqb(kegysxyocbVar), hh.gxszxtbevo.wkgbmnqykc.f40300eablkybsjg);
    }

    public static final boolean rgvfuqvkyq(kegysxyocb kegysxyocbVar) {
        zdlpuopuiu.btonecajqb(kegysxyocbVar, "<this>");
        jh.nufgyqmvbu nufgyqmvbuVarYlkuphrtab = kegysxyocbVar.grlcpdaxtj().ylkuphrtab();
        return nufgyqmvbuVarYlkuphrtab != null && ojitshcjhn(nufgyqmvbuVarYlkuphrtab);
    }

    public static final boolean vdvldrhtss(kegysxyocb kegysxyocbVar) {
        zdlpuopuiu.btonecajqb(kegysxyocbVar, "<this>");
        return zdlpuopuiu.eablkybsjg(btonecajqb(kegysxyocbVar), hh.gxszxtbevo.iobyxmoadg.f40298eablkybsjg);
    }

    public static final List wflxmlrfwp(kegysxyocb kegysxyocbVar) {
        zdlpuopuiu.btonecajqb(kegysxyocbVar, "<this>");
        rgvfuqvkyq(kegysxyocbVar);
        List listFyldjkxazc = kegysxyocbVar.fyldjkxazc();
        return listFyldjkxazc.subList(iobyxmoadg(kegysxyocbVar) + (agtfadlqog(kegysxyocbVar) ? 1 : 0), listFyldjkxazc.size() - 1);
    }

    public static final ii.gxszxtbevo wkgbmnqykc(kegysxyocb kegysxyocbVar) {
        String str;
        zdlpuopuiu.btonecajqb(kegysxyocbVar, "<this>");
        kh.ppxfxbqfkf ppxfxbqfkfVarLqeggnwhkg = kegysxyocbVar.getAnnotations().lqeggnwhkg(ojitshcjhn.iobyxmoadg.f37356yadqdtsiqt);
        if (ppxfxbqfkfVarLqeggnwhkg == null) {
            return null;
        }
        Object objEslsurpljm = jyumaefscl.eslsurpljm(ppxfxbqfkfVarLqeggnwhkg.zoijcleaow().values());
        ni.cqumvgiudr cqumvgiudrVar = objEslsurpljm instanceof ni.cqumvgiudr ? (ni.cqumvgiudr) objEslsurpljm : null;
        if (cqumvgiudrVar != null && (str = (String) cqumvgiudrVar.zoijcleaow()) != null) {
            if (!ii.gxszxtbevo.nufgyqmvbu(str)) {
                str = null;
            }
            if (str != null) {
                return ii.gxszxtbevo.gxszxtbevo(str);
            }
        }
        return null;
    }

    public static final kh.nufgyqmvbu yggfygwlhe(kh.nufgyqmvbu nufgyqmvbuVar, dxjokdxxww builtIns) {
        zdlpuopuiu.btonecajqb(nufgyqmvbuVar, "<this>");
        zdlpuopuiu.btonecajqb(builtIns, "builtIns");
        ii.ppxfxbqfkf ppxfxbqfkfVar = ojitshcjhn.iobyxmoadg.f37302istkbnxepw;
        return nufgyqmvbuVar.wizcaqwiak(ppxfxbqfkfVar) ? nufgyqmvbuVar : kh.nufgyqmvbu.f55413nufgyqmvbu.iobyxmoadg(jyumaefscl.mhtqkkgtqm(nufgyqmvbuVar, new kh.draadjrbmk(builtIns, ppxfxbqfkfVar, tzroggbefp.dxjokdxxww(), false, 8, null)));
    }

    public static final kh.nufgyqmvbu zdlpuopuiu(kh.nufgyqmvbu nufgyqmvbuVar, dxjokdxxww builtIns, int i13) {
        zdlpuopuiu.btonecajqb(nufgyqmvbuVar, "<this>");
        zdlpuopuiu.btonecajqb(builtIns, "builtIns");
        ii.ppxfxbqfkf ppxfxbqfkfVar = ojitshcjhn.iobyxmoadg.f37278cdpycssgdh;
        return nufgyqmvbuVar.wizcaqwiak(ppxfxbqfkfVar) ? nufgyqmvbuVar : kh.nufgyqmvbu.f55413nufgyqmvbu.iobyxmoadg(jyumaefscl.mhtqkkgtqm(nufgyqmvbuVar, new kh.draadjrbmk(builtIns, ppxfxbqfkfVar, tzroggbefp.gxszxtbevo(cqumvgiudr.iobyxmoadg(ojitshcjhn.f37264vdvldrhtss, new ni.agtfadlqog(i13))), false, 8, null)));
    }

    public static final ikoacuggdj zoijcleaow(dxjokdxxww builtIns, kh.nufgyqmvbu annotations, kegysxyocb kegysxyocbVar, List contextReceiverTypes, List parameterTypes, List list, kegysxyocb returnType, boolean z13) {
        zdlpuopuiu.btonecajqb(builtIns, "builtIns");
        zdlpuopuiu.btonecajqb(annotations, "annotations");
        zdlpuopuiu.btonecajqb(contextReceiverTypes, "contextReceiverTypes");
        zdlpuopuiu.btonecajqb(parameterTypes, "parameterTypes");
        zdlpuopuiu.btonecajqb(returnType, "returnType");
        List listLqeggnwhkg = lqeggnwhkg(kegysxyocbVar, contextReceiverTypes, parameterTypes, list, returnType, builtIns);
        jh.eablkybsjg eablkybsjgVarGxszxtbevo = gxszxtbevo(builtIns, parameterTypes.size() + contextReceiverTypes.size() + (kegysxyocbVar == null ? 0 : 1), z13);
        if (kegysxyocbVar != null) {
            annotations = yggfygwlhe(annotations, builtIns);
        }
        if (!contextReceiverTypes.isEmpty()) {
            annotations = zdlpuopuiu(annotations, builtIns, contextReceiverTypes.size());
        }
        return ntlheqmsrt.nufgyqmvbu(iyctptxqzt.zoijcleaow(annotations), eablkybsjgVarGxszxtbevo, listLqeggnwhkg);
    }
}
