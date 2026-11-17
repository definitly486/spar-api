package m4;

import h4.agtfadlqog;
import h4.draadjrbmk;
import java.io.EOFException;
import java.math.RoundingMode;
import t3.cdpycssgdh;
import t3.dsvhmnatus;
import t3.iozdgvuglv;
import t3.oxmwwwfdhm;
import t3.rgvfuqvkyq;
import t3.vdvldrhtss;
import t3.wflxmlrfwp;
import t3.yggfygwlhe;
import t3.ylkuphrtab;
import t3.zynmafqrjb;
import v2.jyumaefscl;
import y2.kcexrzcfyt;
import y2.stevsuqkhv;
import y2.yadqdtsiqt;

/* JADX INFO: loaded from: classes.dex */
public final class gxszxtbevo implements rgvfuqvkyq {

    /* JADX INFO: renamed from: agtfadlqog, reason: collision with root package name */
    private long f65106agtfadlqog;

    /* JADX INFO: renamed from: btonecajqb, reason: collision with root package name */
    private dsvhmnatus f65107btonecajqb;

    /* JADX INFO: renamed from: draadjrbmk, reason: collision with root package name */
    private jyumaefscl f65108draadjrbmk;

    /* JADX INFO: renamed from: dxjokdxxww, reason: collision with root package name */
    private dsvhmnatus f65109dxjokdxxww;

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private final zynmafqrjb f65110eablkybsjg;

    /* JADX INFO: renamed from: gtknphoqwx, reason: collision with root package name */
    private int f65111gtknphoqwx;

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    private final cdpycssgdh f65112gxszxtbevo;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final int f65113iobyxmoadg;

    /* JADX INFO: renamed from: kcexrzcfyt, reason: collision with root package name */
    private boolean f65114kcexrzcfyt;

    /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
    private final dsvhmnatus f65115lqeggnwhkg;

    /* JADX INFO: renamed from: nufgyqmvbu, reason: collision with root package name */
    private oxmwwwfdhm f65116nufgyqmvbu;

    /* JADX INFO: renamed from: ojitshcjhn, reason: collision with root package name */
    private long f65117ojitshcjhn;

    /* JADX INFO: renamed from: oxmwwwfdhm, reason: collision with root package name */
    private lqeggnwhkg f65118oxmwwwfdhm;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final yadqdtsiqt f65119ppxfxbqfkf;

    /* JADX INFO: renamed from: rgvfuqvkyq, reason: collision with root package name */
    private long f65120rgvfuqvkyq;

    /* JADX INFO: renamed from: vdvldrhtss, reason: collision with root package name */
    private int f65121vdvldrhtss;

    /* JADX INFO: renamed from: wflxmlrfwp, reason: collision with root package name */
    private long f65122wflxmlrfwp;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final iozdgvuglv.iobyxmoadg f65123wkgbmnqykc;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    private long f65124yggfygwlhe;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    private boolean f65125zdlpuopuiu;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final long f65126zoijcleaow;

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
    public static final yggfygwlhe f65105jyumaefscl = new yggfygwlhe() { // from class: m4.wkgbmnqykc
        @Override // t3.yggfygwlhe
        public final rgvfuqvkyq[] lqeggnwhkg() {
            return gxszxtbevo.oxmwwwfdhm();
        }
    };

    /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
    private static final h4.nufgyqmvbu.iobyxmoadg f65104iwizpuwonk = new h4.nufgyqmvbu.iobyxmoadg() { // from class: m4.eablkybsjg
        @Override // h4.nufgyqmvbu.iobyxmoadg
        public final boolean iobyxmoadg(int i13, int i14, int i15, int i16, int i17) {
            return gxszxtbevo.kcexrzcfyt(i13, i14, i15, i16, i17);
        }
    };

    public gxszxtbevo() {
        this(0);
    }

    private lqeggnwhkg agtfadlqog(vdvldrhtss vdvldrhtssVar, boolean z13) {
        vdvldrhtssVar.ojitshcjhn(this.f65119ppxfxbqfkf.eablkybsjg(), 0, 4);
        this.f65119ppxfxbqfkf.sopmlzcsov(0);
        this.f65123wkgbmnqykc.iobyxmoadg(this.f65119ppxfxbqfkf.vdvldrhtss());
        return new iobyxmoadg(vdvldrhtssVar.getLength(), vdvldrhtssVar.getPosition(), this.f65123wkgbmnqykc, z13);
    }

