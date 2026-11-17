package u3;

import androidx.media3.common.ParserException;
import java.io.EOFException;
import java.util.Arrays;
import t3.dsvhmnatus;
import t3.nufgyqmvbu;
import t3.oxmwwwfdhm;
import t3.pkzmftpjix;
import t3.rgvfuqvkyq;
import t3.vdvldrhtss;
import t3.wflxmlrfwp;
import t3.yadqdtsiqt;
import t3.yggfygwlhe;
import t3.ylkuphrtab;
import y2.stevsuqkhv;

/* JADX INFO: loaded from: classes.dex */
public final class zoijcleaow implements rgvfuqvkyq {

    /* JADX INFO: renamed from: agtfadlqog, reason: collision with root package name */
    private dsvhmnatus f112544agtfadlqog;

    /* JADX INFO: renamed from: btonecajqb, reason: collision with root package name */
    private int f112545btonecajqb;

    /* JADX INFO: renamed from: draadjrbmk, reason: collision with root package name */
    private oxmwwwfdhm f112546draadjrbmk;

    /* JADX INFO: renamed from: dxjokdxxww, reason: collision with root package name */
    private int f112547dxjokdxxww;

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private long f112548eablkybsjg;

    /* JADX INFO: renamed from: gtknphoqwx, reason: collision with root package name */
    private long f112549gtknphoqwx;

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    private int f112550gxszxtbevo;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final byte[] f112551iobyxmoadg;

    /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
    private int f112552lqeggnwhkg;

    /* JADX INFO: renamed from: nufgyqmvbu, reason: collision with root package name */
    private long f112553nufgyqmvbu;

    /* JADX INFO: renamed from: ojitshcjhn, reason: collision with root package name */
    private pkzmftpjix f112554ojitshcjhn;

    /* JADX INFO: renamed from: oxmwwwfdhm, reason: collision with root package name */
    private boolean f112555oxmwwwfdhm;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final dsvhmnatus f112556ppxfxbqfkf;

    /* JADX INFO: renamed from: rgvfuqvkyq, reason: collision with root package name */
    private boolean f112557rgvfuqvkyq;

    /* JADX INFO: renamed from: vdvldrhtss, reason: collision with root package name */
    private long f112558vdvldrhtss;

    /* JADX INFO: renamed from: wflxmlrfwp, reason: collision with root package name */
    private dsvhmnatus f112559wflxmlrfwp;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private boolean f112560wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final int f112561zoijcleaow;

    /* JADX INFO: renamed from: kcexrzcfyt, reason: collision with root package name */
    public static final yggfygwlhe f112541kcexrzcfyt = new yggfygwlhe() { // from class: u3.iobyxmoadg
        @Override // t3.yggfygwlhe
        public final rgvfuqvkyq[] lqeggnwhkg() {
            return zoijcleaow.rgvfuqvkyq();
        }
    };

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    private static final int[] f112543zdlpuopuiu = {13, 14, 16, 18, 20, 21, 27, 32, 6, 7, 6, 6, 1, 1, 1, 1};

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    private static final int[] f112542yggfygwlhe = {18, 24, 33, 37, 41, 47, 51, 59, 61, 6, 1, 1, 1, 1, 1, 1};

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
    private static final byte[] f112540jyumaefscl = stevsuqkhv.opjhrmiecq("#!AMR\n");

    /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
    private static final byte[] f112539iwizpuwonk = stevsuqkhv.opjhrmiecq("#!AMR-WB\n");

    public zoijcleaow() {
        this(0);
    }

    private boolean agtfadlqog(int i13) {
        return i13 >= 0 && i13 <= 15 && (ojitshcjhn(i13) || gtknphoqwx(i13));
    }

    private int btonecajqb(int i13) throws ParserException {
        if (agtfadlqog(i13)) {
            return this.f112560wkgbmnqykc ? f112542yggfygwlhe[i13] : f112543zdlpuopuiu[i13];
        }
        StringBuilder sb3 = new StringBuilder();
        sb3.append("Illegal AMR ");
        sb3.append(this.f112560wkgbmnqykc ? "WB" : "NB");
        sb3.append(" frame type ");
        sb3.append(i13);
        throw ParserException.iobyxmoadg(sb3.toString(), null);
    }

    private boolean gtknphoqwx(int i13) {
        return !this.f112560wkgbmnqykc && (i13 < 12 || i13 > 14);
    }

    private void gxszxtbevo() {
        y2.iobyxmoadg.dxjokdxxww(this.f112559wflxmlrfwp);
        stevsuqkhv.nufgyqmvbu(this.f112546draadjrbmk);
    }

