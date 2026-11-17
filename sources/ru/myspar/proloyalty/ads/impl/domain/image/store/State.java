package ru.myspar.proloyalty.ads.impl.domain.image.store;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import kotlin.Metadata;
import kotlin.jvm.internal.gtknphoqwx;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: renamed from: ru.myspar.proloyalty.ads.impl.domain.image.store.ImagePopupDialogStore$State, reason: from toString */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u00000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0016\b\u0087\b\u0018\u00002\u00020\u0001Be\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\b\u001a\u00020\u0002\u0012\b\b\u0002\u0010\t\u001a\u00020\u0002\u0012\b\b\u0002\u0010\n\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\f\u0010\rJ\u001f\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0007¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\u0010H\u0007¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0002H×\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0010H×\u0001¢\u0006\u0004\b\u0019\u0010\u0016J\u001a\u0010\u001d\u001a\u00020\u001c2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001aH×\u0003¢\u0006\u0004\b\u001d\u0010\u001eR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\u0018R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\"\u0010 \u001a\u0004\b#\u0010\u0018R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b$\u0010 \u001a\u0004\b%\u0010\u0018R\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b&\u0010 \u001a\u0004\b'\u0010\u0018R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b(\u0010 \u001a\u0004\b)\u0010\u0018R\u0017\u0010\b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b*\u0010 \u001a\u0004\b+\u0010\u0018R\u0017\u0010\t\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b,\u0010 \u001a\u0004\b-\u0010\u0018R\u0017\u0010\n\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b.\u0010 \u001a\u0004\b/\u0010\u0018R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b0\u0010 \u001a\u0004\b1\u0010\u0018¨\u00062"}, d2 = {"ru/myspar/proloyalty/ads/impl/domain/image/store/ImagePopupDialogStore$State", "Landroid/os/Parcelable;", "", "title", "subtitle", "subtitleText", "text", "buttonText", "imageLink", "popupId", "groupCode", "bannerUrl", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "Landroid/os/Parcel;", "dest", "", "flags", "Lgg/wwaezpbzkn;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "zdlpuopuiu", "Ljava/lang/String;", "nufgyqmvbu", "yggfygwlhe", "eablkybsjg", "jyumaefscl", "gxszxtbevo", "iwizpuwonk", "lqeggnwhkg", "cqumvgiudr", "istkbnxepw", "esjtqupxsv", "ppxfxbqfkf", "lereixgezr", "getPopupId", "pmvmpeiblj", "getGroupCode", "zynmafqrjb", "zoijcleaow", "impl_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class State implements Parcelable {
    public static final Parcelable.Creator<State> CREATOR = new iobyxmoadg();

    /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name and from kotlin metadata and from toString */
    private final String buttonText;

    /* JADX INFO: renamed from: esjtqupxsv, reason: collision with root package name and from kotlin metadata and from toString */
    private final String imageLink;

    /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name and from kotlin metadata and from toString */
    private final String text;

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name and from kotlin metadata and from toString */
    private final String subtitleText;

    /* JADX INFO: renamed from: lereixgezr, reason: collision with root package name and from kotlin metadata and from toString */
    private final String popupId;

    /* JADX INFO: renamed from: pmvmpeiblj, reason: collision with root package name and from kotlin metadata and from toString */
    private final String groupCode;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name and from kotlin metadata and from toString */
    private final String subtitle;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name and from kotlin metadata and from toString */
    private final String title;

    /* JADX INFO: renamed from: zynmafqrjb, reason: collision with root package name and from kotlin metadata and from toString */
    private final String bannerUrl;

    /* JADX INFO: renamed from: ru.myspar.proloyalty.ads.impl.domain.image.store.ImagePopupDialogStore$State$iobyxmoadg */
    public static final class iobyxmoadg implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public final State createFromParcel(Parcel parcel) {
            zdlpuopuiu.btonecajqb(parcel, "parcel");
            return new State(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: zoijcleaow, reason: merged with bridge method [inline-methods] */
        public final State[] newArray(int i13) {
            return new State[i13];
        }
    }

    public State(String title, String subtitle, String subtitleText, String text, String str, String imageLink, String popupId, String groupCode, String str2) {
        zdlpuopuiu.btonecajqb(title, "title");
        zdlpuopuiu.btonecajqb(subtitle, "subtitle");
        zdlpuopuiu.btonecajqb(subtitleText, "subtitleText");
        zdlpuopuiu.btonecajqb(text, "text");
        zdlpuopuiu.btonecajqb(imageLink, "imageLink");
        zdlpuopuiu.btonecajqb(popupId, "popupId");
        zdlpuopuiu.btonecajqb(groupCode, "groupCode");
        this.title = title;
        this.subtitle = subtitle;
        this.subtitleText = subtitleText;
        this.text = text;
        this.buttonText = str;
        this.imageLink = imageLink;
        this.popupId = popupId;
        this.groupCode = groupCode;
        this.bannerUrl = str2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    /* JADX INFO: renamed from: eablkybsjg, reason: from getter */
    public final String getSubtitle() {
        return this.subtitle;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof State)) {
            return false;
        }
        State state = (State) other;
        return zdlpuopuiu.eablkybsjg(this.title, state.title) && zdlpuopuiu.eablkybsjg(this.subtitle, state.subtitle) && zdlpuopuiu.eablkybsjg(this.subtitleText, state.subtitleText) && zdlpuopuiu.eablkybsjg(this.text, state.text) && zdlpuopuiu.eablkybsjg(this.buttonText, state.buttonText) && zdlpuopuiu.eablkybsjg(this.imageLink, state.imageLink) && zdlpuopuiu.eablkybsjg(this.popupId, state.popupId) && zdlpuopuiu.eablkybsjg(this.groupCode, state.groupCode) && zdlpuopuiu.eablkybsjg(this.bannerUrl, state.bannerUrl);
    }

    /* JADX INFO: renamed from: gxszxtbevo, reason: from getter */
    public final String getSubtitleText() {
        return this.subtitleText;
    }

    public int hashCode() {
        int iHashCode = ((((((this.title.hashCode() * 31) + this.subtitle.hashCode()) * 31) + this.subtitleText.hashCode()) * 31) + this.text.hashCode()) * 31;
        String str = this.buttonText;
        int iHashCode2 = (((((((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + this.imageLink.hashCode()) * 31) + this.popupId.hashCode()) * 31) + this.groupCode.hashCode()) * 31;
        String str2 = this.bannerUrl;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    /* JADX INFO: renamed from: istkbnxepw, reason: from getter */
    public final String getButtonText() {
        return this.buttonText;
    }

    /* JADX INFO: renamed from: lqeggnwhkg, reason: from getter */
    public final String getText() {
        return this.text;
    }

    /* JADX INFO: renamed from: nufgyqmvbu, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: from getter */
    public final String getImageLink() {
        return this.imageLink;
    }

    public String toString() {
        return "State(title=" + this.title + ", subtitle=" + this.subtitle + ", subtitleText=" + this.subtitleText + ", text=" + this.text + ", buttonText=" + this.buttonText + ", imageLink=" + this.imageLink + ", popupId=" + this.popupId + ", groupCode=" + this.groupCode + ", bannerUrl=" + this.bannerUrl + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        zdlpuopuiu.btonecajqb(dest, "dest");
        dest.writeString(this.title);
        dest.writeString(this.subtitle);
        dest.writeString(this.subtitleText);
        dest.writeString(this.text);
        dest.writeString(this.buttonText);
        dest.writeString(this.imageLink);
        dest.writeString(this.popupId);
        dest.writeString(this.groupCode);
        dest.writeString(this.bannerUrl);
    }

    /* JADX INFO: renamed from: zoijcleaow, reason: from getter */
    public final String getBannerUrl() {
        return this.bannerUrl;
    }

    public /* synthetic */ State(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, int i13, gtknphoqwx gtknphoqwxVar) {
        this((i13 & 1) != 0 ? "" : str, (i13 & 2) != 0 ? "" : str2, (i13 & 4) != 0 ? "" : str3, (i13 & 8) != 0 ? "" : str4, (i13 & 16) != 0 ? null : str5, (i13 & 32) != 0 ? "" : str6, (i13 & 64) != 0 ? "" : str7, (i13 & UserVerificationMethods.USER_VERIFY_PATTERN) == 0 ? str8 : "", (i13 & UserVerificationMethods.USER_VERIFY_HANDPRINT) == 0 ? str9 : null);
    }
}
