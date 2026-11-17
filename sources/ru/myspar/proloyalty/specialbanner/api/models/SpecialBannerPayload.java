package ru.myspar.proloyalty.specialbanner.api.models;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.gtknphoqwx;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0002\b\u0018\b\u0087\b\u0018\u00002\u00020\u0001B;\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\u001d\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u0010\u0010\u0011J\r\u0010\u0012\u001a\u00020\r¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0013J\u001a\u0010\u0019\u001a\u00020\u00062\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017HÖ\u0003¢\u0006\u0004\b\u0019\u0010\u001aR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u0015R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001c\u001a\u0004\b\u001f\u0010\u0015R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b \u0010\u001c\u001a\u0004\b!\u0010\u0015R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%R\u0017\u0010\b\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b&\u0010#\u001a\u0004\b'\u0010%R\u0017\u0010*\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b(\u0010#\u001a\u0004\b)\u0010%R\u0011\u0010,\u001a\u00020\u00068F¢\u0006\u0006\u001a\u0004\b+\u0010%R\u0011\u0010.\u001a\u00020\u00068F¢\u0006\u0006\u001a\u0004\b-\u0010%¨\u0006/"}, d2 = {"Lru/myspar/proloyalty/specialbanner/api/models/SpecialBannerPayload;", "Landroid/os/Parcelable;", "", "landingPageKey", "bannerTitle", "bannerId", "", "loadTitle", "isAdultConfirmed", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZ)V", "Landroid/os/Parcel;", "dest", "", "flags", "Lgg/wwaezpbzkn;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "equals", "(Ljava/lang/Object;)Z", "zdlpuopuiu", "Ljava/lang/String;", "eablkybsjg", "yggfygwlhe", "ppxfxbqfkf", "jyumaefscl", "zoijcleaow", "iwizpuwonk", "Z", "gxszxtbevo", "()Z", "cqumvgiudr", "nufgyqmvbu", "esjtqupxsv", "lqeggnwhkg", "is16dpMargin", "btonecajqb", "isSparWine", "dxjokdxxww", "isMonopoly", "api_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class SpecialBannerPayload implements Parcelable {
    public static final Parcelable.Creator<SpecialBannerPayload> CREATOR = new iobyxmoadg();

    /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean isAdultConfirmed;

    /* JADX INFO: renamed from: esjtqupxsv, reason: collision with root package name and from kotlin metadata */
    private final boolean is16dpMargin;

    /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean loadTitle;

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name and from kotlin metadata and from toString */
    private final String bannerId;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name and from kotlin metadata and from toString */
    private final String bannerTitle;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name and from kotlin metadata and from toString */
    private final String landingPageKey;

    public static final class iobyxmoadg implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public final SpecialBannerPayload createFromParcel(Parcel parcel) {
            zdlpuopuiu.btonecajqb(parcel, "parcel");
            return new SpecialBannerPayload(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() != 0, parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: zoijcleaow, reason: merged with bridge method [inline-methods] */
        public final SpecialBannerPayload[] newArray(int i13) {
            return new SpecialBannerPayload[i13];
        }
    }

    public SpecialBannerPayload(String str, String str2, String bannerId, boolean z13, boolean z14) {
        zdlpuopuiu.btonecajqb(bannerId, "bannerId");
        this.landingPageKey = str;
        this.bannerTitle = str2;
        this.bannerId = bannerId;
        this.loadTitle = z13;
        this.isAdultConfirmed = z14;
        this.is16dpMargin = btonecajqb() || dxjokdxxww();
    }

    public final boolean btonecajqb() {
        return zdlpuopuiu.eablkybsjg(this.bannerId, "sparwine");
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean dxjokdxxww() {
        return zdlpuopuiu.eablkybsjg(this.bannerId, "monopoly");
    }

    /* JADX INFO: renamed from: eablkybsjg, reason: from getter */
    public final String getLandingPageKey() {
        return this.landingPageKey;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SpecialBannerPayload)) {
            return false;
        }
        SpecialBannerPayload specialBannerPayload = (SpecialBannerPayload) other;
        return zdlpuopuiu.eablkybsjg(this.landingPageKey, specialBannerPayload.landingPageKey) && zdlpuopuiu.eablkybsjg(this.bannerTitle, specialBannerPayload.bannerTitle) && zdlpuopuiu.eablkybsjg(this.bannerId, specialBannerPayload.bannerId) && this.loadTitle == specialBannerPayload.loadTitle && this.isAdultConfirmed == specialBannerPayload.isAdultConfirmed;
    }

    /* JADX INFO: renamed from: gxszxtbevo, reason: from getter */
    public final boolean getLoadTitle() {
        return this.loadTitle;
    }

    public int hashCode() {
        String str = this.landingPageKey;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.bannerTitle;
        return ((((((iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31) + this.bannerId.hashCode()) * 31) + Boolean.hashCode(this.loadTitle)) * 31) + Boolean.hashCode(this.isAdultConfirmed);
    }

    /* JADX INFO: renamed from: lqeggnwhkg, reason: from getter */
    public final boolean getIs16dpMargin() {
        return this.is16dpMargin;
    }

    /* JADX INFO: renamed from: nufgyqmvbu, reason: from getter */
    public final boolean getIsAdultConfirmed() {
        return this.isAdultConfirmed;
    }

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: from getter */
    public final String getBannerTitle() {
        return this.bannerTitle;
    }

    public String toString() {
        return "SpecialBannerPayload(landingPageKey=" + this.landingPageKey + ", bannerTitle=" + this.bannerTitle + ", bannerId=" + this.bannerId + ", loadTitle=" + this.loadTitle + ", isAdultConfirmed=" + this.isAdultConfirmed + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        zdlpuopuiu.btonecajqb(dest, "dest");
        dest.writeString(this.landingPageKey);
        dest.writeString(this.bannerTitle);
        dest.writeString(this.bannerId);
        dest.writeInt(this.loadTitle ? 1 : 0);
        dest.writeInt(this.isAdultConfirmed ? 1 : 0);
    }

    /* JADX INFO: renamed from: zoijcleaow, reason: from getter */
    public final String getBannerId() {
        return this.bannerId;
    }

    public /* synthetic */ SpecialBannerPayload(String str, String str2, String str3, boolean z13, boolean z14, int i13, gtknphoqwx gtknphoqwxVar) {
        this(str, (i13 & 2) != 0 ? null : str2, (i13 & 4) != 0 ? "" : str3, (i13 & 8) != 0 ? false : z13, (i13 & 16) != 0 ? false : z14);
    }
}
