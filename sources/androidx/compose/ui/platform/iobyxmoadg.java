package androidx.compose.ui.platform;

import android.content.Context;
import android.os.IBinder;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes.dex */
public abstract class iobyxmoadg extends ViewGroup {

    /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
    private tg.iobyxmoadg f6974cqumvgiudr;

    /* JADX INFO: renamed from: esjtqupxsv, reason: collision with root package name */
    private boolean f6975esjtqupxsv;

    /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
    private androidx.compose.runtime.cqumvgiudr f6976iwizpuwonk;

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
    private androidx.compose.runtime.iwizpuwonk f6977jyumaefscl;

    /* JADX INFO: renamed from: lereixgezr, reason: collision with root package name */
    private boolean f6978lereixgezr;

    /* JADX INFO: renamed from: pmvmpeiblj, reason: collision with root package name */
    private boolean f6979pmvmpeiblj;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    private IBinder f6980yggfygwlhe;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    private WeakReference f6981zdlpuopuiu;

    /* JADX INFO: renamed from: androidx.compose.ui.platform.iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
    static final class C0119iobyxmoadg extends kotlin.jvm.internal.jyumaefscl implements tg.rgvfuqvkyq {
        C0119iobyxmoadg() {
            super(2);
        }

        @Override // tg.rgvfuqvkyq
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            iobyxmoadg((androidx.compose.runtime.draadjrbmk) obj, ((Number) obj2).intValue());
            return gg.wwaezpbzkn.f37140iobyxmoadg;
        }

        public final void iobyxmoadg(androidx.compose.runtime.draadjrbmk draadjrbmkVar, int i13) {
            if (!draadjrbmkVar.vdvldrhtss((i13 & 3) != 2, i13 & 1)) {
                draadjrbmkVar.hkdspvbjdz();
                return;
            }
            if (androidx.compose.runtime.jyumaefscl.jpowsppfya()) {
                androidx.compose.runtime.jyumaefscl.ntlheqmsrt(-656146368, i13, -1, "androidx.compose.ui.platform.AbstractComposeView.ensureCompositionCreated.<anonymous> (ComposeView.android.kt:249)");
            }
            iobyxmoadg.this.zoijcleaow(draadjrbmkVar, 0);
            if (androidx.compose.runtime.jyumaefscl.jpowsppfya()) {
                androidx.compose.runtime.jyumaefscl.mbcevpiqjq();
            }
        }
    }

    public /* synthetic */ iobyxmoadg(Context context, AttributeSet attributeSet, int i13, int i14, kotlin.jvm.internal.gtknphoqwx gtknphoqwxVar) {
        this(context, (i14 & 2) != 0 ? null : attributeSet, (i14 & 4) != 0 ? 0 : i13);
    }

    private final boolean btonecajqb(androidx.compose.runtime.cqumvgiudr cqumvgiudrVar) {
        return !(cqumvgiudrVar instanceof androidx.compose.runtime.n) || ((androidx.compose.runtime.n.wkgbmnqykc) ((androidx.compose.runtime.n) cqumvgiudrVar).zfvoamnweg().getValue()).compareTo(androidx.compose.runtime.n.wkgbmnqykc.ShuttingDown) > 0;
    }

    private static /* synthetic */ void getDisposeViewCompositionStrategy$annotations() {
    }

    public static /* synthetic */ void getShowLayoutBounds$annotations() {
    }

    private final androidx.compose.runtime.cqumvgiudr gtknphoqwx() {
        androidx.compose.runtime.cqumvgiudr cqumvgiudrVar;
        androidx.compose.runtime.cqumvgiudr cqumvgiudrVar2 = this.f6976iwizpuwonk;
        if (cqumvgiudrVar2 != null) {
            return cqumvgiudrVar2;
        }
        androidx.compose.runtime.cqumvgiudr cqumvgiudrVarWkgbmnqykc = g0.wkgbmnqykc(this);
        androidx.compose.runtime.cqumvgiudr cqumvgiudrVar3 = null;
        androidx.compose.runtime.cqumvgiudr cqumvgiudrVarPpxfxbqfkf = cqumvgiudrVarWkgbmnqykc != null ? ppxfxbqfkf(cqumvgiudrVarWkgbmnqykc) : null;
        if (cqumvgiudrVarPpxfxbqfkf != null) {
            return cqumvgiudrVarPpxfxbqfkf;
        }
        WeakReference weakReference = this.f6981zdlpuopuiu;
        if (weakReference != null && (cqumvgiudrVar = (androidx.compose.runtime.cqumvgiudr) weakReference.get()) != null && btonecajqb(cqumvgiudrVar)) {
            cqumvgiudrVar3 = cqumvgiudrVar;
        }
        androidx.compose.runtime.cqumvgiudr cqumvgiudrVar4 = cqumvgiudrVar3;
        return cqumvgiudrVar4 == null ? ppxfxbqfkf(g0.nufgyqmvbu(this)) : cqumvgiudrVar4;
    }

