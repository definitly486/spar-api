package ru.myspar.payment.api.model;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.gtknphoqwx;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0002\b\u0017\b\u0087\b\u0018\u00002\u00020\u0001B=\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u001d\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0014\u0010\u0015J\r\u0010\u0016\u001a\u00020\u0011¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u0017J\u001a\u0010\u001d\u001a\u00020\t2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001bHÖ\u0003¢\u0006\u0004\b\u001d\u0010\u001eR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&R\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b+\u0010,\u001a\u0004\b-\u0010.R\u0019\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b/\u00100\u001a\u0004\b1\u0010\u0019¨\u00062"}, d2 = {"Lru/myspar/payment/api/model/PaymentMethodsArgs;", "Landroid/os/Parcelable;", "Lru/myspar/payment/api/model/PaymentType;", "type", "", "price", "", "Lru/myspar/components/payment/api/models/PaymentModel;", "methods", "", "isPaymentBonuses", "", "change", "<init>", "(Lru/myspar/payment/api/model/PaymentType;Ljava/lang/Double;Ljava/util/List;ZLjava/lang/String;)V", "Landroid/os/Parcel;", "dest", "", "flags", "Lgg/wwaezpbzkn;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "equals", "(Ljava/lang/Object;)Z", "zdlpuopuiu", "Lru/myspar/payment/api/model/PaymentType;", "gxszxtbevo", "()Lru/myspar/payment/api/model/PaymentType;", "yggfygwlhe", "Ljava/lang/Double;", "eablkybsjg", "()Ljava/lang/Double;", "jyumaefscl", "Ljava/util/List;", "ppxfxbqfkf", "()Ljava/util/List;", "iwizpuwonk", "Z", "lqeggnwhkg", "()Z", "cqumvgiudr", "Ljava/lang/String;", "zoijcleaow", "api_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class PaymentMethodsArgs implements Parcelable {
    public static final Parcelable.Creator<PaymentMethodsArgs> CREATOR = new iobyxmoadg();

    /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name and from kotlin metadata and from toString */
    private final String change;

    /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean isPaymentBonuses;

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name and from kotlin metadata and from toString */
    private final List methods;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name and from kotlin metadata and from toString */
    private final Double price;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name and from kotlin metadata and from toString */
    private final PaymentType type;

    public static final class iobyxmoadg implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public final PaymentMethodsArgs createFromParcel(Parcel parcel) {
            zdlpuopuiu.btonecajqb(parcel, "parcel");
            PaymentType paymentType = (PaymentType) parcel.readParcelable(PaymentMethodsArgs.class.getClassLoader());
            Double dValueOf = parcel.readInt() == 0 ? null : Double.valueOf(parcel.readDouble());
            int i13 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i13);
            for (int i14 = 0; i14 != i13; i14++) {
                arrayList.add(parcel.readParcelable(PaymentMethodsArgs.class.getClassLoader()));
            }
            return new PaymentMethodsArgs(paymentType, dValueOf, arrayList, parcel.readInt() != 0, parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: zoijcleaow, reason: merged with bridge method [inline-methods] */
        public final PaymentMethodsArgs[] newArray(int i13) {
            return new PaymentMethodsArgs[i13];
        }
    }

    public PaymentMethodsArgs(PaymentType type, Double d13, List methods, boolean z13, String str) {
        zdlpuopuiu.btonecajqb(type, "type");
        zdlpuopuiu.btonecajqb(methods, "methods");
        this.type = type;
        this.price = d13;
        this.methods = methods;
        this.isPaymentBonuses = z13;
        this.change = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    /* JADX INFO: renamed from: eablkybsjg, reason: from getter */
    public final Double getPrice() {
        return this.price;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PaymentMethodsArgs)) {
            return false;
        }
        PaymentMethodsArgs paymentMethodsArgs = (PaymentMethodsArgs) other;
        return zdlpuopuiu.eablkybsjg(this.type, paymentMethodsArgs.type) && zdlpuopuiu.eablkybsjg(this.price, paymentMethodsArgs.price) && zdlpuopuiu.eablkybsjg(this.methods, paymentMethodsArgs.methods) && this.isPaymentBonuses == paymentMethodsArgs.isPaymentBonuses && zdlpuopuiu.eablkybsjg(this.change, paymentMethodsArgs.change);
    }

    /* JADX INFO: renamed from: gxszxtbevo, reason: from getter */
    public final PaymentType getType() {
        return this.type;
    }

    public int hashCode() {
        int iHashCode = this.type.hashCode() * 31;
        Double d13 = this.price;
        int iHashCode2 = (((((iHashCode + (d13 == null ? 0 : d13.hashCode())) * 31) + this.methods.hashCode()) * 31) + Boolean.hashCode(this.isPaymentBonuses)) * 31;
        String str = this.change;
        return iHashCode2 + (str != null ? str.hashCode() : 0);
    }

    /* JADX INFO: renamed from: lqeggnwhkg, reason: from getter */
    public final boolean getIsPaymentBonuses() {
        return this.isPaymentBonuses;
    }

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: from getter */
    public final List getMethods() {
        return this.methods;
    }

    public String toString() {
        return "PaymentMethodsArgs(type=" + this.type + ", price=" + this.price + ", methods=" + this.methods + ", isPaymentBonuses=" + this.isPaymentBonuses + ", change=" + this.change + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        zdlpuopuiu.btonecajqb(dest, "dest");
        dest.writeParcelable(this.type, flags);
        Double d13 = this.price;
        if (d13 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeDouble(d13.doubleValue());
        }
        List list = this.methods;
        dest.writeInt(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            dest.writeParcelable((Parcelable) it.next(), flags);
        }
        dest.writeInt(this.isPaymentBonuses ? 1 : 0);
        dest.writeString(this.change);
    }

    /* JADX INFO: renamed from: zoijcleaow, reason: from getter */
    public final String getChange() {
        return this.change;
    }

    public /* synthetic */ PaymentMethodsArgs(PaymentType paymentType, Double d13, List list, boolean z13, String str, int i13, gtknphoqwx gtknphoqwxVar) {
        this(paymentType, d13, list, (i13 & 8) != 0 ? false : z13, (i13 & 16) != 0 ? null : str);
    }
}
