package t40;

import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.vdvldrhtss;
import kotlin.jvm.internal.gtknphoqwx;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes4.dex */
public final class dxjokdxxww extends vdvldrhtss {

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    public static final iobyxmoadg f109644zoijcleaow = new iobyxmoadg(null);

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final int f109645iobyxmoadg;

    public static final class iobyxmoadg {
        public /* synthetic */ iobyxmoadg(gtknphoqwx gtknphoqwxVar) {
            this();
        }

        private iobyxmoadg() {
        }
    }

    public /* synthetic */ dxjokdxxww(int i13, int i14, gtknphoqwx gtknphoqwxVar) {
        this((i14 & 1) != 0 ? 5 : i13);
    }

    @Override // androidx.recyclerview.widget.vdvldrhtss, androidx.recyclerview.widget.lereixgezr
    public int findTargetSnapPosition(RecyclerView.rgvfuqvkyq layoutManager, int i13, int i14) {
        zdlpuopuiu.btonecajqb(layoutManager, "layoutManager");
        LinearLayoutManager linearLayoutManager = layoutManager instanceof LinearLayoutManager ? (LinearLayoutManager) layoutManager : null;
        if (linearLayoutManager == null) {
            return -1;
        }
        int i15 = this.f109645iobyxmoadg;
        if (i13 > i15) {
            return linearLayoutManager.v0();
        }
        if (i13 < i15) {
            return linearLayoutManager.s0();
        }
        View viewFindSnapView = findSnapView(layoutManager);
        if (viewFindSnapView != null) {
            return layoutManager.lrnfpwlwnk(viewFindSnapView);
        }
        return -1;
    }

    public dxjokdxxww(int i13) {
        this.f109645iobyxmoadg = i13;
    }
}
