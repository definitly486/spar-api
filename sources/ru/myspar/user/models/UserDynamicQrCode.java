package ru.myspar.user.models;

import android.os.Parcel;
import android.os.Parcelable;
import java.time.LocalDateTime;
import kotlin.Metadata;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u001d\u0010\u000e\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\u000e\u0010\u000fJ\r\u0010\u0010\u001a\u00020\u000b¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0011J\u001a\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u0013R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b!\u0010\u001b\u001a\u0004\b\"\u0010\u0013¨\u0006#"}, d2 = {"Lru/myspar/user/models/UserDynamicQrCode;", "Landroid/os/Parcelable;", "", "qrCode", "Ljava/time/LocalDateTime;", "codeExpiration", "desc", "<init>", "(Ljava/lang/String;Ljava/time/LocalDateTime;Ljava/lang/String;)V", "Landroid/os/Parcel;", "dest", "", "flags", "Lgg/wwaezpbzkn;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "zdlpuopuiu", "Ljava/lang/String;", "eablkybsjg", "yggfygwlhe", "Ljava/time/LocalDateTime;", "zoijcleaow", "()Ljava/time/LocalDateTime;", "jyumaefscl", "ppxfxbqfkf", "user_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class UserDynamicQrCode implements Parcelable {
    public static final Parcelable.Creator<UserDynamicQrCode> CREATOR = new iobyxmoadg();

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name and from kotlin metadata and from toString */
    private final String desc;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name and from kotlin metadata and from toString */
    private final LocalDateTime codeExpiration;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name and from kotlin metadata and from toString */
    private final String qrCode;

    public static final class iobyxmoadg implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public final UserDynamicQrCode createFromParcel(Parcel parcel) {
            zdlpuopuiu.btonecajqb(parcel, "parcel");
            return new UserDynamicQrCode(parcel.readString(), (LocalDateTime) parcel.readSerializable(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: zoijcleaow, reason: merged with bridge method [inline-methods] */
        public final UserDynamicQrCode[] newArray(int i13) {
            return new UserDynamicQrCode[i13];
        }
    }

    public UserDynamicQrCode(String qrCode, LocalDateTime codeExpiration, String desc) {
        zdlpuopuiu.btonecajqb(qrCode, "qrCode");
        zdlpuopuiu.btonecajqb(codeExpiration, "codeExpiration");
        zdlpuopuiu.btonecajqb(desc, "desc");
        this.qrCode = qrCode;
        this.codeExpiration = codeExpiration;
        this.desc = desc;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    /* JADX INFO: renamed from: eablkybsjg, reason: from getter */
    public final String getQrCode() {
        return this.qrCode;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof UserDynamicQrCode)) {
            return false;
        }
        UserDynamicQrCode userDynamicQrCode = (UserDynamicQrCode) other;
        return zdlpuopuiu.eablkybsjg(this.qrCode, userDynamicQrCode.qrCode) && zdlpuopuiu.eablkybsjg(this.codeExpiration, userDynamicQrCode.codeExpiration) && zdlpuopuiu.eablkybsjg(this.desc, userDynamicQrCode.desc);
    }

    public int hashCode() {
        return (((this.qrCode.hashCode() * 31) + this.codeExpiration.hashCode()) * 31) + this.desc.hashCode();
    }

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: from getter */
    public final String getDesc() {
        return this.desc;
    }

    public String toString() {
        return "UserDynamicQrCode(qrCode=" + this.qrCode + ", codeExpiration=" + this.codeExpiration + ", desc=" + this.desc + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        zdlpuopuiu.btonecajqb(dest, "dest");
        dest.writeString(this.qrCode);
        dest.writeSerializable(this.codeExpiration);
        dest.writeString(this.desc);
    }

    /* JADX INFO: renamed from: zoijcleaow, reason: from getter */
    public final LocalDateTime getCodeExpiration() {
        return this.codeExpiration;
    }
}
