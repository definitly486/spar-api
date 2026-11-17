package kk;

import android.content.Context;
import android.util.DisplayMetrics;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: classes3.dex */
public final class qb0 extends androidx.recyclerview.widget.rgvfuqvkyq {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    public final /* synthetic */ ce0 f58172iobyxmoadg;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qb0(ce0 ce0Var, Context context) {
        super(context);
        this.f58172iobyxmoadg = ce0Var;
    }

    @Override // androidx.recyclerview.widget.rgvfuqvkyq
    public final float calculateSpeedPerPixel(DisplayMetrics displayMetrics) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(displayMetrics, "displayMetrics");
        return this.f58172iobyxmoadg.f56140eablkybsjg / displayMetrics.densityDpi;
    }

    @Override // androidx.recyclerview.widget.rgvfuqvkyq, androidx.recyclerview.widget.RecyclerView.pmvmpeiblj
    public final void onTargetFound(View targetView, RecyclerView.zynmafqrjb state, RecyclerView.pmvmpeiblj.iobyxmoadg action) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(targetView, "targetView");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(state, "state");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(action, "action");
        RecyclerView recyclerView = this.f58172iobyxmoadg.f56141gtknphoqwx;
        if (recyclerView != null) {
            kotlin.jvm.internal.zdlpuopuiu.lqeggnwhkg(recyclerView);
            if (recyclerView.getLayoutManager() == null) {
                return;
            }
            ce0 ce0Var = this.f58172iobyxmoadg;
            RecyclerView recyclerView2 = ce0Var.f56141gtknphoqwx;
            kotlin.jvm.internal.zdlpuopuiu.lqeggnwhkg(recyclerView2);
            RecyclerView.rgvfuqvkyq layoutManager = recyclerView2.getLayoutManager();
            kotlin.jvm.internal.zdlpuopuiu.lqeggnwhkg(layoutManager);
            int[] iArrCalculateDistanceToFinalSnap = ce0Var.calculateDistanceToFinalSnap(layoutManager, targetView);
            int i13 = iArrCalculateDistanceToFinalSnap[0];
            int i14 = iArrCalculateDistanceToFinalSnap[1];
            int iCalculateTimeForDeceleration = calculateTimeForDeceleration(Math.max(Math.abs(i13), Math.abs(i14)));
            if (iCalculateTimeForDeceleration > 0) {
                action.wkgbmnqykc(i13, i14, iCalculateTimeForDeceleration, this.mDecelerateInterpolator);
            }
        }
    }
}
