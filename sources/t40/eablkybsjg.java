package t40;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.jvm.internal.gtknphoqwx;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes4.dex */
public abstract class eablkybsjg extends RecyclerView.ojitshcjhn {

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    public static final iobyxmoadg f109646ppxfxbqfkf = new iobyxmoadg(null);

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final int f109647iobyxmoadg;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final boolean f109648zoijcleaow;

    public static final class iobyxmoadg {
        public /* synthetic */ iobyxmoadg(gtknphoqwx gtknphoqwxVar) {
            this();
        }

        private iobyxmoadg() {
        }
    }

    public eablkybsjg(int i13, boolean z13) {
        this.f109647iobyxmoadg = i13;
        this.f109648zoijcleaow = z13;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.ojitshcjhn
    public void getItemOffsets(Rect outRect, View view, RecyclerView parent, RecyclerView.zynmafqrjb state) {
        zdlpuopuiu.btonecajqb(outRect, "outRect");
        zdlpuopuiu.btonecajqb(view, "view");
        zdlpuopuiu.btonecajqb(parent, "parent");
        zdlpuopuiu.btonecajqb(state, "state");
        RecyclerView.nufgyqmvbu adapter = parent.getAdapter();
        int itemCount = adapter != null ? adapter.getItemCount() : 0;
        RecyclerView.nufgyqmvbu adapter2 = parent.getAdapter();
        int itemCount2 = adapter2 != null ? adapter2.getItemCount() - 1 : 0;
        int iYfnezrywwk = parent.yfnezrywwk(view);
        boolean z13 = iYfnezrywwk == 0;
        boolean z14 = iYfnezrywwk == itemCount2;
        int i13 = this.f109647iobyxmoadg;
        boolean z15 = this.f109648zoijcleaow;
        if (z15 && itemCount == 1) {
            outRect.top = i13;
            outRect.bottom = i13;
            return;
        }
        if (itemCount == 1) {
            outRect.top = 0;
            outRect.bottom = 0;
            return;
        }
        if (z15 && z13) {
            outRect.top = i13;
            outRect.bottom = i13;
            return;
        }
        if (z13) {
            outRect.top = 0;
            outRect.bottom = i13;
            return;
        }
        if (z15 && z14) {
            outRect.top = 0;
            outRect.bottom = i13;
        } else if (z14) {
            outRect.top = 0;
            outRect.bottom = 0;
        } else {
            outRect.top = 0;
            outRect.bottom = i13;
        }
    }
}
