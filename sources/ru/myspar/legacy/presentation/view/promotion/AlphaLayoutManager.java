package ru.myspar.legacy.presentation.view.promotion;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Metadata;
import kotlin.jvm.internal.gtknphoqwx;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u0000 \u00172\u00020\u0001:\u0001\u0018B%\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u000b\u0010\fJ+\u0010\u0013\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u00042\n\u0010\u0010\u001a\u00060\u000eR\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0019\u0010\u0015\u001a\u00020\n2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0016¢\u0006\u0004\b\u0015\u0010\u0016¨\u0006\u0019"}, d2 = {"Lru/myspar/legacy/presentation/view/promotion/AlphaLayoutManager;", "Landroidx/recyclerview/widget/LinearLayoutManager;", "Landroid/content/Context;", "context", "", "orientation", "", "reverseLayout", "<init>", "(Landroid/content/Context;IZ)V", "Lgg/wwaezpbzkn;", "g1", "()V", "dx", "Landroidx/recyclerview/widget/RecyclerView$iwizpuwonk;", "Landroidx/recyclerview/widget/RecyclerView;", "recycler", "Landroidx/recyclerview/widget/RecyclerView$zynmafqrjb;", "state", "P", "(ILandroidx/recyclerview/widget/RecyclerView$iwizpuwonk;Landroidx/recyclerview/widget/RecyclerView$zynmafqrjb;)I", "q", "(Landroidx/recyclerview/widget/RecyclerView$zynmafqrjb;)V", "jhduphickx", "iobyxmoadg", "legacy_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class AlphaLayoutManager extends LinearLayoutManager {
    public /* synthetic */ AlphaLayoutManager(Context context, int i13, boolean z13, int i14, gtknphoqwx gtknphoqwxVar) {
        this(context, (i14 & 2) != 0 ? 0 : i13, (i14 & 4) != 0 ? false : z13);
    }

    private final void g1() {
        if (G0() == 0) {
            float fIwxlajgraz = iwxlajgraz() / 2.0f;
            int iVipkmwdibw = vipkmwdibw();
            for (int i13 = 0; i13 < iVipkmwdibw; i13++) {
                View viewRibwqtqdhb = ribwqtqdhb(i13);
                if (viewRibwqtqdhb != null) {
                    ((ViewGroup) viewRibwqtqdhb).getChildAt(0).setAlpha(1.0f - (Math.abs(fIwxlajgraz - ((yfnezrywwk(viewRibwqtqdhb) + rlfsiqarku(viewRibwqtqdhb)) / 2.0f)) / iwxlajgraz()));
                }
            }
        }
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.rgvfuqvkyq
    public int P(int dx2, RecyclerView.iwizpuwonk recycler, RecyclerView.zynmafqrjb state) {
        zdlpuopuiu.btonecajqb(recycler, "recycler");
        zdlpuopuiu.btonecajqb(state, "state");
        g1();
        return super.P(dx2, recycler, state);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.rgvfuqvkyq
    public void q(RecyclerView.zynmafqrjb state) {
        super.q(state);
        g1();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AlphaLayoutManager(Context context, int i13, boolean z13) {
        super(context, i13, z13);
        zdlpuopuiu.btonecajqb(context, "context");
    }
}
