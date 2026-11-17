package androidx.datastore.preferences.protobuf;

import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes.dex */
abstract class jlmebxxoox {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private static final Class f8673iobyxmoadg = pmvmpeiblj();

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private static final ikoacuggdj f8676zoijcleaow = zynmafqrjb(false);

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private static final ikoacuggdj f8674ppxfxbqfkf = zynmafqrjb(true);

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private static final ikoacuggdj f8675wkgbmnqykc = new jztzpxfvev();

    static int agtfadlqog(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iCqumvgiudr = 0;
        for (int i13 = 0; i13 < size; i13++) {
            iCqumvgiudr += CodedOutputStream.cqumvgiudr(((Long) list.get(i13)).longValue());
        }
        return iCqumvgiudr;
    }

    static int btonecajqb(int i13, List list, sopmlzcsov sopmlzcsovVar) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iOxmwwwfdhm = 0;
        for (int i14 = 0; i14 < size; i14++) {
            iOxmwwwfdhm += CodedOutputStream.oxmwwwfdhm(i13, (wwaezpbzkn) list.get(i14), sopmlzcsovVar);
        }
        return iOxmwwwfdhm;
    }

    static void cdpycssgdh(wflxmlrfwp wflxmlrfwpVar, Object obj, Object obj2) {
        rgvfuqvkyq rgvfuqvkyqVarPpxfxbqfkf = wflxmlrfwpVar.ppxfxbqfkf(obj2);
        if (rgvfuqvkyqVarPpxfxbqfkf.btonecajqb()) {
            return;
        }
        wflxmlrfwpVar.wkgbmnqykc(obj).rgvfuqvkyq(rgvfuqvkyqVarPpxfxbqfkf);
    }

    public static void cllcsxoeiz(int i13, List list, uwvvkdfqfp uwvvkdfqfpVar) {
        if (list == null || list.isEmpty()) {
            return;
        }
        uwvvkdfqfpVar.writeBytesList(i13, list);
    }

    static int cqumvgiudr(int i13, List list, boolean z13) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iEsjtqupxsv = esjtqupxsv(list);
        return z13 ? CodedOutputStream.wypolnanlu(i13) + CodedOutputStream.esjtqupxsv(iEsjtqupxsv) : iEsjtqupxsv + (size * CodedOutputStream.wypolnanlu(i13));
    }

    public static void crxdokpmqz(int i13, List list, uwvvkdfqfp uwvvkdfqfpVar, boolean z13) {
        if (list == null || list.isEmpty()) {
            return;
        }
        uwvvkdfqfpVar.writeSFixed32List(i13, list, z13);
    }

    static int draadjrbmk(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iJyumaefscl = 0;
        for (int i13 = 0; i13 < size; i13++) {
            iJyumaefscl += CodedOutputStream.jyumaefscl(((Integer) list.get(i13)).intValue());
        }
        return iJyumaefscl;
    }

    public static void dsvhmnatus(int i13, List list, uwvvkdfqfp uwvvkdfqfpVar, boolean z13) {
        if (list == null || list.isEmpty()) {
            return;
        }
        uwvvkdfqfpVar.writeDoubleList(i13, list, z13);
    }

    static int dxjokdxxww(List list) {
        return list.size() * 8;
    }

    static int eablkybsjg(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iGtknphoqwx = 0;
        for (int i13 = 0; i13 < size; i13++) {
            iGtknphoqwx += CodedOutputStream.gtknphoqwx(((Integer) list.get(i13)).intValue());
        }
        return iGtknphoqwx;
    }

    static int esjtqupxsv(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iMbcevpiqjq = 0;
        for (int i13 = 0; i13 < size; i13++) {
            iMbcevpiqjq += CodedOutputStream.mbcevpiqjq(((Long) list.get(i13)).longValue());
        }
        return iMbcevpiqjq;
    }

    static int gtknphoqwx(int i13, List list, boolean z13) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iDraadjrbmk = draadjrbmk(list);
        return z13 ? CodedOutputStream.wypolnanlu(i13) + CodedOutputStream.esjtqupxsv(iDraadjrbmk) : iDraadjrbmk + (size * CodedOutputStream.wypolnanlu(i13));
    }

    static int gxszxtbevo(int i13, List list, boolean z13) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return z13 ? CodedOutputStream.wypolnanlu(i13) + CodedOutputStream.esjtqupxsv(size * 4) : size * CodedOutputStream.draadjrbmk(i13, 0);
    }

    static Object hcddaimhww(int i13, int i14, Object obj, ikoacuggdj ikoacuggdjVar) {
        if (obj == null) {
            obj = ikoacuggdjVar.agtfadlqog();
        }
        ikoacuggdjVar.eablkybsjg(obj, i13, i14);
        return obj;
    }

    public static void hkdspvbjdz(int i13, List list, uwvvkdfqfp uwvvkdfqfpVar, boolean z13) {
        if (list == null || list.isEmpty()) {
            return;
        }
        uwvvkdfqfpVar.writeBoolList(i13, list, z13);
    }

    public static void ikoacuggdj(int i13, List list, uwvvkdfqfp uwvvkdfqfpVar, boolean z13) {
        if (list == null || list.isEmpty()) {
            return;
        }
        uwvvkdfqfpVar.writeUInt32List(i13, list, z13);
    }

    static int iobyxmoadg(int i13, List list, boolean z13) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return z13 ? CodedOutputStream.wypolnanlu(i13) + CodedOutputStream.esjtqupxsv(size) : size * CodedOutputStream.ppxfxbqfkf(i13, true);
    }

    static void iozdgvuglv(ikoacuggdj ikoacuggdjVar, Object obj, Object obj2) {
        ikoacuggdjVar.rgvfuqvkyq(obj, ikoacuggdjVar.gtknphoqwx(ikoacuggdjVar.lqeggnwhkg(obj), ikoacuggdjVar.lqeggnwhkg(obj2)));
    }

    private static Class istkbnxepw() {
        try {
            return Class.forName("androidx.datastore.preferences.protobuf.UnknownFieldSetSchema");
        } catch (Throwable unused) {
            return null;
        }
    }

    static int iwizpuwonk(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iKegysxyocb = 0;
        for (int i13 = 0; i13 < size; i13++) {
            iKegysxyocb += CodedOutputStream.kegysxyocb(((Integer) list.get(i13)).intValue());
        }
        return iKegysxyocb;
    }

    public static void jhduphickx(int i13, List list, uwvvkdfqfp uwvvkdfqfpVar) {
        if (list == null || list.isEmpty()) {
            return;
        }
        uwvvkdfqfpVar.writeStringList(i13, list);
    }

    public static void jlmebxxoox(int i13, List list, uwvvkdfqfp uwvvkdfqfpVar, boolean z13) {
        if (list == null || list.isEmpty()) {
            return;
        }
        uwvvkdfqfpVar.writeSFixed64List(i13, list, z13);
    }

    public static ikoacuggdj jpowsppfya() {
        return f8675wkgbmnqykc;
    }

    static int jyumaefscl(int i13, List list, boolean z13) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iIwizpuwonk = iwizpuwonk(list);
        return z13 ? CodedOutputStream.wypolnanlu(i13) + CodedOutputStream.esjtqupxsv(iIwizpuwonk) : iIwizpuwonk + (size * CodedOutputStream.wypolnanlu(i13));
    }

    static int kcexrzcfyt(int i13, List list, boolean z13) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iZdlpuopuiu = zdlpuopuiu(list);
        return z13 ? CodedOutputStream.wypolnanlu(i13) + CodedOutputStream.esjtqupxsv(iZdlpuopuiu) : iZdlpuopuiu + (size * CodedOutputStream.wypolnanlu(i13));
    }

    public static void kegysxyocb(int i13, List list, uwvvkdfqfp uwvvkdfqfpVar, boolean z13) {
        if (list == null || list.isEmpty()) {
            return;
        }
        uwvvkdfqfpVar.writeFixed64List(i13, list, z13);
    }

    static Object lereixgezr(int i13, List list, zdlpuopuiu.iobyxmoadg iobyxmoadgVar, Object obj, ikoacuggdj ikoacuggdjVar) {
        if (iobyxmoadgVar == null) {
            return obj;
        }
        if (list instanceof RandomAccess) {
            int size = list.size();
            int i14 = 0;
            for (int i15 = 0; i15 < size; i15++) {
                Integer num = (Integer) list.get(i15);
                int iIntValue = num.intValue();
                if (iobyxmoadgVar.isInRange(iIntValue)) {
                    if (i15 != i14) {
                        list.set(i14, num);
                    }
                    i14++;
                } else {
                    obj = hcddaimhww(i13, iIntValue, obj, ikoacuggdjVar);
                }
            }
            if (i14 != size) {
                list.subList(i14, size).clear();
            }
        } else {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                int iIntValue2 = ((Integer) it.next()).intValue();
                if (!iobyxmoadgVar.isInRange(iIntValue2)) {
                    obj = hcddaimhww(i13, iIntValue2, obj, ikoacuggdjVar);
                    it.remove();
                }
            }
        }
        return obj;
    }

    public static ikoacuggdj lmojexxdyd() {
        return f8676zoijcleaow;
    }

    static int lqeggnwhkg(List list) {
        return list.size() * 4;
    }

    public static void mbcevpiqjq(int i13, List list, uwvvkdfqfp uwvvkdfqfpVar, sopmlzcsov sopmlzcsovVar) {
        if (list == null || list.isEmpty()) {
            return;
        }
        uwvvkdfqfpVar.iobyxmoadg(i13, list, sopmlzcsovVar);
    }

    public static void ntlheqmsrt(int i13, List list, uwvvkdfqfp uwvvkdfqfpVar, boolean z13) {
        if (list == null || list.isEmpty()) {
            return;
        }
        uwvvkdfqfpVar.writeInt32List(i13, list, z13);
    }

    static int nufgyqmvbu(int i13, List list, boolean z13) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return z13 ? CodedOutputStream.wypolnanlu(i13) + CodedOutputStream.esjtqupxsv(size * 8) : size * CodedOutputStream.agtfadlqog(i13, 0L);
    }

    static int ojitshcjhn(int i13, Object obj, sopmlzcsov sopmlzcsovVar) {
        return CodedOutputStream.lereixgezr(i13, (wwaezpbzkn) obj, sopmlzcsovVar);
    }

    public static void okpsazkaxt(int i13, List list, uwvvkdfqfp uwvvkdfqfpVar, boolean z13) {
        if (list == null || list.isEmpty()) {
            return;
        }
        uwvvkdfqfpVar.writeUInt64List(i13, list, z13);
    }

    static int oxmwwwfdhm(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iHcddaimhww = 0;
        for (int i13 = 0; i13 < size; i13++) {
            iHcddaimhww += CodedOutputStream.hcddaimhww(((Integer) list.get(i13)).intValue());
        }
        return iHcddaimhww;
    }

    static boolean pkzmftpjix(Object obj, Object obj2) {
        return obj == obj2 || (obj != null && obj.equals(obj2));
    }

    private static Class pmvmpeiblj() {
        try {
            return Class.forName("androidx.datastore.preferences.protobuf.GeneratedMessageV3");
        } catch (Throwable unused) {
            return null;
        }
    }

    static int ppxfxbqfkf(int i13, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iWypolnanlu = size * CodedOutputStream.wypolnanlu(i13);
        for (int i14 = 0; i14 < list.size(); i14++) {
            iWypolnanlu += CodedOutputStream.lqeggnwhkg((gxszxtbevo) list.get(i14));
        }
        return iWypolnanlu;
    }

    static int rgvfuqvkyq(int i13, List list, sopmlzcsov sopmlzcsovVar) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iWypolnanlu = CodedOutputStream.wypolnanlu(i13) * size;
        for (int i14 = 0; i14 < size; i14++) {
            iWypolnanlu += CodedOutputStream.zynmafqrjb((wwaezpbzkn) list.get(i14), sopmlzcsovVar);
        }
        return iWypolnanlu;
    }

    public static void ribwqtqdhb(int i13, List list, uwvvkdfqfp uwvvkdfqfpVar, boolean z13) {
        if (list == null || list.isEmpty()) {
            return;
        }
        uwvvkdfqfpVar.writeSInt32List(i13, list, z13);
    }

    public static void sopmlzcsov(int i13, List list, uwvvkdfqfp uwvvkdfqfpVar, sopmlzcsov sopmlzcsovVar) {
        if (list == null || list.isEmpty()) {
            return;
        }
        uwvvkdfqfpVar.gxszxtbevo(i13, list, sopmlzcsovVar);
    }

    public static void stevsuqkhv(int i13, List list, uwvvkdfqfp uwvvkdfqfpVar, boolean z13) {
        if (list == null || list.isEmpty()) {
            return;
        }
        uwvvkdfqfpVar.writeFixed32List(i13, list, z13);
    }

    public static void tzroggbefp(int i13, List list, uwvvkdfqfp uwvvkdfqfpVar, boolean z13) {
        if (list == null || list.isEmpty()) {
            return;
        }
        uwvvkdfqfpVar.writeFloatList(i13, list, z13);
    }

    public static void ulzqkzuiru(int i13, List list, uwvvkdfqfp uwvvkdfqfpVar, boolean z13) {
        if (list == null || list.isEmpty()) {
            return;
        }
        uwvvkdfqfpVar.writeInt64List(i13, list, z13);
    }

    static int vdvldrhtss(int i13, List list, boolean z13) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iOxmwwwfdhm = oxmwwwfdhm(list);
        return z13 ? CodedOutputStream.wypolnanlu(i13) + CodedOutputStream.esjtqupxsv(iOxmwwwfdhm) : iOxmwwwfdhm + (size * CodedOutputStream.wypolnanlu(i13));
    }

    public static void vipkmwdibw(int i13, List list, uwvvkdfqfp uwvvkdfqfpVar, boolean z13) {
        if (list == null || list.isEmpty()) {
            return;
        }
        uwvvkdfqfpVar.writeSInt64List(i13, list, z13);
    }

    static int wflxmlrfwp(int i13, List list, boolean z13) {
        if (list.size() == 0) {
            return 0;
        }
        int iAgtfadlqog = agtfadlqog(list);
        return z13 ? CodedOutputStream.wypolnanlu(i13) + CodedOutputStream.esjtqupxsv(iAgtfadlqog) : iAgtfadlqog + (list.size() * CodedOutputStream.wypolnanlu(i13));
    }

    static int wkgbmnqykc(int i13, List list, boolean z13) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iEablkybsjg = eablkybsjg(list);
        return z13 ? CodedOutputStream.wypolnanlu(i13) + CodedOutputStream.esjtqupxsv(iEablkybsjg) : iEablkybsjg + (size * CodedOutputStream.wypolnanlu(i13));
    }

    public static ikoacuggdj wwaezpbzkn() {
        return f8674ppxfxbqfkf;
    }

    public static void wypolnanlu(int i13, List list, uwvvkdfqfp uwvvkdfqfpVar, boolean z13) {
        if (list == null || list.isEmpty()) {
            return;
        }
        uwvvkdfqfpVar.writeEnumList(i13, list, z13);
    }

    static void yadqdtsiqt(istkbnxepw istkbnxepwVar, Object obj, Object obj2, long j13) {
        metgxyhuhe.dsvhmnatus(obj, j13, istkbnxepwVar.mergeFrom(metgxyhuhe.pmvmpeiblj(obj, j13), metgxyhuhe.pmvmpeiblj(obj2, j13)));
    }

    static int yggfygwlhe(int i13, List list) {
        int size = list.size();
        int i14 = 0;
        if (size == 0) {
            return 0;
        }
        int iWypolnanlu = CodedOutputStream.wypolnanlu(i13) * size;
        if (list instanceof cqumvgiudr) {
            cqumvgiudr cqumvgiudrVar = (cqumvgiudr) list;
            while (i14 < size) {
                Object raw = cqumvgiudrVar.getRaw(i14);
                iWypolnanlu += raw instanceof gxszxtbevo ? CodedOutputStream.lqeggnwhkg((gxszxtbevo) raw) : CodedOutputStream.dsvhmnatus((String) raw);
                i14++;
            }
        } else {
            while (i14 < size) {
                Object obj = list.get(i14);
                iWypolnanlu += obj instanceof gxszxtbevo ? CodedOutputStream.lqeggnwhkg((gxszxtbevo) obj) : CodedOutputStream.dsvhmnatus((String) obj);
                i14++;
            }
        }
        return iWypolnanlu;
    }

    public static void ylkuphrtab(Class cls) {
        Class cls2;
        if (!kcexrzcfyt.class.isAssignableFrom(cls) && (cls2 = f8673iobyxmoadg) != null && !cls2.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("Message classes must extend GeneratedMessage or GeneratedMessageLite");
        }
    }

    static int zdlpuopuiu(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iHkdspvbjdz = 0;
        for (int i13 = 0; i13 < size; i13++) {
            iHkdspvbjdz += CodedOutputStream.hkdspvbjdz(((Long) list.get(i13)).longValue());
        }
        return iHkdspvbjdz;
    }

    static int zoijcleaow(List list) {
        return list.size();
    }

    private static ikoacuggdj zynmafqrjb(boolean z13) {
        try {
            Class clsIstkbnxepw = istkbnxepw();
            if (clsIstkbnxepw == null) {
                return null;
            }
            return (ikoacuggdj) clsIstkbnxepw.getConstructor(Boolean.TYPE).newInstance(Boolean.valueOf(z13));
        } catch (Throwable unused) {
            return null;
        }
    }
}
