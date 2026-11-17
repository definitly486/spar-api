package androidx.appcompat.app;

import android.R;
import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import androidx.appcompat.widget.ActionBarContainer;
import androidx.appcompat.widget.ActionBarContextView;
import androidx.appcompat.widget.ActionBarOverlayLayout;
import androidx.appcompat.widget.Toolbar;
import androidx.appcompat.widget.lereixgezr;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import v1.jhduphickx;
import v1.sflfametgt;
import v1.ydmasvzmpa;
import v1.yfnezrywwk;
import v1.zfvoamnweg;

/* JADX INFO: loaded from: classes.dex */
public class esjtqupxsv extends androidx.appcompat.app.iobyxmoadg implements ActionBarOverlayLayout.wkgbmnqykc {

    /* JADX INFO: renamed from: cdpycssgdh, reason: collision with root package name */
    private static final Interpolator f2594cdpycssgdh = new AccelerateInterpolator();

    /* JADX INFO: renamed from: yadqdtsiqt, reason: collision with root package name */
    private static final Interpolator f2595yadqdtsiqt = new DecelerateInterpolator();

    /* JADX INFO: renamed from: agtfadlqog, reason: collision with root package name */
    androidx.appcompat.view.zoijcleaow.iobyxmoadg f2596agtfadlqog;

    /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
    androidx.appcompat.view.nufgyqmvbu f2598cqumvgiudr;

    /* JADX INFO: renamed from: draadjrbmk, reason: collision with root package name */
    wkgbmnqykc f2599draadjrbmk;

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    ActionBarContainer f2601eablkybsjg;

    /* JADX INFO: renamed from: esjtqupxsv, reason: collision with root package name */
    private boolean f2602esjtqupxsv;

    /* JADX INFO: renamed from: gtknphoqwx, reason: collision with root package name */
    private boolean f2603gtknphoqwx;

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    lereixgezr f2604gxszxtbevo;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    Context f2605iobyxmoadg;

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
    private boolean f2608jyumaefscl;

    /* JADX INFO: renamed from: lereixgezr, reason: collision with root package name */
    boolean f2610lereixgezr;

    /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
    ActionBarContextView f2611lqeggnwhkg;

    /* JADX INFO: renamed from: nufgyqmvbu, reason: collision with root package name */
    View f2612nufgyqmvbu;

    /* JADX INFO: renamed from: ojitshcjhn, reason: collision with root package name */
    private boolean f2613ojitshcjhn;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private Activity f2616ppxfxbqfkf;

    /* JADX INFO: renamed from: vdvldrhtss, reason: collision with root package name */
    private boolean f2618vdvldrhtss;

    /* JADX INFO: renamed from: wflxmlrfwp, reason: collision with root package name */
    androidx.appcompat.view.zoijcleaow f2619wflxmlrfwp;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    ActionBarOverlayLayout f2620wkgbmnqykc;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    boolean f2621yggfygwlhe;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    boolean f2622zdlpuopuiu;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private Context f2623zoijcleaow;

    /* JADX INFO: renamed from: dxjokdxxww, reason: collision with root package name */
    private ArrayList f2600dxjokdxxww = new ArrayList();

    /* JADX INFO: renamed from: btonecajqb, reason: collision with root package name */
    private int f2597btonecajqb = -1;

    /* JADX INFO: renamed from: rgvfuqvkyq, reason: collision with root package name */
    private ArrayList f2617rgvfuqvkyq = new ArrayList();

    /* JADX INFO: renamed from: oxmwwwfdhm, reason: collision with root package name */
    private int f2614oxmwwwfdhm = 0;

    /* JADX INFO: renamed from: kcexrzcfyt, reason: collision with root package name */
    boolean f2609kcexrzcfyt = true;

    /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
    private boolean f2607iwizpuwonk = true;

    /* JADX INFO: renamed from: pmvmpeiblj, reason: collision with root package name */
    final ydmasvzmpa f2615pmvmpeiblj = new iobyxmoadg();

    /* JADX INFO: renamed from: zynmafqrjb, reason: collision with root package name */
    final ydmasvzmpa f2624zynmafqrjb = new zoijcleaow();

