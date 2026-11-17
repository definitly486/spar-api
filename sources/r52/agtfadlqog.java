package r52;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes6.dex */
public final class agtfadlqog extends RecyclerView.ojitshcjhn {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    public static final iobyxmoadg f81811iobyxmoadg = new iobyxmoadg(null);

    public static final class iobyxmoadg {
        public /* synthetic */ iobyxmoadg(kotlin.jvm.internal.gtknphoqwx gtknphoqwxVar) {
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
        int iYfnezrywwk = parent.yfnezrywwk(view);
        int dimensionPixelSize = parent.getResources().getDimensionPixelSize(s40.eablkybsjg.content_margin_16);
        if (iYfnezrywwk == 0) {
            dimensionPixelSize = 0;
        }
        outRect.top = dimensionPixelSize;
    }
}
