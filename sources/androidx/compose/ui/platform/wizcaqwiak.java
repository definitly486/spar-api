package androidx.compose.ui.platform;

import android.os.Build;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import kotlin.KotlinNothingValueException;

/* JADX INFO: loaded from: classes.dex */
public final class wizcaqwiak implements z.bfopjjpdmp {

    /* JADX INFO: renamed from: cllcsxoeiz, reason: collision with root package name */
    private boolean f7100cllcsxoeiz;

    /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
    private tg.iobyxmoadg f7101cqumvgiudr;

    /* JADX INFO: renamed from: dsvhmnatus, reason: collision with root package name */
    private boolean f7102dsvhmnatus;

    /* JADX INFO: renamed from: esjtqupxsv, reason: collision with root package name */
    private long f7103esjtqupxsv;

    /* JADX INFO: renamed from: hcddaimhww, reason: collision with root package name */
    private boolean f7104hcddaimhww;

    /* JADX INFO: renamed from: hkdspvbjdz, reason: collision with root package name */
    private float f7105hkdspvbjdz;

    /* JADX INFO: renamed from: istkbnxepw, reason: collision with root package name */
    private boolean f7107istkbnxepw;

    /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
    private tg.rgvfuqvkyq f7108iwizpuwonk;

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
    private final AndroidComposeView f7110jyumaefscl;

    /* JADX INFO: renamed from: lereixgezr, reason: collision with root package name */
    private boolean f7111lereixgezr;

    /* JADX INFO: renamed from: lmojexxdyd, reason: collision with root package name */
    private int f7112lmojexxdyd;

    /* JADX INFO: renamed from: pkzmftpjix, reason: collision with root package name */
    private boolean f7113pkzmftpjix;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    private final h.auzgnhcxok f7118yggfygwlhe;

    /* JADX INFO: renamed from: ylkuphrtab, reason: collision with root package name */
    private h.ageimvtcrz f7119ylkuphrtab;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    private k.ppxfxbqfkf f7120zdlpuopuiu;

    /* JADX INFO: renamed from: zynmafqrjb, reason: collision with root package name */
    private float[] f7121zynmafqrjb;

    /* JADX INFO: renamed from: pmvmpeiblj, reason: collision with root package name */
    private final float[] f7114pmvmpeiblj = h.hszhottldk.ppxfxbqfkf(null, 1, null);

    /* JADX INFO: renamed from: cdpycssgdh, reason: collision with root package name */
    private w0.wkgbmnqykc f7099cdpycssgdh = w0.gxszxtbevo.zoijcleaow(1.0f, 0.0f, 2, null);

    /* JADX INFO: renamed from: yadqdtsiqt, reason: collision with root package name */
    private w0.zdlpuopuiu f7117yadqdtsiqt = w0.zdlpuopuiu.Ltr;

    /* JADX INFO: renamed from: iozdgvuglv, reason: collision with root package name */
    private final j.iobyxmoadg f7106iozdgvuglv = new j.iobyxmoadg();

    /* JADX INFO: renamed from: wwaezpbzkn, reason: collision with root package name */
    private long f7115wwaezpbzkn = androidx.compose.ui.graphics.btonecajqb.f6294zoijcleaow.iobyxmoadg();

    /* JADX INFO: renamed from: jpowsppfya, reason: collision with root package name */
    private boolean f7109jpowsppfya = true;

    /* JADX INFO: renamed from: wypolnanlu, reason: collision with root package name */
    private final tg.draadjrbmk f7116wypolnanlu = new iobyxmoadg();

    static final class iobyxmoadg extends kotlin.jvm.internal.jyumaefscl implements tg.draadjrbmk {
        iobyxmoadg() {
            super(1);
        }

        @Override // tg.draadjrbmk
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            iobyxmoadg((j.gxszxtbevo) obj);
            return gg.wwaezpbzkn.f37140iobyxmoadg;
        }

