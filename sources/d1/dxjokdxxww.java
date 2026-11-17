package d1;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public abstract class dxjokdxxww {
    public static ojitshcjhn iobyxmoadg(c1.eablkybsjg eablkybsjgVar, int i13, ArrayList arrayList, ojitshcjhn ojitshcjhnVar) {
        int iC;
        int i14 = i13 == 0 ? eablkybsjgVar.f18323yzdjzghtvl : eablkybsjgVar.f18247eslsurpljm;
        if (i14 != -1 && (ojitshcjhnVar == null || i14 != ojitshcjhnVar.ppxfxbqfkf())) {
            for (int i15 = 0; i15 < arrayList.size(); i15++) {
                ojitshcjhn ojitshcjhnVar2 = (ojitshcjhn) arrayList.get(i15);
                if (ojitshcjhnVar2.ppxfxbqfkf() == i14) {
                    if (ojitshcjhnVar != null) {
                        ojitshcjhnVar.lqeggnwhkg(i13, ojitshcjhnVar2);
                        arrayList.remove(ojitshcjhnVar);
                    }
                    ojitshcjhnVar = ojitshcjhnVar2;
                    break;
                }
            }
        } else if (i14 != -1) {
            return ojitshcjhnVar;
        }
        if (ojitshcjhnVar == null) {
            if ((eablkybsjgVar instanceof c1.btonecajqb) && (iC = ((c1.btonecajqb) eablkybsjgVar).C(i13)) != -1) {
                for (int i16 = 0; i16 < arrayList.size(); i16++) {
                    ojitshcjhn ojitshcjhnVar3 = (ojitshcjhn) arrayList.get(i16);
                    if (ojitshcjhnVar3.ppxfxbqfkf() == iC) {
                        ojitshcjhnVar = ojitshcjhnVar3;
                        break;
                    }
                }
            }
            if (ojitshcjhnVar == null) {
                ojitshcjhnVar = new ojitshcjhn(i13);
            }
            arrayList.add(ojitshcjhnVar);
        }
        if (ojitshcjhnVar.iobyxmoadg(eablkybsjgVar)) {
            if (eablkybsjgVar instanceof c1.nufgyqmvbu) {
                c1.nufgyqmvbu nufgyqmvbuVar = (c1.nufgyqmvbu) eablkybsjgVar;
                nufgyqmvbuVar.B().ppxfxbqfkf(nufgyqmvbuVar.C() == 0 ? 1 : 0, arrayList, ojitshcjhnVar);
            }
            if (i13 == 0) {
                eablkybsjgVar.f18323yzdjzghtvl = ojitshcjhnVar.ppxfxbqfkf();
                eablkybsjgVar.f18303stevsuqkhv.ppxfxbqfkf(i13, arrayList, ojitshcjhnVar);
                eablkybsjgVar.f18305tzroggbefp.ppxfxbqfkf(i13, arrayList, ojitshcjhnVar);
            } else {
                eablkybsjgVar.f18247eslsurpljm = ojitshcjhnVar.ppxfxbqfkf();
                eablkybsjgVar.f18275kegysxyocb.ppxfxbqfkf(i13, arrayList, ojitshcjhnVar);
                eablkybsjgVar.f18284ntlheqmsrt.ppxfxbqfkf(i13, arrayList, ojitshcjhnVar);
                eablkybsjgVar.f18281mbcevpiqjq.ppxfxbqfkf(i13, arrayList, ojitshcjhnVar);
            }
            eablkybsjgVar.f18239crxdokpmqz.ppxfxbqfkf(i13, arrayList, ojitshcjhnVar);
        }
        return ojitshcjhnVar;
    }

    /* JADX WARN: Code duplicated, block: B:176:0x0348  */
    public static boolean ppxfxbqfkf(c1.gxszxtbevo gxszxtbevoVar, zoijcleaow.InterfaceC0476zoijcleaow interfaceC0476zoijcleaow) {
        ojitshcjhn ojitshcjhnVar;
        boolean z13;
        boolean z14;
        ojitshcjhn ojitshcjhnVar2;
        ArrayList arrayListB = gxszxtbevoVar.B();
        int size = arrayListB.size();
        int i13 = 0;
        for (int i14 = 0; i14 < size; i14++) {
            c1.eablkybsjg eablkybsjgVar = (c1.eablkybsjg) arrayListB.get(i14);
            if (!wkgbmnqykc(gxszxtbevoVar.istkbnxepw(), gxszxtbevoVar.ulzqkzuiru(), eablkybsjgVar.istkbnxepw(), eablkybsjgVar.ulzqkzuiru()) || (eablkybsjgVar instanceof c1.lqeggnwhkg)) {
                return false;
            }
        }
        int i15 = 0;
        ArrayList arrayList = null;
        ArrayList<c1.btonecajqb> arrayList2 = null;
        ArrayList arrayList3 = null;
        ArrayList<c1.btonecajqb> arrayList4 = null;
        ArrayList arrayList5 = null;
        ArrayList arrayList6 = null;
        while (i15 < size) {
            c1.eablkybsjg eablkybsjgVar2 = (c1.eablkybsjg) arrayListB.get(i15);
            if (!wkgbmnqykc(gxszxtbevoVar.istkbnxepw(), gxszxtbevoVar.ulzqkzuiru(), eablkybsjgVar2.istkbnxepw(), eablkybsjgVar2.ulzqkzuiru())) {
                c1.gxszxtbevo.d0(i13, eablkybsjgVar2, interfaceC0476zoijcleaow, gxszxtbevoVar.E, zoijcleaow.iobyxmoadg.f26669gtknphoqwx);
            }
            boolean z15 = eablkybsjgVar2 instanceof c1.nufgyqmvbu;
            if (z15) {
                c1.nufgyqmvbu nufgyqmvbuVar = (c1.nufgyqmvbu) eablkybsjgVar2;
                if (nufgyqmvbuVar.C() == 0) {
                    if (arrayList3 == null) {
                        arrayList3 = new ArrayList();
                    }
                    arrayList3.add(nufgyqmvbuVar);
                }
                if (nufgyqmvbuVar.C() == 1) {
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    arrayList.add(nufgyqmvbuVar);
                }
            }
            if (eablkybsjgVar2 instanceof c1.btonecajqb) {
                if (eablkybsjgVar2 instanceof c1.iobyxmoadg) {
                    c1.iobyxmoadg iobyxmoadgVar = (c1.iobyxmoadg) eablkybsjgVar2;
                    if (iobyxmoadgVar.H() == 0) {
                        if (arrayList2 == null) {
                            arrayList2 = new ArrayList();
                        }
                        arrayList2.add(iobyxmoadgVar);
                    }
                    if (iobyxmoadgVar.H() == 1) {
                        if (arrayList4 == null) {
                            arrayList4 = new ArrayList();
                        }
                        arrayList4.add(iobyxmoadgVar);
                    }
                } else {
                    c1.btonecajqb btonecajqbVar = (c1.btonecajqb) eablkybsjgVar2;
                    if (arrayList2 == null) {
                        arrayList2 = new ArrayList();
                    }
                    arrayList2.add(btonecajqbVar);
                    if (arrayList4 == null) {
                        arrayList4 = new ArrayList();
                    }
                    arrayList4.add(btonecajqbVar);
                }
            }
            if (eablkybsjgVar2.f18303stevsuqkhv.f18440gxszxtbevo == null && eablkybsjgVar2.f18305tzroggbefp.f18440gxszxtbevo == null && !z15 && !(eablkybsjgVar2 instanceof c1.iobyxmoadg)) {
                if (arrayList5 == null) {
                    arrayList5 = new ArrayList();
                }
                arrayList5.add(eablkybsjgVar2);
            }
            if (eablkybsjgVar2.f18275kegysxyocb.f18440gxszxtbevo == null && eablkybsjgVar2.f18281mbcevpiqjq.f18440gxszxtbevo == null && eablkybsjgVar2.f18284ntlheqmsrt.f18440gxszxtbevo == null && !z15 && !(eablkybsjgVar2 instanceof c1.iobyxmoadg)) {
                if (arrayList6 == null) {
                    arrayList6 = new ArrayList();
                }
                arrayList6.add(eablkybsjgVar2);
            }
            i15++;
            i13 = 0;
        }
        ArrayList<ojitshcjhn> arrayList7 = new ArrayList();
        if (arrayList != null) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                iobyxmoadg((c1.nufgyqmvbu) it.next(), 0, arrayList7, null);
            }
        }
        int i16 = 0;
        ojitshcjhn ojitshcjhnVar3 = null;
        if (arrayList2 != null) {
            for (c1.btonecajqb btonecajqbVar2 : arrayList2) {
                ojitshcjhn ojitshcjhnVarIobyxmoadg = iobyxmoadg(btonecajqbVar2, i16, arrayList7, ojitshcjhnVar3);
                btonecajqbVar2.B(arrayList7, i16, ojitshcjhnVarIobyxmoadg);
                ojitshcjhnVarIobyxmoadg.zoijcleaow(arrayList7);
                i16 = 0;
                ojitshcjhnVar3 = null;
            }
        }
        c1.wkgbmnqykc wkgbmnqykcVarVdvldrhtss = gxszxtbevoVar.vdvldrhtss(c1.wkgbmnqykc.iobyxmoadg.LEFT);
        if (wkgbmnqykcVarVdvldrhtss.wkgbmnqykc() != null) {
            Iterator it2 = wkgbmnqykcVarVdvldrhtss.wkgbmnqykc().iterator();
            while (it2.hasNext()) {
                iobyxmoadg(((c1.wkgbmnqykc) it2.next()).f18445wkgbmnqykc, 0, arrayList7, null);
            }
        }
        c1.wkgbmnqykc wkgbmnqykcVarVdvldrhtss2 = gxszxtbevoVar.vdvldrhtss(c1.wkgbmnqykc.iobyxmoadg.RIGHT);
        if (wkgbmnqykcVarVdvldrhtss2.wkgbmnqykc() != null) {
            Iterator it3 = wkgbmnqykcVarVdvldrhtss2.wkgbmnqykc().iterator();
            while (it3.hasNext()) {
                iobyxmoadg(((c1.wkgbmnqykc) it3.next()).f18445wkgbmnqykc, 0, arrayList7, null);
            }
        }
        c1.wkgbmnqykc wkgbmnqykcVarVdvldrhtss3 = gxszxtbevoVar.vdvldrhtss(c1.wkgbmnqykc.iobyxmoadg.CENTER);
        if (wkgbmnqykcVarVdvldrhtss3.wkgbmnqykc() != null) {
            Iterator it4 = wkgbmnqykcVarVdvldrhtss3.wkgbmnqykc().iterator();
            while (it4.hasNext()) {
                iobyxmoadg(((c1.wkgbmnqykc) it4.next()).f18445wkgbmnqykc, 0, arrayList7, null);
            }
        }
        ojitshcjhn ojitshcjhnVar4 = null;
        if (arrayList5 != null) {
            Iterator it5 = arrayList5.iterator();
            while (it5.hasNext()) {
                iobyxmoadg((c1.eablkybsjg) it5.next(), 0, arrayList7, null);
            }
        }
        if (arrayList3 != null) {
            Iterator it6 = arrayList3.iterator();
            while (it6.hasNext()) {
                iobyxmoadg((c1.nufgyqmvbu) it6.next(), 1, arrayList7, null);
            }
        }
        int i17 = 1;
        if (arrayList4 != null) {
            for (c1.btonecajqb btonecajqbVar3 : arrayList4) {
                ojitshcjhn ojitshcjhnVarIobyxmoadg2 = iobyxmoadg(btonecajqbVar3, i17, arrayList7, ojitshcjhnVar4);
                btonecajqbVar3.B(arrayList7, i17, ojitshcjhnVarIobyxmoadg2);
                ojitshcjhnVarIobyxmoadg2.zoijcleaow(arrayList7);
                i17 = 1;
                ojitshcjhnVar4 = null;
            }
        }
        c1.wkgbmnqykc wkgbmnqykcVarVdvldrhtss4 = gxszxtbevoVar.vdvldrhtss(c1.wkgbmnqykc.iobyxmoadg.TOP);
        if (wkgbmnqykcVarVdvldrhtss4.wkgbmnqykc() != null) {
            Iterator it7 = wkgbmnqykcVarVdvldrhtss4.wkgbmnqykc().iterator();
            while (it7.hasNext()) {
                iobyxmoadg(((c1.wkgbmnqykc) it7.next()).f18445wkgbmnqykc, 1, arrayList7, null);
            }
        }
        c1.wkgbmnqykc wkgbmnqykcVarVdvldrhtss5 = gxszxtbevoVar.vdvldrhtss(c1.wkgbmnqykc.iobyxmoadg.BASELINE);
        if (wkgbmnqykcVarVdvldrhtss5.wkgbmnqykc() != null) {
            Iterator it8 = wkgbmnqykcVarVdvldrhtss5.wkgbmnqykc().iterator();
            while (it8.hasNext()) {
                iobyxmoadg(((c1.wkgbmnqykc) it8.next()).f18445wkgbmnqykc, 1, arrayList7, null);
            }
        }
        c1.wkgbmnqykc wkgbmnqykcVarVdvldrhtss6 = gxszxtbevoVar.vdvldrhtss(c1.wkgbmnqykc.iobyxmoadg.BOTTOM);
        if (wkgbmnqykcVarVdvldrhtss6.wkgbmnqykc() != null) {
            Iterator it9 = wkgbmnqykcVarVdvldrhtss6.wkgbmnqykc().iterator();
            while (it9.hasNext()) {
                iobyxmoadg(((c1.wkgbmnqykc) it9.next()).f18445wkgbmnqykc, 1, arrayList7, null);
            }
        }
        c1.wkgbmnqykc wkgbmnqykcVarVdvldrhtss7 = gxszxtbevoVar.vdvldrhtss(c1.wkgbmnqykc.iobyxmoadg.CENTER);
        if (wkgbmnqykcVarVdvldrhtss7.wkgbmnqykc() != null) {
            Iterator it10 = wkgbmnqykcVarVdvldrhtss7.wkgbmnqykc().iterator();
            while (it10.hasNext()) {
                iobyxmoadg(((c1.wkgbmnqykc) it10.next()).f18445wkgbmnqykc, 1, arrayList7, null);
            }
        }
        if (arrayList6 != null) {
            Iterator it11 = arrayList6.iterator();
            while (it11.hasNext()) {
                iobyxmoadg((c1.eablkybsjg) it11.next(), 1, arrayList7, null);
            }
        }
        for (int i18 = 0; i18 < size; i18++) {
            c1.eablkybsjg eablkybsjgVar3 = (c1.eablkybsjg) arrayListB.get(i18);
            if (eablkybsjgVar3.zeieaojujs()) {
                ojitshcjhn ojitshcjhnVarZoijcleaow = zoijcleaow(arrayList7, eablkybsjgVar3.f18323yzdjzghtvl);
                ojitshcjhn ojitshcjhnVarZoijcleaow2 = zoijcleaow(arrayList7, eablkybsjgVar3.f18247eslsurpljm);
                if (ojitshcjhnVarZoijcleaow != null && ojitshcjhnVarZoijcleaow2 != null) {
                    ojitshcjhnVarZoijcleaow.lqeggnwhkg(0, ojitshcjhnVarZoijcleaow2);
                    ojitshcjhnVarZoijcleaow2.dxjokdxxww(2);
                    arrayList7.remove(ojitshcjhnVarZoijcleaow);
                }
            }
        }
        if (arrayList7.size() <= 1) {
            return false;
        }
        if (gxszxtbevoVar.istkbnxepw() == c1.eablkybsjg.zoijcleaow.WRAP_CONTENT) {
            ojitshcjhnVar = null;
            int i19 = 0;
            for (ojitshcjhn ojitshcjhnVar5 : arrayList7) {
                if (ojitshcjhnVar5.wkgbmnqykc() != 1) {
                    ojitshcjhnVar5.nufgyqmvbu(false);
                    int iGxszxtbevo = ojitshcjhnVar5.gxszxtbevo(gxszxtbevoVar.V(), 0);
                    if (iGxszxtbevo > i19) {
                        ojitshcjhnVar = ojitshcjhnVar5;
                        i19 = iGxszxtbevo;
                    }
                }
            }
            if (ojitshcjhnVar != null) {
                gxszxtbevoVar.krqnebusok(c1.eablkybsjg.zoijcleaow.FIXED);
                gxszxtbevoVar.u(i19);
                ojitshcjhnVar.nufgyqmvbu(true);
            } else {
                ojitshcjhnVar = null;
            }
        } else {
            ojitshcjhnVar = null;
        }
        if (gxszxtbevoVar.ulzqkzuiru() == c1.eablkybsjg.zoijcleaow.WRAP_CONTENT) {
            ojitshcjhn ojitshcjhnVar6 = null;
            int i23 = 0;
            for (ojitshcjhn ojitshcjhnVar7 : arrayList7) {
                if (ojitshcjhnVar7.wkgbmnqykc() != 0) {
                    ojitshcjhnVar7.nufgyqmvbu(false);
                    int iGxszxtbevo2 = ojitshcjhnVar7.gxszxtbevo(gxszxtbevoVar.V(), 1);
                    if (iGxszxtbevo2 > i23) {
                        ojitshcjhnVar6 = ojitshcjhnVar7;
                        i23 = iGxszxtbevo2;
                    }
                }
            }
            z13 = false;
            z14 = true;
            if (ojitshcjhnVar6 != null) {
                gxszxtbevoVar.q(c1.eablkybsjg.zoijcleaow.FIXED);
                gxszxtbevoVar.ezmngbhpjk(i23);
                ojitshcjhnVar6.nufgyqmvbu(true);
                ojitshcjhnVar2 = ojitshcjhnVar6;
            }
            return (ojitshcjhnVar == null || ojitshcjhnVar2 != null) ? z14 : z13;
        }
        z13 = false;
        z14 = true;
        ojitshcjhnVar2 = null;
        if (ojitshcjhnVar == null) {
        }
    }

    public static boolean wkgbmnqykc(c1.eablkybsjg.zoijcleaow zoijcleaowVar, c1.eablkybsjg.zoijcleaow zoijcleaowVar2, c1.eablkybsjg.zoijcleaow zoijcleaowVar3, c1.eablkybsjg.zoijcleaow zoijcleaowVar4) {
        c1.eablkybsjg.zoijcleaow zoijcleaowVar5;
        c1.eablkybsjg.zoijcleaow zoijcleaowVar6;
        c1.eablkybsjg.zoijcleaow zoijcleaowVar7 = c1.eablkybsjg.zoijcleaow.FIXED;
        return (zoijcleaowVar3 == zoijcleaowVar7 || zoijcleaowVar3 == (zoijcleaowVar6 = c1.eablkybsjg.zoijcleaow.WRAP_CONTENT) || (zoijcleaowVar3 == c1.eablkybsjg.zoijcleaow.MATCH_PARENT && zoijcleaowVar != zoijcleaowVar6)) || (zoijcleaowVar4 == zoijcleaowVar7 || zoijcleaowVar4 == (zoijcleaowVar5 = c1.eablkybsjg.zoijcleaow.WRAP_CONTENT) || (zoijcleaowVar4 == c1.eablkybsjg.zoijcleaow.MATCH_PARENT && zoijcleaowVar2 != zoijcleaowVar5));
    }

    private static ojitshcjhn zoijcleaow(ArrayList arrayList, int i13) {
        int size = arrayList.size();
        for (int i14 = 0; i14 < size; i14++) {
            ojitshcjhn ojitshcjhnVar = (ojitshcjhn) arrayList.get(i14);
            if (i13 == ojitshcjhnVar.ppxfxbqfkf()) {
                return ojitshcjhnVar;
            }
        }
        return null;
    }
}
