package ru.myspar.delivery.impl.interval.domain.store;

import android.os.Parcel;
import android.os.Parcelable;
import hg.tzroggbefp;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.gtknphoqwx;
import kotlin.jvm.internal.zdlpuopuiu;
import ru.myspar.delivery.api.model.DeliveryIntervalPayload;
import ru.myspar.delivery.impl.interval.domain.models.IntervalDay;
import ru.myspar.delivery.impl.interval.domain.models.SelectedInterval;

/* JADX INFO: renamed from: ru.myspar.delivery.impl.interval.domain.store.DeliveryIntervalStore$State, reason: from toString */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000N\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0002\b\u0016\b\u0087\b\u0018\u00002\u00020\u0001BE\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004\u0012\u0014\b\u0002\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0007\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u001f\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0007¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\u0011H\u0007¢\u0006\u0004\b\u0016\u0010\u0017JP\u0010\u0019\u001a\u00020\u00182\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\u0014\b\u0002\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u00072\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000bHÇ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\bH×\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0011H×\u0001¢\u0006\u0004\b\u001d\u0010\u0017J\u001a\u0010 \u001a\u00020\u00042\b\u0010\u001f\u001a\u0004\u0018\u00010\u001eH×\u0003¢\u0006\u0004\b \u0010!R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)R\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b*\u0010'\u001a\u0004\b+\u0010)R#\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u00078\u0006¢\u0006\f\n\u0004\b,\u0010-\u001a\u0004\b.\u0010/R\u0019\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b0\u00101\u001a\u0004\b2\u00103¨\u00064"}, d2 = {"ru/myspar/delivery/impl/interval/domain/store/DeliveryIntervalStore$State", "Landroid/os/Parcelable;", "Lru/myspar/delivery/api/model/DeliveryIntervalPayload;", "payload", "", "isLoading", "confirmProgress", "", "", "Lru/myspar/delivery/impl/interval/domain/models/IntervalDay;", "intervals", "Lru/myspar/delivery/impl/interval/domain/models/SelectedInterval;", "selectedInterval", "<init>", "(Lru/myspar/delivery/api/model/DeliveryIntervalPayload;ZZLjava/util/Map;Lru/myspar/delivery/impl/interval/domain/models/SelectedInterval;)V", "Landroid/os/Parcel;", "dest", "", "flags", "Lgg/wwaezpbzkn;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "Lru/myspar/delivery/impl/interval/domain/store/DeliveryIntervalStore$State;", "zoijcleaow", "(Lru/myspar/delivery/api/model/DeliveryIntervalPayload;ZZLjava/util/Map;Lru/myspar/delivery/impl/interval/domain/models/SelectedInterval;)Lru/myspar/delivery/impl/interval/domain/store/DeliveryIntervalStore$State;", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "equals", "(Ljava/lang/Object;)Z", "zdlpuopuiu", "Lru/myspar/delivery/api/model/DeliveryIntervalPayload;", "lqeggnwhkg", "()Lru/myspar/delivery/api/model/DeliveryIntervalPayload;", "yggfygwlhe", "Z", "dxjokdxxww", "()Z", "jyumaefscl", "eablkybsjg", "iwizpuwonk", "Ljava/util/Map;", "gxszxtbevo", "()Ljava/util/Map;", "cqumvgiudr", "Lru/myspar/delivery/impl/interval/domain/models/SelectedInterval;", "nufgyqmvbu", "()Lru/myspar/delivery/impl/interval/domain/models/SelectedInterval;", "impl_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class State implements Parcelable {
    public static final Parcelable.Creator<State> CREATOR = new iobyxmoadg();

    /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name and from kotlin metadata and from toString */
    private final SelectedInterval selectedInterval;

    /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name and from kotlin metadata and from toString */
    private final Map intervals;

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean confirmProgress;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean isLoading;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name and from kotlin metadata and from toString */
    private final DeliveryIntervalPayload payload;

    /* JADX INFO: renamed from: ru.myspar.delivery.impl.interval.domain.store.DeliveryIntervalStore$State$iobyxmoadg */
    public static final class iobyxmoadg implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public final State createFromParcel(Parcel parcel) {
            zdlpuopuiu.btonecajqb(parcel, "parcel");
            DeliveryIntervalPayload deliveryIntervalPayload = (DeliveryIntervalPayload) parcel.readParcelable(State.class.getClassLoader());
            boolean z13 = parcel.readInt() != 0;
            boolean z14 = parcel.readInt() != 0;
            int i13 = parcel.readInt();
            LinkedHashMap linkedHashMap = new LinkedHashMap(i13);
            for (int i14 = 0; i14 != i13; i14++) {
                linkedHashMap.put(parcel.readString(), IntervalDay.CREATOR.createFromParcel(parcel));
            }
            return new State(deliveryIntervalPayload, z13, z14, linkedHashMap, parcel.readInt() == 0 ? null : SelectedInterval.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: zoijcleaow, reason: merged with bridge method [inline-methods] */
        public final State[] newArray(int i13) {
            return new State[i13];
        }
    }

    public State(DeliveryIntervalPayload payload, boolean z13, boolean z14, Map intervals, SelectedInterval selectedInterval) {
        zdlpuopuiu.btonecajqb(payload, "payload");
        zdlpuopuiu.btonecajqb(intervals, "intervals");
        this.payload = payload;
        this.isLoading = z13;
        this.confirmProgress = z14;
        this.intervals = intervals;
        this.selectedInterval = selectedInterval;
    }

    public static /* synthetic */ State ppxfxbqfkf(State state, DeliveryIntervalPayload deliveryIntervalPayload, boolean z13, boolean z14, Map map, SelectedInterval selectedInterval, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            deliveryIntervalPayload = state.payload;
        }
        if ((i13 & 2) != 0) {
            z13 = state.isLoading;
        }
        boolean z15 = z13;
        if ((i13 & 4) != 0) {
            z14 = state.confirmProgress;
        }
        boolean z16 = z14;
        if ((i13 & 8) != 0) {
            map = state.intervals;
        }
        Map map2 = map;
        if ((i13 & 16) != 0) {
            selectedInterval = state.selectedInterval;
        }
        return state.zoijcleaow(deliveryIntervalPayload, z15, z16, map2, selectedInterval);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    /* JADX INFO: renamed from: dxjokdxxww, reason: from getter */
    public final boolean getIsLoading() {
        return this.isLoading;
    }

    /* JADX INFO: renamed from: eablkybsjg, reason: from getter */
    public final boolean getConfirmProgress() {
        return this.confirmProgress;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof State)) {
            return false;
        }
        State state = (State) other;
        return zdlpuopuiu.eablkybsjg(this.payload, state.payload) && this.isLoading == state.isLoading && this.confirmProgress == state.confirmProgress && zdlpuopuiu.eablkybsjg(this.intervals, state.intervals) && zdlpuopuiu.eablkybsjg(this.selectedInterval, state.selectedInterval);
    }

    /* JADX INFO: renamed from: gxszxtbevo, reason: from getter */
    public final Map getIntervals() {
        return this.intervals;
    }

    public int hashCode() {
        int iHashCode = ((((((this.payload.hashCode() * 31) + Boolean.hashCode(this.isLoading)) * 31) + Boolean.hashCode(this.confirmProgress)) * 31) + this.intervals.hashCode()) * 31;
        SelectedInterval selectedInterval = this.selectedInterval;
        return iHashCode + (selectedInterval == null ? 0 : selectedInterval.hashCode());
    }

    /* JADX INFO: renamed from: lqeggnwhkg, reason: from getter */
    public final DeliveryIntervalPayload getPayload() {
        return this.payload;
    }

    /* JADX INFO: renamed from: nufgyqmvbu, reason: from getter */
    public final SelectedInterval getSelectedInterval() {
        return this.selectedInterval;
    }

    public String toString() {
        return "State(payload=" + this.payload + ", isLoading=" + this.isLoading + ", confirmProgress=" + this.confirmProgress + ", intervals=" + this.intervals + ", selectedInterval=" + this.selectedInterval + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        zdlpuopuiu.btonecajqb(dest, "dest");
        dest.writeParcelable(this.payload, flags);
        dest.writeInt(this.isLoading ? 1 : 0);
        dest.writeInt(this.confirmProgress ? 1 : 0);
        Map map = this.intervals;
        dest.writeInt(map.size());
        for (Map.Entry entry : map.entrySet()) {
            dest.writeString((String) entry.getKey());
            ((IntervalDay) entry.getValue()).writeToParcel(dest, flags);
        }
        SelectedInterval selectedInterval = this.selectedInterval;
        if (selectedInterval == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            selectedInterval.writeToParcel(dest, flags);
        }
    }

    public final State zoijcleaow(DeliveryIntervalPayload payload, boolean isLoading, boolean confirmProgress, Map intervals, SelectedInterval selectedInterval) {
        zdlpuopuiu.btonecajqb(payload, "payload");
        zdlpuopuiu.btonecajqb(intervals, "intervals");
        return new State(payload, isLoading, confirmProgress, intervals, selectedInterval);
    }

    public /* synthetic */ State(DeliveryIntervalPayload deliveryIntervalPayload, boolean z13, boolean z14, Map map, SelectedInterval selectedInterval, int i13, gtknphoqwx gtknphoqwxVar) {
        this(deliveryIntervalPayload, (i13 & 2) != 0 ? false : z13, (i13 & 4) != 0 ? false : z14, (i13 & 8) != 0 ? tzroggbefp.dxjokdxxww() : map, (i13 & 16) != 0 ? null : selectedInterval);
    }
}
