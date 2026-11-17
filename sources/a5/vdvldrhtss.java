package a5;

import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import java.util.Collections;
import t3.dsvhmnatus;
import y2.stevsuqkhv;

/* JADX INFO: loaded from: classes.dex */
public final class vdvldrhtss implements wflxmlrfwp {

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private iobyxmoadg f728eablkybsjg;

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    private boolean f730gxszxtbevo;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final lmojexxdyd f731iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private String f735ppxfxbqfkf;

    /* JADX INFO: renamed from: wflxmlrfwp, reason: collision with root package name */
    private long f736wflxmlrfwp;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private dsvhmnatus f737wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final String f738zoijcleaow;

    /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
    private final boolean[] f732lqeggnwhkg = new boolean[3];

    /* JADX INFO: renamed from: nufgyqmvbu, reason: collision with root package name */
    private final iwizpuwonk f733nufgyqmvbu = new iwizpuwonk(32, UserVerificationMethods.USER_VERIFY_PATTERN);

    /* JADX INFO: renamed from: dxjokdxxww, reason: collision with root package name */
    private final iwizpuwonk f727dxjokdxxww = new iwizpuwonk(33, UserVerificationMethods.USER_VERIFY_PATTERN);

    /* JADX INFO: renamed from: btonecajqb, reason: collision with root package name */
    private final iwizpuwonk f725btonecajqb = new iwizpuwonk(34, UserVerificationMethods.USER_VERIFY_PATTERN);

    /* JADX INFO: renamed from: gtknphoqwx, reason: collision with root package name */
    private final iwizpuwonk f729gtknphoqwx = new iwizpuwonk(39, UserVerificationMethods.USER_VERIFY_PATTERN);

    /* JADX INFO: renamed from: draadjrbmk, reason: collision with root package name */
    private final iwizpuwonk f726draadjrbmk = new iwizpuwonk(40, UserVerificationMethods.USER_VERIFY_PATTERN);

    /* JADX INFO: renamed from: agtfadlqog, reason: collision with root package name */
    private long f724agtfadlqog = -9223372036854775807L;

    /* JADX INFO: renamed from: ojitshcjhn, reason: collision with root package name */
    private final y2.yadqdtsiqt f734ojitshcjhn = new y2.yadqdtsiqt();

    private static final class iobyxmoadg {

        /* JADX INFO: renamed from: btonecajqb, reason: collision with root package name */
        private boolean f739btonecajqb;

        /* JADX INFO: renamed from: draadjrbmk, reason: collision with root package name */
        private long f740draadjrbmk;

        /* JADX INFO: renamed from: dxjokdxxww, reason: collision with root package name */
        private boolean f741dxjokdxxww;

        /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
        private long f742eablkybsjg;

        /* JADX INFO: renamed from: gtknphoqwx, reason: collision with root package name */
        private long f743gtknphoqwx;

        /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
        private boolean f744gxszxtbevo;

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final dsvhmnatus f745iobyxmoadg;

        /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
        private boolean f746lqeggnwhkg;

        /* JADX INFO: renamed from: nufgyqmvbu, reason: collision with root package name */
        private boolean f747nufgyqmvbu;

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        private boolean f748ppxfxbqfkf;

        /* JADX INFO: renamed from: wflxmlrfwp, reason: collision with root package name */
        private boolean f749wflxmlrfwp;

        /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
        private int f750wkgbmnqykc;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private long f751zoijcleaow;

        public iobyxmoadg(dsvhmnatus dsvhmnatusVar) {
            this.f745iobyxmoadg = dsvhmnatusVar;
        }

        private static boolean ppxfxbqfkf(int i13) {
            return i13 < 32 || i13 == 40;
        }

        /* JADX WARN: Type inference fix 'apply assigned field type' failed
        java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
        	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
        	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
        	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
         */
        private void wkgbmnqykc(int i13) {
            long j13 = this.f740draadjrbmk;
            if (j13 != -9223372036854775807L) {
                long j14 = this.f751zoijcleaow;
                long j15 = this.f743gtknphoqwx;
                if (j14 == j15) {
                    return;
                }
                boolean z13 = this.f749wflxmlrfwp;
                this.f745iobyxmoadg.zoijcleaow(j13, z13 ? 1 : 0, (int) (j14 - j15), i13, null);
            }
        }

        private static boolean zoijcleaow(int i13) {
            return (32 <= i13 && i13 <= 35) || i13 == 39;
        }

        public void eablkybsjg(byte[] bArr, int i13, int i14) {
            if (this.f744gxszxtbevo) {
                int i15 = this.f750wkgbmnqykc;
                int i16 = (i13 + 2) - i15;
                if (i16 >= i14) {
                    this.f750wkgbmnqykc = i15 + (i14 - i13);
                } else {
                    this.f746lqeggnwhkg = (bArr[i16] & 128) != 0;
                    this.f744gxszxtbevo = false;
                }
            }
        }

