package com.google.android.material.tabs;

import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.View;
import com.google.android.material.internal.ojitshcjhn;

/* JADX INFO: loaded from: classes2.dex */
class ppxfxbqfkf {
    ppxfxbqfkf() {
    }

    static RectF iobyxmoadg(TabLayout tabLayout, View view) {
        if (view == null) {
            return new RectF();
        }
        return (tabLayout.cdpycssgdh() || !(view instanceof TabLayout.gxszxtbevo)) ? new RectF(view.getLeft(), view.getTop(), view.getRight(), view.getBottom()) : zoijcleaow((TabLayout.gxszxtbevo) view, 24);
    }

    static RectF zoijcleaow(TabLayout.gxszxtbevo gxszxtbevoVar, int i13) {
        int contentWidth = gxszxtbevoVar.getContentWidth();
        int contentHeight = gxszxtbevoVar.getContentHeight();
        int iPpxfxbqfkf = (int) ojitshcjhn.ppxfxbqfkf(gxszxtbevoVar.getContext(), i13);
        if (contentWidth < iPpxfxbqfkf) {
            contentWidth = iPpxfxbqfkf;
        }
        int left = (gxszxtbevoVar.getLeft() + gxszxtbevoVar.getRight()) / 2;
        int top = (gxszxtbevoVar.getTop() + gxszxtbevoVar.getBottom()) / 2;
        int i14 = contentWidth / 2;
        return new RectF(left - i14, top - (contentHeight / 2), i14 + left, top + (left / 2));
    }

    void ppxfxbqfkf(TabLayout tabLayout, View view, Drawable drawable) {
        RectF rectFIobyxmoadg = iobyxmoadg(tabLayout, view);
        drawable.setBounds((int) rectFIobyxmoadg.left, drawable.getBounds().top, (int) rectFIobyxmoadg.right, drawable.getBounds().bottom);
    }

    void wkgbmnqykc(TabLayout tabLayout, View view, View view2, float f13, Drawable drawable) {
        RectF rectFIobyxmoadg = iobyxmoadg(tabLayout, view);
        RectF rectFIobyxmoadg2 = iobyxmoadg(tabLayout, view2);
        drawable.setBounds(ea.iobyxmoadg.ppxfxbqfkf((int) rectFIobyxmoadg.left, (int) rectFIobyxmoadg2.left, f13), drawable.getBounds().top, ea.iobyxmoadg.ppxfxbqfkf((int) rectFIobyxmoadg.right, (int) rectFIobyxmoadg2.right, f13), drawable.getBounds().bottom);
    }
}
