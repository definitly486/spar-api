package ru.myspar.proloyalty.core.navigation.model;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.gtknphoqwx;
import kotlin.jvm.internal.zdlpuopuiu;
import ru.myspar.proloyalty.analytics.api.model.AnalyticElement;
import ru.myspar.proloyalty.analytics.api.model.AnalyticsLocation;
import ru.myspar.proloyalty.analytics.api.model.AnalyticsPage;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000f\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0007¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\fH\u0007¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013H×\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\fH×\u0001¢\u0006\u0004\b\u0016\u0010\u0012J\u001a\u0010\u001a\u001a\u00020\u00192\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017H×\u0003¢\u0006\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'¨\u0006("}, d2 = {"Lru/myspar/proloyalty/core/navigation/model/AnalyticsPayload;", "Landroid/os/Parcelable;", "Lru/myspar/proloyalty/analytics/api/model/AnalyticsPage;", "page", "Lru/myspar/proloyalty/analytics/api/model/AnalyticsLocation;", "location", "Lru/myspar/proloyalty/analytics/api/model/AnalyticElement;", "element", "<init>", "(Lru/myspar/proloyalty/analytics/api/model/AnalyticsPage;Lru/myspar/proloyalty/analytics/api/model/AnalyticsLocation;Lru/myspar/proloyalty/analytics/api/model/AnalyticElement;)V", "Landroid/os/Parcel;", "dest", "", "flags", "Lgg/wwaezpbzkn;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "zdlpuopuiu", "Lru/myspar/proloyalty/analytics/api/model/AnalyticsPage;", "eablkybsjg", "()Lru/myspar/proloyalty/analytics/api/model/AnalyticsPage;", "yggfygwlhe", "Lru/myspar/proloyalty/analytics/api/model/AnalyticsLocation;", "ppxfxbqfkf", "()Lru/myspar/proloyalty/analytics/api/model/AnalyticsLocation;", "jyumaefscl", "Lru/myspar/proloyalty/analytics/api/model/AnalyticElement;", "zoijcleaow", "()Lru/myspar/proloyalty/analytics/api/model/AnalyticElement;", "navigation_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class AnalyticsPayload implements Parcelable {
    public static final Parcelable.Creator<AnalyticsPayload> CREATOR = new iobyxmoadg();

    /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
    public static final int f95299iwizpuwonk = 8;

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name and from kotlin metadata and from toString */
    private final AnalyticElement element;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name and from kotlin metadata and from toString */
    private final AnalyticsLocation location;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name and from kotlin metadata and from toString */
    private final AnalyticsPage page;

    public static final class iobyxmoadg implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public final AnalyticsPayload createFromParcel(Parcel parcel) {
            zdlpuopuiu.btonecajqb(parcel, "parcel");
            return new AnalyticsPayload((AnalyticsPage) parcel.readParcelable(AnalyticsPayload.class.getClassLoader()), (AnalyticsLocation) parcel.readParcelable(AnalyticsPayload.class.getClassLoader()), (AnalyticElement) parcel.readParcelable(AnalyticsPayload.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: zoijcleaow, reason: merged with bridge method [inline-methods] */
        public final AnalyticsPayload[] newArray(int i13) {
            return new AnalyticsPayload[i13];
        }
    }

    public AnalyticsPayload(AnalyticsPage page, AnalyticsLocation analyticsLocation, AnalyticElement analyticElement) {
        zdlpuopuiu.btonecajqb(page, "page");
        this.page = page;
        this.location = analyticsLocation;
        this.element = analyticElement;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    /* JADX INFO: renamed from: eablkybsjg, reason: from getter */
    public final AnalyticsPage getPage() {
        return this.page;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AnalyticsPayload)) {
            return false;
        }
        AnalyticsPayload analyticsPayload = (AnalyticsPayload) other;
        return zdlpuopuiu.eablkybsjg(this.page, analyticsPayload.page) && zdlpuopuiu.eablkybsjg(this.location, analyticsPayload.location) && zdlpuopuiu.eablkybsjg(this.element, analyticsPayload.element);
    }

    public int hashCode() {
        int iHashCode = this.page.hashCode() * 31;
        AnalyticsLocation analyticsLocation = this.location;
        int iHashCode2 = (iHashCode + (analyticsLocation == null ? 0 : analyticsLocation.hashCode())) * 31;
        AnalyticElement analyticElement = this.element;
        return iHashCode2 + (analyticElement != null ? analyticElement.hashCode() : 0);
    }

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: from getter */
    public final AnalyticsLocation getLocation() {
        return this.location;
    }

    public String toString() {
        return "AnalyticsPayload(page=" + this.page + ", location=" + this.location + ", element=" + this.element + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        zdlpuopuiu.btonecajqb(dest, "dest");
        dest.writeParcelable(this.page, flags);
        dest.writeParcelable(this.location, flags);
        dest.writeParcelable(this.element, flags);
    }

    /* JADX INFO: renamed from: zoijcleaow, reason: from getter */
    public final AnalyticElement getElement() {
        return this.element;
    }

    public /* synthetic */ AnalyticsPayload(AnalyticsPage analyticsPage, AnalyticsLocation analyticsLocation, AnalyticElement analyticElement, int i13, gtknphoqwx gtknphoqwxVar) {
        this(analyticsPage, (i13 & 2) != 0 ? null : analyticsLocation, (i13 & 4) != 0 ? null : analyticElement);
    }
}
