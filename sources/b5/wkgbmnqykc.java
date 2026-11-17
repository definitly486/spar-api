package b5;

import android.util.Pair;
import androidx.media3.common.ParserException;
import t3.vdvldrhtss;
import y2.kcexrzcfyt;
import y2.stevsuqkhv;
import y2.yadqdtsiqt;

/* JADX INFO: loaded from: classes.dex */
abstract class wkgbmnqykc {

    private static final class iobyxmoadg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public final int f15220iobyxmoadg;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        public final long f15221zoijcleaow;

        private iobyxmoadg(int i13, long j13) {
            this.f15220iobyxmoadg = i13;
            this.f15221zoijcleaow = j13;
        }

        public static iobyxmoadg iobyxmoadg(vdvldrhtss vdvldrhtssVar, yadqdtsiqt yadqdtsiqtVar) {
            vdvldrhtssVar.ojitshcjhn(yadqdtsiqtVar.eablkybsjg(), 0, 8);
            yadqdtsiqtVar.sopmlzcsov(0);
            return new iobyxmoadg(yadqdtsiqtVar.vdvldrhtss(), yadqdtsiqtVar.cqumvgiudr());
        }
    }

    public static Pair eablkybsjg(vdvldrhtss vdvldrhtssVar) throws ParserException {
        vdvldrhtssVar.gxszxtbevo();
        iobyxmoadg iobyxmoadgVarWkgbmnqykc = wkgbmnqykc(1684108385, vdvldrhtssVar, new yadqdtsiqt(8));
        vdvldrhtssVar.draadjrbmk(8);
        return Pair.create(Long.valueOf(vdvldrhtssVar.getPosition()), Long.valueOf(iobyxmoadgVarWkgbmnqykc.f15221zoijcleaow));
    }

    public static boolean iobyxmoadg(vdvldrhtss vdvldrhtssVar) {
        yadqdtsiqt yadqdtsiqtVar = new yadqdtsiqt(8);
        int i13 = iobyxmoadg.iobyxmoadg(vdvldrhtssVar, yadqdtsiqtVar).f15220iobyxmoadg;
        if (i13 != 1380533830 && i13 != 1380333108) {
            return false;
        }
        vdvldrhtssVar.ojitshcjhn(yadqdtsiqtVar.eablkybsjg(), 0, 4);
        yadqdtsiqtVar.sopmlzcsov(0);
        int iVdvldrhtss = yadqdtsiqtVar.vdvldrhtss();
        if (iVdvldrhtss == 1463899717) {
            return true;
        }
        kcexrzcfyt.ppxfxbqfkf("WavHeaderReader", "Unsupported form type: " + iVdvldrhtss);
        return false;
    }

    public static long ppxfxbqfkf(vdvldrhtss vdvldrhtssVar) {
        yadqdtsiqt yadqdtsiqtVar = new yadqdtsiqt(8);
        iobyxmoadg iobyxmoadgVarIobyxmoadg = iobyxmoadg.iobyxmoadg(vdvldrhtssVar, yadqdtsiqtVar);
        if (iobyxmoadgVarIobyxmoadg.f15220iobyxmoadg != 1685272116) {
            vdvldrhtssVar.gxszxtbevo();
            return -1L;
        }
        vdvldrhtssVar.dxjokdxxww(8);
        yadqdtsiqtVar.sopmlzcsov(0);
        vdvldrhtssVar.ojitshcjhn(yadqdtsiqtVar.eablkybsjg(), 0, 8);
        long jJyumaefscl = yadqdtsiqtVar.jyumaefscl();
        vdvldrhtssVar.draadjrbmk(((int) iobyxmoadgVarIobyxmoadg.f15221zoijcleaow) + 8);
        return jJyumaefscl;
    }

    private static iobyxmoadg wkgbmnqykc(int i13, vdvldrhtss vdvldrhtssVar, yadqdtsiqt yadqdtsiqtVar) throws ParserException {
        iobyxmoadg iobyxmoadgVarIobyxmoadg = iobyxmoadg.iobyxmoadg(vdvldrhtssVar, yadqdtsiqtVar);
        while (iobyxmoadgVarIobyxmoadg.f15220iobyxmoadg != i13) {
            kcexrzcfyt.nufgyqmvbu("WavHeaderReader", "Ignoring unknown WAV chunk: " + iobyxmoadgVarIobyxmoadg.f15220iobyxmoadg);
            long j13 = iobyxmoadgVarIobyxmoadg.f15221zoijcleaow;
            long j14 = 8 + j13;
            if (j13 % 2 != 0) {
                j14 = 9 + j13;
            }
            if (j14 > 2147483647L) {
                throw ParserException.lqeggnwhkg("Chunk is too large (~2GB+) to skip; id: " + iobyxmoadgVarIobyxmoadg.f15220iobyxmoadg);
            }
            vdvldrhtssVar.draadjrbmk((int) j14);
            iobyxmoadgVarIobyxmoadg = iobyxmoadg.iobyxmoadg(vdvldrhtssVar, yadqdtsiqtVar);
        }
        return iobyxmoadgVarIobyxmoadg;
    }

    public static ppxfxbqfkf zoijcleaow(vdvldrhtss vdvldrhtssVar) throws ParserException {
        byte[] bArr;
        yadqdtsiqt yadqdtsiqtVar = new yadqdtsiqt(16);
        iobyxmoadg iobyxmoadgVarWkgbmnqykc = wkgbmnqykc(1718449184, vdvldrhtssVar, yadqdtsiqtVar);
        y2.iobyxmoadg.lqeggnwhkg(iobyxmoadgVarWkgbmnqykc.f15221zoijcleaow >= 16);
        vdvldrhtssVar.ojitshcjhn(yadqdtsiqtVar.eablkybsjg(), 0, 16);
        yadqdtsiqtVar.sopmlzcsov(0);
        int iLereixgezr = yadqdtsiqtVar.lereixgezr();
        int iLereixgezr2 = yadqdtsiqtVar.lereixgezr();
        int iEsjtqupxsv = yadqdtsiqtVar.esjtqupxsv();
        int iEsjtqupxsv2 = yadqdtsiqtVar.esjtqupxsv();
        int iLereixgezr3 = yadqdtsiqtVar.lereixgezr();
        int iLereixgezr4 = yadqdtsiqtVar.lereixgezr();
        int i13 = ((int) iobyxmoadgVarWkgbmnqykc.f15221zoijcleaow) - 16;
        if (i13 > 0) {
            byte[] bArr2 = new byte[i13];
            vdvldrhtssVar.ojitshcjhn(bArr2, 0, i13);
            bArr = bArr2;
        } else {
            bArr = stevsuqkhv.f123601gxszxtbevo;
        }
        vdvldrhtssVar.draadjrbmk((int) (vdvldrhtssVar.nufgyqmvbu() - vdvldrhtssVar.getPosition()));
        return new ppxfxbqfkf(iLereixgezr, iLereixgezr2, iEsjtqupxsv, iEsjtqupxsv2, iLereixgezr3, iLereixgezr4, bArr);
    }
}
