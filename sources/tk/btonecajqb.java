package tk;

import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import hg.agtfadlqog;
import io.appmetrica.analytics.BuildConfig;
import kotlin.KotlinVersion;
import kotlin.jvm.internal.zdlpuopuiu;
import mk.wflxmlrfwp;

/* JADX INFO: loaded from: classes3.dex */
public final class btonecajqb {

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private static final byte[] f110751ppxfxbqfkf;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    public static final btonecajqb f110750iobyxmoadg = new btonecajqb();

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private static final int[] f110753zoijcleaow = {8184, 8388568, 268435426, 268435427, 268435428, 268435429, 268435430, 268435431, 268435432, 16777194, 1073741820, 268435433, 268435434, 1073741821, 268435435, 268435436, 268435437, 268435438, 268435439, 268435440, 268435441, 268435442, 1073741822, 268435443, 268435444, 268435445, 268435446, 268435447, 268435448, 268435449, 268435450, 268435451, 20, 1016, 1017, 4090, 8185, 21, 248, 2042, 1018, 1019, 249, 2043, 250, 22, 23, 24, 0, 1, 2, 25, 26, 27, 28, 29, 30, 31, 92, 251, 32764, 32, 4091, 1020, 8186, 33, 93, 94, 95, 96, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 252, BuildConfig.API_LEVEL, 253, 8187, 524272, 8188, 16380, 34, 32765, 3, 35, 4, 36, 5, 37, 38, 39, 6, 116, 117, 40, 41, 42, 7, 43, 118, 44, 8, 9, 45, 119, 120, 121, 122, 123, 32766, 2044, 16381, 8189, 268435452, 1048550, 4194258, 1048551, 1048552, 4194259, 4194260, 4194261, 8388569, 4194262, 8388570, 8388571, 8388572, 8388573, 8388574, 16777195, 8388575, 16777196, 16777197, 4194263, 8388576, 16777198, 8388577, 8388578, 8388579, 8388580, 2097116, 4194264, 8388581, 4194265, 8388582, 8388583, 16777199, 4194266, 2097117, 1048553, 4194267, 4194268, 8388584, 8388585, 2097118, 8388586, 4194269, 4194270, 16777200, 2097119, 4194271, 8388587, 8388588, 2097120, 2097121, 4194272, 2097122, 8388589, 4194273, 8388590, 8388591, 1048554, 4194274, 4194275, 4194276, 8388592, 4194277, 4194278, 8388593, 67108832, 67108833, 1048555, 524273, 4194279, 8388594, 4194280, 33554412, 67108834, 67108835, 67108836, 134217694, 134217695, 67108837, 16777201, 33554413, 524274, 2097123, 67108838, 134217696, 134217697, 67108839, 134217698, 16777202, 2097124, 2097125, 67108840, 67108841, 268435453, 134217699, 134217700, 134217701, 1048556, 16777203, 1048557, 2097126, 4194281, 2097127, 2097128, 8388595, 4194282, 4194283, 33554414, 33554415, 16777204, 16777205, 67108842, 8388596, 67108843, 134217702, 67108844, 67108845, 134217703, 134217704, 134217705, 134217706, 134217707, 268435454, 134217708, 134217709, 134217710, 134217711, 134217712, 67108846};

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private static final iobyxmoadg f110752wkgbmnqykc = new iobyxmoadg();

