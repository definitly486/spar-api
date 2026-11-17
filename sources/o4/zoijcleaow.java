package o4;

import java.util.Arrays;
import t3.cqumvgiudr;
import t3.esjtqupxsv;
import t3.iwizpuwonk;
import t3.jyumaefscl;
import t3.pkzmftpjix;
import t3.vdvldrhtss;
import y2.stevsuqkhv;
import y2.yadqdtsiqt;

/* JADX INFO: loaded from: classes.dex */
final class zoijcleaow extends dxjokdxxww {

    /* JADX INFO: renamed from: agtfadlqog, reason: collision with root package name */
    private esjtqupxsv f71994agtfadlqog;

    /* JADX INFO: renamed from: ojitshcjhn, reason: collision with root package name */
    private iobyxmoadg f71995ojitshcjhn;

    private static final class iobyxmoadg implements lqeggnwhkg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private esjtqupxsv f71996iobyxmoadg;

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        private long f71997ppxfxbqfkf = -1;

        /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
        private long f71998wkgbmnqykc = -1;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private esjtqupxsv.iobyxmoadg f71999zoijcleaow;

        public iobyxmoadg(esjtqupxsv esjtqupxsvVar, esjtqupxsv.iobyxmoadg iobyxmoadgVar) {
            this.f71996iobyxmoadg = esjtqupxsvVar;
            this.f71999zoijcleaow = iobyxmoadgVar;
        }

        @Override // o4.lqeggnwhkg
        public long iobyxmoadg(vdvldrhtss vdvldrhtssVar) {
            long j13 = this.f71998wkgbmnqykc;
            if (j13 < 0) {
                return -1L;
            }
            long j14 = -(j13 + 2);
            this.f71998wkgbmnqykc = -1L;
            return j14;
        }

        @Override // o4.lqeggnwhkg
        public void ppxfxbqfkf(long j13) {
            long[] jArr = this.f71999zoijcleaow.f109429iobyxmoadg;
            this.f71998wkgbmnqykc = jArr[stevsuqkhv.lqeggnwhkg(jArr, j13, true, true)];
        }

        public void wkgbmnqykc(long j13) {
            this.f71997ppxfxbqfkf = j13;
        }

        @Override // o4.lqeggnwhkg
        public pkzmftpjix zoijcleaow() {
            y2.iobyxmoadg.lqeggnwhkg(this.f71997ppxfxbqfkf != -1);
            return new cqumvgiudr(this.f71996iobyxmoadg, this.f71997ppxfxbqfkf);
        }
    }

    zoijcleaow() {
    }

    private int agtfadlqog(yadqdtsiqt yadqdtsiqtVar) {
        int i13 = (yadqdtsiqtVar.eablkybsjg()[2] & 255) >> 4;
        if (i13 == 6 || i13 == 7) {
            yadqdtsiqtVar.crxdokpmqz(4);
            yadqdtsiqtVar.stevsuqkhv();
        }
        int iBtonecajqb = jyumaefscl.btonecajqb(yadqdtsiqtVar, i13);
        yadqdtsiqtVar.sopmlzcsov(0);
        return iBtonecajqb;
    }

    private static boolean ojitshcjhn(byte[] bArr) {
        return bArr[0] == -1;
    }

    public static boolean rgvfuqvkyq(yadqdtsiqt yadqdtsiqtVar) {
        return yadqdtsiqtVar.iobyxmoadg() >= 5 && yadqdtsiqtVar.wwaezpbzkn() == 127 && yadqdtsiqtVar.pkzmftpjix() == 1179402563;
    }

    @Override // o4.dxjokdxxww
    protected void draadjrbmk(boolean z13) {
        super.draadjrbmk(z13);
        if (z13) {
            this.f71994agtfadlqog = null;
            this.f71995ojitshcjhn = null;
        }
    }

    @Override // o4.dxjokdxxww
    protected boolean dxjokdxxww(yadqdtsiqt yadqdtsiqtVar, long j13, dxjokdxxww.zoijcleaow zoijcleaowVar) {
        byte[] bArrEablkybsjg = yadqdtsiqtVar.eablkybsjg();
        esjtqupxsv esjtqupxsvVar = this.f71994agtfadlqog;
        if (esjtqupxsvVar == null) {
            esjtqupxsv esjtqupxsvVar2 = new esjtqupxsv(bArrEablkybsjg, 17);
            this.f71994agtfadlqog = esjtqupxsvVar2;
            zoijcleaowVar.f71956iobyxmoadg = esjtqupxsvVar2.lqeggnwhkg(Arrays.copyOfRange(bArrEablkybsjg, 9, yadqdtsiqtVar.lqeggnwhkg()), null).zoijcleaow().ntlheqmsrt("audio/ogg").cllcsxoeiz();
            return true;
        }
        if ((bArrEablkybsjg[0] & 127) == 3) {
            esjtqupxsv.iobyxmoadg iobyxmoadgVarLqeggnwhkg = iwizpuwonk.lqeggnwhkg(yadqdtsiqtVar);
            esjtqupxsv esjtqupxsvVarZoijcleaow = esjtqupxsvVar.zoijcleaow(iobyxmoadgVarLqeggnwhkg);
            this.f71994agtfadlqog = esjtqupxsvVarZoijcleaow;
            this.f71995ojitshcjhn = new iobyxmoadg(esjtqupxsvVarZoijcleaow, iobyxmoadgVarLqeggnwhkg);
            return true;
        }
        if (!ojitshcjhn(bArrEablkybsjg)) {
            return true;
        }
        iobyxmoadg iobyxmoadgVar = this.f71995ojitshcjhn;
        if (iobyxmoadgVar != null) {
            iobyxmoadgVar.wkgbmnqykc(j13);
            zoijcleaowVar.f71957zoijcleaow = this.f71995ojitshcjhn;
        }
        y2.iobyxmoadg.eablkybsjg(zoijcleaowVar.f71956iobyxmoadg);
        return false;
    }

    @Override // o4.dxjokdxxww
    protected long gxszxtbevo(yadqdtsiqt yadqdtsiqtVar) {
        if (ojitshcjhn(yadqdtsiqtVar.eablkybsjg())) {
            return agtfadlqog(yadqdtsiqtVar);
        }
        return -1L;
    }
}
