package ru.myspar.domain.feature.sharepromo.store;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.gtknphoqwx;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: renamed from: ru.myspar.domain.feature.sharepromo.store.SharePromoStore$State, reason: from toString */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0002\b\u0013\b\u0087\b\u0018\u00002\u00020\u0001BE\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0002\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\t\u001a\u00020\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u001f\u0010\u0011\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0007¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\u000eH\u0007¢\u0006\u0004\b\u0013\u0010\u0014JN\u0010\u0016\u001a\u00020\u00152\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u0007HÇ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0002H×\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u000eH×\u0001¢\u0006\u0004\b\u001a\u0010\u0014J\u001a\u0010\u001d\u001a\u00020\u00072\b\u0010\u001c\u001a\u0004\u0018\u00010\u001bH×\u0003¢\u0006\u0004\b\u001d\u0010\u001eR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\u0019R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\"\u0010 \u001a\u0004\b#\u0010\u0019R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b$\u0010 \u001a\u0004\b%\u0010\u0019R\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b&\u0010 \u001a\u0004\b'\u0010\u0019R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+R\u0017\u0010\t\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b,\u0010)\u001a\u0004\b-\u0010+¨\u0006."}, d2 = {"ru/myspar/domain/feature/sharepromo/store/SharePromoStore$State", "Landroid/os/Parcelable;", "", "image", "text", "promoCode", "shareMsg", "", "isPromoAvailable", "isLoading", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZ)V", "Landroid/os/Parcel;", "dest", "", "flags", "Lgg/wwaezpbzkn;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "Lru/myspar/domain/feature/sharepromo/store/SharePromoStore$State;", "zoijcleaow", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZ)Lru/myspar/domain/feature/sharepromo/store/SharePromoStore$State;", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "equals", "(Ljava/lang/Object;)Z", "zdlpuopuiu", "Ljava/lang/String;", "eablkybsjg", "yggfygwlhe", "nufgyqmvbu", "jyumaefscl", "gxszxtbevo", "iwizpuwonk", "lqeggnwhkg", "cqumvgiudr", "Z", "btonecajqb", "()Z", "esjtqupxsv", "dxjokdxxww", "legacy_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class State implements Parcelable {
    public static final Parcelable.Creator<State> CREATOR = new iobyxmoadg();

    /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean isPromoAvailable;

    /* JADX INFO: renamed from: esjtqupxsv, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean isLoading;

    /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name and from kotlin metadata and from toString */
    private final String shareMsg;

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name and from kotlin metadata and from toString */
    private final String promoCode;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name and from kotlin metadata and from toString */
    private final String text;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name and from kotlin metadata and from toString */
    private final String image;

    /* JADX INFO: renamed from: ru.myspar.domain.feature.sharepromo.store.SharePromoStore$State$iobyxmoadg */
    public static final class iobyxmoadg implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public final State createFromParcel(Parcel parcel) {
            zdlpuopuiu.btonecajqb(parcel, "parcel");
            return new State(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() != 0, parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: zoijcleaow, reason: merged with bridge method [inline-methods] */
        public final State[] newArray(int i13) {
            return new State[i13];
        }
    }

    public State(String str, String text, String promoCode, String shareMsg, boolean z13, boolean z14) {
        zdlpuopuiu.btonecajqb(text, "text");
        zdlpuopuiu.btonecajqb(promoCode, "promoCode");
        zdlpuopuiu.btonecajqb(shareMsg, "shareMsg");
        this.image = str;
        this.text = text;
        this.promoCode = promoCode;
        this.shareMsg = shareMsg;
        this.isPromoAvailable = z13;
        this.isLoading = z14;
    }

    public static /* synthetic */ State ppxfxbqfkf(State state, String str, String str2, String str3, String str4, boolean z13, boolean z14, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = state.image;
        }
        if ((i13 & 2) != 0) {
            str2 = state.text;
        }
        String str5 = str2;
        if ((i13 & 4) != 0) {
            str3 = state.promoCode;
        }
        String str6 = str3;
        if ((i13 & 8) != 0) {
            str4 = state.shareMsg;
        }
        String str7 = str4;
        if ((i13 & 16) != 0) {
            z13 = state.isPromoAvailable;
        }
        boolean z15 = z13;
        if ((i13 & 32) != 0) {
            z14 = state.isLoading;
        }
        return state.zoijcleaow(str, str5, str6, str7, z15, z14);
    }

    /* JADX INFO: renamed from: btonecajqb, reason: from getter */
    public final boolean getIsPromoAvailable() {
        return this.isPromoAvailable;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    /* JADX INFO: renamed from: dxjokdxxww, reason: from getter */
    public final boolean getIsLoading() {
        return this.isLoading;
    }

    /* JADX INFO: renamed from: eablkybsjg, reason: from getter */
    public final String getImage() {
        return this.image;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof State)) {
            return false;
        }
        State state = (State) other;
        return zdlpuopuiu.eablkybsjg(this.image, state.image) && zdlpuopuiu.eablkybsjg(this.text, state.text) && zdlpuopuiu.eablkybsjg(this.promoCode, state.promoCode) && zdlpuopuiu.eablkybsjg(this.shareMsg, state.shareMsg) && this.isPromoAvailable == state.isPromoAvailable && this.isLoading == state.isLoading;
    }

    /* JADX INFO: renamed from: gxszxtbevo, reason: from getter */
    public final String getPromoCode() {
        return this.promoCode;
    }

    public int hashCode() {
        String str = this.image;
        return ((((((((((str == null ? 0 : str.hashCode()) * 31) + this.text.hashCode()) * 31) + this.promoCode.hashCode()) * 31) + this.shareMsg.hashCode()) * 31) + Boolean.hashCode(this.isPromoAvailable)) * 31) + Boolean.hashCode(this.isLoading);
    }

    /* JADX INFO: renamed from: lqeggnwhkg, reason: from getter */
    public final String getShareMsg() {
        return this.shareMsg;
    }

    /* JADX INFO: renamed from: nufgyqmvbu, reason: from getter */
    public final String getText() {
        return this.text;
    }

    public String toString() {
        return "State(image=" + this.image + ", text=" + this.text + ", promoCode=" + this.promoCode + ", shareMsg=" + this.shareMsg + ", isPromoAvailable=" + this.isPromoAvailable + ", isLoading=" + this.isLoading + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        zdlpuopuiu.btonecajqb(dest, "dest");
        dest.writeString(this.image);
        dest.writeString(this.text);
        dest.writeString(this.promoCode);
        dest.writeString(this.shareMsg);
        dest.writeInt(this.isPromoAvailable ? 1 : 0);
        dest.writeInt(this.isLoading ? 1 : 0);
    }

    public final State zoijcleaow(String image, String text, String promoCode, String shareMsg, boolean isPromoAvailable, boolean isLoading) {
        zdlpuopuiu.btonecajqb(text, "text");
        zdlpuopuiu.btonecajqb(promoCode, "promoCode");
        zdlpuopuiu.btonecajqb(shareMsg, "shareMsg");
        return new State(image, text, promoCode, shareMsg, isPromoAvailable, isLoading);
    }

    public /* synthetic */ State(String str, String str2, String str3, String str4, boolean z13, boolean z14, int i13, gtknphoqwx gtknphoqwxVar) {
        this((i13 & 1) != 0 ? null : str, (i13 & 2) != 0 ? "" : str2, (i13 & 4) != 0 ? "" : str3, (i13 & 8) == 0 ? str4 : "", (i13 & 16) != 0 ? false : z13, (i13 & 32) != 0 ? false : z14);
    }
}
