package ru.myspar.proloyalty.core.domain.models.catalog;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001d\u0010\r\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000eJ\r\u0010\u000f\u001a\u00020\n¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0010J\u001a\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u001d\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!¨\u0006\""}, d2 = {"Lru/myspar/proloyalty/core/domain/models/catalog/CatalogWithSubCatalogs;", "Landroid/os/Parcelable;", "Lru/myspar/proloyalty/core/domain/models/catalog/CatalogSection;", "rootCatalogSection", "", "childCatalogSections", "<init>", "(Lru/myspar/proloyalty/core/domain/models/catalog/CatalogSection;Ljava/util/List;)V", "Landroid/os/Parcel;", "dest", "", "flags", "Lgg/wwaezpbzkn;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "zdlpuopuiu", "Lru/myspar/proloyalty/core/domain/models/catalog/CatalogSection;", "ppxfxbqfkf", "()Lru/myspar/proloyalty/core/domain/models/catalog/CatalogSection;", "yggfygwlhe", "Ljava/util/List;", "zoijcleaow", "()Ljava/util/List;", "domain_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class CatalogWithSubCatalogs implements Parcelable {
    public static final Parcelable.Creator<CatalogWithSubCatalogs> CREATOR = new iobyxmoadg();

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name and from kotlin metadata and from toString */
    private final List childCatalogSections;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name and from kotlin metadata and from toString */
    private final CatalogSection rootCatalogSection;

    public static final class iobyxmoadg implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public final CatalogWithSubCatalogs createFromParcel(Parcel parcel) {
            zdlpuopuiu.btonecajqb(parcel, "parcel");
            CatalogSection catalogSectionCreateFromParcel = parcel.readInt() == 0 ? null : CatalogSection.CREATOR.createFromParcel(parcel);
            int i13 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i13);
            for (int i14 = 0; i14 != i13; i14++) {
                arrayList.add(CatalogSection.CREATOR.createFromParcel(parcel));
            }
            return new CatalogWithSubCatalogs(catalogSectionCreateFromParcel, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: zoijcleaow, reason: merged with bridge method [inline-methods] */
        public final CatalogWithSubCatalogs[] newArray(int i13) {
            return new CatalogWithSubCatalogs[i13];
        }
    }

    public CatalogWithSubCatalogs(CatalogSection catalogSection, List childCatalogSections) {
        zdlpuopuiu.btonecajqb(childCatalogSections, "childCatalogSections");
        this.rootCatalogSection = catalogSection;
        this.childCatalogSections = childCatalogSections;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CatalogWithSubCatalogs)) {
            return false;
        }
        CatalogWithSubCatalogs catalogWithSubCatalogs = (CatalogWithSubCatalogs) other;
        return zdlpuopuiu.eablkybsjg(this.rootCatalogSection, catalogWithSubCatalogs.rootCatalogSection) && zdlpuopuiu.eablkybsjg(this.childCatalogSections, catalogWithSubCatalogs.childCatalogSections);
    }

    public int hashCode() {
        CatalogSection catalogSection = this.rootCatalogSection;
        return ((catalogSection == null ? 0 : catalogSection.hashCode()) * 31) + this.childCatalogSections.hashCode();
    }

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: from getter */
    public final CatalogSection getRootCatalogSection() {
        return this.rootCatalogSection;
    }

    public String toString() {
        return "CatalogWithSubCatalogs(rootCatalogSection=" + this.rootCatalogSection + ", childCatalogSections=" + this.childCatalogSections + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        zdlpuopuiu.btonecajqb(dest, "dest");
        CatalogSection catalogSection = this.rootCatalogSection;
        if (catalogSection == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            catalogSection.writeToParcel(dest, flags);
        }
        List list = this.childCatalogSections;
        dest.writeInt(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((CatalogSection) it.next()).writeToParcel(dest, flags);
        }
    }

    /* JADX INFO: renamed from: zoijcleaow, reason: from getter */
    public final List getChildCatalogSections() {
        return this.childCatalogSections;
    }
}
