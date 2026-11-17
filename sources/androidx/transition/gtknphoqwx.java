package androidx.transition;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.TimeInterpolator;
import android.graphics.Path;
import android.os.Build;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowId;
import android.view.animation.AnimationUtils;
import android.widget.ListView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import v1.jhduphickx;

/* JADX INFO: loaded from: classes2.dex */
public abstract class gtknphoqwx implements Cloneable {

    /* JADX INFO: renamed from: cllcsxoeiz, reason: collision with root package name */
    private ArrayList f13467cllcsxoeiz;

    /* JADX INFO: renamed from: dsvhmnatus, reason: collision with root package name */
    private nufgyqmvbu[] f13470dsvhmnatus;

    /* JADX INFO: renamed from: hkdspvbjdz, reason: collision with root package name */
    private ArrayList f13473hkdspvbjdz;

    /* JADX INFO: renamed from: ikoacuggdj, reason: collision with root package name */
    lqeggnwhkg f13474ikoacuggdj;

    /* JADX INFO: renamed from: jhduphickx, reason: collision with root package name */
    long f13478jhduphickx;

    /* JADX INFO: renamed from: jlmebxxoox, reason: collision with root package name */
    private eablkybsjg f13479jlmebxxoox;

    /* JADX INFO: renamed from: okpsazkaxt, reason: collision with root package name */
    long f13487okpsazkaxt;

    /* JADX INFO: renamed from: ribwqtqdhb, reason: collision with root package name */
    private androidx.collection.iobyxmoadg f13490ribwqtqdhb;

    /* JADX INFO: renamed from: jztzpxfvev, reason: collision with root package name */
    private static final Animator[] f13462jztzpxfvev = new Animator[0];

    /* JADX INFO: renamed from: xrmfcynszj, reason: collision with root package name */
    private static final int[] f13465xrmfcynszj = {2, 1, 3, 4};

    /* JADX INFO: renamed from: metgxyhuhe, reason: collision with root package name */
    private static final androidx.transition.lqeggnwhkg f13463metgxyhuhe = new iobyxmoadg();

    /* JADX INFO: renamed from: rlfsiqarku, reason: collision with root package name */
    private static ThreadLocal f13464rlfsiqarku = new ThreadLocal();

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    private String f13501zdlpuopuiu = getClass().getName();

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    private long f13499yggfygwlhe = -1;

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
    long f13481jyumaefscl = -1;

    /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
    private TimeInterpolator f13477iwizpuwonk = null;

    /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
    ArrayList f13468cqumvgiudr = new ArrayList();

    /* JADX INFO: renamed from: esjtqupxsv, reason: collision with root package name */
    ArrayList f13471esjtqupxsv = new ArrayList();

    /* JADX INFO: renamed from: lereixgezr, reason: collision with root package name */
    private ArrayList f13483lereixgezr = null;

    /* JADX INFO: renamed from: pmvmpeiblj, reason: collision with root package name */
    private ArrayList f13489pmvmpeiblj = null;

    /* JADX INFO: renamed from: zynmafqrjb, reason: collision with root package name */
    private ArrayList f13502zynmafqrjb = null;

    /* JADX INFO: renamed from: istkbnxepw, reason: collision with root package name */
    private ArrayList f13476istkbnxepw = null;

    /* JADX INFO: renamed from: cdpycssgdh, reason: collision with root package name */
    private ArrayList f13466cdpycssgdh = null;

    /* JADX INFO: renamed from: yadqdtsiqt, reason: collision with root package name */
    private ArrayList f13498yadqdtsiqt = null;

    /* JADX INFO: renamed from: iozdgvuglv, reason: collision with root package name */
    private ArrayList f13475iozdgvuglv = null;

    /* JADX INFO: renamed from: lmojexxdyd, reason: collision with root package name */
    private ArrayList f13484lmojexxdyd = null;

    /* JADX INFO: renamed from: wwaezpbzkn, reason: collision with root package name */
    private ArrayList f13496wwaezpbzkn = null;

    /* JADX INFO: renamed from: ylkuphrtab, reason: collision with root package name */
    private esjtqupxsv f13500ylkuphrtab = new esjtqupxsv();

    /* JADX INFO: renamed from: pkzmftpjix, reason: collision with root package name */
    private esjtqupxsv f13488pkzmftpjix = new esjtqupxsv();

    /* JADX INFO: renamed from: hcddaimhww, reason: collision with root package name */
    jyumaefscl f13472hcddaimhww = null;

    /* JADX INFO: renamed from: jpowsppfya, reason: collision with root package name */
    private int[] f13480jpowsppfya = f13465xrmfcynszj;

    /* JADX INFO: renamed from: wypolnanlu, reason: collision with root package name */
    boolean f13497wypolnanlu = false;

    /* JADX INFO: renamed from: stevsuqkhv, reason: collision with root package name */
    ArrayList f13492stevsuqkhv = new ArrayList();

    /* JADX INFO: renamed from: kegysxyocb, reason: collision with root package name */
    private Animator[] f13482kegysxyocb = f13462jztzpxfvev;

    /* JADX INFO: renamed from: tzroggbefp, reason: collision with root package name */
    int f13493tzroggbefp = 0;

    /* JADX INFO: renamed from: mbcevpiqjq, reason: collision with root package name */
    private boolean f13485mbcevpiqjq = false;

    /* JADX INFO: renamed from: ntlheqmsrt, reason: collision with root package name */
    boolean f13486ntlheqmsrt = false;

    /* JADX INFO: renamed from: ulzqkzuiru, reason: collision with root package name */
    private gtknphoqwx f13494ulzqkzuiru = null;

    /* JADX INFO: renamed from: sopmlzcsov, reason: collision with root package name */
    private ArrayList f13491sopmlzcsov = null;

    /* JADX INFO: renamed from: crxdokpmqz, reason: collision with root package name */
    ArrayList f13469crxdokpmqz = new ArrayList();

    /* JADX INFO: renamed from: vipkmwdibw, reason: collision with root package name */
    private androidx.transition.lqeggnwhkg f13495vipkmwdibw = f13463metgxyhuhe;

    interface dxjokdxxww {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final dxjokdxxww f13504iobyxmoadg = new dxjokdxxww() { // from class: androidx.transition.wflxmlrfwp
            @Override // androidx.transition.gtknphoqwx.dxjokdxxww
            public final void eablkybsjg(gtknphoqwx.nufgyqmvbu nufgyqmvbuVar, gtknphoqwx gtknphoqwxVar, boolean z13) {
                nufgyqmvbuVar.draadjrbmk(gtknphoqwxVar, z13);
            }
        };

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        public static final dxjokdxxww f13507zoijcleaow = new dxjokdxxww() { // from class: androidx.transition.agtfadlqog
            @Override // androidx.transition.gtknphoqwx.dxjokdxxww
            public final void eablkybsjg(gtknphoqwx.nufgyqmvbu nufgyqmvbuVar, gtknphoqwx gtknphoqwxVar, boolean z13) {
                nufgyqmvbuVar.nufgyqmvbu(gtknphoqwxVar, z13);
            }
        };

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        public static final dxjokdxxww f13505ppxfxbqfkf = new dxjokdxxww() { // from class: androidx.transition.ojitshcjhn
            @Override // androidx.transition.gtknphoqwx.dxjokdxxww
            public final void eablkybsjg(gtknphoqwx.nufgyqmvbu nufgyqmvbuVar, gtknphoqwx gtknphoqwxVar, boolean z13) {
                nufgyqmvbuVar.gtknphoqwx(gtknphoqwxVar);
            }
        };

        /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
        public static final dxjokdxxww f13506wkgbmnqykc = new dxjokdxxww() { // from class: androidx.transition.rgvfuqvkyq
            @Override // androidx.transition.gtknphoqwx.dxjokdxxww
            public final void eablkybsjg(gtknphoqwx.nufgyqmvbu nufgyqmvbuVar, gtknphoqwx gtknphoqwxVar, boolean z13) {
                nufgyqmvbuVar.gxszxtbevo(gtknphoqwxVar);
            }
        };

