package bl;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes3.dex */
public final class iwizpuwonk extends hg.wkgbmnqykc implements RandomAccess {

    /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
    public static final iobyxmoadg f16705iwizpuwonk = new iobyxmoadg(null);

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
    private final int[] f16706jyumaefscl;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    private final gxszxtbevo[] f16707yggfygwlhe;

    public static final class iobyxmoadg {
        public /* synthetic */ iobyxmoadg(kotlin.jvm.internal.gtknphoqwx gtknphoqwxVar) {
            this();
        }

        private final void iobyxmoadg(long j13, ppxfxbqfkf ppxfxbqfkfVar, int i13, List list, int i14, int i15, List list2) {
            int i16;
            int i17;
            int i18;
            int i19 = i13;
            if (i14 >= i15) {
                throw new IllegalArgumentException("Failed requirement.");
            }
            for (int i23 = i14; i23 < i15; i23++) {
                if (((gxszxtbevo) list.get(i23)).hcddaimhww() < i19) {
                    throw new IllegalArgumentException("Failed requirement.");
                }
            }
            gxszxtbevo gxszxtbevoVar = (gxszxtbevo) list.get(i14);
            gxszxtbevo gxszxtbevoVar2 = (gxszxtbevo) list.get(i15 - 1);
            int i24 = -1;
            if (i19 == gxszxtbevoVar.hcddaimhww()) {
                int iIntValue = ((Number) list2.get(i14)).intValue();
                int i25 = i14 + 1;
                gxszxtbevo gxszxtbevoVar3 = (gxszxtbevo) list.get(i25);
                i16 = i25;
                i17 = iIntValue;
                gxszxtbevoVar = gxszxtbevoVar3;
            } else {
                i16 = i14;
                i17 = -1;
            }
            if (gxszxtbevoVar.draadjrbmk(i19) == gxszxtbevoVar2.draadjrbmk(i19)) {
                int iMin = Math.min(gxszxtbevoVar.hcddaimhww(), gxszxtbevoVar2.hcddaimhww());
                int i26 = 0;
                for (int i27 = i19; i27 < iMin && gxszxtbevoVar.draadjrbmk(i27) == gxszxtbevoVar2.draadjrbmk(i27); i27++) {
                    i26++;
                }
                long jPpxfxbqfkf = j13 + ppxfxbqfkf(ppxfxbqfkfVar) + ((long) 2) + ((long) i26) + 1;
                ppxfxbqfkfVar.hcddaimhww(-i26);
                ppxfxbqfkfVar.hcddaimhww(i17);
                int i28 = i26 + i19;
                while (i19 < i28) {
                    ppxfxbqfkfVar.hcddaimhww(gxszxtbevoVar.draadjrbmk(i19) & 255);
                    i19++;
                }
                if (i16 + 1 == i15) {
                    if (i28 != ((gxszxtbevo) list.get(i16)).hcddaimhww()) {
                        throw new IllegalStateException("Check failed.");
                    }
                    ppxfxbqfkfVar.hcddaimhww(((Number) list2.get(i16)).intValue());
                    return;
                } else {
                    ppxfxbqfkf ppxfxbqfkfVar2 = new ppxfxbqfkf();
                    ppxfxbqfkfVar.hcddaimhww(((int) (ppxfxbqfkf(ppxfxbqfkfVar2) + jPpxfxbqfkf)) * (-1));
                    iobyxmoadg(jPpxfxbqfkf, ppxfxbqfkfVar2, i28, list, i16, i15, list2);
                    ppxfxbqfkfVar.xrmfcynszj(ppxfxbqfkfVar2);
                    return;
                }
            }
            int i29 = 1;
            for (int i33 = i16 + 1; i33 < i15; i33++) {
                if (((gxszxtbevo) list.get(i33 - 1)).draadjrbmk(i19) != ((gxszxtbevo) list.get(i33)).draadjrbmk(i19)) {
                    i29++;
                }
            }
            long jPpxfxbqfkf2 = j13 + ppxfxbqfkf(ppxfxbqfkfVar) + ((long) 2) + ((long) (i29 * 2));
            ppxfxbqfkfVar.hcddaimhww(i29);
            ppxfxbqfkfVar.hcddaimhww(i17);
            for (int i34 = i16; i34 < i15; i34++) {
                byte bDraadjrbmk = ((gxszxtbevo) list.get(i34)).draadjrbmk(i19);
                if (i34 == i16 || bDraadjrbmk != ((gxszxtbevo) list.get(i34 - 1)).draadjrbmk(i19)) {
                    ppxfxbqfkfVar.hcddaimhww(bDraadjrbmk & 255);
                }
            }
            ppxfxbqfkf ppxfxbqfkfVar3 = new ppxfxbqfkf();
            while (i16 < i15) {
                byte bDraadjrbmk2 = ((gxszxtbevo) list.get(i16)).draadjrbmk(i19);
                int i35 = i16 + 1;
                int i36 = i35;
                while (true) {
                    if (i36 >= i15) {
                        i18 = i15;
                        break;
                    } else {
                        if (bDraadjrbmk2 != ((gxszxtbevo) list.get(i36)).draadjrbmk(i19)) {
                            i18 = i36;
                            break;
                        }
                        i36++;
                    }
                }
                if (i35 == i18 && i19 + 1 == ((gxszxtbevo) list.get(i16)).hcddaimhww()) {
                    ppxfxbqfkfVar.hcddaimhww(((Number) list2.get(i16)).intValue());
                } else {
                    ppxfxbqfkfVar.hcddaimhww(((int) (jPpxfxbqfkf2 + ppxfxbqfkf(ppxfxbqfkfVar3))) * i24);
                    iobyxmoadg(jPpxfxbqfkf2, ppxfxbqfkfVar3, i19 + 1, list, i16, i18, list2);
                }
                ppxfxbqfkfVar3 = ppxfxbqfkfVar3;
                i16 = i18;
                i24 = -1;
            }
            ppxfxbqfkfVar.xrmfcynszj(ppxfxbqfkfVar3);
        }