    private long btonecajqb(long j13) {
        return this.f65122wflxmlrfwp + ((j13 * 1000000) / ((long) this.f65123wkgbmnqykc.f109453wkgbmnqykc));
    }

    private int cqumvgiudr(vdvldrhtss vdvldrhtssVar) {
        if (this.f65111gtknphoqwx == 0) {
            try {
                lereixgezr(vdvldrhtssVar, false);
            } catch (EOFException unused) {
                return -1;
            }
        }
        if (this.f65118oxmwwwfdhm == null) {
            lqeggnwhkg lqeggnwhkgVarNufgyqmvbu = nufgyqmvbu(vdvldrhtssVar);
            this.f65118oxmwwwfdhm = lqeggnwhkgVarNufgyqmvbu;
            this.f65116nufgyqmvbu.gxszxtbevo(lqeggnwhkgVarNufgyqmvbu);
            androidx.media3.common.iobyxmoadg.zoijcleaow zoijcleaowVarZfvoamnweg = new androidx.media3.common.iobyxmoadg.zoijcleaow().ntlheqmsrt("audio/mpeg").zeieaojujs(this.f65123wkgbmnqykc.f109454zoijcleaow).yfnezrywwk(4096).kegysxyocb(this.f65123wkgbmnqykc.f109448eablkybsjg).nuxfzjnpeb(this.f65123wkgbmnqykc.f109453wkgbmnqykc).ribwqtqdhb(this.f65110eablkybsjg.f109586iobyxmoadg).vipkmwdibw(this.f65110eablkybsjg.f109587zoijcleaow).zfvoamnweg((this.f65113iobyxmoadg & 8) != 0 ? null : this.f65108draadjrbmk);
            if (this.f65118oxmwwwfdhm.btonecajqb() != -2147483647) {
                zoijcleaowVarZfvoamnweg.stevsuqkhv(this.f65118oxmwwwfdhm.btonecajqb());
            }
            this.f65107btonecajqb.iobyxmoadg(zoijcleaowVarZfvoamnweg.cllcsxoeiz());
            this.f65117ojitshcjhn = vdvldrhtssVar.getPosition();
        } else if (this.f65117ojitshcjhn != 0) {
            long position = vdvldrhtssVar.getPosition();
            long j13 = this.f65117ojitshcjhn;
            if (position < j13) {
                vdvldrhtssVar.draadjrbmk((int) (j13 - position));
            }
        }
        return esjtqupxsv(vdvldrhtssVar);
    }

