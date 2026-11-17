package androidx.datastore.preferences.protobuf;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
final class rgvfuqvkyq {

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private static final rgvfuqvkyq f8776wkgbmnqykc = new rgvfuqvkyq(true);

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final ribwqtqdhb f8777iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private boolean f8778ppxfxbqfkf;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private boolean f8779zoijcleaow;

    static /* synthetic */ class iobyxmoadg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        static final /* synthetic */ int[] f8780iobyxmoadg;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        static final /* synthetic */ int[] f8781zoijcleaow;

        static {
            int[] iArr = new int[czzsidtyhn.zoijcleaow.values().length];
            f8781zoijcleaow = iArr;
            try {
                iArr[czzsidtyhn.zoijcleaow.f8614jyumaefscl.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f8781zoijcleaow[czzsidtyhn.zoijcleaow.f8612iwizpuwonk.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f8781zoijcleaow[czzsidtyhn.zoijcleaow.f8606cqumvgiudr.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f8781zoijcleaow[czzsidtyhn.zoijcleaow.f8607esjtqupxsv.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f8781zoijcleaow[czzsidtyhn.zoijcleaow.f8615lereixgezr.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f8781zoijcleaow[czzsidtyhn.zoijcleaow.f8618pmvmpeiblj.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f8781zoijcleaow[czzsidtyhn.zoijcleaow.f8622zynmafqrjb.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f8781zoijcleaow[czzsidtyhn.zoijcleaow.f8611istkbnxepw.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f8781zoijcleaow[czzsidtyhn.zoijcleaow.f8620yadqdtsiqt.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f8781zoijcleaow[czzsidtyhn.zoijcleaow.f8610iozdgvuglv.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f8781zoijcleaow[czzsidtyhn.zoijcleaow.f8604cdpycssgdh.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f8781zoijcleaow[czzsidtyhn.zoijcleaow.f8616lmojexxdyd.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f8781zoijcleaow[czzsidtyhn.zoijcleaow.f8619wwaezpbzkn.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                f8781zoijcleaow[czzsidtyhn.zoijcleaow.f8617pkzmftpjix.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                f8781zoijcleaow[czzsidtyhn.zoijcleaow.f8608hcddaimhww.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                f8781zoijcleaow[czzsidtyhn.zoijcleaow.f8613jpowsppfya.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                f8781zoijcleaow[czzsidtyhn.zoijcleaow.f8609hkdspvbjdz.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                f8781zoijcleaow[czzsidtyhn.zoijcleaow.f8621ylkuphrtab.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
            int[] iArr2 = new int[czzsidtyhn.ppxfxbqfkf.values().length];
            f8780iobyxmoadg = iArr2;
            try {
                iArr2[czzsidtyhn.ppxfxbqfkf.INT.ordinal()] = 1;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                f8780iobyxmoadg[czzsidtyhn.ppxfxbqfkf.LONG.ordinal()] = 2;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                f8780iobyxmoadg[czzsidtyhn.ppxfxbqfkf.FLOAT.ordinal()] = 3;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                f8780iobyxmoadg[czzsidtyhn.ppxfxbqfkf.DOUBLE.ordinal()] = 4;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                f8780iobyxmoadg[czzsidtyhn.ppxfxbqfkf.BOOLEAN.ordinal()] = 5;
            } catch (NoSuchFieldError unused23) {
            }
            try {
                f8780iobyxmoadg[czzsidtyhn.ppxfxbqfkf.STRING.ordinal()] = 6;
            } catch (NoSuchFieldError unused24) {
            }
            try {
                f8780iobyxmoadg[czzsidtyhn.ppxfxbqfkf.BYTE_STRING.ordinal()] = 7;
            } catch (NoSuchFieldError unused25) {
            }
            try {
                f8780iobyxmoadg[czzsidtyhn.ppxfxbqfkf.ENUM.ordinal()] = 8;
            } catch (NoSuchFieldError unused26) {
            }
            try {
                f8780iobyxmoadg[czzsidtyhn.ppxfxbqfkf.MESSAGE.ordinal()] = 9;
            } catch (NoSuchFieldError unused27) {
            }
        }
    }

    public interface zoijcleaow extends Comparable {
        czzsidtyhn.zoijcleaow getLiteType();

        int getNumber();

        boolean isPacked();

        boolean isRepeated();
    }

    private rgvfuqvkyq() {
        this.f8777iobyxmoadg = ribwqtqdhb.oxmwwwfdhm(16);
    }

    private static boolean draadjrbmk(Map.Entry entry) {
        androidx.appcompat.app.yggfygwlhe.iobyxmoadg(entry.getKey());
        throw null;
    }

    static int dxjokdxxww(czzsidtyhn.zoijcleaow zoijcleaowVar, boolean z13) {
        if (z13) {
            return 2;
        }
        return zoijcleaowVar.wkgbmnqykc();
    }

    static void jyumaefscl(CodedOutputStream codedOutputStream, czzsidtyhn.zoijcleaow zoijcleaowVar, Object obj) {
        switch (iobyxmoadg.f8781zoijcleaow[zoijcleaowVar.ordinal()]) {
            case 1:
                codedOutputStream.czzsidtyhn(((Double) obj).doubleValue());
                break;
            case 2:
                codedOutputStream.opjhrmiecq(((Float) obj).floatValue());
                break;
            case 3:
                codedOutputStream.uawqvzlxes(((Long) obj).longValue());
                break;
            case 4:
                codedOutputStream.rhgxfdycjh(((Long) obj).longValue());
                break;
            case 5:
                codedOutputStream.tbqsvytpvh(((Integer) obj).intValue());
                break;
            case 6:
                codedOutputStream.oipsdeybqn(((Long) obj).longValue());
                break;
            case 7:
                codedOutputStream.sflfametgt(((Integer) obj).intValue());
                break;
            case 8:
                codedOutputStream.ikoacuggdj(((Boolean) obj).booleanValue());
                break;
            case 9:
                codedOutputStream.lrnfpwlwnk((wwaezpbzkn) obj);
                break;
            case 10:
                codedOutputStream.iwxlajgraz((wwaezpbzkn) obj);
                break;
            case 11:
                if (!(obj instanceof gxszxtbevo)) {
                    codedOutputStream.mhtqkkgtqm((String) obj);
                } else {
                    codedOutputStream.metgxyhuhe((gxszxtbevo) obj);
                }
                break;
            case 12:
                if (!(obj instanceof gxszxtbevo)) {
                    codedOutputStream.okpsazkaxt((byte[]) obj);
                } else {
                    codedOutputStream.metgxyhuhe((gxszxtbevo) obj);
                }
                break;
            case 13:
                codedOutputStream.fmlbqenlif(((Integer) obj).intValue());
                break;
            case 14:
                codedOutputStream.lxfrhoxuzk(((Integer) obj).intValue());
                break;
            case 15:
                codedOutputStream.hszhottldk(((Long) obj).longValue());
                break;
            case 16:
                codedOutputStream.ageimvtcrz(((Integer) obj).intValue());
                break;
            case 17:
                codedOutputStream.ipoelvxyzq(((Long) obj).longValue());
                break;
            case 18:
                codedOutputStream.yfnezrywwk(((Integer) obj).intValue());
                break;
        }
    }

    private int lqeggnwhkg(Map.Entry entry) {
        androidx.appcompat.app.yggfygwlhe.iobyxmoadg(entry.getKey());
        entry.getValue();
        throw null;
    }

    public static rgvfuqvkyq oxmwwwfdhm() {
        return new rgvfuqvkyq();
    }

    static int ppxfxbqfkf(czzsidtyhn.zoijcleaow zoijcleaowVar, Object obj) {
        switch (iobyxmoadg.f8781zoijcleaow[zoijcleaowVar.ordinal()]) {
            case 1:
                return CodedOutputStream.dxjokdxxww(((Double) obj).doubleValue());
            case 2:
                return CodedOutputStream.vdvldrhtss(((Float) obj).floatValue());
            case 3:
                return CodedOutputStream.cqumvgiudr(((Long) obj).longValue());
            case 4:
                return CodedOutputStream.mbcevpiqjq(((Long) obj).longValue());
            case 5:
                return CodedOutputStream.jyumaefscl(((Integer) obj).intValue());
            case 6:
                return CodedOutputStream.ojitshcjhn(((Long) obj).longValue());
            case 7:
                return CodedOutputStream.wflxmlrfwp(((Integer) obj).intValue());
            case 8:
                return CodedOutputStream.wkgbmnqykc(((Boolean) obj).booleanValue());
            case 9:
                return CodedOutputStream.kcexrzcfyt((wwaezpbzkn) obj);
            case 10:
                return CodedOutputStream.pmvmpeiblj((wwaezpbzkn) obj);
            case 11:
                return obj instanceof gxszxtbevo ? CodedOutputStream.lqeggnwhkg((gxszxtbevo) obj) : CodedOutputStream.dsvhmnatus((String) obj);
            case 12:
                return obj instanceof gxszxtbevo ? CodedOutputStream.lqeggnwhkg((gxszxtbevo) obj) : CodedOutputStream.eablkybsjg((byte[]) obj);
            case 13:
                return CodedOutputStream.kegysxyocb(((Integer) obj).intValue());
            case 14:
                return CodedOutputStream.lmojexxdyd(((Integer) obj).intValue());
            case 15:
                return CodedOutputStream.ylkuphrtab(((Long) obj).longValue());
            case 16:
                return CodedOutputStream.hcddaimhww(((Integer) obj).intValue());
            case 17:
                return CodedOutputStream.hkdspvbjdz(((Long) obj).longValue());
            case 18:
                return CodedOutputStream.gtknphoqwx(((Integer) obj).intValue());
            default:
                throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
        }
    }

    private void vdvldrhtss(Map.Entry entry) {
        androidx.appcompat.app.yggfygwlhe.iobyxmoadg(entry.getKey());
        entry.getValue();
        throw null;
    }

    private static boolean wflxmlrfwp(czzsidtyhn.zoijcleaow zoijcleaowVar, Object obj) {
        zdlpuopuiu.iobyxmoadg(obj);
        switch (iobyxmoadg.f8780iobyxmoadg[zoijcleaowVar.iobyxmoadg().ordinal()]) {
            case 1:
                return obj instanceof Integer;
            case 2:
                return obj instanceof Long;
            case 3:
                return obj instanceof Float;
            case 4:
                return obj instanceof Double;
            case 5:
                return obj instanceof Boolean;
            case 6:
                return obj instanceof String;
            case 7:
                return (obj instanceof gxszxtbevo) || (obj instanceof byte[]);
            case 8:
                return obj instanceof Integer;
            case 9:
                return obj instanceof wwaezpbzkn;
            default:
                return false;
        }
    }

    public static int wkgbmnqykc(zoijcleaow zoijcleaowVar, Object obj) {
        czzsidtyhn.zoijcleaow liteType = zoijcleaowVar.getLiteType();
        int number = zoijcleaowVar.getNumber();
        if (!zoijcleaowVar.isRepeated()) {
            return zoijcleaow(liteType, number, obj);
        }
        int iZoijcleaow = 0;
        if (zoijcleaowVar.isPacked()) {
            Iterator it = ((List) obj).iterator();
            while (it.hasNext()) {
                iZoijcleaow += ppxfxbqfkf(liteType, it.next());
            }
            return CodedOutputStream.wypolnanlu(number) + iZoijcleaow + CodedOutputStream.yadqdtsiqt(iZoijcleaow);
        }
        Iterator it2 = ((List) obj).iterator();
        while (it2.hasNext()) {
            iZoijcleaow += zoijcleaow(liteType, number, it2.next());
        }
        return iZoijcleaow;
    }

    static void yggfygwlhe(CodedOutputStream codedOutputStream, czzsidtyhn.zoijcleaow zoijcleaowVar, int i13, Object obj) {
        if (zoijcleaowVar == czzsidtyhn.zoijcleaow.f8620yadqdtsiqt) {
            codedOutputStream.iyctptxqzt(i13, (wwaezpbzkn) obj);
        } else {
            codedOutputStream.ixidwrxhsl(i13, dxjokdxxww(zoijcleaowVar, false));
            jyumaefscl(codedOutputStream, zoijcleaowVar, obj);
        }
    }

    private void zdlpuopuiu(czzsidtyhn.zoijcleaow zoijcleaowVar, Object obj) {
        if (!wflxmlrfwp(zoijcleaowVar, obj)) {
            throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
        }
    }

    static int zoijcleaow(czzsidtyhn.zoijcleaow zoijcleaowVar, int i13, Object obj) {
        int iWypolnanlu = CodedOutputStream.wypolnanlu(i13);
        if (zoijcleaowVar == czzsidtyhn.zoijcleaow.f8620yadqdtsiqt) {
            iWypolnanlu *= 2;
        }
        return iWypolnanlu + ppxfxbqfkf(zoijcleaowVar, obj);
    }

    public Iterator agtfadlqog() {
        return this.f8778ppxfxbqfkf ? new jyumaefscl(this.f8777iobyxmoadg.entrySet().iterator()) : this.f8777iobyxmoadg.entrySet().iterator();
    }

    boolean btonecajqb() {
        return this.f8777iobyxmoadg.isEmpty();
    }

    Iterator eablkybsjg() {
        return this.f8778ppxfxbqfkf ? new jyumaefscl(this.f8777iobyxmoadg.dxjokdxxww().iterator()) : this.f8777iobyxmoadg.dxjokdxxww().iterator();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof rgvfuqvkyq) {
            return this.f8777iobyxmoadg.equals(((rgvfuqvkyq) obj).f8777iobyxmoadg);
        }
        return false;
    }

    public boolean gtknphoqwx() {
        for (int i13 = 0; i13 < this.f8777iobyxmoadg.draadjrbmk(); i13++) {
            if (!draadjrbmk(this.f8777iobyxmoadg.gtknphoqwx(i13))) {
                return false;
            }
        }
        Iterator it = this.f8777iobyxmoadg.agtfadlqog().iterator();
        while (it.hasNext()) {
            if (!draadjrbmk((Map.Entry) it.next())) {
                return false;
            }
        }
        return true;
    }

    public int gxszxtbevo() {
        int iLqeggnwhkg = 0;
        for (int i13 = 0; i13 < this.f8777iobyxmoadg.draadjrbmk(); i13++) {
            iLqeggnwhkg += lqeggnwhkg(this.f8777iobyxmoadg.gtknphoqwx(i13));
        }
        Iterator it = this.f8777iobyxmoadg.agtfadlqog().iterator();
        while (it.hasNext()) {
            iLqeggnwhkg += lqeggnwhkg((Map.Entry) it.next());
        }
        return iLqeggnwhkg;
    }

    public int hashCode() {
        return this.f8777iobyxmoadg.hashCode();
    }

    /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
    public rgvfuqvkyq clone() {
        rgvfuqvkyq rgvfuqvkyqVarOxmwwwfdhm = oxmwwwfdhm();
        for (int i13 = 0; i13 < this.f8777iobyxmoadg.draadjrbmk(); i13++) {
            Map.Entry entryGtknphoqwx = this.f8777iobyxmoadg.gtknphoqwx(i13);
            androidx.appcompat.app.yggfygwlhe.iobyxmoadg(entryGtknphoqwx.getKey());
            rgvfuqvkyqVarOxmwwwfdhm.kcexrzcfyt(null, entryGtknphoqwx.getValue());
        }
        for (Map.Entry entry : this.f8777iobyxmoadg.agtfadlqog()) {
            androidx.appcompat.app.yggfygwlhe.iobyxmoadg(entry.getKey());
            rgvfuqvkyqVarOxmwwwfdhm.kcexrzcfyt(null, entry.getValue());
        }
        rgvfuqvkyqVarOxmwwwfdhm.f8778ppxfxbqfkf = this.f8778ppxfxbqfkf;
        return rgvfuqvkyqVarOxmwwwfdhm;
    }

    public void kcexrzcfyt(zoijcleaow zoijcleaowVar, Object obj) {
        if (!zoijcleaowVar.isRepeated()) {
            zdlpuopuiu(zoijcleaowVar.getLiteType(), obj);
        } else {
            if (!(obj instanceof List)) {
                throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
            }
            ArrayList arrayList = new ArrayList();
            arrayList.addAll((List) obj);
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                zdlpuopuiu(zoijcleaowVar.getLiteType(), it.next());
            }
            obj = arrayList;
        }
        this.f8777iobyxmoadg.kcexrzcfyt(zoijcleaowVar, obj);
    }

    public int nufgyqmvbu() {
        int iWkgbmnqykc = 0;
        for (int i13 = 0; i13 < this.f8777iobyxmoadg.draadjrbmk(); i13++) {
            Map.Entry entryGtknphoqwx = this.f8777iobyxmoadg.gtknphoqwx(i13);
            androidx.appcompat.app.yggfygwlhe.iobyxmoadg(entryGtknphoqwx.getKey());
            iWkgbmnqykc += wkgbmnqykc(null, entryGtknphoqwx.getValue());
        }
        for (Map.Entry entry : this.f8777iobyxmoadg.agtfadlqog()) {
            androidx.appcompat.app.yggfygwlhe.iobyxmoadg(entry.getKey());
            iWkgbmnqykc += wkgbmnqykc(null, entry.getValue());
        }
        return iWkgbmnqykc;
    }

    public void ojitshcjhn() {
        if (this.f8779zoijcleaow) {
            return;
        }
        this.f8777iobyxmoadg.vdvldrhtss();
        this.f8779zoijcleaow = true;
    }

    public void rgvfuqvkyq(rgvfuqvkyq rgvfuqvkyqVar) {
        for (int i13 = 0; i13 < rgvfuqvkyqVar.f8777iobyxmoadg.draadjrbmk(); i13++) {
            vdvldrhtss(rgvfuqvkyqVar.f8777iobyxmoadg.gtknphoqwx(i13));
        }
        Iterator it = rgvfuqvkyqVar.f8777iobyxmoadg.agtfadlqog().iterator();
        while (it.hasNext()) {
            vdvldrhtss((Map.Entry) it.next());
        }
    }

    private rgvfuqvkyq(boolean z13) {
        this(ribwqtqdhb.oxmwwwfdhm(0));
        ojitshcjhn();
    }

    private rgvfuqvkyq(ribwqtqdhb ribwqtqdhbVar) {
        this.f8777iobyxmoadg = ribwqtqdhbVar;
        ojitshcjhn();
    }
}
