package j0;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public abstract class lqeggnwhkg {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private static final eablkybsjg f50291iobyxmoadg = new eablkybsjg("", null, 2, 0 == true ? 1 : 0);

    public static final class iobyxmoadg implements Comparator {
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return kg.iobyxmoadg.wkgbmnqykc(Integer.valueOf(((eablkybsjg.wkgbmnqykc) obj).nufgyqmvbu()), Integer.valueOf(((eablkybsjg.wkgbmnqykc) obj2).nufgyqmvbu()));
        }
    }

    public static final boolean btonecajqb(int i13, int i14, int i15, int i16) {
        return ((i13 < i16) & (i15 < i14)) | (((i13 == i14) | (i15 == i16)) & (i13 == i15));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final eablkybsjg draadjrbmk(eablkybsjg eablkybsjgVar, int i13, int i14) {
        String strSubstring;
        if (i13 != i14) {
            strSubstring = eablkybsjgVar.btonecajqb().substring(i13, i14);
            kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(strSubstring, "substring(...)");
        } else {
            strSubstring = "";
        }
        List listNufgyqmvbu = nufgyqmvbu(eablkybsjgVar, i13, i14, new tg.draadjrbmk() { // from class: j0.gxszxtbevo
            @Override // tg.draadjrbmk
            public final Object invoke(Object obj) {
                return Boolean.valueOf(lqeggnwhkg.wflxmlrfwp((eablkybsjg.iobyxmoadg) obj));
            }
        });
        if (listNufgyqmvbu == null) {
            listNufgyqmvbu = hg.jyumaefscl.wflxmlrfwp();
        }
        return new eablkybsjg(strSubstring, listNufgyqmvbu);
    }

    static /* synthetic */ List dxjokdxxww(eablkybsjg eablkybsjgVar, int i13, int i14, tg.draadjrbmk draadjrbmkVar, int i15, Object obj) {
        if ((i15 & 4) != 0) {
            draadjrbmkVar = null;
        }
        return nufgyqmvbu(eablkybsjgVar, i13, i14, draadjrbmkVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List eablkybsjg(List list, List list2) {
        if (list.isEmpty() && list2.isEmpty()) {
            return null;
        }
        if (list2.isEmpty()) {
            return list;
        }
        if (list.isEmpty()) {
            return list2;
        }
        ArrayList arrayList = new ArrayList(list.size() + list2.size());
        int size = list.size();
        for (int i13 = 0; i13 < size; i13++) {
            arrayList.add((eablkybsjg.wkgbmnqykc) list.get(i13));
        }
        int size2 = list2.size();
        for (int i14 = 0; i14 < size2; i14++) {
            arrayList.add((eablkybsjg.wkgbmnqykc) list2.get(i14));
        }
        return arrayList;
    }

    public static final List gtknphoqwx(eablkybsjg eablkybsjgVar, ylkuphrtab ylkuphrtabVar) {
        List listWflxmlrfwp;
        List listGxszxtbevo = eablkybsjgVar.gxszxtbevo();
        if (listGxszxtbevo == null || (listWflxmlrfwp = hg.jyumaefscl.d(listGxszxtbevo, new iobyxmoadg())) == null) {
            listWflxmlrfwp = hg.jyumaefscl.wflxmlrfwp();
        }
        ArrayList arrayList = new ArrayList();
        hg.wflxmlrfwp wflxmlrfwpVar = new hg.wflxmlrfwp();
        int size = listWflxmlrfwp.size();
        int iGxszxtbevo = 0;
        for (int i13 = 0; i13 < size; i13++) {
            eablkybsjg.wkgbmnqykc wkgbmnqykcVar = (eablkybsjg.wkgbmnqykc) listWflxmlrfwp.get(i13);
            eablkybsjg.wkgbmnqykc wkgbmnqykcVarEablkybsjg = eablkybsjg.wkgbmnqykc.eablkybsjg(wkgbmnqykcVar, ylkuphrtabVar.draadjrbmk((ylkuphrtab) wkgbmnqykcVar.lqeggnwhkg()), 0, 0, null, 14, null);
            while (iGxszxtbevo < wkgbmnqykcVarEablkybsjg.nufgyqmvbu() && !wflxmlrfwpVar.isEmpty()) {
                eablkybsjg.wkgbmnqykc wkgbmnqykcVar2 = (eablkybsjg.wkgbmnqykc) wflxmlrfwpVar.last();
                if (wkgbmnqykcVarEablkybsjg.nufgyqmvbu() < wkgbmnqykcVar2.gxszxtbevo()) {
                    arrayList.add(new eablkybsjg.wkgbmnqykc(wkgbmnqykcVar2.lqeggnwhkg(), iGxszxtbevo, wkgbmnqykcVarEablkybsjg.nufgyqmvbu()));
                    iGxszxtbevo = wkgbmnqykcVarEablkybsjg.nufgyqmvbu();
                } else {
                    arrayList.add(new eablkybsjg.wkgbmnqykc(wkgbmnqykcVar2.lqeggnwhkg(), iGxszxtbevo, wkgbmnqykcVar2.gxszxtbevo()));
                    iGxszxtbevo = wkgbmnqykcVar2.gxszxtbevo();
                    while (!wflxmlrfwpVar.isEmpty() && iGxszxtbevo == ((eablkybsjg.wkgbmnqykc) wflxmlrfwpVar.last()).gxszxtbevo()) {
                        wflxmlrfwpVar.removeLast();
                    }
                }
            }
            if (iGxszxtbevo < wkgbmnqykcVarEablkybsjg.nufgyqmvbu()) {
                arrayList.add(new eablkybsjg.wkgbmnqykc(ylkuphrtabVar, iGxszxtbevo, wkgbmnqykcVarEablkybsjg.nufgyqmvbu()));
                iGxszxtbevo = wkgbmnqykcVarEablkybsjg.nufgyqmvbu();
            }
            eablkybsjg.wkgbmnqykc wkgbmnqykcVar3 = (eablkybsjg.wkgbmnqykc) wflxmlrfwpVar.vdvldrhtss();
            if (wkgbmnqykcVar3 == null) {
                wflxmlrfwpVar.add(new eablkybsjg.wkgbmnqykc(wkgbmnqykcVarEablkybsjg.lqeggnwhkg(), wkgbmnqykcVarEablkybsjg.nufgyqmvbu(), wkgbmnqykcVarEablkybsjg.gxszxtbevo()));
            } else if (wkgbmnqykcVar3.nufgyqmvbu() == wkgbmnqykcVarEablkybsjg.nufgyqmvbu() && wkgbmnqykcVar3.gxszxtbevo() == wkgbmnqykcVarEablkybsjg.gxszxtbevo()) {
                wflxmlrfwpVar.removeLast();
                wflxmlrfwpVar.add(new eablkybsjg.wkgbmnqykc(((ylkuphrtab) wkgbmnqykcVar3.lqeggnwhkg()).draadjrbmk((ylkuphrtab) wkgbmnqykcVarEablkybsjg.lqeggnwhkg()), wkgbmnqykcVarEablkybsjg.nufgyqmvbu(), wkgbmnqykcVarEablkybsjg.gxszxtbevo()));
            } else if (wkgbmnqykcVar3.nufgyqmvbu() == wkgbmnqykcVar3.gxszxtbevo()) {
                arrayList.add(new eablkybsjg.wkgbmnqykc(wkgbmnqykcVar3.lqeggnwhkg(), wkgbmnqykcVar3.nufgyqmvbu(), wkgbmnqykcVar3.gxszxtbevo()));
                wflxmlrfwpVar.removeLast();
                wflxmlrfwpVar.add(new eablkybsjg.wkgbmnqykc(wkgbmnqykcVarEablkybsjg.lqeggnwhkg(), wkgbmnqykcVarEablkybsjg.nufgyqmvbu(), wkgbmnqykcVarEablkybsjg.gxszxtbevo()));
            } else {
                if (wkgbmnqykcVar3.gxszxtbevo() < wkgbmnqykcVarEablkybsjg.gxszxtbevo()) {
                    throw new IllegalArgumentException();
                }
                wflxmlrfwpVar.add(new eablkybsjg.wkgbmnqykc(((ylkuphrtab) wkgbmnqykcVar3.lqeggnwhkg()).draadjrbmk((ylkuphrtab) wkgbmnqykcVarEablkybsjg.lqeggnwhkg()), wkgbmnqykcVarEablkybsjg.nufgyqmvbu(), wkgbmnqykcVarEablkybsjg.gxszxtbevo()));
            }
        }
        while (iGxszxtbevo <= eablkybsjgVar.btonecajqb().length() && !wflxmlrfwpVar.isEmpty()) {
            eablkybsjg.wkgbmnqykc wkgbmnqykcVar4 = (eablkybsjg.wkgbmnqykc) wflxmlrfwpVar.last();
            arrayList.add(new eablkybsjg.wkgbmnqykc(wkgbmnqykcVar4.lqeggnwhkg(), iGxszxtbevo, wkgbmnqykcVar4.gxszxtbevo()));
            iGxszxtbevo = wkgbmnqykcVar4.gxszxtbevo();
            while (!wflxmlrfwpVar.isEmpty() && iGxszxtbevo == ((eablkybsjg.wkgbmnqykc) wflxmlrfwpVar.last()).gxszxtbevo()) {
                wflxmlrfwpVar.removeLast();
            }
        }
        if (iGxszxtbevo < eablkybsjgVar.btonecajqb().length()) {
            arrayList.add(new eablkybsjg.wkgbmnqykc(ylkuphrtabVar, iGxszxtbevo, eablkybsjgVar.btonecajqb().length()));
        }
        if (arrayList.isEmpty()) {
            arrayList.add(new eablkybsjg.wkgbmnqykc(ylkuphrtabVar, 0, 0));
        }
        return arrayList;
    }

    public static final eablkybsjg gxszxtbevo() {
        return f50291iobyxmoadg;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List lqeggnwhkg(List list, int i13, int i14) {
        if (!(i13 <= i14)) {
            q0.iobyxmoadg.iobyxmoadg("start (" + i13 + ") should be less than or equal to end (" + i14 + ')');
        }
        if (list == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i15 = 0; i15 < size; i15++) {
            eablkybsjg.wkgbmnqykc wkgbmnqykcVar = (eablkybsjg.wkgbmnqykc) list.get(i15);
            if (btonecajqb(i13, i14, wkgbmnqykcVar.nufgyqmvbu(), wkgbmnqykcVar.gxszxtbevo())) {
                arrayList.add(new eablkybsjg.wkgbmnqykc(wkgbmnqykcVar.lqeggnwhkg(), Math.max(i13, wkgbmnqykcVar.nufgyqmvbu()) - i13, Math.min(i14, wkgbmnqykcVar.gxszxtbevo()) - i13, wkgbmnqykcVar.dxjokdxxww()));
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return arrayList;
    }

    private static final List nufgyqmvbu(eablkybsjg eablkybsjgVar, int i13, int i14, tg.draadjrbmk draadjrbmkVar) {
        List listPpxfxbqfkf;
        if (i13 == i14 || (listPpxfxbqfkf = eablkybsjgVar.ppxfxbqfkf()) == null) {
            return null;
        }
        if (i13 != 0 || i14 < eablkybsjgVar.btonecajqb().length()) {
            ArrayList arrayList = new ArrayList(listPpxfxbqfkf.size());
            int size = listPpxfxbqfkf.size();
            for (int i15 = 0; i15 < size; i15++) {
                eablkybsjg.wkgbmnqykc wkgbmnqykcVar = (eablkybsjg.wkgbmnqykc) listPpxfxbqfkf.get(i15);
                if ((draadjrbmkVar != null ? ((Boolean) draadjrbmkVar.invoke(wkgbmnqykcVar.lqeggnwhkg())).booleanValue() : true) && btonecajqb(i13, i14, wkgbmnqykcVar.nufgyqmvbu(), wkgbmnqykcVar.gxszxtbevo())) {
                    arrayList.add(new eablkybsjg.wkgbmnqykc((eablkybsjg.iobyxmoadg) wkgbmnqykcVar.lqeggnwhkg(), zg.gtknphoqwx.agtfadlqog(wkgbmnqykcVar.nufgyqmvbu(), i13, i14) - i13, zg.gtknphoqwx.agtfadlqog(wkgbmnqykcVar.gxszxtbevo(), i13, i14) - i13, wkgbmnqykcVar.dxjokdxxww()));
                }
            }
            return arrayList;
        }
        if (draadjrbmkVar == null) {
            return listPpxfxbqfkf;
        }
        ArrayList arrayList2 = new ArrayList(listPpxfxbqfkf.size());
        int size2 = listPpxfxbqfkf.size();
        for (int i16 = 0; i16 < size2; i16++) {
            Object obj = listPpxfxbqfkf.get(i16);
            if (((Boolean) draadjrbmkVar.invoke(((eablkybsjg.wkgbmnqykc) obj).lqeggnwhkg())).booleanValue()) {
                arrayList2.add(obj);
            }
        }
        return arrayList2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean wflxmlrfwp(eablkybsjg.iobyxmoadg iobyxmoadgVar) {
        return !(iobyxmoadgVar instanceof ylkuphrtab);
    }
}