        public void gxszxtbevo() {
            this.f744gxszxtbevo = false;
            this.f746lqeggnwhkg = false;
            this.f747nufgyqmvbu = false;
            this.f741dxjokdxxww = false;
            this.f739btonecajqb = false;
        }

        public void iobyxmoadg(long j13, int i13, boolean z13) {
            if (this.f739btonecajqb && this.f746lqeggnwhkg) {
                this.f749wflxmlrfwp = this.f748ppxfxbqfkf;
                this.f739btonecajqb = false;
            } else if (this.f747nufgyqmvbu || this.f746lqeggnwhkg) {
                if (z13 && this.f741dxjokdxxww) {
                    wkgbmnqykc(i13 + ((int) (j13 - this.f751zoijcleaow)));
                }
                this.f743gtknphoqwx = this.f751zoijcleaow;
                this.f740draadjrbmk = this.f742eablkybsjg;
                this.f749wflxmlrfwp = this.f748ppxfxbqfkf;
                this.f741dxjokdxxww = true;
            }
        }

        public void lqeggnwhkg(long j13, int i13, int i14, long j14, boolean z13) {
            this.f746lqeggnwhkg = false;
            this.f747nufgyqmvbu = false;
            this.f742eablkybsjg = j14;
            this.f750wkgbmnqykc = 0;
            this.f751zoijcleaow = j13;
            if (!ppxfxbqfkf(i14)) {
                if (this.f741dxjokdxxww && !this.f739btonecajqb) {
                    if (z13) {
                        wkgbmnqykc(i13);
                    }
                    this.f741dxjokdxxww = false;
                }
                if (zoijcleaow(i14)) {
                    this.f747nufgyqmvbu = !this.f739btonecajqb;
                    this.f739btonecajqb = true;
                }
            }
            boolean z14 = i14 >= 16 && i14 <= 21;
            this.f748ppxfxbqfkf = z14;
            this.f744gxszxtbevo = z14 || i14 <= 9;
        }
    }

    public vdvldrhtss(lmojexxdyd lmojexxdydVar, String str) {
        this.f731iobyxmoadg = lmojexxdydVar;
        this.f738zoijcleaow = str;
    }

    private void btonecajqb(long j13, int i13, int i14, long j14) {
        this.f728eablkybsjg.lqeggnwhkg(j13, i13, i14, j14, this.f730gxszxtbevo);
        if (!this.f730gxszxtbevo) {
            this.f733nufgyqmvbu.eablkybsjg(i14);
            this.f727dxjokdxxww.eablkybsjg(i14);
            this.f725btonecajqb.eablkybsjg(i14);
        }
        this.f729gtknphoqwx.eablkybsjg(i14);
        this.f726draadjrbmk.eablkybsjg(i14);
    }

    private static androidx.media3.common.iobyxmoadg dxjokdxxww(String str, iwizpuwonk iwizpuwonkVar, iwizpuwonk iwizpuwonkVar2, iwizpuwonk iwizpuwonkVar3, String str2) {
        int i13 = iwizpuwonkVar.f550eablkybsjg;
        byte[] bArr = new byte[iwizpuwonkVar2.f550eablkybsjg + i13 + iwizpuwonkVar3.f550eablkybsjg];
        System.arraycopy(iwizpuwonkVar.f553wkgbmnqykc, 0, bArr, 0, i13);
        System.arraycopy(iwizpuwonkVar2.f553wkgbmnqykc, 0, bArr, iwizpuwonkVar.f550eablkybsjg, iwizpuwonkVar2.f550eablkybsjg);
        System.arraycopy(iwizpuwonkVar3.f553wkgbmnqykc, 0, bArr, iwizpuwonkVar.f550eablkybsjg + iwizpuwonkVar2.f550eablkybsjg, iwizpuwonkVar3.f550eablkybsjg);
        z2.gxszxtbevo.nufgyqmvbu nufgyqmvbuVarYggfygwlhe = z2.gxszxtbevo.yggfygwlhe(iwizpuwonkVar2.f553wkgbmnqykc, 3, iwizpuwonkVar2.f550eablkybsjg, null);
        z2.gxszxtbevo.ppxfxbqfkf ppxfxbqfkfVar = nufgyqmvbuVarYggfygwlhe.f127655ppxfxbqfkf;
        return new androidx.media3.common.iobyxmoadg.zoijcleaow().xrmfcynszj(str).ntlheqmsrt(str2).zeieaojujs("video/hevc").tzroggbefp(ppxfxbqfkfVar != null ? y2.btonecajqb.gxszxtbevo(ppxfxbqfkfVar.f127661iobyxmoadg, ppxfxbqfkfVar.f127664zoijcleaow, ppxfxbqfkfVar.f127662ppxfxbqfkf, ppxfxbqfkfVar.f127663wkgbmnqykc, ppxfxbqfkfVar.f127659eablkybsjg, ppxfxbqfkfVar.f127660gxszxtbevo) : null).auzgnhcxok(nufgyqmvbuVarYggfygwlhe.f127654nufgyqmvbu).okpsazkaxt(nufgyqmvbuVarYggfygwlhe.f127648dxjokdxxww).mbcevpiqjq(new v2.dxjokdxxww.zoijcleaow().wkgbmnqykc(nufgyqmvbuVarYggfygwlhe.f127647draadjrbmk).ppxfxbqfkf(nufgyqmvbuVarYggfygwlhe.f127656wflxmlrfwp).eablkybsjg(nufgyqmvbuVarYggfygwlhe.f127645agtfadlqog).lqeggnwhkg(nufgyqmvbuVarYggfygwlhe.f127649eablkybsjg + 8).zoijcleaow(nufgyqmvbuVarYggfygwlhe.f127651gxszxtbevo + 8).iobyxmoadg()).opjhrmiecq(nufgyqmvbuVarYggfygwlhe.f127646btonecajqb).ydmasvzmpa(nufgyqmvbuVarYggfygwlhe.f127650gtknphoqwx).sflfametgt(nufgyqmvbuVarYggfygwlhe.f127658zoijcleaow + 1).metgxyhuhe(Collections.singletonList(bArr)).cllcsxoeiz();
    }

