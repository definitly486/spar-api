package ru.myspar.proloyalty.user.domain.model;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0002\b\u0011\b\u0087\b\u0018\u00002\u00020\u0001B1\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u001d\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u0010\u0010\u0011J\r\u0010\u0012\u001a\u00020\r¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0013J\u001a\u0010\u0019\u001a\u00020\u00072\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017HÖ\u0003¢\u0006\u0004\b\u0019\u0010\u001aR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u0015R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001c\u001a\u0004\b\u001f\u0010\u0015R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b \u0010\u001c\u001a\u0004\b!\u0010\u0015R\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\"\u0010\u001c\u001a\u0004\b#\u0010\u0015R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'¨\u0006("}, d2 = {"Lru/myspar/proloyalty/user/domain/model/UserSharePromo;", "Landroid/os/Parcelable;", "", "image", "text", "promoCode", "shareMsg", "", "isPromoAvailable", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V", "Landroid/os/Parcel;", "dest", "", "flags", "Lgg/wwaezpbzkn;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "equals", "(Ljava/lang/Object;)Z", "zdlpuopuiu", "Ljava/lang/String;", "zoijcleaow", "yggfygwlhe", "gxszxtbevo", "jyumaefscl", "ppxfxbqfkf", "iwizpuwonk", "eablkybsjg", "cqumvgiudr", "Z", "lqeggnwhkg", "()Z", "user_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class UserSharePromo implements Parcelable {
    public static final Parcelable.Creator<UserSharePromo> CREATOR = new iobyxmoadg();

    /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean isPromoAvailable;

    /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name and from kotlin metadata and from toString */
    private final String shareMsg;

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name and from kotlin metadata and from toString */
    private final String promoCode;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name and from kotlin metadata and from toString */
    private final String text;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name and from kotlin metadata and from toString */
    private final String image;

    public static final class iobyxmoadg implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public final UserSharePromo createFromParcel(Parcel parcel) {
            zdlpuopuiu.btonecajqb(parcel, "parcel");
            return new UserSharePromo(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: zoijcleaow, reason: merged with bridge method [inline-methods] */
        public final UserSharePromo[] newArray(int i13) {
            return new UserSharePromo[i13];
        }
    }

    public UserSharePromo(String str, String text, String promoCode, String shareMsg, boolean z13) {
        zdlpuopuiu.btonecajqb(text, "text");
        zdlpuopuiu.btonecajqb(promoCode, "promoCode");
        zdlpuopuiu.btonecajqb(shareMsg, "shareMsg");
        this.image = str;
        this.text = text;
        this.promoCode = promoCode;
        this.shareMsg = shareMsg;
        this.isPromoAvailable = z13;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    /* JADX INFO: renamed from: eablkybsjg, reason: from getter */
    public final String getShareMsg() {
        return this.shareMsg;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof UserSharePromo)) {
            return false;
        }
        UserSharePromo userSharePromo = (UserSharePromo) other;
        return zdlpuopuiu.eablkybsjg(this.image, userSharePromo.image) && zdlpuopuiu.eablkybsjg(this.text, userSharePromo.text) && zdlpuopuiu.eablkybsjg(this.promoCode, userSharePromo.promoCode) && zdlpuopuiu.eablkybsjg(this.shareMsg, userSharePromo.shareMsg) && this.isPromoAvailable == userSharePromo.isPromoAvailable;
    }

    /* JADX INFO: renamed from: gxszxtbevo, reason: from getter */
    public final String getText() {
        return this.text;
    }

    public int hashCode() {
        String str = this.image;
        return ((((((((str == null ? 0 : str.hashCode()) * 31) + this.text.hashCode()) * 31) + this.promoCode.hashCode()) * 31) + this.shareMsg.hashCode()) * 31) + Boolean.hashCode(this.isPromoAvailable);
    }

    /* JADX INFO: renamed from: lqeggnwhkg, reason: from getter */
    public final boolean getIsPromoAvailable() {
        return this.isPromoAvailable;
    }

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: from getter */
    public final String getPromoCode() {
        return this.promoCode;
    }

    public String toString() {
        return "UserSharePromo(image=" + this.image + ", text=" + this.text + ", promoCode=" + this.promoCode + ", shareMsg=" + this.shareMsg + ", isPromoAvailable=" + this.isPromoAvailable + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        zdlpuopuiu.btonecajqb(dest, "dest");
        dest.writeString(this.image);
        dest.writeString(this.text);
        dest.writeString(this.promoCode);
        dest.writeString(this.shareMsg);
        dest.writeInt(this.isPromoAvailable ? 1 : 0);
    }

    /* JADX INFO: renamed from: zoijcleaow, reason: from getter */
    public final String getImage() {
        return this.image;
    }
}
