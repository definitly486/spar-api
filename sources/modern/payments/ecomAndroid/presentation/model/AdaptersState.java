package modern.payments.ecomAndroid.presentation.model;

import hg.jyumaefscl;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.gtknphoqwx;
import kotlin.jvm.internal.zdlpuopuiu;
import modern.payments.ecomAndroid.presentation.base.DelegateAdapter;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\u000e\n\u0000\b\u0080\b\u0018\u00002\u00020\u0001B#\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00010\u0003¢\u0006\u0002\u0010\u0006J\u000f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÂ\u0003J\u000f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00010\u0003HÆ\u0003J)\u0010\u000f\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00010\u0003HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\u000e\u0010\u0013\u001a\u00020\u00042\u0006\u0010\u0014\u001a\u00020\tJ\u000e\u0010\u0015\u001a\u00020\u00042\u0006\u0010\u0016\u001a\u00020\tJ\u000e\u0010\u0017\u001a\u00020\t2\u0006\u0010\u0016\u001a\u00020\tJ\t\u0010\u0018\u001a\u00020\tHÖ\u0001J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001R\u0014\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bX\u0082\u0004¢\u0006\u0004\n\u0002\u0010\nR\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u001b"}, d2 = {"Lmodern/payments/ecomAndroid/presentation/model/AdaptersState;", "", "adapters", "", "Lmodern/payments/ecomAndroid/presentation/base/DelegateAdapter;", "data", "(Ljava/util/List;Ljava/util/List;)V", "cacheAdapterPosition", "", "", "[Ljava/lang/Integer;", "getData", "()Ljava/util/List;", "component1", "component2", "copy", "equals", "", "other", "getAdapter", "adapterPosition", "getAdapterByItemPosition", "itemPosition", "getAdapterPosition", "hashCode", "toString", "", "ecomAndroid_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class AdaptersState {
    private final List<DelegateAdapter> adapters;
    private final Integer[] cacheAdapterPosition;
    private final List<Object> data;

    /* JADX WARN: Multi-variable type inference failed */
    public AdaptersState(List<? extends DelegateAdapter> adapters, List<? extends Object> data) {
        zdlpuopuiu.btonecajqb(adapters, "adapters");
        zdlpuopuiu.btonecajqb(data, "data");
        this.adapters = adapters;
        this.data = data;
        int size = data.size();
        Integer[] numArr = new Integer[size];
        for (int i13 = 0; i13 < size; i13++) {
            numArr[i13] = -1;
        }
        this.cacheAdapterPosition = numArr;
    }

    private final List<DelegateAdapter> component1() {
        return this.adapters;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ AdaptersState copy$default(AdaptersState adaptersState, List list, List list2, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            list = adaptersState.adapters;
        }
        if ((i13 & 2) != 0) {
            list2 = adaptersState.data;
        }
        return adaptersState.copy(list, list2);
    }

    public final List<Object> component2() {
        return this.data;
    }

    public final AdaptersState copy(List<? extends DelegateAdapter> adapters, List<? extends Object> data) {
        zdlpuopuiu.btonecajqb(adapters, "adapters");
        zdlpuopuiu.btonecajqb(data, "data");
        return new AdaptersState(adapters, data);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AdaptersState)) {
            return false;
        }
        AdaptersState adaptersState = (AdaptersState) other;
        return zdlpuopuiu.eablkybsjg(this.adapters, adaptersState.adapters) && zdlpuopuiu.eablkybsjg(this.data, adaptersState.data);
    }

    public final DelegateAdapter getAdapter(int adapterPosition) {
        return this.adapters.get(adapterPosition);
    }

    public final DelegateAdapter getAdapterByItemPosition(int itemPosition) {
        return this.adapters.get(getAdapterPosition(itemPosition));
    }

    public final int getAdapterPosition(int itemPosition) {
        Integer num = this.cacheAdapterPosition[itemPosition];
        Integer num2 = null;
        if (num.intValue() == -1) {
            num = null;
        }
        if (num != null) {
            return num.intValue();
        }
        Iterator<DelegateAdapter> it = this.adapters.iterator();
        int i13 = 0;
        while (true) {
            if (!it.hasNext()) {
                i13 = -1;
                break;
            }
            if (it.next().isForViewType(this.data, itemPosition)) {
                break;
            }
            i13++;
        }
        Integer numValueOf = Integer.valueOf(i13);
        if (numValueOf.intValue() == -1) {
            numValueOf = null;
        }
        if (numValueOf != null) {
            this.cacheAdapterPosition[itemPosition] = Integer.valueOf(numValueOf.intValue());
            num2 = numValueOf;
        }
        if (num2 != null) {
            return num2.intValue();
        }
        throw new IllegalStateException(("Provide adapter for type " + this.data.get(itemPosition).getClass() + " at position: " + itemPosition).toString());
    }

    public final List<Object> getData() {
        return this.data;
    }

    public int hashCode() {
        return (this.adapters.hashCode() * 31) + this.data.hashCode();
    }

    public String toString() {
        return "AdaptersState(adapters=" + this.adapters + ", data=" + this.data + ')';
    }

    public /* synthetic */ AdaptersState(List list, List list2, int i13, gtknphoqwx gtknphoqwxVar) {
        this(list, (i13 & 2) != 0 ? jyumaefscl.wflxmlrfwp() : list2);
    }
}