    private void lqeggnwhkg(long j13, int i13, int i14, long j14) {
        this.f728eablkybsjg.iobyxmoadg(j13, i13, this.f730gxszxtbevo);
        if (!this.f730gxszxtbevo) {
            this.f733nufgyqmvbu.zoijcleaow(i14);
            this.f727dxjokdxxww.zoijcleaow(i14);
            this.f725btonecajqb.zoijcleaow(i14);
            if (this.f733nufgyqmvbu.ppxfxbqfkf() && this.f727dxjokdxxww.ppxfxbqfkf() && this.f725btonecajqb.ppxfxbqfkf()) {
                androidx.media3.common.iobyxmoadg iobyxmoadgVarDxjokdxxww = dxjokdxxww(this.f735ppxfxbqfkf, this.f733nufgyqmvbu, this.f727dxjokdxxww, this.f725btonecajqb, this.f738zoijcleaow);
                this.f737wkgbmnqykc.iobyxmoadg(iobyxmoadgVarDxjokdxxww);
                xa.draadjrbmk.ojitshcjhn(iobyxmoadgVarDxjokdxxww.f9775vdvldrhtss != -1);
                this.f731iobyxmoadg.lqeggnwhkg(iobyxmoadgVarDxjokdxxww.f9775vdvldrhtss);
                this.f730gxszxtbevo = true;
            }
        }
        if (this.f729gtknphoqwx.zoijcleaow(i14)) {
            iwizpuwonk iwizpuwonkVar = this.f729gtknphoqwx;
            this.f734ojitshcjhn.ntlheqmsrt(this.f729gtknphoqwx.f553wkgbmnqykc, z2.gxszxtbevo.jpowsppfya(iwizpuwonkVar.f553wkgbmnqykc, iwizpuwonkVar.f550eablkybsjg));
            this.f734ojitshcjhn.crxdokpmqz(5);
            this.f731iobyxmoadg.ppxfxbqfkf(j14, this.f734ojitshcjhn);
        }
        if (this.f726draadjrbmk.zoijcleaow(i14)) {
            iwizpuwonk iwizpuwonkVar2 = this.f726draadjrbmk;
            this.f734ojitshcjhn.ntlheqmsrt(this.f726draadjrbmk.f553wkgbmnqykc, z2.gxszxtbevo.jpowsppfya(iwizpuwonkVar2.f553wkgbmnqykc, iwizpuwonkVar2.f550eablkybsjg));
            this.f734ojitshcjhn.crxdokpmqz(5);
            this.f731iobyxmoadg.ppxfxbqfkf(j14, this.f734ojitshcjhn);
        }
    }

    private void nufgyqmvbu(byte[] bArr, int i13, int i14) {
        this.f728eablkybsjg.eablkybsjg(bArr, i13, i14);
        if (!this.f730gxszxtbevo) {
            this.f733nufgyqmvbu.iobyxmoadg(bArr, i13, i14);
            this.f727dxjokdxxww.iobyxmoadg(bArr, i13, i14);
            this.f725btonecajqb.iobyxmoadg(bArr, i13, i14);
        }
        this.f729gtknphoqwx.iobyxmoadg(bArr, i13, i14);
        this.f726draadjrbmk.iobyxmoadg(bArr, i13, i14);
    }

