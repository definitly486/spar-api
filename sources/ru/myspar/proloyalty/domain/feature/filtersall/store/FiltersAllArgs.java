package ru.myspar.proloyalty.domain.feature.filtersall.store;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.zdlpuopuiu;
import ru.myspar.proloyalty.core.domain.models.ColorsModel;
import ru.myspar.proloyalty.core.domain.models.product.FilterSection;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001f\u0010\r\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0007¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\nH\u0007¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011H×\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\nH×\u0001¢\u0006\u0004\b\u0014\u0010\u0010J\u001a\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015H×\u0003¢\u0006\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!¨\u0006\""}, d2 = {"Lru/myspar/proloyalty/domain/feature/filtersall/store/FiltersAllArgs;", "Landroid/os/Parcelable;", "Lru/myspar/proloyalty/core/domain/models/product/FilterSection;", "filterSection", "Lru/myspar/proloyalty/core/domain/models/ColorsModel;", "colorsModel", "<init>", "(Lru/myspar/proloyalty/core/domain/models/product/FilterSection;Lru/myspar/proloyalty/core/domain/models/ColorsModel;)V", "Landroid/os/Parcel;", "dest", "", "flags", "Lgg/wwaezpbzkn;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "zdlpuopuiu", "Lru/myspar/proloyalty/core/domain/models/product/FilterSection;", "ppxfxbqfkf", "()Lru/myspar/proloyalty/core/domain/models/product/FilterSection;", "yggfygwlhe", "Lru/myspar/proloyalty/core/domain/models/ColorsModel;", "zoijcleaow", "()Lru/myspar/proloyalty/core/domain/models/ColorsModel;", "legacy_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class FiltersAllArgs implements Parcelable {
    public static final Parcelable.Creator<FiltersAllArgs> CREATOR = new iobyxmoadg();

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name and from kotlin metadata and from toString */
    private final ColorsModel colorsModel;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name and from kotlin metadata and from toString */
    private final FilterSection filterSection;

    public static final class iobyxmoadg implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public final FiltersAllArgs createFromParcel(Parcel parcel) {
            zdlpuopuiu.btonecajqb(parcel, "parcel");
            return new FiltersAllArgs((FilterSection) parcel.readParcelable(FiltersAllArgs.class.getClassLoader()), (ColorsModel) parcel.readParcelable(FiltersAllArgs.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: zoijcleaow, reason: merged with bridge method [inline-methods] */
        public final FiltersAllArgs[] newArray(int i13) {
            return new FiltersAllArgs[i13];
        }
    }

    public FiltersAllArgs(FilterSection filterSection, ColorsModel colorsModel) {
        zdlpuopuiu.btonecajqb(filterSection, "filterSection");
        this.filterSection = filterSection;
        this.colorsModel = colorsModel;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FiltersAllArgs)) {
            return false;
        }
        FiltersAllArgs filtersAllArgs = (FiltersAllArgs) other;
        return zdlpuopuiu.eablkybsjg(this.filterSection, filtersAllArgs.filterSection) && zdlpuopuiu.eablkybsjg(this.colorsModel, filtersAllArgs.colorsModel);
    }

    public int hashCode() {
        int iHashCode = this.filterSection.hashCode() * 31;
        ColorsModel colorsModel = this.colorsModel;
        return iHashCode + (colorsModel == null ? 0 : colorsModel.hashCode());
    }

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: from getter */
    public final FilterSection getFilterSection() {
        return this.filterSection;
    }

    public String toString() {
        return "FiltersAllArgs(filterSection=" + this.filterSection + ", colorsModel=" + this.colorsModel + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        zdlpuopuiu.btonecajqb(dest, "dest");
        dest.writeParcelable(this.filterSection, flags);
        dest.writeParcelable(this.colorsModel, flags);
    }

    /* JADX INFO: renamed from: zoijcleaow, reason: from getter */
    public final ColorsModel getColorsModel() {
        return this.colorsModel;
    }
}
