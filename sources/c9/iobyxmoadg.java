package c9;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import com.bumptech.glide.btonecajqb;
import com.bumptech.glide.load.resource.bitmap.agtfadlqog;
import com.bumptech.glide.load.resource.bitmap.kcexrzcfyt;
import com.bumptech.glide.load.resource.bitmap.vdvldrhtss;
import com.bumptech.glide.load.resource.bitmap.wflxmlrfwp;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import g9.draadjrbmk;
import java.util.Map;
import l8.gtknphoqwx;

/* JADX INFO: loaded from: classes2.dex */
public abstract class iobyxmoadg implements Cloneable {

    /* JADX INFO: renamed from: cllcsxoeiz, reason: collision with root package name */
    private Resources.Theme f19260cllcsxoeiz;

    /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
    private Drawable f19261cqumvgiudr;

    /* JADX INFO: renamed from: dsvhmnatus, reason: collision with root package name */
    private boolean f19262dsvhmnatus;

    /* JADX INFO: renamed from: esjtqupxsv, reason: collision with root package name */
    private int f19263esjtqupxsv;

    /* JADX INFO: renamed from: hkdspvbjdz, reason: collision with root package name */
    private boolean f19265hkdspvbjdz;

    /* JADX INFO: renamed from: iozdgvuglv, reason: collision with root package name */
    private boolean f19266iozdgvuglv;

    /* JADX INFO: renamed from: lereixgezr, reason: collision with root package name */
    private Drawable f19272lereixgezr;

    /* JADX INFO: renamed from: pmvmpeiblj, reason: collision with root package name */
    private int f19275pmvmpeiblj;

    /* JADX INFO: renamed from: stevsuqkhv, reason: collision with root package name */
    private boolean f19276stevsuqkhv;

    /* JADX INFO: renamed from: tzroggbefp, reason: collision with root package name */
    private boolean f19277tzroggbefp;

    /* JADX INFO: renamed from: wwaezpbzkn, reason: collision with root package name */
    private Drawable f19278wwaezpbzkn;

    /* JADX INFO: renamed from: wypolnanlu, reason: collision with root package name */
    private boolean f19279wypolnanlu;

    /* JADX INFO: renamed from: ylkuphrtab, reason: collision with root package name */
    private int f19282ylkuphrtab;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    private int f19283zdlpuopuiu;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    private float f19281yggfygwlhe = 1.0f;

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
    private n8.iobyxmoadg f19270jyumaefscl = n8.iobyxmoadg.f69346eablkybsjg;

    /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
    private btonecajqb f19268iwizpuwonk = btonecajqb.NORMAL;

    /* JADX INFO: renamed from: zynmafqrjb, reason: collision with root package name */
    private boolean f19284zynmafqrjb = true;

    /* JADX INFO: renamed from: istkbnxepw, reason: collision with root package name */
    private int f19267istkbnxepw = -1;

    /* JADX INFO: renamed from: cdpycssgdh, reason: collision with root package name */
    private int f19259cdpycssgdh = -1;

    /* JADX INFO: renamed from: yadqdtsiqt, reason: collision with root package name */
    private l8.eablkybsjg f19280yadqdtsiqt = f9.ppxfxbqfkf.ppxfxbqfkf();

    /* JADX INFO: renamed from: lmojexxdyd, reason: collision with root package name */
    private boolean f19273lmojexxdyd = true;

    /* JADX INFO: renamed from: pkzmftpjix, reason: collision with root package name */
    private l8.lqeggnwhkg f19274pkzmftpjix = new l8.lqeggnwhkg();

    /* JADX INFO: renamed from: hcddaimhww, reason: collision with root package name */
    private Map f19264hcddaimhww = new g9.zoijcleaow();

    /* JADX INFO: renamed from: jpowsppfya, reason: collision with root package name */
    private Class f19269jpowsppfya = Object.class;

    /* JADX INFO: renamed from: kegysxyocb, reason: collision with root package name */
    private boolean f19271kegysxyocb = true;

    private static boolean hkdspvbjdz(int i13, int i14) {
        return (i13 & i14) != 0;
    }

    private boolean jpowsppfya(int i13) {
        return hkdspvbjdz(this.f19283zdlpuopuiu, i13);
    }

