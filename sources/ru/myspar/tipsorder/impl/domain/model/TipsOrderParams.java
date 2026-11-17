package ru.myspar.tipsorder.impl.domain.model;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0087\b\u0018\u00002\u00020\u0001B1\u0012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0006\u0010\t\u001a\u00020\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u001f\u0010\u0011\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0007¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\u000eH\u0007¢\u0006\u0004\b\u0013\u0010\u0014J@\u0010\u0015\u001a\u00020\u00002\u0014\b\u0002\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00022\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\b\b\u0002\u0010\t\u001a\u00020\u0003HÇ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0003H×\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u000eH×\u0001¢\u0006\u0004\b\u0019\u0010\u0014J\u001a\u0010\u001d\u001a\u00020\u001c2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001aH×\u0003¢\u0006\u0004\b\u001d\u0010\u001eR#\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00028\u0006¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"R\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&R\u0017\u0010\t\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b)\u0010\u0018¨\u0006*"}, d2 = {"Lru/myspar/tipsorder/impl/domain/model/TipsOrderParams;", "Landroid/os/Parcelable;", "", "", "Lru/myspar/tipsorder/impl/domain/model/TipValue;", "tips", "", "Lru/myspar/tipsorder/impl/domain/model/PaymentMethod;", "payments", "currentPaymentId", "<init>", "(Ljava/util/Map;Ljava/util/Set;Ljava/lang/String;)V", "Landroid/os/Parcel;", "dest", "", "flags", "Lgg/wwaezpbzkn;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "zoijcleaow", "(Ljava/util/Map;Ljava/util/Set;Ljava/lang/String;)Lru/myspar/tipsorder/impl/domain/model/TipsOrderParams;", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "zdlpuopuiu", "Ljava/util/Map;", "lqeggnwhkg", "()Ljava/util/Map;", "yggfygwlhe", "Ljava/util/Set;", "gxszxtbevo", "()Ljava/util/Set;", "jyumaefscl", "Ljava/lang/String;", "eablkybsjg", "impl_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class TipsOrderParams implements Parcelable {
    public static final Parcelable.Creator<TipsOrderParams> CREATOR = new iobyxmoadg();

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name and from kotlin metadata and from toString */
    private final String currentPaymentId;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name and from kotlin metadata and from toString */
    private final Set payments;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name and from kotlin metadata and from toString */
    private final Map tips;

    public static final class iobyxmoadg implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public final TipsOrderParams createFromParcel(Parcel parcel) {
            zdlpuopuiu.btonecajqb(parcel, "parcel");
            int i13 = parcel.readInt();
            LinkedHashMap linkedHashMap = new LinkedHashMap(i13);
            for (int i14 = 0; i14 != i13; i14++) {
                linkedHashMap.put(parcel.readString(), TipValue.CREATOR.createFromParcel(parcel));
            }
            int i15 = parcel.readInt();
            LinkedHashSet linkedHashSet = new LinkedHashSet(i15);
            for (int i16 = 0; i16 != i15; i16++) {
                linkedHashSet.add(parcel.readParcelable(TipsOrderParams.class.getClassLoader()));
            }
            return new TipsOrderParams(linkedHashMap, linkedHashSet, parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: zoijcleaow, reason: merged with bridge method [inline-methods] */
        public final TipsOrderParams[] newArray(int i13) {
            return new TipsOrderParams[i13];
        }
    }

    public TipsOrderParams(Map tips, Set payments, String currentPaymentId) {
        zdlpuopuiu.btonecajqb(tips, "tips");
        zdlpuopuiu.btonecajqb(payments, "payments");
        zdlpuopuiu.btonecajqb(currentPaymentId, "currentPaymentId");
        this.tips = tips;
        this.payments = payments;
        this.currentPaymentId = currentPaymentId;
    }

    public static /* synthetic */ TipsOrderParams ppxfxbqfkf(TipsOrderParams tipsOrderParams, Map map, Set set, String str, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            map = tipsOrderParams.tips;
        }
        if ((i13 & 2) != 0) {
            set = tipsOrderParams.payments;
        }
        if ((i13 & 4) != 0) {
            str = tipsOrderParams.currentPaymentId;
        }
        return tipsOrderParams.zoijcleaow(map, set, str);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    /* JADX INFO: renamed from: eablkybsjg, reason: from getter */
    public final String getCurrentPaymentId() {
        return this.currentPaymentId;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TipsOrderParams)) {
            return false;
        }
        TipsOrderParams tipsOrderParams = (TipsOrderParams) other;
        return zdlpuopuiu.eablkybsjg(this.tips, tipsOrderParams.tips) && zdlpuopuiu.eablkybsjg(this.payments, tipsOrderParams.payments) && zdlpuopuiu.eablkybsjg(this.currentPaymentId, tipsOrderParams.currentPaymentId);
    }

    /* JADX INFO: renamed from: gxszxtbevo, reason: from getter */
    public final Set getPayments() {
        return this.payments;
    }

    public int hashCode() {
        return (((this.tips.hashCode() * 31) + this.payments.hashCode()) * 31) + this.currentPaymentId.hashCode();
    }

    /* JADX INFO: renamed from: lqeggnwhkg, reason: from getter */
    public final Map getTips() {
        return this.tips;
    }

    public String toString() {
        return "TipsOrderParams(tips=" + this.tips + ", payments=" + this.payments + ", currentPaymentId=" + this.currentPaymentId + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        zdlpuopuiu.btonecajqb(dest, "dest");
        Map map = this.tips;
        dest.writeInt(map.size());
        for (Map.Entry entry : map.entrySet()) {
            dest.writeString((String) entry.getKey());
            ((TipValue) entry.getValue()).writeToParcel(dest, flags);
        }
        Set set = this.payments;
        dest.writeInt(set.size());
        Iterator it = set.iterator();
        while (it.hasNext()) {
            dest.writeParcelable((Parcelable) it.next(), flags);
        }
        dest.writeString(this.currentPaymentId);
    }

    public final TipsOrderParams zoijcleaow(Map tips, Set payments, String currentPaymentId) {
        zdlpuopuiu.btonecajqb(tips, "tips");
        zdlpuopuiu.btonecajqb(payments, "payments");
        zdlpuopuiu.btonecajqb(currentPaymentId, "currentPaymentId");
        return new TipsOrderParams(tips, payments, currentPaymentId);
    }
}