        /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
        public static final dxjokdxxww f13503eablkybsjg = new dxjokdxxww() { // from class: androidx.transition.vdvldrhtss
            @Override // androidx.transition.gtknphoqwx.dxjokdxxww
            public final void eablkybsjg(gtknphoqwx.nufgyqmvbu nufgyqmvbuVar, gtknphoqwx gtknphoqwxVar, boolean z13) {
                nufgyqmvbuVar.iobyxmoadg(gtknphoqwxVar);
            }
        };

        void eablkybsjg(nufgyqmvbu nufgyqmvbuVar, gtknphoqwx gtknphoqwxVar, boolean z13);
    }

    public static abstract class eablkybsjg {
    }

    private static class gxszxtbevo {
        static long iobyxmoadg(Animator animator) {
            return animator.getTotalDuration();
        }

        static void zoijcleaow(Animator animator, long j13) {
            ((AnimatorSet) animator).setCurrentPlayTime(j13);
        }
    }

    class iobyxmoadg extends androidx.transition.lqeggnwhkg {
        iobyxmoadg() {
        }

        @Override // androidx.transition.lqeggnwhkg
        public Path iobyxmoadg(float f13, float f14, float f15, float f16) {
            Path path = new Path();
            path.moveTo(f13, f14);
            path.lineTo(f15, f16);
            return path;
        }
    }

    class lqeggnwhkg extends oxmwwwfdhm implements yggfygwlhe, h2.zoijcleaow.oxmwwwfdhm {

        /* JADX INFO: renamed from: dxjokdxxww, reason: collision with root package name */
        private Runnable f13509dxjokdxxww;

        /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
        private boolean f13510eablkybsjg;

        /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
        private h2.eablkybsjg f13511gxszxtbevo;

        /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
        private boolean f13516wkgbmnqykc;

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private long f13512iobyxmoadg = -1;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private ArrayList f13517zoijcleaow = null;

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        private ArrayList f13515ppxfxbqfkf = null;

        /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
        private u1.iobyxmoadg[] f13513lqeggnwhkg = null;

        /* JADX INFO: renamed from: nufgyqmvbu, reason: collision with root package name */
        private final lereixgezr f13514nufgyqmvbu = new lereixgezr();

        lqeggnwhkg() {
        }

        private void ojitshcjhn() {
            ArrayList arrayList = this.f13515ppxfxbqfkf;
            if (arrayList == null || arrayList.isEmpty()) {
                return;
            }
            int size = this.f13515ppxfxbqfkf.size();
            if (this.f13513lqeggnwhkg == null) {
                this.f13513lqeggnwhkg = new u1.iobyxmoadg[size];
            }
            u1.iobyxmoadg[] iobyxmoadgVarArr = (u1.iobyxmoadg[]) this.f13515ppxfxbqfkf.toArray(this.f13513lqeggnwhkg);
            this.f13513lqeggnwhkg = null;
            for (int i13 = 0; i13 < size; i13++) {
                iobyxmoadgVarArr[i13].accept(this);
                iobyxmoadgVarArr[i13] = null;
            }
            this.f13513lqeggnwhkg = iobyxmoadgVarArr;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void oxmwwwfdhm(h2.zoijcleaow zoijcleaowVar, boolean z13, float f13, float f14) {
            if (z13) {
                return;
            }
            if (f13 >= 1.0f) {
                gtknphoqwx.this.jlmebxxoox(dxjokdxxww.f13507zoijcleaow, false);
                return;
            }
            long jWkgbmnqykc = wkgbmnqykc();
            gtknphoqwx gtknphoqwxVarZeieaojujs = ((jyumaefscl) gtknphoqwx.this).zeieaojujs(0);
            gtknphoqwx gtknphoqwxVar = gtknphoqwxVarZeieaojujs.f13494ulzqkzuiru;
            gtknphoqwxVarZeieaojujs.f13494ulzqkzuiru = null;
            gtknphoqwx.this.rlfsiqarku(-1L, this.f13512iobyxmoadg);
            gtknphoqwx.this.rlfsiqarku(jWkgbmnqykc, -1L);
            this.f13512iobyxmoadg = jWkgbmnqykc;
            Runnable runnable = this.f13509dxjokdxxww;
            if (runnable != null) {
                runnable.run();
            }
            gtknphoqwx.this.f13469crxdokpmqz.clear();
            if (gtknphoqwxVar != null) {
                gtknphoqwxVar.jlmebxxoox(dxjokdxxww.f13507zoijcleaow, true);
            }
        }

        private void rgvfuqvkyq() {
            if (this.f13511gxszxtbevo != null) {
                return;
            }
            this.f13514nufgyqmvbu.iobyxmoadg(AnimationUtils.currentAnimationTimeMillis(), this.f13512iobyxmoadg);
            this.f13511gxszxtbevo = new h2.eablkybsjg(new h2.wkgbmnqykc());
            h2.gxszxtbevo gxszxtbevoVar = new h2.gxszxtbevo();
            gxszxtbevoVar.wkgbmnqykc(1.0f);
            gxszxtbevoVar.gxszxtbevo(200.0f);
            this.f13511gxszxtbevo.jyumaefscl(gxszxtbevoVar);
            this.f13511gxszxtbevo.wflxmlrfwp(this.f13512iobyxmoadg);
            this.f13511gxszxtbevo.ppxfxbqfkf(this);
            this.f13511gxszxtbevo.agtfadlqog(this.f13514nufgyqmvbu.zoijcleaow());
            this.f13511gxszxtbevo.dxjokdxxww(wkgbmnqykc() + 1);
            this.f13511gxszxtbevo.btonecajqb(-1.0f);
            this.f13511gxszxtbevo.gtknphoqwx(4.0f);
            this.f13511gxszxtbevo.zoijcleaow(new h2.zoijcleaow.vdvldrhtss() { // from class: androidx.transition.draadjrbmk
                @Override // h2.zoijcleaow.vdvldrhtss
                public final void iobyxmoadg(h2.zoijcleaow zoijcleaowVar, boolean z13, float f13, float f14) {
                    this.f13440iobyxmoadg.oxmwwwfdhm(zoijcleaowVar, z13, f13, f14);
                }
            });
        }

        @Override // androidx.transition.yggfygwlhe
        public void btonecajqb(Runnable runnable) {
            this.f13509dxjokdxxww = runnable;
            rgvfuqvkyq();
            this.f13511gxszxtbevo.kcexrzcfyt(0.0f);
        }

        @Override // androidx.transition.yggfygwlhe
        public void eablkybsjg() {
            rgvfuqvkyq();
            this.f13511gxszxtbevo.kcexrzcfyt(wkgbmnqykc() + 1);
        }

        @Override // androidx.transition.oxmwwwfdhm, androidx.transition.gtknphoqwx.nufgyqmvbu
        public void gtknphoqwx(gtknphoqwx gtknphoqwxVar) {
            this.f13510eablkybsjg = true;
        }

        public void kcexrzcfyt() {
            this.f13516wkgbmnqykc = true;
            ArrayList arrayList = this.f13517zoijcleaow;
            if (arrayList != null) {
                this.f13517zoijcleaow = null;
                for (int i13 = 0; i13 < arrayList.size(); i13++) {
                    ((u1.iobyxmoadg) arrayList.get(i13)).accept(this);
                }
            }
            ojitshcjhn();
        }

        @Override // androidx.transition.yggfygwlhe
        public void lqeggnwhkg(long j13) {
            if (this.f13511gxszxtbevo != null) {
                throw new IllegalStateException("setCurrentPlayTimeMillis() called after animation has been started");
            }
            if (j13 == this.f13512iobyxmoadg || !ppxfxbqfkf()) {
                return;
            }
            if (!this.f13510eablkybsjg) {
                if (j13 != 0 || this.f13512iobyxmoadg <= 0) {
                    long jWkgbmnqykc = wkgbmnqykc();
                    if (j13 == jWkgbmnqykc && this.f13512iobyxmoadg < jWkgbmnqykc) {
                        j13 = 1 + jWkgbmnqykc;
                    }
                } else {
                    j13 = -1;
                }
                long j14 = this.f13512iobyxmoadg;
                if (j13 != j14) {
                    gtknphoqwx.this.rlfsiqarku(j13, j14);
                    this.f13512iobyxmoadg = j13;
                }
            }
            ojitshcjhn();
            this.f13514nufgyqmvbu.iobyxmoadg(AnimationUtils.currentAnimationTimeMillis(), j13);
        }

        @Override // androidx.transition.yggfygwlhe
        public boolean ppxfxbqfkf() {
            return this.f13516wkgbmnqykc;
        }

        void vdvldrhtss() {
            long j13 = wkgbmnqykc() == 0 ? 1L : 0L;
            gtknphoqwx.this.rlfsiqarku(j13, this.f13512iobyxmoadg);
            this.f13512iobyxmoadg = j13;
        }

        @Override // h2.zoijcleaow.oxmwwwfdhm
        public void wflxmlrfwp(h2.zoijcleaow zoijcleaowVar, float f13, float f14) {
            long jMax = Math.max(-1L, Math.min(wkgbmnqykc() + 1, Math.round(f13)));
            gtknphoqwx.this.rlfsiqarku(jMax, this.f13512iobyxmoadg);
            this.f13512iobyxmoadg = jMax;
            ojitshcjhn();
        }

        @Override // androidx.transition.yggfygwlhe
        public long wkgbmnqykc() {
            return gtknphoqwx.this.pkzmftpjix();
        }
    }

