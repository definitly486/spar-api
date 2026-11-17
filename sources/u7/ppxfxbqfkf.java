package u7;

import bl.gxszxtbevo;
import bl.iwizpuwonk;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import java.io.Closeable;
import java.io.IOException;
import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public abstract class ppxfxbqfkf implements Closeable {

    /* JADX INFO: renamed from: lereixgezr, reason: collision with root package name */
    private static final String[] f112879lereixgezr = new String[UserVerificationMethods.USER_VERIFY_PATTERN];

    /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
    boolean f112880cqumvgiudr;

    /* JADX INFO: renamed from: esjtqupxsv, reason: collision with root package name */
    boolean f112881esjtqupxsv;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    int f112885zdlpuopuiu;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    int[] f112884yggfygwlhe = new int[32];

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
    String[] f112883jyumaefscl = new String[32];

    /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
    int[] f112882iwizpuwonk = new int[32];

    public static final class iobyxmoadg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        final String[] f112886iobyxmoadg;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        final iwizpuwonk f112887zoijcleaow;

        private iobyxmoadg(String[] strArr, iwizpuwonk iwizpuwonkVar) {
            this.f112886iobyxmoadg = strArr;
            this.f112887zoijcleaow = iwizpuwonkVar;
        }

        public static iobyxmoadg iobyxmoadg(String... strArr) {
            try {
                gxszxtbevo[] gxszxtbevoVarArr = new gxszxtbevo[strArr.length];
                bl.ppxfxbqfkf ppxfxbqfkfVar = new bl.ppxfxbqfkf();
                for (int i13 = 0; i13 < strArr.length; i13++) {
                    ppxfxbqfkf.zynmafqrjb(ppxfxbqfkfVar, strArr[i13]);
                    ppxfxbqfkfVar.readByte();
                    gxszxtbevoVarArr[i13] = ppxfxbqfkfVar.cqumvgiudr();
                }
                return new iobyxmoadg((String[]) strArr.clone(), iwizpuwonk.kcexrzcfyt(gxszxtbevoVarArr));
            } catch (IOException e13) {
                throw new AssertionError(e13);
            }
        }
    }

    public enum zoijcleaow {
        BEGIN_ARRAY,
        END_ARRAY,
        BEGIN_OBJECT,
        END_OBJECT,
        NAME,
        STRING,
        NUMBER,
        BOOLEAN,
        NULL,
        END_DOCUMENT
    }

    static {
        for (int i13 = 0; i13 <= 31; i13++) {
            f112879lereixgezr[i13] = String.format("\\u%04x", Integer.valueOf(i13));
        }
        String[] strArr = f112879lereixgezr;
        strArr[34] = "\\\"";
        strArr[92] = "\\\\";
        strArr[9] = "\\t";
        strArr[8] = "\\b";
        strArr[10] = "\\n";
        strArr[13] = "\\r";
        strArr[12] = "\\f";
    }

    ppxfxbqfkf() {
    }

    public static ppxfxbqfkf kcexrzcfyt(bl.eablkybsjg eablkybsjgVar) {
        return new eablkybsjg(eablkybsjgVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:16:0x002b  */
    public static void zynmafqrjb(bl.wkgbmnqykc wkgbmnqykcVar, String str) {
        String str2;
        String[] strArr = f112879lereixgezr;
        wkgbmnqykcVar.o(34);
        int length = str.length();
        int i13 = 0;
        for (int i14 = 0; i14 < length; i14++) {
            char cCharAt = str.charAt(i14);
            if (cCharAt < 128) {
                str2 = strArr[cCharAt];
                if (str2 != null) {
                    if (i13 < i14) {
                        wkgbmnqykcVar.sflfametgt(str, i13, i14);
                    }
                    wkgbmnqykcVar.metgxyhuhe(str2);
                    i13 = i14 + 1;
                }
            } else {
                if (cCharAt == 8232) {
                    str2 = "\\u2028";
                } else if (cCharAt == 8233) {
                    str2 = "\\u2029";
                }
                if (i13 < i14) {
                    wkgbmnqykcVar.sflfametgt(str, i13, i14);
                }
                wkgbmnqykcVar.metgxyhuhe(str2);
                i13 = i14 + 1;
            }
        }
        if (i13 < length) {
            wkgbmnqykcVar.sflfametgt(str, i13, length);
        }
        wkgbmnqykcVar.o(34);
    }

    public abstract double agtfadlqog();

    public abstract boolean btonecajqb();

    public abstract int cqumvgiudr(iobyxmoadg iobyxmoadgVar);

    public abstract boolean draadjrbmk();

    public abstract void dxjokdxxww();

    public final String gxszxtbevo() {
        return wkgbmnqykc.iobyxmoadg(this.f112885zdlpuopuiu, this.f112884yggfygwlhe, this.f112883jyumaefscl, this.f112882iwizpuwonk);
    }

    final u7.zoijcleaow istkbnxepw(String str) throws u7.zoijcleaow {
        throw new u7.zoijcleaow(str + " at path " + gxszxtbevo());
    }

    final void jyumaefscl(int i13) {
        int i14 = this.f112885zdlpuopuiu;
        int[] iArr = this.f112884yggfygwlhe;
        if (i14 == iArr.length) {
            if (i14 == 256) {
                throw new u7.iobyxmoadg("Nesting too deep at " + gxszxtbevo());
            }
            this.f112884yggfygwlhe = Arrays.copyOf(iArr, iArr.length * 2);
            String[] strArr = this.f112883jyumaefscl;
            this.f112883jyumaefscl = (String[]) Arrays.copyOf(strArr, strArr.length * 2);
            int[] iArr2 = this.f112882iwizpuwonk;
            this.f112882iwizpuwonk = Arrays.copyOf(iArr2, iArr2.length * 2);
        }
        int[] iArr3 = this.f112884yggfygwlhe;
        int i15 = this.f112885zdlpuopuiu;
        this.f112885zdlpuopuiu = i15 + 1;
        iArr3[i15] = i13;
    }

    public abstract void lereixgezr();

    public abstract void lqeggnwhkg();

    public abstract void nufgyqmvbu();

    public abstract int ojitshcjhn();

    public abstract void pmvmpeiblj();

    public abstract String rgvfuqvkyq();

    public abstract String vdvldrhtss();

    public abstract void wkgbmnqykc();

    public abstract zoijcleaow zdlpuopuiu();
}