    private iobyxmoadg jztzpxfvev(agtfadlqog agtfadlqogVar, gtknphoqwx gtknphoqwxVar, boolean z13) {
        iobyxmoadg iobyxmoadgVarSflfametgt = z13 ? sflfametgt(agtfadlqogVar, gtknphoqwxVar) : crxdokpmqz(agtfadlqogVar, gtknphoqwxVar);
        iobyxmoadgVarSflfametgt.f19271kegysxyocb = true;
        return iobyxmoadgVarSflfametgt;
    }

    private iobyxmoadg okpsazkaxt(agtfadlqog agtfadlqogVar, gtknphoqwx gtknphoqwxVar) {
        return jztzpxfvev(agtfadlqogVar, gtknphoqwxVar, true);
    }

    private iobyxmoadg sopmlzcsov(agtfadlqog agtfadlqogVar, gtknphoqwx gtknphoqwxVar) {
        return jztzpxfvev(agtfadlqogVar, gtknphoqwxVar, false);
    }

    private iobyxmoadg xrmfcynszj() {
        return this;
    }

    public final int agtfadlqog() {
        return this.f19263esjtqupxsv;
    }

    iobyxmoadg bfopjjpdmp(gtknphoqwx gtknphoqwxVar, boolean z13) {
        if (this.f19262dsvhmnatus) {
            return clone().bfopjjpdmp(gtknphoqwxVar, z13);
        }
        vdvldrhtss vdvldrhtssVar = new vdvldrhtss(gtknphoqwxVar, z13);
        zfvoamnweg(Bitmap.class, gtknphoqwxVar, z13);
        zfvoamnweg(Drawable.class, vdvldrhtssVar, z13);
        zfvoamnweg(BitmapDrawable.class, vdvldrhtssVar.ppxfxbqfkf(), z13);
        zfvoamnweg(x8.ppxfxbqfkf.class, new x8.gxszxtbevo(gtknphoqwxVar), z13);
        return metgxyhuhe();
    }

    public final boolean cdpycssgdh() {
        return this.f19277tzroggbefp;
    }

    public final boolean cllcsxoeiz() {
        return this.f19273lmojexxdyd;
    }

    public final btonecajqb cqumvgiudr() {
        return this.f19268iwizpuwonk;
    }

    final iobyxmoadg crxdokpmqz(agtfadlqog agtfadlqogVar, gtknphoqwx gtknphoqwxVar) {
        if (this.f19262dsvhmnatus) {
            return clone().crxdokpmqz(agtfadlqogVar, gtknphoqwxVar);
        }
        lqeggnwhkg(agtfadlqogVar);
        return bfopjjpdmp(gtknphoqwxVar, false);
    }

    public iobyxmoadg czzsidtyhn(l8.eablkybsjg eablkybsjgVar) {
        if (this.f19262dsvhmnatus) {
            return clone().czzsidtyhn(eablkybsjgVar);
        }
        this.f19280yadqdtsiqt = (l8.eablkybsjg) g9.gtknphoqwx.eablkybsjg(eablkybsjgVar);
        this.f19283zdlpuopuiu |= UserVerificationMethods.USER_VERIFY_ALL;
        return metgxyhuhe();
    }

    public iobyxmoadg draadjrbmk() {
        return okpsazkaxt(agtfadlqog.f21050ppxfxbqfkf, new kcexrzcfyt());
    }

    public final boolean dsvhmnatus() {
        return this.f19266iozdgvuglv;
    }

    public iobyxmoadg eablkybsjg(Class cls) {
        if (this.f19262dsvhmnatus) {
            return clone().eablkybsjg(cls);
        }
        this.f19269jpowsppfya = (Class) g9.gtknphoqwx.eablkybsjg(cls);
        this.f19283zdlpuopuiu |= 4096;
        return metgxyhuhe();
    }

    public boolean equals(Object obj) {
        if (obj instanceof iobyxmoadg) {
            return lmojexxdyd((iobyxmoadg) obj);
        }
        return false;
    }

    public final Class esjtqupxsv() {
        return this.f19269jpowsppfya;
    }

    public iobyxmoadg gtknphoqwx(Drawable drawable) {
        if (this.f19262dsvhmnatus) {
            return clone().gtknphoqwx(drawable);
        }
        this.f19261cqumvgiudr = drawable;
        int i13 = this.f19283zdlpuopuiu | 16;
        this.f19263esjtqupxsv = 0;
        this.f19283zdlpuopuiu = i13 & (-33);
        return metgxyhuhe();
    }

