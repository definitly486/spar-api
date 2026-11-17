package ru.myspar.proloyalty.payment.impl.web.presentation;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ImagesContract;
import kotlin.Metadata;
import kotlin.jvm.internal.zdlpuopuiu;
import ru.myspar.proloyalty.payment.api.model.PaymentWebArgs;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0006À\u0006\u0001"}, d2 = {"Lru/myspar/proloyalty/payment/impl/web/presentation/PaymentFlowParams;", "Landroid/os/Parcelable;", "OrderPaymentParams", "TipsPaymentParams", "Lru/myspar/proloyalty/payment/impl/web/presentation/PaymentFlowParams$OrderPaymentParams;", "Lru/myspar/proloyalty/payment/impl/web/presentation/PaymentFlowParams$TipsPaymentParams;", "impl_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface PaymentFlowParams extends Parcelable {

    @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001f\u0010\r\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0007¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\nH\u0007¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0004H×\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\nH×\u0001¢\u0006\u0004\b\u0013\u0010\u0010J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014H×\u0003¢\u0006\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010\u0012¨\u0006 "}, d2 = {"Lru/myspar/proloyalty/payment/impl/web/presentation/PaymentFlowParams$OrderPaymentParams;", "Lru/myspar/proloyalty/payment/impl/web/presentation/PaymentFlowParams;", "Lru/myspar/proloyalty/payment/api/model/PaymentWebArgs;", "args", "", ImagesContract.URL, "<init>", "(Lru/myspar/proloyalty/payment/api/model/PaymentWebArgs;Ljava/lang/String;)V", "Landroid/os/Parcel;", "dest", "", "flags", "Lgg/wwaezpbzkn;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "zdlpuopuiu", "Lru/myspar/proloyalty/payment/api/model/PaymentWebArgs;", "zoijcleaow", "()Lru/myspar/proloyalty/payment/api/model/PaymentWebArgs;", "yggfygwlhe", "Ljava/lang/String;", "agtfadlqog", "impl_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class OrderPaymentParams implements PaymentFlowParams {
        public static final Parcelable.Creator<OrderPaymentParams> CREATOR = new iobyxmoadg();

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name and from kotlin metadata and from toString */
        private final String url;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name and from kotlin metadata and from toString */
        private final PaymentWebArgs args;

        public static final class iobyxmoadg implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
            public final OrderPaymentParams createFromParcel(Parcel parcel) {
                zdlpuopuiu.btonecajqb(parcel, "parcel");
                return new OrderPaymentParams((PaymentWebArgs) parcel.readParcelable(OrderPaymentParams.class.getClassLoader()), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: zoijcleaow, reason: merged with bridge method [inline-methods] */
            public final OrderPaymentParams[] newArray(int i13) {
                return new OrderPaymentParams[i13];
            }
        }

        public OrderPaymentParams(PaymentWebArgs args, String url) {
            zdlpuopuiu.btonecajqb(args, "args");
            zdlpuopuiu.btonecajqb(url, "url");
            this.args = args;
            this.url = url;
        }

        /* JADX INFO: renamed from: agtfadlqog, reason: from getter */
        public final String getUrl() {
            return this.url;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof OrderPaymentParams)) {
                return false;
            }
            OrderPaymentParams orderPaymentParams = (OrderPaymentParams) other;
            return zdlpuopuiu.eablkybsjg(this.args, orderPaymentParams.args) && zdlpuopuiu.eablkybsjg(this.url, orderPaymentParams.url);
        }

        public int hashCode() {
            return (this.args.hashCode() * 31) + this.url.hashCode();
        }

        public String toString() {
            return "OrderPaymentParams(args=" + this.args + ", url=" + this.url + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            zdlpuopuiu.btonecajqb(dest, "dest");
            dest.writeParcelable(this.args, flags);
            dest.writeString(this.url);
        }

        /* JADX INFO: renamed from: zoijcleaow, reason: from getter */
        public final PaymentWebArgs getArgs() {
            return this.args;
        }
    }

    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0007¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\bH\u0007¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0002H×\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\bH×\u0001¢\u0006\u0004\b\u0011\u0010\u000eJ\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012H×\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u0010¨\u0006\u001a"}, d2 = {"Lru/myspar/proloyalty/payment/impl/web/presentation/PaymentFlowParams$TipsPaymentParams;", "Lru/myspar/proloyalty/payment/impl/web/presentation/PaymentFlowParams;", "", ImagesContract.URL, "<init>", "(Ljava/lang/String;)V", "Landroid/os/Parcel;", "dest", "", "flags", "Lgg/wwaezpbzkn;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "zdlpuopuiu", "Ljava/lang/String;", "agtfadlqog", "impl_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class TipsPaymentParams implements PaymentFlowParams {
        public static final Parcelable.Creator<TipsPaymentParams> CREATOR = new iobyxmoadg();

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name and from kotlin metadata and from toString */
        private final String url;

        public static final class iobyxmoadg implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
            public final TipsPaymentParams createFromParcel(Parcel parcel) {
                zdlpuopuiu.btonecajqb(parcel, "parcel");
                return new TipsPaymentParams(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: zoijcleaow, reason: merged with bridge method [inline-methods] */
            public final TipsPaymentParams[] newArray(int i13) {
                return new TipsPaymentParams[i13];
            }
        }

        public TipsPaymentParams(String url) {
            zdlpuopuiu.btonecajqb(url, "url");
            this.url = url;
        }

        /* JADX INFO: renamed from: agtfadlqog, reason: from getter */
        public final String getUrl() {
            return this.url;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof TipsPaymentParams) && zdlpuopuiu.eablkybsjg(this.url, ((TipsPaymentParams) other).url);
        }

        public int hashCode() {
            return this.url.hashCode();
        }

        public String toString() {
            return "TipsPaymentParams(url=" + this.url + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            zdlpuopuiu.btonecajqb(dest, "dest");
            dest.writeString(this.url);
        }
    }
}
