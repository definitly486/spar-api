package ru.myspar.delivery.impl.options.domain.store;

import android.os.Parcel;
import android.os.Parcelable;
import hg.jyumaefscl;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.gtknphoqwx;
import kotlin.jvm.internal.zdlpuopuiu;
import ru.myspar.delivery.api.model.DeliveryOptionsScreenMode;

/* JADX INFO: renamed from: ru.myspar.delivery.impl.options.domain.store.DeliveryOptionsStore$State, reason: from toString */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000L\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0012\b\u0087\b\u0018\u00002\u00020\u0001B5\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004\u0012\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u001f\u0010\u0011\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0007¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\u000eH\u0007¢\u0006\u0004\b\u0013\u0010\u0014J>\u0010\u0016\u001a\u00020\u00152\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007HÇ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0018H×\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u000eH×\u0001¢\u0006\u0004\b\u001b\u0010\u0014J\u001a\u0010\u001e\u001a\u00020\u00042\b\u0010\u001d\u001a\u0004\u0018\u00010\u001cH×\u0003¢\u0006\u0004\b\u001e\u0010\u001fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'R\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b(\u0010%\u001a\u0004\b)\u0010'R\u001d\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0006¢\u0006\f\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-¨\u0006."}, d2 = {"ru/myspar/delivery/impl/options/domain/store/DeliveryOptionsStore$State", "Landroid/os/Parcelable;", "Lru/myspar/delivery/api/model/DeliveryOptionsScreenMode;", "screenMode", "", "isLoading", "hideScreen", "", "Lru/myspar/core/domain/models/cart/CommentReferences;", "commentsGroupList", "<init>", "(Lru/myspar/delivery/api/model/DeliveryOptionsScreenMode;ZZLjava/util/List;)V", "Landroid/os/Parcel;", "dest", "", "flags", "Lgg/wwaezpbzkn;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "Lru/myspar/delivery/impl/options/domain/store/DeliveryOptionsStore$State;", "zoijcleaow", "(Lru/myspar/delivery/api/model/DeliveryOptionsScreenMode;ZZLjava/util/List;)Lru/myspar/delivery/impl/options/domain/store/DeliveryOptionsStore$State;", "", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "equals", "(Ljava/lang/Object;)Z", "zdlpuopuiu", "Lru/myspar/delivery/api/model/DeliveryOptionsScreenMode;", "lqeggnwhkg", "()Lru/myspar/delivery/api/model/DeliveryOptionsScreenMode;", "yggfygwlhe", "Z", "nufgyqmvbu", "()Z", "jyumaefscl", "gxszxtbevo", "iwizpuwonk", "Ljava/util/List;", "eablkybsjg", "()Ljava/util/List;", "impl_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class State implements Parcelable {
    public static final Parcelable.Creator<State> CREATOR = new iobyxmoadg();

    /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name and from kotlin metadata and from toString */
    private final List commentsGroupList;

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean hideScreen;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean isLoading;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name and from kotlin metadata and from toString */
    private final DeliveryOptionsScreenMode screenMode;

    /* JADX INFO: renamed from: ru.myspar.delivery.impl.options.domain.store.DeliveryOptionsStore$State$iobyxmoadg */
    public static final class iobyxmoadg implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public final State createFromParcel(Parcel parcel) {
            zdlpuopuiu.btonecajqb(parcel, "parcel");
            DeliveryOptionsScreenMode deliveryOptionsScreenMode = (DeliveryOptionsScreenMode) parcel.readParcelable(State.class.getClassLoader());
            boolean z13 = parcel.readInt() != 0;
            boolean z14 = parcel.readInt() != 0;
            int i13 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i13);
            for (int i14 = 0; i14 != i13; i14++) {
                arrayList.add(parcel.readParcelable(State.class.getClassLoader()));
            }
            return new State(deliveryOptionsScreenMode, z13, z14, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: zoijcleaow, reason: merged with bridge method [inline-methods] */
        public final State[] newArray(int i13) {
            return new State[i13];
        }
    }

    public State(DeliveryOptionsScreenMode screenMode, boolean z13, boolean z14, List commentsGroupList) {
        zdlpuopuiu.btonecajqb(screenMode, "screenMode");
        zdlpuopuiu.btonecajqb(commentsGroupList, "commentsGroupList");
        this.screenMode = screenMode;
        this.isLoading = z13;
        this.hideScreen = z14;
        this.commentsGroupList = commentsGroupList;
    }

    public static /* synthetic */ State ppxfxbqfkf(State state, DeliveryOptionsScreenMode deliveryOptionsScreenMode, boolean z13, boolean z14, List list, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            deliveryOptionsScreenMode = state.screenMode;
        }
        if ((i13 & 2) != 0) {
            z13 = state.isLoading;
        }
        if ((i13 & 4) != 0) {
            z14 = state.hideScreen;
        }
        if ((i13 & 8) != 0) {
            list = state.commentsGroupList;
        }
        return state.zoijcleaow(deliveryOptionsScreenMode, z13, z14, list);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    /* JADX INFO: renamed from: eablkybsjg, reason: from getter */
    public final List getCommentsGroupList() {
        return this.commentsGroupList;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof State)) {
            return false;
        }
        State state = (State) other;
        return zdlpuopuiu.eablkybsjg(this.screenMode, state.screenMode) && this.isLoading == state.isLoading && this.hideScreen == state.hideScreen && zdlpuopuiu.eablkybsjg(this.commentsGroupList, state.commentsGroupList);
    }

    /* JADX INFO: renamed from: gxszxtbevo, reason: from getter */
    public final boolean getHideScreen() {
        return this.hideScreen;
    }

    public int hashCode() {
        return (((((this.screenMode.hashCode() * 31) + Boolean.hashCode(this.isLoading)) * 31) + Boolean.hashCode(this.hideScreen)) * 31) + this.commentsGroupList.hashCode();
    }

    /* JADX INFO: renamed from: lqeggnwhkg, reason: from getter */
    public final DeliveryOptionsScreenMode getScreenMode() {
        return this.screenMode;
    }

    /* JADX INFO: renamed from: nufgyqmvbu, reason: from getter */
    public final boolean getIsLoading() {
        return this.isLoading;
    }

    public String toString() {
        return "State(screenMode=" + this.screenMode + ", isLoading=" + this.isLoading + ", hideScreen=" + this.hideScreen + ", commentsGroupList=" + this.commentsGroupList + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        zdlpuopuiu.btonecajqb(dest, "dest");
        dest.writeParcelable(this.screenMode, flags);
        dest.writeInt(this.isLoading ? 1 : 0);
        dest.writeInt(this.hideScreen ? 1 : 0);
        List list = this.commentsGroupList;
        dest.writeInt(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            dest.writeParcelable((Parcelable) it.next(), flags);
        }
    }

    public final State zoijcleaow(DeliveryOptionsScreenMode screenMode, boolean isLoading, boolean hideScreen, List commentsGroupList) {
        zdlpuopuiu.btonecajqb(screenMode, "screenMode");
        zdlpuopuiu.btonecajqb(commentsGroupList, "commentsGroupList");
        return new State(screenMode, isLoading, hideScreen, commentsGroupList);
    }

    public /* synthetic */ State(DeliveryOptionsScreenMode deliveryOptionsScreenMode, boolean z13, boolean z14, List list, int i13, gtknphoqwx gtknphoqwxVar) {
        this((i13 & 1) != 0 ? DeliveryOptionsScreenMode.BASKET.f87620zdlpuopuiu : deliveryOptionsScreenMode, (i13 & 2) != 0 ? false : z13, (i13 & 4) != 0 ? false : z14, (i13 & 8) != 0 ? jyumaefscl.wflxmlrfwp() : list);
    }
}
