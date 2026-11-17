package ru.myspar.networkpanel.impl.domain.store;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.zdlpuopuiu;
import ru.myspar.networkpanel.impl.domain.model.NetworkItem;
import ru.myspar.networkpanel.impl.domain.model.PayloadHolder;

/* JADX INFO: renamed from: ru.myspar.networkpanel.impl.domain.store.NetworkPanelStore$State, reason: from toString */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000R\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0013\b\u0087\b\u0018\u00002\u00020\u0001B7\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\f\u0010\rJ\u001f\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0007¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\u0010H\u0007¢\u0006\u0004\b\u0015\u0010\u0016JH\u0010\u0018\u001a\u00020\u00172\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\nHÇ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\bH×\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0010H×\u0001¢\u0006\u0004\b\u001c\u0010\u0016J\u001a\u0010 \u001a\u00020\u001f2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001dH×\u0003¢\u0006\u0004\b \u0010!R\u001f\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)R\u001d\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0006¢\u0006\f\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b.\u0010/\u001a\u0004\b0\u00101¨\u00062"}, d2 = {"ru/myspar/networkpanel/impl/domain/store/NetworkPanelStore$State", "Landroid/os/Parcelable;", "", "Lru/myspar/networkpanel/impl/domain/model/NetworkItem;", "items", "Lei0/iobyxmoadg;", "type", "", "", "selectedGroupItems", "Lru/myspar/networkpanel/impl/domain/model/PayloadHolder;", "networkPayload", "<init>", "(Ljava/util/List;Lei0/iobyxmoadg;Ljava/util/Set;Lru/myspar/networkpanel/impl/domain/model/PayloadHolder;)V", "Landroid/os/Parcel;", "dest", "", "flags", "Lgg/wwaezpbzkn;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "Lru/myspar/networkpanel/impl/domain/store/NetworkPanelStore$State;", "zoijcleaow", "(Ljava/util/List;Lei0/iobyxmoadg;Ljava/util/Set;Lru/myspar/networkpanel/impl/domain/model/PayloadHolder;)Lru/myspar/networkpanel/impl/domain/store/NetworkPanelStore$State;", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "zdlpuopuiu", "Ljava/util/List;", "eablkybsjg", "()Ljava/util/List;", "yggfygwlhe", "Lei0/iobyxmoadg;", "nufgyqmvbu", "()Lei0/iobyxmoadg;", "jyumaefscl", "Ljava/util/Set;", "lqeggnwhkg", "()Ljava/util/Set;", "iwizpuwonk", "Lru/myspar/networkpanel/impl/domain/model/PayloadHolder;", "gxszxtbevo", "()Lru/myspar/networkpanel/impl/domain/model/PayloadHolder;", "impl_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class State implements Parcelable {
    public static final Parcelable.Creator<State> CREATOR = new iobyxmoadg();

    /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name and from kotlin metadata and from toString */
    private final PayloadHolder networkPayload;

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name and from kotlin metadata and from toString */
    private final Set selectedGroupItems;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name and from kotlin metadata and from toString */
    private final ei0.iobyxmoadg type;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name and from kotlin metadata and from toString */
    private final List items;

    /* JADX INFO: renamed from: ru.myspar.networkpanel.impl.domain.store.NetworkPanelStore$State$iobyxmoadg */
    public static final class iobyxmoadg implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public final State createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            zdlpuopuiu.btonecajqb(parcel, "parcel");
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i13 = parcel.readInt();
                arrayList = new ArrayList(i13);
                for (int i14 = 0; i14 != i13; i14++) {
                    arrayList.add(NetworkItem.CREATOR.createFromParcel(parcel));
                }
            }
            ei0.iobyxmoadg iobyxmoadgVarValueOf = ei0.iobyxmoadg.valueOf(parcel.readString());
            int i15 = parcel.readInt();
            LinkedHashSet linkedHashSet = new LinkedHashSet(i15);
            for (int i16 = 0; i16 != i15; i16++) {
                linkedHashSet.add(parcel.readString());
            }
            return new State(arrayList, iobyxmoadgVarValueOf, linkedHashSet, parcel.readInt() != 0 ? PayloadHolder.CREATOR.createFromParcel(parcel) : null);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: zoijcleaow, reason: merged with bridge method [inline-methods] */
        public final State[] newArray(int i13) {
            return new State[i13];
        }
    }

    public State(List list, ei0.iobyxmoadg type, Set selectedGroupItems, PayloadHolder payloadHolder) {
        zdlpuopuiu.btonecajqb(type, "type");
        zdlpuopuiu.btonecajqb(selectedGroupItems, "selectedGroupItems");
        this.items = list;
        this.type = type;
        this.selectedGroupItems = selectedGroupItems;
        this.networkPayload = payloadHolder;
    }

    public static /* synthetic */ State ppxfxbqfkf(State state, List list, ei0.iobyxmoadg iobyxmoadgVar, Set set, PayloadHolder payloadHolder, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            list = state.items;
        }
        if ((i13 & 2) != 0) {
            iobyxmoadgVar = state.type;
        }
        if ((i13 & 4) != 0) {
            set = state.selectedGroupItems;
        }
        if ((i13 & 8) != 0) {
            payloadHolder = state.networkPayload;
        }
        return state.zoijcleaow(list, iobyxmoadgVar, set, payloadHolder);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    /* JADX INFO: renamed from: eablkybsjg, reason: from getter */
    public final List getItems() {
        return this.items;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof State)) {
            return false;
        }
        State state = (State) other;
        return zdlpuopuiu.eablkybsjg(this.items, state.items) && this.type == state.type && zdlpuopuiu.eablkybsjg(this.selectedGroupItems, state.selectedGroupItems) && zdlpuopuiu.eablkybsjg(this.networkPayload, state.networkPayload);
    }

    /* JADX INFO: renamed from: gxszxtbevo, reason: from getter */
    public final PayloadHolder getNetworkPayload() {
        return this.networkPayload;
    }

    public int hashCode() {
        List list = this.items;
        int iHashCode = (((((list == null ? 0 : list.hashCode()) * 31) + this.type.hashCode()) * 31) + this.selectedGroupItems.hashCode()) * 31;
        PayloadHolder payloadHolder = this.networkPayload;
        return iHashCode + (payloadHolder != null ? payloadHolder.hashCode() : 0);
    }

    /* JADX INFO: renamed from: lqeggnwhkg, reason: from getter */
    public final Set getSelectedGroupItems() {
        return this.selectedGroupItems;
    }

    /* JADX INFO: renamed from: nufgyqmvbu, reason: from getter */
    public final ei0.iobyxmoadg getType() {
        return this.type;
    }

    public String toString() {
        return "State(items=" + this.items + ", type=" + this.type + ", selectedGroupItems=" + this.selectedGroupItems + ", networkPayload=" + this.networkPayload + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        zdlpuopuiu.btonecajqb(dest, "dest");
        List list = this.items;
        if (list == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeInt(list.size());
            Iterator it = list.iterator();
            while (it.hasNext()) {
                ((NetworkItem) it.next()).writeToParcel(dest, flags);
            }
        }
        dest.writeString(this.type.name());
        Set set = this.selectedGroupItems;
        dest.writeInt(set.size());
        Iterator it2 = set.iterator();
        while (it2.hasNext()) {
            dest.writeString((String) it2.next());
        }
        PayloadHolder payloadHolder = this.networkPayload;
        if (payloadHolder == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            payloadHolder.writeToParcel(dest, flags);
        }
    }

    public final State zoijcleaow(List items, ei0.iobyxmoadg type, Set selectedGroupItems, PayloadHolder networkPayload) {
        zdlpuopuiu.btonecajqb(type, "type");
        zdlpuopuiu.btonecajqb(selectedGroupItems, "selectedGroupItems");
        return new State(items, type, selectedGroupItems, networkPayload);
    }
}
