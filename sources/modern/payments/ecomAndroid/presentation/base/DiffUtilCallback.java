package modern.payments.ecomAndroid.presentation.base;

import androidx.recyclerview.widget.nufgyqmvbu;
import kotlin.Metadata;
import kotlin.jvm.internal.zdlpuopuiu;
import modern.payments.ecomAndroid.presentation.model.AdaptersState;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u001b\u0010\n\u001a\u00020\t*\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u001b\u0010\f\u001a\u00020\t*\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\f\u0010\u000bJ\u000f\u0010\r\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u000f\u0010\u000eJ\u001f\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0010\u001a\u00020\u00072\u0006\u0010\u0011\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u001f\u0010\u0015\u001a\u00020\u00122\u0006\u0010\u0010\u001a\u00020\u00072\u0006\u0010\u0011\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u0015\u0010\u0014R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0016R\u0014\u0010\u0004\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0016¨\u0006\u0017"}, d2 = {"Lmodern/payments/ecomAndroid/presentation/base/DiffUtilCallback;", "Landroidx/recyclerview/widget/nufgyqmvbu$zoijcleaow;", "Lmodern/payments/ecomAndroid/presentation/model/AdaptersState;", "oldState", "newState", "<init>", "(Lmodern/payments/ecomAndroid/presentation/model/AdaptersState;Lmodern/payments/ecomAndroid/presentation/model/AdaptersState;)V", "", "position", "", "itemId", "(Lmodern/payments/ecomAndroid/presentation/model/AdaptersState;I)Ljava/lang/Object;", "itemContent", "getOldListSize", "()I", "getNewListSize", "oldItemPosition", "newItemPosition", "", "areItemsTheSame", "(II)Z", "areContentsTheSame", "Lmodern/payments/ecomAndroid/presentation/model/AdaptersState;", "ecomAndroid_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class DiffUtilCallback extends nufgyqmvbu.zoijcleaow {
    private final AdaptersState newState;
    private final AdaptersState oldState;

    public DiffUtilCallback(AdaptersState oldState, AdaptersState newState) {
        zdlpuopuiu.btonecajqb(oldState, "oldState");
        zdlpuopuiu.btonecajqb(newState, "newState");
        this.oldState = oldState;
        this.newState = newState;
    }

    private final Object itemContent(AdaptersState adaptersState, int i13) {
        return adaptersState.getAdapterByItemPosition(i13).itemContent(adaptersState.getData().get(i13));
    }

    private final Object itemId(AdaptersState adaptersState, int i13) {
        return adaptersState.getAdapterByItemPosition(i13).itemId(adaptersState.getData().get(i13));
    }

    @Override // androidx.recyclerview.widget.nufgyqmvbu.zoijcleaow
    public boolean areContentsTheSame(int oldItemPosition, int newItemPosition) {
        return zdlpuopuiu.eablkybsjg(itemContent(this.oldState, oldItemPosition), itemContent(this.newState, newItemPosition));
    }

    @Override // androidx.recyclerview.widget.nufgyqmvbu.zoijcleaow
    public boolean areItemsTheSame(int oldItemPosition, int newItemPosition) {
        return zdlpuopuiu.eablkybsjg(itemId(this.oldState, oldItemPosition), itemId(this.newState, newItemPosition));
    }

    @Override // androidx.recyclerview.widget.nufgyqmvbu.zoijcleaow
    public int getNewListSize() {
        return this.newState.getData().size();
    }

    @Override // androidx.recyclerview.widget.nufgyqmvbu.zoijcleaow
    public int getOldListSize() {
        return this.oldState.getData().size();
    }
}