    /* JADX INFO: renamed from: istkbnxepw, reason: collision with root package name */
    final zfvoamnweg f2606istkbnxepw = new ppxfxbqfkf();

    class iobyxmoadg extends sflfametgt {
        iobyxmoadg() {
        }

        @Override // v1.ydmasvzmpa
        public void zoijcleaow(View view) {
            View view2;
            esjtqupxsv esjtqupxsvVar = esjtqupxsv.this;
            if (esjtqupxsvVar.f2609kcexrzcfyt && (view2 = esjtqupxsvVar.f2612nufgyqmvbu) != null) {
                view2.setTranslationY(0.0f);
                esjtqupxsv.this.f2601eablkybsjg.setTranslationY(0.0f);
            }
            esjtqupxsv.this.f2601eablkybsjg.setVisibility(8);
            esjtqupxsv.this.f2601eablkybsjg.setTransitioning(false);
            esjtqupxsv esjtqupxsvVar2 = esjtqupxsv.this;
            esjtqupxsvVar2.f2598cqumvgiudr = null;
            esjtqupxsvVar2.cqumvgiudr();
            ActionBarOverlayLayout actionBarOverlayLayout = esjtqupxsv.this.f2620wkgbmnqykc;
            if (actionBarOverlayLayout != null) {
                jhduphickx.ydmasvzmpa(actionBarOverlayLayout);
            }
        }
    }

    class ppxfxbqfkf implements zfvoamnweg {
        ppxfxbqfkf() {
        }

        @Override // v1.zfvoamnweg
        public void iobyxmoadg(View view) {
            ((View) esjtqupxsv.this.f2601eablkybsjg.getParent()).invalidate();
        }
    }

    public class wkgbmnqykc extends androidx.appcompat.view.zoijcleaow implements androidx.appcompat.view.menu.eablkybsjg.iobyxmoadg {

        /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
        private androidx.appcompat.view.zoijcleaow.iobyxmoadg f2627cqumvgiudr;

        /* JADX INFO: renamed from: esjtqupxsv, reason: collision with root package name */
        private WeakReference f2628esjtqupxsv;

        /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
        private final androidx.appcompat.view.menu.eablkybsjg f2629iwizpuwonk;

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        private final Context f2630jyumaefscl;

        public wkgbmnqykc(Context context, androidx.appcompat.view.zoijcleaow.iobyxmoadg iobyxmoadgVar) {
            this.f2630jyumaefscl = context;
            this.f2627cqumvgiudr = iobyxmoadgVar;
            androidx.appcompat.view.menu.eablkybsjg eablkybsjgVarMbcevpiqjq = new androidx.appcompat.view.menu.eablkybsjg(context).mbcevpiqjq(1);
            this.f2629iwizpuwonk = eablkybsjgVarMbcevpiqjq;
            eablkybsjgVarMbcevpiqjq.tzroggbefp(this);
        }

        @Override // androidx.appcompat.view.zoijcleaow
        public void agtfadlqog(int i13) {
            ojitshcjhn(esjtqupxsv.this.f2605iobyxmoadg.getResources().getString(i13));
        }

        @Override // androidx.appcompat.view.zoijcleaow
        public boolean draadjrbmk() {
            return esjtqupxsv.this.f2611lqeggnwhkg.btonecajqb();
        }

        @Override // androidx.appcompat.view.zoijcleaow
        public CharSequence dxjokdxxww() {
            return esjtqupxsv.this.f2611lqeggnwhkg.getTitle();
        }

        @Override // androidx.appcompat.view.zoijcleaow
        public Menu eablkybsjg() {
            return this.f2629iwizpuwonk;
        }

        @Override // androidx.appcompat.view.zoijcleaow
        public void gtknphoqwx() {
            if (esjtqupxsv.this.f2599draadjrbmk != this) {
                return;
            }
            this.f2629iwizpuwonk.jztzpxfvev();
            try {
                this.f2627cqumvgiudr.wkgbmnqykc(this, this.f2629iwizpuwonk);
            } finally {
                this.f2629iwizpuwonk.okpsazkaxt();
            }
        }

