package spay.sdk.domain.model.response.bnpl;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.gtknphoqwx;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0081\b\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\u000bJ\u0018\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ6\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005HÆ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u000bJ\u001a\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u000bJ \u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001d\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001f\u0010 R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010!\u001a\u0004\b\"\u0010\u000bR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010!\u001a\u0004\b#\u0010\u000bR\u001f\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0007\u0010$\u001a\u0004\b%\u0010\u000e¨\u0006&"}, d2 = {"Lspay/sdk/domain/model/response/bnpl/SixPartPay;", "Landroid/os/Parcelable;", "", "clientCommission", "count", "", "Lspay/sdk/domain/model/response/bnpl/BnplPayment;", "payments", "<init>", "(IILjava/util/List;)V", "component1", "()I", "component2", "component3", "()Ljava/util/List;", "copy", "(IILjava/util/List;)Lspay/sdk/domain/model/response/bnpl/SixPartPay;", "", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lgg/wwaezpbzkn;", "writeToParcel", "(Landroid/os/Parcel;I)V", "I", "getClientCommission", "getCount", "Ljava/util/List;", "getPayments", "SPaySDK_baseRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class SixPartPay implements Parcelable {
    public static final Parcelable.Creator<SixPartPay> CREATOR = new Creator();
    private final int clientCommission;
    private final int count;
    private final List<BnplPayment> payments;

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<SixPartPay> {
        @Override // android.os.Parcelable.Creator
        public final SixPartPay createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            zdlpuopuiu.btonecajqb(parcel, "parcel");
            int i13 = parcel.readInt();
            int i14 = parcel.readInt();
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i15 = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(i15);
                for (int i16 = 0; i16 != i15; i16++) {
                    arrayList2.add(BnplPayment.CREATOR.createFromParcel(parcel));
                }
                arrayList = arrayList2;
            }
            return new SixPartPay(i13, i14, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final SixPartPay[] newArray(int i13) {
            return new SixPartPay[i13];
        }
    }

    public SixPartPay(int i13, int i14, List<BnplPayment> list) {
        this.clientCommission = i13;
        this.count = i14;
        this.payments = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ SixPartPay copy$default(SixPartPay sixPartPay, int i13, int i14, List list, int i15, Object obj) {
        if ((i15 & 1) != 0) {
            i13 = sixPartPay.clientCommission;
        }
        if ((i15 & 2) != 0) {
            i14 = sixPartPay.count;
        }
        if ((i15 & 4) != 0) {
            list = sixPartPay.payments;
        }
        return sixPartPay.copy(i13, i14, list);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getClientCommission() {
        return this.clientCommission;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getCount() {
        return this.count;
    }

    public final List<BnplPayment> component3() {
        return this.payments;
    }

    public final SixPartPay copy(int clientCommission, int count, List<BnplPayment> payments) {
        return new SixPartPay(clientCommission, count, payments);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SixPartPay)) {
            return false;
        }
        SixPartPay sixPartPay = (SixPartPay) other;
        return this.clientCommission == sixPartPay.clientCommission && this.count == sixPartPay.count && zdlpuopuiu.eablkybsjg(this.payments, sixPartPay.payments);
    }

    public final int getClientCommission() {
        return this.clientCommission;
    }

    public final int getCount() {
        return this.count;
    }

    public final List<BnplPayment> getPayments() {
        return this.payments;
    }

    public int hashCode() {
        int iHashCode = (Integer.hashCode(this.count) + (Integer.hashCode(this.clientCommission) * 31)) * 31;
        List<BnplPayment> list = this.payments;
        return iHashCode + (list == null ? 0 : list.hashCode());
    }

    public String toString() {
        return "SixPartPay(clientCommission=" + this.clientCommission + ", count=" + this.count + ", payments=" + this.payments + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int flags) {
        zdlpuopuiu.btonecajqb(parcel, "out");
        parcel.writeInt(this.clientCommission);
        parcel.writeInt(this.count);
        List<BnplPayment> list = this.payments;
        if (list == null) {
            parcel.writeInt(0);
            return;
        }
        parcel.writeInt(1);
        parcel.writeInt(list.size());
        Iterator<BnplPayment> it = list.iterator();
        while (it.hasNext()) {
            it.next().writeToParcel(parcel, flags);
        }
    }

    public /* synthetic */ SixPartPay(int i13, int i14, List list, int i15, gtknphoqwx gtknphoqwxVar) {
        this(i13, i14, (i15 & 4) != 0 ? null : list);
    }
}
