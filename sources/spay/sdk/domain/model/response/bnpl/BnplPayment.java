package spay.sdk.domain.model.response.bnpl;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.zdlpuopuiu;
import modern.payments.ecomAndroid.util.externalMetrics.ExternalMetricsManagerImpl;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0081\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\nJ.\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0010\u0010\nJ\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u0013J \u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001c\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010 \u001a\u0004\b!\u0010\nR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\"\u001a\u0004\b#\u0010\fR\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010 \u001a\u0004\b$\u0010\n¨\u0006%"}, d2 = {"Lspay/sdk/domain/model/response/bnpl/BnplPayment;", "Landroid/os/Parcelable;", "", ExternalMetricsManagerImpl.DATE, "", "amount", "currencyCode", "<init>", "(Ljava/lang/String;JLjava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "()J", "component3", "copy", "(Ljava/lang/String;JLjava/lang/String;)Lspay/sdk/domain/model/response/bnpl/BnplPayment;", "toString", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lgg/wwaezpbzkn;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getDate", "J", "getAmount", "getCurrencyCode", "SPaySDK_baseRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class BnplPayment implements Parcelable {
    public static final Parcelable.Creator<BnplPayment> CREATOR = new Creator();
    private final long amount;
    private final String currencyCode;
    private final String date;

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<BnplPayment> {
        @Override // android.os.Parcelable.Creator
        public final BnplPayment createFromParcel(Parcel parcel) {
            zdlpuopuiu.btonecajqb(parcel, "parcel");
            return new BnplPayment(parcel.readString(), parcel.readLong(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final BnplPayment[] newArray(int i13) {
            return new BnplPayment[i13];
        }
    }

    public BnplPayment(String date, long j13, String currencyCode) {
        zdlpuopuiu.btonecajqb(date, "date");
        zdlpuopuiu.btonecajqb(currencyCode, "currencyCode");
        this.date = date;
        this.amount = j13;
        this.currencyCode = currencyCode;
    }

    public static /* synthetic */ BnplPayment copy$default(BnplPayment bnplPayment, String str, long j13, String str2, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = bnplPayment.date;
        }
        if ((i13 & 2) != 0) {
            j13 = bnplPayment.amount;
        }
        if ((i13 & 4) != 0) {
            str2 = bnplPayment.currencyCode;
        }
        return bnplPayment.copy(str, j13, str2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getDate() {
        return this.date;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final long getAmount() {
        return this.amount;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getCurrencyCode() {
        return this.currencyCode;
    }

    public final BnplPayment copy(String date, long amount, String currencyCode) {
        zdlpuopuiu.btonecajqb(date, "date");
        zdlpuopuiu.btonecajqb(currencyCode, "currencyCode");
        return new BnplPayment(date, amount, currencyCode);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BnplPayment)) {
            return false;
        }
        BnplPayment bnplPayment = (BnplPayment) other;
        return zdlpuopuiu.eablkybsjg(this.date, bnplPayment.date) && this.amount == bnplPayment.amount && zdlpuopuiu.eablkybsjg(this.currencyCode, bnplPayment.currencyCode);
    }

    public final long getAmount() {
        return this.amount;
    }

    public final String getCurrencyCode() {
        return this.currencyCode;
    }

    public final String getDate() {
        return this.date;
    }

    public int hashCode() {
        return this.currencyCode.hashCode() + ((Long.hashCode(this.amount) + (this.date.hashCode() * 31)) * 31);
    }

    public String toString() {
        return "BnplPayment(date=" + this.date + ", amount=" + this.amount + ", currencyCode=" + this.currencyCode + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int flags) {
        zdlpuopuiu.btonecajqb(parcel, "out");
        parcel.writeString(this.date);
        parcel.writeLong(this.amount);
        parcel.writeString(this.currencyCode);
    }
}
