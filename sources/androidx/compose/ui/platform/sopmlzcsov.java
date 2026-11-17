package androidx.compose.ui.platform;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import java.util.HashMap;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class sopmlzcsov extends ViewGroup {

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    private final HashMap f7078yggfygwlhe;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    private final HashMap f7079zdlpuopuiu;

    public sopmlzcsov(Context context) {
        super(context);
        setClipChildren(false);
        this.f7079zdlpuopuiu = new HashMap();
        this.f7078yggfygwlhe = new HashMap();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void dispatchDraw(Canvas canvas) {
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        return true;
    }

    public final HashMap<androidx.compose.ui.viewinterop.zoijcleaow, z.pkzmftpjix> getHolderToLayoutNode() {
        return this.f7079zdlpuopuiu;
    }

    public final HashMap<z.pkzmftpjix, androidx.compose.ui.viewinterop.zoijcleaow> getLayoutNodeToHolder() {
        return this.f7078yggfygwlhe;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public /* bridge */ /* synthetic */ ViewParent invalidateChildInParent(int[] iArr, Rect rect) {
        return (ViewParent) zoijcleaow(iArr, rect);
    }

    public final void iobyxmoadg(androidx.compose.ui.viewinterop.zoijcleaow zoijcleaowVar, Canvas canvas) {
        zoijcleaowVar.draw(canvas);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onDescendantInvalidated(View view, View view2) {
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z13, int i13, int i14, int i15, int i16) {
        for (androidx.compose.ui.viewinterop.zoijcleaow zoijcleaowVar : this.f7079zdlpuopuiu.keySet()) {
            zoijcleaowVar.layout(zoijcleaowVar.getLeft(), zoijcleaowVar.getTop(), zoijcleaowVar.getRight(), zoijcleaowVar.getBottom());
        }
    }

    @Override // android.view.View
    protected void onMeasure(int i13, int i14) {
        if (!(View.MeasureSpec.getMode(i13) == 1073741824)) {
            w.iobyxmoadg.iobyxmoadg("widthMeasureSpec should be EXACTLY");
        }
        if (!(View.MeasureSpec.getMode(i14) == 1073741824)) {
            w.iobyxmoadg.iobyxmoadg("heightMeasureSpec should be EXACTLY");
        }
        setMeasuredDimension(View.MeasureSpec.getSize(i13), View.MeasureSpec.getSize(i14));
        Iterator it = this.f7079zdlpuopuiu.keySet().iterator();
        while (it.hasNext()) {
            ((androidx.compose.ui.viewinterop.zoijcleaow) it.next()).iozdgvuglv();
        }
    }

    @Override // android.view.View, android.view.ViewParent
    public void requestLayout() {
        cleanupLayoutState(this);
        int childCount = getChildCount();
        for (int i13 = 0; i13 < childCount; i13++) {
            View childAt = getChildAt(i13);
            z.pkzmftpjix pkzmftpjixVar = (z.pkzmftpjix) this.f7079zdlpuopuiu.get(childAt);
            if (childAt.isLayoutRequested() && pkzmftpjixVar != null) {
                z.pkzmftpjix.O(pkzmftpjixVar, false, false, false, 7, null);
            }
        }
    }

    @Override // android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
        return false;
    }

    public Void zoijcleaow(int[] iArr, Rect rect) {
        return null;
    }
}
