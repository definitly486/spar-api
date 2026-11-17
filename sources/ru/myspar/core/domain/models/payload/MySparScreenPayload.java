package ru.myspar.core.domain.models.payload;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.gtknphoqwx;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0010\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u001eB1\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\t\u0010\nJ\u001d\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u0010\u0010\u0011J\r\u0010\u0012\u001a\u00020\r¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0013J\u001a\u0010\u001a\u001a\u00020\u00192\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017HÖ\u0003¢\u0006\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010\u0015R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b'\u0010!\u001a\u0004\b(\u0010\u0015¨\u0006)"}, d2 = {"Lru/myspar/core/domain/models/payload/MySparScreenPayload;", "Landroid/os/Parcelable;", "Lru/myspar/core/domain/models/payload/MySparScreenPayload$zoijcleaow;", "extraAction", "", "orderId", "Lf40/zoijcleaow;", "navigationLink", "reference", "<init>", "(Lru/myspar/core/domain/models/payload/MySparScreenPayload$zoijcleaow;Ljava/lang/String;Lf40/zoijcleaow;Ljava/lang/String;)V", "Landroid/os/Parcel;", "dest", "", "flags", "Lgg/wwaezpbzkn;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "zdlpuopuiu", "Lru/myspar/core/domain/models/payload/MySparScreenPayload$zoijcleaow;", "zoijcleaow", "()Lru/myspar/core/domain/models/payload/MySparScreenPayload$zoijcleaow;", "yggfygwlhe", "Ljava/lang/String;", "eablkybsjg", "jyumaefscl", "Lf40/zoijcleaow;", "ppxfxbqfkf", "()Lf40/zoijcleaow;", "iwizpuwonk", "gxszxtbevo", "domain_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class MySparScreenPayload implements Parcelable {
    public static final Parcelable.Creator<MySparScreenPayload> CREATOR = new iobyxmoadg();

    /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name and from kotlin metadata and from toString */
    private final String reference;

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name and from kotlin metadata and from toString */
    private final f40.zoijcleaow navigationLink;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name and from kotlin metadata and from toString */
    private final String orderId;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name and from kotlin metadata and from toString */
    private final zoijcleaow extraAction;

    public static final class iobyxmoadg implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public final MySparScreenPayload createFromParcel(Parcel parcel) {
            zdlpuopuiu.btonecajqb(parcel, "parcel");
            return new MySparScreenPayload(zoijcleaow.valueOf(parcel.readString()), parcel.readString(), f40.zoijcleaow.valueOf(parcel.readString()), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: zoijcleaow, reason: merged with bridge method [inline-methods] */
        public final MySparScreenPayload[] newArray(int i13) {
            return new MySparScreenPayload[i13];
        }
    }

    public enum zoijcleaow {
        CART,
        PRODUCT,
        ORDER,
        BROWSER,
        NONE;


        /* JADX INFO: renamed from: lereixgezr, reason: collision with root package name */
        private static final /* synthetic */ ng.iobyxmoadg f87161lereixgezr = ng.zoijcleaow.iobyxmoadg(iobyxmoadg());
    }

    public MySparScreenPayload(zoijcleaow extraAction, String orderId, f40.zoijcleaow navigationLink, String str) {
        zdlpuopuiu.btonecajqb(extraAction, "extraAction");
        zdlpuopuiu.btonecajqb(orderId, "orderId");
        zdlpuopuiu.btonecajqb(navigationLink, "navigationLink");
        this.extraAction = extraAction;
        this.orderId = orderId;
        this.navigationLink = navigationLink;
        this.reference = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    /* JADX INFO: renamed from: eablkybsjg, reason: from getter */
    public final String getOrderId() {
        return this.orderId;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MySparScreenPayload)) {
            return false;
        }
        MySparScreenPayload mySparScreenPayload = (MySparScreenPayload) other;
        return this.extraAction == mySparScreenPayload.extraAction && zdlpuopuiu.eablkybsjg(this.orderId, mySparScreenPayload.orderId) && this.navigationLink == mySparScreenPayload.navigationLink && zdlpuopuiu.eablkybsjg(this.reference, mySparScreenPayload.reference);
    }

    /* JADX INFO: renamed from: gxszxtbevo, reason: from getter */
    public final String getReference() {
        return this.reference;
    }

    public int hashCode() {
        int iHashCode = ((((this.extraAction.hashCode() * 31) + this.orderId.hashCode()) * 31) + this.navigationLink.hashCode()) * 31;
        String str = this.reference;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: from getter */
    public final f40.zoijcleaow getNavigationLink() {
        return this.navigationLink;
    }

    public String toString() {
        return "MySparScreenPayload(extraAction=" + this.extraAction + ", orderId=" + this.orderId + ", navigationLink=" + this.navigationLink + ", reference=" + this.reference + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        zdlpuopuiu.btonecajqb(dest, "dest");
        dest.writeString(this.extraAction.name());
        dest.writeString(this.orderId);
        dest.writeString(this.navigationLink.name());
        dest.writeString(this.reference);
    }

    /* JADX INFO: renamed from: zoijcleaow, reason: from getter */
    public final zoijcleaow getExtraAction() {
        return this.extraAction;
    }

    public /* synthetic */ MySparScreenPayload(zoijcleaow zoijcleaowVar, String str, f40.zoijcleaow zoijcleaowVar2, String str2, int i13, gtknphoqwx gtknphoqwxVar) {
        this((i13 & 1) != 0 ? zoijcleaow.NONE : zoijcleaowVar, (i13 & 2) != 0 ? "" : str, (i13 & 4) != 0 ? f40.zoijcleaow.NONE : zoijcleaowVar2, (i13 & 8) != 0 ? null : str2);
    }
}
