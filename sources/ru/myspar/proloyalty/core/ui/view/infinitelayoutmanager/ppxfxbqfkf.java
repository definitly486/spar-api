package ru.myspar.proloyalty.core.ui.view.infinitelayoutmanager;

import android.view.View;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes5.dex */
public abstract class ppxfxbqfkf {
    public static final View iobyxmoadg(int i13, InfiniteLayoutManager layoutManager) {
        int paddingTop;
        int iC0;
        int iYdmasvzmpa;
        int iCzzsidtyhn;
        zdlpuopuiu.btonecajqb(layoutManager, "layoutManager");
        if (layoutManager.getOrientation() == 0) {
            paddingTop = layoutManager.getPaddingLeft();
            iC0 = layoutManager.D0() / 2;
        } else {
            paddingTop = layoutManager.getPaddingTop();
            iC0 = layoutManager.C0() / 2;
        }
        int i14 = paddingTop + iC0;
        int iVipkmwdibw = layoutManager.vipkmwdibw();
        int i15 = Integer.MAX_VALUE;
        View view = null;
        for (int i16 = 0; i16 < iVipkmwdibw; i16++) {
            View viewRibwqtqdhb = layoutManager.ribwqtqdhb(i16);
            if (viewRibwqtqdhb == null) {
                return null;
            }
            if (layoutManager.lrnfpwlwnk(viewRibwqtqdhb) == i13) {
                if (layoutManager.getOrientation() == 0) {
                    iYdmasvzmpa = layoutManager.rlfsiqarku(viewRibwqtqdhb);
                    iCzzsidtyhn = layoutManager.uwvvkdfqfp(viewRibwqtqdhb) / 2;
                } else {
                    iYdmasvzmpa = layoutManager.ydmasvzmpa(viewRibwqtqdhb);
                    iCzzsidtyhn = layoutManager.czzsidtyhn(viewRibwqtqdhb) / 2;
                }
                int iAbs = Math.abs((iYdmasvzmpa + iCzzsidtyhn) - i14);
                if (iAbs < i15) {
                    view = viewRibwqtqdhb;
                    i15 = iAbs;
                }
            }
        }
        return view;
    }

    public static final View zoijcleaow(int i13, InfiniteLayoutManager layoutManager) {
        zdlpuopuiu.btonecajqb(layoutManager, "layoutManager");
        return iobyxmoadg(i13, layoutManager);
    }
}
