package es;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes4.dex */
public final class wflxmlrfwp extends RecyclerView.ojitshcjhn {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final int f31877iobyxmoadg;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final int f31878zoijcleaow;

    public wflxmlrfwp(int i13, int i14) {
        this.f31877iobyxmoadg = i13;
        this.f31878zoijcleaow = i14;
    }

    private final Integer gxszxtbevo(RecyclerView recyclerView, View view) {
        Integer numValueOf = Integer.valueOf(recyclerView.yfnezrywwk(view));
        if (numValueOf.intValue() != -1) {
            return numValueOf;
        }
        return null;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.ojitshcjhn
    public void getItemOffsets(Rect outRect, View view, RecyclerView parent, RecyclerView.zynmafqrjb state) {
        Integer numGxszxtbevo;
        int i13;
        zdlpuopuiu.btonecajqb(outRect, "outRect");
        zdlpuopuiu.btonecajqb(view, "view");
        zdlpuopuiu.btonecajqb(parent, "parent");
        zdlpuopuiu.btonecajqb(state, "state");
        RecyclerView.nufgyqmvbu adapter = parent.getAdapter();
        df.wkgbmnqykc wkgbmnqykcVar = adapter instanceof df.wkgbmnqykc ? (df.wkgbmnqykc) adapter : null;
        if (wkgbmnqykcVar == null || (numGxszxtbevo = gxszxtbevo(parent, view)) == null) {
            return;
        }
        int iIntValue = numGxszxtbevo.intValue();
        Object obj = wkgbmnqykcVar.ppxfxbqfkf().get(iIntValue);
        draadjrbmk draadjrbmkVar = obj instanceof draadjrbmk ? (draadjrbmk) obj : null;
        if (draadjrbmkVar == null) {
            return;
        }
        if (draadjrbmkVar instanceof draadjrbmk.ppxfxbqfkf) {
            i13 = iIntValue != wkgbmnqykcVar.getItemCount() + (-1) ? this.f31877iobyxmoadg : 0;
        } else {
            if (!(draadjrbmkVar instanceof draadjrbmk.iobyxmoadg) && !(draadjrbmkVar instanceof draadjrbmk.zoijcleaow)) {
                throw new NoWhenBranchMatchedException();
            }
            i13 = this.f31878zoijcleaow;
        }
        outRect.bottom = i13;
    }
}
