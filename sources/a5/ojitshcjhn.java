package a5;

import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import java.util.Arrays;
import java.util.Collections;
import t3.dsvhmnatus;
import y2.stevsuqkhv;

/* JADX INFO: loaded from: classes.dex */
public final class ojitshcjhn implements wflxmlrfwp {

    /* JADX INFO: renamed from: wflxmlrfwp, reason: collision with root package name */
    private static final float[] f617wflxmlrfwp = {1.0f, 1.0f, 1.0909091f, 0.90909094f, 1.4545455f, 1.2121212f, 1.0f};

    /* JADX INFO: renamed from: btonecajqb, reason: collision with root package name */
    private dsvhmnatus f618btonecajqb;

    /* JADX INFO: renamed from: dxjokdxxww, reason: collision with root package name */
    private String f620dxjokdxxww;

    /* JADX INFO: renamed from: gtknphoqwx, reason: collision with root package name */
    private boolean f622gtknphoqwx;

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    private final iwizpuwonk f623gxszxtbevo;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final cllcsxoeiz f624iobyxmoadg;

    /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
    private zoijcleaow f625lqeggnwhkg;

    /* JADX INFO: renamed from: nufgyqmvbu, reason: collision with root package name */
    private long f626nufgyqmvbu;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final y2.yadqdtsiqt f627ppxfxbqfkf;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final String f629zoijcleaow;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final boolean[] f628wkgbmnqykc = new boolean[4];

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private final iobyxmoadg f621eablkybsjg = new iobyxmoadg(UserVerificationMethods.USER_VERIFY_PATTERN);

    /* JADX INFO: renamed from: draadjrbmk, reason: collision with root package name */
    private long f619draadjrbmk = -9223372036854775807L;

    private static final class iobyxmoadg {

        /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
        private static final byte[] f630gxszxtbevo = {0, 0, 1};

        /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
        public byte[] f631eablkybsjg;

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private boolean f632iobyxmoadg;

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        public int f633ppxfxbqfkf;

        /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
        public int f634wkgbmnqykc;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private int f635zoijcleaow;

        public iobyxmoadg(int i13) {
            this.f631eablkybsjg = new byte[i13];
        }

        public void iobyxmoadg(byte[] bArr, int i13, int i14) {
            if (this.f632iobyxmoadg) {
                int i15 = i14 - i13;
                byte[] bArr2 = this.f631eablkybsjg;
                int length = bArr2.length;
                int i16 = this.f633ppxfxbqfkf;
                if (length < i16 + i15) {
                    this.f631eablkybsjg = Arrays.copyOf(bArr2, (i16 + i15) * 2);
                }
                System.arraycopy(bArr, i13, this.f631eablkybsjg, this.f633ppxfxbqfkf, i15);
                this.f633ppxfxbqfkf += i15;
            }
        }

        public void ppxfxbqfkf() {
            this.f632iobyxmoadg = false;
            this.f633ppxfxbqfkf = 0;
            this.f635zoijcleaow = 0;
        }

        public boolean zoijcleaow(int i13, int i14) {
            int i15 = this.f635zoijcleaow;
            if (i15 != 0) {
                if (i15 != 1) {
                    if (i15 != 2) {
                        if (i15 != 3) {
                            if (i15 != 4) {
                                throw new IllegalStateException();
                            }
                            if (i13 == 179 || i13 == 181) {
                                this.f633ppxfxbqfkf -= i14;
                                this.f632iobyxmoadg = false;
                                return true;
                            }
                        } else if ((i13 & 240) != 32) {
                            y2.kcexrzcfyt.nufgyqmvbu("H263Reader", "Unexpected start code value");
                            ppxfxbqfkf();
                        } else {
                            this.f634wkgbmnqykc = this.f633ppxfxbqfkf;
                            this.f635zoijcleaow = 4;
                        }
                    } else if (i13 > 31) {
                        y2.kcexrzcfyt.nufgyqmvbu("H263Reader", "Unexpected start code value");
                        ppxfxbqfkf();
                    } else {
                        this.f635zoijcleaow = 3;
                    }
                } else if (i13 != 181) {
                    y2.kcexrzcfyt.nufgyqmvbu("H263Reader", "Unexpected start code value");
                    ppxfxbqfkf();
                } else {
                    this.f635zoijcleaow = 2;
                }
            } else if (i13 == 176) {
                this.f635zoijcleaow = 1;
                this.f632iobyxmoadg = true;
            }
            byte[] bArr = f630gxszxtbevo;
            iobyxmoadg(bArr, 0, bArr.length);
            return false;
        }
    }

    private static final class zoijcleaow {

        /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
        private int f636eablkybsjg;

        /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
        private int f637gxszxtbevo;

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final dsvhmnatus f638iobyxmoadg;

