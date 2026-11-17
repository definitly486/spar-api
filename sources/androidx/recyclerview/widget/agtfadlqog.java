package androidx.recyclerview.widget;

import android.graphics.Canvas;
import android.view.View;
import v1.jhduphickx;

/* JADX INFO: loaded from: classes2.dex */
class agtfadlqog implements wflxmlrfwp {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    static final wflxmlrfwp f12880iobyxmoadg = new agtfadlqog();

    agtfadlqog() {
    }

    private static float eablkybsjg(RecyclerView recyclerView, View view) {
        int childCount = recyclerView.getChildCount();
        float f13 = 0.0f;
        for (int i13 = 0; i13 < childCount; i13++) {
            View childAt = recyclerView.getChildAt(i13);
            if (childAt != view) {
                float fYggfygwlhe = jhduphickx.yggfygwlhe(childAt);
                if (fYggfygwlhe > f13) {
                    f13 = fYggfygwlhe;
                }
            }
        }
        return f13;
    }

    @Override // androidx.recyclerview.widget.wflxmlrfwp
    public void iobyxmoadg(View view) {
        Object tag = view.getTag(m5.ppxfxbqfkf.item_touch_helper_previous_elevation);
        if (tag instanceof Float) {
            jhduphickx.tbqsvytpvh(view, ((Float) tag).floatValue());
        }
        view.setTag(m5.ppxfxbqfkf.item_touch_helper_previous_elevation, null);
        view.setTranslationX(0.0f);
        view.setTranslationY(0.0f);
    }

    @Override // androidx.recyclerview.widget.wflxmlrfwp
    public void ppxfxbqfkf(Canvas canvas, RecyclerView recyclerView, View view, float f13, float f14, int i13, boolean z13) {
        if (z13 && view.getTag(m5.ppxfxbqfkf.item_touch_helper_previous_elevation) == null) {
            Float fValueOf = Float.valueOf(jhduphickx.yggfygwlhe(view));
            jhduphickx.tbqsvytpvh(view, eablkybsjg(recyclerView, view) + 1.0f);
            view.setTag(m5.ppxfxbqfkf.item_touch_helper_previous_elevation, fValueOf);
        }
        view.setTranslationX(f13);
        view.setTranslationY(f14);
    }

    @Override // androidx.recyclerview.widget.wflxmlrfwp
    public void wkgbmnqykc(Canvas canvas, RecyclerView recyclerView, View view, float f13, float f14, int i13, boolean z13) {
    }

    @Override // androidx.recyclerview.widget.wflxmlrfwp
    public void zoijcleaow(View view) {
    }
}
