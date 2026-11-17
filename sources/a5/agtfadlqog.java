package a5;

import android.util.Pair;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import java.util.Arrays;
import java.util.Collections;
import t3.dsvhmnatus;
import y2.stevsuqkhv;

/* JADX INFO: loaded from: classes.dex */
public final class agtfadlqog implements wflxmlrfwp {

    /* JADX INFO: renamed from: oxmwwwfdhm, reason: collision with root package name */
    private static final double[] f390oxmwwwfdhm = {23.976023976023978d, 24.0d, 25.0d, 29.97002997002997d, 30.0d, 50.0d, 59.94005994005994d, 60.0d};

    /* JADX INFO: renamed from: agtfadlqog, reason: collision with root package name */
    private long f391agtfadlqog;

    /* JADX INFO: renamed from: btonecajqb, reason: collision with root package name */
    private boolean f392btonecajqb;

    /* JADX INFO: renamed from: draadjrbmk, reason: collision with root package name */
    private long f393draadjrbmk;

    /* JADX INFO: renamed from: dxjokdxxww, reason: collision with root package name */
    private long f394dxjokdxxww;

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private final y2.yadqdtsiqt f395eablkybsjg;

    /* JADX INFO: renamed from: gtknphoqwx, reason: collision with root package name */
    private boolean f396gtknphoqwx;

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    private final iwizpuwonk f397gxszxtbevo;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private String f398iobyxmoadg;

    /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
    private final boolean[] f399lqeggnwhkg;

    /* JADX INFO: renamed from: nufgyqmvbu, reason: collision with root package name */
    private final iobyxmoadg f400nufgyqmvbu;

    /* JADX INFO: renamed from: ojitshcjhn, reason: collision with root package name */
    private long f401ojitshcjhn;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final cllcsxoeiz f402ppxfxbqfkf;

    /* JADX INFO: renamed from: rgvfuqvkyq, reason: collision with root package name */
    private boolean f403rgvfuqvkyq;

    /* JADX INFO: renamed from: vdvldrhtss, reason: collision with root package name */
    private boolean f404vdvldrhtss;

    /* JADX INFO: renamed from: wflxmlrfwp, reason: collision with root package name */
    private long f405wflxmlrfwp;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final String f406wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private dsvhmnatus f407zoijcleaow;

    private static final class iobyxmoadg {

        /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
        private static final byte[] f408eablkybsjg = {0, 0, 1};

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private boolean f409iobyxmoadg;

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        public int f410ppxfxbqfkf;

        /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
        public byte[] f411wkgbmnqykc;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        public int f412zoijcleaow;

        public iobyxmoadg(int i13) {
            this.f411wkgbmnqykc = new byte[i13];
        }

        public void iobyxmoadg(byte[] bArr, int i13, int i14) {
            if (this.f409iobyxmoadg) {
                int i15 = i14 - i13;
                byte[] bArr2 = this.f411wkgbmnqykc;
                int length = bArr2.length;
                int i16 = this.f412zoijcleaow;
                if (length < i16 + i15) {
                    this.f411wkgbmnqykc = Arrays.copyOf(bArr2, (i16 + i15) * 2);
                }
                System.arraycopy(bArr, i13, this.f411wkgbmnqykc, this.f412zoijcleaow, i15);
                this.f412zoijcleaow += i15;
            }
        }

        public void ppxfxbqfkf() {
            this.f409iobyxmoadg = false;
            this.f412zoijcleaow = 0;
            this.f410ppxfxbqfkf = 0;
        }

        public boolean zoijcleaow(int i13, int i14) {
            if (this.f409iobyxmoadg) {
                int i15 = this.f412zoijcleaow - i14;
                this.f412zoijcleaow = i15;
                if (this.f410ppxfxbqfkf != 0 || i13 != 181) {
                    this.f409iobyxmoadg = false;
                    return true;
                }
                this.f410ppxfxbqfkf = i15;
            } else if (i13 == 179) {
                this.f409iobyxmoadg = true;
            }
            byte[] bArr = f408eablkybsjg;
            iobyxmoadg(bArr, 0, bArr.length);
            return false;
        }
    }

