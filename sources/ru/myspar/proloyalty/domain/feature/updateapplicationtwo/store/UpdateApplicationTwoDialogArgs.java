package ru.myspar.proloyalty.domain.feature.updateapplicationtwo.store;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.gtknphoqwx;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0012\b\u0087\b\u0018\u00002\u00020\u0001BM\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0002\u0012\b\b\u0002\u0010\b\u001a\u00020\u0002\u0012\b\b\u0002\u0010\t\u001a\u00020\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u001f\u0010\u0011\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0007¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\u000eH\u0007¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0002H×\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u000eH×\u0001¢\u0006\u0004\b\u0017\u0010\u0014J\u001a\u0010\u001b\u001a\u00020\u001a2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018H×\u0003¢\u0006\u0004\b\u001b\u0010\u001cR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010\u0016R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b \u0010\u001e\u001a\u0004\b!\u0010\u0016R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\"\u0010\u001e\u001a\u0004\b#\u0010\u0016R\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b$\u0010\u001e\u001a\u0004\b%\u0010\u0016R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b&\u0010\u001e\u001a\u0004\b'\u0010\u0016R\u0017\u0010\b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b(\u0010\u001e\u001a\u0004\b)\u0010\u0016R\u0017\u0010\t\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b*\u0010\u001e\u001a\u0004\b+\u0010\u0016¨\u0006,"}, d2 = {"Lru/myspar/proloyalty/domain/feature/updateapplicationtwo/store/UpdateApplicationTwoDialogArgs;", "Landroid/os/Parcelable;", "", "popupId", "groupCode", "title", "subtitle", "text", "buttonText", "image", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "Landroid/os/Parcel;", "dest", "", "flags", "Lgg/wwaezpbzkn;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "zdlpuopuiu", "Ljava/lang/String;", "getPopupId", "yggfygwlhe", "getGroupCode", "jyumaefscl", "gxszxtbevo", "iwizpuwonk", "ppxfxbqfkf", "cqumvgiudr", "eablkybsjg", "esjtqupxsv", "istkbnxepw", "lereixgezr", "zoijcleaow", "legacy_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class UpdateApplicationTwoDialogArgs implements Parcelable {
    public static final Parcelable.Creator<UpdateApplicationTwoDialogArgs> CREATOR = new iobyxmoadg();

    /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name and from kotlin metadata and from toString */
    private final String text;

    /* JADX INFO: renamed from: esjtqupxsv, reason: collision with root package name and from kotlin metadata and from toString */
    private final String buttonText;

    /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name and from kotlin metadata and from toString */
    private final String subtitle;

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name and from kotlin metadata and from toString */
    private final String title;

    /* JADX INFO: renamed from: lereixgezr, reason: collision with root package name and from kotlin metadata and from toString */
    private final String image;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name and from kotlin metadata and from toString */
    private final String groupCode;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name and from kotlin metadata and from toString */
    private final String popupId;

    public static final class iobyxmoadg implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public final UpdateApplicationTwoDialogArgs createFromParcel(Parcel parcel) {
            zdlpuopuiu.btonecajqb(parcel, "parcel");
            return new UpdateApplicationTwoDialogArgs(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: zoijcleaow, reason: merged with bridge method [inline-methods] */
        public final UpdateApplicationTwoDialogArgs[] newArray(int i13) {
            return new UpdateApplicationTwoDialogArgs[i13];
        }
    }

    public UpdateApplicationTwoDialogArgs(String popupId, String groupCode, String title, String subtitle, String text, String buttonText, String image) {
        zdlpuopuiu.btonecajqb(popupId, "popupId");
        zdlpuopuiu.btonecajqb(groupCode, "groupCode");
        zdlpuopuiu.btonecajqb(title, "title");
        zdlpuopuiu.btonecajqb(subtitle, "subtitle");
        zdlpuopuiu.btonecajqb(text, "text");
        zdlpuopuiu.btonecajqb(buttonText, "buttonText");
        zdlpuopuiu.btonecajqb(image, "image");
        this.popupId = popupId;
        this.groupCode = groupCode;
        this.title = title;
        this.subtitle = subtitle;
        this.text = text;
        this.buttonText = buttonText;
        this.image = image;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    /* JADX INFO: renamed from: eablkybsjg, reason: from getter */
    public final String getText() {
        return this.text;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof UpdateApplicationTwoDialogArgs)) {
            return false;
        }
        UpdateApplicationTwoDialogArgs updateApplicationTwoDialogArgs = (UpdateApplicationTwoDialogArgs) other;
        return zdlpuopuiu.eablkybsjg(this.popupId, updateApplicationTwoDialogArgs.popupId) && zdlpuopuiu.eablkybsjg(this.groupCode, updateApplicationTwoDialogArgs.groupCode) && zdlpuopuiu.eablkybsjg(this.title, updateApplicationTwoDialogArgs.title) && zdlpuopuiu.eablkybsjg(this.subtitle, updateApplicationTwoDialogArgs.subtitle) && zdlpuopuiu.eablkybsjg(this.text, updateApplicationTwoDialogArgs.text) && zdlpuopuiu.eablkybsjg(this.buttonText, updateApplicationTwoDialogArgs.buttonText) && zdlpuopuiu.eablkybsjg(this.image, updateApplicationTwoDialogArgs.image);
    }

    /* JADX INFO: renamed from: gxszxtbevo, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        return (((((((((((this.popupId.hashCode() * 31) + this.groupCode.hashCode()) * 31) + this.title.hashCode()) * 31) + this.subtitle.hashCode()) * 31) + this.text.hashCode()) * 31) + this.buttonText.hashCode()) * 31) + this.image.hashCode();
    }

    /* JADX INFO: renamed from: istkbnxepw, reason: from getter */
    public final String getButtonText() {
        return this.buttonText;
    }

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: from getter */
    public final String getSubtitle() {
        return this.subtitle;
    }

    public String toString() {
        return "UpdateApplicationTwoDialogArgs(popupId=" + this.popupId + ", groupCode=" + this.groupCode + ", title=" + this.title + ", subtitle=" + this.subtitle + ", text=" + this.text + ", buttonText=" + this.buttonText + ", image=" + this.image + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        zdlpuopuiu.btonecajqb(dest, "dest");
        dest.writeString(this.popupId);
        dest.writeString(this.groupCode);
        dest.writeString(this.title);
        dest.writeString(this.subtitle);
        dest.writeString(this.text);
        dest.writeString(this.buttonText);
        dest.writeString(this.image);
    }

    /* JADX INFO: renamed from: zoijcleaow, reason: from getter */
    public final String getImage() {
        return this.image;
    }

    public /* synthetic */ UpdateApplicationTwoDialogArgs(String str, String str2, String str3, String str4, String str5, String str6, String str7, int i13, gtknphoqwx gtknphoqwxVar) {
        this((i13 & 1) != 0 ? "" : str, (i13 & 2) != 0 ? "" : str2, (i13 & 4) != 0 ? "" : str3, (i13 & 8) != 0 ? "" : str4, (i13 & 16) != 0 ? "" : str5, (i13 & 32) != 0 ? "" : str6, (i13 & 64) != 0 ? "" : str7);
    }
}
