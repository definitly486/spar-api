package t3;

import androidx.media3.common.ParserException;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;

/* JADX INFO: loaded from: classes.dex */
public abstract class jyumaefscl {

    public static final class iobyxmoadg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public long f109478iobyxmoadg;
    }

    public static int btonecajqb(y2.yadqdtsiqt yadqdtsiqtVar, int i13) {
        switch (i13) {
            case 1:
                return 192;
            case 2:
            case 3:
            case 4:
            case 5:
                return 576 << (i13 - 2);
            case 6:
                return yadqdtsiqtVar.wwaezpbzkn() + 1;
            case 7:
                return yadqdtsiqtVar.wypolnanlu() + 1;
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
                return UserVerificationMethods.USER_VERIFY_HANDPRINT << (i13 - 8);
            default:
                return -1;
        }
    }

    public static long dxjokdxxww(vdvldrhtss vdvldrhtssVar, esjtqupxsv esjtqupxsvVar) throws ParserException {
        vdvldrhtssVar.gxszxtbevo();
        vdvldrhtssVar.dxjokdxxww(1);
        byte[] bArr = new byte[1];
        vdvldrhtssVar.ojitshcjhn(bArr, 0, 1);
        boolean z13 = (bArr[0] & 1) == 1;
        vdvldrhtssVar.dxjokdxxww(2);
        int i13 = z13 ? 7 : 6;
        y2.yadqdtsiqt yadqdtsiqtVar = new y2.yadqdtsiqt(i13);
        yadqdtsiqtVar.ulzqkzuiru(kcexrzcfyt.ppxfxbqfkf(vdvldrhtssVar, yadqdtsiqtVar.eablkybsjg(), 0, i13));
        vdvldrhtssVar.gxszxtbevo();
        iobyxmoadg iobyxmoadgVar = new iobyxmoadg();
        if (ppxfxbqfkf(yadqdtsiqtVar, esjtqupxsvVar, z13, iobyxmoadgVar)) {
            return iobyxmoadgVar.f109478iobyxmoadg;
        }
        throw ParserException.iobyxmoadg(null, null);
    }

    private static boolean eablkybsjg(y2.yadqdtsiqt yadqdtsiqtVar, esjtqupxsv esjtqupxsvVar, int i13) {
        int i14 = esjtqupxsvVar.f109420eablkybsjg;
        if (i13 == 0) {
            return true;
        }
        if (i13 <= 11) {
            return i13 == esjtqupxsvVar.f109422gxszxtbevo;
        }
        if (i13 == 12) {
            return yadqdtsiqtVar.wwaezpbzkn() * 1000 == i14;
        }
        if (i13 > 14) {
            return false;
        }
        int iWypolnanlu = yadqdtsiqtVar.wypolnanlu();
        if (i13 == 14) {
            iWypolnanlu *= 10;
        }
        return iWypolnanlu == i14;
    }

    private static boolean gxszxtbevo(int i13, esjtqupxsv esjtqupxsvVar) {
        return i13 == 0 || i13 == esjtqupxsvVar.f109419dxjokdxxww;
    }

    private static boolean iobyxmoadg(y2.yadqdtsiqt yadqdtsiqtVar, esjtqupxsv esjtqupxsvVar, int i13) {
        int iBtonecajqb = btonecajqb(yadqdtsiqtVar, i13);
        return iBtonecajqb != -1 && iBtonecajqb <= esjtqupxsvVar.f109428zoijcleaow;
    }

    private static boolean lqeggnwhkg(int i13, esjtqupxsv esjtqupxsvVar) {
        if (i13 <= 7) {
            return i13 == esjtqupxsvVar.f109424lqeggnwhkg - 1;
        }
        return i13 <= 10 && esjtqupxsvVar.f109424lqeggnwhkg == 2;
    }

    public static boolean nufgyqmvbu(vdvldrhtss vdvldrhtssVar, esjtqupxsv esjtqupxsvVar, int i13, iobyxmoadg iobyxmoadgVar) {
        long jNufgyqmvbu = vdvldrhtssVar.nufgyqmvbu();
        byte[] bArr = new byte[2];
        vdvldrhtssVar.ojitshcjhn(bArr, 0, 2);
        if ((((bArr[0] & 255) << 8) | (bArr[1] & 255)) != i13) {
            vdvldrhtssVar.gxszxtbevo();
            vdvldrhtssVar.dxjokdxxww((int) (jNufgyqmvbu - vdvldrhtssVar.getPosition()));
            return false;
        }
        y2.yadqdtsiqt yadqdtsiqtVar = new y2.yadqdtsiqt(16);
        System.arraycopy(bArr, 0, yadqdtsiqtVar.eablkybsjg(), 0, 2);
        yadqdtsiqtVar.ulzqkzuiru(kcexrzcfyt.ppxfxbqfkf(vdvldrhtssVar, yadqdtsiqtVar.eablkybsjg(), 2, 14));
        vdvldrhtssVar.gxszxtbevo();
        vdvldrhtssVar.dxjokdxxww((int) (jNufgyqmvbu - vdvldrhtssVar.getPosition()));
        return wkgbmnqykc(yadqdtsiqtVar, esjtqupxsvVar, i13, iobyxmoadgVar);
    }

    private static boolean ppxfxbqfkf(y2.yadqdtsiqt yadqdtsiqtVar, esjtqupxsv esjtqupxsvVar, boolean z13, iobyxmoadg iobyxmoadgVar) {
        try {
            long jStevsuqkhv = yadqdtsiqtVar.stevsuqkhv();
            if (!z13) {
                jStevsuqkhv *= (long) esjtqupxsvVar.f109428zoijcleaow;
            }
            iobyxmoadgVar.f109478iobyxmoadg = jStevsuqkhv;
            return true;
        } catch (NumberFormatException unused) {
            return false;
        }
    }

    public static boolean wkgbmnqykc(y2.yadqdtsiqt yadqdtsiqtVar, esjtqupxsv esjtqupxsvVar, int i13, iobyxmoadg iobyxmoadgVar) {
        int iGxszxtbevo = yadqdtsiqtVar.gxszxtbevo();
        long jPkzmftpjix = yadqdtsiqtVar.pkzmftpjix();
        long j13 = jPkzmftpjix >>> 16;
        if (j13 != i13) {
            return false;
        }
        return lqeggnwhkg((int) ((jPkzmftpjix >> 4) & 15), esjtqupxsvVar) && gxszxtbevo((int) ((jPkzmftpjix >> 1) & 7), esjtqupxsvVar) && !(((jPkzmftpjix & 1) > 1L ? 1 : ((jPkzmftpjix & 1) == 1L ? 0 : -1)) == 0) && ppxfxbqfkf(yadqdtsiqtVar, esjtqupxsvVar, ((j13 & 1) > 1L ? 1 : ((j13 & 1) == 1L ? 0 : -1)) == 0, iobyxmoadgVar) && iobyxmoadg(yadqdtsiqtVar, esjtqupxsvVar, (int) ((jPkzmftpjix >> 12) & 15)) && eablkybsjg(yadqdtsiqtVar, esjtqupxsvVar, (int) ((jPkzmftpjix >> 8) & 15)) && zoijcleaow(yadqdtsiqtVar, iGxszxtbevo);
    }

    private static boolean zoijcleaow(y2.yadqdtsiqt yadqdtsiqtVar, int i13) {
        return yadqdtsiqtVar.wwaezpbzkn() == y2.stevsuqkhv.cqumvgiudr(yadqdtsiqtVar.eablkybsjg(), i13, yadqdtsiqtVar.gxszxtbevo() - 1, 0);
    }
}