    public agtfadlqog(String str) {
        this(null, str);
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0077  */
    /* JADX WARN: Code duplicated, block: B:16:0x007c  */
    /* JADX WARN: Code duplicated, block: B:18:0x008b  */
    /* JADX WARN: Code duplicated, block: B:20:0x009c  */
    private static Pair zoijcleaow(iobyxmoadg iobyxmoadgVar, String str, String str2) {
        float f13;
        int i13;
        float f14;
        int i14;
        long j13;
        double[] dArr;
        double d13;
        int i15;
        int i16;
        byte[] bArrCopyOf = Arrays.copyOf(iobyxmoadgVar.f411wkgbmnqykc, iobyxmoadgVar.f412zoijcleaow);
        int i17 = bArrCopyOf[4] & 255;
        byte b13 = bArrCopyOf[5];
        int i18 = (i17 << 4) | ((b13 & 255) >> 4);
        int i19 = ((b13 & 15) << 8) | (bArrCopyOf[6] & 255);
        int i23 = (bArrCopyOf[7] & 240) >> 4;
        if (i23 == 2) {
            f13 = i19 * 4;
            i13 = i18 * 3;
        } else {
            if (i23 != 3) {
                if (i23 != 4) {
                    f14 = 1.0f;
                } else {
                    f13 = i19 * 121;
                    i13 = i18 * 100;
                }
                androidx.media3.common.iobyxmoadg iobyxmoadgVarCllcsxoeiz = new androidx.media3.common.iobyxmoadg.zoijcleaow().xrmfcynszj(str).ntlheqmsrt(str2).zeieaojujs("video/mpeg2").auzgnhcxok(i18).okpsazkaxt(i19).opjhrmiecq(f14).metgxyhuhe(Collections.singletonList(bArrCopyOf)).cllcsxoeiz();
                i14 = (bArrCopyOf[7] & 15) - 1;
                if (i14 >= 0) {
                    dArr = f390oxmwwwfdhm;
                    if (i14 < dArr.length) {
                        d13 = dArr[i14];
                        byte b14 = bArrCopyOf[iobyxmoadgVar.f410ppxfxbqfkf + 9];
                        i15 = (b14 & 96) >> 5;
                        i16 = b14 & 31;
                        if (i15 != i16) {
                            d13 *= (((double) i15) + 1.0d) / ((double) (i16 + 1));
                        }
                        j13 = (long) (1000000.0d / d13);
                    } else {
                        j13 = 0;
                    }
                } else {
                    j13 = 0;
                }
                return Pair.create(iobyxmoadgVarCllcsxoeiz, Long.valueOf(j13));
            }
            f13 = i19 * 16;
            i13 = i18 * 9;
        }
        f14 = f13 / i13;
        androidx.media3.common.iobyxmoadg iobyxmoadgVarCllcsxoeiz2 = new androidx.media3.common.iobyxmoadg.zoijcleaow().xrmfcynszj(str).ntlheqmsrt(str2).zeieaojujs("video/mpeg2").auzgnhcxok(i18).okpsazkaxt(i19).opjhrmiecq(f14).metgxyhuhe(Collections.singletonList(bArrCopyOf)).cllcsxoeiz();
        i14 = (bArrCopyOf[7] & 15) - 1;
        if (i14 >= 0) {
            dArr = f390oxmwwwfdhm;
            if (i14 < dArr.length) {
                d13 = dArr[i14];
                byte b15 = bArrCopyOf[iobyxmoadgVar.f410ppxfxbqfkf + 9];
                i15 = (b15 & 96) >> 5;
                i16 = b15 & 31;
                if (i15 != i16) {
                    d13 *= (((double) i15) + 1.0d) / ((double) (i16 + 1));
                }
                j13 = (long) (1000000.0d / d13);
            } else {
                j13 = 0;
            }
        } else {
            j13 = 0;
        }
        return Pair.create(iobyxmoadgVarCllcsxoeiz2, Long.valueOf(j13));
    }

    @Override // a5.wflxmlrfwp
    public void eablkybsjg(long j13, int i13) {
        this.f405wflxmlrfwp = j13;
    }

    @Override // a5.wflxmlrfwp
    public void gxszxtbevo(t3.oxmwwwfdhm oxmwwwfdhmVar, jpowsppfya.wkgbmnqykc wkgbmnqykcVar) {
        wkgbmnqykcVar.iobyxmoadg();
        this.f398iobyxmoadg = wkgbmnqykcVar.zoijcleaow();
        this.f407zoijcleaow = oxmwwwfdhmVar.kcexrzcfyt(wkgbmnqykcVar.ppxfxbqfkf(), 2);
        cllcsxoeiz cllcsxoeizVar = this.f402ppxfxbqfkf;
        if (cllcsxoeizVar != null) {
            cllcsxoeizVar.zoijcleaow(oxmwwwfdhmVar, wkgbmnqykcVar);
        }
    }

    /* JADX WARN: Code duplicated, block: B:49:0x0114  */
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
    @Override // a5.wflxmlrfwp
    public void iobyxmoadg(y2.yadqdtsiqt yadqdtsiqtVar) {
        boolean z13;
        int i13;
        y2.iobyxmoadg.dxjokdxxww(this.f407zoijcleaow);
        int iGxszxtbevo = yadqdtsiqtVar.gxszxtbevo();
        int iLqeggnwhkg = yadqdtsiqtVar.lqeggnwhkg();
        byte[] bArrEablkybsjg = yadqdtsiqtVar.eablkybsjg();
        this.f394dxjokdxxww += (long) yadqdtsiqtVar.iobyxmoadg();
        this.f407zoijcleaow.lqeggnwhkg(yadqdtsiqtVar, yadqdtsiqtVar.iobyxmoadg());
        while (true) {
            int iEablkybsjg = z2.gxszxtbevo.eablkybsjg(bArrEablkybsjg, iGxszxtbevo, iLqeggnwhkg, this.f399lqeggnwhkg);
            if (iEablkybsjg == iLqeggnwhkg) {
                break;
            }
            int i14 = iEablkybsjg + 3;
            int i15 = yadqdtsiqtVar.eablkybsjg()[i14] & 255;
            int i16 = iEablkybsjg - iGxszxtbevo;
            if (!this.f396gtknphoqwx) {
                if (i16 > 0) {
                    this.f400nufgyqmvbu.iobyxmoadg(bArrEablkybsjg, iGxszxtbevo, iEablkybsjg);
                }
                if (this.f400nufgyqmvbu.zoijcleaow(i15, i16 < 0 ? -i16 : 0)) {
                    Pair pairZoijcleaow = zoijcleaow(this.f400nufgyqmvbu, (String) y2.iobyxmoadg.eablkybsjg(this.f398iobyxmoadg), this.f406wkgbmnqykc);
                    this.f407zoijcleaow.iobyxmoadg((androidx.media3.common.iobyxmoadg) pairZoijcleaow.first);
                    this.f393draadjrbmk = ((Long) pairZoijcleaow.second).longValue();
                    this.f396gtknphoqwx = true;
                }
            }
            iwizpuwonk iwizpuwonkVar = this.f397gxszxtbevo;
            if (iwizpuwonkVar != null) {
                if (i16 > 0) {
                    iwizpuwonkVar.iobyxmoadg(bArrEablkybsjg, iGxszxtbevo, iEablkybsjg);
                    i13 = 0;
                } else {
                    i13 = -i16;
                }
                if (this.f397gxszxtbevo.zoijcleaow(i13)) {
                    iwizpuwonk iwizpuwonkVar2 = this.f397gxszxtbevo;
                    ((y2.yadqdtsiqt) stevsuqkhv.nufgyqmvbu(this.f395eablkybsjg)).ntlheqmsrt(this.f397gxszxtbevo.f553wkgbmnqykc, z2.gxszxtbevo.jpowsppfya(iwizpuwonkVar2.f553wkgbmnqykc, iwizpuwonkVar2.f550eablkybsjg));
                    ((cllcsxoeiz) stevsuqkhv.nufgyqmvbu(this.f402ppxfxbqfkf)).iobyxmoadg(this.f401ojitshcjhn, this.f395eablkybsjg);
                }
                if (i15 == 178 && yadqdtsiqtVar.eablkybsjg()[iEablkybsjg + 2] == 1) {
                    this.f397gxszxtbevo.eablkybsjg(i15);
                }
            }
            if (i15 == 0 || i15 == 179) {
                int i17 = iLqeggnwhkg - iEablkybsjg;
                if (this.f404vdvldrhtss && this.f396gtknphoqwx) {
                    long j13 = this.f401ojitshcjhn;
                    if (j13 != -9223372036854775807L) {
                        this.f407zoijcleaow.zoijcleaow(j13, this.f403rgvfuqvkyq ? 1 : 0, ((int) (this.f394dxjokdxxww - this.f391agtfadlqog)) - i17, i17, null);
                    }
                }
                if (!this.f392btonecajqb || this.f404vdvldrhtss) {
                    this.f391agtfadlqog = this.f394dxjokdxxww - ((long) i17);
                    long j14 = this.f405wflxmlrfwp;
                    if (j14 == -9223372036854775807L) {
                        long j15 = this.f401ojitshcjhn;
                        j14 = j15 != -9223372036854775807L ? j15 + this.f393draadjrbmk : -9223372036854775807L;
                    }
                    this.f401ojitshcjhn = j14;
                    this.f403rgvfuqvkyq = false;
                    this.f405wflxmlrfwp = -9223372036854775807L;
                    z13 = true;
                    this.f392btonecajqb = true;
                } else {
                    z13 = true;
                }
                this.f404vdvldrhtss = i15 == 0 ? z13 : false;
            } else if (i15 == 184) {
                this.f403rgvfuqvkyq = true;
            }
            iGxszxtbevo = i14;
        }
        if (!this.f396gtknphoqwx) {
            this.f400nufgyqmvbu.iobyxmoadg(bArrEablkybsjg, iGxszxtbevo, iLqeggnwhkg);
        }
        iwizpuwonk iwizpuwonkVar3 = this.f397gxszxtbevo;
        if (iwizpuwonkVar3 != null) {
            iwizpuwonkVar3.iobyxmoadg(bArrEablkybsjg, iGxszxtbevo, iLqeggnwhkg);
        }
    }

    @Override // a5.wflxmlrfwp
    public void ppxfxbqfkf() {
        z2.gxszxtbevo.ppxfxbqfkf(this.f399lqeggnwhkg);
        this.f400nufgyqmvbu.ppxfxbqfkf();
        iwizpuwonk iwizpuwonkVar = this.f397gxszxtbevo;
        if (iwizpuwonkVar != null) {
            iwizpuwonkVar.wkgbmnqykc();
        }
        this.f394dxjokdxxww = 0L;
        this.f392btonecajqb = false;
        this.f405wflxmlrfwp = -9223372036854775807L;
        this.f401ojitshcjhn = -9223372036854775807L;
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
    @Override // a5.wflxmlrfwp
    public void wkgbmnqykc(boolean z13) {
        y2.iobyxmoadg.dxjokdxxww(this.f407zoijcleaow);
        if (z13) {
            boolean z14 = this.f403rgvfuqvkyq;
            this.f407zoijcleaow.zoijcleaow(this.f401ojitshcjhn, z14 ? 1 : 0, (int) (this.f394dxjokdxxww - this.f391agtfadlqog), 0, null);
        }
    }

    agtfadlqog(cllcsxoeiz cllcsxoeizVar, String str) {
        this.f402ppxfxbqfkf = cllcsxoeizVar;
        this.f406wkgbmnqykc = str;
        this.f399lqeggnwhkg = new boolean[4];
        this.f400nufgyqmvbu = new iobyxmoadg(UserVerificationMethods.USER_VERIFY_PATTERN);
        if (cllcsxoeizVar != null) {
            this.f397gxszxtbevo = new iwizpuwonk(178, UserVerificationMethods.USER_VERIFY_PATTERN);
            this.f395eablkybsjg = new y2.yadqdtsiqt();
        } else {
            this.f397gxszxtbevo = null;
            this.f395eablkybsjg = null;
        }
        this.f405wflxmlrfwp = -9223372036854775807L;
        this.f401ojitshcjhn = -9223372036854775807L;
    }
}
