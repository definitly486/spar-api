package ru.myspar.proloyalty.tipsorder.impl.domain.model;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0007¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\fH\u0007¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0003H×\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\fH×\u0001¢\u0006\u0004\b\u0015\u0010\u0012J\u001a\u0010\u0019\u001a\u00020\u00182\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016H×\u0003¢\u0006\u0004\b\u0019\u0010\u001aR#\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00028\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"¨\u0006#"}, d2 = {"Lru/myspar/proloyalty/tipsorder/impl/domain/model/SendTipsParams;", "Landroid/os/Parcelable;", "", "", "", "tips", "Lru/myspar/proloyalty/tipsorder/impl/domain/model/PaymentMethod;", "chosenPayment", "<init>", "(Ljava/util/Map;Lru/myspar/proloyalty/tipsorder/impl/domain/model/PaymentMethod;)V", "Landroid/os/Parcel;", "dest", "", "flags", "Lgg/wwaezpbzkn;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "zdlpuopuiu", "Ljava/util/Map;", "ppxfxbqfkf", "()Ljava/util/Map;", "yggfygwlhe", "Lru/myspar/proloyalty/tipsorder/impl/domain/model/PaymentMethod;", "zoijcleaow", "()Lru/myspar/proloyalty/tipsorder/impl/domain/model/PaymentMethod;", "impl_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class SendTipsParams implements Parcelable {
    public static final Parcelable.Creator<SendTipsParams> CREATOR = new iobyxmoadg();

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name and from kotlin metadata and from toString */
    private final PaymentMethod chosenPayment;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name and from kotlin metadata and from toString */
    private final Map tips;

    public static final class iobyxmoadg implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public final SendTipsParams createFromParcel(Parcel parcel) {
            zdlpuopuiu.btonecajqb(parcel, "parcel");
            int i13 = parcel.readInt();
            LinkedHashMap linkedHashMap = new LinkedHashMap(i13);
            for (int i14 = 0; i14 != i13; i14++) {
                linkedHashMap.put(parcel.readString(), Long.valueOf(parcel.readLong()));
            }
            return new SendTipsParams(linkedHashMap, (PaymentMethod) parcel.readParcelable(SendTipsParams.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: zoijcleaow, reason: merged with bridge method [inline-methods] */
        public final SendTipsParams[] newArray(int i13) {
            return new SendTipsParams[i13];
        }
    }

    public SendTipsParams(Map tips, PaymentMethod chosenPayment) {
        zdlpuopuiu.btonecajqb(tips, "tips");
        zdlpuopuiu.btonecajqb(chosenPayment, "chosenPayment");
        this.tips = tips;
        this.chosenPayment = chosenPayment;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SendTipsParams)) {
            return false;
        }
        SendTipsParams sendTipsParams = (SendTipsParams) other;
        return zdlpuopuiu.eablkybsjg(this.tips, sendTipsParams.tips) && zdlpuopuiu.eablkybsjg(this.chosenPayment, sendTipsParams.chosenPayment);
    }

    public int hashCode() {
        return (this.tips.hashCode() * 31) + this.chosenPayment.hashCode();
    }

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: from getter */
    public final Map getTips() {
        return this.tips;
    }

    public String toString() {
        return "SendTipsParams(tips=" + this.tips + ", chosenPayment=" + this.chosenPayment + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        zdlpuopuiu.btonecajqb(dest, "dest");
        Map map = this.tips;
        dest.writeInt(map.size());
        for (Map.Entry entry : map.entrySet()) {
            dest.writeString((String) entry.getKey());
            dest.writeLong(((Number) entry.getValue()).longValue());
        }
        dest.writeParcelable(this.chosenPayment, flags);
    }

    /* JADX INFO: renamed from: zoijcleaow, reason: from getter */
    public final PaymentMethod getChosenPayment() {
        return this.chosenPayment;
    }
}
