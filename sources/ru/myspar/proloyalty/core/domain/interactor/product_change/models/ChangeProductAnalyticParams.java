package ru.myspar.proloyalty.core.domain.interactor.product_change.models;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.zdlpuopuiu;
import ru.myspar.proloyalty.analytics.api.model.AnalyticsLocation;
import ru.myspar.proloyalty.analytics.api.model.AnalyticsPage;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u001d\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000f\u0010\u0010J\r\u0010\u0011\u001a\u00020\f¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0012J\u001a\u0010\u0019\u001a\u00020\u00182\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016HÖ\u0003¢\u0006\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010\u0014¨\u0006&"}, d2 = {"Lru/myspar/proloyalty/core/domain/interactor/product_change/models/ChangeProductAnalyticParams;", "Landroid/os/Parcelable;", "Lru/myspar/proloyalty/analytics/api/model/AnalyticsPage;", "analyticsPage", "Lru/myspar/proloyalty/analytics/api/model/AnalyticsLocation;", "location", "", "productName", "<init>", "(Lru/myspar/proloyalty/analytics/api/model/AnalyticsPage;Lru/myspar/proloyalty/analytics/api/model/AnalyticsLocation;Ljava/lang/String;)V", "Landroid/os/Parcel;", "dest", "", "flags", "Lgg/wwaezpbzkn;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "zdlpuopuiu", "Lru/myspar/proloyalty/analytics/api/model/AnalyticsPage;", "zoijcleaow", "()Lru/myspar/proloyalty/analytics/api/model/AnalyticsPage;", "yggfygwlhe", "Lru/myspar/proloyalty/analytics/api/model/AnalyticsLocation;", "ppxfxbqfkf", "()Lru/myspar/proloyalty/analytics/api/model/AnalyticsLocation;", "jyumaefscl", "Ljava/lang/String;", "eablkybsjg", "domain_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class ChangeProductAnalyticParams implements Parcelable {
    public static final Parcelable.Creator<ChangeProductAnalyticParams> CREATOR = new iobyxmoadg();

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name and from kotlin metadata and from toString */
    private final String productName;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name and from kotlin metadata and from toString */
    private final AnalyticsLocation location;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name and from kotlin metadata and from toString */
    private final AnalyticsPage analyticsPage;

    public static final class iobyxmoadg implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public final ChangeProductAnalyticParams createFromParcel(Parcel parcel) {
            zdlpuopuiu.btonecajqb(parcel, "parcel");
            return new ChangeProductAnalyticParams((AnalyticsPage) parcel.readParcelable(ChangeProductAnalyticParams.class.getClassLoader()), (AnalyticsLocation) parcel.readParcelable(ChangeProductAnalyticParams.class.getClassLoader()), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: zoijcleaow, reason: merged with bridge method [inline-methods] */
        public final ChangeProductAnalyticParams[] newArray(int i13) {
            return new ChangeProductAnalyticParams[i13];
        }
    }

    public ChangeProductAnalyticParams(AnalyticsPage analyticsPage, AnalyticsLocation analyticsLocation, String productName) {
        zdlpuopuiu.btonecajqb(analyticsPage, "analyticsPage");
        zdlpuopuiu.btonecajqb(productName, "productName");
        this.analyticsPage = analyticsPage;
        this.location = analyticsLocation;
        this.productName = productName;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    /* JADX INFO: renamed from: eablkybsjg, reason: from getter */
    public final String getProductName() {
        return this.productName;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ChangeProductAnalyticParams)) {
            return false;
        }
        ChangeProductAnalyticParams changeProductAnalyticParams = (ChangeProductAnalyticParams) other;
        return zdlpuopuiu.eablkybsjg(this.analyticsPage, changeProductAnalyticParams.analyticsPage) && zdlpuopuiu.eablkybsjg(this.location, changeProductAnalyticParams.location) && zdlpuopuiu.eablkybsjg(this.productName, changeProductAnalyticParams.productName);
    }

    public int hashCode() {
        int iHashCode = this.analyticsPage.hashCode() * 31;
        AnalyticsLocation analyticsLocation = this.location;
        return ((iHashCode + (analyticsLocation == null ? 0 : analyticsLocation.hashCode())) * 31) + this.productName.hashCode();
    }

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: from getter */
    public final AnalyticsLocation getLocation() {
        return this.location;
    }

    public String toString() {
        return "ChangeProductAnalyticParams(analyticsPage=" + this.analyticsPage + ", location=" + this.location + ", productName=" + this.productName + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        zdlpuopuiu.btonecajqb(dest, "dest");
        dest.writeParcelable(this.analyticsPage, flags);
        dest.writeParcelable(this.location, flags);
        dest.writeString(this.productName);
    }

    /* JADX INFO: renamed from: zoijcleaow, reason: from getter */
    public final AnalyticsPage getAnalyticsPage() {
        return this.analyticsPage;
    }
}