    public interface nufgyqmvbu {
        default void draadjrbmk(gtknphoqwx gtknphoqwxVar, boolean z13) {
            zoijcleaow(gtknphoqwxVar);
        }

        void dxjokdxxww(gtknphoqwx gtknphoqwxVar);

        void gtknphoqwx(gtknphoqwx gtknphoqwxVar);

        void gxszxtbevo(gtknphoqwx gtknphoqwxVar);

        void iobyxmoadg(gtknphoqwx gtknphoqwxVar);

        default void nufgyqmvbu(gtknphoqwx gtknphoqwxVar, boolean z13) {
            dxjokdxxww(gtknphoqwxVar);
        }

        void zoijcleaow(gtknphoqwx gtknphoqwxVar);
    }

    class ppxfxbqfkf extends AnimatorListenerAdapter {
        ppxfxbqfkf() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            gtknphoqwx.this.zdlpuopuiu();
            animator.removeListener(this);
        }
    }

    private static class wkgbmnqykc {

        /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
        gtknphoqwx f13519eablkybsjg;

        /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
        Animator f13520gxszxtbevo;

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        View f13521iobyxmoadg;

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        cqumvgiudr f13522ppxfxbqfkf;

        /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
        WindowId f13523wkgbmnqykc;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        String f13524zoijcleaow;

        wkgbmnqykc(View view, String str, gtknphoqwx gtknphoqwxVar, WindowId windowId, cqumvgiudr cqumvgiudrVar, Animator animator) {
            this.f13521iobyxmoadg = view;
            this.f13524zoijcleaow = str;
            this.f13522ppxfxbqfkf = cqumvgiudrVar;
            this.f13523wkgbmnqykc = windowId;
            this.f13519eablkybsjg = gtknphoqwxVar;
            this.f13520gxszxtbevo = animator;
        }
    }

    class zoijcleaow extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        final /* synthetic */ androidx.collection.iobyxmoadg f13525iobyxmoadg;

