package ru.myspar.common.view.hint.model;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.gtknphoqwx;
import kotlin.jvm.internal.zdlpuopuiu;
import ru.myspar.analytics.api.model.AnalyticElement;
import ru.myspar.analytics.api.model.AnalyticsLocation;
import ru.myspar.analytics.api.model.AnalyticsPage;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000f\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0007¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\fH\u0007¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013H×\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\fH×\u0001¢\u0006\u0004\b\u0016\u0010\u0012J\u001a\u0010\u001a\u001a\u00020\u00192\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017H×\u0003¢\u0006\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'¨\u0006("}, d2 = {"Lru/myspar/common/view/hint/model/HintDialogAnalyticsInfo;", "Landroid/os/Parcelable;", "Lru/myspar/analytics/api/model/AnalyticElement;", "analyticElement", "Lru/myspar/analytics/api/model/AnalyticsPage;", "analyticPageFrom", "Lru/myspar/analytics/api/model/AnalyticsLocation;", "analyticsLocation", "<init>", "(Lru/myspar/analytics/api/model/AnalyticElement;Lru/myspar/analytics/api/model/AnalyticsPage;Lru/myspar/analytics/api/model/AnalyticsLocation;)V", "Landroid/os/Parcel;", "dest", "", "flags", "Lgg/wwaezpbzkn;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "zdlpuopuiu", "Lru/myspar/analytics/api/model/AnalyticElement;", "zoijcleaow", "()Lru/myspar/analytics/api/model/AnalyticElement;", "yggfygwlhe", "Lru/myspar/analytics/api/model/AnalyticsPage;", "ppxfxbqfkf", "()Lru/myspar/analytics/api/model/AnalyticsPage;", "jyumaefscl", "Lru/myspar/analytics/api/model/AnalyticsLocation;", "eablkybsjg", "()Lru/myspar/analytics/api/model/AnalyticsLocation;", "view_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class HintDialogAnalyticsInfo implements Parcelable {
    public static final Parcelable.Creator<HintDialogAnalyticsInfo> CREATOR = new iobyxmoadg();

    /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
    public static final int f86151iwizpuwonk = 8;

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name and from kotlin metadata and from toString */
    private final AnalyticsLocation analyticsLocation;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name and from kotlin metadata and from toString */
    private final AnalyticsPage analyticPageFrom;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name and from kotlin metadata and from toString */
    private final AnalyticElement analyticElement;

    public static final class iobyxmoadg implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public final HintDialogAnalyticsInfo createFromParcel(Parcel parcel) {
            zdlpuopuiu.btonecajqb(parcel, "parcel");
            return new HintDialogAnalyticsInfo((AnalyticElement) parcel.readParcelable(HintDialogAnalyticsInfo.class.getClassLoader()), (AnalyticsPage) parcel.readParcelable(HintDialogAnalyticsInfo.class.getClassLoader()), (AnalyticsLocation) parcel.readParcelable(HintDialogAnalyticsInfo.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: zoijcleaow, reason: merged with bridge method [inline-methods] */
        public final HintDialogAnalyticsInfo[] newArray(int i13) {
            return new HintDialogAnalyticsInfo[i13];
        }
    }

    public HintDialogAnalyticsInfo(AnalyticElement analyticElement, AnalyticsPage analyticPageFrom, AnalyticsLocation analyticsLocation) {
        zdlpuopuiu.btonecajqb(analyticElement, "analyticElement");
        zdlpuopuiu.btonecajqb(analyticPageFrom, "analyticPageFrom");
        this.analyticElement = analyticElement;
        this.analyticPageFrom = analyticPageFrom;
        this.analyticsLocation = analyticsLocation;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    /* JADX INFO: renamed from: eablkybsjg, reason: from getter */
    public final AnalyticsLocation getAnalyticsLocation() {
        return this.analyticsLocation;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof HintDialogAnalyticsInfo)) {
            return false;
        }
        HintDialogAnalyticsInfo hintDialogAnalyticsInfo = (HintDialogAnalyticsInfo) other;
        return zdlpuopuiu.eablkybsjg(this.analyticElement, hintDialogAnalyticsInfo.analyticElement) && zdlpuopuiu.eablkybsjg(this.analyticPageFrom, hintDialogAnalyticsInfo.analyticPageFrom) && zdlpuopuiu.eablkybsjg(this.analyticsLocation, hintDialogAnalyticsInfo.analyticsLocation);
    }

    public int hashCode() {
        int iHashCode = ((this.analyticElement.hashCode() * 31) + this.analyticPageFrom.hashCode()) * 31;
        AnalyticsLocation analyticsLocation = this.analyticsLocation;
        return iHashCode + (analyticsLocation == null ? 0 : analyticsLocation.hashCode());
    }

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: from getter */
    public final AnalyticsPage getAnalyticPageFrom() {
        return this.analyticPageFrom;
    }

    public String toString() {
        return "HintDialogAnalyticsInfo(analyticElement=" + this.analyticElement + ", analyticPageFrom=" + this.analyticPageFrom + ", analyticsLocation=" + this.analyticsLocation + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        zdlpuopuiu.btonecajqb(dest, "dest");
        dest.writeParcelable(this.analyticElement, flags);
        dest.writeParcelable(this.analyticPageFrom, flags);
        dest.writeParcelable(this.analyticsLocation, flags);
    }

    /* JADX INFO: renamed from: zoijcleaow, reason: from getter */
    public final AnalyticElement getAnalyticElement() {
        return this.analyticElement;
    }

    public /* synthetic */ HintDialogAnalyticsInfo(AnalyticElement analyticElement, AnalyticsPage analyticsPage, AnalyticsLocation analyticsLocation, int i13, gtknphoqwx gtknphoqwxVar) {
        this(analyticElement, analyticsPage, (i13 & 4) != 0 ? null : analyticsLocation);
    }
}
