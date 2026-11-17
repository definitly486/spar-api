package sflfametgt;

import androidx.compose.foundation.lazy.layout.skhdrjzrfn;
import androidx.compose.runtime.iwxlajgraz;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public abstract class hkdspvbjdz {
    /* JADX INFO: Access modifiers changed from: private */
    public static final wflxmlrfwp agtfadlqog(androidx.compose.foundation.lazy.layout.jpowsppfya jpowsppfyaVar, long j13, lmojexxdyd lmojexxdydVar, long j14, jztzpxfvev.jlmebxxoox jlmebxxooxVar, a.eablkybsjg.zoijcleaow zoijcleaowVar, a.eablkybsjg.ppxfxbqfkf ppxfxbqfkfVar, boolean z13, int i13, androidx.collection.iozdgvuglv iozdgvuglvVar, int i14) {
        return gtknphoqwx(jpowsppfyaVar, i14, j13, lmojexxdydVar, j14, jlmebxxooxVar, zoijcleaowVar, ppxfxbqfkfVar, jpowsppfyaVar.getLayoutDirection(), z13, i13, iozdgvuglvVar);
    }

    private static final List btonecajqb(int i13, int i14, List list, tg.draadjrbmk draadjrbmkVar) {
        int iMax = Math.max(0, i13 - i14);
        int i15 = i13 - 1;
        ArrayList arrayList = null;
        if (iMax <= i15) {
            while (true) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(draadjrbmkVar.invoke(Integer.valueOf(i15)));
                if (i15 == iMax) {
                    break;
                }
                i15--;
            }
        }
        int size = list.size();
        for (int i16 = 0; i16 < size; i16++) {
            int iIntValue = ((Number) list.get(i16)).intValue();
            if (iIntValue < iMax) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(draadjrbmkVar.invoke(Integer.valueOf(iIntValue)));
            }
        }
        return arrayList == null ? hg.jyumaefscl.wflxmlrfwp() : arrayList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final wypolnanlu draadjrbmk(final androidx.compose.foundation.lazy.layout.jpowsppfya jpowsppfyaVar, int i13, final lmojexxdyd lmojexxdydVar, int i14, int i15, int i16, int i17, int i18, int i19, long j13, final jztzpxfvev.jlmebxxoox jlmebxxooxVar, final a.eablkybsjg.ppxfxbqfkf ppxfxbqfkfVar, final a.eablkybsjg.zoijcleaow zoijcleaowVar, final boolean z13, final long j14, final int i23, int i24, List list, xrmfcynszj.ojitshcjhn ojitshcjhnVar, final iwxlajgraz iwxlajgrazVar, pj.cllcsxoeiz cllcsxoeizVar, tg.vdvldrhtss vdvldrhtssVar, final androidx.collection.iozdgvuglv iozdgvuglvVar) {
        int i25;
        int i26;
        int i27;
        int i28;
        wflxmlrfwp wflxmlrfwpVar;
        int i29;
        List list2;
        List arrayList;
        List arrayList2;
        int i33 = 0;
        if (!(i15 >= 0)) {
            rlfsiqarku.eablkybsjg.iobyxmoadg("negative beforeContentPadding");
        }
        if (!(i16 >= 0)) {
            rlfsiqarku.eablkybsjg.iobyxmoadg("negative afterContentPadding");
        }
        int iGxszxtbevo = zg.gtknphoqwx.gxszxtbevo(i23 + i17, 0);
        int iBtonecajqb = zg.gtknphoqwx.btonecajqb(i24, i13);
        if (i13 <= 0) {
            return new wypolnanlu(hg.jyumaefscl.wflxmlrfwp(), i23, i17, i16, jlmebxxooxVar, -i15, i14 + i16, false, iBtonecajqb, null, null, 0.0f, 0, false, ojitshcjhnVar, (x.istkbnxepw) vdvldrhtssVar.invoke(Integer.valueOf(w0.zoijcleaow.agtfadlqog(j13)), Integer.valueOf(w0.zoijcleaow.wflxmlrfwp(j13)), new tg.draadjrbmk() { // from class: sflfametgt.wwaezpbzkn
                @Override // tg.draadjrbmk
                public final Object invoke(Object obj) {
                    return hkdspvbjdz.vdvldrhtss((androidx.compose.ui.layout.kcexrzcfyt.iobyxmoadg) obj);
                }
            }), false, null, null, cllcsxoeizVar, 393216, null);
        }
        int i34 = iBtonecajqb;
        jztzpxfvev.jlmebxxoox jlmebxxooxVar2 = jztzpxfvev.jlmebxxoox.Vertical;
        final long jZoijcleaow = w0.ppxfxbqfkf.zoijcleaow(0, jlmebxxooxVar == jlmebxxooxVar2 ? w0.zoijcleaow.draadjrbmk(j13) : i23, 0, jlmebxxooxVar != jlmebxxooxVar2 ? w0.zoijcleaow.gtknphoqwx(j13) : i23, 5, null);
        int i35 = i18;
        int i36 = i19;
        while (i35 > 0 && i36 > 0) {
            i35--;
            i36 -= iGxszxtbevo;
        }
        int i37 = i36 * (-1);
        if (i35 >= i13) {
            i35 = i13 - 1;
            i37 = 0;
        }
        hg.wflxmlrfwp wflxmlrfwpVar2 = new hg.wflxmlrfwp();
        int i38 = -i15;
        int i39 = (i17 < 0 ? i17 : 0) + i38;
        int i43 = i37 + i39;
        int iMax = 0;
        while (i43 < 0 && i35 > 0) {
            int i44 = i35 - 1;
            hg.wflxmlrfwp wflxmlrfwpVar3 = wflxmlrfwpVar2;
            int i45 = iGxszxtbevo;
            int i46 = i33;
            wflxmlrfwp wflxmlrfwpVarGtknphoqwx = gtknphoqwx(jpowsppfyaVar, i44, jZoijcleaow, lmojexxdydVar, j14, jlmebxxooxVar, zoijcleaowVar, ppxfxbqfkfVar, jpowsppfyaVar.getLayoutDirection(), z13, i23, iozdgvuglvVar);
            wflxmlrfwpVar3.add(i46, wflxmlrfwpVarGtknphoqwx);
            iMax = Math.max(iMax, wflxmlrfwpVarGtknphoqwx.ppxfxbqfkf());
            i43 += i45;
            i39 = i39;
            iGxszxtbevo = i45;
            wflxmlrfwpVar2 = wflxmlrfwpVar3;
            i33 = i46;
            i35 = i44;
            i38 = i38;
            i34 = i34;
        }
        int i47 = i43;
        int i48 = i38;
        int i49 = i39;
        hg.wflxmlrfwp wflxmlrfwpVar4 = wflxmlrfwpVar2;
        int i53 = iGxszxtbevo;
        int i54 = i34;
        int i55 = i33;
        int i56 = (i47 < i49 ? i49 : i47) - i49;
        int i57 = i14 + i16;
        int iGxszxtbevo2 = zg.gtknphoqwx.gxszxtbevo(i57, i55);
        int i58 = -i56;
        int i59 = i55;
        int i63 = i59;
        int i64 = i35;
        while (i59 < wflxmlrfwpVar4.size()) {
            if (i58 >= iGxszxtbevo2) {
                wflxmlrfwpVar4.remove(i59);
                gg.wwaezpbzkn wwaezpbzknVar = gg.wwaezpbzkn.f37140iobyxmoadg;
                i63 = 1;
            } else {
                i64++;
                i58 += i53;
                i59++;
            }
        }
        int i65 = i35;
        int i66 = i56;
        int i67 = i63;
        int i68 = i64;
        int i69 = i58;
        while (i68 < i13 && (i69 < iGxszxtbevo2 || i69 <= 0 || wflxmlrfwpVar4.isEmpty())) {
            int i73 = i57;
            int i74 = i69;
            int i75 = i68;
            int i76 = iGxszxtbevo2;
            wflxmlrfwp wflxmlrfwpVarGtknphoqwx2 = gtknphoqwx(jpowsppfyaVar, i68, jZoijcleaow, lmojexxdydVar, j14, jlmebxxooxVar, zoijcleaowVar, ppxfxbqfkfVar, jpowsppfyaVar.getLayoutDirection(), z13, i23, iozdgvuglvVar);
            int i77 = i13 - 1;
            i69 = (i75 == i77 ? i23 : i53) + i74;
            if (i69 > i49 || i75 == i77) {
                iMax = Math.max(iMax, wflxmlrfwpVarGtknphoqwx2.ppxfxbqfkf());
                wflxmlrfwpVar4.add(wflxmlrfwpVarGtknphoqwx2);
            } else {
                i66 -= i53;
                gg.wwaezpbzkn wwaezpbzknVar2 = gg.wwaezpbzkn.f37140iobyxmoadg;
                i65 = i75 + 1;
                i67 = 1;
            }
            i68 = i75 + 1;
            i57 = i73;
            iGxszxtbevo2 = i76;
        }
        int i78 = i57;
        int i79 = i69;
        int i83 = i68;
        if (i79 < i14) {
            int i84 = i14 - i79;
            int i85 = i66 - i84;
            int i86 = i84 + i79;
            int i87 = i85;
            int i88 = 0;
            while (i87 < i15 && i65 > 0) {
                i65--;
                int i89 = i83;
                int i93 = i88;
                wflxmlrfwp wflxmlrfwpVarGtknphoqwx3 = gtknphoqwx(jpowsppfyaVar, i65, jZoijcleaow, lmojexxdydVar, j14, jlmebxxooxVar, zoijcleaowVar, ppxfxbqfkfVar, jpowsppfyaVar.getLayoutDirection(), z13, i23, iozdgvuglvVar);
                wflxmlrfwpVar4.add(i93, wflxmlrfwpVarGtknphoqwx3);
                iMax = Math.max(iMax, wflxmlrfwpVarGtknphoqwx3.ppxfxbqfkf());
                i87 += i53;
                i88 = i93;
                i83 = i89;
            }
            i25 = i83;
            i26 = i88;
            if (i87 < 0) {
                i28 = i26;
                i79 = i86 + i87;
            } else {
                i28 = i87;
                i79 = i86;
            }
            i27 = i65;
        } else {
            i25 = i83;
            i26 = 0;
            i27 = i65;
            i28 = i66;
        }
        if ((i28 >= 0 ? 1 : i26) == 0) {
            rlfsiqarku.eablkybsjg.iobyxmoadg("invalid currentFirstPageScrollOffset");
        }
        int i94 = -i28;
        wflxmlrfwp wflxmlrfwpVar5 = (wflxmlrfwp) wflxmlrfwpVar4.first();
        if (i15 > 0 || i17 < 0) {
            int size = wflxmlrfwpVar4.size();
            int i95 = i28;
            int i96 = i26;
            while (i96 < size && i95 != 0 && i53 <= i95 && i96 != hg.jyumaefscl.ojitshcjhn(wflxmlrfwpVar4)) {
                i95 -= i53;
                i96++;
                wflxmlrfwpVar5 = (wflxmlrfwp) wflxmlrfwpVar4.get(i96);
            }
            wflxmlrfwpVar = wflxmlrfwpVar5;
            i29 = i95;
        } else {
            i29 = i28;
            wflxmlrfwpVar = wflxmlrfwpVar5;
        }
        int i97 = iMax;
        wflxmlrfwp wflxmlrfwpVar6 = wflxmlrfwpVar;
        List listBtonecajqb = btonecajqb(i27, i54, list, new tg.draadjrbmk() { // from class: sflfametgt.ylkuphrtab
            @Override // tg.draadjrbmk
            public final Object invoke(Object obj) {
                return hkdspvbjdz.wflxmlrfwp(jpowsppfyaVar, jZoijcleaow, lmojexxdydVar, j14, jlmebxxooxVar, zoijcleaowVar, ppxfxbqfkfVar, z13, i23, iozdgvuglvVar, ((Integer) obj).intValue());
            }
        });
        int size2 = listBtonecajqb.size();
        int iMax2 = i97;
        for (int i98 = 0; i98 < size2; i98++) {
            iMax2 = Math.max(iMax2, ((wflxmlrfwp) listBtonecajqb.get(i98)).ppxfxbqfkf());
        }
        int i99 = i79;
        List listDxjokdxxww = dxjokdxxww(((wflxmlrfwp) wflxmlrfwpVar4.last()).getIndex(), i13, i54, list, new tg.draadjrbmk() { // from class: sflfametgt.pkzmftpjix
            @Override // tg.draadjrbmk
            public final Object invoke(Object obj) {
                return hkdspvbjdz.agtfadlqog(jpowsppfyaVar, jZoijcleaow, lmojexxdydVar, j14, jlmebxxooxVar, zoijcleaowVar, ppxfxbqfkfVar, z13, i23, iozdgvuglvVar, ((Integer) obj).intValue());
            }
        });
        int size3 = listDxjokdxxww.size();
        int iMax3 = iMax2;
        for (int i100 = 0; i100 < size3; i100++) {
            iMax3 = Math.max(iMax3, ((wflxmlrfwp) listDxjokdxxww.get(i100)).ppxfxbqfkf());
        }
        boolean z14 = kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(wflxmlrfwpVar6, wflxmlrfwpVar4.first()) && listBtonecajqb.isEmpty() && listDxjokdxxww.isEmpty();
        jztzpxfvev.jlmebxxoox jlmebxxooxVar3 = jztzpxfvev.jlmebxxoox.Vertical;
        int iLqeggnwhkg = w0.ppxfxbqfkf.lqeggnwhkg(j13, jlmebxxooxVar == jlmebxxooxVar3 ? iMax3 : i99);
        if (jlmebxxooxVar == jlmebxxooxVar3) {
            iMax3 = i99;
        }
        int iGxszxtbevo3 = w0.ppxfxbqfkf.gxszxtbevo(j13, iMax3);
        final List listLqeggnwhkg = lqeggnwhkg(jpowsppfyaVar, wflxmlrfwpVar4, listBtonecajqb, listDxjokdxxww, iLqeggnwhkg, iGxszxtbevo3, i99, i14, i94, jlmebxxooxVar, z13, jpowsppfyaVar, i17, i23);
        if (z14) {
            list2 = listLqeggnwhkg;
        } else {
            ArrayList arrayList3 = new ArrayList(listLqeggnwhkg.size());
            int size4 = listLqeggnwhkg.size();
            for (int i101 = 0; i101 < size4; i101++) {
                Object obj = listLqeggnwhkg.get(i101);
                wflxmlrfwp wflxmlrfwpVar7 = (wflxmlrfwp) obj;
                if (wflxmlrfwpVar7.getIndex() >= ((wflxmlrfwp) wflxmlrfwpVar4.first()).getIndex() && wflxmlrfwpVar7.getIndex() <= ((wflxmlrfwp) wflxmlrfwpVar4.last()).getIndex()) {
                    arrayList3.add(obj);
                }
            }
            list2 = arrayList3;
        }
        if (listBtonecajqb.isEmpty()) {
            arrayList = hg.jyumaefscl.wflxmlrfwp();
        } else {
            arrayList = new ArrayList(listLqeggnwhkg.size());
            int size5 = listLqeggnwhkg.size();
            for (int i102 = 0; i102 < size5; i102++) {
                Object obj2 = listLqeggnwhkg.get(i102);
                if (((wflxmlrfwp) obj2).getIndex() < ((wflxmlrfwp) wflxmlrfwpVar4.first()).getIndex()) {
                    arrayList.add(obj2);
                }
            }
        }
        List list3 = arrayList;
        if (listDxjokdxxww.isEmpty()) {
            arrayList2 = hg.jyumaefscl.wflxmlrfwp();
        } else {
            arrayList2 = new ArrayList(listLqeggnwhkg.size());
            int size6 = listLqeggnwhkg.size();
            for (int i103 = 0; i103 < size6; i103++) {
                Object obj3 = listLqeggnwhkg.get(i103);
                if (((wflxmlrfwp) obj3).getIndex() > ((wflxmlrfwp) wflxmlrfwpVar4.last()).getIndex()) {
                    arrayList2.add(obj3);
                }
            }
        }
        List list4 = arrayList2;
        int i104 = i14 + i15 + i16;
        int i105 = i25;
        wflxmlrfwp wflxmlrfwpVarGxszxtbevo = gxszxtbevo(i104, list2, i15, i16, i23, ojitshcjhnVar, i13);
        return new wypolnanlu(list2, i23, i17, i16, jlmebxxooxVar, i48, i78, z13, i54, wflxmlrfwpVar6, wflxmlrfwpVarGxszxtbevo, r32 == 0 ? 0.0f : zg.gtknphoqwx.wflxmlrfwp((ojitshcjhnVar.iobyxmoadg(i104, i23, i15, i16, wflxmlrfwpVarGxszxtbevo != null ? wflxmlrfwpVarGxszxtbevo.getIndex() : 0, i13) - (wflxmlrfwpVarGxszxtbevo != null ? wflxmlrfwpVarGxszxtbevo.iobyxmoadg() : 0)) / i53, -0.5f, 0.5f), i29, i105 < i13 || i99 > i14, ojitshcjhnVar, (x.istkbnxepw) vdvldrhtssVar.invoke(Integer.valueOf(iLqeggnwhkg), Integer.valueOf(iGxszxtbevo3), new tg.draadjrbmk() { // from class: sflfametgt.hcddaimhww
            @Override // tg.draadjrbmk
            public final Object invoke(Object obj4) {
                return hkdspvbjdz.ojitshcjhn(iwxlajgrazVar, listLqeggnwhkg, (androidx.compose.ui.layout.kcexrzcfyt.iobyxmoadg) obj4);
            }
        }), i67, list3, list4, cllcsxoeizVar);
    }

    private static final List dxjokdxxww(int i13, int i14, int i15, List list, tg.draadjrbmk draadjrbmkVar) {
        int iMin = Math.min(i15, (i14 - i13) - 1) + i13;
        int i16 = i13 + 1;
        ArrayList arrayList = null;
        if (i16 <= iMin) {
            while (true) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(draadjrbmkVar.invoke(Integer.valueOf(i16)));
                if (i16 == iMin) {
                    break;
                }
                i16++;
            }
        }
        int size = list.size();
        for (int i17 = 0; i17 < size; i17++) {
            int iIntValue = ((Number) list.get(i17)).intValue();
            if (iMin + 1 <= iIntValue && iIntValue < i14) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(draadjrbmkVar.invoke(Integer.valueOf(iIntValue)));
            }
        }
        return arrayList == null ? hg.jyumaefscl.wflxmlrfwp() : arrayList;
    }

    private static final wflxmlrfwp gtknphoqwx(androidx.compose.foundation.lazy.layout.jpowsppfya jpowsppfyaVar, int i13, long j13, lmojexxdyd lmojexxdydVar, long j14, jztzpxfvev.jlmebxxoox jlmebxxooxVar, a.eablkybsjg.zoijcleaow zoijcleaowVar, a.eablkybsjg.ppxfxbqfkf ppxfxbqfkfVar, w0.zdlpuopuiu zdlpuopuiuVar, boolean z13, int i14, androidx.collection.iozdgvuglv iozdgvuglvVar) {
        List list;
        Object objWkgbmnqykc = lmojexxdydVar.wkgbmnqykc(i13);
        List list2 = (List) iozdgvuglvVar.zoijcleaow(i13);
        if (list2 != null) {
            list = list2;
        } else {
            List listN = jpowsppfyaVar.N(i13);
            int size = listN.size();
            ArrayList arrayList = new ArrayList(size);
            for (int i15 = 0; i15 < size; i15++) {
                arrayList.add(((x.pmvmpeiblj) listN.get(i15)).sflfametgt(j13));
            }
            iozdgvuglvVar.oxmwwwfdhm(i13, arrayList);
            list = arrayList;
        }
        return new wflxmlrfwp(i13, i14, list, j14, objWkgbmnqykc, jlmebxxooxVar, zoijcleaowVar, ppxfxbqfkfVar, zdlpuopuiuVar, z13, null);
    }

    private static final wflxmlrfwp gxszxtbevo(int i13, List list, int i14, int i15, int i16, xrmfcynszj.ojitshcjhn ojitshcjhnVar, int i17) {
        Object obj;
        if (list.isEmpty()) {
            obj = null;
        } else {
            Object obj2 = list.get(0);
            wflxmlrfwp wflxmlrfwpVar = (wflxmlrfwp) obj2;
            float f13 = -Math.abs(xrmfcynszj.rgvfuqvkyq.iobyxmoadg(i13, i14, i15, i16, wflxmlrfwpVar.iobyxmoadg(), wflxmlrfwpVar.getIndex(), ojitshcjhnVar, i17));
            int iOjitshcjhn = hg.jyumaefscl.ojitshcjhn(list);
            int i18 = 1;
            if (1 <= iOjitshcjhn) {
                while (true) {
                    Object obj3 = list.get(i18);
                    wflxmlrfwp wflxmlrfwpVar2 = (wflxmlrfwp) obj3;
                    float f14 = -Math.abs(xrmfcynszj.rgvfuqvkyq.iobyxmoadg(i13, i14, i15, i16, wflxmlrfwpVar2.iobyxmoadg(), wflxmlrfwpVar2.getIndex(), ojitshcjhnVar, i17));
                    if (Float.compare(f13, f14) < 0) {
                        obj2 = obj3;
                        f13 = f14;
                    }
                    if (i18 == iOjitshcjhn) {
                        break;
                    }
                    i18++;
                }
            }
            obj = obj2;
        }
        return (wflxmlrfwp) obj;
    }

    private static final List lqeggnwhkg(androidx.compose.foundation.lazy.layout.jpowsppfya jpowsppfyaVar, List list, List list2, List list3, int i13, int i14, int i15, int i16, int i17, jztzpxfvev.jlmebxxoox jlmebxxooxVar, boolean z13, w0.wkgbmnqykc wkgbmnqykcVar, int i18, int i19) {
        int i23 = i17;
        int i24 = i19 + i18;
        int i25 = jlmebxxooxVar == jztzpxfvev.jlmebxxoox.Vertical ? i14 : i13;
        int i26 = 0;
        boolean z14 = i15 < Math.min(i25, i16);
        if (z14) {
            if (!(i23 == 0)) {
                rlfsiqarku.eablkybsjg.ppxfxbqfkf("non-zero pagesScrollOffset=" + i23);
            }
        }
        ArrayList arrayList = new ArrayList(list.size() + list2.size() + list3.size());
        if (z14) {
            if (!(list2.isEmpty() && list3.isEmpty())) {
                rlfsiqarku.eablkybsjg.iobyxmoadg("No extra pages");
            }
            int size = list.size();
            int[] iArr = new int[size];
            while (i26 < size) {
                iArr[i26] = i19;
                i26++;
            }
            int[] iArr2 = new int[size];
            czzsidtyhn.eablkybsjg.gxszxtbevo gxszxtbevoVarWkgbmnqykc = czzsidtyhn.eablkybsjg.iobyxmoadg.f26305iobyxmoadg.wkgbmnqykc(jpowsppfyaVar.x(i18));
            if (jlmebxxooxVar == jztzpxfvev.jlmebxxoox.Vertical) {
                gxszxtbevoVarWkgbmnqykc.zoijcleaow(wkgbmnqykcVar, i25, iArr, iArr2);
            } else {
                gxszxtbevoVarWkgbmnqykc.ppxfxbqfkf(wkgbmnqykcVar, i25, iArr, w0.zdlpuopuiu.Ltr, iArr2);
            }
            zg.nufgyqmvbu nufgyqmvbuVarSflfametgt = hg.agtfadlqog.sflfametgt(iArr2);
            if (z13) {
                nufgyqmvbuVarSflfametgt = zg.gtknphoqwx.kcexrzcfyt(nufgyqmvbuVarSflfametgt);
            }
            int iWkgbmnqykc = nufgyqmvbuVarSflfametgt.wkgbmnqykc();
            int iEablkybsjg = nufgyqmvbuVarSflfametgt.eablkybsjg();
            int iGxszxtbevo = nufgyqmvbuVarSflfametgt.gxszxtbevo();
            if ((iGxszxtbevo > 0 && iWkgbmnqykc <= iEablkybsjg) || (iGxszxtbevo < 0 && iEablkybsjg <= iWkgbmnqykc)) {
                while (true) {
                    int iLqeggnwhkg = iArr2[iWkgbmnqykc];
                    wflxmlrfwp wflxmlrfwpVar = (wflxmlrfwp) list.get(nufgyqmvbu(iWkgbmnqykc, z13, size));
                    if (z13) {
                        iLqeggnwhkg = (i25 - iLqeggnwhkg) - wflxmlrfwpVar.lqeggnwhkg();
                    }
                    wflxmlrfwpVar.dxjokdxxww(iLqeggnwhkg, i13, i14);
                    arrayList.add(wflxmlrfwpVar);
                    if (iWkgbmnqykc == iEablkybsjg) {
                        break;
                    }
                    iWkgbmnqykc += iGxszxtbevo;
                }
            }
        } else {
            int size2 = list2.size();
            int i27 = i23;
            for (int i28 = 0; i28 < size2; i28++) {
                wflxmlrfwp wflxmlrfwpVar2 = (wflxmlrfwp) list2.get(i28);
                i27 -= i24;
                wflxmlrfwpVar2.dxjokdxxww(i27, i13, i14);
                arrayList.add(wflxmlrfwpVar2);
            }
            int size3 = list.size();
            for (int i29 = 0; i29 < size3; i29++) {
                wflxmlrfwp wflxmlrfwpVar3 = (wflxmlrfwp) list.get(i29);
                wflxmlrfwpVar3.dxjokdxxww(i23, i13, i14);
                arrayList.add(wflxmlrfwpVar3);
                i23 += i24;
            }
            int size4 = list3.size();
            while (i26 < size4) {
                wflxmlrfwp wflxmlrfwpVar4 = (wflxmlrfwp) list3.get(i26);
                wflxmlrfwpVar4.dxjokdxxww(i23, i13, i14);
                arrayList.add(wflxmlrfwpVar4);
                i23 += i24;
                i26++;
            }
        }
        return arrayList;
    }

    private static final int nufgyqmvbu(int i13, boolean z13, int i14) {
        return !z13 ? i13 : (i14 - i13) - 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final gg.wwaezpbzkn ojitshcjhn(iwxlajgraz iwxlajgrazVar, final List list, androidx.compose.ui.layout.kcexrzcfyt.iobyxmoadg iobyxmoadgVar) {
        iobyxmoadgVar.iyctptxqzt(new tg.draadjrbmk() { // from class: sflfametgt.jpowsppfya
            @Override // tg.draadjrbmk
            public final Object invoke(Object obj) {
                return hkdspvbjdz.rgvfuqvkyq(list, (androidx.compose.ui.layout.kcexrzcfyt.iobyxmoadg) obj);
            }
        });
        skhdrjzrfn.iobyxmoadg(iwxlajgrazVar);
        return gg.wwaezpbzkn.f37140iobyxmoadg;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final gg.wwaezpbzkn rgvfuqvkyq(List list, androidx.compose.ui.layout.kcexrzcfyt.iobyxmoadg iobyxmoadgVar) {
        int size = list.size();
        for (int i13 = 0; i13 < size; i13++) {
            ((wflxmlrfwp) list.get(i13)).nufgyqmvbu(iobyxmoadgVar);
        }
        return gg.wwaezpbzkn.f37140iobyxmoadg;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final gg.wwaezpbzkn vdvldrhtss(androidx.compose.ui.layout.kcexrzcfyt.iobyxmoadg iobyxmoadgVar) {
        return gg.wwaezpbzkn.f37140iobyxmoadg;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wflxmlrfwp wflxmlrfwp(androidx.compose.foundation.lazy.layout.jpowsppfya jpowsppfyaVar, long j13, lmojexxdyd lmojexxdydVar, long j14, jztzpxfvev.jlmebxxoox jlmebxxooxVar, a.eablkybsjg.zoijcleaow zoijcleaowVar, a.eablkybsjg.ppxfxbqfkf ppxfxbqfkfVar, boolean z13, int i13, androidx.collection.iozdgvuglv iozdgvuglvVar, int i14) {
        return gtknphoqwx(jpowsppfyaVar, i14, j13, lmojexxdydVar, j14, jlmebxxooxVar, zoijcleaowVar, ppxfxbqfkfVar, jpowsppfyaVar.getLayoutDirection(), z13, i13, iozdgvuglvVar);
    }
}
