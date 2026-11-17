package ru.myspar.core.navigation.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import f40.zoijcleaow;
import kotlin.Metadata;
import kotlin.jvm.internal.gtknphoqwx;
import kotlin.jvm.internal.zdlpuopuiu;
import ru.myspar.analytics.api.model.AnalyticsLink;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0000\n\u0002\b\u001b\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B_\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f\u0012\b\b\u0002\u0010\u000e\u001a\u00020\b¢\u0006\u0004\b\u000f\u0010\u0010J\u001f\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0007¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\u0013H\u0007¢\u0006\u0004\b\u0018\u0010\u0019Jh\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\n2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f2\b\b\u0002\u0010\u000e\u001a\u00020\bHÇ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0004H×\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0013H×\u0001¢\u0006\u0004\b\u001e\u0010\u0019J\u001a\u0010!\u001a\u00020\b2\b\u0010 \u001a\u0004\u0018\u00010\u001fH×\u0003¢\u0006\u0004\b!\u0010\"R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b)\u0010\u001dR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b*\u0010(\u001a\u0004\b+\u0010\u001dR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b,\u0010(\u001a\u0004\b-\u0010\u001dR\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b.\u0010/\u001a\u0004\b0\u00101R\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b2\u00103\u001a\u0004\b4\u00105R\u0019\u0010\r\u001a\u0004\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\b6\u00107\u001a\u0004\b8\u00109R\u0017\u0010\u000e\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b:\u0010/\u001a\u0004\b\u000e\u00101R\u0017\u0010@\u001a\u00020;8\u0006¢\u0006\f\n\u0004\b<\u0010=\u001a\u0004\b>\u0010?¨\u0006A"}, d2 = {"Lru/myspar/core/navigation/model/NavigationPayload;", "Landroid/os/Parcelable;", "Lf40/zoijcleaow;", "navigationLink", "", "reference", "title", "message", "", "isAdultConfirmed", "Lru/myspar/core/navigation/model/DeepLink;", "deepLink", "Lru/myspar/core/navigation/model/AnalyticsPayload;", "analyticsPayload", "isPushPayload", "<init>", "(Lf40/zoijcleaow;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLru/myspar/core/navigation/model/DeepLink;Lru/myspar/core/navigation/model/AnalyticsPayload;Z)V", "Landroid/os/Parcel;", "dest", "", "flags", "Lgg/wwaezpbzkn;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "zoijcleaow", "(Lf40/zoijcleaow;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLru/myspar/core/navigation/model/DeepLink;Lru/myspar/core/navigation/model/AnalyticsPayload;Z)Lru/myspar/core/navigation/model/NavigationPayload;", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "equals", "(Ljava/lang/Object;)Z", "zdlpuopuiu", "Lf40/zoijcleaow;", "dxjokdxxww", "()Lf40/zoijcleaow;", "yggfygwlhe", "Ljava/lang/String;", "btonecajqb", "jyumaefscl", "gtknphoqwx", "iwizpuwonk", "nufgyqmvbu", "cqumvgiudr", "Z", "wflxmlrfwp", "()Z", "esjtqupxsv", "Lru/myspar/core/navigation/model/DeepLink;", "lqeggnwhkg", "()Lru/myspar/core/navigation/model/DeepLink;", "lereixgezr", "Lru/myspar/core/navigation/model/AnalyticsPayload;", "gxszxtbevo", "()Lru/myspar/core/navigation/model/AnalyticsPayload;", "pmvmpeiblj", "Lru/myspar/analytics/api/model/AnalyticsLink;", "zynmafqrjb", "Lru/myspar/analytics/api/model/AnalyticsLink;", "eablkybsjg", "()Lru/myspar/analytics/api/model/AnalyticsLink;", "analyticsLink", "navigation_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class NavigationPayload implements Parcelable {
    public static final Parcelable.Creator<NavigationPayload> CREATOR = new iobyxmoadg();

    /* JADX INFO: renamed from: istkbnxepw, reason: collision with root package name */
    public static final int f87549istkbnxepw = 8;

    /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean isAdultConfirmed;

    /* JADX INFO: renamed from: esjtqupxsv, reason: collision with root package name and from kotlin metadata and from toString */
    private final DeepLink deepLink;

    /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name and from kotlin metadata and from toString */
    private final String message;

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name and from kotlin metadata and from toString */
    private final String title;

    /* JADX INFO: renamed from: lereixgezr, reason: collision with root package name and from kotlin metadata and from toString */
    private final AnalyticsPayload analyticsPayload;

    /* JADX INFO: renamed from: pmvmpeiblj, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean isPushPayload;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name and from kotlin metadata and from toString */
    private final String reference;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name and from kotlin metadata and from toString */
    private final zoijcleaow navigationLink;

    /* JADX INFO: renamed from: zynmafqrjb, reason: collision with root package name and from kotlin metadata */
    private final AnalyticsLink analyticsLink;

    public static final class iobyxmoadg implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public final NavigationPayload createFromParcel(Parcel parcel) {
            zdlpuopuiu.btonecajqb(parcel, "parcel");
            return new NavigationPayload(zoijcleaow.valueOf(parcel.readString()), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() != 0, (DeepLink) parcel.readParcelable(NavigationPayload.class.getClassLoader()), parcel.readInt() == 0 ? null : AnalyticsPayload.CREATOR.createFromParcel(parcel), parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: zoijcleaow, reason: merged with bridge method [inline-methods] */
        public final NavigationPayload[] newArray(int i13) {
            return new NavigationPayload[i13];
        }
    }

    public NavigationPayload(zoijcleaow navigationLink, String str, String str2, String str3, boolean z13, DeepLink deepLink, AnalyticsPayload analyticsPayload, boolean z14) {
        zdlpuopuiu.btonecajqb(navigationLink, "navigationLink");
        zdlpuopuiu.btonecajqb(deepLink, "deepLink");
        this.navigationLink = navigationLink;
        this.reference = str;
        this.title = str2;
        this.message = str3;
        this.isAdultConfirmed = z13;
        this.deepLink = deepLink;
        this.analyticsPayload = analyticsPayload;
        this.isPushPayload = z14;
        this.analyticsLink = z14 ? new AnalyticsLink.Push(navigationLink.dxjokdxxww(), str) : !zdlpuopuiu.eablkybsjg(deepLink, DeepLink.None.f87537iwizpuwonk) ? new AnalyticsLink.DeepLink(deepLink.ppxfxbqfkf(), str) : new AnalyticsLink.NavLink(navigationLink.dxjokdxxww(), str);
    }

    /* JADX INFO: renamed from: btonecajqb, reason: from getter */
    public final String getReference() {
        return this.reference;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    /* JADX INFO: renamed from: dxjokdxxww, reason: from getter */
    public final zoijcleaow getNavigationLink() {
        return this.navigationLink;
    }

    /* JADX INFO: renamed from: eablkybsjg, reason: from getter */
    public final AnalyticsLink getAnalyticsLink() {
        return this.analyticsLink;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof NavigationPayload)) {
            return false;
        }
        NavigationPayload navigationPayload = (NavigationPayload) other;
        return this.navigationLink == navigationPayload.navigationLink && zdlpuopuiu.eablkybsjg(this.reference, navigationPayload.reference) && zdlpuopuiu.eablkybsjg(this.title, navigationPayload.title) && zdlpuopuiu.eablkybsjg(this.message, navigationPayload.message) && this.isAdultConfirmed == navigationPayload.isAdultConfirmed && zdlpuopuiu.eablkybsjg(this.deepLink, navigationPayload.deepLink) && zdlpuopuiu.eablkybsjg(this.analyticsPayload, navigationPayload.analyticsPayload) && this.isPushPayload == navigationPayload.isPushPayload;
    }

    /* JADX INFO: renamed from: gtknphoqwx, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* JADX INFO: renamed from: gxszxtbevo, reason: from getter */
    public final AnalyticsPayload getAnalyticsPayload() {
        return this.analyticsPayload;
    }

    public int hashCode() {
        int iHashCode = this.navigationLink.hashCode() * 31;
        String str = this.reference;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.title;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.message;
        int iHashCode4 = (((((iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31) + Boolean.hashCode(this.isAdultConfirmed)) * 31) + this.deepLink.hashCode()) * 31;
        AnalyticsPayload analyticsPayload = this.analyticsPayload;
        return ((iHashCode4 + (analyticsPayload != null ? analyticsPayload.hashCode() : 0)) * 31) + Boolean.hashCode(this.isPushPayload);
    }

    /* JADX INFO: renamed from: lqeggnwhkg, reason: from getter */
    public final DeepLink getDeepLink() {
        return this.deepLink;
    }

    /* JADX INFO: renamed from: nufgyqmvbu, reason: from getter */
    public final String getMessage() {
        return this.message;
    }

    public String toString() {
        return "NavigationPayload(navigationLink=" + this.navigationLink + ", reference=" + this.reference + ", title=" + this.title + ", message=" + this.message + ", isAdultConfirmed=" + this.isAdultConfirmed + ", deepLink=" + this.deepLink + ", analyticsPayload=" + this.analyticsPayload + ", isPushPayload=" + this.isPushPayload + ")";
    }

    /* JADX INFO: renamed from: wflxmlrfwp, reason: from getter */
    public final boolean getIsAdultConfirmed() {
        return this.isAdultConfirmed;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        zdlpuopuiu.btonecajqb(dest, "dest");
        dest.writeString(this.navigationLink.name());
        dest.writeString(this.reference);
        dest.writeString(this.title);
        dest.writeString(this.message);
        dest.writeInt(this.isAdultConfirmed ? 1 : 0);
        dest.writeParcelable(this.deepLink, flags);
        AnalyticsPayload analyticsPayload = this.analyticsPayload;
        if (analyticsPayload == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            analyticsPayload.writeToParcel(dest, flags);
        }
        dest.writeInt(this.isPushPayload ? 1 : 0);
    }

    public final NavigationPayload zoijcleaow(zoijcleaow navigationLink, String reference, String title, String message, boolean isAdultConfirmed, DeepLink deepLink, AnalyticsPayload analyticsPayload, boolean isPushPayload) {
        zdlpuopuiu.btonecajqb(navigationLink, "navigationLink");
        zdlpuopuiu.btonecajqb(deepLink, "deepLink");
        return new NavigationPayload(navigationLink, reference, title, message, isAdultConfirmed, deepLink, analyticsPayload, isPushPayload);
    }

    public /* synthetic */ NavigationPayload(zoijcleaow zoijcleaowVar, String str, String str2, String str3, boolean z13, DeepLink deepLink, AnalyticsPayload analyticsPayload, boolean z14, int i13, gtknphoqwx gtknphoqwxVar) {
        this((i13 & 1) != 0 ? zoijcleaow.f32830ydmasvzmpa : zoijcleaowVar, (i13 & 2) != 0 ? null : str, (i13 & 4) != 0 ? null : str2, (i13 & 8) != 0 ? null : str3, (i13 & 16) != 0 ? false : z13, (i13 & 32) != 0 ? DeepLink.None.f87537iwizpuwonk : deepLink, (i13 & 64) == 0 ? analyticsPayload : null, (i13 & UserVerificationMethods.USER_VERIFY_PATTERN) == 0 ? z14 : false);
    }
}