    public iobyxmoadg gxszxtbevo(n8.iobyxmoadg iobyxmoadgVar) {
        if (this.f19262dsvhmnatus) {
            return clone().gxszxtbevo(iobyxmoadgVar);
        }
        this.f19270jyumaefscl = (n8.iobyxmoadg) g9.gtknphoqwx.eablkybsjg(iobyxmoadgVar);
        this.f19283zdlpuopuiu |= 4;
        return metgxyhuhe();
    }

    public int hashCode() {
        return draadjrbmk.ojitshcjhn(this.f19260cllcsxoeiz, draadjrbmk.ojitshcjhn(this.f19280yadqdtsiqt, draadjrbmk.ojitshcjhn(this.f19269jpowsppfya, draadjrbmk.ojitshcjhn(this.f19264hcddaimhww, draadjrbmk.ojitshcjhn(this.f19274pkzmftpjix, draadjrbmk.ojitshcjhn(this.f19268iwizpuwonk, draadjrbmk.ojitshcjhn(this.f19270jyumaefscl, draadjrbmk.rgvfuqvkyq(this.f19276stevsuqkhv, draadjrbmk.rgvfuqvkyq(this.f19279wypolnanlu, draadjrbmk.rgvfuqvkyq(this.f19273lmojexxdyd, draadjrbmk.rgvfuqvkyq(this.f19266iozdgvuglv, draadjrbmk.agtfadlqog(this.f19259cdpycssgdh, draadjrbmk.agtfadlqog(this.f19267istkbnxepw, draadjrbmk.rgvfuqvkyq(this.f19284zynmafqrjb, draadjrbmk.ojitshcjhn(this.f19278wwaezpbzkn, draadjrbmk.agtfadlqog(this.f19282ylkuphrtab, draadjrbmk.ojitshcjhn(this.f19272lereixgezr, draadjrbmk.agtfadlqog(this.f19275pmvmpeiblj, draadjrbmk.ojitshcjhn(this.f19261cqumvgiudr, draadjrbmk.agtfadlqog(this.f19263esjtqupxsv, draadjrbmk.draadjrbmk(this.f19281yggfygwlhe)))))))))))))))))))));
    }

    boolean hcddaimhww() {
        return this.f19271kegysxyocb;
    }

    iobyxmoadg ikoacuggdj(l8.gxszxtbevo gxszxtbevoVar) {
        if (this.f19262dsvhmnatus) {
            return clone().ikoacuggdj(gxszxtbevoVar);
        }
        this.f19274pkzmftpjix.eablkybsjg(gxszxtbevoVar);
        return metgxyhuhe();
    }