        /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
        private long f639lqeggnwhkg;

        /* JADX INFO: renamed from: nufgyqmvbu, reason: collision with root package name */
        private long f640nufgyqmvbu;

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        private boolean f641ppxfxbqfkf;

        /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
        private boolean f642wkgbmnqykc;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private boolean f643zoijcleaow;

        public zoijcleaow(dsvhmnatus dsvhmnatusVar) {
            this.f638iobyxmoadg = dsvhmnatusVar;
        }

        public void iobyxmoadg(byte[] bArr, int i13, int i14) {
            if (this.f641ppxfxbqfkf) {
                int i15 = this.f637gxszxtbevo;
                int i16 = (i13 + 1) - i15;
                if (i16 >= i14) {
                    this.f637gxszxtbevo = i15 + (i14 - i13);
                } else {
                    this.f642wkgbmnqykc = ((bArr[i16] & 192) >> 6) == 0;
                    this.f641ppxfxbqfkf = false;
                }
            }
        }

        public void ppxfxbqfkf(int i13, long j13) {
            this.f636eablkybsjg = i13;
            this.f642wkgbmnqykc = false;
            this.f643zoijcleaow = i13 == 182 || i13 == 179;
            this.f641ppxfxbqfkf = i13 == 182;
            this.f637gxszxtbevo = 0;
            this.f640nufgyqmvbu = j13;
        }

        public void wkgbmnqykc() {
            this.f643zoijcleaow = false;
            this.f641ppxfxbqfkf = false;
            this.f642wkgbmnqykc = false;
            this.f636eablkybsjg = -1;
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
        public void zoijcleaow(long j13, int i13, boolean z13) {
            y2.iobyxmoadg.lqeggnwhkg(this.f640nufgyqmvbu != -9223372036854775807L);
            if (this.f636eablkybsjg == 182 && z13 && this.f643zoijcleaow) {
                this.f638iobyxmoadg.zoijcleaow(this.f640nufgyqmvbu, this.f642wkgbmnqykc ? 1 : 0, (int) (j13 - this.f639lqeggnwhkg), i13, null);
            }
            if (this.f636eablkybsjg != 179) {
                this.f639lqeggnwhkg = j13;
            }
        }
    }

    ojitshcjhn(cllcsxoeiz cllcsxoeizVar, String str) {
        this.f624iobyxmoadg = cllcsxoeizVar;
        this.f629zoijcleaow = str;
        if (cllcsxoeizVar != null) {
            this.f623gxszxtbevo = new iwizpuwonk(178, UserVerificationMethods.USER_VERIFY_PATTERN);
            this.f627ppxfxbqfkf = new y2.yadqdtsiqt();
        } else {
            this.f623gxszxtbevo = null;
            this.f627ppxfxbqfkf = null;
        }
    }