    private final void lqeggnwhkg() {
        if (this.f6977jyumaefscl == null) {
            try {
                this.f6978lereixgezr = true;
                this.f6977jyumaefscl = j0.ppxfxbqfkf(this, gtknphoqwx(), ezmngbhpjk.nufgyqmvbu.ppxfxbqfkf(-656146368, true, new C0119iobyxmoadg()));
            } finally {
                this.f6978lereixgezr = false;
            }
        }
    }

    private final androidx.compose.runtime.cqumvgiudr ppxfxbqfkf(androidx.compose.runtime.cqumvgiudr cqumvgiudrVar) {
        androidx.compose.runtime.cqumvgiudr cqumvgiudrVar2 = btonecajqb(cqumvgiudrVar) ? cqumvgiudrVar : null;
        if (cqumvgiudrVar2 != null) {
            this.f6981zdlpuopuiu = new WeakReference(cqumvgiudrVar2);
        }
        return cqumvgiudrVar;
    }

    private final void setParentContext(androidx.compose.runtime.cqumvgiudr cqumvgiudrVar) {
        if (this.f6976iwizpuwonk != cqumvgiudrVar) {
            this.f6976iwizpuwonk = cqumvgiudrVar;
            if (cqumvgiudrVar != null) {
                this.f6981zdlpuopuiu = null;
            }
            androidx.compose.runtime.iwizpuwonk iwizpuwonkVar = this.f6977jyumaefscl;
            if (iwizpuwonkVar != null) {
                iwizpuwonkVar.iobyxmoadg();
                this.f6977jyumaefscl = null;
                if (isAttachedToWindow()) {
                    lqeggnwhkg();
                }
            }
        }
    }

    private final void setPreviousAttachedWindowToken(IBinder iBinder) {
        if (this.f6980yggfygwlhe != iBinder) {
            this.f6980yggfygwlhe = iBinder;
            this.f6981zdlpuopuiu = null;
        }
    }

    private final void wkgbmnqykc() {
        if (this.f6978lereixgezr) {
            return;
        }
        throw new UnsupportedOperationException("Cannot add views to " + getClass().getSimpleName() + "; only Compose content is supported");
    }

    @Override // android.view.ViewGroup
    public void addView(View view) {
        wkgbmnqykc();
        super.addView(view);
    }

    @Override // android.view.ViewGroup
    protected boolean addViewInLayout(View view, int i13, ViewGroup.LayoutParams layoutParams) {
        wkgbmnqykc();
        return super.addViewInLayout(view, i13, layoutParams);
    }

    public void dxjokdxxww(int i13, int i14) {
        View childAt = getChildAt(0);
        if (childAt == null) {
            super.onMeasure(i13, i14);
            return;
        }
        childAt.measure(View.MeasureSpec.makeMeasureSpec(Math.max(0, (View.MeasureSpec.getSize(i13) - getPaddingLeft()) - getPaddingRight()), View.MeasureSpec.getMode(i13)), View.MeasureSpec.makeMeasureSpec(Math.max(0, (View.MeasureSpec.getSize(i14) - getPaddingTop()) - getPaddingBottom()), View.MeasureSpec.getMode(i14)));
        setMeasuredDimension(childAt.getMeasuredWidth() + getPaddingLeft() + getPaddingRight(), childAt.getMeasuredHeight() + getPaddingTop() + getPaddingBottom());
    }

