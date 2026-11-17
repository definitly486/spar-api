package kk;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: classes3.dex */
public final class zc0 extends RecyclerView.yggfygwlhe {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    public final /* synthetic */ ce0 f59567iobyxmoadg;

    public zc0(ce0 ce0Var) {
        this.f59567iobyxmoadg = ce0Var;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.yggfygwlhe
    public final void onScrollStateChanged(RecyclerView recyclerView, int i13) {
        la0 la0Var;
        View viewDxjokdxxww;
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(recyclerView, "recyclerView");
        super.onScrollStateChanged(recyclerView, i13);
        ce0 ce0Var = this.f59567iobyxmoadg;
        ce0Var.getClass();
        if (i13 == 0 && (la0Var = ce0Var.f56137btonecajqb) != null && ce0Var.f56147wkgbmnqykc) {
            if (ce0Var.f56146ppxfxbqfkf != -1) {
                kotlin.jvm.internal.zdlpuopuiu.lqeggnwhkg(la0Var);
                la0Var.iobyxmoadg(ce0Var.f56146ppxfxbqfkf);
            } else {
                RecyclerView recyclerView2 = ce0Var.f56141gtknphoqwx;
                kotlin.jvm.internal.zdlpuopuiu.lqeggnwhkg(recyclerView2);
                RecyclerView.rgvfuqvkyq layoutManager = recyclerView2.getLayoutManager();
                if (layoutManager != null && (viewDxjokdxxww = ce0Var.dxjokdxxww(layoutManager, false)) != null) {
                    RecyclerView recyclerView3 = ce0Var.f56141gtknphoqwx;
                    kotlin.jvm.internal.zdlpuopuiu.lqeggnwhkg(recyclerView3);
                    int iYfnezrywwk = recyclerView3.yfnezrywwk(viewDxjokdxxww);
                    if (iYfnezrywwk != -1) {
                        la0 la0Var2 = ce0Var.f56137btonecajqb;
                        kotlin.jvm.internal.zdlpuopuiu.lqeggnwhkg(la0Var2);
                        la0Var2.iobyxmoadg(iYfnezrywwk);
                    }
                }
            }
        }
        ce0Var.f56147wkgbmnqykc = i13 != 0;
    }
}
