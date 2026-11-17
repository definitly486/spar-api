package androidx.compose.ui.graphics.layer.view;

import android.content.Context;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import h.metgxyhuhe;
import h.rhgxfdycjh;
import h.yadqdtsiqt;

/* JADX INFO: loaded from: classes.dex */
public abstract class iobyxmoadg extends ViewGroup {

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    private boolean f6323zdlpuopuiu;

    public iobyxmoadg(Context context) {
        super(context);
        setClipChildren(false);
        setClipToPadding(false);
        setTag(rhgxfdycjh.hide_graphics_layer_in_inspector_tag, Boolean.TRUE);
    }

    @Override // android.view.View
    public void forceLayout() {
    }

    @Override // android.view.ViewGroup
    public int getChildCount() {
        if (this.f6323zdlpuopuiu) {
            return super.getChildCount();
        }
        return 0;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public ViewParent invalidateChildInParent(int[] iArr, Rect rect) {
        return null;
    }

    public final void iobyxmoadg(metgxyhuhe metgxyhuheVar, View view, long j13) {
        super.drawChild(yadqdtsiqt.wkgbmnqykc(metgxyhuheVar), view, j13);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z13, int i13, int i14, int i15, int i16) {
    }

    @Override // android.view.View
    protected void onMeasure(int i13, int i14) {
        setMeasuredDimension(0, 0);
    }

    @Override // android.view.View, android.view.ViewParent
    public void requestLayout() {
    }
}
