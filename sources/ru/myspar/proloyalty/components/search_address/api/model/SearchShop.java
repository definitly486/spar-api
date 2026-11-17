package ru.myspar.proloyalty.components.search_address.api.model;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.zdlpuopuiu;
import ru.myspar.proloyalty.common.models.LocationData;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0002\b\u0018\b\u0087\b\u0018\u00002\u00020\u0001BE\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u001d\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0015\u0010\u0016J\r\u0010\u0017\u001a\u00020\u0012¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u001b\u0010\u0018J\u001a\u0010\u001e\u001a\u00020\n2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001cHÖ\u0003¢\u0006\u0004\b\u001e\u0010\u001fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010\u001aR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b#\u0010!\u001a\u0004\b$\u0010\u001aR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b%\u0010!\u001a\u0004\b%\u0010\u001aR\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b&\u0010!\u001a\u0004\b'\u0010\u001aR\u001d\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0006¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+R\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b,\u0010-\u001a\u0004\b.\u0010/R\u0017\u0010\r\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b0\u00101\u001a\u0004\b2\u00103¨\u00064"}, d2 = {"Lru/myspar/proloyalty/components/search_address/api/model/SearchShop;", "Landroid/os/Parcelable;", "", "id", "image", "shortAddress", "workingHours", "", "Lru/myspar/proloyalty/components/search_address/api/model/ShopTag;", "tags", "", "isSelected", "Lru/myspar/proloyalty/common/models/LocationData;", "location", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;ZLru/myspar/proloyalty/common/models/LocationData;)V", "Landroid/os/Parcel;", "dest", "", "flags", "Lgg/wwaezpbzkn;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "equals", "(Ljava/lang/Object;)Z", "zdlpuopuiu", "Ljava/lang/String;", "getId", "yggfygwlhe", "zoijcleaow", "jyumaefscl", "iwizpuwonk", "eablkybsjg", "cqumvgiudr", "Ljava/util/List;", "ppxfxbqfkf", "()Ljava/util/List;", "esjtqupxsv", "Z", "wkgbmnqykc", "()Z", "lereixgezr", "Lru/myspar/proloyalty/common/models/LocationData;", "iobyxmoadg", "()Lru/myspar/proloyalty/common/models/LocationData;", "api_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class SearchShop implements Parcelable {
    public static final Parcelable.Creator<SearchShop> CREATOR = new iobyxmoadg();

    /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name and from kotlin metadata and from toString */
    private final List tags;

    /* JADX INFO: renamed from: esjtqupxsv, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean isSelected;

    /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name and from kotlin metadata and from toString */
    private final String workingHours;

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name and from kotlin metadata and from toString */
    private final String shortAddress;

    /* JADX INFO: renamed from: lereixgezr, reason: collision with root package name and from kotlin metadata and from toString */
    private final LocationData location;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name and from kotlin metadata and from toString */
    private final String image;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name and from kotlin metadata and from toString */
    private final String id;

    public static final class iobyxmoadg implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public final SearchShop createFromParcel(Parcel parcel) {
            zdlpuopuiu.btonecajqb(parcel, "parcel");
            String string = parcel.readString();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            String string4 = parcel.readString();
            int i13 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i13);
            for (int i14 = 0; i14 != i13; i14++) {
                arrayList.add(ShopTag.CREATOR.createFromParcel(parcel));
            }
            return new SearchShop(string, string2, string3, string4, arrayList, parcel.readInt() != 0, (LocationData) parcel.readParcelable(SearchShop.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: zoijcleaow, reason: merged with bridge method [inline-methods] */
        public final SearchShop[] newArray(int i13) {
            return new SearchShop[i13];
        }
    }

    public SearchShop(String id2, String image, String shortAddress, String workingHours, List tags, boolean z13, LocationData location) {
        zdlpuopuiu.btonecajqb(id2, "id");
        zdlpuopuiu.btonecajqb(image, "image");
        zdlpuopuiu.btonecajqb(shortAddress, "shortAddress");
        zdlpuopuiu.btonecajqb(workingHours, "workingHours");
        zdlpuopuiu.btonecajqb(tags, "tags");
        zdlpuopuiu.btonecajqb(location, "location");
        this.id = id2;
        this.image = image;
        this.shortAddress = shortAddress;
        this.workingHours = workingHours;
        this.tags = tags;
        this.isSelected = z13;
        this.location = location;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    /* JADX INFO: renamed from: eablkybsjg, reason: from getter */
    public final String getWorkingHours() {
        return this.workingHours;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SearchShop)) {
            return false;
        }
        SearchShop searchShop = (SearchShop) other;
        return zdlpuopuiu.eablkybsjg(this.id, searchShop.id) && zdlpuopuiu.eablkybsjg(this.image, searchShop.image) && zdlpuopuiu.eablkybsjg(this.shortAddress, searchShop.shortAddress) && zdlpuopuiu.eablkybsjg(this.workingHours, searchShop.workingHours) && zdlpuopuiu.eablkybsjg(this.tags, searchShop.tags) && this.isSelected == searchShop.isSelected && zdlpuopuiu.eablkybsjg(this.location, searchShop.location);
    }

    public final String getId() {
        return this.id;
    }

    public int hashCode() {
        return (((((((((((this.id.hashCode() * 31) + this.image.hashCode()) * 31) + this.shortAddress.hashCode()) * 31) + this.workingHours.hashCode()) * 31) + this.tags.hashCode()) * 31) + Boolean.hashCode(this.isSelected)) * 31) + this.location.hashCode();
    }

    /* JADX INFO: renamed from: iobyxmoadg, reason: from getter */
    public final LocationData getLocation() {
        return this.location;
    }

    /* JADX INFO: renamed from: jyumaefscl, reason: from getter */
    public final String getShortAddress() {
        return this.shortAddress;
    }

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: from getter */
    public final List getTags() {
        return this.tags;
    }

    public String toString() {
        return "SearchShop(id=" + this.id + ", image=" + this.image + ", shortAddress=" + this.shortAddress + ", workingHours=" + this.workingHours + ", tags=" + this.tags + ", isSelected=" + this.isSelected + ", location=" + this.location + ")";
    }

    /* JADX INFO: renamed from: wkgbmnqykc, reason: from getter */
    public final boolean getIsSelected() {
        return this.isSelected;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        zdlpuopuiu.btonecajqb(dest, "dest");
        dest.writeString(this.id);
        dest.writeString(this.image);
        dest.writeString(this.shortAddress);
        dest.writeString(this.workingHours);
        List list = this.tags;
        dest.writeInt(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((ShopTag) it.next()).writeToParcel(dest, flags);
        }
        dest.writeInt(this.isSelected ? 1 : 0);
        dest.writeParcelable(this.location, flags);
    }

    /* JADX INFO: renamed from: zoijcleaow, reason: from getter */
    public final String getImage() {
        return this.image;
    }
}
