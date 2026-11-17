package androidx.biometric;

import android.content.DialogInterface;
import android.os.Handler;
import android.os.Looper;
import androidx.lifecycle.cqumvgiudr;
import androidx.lifecycle.ntlheqmsrt;
import androidx.lifecycle.pmvmpeiblj;
import java.lang.ref.WeakReference;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public class gxszxtbevo extends ntlheqmsrt {

    /* JADX INFO: renamed from: agtfadlqog, reason: collision with root package name */
    private boolean f3574agtfadlqog;

    /* JADX INFO: renamed from: btonecajqb, reason: collision with root package name */
    private boolean f3575btonecajqb;

    /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
    private pmvmpeiblj f3576cqumvgiudr;

    /* JADX INFO: renamed from: draadjrbmk, reason: collision with root package name */
    private boolean f3577draadjrbmk;

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private androidx.biometric.iobyxmoadg f3579eablkybsjg;

    /* JADX INFO: renamed from: gtknphoqwx, reason: collision with root package name */
    private boolean f3580gtknphoqwx;

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    private lqeggnwhkg f3581gxszxtbevo;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private Executor f3582iobyxmoadg;

    /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
    private pmvmpeiblj f3583iwizpuwonk;

    /* JADX INFO: renamed from: kcexrzcfyt, reason: collision with root package name */
    private pmvmpeiblj f3585kcexrzcfyt;

    /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
    private DialogInterface.OnClickListener f3586lqeggnwhkg;

    /* JADX INFO: renamed from: nufgyqmvbu, reason: collision with root package name */
    private CharSequence f3587nufgyqmvbu;

    /* JADX INFO: renamed from: ojitshcjhn, reason: collision with root package name */
    private pmvmpeiblj f3588ojitshcjhn;

    /* JADX INFO: renamed from: oxmwwwfdhm, reason: collision with root package name */
    private pmvmpeiblj f3589oxmwwwfdhm;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private eablkybsjg.wkgbmnqykc f3590ppxfxbqfkf;

    /* JADX INFO: renamed from: rgvfuqvkyq, reason: collision with root package name */
    private pmvmpeiblj f3591rgvfuqvkyq;

    /* JADX INFO: renamed from: vdvldrhtss, reason: collision with root package name */
    private pmvmpeiblj f3592vdvldrhtss;

    /* JADX INFO: renamed from: wflxmlrfwp, reason: collision with root package name */
    private boolean f3593wflxmlrfwp;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private eablkybsjg.ppxfxbqfkf f3594wkgbmnqykc;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    private pmvmpeiblj f3595yggfygwlhe;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private eablkybsjg.iobyxmoadg f3597zoijcleaow;

    /* JADX INFO: renamed from: dxjokdxxww, reason: collision with root package name */
    private int f3578dxjokdxxww = 0;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    private boolean f3596zdlpuopuiu = true;

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
    private int f3584jyumaefscl = 0;

    class iobyxmoadg extends eablkybsjg.iobyxmoadg {
        iobyxmoadg() {
        }
    }

    private static class ppxfxbqfkf implements Executor {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        private final Handler f3599zdlpuopuiu = new Handler(Looper.getMainLooper());

        ppxfxbqfkf() {
        }

        @Override // java.util.concurrent.Executor
        public void execute(Runnable runnable) {
            this.f3599zdlpuopuiu.post(runnable);
        }
    }

    private static class wkgbmnqykc implements DialogInterface.OnClickListener {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        private final WeakReference f3600zdlpuopuiu;

        wkgbmnqykc(gxszxtbevo gxszxtbevoVar) {
            this.f3600zdlpuopuiu = new WeakReference(gxszxtbevoVar);
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i13) {
            if (this.f3600zdlpuopuiu.get() != null) {
                ((gxszxtbevo) this.f3600zdlpuopuiu.get()).iyctptxqzt(true);
            }
        }
    }

    private static final class zoijcleaow extends androidx.biometric.iobyxmoadg.wkgbmnqykc {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final WeakReference f3601iobyxmoadg;

        zoijcleaow(gxszxtbevo gxszxtbevoVar) {
            this.f3601iobyxmoadg = new WeakReference(gxszxtbevoVar);
        }

        @Override // androidx.biometric.iobyxmoadg.wkgbmnqykc
        void iobyxmoadg(int i13, CharSequence charSequence) {
            if (this.f3601iobyxmoadg.get() == null || ((gxszxtbevo) this.f3601iobyxmoadg.get()).mbcevpiqjq() || !((gxszxtbevo) this.f3601iobyxmoadg.get()).stevsuqkhv()) {
                return;
            }
            ((gxszxtbevo) this.f3601iobyxmoadg.get()).vipkmwdibw(new androidx.biometric.ppxfxbqfkf(i13, charSequence));
        }

        @Override // androidx.biometric.iobyxmoadg.wkgbmnqykc
        void ppxfxbqfkf(CharSequence charSequence) {
            if (this.f3601iobyxmoadg.get() != null) {
                ((gxszxtbevo) this.f3601iobyxmoadg.get()).ikoacuggdj(charSequence);
            }
        }

        @Override // androidx.biometric.iobyxmoadg.wkgbmnqykc
        void wkgbmnqykc(eablkybsjg.zoijcleaow zoijcleaowVar) {
            if (this.f3601iobyxmoadg.get() == null || !((gxszxtbevo) this.f3601iobyxmoadg.get()).stevsuqkhv()) {
                return;
            }
            if (zoijcleaowVar.iobyxmoadg() == -1) {
                zoijcleaowVar = new eablkybsjg.zoijcleaow(zoijcleaowVar.zoijcleaow(), ((gxszxtbevo) this.f3601iobyxmoadg.get()).zynmafqrjb());
            }
            ((gxszxtbevo) this.f3601iobyxmoadg.get()).okpsazkaxt(zoijcleaowVar);
        }

        @Override // androidx.biometric.iobyxmoadg.wkgbmnqykc
        void zoijcleaow() {
            if (this.f3601iobyxmoadg.get() == null || !((gxszxtbevo) this.f3601iobyxmoadg.get()).stevsuqkhv()) {
                return;
            }
            ((gxszxtbevo) this.f3601iobyxmoadg.get()).jhduphickx(true);
        }
    }

    private static void nuxfzjnpeb(pmvmpeiblj pmvmpeibljVar, Object obj) {
        if (Thread.currentThread() == Looper.getMainLooper().getThread()) {
            pmvmpeibljVar.ojitshcjhn(obj);
        } else {
            pmvmpeibljVar.wflxmlrfwp(obj);
        }
    }

    pmvmpeiblj agtfadlqog() {
        if (this.f3591rgvfuqvkyq == null) {
            this.f3591rgvfuqvkyq = new pmvmpeiblj();
        }
        return this.f3591rgvfuqvkyq;
    }

    void bfopjjpdmp(int i13) {
        if (this.f3583iwizpuwonk == null) {
            this.f3583iwizpuwonk = new pmvmpeiblj();
        }
        nuxfzjnpeb(this.f3583iwizpuwonk, Integer.valueOf(i13));
    }

    DialogInterface.OnClickListener cdpycssgdh() {
        if (this.f3586lqeggnwhkg == null) {
            this.f3586lqeggnwhkg = new wkgbmnqykc(this);
        }
        return this.f3586lqeggnwhkg;
    }

    CharSequence cllcsxoeiz() {
        eablkybsjg.wkgbmnqykc wkgbmnqykcVar = this.f3590ppxfxbqfkf;
        if (wkgbmnqykcVar != null) {
            return wkgbmnqykcVar.eablkybsjg();
        }
        return null;
    }

    CharSequence cqumvgiudr() {
        eablkybsjg.wkgbmnqykc wkgbmnqykcVar = this.f3590ppxfxbqfkf;
        if (wkgbmnqykcVar != null) {
            return wkgbmnqykcVar.zoijcleaow();
        }
        return null;
    }

    boolean crxdokpmqz() {
        return this.f3574agtfadlqog;
    }

    void czzsidtyhn(boolean z13) {
        this.f3577draadjrbmk = z13;
    }

    androidx.biometric.iobyxmoadg draadjrbmk() {
        if (this.f3579eablkybsjg == null) {
            this.f3579eablkybsjg = new androidx.biometric.iobyxmoadg(new zoijcleaow(this));
        }
        return this.f3579eablkybsjg;
    }

    cqumvgiudr esjtqupxsv() {
        if (this.f3576cqumvgiudr == null) {
            this.f3576cqumvgiudr = new pmvmpeiblj();
        }
        return this.f3576cqumvgiudr;
    }

    int gtknphoqwx() {
        eablkybsjg.wkgbmnqykc wkgbmnqykcVar = this.f3590ppxfxbqfkf;
        if (wkgbmnqykcVar != null) {
            return androidx.biometric.zoijcleaow.zoijcleaow(wkgbmnqykcVar, this.f3594wkgbmnqykc);
        }
        return 0;
    }

    void ikoacuggdj(CharSequence charSequence) {
        if (this.f3592vdvldrhtss == null) {
            this.f3592vdvldrhtss = new pmvmpeiblj();
        }
        nuxfzjnpeb(this.f3592vdvldrhtss, charSequence);
    }

    eablkybsjg.ppxfxbqfkf iwizpuwonk() {
        return this.f3594wkgbmnqykc;
    }

    void iyctptxqzt(boolean z13) {
        if (this.f3585kcexrzcfyt == null) {
            this.f3585kcexrzcfyt = new pmvmpeiblj();
        }
        nuxfzjnpeb(this.f3585kcexrzcfyt, Boolean.valueOf(z13));
    }

    void jhduphickx(boolean z13) {
        if (this.f3589oxmwwwfdhm == null) {
            this.f3589oxmwwwfdhm = new pmvmpeiblj();
        }
        nuxfzjnpeb(this.f3589oxmwwwfdhm, Boolean.valueOf(z13));
    }

    cqumvgiudr jlmebxxoox() {
        if (this.f3585kcexrzcfyt == null) {
            this.f3585kcexrzcfyt = new pmvmpeiblj();
        }
        return this.f3585kcexrzcfyt;
    }

    CharSequence jpowsppfya() {
        eablkybsjg.wkgbmnqykc wkgbmnqykcVar = this.f3590ppxfxbqfkf;
        if (wkgbmnqykcVar != null) {
            return wkgbmnqykcVar.wkgbmnqykc();
        }
        return null;
    }

    Executor jyumaefscl() {
        Executor executor = this.f3582iobyxmoadg;
        return executor != null ? executor : new ppxfxbqfkf();
    }

    void jztzpxfvev(boolean z13) {
        this.f3580gtknphoqwx = z13;
    }

    boolean kegysxyocb() {
        eablkybsjg.wkgbmnqykc wkgbmnqykcVar = this.f3590ppxfxbqfkf;
        return wkgbmnqykcVar == null || wkgbmnqykcVar.gxszxtbevo();
    }

    int lereixgezr() {
        return this.f3584jyumaefscl;
    }

    void lrnfpwlwnk(eablkybsjg.wkgbmnqykc wkgbmnqykcVar) {
        this.f3590ppxfxbqfkf = wkgbmnqykcVar;
    }

    boolean mbcevpiqjq() {
        return this.f3577draadjrbmk;
    }

    void metgxyhuhe(eablkybsjg.iobyxmoadg iobyxmoadgVar) {
        this.f3597zoijcleaow = iobyxmoadgVar;
    }

    boolean ntlheqmsrt() {
        return this.f3593wflxmlrfwp;
    }

    void oipsdeybqn(int i13) {
        this.f3584jyumaefscl = i13;
    }

    cqumvgiudr ojitshcjhn() {
        if (this.f3592vdvldrhtss == null) {
            this.f3592vdvldrhtss = new pmvmpeiblj();
        }
        return this.f3592vdvldrhtss;
    }

    void okpsazkaxt(eablkybsjg.zoijcleaow zoijcleaowVar) {
        if (this.f3588ojitshcjhn == null) {
            this.f3588ojitshcjhn = new pmvmpeiblj();
        }
        nuxfzjnpeb(this.f3588ojitshcjhn, zoijcleaowVar);
    }

    void opjhrmiecq(boolean z13) {
        this.f3574agtfadlqog = z13;
    }

    int oxmwwwfdhm() {
        return this.f3578dxjokdxxww;
    }

    CharSequence pkzmftpjix() {
        CharSequence charSequence = this.f3587nufgyqmvbu;
        if (charSequence != null) {
            return charSequence;
        }
        eablkybsjg.wkgbmnqykc wkgbmnqykcVar = this.f3590ppxfxbqfkf;
        if (wkgbmnqykcVar != null) {
            return wkgbmnqykcVar.ppxfxbqfkf();
        }
        return null;
    }

    cqumvgiudr pmvmpeiblj() {
        if (this.f3583iwizpuwonk == null) {
            this.f3583iwizpuwonk = new pmvmpeiblj();
        }
        return this.f3583iwizpuwonk;
    }

    boolean ribwqtqdhb() {
        return this.f3575btonecajqb;
    }

    void rlfsiqarku(Executor executor) {
        this.f3582iobyxmoadg = executor;
    }

    void sflfametgt(boolean z13) {
        this.f3596zdlpuopuiu = z13;
    }

    boolean sopmlzcsov() {
        return this.f3596zdlpuopuiu;
    }

    boolean stevsuqkhv() {
        return this.f3580gtknphoqwx;
    }

    cqumvgiudr ulzqkzuiru() {
        if (this.f3595yggfygwlhe == null) {
            this.f3595yggfygwlhe = new pmvmpeiblj();
        }
        return this.f3595yggfygwlhe;
    }

    void uwvvkdfqfp(eablkybsjg.ppxfxbqfkf ppxfxbqfkfVar) {
        this.f3594wkgbmnqykc = ppxfxbqfkfVar;
    }

    cqumvgiudr vdvldrhtss() {
        if (this.f3588ojitshcjhn == null) {
            this.f3588ojitshcjhn = new pmvmpeiblj();
        }
        return this.f3588ojitshcjhn;
    }

    void vipkmwdibw(androidx.biometric.ppxfxbqfkf ppxfxbqfkfVar) {
        if (this.f3591rgvfuqvkyq == null) {
            this.f3591rgvfuqvkyq = new pmvmpeiblj();
        }
        nuxfzjnpeb(this.f3591rgvfuqvkyq, ppxfxbqfkfVar);
    }

    void weqkydbzbr(CharSequence charSequence) {
        this.f3587nufgyqmvbu = charSequence;
    }

    cqumvgiudr wypolnanlu() {
        if (this.f3589oxmwwwfdhm == null) {
            this.f3589oxmwwwfdhm = new pmvmpeiblj();
        }
        return this.f3589oxmwwwfdhm;
    }

    void xrmfcynszj(int i13) {
        this.f3578dxjokdxxww = i13;
    }

    void ydmasvzmpa(boolean z13) {
        if (this.f3595yggfygwlhe == null) {
            this.f3595yggfygwlhe = new pmvmpeiblj();
        }
        nuxfzjnpeb(this.f3595yggfygwlhe, Boolean.valueOf(z13));
    }

    void yfnezrywwk(boolean z13) {
        this.f3593wflxmlrfwp = z13;
    }

    eablkybsjg.iobyxmoadg yggfygwlhe() {
        if (this.f3597zoijcleaow == null) {
            this.f3597zoijcleaow = new iobyxmoadg();
        }
        return this.f3597zoijcleaow;
    }

    lqeggnwhkg zdlpuopuiu() {
        if (this.f3581gxszxtbevo == null) {
            this.f3581gxszxtbevo = new lqeggnwhkg();
        }
        return this.f3581gxszxtbevo;
    }

    void zeieaojujs(boolean z13) {
        this.f3575btonecajqb = z13;
    }

    void zfvoamnweg(CharSequence charSequence) {
        if (this.f3576cqumvgiudr == null) {
            this.f3576cqumvgiudr = new pmvmpeiblj();
        }
        nuxfzjnpeb(this.f3576cqumvgiudr, charSequence);
    }

    int zynmafqrjb() {
        int iGtknphoqwx = gtknphoqwx();
        return (!androidx.biometric.zoijcleaow.wkgbmnqykc(iGtknphoqwx) || androidx.biometric.zoijcleaow.ppxfxbqfkf(iGtknphoqwx)) ? -1 : 2;
    }
}
