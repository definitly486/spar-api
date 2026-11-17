package androidx.recyclerview.widget;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.view.View;

/* JADX INFO: loaded from: classes2.dex */
public class dxjokdxxww extends RecyclerView.ojitshcjhn {

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private static final int[] f12977wkgbmnqykc = {R.attr.listDivider};

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private Drawable f12978iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final Rect f12979ppxfxbqfkf = new Rect();

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private int f12980zoijcleaow;

    public dxjokdxxww(Context context, int i13) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(f12977wkgbmnqykc);
        Drawable drawable = typedArrayObtainStyledAttributes.getDrawable(0);
        this.f12978iobyxmoadg = drawable;
        if (drawable == null) {
            Log.w("DividerItem", "@android:attr/listDivider was not set in the theme used for this DividerItemDecoration. Please set that attribute all call setDrawable()");
        }
        typedArrayObtainStyledAttributes.recycle();
        dxjokdxxww(i13);
    }

    private void gxszxtbevo(Canvas canvas, RecyclerView recyclerView) {
        int height;
        int paddingTop;
        canvas.save();
        if (recyclerView.getClipToPadding()) {
            paddingTop = recyclerView.getPaddingTop();
            height = recyclerView.getHeight() - recyclerView.getPaddingBottom();
            canvas.clipRect(recyclerView.getPaddingLeft(), paddingTop, recyclerView.getWidth() - recyclerView.getPaddingRight(), height);
        } else {
            height = recyclerView.getHeight();
            paddingTop = 0;
        }
        int childCount = recyclerView.getChildCount();
        for (int i13 = 0; i13 < childCount; i13++) {
            View childAt = recyclerView.getChildAt(i13);
            recyclerView.getLayoutManager().metgxyhuhe(childAt, this.f12979ppxfxbqfkf);
            int iRound = this.f12979ppxfxbqfkf.right + Math.round(childAt.getTranslationX());
            this.f12978iobyxmoadg.setBounds(iRound - this.f12978iobyxmoadg.getIntrinsicWidth(), paddingTop, iRound, height);
            this.f12978iobyxmoadg.draw(canvas);
        }
        canvas.restore();
    }

    private void lqeggnwhkg(Canvas canvas, RecyclerView recyclerView) {
        int width;
        int paddingLeft;
        canvas.save();
        if (recyclerView.getClipToPadding()) {
            paddingLeft = recyclerView.getPaddingLeft();
            width = recyclerView.getWidth() - recyclerView.getPaddingRight();
            canvas.clipRect(paddingLeft, recyclerView.getPaddingTop(), width, recyclerView.getHeight() - recyclerView.getPaddingBottom());
        } else {
            width = recyclerView.getWidth();
            paddingLeft = 0;
        }
        int childCount = recyclerView.getChildCount();
        for (int i13 = 0; i13 < childCount; i13++) {
            View childAt = recyclerView.getChildAt(i13);
            recyclerView.oipsdeybqn(childAt, this.f12979ppxfxbqfkf);
            int iRound = this.f12979ppxfxbqfkf.bottom + Math.round(childAt.getTranslationY());
            this.f12978iobyxmoadg.setBounds(paddingLeft, iRound - this.f12978iobyxmoadg.getIntrinsicHeight(), width, iRound);
            this.f12978iobyxmoadg.draw(canvas);
        }
        canvas.restore();
    }

    public void dxjokdxxww(int i13) {
        if (i13 != 0 && i13 != 1) {
            throw new IllegalArgumentException("Invalid orientation. It should be either HORIZONTAL or VERTICAL");
        }
        this.f12980zoijcleaow = i13;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.ojitshcjhn
    public void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.zynmafqrjb zynmafqrjbVar) {
        Drawable drawable = this.f12978iobyxmoadg;
        if (drawable == null) {
            rect.set(0, 0, 0, 0);
        } else if (this.f12980zoijcleaow == 1) {
            rect.set(0, 0, 0, drawable.getIntrinsicHeight());
        } else {
            rect.set(0, 0, drawable.getIntrinsicWidth(), 0);
        }
    }

    public void nufgyqmvbu(Drawable drawable) {
        if (drawable == null) {
            throw new IllegalArgumentException("Drawable cannot be null.");
        }
        this.f12978iobyxmoadg = drawable;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.ojitshcjhn
    public void onDraw(Canvas canvas, RecyclerView recyclerView, RecyclerView.zynmafqrjb zynmafqrjbVar) {
        if (recyclerView.getLayoutManager() == null || this.f12978iobyxmoadg == null) {
            return;
        }
        if (this.f12980zoijcleaow == 1) {
            lqeggnwhkg(canvas, recyclerView);
        } else {
            gxszxtbevo(canvas, recyclerView);
        }
    }
}
