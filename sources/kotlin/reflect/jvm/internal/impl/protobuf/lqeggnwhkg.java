package kotlin.reflect.jvm.internal.impl.protobuf;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
final class lqeggnwhkg {

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private static final lqeggnwhkg f60123wkgbmnqykc = new lqeggnwhkg(true);

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private boolean f60126zoijcleaow;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private boolean f60125ppxfxbqfkf = false;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final kcexrzcfyt f60124iobyxmoadg = kcexrzcfyt.ojitshcjhn(16);

    static /* synthetic */ class iobyxmoadg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        static final /* synthetic */ int[] f60127iobyxmoadg;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        static final /* synthetic */ int[] f60128zoijcleaow;

        static {
            int[] iArr = new int[jyumaefscl.zoijcleaow.values().length];
            f60128zoijcleaow = iArr;
            try {
                iArr[jyumaefscl.zoijcleaow.f60097jyumaefscl.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f60128zoijcleaow[jyumaefscl.zoijcleaow.f60095iwizpuwonk.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f60128zoijcleaow[jyumaefscl.zoijcleaow.f60089cqumvgiudr.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f60128zoijcleaow[jyumaefscl.zoijcleaow.f60090esjtqupxsv.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f60128zoijcleaow[jyumaefscl.zoijcleaow.f60098lereixgezr.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f60128zoijcleaow[jyumaefscl.zoijcleaow.f60101pmvmpeiblj.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f60128zoijcleaow[jyumaefscl.zoijcleaow.f60105zynmafqrjb.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f60128zoijcleaow[jyumaefscl.zoijcleaow.f60094istkbnxepw.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f60128zoijcleaow[jyumaefscl.zoijcleaow.f60087cdpycssgdh.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f60128zoijcleaow[jyumaefscl.zoijcleaow.f60099lmojexxdyd.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f60128zoijcleaow[jyumaefscl.zoijcleaow.f60102wwaezpbzkn.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f60128zoijcleaow[jyumaefscl.zoijcleaow.f60100pkzmftpjix.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f60128zoijcleaow[jyumaefscl.zoijcleaow.f60091hcddaimhww.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                f60128zoijcleaow[jyumaefscl.zoijcleaow.f60096jpowsppfya.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                f60128zoijcleaow[jyumaefscl.zoijcleaow.f60092hkdspvbjdz.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                f60128zoijcleaow[jyumaefscl.zoijcleaow.f60103yadqdtsiqt.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                f60128zoijcleaow[jyumaefscl.zoijcleaow.f60093iozdgvuglv.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                f60128zoijcleaow[jyumaefscl.zoijcleaow.f60104ylkuphrtab.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
            int[] iArr2 = new int[jyumaefscl.ppxfxbqfkf.values().length];
            f60127iobyxmoadg = iArr2;
            try {
                iArr2[jyumaefscl.ppxfxbqfkf.INT.ordinal()] = 1;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                f60127iobyxmoadg[jyumaefscl.ppxfxbqfkf.LONG.ordinal()] = 2;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                f60127iobyxmoadg[jyumaefscl.ppxfxbqfkf.FLOAT.ordinal()] = 3;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                f60127iobyxmoadg[jyumaefscl.ppxfxbqfkf.DOUBLE.ordinal()] = 4;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                f60127iobyxmoadg[jyumaefscl.ppxfxbqfkf.BOOLEAN.ordinal()] = 5;
            } catch (NoSuchFieldError unused23) {
            }
            try {
                f60127iobyxmoadg[jyumaefscl.ppxfxbqfkf.STRING.ordinal()] = 6;
            } catch (NoSuchFieldError unused24) {
            }
            try {
                f60127iobyxmoadg[jyumaefscl.ppxfxbqfkf.BYTE_STRING.ordinal()] = 7;
            } catch (NoSuchFieldError unused25) {
            }
            try {
                f60127iobyxmoadg[jyumaefscl.ppxfxbqfkf.ENUM.ordinal()] = 8;
            } catch (NoSuchFieldError unused26) {
            }
            try {
                f60127iobyxmoadg[jyumaefscl.ppxfxbqfkf.MESSAGE.ordinal()] = 9;
            } catch (NoSuchFieldError unused27) {
            }
        }
    }

    public interface zoijcleaow extends Comparable {
        jyumaefscl.ppxfxbqfkf getLiteJavaType();

        jyumaefscl.zoijcleaow getLiteType();

        int getNumber();

        boolean isPacked();

        boolean isRepeated();

        agtfadlqog.iobyxmoadg yggfygwlhe(agtfadlqog.iobyxmoadg iobyxmoadgVar, agtfadlqog agtfadlqogVar);
    }

    private lqeggnwhkg() {
    }

    private static void cqumvgiudr(CodedOutputStream codedOutputStream, jyumaefscl.zoijcleaow zoijcleaowVar, int i13, Object obj) throws IOException {
        if (zoijcleaowVar == jyumaefscl.zoijcleaow.f60103yadqdtsiqt) {
            codedOutputStream.crxdokpmqz(i13, (agtfadlqog) obj);
        } else {
            codedOutputStream.nuxfzjnpeb(i13, draadjrbmk(zoijcleaowVar, false));
            esjtqupxsv(codedOutputStream, zoijcleaowVar, obj);
        }
    }

    static int draadjrbmk(jyumaefscl.zoijcleaow zoijcleaowVar, boolean z13) {
        if (z13) {
            return 2;
        }
        return zoijcleaowVar.wkgbmnqykc();
    }

    private static int eablkybsjg(jyumaefscl.zoijcleaow zoijcleaowVar, Object obj) {
        switch (iobyxmoadg.f60128zoijcleaow[zoijcleaowVar.ordinal()]) {
            case 1:
                return CodedOutputStream.lqeggnwhkg(((Double) obj).doubleValue());
            case 2:
                return CodedOutputStream.wflxmlrfwp(((Float) obj).floatValue());
            case 3:
                return CodedOutputStream.vdvldrhtss(((Long) obj).longValue());
            case 4:
                return CodedOutputStream.yadqdtsiqt(((Long) obj).longValue());
            case 5:
                return CodedOutputStream.rgvfuqvkyq(((Integer) obj).intValue());
            case 6:
                return CodedOutputStream.gtknphoqwx(((Long) obj).longValue());
            case 7:
                return CodedOutputStream.btonecajqb(((Integer) obj).intValue());
            case 8:
                return CodedOutputStream.zoijcleaow(((Boolean) obj).booleanValue());
            case 9:
                return CodedOutputStream.zynmafqrjb((String) obj);
            case 10:
                return obj instanceof wkgbmnqykc ? CodedOutputStream.eablkybsjg((wkgbmnqykc) obj) : CodedOutputStream.ppxfxbqfkf((byte[]) obj);
            case 11:
                return CodedOutputStream.cdpycssgdh(((Integer) obj).intValue());
            case 12:
                return CodedOutputStream.iwizpuwonk(((Integer) obj).intValue());
            case 13:
                return CodedOutputStream.cqumvgiudr(((Long) obj).longValue());
            case 14:
                return CodedOutputStream.esjtqupxsv(((Integer) obj).intValue());
            case 15:
                return CodedOutputStream.pmvmpeiblj(((Long) obj).longValue());
            case 16:
                return CodedOutputStream.agtfadlqog((agtfadlqog) obj);
            case 17:
                return CodedOutputStream.kcexrzcfyt((agtfadlqog) obj);
            case 18:
                return obj instanceof dxjokdxxww.iobyxmoadg ? CodedOutputStream.dxjokdxxww(((dxjokdxxww.iobyxmoadg) obj).getNumber()) : CodedOutputStream.dxjokdxxww(((Integer) obj).intValue());
            default:
                throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
        }
    }

    private static void esjtqupxsv(CodedOutputStream codedOutputStream, jyumaefscl.zoijcleaow zoijcleaowVar, Object obj) throws IOException {
        switch (iobyxmoadg.f60128zoijcleaow[zoijcleaowVar.ordinal()]) {
            case 1:
                codedOutputStream.stevsuqkhv(((Double) obj).doubleValue());
                break;
            case 2:
                codedOutputStream.sopmlzcsov(((Float) obj).floatValue());
                break;
            case 3:
                codedOutputStream.jhduphickx(((Long) obj).longValue());
                break;
            case 4:
                codedOutputStream.uawqvzlxes(((Long) obj).longValue());
                break;
            case 5:
                codedOutputStream.vipkmwdibw(((Integer) obj).intValue());
                break;
            case 6:
                codedOutputStream.ntlheqmsrt(((Long) obj).longValue());
                break;
            case 7:
                codedOutputStream.mbcevpiqjq(((Integer) obj).intValue());
                break;
            case 8:
                codedOutputStream.jpowsppfya(((Boolean) obj).booleanValue());
                break;
            case 9:
                codedOutputStream.zeieaojujs((String) obj);
                break;
            case 10:
                if (!(obj instanceof wkgbmnqykc)) {
                    codedOutputStream.hkdspvbjdz((byte[]) obj);
                } else {
                    codedOutputStream.dsvhmnatus((wkgbmnqykc) obj);
                }
                break;
            case 11:
                codedOutputStream.roivzttewh(((Integer) obj).intValue());
                break;
            case 12:
                codedOutputStream.bfopjjpdmp(((Integer) obj).intValue());
                break;
            case 13:
                codedOutputStream.opjhrmiecq(((Long) obj).longValue());
                break;
            case 14:
                codedOutputStream.iyctptxqzt(((Integer) obj).intValue());
                break;
            case 15:
                codedOutputStream.lrnfpwlwnk(((Long) obj).longValue());
                break;
            case 16:
                codedOutputStream.jlmebxxoox((agtfadlqog) obj);
                break;
            case 17:
                codedOutputStream.okpsazkaxt((agtfadlqog) obj);
                break;
            case 18:
                if (!(obj instanceof dxjokdxxww.iobyxmoadg)) {
                    codedOutputStream.tzroggbefp(((Integer) obj).intValue());
                } else {
                    codedOutputStream.tzroggbefp(((dxjokdxxww.iobyxmoadg) obj).getNumber());
                }
                break;
        }
    }

    public static int gxszxtbevo(zoijcleaow zoijcleaowVar, Object obj) {
        jyumaefscl.zoijcleaow liteType = zoijcleaowVar.getLiteType();
        int number = zoijcleaowVar.getNumber();
        if (!zoijcleaowVar.isRepeated()) {
            return wkgbmnqykc(liteType, number, obj);
        }
        int iWkgbmnqykc = 0;
        if (zoijcleaowVar.isPacked()) {
            Iterator it = ((List) obj).iterator();
            while (it.hasNext()) {
                iWkgbmnqykc += eablkybsjg(liteType, it.next());
            }
            return CodedOutputStream.istkbnxepw(number) + iWkgbmnqykc + CodedOutputStream.yggfygwlhe(iWkgbmnqykc);
        }
        Iterator it2 = ((List) obj).iterator();
        while (it2.hasNext()) {
            iWkgbmnqykc += wkgbmnqykc(liteType, number, it2.next());
        }
        return iWkgbmnqykc;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0021  */
    private static void iwizpuwonk(jyumaefscl.zoijcleaow zoijcleaowVar, Object obj) {
        obj.getClass();
        boolean z13 = true;
        boolean z14 = false;
        switch (iobyxmoadg.f60127iobyxmoadg[zoijcleaowVar.iobyxmoadg().ordinal()]) {
            case 1:
                z14 = obj instanceof Integer;
                break;
            case 2:
                z14 = obj instanceof Long;
                break;
            case 3:
                z14 = obj instanceof Float;
                break;
            case 4:
                z14 = obj instanceof Double;
                break;
            case 5:
                z14 = obj instanceof Boolean;
                break;
            case 6:
                z14 = obj instanceof String;
                break;
            case 7:
                if (!(obj instanceof wkgbmnqykc) && !(obj instanceof byte[])) {
                    z13 = false;
                }
                z14 = z13;
                break;
            case 8:
                if (!(obj instanceof Integer) && !(obj instanceof dxjokdxxww.iobyxmoadg)) {
                    z13 = false;
                }
                z14 = z13;
                break;
            case 9:
                z14 = obj instanceof agtfadlqog;
                break;
        }
        if (!z14) {
            throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
        }
    }

    private void kcexrzcfyt(Map.Entry entry) {
        zoijcleaow zoijcleaowVar = (zoijcleaow) entry.getKey();
        Object value = entry.getValue();
        if (zoijcleaowVar.isRepeated()) {
            Object objNufgyqmvbu = nufgyqmvbu(zoijcleaowVar);
            if (objNufgyqmvbu == null) {
                objNufgyqmvbu = new ArrayList();
            }
            Iterator it = ((List) value).iterator();
            while (it.hasNext()) {
                ((List) objNufgyqmvbu).add(ppxfxbqfkf(it.next()));
            }
            this.f60124iobyxmoadg.rgvfuqvkyq(zoijcleaowVar, objNufgyqmvbu);
            return;
        }
        if (zoijcleaowVar.getLiteJavaType() != jyumaefscl.ppxfxbqfkf.MESSAGE) {
            this.f60124iobyxmoadg.rgvfuqvkyq(zoijcleaowVar, ppxfxbqfkf(value));
            return;
        }
        Object objNufgyqmvbu2 = nufgyqmvbu(zoijcleaowVar);
        if (objNufgyqmvbu2 == null) {
            this.f60124iobyxmoadg.rgvfuqvkyq(zoijcleaowVar, ppxfxbqfkf(value));
        } else {
            this.f60124iobyxmoadg.rgvfuqvkyq(zoijcleaowVar, zoijcleaowVar.yggfygwlhe(((agtfadlqog) objNufgyqmvbu2).toBuilder(), (agtfadlqog) value).build());
        }
    }

    public static void lereixgezr(zoijcleaow zoijcleaowVar, Object obj, CodedOutputStream codedOutputStream) throws IOException {
        jyumaefscl.zoijcleaow liteType = zoijcleaowVar.getLiteType();
        int number = zoijcleaowVar.getNumber();
        if (!zoijcleaowVar.isRepeated()) {
            cqumvgiudr(codedOutputStream, liteType, number, obj);
            return;
        }
        List list = (List) obj;
        if (!zoijcleaowVar.isPacked()) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                cqumvgiudr(codedOutputStream, liteType, number, it.next());
            }
            return;
        }
        codedOutputStream.nuxfzjnpeb(number, 2);
        Iterator it2 = list.iterator();
        int iEablkybsjg = 0;
        while (it2.hasNext()) {
            iEablkybsjg += eablkybsjg(liteType, it2.next());
        }
        codedOutputStream.zfvoamnweg(iEablkybsjg);
        Iterator it3 = list.iterator();
        while (it3.hasNext()) {
            esjtqupxsv(codedOutputStream, liteType, it3.next());
        }
    }

    public static lqeggnwhkg lqeggnwhkg() {
        return f60123wkgbmnqykc;
    }

    private boolean ojitshcjhn(Map.Entry entry) {
        zoijcleaow zoijcleaowVar = (zoijcleaow) entry.getKey();
        if (zoijcleaowVar.getLiteJavaType() != jyumaefscl.ppxfxbqfkf.MESSAGE) {
            return true;
        }
        if (!zoijcleaowVar.isRepeated()) {
            Object value = entry.getValue();
            if (value instanceof agtfadlqog) {
                return ((agtfadlqog) value).isInitialized();
            }
            throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
        }
        Iterator it = ((List) entry.getValue()).iterator();
        while (it.hasNext()) {
            if (!((agtfadlqog) it.next()).isInitialized()) {
                return false;
            }
        }
        return true;
    }

    private Object ppxfxbqfkf(Object obj) {
        if (!(obj instanceof byte[])) {
            return obj;
        }
        byte[] bArr = (byte[]) obj;
        byte[] bArr2 = new byte[bArr.length];
        System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
        return bArr2;
    }

    private static int wkgbmnqykc(jyumaefscl.zoijcleaow zoijcleaowVar, int i13, Object obj) {
        int iIstkbnxepw = CodedOutputStream.istkbnxepw(i13);
        if (zoijcleaowVar == jyumaefscl.zoijcleaow.f60103yadqdtsiqt) {
            iIstkbnxepw *= 2;
        }
        return iIstkbnxepw + eablkybsjg(zoijcleaowVar, obj);
    }

    public static Object yggfygwlhe(eablkybsjg eablkybsjgVar, jyumaefscl.zoijcleaow zoijcleaowVar, boolean z13) {
        switch (iobyxmoadg.f60128zoijcleaow[zoijcleaowVar.ordinal()]) {
            case 1:
                return Double.valueOf(eablkybsjgVar.draadjrbmk());
            case 2:
                return Float.valueOf(eablkybsjgVar.rgvfuqvkyq());
            case 3:
                return Long.valueOf(eablkybsjgVar.kcexrzcfyt());
            case 4:
                return Long.valueOf(eablkybsjgVar.jpowsppfya());
            case 5:
                return Integer.valueOf(eablkybsjgVar.oxmwwwfdhm());
            case 6:
                return Long.valueOf(eablkybsjgVar.ojitshcjhn());
            case 7:
                return Integer.valueOf(eablkybsjgVar.agtfadlqog());
            case 8:
                return Boolean.valueOf(eablkybsjgVar.btonecajqb());
            case 9:
                return z13 ? eablkybsjgVar.ylkuphrtab() : eablkybsjgVar.wwaezpbzkn();
            case 10:
                return eablkybsjgVar.gtknphoqwx();
            case 11:
                return Integer.valueOf(eablkybsjgVar.hcddaimhww());
            case 12:
                return Integer.valueOf(eablkybsjgVar.cdpycssgdh());
            case 13:
                return Long.valueOf(eablkybsjgVar.yadqdtsiqt());
            case 14:
                return Integer.valueOf(eablkybsjgVar.iozdgvuglv());
            case 15:
                return Long.valueOf(eablkybsjgVar.lmojexxdyd());
            case 16:
                throw new IllegalArgumentException("readPrimitiveField() cannot handle nested groups.");
            case 17:
                throw new IllegalArgumentException("readPrimitiveField() cannot handle embedded messages.");
            case 18:
                throw new IllegalArgumentException("readPrimitiveField() cannot handle enums.");
            default:
                throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
        }
    }

    public static lqeggnwhkg zdlpuopuiu() {
        return new lqeggnwhkg();
    }

    public boolean agtfadlqog() {
        for (int i13 = 0; i13 < this.f60124iobyxmoadg.btonecajqb(); i13++) {
            if (!ojitshcjhn(this.f60124iobyxmoadg.dxjokdxxww(i13))) {
                return false;
            }
        }
        Iterator it = this.f60124iobyxmoadg.gtknphoqwx().iterator();
        while (it.hasNext()) {
            if (!ojitshcjhn((Map.Entry) it.next())) {
                return false;
            }
        }
        return true;
    }

    public int btonecajqb(zoijcleaow zoijcleaowVar) {
        if (!zoijcleaowVar.isRepeated()) {
            throw new IllegalArgumentException("getRepeatedField() can only be called on repeated fields.");
        }
        Object objNufgyqmvbu = nufgyqmvbu(zoijcleaowVar);
        if (objNufgyqmvbu == null) {
            return 0;
        }
        return ((List) objNufgyqmvbu).size();
    }

    public Object dxjokdxxww(zoijcleaow zoijcleaowVar, int i13) {
        if (!zoijcleaowVar.isRepeated()) {
            throw new IllegalArgumentException("getRepeatedField() can only be called on repeated fields.");
        }
        Object objNufgyqmvbu = nufgyqmvbu(zoijcleaowVar);
        if (objNufgyqmvbu != null) {
            return ((List) objNufgyqmvbu).get(i13);
        }
        throw new IndexOutOfBoundsException();
    }

    public int gtknphoqwx() {
        int iGxszxtbevo = 0;
        for (int i13 = 0; i13 < this.f60124iobyxmoadg.btonecajqb(); i13++) {
            Map.Entry entryDxjokdxxww = this.f60124iobyxmoadg.dxjokdxxww(i13);
            iGxszxtbevo += gxszxtbevo((zoijcleaow) entryDxjokdxxww.getKey(), entryDxjokdxxww.getValue());
        }
        for (Map.Entry entry : this.f60124iobyxmoadg.gtknphoqwx()) {
            iGxszxtbevo += gxszxtbevo((zoijcleaow) entry.getKey(), entry.getValue());
        }
        return iGxszxtbevo;
    }

    public void iobyxmoadg(zoijcleaow zoijcleaowVar, Object obj) {
        List arrayList;
        if (!zoijcleaowVar.isRepeated()) {
            throw new IllegalArgumentException("addRepeatedField() can only be called on repeated fields.");
        }
        iwizpuwonk(zoijcleaowVar.getLiteType(), obj);
        Object objNufgyqmvbu = nufgyqmvbu(zoijcleaowVar);
        if (objNufgyqmvbu == null) {
            arrayList = new ArrayList();
            this.f60124iobyxmoadg.rgvfuqvkyq(zoijcleaowVar, arrayList);
        } else {
            arrayList = (List) objNufgyqmvbu;
        }
        arrayList.add(obj);
    }

    public void jyumaefscl(zoijcleaow zoijcleaowVar, Object obj) {
        if (!zoijcleaowVar.isRepeated()) {
            iwizpuwonk(zoijcleaowVar.getLiteType(), obj);
        } else {
            if (!(obj instanceof List)) {
                throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
            }
            ArrayList arrayList = new ArrayList();
            arrayList.addAll((List) obj);
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                iwizpuwonk(zoijcleaowVar.getLiteType(), it.next());
            }
            obj = arrayList;
        }
        this.f60124iobyxmoadg.rgvfuqvkyq(zoijcleaowVar, obj);
    }

    public Object nufgyqmvbu(zoijcleaow zoijcleaowVar) {
        return this.f60124iobyxmoadg.get(zoijcleaowVar);
    }

    public void oxmwwwfdhm(lqeggnwhkg lqeggnwhkgVar) {
        for (int i13 = 0; i13 < lqeggnwhkgVar.f60124iobyxmoadg.btonecajqb(); i13++) {
            kcexrzcfyt(lqeggnwhkgVar.f60124iobyxmoadg.dxjokdxxww(i13));
        }
        Iterator it = lqeggnwhkgVar.f60124iobyxmoadg.gtknphoqwx().iterator();
        while (it.hasNext()) {
            kcexrzcfyt((Map.Entry) it.next());
        }
    }

    public Iterator rgvfuqvkyq() {
        return this.f60125ppxfxbqfkf ? new btonecajqb(this.f60124iobyxmoadg.entrySet().iterator()) : this.f60124iobyxmoadg.entrySet().iterator();
    }

    public void vdvldrhtss() {
        if (this.f60126zoijcleaow) {
            return;
        }
        this.f60124iobyxmoadg.agtfadlqog();
        this.f60126zoijcleaow = true;
    }

    public boolean wflxmlrfwp(zoijcleaow zoijcleaowVar) {
        if (zoijcleaowVar.isRepeated()) {
            throw new IllegalArgumentException("hasField() can only be called on non-repeated fields.");
        }
        return this.f60124iobyxmoadg.get(zoijcleaowVar) != null;
    }

    /* JADX INFO: renamed from: zoijcleaow, reason: merged with bridge method [inline-methods] */
    public lqeggnwhkg clone() {
        lqeggnwhkg lqeggnwhkgVarZdlpuopuiu = zdlpuopuiu();
        for (int i13 = 0; i13 < this.f60124iobyxmoadg.btonecajqb(); i13++) {
            Map.Entry entryDxjokdxxww = this.f60124iobyxmoadg.dxjokdxxww(i13);
            lqeggnwhkgVarZdlpuopuiu.jyumaefscl((zoijcleaow) entryDxjokdxxww.getKey(), entryDxjokdxxww.getValue());
        }
        for (Map.Entry entry : this.f60124iobyxmoadg.gtknphoqwx()) {
            lqeggnwhkgVarZdlpuopuiu.jyumaefscl((zoijcleaow) entry.getKey(), entry.getValue());
        }
        lqeggnwhkgVarZdlpuopuiu.f60125ppxfxbqfkf = this.f60125ppxfxbqfkf;
        return lqeggnwhkgVarZdlpuopuiu;
    }

    private lqeggnwhkg(boolean z13) {
        vdvldrhtss();
    }
}