        @Override // androidx.appcompat.view.zoijcleaow
        public MenuInflater gxszxtbevo() {
            return new androidx.appcompat.view.lqeggnwhkg(this.f2630jyumaefscl);
        }

        @Override // androidx.appcompat.view.menu.eablkybsjg.iobyxmoadg
        public boolean iobyxmoadg(androidx.appcompat.view.menu.eablkybsjg eablkybsjgVar, MenuItem menuItem) {
            androidx.appcompat.view.zoijcleaow.iobyxmoadg iobyxmoadgVar = this.f2627cqumvgiudr;
            if (iobyxmoadgVar != null) {
                return iobyxmoadgVar.ppxfxbqfkf(this, menuItem);
            }
            return false;
        }

        @Override // androidx.appcompat.view.zoijcleaow
        public void kcexrzcfyt(boolean z13) {
            super.kcexrzcfyt(z13);
            esjtqupxsv.this.f2611lqeggnwhkg.setTitleOptional(z13);
        }

        @Override // androidx.appcompat.view.zoijcleaow
        public CharSequence lqeggnwhkg() {
            return esjtqupxsv.this.f2611lqeggnwhkg.getSubtitle();
        }

        @Override // androidx.appcompat.view.zoijcleaow
        public void ojitshcjhn(CharSequence charSequence) {
            esjtqupxsv.this.f2611lqeggnwhkg.setSubtitle(charSequence);
        }

        @Override // androidx.appcompat.view.zoijcleaow
        public void oxmwwwfdhm(CharSequence charSequence) {
            esjtqupxsv.this.f2611lqeggnwhkg.setTitle(charSequence);
        }

        @Override // androidx.appcompat.view.zoijcleaow
        public void ppxfxbqfkf() {
            esjtqupxsv esjtqupxsvVar = esjtqupxsv.this;
            if (esjtqupxsvVar.f2599draadjrbmk != this) {
                return;
            }
            if (esjtqupxsv.iwizpuwonk(esjtqupxsvVar.f2622zdlpuopuiu, esjtqupxsvVar.f2621yggfygwlhe, false)) {
                this.f2627cqumvgiudr.iobyxmoadg(this);
            } else {
                esjtqupxsv esjtqupxsvVar2 = esjtqupxsv.this;
                esjtqupxsvVar2.f2619wflxmlrfwp = this;
                esjtqupxsvVar2.f2596agtfadlqog = this.f2627cqumvgiudr;
            }
            this.f2627cqumvgiudr = null;
            esjtqupxsv.this.jyumaefscl(false);
            esjtqupxsv.this.f2611lqeggnwhkg.lqeggnwhkg();
            esjtqupxsv esjtqupxsvVar3 = esjtqupxsv.this;
            esjtqupxsvVar3.f2620wkgbmnqykc.setHideOnContentScrollEnabled(esjtqupxsvVar3.f2610lereixgezr);
            esjtqupxsv.this.f2599draadjrbmk = null;
        }

        @Override // androidx.appcompat.view.zoijcleaow
        public void vdvldrhtss(int i13) {
            oxmwwwfdhm(esjtqupxsv.this.f2605iobyxmoadg.getResources().getString(i13));
        }

        @Override // androidx.appcompat.view.zoijcleaow
        public void wflxmlrfwp(View view) {
            esjtqupxsv.this.f2611lqeggnwhkg.setCustomView(view);
            this.f2628esjtqupxsv = new WeakReference(view);
        }

        @Override // androidx.appcompat.view.zoijcleaow
        public View wkgbmnqykc() {
            WeakReference weakReference = this.f2628esjtqupxsv;
            if (weakReference != null) {
                return (View) weakReference.get();
            }
            return null;
        }

        public boolean zdlpuopuiu() {
            this.f2629iwizpuwonk.jztzpxfvev();
            try {
                return this.f2627cqumvgiudr.zoijcleaow(this, this.f2629iwizpuwonk);
            } finally {
                this.f2629iwizpuwonk.okpsazkaxt();
            }
        }

        @Override // androidx.appcompat.view.menu.eablkybsjg.iobyxmoadg
        public void zoijcleaow(androidx.appcompat.view.menu.eablkybsjg eablkybsjgVar) {
            if (this.f2627cqumvgiudr == null) {
                return;
            }
            gtknphoqwx();
            esjtqupxsv.this.f2611lqeggnwhkg.draadjrbmk();
        }
    }

