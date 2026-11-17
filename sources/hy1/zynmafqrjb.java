package hy1;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import v1.metgxyhuhe;

/* JADX INFO: loaded from: classes6.dex */
public final class zynmafqrjb extends RecyclerView.ojitshcjhn {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final int f41440iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final Paint f41441ppxfxbqfkf;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final int f41442zoijcleaow;

    public zynmafqrjb(int i13, int i14) {
        this.f41440iobyxmoadg = i13;
        this.f41442zoijcleaow = i14;
        Paint paint = new Paint(1);
        paint.setColor(i13);
        paint.setStrokeWidth(i14);
        this.f41441ppxfxbqfkf = paint;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.ojitshcjhn
    public void onDraw(Canvas c13, RecyclerView parent, RecyclerView.zynmafqrjb state) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(c13, "c");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(parent, "parent");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(state, "state");
        float f13 = -parent.getPaddingLeft();
        float width = parent.getWidth() + parent.getPaddingRight();
        for (View view : metgxyhuhe.iobyxmoadg(parent)) {
            int itemViewType = parent.sflfametgt(view).getItemViewType();
            if (itemViewType == 100 || itemViewType == 101) {
                float bottom = view.getBottom();
                ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
                float f14 = bottom + (marginLayoutParams != null ? marginLayoutParams.bottomMargin : 0);
                c13.drawLine(f13, f14, width, f14, this.f41441ppxfxbqfkf);
            }
        }
    }
}
