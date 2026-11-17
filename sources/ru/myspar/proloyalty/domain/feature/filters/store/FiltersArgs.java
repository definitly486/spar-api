package ru.myspar.proloyalty.domain.feature.filters.store;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.actions.SearchIntents;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.gtknphoqwx;
import kotlin.jvm.internal.zdlpuopuiu;
import ru.myspar.proloyalty.core.domain.models.ColorsModel;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0014\b\u0087\b\u0018\u00002\u00020\u0001BU\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\f\u0010\rJ\u001f\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0007¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\u0010H\u0007¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0002H×\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0010H×\u0001¢\u0006\u0004\b\u0019\u0010\u0016J\u001a\u0010\u001d\u001a\u00020\u001c2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001aH×\u0003¢\u0006\u0004\b\u001d\u0010\u001eR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\u0018R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\"\u0010 \u001a\u0004\b#\u0010\u0018R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b$\u0010 \u001a\u0004\b%\u0010\u0018R\u001f\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)R\u0019\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b*\u0010 \u001a\u0004\b+\u0010\u0018R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b,\u0010-\u001a\u0004\b.\u0010/¨\u00060"}, d2 = {"Lru/myspar/proloyalty/domain/feature/filters/store/FiltersArgs;", "Landroid/os/Parcelable;", "", "sectionId", "brandId", SearchIntents.EXTRA_QUERY, "", "Lru/myspar/proloyalty/core/domain/models/product/FilterSection;", "filters", "selectionId", "Lru/myspar/proloyalty/core/domain/models/ColorsModel;", "colorsModel", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Lru/myspar/proloyalty/core/domain/models/ColorsModel;)V", "Landroid/os/Parcel;", "dest", "", "flags", "Lgg/wwaezpbzkn;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "zdlpuopuiu", "Ljava/lang/String;", "lqeggnwhkg", "yggfygwlhe", "zoijcleaow", "jyumaefscl", "gxszxtbevo", "iwizpuwonk", "Ljava/util/List;", "eablkybsjg", "()Ljava/util/List;", "cqumvgiudr", "nufgyqmvbu", "esjtqupxsv", "Lru/myspar/proloyalty/core/domain/models/ColorsModel;", "ppxfxbqfkf", "()Lru/myspar/proloyalty/core/domain/models/ColorsModel;", "legacy_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class FiltersArgs implements Parcelable {
    public static final Parcelable.Creator<FiltersArgs> CREATOR = new iobyxmoadg();

    /* JADX INFO: renamed from: lereixgezr, reason: collision with root package name */
    public static final int f95501lereixgezr = 8;

    /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name and from kotlin metadata and from toString */
    private final String selectionId;

    /* JADX INFO: renamed from: esjtqupxsv, reason: collision with root package name and from kotlin metadata and from toString */
    private final ColorsModel colorsModel;

    /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name and from kotlin metadata and from toString */
    private final List filters;

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name and from kotlin metadata and from toString */
    private final String query;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name and from kotlin metadata and from toString */
    private final String brandId;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name and from kotlin metadata and from toString */
    private final String sectionId;

    public static final class iobyxmoadg implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public final FiltersArgs createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            zdlpuopuiu.btonecajqb(parcel, "parcel");
            String string = parcel.readString();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i13 = parcel.readInt();
                arrayList = new ArrayList(i13);
                for (int i14 = 0; i14 != i13; i14++) {
                    arrayList.add(parcel.readParcelable(FiltersArgs.class.getClassLoader()));
                }
            }
            return new FiltersArgs(string, string2, string3, arrayList, parcel.readString(), (ColorsModel) parcel.readParcelable(FiltersArgs.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: zoijcleaow, reason: merged with bridge method [inline-methods] */
        public final FiltersArgs[] newArray(int i13) {
            return new FiltersArgs[i13];
        }
    }

    public FiltersArgs(String str, String str2, String str3, List list, String str4, ColorsModel colorsModel) {
        this.sectionId = str;
        this.brandId = str2;
        this.query = str3;
        this.filters = list;
        this.selectionId = str4;
        this.colorsModel = colorsModel;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    /* JADX INFO: renamed from: eablkybsjg, reason: from getter */
    public final List getFilters() {
        return this.filters;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FiltersArgs)) {
            return false;
        }
        FiltersArgs filtersArgs = (FiltersArgs) other;
        return zdlpuopuiu.eablkybsjg(this.sectionId, filtersArgs.sectionId) && zdlpuopuiu.eablkybsjg(this.brandId, filtersArgs.brandId) && zdlpuopuiu.eablkybsjg(this.query, filtersArgs.query) && zdlpuopuiu.eablkybsjg(this.filters, filtersArgs.filters) && zdlpuopuiu.eablkybsjg(this.selectionId, filtersArgs.selectionId) && zdlpuopuiu.eablkybsjg(this.colorsModel, filtersArgs.colorsModel);
    }

    /* JADX INFO: renamed from: gxszxtbevo, reason: from getter */
    public final String getQuery() {
        return this.query;
    }

    public int hashCode() {
        String str = this.sectionId;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.brandId;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.query;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        List list = this.filters;
        int iHashCode4 = (iHashCode3 + (list == null ? 0 : list.hashCode())) * 31;
        String str4 = this.selectionId;
        int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        ColorsModel colorsModel = this.colorsModel;
        return iHashCode5 + (colorsModel != null ? colorsModel.hashCode() : 0);
    }

    /* JADX INFO: renamed from: lqeggnwhkg, reason: from getter */
    public final String getSectionId() {
        return this.sectionId;
    }

    /* JADX INFO: renamed from: nufgyqmvbu, reason: from getter */
    public final String getSelectionId() {
        return this.selectionId;
    }

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: from getter */
    public final ColorsModel getColorsModel() {
        return this.colorsModel;
    }

    public String toString() {
        return "FiltersArgs(sectionId=" + this.sectionId + ", brandId=" + this.brandId + ", query=" + this.query + ", filters=" + this.filters + ", selectionId=" + this.selectionId + ", colorsModel=" + this.colorsModel + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        zdlpuopuiu.btonecajqb(dest, "dest");
        dest.writeString(this.sectionId);
        dest.writeString(this.brandId);
        dest.writeString(this.query);
        List list = this.filters;
        if (list == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeInt(list.size());
            Iterator it = list.iterator();
            while (it.hasNext()) {
                dest.writeParcelable((Parcelable) it.next(), flags);
            }
        }
        dest.writeString(this.selectionId);
        dest.writeParcelable(this.colorsModel, flags);
    }

    /* JADX INFO: renamed from: zoijcleaow, reason: from getter */
    public final String getBrandId() {
        return this.brandId;
    }

    public /* synthetic */ FiltersArgs(String str, String str2, String str3, List list, String str4, ColorsModel colorsModel, int i13, gtknphoqwx gtknphoqwxVar) {
        this((i13 & 1) != 0 ? null : str, (i13 & 2) != 0 ? null : str2, (i13 & 4) != 0 ? null : str3, (i13 & 8) != 0 ? null : list, (i13 & 16) != 0 ? null : str4, (i13 & 32) != 0 ? null : colorsModel);
    }
}
