package com.google.crypto.tink.shaded.protobuf;

import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes2.dex */
abstract class okpsazkaxt {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private static final Class f23985iobyxmoadg = pmvmpeiblj();

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private static final metgxyhuhe f23988zoijcleaow = zynmafqrjb(false);

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private static final metgxyhuhe f23986ppxfxbqfkf = zynmafqrjb(true);

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private static final metgxyhuhe f23987wkgbmnqykc = new czzsidtyhn();

    static int agtfadlqog(List list) {
        int iIwizpuwonk;
        int size = list.size();
        int i13 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof cdpycssgdh) {
            cdpycssgdh cdpycssgdhVar = (cdpycssgdh) list;
            iIwizpuwonk = 0;
            while (i13 < size) {
                iIwizpuwonk += CodedOutputStream.iwizpuwonk(cdpycssgdhVar.getLong(i13));
                i13++;
            }
        } else {
            iIwizpuwonk = 0;
            while (i13 < size) {
                iIwizpuwonk += CodedOutputStream.iwizpuwonk(((Long) list.get(i13)).longValue());
                i13++;
            }
        }
        return iIwizpuwonk;
    }

    static int btonecajqb(int i13, List list, jhduphickx jhduphickxVar) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iOxmwwwfdhm = 0;
        for (int i14 = 0; i14 < size; i14++) {
            iOxmwwwfdhm += CodedOutputStream.oxmwwwfdhm(i13, (hkdspvbjdz) list.get(i14), jhduphickxVar);
        }
        return iOxmwwwfdhm;
    }

    static void cdpycssgdh(rgvfuqvkyq rgvfuqvkyqVar, Object obj, Object obj2) {
        kcexrzcfyt kcexrzcfytVarPpxfxbqfkf = rgvfuqvkyqVar.ppxfxbqfkf(obj2);
        if (kcexrzcfytVarPpxfxbqfkf.wkgbmnqykc()) {
            return;
        }
        rgvfuqvkyqVar.wkgbmnqykc(obj).nufgyqmvbu(kcexrzcfytVarPpxfxbqfkf);
    }

    public static void cllcsxoeiz(int i13, List list, zfvoamnweg zfvoamnwegVar) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zfvoamnwegVar.writeBytesList(i13, list);
    }

    static int cqumvgiudr(int i13, List list, boolean z13) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iEsjtqupxsv = esjtqupxsv(list);
        return z13 ? CodedOutputStream.jpowsppfya(i13) + CodedOutputStream.cqumvgiudr(iEsjtqupxsv) : iEsjtqupxsv + (size * CodedOutputStream.jpowsppfya(i13));
    }

    public static void crxdokpmqz(int i13, List list, zfvoamnweg zfvoamnwegVar, boolean z13) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zfvoamnwegVar.writeSFixed32List(i13, list, z13);
    }

    static int draadjrbmk(List list) {
        int iYggfygwlhe;
        int size = list.size();
        int i13 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof cqumvgiudr) {
            cqumvgiudr cqumvgiudrVar = (cqumvgiudr) list;
            iYggfygwlhe = 0;
            while (i13 < size) {
                iYggfygwlhe += CodedOutputStream.yggfygwlhe(cqumvgiudrVar.getInt(i13));
                i13++;
            }
        } else {
            iYggfygwlhe = 0;
            while (i13 < size) {
                iYggfygwlhe += CodedOutputStream.yggfygwlhe(((Integer) list.get(i13)).intValue());
                i13++;
            }
        }
        return iYggfygwlhe;
    }

    public static void dsvhmnatus(int i13, List list, zfvoamnweg zfvoamnwegVar, boolean z13) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zfvoamnwegVar.writeDoubleList(i13, list, z13);
    }

    static int dxjokdxxww(List list) {
        return list.size() * 8;
    }

    static int eablkybsjg(List list) {
        int iGtknphoqwx;
        int size = list.size();
        int i13 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof cqumvgiudr) {
            cqumvgiudr cqumvgiudrVar = (cqumvgiudr) list;
            iGtknphoqwx = 0;
            while (i13 < size) {
                iGtknphoqwx += CodedOutputStream.gtknphoqwx(cqumvgiudrVar.getInt(i13));
                i13++;
            }
        } else {
            iGtknphoqwx = 0;
            while (i13 < size) {
                iGtknphoqwx += CodedOutputStream.gtknphoqwx(((Integer) list.get(i13)).intValue());
                i13++;
            }
        }
        return iGtknphoqwx;
    }

    static int esjtqupxsv(List list) {
        int iWypolnanlu;
        int size = list.size();
        int i13 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof cdpycssgdh) {
            cdpycssgdh cdpycssgdhVar = (cdpycssgdh) list;
            iWypolnanlu = 0;
            while (i13 < size) {
                iWypolnanlu += CodedOutputStream.wypolnanlu(cdpycssgdhVar.getLong(i13));
                i13++;
            }
        } else {
            iWypolnanlu = 0;
            while (i13 < size) {
                iWypolnanlu += CodedOutputStream.wypolnanlu(((Long) list.get(i13)).longValue());
                i13++;
            }
        }
        return iWypolnanlu;
    }

    static int gtknphoqwx(int i13, List list, boolean z13) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iDraadjrbmk = draadjrbmk(list);
        return z13 ? CodedOutputStream.jpowsppfya(i13) + CodedOutputStream.cqumvgiudr(iDraadjrbmk) : iDraadjrbmk + (size * CodedOutputStream.jpowsppfya(i13));
    }

    static int gxszxtbevo(int i13, List list, boolean z13) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return z13 ? CodedOutputStream.jpowsppfya(i13) + CodedOutputStream.cqumvgiudr(size * 4) : size * CodedOutputStream.draadjrbmk(i13, 0);
    }

    static Object hcddaimhww(Object obj, int i13, int i14, Object obj2, metgxyhuhe metgxyhuheVar) {
        if (obj2 == null) {
            obj2 = metgxyhuheVar.gxszxtbevo(obj);
        }
        metgxyhuheVar.eablkybsjg(obj2, i13, i14);
        return obj2;
    }

    public static void hkdspvbjdz(int i13, List list, zfvoamnweg zfvoamnwegVar, boolean z13) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zfvoamnwegVar.writeBoolList(i13, list, z13);
    }

    public static void ikoacuggdj(int i13, List list, zfvoamnweg zfvoamnwegVar, boolean z13) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zfvoamnwegVar.writeUInt32List(i13, list, z13);
    }

    static int iobyxmoadg(int i13, List list, boolean z13) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return z13 ? CodedOutputStream.jpowsppfya(i13) + CodedOutputStream.cqumvgiudr(size) : size * CodedOutputStream.wkgbmnqykc(i13, true);
    }

    static void iozdgvuglv(metgxyhuhe metgxyhuheVar, Object obj, Object obj2) {
        metgxyhuheVar.rgvfuqvkyq(obj, metgxyhuheVar.gtknphoqwx(metgxyhuheVar.lqeggnwhkg(obj), metgxyhuheVar.lqeggnwhkg(obj2)));
    }

    private static Class istkbnxepw() {
        try {
            return Class.forName("com.google.crypto.tink.shaded.protobuf.UnknownFieldSetSchema");
        } catch (Throwable unused) {
            return null;
        }
    }

    static int iwizpuwonk(List list) {
        int iCllcsxoeiz;
        int size = list.size();
        int i13 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof cqumvgiudr) {
            cqumvgiudr cqumvgiudrVar = (cqumvgiudr) list;
            iCllcsxoeiz = 0;
            while (i13 < size) {
                iCllcsxoeiz += CodedOutputStream.cllcsxoeiz(cqumvgiudrVar.getInt(i13));
                i13++;
            }
        } else {
            iCllcsxoeiz = 0;
            while (i13 < size) {
                iCllcsxoeiz += CodedOutputStream.cllcsxoeiz(((Integer) list.get(i13)).intValue());
                i13++;
            }
        }
        return iCllcsxoeiz;
    }

    public static void jhduphickx(int i13, List list, zfvoamnweg zfvoamnwegVar) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zfvoamnwegVar.writeStringList(i13, list);
    }

    public static void jlmebxxoox(int i13, List list, zfvoamnweg zfvoamnwegVar, boolean z13) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zfvoamnwegVar.writeSFixed64List(i13, list, z13);
    }

    public static metgxyhuhe jpowsppfya() {
        return f23987wkgbmnqykc;
    }

    static int jyumaefscl(int i13, List list, boolean z13) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iIwizpuwonk = iwizpuwonk(list);
        return z13 ? CodedOutputStream.jpowsppfya(i13) + CodedOutputStream.cqumvgiudr(iIwizpuwonk) : iIwizpuwonk + (size * CodedOutputStream.jpowsppfya(i13));
    }

    static int kcexrzcfyt(int i13, List list, boolean z13) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iZdlpuopuiu = zdlpuopuiu(list);
        return z13 ? CodedOutputStream.jpowsppfya(i13) + CodedOutputStream.cqumvgiudr(iZdlpuopuiu) : iZdlpuopuiu + (size * CodedOutputStream.jpowsppfya(i13));
    }

    public static void kegysxyocb(int i13, List list, zfvoamnweg zfvoamnwegVar, boolean z13) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zfvoamnwegVar.writeFixed64List(i13, list, z13);
    }

    static Object lereixgezr(Object obj, int i13, List list, esjtqupxsv.ppxfxbqfkf ppxfxbqfkfVar, Object obj2, metgxyhuhe metgxyhuheVar) {
        if (ppxfxbqfkfVar == null) {
            return obj2;
        }
        if (list instanceof RandomAccess) {
            int size = list.size();
            int i14 = 0;
            for (int i15 = 0; i15 < size; i15++) {
                Integer num = (Integer) list.get(i15);
                int iIntValue = num.intValue();
                if (ppxfxbqfkfVar.isInRange(iIntValue)) {
                    if (i15 != i14) {
                        list.set(i14, num);
                    }
                    i14++;
                } else {
                    obj2 = hcddaimhww(obj, i13, iIntValue, obj2, metgxyhuheVar);
                }
            }
            if (i14 != size) {
                list.subList(i14, size).clear();
            }
        } else {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                int iIntValue2 = ((Integer) it.next()).intValue();
                if (!ppxfxbqfkfVar.isInRange(iIntValue2)) {
                    obj2 = hcddaimhww(obj, i13, iIntValue2, obj2, metgxyhuheVar);
                    it.remove();
                }
            }
        }
        return obj2;
    }

    public static metgxyhuhe lmojexxdyd() {
        return f23988zoijcleaow;
    }

    static int lqeggnwhkg(List list) {
        return list.size() * 4;
    }

    public static void mbcevpiqjq(int i13, List list, zfvoamnweg zfvoamnwegVar, jhduphickx jhduphickxVar) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zfvoamnwegVar.gxszxtbevo(i13, list, jhduphickxVar);
    }

    public static void ntlheqmsrt(int i13, List list, zfvoamnweg zfvoamnwegVar, boolean z13) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zfvoamnwegVar.writeInt32List(i13, list, z13);
    }

    static int nufgyqmvbu(int i13, List list, boolean z13) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return z13 ? CodedOutputStream.jpowsppfya(i13) + CodedOutputStream.cqumvgiudr(size * 8) : size * CodedOutputStream.agtfadlqog(i13, 0L);
    }

    static int ojitshcjhn(int i13, Object obj, jhduphickx jhduphickxVar) {
        return CodedOutputStream.esjtqupxsv(i13, (hkdspvbjdz) obj, jhduphickxVar);
    }

    public static void okpsazkaxt(int i13, List list, zfvoamnweg zfvoamnwegVar, boolean z13) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zfvoamnwegVar.writeUInt64List(i13, list, z13);
    }

    static int oxmwwwfdhm(List list) {
        int iLmojexxdyd;
        int size = list.size();
        int i13 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof cqumvgiudr) {
            cqumvgiudr cqumvgiudrVar = (cqumvgiudr) list;
            iLmojexxdyd = 0;
            while (i13 < size) {
                iLmojexxdyd += CodedOutputStream.lmojexxdyd(cqumvgiudrVar.getInt(i13));
                i13++;
            }
        } else {
            iLmojexxdyd = 0;
            while (i13 < size) {
                iLmojexxdyd += CodedOutputStream.lmojexxdyd(((Integer) list.get(i13)).intValue());
                i13++;
            }
        }
        return iLmojexxdyd;
    }

    static boolean pkzmftpjix(Object obj, Object obj2) {
        return obj == obj2 || (obj != null && obj.equals(obj2));
    }

    private static Class pmvmpeiblj() {
        try {
            return Class.forName("com.google.crypto.tink.shaded.protobuf.GeneratedMessageV3");
        } catch (Throwable unused) {
            return null;
        }
    }

    static int ppxfxbqfkf(int i13, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iJpowsppfya = size * CodedOutputStream.jpowsppfya(i13);
        for (int i14 = 0; i14 < list.size(); i14++) {
            iJpowsppfya += CodedOutputStream.lqeggnwhkg((nufgyqmvbu) list.get(i14));
        }
        return iJpowsppfya;
    }

    static int rgvfuqvkyq(int i13, List list, jhduphickx jhduphickxVar) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iJpowsppfya = CodedOutputStream.jpowsppfya(i13) * size;
        for (int i14 = 0; i14 < size; i14++) {
            iJpowsppfya += CodedOutputStream.lereixgezr((hkdspvbjdz) list.get(i14), jhduphickxVar);
        }
        return iJpowsppfya;
    }

    public static void ribwqtqdhb(int i13, List list, zfvoamnweg zfvoamnwegVar, boolean z13) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zfvoamnwegVar.writeSInt32List(i13, list, z13);
    }

    public static void sopmlzcsov(int i13, List list, zfvoamnweg zfvoamnwegVar, jhduphickx jhduphickxVar) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zfvoamnwegVar.ppxfxbqfkf(i13, list, jhduphickxVar);
    }

    public static void stevsuqkhv(int i13, List list, zfvoamnweg zfvoamnwegVar, boolean z13) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zfvoamnwegVar.writeFixed32List(i13, list, z13);
    }

    public static void tzroggbefp(int i13, List list, zfvoamnweg zfvoamnwegVar, boolean z13) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zfvoamnwegVar.writeFloatList(i13, list, z13);
    }

    public static void ulzqkzuiru(int i13, List list, zfvoamnweg zfvoamnwegVar, boolean z13) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zfvoamnwegVar.writeInt64List(i13, list, z13);
    }

    static int vdvldrhtss(int i13, List list, boolean z13) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iOxmwwwfdhm = oxmwwwfdhm(list);
        return z13 ? CodedOutputStream.jpowsppfya(i13) + CodedOutputStream.cqumvgiudr(iOxmwwwfdhm) : iOxmwwwfdhm + (size * CodedOutputStream.jpowsppfya(i13));
    }

    public static void vipkmwdibw(int i13, List list, zfvoamnweg zfvoamnwegVar, boolean z13) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zfvoamnwegVar.writeSInt64List(i13, list, z13);
    }

    static int wflxmlrfwp(int i13, List list, boolean z13) {
        if (list.size() == 0) {
            return 0;
        }
        int iAgtfadlqog = agtfadlqog(list);
        return z13 ? CodedOutputStream.jpowsppfya(i13) + CodedOutputStream.cqumvgiudr(iAgtfadlqog) : iAgtfadlqog + (list.size() * CodedOutputStream.jpowsppfya(i13));
    }

    static int wkgbmnqykc(int i13, List list, boolean z13) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iEablkybsjg = eablkybsjg(list);
        return z13 ? CodedOutputStream.jpowsppfya(i13) + CodedOutputStream.cqumvgiudr(iEablkybsjg) : iEablkybsjg + (size * CodedOutputStream.jpowsppfya(i13));
    }

    public static metgxyhuhe wwaezpbzkn() {
        return f23986ppxfxbqfkf;
    }

    public static void wypolnanlu(int i13, List list, zfvoamnweg zfvoamnwegVar, boolean z13) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zfvoamnwegVar.writeEnumList(i13, list, z13);
    }

    static void yadqdtsiqt(wwaezpbzkn wwaezpbzknVar, Object obj, Object obj2, long j13) {
        yfnezrywwk.kegysxyocb(obj, j13, wwaezpbzknVar.mergeFrom(yfnezrywwk.istkbnxepw(obj, j13), yfnezrywwk.istkbnxepw(obj2, j13)));
    }

    static int yggfygwlhe(int i13, List list) {
        int size = list.size();
        int i14 = 0;
        if (size == 0) {
            return 0;
        }
        int iJpowsppfya = CodedOutputStream.jpowsppfya(i13) * size;
        if (list instanceof zynmafqrjb) {
            zynmafqrjb zynmafqrjbVar = (zynmafqrjb) list;
            while (i14 < size) {
                Object raw = zynmafqrjbVar.getRaw(i14);
                iJpowsppfya += raw instanceof nufgyqmvbu ? CodedOutputStream.lqeggnwhkg((nufgyqmvbu) raw) : CodedOutputStream.hcddaimhww((String) raw);
                i14++;
            }
        } else {
            while (i14 < size) {
                Object obj = list.get(i14);
                iJpowsppfya += obj instanceof nufgyqmvbu ? CodedOutputStream.lqeggnwhkg((nufgyqmvbu) obj) : CodedOutputStream.hcddaimhww((String) obj);
                i14++;
            }
        }
        return iJpowsppfya;
    }

    public static void ylkuphrtab(Class cls) {
        Class cls2;
        if (!iwizpuwonk.class.isAssignableFrom(cls) && (cls2 = f23985iobyxmoadg) != null && !cls2.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("Message classes must extend GeneratedMessageV3 or GeneratedMessageLite");
        }
    }

    static int zdlpuopuiu(List list) {
        int iYlkuphrtab;
        int size = list.size();
        int i13 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof cdpycssgdh) {
            cdpycssgdh cdpycssgdhVar = (cdpycssgdh) list;
            iYlkuphrtab = 0;
            while (i13 < size) {
                iYlkuphrtab += CodedOutputStream.ylkuphrtab(cdpycssgdhVar.getLong(i13));
                i13++;
            }
        } else {
            iYlkuphrtab = 0;
            while (i13 < size) {
                iYlkuphrtab += CodedOutputStream.ylkuphrtab(((Long) list.get(i13)).longValue());
                i13++;
            }
        }
        return iYlkuphrtab;
    }

    static int zoijcleaow(List list) {
        return list.size();
    }

    private static metgxyhuhe zynmafqrjb(boolean z13) {
        try {
            Class clsIstkbnxepw = istkbnxepw();
            if (clsIstkbnxepw == null) {
                return null;
            }
            return (metgxyhuhe) clsIstkbnxepw.getConstructor(Boolean.TYPE).newInstance(Boolean.valueOf(z13));
        } catch (Throwable unused) {
            return null;
        }
    }
}