    public iobyxmoadg iobyxmoadg(iobyxmoadg iobyxmoadgVar) {
        if (this.f19262dsvhmnatus) {
            return clone().iobyxmoadg(iobyxmoadgVar);
        }
        if (hkdspvbjdz(iobyxmoadgVar.f19283zdlpuopuiu, 2)) {
            this.f19281yggfygwlhe = iobyxmoadgVar.f19281yggfygwlhe;
        }
        if (hkdspvbjdz(iobyxmoadgVar.f19283zdlpuopuiu, 262144)) {
            this.f19279wypolnanlu = iobyxmoadgVar.f19279wypolnanlu;
        }
        if (hkdspvbjdz(iobyxmoadgVar.f19283zdlpuopuiu, 1048576)) {
            this.f19277tzroggbefp = iobyxmoadgVar.f19277tzroggbefp;
        }
        if (hkdspvbjdz(iobyxmoadgVar.f19283zdlpuopuiu, 4)) {
            this.f19270jyumaefscl = iobyxmoadgVar.f19270jyumaefscl;
        }
        if (hkdspvbjdz(iobyxmoadgVar.f19283zdlpuopuiu, 8)) {
            this.f19268iwizpuwonk = iobyxmoadgVar.f19268iwizpuwonk;
        }
        if (hkdspvbjdz(iobyxmoadgVar.f19283zdlpuopuiu, 16)) {
            this.f19261cqumvgiudr = iobyxmoadgVar.f19261cqumvgiudr;
            this.f19263esjtqupxsv = 0;
            this.f19283zdlpuopuiu &= -33;
        }
        if (hkdspvbjdz(iobyxmoadgVar.f19283zdlpuopuiu, 32)) {
            this.f19263esjtqupxsv = iobyxmoadgVar.f19263esjtqupxsv;
            this.f19261cqumvgiudr = null;
            this.f19283zdlpuopuiu &= -17;
        }
        if (hkdspvbjdz(iobyxmoadgVar.f19283zdlpuopuiu, 64)) {
            this.f19272lereixgezr = iobyxmoadgVar.f19272lereixgezr;
            this.f19275pmvmpeiblj = 0;
            this.f19283zdlpuopuiu &= -129;
        }
        if (hkdspvbjdz(iobyxmoadgVar.f19283zdlpuopuiu, UserVerificationMethods.USER_VERIFY_PATTERN)) {
            this.f19275pmvmpeiblj = iobyxmoadgVar.f19275pmvmpeiblj;
            this.f19272lereixgezr = null;
            this.f19283zdlpuopuiu &= -65;
        }
        if (hkdspvbjdz(iobyxmoadgVar.f19283zdlpuopuiu, UserVerificationMethods.USER_VERIFY_HANDPRINT)) {
            this.f19284zynmafqrjb = iobyxmoadgVar.f19284zynmafqrjb;
        }
        if (hkdspvbjdz(iobyxmoadgVar.f19283zdlpuopuiu, UserVerificationMethods.USER_VERIFY_NONE)) {
            this.f19259cdpycssgdh = iobyxmoadgVar.f19259cdpycssgdh;
            this.f19267istkbnxepw = iobyxmoadgVar.f19267istkbnxepw;
        }
        if (hkdspvbjdz(iobyxmoadgVar.f19283zdlpuopuiu, UserVerificationMethods.USER_VERIFY_ALL)) {
            this.f19280yadqdtsiqt = iobyxmoadgVar.f19280yadqdtsiqt;
        }
        if (hkdspvbjdz(iobyxmoadgVar.f19283zdlpuopuiu, 4096)) {
            this.f19269jpowsppfya = iobyxmoadgVar.f19269jpowsppfya;
        }
        if (hkdspvbjdz(iobyxmoadgVar.f19283zdlpuopuiu, 8192)) {
            this.f19278wwaezpbzkn = iobyxmoadgVar.f19278wwaezpbzkn;
            this.f19282ylkuphrtab = 0;
            this.f19283zdlpuopuiu &= -16385;
        }
        if (hkdspvbjdz(iobyxmoadgVar.f19283zdlpuopuiu, 16384)) {
            this.f19282ylkuphrtab = iobyxmoadgVar.f19282ylkuphrtab;
            this.f19278wwaezpbzkn = null;
            this.f19283zdlpuopuiu &= -8193;
        }
        if (hkdspvbjdz(iobyxmoadgVar.f19283zdlpuopuiu, 32768)) {
            this.f19260cllcsxoeiz = iobyxmoadgVar.f19260cllcsxoeiz;
        }
        if (hkdspvbjdz(iobyxmoadgVar.f19283zdlpuopuiu, 65536)) {
            this.f19273lmojexxdyd = iobyxmoadgVar.f19273lmojexxdyd;
        }
        if (hkdspvbjdz(iobyxmoadgVar.f19283zdlpuopuiu, 131072)) {
            this.f19266iozdgvuglv = iobyxmoadgVar.f19266iozdgvuglv;
        }
        if (hkdspvbjdz(iobyxmoadgVar.f19283zdlpuopuiu, 2048)) {
            this.f19264hcddaimhww.putAll(iobyxmoadgVar.f19264hcddaimhww);
            this.f19271kegysxyocb = iobyxmoadgVar.f19271kegysxyocb;
        }
        if (hkdspvbjdz(iobyxmoadgVar.f19283zdlpuopuiu, 524288)) {
            this.f19276stevsuqkhv = iobyxmoadgVar.f19276stevsuqkhv;
        }
        if (!this.f19273lmojexxdyd) {
            this.f19264hcddaimhww.clear();
            int i13 = this.f19283zdlpuopuiu;
            this.f19266iozdgvuglv = false;
            this.f19283zdlpuopuiu = i13 & (-133121);
            this.f19271kegysxyocb = true;
        }
        this.f19283zdlpuopuiu |= iobyxmoadgVar.f19283zdlpuopuiu;
        this.f19274pkzmftpjix.wkgbmnqykc(iobyxmoadgVar.f19274pkzmftpjix);
        return metgxyhuhe();
    }

