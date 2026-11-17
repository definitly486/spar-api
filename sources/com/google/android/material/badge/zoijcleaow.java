package com.google.android.material.badge;

import android.graphics.Rect;
import android.view.View;
import android.widget.FrameLayout;

/* JADX INFO: loaded from: classes2.dex */
public abstract class zoijcleaow {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    public static final boolean f22116iobyxmoadg = false;

    public static void iobyxmoadg(iobyxmoadg iobyxmoadgVar, View view, FrameLayout frameLayout) {
        ppxfxbqfkf(iobyxmoadgVar, view, frameLayout);
        if (iobyxmoadgVar.dxjokdxxww() != null) {
            iobyxmoadgVar.dxjokdxxww().setForeground(iobyxmoadgVar);
        } else {
            if (f22116iobyxmoadg) {
                throw new IllegalArgumentException("Trying to reference null customBadgeParent");
            }
            view.getOverlay().add(iobyxmoadgVar);
        }
    }

    public static void ppxfxbqfkf(iobyxmoadg iobyxmoadgVar, View view, FrameLayout frameLayout) {
        Rect rect = new Rect();
        view.getDrawingRect(rect);
        iobyxmoadgVar.setBounds(rect);
        iobyxmoadgVar.cllcsxoeiz(view, frameLayout);
    }

    public static void wkgbmnqykc(Rect rect, float f13, float f14, float f15, float f16) {
        rect.set((int) (f13 - f15), (int) (f14 - f16), (int) (f13 + f15), (int) (f14 + f16));
    }

    public static void zoijcleaow(iobyxmoadg iobyxmoadgVar, View view) {
        if (iobyxmoadgVar == null) {
            return;
        }
        if (f22116iobyxmoadg || iobyxmoadgVar.dxjokdxxww() != null) {
            iobyxmoadgVar.dxjokdxxww().setForeground(null);
        } else {
            view.getOverlay().remove(iobyxmoadgVar);
        }
    }
}