    public final void eablkybsjg() {
        if (this.f6976iwizpuwonk == null && !isAttachedToWindow()) {
            throw new IllegalStateException("createComposition requires either a parent reference or the View to be attachedto a window. Attach the View or call setParentCompositionReference.");
        }
        lqeggnwhkg();
    }

    public final boolean getHasComposition() {
        return this.f6977jyumaefscl != null;
    }

    protected boolean getShouldCreateCompositionOnAttachedToWindow() {
        return true;
    }

    public final boolean getShowLayoutBounds() {
        return this.f6975esjtqupxsv;
    }

    public final void gxszxtbevo() {
        androidx.compose.runtime.iwizpuwonk iwizpuwonkVar = this.f6977jyumaefscl;
        if (iwizpuwonkVar != null) {
            iwizpuwonkVar.iobyxmoadg();
        }
        this.f6977jyumaefscl = null;
        requestLayout();
    }

    @Override // android.view.ViewGroup
    public boolean isTransitionGroup() {
        return !this.f6979pmvmpeiblj || super.isTransitionGroup();
    }

    public void nufgyqmvbu(boolean z13, int i13, int i14, int i15, int i16) {
        View childAt = getChildAt(0);
        if (childAt != null) {
            childAt.layout(getPaddingLeft(), getPaddingTop(), (i15 - i13) - getPaddingRight(), (i16 - i14) - getPaddingBottom());
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        setPreviousAttachedWindowToken(getWindowToken());
        if (getShouldCreateCompositionOnAttachedToWindow()) {
            lqeggnwhkg();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void onLayout(boolean z13, int i13, int i14, int i15, int i16) {
        nufgyqmvbu(z13, i13, i14, i15, i16);
    }

    @Override // android.view.View
    protected final void onMeasure(int i13, int i14) {
        lqeggnwhkg();
        dxjokdxxww(i13, i14);
    }

    @Override // android.view.View
    public void onRtlPropertiesChanged(int i13) {
        View childAt = getChildAt(0);
        if (childAt != null) {
            childAt.setLayoutDirection(i13);
        }
    }

    public final void setParentCompositionContext(androidx.compose.runtime.cqumvgiudr cqumvgiudrVar) {
        setParentContext(cqumvgiudrVar);
    }

    public final void setShowLayoutBounds(boolean z13) {
        this.f6975esjtqupxsv = z13;
        KeyEvent.Callback childAt = getChildAt(0);
        if (childAt != null) {
            ((z.opjhrmiecq) childAt).setShowLayoutBounds(z13);
        }
    }

    @Override // android.view.ViewGroup
    public void setTransitionGroup(boolean z13) {
        super.setTransitionGroup(z13);
        this.f6979pmvmpeiblj = true;
    }

    public final void setViewCompositionStrategy(s sVar) {
        tg.iobyxmoadg iobyxmoadgVar = this.f6974cqumvgiudr;
        if (iobyxmoadgVar != null) {
            iobyxmoadgVar.invoke();
        }
        this.f6974cqumvgiudr = sVar.iobyxmoadg(this);
    }

    @Override // android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
        return false;
    }

    public abstract void zoijcleaow(androidx.compose.runtime.draadjrbmk draadjrbmkVar, int i13);

    public iobyxmoadg(Context context, AttributeSet attributeSet, int i13) {
        super(context, attributeSet, i13);
        setClipChildren(false);
        setClipToPadding(false);
        setImportantForAccessibility(1);
        this.f6974cqumvgiudr = s.f7045iobyxmoadg.iobyxmoadg().iobyxmoadg(this);
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i13) {
        wkgbmnqykc();
        super.addView(view, i13);
    }

    @Override // android.view.ViewGroup
    protected boolean addViewInLayout(View view, int i13, ViewGroup.LayoutParams layoutParams, boolean z13) {
        wkgbmnqykc();
        return super.addViewInLayout(view, i13, layoutParams, z13);
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i13, int i14) {
        wkgbmnqykc();
        super.addView(view, i13, i14);
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public void addView(View view, ViewGroup.LayoutParams layoutParams) {
        wkgbmnqykc();
        super.addView(view, layoutParams);
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i13, ViewGroup.LayoutParams layoutParams) {
        wkgbmnqykc();
        super.addView(view, i13, layoutParams);
    }
}