    protected final boolean iozdgvuglv() {
        return this.f19262dsvhmnatus;
    }

    public final Map istkbnxepw() {
        return this.f19264hcddaimhww;
    }

    public final int iwizpuwonk() {
        return this.f19275pmvmpeiblj;
    }

    public iobyxmoadg jhduphickx(btonecajqb btonecajqbVar) {
        if (this.f19262dsvhmnatus) {
            return clone().jhduphickx(btonecajqbVar);
        }
        this.f19268iwizpuwonk = (btonecajqb) g9.gtknphoqwx.eablkybsjg(btonecajqbVar);
        this.f19283zdlpuopuiu |= 8;
        return metgxyhuhe();
    }

    public iobyxmoadg jlmebxxoox(int i13, int i14) {
        if (this.f19262dsvhmnatus) {
            return clone().jlmebxxoox(i13, i14);
        }
        this.f19259cdpycssgdh = i13;
        this.f19267istkbnxepw = i14;
        this.f19283zdlpuopuiu |= UserVerificationMethods.USER_VERIFY_NONE;
        return metgxyhuhe();
    }

    public final Drawable jyumaefscl() {
        return this.f19272lereixgezr;
    }

    public final l8.lqeggnwhkg kcexrzcfyt() {
        return this.f19274pkzmftpjix;
    }

    public final l8.eablkybsjg lereixgezr() {
        return this.f19280yadqdtsiqt;
    }

    public final boolean lmojexxdyd(iobyxmoadg iobyxmoadgVar) {
        return Float.compare(iobyxmoadgVar.f19281yggfygwlhe, this.f19281yggfygwlhe) == 0 && this.f19263esjtqupxsv == iobyxmoadgVar.f19263esjtqupxsv && draadjrbmk.wkgbmnqykc(this.f19261cqumvgiudr, iobyxmoadgVar.f19261cqumvgiudr) && this.f19275pmvmpeiblj == iobyxmoadgVar.f19275pmvmpeiblj && draadjrbmk.wkgbmnqykc(this.f19272lereixgezr, iobyxmoadgVar.f19272lereixgezr) && this.f19282ylkuphrtab == iobyxmoadgVar.f19282ylkuphrtab && draadjrbmk.wkgbmnqykc(this.f19278wwaezpbzkn, iobyxmoadgVar.f19278wwaezpbzkn) && this.f19284zynmafqrjb == iobyxmoadgVar.f19284zynmafqrjb && this.f19267istkbnxepw == iobyxmoadgVar.f19267istkbnxepw && this.f19259cdpycssgdh == iobyxmoadgVar.f19259cdpycssgdh && this.f19266iozdgvuglv == iobyxmoadgVar.f19266iozdgvuglv && this.f19273lmojexxdyd == iobyxmoadgVar.f19273lmojexxdyd && this.f19279wypolnanlu == iobyxmoadgVar.f19279wypolnanlu && this.f19276stevsuqkhv == iobyxmoadgVar.f19276stevsuqkhv && this.f19270jyumaefscl.equals(iobyxmoadgVar.f19270jyumaefscl) && this.f19268iwizpuwonk == iobyxmoadgVar.f19268iwizpuwonk && this.f19274pkzmftpjix.equals(iobyxmoadgVar.f19274pkzmftpjix) && this.f19264hcddaimhww.equals(iobyxmoadgVar.f19264hcddaimhww) && this.f19269jpowsppfya.equals(iobyxmoadgVar.f19269jpowsppfya) && draadjrbmk.wkgbmnqykc(this.f19280yadqdtsiqt, iobyxmoadgVar.f19280yadqdtsiqt) && draadjrbmk.wkgbmnqykc(this.f19260cllcsxoeiz, iobyxmoadgVar.f19260cllcsxoeiz);
    }

    public iobyxmoadg lqeggnwhkg(agtfadlqog agtfadlqogVar) {
        return rlfsiqarku(agtfadlqog.f21049nufgyqmvbu, (agtfadlqog) g9.gtknphoqwx.eablkybsjg(agtfadlqogVar));
    }

    public iobyxmoadg mbcevpiqjq() {
        return crxdokpmqz(agtfadlqog.f21045eablkybsjg, new com.bumptech.glide.load.resource.bitmap.draadjrbmk());
    }

