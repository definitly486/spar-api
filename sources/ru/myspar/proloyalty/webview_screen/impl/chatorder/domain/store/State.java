package ru.myspar.proloyalty.webview_screen.impl.chatorder.domain.store;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ImagesContract;
import kotlin.Metadata;
import kotlin.jvm.internal.gtknphoqwx;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: renamed from: ru.myspar.proloyalty.webview_screen.impl.chatorder.domain.store.ChatOrderStore$State, reason: from toString */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u00008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0002\b\r\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\u000e\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000bH\u0007¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\u000bH\u0007¢\u0006\u0004\b\u0010\u0010\u0011J0\u0010\u0013\u001a\u00020\u00122\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002HÇ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0002H×\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u000bH×\u0001¢\u0006\u0004\b\u0017\u0010\u0011J\u001a\u0010\u001a\u001a\u00020\u00042\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018H×\u0003¢\u0006\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u0016R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b#\u0010\u001d\u001a\u0004\b$\u0010\u0016¨\u0006%"}, d2 = {"ru/myspar/proloyalty/webview_screen/impl/chatorder/domain/store/ChatOrderStore$State", "Landroid/os/Parcelable;", "", ImagesContract.URL, "", "isChatOrderEnabled", "token", "<init>", "(Ljava/lang/String;ZLjava/lang/String;)V", "Landroid/os/Parcel;", "dest", "", "flags", "Lgg/wwaezpbzkn;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "Lru/myspar/proloyalty/webview_screen/impl/chatorder/domain/store/ChatOrderStore$State;", "zoijcleaow", "(Ljava/lang/String;ZLjava/lang/String;)Lru/myspar/proloyalty/webview_screen/impl/chatorder/domain/store/ChatOrderStore$State;", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "equals", "(Ljava/lang/Object;)Z", "zdlpuopuiu", "Ljava/lang/String;", "agtfadlqog", "yggfygwlhe", "Z", "gxszxtbevo", "()Z", "jyumaefscl", "eablkybsjg", "impl_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class State implements Parcelable {
    public static final Parcelable.Creator<State> CREATOR = new iobyxmoadg();

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name and from kotlin metadata and from toString */
    private final String token;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean isChatOrderEnabled;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name and from kotlin metadata and from toString */
    private final String url;

    /* JADX INFO: renamed from: ru.myspar.proloyalty.webview_screen.impl.chatorder.domain.store.ChatOrderStore$State$iobyxmoadg */
    public static final class iobyxmoadg implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public final State createFromParcel(Parcel parcel) {
            zdlpuopuiu.btonecajqb(parcel, "parcel");
            return new State(parcel.readString(), parcel.readInt() != 0, parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: zoijcleaow, reason: merged with bridge method [inline-methods] */
        public final State[] newArray(int i13) {
            return new State[i13];
        }
    }

    public State(String url, boolean z13, String str) {
        zdlpuopuiu.btonecajqb(url, "url");
        this.url = url;
        this.isChatOrderEnabled = z13;
        this.token = str;
    }

    public static /* synthetic */ State ppxfxbqfkf(State state, String str, boolean z13, String str2, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = state.url;
        }
        if ((i13 & 2) != 0) {
            z13 = state.isChatOrderEnabled;
        }
        if ((i13 & 4) != 0) {
            str2 = state.token;
        }
        return state.zoijcleaow(str, z13, str2);
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
    public final String getToken() {
        return this.token;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof State)) {
            return false;
        }
        State state = (State) other;
        return zdlpuopuiu.eablkybsjg(this.url, state.url) && this.isChatOrderEnabled == state.isChatOrderEnabled && zdlpuopuiu.eablkybsjg(this.token, state.token);
    }

    /* JADX INFO: renamed from: gxszxtbevo, reason: from getter */
    public final boolean getIsChatOrderEnabled() {
        return this.isChatOrderEnabled;
    }

    public int hashCode() {
        int iHashCode = ((this.url.hashCode() * 31) + Boolean.hashCode(this.isChatOrderEnabled)) * 31;
        String str = this.token;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        return "State(url=" + this.url + ", isChatOrderEnabled=" + this.isChatOrderEnabled + ", token=" + this.token + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        zdlpuopuiu.btonecajqb(dest, "dest");
        dest.writeString(this.url);
        dest.writeInt(this.isChatOrderEnabled ? 1 : 0);
        dest.writeString(this.token);
    }

    public final State zoijcleaow(String url, boolean isChatOrderEnabled, String token) {
        zdlpuopuiu.btonecajqb(url, "url");
        return new State(url, isChatOrderEnabled, token);
    }

    public /* synthetic */ State(String str, boolean z13, String str2, int i13, gtknphoqwx gtknphoqwxVar) {
        this((i13 & 1) != 0 ? "" : str, (i13 & 2) != 0 ? true : z13, (i13 & 4) != 0 ? null : str2);
    }
}
