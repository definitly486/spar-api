package modern.payments.ecomAndroid.presentation.adapter.decorator;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Metadata;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J/\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0011¨\u0006\u0012"}, d2 = {"Lmodern/payments/ecomAndroid/presentation/adapter/decorator/HorizontalSpacingItemDecorationLastExcluded;", "Landroidx/recyclerview/widget/RecyclerView$ojitshcjhn;", "", "spacing", "<init>", "(I)V", "Landroid/graphics/Rect;", "rect", "Landroid/view/View;", "view", "Landroidx/recyclerview/widget/RecyclerView;", "parent", "Landroidx/recyclerview/widget/RecyclerView$zynmafqrjb;", "s", "Lgg/wwaezpbzkn;", "getItemOffsets", "(Landroid/graphics/Rect;Landroid/view/View;Landroidx/recyclerview/widget/RecyclerView;Landroidx/recyclerview/widget/RecyclerView$zynmafqrjb;)V", "I", "ecomAndroid_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class HorizontalSpacingItemDecorationLastExcluded extends RecyclerView.ojitshcjhn {
    private final int spacing;

    public HorizontalSpacingItemDecorationLastExcluded(int i13) {
        this.spacing = i13;
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
            rect.right = (iYfnezrywwk == -1 || iYfnezrywwk == adapter.getItemCount() + (-1)) ? 0 : this.spacing;
        }
    }
}