    protected final iobyxmoadg metgxyhuhe() {
        if (this.f19265hkdspvbjdz) {
            throw new IllegalStateException("You cannot modify locked T, consider clone()");
        }
        return xrmfcynszj();
    }

    public iobyxmoadg ntlheqmsrt() {
        return sopmlzcsov(agtfadlqog.f21051wkgbmnqykc, new wflxmlrfwp());
    }

    public iobyxmoadg nufgyqmvbu(int i13) {
        if (this.f19262dsvhmnatus) {
            return clone().nufgyqmvbu(i13);
        }
        this.f19263esjtqupxsv = i13;
        int i14 = this.f19283zdlpuopuiu | 32;
        this.f19261cqumvgiudr = null;
        this.f19283zdlpuopuiu = i14 & (-17);
        return metgxyhuhe();
    }

    public iobyxmoadg oipsdeybqn(gtknphoqwx gtknphoqwxVar) {
        return bfopjjpdmp(gtknphoqwxVar, true);
    }

    public final Drawable ojitshcjhn() {
        return this.f19261cqumvgiudr;
    }

    public iobyxmoadg opjhrmiecq(boolean z13) {
        if (this.f19262dsvhmnatus) {
            return clone().opjhrmiecq(z13);
        }
        this.f19277tzroggbefp = z13;
        this.f19283zdlpuopuiu |= 1048576;
        return metgxyhuhe();
    }

    public final boolean oxmwwwfdhm() {
        return this.f19276stevsuqkhv;
    }

    public final boolean pkzmftpjix() {
        return jpowsppfya(8);
    }

    public final float pmvmpeiblj() {
        return this.f19281yggfygwlhe;
    }

    public iobyxmoadg ppxfxbqfkf() {
        return sflfametgt(agtfadlqog.f21045eablkybsjg, new com.bumptech.glide.load.resource.bitmap.draadjrbmk());
    }

    public final Drawable rgvfuqvkyq() {
        return this.f19278wwaezpbzkn;
    }

    public iobyxmoadg ribwqtqdhb(int i13) {
        if (this.f19262dsvhmnatus) {
            return clone().ribwqtqdhb(i13);
        }
        this.f19275pmvmpeiblj = i13;
        int i14 = this.f19283zdlpuopuiu | UserVerificationMethods.USER_VERIFY_PATTERN;
        this.f19272lereixgezr = null;
        this.f19283zdlpuopuiu = i14 & (-65);
        return metgxyhuhe();
    }

    public iobyxmoadg rlfsiqarku(l8.gxszxtbevo gxszxtbevoVar, Object obj) {
        if (this.f19262dsvhmnatus) {
            return clone().rlfsiqarku(gxszxtbevoVar, obj);
        }
        g9.gtknphoqwx.eablkybsjg(gxszxtbevoVar);
        g9.gtknphoqwx.eablkybsjg(obj);
        this.f19274pkzmftpjix.gxszxtbevo(gxszxtbevoVar, obj);
        return metgxyhuhe();
    }

    final iobyxmoadg sflfametgt(agtfadlqog agtfadlqogVar, gtknphoqwx gtknphoqwxVar) {
        if (this.f19262dsvhmnatus) {
            return clone().sflfametgt(agtfadlqogVar, gtknphoqwxVar);
        }
        lqeggnwhkg(agtfadlqogVar);
        return oipsdeybqn(gtknphoqwxVar);
    }

    public final boolean stevsuqkhv() {
        return draadjrbmk.zdlpuopuiu(this.f19259cdpycssgdh, this.f19267istkbnxepw);
    }

    public iobyxmoadg tzroggbefp() {
        this.f19265hkdspvbjdz = true;
        return xrmfcynszj();
    }

    public iobyxmoadg ulzqkzuiru() {
        return sopmlzcsov(agtfadlqog.f21050ppxfxbqfkf, new kcexrzcfyt());
    }

    public iobyxmoadg uwvvkdfqfp(float f13) {
        if (this.f19262dsvhmnatus) {
            return clone().uwvvkdfqfp(f13);
        }
        if (f13 < 0.0f || f13 > 1.0f) {
            throw new IllegalArgumentException("sizeMultiplier must be between 0 and 1");
        }
        this.f19281yggfygwlhe = f13;
        this.f19283zdlpuopuiu |= 2;
        return metgxyhuhe();
    }

