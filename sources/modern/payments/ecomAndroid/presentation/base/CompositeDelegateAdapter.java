package modern.payments.ecomAndroid.presentation.base;

import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.nufgyqmvbu;
import hg.agtfadlqog;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.zdlpuopuiu;
import modern.payments.ecomAndroid.presentation.model.AdaptersState;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0010\u0000\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0010\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u001b\u0012\u0012\u0010\u0005\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00040\u0003\"\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\n\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u001f\u0010\u000f\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u001f\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0011\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u0011\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u001d\u0010\u001b\u001a\u00020\u00132\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00190\u0018H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u0017\u0010\u001d\u001a\u00020\u00132\u0006\u0010\u0011\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u001d\u0010\u0017J\u0017\u0010\u001e\u001a\u00020\u00132\u0006\u0010\u0011\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u001e\u0010\u0017J\u000f\u0010\u001f\u001a\u00020\bH\u0016¢\u0006\u0004\b\u001f\u0010 R\"\u0010\"\u001a\u00020!8\u0014@\u0014X\u0094\u000e¢\u0006\u0012\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%\"\u0004\b&\u0010'¨\u0006("}, d2 = {"Lmodern/payments/ecomAndroid/presentation/base/CompositeDelegateAdapter;", "Landroidx/recyclerview/widget/RecyclerView$nufgyqmvbu;", "Landroidx/recyclerview/widget/RecyclerView$iozdgvuglv;", "", "Lmodern/payments/ecomAndroid/presentation/base/DelegateAdapter;", "adapters", "<init>", "([Lmodern/payments/ecomAndroid/presentation/base/DelegateAdapter;)V", "", "itemPosition", "getItemViewType", "(I)I", "Landroid/view/ViewGroup;", "parent", "viewType", "onCreateViewHolder", "(Landroid/view/ViewGroup;I)Landroidx/recyclerview/widget/RecyclerView$iozdgvuglv;", "holder", "position", "Lgg/wwaezpbzkn;", "onBindViewHolder", "(Landroidx/recyclerview/widget/RecyclerView$iozdgvuglv;I)V", "onViewRecycled", "(Landroidx/recyclerview/widget/RecyclerView$iozdgvuglv;)V", "", "", "data", "swapData", "(Ljava/util/List;)V", "onViewAttachedToWindow", "onViewDetachedFromWindow", "getItemCount", "()I", "Lmodern/payments/ecomAndroid/presentation/model/AdaptersState;", "adapterState", "Lmodern/payments/ecomAndroid/presentation/model/AdaptersState;", "getAdapterState", "()Lmodern/payments/ecomAndroid/presentation/model/AdaptersState;", "setAdapterState", "(Lmodern/payments/ecomAndroid/presentation/model/AdaptersState;)V", "ecomAndroid_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public class CompositeDelegateAdapter extends RecyclerView.nufgyqmvbu {
    private AdaptersState adapterState;

    public CompositeDelegateAdapter(DelegateAdapter... adapters) {
        zdlpuopuiu.btonecajqb(adapters, "adapters");
        this.adapterState = new AdaptersState(agtfadlqog.i(adapters), null, 2, null);
    }

    protected AdaptersState getAdapterState() {
        return this.adapterState;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.nufgyqmvbu
    public int getItemCount() {
        return getAdapterState().getData().size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.nufgyqmvbu
    public int getItemViewType(int itemPosition) {
        return getAdapterState().getAdapterPosition(itemPosition);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.nufgyqmvbu
    public void onBindViewHolder(RecyclerView.iozdgvuglv holder, int position) {
        zdlpuopuiu.btonecajqb(holder, "holder");
        getAdapterState().getAdapter(getItemViewType(position)).onBindViewHolder(holder, getAdapterState().getData(), position);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.nufgyqmvbu
    public RecyclerView.iozdgvuglv onCreateViewHolder(ViewGroup parent, int viewType) {
        zdlpuopuiu.btonecajqb(parent, "parent");
        return getAdapterState().getAdapter(viewType).onCreateViewHolder(parent, viewType);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.nufgyqmvbu
    public void onViewAttachedToWindow(RecyclerView.iozdgvuglv holder) {
        zdlpuopuiu.btonecajqb(holder, "holder");
        getAdapterState().getAdapter(holder.getItemViewType()).onAttachedToWindow(holder);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.nufgyqmvbu
    public void onViewDetachedFromWindow(RecyclerView.iozdgvuglv holder) {
        zdlpuopuiu.btonecajqb(holder, "holder");
        getAdapterState().getAdapter(holder.getItemViewType()).onDetachedFromWindow(holder);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.nufgyqmvbu
    public void onViewRecycled(RecyclerView.iozdgvuglv holder) {
        zdlpuopuiu.btonecajqb(holder, "holder");
        getAdapterState().getAdapter(holder.getItemViewType()).onRecycled(holder);
    }

    protected void setAdapterState(AdaptersState adaptersState) {
        zdlpuopuiu.btonecajqb(adaptersState, "<set-?>");
        this.adapterState = adaptersState;
    }

    public void swapData(List<? extends Object> data) {
        zdlpuopuiu.btonecajqb(data, "data");
        AdaptersState adaptersStateCopy$default = AdaptersState.copy$default(getAdapterState(), null, data, 1, null);
        nufgyqmvbu.eablkybsjg eablkybsjgVarZoijcleaow = nufgyqmvbu.zoijcleaow(new DiffUtilCallback(getAdapterState(), adaptersStateCopy$default));
        zdlpuopuiu.dxjokdxxww(eablkybsjgVarZoijcleaow, "calculateDiff(...)");
        setAdapterState(adaptersStateCopy$default);
        eablkybsjgVarZoijcleaow.ppxfxbqfkf(this);
    }
}
