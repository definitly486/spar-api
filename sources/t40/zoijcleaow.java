package t40;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import hg.jyumaefscl;
import kotlin.jvm.internal.gtknphoqwx;
import kotlin.jvm.internal.zdlpuopuiu;
import v1.metgxyhuhe;

/* JADX INFO: loaded from: classes4.dex */
public class zoijcleaow extends RecyclerView.ojitshcjhn {

    /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
    public static final iobyxmoadg f109665lqeggnwhkg = new iobyxmoadg(null);

    /* JADX INFO: renamed from: nufgyqmvbu, reason: collision with root package name */
    public static final int f109666nufgyqmvbu = 8;

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private final boolean f109667eablkybsjg;

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    private final Paint f109668gxszxtbevo;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final int f109669iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final int f109670ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final boolean f109671wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final int f109672zoijcleaow;

    public static final class iobyxmoadg {
        public /* synthetic */ iobyxmoadg(gtknphoqwx gtknphoqwxVar) {
            this();
        }

        public final zoijcleaow iobyxmoadg(Context context) {
            zdlpuopuiu.btonecajqb(context, "context");
            return new zoijcleaow(c60.zoijcleaow.ppxfxbqfkf(context, s40.ppxfxbqfkf.colorSpecialSurface6), c60.zoijcleaow.wkgbmnqykc(context, s40.eablkybsjg.content_margin_1), 0, true, true, 4, null);
        }

        private iobyxmoadg() {
        }
    }

    public /* synthetic */ zoijcleaow(int i13, int i14, int i15, boolean z13, boolean z14, int i16, gtknphoqwx gtknphoqwxVar) {
        this(i13, (i16 & 2) != 0 ? 0 : i14, (i16 & 4) != 0 ? 0 : i15, (i16 & 8) != 0 ? false : z13, (i16 & 16) != 0 ? false : z14);
    }

    private final RectF gxszxtbevo(View view) {
        RectF rectF = new RectF();
        float left = view.getLeft();
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
        rectF.left = left + (marginLayoutParams != null ? marginLayoutParams.leftMargin : 0);
        float top = view.getTop();
        ViewGroup.LayoutParams layoutParams2 = view.getLayoutParams();
        ViewGroup.MarginLayoutParams marginLayoutParams2 = layoutParams2 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams2 : null;
        rectF.top = top + (marginLayoutParams2 != null ? marginLayoutParams2.topMargin : 0);
        float right = view.getRight();
        ViewGroup.LayoutParams layoutParams3 = view.getLayoutParams();
        ViewGroup.MarginLayoutParams marginLayoutParams3 = layoutParams3 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams3 : null;
        rectF.right = right + (marginLayoutParams3 != null ? marginLayoutParams3.rightMargin : 0);
        float bottom = view.getBottom();
        ViewGroup.LayoutParams layoutParams4 = view.getLayoutParams();
        ViewGroup.MarginLayoutParams marginLayoutParams4 = layoutParams4 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams4 : null;
        rectF.bottom = bottom + (marginLayoutParams4 != null ? marginLayoutParams4.bottomMargin : 0);
        return rectF;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.ojitshcjhn
    public void onDraw(Canvas c13, RecyclerView parent, RecyclerView.zynmafqrjb state) {
        zdlpuopuiu.btonecajqb(c13, "c");
        zdlpuopuiu.btonecajqb(parent, "parent");
        zdlpuopuiu.btonecajqb(state, "state");
        float f13 = -parent.getPaddingLeft();
        float width = parent.getWidth() + parent.getPaddingRight();
        int i13 = 0;
        for (Object obj : metgxyhuhe.iobyxmoadg(parent)) {
            int i14 = i13 + 1;
            if (i13 < 0) {
                jyumaefscl.iwizpuwonk();
            }
            RectF rectFGxszxtbevo = gxszxtbevo((View) obj);
            boolean z13 = i13 == parent.getChildCount() - 1;
            if (this.f109667eablkybsjg || !z13) {
                float f14 = rectFGxszxtbevo.bottom + this.f109670ppxfxbqfkf;
                c13.drawLine(f13, f14, width, f14, this.f109668gxszxtbevo);
            }
            if (this.f109671wkgbmnqykc && i13 == 0) {
                float f15 = rectFGxszxtbevo.top;
                c13.drawLine(f13, f15, width, f15, this.f109668gxszxtbevo);
            }
            i13 = i14;
        }
    }

    public zoijcleaow(int i13, int i14, int i15, boolean z13, boolean z14) {
        this.f109669iobyxmoadg = i13;
        this.f109672zoijcleaow = i14;
        this.f109670ppxfxbqfkf = i15;
        this.f109671wkgbmnqykc = z13;
        this.f109667eablkybsjg = z14;
        Paint paint = new Paint(1);
        paint.setColor(i13);
        paint.setStrokeWidth(i14);
        this.f109668gxszxtbevo = paint;
    }
}
