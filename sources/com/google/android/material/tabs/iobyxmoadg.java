package com.google.android.material.tabs;

import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.View;

/* JADX INFO: loaded from: classes2.dex */
class iobyxmoadg extends ppxfxbqfkf {
    iobyxmoadg() {
    }

    private static float eablkybsjg(float f13) {
        return (float) (1.0d - Math.cos((((double) f13) * 3.141592653589793d) / 2.0d));
    }

    private static float gxszxtbevo(float f13) {
        return (float) Math.sin((((double) f13) * 3.141592653589793d) / 2.0d);
    }

    @Override // com.google.android.material.tabs.ppxfxbqfkf
    void wkgbmnqykc(TabLayout tabLayout, View view, View view2, float f13, Drawable drawable) {
        float fGxszxtbevo;
        float fEablkybsjg;
        RectF rectFIobyxmoadg = ppxfxbqfkf.iobyxmoadg(tabLayout, view);
        RectF rectFIobyxmoadg2 = ppxfxbqfkf.iobyxmoadg(tabLayout, view2);
        if (rectFIobyxmoadg.left < rectFIobyxmoadg2.left) {
            fGxszxtbevo = eablkybsjg(f13);
            fEablkybsjg = gxszxtbevo(f13);
        } else {
            fGxszxtbevo = gxszxtbevo(f13);
            fEablkybsjg = eablkybsjg(f13);
        }
        drawable.setBounds(ea.iobyxmoadg.ppxfxbqfkf((int) rectFIobyxmoadg.left, (int) rectFIobyxmoadg2.left, fGxszxtbevo), drawable.getBounds().top, ea.iobyxmoadg.ppxfxbqfkf((int) rectFIobyxmoadg.right, (int) rectFIobyxmoadg2.right, fEablkybsjg), drawable.getBounds().bottom);
    }
}
