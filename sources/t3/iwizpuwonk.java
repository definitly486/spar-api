package t3;

import androidx.media3.common.ParserException;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public abstract class iwizpuwonk {

    public static final class iobyxmoadg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public esjtqupxsv f109470iobyxmoadg;

        public iobyxmoadg(esjtqupxsv esjtqupxsvVar) {
            this.f109470iobyxmoadg = esjtqupxsvVar;
        }
    }

    private static List btonecajqb(vdvldrhtss vdvldrhtssVar, int i13) {
        y2.yadqdtsiqt yadqdtsiqtVar = new y2.yadqdtsiqt(i13);
        vdvldrhtssVar.readFully(yadqdtsiqtVar.eablkybsjg(), 0, i13);
        yadqdtsiqtVar.crxdokpmqz(4);
        return Arrays.asList(kegysxyocb.gtknphoqwx(yadqdtsiqtVar, false, false).f109481zoijcleaow);
    }

    public static void dxjokdxxww(vdvldrhtss vdvldrhtssVar) throws ParserException {
        y2.yadqdtsiqt yadqdtsiqtVar = new y2.yadqdtsiqt(4);
        vdvldrhtssVar.readFully(yadqdtsiqtVar.eablkybsjg(), 0, 4);
        if (yadqdtsiqtVar.pkzmftpjix() != 1716281667) {
            throw ParserException.iobyxmoadg("Failed to read FLAC stream marker.", null);
        }
    }

    public static boolean eablkybsjg(vdvldrhtss vdvldrhtssVar, iobyxmoadg iobyxmoadgVar) {
        vdvldrhtssVar.gxszxtbevo();
        y2.cdpycssgdh cdpycssgdhVar = new y2.cdpycssgdh(new byte[4]);
        vdvldrhtssVar.ojitshcjhn(cdpycssgdhVar.f123526iobyxmoadg, 0, 4);
        boolean zLqeggnwhkg = cdpycssgdhVar.lqeggnwhkg();
        int iNufgyqmvbu = cdpycssgdhVar.nufgyqmvbu(7);
        int iNufgyqmvbu2 = cdpycssgdhVar.nufgyqmvbu(24) + 4;
        if (iNufgyqmvbu == 0) {
            iobyxmoadgVar.f109470iobyxmoadg = nufgyqmvbu(vdvldrhtssVar);
        } else {
            esjtqupxsv esjtqupxsvVar = iobyxmoadgVar.f109470iobyxmoadg;
            if (esjtqupxsvVar == null) {
                throw new IllegalArgumentException();
            }
            if (iNufgyqmvbu == 3) {
                iobyxmoadgVar.f109470iobyxmoadg = esjtqupxsvVar.zoijcleaow(gxszxtbevo(vdvldrhtssVar, iNufgyqmvbu2));
            } else if (iNufgyqmvbu == 4) {
                iobyxmoadgVar.f109470iobyxmoadg = esjtqupxsvVar.ppxfxbqfkf(btonecajqb(vdvldrhtssVar, iNufgyqmvbu2));
            } else if (iNufgyqmvbu == 6) {
                y2.yadqdtsiqt yadqdtsiqtVar = new y2.yadqdtsiqt(iNufgyqmvbu2);
                vdvldrhtssVar.readFully(yadqdtsiqtVar.eablkybsjg(), 0, iNufgyqmvbu2);
                yadqdtsiqtVar.crxdokpmqz(4);
                iobyxmoadgVar.f109470iobyxmoadg = esjtqupxsvVar.iobyxmoadg(com.google.common.collect.zdlpuopuiu.istkbnxepw(f4.iobyxmoadg.wkgbmnqykc(yadqdtsiqtVar)));
            } else {
                vdvldrhtssVar.draadjrbmk(iNufgyqmvbu2);
            }
        }
        return zLqeggnwhkg;
    }

    private static esjtqupxsv.iobyxmoadg gxszxtbevo(vdvldrhtss vdvldrhtssVar, int i13) {
        y2.yadqdtsiqt yadqdtsiqtVar = new y2.yadqdtsiqt(i13);
        vdvldrhtssVar.readFully(yadqdtsiqtVar.eablkybsjg(), 0, i13);
        return lqeggnwhkg(yadqdtsiqtVar);
    }

    public static boolean iobyxmoadg(vdvldrhtss vdvldrhtssVar) {
        y2.yadqdtsiqt yadqdtsiqtVar = new y2.yadqdtsiqt(4);
        vdvldrhtssVar.ojitshcjhn(yadqdtsiqtVar.eablkybsjg(), 0, 4);
        return yadqdtsiqtVar.pkzmftpjix() == 1716281667;
    }

    public static esjtqupxsv.iobyxmoadg lqeggnwhkg(y2.yadqdtsiqt yadqdtsiqtVar) {
        yadqdtsiqtVar.crxdokpmqz(1);
        int iHcddaimhww = yadqdtsiqtVar.hcddaimhww();
        long jGxszxtbevo = ((long) yadqdtsiqtVar.gxszxtbevo()) + ((long) iHcddaimhww);
        int i13 = iHcddaimhww / 18;
        long[] jArrCopyOf = new long[i13];
        long[] jArrCopyOf2 = new long[i13];
        for (int i14 = 0; i14 < i13; i14++) {
            long jPmvmpeiblj = yadqdtsiqtVar.pmvmpeiblj();
            if (jPmvmpeiblj == -1) {
                jArrCopyOf = Arrays.copyOf(jArrCopyOf, i14);
                jArrCopyOf2 = Arrays.copyOf(jArrCopyOf2, i14);
                break;
            }
            jArrCopyOf[i14] = jPmvmpeiblj;
            jArrCopyOf2[i14] = yadqdtsiqtVar.pmvmpeiblj();
            yadqdtsiqtVar.crxdokpmqz(2);
        }
        yadqdtsiqtVar.crxdokpmqz((int) (jGxszxtbevo - ((long) yadqdtsiqtVar.gxszxtbevo())));
        return new esjtqupxsv.iobyxmoadg(jArrCopyOf, jArrCopyOf2);
    }

    private static esjtqupxsv nufgyqmvbu(vdvldrhtss vdvldrhtssVar) {
        byte[] bArr = new byte[38];
        vdvldrhtssVar.readFully(bArr, 0, 38);
        return new esjtqupxsv(bArr, 4);
    }

    public static v2.jyumaefscl ppxfxbqfkf(vdvldrhtss vdvldrhtssVar, boolean z13) {
        v2.jyumaefscl jyumaefsclVarIobyxmoadg = new cdpycssgdh().iobyxmoadg(vdvldrhtssVar, z13 ? null : h4.nufgyqmvbu.f39361zoijcleaow);
        if (jyumaefsclVarIobyxmoadg == null || jyumaefsclVarIobyxmoadg.eablkybsjg() == 0) {
            return null;
        }
        return jyumaefsclVarIobyxmoadg;
    }

    public static v2.jyumaefscl wkgbmnqykc(vdvldrhtss vdvldrhtssVar, boolean z13) {
        vdvldrhtssVar.gxszxtbevo();
        long jNufgyqmvbu = vdvldrhtssVar.nufgyqmvbu();
        v2.jyumaefscl jyumaefsclVarPpxfxbqfkf = ppxfxbqfkf(vdvldrhtssVar, z13);
        vdvldrhtssVar.draadjrbmk((int) (vdvldrhtssVar.nufgyqmvbu() - jNufgyqmvbu));
        return jyumaefsclVarPpxfxbqfkf;
    }

    public static int zoijcleaow(vdvldrhtss vdvldrhtssVar) throws ParserException {
        vdvldrhtssVar.gxszxtbevo();
        y2.yadqdtsiqt yadqdtsiqtVar = new y2.yadqdtsiqt(2);
        vdvldrhtssVar.ojitshcjhn(yadqdtsiqtVar.eablkybsjg(), 0, 2);
        int iWypolnanlu = yadqdtsiqtVar.wypolnanlu();
        if ((iWypolnanlu >> 2) == 16382) {
            vdvldrhtssVar.gxszxtbevo();
            return iWypolnanlu;
        }
        vdvldrhtssVar.gxszxtbevo();
        throw ParserException.iobyxmoadg("First frame does not start with sync code.", null);
    }
}
