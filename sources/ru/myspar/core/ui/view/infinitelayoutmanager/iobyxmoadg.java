package ru.myspar.core.ui.view.infinitelayoutmanager;

import gg.vdvldrhtss;
import hg.agtfadlqog;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes4.dex */
public abstract class iobyxmoadg {
    public static final vdvldrhtss iobyxmoadg(int i13, int i14, int i15) {
        return new vdvldrhtss(Integer.valueOf(Math.abs(i13 - i14)), Integer.valueOf((i15 - Math.max(i13, i14)) + Math.min(i13, i14)));
    }

    public static final int ppxfxbqfkf(int i13, InfiniteLayoutManager layoutManager, int i14) {
        zdlpuopuiu.btonecajqb(layoutManager, "layoutManager");
        int i15 = -1;
        if (layoutManager.getTopLeftIndex() == i13) {
            return -1;
        }
        if (layoutManager.getBottomRightIndex() == i13) {
            return 1;
        }
        vdvldrhtss vdvldrhtssVarIobyxmoadg = iobyxmoadg(i13, layoutManager.getTopLeftIndex(), i14);
        int iIntValue = ((Number) vdvldrhtssVarIobyxmoadg.iobyxmoadg()).intValue();
        int iIntValue2 = ((Number) vdvldrhtssVarIobyxmoadg.wkgbmnqykc()).intValue();
        boolean z13 = false;
        boolean z14 = i13 < layoutManager.getTopLeftIndex();
        vdvldrhtss vdvldrhtssVarIobyxmoadg2 = iobyxmoadg(i13, layoutManager.getBottomRightIndex(), i14);
        int iIntValue3 = ((Number) vdvldrhtssVarIobyxmoadg2.iobyxmoadg()).intValue();
        int iIntValue4 = ((Number) vdvldrhtssVarIobyxmoadg2.wkgbmnqykc()).intValue();
        boolean z15 = i13 < layoutManager.getBottomRightIndex();
        Integer num = (Integer) agtfadlqog.grlcpdaxtj(new Integer[]{Integer.valueOf(iIntValue), Integer.valueOf(iIntValue2), Integer.valueOf(iIntValue3), Integer.valueOf(iIntValue4)});
        if ((num != null && num.intValue() == iIntValue) || (num != null && num.intValue() == iIntValue3)) {
            z13 = true;
        } else if ((num == null || num.intValue() != iIntValue2) && (num == null || num.intValue() != iIntValue4)) {
            throw new IllegalStateException("Wrong minDistIsInLoop");
        }
        if ((num == null || num.intValue() != iIntValue) && (num == null || num.intValue() != iIntValue2)) {
            if ((num == null || num.intValue() != iIntValue3) && (num == null || num.intValue() != iIntValue4)) {
                throw new IllegalStateException("Wrong targetIsSmaller");
            }
            z14 = z15;
        }
        if (!z14 || !z13) {
            if ((z14 && !z13) || (!z14 && z13)) {
                i15 = 1;
            } else if (z14 || z13) {
                throw new IllegalStateException("Wrong adapterDir");
            }
        }
        return layoutManager.t0(i15);
    }

    public static final int zoijcleaow(int i13, InfiniteLayoutManager layoutManager, int i14) {
        zdlpuopuiu.btonecajqb(layoutManager, "layoutManager");
        return ppxfxbqfkf(i13, layoutManager, i14);
    }
}
