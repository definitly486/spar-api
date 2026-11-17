package bl;

import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import kotlin.KotlinVersion;

/* JADX INFO: loaded from: classes3.dex */
public abstract class cllcsxoeiz {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private static final ppxfxbqfkf.iobyxmoadg f16660iobyxmoadg = new ppxfxbqfkf.iobyxmoadg();

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private static final int f16661zoijcleaow = -1234567890;

    public static final String btonecajqb(int i13) {
        int i14 = 0;
        if (i13 == 0) {
            return CommonUrlParts.Values.FALSE_INTEGER;
        }
        char[] cArr = {cl.lqeggnwhkg.gxszxtbevo()[(i13 >> 28) & 15], cl.lqeggnwhkg.gxszxtbevo()[(i13 >> 24) & 15], cl.lqeggnwhkg.gxszxtbevo()[(i13 >> 20) & 15], cl.lqeggnwhkg.gxszxtbevo()[(i13 >> 16) & 15], cl.lqeggnwhkg.gxszxtbevo()[(i13 >> 12) & 15], cl.lqeggnwhkg.gxszxtbevo()[(i13 >> 8) & 15], cl.lqeggnwhkg.gxszxtbevo()[(i13 >> 4) & 15], cl.lqeggnwhkg.gxszxtbevo()[i13 & 15]};
        while (i14 < 8 && cArr[i14] == '0') {
            i14++;
        }
        return mj.kcexrzcfyt.jyumaefscl(cArr, i14, 8);
    }

    public static final String dxjokdxxww(byte b13) {
        return mj.kcexrzcfyt.yggfygwlhe(new char[]{cl.lqeggnwhkg.gxszxtbevo()[(b13 >> 4) & 15], cl.lqeggnwhkg.gxszxtbevo()[b13 & 15]});
    }

    public static final int eablkybsjg(byte[] bArr, int i13) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(bArr, "<this>");
        return i13 == f16661zoijcleaow ? bArr.length : i13;
    }

    public static final int gxszxtbevo(int i13) {
        return ((i13 & KotlinVersion.MAX_COMPONENT_VALUE) << 24) | (((-16777216) & i13) >>> 24) | ((16711680 & i13) >>> 8) | ((65280 & i13) << 8);
    }

    public static final boolean iobyxmoadg(byte[] a13, int i13, byte[] b13, int i14, int i15) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(a13, "a");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(b13, "b");
        for (int i16 = 0; i16 < i15; i16++) {
            if (a13[i16 + i13] != b13[i16 + i14]) {
                return false;
            }
        }
        return true;
    }

    public static final long lqeggnwhkg(long j13) {
        return ((j13 & 255) << 56) | (((-72057594037927936L) & j13) >>> 56) | ((71776119061217280L & j13) >>> 40) | ((280375465082880L & j13) >>> 24) | ((1095216660480L & j13) >>> 8) | ((4278190080L & j13) << 8) | ((16711680 & j13) << 24) | ((65280 & j13) << 40);
    }

    public static final short nufgyqmvbu(short s13) {
        return (short) (((s13 & 255) << 8) | ((65280 & s13) >>> 8));
    }

    public static final int ppxfxbqfkf() {
        return f16661zoijcleaow;
    }

    public static final int wkgbmnqykc(gxszxtbevo gxszxtbevoVar, int i13) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(gxszxtbevoVar, "<this>");
        return i13 == f16661zoijcleaow ? gxszxtbevoVar.hcddaimhww() : i13;
    }

    public static final void zoijcleaow(long j13, long j14, long j15) {
        if ((j14 | j15) < 0 || j14 > j13 || j13 - j14 < j15) {
            throw new ArrayIndexOutOfBoundsException("size=" + j13 + " offset=" + j14 + " byteCount=" + j15);
        }
    }
}