        private final long ppxfxbqfkf(ppxfxbqfkf ppxfxbqfkfVar) {
            return ppxfxbqfkfVar.dsvhmnatus() / ((long) 4);
        }

        static /* synthetic */ void zoijcleaow(iobyxmoadg iobyxmoadgVar, long j13, ppxfxbqfkf ppxfxbqfkfVar, int i13, List list, int i14, int i15, List list2, int i16, Object obj) {
            iobyxmoadgVar.iobyxmoadg((i16 & 1) != 0 ? 0L : j13, ppxfxbqfkfVar, (i16 & 4) != 0 ? 0 : i13, list, (i16 & 16) != 0 ? 0 : i14, (i16 & 32) != 0 ? list.size() : i15, list2);
        }

        public final iwizpuwonk wkgbmnqykc(gxszxtbevo... byteStrings) {
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(byteStrings, "byteStrings");
            kotlin.jvm.internal.gtknphoqwx gtknphoqwxVar = null;
            int i13 = 0;
            if (byteStrings.length == 0) {
                return new iwizpuwonk(new gxszxtbevo[0], new int[]{0, -1}, gtknphoqwxVar);
            }
            List listR = hg.agtfadlqog.r(byteStrings);
            hg.jyumaefscl.pmvmpeiblj(listR);
            ArrayList arrayList = new ArrayList(byteStrings.length);
            for (gxszxtbevo gxszxtbevoVar : byteStrings) {
                arrayList.add(-1);
            }
            Integer[] numArr = (Integer[]) arrayList.toArray(new Integer[0]);
            List listKcexrzcfyt = hg.jyumaefscl.kcexrzcfyt(Arrays.copyOf(numArr, numArr.length));
            int length = byteStrings.length;
            int i14 = 0;
            int i15 = 0;
            while (i14 < length) {
                listKcexrzcfyt.set(hg.jyumaefscl.draadjrbmk(listR, byteStrings[i14], 0, 0, 6, null), Integer.valueOf(i15));
                i14++;
                i15++;
            }
            if (((gxszxtbevo) listR.get(0)).hcddaimhww() <= 0) {
                throw new IllegalArgumentException("the empty byte string is not a supported option");
            }
            int i16 = 0;
            while (i16 < listR.size()) {
                gxszxtbevo gxszxtbevoVar2 = (gxszxtbevo) listR.get(i16);
                int i17 = i16 + 1;
                int i18 = i17;
                while (i18 < listR.size()) {
                    gxszxtbevo gxszxtbevoVar3 = (gxszxtbevo) listR.get(i18);
                    if (!gxszxtbevoVar3.jpowsppfya(gxszxtbevoVar2)) {
                        break;
                    }
                    if (gxszxtbevoVar3.hcddaimhww() == gxszxtbevoVar2.hcddaimhww()) {
                        throw new IllegalArgumentException(("duplicate option: " + gxszxtbevoVar3).toString());
                    }
                    if (((Number) listKcexrzcfyt.get(i18)).intValue() > ((Number) listKcexrzcfyt.get(i16)).intValue()) {
                        listR.remove(i18);
                        listKcexrzcfyt.remove(i18);
                    } else {
                        i18++;
                    }
                }
                i16 = i17;
            }
            ppxfxbqfkf ppxfxbqfkfVar = new ppxfxbqfkf();
            zoijcleaow(this, 0L, ppxfxbqfkfVar, 0, listR, 0, 0, listKcexrzcfyt, 53, null);
            int[] iArr = new int[(int) ppxfxbqfkf(ppxfxbqfkfVar)];
            while (!ppxfxbqfkfVar.n()) {
                iArr[i13] = ppxfxbqfkfVar.readInt();
                i13++;
            }
            Object[] objArrCopyOf = Arrays.copyOf(byteStrings, byteStrings.length);
            kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(objArrCopyOf, "copyOf(this, size)");
            return new iwizpuwonk((gxszxtbevo[]) objArrCopyOf, iArr, gtknphoqwxVar);
        }

