package ru.myspar.core.domain.models.payment;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.zdlpuopuiu;
import ng.zoijcleaow;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0002\b\u0017\b\u0087\b\u0018\u00002\u00020\u0001:\u00010BE\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\f\u0010\rJ\u001d\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0013\u0010\u0014J\r\u0010\u0015\u001a\u00020\u0010¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u0016J\u001a\u0010\u001c\u001a\u00020\b2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001aHÖ\u0003¢\u0006\u0004\b\u001c\u0010\u001dR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010\u0018R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b\t\u0010+R\u0019\u0010\n\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b,\u0010#\u001a\u0004\b-\u0010\u0018R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b.\u0010#\u001a\u0004\b/\u0010\u0018¨\u00061"}, d2 = {"Lru/myspar/core/domain/models/payment/PaymentSuccessArgs;", "Landroid/os/Parcelable;", "Lru/myspar/core/domain/models/payment/PaymentSuccessArgs$PaymentSuccessFlow;", "flow", "", "orderId", "", "totalCost", "", "isNeedPassport", "promocodeName", "infoText", "<init>", "(Lru/myspar/core/domain/models/payment/PaymentSuccessArgs$PaymentSuccessFlow;Ljava/lang/String;DZLjava/lang/String;Ljava/lang/String;)V", "Landroid/os/Parcel;", "dest", "", "flags", "Lgg/wwaezpbzkn;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "equals", "(Ljava/lang/Object;)Z", "zdlpuopuiu", "Lru/myspar/core/domain/models/payment/PaymentSuccessArgs$PaymentSuccessFlow;", "getFlow", "()Lru/myspar/core/domain/models/payment/PaymentSuccessArgs$PaymentSuccessFlow;", "yggfygwlhe", "Ljava/lang/String;", "getOrderId", "jyumaefscl", "D", "getTotalCost", "()D", "iwizpuwonk", "Z", "()Z", "cqumvgiudr", "getPromocodeName", "esjtqupxsv", "getInfoText", "PaymentSuccessFlow", "domain_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class PaymentSuccessArgs implements Parcelable {
    public static final Parcelable.Creator<PaymentSuccessArgs> CREATOR = new iobyxmoadg();

    /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name and from kotlin metadata and from toString */
    private final String promocodeName;

    /* JADX INFO: renamed from: esjtqupxsv, reason: collision with root package name and from kotlin metadata and from toString */
    private final String infoText;

    /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean isNeedPassport;

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name and from kotlin metadata and from toString */
    private final double totalCost;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name and from kotlin metadata and from toString */
    private final String orderId;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name and from kotlin metadata and from toString */
    private final PaymentSuccessFlow flow;

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0087\u0081\u0002\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\n\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\n\u0010\u000bJ\r\u0010\f\u001a\u00020\u0007¢\u0006\u0004\b\f\u0010\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010¨\u0006\u0011"}, d2 = {"Lru/myspar/core/domain/models/payment/PaymentSuccessArgs$PaymentSuccessFlow;", "Landroid/os/Parcelable;", "", "<init>", "(Ljava/lang/String;I)V", "Landroid/os/Parcel;", "dest", "", "flags", "Lgg/wwaezpbzkn;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "zdlpuopuiu", "yggfygwlhe", "jyumaefscl", "domain_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public enum PaymentSuccessFlow implements Parcelable {
        DEFAULT,
        SCAN_GO,
        SUBSCRIPTION;


        /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
        private static final /* synthetic */ ng.iobyxmoadg f87182cqumvgiudr = zoijcleaow.iobyxmoadg(lqeggnwhkg());
        public static final Parcelable.Creator<PaymentSuccessFlow> CREATOR = new iobyxmoadg();

        public static final class iobyxmoadg implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
            public final PaymentSuccessFlow createFromParcel(Parcel parcel) {
                zdlpuopuiu.btonecajqb(parcel, "parcel");
                return PaymentSuccessFlow.valueOf(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: zoijcleaow, reason: merged with bridge method [inline-methods] */
            public final PaymentSuccessFlow[] newArray(int i13) {
                return new PaymentSuccessFlow[i13];
            }
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            zdlpuopuiu.btonecajqb(dest, "dest");
            dest.writeString(name());
        }
    }

    public static final class iobyxmoadg implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public final PaymentSuccessArgs createFromParcel(Parcel parcel) {
            zdlpuopuiu.btonecajqb(parcel, "parcel");
            return new PaymentSuccessArgs(PaymentSuccessFlow.CREATOR.createFromParcel(parcel), parcel.readString(), parcel.readDouble(), parcel.readInt() != 0, parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: zoijcleaow, reason: merged with bridge method [inline-methods] */
        public final PaymentSuccessArgs[] newArray(int i13) {
            return new PaymentSuccessArgs[i13];
        }
    }

    public PaymentSuccessArgs(PaymentSuccessFlow flow, String orderId, double d13, boolean z13, String str, String str2) {
        zdlpuopuiu.btonecajqb(flow, "flow");
        zdlpuopuiu.btonecajqb(orderId, "orderId");
        this.flow = flow;
        this.orderId = orderId;
        this.totalCost = d13;
        this.isNeedPassport = z13;
        this.promocodeName = str;
        this.infoText = str2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PaymentSuccessArgs)) {
            return false;
        }
        PaymentSuccessArgs paymentSuccessArgs = (PaymentSuccessArgs) other;
        return this.flow == paymentSuccessArgs.flow && zdlpuopuiu.eablkybsjg(this.orderId, paymentSuccessArgs.orderId) && Double.compare(this.totalCost, paymentSuccessArgs.totalCost) == 0 && this.isNeedPassport == paymentSuccessArgs.isNeedPassport && zdlpuopuiu.eablkybsjg(this.promocodeName, paymentSuccessArgs.promocodeName) && zdlpuopuiu.eablkybsjg(this.infoText, paymentSuccessArgs.infoText);
    }

    public int hashCode() {
        int iHashCode = ((((((this.flow.hashCode() * 31) + this.orderId.hashCode()) * 31) + Double.hashCode(this.totalCost)) * 31) + Boolean.hashCode(this.isNeedPassport)) * 31;
        String str = this.promocodeName;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.infoText;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        return "PaymentSuccessArgs(flow=" + this.flow + ", orderId=" + this.orderId + ", totalCost=" + this.totalCost + ", isNeedPassport=" + this.isNeedPassport + ", promocodeName=" + this.promocodeName + ", infoText=" + this.infoText + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        zdlpuopuiu.btonecajqb(dest, "dest");
        this.flow.writeToParcel(dest, flags);
        dest.writeString(this.orderId);
        dest.writeDouble(this.totalCost);
        dest.writeInt(this.isNeedPassport ? 1 : 0);
        dest.writeString(this.promocodeName);
        dest.writeString(this.infoText);
    }
}