    private int jyumaefscl(vdvldrhtss vdvldrhtssVar) throws ParserException {
        if (this.f112552lqeggnwhkg == 0) {
            try {
                int iZdlpuopuiu = zdlpuopuiu(vdvldrhtssVar);
                this.f112550gxszxtbevo = iZdlpuopuiu;
                this.f112552lqeggnwhkg = iZdlpuopuiu;
                if (this.f112547dxjokdxxww == -1) {
                    this.f112553nufgyqmvbu = vdvldrhtssVar.getPosition();
                    this.f112547dxjokdxxww = this.f112550gxszxtbevo;
                }
                if (this.f112547dxjokdxxww == this.f112550gxszxtbevo) {
                    this.f112545btonecajqb++;
                }
                pkzmftpjix pkzmftpjixVar = this.f112554ojitshcjhn;
                if (pkzmftpjixVar instanceof yadqdtsiqt) {
                    yadqdtsiqt yadqdtsiqtVar = (yadqdtsiqt) pkzmftpjixVar;
                    long j13 = this.f112549gtknphoqwx + this.f112548eablkybsjg + 20000;
                    long position = vdvldrhtssVar.getPosition() + ((long) this.f112550gxszxtbevo);
                    if (!yadqdtsiqtVar.zoijcleaow(j13, 100000L)) {
                        yadqdtsiqtVar.iobyxmoadg(j13, position);
                    }
                    if (this.f112557rgvfuqvkyq && wflxmlrfwp(j13, this.f112558vdvldrhtss)) {
                        this.f112557rgvfuqvkyq = false;
                        this.f112544agtfadlqog = this.f112559wflxmlrfwp;
                    }
                }
            } catch (EOFException unused) {
                return -1;
            }
        }
        int iGxszxtbevo = this.f112544agtfadlqog.gxszxtbevo(vdvldrhtssVar, this.f112552lqeggnwhkg, true);
        if (iGxszxtbevo == -1) {
            return -1;
        }
        int i13 = this.f112552lqeggnwhkg - iGxszxtbevo;
        this.f112552lqeggnwhkg = i13;
        if (i13 > 0) {
            return 0;
        }
        this.f112544agtfadlqog.zoijcleaow(this.f112549gtknphoqwx + this.f112548eablkybsjg, 1, this.f112550gxszxtbevo, 0, null);
        this.f112548eablkybsjg += 20000;
        return 0;
    }

    private static boolean kcexrzcfyt(vdvldrhtss vdvldrhtssVar, byte[] bArr) {
        vdvldrhtssVar.gxszxtbevo();
        byte[] bArr2 = new byte[bArr.length];
        vdvldrhtssVar.ojitshcjhn(bArr2, 0, bArr.length);
        return Arrays.equals(bArr2, bArr);
    }

    private static int lqeggnwhkg(int i13, long j13) {
        return (int) ((((long) i13) * 8000000) / j13);
    }

    private pkzmftpjix nufgyqmvbu(long j13, boolean z13) {
        return new nufgyqmvbu(j13, this.f112553nufgyqmvbu, lqeggnwhkg(this.f112547dxjokdxxww, 20000L), this.f112547dxjokdxxww, z13);
    }

    private boolean ojitshcjhn(int i13) {
        return this.f112560wkgbmnqykc && (i13 < 10 || i13 > 13);
    }