    private int esjtqupxsv(vdvldrhtss vdvldrhtssVar) {
        if (this.f65121vdvldrhtss == 0) {
            vdvldrhtssVar.gxszxtbevo();
            if (iwizpuwonk(vdvldrhtssVar)) {
                return -1;
            }
            this.f65119ppxfxbqfkf.sopmlzcsov(0);
            int iVdvldrhtss = this.f65119ppxfxbqfkf.vdvldrhtss();
            if (!vdvldrhtss(iVdvldrhtss, this.f65111gtknphoqwx) || iozdgvuglv.btonecajqb(iVdvldrhtss) == -1) {
                vdvldrhtssVar.draadjrbmk(1);
                this.f65111gtknphoqwx = 0;
                return 0;
            }
            this.f65123wkgbmnqykc.iobyxmoadg(iVdvldrhtss);
            if (this.f65122wflxmlrfwp == -9223372036854775807L) {
                this.f65122wflxmlrfwp = this.f65118oxmwwwfdhm.nufgyqmvbu(vdvldrhtssVar.getPosition());
                if (this.f65126zoijcleaow != -9223372036854775807L) {
                    this.f65122wflxmlrfwp += this.f65126zoijcleaow - this.f65118oxmwwwfdhm.nufgyqmvbu(0L);
                }
            }
            this.f65121vdvldrhtss = this.f65123wkgbmnqykc.f109452ppxfxbqfkf;
            long position = vdvldrhtssVar.getPosition();
            iozdgvuglv.iobyxmoadg iobyxmoadgVar = this.f65123wkgbmnqykc;
            this.f65120rgvfuqvkyq = position + ((long) iobyxmoadgVar.f109452ppxfxbqfkf);
            lqeggnwhkg lqeggnwhkgVar = this.f65118oxmwwwfdhm;
            if (lqeggnwhkgVar instanceof zoijcleaow) {
                zoijcleaow zoijcleaowVar = (zoijcleaow) lqeggnwhkgVar;
                zoijcleaowVar.zoijcleaow(btonecajqb(this.f65106agtfadlqog + ((long) iobyxmoadgVar.f109451lqeggnwhkg)), this.f65120rgvfuqvkyq);
                if (this.f65125zdlpuopuiu && zoijcleaowVar.iobyxmoadg(this.f65124yggfygwlhe)) {
                    this.f65125zdlpuopuiu = false;
                    this.f65107btonecajqb = this.f65109dxjokdxxww;
                }
            }
        }
        int iGxszxtbevo = this.f65107btonecajqb.gxszxtbevo(vdvldrhtssVar, this.f65121vdvldrhtss, true);
        if (iGxszxtbevo == -1) {
            return -1;
        }
        int i13 = this.f65121vdvldrhtss - iGxszxtbevo;
        this.f65121vdvldrhtss = i13;
        if (i13 > 0) {
            return 0;
        }
        this.f65107btonecajqb.zoijcleaow(btonecajqb(this.f65106agtfadlqog), 1, this.f65123wkgbmnqykc.f109452ppxfxbqfkf, 0, null);
        this.f65106agtfadlqog += (long) this.f65123wkgbmnqykc.f109451lqeggnwhkg;
        this.f65121vdvldrhtss = 0;
        return 0;
    }

    private boolean iwizpuwonk(vdvldrhtss vdvldrhtssVar) {
        lqeggnwhkg lqeggnwhkgVar = this.f65118oxmwwwfdhm;
        if (lqeggnwhkgVar != null) {
            long jGxszxtbevo = lqeggnwhkgVar.gxszxtbevo();
            if (jGxszxtbevo != -1 && vdvldrhtssVar.nufgyqmvbu() > jGxszxtbevo - 4) {
                return true;
            }
        }
        try {
            return !vdvldrhtssVar.ppxfxbqfkf(this.f65119ppxfxbqfkf.eablkybsjg(), 0, 4, true);
        } catch (EOFException unused) {
            return true;
        }
    }