    private static androidx.media3.common.iobyxmoadg zoijcleaow(iobyxmoadg iobyxmoadgVar, int i13, String str, String str2) {
        byte[] bArrCopyOf = Arrays.copyOf(iobyxmoadgVar.f631eablkybsjg, iobyxmoadgVar.f633ppxfxbqfkf);
        y2.cdpycssgdh cdpycssgdhVar = new y2.cdpycssgdh(bArrCopyOf);
        cdpycssgdhVar.kcexrzcfyt(i13);
        cdpycssgdhVar.kcexrzcfyt(4);
        cdpycssgdhVar.vdvldrhtss();
        cdpycssgdhVar.oxmwwwfdhm(8);
        if (cdpycssgdhVar.lqeggnwhkg()) {
            cdpycssgdhVar.oxmwwwfdhm(4);
            cdpycssgdhVar.oxmwwwfdhm(3);
        }
        int iNufgyqmvbu = cdpycssgdhVar.nufgyqmvbu(4);
        float f13 = 1.0f;
        if (iNufgyqmvbu == 15) {
            int iNufgyqmvbu2 = cdpycssgdhVar.nufgyqmvbu(8);
            int iNufgyqmvbu3 = cdpycssgdhVar.nufgyqmvbu(8);
            if (iNufgyqmvbu3 == 0) {
                y2.kcexrzcfyt.nufgyqmvbu("H263Reader", "Invalid aspect ratio");
            } else {
                f13 = iNufgyqmvbu2 / iNufgyqmvbu3;
            }
        } else {
            float[] fArr = f617wflxmlrfwp;
            if (iNufgyqmvbu < fArr.length) {
                f13 = fArr[iNufgyqmvbu];
            } else {
                y2.kcexrzcfyt.nufgyqmvbu("H263Reader", "Invalid aspect ratio");
            }
        }
        if (cdpycssgdhVar.lqeggnwhkg()) {
            cdpycssgdhVar.oxmwwwfdhm(2);
            cdpycssgdhVar.oxmwwwfdhm(1);
            if (cdpycssgdhVar.lqeggnwhkg()) {
                cdpycssgdhVar.oxmwwwfdhm(15);
                cdpycssgdhVar.vdvldrhtss();
                cdpycssgdhVar.oxmwwwfdhm(15);
                cdpycssgdhVar.vdvldrhtss();
                cdpycssgdhVar.oxmwwwfdhm(15);
                cdpycssgdhVar.vdvldrhtss();
                cdpycssgdhVar.oxmwwwfdhm(3);
                cdpycssgdhVar.oxmwwwfdhm(11);
                cdpycssgdhVar.vdvldrhtss();
                cdpycssgdhVar.oxmwwwfdhm(15);
                cdpycssgdhVar.vdvldrhtss();
            }
        }
        if (cdpycssgdhVar.nufgyqmvbu(2) != 0) {
            y2.kcexrzcfyt.nufgyqmvbu("H263Reader", "Unhandled video object layer shape");
        }
        cdpycssgdhVar.vdvldrhtss();
        int iNufgyqmvbu4 = cdpycssgdhVar.nufgyqmvbu(16);
        cdpycssgdhVar.vdvldrhtss();
        if (cdpycssgdhVar.lqeggnwhkg()) {
            if (iNufgyqmvbu4 == 0) {
                y2.kcexrzcfyt.nufgyqmvbu("H263Reader", "Invalid vop_increment_time_resolution");
            } else {
                int i14 = 0;
                for (int i15 = iNufgyqmvbu4 - 1; i15 > 0; i15 >>= 1) {
                    i14++;
                }
                cdpycssgdhVar.oxmwwwfdhm(i14);
            }
        }
        cdpycssgdhVar.vdvldrhtss();
        int iNufgyqmvbu5 = cdpycssgdhVar.nufgyqmvbu(13);
        cdpycssgdhVar.vdvldrhtss();
        int iNufgyqmvbu6 = cdpycssgdhVar.nufgyqmvbu(13);
        cdpycssgdhVar.vdvldrhtss();
        cdpycssgdhVar.vdvldrhtss();
        return new androidx.media3.common.iobyxmoadg.zoijcleaow().xrmfcynszj(str).ntlheqmsrt(str2).zeieaojujs("video/mp4v-es").auzgnhcxok(iNufgyqmvbu5).okpsazkaxt(iNufgyqmvbu6).opjhrmiecq(f13).metgxyhuhe(Collections.singletonList(bArrCopyOf)).cllcsxoeiz();
    }

    @Override // a5.wflxmlrfwp
    public void eablkybsjg(long j13, int i13) {
        this.f619draadjrbmk = j13;
    }

    @Override // a5.wflxmlrfwp
    public void gxszxtbevo(t3.oxmwwwfdhm oxmwwwfdhmVar, jpowsppfya.wkgbmnqykc wkgbmnqykcVar) {
        wkgbmnqykcVar.iobyxmoadg();
        this.f620dxjokdxxww = wkgbmnqykcVar.zoijcleaow();
        dsvhmnatus dsvhmnatusVarKcexrzcfyt = oxmwwwfdhmVar.kcexrzcfyt(wkgbmnqykcVar.ppxfxbqfkf(), 2);
        this.f618btonecajqb = dsvhmnatusVarKcexrzcfyt;
        this.f625lqeggnwhkg = new zoijcleaow(dsvhmnatusVarKcexrzcfyt);
        cllcsxoeiz cllcsxoeizVar = this.f624iobyxmoadg;
        if (cllcsxoeizVar != null) {
            cllcsxoeizVar.zoijcleaow(oxmwwwfdhmVar, wkgbmnqykcVar);
        }
    }

