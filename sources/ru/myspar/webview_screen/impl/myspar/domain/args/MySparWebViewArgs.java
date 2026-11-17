package ru.myspar.webview_screen.impl.myspar.domain.args;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ImagesContract;
import kotlin.Metadata;
import kotlin.jvm.internal.gtknphoqwx;
import kotlin.jvm.internal.zdlpuopuiu;
import ru.myspar.analytics.api.model.AnalyticsPage;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0002\b\u0017\b\u0081\b\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\f\u0010\rJ\u001f\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0007¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\u0010H\u0007¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0004H×\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0010H×\u0001¢\u0006\u0004\b\u0019\u0010\u0016J\u001a\u0010\u001c\u001a\u00020\b2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001aH×\u0003¢\u0006\u0004\b\u001c\u0010\u001dR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010\u0018R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b-\u0010.\u001a\u0004\b/\u00100¨\u00061"}, d2 = {"Lru/myspar/webview_screen/impl/myspar/domain/args/MySparWebViewArgs;", "Landroid/os/Parcelable;", "Lru/myspar/webview_screen/impl/myspar/domain/args/MySparWebViewTitle;", "title", "", ImagesContract.URL, "Leb2/iobyxmoadg;", "scenario", "", "loadWithOverviewMode", "Lru/myspar/analytics/api/model/AnalyticsPage;", "analyticsPageFrom", "<init>", "(Lru/myspar/webview_screen/impl/myspar/domain/args/MySparWebViewTitle;Ljava/lang/String;Leb2/iobyxmoadg;ZLru/myspar/analytics/api/model/AnalyticsPage;)V", "Landroid/os/Parcel;", "dest", "", "flags", "Lgg/wwaezpbzkn;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "equals", "(Ljava/lang/Object;)Z", "zdlpuopuiu", "Lru/myspar/webview_screen/impl/myspar/domain/args/MySparWebViewTitle;", "gxszxtbevo", "()Lru/myspar/webview_screen/impl/myspar/domain/args/MySparWebViewTitle;", "yggfygwlhe", "Ljava/lang/String;", "agtfadlqog", "jyumaefscl", "Leb2/iobyxmoadg;", "eablkybsjg", "()Leb2/iobyxmoadg;", "iwizpuwonk", "Z", "ppxfxbqfkf", "()Z", "cqumvgiudr", "Lru/myspar/analytics/api/model/AnalyticsPage;", "zoijcleaow", "()Lru/myspar/analytics/api/model/AnalyticsPage;", "impl_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class MySparWebViewArgs implements Parcelable {
    public static final Parcelable.Creator<MySparWebViewArgs> CREATOR = new iobyxmoadg();

    /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name and from kotlin metadata and from toString */
    private final AnalyticsPage analyticsPageFrom;

    /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean loadWithOverviewMode;

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name and from kotlin metadata and from toString */
    private final eb2.iobyxmoadg scenario;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name and from kotlin metadata and from toString */
    private final String url;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name and from kotlin metadata and from toString */
    private final MySparWebViewTitle title;

    public static final class iobyxmoadg implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public final MySparWebViewArgs createFromParcel(Parcel parcel) {
            zdlpuopuiu.btonecajqb(parcel, "parcel");
            return new MySparWebViewArgs((MySparWebViewTitle) parcel.readParcelable(MySparWebViewArgs.class.getClassLoader()), parcel.readString(), eb2.iobyxmoadg.valueOf(parcel.readString()), parcel.readInt() != 0, (AnalyticsPage) parcel.readParcelable(MySparWebViewArgs.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: zoijcleaow, reason: merged with bridge method [inline-methods] */
        public final MySparWebViewArgs[] newArray(int i13) {
            return new MySparWebViewArgs[i13];
        }
    }

    public MySparWebViewArgs(MySparWebViewTitle title, String url, eb2.iobyxmoadg scenario, boolean z13, AnalyticsPage analyticsPage) {
        zdlpuopuiu.btonecajqb(title, "title");
        zdlpuopuiu.btonecajqb(url, "url");
        zdlpuopuiu.btonecajqb(scenario, "scenario");
        this.title = title;
        this.url = url;
        this.scenario = scenario;
        this.loadWithOverviewMode = z13;
        this.analyticsPageFrom = analyticsPage;
    }

    /* JADX INFO: renamed from: agtfadlqog, reason: from getter */
    public final String getUrl() {
        return this.url;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    /* JADX INFO: renamed from: eablkybsjg, reason: from getter */
    public final eb2.iobyxmoadg getScenario() {
        return this.scenario;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MySparWebViewArgs)) {
            return false;
        }
        MySparWebViewArgs mySparWebViewArgs = (MySparWebViewArgs) other;
        return zdlpuopuiu.eablkybsjg(this.title, mySparWebViewArgs.title) && zdlpuopuiu.eablkybsjg(this.url, mySparWebViewArgs.url) && this.scenario == mySparWebViewArgs.scenario && this.loadWithOverviewMode == mySparWebViewArgs.loadWithOverviewMode && zdlpuopuiu.eablkybsjg(this.analyticsPageFrom, mySparWebViewArgs.analyticsPageFrom);
    }

    /* JADX INFO: renamed from: gxszxtbevo, reason: from getter */
    public final MySparWebViewTitle getTitle() {
        return this.title;
    }

    public int hashCode() {
        int iHashCode = ((((((this.title.hashCode() * 31) + this.url.hashCode()) * 31) + this.scenario.hashCode()) * 31) + Boolean.hashCode(this.loadWithOverviewMode)) * 31;
        AnalyticsPage analyticsPage = this.analyticsPageFrom;
        return iHashCode + (analyticsPage == null ? 0 : analyticsPage.hashCode());
    }

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: from getter */
    public final boolean getLoadWithOverviewMode() {
        return this.loadWithOverviewMode;
    }

    public String toString() {
        return "MySparWebViewArgs(title=" + this.title + ", url=" + this.url + ", scenario=" + this.scenario + ", loadWithOverviewMode=" + this.loadWithOverviewMode + ", analyticsPageFrom=" + this.analyticsPageFrom + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        zdlpuopuiu.btonecajqb(dest, "dest");
        dest.writeParcelable(this.title, flags);
        dest.writeString(this.url);
        dest.writeString(this.scenario.name());
        dest.writeInt(this.loadWithOverviewMode ? 1 : 0);
        dest.writeParcelable(this.analyticsPageFrom, flags);
    }

    /* JADX INFO: renamed from: zoijcleaow, reason: from getter */
    public final AnalyticsPage getAnalyticsPageFrom() {
        return this.analyticsPageFrom;
    }

    public /* synthetic */ MySparWebViewArgs(MySparWebViewTitle mySparWebViewTitle, String str, eb2.iobyxmoadg iobyxmoadgVar, boolean z13, AnalyticsPage analyticsPage, int i13, gtknphoqwx gtknphoqwxVar) {
        this(mySparWebViewTitle, str, (i13 & 4) != 0 ? eb2.iobyxmoadg.NONE : iobyxmoadgVar, (i13 & 8) != 0 ? false : z13, (i13 & 16) != 0 ? null : analyticsPage);
    }
}
