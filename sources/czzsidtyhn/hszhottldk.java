package czzsidtyhn;

import android.view.View;
import android.view.WindowInsets;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class hszhottldk {

    /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
    public static final iobyxmoadg f26335cqumvgiudr = new iobyxmoadg(null);

    /* JADX INFO: renamed from: esjtqupxsv, reason: collision with root package name */
    public static final int f26336esjtqupxsv = 8;

    /* JADX INFO: renamed from: lereixgezr, reason: collision with root package name */
    private static final WeakHashMap f26337lereixgezr = new WeakHashMap();

    /* JADX INFO: renamed from: pmvmpeiblj, reason: collision with root package name */
    private static boolean f26338pmvmpeiblj;

    /* JADX INFO: renamed from: agtfadlqog, reason: collision with root package name */
    private final skhdrjzrfn f26339agtfadlqog;

    /* JADX INFO: renamed from: btonecajqb, reason: collision with root package name */
    private final skhdrjzrfn f26340btonecajqb;

    /* JADX INFO: renamed from: draadjrbmk, reason: collision with root package name */
    private final lxfrhoxuzk f26341draadjrbmk;

    /* JADX INFO: renamed from: dxjokdxxww, reason: collision with root package name */
    private final ppxfxbqfkf f26342dxjokdxxww;

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private final ppxfxbqfkf f26343eablkybsjg;

    /* JADX INFO: renamed from: gtknphoqwx, reason: collision with root package name */
    private final lxfrhoxuzk f26344gtknphoqwx;

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    private final ppxfxbqfkf f26345gxszxtbevo;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final ppxfxbqfkf f26346iobyxmoadg;

    /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
    private final ulzqkzuiru f26347iwizpuwonk;

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
    private int f26348jyumaefscl;

    /* JADX INFO: renamed from: kcexrzcfyt, reason: collision with root package name */
    private final skhdrjzrfn f26349kcexrzcfyt;

    /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
    private final ppxfxbqfkf f26350lqeggnwhkg;

    /* JADX INFO: renamed from: nufgyqmvbu, reason: collision with root package name */
    private final ppxfxbqfkf f26351nufgyqmvbu;

    /* JADX INFO: renamed from: ojitshcjhn, reason: collision with root package name */
    private final skhdrjzrfn f26352ojitshcjhn;

    /* JADX INFO: renamed from: oxmwwwfdhm, reason: collision with root package name */
    private final skhdrjzrfn f26353oxmwwwfdhm;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final ppxfxbqfkf f26354ppxfxbqfkf;

    /* JADX INFO: renamed from: rgvfuqvkyq, reason: collision with root package name */
    private final skhdrjzrfn f26355rgvfuqvkyq;

    /* JADX INFO: renamed from: vdvldrhtss, reason: collision with root package name */
    private final skhdrjzrfn f26356vdvldrhtss;

    /* JADX INFO: renamed from: wflxmlrfwp, reason: collision with root package name */
    private final lxfrhoxuzk f26357wflxmlrfwp;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final ppxfxbqfkf f26358wkgbmnqykc;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    private final boolean f26359yggfygwlhe;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    private final skhdrjzrfn f26360zdlpuopuiu;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final ppxfxbqfkf f26361zoijcleaow;

    public static final class iobyxmoadg {

        /* JADX INFO: renamed from: czzsidtyhn.hszhottldk$iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
        public static final class C0473iobyxmoadg implements androidx.compose.runtime.ntlheqmsrt {

            /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
            final /* synthetic */ hszhottldk f26362iobyxmoadg;

            /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
            final /* synthetic */ View f26363zoijcleaow;

            public C0473iobyxmoadg(hszhottldk hszhottldkVar, View view) {
                this.f26362iobyxmoadg = hszhottldkVar;
                this.f26363zoijcleaow = view;
            }

            @Override // androidx.compose.runtime.ntlheqmsrt
            public void iobyxmoadg() {
                this.f26362iobyxmoadg.zoijcleaow(this.f26363zoijcleaow);
            }
        }

        public /* synthetic */ iobyxmoadg(kotlin.jvm.internal.gtknphoqwx gtknphoqwxVar) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final androidx.compose.runtime.ntlheqmsrt eablkybsjg(hszhottldk hszhottldkVar, View view, androidx.compose.runtime.ulzqkzuiru ulzqkzuiruVar) {
            hszhottldkVar.dxjokdxxww(view);
            return new C0473iobyxmoadg(hszhottldkVar, view);
        }

        private final hszhottldk gxszxtbevo(View view) {
            hszhottldk hszhottldkVar;
            synchronized (hszhottldk.f26337lereixgezr) {
                try {
                    WeakHashMap weakHashMap = hszhottldk.f26337lereixgezr;
                    Object obj = weakHashMap.get(view);
                    Object obj2 = obj;
                    if (obj == null) {
                        hszhottldk hszhottldkVar2 = new hszhottldk(null, view, false ? 1 : 0);
                        weakHashMap.put(view, hszhottldkVar2);
                        obj2 = hszhottldkVar2;
                    }
                    hszhottldkVar = (hszhottldk) obj2;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            return hszhottldkVar;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final ppxfxbqfkf lqeggnwhkg(v1.skhdrjzrfn skhdrjzrfnVar, int i13, String str) {
            ppxfxbqfkf ppxfxbqfkfVar = new ppxfxbqfkf(i13, str);
            if (skhdrjzrfnVar != null) {
                ppxfxbqfkfVar.nufgyqmvbu(skhdrjzrfnVar, i13);
            }
            return ppxfxbqfkfVar;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final skhdrjzrfn nufgyqmvbu(v1.skhdrjzrfn skhdrjzrfnVar, int i13, String str) {
            j1.wkgbmnqykc wkgbmnqykcVarLqeggnwhkg;
            if (skhdrjzrfnVar == null || (wkgbmnqykcVarLqeggnwhkg = skhdrjzrfnVar.lqeggnwhkg(i13)) == null) {
                wkgbmnqykcVarLqeggnwhkg = j1.wkgbmnqykc.f50504eablkybsjg;
            }
            return grlcpdaxtj.iobyxmoadg(wkgbmnqykcVarLqeggnwhkg, str);
        }

        public final hszhottldk wkgbmnqykc(androidx.compose.runtime.draadjrbmk draadjrbmkVar, int i13) {
            if (androidx.compose.runtime.jyumaefscl.jpowsppfya()) {
                androidx.compose.runtime.jyumaefscl.ntlheqmsrt(-1366542614, i13, -1, "androidx.compose.foundation.layout.WindowInsetsHolder.Companion.current (WindowInsets.android.kt:549)");
            }
            final View view = (View) draadjrbmkVar.ojitshcjhn(AndroidCompositionLocals_androidKt.gtknphoqwx());
            final hszhottldk hszhottldkVarGxszxtbevo = gxszxtbevo(view);
            boolean zLmojexxdyd = draadjrbmkVar.lmojexxdyd(hszhottldkVarGxszxtbevo) | draadjrbmkVar.lmojexxdyd(view);
            Object objYadqdtsiqt = draadjrbmkVar.yadqdtsiqt();
            if (zLmojexxdyd || objYadqdtsiqt == androidx.compose.runtime.draadjrbmk.f5569iobyxmoadg.iobyxmoadg()) {
                objYadqdtsiqt = new tg.draadjrbmk() { // from class: czzsidtyhn.wizcaqwiak
                    @Override // tg.draadjrbmk
                    public final Object invoke(Object obj) {
                        return hszhottldk.iobyxmoadg.eablkybsjg(hszhottldkVarGxszxtbevo, view, (androidx.compose.runtime.ulzqkzuiru) obj);
                    }
                };
                draadjrbmkVar.jyumaefscl(objYadqdtsiqt);
            }
            androidx.compose.runtime.jlmebxxoox.zoijcleaow(hszhottldkVarGxszxtbevo, (tg.draadjrbmk) objYadqdtsiqt, draadjrbmkVar, 0);
            if (androidx.compose.runtime.jyumaefscl.jpowsppfya()) {
                androidx.compose.runtime.jyumaefscl.mbcevpiqjq();
            }
            return hszhottldkVarGxszxtbevo;
        }

        private iobyxmoadg() {
        }
    }

    public /* synthetic */ hszhottldk(v1.skhdrjzrfn skhdrjzrfnVar, View view, kotlin.jvm.internal.gtknphoqwx gtknphoqwxVar) {
        this(skhdrjzrfnVar, view);
    }

    public static /* synthetic */ void gtknphoqwx(hszhottldk hszhottldkVar, v1.skhdrjzrfn skhdrjzrfnVar, int i13, int i14, Object obj) {
        if ((i14 & 2) != 0) {
            i13 = 0;
        }
        hszhottldkVar.btonecajqb(skhdrjzrfnVar, i13);
    }

    public final void btonecajqb(v1.skhdrjzrfn skhdrjzrfnVar, int i13) {
        if (f26338pmvmpeiblj) {
            WindowInsets windowInsetsCqumvgiudr = skhdrjzrfnVar.cqumvgiudr();
            kotlin.jvm.internal.zdlpuopuiu.lqeggnwhkg(windowInsetsCqumvgiudr);
            skhdrjzrfnVar = v1.skhdrjzrfn.esjtqupxsv(windowInsetsCqumvgiudr);
        }
        this.f26346iobyxmoadg.nufgyqmvbu(skhdrjzrfnVar, i13);
        this.f26354ppxfxbqfkf.nufgyqmvbu(skhdrjzrfnVar, i13);
        this.f26361zoijcleaow.nufgyqmvbu(skhdrjzrfnVar, i13);
        this.f26343eablkybsjg.nufgyqmvbu(skhdrjzrfnVar, i13);
        this.f26345gxszxtbevo.nufgyqmvbu(skhdrjzrfnVar, i13);
        this.f26350lqeggnwhkg.nufgyqmvbu(skhdrjzrfnVar, i13);
        this.f26351nufgyqmvbu.nufgyqmvbu(skhdrjzrfnVar, i13);
        this.f26342dxjokdxxww.nufgyqmvbu(skhdrjzrfnVar, i13);
        this.f26358wkgbmnqykc.nufgyqmvbu(skhdrjzrfnVar, i13);
        if (i13 == 0) {
            this.f26339agtfadlqog.gxszxtbevo(grlcpdaxtj.ppxfxbqfkf(skhdrjzrfnVar.lqeggnwhkg(v1.skhdrjzrfn.draadjrbmk.zoijcleaow())));
            this.f26352ojitshcjhn.gxszxtbevo(grlcpdaxtj.ppxfxbqfkf(skhdrjzrfnVar.lqeggnwhkg(v1.skhdrjzrfn.draadjrbmk.lqeggnwhkg())));
            this.f26355rgvfuqvkyq.gxszxtbevo(grlcpdaxtj.ppxfxbqfkf(skhdrjzrfnVar.lqeggnwhkg(v1.skhdrjzrfn.draadjrbmk.nufgyqmvbu())));
            this.f26356vdvldrhtss.gxszxtbevo(grlcpdaxtj.ppxfxbqfkf(skhdrjzrfnVar.lqeggnwhkg(v1.skhdrjzrfn.draadjrbmk.dxjokdxxww())));
            this.f26353oxmwwwfdhm.gxszxtbevo(grlcpdaxtj.ppxfxbqfkf(skhdrjzrfnVar.lqeggnwhkg(v1.skhdrjzrfn.draadjrbmk.gtknphoqwx())));
            v1.oxmwwwfdhm oxmwwwfdhmVarEablkybsjg = skhdrjzrfnVar.eablkybsjg();
            if (oxmwwwfdhmVarEablkybsjg != null) {
                this.f26340btonecajqb.gxszxtbevo(grlcpdaxtj.ppxfxbqfkf(oxmwwwfdhmVarEablkybsjg.gxszxtbevo()));
            }
        }
        androidx.compose.runtime.snapshots.lqeggnwhkg.f6010eablkybsjg.agtfadlqog();
    }

    public final void draadjrbmk(v1.skhdrjzrfn skhdrjzrfnVar) {
        this.f26360zdlpuopuiu.gxszxtbevo(grlcpdaxtj.ppxfxbqfkf(skhdrjzrfnVar.gxszxtbevo(v1.skhdrjzrfn.draadjrbmk.wkgbmnqykc())));
    }

    public final void dxjokdxxww(View view) {
        if (this.f26348jyumaefscl == 0) {
            v1.jhduphickx.igdgnonuha(view, this.f26347iwizpuwonk);
            if (view.isAttachedToWindow()) {
                view.requestApplyInsets();
            }
            view.addOnAttachStateChangeListener(this.f26347iwizpuwonk);
            v1.jhduphickx.grlcpdaxtj(view, this.f26347iwizpuwonk);
        }
        this.f26348jyumaefscl++;
    }

    public final ppxfxbqfkf eablkybsjg() {
        return this.f26343eablkybsjg;
    }

    public final lxfrhoxuzk gxszxtbevo() {
        return this.f26344gtknphoqwx;
    }

    public final ppxfxbqfkf lqeggnwhkg() {
        return this.f26345gxszxtbevo;
    }

    public final ppxfxbqfkf nufgyqmvbu() {
        return this.f26350lqeggnwhkg;
    }

    public final boolean ppxfxbqfkf() {
        return this.f26359yggfygwlhe;
    }

    public final void wflxmlrfwp(v1.skhdrjzrfn skhdrjzrfnVar) {
        this.f26349kcexrzcfyt.gxszxtbevo(grlcpdaxtj.ppxfxbqfkf(skhdrjzrfnVar.gxszxtbevo(v1.skhdrjzrfn.draadjrbmk.wkgbmnqykc())));
    }

    public final ppxfxbqfkf wkgbmnqykc() {
        return this.f26354ppxfxbqfkf;
    }

    public final void zoijcleaow(View view) {
        int i13 = this.f26348jyumaefscl - 1;
        this.f26348jyumaefscl = i13;
        if (i13 == 0) {
            v1.jhduphickx.igdgnonuha(view, null);
            v1.jhduphickx.grlcpdaxtj(view, null);
            view.removeOnAttachStateChangeListener(this.f26347iwizpuwonk);
        }
    }

    private hszhottldk(v1.skhdrjzrfn skhdrjzrfnVar, View view) {
        v1.oxmwwwfdhm oxmwwwfdhmVarEablkybsjg;
        j1.wkgbmnqykc wkgbmnqykcVarGxszxtbevo;
        iobyxmoadg iobyxmoadgVar = f26335cqumvgiudr;
        this.f26346iobyxmoadg = iobyxmoadgVar.lqeggnwhkg(skhdrjzrfnVar, v1.skhdrjzrfn.draadjrbmk.zoijcleaow(), "captionBar");
        ppxfxbqfkf ppxfxbqfkfVarLqeggnwhkg = iobyxmoadgVar.lqeggnwhkg(skhdrjzrfnVar, v1.skhdrjzrfn.draadjrbmk.ppxfxbqfkf(), "displayCutout");
        this.f26361zoijcleaow = ppxfxbqfkfVarLqeggnwhkg;
        ppxfxbqfkf ppxfxbqfkfVarLqeggnwhkg2 = iobyxmoadgVar.lqeggnwhkg(skhdrjzrfnVar, v1.skhdrjzrfn.draadjrbmk.wkgbmnqykc(), "ime");
        this.f26354ppxfxbqfkf = ppxfxbqfkfVarLqeggnwhkg2;
        ppxfxbqfkf ppxfxbqfkfVarLqeggnwhkg3 = iobyxmoadgVar.lqeggnwhkg(skhdrjzrfnVar, v1.skhdrjzrfn.draadjrbmk.gxszxtbevo(), "mandatorySystemGestures");
        this.f26358wkgbmnqykc = ppxfxbqfkfVarLqeggnwhkg3;
        this.f26343eablkybsjg = iobyxmoadgVar.lqeggnwhkg(skhdrjzrfnVar, v1.skhdrjzrfn.draadjrbmk.lqeggnwhkg(), "navigationBars");
        this.f26345gxszxtbevo = iobyxmoadgVar.lqeggnwhkg(skhdrjzrfnVar, v1.skhdrjzrfn.draadjrbmk.nufgyqmvbu(), "statusBars");
        ppxfxbqfkf ppxfxbqfkfVarLqeggnwhkg4 = iobyxmoadgVar.lqeggnwhkg(skhdrjzrfnVar, v1.skhdrjzrfn.draadjrbmk.dxjokdxxww(), "systemBars");
        this.f26350lqeggnwhkg = ppxfxbqfkfVarLqeggnwhkg4;
        ppxfxbqfkf ppxfxbqfkfVarLqeggnwhkg5 = iobyxmoadgVar.lqeggnwhkg(skhdrjzrfnVar, v1.skhdrjzrfn.draadjrbmk.btonecajqb(), "systemGestures");
        this.f26351nufgyqmvbu = ppxfxbqfkfVarLqeggnwhkg5;
        ppxfxbqfkf ppxfxbqfkfVarLqeggnwhkg6 = iobyxmoadgVar.lqeggnwhkg(skhdrjzrfnVar, v1.skhdrjzrfn.draadjrbmk.gtknphoqwx(), "tappableElement");
        this.f26342dxjokdxxww = ppxfxbqfkfVarLqeggnwhkg6;
        skhdrjzrfn skhdrjzrfnVarIobyxmoadg = grlcpdaxtj.iobyxmoadg((skhdrjzrfnVar == null || (oxmwwwfdhmVarEablkybsjg = skhdrjzrfnVar.eablkybsjg()) == null || (wkgbmnqykcVarGxszxtbevo = oxmwwwfdhmVarEablkybsjg.gxszxtbevo()) == null) ? j1.wkgbmnqykc.f50504eablkybsjg : wkgbmnqykcVarGxszxtbevo, "waterfall");
        this.f26340btonecajqb = skhdrjzrfnVarIobyxmoadg;
        lxfrhoxuzk lxfrhoxuzkVarDxjokdxxww = fiwbwshyhd.dxjokdxxww(fiwbwshyhd.dxjokdxxww(ppxfxbqfkfVarLqeggnwhkg4, ppxfxbqfkfVarLqeggnwhkg2), ppxfxbqfkfVarLqeggnwhkg);
        this.f26344gtknphoqwx = lxfrhoxuzkVarDxjokdxxww;
        lxfrhoxuzk lxfrhoxuzkVarDxjokdxxww2 = fiwbwshyhd.dxjokdxxww(fiwbwshyhd.dxjokdxxww(fiwbwshyhd.dxjokdxxww(ppxfxbqfkfVarLqeggnwhkg6, ppxfxbqfkfVarLqeggnwhkg3), ppxfxbqfkfVarLqeggnwhkg5), skhdrjzrfnVarIobyxmoadg);
        this.f26341draadjrbmk = lxfrhoxuzkVarDxjokdxxww2;
        this.f26357wflxmlrfwp = fiwbwshyhd.dxjokdxxww(lxfrhoxuzkVarDxjokdxxww, lxfrhoxuzkVarDxjokdxxww2);
        this.f26339agtfadlqog = iobyxmoadgVar.nufgyqmvbu(skhdrjzrfnVar, v1.skhdrjzrfn.draadjrbmk.zoijcleaow(), "captionBarIgnoringVisibility");
        this.f26352ojitshcjhn = iobyxmoadgVar.nufgyqmvbu(skhdrjzrfnVar, v1.skhdrjzrfn.draadjrbmk.lqeggnwhkg(), "navigationBarsIgnoringVisibility");
        this.f26355rgvfuqvkyq = iobyxmoadgVar.nufgyqmvbu(skhdrjzrfnVar, v1.skhdrjzrfn.draadjrbmk.nufgyqmvbu(), "statusBarsIgnoringVisibility");
        this.f26356vdvldrhtss = iobyxmoadgVar.nufgyqmvbu(skhdrjzrfnVar, v1.skhdrjzrfn.draadjrbmk.dxjokdxxww(), "systemBarsIgnoringVisibility");
        this.f26353oxmwwwfdhm = iobyxmoadgVar.nufgyqmvbu(skhdrjzrfnVar, v1.skhdrjzrfn.draadjrbmk.gtknphoqwx(), "tappableElementIgnoringVisibility");
        this.f26349kcexrzcfyt = iobyxmoadgVar.nufgyqmvbu(skhdrjzrfnVar, v1.skhdrjzrfn.draadjrbmk.wkgbmnqykc(), "imeAnimationTarget");
        this.f26360zdlpuopuiu = iobyxmoadgVar.nufgyqmvbu(skhdrjzrfnVar, v1.skhdrjzrfn.draadjrbmk.wkgbmnqykc(), "imeAnimationSource");
        Object parent = view.getParent();
        View view2 = parent instanceof View ? (View) parent : null;
        Object tag = view2 != null ? view2.getTag(a.gtknphoqwx.consume_window_insets_tag) : null;
        Boolean bool = tag instanceof Boolean ? (Boolean) tag : null;
        this.f26359yggfygwlhe = bool != null ? bool.booleanValue() : !oxmwwwfdhm.f26441zoijcleaow;
        this.f26347iwizpuwonk = new ulzqkzuiru(this);
    }
}
