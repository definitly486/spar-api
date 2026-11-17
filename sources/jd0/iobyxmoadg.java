package jd0;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: classes4.dex */
public final class iobyxmoadg extends RecyclerView.ojitshcjhn {
    @Override // androidx.recyclerview.widget.RecyclerView.ojitshcjhn
    public void getItemOffsets(Rect outRect, View view, RecyclerView parent, RecyclerView.zynmafqrjb state) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(outRect, "outRect");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(view, "view");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(parent, "parent");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(state, "state");
        outRect.bottom = parent.getResources().getDimensionPixelSize(s40.eablkybsjg.content_margin_4);
        outRect.left = parent.getResources().getDimensionPixelSize(s40.eablkybsjg.content_margin_4);
        outRect.right = parent.getResources().getDimensionPixelSize(s40.eablkybsjg.content_margin_4);
        outRect.top = parent.getResources().getDimensionPixelSize(s40.eablkybsjg.content_margin_4);
    }
}