    private void zoijcleaow() {
        y2.iobyxmoadg.dxjokdxxww(this.f737wkgbmnqykc);
        stevsuqkhv.nufgyqmvbu(this.f728eablkybsjg);
    }

    @Override // a5.wflxmlrfwp
    public void eablkybsjg(long j13, int i13) {
        this.f724agtfadlqog = j13;
    }

    @Override // a5.wflxmlrfwp
    public void gxszxtbevo(t3.oxmwwwfdhm oxmwwwfdhmVar, jpowsppfya.wkgbmnqykc wkgbmnqykcVar) {
        wkgbmnqykcVar.iobyxmoadg();
        this.f735ppxfxbqfkf = wkgbmnqykcVar.zoijcleaow();
        dsvhmnatus dsvhmnatusVarKcexrzcfyt = oxmwwwfdhmVar.kcexrzcfyt(wkgbmnqykcVar.ppxfxbqfkf(), 2);
        this.f737wkgbmnqykc = dsvhmnatusVarKcexrzcfyt;
        this.f728eablkybsjg = new iobyxmoadg(dsvhmnatusVarKcexrzcfyt);
        this.f731iobyxmoadg.wkgbmnqykc(oxmwwwfdhmVar, wkgbmnqykcVar);
    }

    @Override // a5.wflxmlrfwp
    public void iobyxmoadg(y2.yadqdtsiqt yadqdtsiqtVar) {
        int i13;
        zoijcleaow();
        while (yadqdtsiqtVar.iobyxmoadg() > 0) {
            int iGxszxtbevo = yadqdtsiqtVar.gxszxtbevo();
            int iLqeggnwhkg = yadqdtsiqtVar.lqeggnwhkg();
            byte[] bArrEablkybsjg = yadqdtsiqtVar.eablkybsjg();
            this.f736wflxmlrfwp += (long) yadqdtsiqtVar.iobyxmoadg();
            this.f737wkgbmnqykc.lqeggnwhkg(yadqdtsiqtVar, yadqdtsiqtVar.iobyxmoadg());
            while (iGxszxtbevo < iLqeggnwhkg) {
                int iEablkybsjg = z2.gxszxtbevo.eablkybsjg(bArrEablkybsjg, iGxszxtbevo, iLqeggnwhkg, this.f732lqeggnwhkg);
                if (iEablkybsjg == iLqeggnwhkg) {
                    nufgyqmvbu(bArrEablkybsjg, iGxszxtbevo, iLqeggnwhkg);
                    return;
                }
                int iDxjokdxxww = z2.gxszxtbevo.dxjokdxxww(bArrEablkybsjg, iEablkybsjg);
                if (iEablkybsjg <= 0 || bArrEablkybsjg[iEablkybsjg - 1] != 0) {
                    i13 = 3;
                } else {
                    iEablkybsjg--;
                    i13 = 4;
                }
                int i14 = iEablkybsjg;
                int i15 = i13;
                int i16 = i14 - iGxszxtbevo;
                if (i16 > 0) {
                    nufgyqmvbu(bArrEablkybsjg, iGxszxtbevo, i14);
                }
                int i17 = iLqeggnwhkg - i14;
                long j13 = this.f736wflxmlrfwp - ((long) i17);
                lqeggnwhkg(j13, i17, i16 < 0 ? -i16 : 0, this.f724agtfadlqog);
                btonecajqb(j13, i17, iDxjokdxxww, this.f724agtfadlqog);
                iGxszxtbevo = i14 + i15;
            }
        }
    }

    @Override // a5.wflxmlrfwp
    public void ppxfxbqfkf() {
        this.f736wflxmlrfwp = 0L;
        this.f724agtfadlqog = -9223372036854775807L;
        z2.gxszxtbevo.ppxfxbqfkf(this.f732lqeggnwhkg);
        this.f733nufgyqmvbu.wkgbmnqykc();
        this.f727dxjokdxxww.wkgbmnqykc();
        this.f725btonecajqb.wkgbmnqykc();
        this.f729gtknphoqwx.wkgbmnqykc();
        this.f726draadjrbmk.wkgbmnqykc();
        this.f731iobyxmoadg.zoijcleaow();
        iobyxmoadg iobyxmoadgVar = this.f728eablkybsjg;
        if (iobyxmoadgVar != null) {
            iobyxmoadgVar.gxszxtbevo();
        }
    }

    @Override // a5.wflxmlrfwp
    public void wkgbmnqykc(boolean z13) {
        zoijcleaow();
        if (z13) {
            this.f731iobyxmoadg.eablkybsjg();
            lqeggnwhkg(this.f736wflxmlrfwp, 0, 0, this.f724agtfadlqog);
            btonecajqb(this.f736wflxmlrfwp, 0, 48, this.f724agtfadlqog);
        }
    }
}
