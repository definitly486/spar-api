package ru.myspar.webview_screen.impl.myspar.domain;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ImagesContract;
import kotlin.Metadata;
import kotlin.jvm.internal.zdlpuopuiu;
import ru.myspar.analytics.api.model.AnalyticsPage;
import ru.myspar.webview_screen.impl.myspar.domain.args.MySparWebViewTitle;

/* JADX INFO: renamed from: ru.myspar.webview_screen.impl.myspar.domain.MySparWebViewStore$State, reason: from toString */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000<\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0002\b\u0013\b\u0087\b\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bJ\u001f\u0010\u0011\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0007¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\u000eH\u0007¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0004H×\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u000eH×\u0001¢\u0006\u0004\b\u0017\u0010\u0014J\u001a\u0010\u001a\u001a\u00020\u00062\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018H×\u0003¢\u0006\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010\u0016R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&R\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*¨\u0006+"}, d2 = {"ru/myspar/webview_screen/impl/myspar/domain/MySparWebViewStore$State", "Landroid/os/Parcelable;", "Lru/myspar/webview_screen/impl/myspar/domain/args/MySparWebViewTitle;", "actionBarTitle", "", ImagesContract.URL, "", "loadWithOverviewMode", "Lru/myspar/analytics/api/model/AnalyticsPage;", "fromPage", "<init>", "(Lru/myspar/webview_screen/impl/myspar/domain/args/MySparWebViewTitle;Ljava/lang/String;ZLru/myspar/analytics/api/model/AnalyticsPage;)V", "Landroid/os/Parcel;", "dest", "", "flags", "Lgg/wwaezpbzkn;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "equals", "(Ljava/lang/Object;)Z", "zdlpuopuiu", "Lru/myspar/webview_screen/impl/myspar/domain/args/MySparWebViewTitle;", "zoijcleaow", "()Lru/myspar/webview_screen/impl/myspar/domain/args/MySparWebViewTitle;", "yggfygwlhe", "Ljava/lang/String;", "agtfadlqog", "jyumaefscl", "Z", "eablkybsjg", "()Z", "iwizpuwonk", "Lru/myspar/analytics/api/model/AnalyticsPage;", "ppxfxbqfkf", "()Lru/myspar/analytics/api/model/AnalyticsPage;", "impl_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class State implements Parcelable {
    public static final Parcelable.Creator<State> CREATOR = new iobyxmoadg();

    /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name and from kotlin metadata and from toString */
    private final AnalyticsPage fromPage;

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean loadWithOverviewMode;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name and from kotlin metadata and from toString */
    private final String url;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name and from kotlin metadata and from toString */
    private final MySparWebViewTitle actionBarTitle;

    /* JADX INFO: renamed from: ru.myspar.webview_screen.impl.myspar.domain.MySparWebViewStore$State$iobyxmoadg */
    public static final class iobyxmoadg implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public final State createFromParcel(Parcel parcel) {
            zdlpuopuiu.btonecajqb(parcel, "parcel");
            return new State((MySparWebViewTitle) parcel.readParcelable(State.class.getClassLoader()), parcel.readString(), parcel.readInt() != 0, (AnalyticsPage) parcel.readParcelable(State.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: zoijcleaow, reason: merged with bridge method [inline-methods] */
        public final State[] newArray(int i13) {
            return new State[i13];
        }
    }

    public State(MySparWebViewTitle actionBarTitle, String url, boolean z13, AnalyticsPage analyticsPage) {
        zdlpuopuiu.btonecajqb(actionBarTitle, "actionBarTitle");
        zdlpuopuiu.btonecajqb(url, "url");
        this.actionBarTitle = actionBarTitle;
        this.url = url;
        this.loadWithOverviewMode = z13;
        this.fromPage = analyticsPage;
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
    public final boolean getLoadWithOverviewMode() {
        return this.loadWithOverviewMode;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof State)) {
            return false;
        }
        State state = (State) other;
        return zdlpuopuiu.eablkybsjg(this.actionBarTitle, state.actionBarTitle) && zdlpuopuiu.eablkybsjg(this.url, state.url) && this.loadWithOverviewMode == state.loadWithOverviewMode && zdlpuopuiu.eablkybsjg(this.fromPage, state.fromPage);
    }

    public int hashCode() {
        int iHashCode = ((((this.actionBarTitle.hashCode() * 31) + this.url.hashCode()) * 31) + Boolean.hashCode(this.loadWithOverviewMode)) * 31;
        AnalyticsPage analyticsPage = this.fromPage;
        return iHashCode + (analyticsPage == null ? 0 : analyticsPage.hashCode());
    }

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: from getter */
    public final AnalyticsPage getFromPage() {
        return this.fromPage;
    }

    public String toString() {
        return "State(actionBarTitle=" + this.actionBarTitle + ", url=" + this.url + ", loadWithOverviewMode=" + this.loadWithOverviewMode + ", fromPage=" + this.fromPage + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        zdlpuopuiu.btonecajqb(dest, "dest");
        dest.writeParcelable(this.actionBarTitle, flags);
        dest.writeString(this.url);
        dest.writeInt(this.loadWithOverviewMode ? 1 : 0);
        dest.writeParcelable(this.fromPage, flags);
    }

    /* JADX INFO: renamed from: zoijcleaow, reason: from getter */
    public final MySparWebViewTitle getActionBarTitle() {
        return this.actionBarTitle;
    }
}