    public final int vdvldrhtss() {
        return this.f19282ylkuphrtab;
    }

    public iobyxmoadg vipkmwdibw(Drawable drawable) {
        if (this.f19262dsvhmnatus) {
            return clone().vipkmwdibw(drawable);
        }
        this.f19272lereixgezr = drawable;
        int i13 = this.f19283zdlpuopuiu | 64;
        this.f19275pmvmpeiblj = 0;
        this.f19283zdlpuopuiu = i13 & (-129);
        return metgxyhuhe();
    }

    public final n8.iobyxmoadg wflxmlrfwp() {
        return this.f19270jyumaefscl;
    }

    @Override // 
    /* JADX INFO: renamed from: wkgbmnqykc, reason: merged with bridge method [inline-methods] */
    public iobyxmoadg clone() {
        try {
            iobyxmoadg iobyxmoadgVar = (iobyxmoadg) super.clone();
            l8.lqeggnwhkg lqeggnwhkgVar = new l8.lqeggnwhkg();
            iobyxmoadgVar.f19274pkzmftpjix = lqeggnwhkgVar;
            lqeggnwhkgVar.wkgbmnqykc(this.f19274pkzmftpjix);
            g9.zoijcleaow zoijcleaowVar = new g9.zoijcleaow();
            iobyxmoadgVar.f19264hcddaimhww = zoijcleaowVar;
            zoijcleaowVar.putAll(this.f19264hcddaimhww);
            iobyxmoadgVar.f19265hkdspvbjdz = false;
            iobyxmoadgVar.f19262dsvhmnatus = false;
            return iobyxmoadgVar;
        } catch (CloneNotSupportedException e13) {
            throw new RuntimeException(e13);
        }
    }

    public final boolean wypolnanlu() {
        return jpowsppfya(2048);
    }

    public final boolean yadqdtsiqt() {
        return this.f19279wypolnanlu;
    }

    public iobyxmoadg ydmasvzmpa(Resources.Theme theme) {
        if (this.f19262dsvhmnatus) {
            return clone().ydmasvzmpa(theme);
        }
        this.f19260cllcsxoeiz = theme;
        if (theme != null) {
            this.f19283zdlpuopuiu |= 32768;
            return rlfsiqarku(v8.wflxmlrfwp.f116319zoijcleaow, theme);
        }
        this.f19283zdlpuopuiu &= -32769;
        return ikoacuggdj(v8.wflxmlrfwp.f116319zoijcleaow);
    }

    public iobyxmoadg yfnezrywwk(boolean z13) {
        if (this.f19262dsvhmnatus) {
            return clone().yfnezrywwk(true);
        }
        this.f19284zynmafqrjb = !z13;
        this.f19283zdlpuopuiu |= UserVerificationMethods.USER_VERIFY_HANDPRINT;
        return metgxyhuhe();
    }

    public final int yggfygwlhe() {
        return this.f19259cdpycssgdh;
    }

    public final boolean ylkuphrtab() {
        return this.f19284zynmafqrjb;
    }

    public final int zdlpuopuiu() {
        return this.f19267istkbnxepw;
    }

    iobyxmoadg zfvoamnweg(Class cls, gtknphoqwx gtknphoqwxVar, boolean z13) {
        if (this.f19262dsvhmnatus) {
            return clone().zfvoamnweg(cls, gtknphoqwxVar, z13);
        }
        g9.gtknphoqwx.eablkybsjg(cls);
        g9.gtknphoqwx.eablkybsjg(gtknphoqwxVar);
        this.f19264hcddaimhww.put(cls, gtknphoqwxVar);
        int i13 = this.f19283zdlpuopuiu;
        this.f19273lmojexxdyd = true;
        this.f19283zdlpuopuiu = 67584 | i13;
        this.f19271kegysxyocb = false;
        if (z13) {
            this.f19283zdlpuopuiu = i13 | 198656;
            this.f19266iozdgvuglv = true;
        }
        return metgxyhuhe();
    }

    public iobyxmoadg zoijcleaow() {
        if (this.f19265hkdspvbjdz && !this.f19262dsvhmnatus) {
            throw new IllegalStateException("You cannot auto lock an already locked options object, try clone() first");
        }
        this.f19262dsvhmnatus = true;
        return tzroggbefp();
    }

    public final Resources.Theme zynmafqrjb() {
        return this.f19260cllcsxoeiz;
    }
}
