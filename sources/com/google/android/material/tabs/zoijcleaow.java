package com.google.android.material.tabs;

import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.View;

/* JADX INFO: loaded from: classes2.dex */
class zoijcleaow extends ppxfxbqfkf {
    zoijcleaow() {
    }

    @Override // com.google.android.material.tabs.ppxfxbqfkf
    void wkgbmnqykc(TabLayout tabLayout, View view, View view2, float f13, Drawable drawable) {
        if (f13 >= 0.5f) {
            view = view2;
        }
        RectF rectFIobyxmoadg = ppxfxbqfkf.iobyxmoadg(tabLayout, view);
        float fZoijcleaow = f13 < 0.5f ? ea.iobyxmoadg.zoijcleaow(1.0f, 0.0f, 0.0f, 0.5f, f13) : ea.iobyxmoadg.zoijcleaow(0.0f, 1.0f, 0.5f, 1.0f, f13);
        drawable.setBounds((int) rectFIobyxmoadg.left, drawable.getBounds().top, (int) rectFIobyxmoadg.right, drawable.getBounds().bottom);
        drawable.setAlpha((int) (fZoijcleaow * 255.0f));
    }
}
