package modern.payments.ecomAndroid.presentation.adapter.decorator;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Metadata;
import kotlin.jvm.internal.gtknphoqwx;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J/\u0010\u0011\u001a\u00020\u00102\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0013R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0014¨\u0006\u0015"}, d2 = {"Lmodern/payments/ecomAndroid/presentation/adapter/decorator/VerticalSpacingItemDecorationLastExcluded;", "Landroidx/recyclerview/widget/RecyclerView$ojitshcjhn;", "", "spacingPx", "", "excludeLast", "<init>", "(IZ)V", "Landroid/graphics/Rect;", "rect", "Landroid/view/View;", "view", "Landroidx/recyclerview/widget/RecyclerView;", "parent", "Landroidx/recyclerview/widget/RecyclerView$zynmafqrjb;", "s", "Lgg/wwaezpbzkn;", "getItemOffsets", "(Landroid/graphics/Rect;Landroid/view/View;Landroidx/recyclerview/widget/RecyclerView;Landroidx/recyclerview/widget/RecyclerView$zynmafqrjb;)V", "I", "Z", "ecomAndroid_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class VerticalSpacingItemDecorationLastExcluded extends RecyclerView.ojitshcjhn {
    private final boolean excludeLast;
    private final int spacingPx;

    public /* synthetic */ VerticalSpacingItemDecorationLastExcluded(int i13, boolean z13, int i14, gtknphoqwx gtknphoqwxVar) {
        this(i13, (i14 & 2) != 0 ? true : z13);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.ojitshcjhn
    public void getItemOffsets(Rect rect, View view, RecyclerView parent, RecyclerView.zynmafqrjb s13) {
        zdlpuopuiu.btonecajqb(rect, "rect");
        zdlpuopuiu.btonecajqb(view, "view");
        zdlpuopuiu.btonecajqb(parent, "parent");
        zdlpuopuiu.btonecajqb(s13, "s");
        RecyclerView.nufgyqmvbu adapter = parent.getAdapter();
        if (adapter != null) {
            int iYfnezrywwk = parent.yfnezrywwk(view);
            int i13 = 0;
            if (iYfnezrywwk != -1 && (iYfnezrywwk != adapter.getItemCount() - 1 || !this.excludeLast)) {
                i13 = this.spacingPx;
            }
            rect.bottom = i13;
        }
    }

    public VerticalSpacingItemDecorationLastExcluded(int i13, boolean z13) {
        this.spacingPx = i13;
        this.excludeLast = z13;
    }
}
