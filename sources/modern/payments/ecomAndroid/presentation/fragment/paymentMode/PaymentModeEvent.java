package modern.payments.ecomAndroid.presentation.fragment.paymentMode;

import android.app.Activity;
import kotlin.Metadata;
import kotlin.jvm.internal.gtknphoqwx;
import kotlin.jvm.internal.zdlpuopuiu;
import modern.payments.ecomAndroid.presentation.fragment.paymentMode.model.PayModeBindingCardItem;
import modern.payments.ecomAndroid.presentation.fragment.paymentMode.model.PayModeItem;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bp\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\b"}, d2 = {"Lmodern/payments/ecomAndroid/presentation/fragment/paymentMode/PaymentModeEvent;", "", "CloseEvent", "DeleteBindingClickedEvent", "ItemClickedEvent", "Lmodern/payments/ecomAndroid/presentation/fragment/paymentMode/PaymentModeEvent$CloseEvent;", "Lmodern/payments/ecomAndroid/presentation/fragment/paymentMode/PaymentModeEvent$DeleteBindingClickedEvent;", "Lmodern/payments/ecomAndroid/presentation/fragment/paymentMode/PaymentModeEvent$ItemClickedEvent;", "ecomAndroid_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public interface PaymentModeEvent {

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0013\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÖ\u0003J\t\u0010\u0007\u001a\u00020\bHÖ\u0001J\t\u0010\t\u001a\u00020\nHÖ\u0001¨\u0006\u000b"}, d2 = {"Lmodern/payments/ecomAndroid/presentation/fragment/paymentMode/PaymentModeEvent$CloseEvent;", "Lmodern/payments/ecomAndroid/presentation/fragment/paymentMode/PaymentModeEvent;", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "ecomAndroid_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class CloseEvent implements PaymentModeEvent {
        public static final CloseEvent INSTANCE = new CloseEvent();

        private CloseEvent() {
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof CloseEvent);
        }

        public int hashCode() {
            return 1545499171;
        }

        public String toString() {
            return "CloseEvent";
        }
    }

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fHÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0011"}, d2 = {"Lmodern/payments/ecomAndroid/presentation/fragment/paymentMode/PaymentModeEvent$DeleteBindingClickedEvent;", "Lmodern/payments/ecomAndroid/presentation/fragment/paymentMode/PaymentModeEvent;", "item", "Lmodern/payments/ecomAndroid/presentation/fragment/paymentMode/model/PayModeBindingCardItem;", "(Lmodern/payments/ecomAndroid/presentation/fragment/paymentMode/model/PayModeBindingCardItem;)V", "getItem", "()Lmodern/payments/ecomAndroid/presentation/fragment/paymentMode/model/PayModeBindingCardItem;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "ecomAndroid_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class DeleteBindingClickedEvent implements PaymentModeEvent {
        private final PayModeBindingCardItem item;

        public DeleteBindingClickedEvent(PayModeBindingCardItem item) {
            zdlpuopuiu.btonecajqb(item, "item");
            this.item = item;
        }

        public static /* synthetic */ DeleteBindingClickedEvent copy$default(DeleteBindingClickedEvent deleteBindingClickedEvent, PayModeBindingCardItem payModeBindingCardItem, int i13, Object obj) {
            if ((i13 & 1) != 0) {
                payModeBindingCardItem = deleteBindingClickedEvent.item;
            }
            return deleteBindingClickedEvent.copy(payModeBindingCardItem);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final PayModeBindingCardItem getItem() {
            return this.item;
        }

        public final DeleteBindingClickedEvent copy(PayModeBindingCardItem item) {
            zdlpuopuiu.btonecajqb(item, "item");
            return new DeleteBindingClickedEvent(item);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof DeleteBindingClickedEvent) && zdlpuopuiu.eablkybsjg(this.item, ((DeleteBindingClickedEvent) other).item);
        }

        public final PayModeBindingCardItem getItem() {
            return this.item;
        }

        public int hashCode() {
            return this.item.hashCode();
        }

        public String toString() {
            return "DeleteBindingClickedEvent(item=" + this.item + ')';
        }
    }

    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u001f\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0016"}, d2 = {"Lmodern/payments/ecomAndroid/presentation/fragment/paymentMode/PaymentModeEvent$ItemClickedEvent;", "Lmodern/payments/ecomAndroid/presentation/fragment/paymentMode/PaymentModeEvent;", "item", "Lmodern/payments/ecomAndroid/presentation/fragment/paymentMode/model/PayModeItem;", "context", "Landroid/app/Activity;", "(Lmodern/payments/ecomAndroid/presentation/fragment/paymentMode/model/PayModeItem;Landroid/app/Activity;)V", "getContext", "()Landroid/app/Activity;", "getItem", "()Lmodern/payments/ecomAndroid/presentation/fragment/paymentMode/model/PayModeItem;", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "ecomAndroid_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ItemClickedEvent implements PaymentModeEvent {
        private final Activity context;
        private final PayModeItem item;

        public ItemClickedEvent(PayModeItem item, Activity activity) {
            zdlpuopuiu.btonecajqb(item, "item");
            this.item = item;
            this.context = activity;
        }

        public static /* synthetic */ ItemClickedEvent copy$default(ItemClickedEvent itemClickedEvent, PayModeItem payModeItem, Activity activity, int i13, Object obj) {
            if ((i13 & 1) != 0) {
                payModeItem = itemClickedEvent.item;
            }
            if ((i13 & 2) != 0) {
                activity = itemClickedEvent.context;
            }
            return itemClickedEvent.copy(payModeItem, activity);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final PayModeItem getItem() {
            return this.item;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final Activity getContext() {
            return this.context;
        }

        public final ItemClickedEvent copy(PayModeItem item, Activity context) {
            zdlpuopuiu.btonecajqb(item, "item");
            return new ItemClickedEvent(item, context);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ItemClickedEvent)) {
                return false;
            }
            ItemClickedEvent itemClickedEvent = (ItemClickedEvent) other;
            return zdlpuopuiu.eablkybsjg(this.item, itemClickedEvent.item) && zdlpuopuiu.eablkybsjg(this.context, itemClickedEvent.context);
        }

        public final Activity getContext() {
            return this.context;
        }

        public final PayModeItem getItem() {
            return this.item;
        }

        public int hashCode() {
            int iHashCode = this.item.hashCode() * 31;
            Activity activity = this.context;
            return iHashCode + (activity == null ? 0 : activity.hashCode());
        }

        public String toString() {
            return "ItemClickedEvent(item=" + this.item + ", context=" + this.context + ')';
        }

        public /* synthetic */ ItemClickedEvent(PayModeItem payModeItem, Activity activity, int i13, gtknphoqwx gtknphoqwxVar) {
            this(payModeItem, (i13 & 2) != 0 ? null : activity);
        }
    }
}
