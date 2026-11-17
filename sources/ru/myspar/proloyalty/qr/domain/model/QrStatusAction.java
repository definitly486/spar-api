package ru.myspar.proloyalty.qr.domain.model;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001d\u0010\r\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000eJ\r\u0010\u000f\u001a\u00020\n¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0010J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u0012R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f¨\u0006 "}, d2 = {"Lru/myspar/proloyalty/qr/domain/model/QrStatusAction;", "Landroid/os/Parcelable;", "", "qrcodeId", "Lxk1/iobyxmoadg;", "status", "<init>", "(Ljava/lang/String;Lxk1/iobyxmoadg;)V", "Landroid/os/Parcel;", "dest", "", "flags", "Lgg/wwaezpbzkn;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "zdlpuopuiu", "Ljava/lang/String;", "zoijcleaow", "yggfygwlhe", "Lxk1/iobyxmoadg;", "ppxfxbqfkf", "()Lxk1/iobyxmoadg;", "qr_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class QrStatusAction implements Parcelable {
    public static final Parcelable.Creator<QrStatusAction> CREATOR = new iobyxmoadg();

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name and from kotlin metadata and from toString */
    private final xk1.iobyxmoadg status;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name and from kotlin metadata and from toString */
    private final String qrcodeId;

    public static final class iobyxmoadg implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public final QrStatusAction createFromParcel(Parcel parcel) {
            zdlpuopuiu.btonecajqb(parcel, "parcel");
            return new QrStatusAction(parcel.readString(), xk1.iobyxmoadg.valueOf(parcel.readString()));
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: zoijcleaow, reason: merged with bridge method [inline-methods] */
        public final QrStatusAction[] newArray(int i13) {
            return new QrStatusAction[i13];
        }
    }

    public QrStatusAction(String qrcodeId, xk1.iobyxmoadg status) {
        zdlpuopuiu.btonecajqb(qrcodeId, "qrcodeId");
        zdlpuopuiu.btonecajqb(status, "status");
        this.qrcodeId = qrcodeId;
        this.status = status;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof QrStatusAction)) {
            return false;
        }
        QrStatusAction qrStatusAction = (QrStatusAction) other;
        return zdlpuopuiu.eablkybsjg(this.qrcodeId, qrStatusAction.qrcodeId) && this.status == qrStatusAction.status;
    }

    public int hashCode() {
        return (this.qrcodeId.hashCode() * 31) + this.status.hashCode();
    }

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: from getter */
    public final xk1.iobyxmoadg getStatus() {
        return this.status;
    }

    public String toString() {
        return "QrStatusAction(qrcodeId=" + this.qrcodeId + ", status=" + this.status + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        zdlpuopuiu.btonecajqb(dest, "dest");
        dest.writeString(this.qrcodeId);
        dest.writeString(this.status.name());
    }

    /* JADX INFO: renamed from: zoijcleaow, reason: from getter */
    public final String getQrcodeId() {
        return this.qrcodeId;
    }
}
