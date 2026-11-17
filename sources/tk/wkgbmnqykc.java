package tk;

import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import kotlin.jvm.internal.zdlpuopuiu;
import mj.kcexrzcfyt;
import mk.rgvfuqvkyq;

/* JADX INFO: loaded from: classes3.dex */
public final class wkgbmnqykc {

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private static final String[] f110936eablkybsjg;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    public static final wkgbmnqykc f110937iobyxmoadg = new wkgbmnqykc();

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    public static final bl.gxszxtbevo f110940zoijcleaow = bl.gxszxtbevo.f16674iwizpuwonk.wkgbmnqykc("PRI * HTTP/2.0\r\n\r\nSM\r\n\r\n");

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private static final String[] f110938ppxfxbqfkf = {"DATA", "HEADERS", "PRIORITY", "RST_STREAM", "SETTINGS", "PUSH_PROMISE", "PING", "GOAWAY", "WINDOW_UPDATE", "CONTINUATION"};

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private static final String[] f110939wkgbmnqykc = new String[64];

    static {
        String[] strArr = new String[UserVerificationMethods.USER_VERIFY_HANDPRINT];
        for (int i13 = 0; i13 < 256; i13++) {
            String binaryString = Integer.toBinaryString(i13);
            zdlpuopuiu.dxjokdxxww(binaryString, "toBinaryString(it)");
            strArr[i13] = kcexrzcfyt.pkzmftpjix(rgvfuqvkyq.dxjokdxxww("%8s", binaryString), ' ', '0', false, 4, null);
        }
        f110936eablkybsjg = strArr;
        String[] strArr2 = f110939wkgbmnqykc;
        strArr2[0] = "";
        strArr2[1] = "END_STREAM";
        int[] iArr = {1};
        strArr2[8] = "PADDED";
        int i14 = iArr[0];
        strArr2[i14 | 8] = strArr2[i14] + "|PADDED";
        strArr2[4] = "END_HEADERS";
        strArr2[32] = "PRIORITY";
        strArr2[36] = "END_HEADERS|PRIORITY";
        int[] iArr2 = {4, 32, 36};
        for (int i15 = 0; i15 < 3; i15++) {
            int i16 = iArr2[i15];
            int i17 = iArr[0];
            String[] strArr3 = f110939wkgbmnqykc;
            int i18 = i17 | i16;
            strArr3[i18] = strArr3[i17] + '|' + strArr3[i16];
            strArr3[i18 | 8] = strArr3[i17] + '|' + strArr3[i16] + "|PADDED";
        }
        int length = f110939wkgbmnqykc.length;
        for (int i19 = 0; i19 < length; i19++) {
            String[] strArr4 = f110939wkgbmnqykc;
            if (strArr4[i19] == null) {
                strArr4[i19] = f110936eablkybsjg[i19];
            }
        }
    }

    private wkgbmnqykc() {
    }

    public final String iobyxmoadg(int i13, int i14) {
        String str;
        if (i14 == 0) {
            return "";
        }
        if (i13 != 2 && i13 != 3) {
            if (i13 == 4 || i13 == 6) {
                return i14 == 1 ? "ACK" : f110936eablkybsjg[i14];
            }
            if (i13 != 7 && i13 != 8) {
                String[] strArr = f110939wkgbmnqykc;
                if (i14 < strArr.length) {
                    str = strArr[i14];
                    zdlpuopuiu.lqeggnwhkg(str);
                } else {
                    str = f110936eablkybsjg[i14];
                }
                String str2 = str;
                if (i13 != 5 || (i14 & 4) == 0) {
                    return (i13 != 0 || (i14 & 32) == 0) ? str2 : kcexrzcfyt.hcddaimhww(str2, "PRIORITY", "COMPRESSED", false, 4, null);
                }
                return kcexrzcfyt.hcddaimhww(str2, "HEADERS", "PUSH_PROMISE", false, 4, null);
            }
        }
        return f110936eablkybsjg[i14];
    }

    public final String ppxfxbqfkf(boolean z13, int i13, int i14, int i15, int i16) {
        return rgvfuqvkyq.dxjokdxxww("%s 0x%08x %5d %-13s %s", z13 ? "<<" : ">>", Integer.valueOf(i13), Integer.valueOf(i14), zoijcleaow(i15), iobyxmoadg(i15, i16));
    }

    public final String wkgbmnqykc(boolean z13, int i13, int i14, long j13) {
        return rgvfuqvkyq.dxjokdxxww("%s 0x%08x %5d %-13s %d", z13 ? "<<" : ">>", Integer.valueOf(i13), Integer.valueOf(i14), zoijcleaow(8), Long.valueOf(j13));
    }

    public final String zoijcleaow(int i13) {
        String[] strArr = f110938ppxfxbqfkf;
        return i13 < strArr.length ? strArr[i13] : rgvfuqvkyq.dxjokdxxww("0x%02x", Integer.valueOf(i13));
    }
}
