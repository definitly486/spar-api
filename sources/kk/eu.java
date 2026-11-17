package kk;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: classes3.dex */
public final class eu extends RecyclerView.ojitshcjhn {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    public final int f56469iobyxmoadg;

    public eu(int i13) {
        this.f56469iobyxmoadg = i13;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.ojitshcjhn
    public final void getItemOffsets(Rect rect, View view, RecyclerView parent, RecyclerView.zynmafqrjb s13) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(rect, "rect");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(view, "view");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(parent, "parent");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(s13, "s");
        RecyclerView.nufgyqmvbu adapter = parent.getAdapter();
        if (adapter != null) {
            int iYfnezrywwk = parent.yfnezrywwk(view);
            rect.right = (iYfnezrywwk == -1 || iYfnezrywwk == adapter.getItemCount() + (-1)) ? 0 : this.f56469iobyxmoadg;
        }
    }
}