    static {
        byte[] bArr = {13, 23, 28, 28, 28, 28, 28, 28, 28, 24, 30, 28, 28, 30, 28, 28, 28, 28, 28, 28, 28, 28, 30, 28, 28, 28, 28, 28, 28, 28, 28, 28, 6, 10, 10, 12, 13, 6, 8, 11, 10, 10, 8, 11, 8, 6, 6, 6, 5, 5, 5, 6, 6, 6, 6, 6, 6, 6, 7, 8, 15, 6, 12, 10, 13, 6, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 8, 7, 8, 13, 19, 13, 14, 6, 15, 5, 6, 5, 6, 5, 6, 6, 6, 5, 7, 7, 6, 6, 6, 5, 6, 7, 6, 5, 5, 6, 7, 7, 7, 7, 7, 15, 11, 14, 13, 28, 20, 22, 20, 20, 22, 22, 22, 23, 22, 23, 23, 23, 23, 23, 24, 23, 24, 24, 22, 23, 24, 23, 23, 23, 23, 21, 22, 23, 22, 23, 23, 24, 22, 21, 20, 22, 22, 23, 23, 21, 23, 22, 22, 24, 21, 22, 23, 23, 21, 21, 22, 21, 23, 22, 23, 23, 20, 22, 22, 22, 23, 22, 22, 23, 26, 26, 20, 19, 22, 23, 22, 25, 26, 26, 26, 27, 27, 26, 24, 25, 19, 21, 26, 27, 27, 26, 27, 24, 21, 21, 26, 26, 28, 27, 27, 27, 20, 24, 20, 21, 22, 21, 21, 23, 22, 22, 25, 25, 24, 24, 26, 23, 26, 27, 26, 26, 27, 27, 27, 27, 27, 28, 27, 27, 27, 27, 27, 26};
        f110751ppxfxbqfkf = bArr;
        int length = bArr.length;
        for (int i13 = 0; i13 < length; i13++) {
            f110750iobyxmoadg.iobyxmoadg(i13, f110753zoijcleaow[i13], f110751ppxfxbqfkf[i13]);
        }
    }

    private btonecajqb() {
    }

    private final void iobyxmoadg(int i13, int i14, int i15) {
        iobyxmoadg iobyxmoadgVar = new iobyxmoadg(i13, i15);
        iobyxmoadg iobyxmoadgVar2 = f110752wkgbmnqykc;
        while (i15 > 8) {
            i15 -= 8;
            int i16 = (i14 >>> i15) & KotlinVersion.MAX_COMPONENT_VALUE;
            iobyxmoadg[] iobyxmoadgVarArrIobyxmoadg = iobyxmoadgVar2.iobyxmoadg();
            zdlpuopuiu.lqeggnwhkg(iobyxmoadgVarArrIobyxmoadg);
            iobyxmoadg iobyxmoadgVar3 = iobyxmoadgVarArrIobyxmoadg[i16];
            if (iobyxmoadgVar3 == null) {
                iobyxmoadgVar3 = new iobyxmoadg();
                iobyxmoadgVarArrIobyxmoadg[i16] = iobyxmoadgVar3;
            }
            iobyxmoadgVar2 = iobyxmoadgVar3;
        }
        int i17 = 8 - i15;
        int i18 = (i14 << i17) & KotlinVersion.MAX_COMPONENT_VALUE;
        iobyxmoadg[] iobyxmoadgVarArrIobyxmoadg2 = iobyxmoadgVar2.iobyxmoadg();
        zdlpuopuiu.lqeggnwhkg(iobyxmoadgVarArrIobyxmoadg2);
        agtfadlqog.lereixgezr(iobyxmoadgVarArrIobyxmoadg2, iobyxmoadgVar, i18, (1 << i17) + i18);
    }

    public final void ppxfxbqfkf(bl.gxszxtbevo source, bl.wkgbmnqykc sink) {
        zdlpuopuiu.btonecajqb(source, "source");
        zdlpuopuiu.btonecajqb(sink, "sink");
        int iHcddaimhww = source.hcddaimhww();
        long j13 = 0;
        int i13 = 0;
        for (int i14 = 0; i14 < iHcddaimhww; i14++) {
            int iZoijcleaow = wflxmlrfwp.zoijcleaow(source.draadjrbmk(i14), KotlinVersion.MAX_COMPONENT_VALUE);
            int i15 = f110753zoijcleaow[iZoijcleaow];
            byte b13 = f110751ppxfxbqfkf[iZoijcleaow];
            j13 = (j13 << b13) | ((long) i15);
            i13 += b13;
            while (i13 >= 8) {
                i13 -= 8;
                sink.o((int) (j13 >> i13));
            }
        }
        if (i13 > 0) {
            sink.o((int) ((j13 << (8 - i13)) | (255 >>> i13)));
        }
    }

