package ru.myspar.proloyalty.scango.impl.screens.cart.presentation.view;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import gg.wwaezpbzkn;
import hg.jyumaefscl;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.gtknphoqwx;
import kotlin.jvm.internal.zdlpuopuiu;
import p41.dxjokdxxww;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\b\t\b\u0007\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0019\u0010\u000f\u001a\u00020\n2\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J#\u0010\u0013\u001a\u0004\u0018\u00010\n2\b\u0010\u000e\u001a\u0004\u0018\u00010\r2\u0006\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u0018\u001a\u00020\u00152\u0006\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0018\u0010\u0017J\r\u0010\u0019\u001a\u00020\n¢\u0006\u0004\b\u0019\u0010\fJ\r\u0010\u001a\u001a\u00020\n¢\u0006\u0004\b\u001a\u0010\fJ\u0017\u0010\u001b\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\rH\u0014¢\u0006\u0004\b\u001b\u0010\u0010R6\u0010$\u001a\b\u0012\u0004\u0012\u00020\u00110\u001c2\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00110\u001c8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#¨\u0006%"}, d2 = {"Lru/myspar/proloyalty/scango/impl/screens/cart/presentation/view/ScanGoTutorialOverlayView;", "Landroid/widget/FrameLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Lgg/wwaezpbzkn;", "lqeggnwhkg", "()V", "Landroid/graphics/Canvas;", "canvas", "zoijcleaow", "(Landroid/graphics/Canvas;)V", "Landroid/view/View;", "view", "ppxfxbqfkf", "(Landroid/graphics/Canvas;Landroid/view/View;)Lgg/wwaezpbzkn;", "", "eablkybsjg", "(Landroid/view/View;)F", "wkgbmnqykc", "gxszxtbevo", "iobyxmoadg", "onDraw", "", "value", "zdlpuopuiu", "Ljava/util/List;", "getAccentViews", "()Ljava/util/List;", "setAccentViews", "(Ljava/util/List;)V", "accentViews", "impl_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class ScanGoTutorialOverlayView extends FrameLayout {

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name and from kotlin metadata */
    private List accentViews;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ScanGoTutorialOverlayView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        zdlpuopuiu.btonecajqb(context, "context");
    }

    private final float eablkybsjg(View view) {
        return dxjokdxxww.eablkybsjg(view) - dxjokdxxww.eablkybsjg(this);
    }

    private final void lqeggnwhkg() {
        setVisibility(this.accentViews.isEmpty() ? 4 : 0);
        invalidate();
    }

    private final wwaezpbzkn ppxfxbqfkf(Canvas canvas, View view) {
        if (canvas == null) {
            return null;
        }
        float fWkgbmnqykc = wkgbmnqykc(view);
        float fEablkybsjg = eablkybsjg(view);
        int iSave = canvas.save();
        canvas.translate(fWkgbmnqykc, fEablkybsjg);
        try {
            view.draw(canvas);
            return wwaezpbzkn.f37140iobyxmoadg;
        } finally {
            canvas.restoreToCount(iSave);
        }
    }

    private final float wkgbmnqykc(View view) {
        return view.getLeft();
    }

    private final void zoijcleaow(Canvas canvas) {
        Iterator it = this.accentViews.iterator();
        while (it.hasNext()) {
            ppxfxbqfkf(canvas, (View) it.next());
        }
    }

    public final List<View> getAccentViews() {
        return this.accentViews;
    }

    public final void gxszxtbevo() {
        setVisibility(0);
    }

    public final void iobyxmoadg() {
        setAccentViews(jyumaefscl.wflxmlrfwp());
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        zdlpuopuiu.btonecajqb(canvas, "canvas");
        if (this.accentViews.isEmpty()) {
            return;
        }
        zoijcleaow(canvas);
    }

    public final void setAccentViews(List<? extends View> value) {
        zdlpuopuiu.btonecajqb(value, "value");
        this.accentViews = value;
        lqeggnwhkg();
    }

    public /* synthetic */ ScanGoTutorialOverlayView(Context context, AttributeSet attributeSet, int i13, int i14, gtknphoqwx gtknphoqwxVar) {
        this(context, (i14 & 2) != 0 ? null : attributeSet, (i14 & 4) != 0 ? 0 : i13);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScanGoTutorialOverlayView(Context context, AttributeSet attributeSet, int i13) {
        super(context, attributeSet, i13);
        zdlpuopuiu.btonecajqb(context, "context");
        this.accentViews = jyumaefscl.wflxmlrfwp();
        setClickable(true);
        setWillNotDraw(false);
        lqeggnwhkg();
    }
}
