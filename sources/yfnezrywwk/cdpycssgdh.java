package yfnezrywwk;

import androidx.compose.foundation.lazy.layout.skhdrjzrfn;
import androidx.compose.runtime.iwxlajgraz;
import java.util.ArrayList;
import java.util.List;
import kotlin.KotlinNothingValueException;

/* JADX INFO: loaded from: classes.dex */
public abstract class cdpycssgdh {
    /* JADX INFO: Access modifiers changed from: private */
    public static final gg.wwaezpbzkn btonecajqb(iwxlajgraz iwxlajgrazVar, final List list, final List list2, final boolean z13, androidx.compose.ui.layout.kcexrzcfyt.iobyxmoadg iobyxmoadgVar) {
        iobyxmoadgVar.iyctptxqzt(new tg.draadjrbmk() { // from class: yfnezrywwk.istkbnxepw
            @Override // tg.draadjrbmk
            public final Object invoke(Object obj) {
                return cdpycssgdh.gtknphoqwx(list, list2, z13, (androidx.compose.ui.layout.kcexrzcfyt.iobyxmoadg) obj);
            }
        });
        skhdrjzrfn.iobyxmoadg(iwxlajgrazVar);
        return gg.wwaezpbzkn.f37140iobyxmoadg;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final gg.wwaezpbzkn draadjrbmk(androidx.compose.ui.layout.kcexrzcfyt.iobyxmoadg iobyxmoadgVar) {
        return gg.wwaezpbzkn.f37140iobyxmoadg;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r40v6 ??
        	at jadx.core.dex.instructions.args.SSAVar.getCodeVar(SSAVar.java:236)
        	at jadx.core.dex.visitors.ModVisitor.anonymousCallArgMod(ModVisitor.java:535)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
        	at jadx.core.dex.visitors.ModVisitor.processAnonymousConstructor(ModVisitor.java:528)
        	at jadx.core.dex.visitors.ModVisitor.replaceStep(ModVisitor.java:111)
        	at jadx.core.dex.visitors.ModVisitor.visit(ModVisitor.java:96)
        */
    public static final yfnezrywwk.yadqdtsiqt dxjokdxxww(int r34, final yfnezrywwk.lmojexxdyd r35, int r36, int r37, int r38, int r39, int r40, int r41, float r42, long r43, boolean r45, czzsidtyhn.eablkybsjg.wflxmlrfwp r46, czzsidtyhn.eablkybsjg.InterfaceC0470eablkybsjg r47, boolean r48, w0.wkgbmnqykc r49, androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimator r50, int r51, java.util.List r52, boolean r53, boolean r54, yfnezrywwk.cqumvgiudr r55, pj.cllcsxoeiz r56, final androidx.compose.runtime.iwxlajgraz r57, h.auzgnhcxok r58, androidx.compose.foundation.lazy.layout.jrbgnlbqoe r59, tg.vdvldrhtss r60) {
        /*
            Method dump skipped, instruction units count: 1254
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: yfnezrywwk.cdpycssgdh.dxjokdxxww(int, yfnezrywwk.lmojexxdyd, int, int, int, int, int, int, float, long, boolean, czzsidtyhn.eablkybsjg$wflxmlrfwp, czzsidtyhn.eablkybsjg$eablkybsjg, boolean, w0.wkgbmnqykc, androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimator, int, java.util.List, boolean, boolean, yfnezrywwk.cqumvgiudr, pj.cllcsxoeiz, androidx.compose.runtime.iwxlajgraz, h.auzgnhcxok, androidx.compose.foundation.lazy.layout.jrbgnlbqoe, tg.vdvldrhtss):yfnezrywwk.yadqdtsiqt");
    }

    private static final List eablkybsjg(List list, List list2, List list3, int i13, int i14, int i15, int i16, int i17, boolean z13, czzsidtyhn.eablkybsjg.wflxmlrfwp wflxmlrfwpVar, czzsidtyhn.eablkybsjg.InterfaceC0470eablkybsjg interfaceC0470eablkybsjg, boolean z14, w0.wkgbmnqykc wkgbmnqykcVar) {
        int i18 = z13 ? i14 : i13;
        int i19 = 0;
        boolean z15 = i15 < Math.min(i18, i16);
        if (z15) {
            if (!(i17 == 0)) {
                rlfsiqarku.eablkybsjg.ppxfxbqfkf("non-zero itemsScrollOffset");
            }
        }
        ArrayList arrayList = new ArrayList(list.size() + list2.size() + list3.size());
        if (z15) {
            if (!(list2.isEmpty() && list3.isEmpty())) {
                rlfsiqarku.eablkybsjg.iobyxmoadg("no extra items");
            }
            int size = list.size();
            int[] iArr = new int[size];
            while (i19 < size) {
                iArr[i19] = ((iozdgvuglv) list.get(gxszxtbevo(i19, z14, size))).getSize();
                i19++;
            }
            int[] iArr2 = new int[size];
            if (z13) {
                if (wflxmlrfwpVar == null) {
                    rlfsiqarku.eablkybsjg.zoijcleaow("null verticalArrangement when isVertical == true");
                    throw new KotlinNothingValueException();
                }
                wflxmlrfwpVar.zoijcleaow(wkgbmnqykcVar, i18, iArr, iArr2);
            } else {
                if (interfaceC0470eablkybsjg == null) {
                    rlfsiqarku.eablkybsjg.zoijcleaow("null horizontalArrangement when isVertical == false");
                    throw new KotlinNothingValueException();
                }
                interfaceC0470eablkybsjg.ppxfxbqfkf(wkgbmnqykcVar, i18, iArr, w0.zdlpuopuiu.Ltr, iArr2);
            }
            zg.nufgyqmvbu nufgyqmvbuVarSflfametgt = hg.agtfadlqog.sflfametgt(iArr2);
            if (z14) {
                nufgyqmvbuVarSflfametgt = zg.gtknphoqwx.kcexrzcfyt(nufgyqmvbuVarSflfametgt);
            }
            int iWkgbmnqykc = nufgyqmvbuVarSflfametgt.wkgbmnqykc();
            int iEablkybsjg = nufgyqmvbuVarSflfametgt.eablkybsjg();
            int iGxszxtbevo = nufgyqmvbuVarSflfametgt.gxszxtbevo();
            if ((iGxszxtbevo > 0 && iWkgbmnqykc <= iEablkybsjg) || (iGxszxtbevo < 0 && iEablkybsjg <= iWkgbmnqykc)) {
                while (true) {
                    int size2 = iArr2[iWkgbmnqykc];
                    iozdgvuglv iozdgvuglvVar = (iozdgvuglv) list.get(gxszxtbevo(iWkgbmnqykc, z14, size));
                    if (z14) {
                        size2 = (i18 - size2) - iozdgvuglvVar.getSize();
                    }
                    iozdgvuglvVar.oxmwwwfdhm(size2, i13, i14);
                    arrayList.add(iozdgvuglvVar);
                    if (iWkgbmnqykc == iEablkybsjg) {
                        break;
                    }
                    iWkgbmnqykc += iGxszxtbevo;
                }
            }
        } else {
            int size3 = list2.size();
            int iGtknphoqwx = i17;
            for (int i23 = 0; i23 < size3; i23++) {
                iozdgvuglv iozdgvuglvVar2 = (iozdgvuglv) list2.get(i23);
                iGtknphoqwx -= iozdgvuglvVar2.gtknphoqwx();
                iozdgvuglvVar2.oxmwwwfdhm(iGtknphoqwx, i13, i14);
                arrayList.add(iozdgvuglvVar2);
            }
            int size4 = list.size();
            int iGtknphoqwx2 = i17;
            for (int i24 = 0; i24 < size4; i24++) {
                iozdgvuglv iozdgvuglvVar3 = (iozdgvuglv) list.get(i24);
                iozdgvuglvVar3.oxmwwwfdhm(iGtknphoqwx2, i13, i14);
                arrayList.add(iozdgvuglvVar3);
                iGtknphoqwx2 += iozdgvuglvVar3.gtknphoqwx();
            }
            int size5 = list3.size();
            while (i19 < size5) {
                iozdgvuglv iozdgvuglvVar4 = (iozdgvuglv) list3.get(i19);
                iozdgvuglvVar4.oxmwwwfdhm(iGtknphoqwx2, i13, i14);
                arrayList.add(iozdgvuglvVar4);
                iGtknphoqwx2 += iozdgvuglvVar4.gtknphoqwx();
                i19++;
            }
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final gg.wwaezpbzkn gtknphoqwx(List list, List list2, boolean z13, androidx.compose.ui.layout.kcexrzcfyt.iobyxmoadg iobyxmoadgVar) {
        int size = list.size();
        for (int i13 = 0; i13 < size; i13++) {
            ((iozdgvuglv) list.get(i13)).vdvldrhtss(iobyxmoadgVar, z13);
        }
        int size2 = list2.size();
        for (int i14 = 0; i14 < size2; i14++) {
            ((iozdgvuglv) list2.get(i14)).vdvldrhtss(iobyxmoadgVar, z13);
        }
        return gg.wwaezpbzkn.f37140iobyxmoadg;
    }

    private static final int gxszxtbevo(int i13, boolean z13, int i14) {
        return !z13 ? i13 : (i14 - i13) - 1;
    }

    private static final List lqeggnwhkg(List list, lmojexxdyd lmojexxdydVar, int i13, int i14, List list2, float f13, boolean z13, cqumvgiudr cqumvgiudrVar) {
        ArrayList arrayList;
        agtfadlqog agtfadlqogVar;
        iozdgvuglv iozdgvuglvVar;
        Object obj;
        int iGtknphoqwx;
        Object obj2;
        int index;
        int iMin;
        iozdgvuglv iozdgvuglvVar2;
        Object obj3;
        int i15 = i13 - 1;
        int iMin2 = Math.min(((iozdgvuglv) hg.jyumaefscl.skhdrjzrfn(list)).getIndex() + i14, i15);
        int index2 = ((iozdgvuglv) hg.jyumaefscl.skhdrjzrfn(list)).getIndex() + 1;
        if (index2 <= iMin2) {
            ArrayList arrayList2 = null;
            while (true) {
                if (arrayList2 == null) {
                    arrayList2 = new ArrayList();
                }
                arrayList = arrayList2;
                arrayList.add(lmojexxdyd.gxszxtbevo(lmojexxdydVar, index2, 0L, 2, null));
                if (index2 == iMin2) {
                    break;
                }
                index2++;
                arrayList2 = arrayList;
            }
        } else {
            arrayList = null;
        }
        if (z13 && cqumvgiudrVar != null && !cqumvgiudrVar.nufgyqmvbu().isEmpty()) {
            List listNufgyqmvbu = cqumvgiudrVar.nufgyqmvbu();
            int size = listNufgyqmvbu.size();
            while (true) {
                size--;
                if (-1 >= size) {
                    agtfadlqogVar = null;
                    break;
                }
                if (((agtfadlqog) listNufgyqmvbu.get(size)).getIndex() > iMin2 && (size == 0 || ((agtfadlqog) listNufgyqmvbu.get(size - 1)).getIndex() <= iMin2)) {
                    agtfadlqogVar = (agtfadlqog) listNufgyqmvbu.get(size);
                    break;
                }
            }
            agtfadlqog agtfadlqogVar2 = (agtfadlqog) hg.jyumaefscl.skhdrjzrfn(cqumvgiudrVar.nufgyqmvbu());
            if (agtfadlqogVar != null && (index = agtfadlqogVar.getIndex()) <= (iMin = Math.min(agtfadlqogVar2.getIndex(), i15))) {
                while (true) {
                    if (arrayList != null) {
                        int size2 = arrayList.size();
                        int i16 = 0;
                        while (true) {
                            if (i16 >= size2) {
                                obj3 = null;
                                break;
                            }
                            obj3 = arrayList.get(i16);
                            if (((iozdgvuglv) obj3).getIndex() == index) {
                                break;
                            }
                            i16++;
                        }
                        iozdgvuglvVar2 = (iozdgvuglv) obj3;
                    } else {
                        iozdgvuglvVar2 = null;
                    }
                    if (iozdgvuglvVar2 == null) {
                        if (arrayList == null) {
                            arrayList = new ArrayList();
                        }
                        arrayList.add(lmojexxdyd.gxszxtbevo(lmojexxdydVar, index, 0L, 2, null));
                    }
                    if (index == iMin) {
                        break;
                    }
                    index++;
                }
            }
            float fPpxfxbqfkf = ((cqumvgiudrVar.ppxfxbqfkf() - agtfadlqogVar2.iobyxmoadg()) - agtfadlqogVar2.getSize()) - f13;
            if (fPpxfxbqfkf > 0.0f) {
                int index3 = agtfadlqogVar2.getIndex() + 1;
                int i17 = 0;
                while (index3 < i13 && i17 < fPpxfxbqfkf) {
                    if (index3 <= iMin2) {
                        int size3 = list.size();
                        int i18 = 0;
                        while (true) {
                            if (i18 >= size3) {
                                obj2 = null;
                                break;
                            }
                            obj2 = list.get(i18);
                            if (((iozdgvuglv) obj2).getIndex() == index3) {
                                break;
                            }
                            i18++;
                        }
                        iozdgvuglvVar = (iozdgvuglv) obj2;
                    } else if (arrayList != null) {
                        int size4 = arrayList.size();
                        int i19 = 0;
                        while (true) {
                            if (i19 >= size4) {
                                obj = null;
                                break;
                            }
                            obj = arrayList.get(i19);
                            if (((iozdgvuglv) obj).getIndex() == index3) {
                                break;
                            }
                            i19++;
                        }
                        iozdgvuglvVar = (iozdgvuglv) obj;
                    } else {
                        iozdgvuglvVar = null;
                    }
                    if (iozdgvuglvVar != null) {
                        index3++;
                        iGtknphoqwx = iozdgvuglvVar.gtknphoqwx();
                    } else {
                        if (arrayList == null) {
                            arrayList = new ArrayList();
                        }
                        arrayList.add(lmojexxdyd.gxszxtbevo(lmojexxdydVar, index3, 0L, 2, null));
                        index3++;
                        iGtknphoqwx = ((iozdgvuglv) hg.jyumaefscl.skhdrjzrfn(arrayList)).gtknphoqwx();
                    }
                    i17 += iGtknphoqwx;
                }
            }
        }
        if (arrayList != null && ((iozdgvuglv) hg.jyumaefscl.skhdrjzrfn(arrayList)).getIndex() > iMin2) {
            iMin2 = ((iozdgvuglv) hg.jyumaefscl.skhdrjzrfn(arrayList)).getIndex();
        }
        int size5 = list2.size();
        for (int i23 = 0; i23 < size5; i23++) {
            int iIntValue = ((Number) list2.get(i23)).intValue();
            if (iIntValue > iMin2) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(lmojexxdyd.gxszxtbevo(lmojexxdydVar, iIntValue, 0L, 2, null));
            }
        }
        return arrayList == null ? hg.jyumaefscl.wflxmlrfwp() : arrayList;
    }

    private static final List nufgyqmvbu(int i13, lmojexxdyd lmojexxdydVar, int i14, List list) {
        int iMax = Math.max(0, i13 - i14);
        int i15 = i13 - 1;
        ArrayList arrayList = null;
        if (iMax <= i15) {
            while (true) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(lmojexxdyd.gxszxtbevo(lmojexxdydVar, i15, 0L, 2, null));
                if (i15 == iMax) {
                    break;
                }
                i15--;
            }
        }
        int size = list.size() - 1;
        if (size >= 0) {
            while (true) {
                int i16 = size - 1;
                int iIntValue = ((Number) list.get(size)).intValue();
                if (iIntValue < iMax) {
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    arrayList.add(lmojexxdyd.gxszxtbevo(lmojexxdydVar, iIntValue, 0L, 2, null));
                }
                if (i16 < 0) {
                    break;
                }
                size = i16;
            }
        }
        return arrayList == null ? hg.jyumaefscl.wflxmlrfwp() : arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final iozdgvuglv wflxmlrfwp(lmojexxdyd lmojexxdydVar, int i13) {
        return lmojexxdyd.gxszxtbevo(lmojexxdydVar, i13, 0L, 2, null);
    }
}
