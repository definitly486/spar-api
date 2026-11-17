package a01;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import b31.eablkybsjg;
import kotlin.jvm.internal.gtknphoqwx;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes5.dex */
public final class wkgbmnqykc extends RecyclerView.ojitshcjhn {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    public static final iobyxmoadg f115iobyxmoadg = new iobyxmoadg(null);

    public static final class iobyxmoadg {
        public /* synthetic */ iobyxmoadg(gtknphoqwx gtknphoqwxVar) {
            this();
        }

        private iobyxmoadg() {
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.ojitshcjhn
    public void getItemOffsets(Rect outRect, View view, RecyclerView parent, RecyclerView.zynmafqrjb state) {
        zdlpuopuiu.btonecajqb(outRect, "outRect");
        zdlpuopuiu.btonecajqb(view, "view");
        zdlpuopuiu.btonecajqb(parent, "parent");
        zdlpuopuiu.btonecajqb(state, "state");
        RecyclerView.nufgyqmvbu adapter = parent.getAdapter();
        int itemCount = adapter != null ? adapter.getItemCount() - 1 : 0;
        int iYfnezrywwk = parent.yfnezrywwk(view);
        outRect.right = ((iYfnezrywwk == 0) || !(iYfnezrywwk == itemCount)) ? parent.getResources().getDimensionPixelSize(eablkybsjg.content_margin_8) : 0;
    }
}
