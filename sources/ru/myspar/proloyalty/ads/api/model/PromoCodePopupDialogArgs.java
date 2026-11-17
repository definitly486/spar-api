package ru.myspar.proloyalty.ads.api.model;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0012\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002BO\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0003\u0012\b\b\u0002\u0010\b\u001a\u00020\u0003\u0012\b\b\u0002\u0010\t\u001a\u00020\u0003\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u001d\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0012\u0010\u0013J\r\u0010\u0014\u001a\u00020\u000f¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0015J\u001a\u0010\u001b\u001a\u00020\u001a2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001b\u0010\u001cR\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010\u0017R\u001a\u0010\u0005\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b \u0010\u001e\u001a\u0004\b!\u0010\u0017R\u0017\u0010\u0006\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\"\u0010\u001e\u001a\u0004\b#\u0010\u0017R\u0017\u0010\u0007\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b$\u0010\u001e\u001a\u0004\b%\u0010\u0017R\u0017\u0010\b\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b&\u0010\u001e\u001a\u0004\b'\u0010\u0017R\u0017\u0010\t\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b(\u0010\u001e\u001a\u0004\b)\u0010\u0017R\u0019\u0010\n\u001a\u0004\u0018\u00010\u00038\u0006¢\u0006\f\n\u0004\b*\u0010\u001e\u001a\u0004\b+\u0010\u0017¨\u0006,"}, d2 = {"Lru/myspar/proloyalty/ads/api/model/PromoCodePopupDialogArgs;", "", "Landroid/os/Parcelable;", "", "popupId", "groupCode", "title", "subtitle", "subtitleText", "text", "promoCode", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "Landroid/os/Parcel;", "dest", "", "flags", "Lgg/wwaezpbzkn;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "toString", "()Ljava/lang/String;", "hashCode", "other", "", "equals", "(Ljava/lang/Object;)Z", "zdlpuopuiu", "Ljava/lang/String;", "ppxfxbqfkf", "yggfygwlhe", "zoijcleaow", "jyumaefscl", "dxjokdxxww", "iwizpuwonk", "gxszxtbevo", "cqumvgiudr", "lqeggnwhkg", "esjtqupxsv", "nufgyqmvbu", "lereixgezr", "eablkybsjg", "api_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class PromoCodePopupDialogArgs implements Parcelable {
    public static final Parcelable.Creator<PromoCodePopupDialogArgs> CREATOR = new iobyxmoadg();

    /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name and from kotlin metadata and from toString */
    private final String subtitleText;

    /* JADX INFO: renamed from: esjtqupxsv, reason: collision with root package name and from kotlin metadata and from toString */
    private final String text;

    /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name and from kotlin metadata and from toString */
    private final String subtitle;

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name and from kotlin metadata and from toString */
    private final String title;

    /* JADX INFO: renamed from: lereixgezr, reason: collision with root package name and from kotlin metadata and from toString */
    private final String promoCode;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name and from kotlin metadata and from toString */
    private final String groupCode;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name and from kotlin metadata and from toString */
    private final String popupId;

    public static final class iobyxmoadg implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public final PromoCodePopupDialogArgs createFromParcel(Parcel parcel) {
            zdlpuopuiu.btonecajqb(parcel, "parcel");
            return new PromoCodePopupDialogArgs(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: zoijcleaow, reason: merged with bridge method [inline-methods] */
        public final PromoCodePopupDialogArgs[] newArray(int i13) {
            return new PromoCodePopupDialogArgs[i13];
        }
    }

    public PromoCodePopupDialogArgs(String popupId, String groupCode, String title, String subtitle, String subtitleText, String text, String str) {
        zdlpuopuiu.btonecajqb(popupId, "popupId");
        zdlpuopuiu.btonecajqb(groupCode, "groupCode");
        zdlpuopuiu.btonecajqb(title, "title");
        zdlpuopuiu.btonecajqb(subtitle, "subtitle");
        zdlpuopuiu.btonecajqb(subtitleText, "subtitleText");
        zdlpuopuiu.btonecajqb(text, "text");
        this.popupId = popupId;
        this.groupCode = groupCode;
        this.title = title;
        this.subtitle = subtitle;
        this.subtitleText = subtitleText;
        this.text = text;
        this.promoCode = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    /* JADX INFO: renamed from: dxjokdxxww, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* JADX INFO: renamed from: eablkybsjg, reason: from getter */
    public final String getPromoCode() {
        return this.promoCode;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PromoCodePopupDialogArgs)) {
            return false;
        }
        PromoCodePopupDialogArgs promoCodePopupDialogArgs = (PromoCodePopupDialogArgs) other;
        return zdlpuopuiu.eablkybsjg(this.popupId, promoCodePopupDialogArgs.popupId) && zdlpuopuiu.eablkybsjg(this.groupCode, promoCodePopupDialogArgs.groupCode) && zdlpuopuiu.eablkybsjg(this.title, promoCodePopupDialogArgs.title) && zdlpuopuiu.eablkybsjg(this.subtitle, promoCodePopupDialogArgs.subtitle) && zdlpuopuiu.eablkybsjg(this.subtitleText, promoCodePopupDialogArgs.subtitleText) && zdlpuopuiu.eablkybsjg(this.text, promoCodePopupDialogArgs.text) && zdlpuopuiu.eablkybsjg(this.promoCode, promoCodePopupDialogArgs.promoCode);
    }

    /* JADX INFO: renamed from: gxszxtbevo, reason: from getter */
    public final String getSubtitle() {
        return this.subtitle;
    }

    public int hashCode() {
        int iHashCode = ((((((((((this.popupId.hashCode() * 31) + this.groupCode.hashCode()) * 31) + this.title.hashCode()) * 31) + this.subtitle.hashCode()) * 31) + this.subtitleText.hashCode()) * 31) + this.text.hashCode()) * 31;
        String str = this.promoCode;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    /* JADX INFO: renamed from: lqeggnwhkg, reason: from getter */
    public final String getSubtitleText() {
        return this.subtitleText;
    }

    /* JADX INFO: renamed from: nufgyqmvbu, reason: from getter */
    public final String getText() {
        return this.text;
    }

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: from getter */
    public String getPopupId() {
        return this.popupId;
    }

    public String toString() {
        return "PromoCodePopupDialogArgs(popupId=" + this.popupId + ", groupCode=" + this.groupCode + ", title=" + this.title + ", subtitle=" + this.subtitle + ", subtitleText=" + this.subtitleText + ", text=" + this.text + ", promoCode=" + this.promoCode + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        zdlpuopuiu.btonecajqb(dest, "dest");
        dest.writeString(this.popupId);
        dest.writeString(this.groupCode);
        dest.writeString(this.title);
        dest.writeString(this.subtitle);
        dest.writeString(this.subtitleText);
        dest.writeString(this.text);
        dest.writeString(this.promoCode);
    }

    /* JADX INFO: renamed from: zoijcleaow, reason: from getter */
    public String getGroupCode() {
        return this.groupCode;
    }
}