    private void jyumaefscl() {
        lqeggnwhkg lqeggnwhkgVar = this.f65118oxmwwwfdhm;
        if ((lqeggnwhkgVar instanceof iobyxmoadg) && lqeggnwhkgVar.lqeggnwhkg()) {
            long j13 = this.f65120rgvfuqvkyq;
            if (j13 == -1 || j13 == this.f65118oxmwwwfdhm.gxszxtbevo()) {
                return;
            }
            this.f65118oxmwwwfdhm = ((iobyxmoadg) this.f65118oxmwwwfdhm).eablkybsjg(this.f65120rgvfuqvkyq);
            ((oxmwwwfdhm) y2.iobyxmoadg.eablkybsjg(this.f65116nufgyqmvbu)).gxszxtbevo(this.f65118oxmwwwfdhm);
            ((dsvhmnatus) y2.iobyxmoadg.eablkybsjg(this.f65109dxjokdxxww)).eablkybsjg(this.f65118oxmwwwfdhm.gtknphoqwx());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ boolean kcexrzcfyt(int i13, int i14, int i15, int i16, int i17) {
        return (i14 == 67 && i15 == 79 && i16 == 77 && (i17 == 77 || i13 == 2)) || (i14 == 77 && i15 == 76 && i16 == 76 && (i17 == 84 || i13 == 2));
    }

    private boolean lereixgezr(vdvldrhtss vdvldrhtssVar, boolean z13) throws EOFException {
        int iNufgyqmvbu;
        int i13;
        int iBtonecajqb;
        int i14 = z13 ? 32768 : 131072;
        vdvldrhtssVar.gxszxtbevo();
        if (vdvldrhtssVar.getPosition() == 0) {
            jyumaefscl jyumaefsclVarIobyxmoadg = this.f65112gxszxtbevo.iobyxmoadg(vdvldrhtssVar, (this.f65113iobyxmoadg & 8) == 0 ? null : f65104iwizpuwonk);
            this.f65108draadjrbmk = jyumaefsclVarIobyxmoadg;
            if (jyumaefsclVarIobyxmoadg != null) {
                this.f65110eablkybsjg.ppxfxbqfkf(jyumaefsclVarIobyxmoadg);
            }
            iNufgyqmvbu = (int) vdvldrhtssVar.nufgyqmvbu();
            if (!z13) {
                vdvldrhtssVar.draadjrbmk(iNufgyqmvbu);
            }
            i13 = 0;
        } else {
            iNufgyqmvbu = 0;
            i13 = 0;
        }
        int i15 = i13;
        int i16 = i15;
        while (true) {
            if (iwizpuwonk(vdvldrhtssVar)) {
                if (i15 > 0) {
                    break;
                }
                jyumaefscl();
                throw new EOFException();
            }
            this.f65119ppxfxbqfkf.sopmlzcsov(0);
            int iVdvldrhtss = this.f65119ppxfxbqfkf.vdvldrhtss();
            if ((i13 == 0 || vdvldrhtss(iVdvldrhtss, i13)) && (iBtonecajqb = iozdgvuglv.btonecajqb(iVdvldrhtss)) != -1) {
                i15++;
                if (i15 != 1) {
                    if (i15 == 4) {
                        break;
                    }
                } else {
                    this.f65123wkgbmnqykc.iobyxmoadg(iVdvldrhtss);
                    i13 = iVdvldrhtss;
                }
                vdvldrhtssVar.dxjokdxxww(iBtonecajqb - 4);
            } else {
                int i17 = i16 + 1;
                if (i16 == i14) {
                    if (z13) {
                        return false;
                    }
                    jyumaefscl();
                    throw new EOFException();
                }
                if (z13) {
                    vdvldrhtssVar.gxszxtbevo();
                    vdvldrhtssVar.dxjokdxxww(iNufgyqmvbu + i17);
                } else {
                    vdvldrhtssVar.draadjrbmk(1);
                }
                i15 = 0;
                i16 = i17;
                i13 = 0;
            }
        }
        if (z13) {
            vdvldrhtssVar.draadjrbmk(iNufgyqmvbu + i16);
        } else {
            vdvldrhtssVar.gxszxtbevo();
        }
        this.f65111gtknphoqwx = i13;
        return true;
    }

    private void lqeggnwhkg() {
        y2.iobyxmoadg.dxjokdxxww(this.f65109dxjokdxxww);
        stevsuqkhv.nufgyqmvbu(this.f65116nufgyqmvbu);
    }

    private lqeggnwhkg nufgyqmvbu(vdvldrhtss vdvldrhtssVar) {
        long jOjitshcjhn;
        long jGxszxtbevo;
        lqeggnwhkg lqeggnwhkgVarYggfygwlhe = yggfygwlhe(vdvldrhtssVar);
        ppxfxbqfkf ppxfxbqfkfVarZdlpuopuiu = zdlpuopuiu(this.f65108draadjrbmk, vdvldrhtssVar.getPosition());
        if (this.f65114kcexrzcfyt) {
            return new lqeggnwhkg.iobyxmoadg();
        }
        if ((this.f65113iobyxmoadg & 4) != 0) {
            if (ppxfxbqfkfVarZdlpuopuiu != null) {
                jOjitshcjhn = ppxfxbqfkfVarZdlpuopuiu.gtknphoqwx();
                jGxszxtbevo = ppxfxbqfkfVarZdlpuopuiu.gxszxtbevo();
            } else if (lqeggnwhkgVarYggfygwlhe != null) {
                jOjitshcjhn = lqeggnwhkgVarYggfygwlhe.gtknphoqwx();
                jGxszxtbevo = lqeggnwhkgVarYggfygwlhe.gxszxtbevo();
            } else {
                jOjitshcjhn = ojitshcjhn(this.f65108draadjrbmk);
                jGxszxtbevo = -1;
            }
            lqeggnwhkgVarYggfygwlhe = new zoijcleaow(jOjitshcjhn, vdvldrhtssVar.getPosition(), jGxszxtbevo);
        } else if (ppxfxbqfkfVarZdlpuopuiu != null) {
            lqeggnwhkgVarYggfygwlhe = ppxfxbqfkfVarZdlpuopuiu;
        } else if (lqeggnwhkgVarYggfygwlhe == null) {
            lqeggnwhkgVarYggfygwlhe = null;
        }
        if (lqeggnwhkgVarYggfygwlhe == null || (!lqeggnwhkgVarYggfygwlhe.lqeggnwhkg() && (this.f65113iobyxmoadg & 1) != 0)) {
            lqeggnwhkgVarYggfygwlhe = agtfadlqog(vdvldrhtssVar, (this.f65113iobyxmoadg & 2) != 0);
        }
        if (lqeggnwhkgVarYggfygwlhe != null) {
            this.f65109dxjokdxxww.eablkybsjg(lqeggnwhkgVarYggfygwlhe.gtknphoqwx());
        }
        return lqeggnwhkgVarYggfygwlhe;
    }

    private static long ojitshcjhn(jyumaefscl jyumaefsclVar) {
        if (jyumaefsclVar == null) {
            return -9223372036854775807L;
        }
        int iEablkybsjg = jyumaefsclVar.eablkybsjg();
        for (int i13 = 0; i13 < iEablkybsjg; i13++) {
            jyumaefscl.iobyxmoadg iobyxmoadgVarWkgbmnqykc = jyumaefsclVar.wkgbmnqykc(i13);
            if (iobyxmoadgVarWkgbmnqykc instanceof agtfadlqog) {
                agtfadlqog agtfadlqogVar = (agtfadlqog) iobyxmoadgVarWkgbmnqykc;
                if (agtfadlqogVar.f39346iobyxmoadg.equals("TLEN")) {
                    return stevsuqkhv.ixidwrxhsl(Long.parseLong((String) agtfadlqogVar.f39338wkgbmnqykc.get(0)));
                }
            }
        }
        return -9223372036854775807L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ rgvfuqvkyq[] oxmwwwfdhm() {
        return new rgvfuqvkyq[]{new gxszxtbevo()};
    }

    private static int rgvfuqvkyq(yadqdtsiqt yadqdtsiqtVar, int i13) {
        if (yadqdtsiqtVar.lqeggnwhkg() >= i13 + 4) {
            yadqdtsiqtVar.sopmlzcsov(i13);
            int iVdvldrhtss = yadqdtsiqtVar.vdvldrhtss();
            if (iVdvldrhtss == 1483304551 || iVdvldrhtss == 1231971951) {
                return iVdvldrhtss;
            }
        }
        if (yadqdtsiqtVar.lqeggnwhkg() < 40) {
            return 0;
        }
        yadqdtsiqtVar.sopmlzcsov(36);
        return yadqdtsiqtVar.vdvldrhtss() == 1447187017 ? 1447187017 : 0;
    }

    private static boolean vdvldrhtss(int i13, long j13) {
        return ((long) (i13 & (-128000))) == (j13 & (-128000));
    }

    private lqeggnwhkg wflxmlrfwp(long j13, dxjokdxxww dxjokdxxwwVar, long j14) {
        long j15;
        long j16;
        long jIobyxmoadg = dxjokdxxwwVar.iobyxmoadg();
        if (jIobyxmoadg == -9223372036854775807L) {
            return null;
        }
        long j17 = dxjokdxxwwVar.f65101ppxfxbqfkf;
        if (j17 != -1) {
            long j18 = j13 + j17;
            j15 = j17 - ((long) dxjokdxxwwVar.f65100iobyxmoadg.f109452ppxfxbqfkf);
            j16 = j18;
        } else {
            if (j14 == -1) {
                return null;
            }
            j15 = (j14 - j13) - ((long) dxjokdxxwwVar.f65100iobyxmoadg.f109452ppxfxbqfkf);
            j16 = j14;
        }
        long j19 = j15;
        RoundingMode roundingMode = RoundingMode.HALF_UP;
        return new iobyxmoadg(j16, j13 + ((long) dxjokdxxwwVar.f65100iobyxmoadg.f109452ppxfxbqfkf), com.google.common.primitives.gxszxtbevo.wkgbmnqykc(stevsuqkhv.d(j19, 8000000L, jIobyxmoadg, roundingMode)), com.google.common.primitives.gxszxtbevo.wkgbmnqykc(za.wkgbmnqykc.zoijcleaow(j19, dxjokdxxwwVar.f65103zoijcleaow, roundingMode)), false);
    }

    private lqeggnwhkg yggfygwlhe(vdvldrhtss vdvldrhtssVar) {
        int i13;
        int i14;
        yadqdtsiqt yadqdtsiqtVar = new yadqdtsiqt(this.f65123wkgbmnqykc.f109452ppxfxbqfkf);
        vdvldrhtssVar.ojitshcjhn(yadqdtsiqtVar.eablkybsjg(), 0, this.f65123wkgbmnqykc.f109452ppxfxbqfkf);
        iozdgvuglv.iobyxmoadg iobyxmoadgVar = this.f65123wkgbmnqykc;
        int i15 = 21;
        if ((iobyxmoadgVar.f109450iobyxmoadg & 1) != 0) {
            if (iobyxmoadgVar.f109448eablkybsjg != 1) {
                i15 = 36;
            }
        } else if (iobyxmoadgVar.f109448eablkybsjg == 1) {
            i15 = 13;
        }
        int iRgvfuqvkyq = rgvfuqvkyq(yadqdtsiqtVar, i15);
        if (iRgvfuqvkyq != 1231971951) {
            if (iRgvfuqvkyq == 1447187017) {
                nufgyqmvbu nufgyqmvbuVarIobyxmoadg = nufgyqmvbu.iobyxmoadg(vdvldrhtssVar.getLength(), vdvldrhtssVar.getPosition(), this.f65123wkgbmnqykc, yadqdtsiqtVar);
                vdvldrhtssVar.draadjrbmk(this.f65123wkgbmnqykc.f109452ppxfxbqfkf);
                return nufgyqmvbuVarIobyxmoadg;
            }
            if (iRgvfuqvkyq != 1483304551) {
                vdvldrhtssVar.gxszxtbevo();
                return null;
            }
        }
        dxjokdxxww dxjokdxxwwVarZoijcleaow = dxjokdxxww.zoijcleaow(this.f65123wkgbmnqykc, yadqdtsiqtVar);
        if (!this.f65110eablkybsjg.iobyxmoadg() && (i13 = dxjokdxxwwVarZoijcleaow.f65102wkgbmnqykc) != -1 && (i14 = dxjokdxxwwVarZoijcleaow.f65098eablkybsjg) != -1) {
            zynmafqrjb zynmafqrjbVar = this.f65110eablkybsjg;
            zynmafqrjbVar.f109586iobyxmoadg = i13;
            zynmafqrjbVar.f109587zoijcleaow = i14;
        }
        long position = vdvldrhtssVar.getPosition();
        if (vdvldrhtssVar.getLength() != -1 && dxjokdxxwwVarZoijcleaow.f65101ppxfxbqfkf != -1 && vdvldrhtssVar.getLength() != dxjokdxxwwVarZoijcleaow.f65101ppxfxbqfkf + position) {
            kcexrzcfyt.gxszxtbevo("Mp3Extractor", "Data size mismatch between stream (" + vdvldrhtssVar.getLength() + ") and Xing frame (" + (dxjokdxxwwVarZoijcleaow.f65101ppxfxbqfkf + position) + "), using Xing value.");
        }
        vdvldrhtssVar.draadjrbmk(this.f65123wkgbmnqykc.f109452ppxfxbqfkf);
        return iRgvfuqvkyq == 1483304551 ? btonecajqb.iobyxmoadg(dxjokdxxwwVarZoijcleaow, position) : wflxmlrfwp(position, dxjokdxxwwVarZoijcleaow, vdvldrhtssVar.getLength());
    }

    private static ppxfxbqfkf zdlpuopuiu(jyumaefscl jyumaefsclVar, long j13) {
        if (jyumaefsclVar == null) {
            return null;
        }
        int iEablkybsjg = jyumaefsclVar.eablkybsjg();
        for (int i13 = 0; i13 < iEablkybsjg; i13++) {
            jyumaefscl.iobyxmoadg iobyxmoadgVarWkgbmnqykc = jyumaefsclVar.wkgbmnqykc(i13);
            if (iobyxmoadgVarWkgbmnqykc instanceof draadjrbmk) {
                return ppxfxbqfkf.iobyxmoadg(j13, (draadjrbmk) iobyxmoadgVarWkgbmnqykc, ojitshcjhn(jyumaefsclVar));
            }
        }
        return null;
    }

    @Override // t3.rgvfuqvkyq
    public boolean draadjrbmk(vdvldrhtss vdvldrhtssVar) {
        return lereixgezr(vdvldrhtssVar, true);
    }

    public void gtknphoqwx() {
        this.f65114kcexrzcfyt = true;
    }

    @Override // t3.rgvfuqvkyq
    public void iobyxmoadg(long j13, long j14) {
        this.f65111gtknphoqwx = 0;
        this.f65122wflxmlrfwp = -9223372036854775807L;
        this.f65106agtfadlqog = 0L;
        this.f65121vdvldrhtss = 0;
        this.f65124yggfygwlhe = j14;
        lqeggnwhkg lqeggnwhkgVar = this.f65118oxmwwwfdhm;
        if (!(lqeggnwhkgVar instanceof zoijcleaow) || ((zoijcleaow) lqeggnwhkgVar).iobyxmoadg(j14)) {
            return;
        }
        this.f65125zdlpuopuiu = true;
        this.f65107btonecajqb = this.f65115lqeggnwhkg;
    }

    @Override // t3.rgvfuqvkyq
    public void ppxfxbqfkf(oxmwwwfdhm oxmwwwfdhmVar) {
        this.f65116nufgyqmvbu = oxmwwwfdhmVar;
        dsvhmnatus dsvhmnatusVarKcexrzcfyt = oxmwwwfdhmVar.kcexrzcfyt(0, 1);
        this.f65109dxjokdxxww = dsvhmnatusVarKcexrzcfyt;
        this.f65107btonecajqb = dsvhmnatusVarKcexrzcfyt;
        this.f65116nufgyqmvbu.agtfadlqog();
    }

    @Override // t3.rgvfuqvkyq
    public void release() {
    }

    @Override // t3.rgvfuqvkyq
    public int zoijcleaow(vdvldrhtss vdvldrhtssVar, ylkuphrtab ylkuphrtabVar) {
        lqeggnwhkg();
        int iCqumvgiudr = cqumvgiudr(vdvldrhtssVar);
        if (iCqumvgiudr == -1 && (this.f65118oxmwwwfdhm instanceof zoijcleaow)) {
            long jBtonecajqb = btonecajqb(this.f65106agtfadlqog);
            if (this.f65118oxmwwwfdhm.gtknphoqwx() != jBtonecajqb) {
                ((zoijcleaow) this.f65118oxmwwwfdhm).ppxfxbqfkf(jBtonecajqb);
                this.f65116nufgyqmvbu.gxszxtbevo(this.f65118oxmwwwfdhm);
                this.f65109dxjokdxxww.eablkybsjg(this.f65118oxmwwwfdhm.gtknphoqwx());
            }
        }
        return iCqumvgiudr;
    }

    public gxszxtbevo(int i13) {
        this(i13, -9223372036854775807L);
    }

    public gxszxtbevo(int i13, long j13) {
        this.f65113iobyxmoadg = (i13 & 2) != 0 ? i13 | 1 : i13;
        this.f65126zoijcleaow = j13;
        this.f65119ppxfxbqfkf = new yadqdtsiqt(10);
        this.f65123wkgbmnqykc = new iozdgvuglv.iobyxmoadg();
        this.f65110eablkybsjg = new zynmafqrjb();
        this.f65122wflxmlrfwp = -9223372036854775807L;
        this.f65112gxszxtbevo = new cdpycssgdh();
        wflxmlrfwp wflxmlrfwpVar = new wflxmlrfwp();
        this.f65115lqeggnwhkg = wflxmlrfwpVar;
        this.f65107btonecajqb = wflxmlrfwpVar;
        this.f65120rgvfuqvkyq = -1L;
    }
}
