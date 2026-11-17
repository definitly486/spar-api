package modern.payments.ecomAndroid.presentation.model.amount;

import kotlin.Metadata;
import kotlin.jvm.internal.gtknphoqwx;
import kotlin.jvm.internal.zdlpuopuiu;
import modern.payments.ecomAndroid.util.holder.StringHolder;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0080\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0005J\t\u0010\t\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\n\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u001f\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fHÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\u0014"}, d2 = {"Lmodern/payments/ecomAndroid/presentation/model/amount/PaymentAmountItem;", "Lmodern/payments/ecomAndroid/presentation/model/amount/IAmountItem;", "amount", "Lmodern/payments/ecomAndroid/util/holder/StringHolder;", "details", "(Lmodern/payments/ecomAndroid/util/holder/StringHolder;Lmodern/payments/ecomAndroid/util/holder/StringHolder;)V", "getAmount", "()Lmodern/payments/ecomAndroid/util/holder/StringHolder;", "getDetails", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "ecomAndroid_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class PaymentAmountItem implements IAmountItem {
    private final StringHolder amount;
    private final StringHolder details;

    public PaymentAmountItem(StringHolder amount, StringHolder stringHolder) {
        zdlpuopuiu.btonecajqb(amount, "amount");
        this.amount = amount;
        this.details = stringHolder;
    }

    public static /* synthetic */ PaymentAmountItem copy$default(PaymentAmountItem paymentAmountItem, StringHolder stringHolder, StringHolder stringHolder2, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            stringHolder = paymentAmountItem.amount;
        }
        if ((i13 & 2) != 0) {
            stringHolder2 = paymentAmountItem.details;
        }
        return paymentAmountItem.copy(stringHolder, stringHolder2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final StringHolder getAmount() {
        return this.amount;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final StringHolder getDetails() {
        return this.details;
    }

    public final PaymentAmountItem copy(StringHolder amount, StringHolder details) {
        zdlpuopuiu.btonecajqb(amount, "amount");
        return new PaymentAmountItem(amount, details);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PaymentAmountItem)) {
            return false;
        }
        PaymentAmountItem paymentAmountItem = (PaymentAmountItem) other;
        return zdlpuopuiu.eablkybsjg(this.amount, paymentAmountItem.amount) && zdlpuopuiu.eablkybsjg(this.details, paymentAmountItem.details);
    }

    @Override // modern.payments.ecomAndroid.presentation.model.amount.IAmountItem
    public StringHolder getAmount() {
        return this.amount;
    }

    @Override // modern.payments.ecomAndroid.presentation.model.amount.IAmountItem
    public StringHolder getDetails() {
        return this.details;
    }

    public int hashCode() {
        int iHashCode = this.amount.hashCode() * 31;
        StringHolder stringHolder = this.details;
        return iHashCode + (stringHolder == null ? 0 : stringHolder.hashCode());
    }

    public String toString() {
        return "PaymentAmountItem(amount=" + this.amount + ", details=" + this.details + ')';
    }

    public /* synthetic */ PaymentAmountItem(StringHolder stringHolder, StringHolder stringHolder2, int i13, gtknphoqwx gtknphoqwxVar) {
        this(stringHolder, (i13 & 2) != 0 ? null : stringHolder2);
    }
}
