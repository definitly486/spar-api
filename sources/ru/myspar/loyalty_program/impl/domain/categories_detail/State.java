package ru.myspar.loyalty_program.impl.domain.categories_detail;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import hg.jyumaefscl;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.gtknphoqwx;
import kotlin.jvm.internal.zdlpuopuiu;
import modern.payments.ecomAndroid.util.externalMetrics.ExternalMetricsManagerImpl;

/* JADX INFO: renamed from: ru.myspar.loyalty_program.impl.domain.categories_detail.CategoriesDetailStore$State, reason: from toString */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000J\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0002\b\u001d\b\u0087\b\u0018\u00002\u00020\u0001B{\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\n\u001a\u00020\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0002\u0012\u000e\b\u0002\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f\u0012\u000e\b\u0002\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00050\f\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u001f\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\bH\u0007¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0019\u001a\u00020\bH\u0007¢\u0006\u0004\b\u0019\u0010\u001aJ\u0084\u0001\u0010\u001c\u001a\u00020\u001b2\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\u00022\u000e\b\u0002\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f2\u000e\b\u0002\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00050\f2\b\b\u0002\u0010\u0010\u001a\u00020\u0002HÇ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0005H×\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\bH×\u0001¢\u0006\u0004\b \u0010\u001aJ\u001a\u0010#\u001a\u00020\u00022\b\u0010\"\u001a\u0004\u0018\u00010!H×\u0003¢\u0006\u0004\b#\u0010$R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b)\u0010&\u001a\u0004\b*\u0010(R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b+\u0010,\u001a\u0004\b-\u0010\u001fR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b.\u0010,\u001a\u0004\b/\u0010\u001fR\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b0\u00101\u001a\u0004\b2\u0010\u001aR\u0017\u0010\n\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b3\u00101\u001a\u0004\b4\u0010\u001aR\u0017\u0010\u000b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b5\u0010&\u001a\u0004\b6\u0010(R\u001d\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f8\u0006¢\u0006\f\n\u0004\b7\u00108\u001a\u0004\b9\u0010:R\u001d\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00050\f8\u0006¢\u0006\f\n\u0004\b;\u00108\u001a\u0004\b<\u0010:R\u0017\u0010\u0010\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b=\u0010&\u001a\u0004\b)\u0010(¨\u0006>"}, d2 = {"ru/myspar/loyalty_program/impl/domain/categories_detail/CategoriesDetailStore$State", "Landroid/os/Parcelable;", "", "isInitialized", "isLoading", "", ExternalMetricsManagerImpl.DATE, "text", "", "quantityForChoose", "quantityChosen", "isSelectedAvailable", "", "Lru/myspar/components/loyalty_program/api/models/LoyaltyCategory;", "categories", "selectedCategoriesIds", "isUserConfirmCategories", "<init>", "(ZZLjava/lang/String;Ljava/lang/String;IIZLjava/util/List;Ljava/util/List;Z)V", "Landroid/os/Parcel;", "dest", "flags", "Lgg/wwaezpbzkn;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "Lru/myspar/loyalty_program/impl/domain/categories_detail/CategoriesDetailStore$State;", "zoijcleaow", "(ZZLjava/lang/String;Ljava/lang/String;IIZLjava/util/List;Ljava/util/List;Z)Lru/myspar/loyalty_program/impl/domain/categories_detail/CategoriesDetailStore$State;", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "equals", "(Ljava/lang/Object;)Z", "zdlpuopuiu", "Z", "gtknphoqwx", "()Z", "yggfygwlhe", "wflxmlrfwp", "jyumaefscl", "Ljava/lang/String;", "gxszxtbevo", "iwizpuwonk", "btonecajqb", "cqumvgiudr", "I", "nufgyqmvbu", "esjtqupxsv", "lqeggnwhkg", "lereixgezr", "oxmwwwfdhm", "pmvmpeiblj", "Ljava/util/List;", "eablkybsjg", "()Ljava/util/List;", "zynmafqrjb", "dxjokdxxww", "istkbnxepw", "impl_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class State implements Parcelable {
    public static final Parcelable.Creator<State> CREATOR = new iobyxmoadg();

    /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name and from kotlin metadata and from toString */
    private final int quantityForChoose;

    /* JADX INFO: renamed from: esjtqupxsv, reason: collision with root package name and from kotlin metadata and from toString */
    private final int quantityChosen;

    /* JADX INFO: renamed from: istkbnxepw, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean isUserConfirmCategories;

    /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name and from kotlin metadata and from toString */
    private final String text;

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name and from kotlin metadata and from toString */
    private final String date;

    /* JADX INFO: renamed from: lereixgezr, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean isSelectedAvailable;

    /* JADX INFO: renamed from: pmvmpeiblj, reason: collision with root package name and from kotlin metadata and from toString */
    private final List categories;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean isLoading;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean isInitialized;

    /* JADX INFO: renamed from: zynmafqrjb, reason: collision with root package name and from kotlin metadata and from toString */
    private final List selectedCategoriesIds;

    /* JADX INFO: renamed from: ru.myspar.loyalty_program.impl.domain.categories_detail.CategoriesDetailStore$State$iobyxmoadg */
    public static final class iobyxmoadg implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public final State createFromParcel(Parcel parcel) {
            zdlpuopuiu.btonecajqb(parcel, "parcel");
            boolean z13 = parcel.readInt() != 0;
            boolean z14 = parcel.readInt() != 0;
            String string = parcel.readString();
            String string2 = parcel.readString();
            int i13 = parcel.readInt();
            int i14 = parcel.readInt();
            boolean z15 = parcel.readInt() != 0;
            int i15 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i15);
            for (int i16 = 0; i16 != i15; i16++) {
                arrayList.add(parcel.readParcelable(State.class.getClassLoader()));
            }
            return new State(z13, z14, string, string2, i13, i14, z15, arrayList, parcel.createStringArrayList(), parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: zoijcleaow, reason: merged with bridge method [inline-methods] */
        public final State[] newArray(int i13) {
            return new State[i13];
        }
    }

    public State(boolean z13, boolean z14, String str, String str2, int i13, int i14, boolean z15, List categories, List selectedCategoriesIds, boolean z16) {
        zdlpuopuiu.btonecajqb(categories, "categories");
        zdlpuopuiu.btonecajqb(selectedCategoriesIds, "selectedCategoriesIds");
        this.isInitialized = z13;
        this.isLoading = z14;
        this.date = str;
        this.text = str2;
        this.quantityForChoose = i13;
        this.quantityChosen = i14;
        this.isSelectedAvailable = z15;
        this.categories = categories;
        this.selectedCategoriesIds = selectedCategoriesIds;
        this.isUserConfirmCategories = z16;
    }

    /* JADX INFO: renamed from: btonecajqb, reason: from getter */
    public final String getText() {
        return this.text;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    /* JADX INFO: renamed from: dxjokdxxww, reason: from getter */
    public final List getSelectedCategoriesIds() {
        return this.selectedCategoriesIds;
    }

    /* JADX INFO: renamed from: eablkybsjg, reason: from getter */
    public final List getCategories() {
        return this.categories;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof State)) {
            return false;
        }
        State state = (State) other;
        return this.isInitialized == state.isInitialized && this.isLoading == state.isLoading && zdlpuopuiu.eablkybsjg(this.date, state.date) && zdlpuopuiu.eablkybsjg(this.text, state.text) && this.quantityForChoose == state.quantityForChoose && this.quantityChosen == state.quantityChosen && this.isSelectedAvailable == state.isSelectedAvailable && zdlpuopuiu.eablkybsjg(this.categories, state.categories) && zdlpuopuiu.eablkybsjg(this.selectedCategoriesIds, state.selectedCategoriesIds) && this.isUserConfirmCategories == state.isUserConfirmCategories;
    }

    /* JADX INFO: renamed from: gtknphoqwx, reason: from getter */
    public final boolean getIsInitialized() {
        return this.isInitialized;
    }

    /* JADX INFO: renamed from: gxszxtbevo, reason: from getter */
    public final String getDate() {
        return this.date;
    }

    public int hashCode() {
        int iHashCode = ((Boolean.hashCode(this.isInitialized) * 31) + Boolean.hashCode(this.isLoading)) * 31;
        String str = this.date;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.text;
        return ((((((((((((iHashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31) + Integer.hashCode(this.quantityForChoose)) * 31) + Integer.hashCode(this.quantityChosen)) * 31) + Boolean.hashCode(this.isSelectedAvailable)) * 31) + this.categories.hashCode()) * 31) + this.selectedCategoriesIds.hashCode()) * 31) + Boolean.hashCode(this.isUserConfirmCategories);
    }

    /* JADX INFO: renamed from: lqeggnwhkg, reason: from getter */
    public final int getQuantityChosen() {
        return this.quantityChosen;
    }

    /* JADX INFO: renamed from: nufgyqmvbu, reason: from getter */
    public final int getQuantityForChoose() {
        return this.quantityForChoose;
    }

    /* JADX INFO: renamed from: oxmwwwfdhm, reason: from getter */
    public final boolean getIsSelectedAvailable() {
        return this.isSelectedAvailable;
    }

    public String toString() {
        return "State(isInitialized=" + this.isInitialized + ", isLoading=" + this.isLoading + ", date=" + this.date + ", text=" + this.text + ", quantityForChoose=" + this.quantityForChoose + ", quantityChosen=" + this.quantityChosen + ", isSelectedAvailable=" + this.isSelectedAvailable + ", categories=" + this.categories + ", selectedCategoriesIds=" + this.selectedCategoriesIds + ", isUserConfirmCategories=" + this.isUserConfirmCategories + ")";
    }

    /* JADX INFO: renamed from: wflxmlrfwp, reason: from getter */
    public final boolean getIsLoading() {
        return this.isLoading;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        zdlpuopuiu.btonecajqb(dest, "dest");
        dest.writeInt(this.isInitialized ? 1 : 0);
        dest.writeInt(this.isLoading ? 1 : 0);
        dest.writeString(this.date);
        dest.writeString(this.text);
        dest.writeInt(this.quantityForChoose);
        dest.writeInt(this.quantityChosen);
        dest.writeInt(this.isSelectedAvailable ? 1 : 0);
        List list = this.categories;
        dest.writeInt(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            dest.writeParcelable((Parcelable) it.next(), flags);
        }
        dest.writeStringList(this.selectedCategoriesIds);
        dest.writeInt(this.isUserConfirmCategories ? 1 : 0);
    }

    /* JADX INFO: renamed from: yggfygwlhe, reason: from getter */
    public final boolean getIsUserConfirmCategories() {
        return this.isUserConfirmCategories;
    }

    public final State zoijcleaow(boolean isInitialized, boolean isLoading, String date, String text, int quantityForChoose, int quantityChosen, boolean isSelectedAvailable, List categories, List selectedCategoriesIds, boolean isUserConfirmCategories) {
        zdlpuopuiu.btonecajqb(categories, "categories");
        zdlpuopuiu.btonecajqb(selectedCategoriesIds, "selectedCategoriesIds");
        return new State(isInitialized, isLoading, date, text, quantityForChoose, quantityChosen, isSelectedAvailable, categories, selectedCategoriesIds, isUserConfirmCategories);
    }

    public /* synthetic */ State(boolean z13, boolean z14, String str, String str2, int i13, int i14, boolean z15, List list, List list2, boolean z16, int i15, gtknphoqwx gtknphoqwxVar) {
        this((i15 & 1) != 0 ? false : z13, (i15 & 2) != 0 ? false : z14, (i15 & 4) != 0 ? null : str, (i15 & 8) == 0 ? str2 : null, (i15 & 16) != 0 ? 0 : i13, (i15 & 32) != 0 ? 0 : i14, (i15 & 64) != 0 ? false : z15, (i15 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? jyumaefscl.wflxmlrfwp() : list, (i15 & UserVerificationMethods.USER_VERIFY_HANDPRINT) != 0 ? jyumaefscl.wflxmlrfwp() : list2, (i15 & UserVerificationMethods.USER_VERIFY_NONE) == 0 ? z16 : false);
    }
}