        zoijcleaow(androidx.collection.iobyxmoadg iobyxmoadgVar) {
            this.f13525iobyxmoadg = iobyxmoadgVar;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f13525iobyxmoadg.remove(animator);
            gtknphoqwx.this.f13492stevsuqkhv.remove(animator);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            gtknphoqwx.this.f13492stevsuqkhv.add(animator);
        }
    }

    private void crxdokpmqz(gtknphoqwx gtknphoqwxVar, dxjokdxxww dxjokdxxwwVar, boolean z13) {
        gtknphoqwx gtknphoqwxVar2 = this.f13494ulzqkzuiru;
        if (gtknphoqwxVar2 != null) {
            gtknphoqwxVar2.crxdokpmqz(gtknphoqwxVar, dxjokdxxwwVar, z13);
        }
        ArrayList arrayList = this.f13491sopmlzcsov;
        if (arrayList == null || arrayList.isEmpty()) {
            return;
        }
        int size = this.f13491sopmlzcsov.size();
        nufgyqmvbu[] nufgyqmvbuVarArr = this.f13470dsvhmnatus;
        if (nufgyqmvbuVarArr == null) {
            nufgyqmvbuVarArr = new nufgyqmvbu[size];
        }
        this.f13470dsvhmnatus = null;
        nufgyqmvbu[] nufgyqmvbuVarArr2 = (nufgyqmvbu[]) this.f13491sopmlzcsov.toArray(nufgyqmvbuVarArr);
        for (int i13 = 0; i13 < size; i13++) {
            dxjokdxxwwVar.eablkybsjg(nufgyqmvbuVarArr2[i13], gtknphoqwxVar, z13);
            nufgyqmvbuVarArr2[i13] = null;
        }
        this.f13470dsvhmnatus = nufgyqmvbuVarArr2;
    }

    private void eablkybsjg(androidx.collection.iobyxmoadg iobyxmoadgVar, androidx.collection.iobyxmoadg iobyxmoadgVar2) {
        for (int i13 = 0; i13 < iobyxmoadgVar.size(); i13++) {
            cqumvgiudr cqumvgiudrVar = (cqumvgiudr) iobyxmoadgVar.gtknphoqwx(i13);
            if (wypolnanlu(cqumvgiudrVar.f13439zoijcleaow)) {
                this.f13473hkdspvbjdz.add(cqumvgiudrVar);
                this.f13467cllcsxoeiz.add(null);
            }
        }
        for (int i14 = 0; i14 < iobyxmoadgVar2.size(); i14++) {
            cqumvgiudr cqumvgiudrVar2 = (cqumvgiudr) iobyxmoadgVar2.gtknphoqwx(i14);
            if (wypolnanlu(cqumvgiudrVar2.f13439zoijcleaow)) {
                this.f13467cllcsxoeiz.add(cqumvgiudrVar2);
                this.f13473hkdspvbjdz.add(null);
            }
        }
    }

    private void gtknphoqwx(View view, boolean z13) {
        if (view == null) {
            return;
        }
        int id2 = view.getId();
        ArrayList arrayList = this.f13502zynmafqrjb;
        if (arrayList == null || !arrayList.contains(Integer.valueOf(id2))) {
            ArrayList arrayList2 = this.f13476istkbnxepw;
            if (arrayList2 == null || !arrayList2.contains(view)) {
                ArrayList arrayList3 = this.f13466cdpycssgdh;
                if (arrayList3 != null) {
                    int size = arrayList3.size();
                    for (int i13 = 0; i13 < size; i13++) {
                        if (((Class) this.f13466cdpycssgdh.get(i13)).isInstance(view)) {
                            return;
                        }
                    }
                }
                if (view.getParent() instanceof ViewGroup) {
                    cqumvgiudr cqumvgiudrVar = new cqumvgiudr(view);
                    if (z13) {
                        wflxmlrfwp(cqumvgiudrVar);
                    } else {
                        nufgyqmvbu(cqumvgiudrVar);
                    }
                    cqumvgiudrVar.f13438ppxfxbqfkf.add(this);
                    draadjrbmk(cqumvgiudrVar);
                    if (z13) {
                        gxszxtbevo(this.f13500ylkuphrtab, view, cqumvgiudrVar);
                    } else {
                        gxszxtbevo(this.f13488pkzmftpjix, view, cqumvgiudrVar);
                    }
                }
                if (view instanceof ViewGroup) {
                    ArrayList arrayList4 = this.f13475iozdgvuglv;
                    if (arrayList4 == null || !arrayList4.contains(Integer.valueOf(id2))) {
                        ArrayList arrayList5 = this.f13484lmojexxdyd;
                        if (arrayList5 == null || !arrayList5.contains(view)) {
                            ArrayList arrayList6 = this.f13496wwaezpbzkn;
                            if (arrayList6 != null) {
                                int size2 = arrayList6.size();
                                for (int i14 = 0; i14 < size2; i14++) {
                                    if (((Class) this.f13496wwaezpbzkn.get(i14)).isInstance(view)) {
                                        return;
                                    }
                                }
                            }
                            ViewGroup viewGroup = (ViewGroup) view;
                            for (int i15 = 0; i15 < viewGroup.getChildCount(); i15++) {
                                gtknphoqwx(viewGroup.getChildAt(i15), z13);
                            }
                        }
                    }
                }
            }
        }
    }

    private static void gxszxtbevo(esjtqupxsv esjtqupxsvVar, View view, cqumvgiudr cqumvgiudrVar) {
        esjtqupxsvVar.f13458iobyxmoadg.put(view, cqumvgiudrVar);
        int id2 = view.getId();
        if (id2 >= 0) {
            if (esjtqupxsvVar.f13461zoijcleaow.indexOfKey(id2) >= 0) {
                esjtqupxsvVar.f13461zoijcleaow.put(id2, null);
            } else {
                esjtqupxsvVar.f13461zoijcleaow.put(id2, view);
            }
        }
        String strYlkuphrtab = jhduphickx.ylkuphrtab(view);
        if (strYlkuphrtab != null) {
            if (esjtqupxsvVar.f13460wkgbmnqykc.containsKey(strYlkuphrtab)) {
                esjtqupxsvVar.f13460wkgbmnqykc.put(strYlkuphrtab, null);
            } else {
                esjtqupxsvVar.f13460wkgbmnqykc.put(strYlkuphrtab, view);
            }
        }
        if (view.getParent() instanceof ListView) {
            ListView listView = (ListView) view.getParent();
            if (listView.getAdapter().hasStableIds()) {
                long itemIdAtPosition = listView.getItemIdAtPosition(listView.getPositionForView(view));
                if (esjtqupxsvVar.f13459ppxfxbqfkf.eablkybsjg(itemIdAtPosition) < 0) {
                    view.setHasTransientState(true);
                    esjtqupxsvVar.f13459ppxfxbqfkf.nufgyqmvbu(itemIdAtPosition, view);
                    return;
                }
                View view2 = (View) esjtqupxsvVar.f13459ppxfxbqfkf.wkgbmnqykc(itemIdAtPosition);
                if (view2 != null) {
                    view2.setHasTransientState(false);
                    esjtqupxsvVar.f13459ppxfxbqfkf.nufgyqmvbu(itemIdAtPosition, null);
                }
            }
        }
    }

    private static androidx.collection.iobyxmoadg istkbnxepw() {
        androidx.collection.iobyxmoadg iobyxmoadgVar = (androidx.collection.iobyxmoadg) f13464rlfsiqarku.get();
        if (iobyxmoadgVar != null) {
            return iobyxmoadgVar;
        }
        androidx.collection.iobyxmoadg iobyxmoadgVar2 = new androidx.collection.iobyxmoadg();
        f13464rlfsiqarku.set(iobyxmoadgVar2);
        return iobyxmoadgVar2;
    }

    private void mbcevpiqjq(androidx.collection.iobyxmoadg iobyxmoadgVar, androidx.collection.iobyxmoadg iobyxmoadgVar2) {
        cqumvgiudr cqumvgiudrVar;
        for (int size = iobyxmoadgVar.size() - 1; size >= 0; size--) {
            View view = (View) iobyxmoadgVar.gxszxtbevo(size);
            if (view != null && wypolnanlu(view) && (cqumvgiudrVar = (cqumvgiudr) iobyxmoadgVar2.remove(view)) != null && wypolnanlu(cqumvgiudrVar.f13439zoijcleaow)) {
                this.f13473hkdspvbjdz.add((cqumvgiudr) iobyxmoadgVar.dxjokdxxww(size));
                this.f13467cllcsxoeiz.add(cqumvgiudrVar);
            }
        }
    }

    private void ntlheqmsrt(androidx.collection.iobyxmoadg iobyxmoadgVar, androidx.collection.iobyxmoadg iobyxmoadgVar2, androidx.collection.esjtqupxsv esjtqupxsvVar, androidx.collection.esjtqupxsv esjtqupxsvVar2) {
        View view;
        int iWflxmlrfwp = esjtqupxsvVar.wflxmlrfwp();
        for (int i13 = 0; i13 < iWflxmlrfwp; i13++) {
            View view2 = (View) esjtqupxsvVar.agtfadlqog(i13);
            if (view2 != null && wypolnanlu(view2) && (view = (View) esjtqupxsvVar2.wkgbmnqykc(esjtqupxsvVar.lqeggnwhkg(i13))) != null && wypolnanlu(view)) {
                cqumvgiudr cqumvgiudrVar = (cqumvgiudr) iobyxmoadgVar.get(view2);
                cqumvgiudr cqumvgiudrVar2 = (cqumvgiudr) iobyxmoadgVar2.get(view);
                if (cqumvgiudrVar != null && cqumvgiudrVar2 != null) {
                    this.f13473hkdspvbjdz.add(cqumvgiudrVar);
                    this.f13467cllcsxoeiz.add(cqumvgiudrVar2);
                    iobyxmoadgVar.remove(view2);
                    iobyxmoadgVar2.remove(view);
                }
            }
        }
    }

    private void sopmlzcsov(esjtqupxsv esjtqupxsvVar, esjtqupxsv esjtqupxsvVar2) {
        androidx.collection.iobyxmoadg iobyxmoadgVar = new androidx.collection.iobyxmoadg(esjtqupxsvVar.f13458iobyxmoadg);
        androidx.collection.iobyxmoadg iobyxmoadgVar2 = new androidx.collection.iobyxmoadg(esjtqupxsvVar2.f13458iobyxmoadg);
        int i13 = 0;
        while (true) {
            int[] iArr = this.f13480jpowsppfya;
            if (i13 >= iArr.length) {
                eablkybsjg(iobyxmoadgVar, iobyxmoadgVar2);
                return;
            }
            int i14 = iArr[i13];
            if (i14 == 1) {
                mbcevpiqjq(iobyxmoadgVar, iobyxmoadgVar2);
            } else if (i14 == 2) {
                ulzqkzuiru(iobyxmoadgVar, iobyxmoadgVar2, esjtqupxsvVar.f13460wkgbmnqykc, esjtqupxsvVar2.f13460wkgbmnqykc);
            } else if (i14 == 3) {
                tzroggbefp(iobyxmoadgVar, iobyxmoadgVar2, esjtqupxsvVar.f13461zoijcleaow, esjtqupxsvVar2.f13461zoijcleaow);
            } else if (i14 == 4) {
                ntlheqmsrt(iobyxmoadgVar, iobyxmoadgVar2, esjtqupxsvVar.f13459ppxfxbqfkf, esjtqupxsvVar2.f13459ppxfxbqfkf);
            }
            i13++;
        }
    }

    private static boolean stevsuqkhv(cqumvgiudr cqumvgiudrVar, cqumvgiudr cqumvgiudrVar2, String str) {
        Object obj = cqumvgiudrVar.f13437iobyxmoadg.get(str);
        Object obj2 = cqumvgiudrVar2.f13437iobyxmoadg.get(str);
        if (obj == null && obj2 == null) {
            return false;
        }
        if (obj == null || obj2 == null) {
            return true;
        }
        return !obj.equals(obj2);
    }

    private void tzroggbefp(androidx.collection.iobyxmoadg iobyxmoadgVar, androidx.collection.iobyxmoadg iobyxmoadgVar2, SparseArray sparseArray, SparseArray sparseArray2) {
        View view;
        int size = sparseArray.size();
        for (int i13 = 0; i13 < size; i13++) {
            View view2 = (View) sparseArray.valueAt(i13);
            if (view2 != null && wypolnanlu(view2) && (view = (View) sparseArray2.get(sparseArray.keyAt(i13))) != null && wypolnanlu(view)) {
                cqumvgiudr cqumvgiudrVar = (cqumvgiudr) iobyxmoadgVar.get(view2);
                cqumvgiudr cqumvgiudrVar2 = (cqumvgiudr) iobyxmoadgVar2.get(view);
                if (cqumvgiudrVar != null && cqumvgiudrVar2 != null) {
                    this.f13473hkdspvbjdz.add(cqumvgiudrVar);
                    this.f13467cllcsxoeiz.add(cqumvgiudrVar2);
                    iobyxmoadgVar.remove(view2);
                    iobyxmoadgVar2.remove(view);
                }
            }
        }
    }

    private void ulzqkzuiru(androidx.collection.iobyxmoadg iobyxmoadgVar, androidx.collection.iobyxmoadg iobyxmoadgVar2, androidx.collection.iobyxmoadg iobyxmoadgVar3, androidx.collection.iobyxmoadg iobyxmoadgVar4) {
        View view;
        int size = iobyxmoadgVar3.size();
        for (int i13 = 0; i13 < size; i13++) {
            View view2 = (View) iobyxmoadgVar3.gtknphoqwx(i13);
            if (view2 != null && wypolnanlu(view2) && (view = (View) iobyxmoadgVar4.get(iobyxmoadgVar3.gxszxtbevo(i13))) != null && wypolnanlu(view)) {
                cqumvgiudr cqumvgiudrVar = (cqumvgiudr) iobyxmoadgVar.get(view2);
                cqumvgiudr cqumvgiudrVar2 = (cqumvgiudr) iobyxmoadgVar2.get(view);
                if (cqumvgiudrVar != null && cqumvgiudrVar2 != null) {
                    this.f13473hkdspvbjdz.add(cqumvgiudrVar);
                    this.f13467cllcsxoeiz.add(cqumvgiudrVar2);
                    iobyxmoadgVar.remove(view2);
                    iobyxmoadgVar2.remove(view);
                }
            }
        }
    }

    private void xrmfcynszj(Animator animator, androidx.collection.iobyxmoadg iobyxmoadgVar) {
        if (animator != null) {
            animator.addListener(new zoijcleaow(iobyxmoadgVar));
            lqeggnwhkg(animator);
        }
    }

    void agtfadlqog(ViewGroup viewGroup, boolean z13) {
        ArrayList arrayList;
        ArrayList arrayList2;
        androidx.collection.iobyxmoadg iobyxmoadgVar;
        ojitshcjhn(z13);
        if ((this.f13468cqumvgiudr.size() > 0 || this.f13471esjtqupxsv.size() > 0) && (((arrayList = this.f13483lereixgezr) == null || arrayList.isEmpty()) && ((arrayList2 = this.f13489pmvmpeiblj) == null || arrayList2.isEmpty()))) {
            for (int i13 = 0; i13 < this.f13468cqumvgiudr.size(); i13++) {
                View viewFindViewById = viewGroup.findViewById(((Integer) this.f13468cqumvgiudr.get(i13)).intValue());
                if (viewFindViewById != null) {
                    cqumvgiudr cqumvgiudrVar = new cqumvgiudr(viewFindViewById);
                    if (z13) {
                        wflxmlrfwp(cqumvgiudrVar);
                    } else {
                        nufgyqmvbu(cqumvgiudrVar);
                    }
                    cqumvgiudrVar.f13438ppxfxbqfkf.add(this);
                    draadjrbmk(cqumvgiudrVar);
                    if (z13) {
                        gxszxtbevo(this.f13500ylkuphrtab, viewFindViewById, cqumvgiudrVar);
                    } else {
                        gxszxtbevo(this.f13488pkzmftpjix, viewFindViewById, cqumvgiudrVar);
                    }
                }
            }
            for (int i14 = 0; i14 < this.f13471esjtqupxsv.size(); i14++) {
                View view = (View) this.f13471esjtqupxsv.get(i14);
                cqumvgiudr cqumvgiudrVar2 = new cqumvgiudr(view);
                if (z13) {
                    wflxmlrfwp(cqumvgiudrVar2);
                } else {
                    nufgyqmvbu(cqumvgiudrVar2);
                }
                cqumvgiudrVar2.f13438ppxfxbqfkf.add(this);
                draadjrbmk(cqumvgiudrVar2);
                if (z13) {
                    gxszxtbevo(this.f13500ylkuphrtab, view, cqumvgiudrVar2);
                } else {
                    gxszxtbevo(this.f13488pkzmftpjix, view, cqumvgiudrVar2);
                }
            }
        } else {
            gtknphoqwx(viewGroup, z13);
        }
        if (z13 || (iobyxmoadgVar = this.f13490ribwqtqdhb) == null) {
            return;
        }
        int size = iobyxmoadgVar.size();
        ArrayList arrayList3 = new ArrayList(size);
        for (int i15 = 0; i15 < size; i15++) {
            arrayList3.add((View) this.f13500ylkuphrtab.f13460wkgbmnqykc.remove((String) this.f13490ribwqtqdhb.gxszxtbevo(i15)));
        }
        for (int i16 = 0; i16 < size; i16++) {
            View view2 = (View) arrayList3.get(i16);
            if (view2 != null) {
                this.f13500ylkuphrtab.f13460wkgbmnqykc.put((String) this.f13490ribwqtqdhb.gtknphoqwx(i16), view2);
            }
        }
    }

    String bfopjjpdmp(String str) {
        StringBuilder sb3 = new StringBuilder(str);
        sb3.append(getClass().getSimpleName());
        sb3.append("@");
        sb3.append(Integer.toHexString(hashCode()));
        sb3.append(": ");
        if (this.f13481jyumaefscl != -1) {
            sb3.append("dur(");
            sb3.append(this.f13481jyumaefscl);
            sb3.append(") ");
        }
        if (this.f13499yggfygwlhe != -1) {
            sb3.append("dly(");
            sb3.append(this.f13499yggfygwlhe);
            sb3.append(") ");
        }
        if (this.f13477iwizpuwonk != null) {
            sb3.append("interp(");
            sb3.append(this.f13477iwizpuwonk);
            sb3.append(") ");
        }
        if (this.f13468cqumvgiudr.size() > 0 || this.f13471esjtqupxsv.size() > 0) {
            sb3.append("tgts(");
            if (this.f13468cqumvgiudr.size() > 0) {
                for (int i13 = 0; i13 < this.f13468cqumvgiudr.size(); i13++) {
                    if (i13 > 0) {
                        sb3.append(", ");
                    }
                    sb3.append(this.f13468cqumvgiudr.get(i13));
                }
            }
            if (this.f13471esjtqupxsv.size() > 0) {
                for (int i14 = 0; i14 < this.f13471esjtqupxsv.size(); i14++) {
                    if (i14 > 0) {
                        sb3.append(", ");
                    }
                    sb3.append(this.f13471esjtqupxsv.get(i14));
                }
            }
            sb3.append(")");
        }
        return sb3.toString();
    }

    protected void cancel() {
        int size = this.f13492stevsuqkhv.size();
        Animator[] animatorArr = (Animator[]) this.f13492stevsuqkhv.toArray(this.f13482kegysxyocb);
        this.f13482kegysxyocb = f13462jztzpxfvev;
        for (int i13 = size - 1; i13 >= 0; i13--) {
            Animator animator = animatorArr[i13];
            animatorArr[i13] = null;
            animator.cancel();
        }
        this.f13482kegysxyocb = animatorArr;
        jlmebxxoox(dxjokdxxww.f13505ppxfxbqfkf, false);
    }

    public long cdpycssgdh() {
        return this.f13499yggfygwlhe;
    }

    public abstract boolean cllcsxoeiz();

    cqumvgiudr cqumvgiudr(View view, boolean z13) {
        jyumaefscl jyumaefsclVar = this.f13472hcddaimhww;
        if (jyumaefsclVar != null) {
            return jyumaefsclVar.cqumvgiudr(view, z13);
        }
        ArrayList arrayList = z13 ? this.f13473hkdspvbjdz : this.f13467cllcsxoeiz;
        if (arrayList == null) {
            return null;
        }
        int size = arrayList.size();
        int i13 = 0;
        while (true) {
            if (i13 >= size) {
                i13 = -1;
                break;
            }
            cqumvgiudr cqumvgiudrVar = (cqumvgiudr) arrayList.get(i13);
            if (cqumvgiudrVar == null) {
                return null;
            }
            if (cqumvgiudrVar.f13439zoijcleaow == view) {
                break;
            }
            i13++;
        }
        if (i13 >= 0) {
            return (cqumvgiudr) (z13 ? this.f13467cllcsxoeiz : this.f13473hkdspvbjdz).get(i13);
        }
        return null;
    }

    public gtknphoqwx czzsidtyhn(long j13) {
        this.f13481jyumaefscl = j13;
        return this;
    }

    void draadjrbmk(cqumvgiudr cqumvgiudrVar) {
    }

    public boolean dsvhmnatus(cqumvgiudr cqumvgiudrVar, cqumvgiudr cqumvgiudrVar2) {
        if (cqumvgiudrVar == null || cqumvgiudrVar2 == null) {
            return false;
        }
        String[] strArrHcddaimhww = hcddaimhww();
        if (strArrHcddaimhww == null) {
            Iterator it = cqumvgiudrVar.f13437iobyxmoadg.keySet().iterator();
            while (it.hasNext()) {
                if (stevsuqkhv(cqumvgiudrVar, cqumvgiudrVar2, (String) it.next())) {
                }
            }
            return false;
        }
        for (String str : strArrHcddaimhww) {
            if (!stevsuqkhv(cqumvgiudrVar, cqumvgiudrVar2, str)) {
            }
        }
        return false;
        return true;
    }

    public String esjtqupxsv() {
        return this.f13501zdlpuopuiu;
    }

    public String[] hcddaimhww() {
        return null;
    }

    boolean hkdspvbjdz() {
        return !this.f13492stevsuqkhv.isEmpty();
    }

    public gtknphoqwx ikoacuggdj(nufgyqmvbu nufgyqmvbuVar) {
        gtknphoqwx gtknphoqwxVar;
        ArrayList arrayList = this.f13491sopmlzcsov;
        if (arrayList == null) {
            return this;
        }
        if (!arrayList.remove(nufgyqmvbuVar) && (gtknphoqwxVar = this.f13494ulzqkzuiru) != null) {
            gtknphoqwxVar.ikoacuggdj(nufgyqmvbuVar);
        }
        if (this.f13491sopmlzcsov.size() == 0) {
            this.f13491sopmlzcsov = null;
        }
        return this;
    }

    public List iozdgvuglv() {
        return this.f13483lereixgezr;
    }

    public TimeInterpolator iwizpuwonk() {
        return this.f13477iwizpuwonk;
    }

    void jhduphickx() {
        androidx.collection.iobyxmoadg iobyxmoadgVarIstkbnxepw = istkbnxepw();
        this.f13478jhduphickx = 0L;
        for (int i13 = 0; i13 < this.f13469crxdokpmqz.size(); i13++) {
            Animator animator = (Animator) this.f13469crxdokpmqz.get(i13);
            wkgbmnqykc wkgbmnqykcVar = (wkgbmnqykc) iobyxmoadgVarIstkbnxepw.get(animator);
            if (animator != null && wkgbmnqykcVar != null) {
                if (yggfygwlhe() >= 0) {
                    wkgbmnqykcVar.f13520gxszxtbevo.setDuration(yggfygwlhe());
                }
                if (cdpycssgdh() >= 0) {
                    wkgbmnqykcVar.f13520gxszxtbevo.setStartDelay(cdpycssgdh() + wkgbmnqykcVar.f13520gxszxtbevo.getStartDelay());
                }
                if (iwizpuwonk() != null) {
                    wkgbmnqykcVar.f13520gxszxtbevo.setInterpolator(iwizpuwonk());
                }
                this.f13492stevsuqkhv.add(animator);
                this.f13478jhduphickx = Math.max(this.f13478jhduphickx, gxszxtbevo.iobyxmoadg(animator));
            }
        }
        this.f13469crxdokpmqz.clear();
    }

    void jlmebxxoox(dxjokdxxww dxjokdxxwwVar, boolean z13) {
        crxdokpmqz(this, dxjokdxxwwVar, z13);
    }

    public cqumvgiudr jpowsppfya(View view, boolean z13) {
        jyumaefscl jyumaefsclVar = this.f13472hcddaimhww;
        if (jyumaefsclVar != null) {
            return jyumaefsclVar.jpowsppfya(view, z13);
        }
        return (cqumvgiudr) (z13 ? this.f13500ylkuphrtab : this.f13488pkzmftpjix).f13458iobyxmoadg.get(view);
    }

    public eablkybsjg jyumaefscl() {
        return this.f13479jlmebxxoox;
    }

    public void jztzpxfvev(View view) {
        if (this.f13485mbcevpiqjq) {
            if (!this.f13486ntlheqmsrt) {
                int size = this.f13492stevsuqkhv.size();
                Animator[] animatorArr = (Animator[]) this.f13492stevsuqkhv.toArray(this.f13482kegysxyocb);
                this.f13482kegysxyocb = f13462jztzpxfvev;
                for (int i13 = size - 1; i13 >= 0; i13--) {
                    Animator animator = animatorArr[i13];
                    animatorArr[i13] = null;
                    animator.resume();
                }
                this.f13482kegysxyocb = animatorArr;
                jlmebxxoox(dxjokdxxww.f13503eablkybsjg, false);
            }
            this.f13485mbcevpiqjq = false;
        }
    }

    yggfygwlhe kcexrzcfyt() {
        lqeggnwhkg lqeggnwhkgVar = new lqeggnwhkg();
        this.f13474ikoacuggdj = lqeggnwhkgVar;
        ppxfxbqfkf(lqeggnwhkgVar);
        return this.f13474ikoacuggdj;
    }

    public androidx.transition.lqeggnwhkg lereixgezr() {
        return this.f13495vipkmwdibw;
    }

    public List lmojexxdyd() {
        return this.f13489pmvmpeiblj;
    }

    protected void lqeggnwhkg(Animator animator) {
        if (animator == null) {
            zdlpuopuiu();
            return;
        }
        if (yggfygwlhe() >= 0) {
            animator.setDuration(yggfygwlhe());
        }
        if (cdpycssgdh() >= 0) {
            animator.setStartDelay(cdpycssgdh() + animator.getStartDelay());
        }
        if (iwizpuwonk() != null) {
            animator.setInterpolator(iwizpuwonk());
        }
        animator.addListener(new ppxfxbqfkf());
        animator.start();
    }

    protected void metgxyhuhe() {
        oipsdeybqn();
        androidx.collection.iobyxmoadg iobyxmoadgVarIstkbnxepw = istkbnxepw();
        for (Animator animator : this.f13469crxdokpmqz) {
            if (iobyxmoadgVarIstkbnxepw.containsKey(animator)) {
                oipsdeybqn();
                xrmfcynszj(animator, iobyxmoadgVarIstkbnxepw);
            }
        }
        this.f13469crxdokpmqz.clear();
        zdlpuopuiu();
    }

    public abstract void nufgyqmvbu(cqumvgiudr cqumvgiudrVar);

    protected void oipsdeybqn() {
        if (this.f13493tzroggbefp == 0) {
            jlmebxxoox(dxjokdxxww.f13504iobyxmoadg, false);
            this.f13486ntlheqmsrt = false;
        }
        this.f13493tzroggbefp++;
    }

    void ojitshcjhn(boolean z13) {
        if (z13) {
            this.f13500ylkuphrtab.f13458iobyxmoadg.clear();
            this.f13500ylkuphrtab.f13461zoijcleaow.clear();
            this.f13500ylkuphrtab.f13459ppxfxbqfkf.iobyxmoadg();
        } else {
            this.f13488pkzmftpjix.f13458iobyxmoadg.clear();
            this.f13488pkzmftpjix.f13461zoijcleaow.clear();
            this.f13488pkzmftpjix.f13459ppxfxbqfkf.iobyxmoadg();
        }
    }

    public gtknphoqwx okpsazkaxt(View view) {
        this.f13471esjtqupxsv.remove(view);
        return this;
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0048  */
    void oxmwwwfdhm(ViewGroup viewGroup, esjtqupxsv esjtqupxsvVar, esjtqupxsv esjtqupxsvVar2, ArrayList arrayList, ArrayList arrayList2) {
        Animator animatorVdvldrhtss;
        View view;
        Animator animator;
        cqumvgiudr cqumvgiudrVar;
        Object obj;
        Animator animator2;
        cqumvgiudr cqumvgiudrVar2;
        androidx.collection.iobyxmoadg iobyxmoadgVarIstkbnxepw = istkbnxepw();
        SparseIntArray sparseIntArray = new SparseIntArray();
        boolean z13 = zynmafqrjb().f13474ikoacuggdj != null;
        int i13 = 0;
        for (int size = arrayList.size(); i13 < size; size = size) {
            cqumvgiudr cqumvgiudrVar3 = (cqumvgiudr) arrayList.get(i13);
            cqumvgiudr cqumvgiudrVar4 = (cqumvgiudr) arrayList2.get(i13);
            if (cqumvgiudrVar3 != null && !cqumvgiudrVar3.f13438ppxfxbqfkf.contains(this)) {
                cqumvgiudrVar3 = null;
            }
            if (cqumvgiudrVar4 != null && !cqumvgiudrVar4.f13438ppxfxbqfkf.contains(this)) {
                cqumvgiudrVar4 = null;
            }
            if ((cqumvgiudrVar3 != null || cqumvgiudrVar4 != null) && ((cqumvgiudrVar3 == null || cqumvgiudrVar4 == null || dsvhmnatus(cqumvgiudrVar3, cqumvgiudrVar4)) && (animatorVdvldrhtss = vdvldrhtss(viewGroup, cqumvgiudrVar3, cqumvgiudrVar4)) != null)) {
                if (cqumvgiudrVar4 != null) {
                    View view2 = cqumvgiudrVar4.f13439zoijcleaow;
                    String[] strArrHcddaimhww = hcddaimhww();
                    if (strArrHcddaimhww != null && strArrHcddaimhww.length > 0) {
                        cqumvgiudrVar2 = new cqumvgiudr(view2);
                        cqumvgiudr cqumvgiudrVar5 = (cqumvgiudr) esjtqupxsvVar2.f13458iobyxmoadg.get(view2);
                        if (cqumvgiudrVar5 != null) {
                            int i14 = 0;
                            while (i14 < strArrHcddaimhww.length) {
                                Map map = cqumvgiudrVar2.f13437iobyxmoadg;
                                String str = strArrHcddaimhww[i14];
                                map.put(str, cqumvgiudrVar5.f13437iobyxmoadg.get(str));
                                i14++;
                                strArrHcddaimhww = strArrHcddaimhww;
                            }
                        }
                        int size2 = iobyxmoadgVarIstkbnxepw.size();
                        int i15 = 0;
                        while (true) {
                            if (i15 >= size2) {
                                animator2 = animatorVdvldrhtss;
                                break;
                            }
                            wkgbmnqykc wkgbmnqykcVar = (wkgbmnqykc) iobyxmoadgVarIstkbnxepw.get((Animator) iobyxmoadgVarIstkbnxepw.gxszxtbevo(i15));
                            if (wkgbmnqykcVar.f13522ppxfxbqfkf != null && wkgbmnqykcVar.f13521iobyxmoadg == view2 && wkgbmnqykcVar.f13524zoijcleaow.equals(esjtqupxsv()) && wkgbmnqykcVar.f13522ppxfxbqfkf.equals(cqumvgiudrVar2)) {
                                animator2 = null;
                                break;
                            }
                            i15++;
                        }
                    } else {
                        animator2 = animatorVdvldrhtss;
                        cqumvgiudrVar2 = null;
                    }
                    view = view2;
                    animator = animator2;
                    cqumvgiudrVar = cqumvgiudrVar2;
                } else {
                    view = cqumvgiudrVar3.f13439zoijcleaow;
                    animator = animatorVdvldrhtss;
                    cqumvgiudrVar = null;
                }
                if (animator != null) {
                    wkgbmnqykc wkgbmnqykcVar2 = new wkgbmnqykc(view, esjtqupxsv(), this, viewGroup.getWindowId(), cqumvgiudrVar, animator);
                    if (z13) {
                        obj = animator;
                        AnimatorSet animatorSet = new AnimatorSet();
                        animatorSet.play(animator);
                        obj = animatorSet;
                    }
                    obj = animator;
                    iobyxmoadgVarIstkbnxepw.put(obj, wkgbmnqykcVar2);
                    this.f13469crxdokpmqz.add(obj);
                }
            }
            i13++;
        }
        if (sparseIntArray.size() != 0) {
            for (int i16 = 0; i16 < sparseIntArray.size(); i16++) {
                wkgbmnqykc wkgbmnqykcVar3 = (wkgbmnqykc) iobyxmoadgVarIstkbnxepw.get((Animator) this.f13469crxdokpmqz.get(sparseIntArray.keyAt(i16)));
                wkgbmnqykcVar3.f13520gxszxtbevo.setStartDelay((((long) sparseIntArray.valueAt(i16)) - Long.MAX_VALUE) + wkgbmnqykcVar3.f13520gxszxtbevo.getStartDelay());
            }
        }
    }

    final long pkzmftpjix() {
        return this.f13478jhduphickx;
    }

    public zdlpuopuiu pmvmpeiblj() {
        return null;
    }

    public gtknphoqwx ppxfxbqfkf(nufgyqmvbu nufgyqmvbuVar) {
        if (this.f13491sopmlzcsov == null) {
            this.f13491sopmlzcsov = new ArrayList();
        }
        this.f13491sopmlzcsov.add(nufgyqmvbuVar);
        return this;
    }

    @Override // 
    /* JADX INFO: renamed from: rgvfuqvkyq */
    public gtknphoqwx clone() {
        try {
            gtknphoqwx gtknphoqwxVar = (gtknphoqwx) super.clone();
            gtknphoqwxVar.f13469crxdokpmqz = new ArrayList();
            gtknphoqwxVar.f13500ylkuphrtab = new esjtqupxsv();
            gtknphoqwxVar.f13488pkzmftpjix = new esjtqupxsv();
            gtknphoqwxVar.f13473hkdspvbjdz = null;
            gtknphoqwxVar.f13467cllcsxoeiz = null;
            gtknphoqwxVar.f13474ikoacuggdj = null;
            gtknphoqwxVar.f13494ulzqkzuiru = this;
            gtknphoqwxVar.f13491sopmlzcsov = null;
            return gtknphoqwxVar;
        } catch (CloneNotSupportedException e13) {
            throw new RuntimeException(e13);
        }
    }

    public void ribwqtqdhb(View view) {
        if (this.f13486ntlheqmsrt) {
            return;
        }
        int size = this.f13492stevsuqkhv.size();
        Animator[] animatorArr = (Animator[]) this.f13492stevsuqkhv.toArray(this.f13482kegysxyocb);
        this.f13482kegysxyocb = f13462jztzpxfvev;
        for (int i13 = size - 1; i13 >= 0; i13--) {
            Animator animator = animatorArr[i13];
            animatorArr[i13] = null;
            animator.pause();
        }
        this.f13482kegysxyocb = animatorArr;
        jlmebxxoox(dxjokdxxww.f13506wkgbmnqykc, false);
        this.f13485mbcevpiqjq = true;
    }

    void rlfsiqarku(long j13, long j14) {
        long jPkzmftpjix = pkzmftpjix();
        int i13 = 0;
        boolean z13 = j13 < j14;
        int i14 = (j14 > 0L ? 1 : (j14 == 0L ? 0 : -1));
        if ((i14 < 0 && j13 >= 0) || (j14 > jPkzmftpjix && j13 <= jPkzmftpjix)) {
            this.f13486ntlheqmsrt = false;
            jlmebxxoox(dxjokdxxww.f13504iobyxmoadg, z13);
        }
        Animator[] animatorArr = (Animator[]) this.f13492stevsuqkhv.toArray(this.f13482kegysxyocb);
        this.f13482kegysxyocb = f13462jztzpxfvev;
        for (int size = this.f13492stevsuqkhv.size(); i13 < size; size = size) {
            Animator animator = animatorArr[i13];
            animatorArr[i13] = null;
            gxszxtbevo.zoijcleaow(animator, Math.min(Math.max(0L, j13), gxszxtbevo.iobyxmoadg(animator)));
            i13++;
            i14 = i14;
        }
        int i15 = i14;
        this.f13482kegysxyocb = animatorArr;
        if ((j13 <= jPkzmftpjix || j14 > jPkzmftpjix) && (j13 >= 0 || i15 < 0)) {
            return;
        }
        if (j13 > jPkzmftpjix) {
            this.f13486ntlheqmsrt = true;
        }
        jlmebxxoox(dxjokdxxww.f13507zoijcleaow, z13);
    }

    public void sflfametgt(zdlpuopuiu zdlpuopuiuVar) {
    }

    public String toString() {
        return bfopjjpdmp("");
    }

    public void uwvvkdfqfp(eablkybsjg eablkybsjgVar) {
        this.f13479jlmebxxoox = eablkybsjgVar;
    }

    public Animator vdvldrhtss(ViewGroup viewGroup, cqumvgiudr cqumvgiudrVar, cqumvgiudr cqumvgiudrVar2) {
        return null;
    }

    void vipkmwdibw(ViewGroup viewGroup) {
        wkgbmnqykc wkgbmnqykcVar;
        this.f13473hkdspvbjdz = new ArrayList();
        this.f13467cllcsxoeiz = new ArrayList();
        sopmlzcsov(this.f13500ylkuphrtab, this.f13488pkzmftpjix);
        androidx.collection.iobyxmoadg iobyxmoadgVarIstkbnxepw = istkbnxepw();
        int size = iobyxmoadgVarIstkbnxepw.size();
        WindowId windowId = viewGroup.getWindowId();
        for (int i13 = size - 1; i13 >= 0; i13--) {
            Animator animator = (Animator) iobyxmoadgVarIstkbnxepw.gxszxtbevo(i13);
            if (animator != null && (wkgbmnqykcVar = (wkgbmnqykc) iobyxmoadgVarIstkbnxepw.get(animator)) != null && wkgbmnqykcVar.f13521iobyxmoadg != null && windowId.equals(wkgbmnqykcVar.f13523wkgbmnqykc)) {
                cqumvgiudr cqumvgiudrVar = wkgbmnqykcVar.f13522ppxfxbqfkf;
                View view = wkgbmnqykcVar.f13521iobyxmoadg;
                cqumvgiudr cqumvgiudrVarJpowsppfya = jpowsppfya(view, true);
                cqumvgiudr cqumvgiudrVarCqumvgiudr = cqumvgiudr(view, true);
                if (cqumvgiudrVarJpowsppfya == null && cqumvgiudrVarCqumvgiudr == null) {
                    cqumvgiudrVarCqumvgiudr = (cqumvgiudr) this.f13488pkzmftpjix.f13458iobyxmoadg.get(view);
                }
                if ((cqumvgiudrVarJpowsppfya != null || cqumvgiudrVarCqumvgiudr != null) && wkgbmnqykcVar.f13519eablkybsjg.dsvhmnatus(cqumvgiudrVar, cqumvgiudrVarCqumvgiudr)) {
                    gtknphoqwx gtknphoqwxVar = wkgbmnqykcVar.f13519eablkybsjg;
                    if (gtknphoqwxVar.zynmafqrjb().f13474ikoacuggdj != null) {
                        animator.cancel();
                        gtknphoqwxVar.f13492stevsuqkhv.remove(animator);
                        iobyxmoadgVarIstkbnxepw.remove(animator);
                        if (gtknphoqwxVar.f13492stevsuqkhv.size() == 0) {
                            gtknphoqwxVar.jlmebxxoox(dxjokdxxww.f13505ppxfxbqfkf, false);
                            if (!gtknphoqwxVar.f13486ntlheqmsrt) {
                                gtknphoqwxVar.f13486ntlheqmsrt = true;
                                gtknphoqwxVar.jlmebxxoox(dxjokdxxww.f13507zoijcleaow, false);
                            }
                        }
                    } else if (animator.isRunning() || animator.isStarted()) {
                        animator.cancel();
                    } else {
                        iobyxmoadgVarIstkbnxepw.remove(animator);
                    }
                }
            }
        }
        oxmwwwfdhm(viewGroup, this.f13500ylkuphrtab, this.f13488pkzmftpjix, this.f13473hkdspvbjdz, this.f13467cllcsxoeiz);
        if (this.f13474ikoacuggdj == null) {
            metgxyhuhe();
        } else if (Build.VERSION.SDK_INT >= 34) {
            jhduphickx();
            this.f13474ikoacuggdj.vdvldrhtss();
            this.f13474ikoacuggdj.kcexrzcfyt();
        }
    }

    public abstract void wflxmlrfwp(cqumvgiudr cqumvgiudrVar);

    public gtknphoqwx wkgbmnqykc(View view) {
        this.f13471esjtqupxsv.add(view);
        return this;
    }

    boolean wypolnanlu(View view) {
        ArrayList arrayList;
        ArrayList arrayList2;
        int id2 = view.getId();
        ArrayList arrayList3 = this.f13502zynmafqrjb;
        if (arrayList3 != null && arrayList3.contains(Integer.valueOf(id2))) {
            return false;
        }
        ArrayList arrayList4 = this.f13476istkbnxepw;
        if (arrayList4 != null && arrayList4.contains(view)) {
            return false;
        }
        ArrayList arrayList5 = this.f13466cdpycssgdh;
        if (arrayList5 != null) {
            int size = arrayList5.size();
            for (int i13 = 0; i13 < size; i13++) {
                if (((Class) this.f13466cdpycssgdh.get(i13)).isInstance(view)) {
                    return false;
                }
            }
        }
        if (this.f13498yadqdtsiqt != null && jhduphickx.ylkuphrtab(view) != null && this.f13498yadqdtsiqt.contains(jhduphickx.ylkuphrtab(view))) {
            return false;
        }
        if ((this.f13468cqumvgiudr.size() == 0 && this.f13471esjtqupxsv.size() == 0 && (((arrayList = this.f13489pmvmpeiblj) == null || arrayList.isEmpty()) && ((arrayList2 = this.f13483lereixgezr) == null || arrayList2.isEmpty()))) || this.f13468cqumvgiudr.contains(Integer.valueOf(id2)) || this.f13471esjtqupxsv.contains(view)) {
            return true;
        }
        ArrayList arrayList6 = this.f13483lereixgezr;
        if (arrayList6 != null && arrayList6.contains(jhduphickx.ylkuphrtab(view))) {
            return true;
        }
        if (this.f13489pmvmpeiblj != null) {
            for (int i14 = 0; i14 < this.f13489pmvmpeiblj.size(); i14++) {
                if (((Class) this.f13489pmvmpeiblj.get(i14)).isInstance(view)) {
                    return true;
                }
            }
        }
        return false;
    }

    public List yadqdtsiqt() {
        return this.f13468cqumvgiudr;
    }

    public void ydmasvzmpa(androidx.transition.lqeggnwhkg lqeggnwhkgVar) {
        if (lqeggnwhkgVar == null) {
            this.f13495vipkmwdibw = f13463metgxyhuhe;
        } else {
            this.f13495vipkmwdibw = lqeggnwhkgVar;
        }
    }

    public gtknphoqwx yfnezrywwk(TimeInterpolator timeInterpolator) {
        this.f13477iwizpuwonk = timeInterpolator;
        return this;
    }

    public long yggfygwlhe() {
        return this.f13481jyumaefscl;
    }

    public List ylkuphrtab() {
        return this.f13471esjtqupxsv;
    }

    protected void zdlpuopuiu() {
        int i13 = this.f13493tzroggbefp - 1;
        this.f13493tzroggbefp = i13;
        if (i13 == 0) {
            jlmebxxoox(dxjokdxxww.f13507zoijcleaow, false);
            for (int i14 = 0; i14 < this.f13500ylkuphrtab.f13459ppxfxbqfkf.wflxmlrfwp(); i14++) {
                View view = (View) this.f13500ylkuphrtab.f13459ppxfxbqfkf.agtfadlqog(i14);
                if (view != null) {
                    view.setHasTransientState(false);
                }
            }
            for (int i15 = 0; i15 < this.f13488pkzmftpjix.f13459ppxfxbqfkf.wflxmlrfwp(); i15++) {
                View view2 = (View) this.f13488pkzmftpjix.f13459ppxfxbqfkf.agtfadlqog(i15);
                if (view2 != null) {
                    view2.setHasTransientState(false);
                }
            }
            this.f13486ntlheqmsrt = true;
        }
    }

    public gtknphoqwx zfvoamnweg(long j13) {
        this.f13499yggfygwlhe = j13;
        return this;
    }

    public final gtknphoqwx zynmafqrjb() {
        jyumaefscl jyumaefsclVar = this.f13472hcddaimhww;
        return jyumaefsclVar != null ? jyumaefsclVar.zynmafqrjb() : this;
    }
}