    private void oxmwwwfdhm(long j13, int i13) {
        int i14;
        if (this.f112554ojitshcjhn != null) {
            return;
        }
        int i15 = this.f112561zoijcleaow;
        if ((i15 & 4) != 0) {
            this.f112554ojitshcjhn = new yadqdtsiqt(new long[]{this.f112553nufgyqmvbu}, new long[]{0}, -9223372036854775807L);
        } else if ((i15 & 1) == 0 || !((i14 = this.f112547dxjokdxxww) == -1 || i14 == this.f112550gxszxtbevo)) {
            this.f112554ojitshcjhn = new pkzmftpjix.zoijcleaow(-9223372036854775807L);
        } else if (this.f112545btonecajqb >= 20 || i13 == -1) {
            pkzmftpjix pkzmftpjixVarNufgyqmvbu = nufgyqmvbu(j13, (i15 & 2) != 0);
            this.f112554ojitshcjhn = pkzmftpjixVarNufgyqmvbu;
            this.f112559wflxmlrfwp.eablkybsjg(pkzmftpjixVarNufgyqmvbu.gtknphoqwx());
        }
        pkzmftpjix pkzmftpjixVar = this.f112554ojitshcjhn;
        if (pkzmftpjixVar != null) {
            this.f112546draadjrbmk.gxszxtbevo(pkzmftpjixVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ rgvfuqvkyq[] rgvfuqvkyq() {
        return new rgvfuqvkyq[]{new zoijcleaow()};
    }

    private void vdvldrhtss() {
        if (this.f112555oxmwwwfdhm) {
            return;
        }
        this.f112555oxmwwwfdhm = true;
        boolean z13 = this.f112560wkgbmnqykc;
        String str = z13 ? "audio/amr-wb" : "audio/amr";
        this.f112559wflxmlrfwp.iobyxmoadg(new androidx.media3.common.iobyxmoadg.zoijcleaow().ntlheqmsrt(str).zeieaojujs(z13 ? "audio/amr-wb" : "audio/3gpp").yfnezrywwk(z13 ? f112542yggfygwlhe[8] : f112543zdlpuopuiu[7]).kegysxyocb(1).nuxfzjnpeb(z13 ? 16000 : 8000).cllcsxoeiz());
    }

    private boolean wflxmlrfwp(long j13, long j14) {
        return Math.abs(j14 - j13) < 20000;
    }

    private boolean yggfygwlhe(vdvldrhtss vdvldrhtssVar) {
        byte[] bArr = f112540jyumaefscl;
        if (kcexrzcfyt(vdvldrhtssVar, bArr)) {
            this.f112560wkgbmnqykc = false;
            vdvldrhtssVar.draadjrbmk(bArr.length);
            return true;
        }
        byte[] bArr2 = f112539iwizpuwonk;
        if (!kcexrzcfyt(vdvldrhtssVar, bArr2)) {
            return false;
        }
        this.f112560wkgbmnqykc = true;
        vdvldrhtssVar.draadjrbmk(bArr2.length);
        return true;
    }

    private int zdlpuopuiu(vdvldrhtss vdvldrhtssVar) throws ParserException {
        vdvldrhtssVar.gxszxtbevo();
        vdvldrhtssVar.ojitshcjhn(this.f112551iobyxmoadg, 0, 1);
        byte b13 = this.f112551iobyxmoadg[0];
        if ((b13 & 131) <= 0) {
            return btonecajqb((b13 >> 3) & 15);
        }
        throw ParserException.iobyxmoadg("Invalid padding bits for frame header " + ((int) b13), null);
    }

    @Override // t3.rgvfuqvkyq
    public boolean draadjrbmk(vdvldrhtss vdvldrhtssVar) {
        return yggfygwlhe(vdvldrhtssVar);
    }

    @Override // t3.rgvfuqvkyq
    public void iobyxmoadg(long j13, long j14) {
        this.f112548eablkybsjg = 0L;
        this.f112550gxszxtbevo = 0;
        this.f112552lqeggnwhkg = 0;
        this.f112558vdvldrhtss = j14;
        pkzmftpjix pkzmftpjixVar = this.f112554ojitshcjhn;
        if (!(pkzmftpjixVar instanceof yadqdtsiqt)) {
            if (j13 == 0 || !(pkzmftpjixVar instanceof nufgyqmvbu)) {
                this.f112549gtknphoqwx = 0L;
                return;
            } else {
                this.f112549gtknphoqwx = ((nufgyqmvbu) pkzmftpjixVar).zoijcleaow(j13);
                return;
            }
        }
        long jNufgyqmvbu = ((yadqdtsiqt) pkzmftpjixVar).nufgyqmvbu(j13);
        this.f112549gtknphoqwx = jNufgyqmvbu;
        if (wflxmlrfwp(jNufgyqmvbu, this.f112558vdvldrhtss)) {
            return;
        }
        this.f112557rgvfuqvkyq = true;
        this.f112544agtfadlqog = this.f112556ppxfxbqfkf;
    }

    @Override // t3.rgvfuqvkyq
    public void ppxfxbqfkf(oxmwwwfdhm oxmwwwfdhmVar) {
        this.f112546draadjrbmk = oxmwwwfdhmVar;
        dsvhmnatus dsvhmnatusVarKcexrzcfyt = oxmwwwfdhmVar.kcexrzcfyt(0, 1);
        this.f112559wflxmlrfwp = dsvhmnatusVarKcexrzcfyt;
        this.f112544agtfadlqog = dsvhmnatusVarKcexrzcfyt;
        oxmwwwfdhmVar.agtfadlqog();
    }

    @Override // t3.rgvfuqvkyq
    public void release() {
    }

    @Override // t3.rgvfuqvkyq
    public int zoijcleaow(vdvldrhtss vdvldrhtssVar, ylkuphrtab ylkuphrtabVar) throws ParserException {
        gxszxtbevo();
        if (vdvldrhtssVar.getPosition() == 0 && !yggfygwlhe(vdvldrhtssVar)) {
            throw ParserException.iobyxmoadg("Could not find AMR header.", null);
        }
        vdvldrhtss();
        int iJyumaefscl = jyumaefscl(vdvldrhtssVar);
        oxmwwwfdhm(vdvldrhtssVar.getLength(), iJyumaefscl);
        if (iJyumaefscl == -1) {
            pkzmftpjix pkzmftpjixVar = this.f112554ojitshcjhn;
            if (pkzmftpjixVar instanceof yadqdtsiqt) {
                long j13 = this.f112549gtknphoqwx + this.f112548eablkybsjg;
                ((yadqdtsiqt) pkzmftpjixVar).ppxfxbqfkf(j13);
                this.f112546draadjrbmk.gxszxtbevo(this.f112554ojitshcjhn);
                this.f112559wflxmlrfwp.eablkybsjg(j13);
            }
        }
        return iJyumaefscl;
    }

    public zoijcleaow(int i13) {
        this.f112561zoijcleaow = (i13 & 2) != 0 ? i13 | 1 : i13;
        this.f112551iobyxmoadg = new byte[1];
        this.f112547dxjokdxxww = -1;
        wflxmlrfwp wflxmlrfwpVar = new wflxmlrfwp();
        this.f112556ppxfxbqfkf = wflxmlrfwpVar;
        this.f112544agtfadlqog = wflxmlrfwpVar;
    }
}
