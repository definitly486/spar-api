package ru.myspar.promo_collection.impl.domain.store;

import android.os.Parcel;
import android.os.Parcelable;
import hg.jyumaefscl;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.gtknphoqwx;
import kotlin.jvm.internal.zdlpuopuiu;
import ru.myspar.components.promo_collection.api.models.PromoCollectionInfo;
import ru.myspar.core.domain.models.ColorsModel;

/* JADX INFO: renamed from: ru.myspar.promo_collection.impl.domain.store.PromoCollectionStore$State, reason: from toString */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000P\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0002\b\u0019\b\u0087\b\u0018\u00002\u00020\u0001BE\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\u000e\b\u0002\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b¢\u0006\u0004\b\u000e\u0010\u000fJ\u001f\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0007¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\u0012H\u0007¢\u0006\u0004\b\u0017\u0010\u0018JT\u0010\u001a\u001a\u00020\u00192\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\n\u001a\u00020\t2\u000e\b\u0002\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000bHÇ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0004H×\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0012H×\u0001¢\u0006\u0004\b\u001e\u0010\u0018J\u001a\u0010!\u001a\u00020\u00022\b\u0010 \u001a\u0004\u0018\u00010\u001fH×\u0003¢\u0006\u0004\b!\u0010\"R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b)\u0010\u001dR\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b*\u0010(\u001a\u0004\b+\u0010\u001dR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b,\u0010-\u001a\u0004\b.\u0010/R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b0\u00101\u001a\u0004\b2\u00103R\u001d\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b8\u0006¢\u0006\f\n\u0004\b4\u00105\u001a\u0004\b6\u00107¨\u00068"}, d2 = {"ru/myspar/promo_collection/impl/domain/store/PromoCollectionStore$State", "Landroid/os/Parcelable;", "", "isLoading", "", "landingPageId", "specialPromoBannerId", "Lru/myspar/core/domain/models/ColorsModel;", "colorsModel", "Lru/myspar/components/promo_collection/api/models/PromoCollectionInfo;", "promoCollectionInfo", "", "Lru/myspar/components/promo_collection/api/models/PromoCollectionItem;", "promoCollectionItems", "<init>", "(ZLjava/lang/String;Ljava/lang/String;Lru/myspar/core/domain/models/ColorsModel;Lru/myspar/components/promo_collection/api/models/PromoCollectionInfo;Ljava/util/List;)V", "Landroid/os/Parcel;", "dest", "", "flags", "Lgg/wwaezpbzkn;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "Lru/myspar/promo_collection/impl/domain/store/PromoCollectionStore$State;", "zoijcleaow", "(ZLjava/lang/String;Ljava/lang/String;Lru/myspar/core/domain/models/ColorsModel;Lru/myspar/components/promo_collection/api/models/PromoCollectionInfo;Ljava/util/List;)Lru/myspar/promo_collection/impl/domain/store/PromoCollectionStore$State;", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "equals", "(Ljava/lang/Object;)Z", "zdlpuopuiu", "Z", "btonecajqb", "()Z", "yggfygwlhe", "Ljava/lang/String;", "gxszxtbevo", "jyumaefscl", "dxjokdxxww", "iwizpuwonk", "Lru/myspar/core/domain/models/ColorsModel;", "eablkybsjg", "()Lru/myspar/core/domain/models/ColorsModel;", "cqumvgiudr", "Lru/myspar/components/promo_collection/api/models/PromoCollectionInfo;", "lqeggnwhkg", "()Lru/myspar/components/promo_collection/api/models/PromoCollectionInfo;", "esjtqupxsv", "Ljava/util/List;", "nufgyqmvbu", "()Ljava/util/List;", "impl_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class State implements Parcelable {
    public static final Parcelable.Creator<State> CREATOR = new iobyxmoadg();

    /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name and from kotlin metadata and from toString */
    private final PromoCollectionInfo promoCollectionInfo;

    /* JADX INFO: renamed from: esjtqupxsv, reason: collision with root package name and from kotlin metadata and from toString */
    private final List promoCollectionItems;

    /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name and from kotlin metadata and from toString */
    private final ColorsModel colorsModel;

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name and from kotlin metadata and from toString */
    private final String specialPromoBannerId;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name and from kotlin metadata and from toString */
    private final String landingPageId;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean isLoading;

    /* JADX INFO: renamed from: ru.myspar.promo_collection.impl.domain.store.PromoCollectionStore$State$iobyxmoadg */
    public static final class iobyxmoadg implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public final State createFromParcel(Parcel parcel) {
            zdlpuopuiu.btonecajqb(parcel, "parcel");
            boolean z13 = parcel.readInt() != 0;
            String string = parcel.readString();
            String string2 = parcel.readString();
            ColorsModel colorsModel = (ColorsModel) parcel.readParcelable(State.class.getClassLoader());
            PromoCollectionInfo promoCollectionInfo = (PromoCollectionInfo) parcel.readParcelable(State.class.getClassLoader());
            int i13 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i13);
            for (int i14 = 0; i14 != i13; i14++) {
                arrayList.add(parcel.readParcelable(State.class.getClassLoader()));
            }
            return new State(z13, string, string2, colorsModel, promoCollectionInfo, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: zoijcleaow, reason: merged with bridge method [inline-methods] */
        public final State[] newArray(int i13) {
            return new State[i13];
        }
    }

    public State(boolean z13, String landingPageId, String specialPromoBannerId, ColorsModel colorsModel, PromoCollectionInfo promoCollectionInfo, List promoCollectionItems) {
        zdlpuopuiu.btonecajqb(landingPageId, "landingPageId");
        zdlpuopuiu.btonecajqb(specialPromoBannerId, "specialPromoBannerId");
        zdlpuopuiu.btonecajqb(promoCollectionInfo, "promoCollectionInfo");
        zdlpuopuiu.btonecajqb(promoCollectionItems, "promoCollectionItems");
        this.isLoading = z13;
        this.landingPageId = landingPageId;
        this.specialPromoBannerId = specialPromoBannerId;
        this.colorsModel = colorsModel;
        this.promoCollectionInfo = promoCollectionInfo;
        this.promoCollectionItems = promoCollectionItems;
    }

    public static /* synthetic */ State ppxfxbqfkf(State state, boolean z13, String str, String str2, ColorsModel colorsModel, PromoCollectionInfo promoCollectionInfo, List list, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            z13 = state.isLoading;
        }
        if ((i13 & 2) != 0) {
            str = state.landingPageId;
        }
        String str3 = str;
        if ((i13 & 4) != 0) {
            str2 = state.specialPromoBannerId;
        }
        String str4 = str2;
        if ((i13 & 8) != 0) {
            colorsModel = state.colorsModel;
        }
        ColorsModel colorsModel2 = colorsModel;
        if ((i13 & 16) != 0) {
            promoCollectionInfo = state.promoCollectionInfo;
        }
        PromoCollectionInfo promoCollectionInfo2 = promoCollectionInfo;
        if ((i13 & 32) != 0) {
            list = state.promoCollectionItems;
        }
        return state.zoijcleaow(z13, str3, str4, colorsModel2, promoCollectionInfo2, list);
    }

    /* JADX INFO: renamed from: btonecajqb, reason: from getter */
    public final boolean getIsLoading() {
        return this.isLoading;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    /* JADX INFO: renamed from: dxjokdxxww, reason: from getter */
    public final String getSpecialPromoBannerId() {
        return this.specialPromoBannerId;
    }

    /* JADX INFO: renamed from: eablkybsjg, reason: from getter */
    public final ColorsModel getColorsModel() {
        return this.colorsModel;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof State)) {
            return false;
        }
        State state = (State) other;
        return this.isLoading == state.isLoading && zdlpuopuiu.eablkybsjg(this.landingPageId, state.landingPageId) && zdlpuopuiu.eablkybsjg(this.specialPromoBannerId, state.specialPromoBannerId) && zdlpuopuiu.eablkybsjg(this.colorsModel, state.colorsModel) && zdlpuopuiu.eablkybsjg(this.promoCollectionInfo, state.promoCollectionInfo) && zdlpuopuiu.eablkybsjg(this.promoCollectionItems, state.promoCollectionItems);
    }

    /* JADX INFO: renamed from: gxszxtbevo, reason: from getter */
    public final String getLandingPageId() {
        return this.landingPageId;
    }

    public int hashCode() {
        int iHashCode = ((((Boolean.hashCode(this.isLoading) * 31) + this.landingPageId.hashCode()) * 31) + this.specialPromoBannerId.hashCode()) * 31;
        ColorsModel colorsModel = this.colorsModel;
        return ((((iHashCode + (colorsModel == null ? 0 : colorsModel.hashCode())) * 31) + this.promoCollectionInfo.hashCode()) * 31) + this.promoCollectionItems.hashCode();
    }

    /* JADX INFO: renamed from: lqeggnwhkg, reason: from getter */
    public final PromoCollectionInfo getPromoCollectionInfo() {
        return this.promoCollectionInfo;
    }

    /* JADX INFO: renamed from: nufgyqmvbu, reason: from getter */
    public final List getPromoCollectionItems() {
        return this.promoCollectionItems;
    }

    public String toString() {
        return "State(isLoading=" + this.isLoading + ", landingPageId=" + this.landingPageId + ", specialPromoBannerId=" + this.specialPromoBannerId + ", colorsModel=" + this.colorsModel + ", promoCollectionInfo=" + this.promoCollectionInfo + ", promoCollectionItems=" + this.promoCollectionItems + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        zdlpuopuiu.btonecajqb(dest, "dest");
        dest.writeInt(this.isLoading ? 1 : 0);
        dest.writeString(this.landingPageId);
        dest.writeString(this.specialPromoBannerId);
        dest.writeParcelable(this.colorsModel, flags);
        dest.writeParcelable(this.promoCollectionInfo, flags);
        List list = this.promoCollectionItems;
        dest.writeInt(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            dest.writeParcelable((Parcelable) it.next(), flags);
        }
    }

    public final State zoijcleaow(boolean isLoading, String landingPageId, String specialPromoBannerId, ColorsModel colorsModel, PromoCollectionInfo promoCollectionInfo, List promoCollectionItems) {
        zdlpuopuiu.btonecajqb(landingPageId, "landingPageId");
        zdlpuopuiu.btonecajqb(specialPromoBannerId, "specialPromoBannerId");
        zdlpuopuiu.btonecajqb(promoCollectionInfo, "promoCollectionInfo");
        zdlpuopuiu.btonecajqb(promoCollectionItems, "promoCollectionItems");
        return new State(isLoading, landingPageId, specialPromoBannerId, colorsModel, promoCollectionInfo, promoCollectionItems);
    }

    public /* synthetic */ State(boolean z13, String str, String str2, ColorsModel colorsModel, PromoCollectionInfo promoCollectionInfo, List list, int i13, gtknphoqwx gtknphoqwxVar) {
        this((i13 & 1) != 0 ? false : z13, str, str2, colorsModel, (i13 & 16) != 0 ? kw.iobyxmoadg.iobyxmoadg() : promoCollectionInfo, (i13 & 32) != 0 ? jyumaefscl.wflxmlrfwp() : list);
    }
}
