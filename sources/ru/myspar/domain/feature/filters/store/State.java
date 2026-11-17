package ru.myspar.domain.feature.filters.store;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.actions.SearchIntents;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import hg.jyumaefscl;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.gtknphoqwx;
import kotlin.jvm.internal.zdlpuopuiu;
import ru.myspar.core.domain.models.ColorsModel;

/* JADX INFO: renamed from: ru.myspar.domain.feature.filters.store.FiltersStore$State, reason: from toString */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000N\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0002\b\u001e\b\u0087\b\u0018\u00002\u00020\u0001Bk\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\b\b\u0002\u0010\u000e\u001a\u00020\r\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\u001f\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\rH\u0007¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0019\u001a\u00020\rH\u0007¢\u0006\u0004\b\u0019\u0010\u001aJ\u0080\u0001\u0010\u001c\u001a\u00020\u001b2\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00022\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\b\b\u0002\u0010\u000e\u001a\u00020\r2\b\b\u0002\u0010\u0010\u001a\u00020\u000fHÇ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0002H×\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\rH×\u0001¢\u0006\u0004\b \u0010\u001aJ\u001a\u0010#\u001a\u00020\u000f2\b\u0010\"\u001a\u0004\u0018\u00010!H×\u0003¢\u0006\u0004\b#\u0010$R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010\u001fR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b(\u0010&\u001a\u0004\b)\u0010\u001fR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b*\u0010&\u001a\u0004\b+\u0010\u001fR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b,\u0010&\u001a\u0004\b-\u0010\u001fR\u001d\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0006¢\u0006\f\n\u0004\b.\u0010/\u001a\u0004\b0\u00101R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b2\u00103\u001a\u0004\b4\u00105R\u001d\u0010\f\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0006¢\u0006\f\n\u0004\b6\u0010/\u001a\u0004\b7\u00101R\u0017\u0010\u000e\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b8\u00109\u001a\u0004\b:\u0010\u001aR\u0017\u0010\u0010\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\b;\u0010<\u001a\u0004\b=\u0010>¨\u0006?"}, d2 = {"ru/myspar/domain/feature/filters/store/FiltersStore$State", "Landroid/os/Parcelable;", "", SearchIntents.EXTRA_QUERY, "selectionId", "sectionId", "brandId", "", "Lru/myspar/core/domain/models/product/FilterSection;", "filterSections", "Lru/myspar/core/domain/models/ColorsModel;", "colorsModel", "filterValues", "", "amountProducts", "", "isLoading", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lru/myspar/core/domain/models/ColorsModel;Ljava/util/List;IZ)V", "Landroid/os/Parcel;", "dest", "flags", "Lgg/wwaezpbzkn;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "Lru/myspar/domain/feature/filters/store/FiltersStore$State;", "zoijcleaow", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lru/myspar/core/domain/models/ColorsModel;Ljava/util/List;IZ)Lru/myspar/domain/feature/filters/store/FiltersStore$State;", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "equals", "(Ljava/lang/Object;)Z", "zdlpuopuiu", "Ljava/lang/String;", "btonecajqb", "yggfygwlhe", "wflxmlrfwp", "jyumaefscl", "gtknphoqwx", "iwizpuwonk", "gxszxtbevo", "cqumvgiudr", "Ljava/util/List;", "nufgyqmvbu", "()Ljava/util/List;", "esjtqupxsv", "Lru/myspar/core/domain/models/ColorsModel;", "lqeggnwhkg", "()Lru/myspar/core/domain/models/ColorsModel;", "lereixgezr", "dxjokdxxww", "pmvmpeiblj", "I", "eablkybsjg", "zynmafqrjb", "Z", "oxmwwwfdhm", "()Z", "legacy_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class State implements Parcelable {
    public static final Parcelable.Creator<State> CREATOR = new iobyxmoadg();

    /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name and from kotlin metadata and from toString */
    private final List filterSections;

    /* JADX INFO: renamed from: esjtqupxsv, reason: collision with root package name and from kotlin metadata and from toString */
    private final ColorsModel colorsModel;

    /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name and from kotlin metadata and from toString */
    private final String brandId;

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name and from kotlin metadata and from toString */
    private final String sectionId;

    /* JADX INFO: renamed from: lereixgezr, reason: collision with root package name and from kotlin metadata and from toString */
    private final List filterValues;

    /* JADX INFO: renamed from: pmvmpeiblj, reason: collision with root package name and from kotlin metadata and from toString */
    private final int amountProducts;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name and from kotlin metadata and from toString */
    private final String selectionId;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name and from kotlin metadata and from toString */
    private final String query;

    /* JADX INFO: renamed from: zynmafqrjb, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean isLoading;

    /* JADX INFO: renamed from: ru.myspar.domain.feature.filters.store.FiltersStore$State$iobyxmoadg */
    public static final class iobyxmoadg implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public final State createFromParcel(Parcel parcel) {
            zdlpuopuiu.btonecajqb(parcel, "parcel");
            String string = parcel.readString();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            String string4 = parcel.readString();
            int i13 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i13);
            for (int i14 = 0; i14 != i13; i14++) {
                arrayList.add(parcel.readParcelable(State.class.getClassLoader()));
            }
            ColorsModel colorsModel = (ColorsModel) parcel.readParcelable(State.class.getClassLoader());
            int i15 = parcel.readInt();
            ArrayList arrayList2 = new ArrayList(i15);
            for (int i16 = 0; i16 != i15; i16++) {
                arrayList2.add(parcel.readParcelable(State.class.getClassLoader()));
            }
            return new State(string, string2, string3, string4, arrayList, colorsModel, arrayList2, parcel.readInt(), parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: zoijcleaow, reason: merged with bridge method [inline-methods] */
        public final State[] newArray(int i13) {
            return new State[i13];
        }
    }

    public State(String str, String str2, String str3, String str4, List filterSections, ColorsModel colorsModel, List filterValues, int i13, boolean z13) {
        zdlpuopuiu.btonecajqb(filterSections, "filterSections");
        zdlpuopuiu.btonecajqb(filterValues, "filterValues");
        this.query = str;
        this.selectionId = str2;
        this.sectionId = str3;
        this.brandId = str4;
        this.filterSections = filterSections;
        this.colorsModel = colorsModel;
        this.filterValues = filterValues;
        this.amountProducts = i13;
        this.isLoading = z13;
    }

    /* JADX INFO: renamed from: btonecajqb, reason: from getter */
    public final String getQuery() {
        return this.query;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    /* JADX INFO: renamed from: dxjokdxxww, reason: from getter */
    public final List getFilterValues() {
        return this.filterValues;
    }

    /* JADX INFO: renamed from: eablkybsjg, reason: from getter */
    public final int getAmountProducts() {
        return this.amountProducts;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof State)) {
            return false;
        }
        State state = (State) other;
        return zdlpuopuiu.eablkybsjg(this.query, state.query) && zdlpuopuiu.eablkybsjg(this.selectionId, state.selectionId) && zdlpuopuiu.eablkybsjg(this.sectionId, state.sectionId) && zdlpuopuiu.eablkybsjg(this.brandId, state.brandId) && zdlpuopuiu.eablkybsjg(this.filterSections, state.filterSections) && zdlpuopuiu.eablkybsjg(this.colorsModel, state.colorsModel) && zdlpuopuiu.eablkybsjg(this.filterValues, state.filterValues) && this.amountProducts == state.amountProducts && this.isLoading == state.isLoading;
    }

    /* JADX INFO: renamed from: gtknphoqwx, reason: from getter */
    public final String getSectionId() {
        return this.sectionId;
    }

    /* JADX INFO: renamed from: gxszxtbevo, reason: from getter */
    public final String getBrandId() {
        return this.brandId;
    }

    public int hashCode() {
        String str = this.query;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.selectionId;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.sectionId;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.brandId;
        int iHashCode4 = (((iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31) + this.filterSections.hashCode()) * 31;
        ColorsModel colorsModel = this.colorsModel;
        return ((((((iHashCode4 + (colorsModel != null ? colorsModel.hashCode() : 0)) * 31) + this.filterValues.hashCode()) * 31) + Integer.hashCode(this.amountProducts)) * 31) + Boolean.hashCode(this.isLoading);
    }

    /* JADX INFO: renamed from: lqeggnwhkg, reason: from getter */
    public final ColorsModel getColorsModel() {
        return this.colorsModel;
    }

    /* JADX INFO: renamed from: nufgyqmvbu, reason: from getter */
    public final List getFilterSections() {
        return this.filterSections;
    }

    /* JADX INFO: renamed from: oxmwwwfdhm, reason: from getter */
    public final boolean getIsLoading() {
        return this.isLoading;
    }

    public String toString() {
        return "State(query=" + this.query + ", selectionId=" + this.selectionId + ", sectionId=" + this.sectionId + ", brandId=" + this.brandId + ", filterSections=" + this.filterSections + ", colorsModel=" + this.colorsModel + ", filterValues=" + this.filterValues + ", amountProducts=" + this.amountProducts + ", isLoading=" + this.isLoading + ")";
    }

    /* JADX INFO: renamed from: wflxmlrfwp, reason: from getter */
    public final String getSelectionId() {
        return this.selectionId;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        zdlpuopuiu.btonecajqb(dest, "dest");
        dest.writeString(this.query);
        dest.writeString(this.selectionId);
        dest.writeString(this.sectionId);
        dest.writeString(this.brandId);
        List list = this.filterSections;
        dest.writeInt(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            dest.writeParcelable((Parcelable) it.next(), flags);
        }
        dest.writeParcelable(this.colorsModel, flags);
        List list2 = this.filterValues;
        dest.writeInt(list2.size());
        Iterator it2 = list2.iterator();
        while (it2.hasNext()) {
            dest.writeParcelable((Parcelable) it2.next(), flags);
        }
        dest.writeInt(this.amountProducts);
        dest.writeInt(this.isLoading ? 1 : 0);
    }

    public final State zoijcleaow(String query, String selectionId, String sectionId, String brandId, List filterSections, ColorsModel colorsModel, List filterValues, int amountProducts, boolean isLoading) {
        zdlpuopuiu.btonecajqb(filterSections, "filterSections");
        zdlpuopuiu.btonecajqb(filterValues, "filterValues");
        return new State(query, selectionId, sectionId, brandId, filterSections, colorsModel, filterValues, amountProducts, isLoading);
    }

    public /* synthetic */ State(String str, String str2, String str3, String str4, List list, ColorsModel colorsModel, List list2, int i13, boolean z13, int i14, gtknphoqwx gtknphoqwxVar) {
        this(str, str2, str3, str4, list, colorsModel, (i14 & 64) != 0 ? jyumaefscl.wflxmlrfwp() : list2, (i14 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? 0 : i13, (i14 & UserVerificationMethods.USER_VERIFY_HANDPRINT) != 0 ? false : z13);
    }
}