        public final void iobyxmoadg(j.gxszxtbevo gxszxtbevoVar) {
            wizcaqwiak wizcaqwiakVar = wizcaqwiak.this;
            h.metgxyhuhe metgxyhuheVarGxszxtbevo = gxszxtbevoVar.K().gxszxtbevo();
            tg.rgvfuqvkyq rgvfuqvkyqVar = wizcaqwiakVar.f7108iwizpuwonk;
            if (rgvfuqvkyqVar != null) {
                rgvfuqvkyqVar.invoke(metgxyhuheVarGxszxtbevo, gxszxtbevoVar.K().dxjokdxxww());
            }
        }
    }

    public wizcaqwiak(k.ppxfxbqfkf ppxfxbqfkfVar, h.auzgnhcxok auzgnhcxokVar, AndroidComposeView androidComposeView, tg.rgvfuqvkyq rgvfuqvkyqVar, tg.iobyxmoadg iobyxmoadgVar) {
        this.f7120zdlpuopuiu = ppxfxbqfkfVar;
        this.f7118yggfygwlhe = auzgnhcxokVar;
        this.f7110jyumaefscl = androidComposeView;
        this.f7108iwizpuwonk = rgvfuqvkyqVar;
        this.f7101cqumvgiudr = iobyxmoadgVar;
        long j13 = Integer.MAX_VALUE;
        this.f7103esjtqupxsv = w0.oxmwwwfdhm.ppxfxbqfkf((j13 & 4294967295L) | (j13 << 32));
    }

    private final void jyumaefscl() {
        tg.iobyxmoadg iobyxmoadgVar;
        h.ageimvtcrz ageimvtcrzVar = this.f7119ylkuphrtab;
        if (ageimvtcrzVar == null) {
            return;
        }
        k.eablkybsjg.zoijcleaow(this.f7120zdlpuopuiu, ageimvtcrzVar);
        if (!(ageimvtcrzVar instanceof h.ageimvtcrz.iobyxmoadg) || Build.VERSION.SDK_INT >= 33 || (iobyxmoadgVar = this.f7101cqumvgiudr) == null) {
            return;
        }
        iobyxmoadgVar.invoke();
    }

    private final float[] ojitshcjhn() {
        float[] fArrPpxfxbqfkf = this.f7121zynmafqrjb;
        if (fArrPpxfxbqfkf == null) {
            fArrPpxfxbqfkf = h.hszhottldk.ppxfxbqfkf(null, 1, null);
            this.f7121zynmafqrjb = fArrPpxfxbqfkf;
        }
        if (!this.f7104hcddaimhww) {
            if (Float.isNaN(fArrPpxfxbqfkf[0])) {
                return null;
            }
            return fArrPpxfxbqfkf;
        }
        this.f7104hcddaimhww = false;
        float[] fArrRgvfuqvkyq = rgvfuqvkyq();
        if (this.f7109jpowsppfya) {
            return fArrRgvfuqvkyq;
        }
        if (fmlbqenlif.iobyxmoadg(fArrRgvfuqvkyq, fArrPpxfxbqfkf)) {
            return fArrPpxfxbqfkf;
        }
        fArrPpxfxbqfkf[0] = Float.NaN;
        return null;
    }

    private final float[] rgvfuqvkyq() {
        yggfygwlhe();
        return this.f7114pmvmpeiblj;
    }

    private final void vdvldrhtss(boolean z13) {
        if (z13 != this.f7107istkbnxepw) {
            this.f7107istkbnxepw = z13;
            this.f7110jyumaefscl.ezmngbhpjk(this, z13);
        }
    }

    private final void yggfygwlhe() {
        if (this.f7113pkzmftpjix) {
            k.ppxfxbqfkf ppxfxbqfkfVar = this.f7120zdlpuopuiu;
            long jZoijcleaow = (ppxfxbqfkfVar.rgvfuqvkyq() & 9223372034707292159L) == 9205357640488583168L ? g.draadjrbmk.zoijcleaow(w0.kcexrzcfyt.wkgbmnqykc(this.f7103esjtqupxsv)) : ppxfxbqfkfVar.rgvfuqvkyq();
            h.hszhottldk.dxjokdxxww(this.f7114pmvmpeiblj, Float.intBitsToFloat((int) (jZoijcleaow >> 32)), Float.intBitsToFloat((int) (jZoijcleaow & 4294967295L)), ppxfxbqfkfVar.esjtqupxsv(), ppxfxbqfkfVar.lereixgezr(), 1.0f, ppxfxbqfkfVar.vdvldrhtss(), ppxfxbqfkfVar.oxmwwwfdhm(), ppxfxbqfkfVar.kcexrzcfyt(), ppxfxbqfkfVar.zdlpuopuiu(), ppxfxbqfkfVar.yggfygwlhe(), 1.0f);
            this.f7113pkzmftpjix = false;
            this.f7109jpowsppfya = h.fiwbwshyhd.iobyxmoadg(this.f7114pmvmpeiblj);
        }
    }

    private final void zdlpuopuiu() {
        i0.f6969iobyxmoadg.iobyxmoadg(this.f7110jyumaefscl);
    }

    public float agtfadlqog() {
        return this.f7105hkdspvbjdz;
    }

    @Override // z.bfopjjpdmp
    public void btonecajqb(float[] fArr) {
        float[] fArrOjitshcjhn = ojitshcjhn();
        if (fArrOjitshcjhn != null) {
            h.hszhottldk.draadjrbmk(fArr, fArrOjitshcjhn);
        }
    }

    @Override // z.bfopjjpdmp
    public void destroy() {
        oxmwwwfdhm(0.0f);
        kcexrzcfyt(false);
        this.f7108iwizpuwonk = null;
        this.f7101cqumvgiudr = null;
        this.f7111lereixgezr = true;
        vdvldrhtss(false);
        h.auzgnhcxok auzgnhcxokVar = this.f7118yggfygwlhe;
        if (auzgnhcxokVar != null) {
            auzgnhcxokVar.iobyxmoadg(this.f7120zdlpuopuiu);
            this.f7110jyumaefscl.a(this);
        }
    }

    @Override // z.bfopjjpdmp
    public void draadjrbmk() {
        if (this.f7110jyumaefscl.grlcpdaxtj() && agtfadlqog() != 0.0f) {
            this.f7110jyumaefscl.cdpycssgdh(agtfadlqog());
        }
        if (this.f7107istkbnxepw) {
            if (!androidx.compose.ui.graphics.btonecajqb.eablkybsjg(this.f7115wwaezpbzkn, androidx.compose.ui.graphics.btonecajqb.f6294zoijcleaow.iobyxmoadg()) && !w0.oxmwwwfdhm.eablkybsjg(this.f7120zdlpuopuiu.iwizpuwonk(), this.f7103esjtqupxsv)) {
                k.ppxfxbqfkf ppxfxbqfkfVar = this.f7120zdlpuopuiu;
                float fGxszxtbevo = androidx.compose.ui.graphics.btonecajqb.gxszxtbevo(this.f7115wwaezpbzkn) * ((int) (this.f7103esjtqupxsv >> 32));
                ppxfxbqfkfVar.tzroggbefp(g.eablkybsjg.eablkybsjg((((long) Float.floatToRawIntBits(androidx.compose.ui.graphics.btonecajqb.lqeggnwhkg(this.f7115wwaezpbzkn) * ((int) (this.f7103esjtqupxsv & 4294967295L)))) & 4294967295L) | (Float.floatToRawIntBits(fGxszxtbevo) << 32)));
            }
            this.f7120zdlpuopuiu.iozdgvuglv(this.f7099cdpycssgdh, this.f7117yadqdtsiqt, this.f7103esjtqupxsv, this.f7116wypolnanlu);
            vdvldrhtss(false);
        }
    }

    @Override // z.bfopjjpdmp
    public void dxjokdxxww(androidx.compose.ui.graphics.nufgyqmvbu nufgyqmvbuVar) {
        int iZoijcleaow;
        tg.iobyxmoadg iobyxmoadgVar;
        int iCdpycssgdh = nufgyqmvbuVar.cdpycssgdh() | this.f7112lmojexxdyd;
        this.f7117yadqdtsiqt = nufgyqmvbuVar.zynmafqrjb();
        this.f7099cdpycssgdh = nufgyqmvbuVar.yggfygwlhe();
        int i13 = iCdpycssgdh & 4096;
        if (i13 != 0) {
            this.f7115wwaezpbzkn = nufgyqmvbuVar.lxfrhoxuzk();
        }
        if ((iCdpycssgdh & 1) != 0) {
            this.f7120zdlpuopuiu.vipkmwdibw(nufgyqmvbuVar.cqumvgiudr());
        }
        if ((iCdpycssgdh & 2) != 0) {
            this.f7120zdlpuopuiu.jhduphickx(nufgyqmvbuVar.jpowsppfya());
        }
        if ((iCdpycssgdh & 4) != 0) {
            this.f7120zdlpuopuiu.hcddaimhww(nufgyqmvbuVar.gxszxtbevo());
        }
        if ((iCdpycssgdh & 8) != 0) {
            this.f7120zdlpuopuiu.metgxyhuhe(nufgyqmvbuVar.wwaezpbzkn());
        }
        if ((iCdpycssgdh & 16) != 0) {
            this.f7120zdlpuopuiu.rlfsiqarku(nufgyqmvbuVar.iozdgvuglv());
        }
        if ((iCdpycssgdh & 32) != 0) {
            this.f7120zdlpuopuiu.ikoacuggdj(nufgyqmvbuVar.hkdspvbjdz());
            if (nufgyqmvbuVar.hkdspvbjdz() > 0.0f && !this.f7102dsvhmnatus && (iobyxmoadgVar = this.f7101cqumvgiudr) != null) {
                iobyxmoadgVar.invoke();
            }
        }
        if ((iCdpycssgdh & 64) != 0) {
            this.f7120zdlpuopuiu.jpowsppfya(nufgyqmvbuVar.lqeggnwhkg());
        }
        if ((iCdpycssgdh & UserVerificationMethods.USER_VERIFY_PATTERN) != 0) {
            this.f7120zdlpuopuiu.jztzpxfvev(nufgyqmvbuVar.dsvhmnatus());
        }
        if ((iCdpycssgdh & UserVerificationMethods.USER_VERIFY_ALL) != 0) {
            this.f7120zdlpuopuiu.jlmebxxoox(nufgyqmvbuVar.btonecajqb());
        }
        if ((iCdpycssgdh & UserVerificationMethods.USER_VERIFY_HANDPRINT) != 0) {
            this.f7120zdlpuopuiu.sopmlzcsov(nufgyqmvbuVar.ylkuphrtab());
        }
        if ((iCdpycssgdh & UserVerificationMethods.USER_VERIFY_NONE) != 0) {
            this.f7120zdlpuopuiu.crxdokpmqz(nufgyqmvbuVar.dxjokdxxww());
        }
        if ((iCdpycssgdh & 2048) != 0) {
            this.f7120zdlpuopuiu.cllcsxoeiz(nufgyqmvbuVar.rgvfuqvkyq());
        }
        if (i13 != 0) {
            if (androidx.compose.ui.graphics.btonecajqb.eablkybsjg(this.f7115wwaezpbzkn, androidx.compose.ui.graphics.btonecajqb.f6294zoijcleaow.iobyxmoadg())) {
                this.f7120zdlpuopuiu.tzroggbefp(g.eablkybsjg.f35584zoijcleaow.zoijcleaow());
            } else {
                this.f7120zdlpuopuiu.tzroggbefp(g.eablkybsjg.eablkybsjg((((long) Float.floatToRawIntBits(androidx.compose.ui.graphics.btonecajqb.lqeggnwhkg(this.f7115wwaezpbzkn) * ((int) (this.f7103esjtqupxsv & 4294967295L)))) & 4294967295L) | (((long) Float.floatToRawIntBits(androidx.compose.ui.graphics.btonecajqb.gxszxtbevo(this.f7115wwaezpbzkn) * ((int) (this.f7103esjtqupxsv >> 32)))) << 32)));
            }
        }
        if ((iCdpycssgdh & 16384) != 0) {
            this.f7120zdlpuopuiu.dsvhmnatus(nufgyqmvbuVar.wflxmlrfwp());
        }
        if ((131072 & iCdpycssgdh) != 0) {
            k.ppxfxbqfkf ppxfxbqfkfVar = this.f7120zdlpuopuiu;
            nufgyqmvbuVar.lmojexxdyd();
            ppxfxbqfkfVar.ulzqkzuiru(null);
        }
        if ((262144 & iCdpycssgdh) != 0) {
            this.f7120zdlpuopuiu.wypolnanlu(nufgyqmvbuVar.agtfadlqog());
        }
        if ((524288 & iCdpycssgdh) != 0) {
            this.f7120zdlpuopuiu.hkdspvbjdz(nufgyqmvbuVar.gtknphoqwx());
        }
        if ((32768 & iCdpycssgdh) != 0) {
            k.ppxfxbqfkf ppxfxbqfkfVar2 = this.f7120zdlpuopuiu;
            int iOxmwwwfdhm = nufgyqmvbuVar.oxmwwwfdhm();
            androidx.compose.ui.graphics.eablkybsjg.iobyxmoadg iobyxmoadgVar2 = androidx.compose.ui.graphics.eablkybsjg.f6319iobyxmoadg;
            if (androidx.compose.ui.graphics.eablkybsjg.eablkybsjg(iOxmwwwfdhm, iobyxmoadgVar2.iobyxmoadg())) {
                iZoijcleaow = k.zoijcleaow.f53290iobyxmoadg.iobyxmoadg();
            } else if (androidx.compose.ui.graphics.eablkybsjg.eablkybsjg(iOxmwwwfdhm, iobyxmoadgVar2.ppxfxbqfkf())) {
                iZoijcleaow = k.zoijcleaow.f53290iobyxmoadg.ppxfxbqfkf();
            } else {
                if (!androidx.compose.ui.graphics.eablkybsjg.eablkybsjg(iOxmwwwfdhm, iobyxmoadgVar2.zoijcleaow())) {
                    throw new IllegalStateException("Not supported composition strategy");
                }
                iZoijcleaow = k.zoijcleaow.f53290iobyxmoadg.zoijcleaow();
            }
            ppxfxbqfkfVar2.stevsuqkhv(iZoijcleaow);
        }
        boolean z13 = true;
        if ((iCdpycssgdh & 7963) != 0) {
            this.f7113pkzmftpjix = true;
            this.f7104hcddaimhww = true;
        }
        if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f7119ylkuphrtab, nufgyqmvbuVar.yadqdtsiqt())) {
            z13 = false;
        } else {
            this.f7119ylkuphrtab = nufgyqmvbuVar.yadqdtsiqt();
            jyumaefscl();
        }
        this.f7112lmojexxdyd = nufgyqmvbuVar.cdpycssgdh();
        if (iCdpycssgdh != 0 || z13) {
            zdlpuopuiu();
            if (this.f7110jyumaefscl.grlcpdaxtj()) {
                this.f7110jyumaefscl.cdpycssgdh(agtfadlqog());
            }
        }
    }

    @Override // z.bfopjjpdmp
    public long eablkybsjg(long j13, boolean z13) {
        float[] fArrRgvfuqvkyq;
        if (z13) {
            fArrRgvfuqvkyq = ojitshcjhn();
            if (fArrRgvfuqvkyq == null) {
                return g.eablkybsjg.f35584zoijcleaow.iobyxmoadg();
            }
        } else {
            fArrRgvfuqvkyq = rgvfuqvkyq();
        }
        return this.f7109jpowsppfya ? j13 : h.hszhottldk.gxszxtbevo(fArrRgvfuqvkyq, j13);
    }

    @Override // z.bfopjjpdmp
    public void gtknphoqwx(long j13) {
        if (this.f7110jyumaefscl.grlcpdaxtj()) {
            this.f7110jyumaefscl.cdpycssgdh(a.dxjokdxxww.f16iobyxmoadg.iobyxmoadg());
        }
        this.f7120zdlpuopuiu.xrmfcynszj(j13);
        zdlpuopuiu();
    }

    @Override // z.bfopjjpdmp
    public void gxszxtbevo(long j13) {
        if (w0.oxmwwwfdhm.eablkybsjg(j13, this.f7103esjtqupxsv)) {
            return;
        }
        if (this.f7110jyumaefscl.grlcpdaxtj()) {
            this.f7110jyumaefscl.cdpycssgdh(a.dxjokdxxww.f16iobyxmoadg.iobyxmoadg());
        }
        this.f7103esjtqupxsv = j13;
        invalidate();
    }

    @Override // z.bfopjjpdmp
    public void invalidate() {
        if (this.f7107istkbnxepw || this.f7111lereixgezr) {
            return;
        }
        this.f7110jyumaefscl.invalidate();
        vdvldrhtss(true);
    }

    @Override // z.bfopjjpdmp
    public void iobyxmoadg(float[] fArr) {
        h.hszhottldk.draadjrbmk(fArr, rgvfuqvkyq());
    }

    public void kcexrzcfyt(boolean z13) {
        this.f7100cllcsxoeiz = z13;
    }

    @Override // z.bfopjjpdmp
    public void lqeggnwhkg(h.metgxyhuhe metgxyhuheVar, k.ppxfxbqfkf ppxfxbqfkfVar) {
        draadjrbmk();
        this.f7102dsvhmnatus = this.f7120zdlpuopuiu.jyumaefscl() > 0.0f;
        j.wkgbmnqykc wkgbmnqykcVarK = this.f7106iozdgvuglv.K();
        wkgbmnqykcVarK.lqeggnwhkg(metgxyhuheVar);
        wkgbmnqykcVarK.eablkybsjg(ppxfxbqfkfVar);
        k.eablkybsjg.iobyxmoadg(this.f7106iozdgvuglv, this.f7120zdlpuopuiu);
    }

    @Override // z.bfopjjpdmp
    public boolean nufgyqmvbu(long j13) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j13 >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j13 & 4294967295L));
        if (this.f7120zdlpuopuiu.draadjrbmk()) {
            return l.ppxfxbqfkf(this.f7120zdlpuopuiu.ojitshcjhn(), fIntBitsToFloat, fIntBitsToFloat2, null, null, 24, null);
        }
        return true;
    }

    public void oxmwwwfdhm(float f13) {
        this.f7105hkdspvbjdz = f13;
    }

    @Override // z.bfopjjpdmp
    public void ppxfxbqfkf(g.ppxfxbqfkf ppxfxbqfkfVar, boolean z13) {
        float[] fArrOjitshcjhn = z13 ? ojitshcjhn() : rgvfuqvkyq();
        if (this.f7109jpowsppfya) {
            return;
        }
        if (fArrOjitshcjhn == null) {
            ppxfxbqfkfVar.lqeggnwhkg(0.0f, 0.0f, 0.0f, 0.0f);
        } else {
            h.hszhottldk.lqeggnwhkg(fArrOjitshcjhn, ppxfxbqfkfVar);
        }
    }

    @Override // z.bfopjjpdmp
    public float[] wkgbmnqykc() {
        return rgvfuqvkyq();
    }

    @Override // z.bfopjjpdmp
    public void zoijcleaow(tg.rgvfuqvkyq rgvfuqvkyqVar, tg.iobyxmoadg iobyxmoadgVar) {
        h.auzgnhcxok auzgnhcxokVar = this.f7118yggfygwlhe;
        if (auzgnhcxokVar == null) {
            w.iobyxmoadg.ppxfxbqfkf("currently reuse is only supported when we manage the layer lifecycle");
            throw new KotlinNothingValueException();
        }
        if (!this.f7120zdlpuopuiu.pmvmpeiblj()) {
            w.iobyxmoadg.iobyxmoadg("layer should have been released before reuse");
        }
        this.f7120zdlpuopuiu = auzgnhcxokVar.zoijcleaow();
        this.f7111lereixgezr = false;
        this.f7108iwizpuwonk = rgvfuqvkyqVar;
        this.f7101cqumvgiudr = iobyxmoadgVar;
        this.f7113pkzmftpjix = false;
        this.f7104hcddaimhww = false;
        this.f7109jpowsppfya = true;
        h.hszhottldk.nufgyqmvbu(this.f7114pmvmpeiblj);
        float[] fArr = this.f7121zynmafqrjb;
        if (fArr != null) {
            h.hszhottldk.nufgyqmvbu(fArr);
        }
        this.f7115wwaezpbzkn = androidx.compose.ui.graphics.btonecajqb.f6294zoijcleaow.iobyxmoadg();
        this.f7102dsvhmnatus = false;
        long j13 = Integer.MAX_VALUE;
        this.f7103esjtqupxsv = w0.oxmwwwfdhm.ppxfxbqfkf((j13 & 4294967295L) | (j13 << 32));
        this.f7119ylkuphrtab = null;
        this.f7112lmojexxdyd = 0;
    }
}
