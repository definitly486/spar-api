package cl;

import bl.hkdspvbjdz;
import bl.istkbnxepw;
import bl.iwizpuwonk;
import java.io.EOFException;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes3.dex */
public abstract class gxszxtbevo {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private static final byte[] f19978iobyxmoadg = hkdspvbjdz.iobyxmoadg("0123456789abcdef");

    public static /* synthetic */ int eablkybsjg(bl.ppxfxbqfkf ppxfxbqfkfVar, iwizpuwonk iwizpuwonkVar, boolean z13, int i13, Object obj) {
        if ((i13 & 2) != 0) {
            z13 = false;
        }
        return wkgbmnqykc(ppxfxbqfkfVar, iwizpuwonkVar, z13);
    }

    public static final byte[] iobyxmoadg() {
        return f19978iobyxmoadg;
    }

    public static final String ppxfxbqfkf(bl.ppxfxbqfkf ppxfxbqfkfVar, long j13) throws EOFException {
        zdlpuopuiu.btonecajqb(ppxfxbqfkfVar, "<this>");
        if (j13 > 0) {
            long j14 = j13 - 1;
            if (ppxfxbqfkfVar.agtfadlqog(j14) == 13) {
                String strYzdjzghtvl = ppxfxbqfkfVar.yzdjzghtvl(j14);
                ppxfxbqfkfVar.wflxmlrfwp(2L);
                return strYzdjzghtvl;
            }
        }
        String strYzdjzghtvl2 = ppxfxbqfkfVar.yzdjzghtvl(j13);
        ppxfxbqfkfVar.wflxmlrfwp(1L);
        return strYzdjzghtvl2;
    }

    public static final int wkgbmnqykc(bl.ppxfxbqfkf ppxfxbqfkfVar, iwizpuwonk options, boolean z13) {
        int i13;
        int i14;
        istkbnxepw istkbnxepwVar;
        int i15;
        int i16;
        zdlpuopuiu.btonecajqb(ppxfxbqfkfVar, "<this>");
        zdlpuopuiu.btonecajqb(options, "options");
        istkbnxepw istkbnxepwVar2 = ppxfxbqfkfVar.f16740zdlpuopuiu;
        if (istkbnxepwVar2 == null) {
            return z13 ? -2 : -1;
        }
        byte[] bArr = istkbnxepwVar2.f16700iobyxmoadg;
        int i17 = istkbnxepwVar2.f16704zoijcleaow;
        int i18 = istkbnxepwVar2.f16702ppxfxbqfkf;
        int[] iArrOjitshcjhn = options.ojitshcjhn();
        istkbnxepw istkbnxepwVar3 = istkbnxepwVar2;
        int i19 = -1;
        int i23 = 0;
        loop0: while (true) {
            int i24 = i23 + 1;
            int i25 = iArrOjitshcjhn[i23];
            int i26 = i23 + 2;
            int i27 = iArrOjitshcjhn[i24];
            if (i27 != -1) {
                i19 = i27;
            }
            if (istkbnxepwVar3 == null) {
                break;
            }
            if (i25 >= 0) {
                i13 = i17 + 1;
                int i28 = bArr[i17] & 255;
                int i29 = i26 + i25;
                while (i26 != i29) {
                    if (i28 == iArrOjitshcjhn[i26]) {
                        i14 = iArrOjitshcjhn[i26 + i25];
                        if (i13 == i18) {
                            istkbnxepwVar3 = istkbnxepwVar3.f16699gxszxtbevo;
                            zdlpuopuiu.lqeggnwhkg(istkbnxepwVar3);
                            i13 = istkbnxepwVar3.f16704zoijcleaow;
                            bArr = istkbnxepwVar3.f16700iobyxmoadg;
                            i18 = istkbnxepwVar3.f16702ppxfxbqfkf;
                            if (istkbnxepwVar3 == istkbnxepwVar2) {
                                istkbnxepwVar3 = null;
                            }
                        }
                    } else {
                        i26++;
                    }
                }
                return i19;
            }
            int i33 = i26 + (i25 * (-1));
            while (true) {
                int i34 = i17 + 1;
                int i35 = i26 + 1;
                if ((bArr[i17] & 255) != iArrOjitshcjhn[i26]) {
                    return i19;
                }
                boolean z14 = i35 == i33;
                if (i34 == i18) {
                    zdlpuopuiu.lqeggnwhkg(istkbnxepwVar3);
                    istkbnxepw istkbnxepwVar4 = istkbnxepwVar3.f16699gxszxtbevo;
                    zdlpuopuiu.lqeggnwhkg(istkbnxepwVar4);
                    i16 = istkbnxepwVar4.f16704zoijcleaow;
                    byte[] bArr2 = istkbnxepwVar4.f16700iobyxmoadg;
                    i15 = istkbnxepwVar4.f16702ppxfxbqfkf;
                    if (istkbnxepwVar4 != istkbnxepwVar2) {
                        istkbnxepwVar = istkbnxepwVar4;
                        bArr = bArr2;
                    } else {
                        if (!z14) {
                            break loop0;
                        }
                        bArr = bArr2;
                        istkbnxepwVar = null;
                    }
                } else {
                    istkbnxepwVar = istkbnxepwVar3;
                    i15 = i18;
                    i16 = i34;
                }
                if (z14) {
                    i14 = iArrOjitshcjhn[i35];
                    i13 = i16;
                    i18 = i15;
                    istkbnxepwVar3 = istkbnxepwVar;
                    break;
                }
                i17 = i16;
                i18 = i15;
                istkbnxepwVar3 = istkbnxepwVar;
                i26 = i35;
            }
            if (i14 >= 0) {
                return i14;
            }
            i23 = -i14;
            i17 = i13;
        }
        if (z13) {
            return -2;
        }
        return i19;
    }

    public static final boolean zoijcleaow(istkbnxepw segment, int i13, byte[] bytes, int i14, int i15) {
        zdlpuopuiu.btonecajqb(segment, "segment");
        zdlpuopuiu.btonecajqb(bytes, "bytes");
        int i16 = segment.f16702ppxfxbqfkf;
        byte[] bArr = segment.f16700iobyxmoadg;
        while (i14 < i15) {
            if (i13 == i16) {
                segment = segment.f16699gxszxtbevo;
                zdlpuopuiu.lqeggnwhkg(segment);
                byte[] bArr2 = segment.f16700iobyxmoadg;
                bArr = bArr2;
                i13 = segment.f16704zoijcleaow;
                i16 = segment.f16702ppxfxbqfkf;
            }
            if (bArr[i13] != bytes[i14]) {
                return false;
            }
            i13++;
            i14++;
        }
        return true;
    }
}