    class zoijcleaow extends sflfametgt {
        zoijcleaow() {
        }

        @Override // v1.ydmasvzmpa
        public void zoijcleaow(View view) {
            esjtqupxsv esjtqupxsvVar = esjtqupxsv.this;
            esjtqupxsvVar.f2598cqumvgiudr = null;
            esjtqupxsvVar.f2601eablkybsjg.requestLayout();
        }
    }

    public esjtqupxsv(Activity activity, boolean z13) {
        this.f2616ppxfxbqfkf = activity;
        View decorView = activity.getWindow().getDecorView();
        cdpycssgdh(decorView);
        if (z13) {
            return;
        }
        this.f2612nufgyqmvbu = decorView.findViewById(R.id.content);
    }

    private void cdpycssgdh(View view) {
        ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) view.findViewById(lqeggnwhkg.gxszxtbevo.decor_content_parent);
        this.f2620wkgbmnqykc = actionBarOverlayLayout;
        if (actionBarOverlayLayout != null) {
            actionBarOverlayLayout.setActionBarVisibilityCallback(this);
        }
        this.f2604gxszxtbevo = pmvmpeiblj(view.findViewById(lqeggnwhkg.gxszxtbevo.action_bar));
        this.f2611lqeggnwhkg = (ActionBarContextView) view.findViewById(lqeggnwhkg.gxszxtbevo.action_context_bar);
        ActionBarContainer actionBarContainer = (ActionBarContainer) view.findViewById(lqeggnwhkg.gxszxtbevo.action_bar_container);
        this.f2601eablkybsjg = actionBarContainer;
        lereixgezr lereixgezrVar = this.f2604gxszxtbevo;
        if (lereixgezrVar == null || this.f2611lqeggnwhkg == null || actionBarContainer == null) {
            throw new IllegalStateException(getClass().getSimpleName() + " can only be used with a compatible window decor layout");
        }
        this.f2605iobyxmoadg = lereixgezrVar.getContext();
        boolean z13 = (this.f2604gxszxtbevo.jyumaefscl() & 4) != 0;
        if (z13) {
            this.f2603gtknphoqwx = true;
        }
        androidx.appcompat.view.iobyxmoadg iobyxmoadgVarZoijcleaow = androidx.appcompat.view.iobyxmoadg.zoijcleaow(this.f2605iobyxmoadg);
        pkzmftpjix(iobyxmoadgVarZoijcleaow.iobyxmoadg() || z13);
        wwaezpbzkn(iobyxmoadgVarZoijcleaow.eablkybsjg());
        TypedArray typedArrayObtainStyledAttributes = this.f2605iobyxmoadg.obtainStyledAttributes(null, lqeggnwhkg.btonecajqb.ActionBar, lqeggnwhkg.iobyxmoadg.actionBarStyle, 0);
        if (typedArrayObtainStyledAttributes.getBoolean(lqeggnwhkg.btonecajqb.ActionBar_hideOnContentScroll, false)) {
            ylkuphrtab(true);
        }
        int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(lqeggnwhkg.btonecajqb.ActionBar_elevation, 0);
        if (dimensionPixelSize != 0) {
            lmojexxdyd(dimensionPixelSize);
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    private boolean hcddaimhww() {
        return this.f2601eablkybsjg.isLaidOut();
    }

    private void hkdspvbjdz(boolean z13) {
        if (iwizpuwonk(this.f2622zdlpuopuiu, this.f2621yggfygwlhe, this.f2608jyumaefscl)) {
            if (this.f2607iwizpuwonk) {
                return;
            }
            this.f2607iwizpuwonk = true;
            lereixgezr(z13);
            return;
        }
        if (this.f2607iwizpuwonk) {
            this.f2607iwizpuwonk = false;
            esjtqupxsv(z13);
        }
    }

    private void istkbnxepw() {
        if (this.f2608jyumaefscl) {
            this.f2608jyumaefscl = false;
            ActionBarOverlayLayout actionBarOverlayLayout = this.f2620wkgbmnqykc;
            if (actionBarOverlayLayout != null) {
                actionBarOverlayLayout.setShowingForActionMode(false);
            }
            hkdspvbjdz(false);
        }
    }

    static boolean iwizpuwonk(boolean z13, boolean z14, boolean z15) {
        if (z15) {
            return true;
        }
        return (z13 || z14) ? false : true;
    }

    private void jpowsppfya() {
        if (this.f2608jyumaefscl) {
            return;
        }
        this.f2608jyumaefscl = true;
        ActionBarOverlayLayout actionBarOverlayLayout = this.f2620wkgbmnqykc;
        if (actionBarOverlayLayout != null) {
            actionBarOverlayLayout.setShowingForActionMode(true);
        }
        hkdspvbjdz(false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private lereixgezr pmvmpeiblj(View view) {
        if (view instanceof lereixgezr) {
            return (lereixgezr) view;
        }
        if (view instanceof Toolbar) {
            return ((Toolbar) view).getWrapper();
        }
        StringBuilder sb3 = new StringBuilder();
        sb3.append("Can't make a decor toolbar out of ");
        sb3.append(view != 0 ? view.getClass().getSimpleName() : "null");
        throw new IllegalStateException(sb3.toString());
    }

    private void wwaezpbzkn(boolean z13) {
        this.f2618vdvldrhtss = z13;
        if (z13) {
            this.f2601eablkybsjg.setTabContainer(null);
            this.f2604gxszxtbevo.oxmwwwfdhm(null);
        } else {
            this.f2604gxszxtbevo.oxmwwwfdhm(null);
            this.f2601eablkybsjg.setTabContainer(null);
        }
        boolean z14 = false;
        boolean z15 = zynmafqrjb() == 2;
        this.f2604gxszxtbevo.rgvfuqvkyq(!this.f2618vdvldrhtss && z15);
        ActionBarOverlayLayout actionBarOverlayLayout = this.f2620wkgbmnqykc;
        if (!this.f2618vdvldrhtss && z15) {
            z14 = true;
        }
        actionBarOverlayLayout.setHasNonEmbeddedTabs(z14);
    }

    @Override // androidx.appcompat.app.iobyxmoadg
    public int btonecajqb() {
        return this.f2604gxszxtbevo.jyumaefscl();
    }

    void cqumvgiudr() {
        androidx.appcompat.view.zoijcleaow.iobyxmoadg iobyxmoadgVar = this.f2596agtfadlqog;
        if (iobyxmoadgVar != null) {
            iobyxmoadgVar.iobyxmoadg(this.f2619wflxmlrfwp);
            this.f2619wflxmlrfwp = null;
            this.f2596agtfadlqog = null;
        }
    }

    @Override // androidx.appcompat.app.iobyxmoadg
    public void dxjokdxxww(boolean z13) {
        if (z13 == this.f2613ojitshcjhn) {
            return;
        }
        this.f2613ojitshcjhn = z13;
        if (this.f2617rgvfuqvkyq.size() <= 0) {
            return;
        }
        yggfygwlhe.iobyxmoadg(this.f2617rgvfuqvkyq.get(0));
        throw null;
    }

    @Override // androidx.appcompat.widget.ActionBarOverlayLayout.wkgbmnqykc
    public void eablkybsjg() {
        if (this.f2621yggfygwlhe) {
            return;
        }
        this.f2621yggfygwlhe = true;
        hkdspvbjdz(true);
    }

    public void esjtqupxsv(boolean z13) {
        View view;
        androidx.appcompat.view.nufgyqmvbu nufgyqmvbuVar = this.f2598cqumvgiudr;
        if (nufgyqmvbuVar != null) {
            nufgyqmvbuVar.iobyxmoadg();
        }
        if (this.f2614oxmwwwfdhm != 0 || (!this.f2602esjtqupxsv && !z13)) {
            this.f2615pmvmpeiblj.zoijcleaow(null);
            return;
        }
        this.f2601eablkybsjg.setAlpha(1.0f);
        this.f2601eablkybsjg.setTransitioning(true);
        androidx.appcompat.view.nufgyqmvbu nufgyqmvbuVar2 = new androidx.appcompat.view.nufgyqmvbu();
        float f13 = -this.f2601eablkybsjg.getHeight();
        if (z13) {
            int[] iArr = {0, 0};
            this.f2601eablkybsjg.getLocationInWindow(iArr);
            f13 -= iArr[1];
        }
        yfnezrywwk yfnezrywwkVarWflxmlrfwp = jhduphickx.eablkybsjg(this.f2601eablkybsjg).wflxmlrfwp(f13);
        yfnezrywwkVarWflxmlrfwp.gtknphoqwx(this.f2606istkbnxepw);
        nufgyqmvbuVar2.ppxfxbqfkf(yfnezrywwkVarWflxmlrfwp);
        if (this.f2609kcexrzcfyt && (view = this.f2612nufgyqmvbu) != null) {
            nufgyqmvbuVar2.ppxfxbqfkf(jhduphickx.eablkybsjg(view).wflxmlrfwp(f13));
        }
        nufgyqmvbuVar2.gxszxtbevo(f2594cdpycssgdh);
        nufgyqmvbuVar2.eablkybsjg(250L);
        nufgyqmvbuVar2.lqeggnwhkg(this.f2615pmvmpeiblj);
        this.f2598cqumvgiudr = nufgyqmvbuVar2;
        nufgyqmvbuVar2.nufgyqmvbu();
    }

    @Override // androidx.appcompat.app.iobyxmoadg
    public Context gtknphoqwx() {
        if (this.f2623zoijcleaow == null) {
            TypedValue typedValue = new TypedValue();
            this.f2605iobyxmoadg.getTheme().resolveAttribute(lqeggnwhkg.iobyxmoadg.actionBarWidgetTheme, typedValue, true);
            int i13 = typedValue.resourceId;
            if (i13 != 0) {
                this.f2623zoijcleaow = new ContextThemeWrapper(this.f2605iobyxmoadg, i13);
            } else {
                this.f2623zoijcleaow = this.f2605iobyxmoadg;
            }
        }
        return this.f2623zoijcleaow;
    }

    @Override // androidx.appcompat.widget.ActionBarOverlayLayout.wkgbmnqykc
    public void gxszxtbevo() {
        androidx.appcompat.view.nufgyqmvbu nufgyqmvbuVar = this.f2598cqumvgiudr;
        if (nufgyqmvbuVar != null) {
            nufgyqmvbuVar.iobyxmoadg();
            this.f2598cqumvgiudr = null;
        }
    }

    @Override // androidx.appcompat.widget.ActionBarOverlayLayout.wkgbmnqykc
    public void iobyxmoadg() {
        if (this.f2621yggfygwlhe) {
            this.f2621yggfygwlhe = false;
            hkdspvbjdz(true);
        }
    }

    public void iozdgvuglv(int i13, int i14) {
        int iJyumaefscl = this.f2604gxszxtbevo.jyumaefscl();
        if ((i14 & 4) != 0) {
            this.f2603gtknphoqwx = true;
        }
        this.f2604gxszxtbevo.dxjokdxxww((i13 & i14) | ((~i14) & iJyumaefscl));
    }

    public void jyumaefscl(boolean z13) {
        yfnezrywwk yfnezrywwkVarDraadjrbmk;
        yfnezrywwk yfnezrywwkVarGxszxtbevo;
        if (z13) {
            jpowsppfya();
        } else {
            istkbnxepw();
        }
        if (!hcddaimhww()) {
            if (z13) {
                this.f2604gxszxtbevo.yggfygwlhe(4);
                this.f2611lqeggnwhkg.setVisibility(0);
                return;
            } else {
                this.f2604gxszxtbevo.yggfygwlhe(0);
                this.f2611lqeggnwhkg.setVisibility(8);
                return;
            }
        }
        if (z13) {
            yfnezrywwkVarGxszxtbevo = this.f2604gxszxtbevo.draadjrbmk(4, 100L);
            yfnezrywwkVarDraadjrbmk = this.f2611lqeggnwhkg.gxszxtbevo(0, 200L);
        } else {
            yfnezrywwkVarDraadjrbmk = this.f2604gxszxtbevo.draadjrbmk(0, 200L);
            yfnezrywwkVarGxszxtbevo = this.f2611lqeggnwhkg.gxszxtbevo(8, 100L);
        }
        androidx.appcompat.view.nufgyqmvbu nufgyqmvbuVar = new androidx.appcompat.view.nufgyqmvbu();
        nufgyqmvbuVar.wkgbmnqykc(yfnezrywwkVarGxszxtbevo, yfnezrywwkVarDraadjrbmk);
        nufgyqmvbuVar.nufgyqmvbu();
    }

    @Override // androidx.appcompat.app.iobyxmoadg
    public void kcexrzcfyt(boolean z13) {
        androidx.appcompat.view.nufgyqmvbu nufgyqmvbuVar;
        this.f2602esjtqupxsv = z13;
        if (z13 || (nufgyqmvbuVar = this.f2598cqumvgiudr) == null) {
            return;
        }
        nufgyqmvbuVar.iobyxmoadg();
    }

    public void lereixgezr(boolean z13) {
        View view;
        View view2;
        androidx.appcompat.view.nufgyqmvbu nufgyqmvbuVar = this.f2598cqumvgiudr;
        if (nufgyqmvbuVar != null) {
            nufgyqmvbuVar.iobyxmoadg();
        }
        this.f2601eablkybsjg.setVisibility(0);
        if (this.f2614oxmwwwfdhm == 0 && (this.f2602esjtqupxsv || z13)) {
            this.f2601eablkybsjg.setTranslationY(0.0f);
            float f13 = -this.f2601eablkybsjg.getHeight();
            if (z13) {
                int[] iArr = {0, 0};
                this.f2601eablkybsjg.getLocationInWindow(iArr);
                f13 -= iArr[1];
            }
            this.f2601eablkybsjg.setTranslationY(f13);
            androidx.appcompat.view.nufgyqmvbu nufgyqmvbuVar2 = new androidx.appcompat.view.nufgyqmvbu();
            yfnezrywwk yfnezrywwkVarWflxmlrfwp = jhduphickx.eablkybsjg(this.f2601eablkybsjg).wflxmlrfwp(0.0f);
            yfnezrywwkVarWflxmlrfwp.gtknphoqwx(this.f2606istkbnxepw);
            nufgyqmvbuVar2.ppxfxbqfkf(yfnezrywwkVarWflxmlrfwp);
            if (this.f2609kcexrzcfyt && (view2 = this.f2612nufgyqmvbu) != null) {
                view2.setTranslationY(f13);
                nufgyqmvbuVar2.ppxfxbqfkf(jhduphickx.eablkybsjg(this.f2612nufgyqmvbu).wflxmlrfwp(0.0f));
            }
            nufgyqmvbuVar2.gxszxtbevo(f2595yadqdtsiqt);
            nufgyqmvbuVar2.eablkybsjg(250L);
            nufgyqmvbuVar2.lqeggnwhkg(this.f2624zynmafqrjb);
            this.f2598cqumvgiudr = nufgyqmvbuVar2;
            nufgyqmvbuVar2.nufgyqmvbu();
        } else {
            this.f2601eablkybsjg.setAlpha(1.0f);
            this.f2601eablkybsjg.setTranslationY(0.0f);
            if (this.f2609kcexrzcfyt && (view = this.f2612nufgyqmvbu) != null) {
                view.setTranslationY(0.0f);
            }
            this.f2624zynmafqrjb.zoijcleaow(null);
        }
        ActionBarOverlayLayout actionBarOverlayLayout = this.f2620wkgbmnqykc;
        if (actionBarOverlayLayout != null) {
            jhduphickx.ydmasvzmpa(actionBarOverlayLayout);
        }
    }

    public void lmojexxdyd(float f13) {
        jhduphickx.tbqsvytpvh(this.f2601eablkybsjg, f13);
    }

    @Override // androidx.appcompat.app.iobyxmoadg
    public boolean nufgyqmvbu() {
        lereixgezr lereixgezrVar = this.f2604gxszxtbevo;
        if (lereixgezrVar == null || !lereixgezrVar.nufgyqmvbu()) {
            return false;
        }
        this.f2604gxszxtbevo.collapseActionView();
        return true;
    }

    @Override // androidx.appcompat.app.iobyxmoadg
    public boolean ojitshcjhn(int i13, KeyEvent keyEvent) {
        Menu menuEablkybsjg;
        wkgbmnqykc wkgbmnqykcVar = this.f2599draadjrbmk;
        if (wkgbmnqykcVar == null || (menuEablkybsjg = wkgbmnqykcVar.eablkybsjg()) == null) {
            return false;
        }
        menuEablkybsjg.setQwertyMode(KeyCharacterMap.load(keyEvent != null ? keyEvent.getDeviceId() : -1).getKeyboardType() != 1);
        return menuEablkybsjg.performShortcut(i13, keyEvent, 0);
    }

    @Override // androidx.appcompat.app.iobyxmoadg
    public void oxmwwwfdhm(boolean z13) {
        if (this.f2603gtknphoqwx) {
            return;
        }
        yadqdtsiqt(z13);
    }

    public void pkzmftpjix(boolean z13) {
        this.f2604gxszxtbevo.agtfadlqog(z13);
    }

    @Override // androidx.appcompat.widget.ActionBarOverlayLayout.wkgbmnqykc
    public void ppxfxbqfkf() {
    }

    @Override // androidx.appcompat.app.iobyxmoadg
    public void wflxmlrfwp(Configuration configuration) {
        wwaezpbzkn(androidx.appcompat.view.iobyxmoadg.zoijcleaow(this.f2605iobyxmoadg).eablkybsjg());
    }

    @Override // androidx.appcompat.widget.ActionBarOverlayLayout.wkgbmnqykc
    public void wkgbmnqykc(boolean z13) {
        this.f2609kcexrzcfyt = z13;
    }

    public void yadqdtsiqt(boolean z13) {
        iozdgvuglv(z13 ? 4 : 0, 4);
    }

    @Override // androidx.appcompat.app.iobyxmoadg
    public androidx.appcompat.view.zoijcleaow yggfygwlhe(androidx.appcompat.view.zoijcleaow.iobyxmoadg iobyxmoadgVar) {
        wkgbmnqykc wkgbmnqykcVar = this.f2599draadjrbmk;
        if (wkgbmnqykcVar != null) {
            wkgbmnqykcVar.ppxfxbqfkf();
        }
        this.f2620wkgbmnqykc.setHideOnContentScrollEnabled(false);
        this.f2611lqeggnwhkg.gtknphoqwx();
        wkgbmnqykc wkgbmnqykcVar2 = new wkgbmnqykc(this.f2611lqeggnwhkg.getContext(), iobyxmoadgVar);
        if (!wkgbmnqykcVar2.zdlpuopuiu()) {
            return null;
        }
        this.f2599draadjrbmk = wkgbmnqykcVar2;
        wkgbmnqykcVar2.gtknphoqwx();
        this.f2611lqeggnwhkg.nufgyqmvbu(wkgbmnqykcVar2);
        jyumaefscl(true);
        return wkgbmnqykcVar2;
    }

    public void ylkuphrtab(boolean z13) {
        if (z13 && !this.f2620wkgbmnqykc.cqumvgiudr()) {
            throw new IllegalStateException("Action bar must be in overlay mode (Window.FEATURE_OVERLAY_ACTION_BAR) to enable hide on content scroll");
        }
        this.f2610lereixgezr = z13;
        this.f2620wkgbmnqykc.setHideOnContentScrollEnabled(z13);
    }

    @Override // androidx.appcompat.app.iobyxmoadg
    public void zdlpuopuiu(CharSequence charSequence) {
        this.f2604gxszxtbevo.setWindowTitle(charSequence);
    }

    @Override // androidx.appcompat.widget.ActionBarOverlayLayout.wkgbmnqykc
    public void zoijcleaow(int i13) {
        this.f2614oxmwwwfdhm = i13;
    }

    public int zynmafqrjb() {
        return this.f2604gxszxtbevo.gtknphoqwx();
    }

    public esjtqupxsv(Dialog dialog) {
        cdpycssgdh(dialog.getWindow().getDecorView());
    }
}
