package ru.myspar.proloyalty.core.domain.models.catalog;

import android.os.Parcel;
import android.os.Parcelable;
import k21.ojitshcjhn;
import kotlin.Metadata;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0014\b\u0087\b\u0018\u00002\u00020\u0001BC\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u001d\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0012\u0010\u0013J\r\u0010\u0014\u001a\u00020\u000f¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0015J\u001a\u0010\u001c\u001a\u00020\u001b2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019HÖ\u0003¢\u0006\u0004\b\u001c\u0010\u001dR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010\u0017R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b!\u0010\u001f\u001a\u0004\b\"\u0010\u0017R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b#\u0010\u001f\u001a\u0004\b$\u0010\u0017R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b)\u0010\u001f\u001a\u0004\b*\u0010\u0017R\u0017\u0010\t\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b+\u0010\u001f\u001a\u0004\b,\u0010\u0017R\u0019\u0010\n\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b-\u0010\u001f\u001a\u0004\b.\u0010\u0017¨\u0006/"}, d2 = {"Lru/myspar/proloyalty/core/domain/models/catalog/CatalogBanner;", "Landroid/os/Parcelable;", "", "id", "title", "image", "Lk21/ojitshcjhn;", "navigationLink", "reference", "adv", "onboardingId", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lk21/ojitshcjhn;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "Landroid/os/Parcel;", "dest", "", "flags", "Lgg/wwaezpbzkn;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "zdlpuopuiu", "Ljava/lang/String;", "getId", "yggfygwlhe", "nufgyqmvbu", "jyumaefscl", "ppxfxbqfkf", "iwizpuwonk", "Lk21/ojitshcjhn;", "eablkybsjg", "()Lk21/ojitshcjhn;", "cqumvgiudr", "lqeggnwhkg", "esjtqupxsv", "zoijcleaow", "lereixgezr", "gxszxtbevo", "domain_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class CatalogBanner implements Parcelable {
    public static final Parcelable.Creator<CatalogBanner> CREATOR = new iobyxmoadg();

    /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name and from kotlin metadata and from toString */
    private final String reference;

    /* JADX INFO: renamed from: esjtqupxsv, reason: collision with root package name and from kotlin metadata and from toString */
    private final String adv;

    /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name and from kotlin metadata and from toString */
    private final ojitshcjhn navigationLink;

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name and from kotlin metadata and from toString */
    private final String image;

    /* JADX INFO: renamed from: lereixgezr, reason: collision with root package name and from kotlin metadata and from toString */
    private final String onboardingId;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name and from kotlin metadata and from toString */
    private final String title;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name and from kotlin metadata and from toString */
    private final String id;

    public static final class iobyxmoadg implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public final CatalogBanner createFromParcel(Parcel parcel) {
            zdlpuopuiu.btonecajqb(parcel, "parcel");
            return new CatalogBanner(parcel.readString(), parcel.readString(), parcel.readString(), ojitshcjhn.valueOf(parcel.readString()), parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: zoijcleaow, reason: merged with bridge method [inline-methods] */
        public final CatalogBanner[] newArray(int i13) {
            return new CatalogBanner[i13];
        }
    }

    public CatalogBanner(String id2, String title, String image, ojitshcjhn navigationLink, String str, String adv, String str2) {
        zdlpuopuiu.btonecajqb(id2, "id");
        zdlpuopuiu.btonecajqb(title, "title");
        zdlpuopuiu.btonecajqb(image, "image");
        zdlpuopuiu.btonecajqb(navigationLink, "navigationLink");
        zdlpuopuiu.btonecajqb(adv, "adv");
        this.id = id2;
        this.title = title;
        this.image = image;
        this.navigationLink = navigationLink;
        this.reference = str;
        this.adv = adv;
        this.onboardingId = str2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    /* JADX INFO: renamed from: eablkybsjg, reason: from getter */
    public final ojitshcjhn getNavigationLink() {
        return this.navigationLink;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CatalogBanner)) {
            return false;
        }
        CatalogBanner catalogBanner = (CatalogBanner) other;
        return zdlpuopuiu.eablkybsjg(this.id, catalogBanner.id) && zdlpuopuiu.eablkybsjg(this.title, catalogBanner.title) && zdlpuopuiu.eablkybsjg(this.image, catalogBanner.image) && this.navigationLink == catalogBanner.navigationLink && zdlpuopuiu.eablkybsjg(this.reference, catalogBanner.reference) && zdlpuopuiu.eablkybsjg(this.adv, catalogBanner.adv) && zdlpuopuiu.eablkybsjg(this.onboardingId, catalogBanner.onboardingId);
    }

    public final String getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: gxszxtbevo, reason: from getter */
    public final String getOnboardingId() {
        return this.onboardingId;
    }

    public int hashCode() {
        int iHashCode = ((((((this.id.hashCode() * 31) + this.title.hashCode()) * 31) + this.image.hashCode()) * 31) + this.navigationLink.hashCode()) * 31;
        String str = this.reference;
        int iHashCode2 = (((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + this.adv.hashCode()) * 31;
        String str2 = this.onboardingId;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    /* JADX INFO: renamed from: lqeggnwhkg, reason: from getter */
    public final String getReference() {
        return this.reference;
    }

    /* JADX INFO: renamed from: nufgyqmvbu, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: from getter */
    public final String getImage() {
        return this.image;
    }

    public String toString() {
        return "CatalogBanner(id=" + this.id + ", title=" + this.title + ", image=" + this.image + ", navigationLink=" + this.navigationLink + ", reference=" + this.reference + ", adv=" + this.adv + ", onboardingId=" + this.onboardingId + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        zdlpuopuiu.btonecajqb(dest, "dest");
        dest.writeString(this.id);
        dest.writeString(this.title);
        dest.writeString(this.image);
        dest.writeString(this.navigationLink.name());
        dest.writeString(this.reference);
        dest.writeString(this.adv);
        dest.writeString(this.onboardingId);
    }

    /* JADX INFO: renamed from: zoijcleaow, reason: from getter */
    public final String getAdv() {
        return this.adv;
    }
}