    @Override // a5.wflxmlrfwp
    public void iobyxmoadg(y2.yadqdtsiqt yadqdtsiqtVar) {
        y2.iobyxmoadg.dxjokdxxww(this.f625lqeggnwhkg);
        y2.iobyxmoadg.dxjokdxxww(this.f618btonecajqb);
        int iGxszxtbevo = yadqdtsiqtVar.gxszxtbevo();
        int iLqeggnwhkg = yadqdtsiqtVar.lqeggnwhkg();
        byte[] bArrEablkybsjg = yadqdtsiqtVar.eablkybsjg();
        this.f626nufgyqmvbu += (long) yadqdtsiqtVar.iobyxmoadg();
        this.f618btonecajqb.lqeggnwhkg(yadqdtsiqtVar, yadqdtsiqtVar.iobyxmoadg());
        while (true) {
            int iEablkybsjg = z2.gxszxtbevo.eablkybsjg(bArrEablkybsjg, iGxszxtbevo, iLqeggnwhkg, this.f628wkgbmnqykc);
            if (iEablkybsjg == iLqeggnwhkg) {
                break;
            }
            int i13 = iEablkybsjg + 3;
            int i14 = yadqdtsiqtVar.eablkybsjg()[i13] & 255;
            int i15 = iEablkybsjg - iGxszxtbevo;
            int i16 = 0;
            if (!this.f622gtknphoqwx) {
                if (i15 > 0) {
                    this.f621eablkybsjg.iobyxmoadg(bArrEablkybsjg, iGxszxtbevo, iEablkybsjg);
                }
                if (this.f621eablkybsjg.zoijcleaow(i14, i15 < 0 ? -i15 : 0)) {
                    dsvhmnatus dsvhmnatusVar = this.f618btonecajqb;
                    iobyxmoadg iobyxmoadgVar = this.f621eablkybsjg;
                    dsvhmnatusVar.iobyxmoadg(zoijcleaow(iobyxmoadgVar, iobyxmoadgVar.f634wkgbmnqykc, (String) y2.iobyxmoadg.eablkybsjg(this.f620dxjokdxxww), this.f629zoijcleaow));
                    this.f622gtknphoqwx = true;
                }
            }
            this.f625lqeggnwhkg.iobyxmoadg(bArrEablkybsjg, iGxszxtbevo, iEablkybsjg);
            iwizpuwonk iwizpuwonkVar = this.f623gxszxtbevo;
            if (iwizpuwonkVar != null) {
                if (i15 > 0) {
                    iwizpuwonkVar.iobyxmoadg(bArrEablkybsjg, iGxszxtbevo, iEablkybsjg);
                } else {
                    i16 = -i15;
                }
                if (this.f623gxszxtbevo.zoijcleaow(i16)) {
                    iwizpuwonk iwizpuwonkVar2 = this.f623gxszxtbevo;
                    ((y2.yadqdtsiqt) stevsuqkhv.nufgyqmvbu(this.f627ppxfxbqfkf)).ntlheqmsrt(this.f623gxszxtbevo.f553wkgbmnqykc, z2.gxszxtbevo.jpowsppfya(iwizpuwonkVar2.f553wkgbmnqykc, iwizpuwonkVar2.f550eablkybsjg));
                    ((cllcsxoeiz) stevsuqkhv.nufgyqmvbu(this.f624iobyxmoadg)).iobyxmoadg(this.f619draadjrbmk, this.f627ppxfxbqfkf);
                }
                if (i14 == 178 && yadqdtsiqtVar.eablkybsjg()[iEablkybsjg + 2] == 1) {
                    this.f623gxszxtbevo.eablkybsjg(i14);
                }
            }
            int i17 = iLqeggnwhkg - iEablkybsjg;
            this.f625lqeggnwhkg.zoijcleaow(this.f626nufgyqmvbu - ((long) i17), i17, this.f622gtknphoqwx);
            this.f625lqeggnwhkg.ppxfxbqfkf(i14, this.f619draadjrbmk);
            iGxszxtbevo = i13;
        }
        if (!this.f622gtknphoqwx) {
            this.f621eablkybsjg.iobyxmoadg(bArrEablkybsjg, iGxszxtbevo, iLqeggnwhkg);
        }
        this.f625lqeggnwhkg.iobyxmoadg(bArrEablkybsjg, iGxszxtbevo, iLqeggnwhkg);
        iwizpuwonk iwizpuwonkVar3 = this.f623gxszxtbevo;
        if (iwizpuwonkVar3 != null) {
            iwizpuwonkVar3.iobyxmoadg(bArrEablkybsjg, iGxszxtbevo, iLqeggnwhkg);
        }
    }

    @Override // a5.wflxmlrfwp
    public void ppxfxbqfkf() {
        z2.gxszxtbevo.ppxfxbqfkf(this.f628wkgbmnqykc);
        this.f621eablkybsjg.ppxfxbqfkf();
        zoijcleaow zoijcleaowVar = this.f625lqeggnwhkg;
        if (zoijcleaowVar != null) {
            zoijcleaowVar.wkgbmnqykc();
        }
        iwizpuwonk iwizpuwonkVar = this.f623gxszxtbevo;
        if (iwizpuwonkVar != null) {
            iwizpuwonkVar.wkgbmnqykc();
        }
        this.f626nufgyqmvbu = 0L;
        this.f619draadjrbmk = -9223372036854775807L;
    }

    @Override // a5.wflxmlrfwp
    public void wkgbmnqykc(boolean z13) {
        y2.iobyxmoadg.dxjokdxxww(this.f625lqeggnwhkg);
        if (z13) {
            this.f625lqeggnwhkg.zoijcleaow(this.f626nufgyqmvbu, 0, this.f622gtknphoqwx);
            this.f625lqeggnwhkg.wkgbmnqykc();
        }
    }
}
