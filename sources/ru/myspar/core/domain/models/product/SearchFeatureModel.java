package ru.myspar.core.domain.models.product;

import android.os.Parcel;
import android.os.Parcelable;
import f40.zoijcleaow;
import kotlin.Metadata;
import kotlin.jvm.internal.zdlpuopuiu;
import modern.payments.ecomAndroid.util.externalMetrics.ExternalMetricsManagerImpl;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0010\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u001d\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u0010\u0010\u0011J\r\u0010\u0012\u001a\u00020\r¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0013J\u001a\u0010\u001a\u001a\u00020\u00192\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017HÖ\u0003¢\u0006\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u0015R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001f\u0010\u001d\u001a\u0004\b \u0010\u0015R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b!\u0010\u001d\u001a\u0004\b\"\u0010\u0015R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&R\u0017\u0010\b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b'\u0010\u001d\u001a\u0004\b(\u0010\u0015¨\u0006)"}, d2 = {"Lru/myspar/core/domain/models/product/SearchFeatureModel;", "Landroid/os/Parcelable;", "", "id", ExternalMetricsManagerImpl.NAME, "pic", "Lf40/zoijcleaow;", "navlink", "reference", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lf40/zoijcleaow;Ljava/lang/String;)V", "Landroid/os/Parcel;", "dest", "", "flags", "Lgg/wwaezpbzkn;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "zdlpuopuiu", "Ljava/lang/String;", "getId", "yggfygwlhe", "getName", "jyumaefscl", "ppxfxbqfkf", "iwizpuwonk", "Lf40/zoijcleaow;", "zoijcleaow", "()Lf40/zoijcleaow;", "cqumvgiudr", "eablkybsjg", "domain_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class SearchFeatureModel implements Parcelable {
    public static final Parcelable.Creator<SearchFeatureModel> CREATOR = new iobyxmoadg();

    /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name and from kotlin metadata and from toString */
    private final String reference;

    /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name and from kotlin metadata and from toString */
    private final zoijcleaow navlink;

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name and from kotlin metadata and from toString */
    private final String pic;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name and from kotlin metadata and from toString */
    private final String name;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name and from kotlin metadata and from toString */
    private final String id;

    public static final class iobyxmoadg implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public final SearchFeatureModel createFromParcel(Parcel parcel) {
            zdlpuopuiu.btonecajqb(parcel, "parcel");
            return new SearchFeatureModel(parcel.readString(), parcel.readString(), parcel.readString(), zoijcleaow.valueOf(parcel.readString()), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: zoijcleaow, reason: merged with bridge method [inline-methods] */
        public final SearchFeatureModel[] newArray(int i13) {
            return new SearchFeatureModel[i13];
        }
    }

    public SearchFeatureModel(String id2, String name, String pic, zoijcleaow navlink, String reference) {
        zdlpuopuiu.btonecajqb(id2, "id");
        zdlpuopuiu.btonecajqb(name, "name");
        zdlpuopuiu.btonecajqb(pic, "pic");
        zdlpuopuiu.btonecajqb(navlink, "navlink");
        zdlpuopuiu.btonecajqb(reference, "reference");
        this.id = id2;
        this.name = name;
        this.pic = pic;
        this.navlink = navlink;
        this.reference = reference;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    /* JADX INFO: renamed from: eablkybsjg, reason: from getter */
    public final String getReference() {
        return this.reference;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SearchFeatureModel)) {
            return false;
        }
        SearchFeatureModel searchFeatureModel = (SearchFeatureModel) other;
        return zdlpuopuiu.eablkybsjg(this.id, searchFeatureModel.id) && zdlpuopuiu.eablkybsjg(this.name, searchFeatureModel.name) && zdlpuopuiu.eablkybsjg(this.pic, searchFeatureModel.pic) && this.navlink == searchFeatureModel.navlink && zdlpuopuiu.eablkybsjg(this.reference, searchFeatureModel.reference);
    }

    public final String getId() {
        return this.id;
    }

    public final String getName() {
        return this.name;
    }

    public int hashCode() {
        return (((((((this.id.hashCode() * 31) + this.name.hashCode()) * 31) + this.pic.hashCode()) * 31) + this.navlink.hashCode()) * 31) + this.reference.hashCode();
    }

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: from getter */
    public final String getPic() {
        return this.pic;
    }

    public String toString() {
        return "SearchFeatureModel(id=" + this.id + ", name=" + this.name + ", pic=" + this.pic + ", navlink=" + this.navlink + ", reference=" + this.reference + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        zdlpuopuiu.btonecajqb(dest, "dest");
        dest.writeString(this.id);
        dest.writeString(this.name);
        dest.writeString(this.pic);
        dest.writeString(this.navlink.name());
        dest.writeString(this.reference);
    }

    /* JADX INFO: renamed from: zoijcleaow, reason: from getter */
    public final zoijcleaow getNavlink() {
        return this.navlink;
    }
}