    public final int wkgbmnqykc(bl.gxszxtbevo bytes) {
        zdlpuopuiu.btonecajqb(bytes, "bytes");
        int iHcddaimhww = bytes.hcddaimhww();
        long j13 = 0;
        for (int i13 = 0; i13 < iHcddaimhww; i13++) {
            j13 += (long) f110751ppxfxbqfkf[wflxmlrfwp.zoijcleaow(bytes.draadjrbmk(i13), KotlinVersion.MAX_COMPONENT_VALUE)];
        }
        return (int) ((j13 + ((long) 7)) >> 3);
    }

    public final void zoijcleaow(bl.eablkybsjg source, long j13, bl.wkgbmnqykc sink) {
        zdlpuopuiu.btonecajqb(source, "source");
        zdlpuopuiu.btonecajqb(sink, "sink");
        iobyxmoadg iobyxmoadgVar = f110752wkgbmnqykc;
        int iZoijcleaow = 0;
        int iPpxfxbqfkf = 0;
        for (long j14 = 0; j14 < j13; j14++) {
            iZoijcleaow = (iZoijcleaow << 8) | wflxmlrfwp.zoijcleaow(source.readByte(), KotlinVersion.MAX_COMPONENT_VALUE);
            iPpxfxbqfkf += 8;
            while (iPpxfxbqfkf >= 8) {
                int i13 = (iZoijcleaow >>> (iPpxfxbqfkf - 8)) & KotlinVersion.MAX_COMPONENT_VALUE;
                iobyxmoadg[] iobyxmoadgVarArrIobyxmoadg = iobyxmoadgVar.iobyxmoadg();
                zdlpuopuiu.lqeggnwhkg(iobyxmoadgVarArrIobyxmoadg);
                iobyxmoadgVar = iobyxmoadgVarArrIobyxmoadg[i13];
                zdlpuopuiu.lqeggnwhkg(iobyxmoadgVar);
                if (iobyxmoadgVar.iobyxmoadg() == null) {
                    sink.o(iobyxmoadgVar.zoijcleaow());
                    iPpxfxbqfkf -= iobyxmoadgVar.ppxfxbqfkf();
                    iobyxmoadgVar = f110752wkgbmnqykc;
                } else {
                    iPpxfxbqfkf -= 8;
                }
            }
        }
        while (iPpxfxbqfkf > 0) {
            int i14 = (iZoijcleaow << (8 - iPpxfxbqfkf)) & KotlinVersion.MAX_COMPONENT_VALUE;
            iobyxmoadg[] iobyxmoadgVarArrIobyxmoadg2 = iobyxmoadgVar.iobyxmoadg();
            zdlpuopuiu.lqeggnwhkg(iobyxmoadgVarArrIobyxmoadg2);
            iobyxmoadg iobyxmoadgVar2 = iobyxmoadgVarArrIobyxmoadg2[i14];
            zdlpuopuiu.lqeggnwhkg(iobyxmoadgVar2);
            if (iobyxmoadgVar2.iobyxmoadg() != null || iobyxmoadgVar2.ppxfxbqfkf() > iPpxfxbqfkf) {
                return;
            }
            sink.o(iobyxmoadgVar2.zoijcleaow());
            iPpxfxbqfkf -= iobyxmoadgVar2.ppxfxbqfkf();
            iobyxmoadgVar = f110752wkgbmnqykc;
        }
    }

    private static final class iobyxmoadg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final iobyxmoadg[] f110754iobyxmoadg;

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        private final int f110755ppxfxbqfkf;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final int f110756zoijcleaow;

        public iobyxmoadg() {
            this.f110754iobyxmoadg = new iobyxmoadg[UserVerificationMethods.USER_VERIFY_HANDPRINT];
            this.f110756zoijcleaow = 0;
            this.f110755ppxfxbqfkf = 0;
        }

        public final iobyxmoadg[] iobyxmoadg() {
            return this.f110754iobyxmoadg;
        }

        public final int ppxfxbqfkf() {
            return this.f110755ppxfxbqfkf;
        }

        public final int zoijcleaow() {
            return this.f110756zoijcleaow;
        }

        public iobyxmoadg(int i13, int i14) {
            this.f110754iobyxmoadg = null;
            this.f110756zoijcleaow = i13;
            int i15 = i14 & 7;
            this.f110755ppxfxbqfkf = i15 == 0 ? 8 : i15;
        }
    }
}