        private iobyxmoadg() {
        }
    }

    public /* synthetic */ iwizpuwonk(gxszxtbevo[] gxszxtbevoVarArr, int[] iArr, kotlin.jvm.internal.gtknphoqwx gtknphoqwxVar) {
        this(gxszxtbevoVarArr, iArr);
    }

    public static final iwizpuwonk kcexrzcfyt(gxszxtbevo... gxszxtbevoVarArr) {
        return f16705iwizpuwonk.wkgbmnqykc(gxszxtbevoVarArr);
    }

    public final gxszxtbevo[] agtfadlqog() {
        return this.f16707yggfygwlhe;
    }

    public /* bridge */ boolean btonecajqb(gxszxtbevo gxszxtbevoVar) {
        return super.contains(gxszxtbevoVar);
    }

    @Override // hg.zoijcleaow, java.util.Collection, java.util.List
    public final /* bridge */ boolean contains(Object obj) {
        if (obj instanceof gxszxtbevo) {
            return btonecajqb((gxszxtbevo) obj);
        }
        return false;
    }

    @Override // hg.wkgbmnqykc, java.util.List
    /* JADX INFO: renamed from: draadjrbmk, reason: merged with bridge method [inline-methods] */
    public gxszxtbevo get(int i13) {
        return this.f16707yggfygwlhe[i13];
    }

    @Override // hg.wkgbmnqykc, java.util.List
    public final /* bridge */ int indexOf(Object obj) {
        if (obj instanceof gxszxtbevo) {
            return rgvfuqvkyq((gxszxtbevo) obj);
        }
        return -1;
    }

    @Override // hg.wkgbmnqykc, java.util.List
    public final /* bridge */ int lastIndexOf(Object obj) {
        if (obj instanceof gxszxtbevo) {
            return vdvldrhtss((gxszxtbevo) obj);
        }
        return -1;
    }

    public final int[] ojitshcjhn() {
        return this.f16706jyumaefscl;
    }

    public /* bridge */ int rgvfuqvkyq(gxszxtbevo gxszxtbevoVar) {
        return super.indexOf(gxszxtbevoVar);
    }

    public /* bridge */ int vdvldrhtss(gxszxtbevo gxszxtbevoVar) {
        return super.lastIndexOf(gxszxtbevoVar);
    }

    @Override // hg.zoijcleaow
    public int wkgbmnqykc() {
        return this.f16707yggfygwlhe.length;
    }

    private iwizpuwonk(gxszxtbevo[] gxszxtbevoVarArr, int[] iArr) {
        this.f16707yggfygwlhe = gxszxtbevoVarArr;
        this.f16706jyumaefscl = iArr;
    }
}
