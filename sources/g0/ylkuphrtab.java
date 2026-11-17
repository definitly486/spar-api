package g0;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public abstract class ylkuphrtab {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private static final Comparator[] f35750iobyxmoadg;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private static final tg.rgvfuqvkyq f35751zoijcleaow;

    static final class iobyxmoadg extends kotlin.jvm.internal.jyumaefscl implements tg.rgvfuqvkyq {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        public static final iobyxmoadg f35752zdlpuopuiu = new iobyxmoadg();

        /* JADX INFO: renamed from: g0.ylkuphrtab$iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
        static final class C0805iobyxmoadg extends kotlin.jvm.internal.jyumaefscl implements tg.iobyxmoadg {

            /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
            public static final C0805iobyxmoadg f35753zdlpuopuiu = new C0805iobyxmoadg();

            C0805iobyxmoadg() {
                super(0);
            }

            @Override // tg.iobyxmoadg
            /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
            public final Float invoke() {
                return Float.valueOf(0.0f);
            }
        }

        static final class zoijcleaow extends kotlin.jvm.internal.jyumaefscl implements tg.iobyxmoadg {

            /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
            public static final zoijcleaow f35754zdlpuopuiu = new zoijcleaow();

            zoijcleaow() {
                super(0);
            }

            @Override // tg.iobyxmoadg
            /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
            public final Float invoke() {
                return Float.valueOf(0.0f);
            }
        }

        iobyxmoadg() {
            super(2);
        }

        @Override // tg.rgvfuqvkyq
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public final Integer invoke(zdlpuopuiu zdlpuopuiuVar, zdlpuopuiu zdlpuopuiuVar2) {
            wflxmlrfwp wflxmlrfwpVarEsjtqupxsv = zdlpuopuiuVar.esjtqupxsv();
            esjtqupxsv esjtqupxsvVar = esjtqupxsv.f35662iobyxmoadg;
            return Integer.valueOf(Float.compare(((Number) wflxmlrfwpVarEsjtqupxsv.btonecajqb(esjtqupxsvVar.cllcsxoeiz(), C0805iobyxmoadg.f35753zdlpuopuiu)).floatValue(), ((Number) zdlpuopuiuVar2.esjtqupxsv().btonecajqb(esjtqupxsvVar.cllcsxoeiz(), zoijcleaow.f35754zdlpuopuiu)).floatValue()));
        }
    }

    public static final class ppxfxbqfkf implements Comparator {

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        final /* synthetic */ Comparator f35755yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final /* synthetic */ Comparator f35756zdlpuopuiu;

        public ppxfxbqfkf(Comparator comparator, Comparator comparator2) {
            this.f35756zdlpuopuiu = comparator;
            this.f35755yggfygwlhe = comparator2;
        }

        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            int iCompare = this.f35756zdlpuopuiu.compare(obj, obj2);
            return iCompare != 0 ? iCompare : this.f35755yggfygwlhe.compare(((zdlpuopuiu) obj).kcexrzcfyt(), ((zdlpuopuiu) obj2).kcexrzcfyt());
        }
    }

    public static final class wkgbmnqykc implements Comparator {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final /* synthetic */ Comparator f35757zdlpuopuiu;

        public wkgbmnqykc(Comparator comparator) {
            this.f35757zdlpuopuiu = comparator;
        }

        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            int iCompare = this.f35757zdlpuopuiu.compare(obj, obj2);
            return iCompare != 0 ? iCompare : kg.iobyxmoadg.wkgbmnqykc(Integer.valueOf(((zdlpuopuiu) obj).vdvldrhtss()), Integer.valueOf(((zdlpuopuiu) obj2).vdvldrhtss()));
        }
    }

    static final class zoijcleaow extends kotlin.jvm.internal.jyumaefscl implements tg.iobyxmoadg {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        public static final zoijcleaow f35758zdlpuopuiu = new zoijcleaow();

        zoijcleaow() {
            super(0);
        }

        @Override // tg.iobyxmoadg
        public final Boolean invoke() {
            return Boolean.FALSE;
        }
    }

    static {
        Comparator[] comparatorArr = new Comparator[2];
        int i13 = 0;
        while (i13 < 2) {
            comparatorArr[i13] = new wkgbmnqykc(new ppxfxbqfkf(i13 == 0 ? dxjokdxxww.f35643zdlpuopuiu : gxszxtbevo.f35706zdlpuopuiu, z.pkzmftpjix.f127138ydmasvzmpa.zoijcleaow()));
            i13++;
        }
        f35750iobyxmoadg = comparatorArr;
        f35751zoijcleaow = iobyxmoadg.f35752zdlpuopuiu;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int eablkybsjg(tg.rgvfuqvkyq rgvfuqvkyqVar, Object obj, Object obj2) {
        return ((Number) rgvfuqvkyqVar.invoke(obj, obj2)).intValue();
    }

    public static final List gxszxtbevo(zdlpuopuiu zdlpuopuiuVar, tg.draadjrbmk draadjrbmkVar, tg.draadjrbmk draadjrbmkVar2, List list) {
        androidx.collection.iozdgvuglv iozdgvuglvVarPpxfxbqfkf = androidx.collection.rgvfuqvkyq.ppxfxbqfkf();
        ArrayList arrayList = new ArrayList();
        int size = list.size();
        for (int i13 = 0; i13 < size; i13++) {
            zoijcleaow((zdlpuopuiu) list.get(i13), arrayList, draadjrbmkVar, draadjrbmkVar2, iozdgvuglvVarPpxfxbqfkf);
        }
        return wkgbmnqykc(zdlpuopuiuVar, arrayList, draadjrbmkVar2, iozdgvuglvVarPpxfxbqfkf);
    }

    private static final boolean ppxfxbqfkf(ArrayList arrayList, zdlpuopuiu zdlpuopuiuVar) {
        float fGtknphoqwx = zdlpuopuiuVar.draadjrbmk().gtknphoqwx();
        float fEablkybsjg = zdlpuopuiuVar.draadjrbmk().eablkybsjg();
        boolean z13 = fGtknphoqwx >= fEablkybsjg;
        int iOjitshcjhn = hg.jyumaefscl.ojitshcjhn(arrayList);
        if (iOjitshcjhn >= 0) {
            int i13 = 0;
            while (true) {
                g.lqeggnwhkg lqeggnwhkgVar = (g.lqeggnwhkg) ((gg.vdvldrhtss) arrayList.get(i13)).lqeggnwhkg();
                boolean z14 = lqeggnwhkgVar.gtknphoqwx() >= lqeggnwhkgVar.eablkybsjg();
                if (!z13 && !z14 && Math.max(fGtknphoqwx, lqeggnwhkgVar.gtknphoqwx()) < Math.min(fEablkybsjg, lqeggnwhkgVar.eablkybsjg())) {
                    arrayList.set(i13, new gg.vdvldrhtss(lqeggnwhkgVar.wflxmlrfwp(0.0f, fGtknphoqwx, Float.POSITIVE_INFINITY, fEablkybsjg), ((gg.vdvldrhtss) arrayList.get(i13)).nufgyqmvbu()));
                    ((List) ((gg.vdvldrhtss) arrayList.get(i13)).nufgyqmvbu()).add(zdlpuopuiuVar);
                    return true;
                }
                if (i13 != iOjitshcjhn) {
                    i13++;
                }
            }
        }
        return false;
    }

    public static final List wkgbmnqykc(zdlpuopuiu zdlpuopuiuVar, List list, tg.draadjrbmk draadjrbmkVar, androidx.collection.ojitshcjhn ojitshcjhnVar) {
        int size = 0;
        char c13 = zdlpuopuiuVar.oxmwwwfdhm().getLayoutDirection() == w0.zdlpuopuiu.Rtl ? (char) 1 : (char) 0;
        ArrayList arrayList = new ArrayList(list.size() / 2);
        int iOjitshcjhn = hg.jyumaefscl.ojitshcjhn(list);
        if (iOjitshcjhn >= 0) {
            int i13 = 0;
            while (true) {
                zdlpuopuiu zdlpuopuiuVar2 = (zdlpuopuiu) list.get(i13);
                if (i13 == 0 || !ppxfxbqfkf(arrayList, zdlpuopuiuVar2)) {
                    arrayList.add(new gg.vdvldrhtss(zdlpuopuiuVar2.draadjrbmk(), hg.jyumaefscl.kcexrzcfyt(zdlpuopuiuVar2)));
                }
                if (i13 == iOjitshcjhn) {
                    break;
                }
                i13++;
            }
        }
        hg.jyumaefscl.zynmafqrjb(arrayList, pkzmftpjix.f35739zdlpuopuiu);
        ArrayList arrayList2 = new ArrayList();
        Comparator comparator = f35750iobyxmoadg[c13 ^ 1];
        int size2 = arrayList.size();
        for (int i14 = 0; i14 < size2; i14++) {
            gg.vdvldrhtss vdvldrhtssVar = (gg.vdvldrhtss) arrayList.get(i14);
            hg.jyumaefscl.zynmafqrjb((List) vdvldrhtssVar.nufgyqmvbu(), comparator);
            arrayList2.addAll((Collection) vdvldrhtssVar.nufgyqmvbu());
        }
        final tg.rgvfuqvkyq rgvfuqvkyqVar = f35751zoijcleaow;
        hg.jyumaefscl.zynmafqrjb(arrayList2, new Comparator() { // from class: g0.wwaezpbzkn
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return ylkuphrtab.eablkybsjg(rgvfuqvkyqVar, obj, obj2);
            }
        });
        while (size <= hg.jyumaefscl.ojitshcjhn(arrayList2)) {
            List list2 = (List) ojitshcjhnVar.zoijcleaow(((zdlpuopuiu) arrayList2.get(size)).vdvldrhtss());
            if (list2 != null) {
                if (((Boolean) draadjrbmkVar.invoke(arrayList2.get(size))).booleanValue()) {
                    size++;
                } else {
                    arrayList2.remove(size);
                }
                arrayList2.addAll(size, list2);
                size += list2.size();
            } else {
                size++;
            }
        }
        return arrayList2;
    }

    private static final void zoijcleaow(zdlpuopuiu zdlpuopuiuVar, ArrayList arrayList, tg.draadjrbmk draadjrbmkVar, tg.draadjrbmk draadjrbmkVar2, androidx.collection.iozdgvuglv iozdgvuglvVar) {
        boolean zBooleanValue = ((Boolean) zdlpuopuiuVar.esjtqupxsv().btonecajqb(esjtqupxsv.f35662iobyxmoadg.iwizpuwonk(), zoijcleaow.f35758zdlpuopuiu)).booleanValue();
        if ((zBooleanValue || ((Boolean) draadjrbmkVar2.invoke(zdlpuopuiuVar)).booleanValue()) && ((Boolean) draadjrbmkVar.invoke(zdlpuopuiuVar)).booleanValue()) {
            arrayList.add(zdlpuopuiuVar);
        }
        if (zBooleanValue) {
            iozdgvuglvVar.oxmwwwfdhm(zdlpuopuiuVar.vdvldrhtss(), gxszxtbevo(zdlpuopuiuVar, draadjrbmkVar, draadjrbmkVar2, zdlpuopuiuVar.wflxmlrfwp()));
            return;
        }
        List listWflxmlrfwp = zdlpuopuiuVar.wflxmlrfwp();
        int size = listWflxmlrfwp.size();
        for (int i13 = 0; i13 < size; i13++) {
            zoijcleaow((zdlpuopuiu) listWflxmlrfwp.get(i13), arrayList, draadjrbmkVar, draadjrbmkVar2, iozdgvuglvVar);
        }
    }
}
