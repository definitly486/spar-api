package modern.payments.ecomAndroid.api;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u00002\u00020\u0001:\b\u0002\u0003\u0004\u0005\u0006\u0007\b\t\u0082\u0001\b\n\u000b\f\r\u000e\u000f\u0010\u0011¨\u0006\u0012"}, d2 = {"Lmodern/payments/ecomAndroid/api/EcomSPayMethod;", "Landroid/os/Parcelable;", "Default", "WithBankInvoiceId", "WithBinding", "WithBonuses", "WithPartPay", "WithPaymentAccount", "WithPhoneNumber", "WithoutRefresh", "Lmodern/payments/ecomAndroid/api/EcomSPayMethod$Default;", "Lmodern/payments/ecomAndroid/api/EcomSPayMethod$WithBankInvoiceId;", "Lmodern/payments/ecomAndroid/api/EcomSPayMethod$WithBinding;", "Lmodern/payments/ecomAndroid/api/EcomSPayMethod$WithBonuses;", "Lmodern/payments/ecomAndroid/api/EcomSPayMethod$WithPartPay;", "Lmodern/payments/ecomAndroid/api/EcomSPayMethod$WithPaymentAccount;", "Lmodern/payments/ecomAndroid/api/EcomSPayMethod$WithPhoneNumber;", "Lmodern/payments/ecomAndroid/api/EcomSPayMethod$WithoutRefresh;", "ecomAndroid_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public interface EcomSPayMethod extends Parcelable {

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J \u0010\u000b\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lmodern/payments/ecomAndroid/api/EcomSPayMethod$Default;", "Lmodern/payments/ecomAndroid/api/EcomSPayMethod;", "<init>", "()V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Lgg/wwaezpbzkn;", "writeToParcel", "(Landroid/os/Parcel;I)V", "ecomAndroid_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Default implements EcomSPayMethod {
        public static final Default INSTANCE = new Default();
        public static final Parcelable.Creator<Default> CREATOR = new Creator();

        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<Default> {
            @Override // android.os.Parcelable.Creator
            public final Default createFromParcel(Parcel parcel) {
                zdlpuopuiu.btonecajqb(parcel, "parcel");
                parcel.readInt();
                return Default.INSTANCE;
            }

            @Override // android.os.Parcelable.Creator
            public final Default[] newArray(int i13) {
                return new Default[i13];
            }
        }

        private Default() {
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int flags) {
            zdlpuopuiu.btonecajqb(parcel, "out");
            parcel.writeInt(1);
        }
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J \u0010\u000b\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lmodern/payments/ecomAndroid/api/EcomSPayMethod$WithBankInvoiceId;", "Lmodern/payments/ecomAndroid/api/EcomSPayMethod;", "<init>", "()V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Lgg/wwaezpbzkn;", "writeToParcel", "(Landroid/os/Parcel;I)V", "ecomAndroid_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class WithBankInvoiceId implements EcomSPayMethod {
        public static final WithBankInvoiceId INSTANCE = new WithBankInvoiceId();
        public static final Parcelable.Creator<WithBankInvoiceId> CREATOR = new Creator();

        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<WithBankInvoiceId> {
            @Override // android.os.Parcelable.Creator
            public final WithBankInvoiceId createFromParcel(Parcel parcel) {
                zdlpuopuiu.btonecajqb(parcel, "parcel");
                parcel.readInt();
                return WithBankInvoiceId.INSTANCE;
            }

            @Override // android.os.Parcelable.Creator
            public final WithBankInvoiceId[] newArray(int i13) {
                return new WithBankInvoiceId[i13];
            }
        }

        private WithBankInvoiceId() {
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int flags) {
            zdlpuopuiu.btonecajqb(parcel, "out");
            parcel.writeInt(1);
        }
    }

    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\n\u0010\u0007J\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\u0013\u0010\rJ \u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001a\u001a\u0004\b\u001b\u0010\u0007¨\u0006\u001c"}, d2 = {"Lmodern/payments/ecomAndroid/api/EcomSPayMethod$WithBinding;", "Lmodern/payments/ecomAndroid/api/EcomSPayMethod;", "", "bindingId", "<init>", "(Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lmodern/payments/ecomAndroid/api/EcomSPayMethod$WithBinding;", "toString", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lgg/wwaezpbzkn;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getBindingId", "ecomAndroid_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class WithBinding implements EcomSPayMethod {
        public static final Parcelable.Creator<WithBinding> CREATOR = new Creator();
        private final String bindingId;

        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<WithBinding> {
            @Override // android.os.Parcelable.Creator
            public final WithBinding createFromParcel(Parcel parcel) {
                zdlpuopuiu.btonecajqb(parcel, "parcel");
                return new WithBinding(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final WithBinding[] newArray(int i13) {
                return new WithBinding[i13];
            }
        }

        public WithBinding(String bindingId) {
            zdlpuopuiu.btonecajqb(bindingId, "bindingId");
            this.bindingId = bindingId;
        }

        public static /* synthetic */ WithBinding copy$default(WithBinding withBinding, String str, int i13, Object obj) {
            if ((i13 & 1) != 0) {
                str = withBinding.bindingId;
            }
            return withBinding.copy(str);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getBindingId() {
            return this.bindingId;
        }

        public final WithBinding copy(String bindingId) {
            zdlpuopuiu.btonecajqb(bindingId, "bindingId");
            return new WithBinding(bindingId);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof WithBinding) && zdlpuopuiu.eablkybsjg(this.bindingId, ((WithBinding) other).bindingId);
        }

        public final String getBindingId() {
            return this.bindingId;
        }

        public int hashCode() {
            return this.bindingId.hashCode();
        }

        public String toString() {
            return "WithBinding(bindingId=" + this.bindingId + ')';
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int flags) {
            zdlpuopuiu.btonecajqb(parcel, "out");
            parcel.writeString(this.bindingId);
        }
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J \u0010\u000b\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lmodern/payments/ecomAndroid/api/EcomSPayMethod$WithBonuses;", "Lmodern/payments/ecomAndroid/api/EcomSPayMethod;", "<init>", "()V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Lgg/wwaezpbzkn;", "writeToParcel", "(Landroid/os/Parcel;I)V", "ecomAndroid_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class WithBonuses implements EcomSPayMethod {
        public static final WithBonuses INSTANCE = new WithBonuses();
        public static final Parcelable.Creator<WithBonuses> CREATOR = new Creator();

        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<WithBonuses> {
            @Override // android.os.Parcelable.Creator
            public final WithBonuses createFromParcel(Parcel parcel) {
                zdlpuopuiu.btonecajqb(parcel, "parcel");
                parcel.readInt();
                return WithBonuses.INSTANCE;
            }

            @Override // android.os.Parcelable.Creator
            public final WithBonuses[] newArray(int i13) {
                return new WithBonuses[i13];
            }
        }

        private WithBonuses() {
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int flags) {
            zdlpuopuiu.btonecajqb(parcel, "out");
            parcel.writeInt(1);
        }
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J \u0010\u000b\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lmodern/payments/ecomAndroid/api/EcomSPayMethod$WithPartPay;", "Lmodern/payments/ecomAndroid/api/EcomSPayMethod;", "<init>", "()V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Lgg/wwaezpbzkn;", "writeToParcel", "(Landroid/os/Parcel;I)V", "ecomAndroid_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class WithPartPay implements EcomSPayMethod {
        public static final WithPartPay INSTANCE = new WithPartPay();
        public static final Parcelable.Creator<WithPartPay> CREATOR = new Creator();

        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<WithPartPay> {
            @Override // android.os.Parcelable.Creator
            public final WithPartPay createFromParcel(Parcel parcel) {
                zdlpuopuiu.btonecajqb(parcel, "parcel");
                parcel.readInt();
                return WithPartPay.INSTANCE;
            }

            @Override // android.os.Parcelable.Creator
            public final WithPartPay[] newArray(int i13) {
                return new WithPartPay[i13];
            }
        }

        private WithPartPay() {
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int flags) {
            zdlpuopuiu.btonecajqb(parcel, "out");
            parcel.writeInt(1);
        }
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J \u0010\u000b\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lmodern/payments/ecomAndroid/api/EcomSPayMethod$WithPaymentAccount;", "Lmodern/payments/ecomAndroid/api/EcomSPayMethod;", "<init>", "()V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Lgg/wwaezpbzkn;", "writeToParcel", "(Landroid/os/Parcel;I)V", "ecomAndroid_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class WithPaymentAccount implements EcomSPayMethod {
        public static final WithPaymentAccount INSTANCE = new WithPaymentAccount();
        public static final Parcelable.Creator<WithPaymentAccount> CREATOR = new Creator();

        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<WithPaymentAccount> {
            @Override // android.os.Parcelable.Creator
            public final WithPaymentAccount createFromParcel(Parcel parcel) {
                zdlpuopuiu.btonecajqb(parcel, "parcel");
                parcel.readInt();
                return WithPaymentAccount.INSTANCE;
            }

            @Override // android.os.Parcelable.Creator
            public final WithPaymentAccount[] newArray(int i13) {
                return new WithPaymentAccount[i13];
            }
        }

        private WithPaymentAccount() {
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int flags) {
            zdlpuopuiu.btonecajqb(parcel, "out");
            parcel.writeInt(1);
        }
    }

    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\n\u0010\u0007J\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\u0013\u0010\rJ \u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001a\u001a\u0004\b\u001b\u0010\u0007¨\u0006\u001c"}, d2 = {"Lmodern/payments/ecomAndroid/api/EcomSPayMethod$WithPhoneNumber;", "Lmodern/payments/ecomAndroid/api/EcomSPayMethod;", "", "phoneNumber", "<init>", "(Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lmodern/payments/ecomAndroid/api/EcomSPayMethod$WithPhoneNumber;", "toString", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lgg/wwaezpbzkn;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getPhoneNumber", "ecomAndroid_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class WithPhoneNumber implements EcomSPayMethod {
        public static final Parcelable.Creator<WithPhoneNumber> CREATOR = new Creator();
        private final String phoneNumber;

        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<WithPhoneNumber> {
            @Override // android.os.Parcelable.Creator
            public final WithPhoneNumber createFromParcel(Parcel parcel) {
                zdlpuopuiu.btonecajqb(parcel, "parcel");
                return new WithPhoneNumber(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final WithPhoneNumber[] newArray(int i13) {
                return new WithPhoneNumber[i13];
            }
        }

        public WithPhoneNumber(String phoneNumber) {
            zdlpuopuiu.btonecajqb(phoneNumber, "phoneNumber");
            this.phoneNumber = phoneNumber;
        }

        public static /* synthetic */ WithPhoneNumber copy$default(WithPhoneNumber withPhoneNumber, String str, int i13, Object obj) {
            if ((i13 & 1) != 0) {
                str = withPhoneNumber.phoneNumber;
            }
            return withPhoneNumber.copy(str);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getPhoneNumber() {
            return this.phoneNumber;
        }

        public final WithPhoneNumber copy(String phoneNumber) {
            zdlpuopuiu.btonecajqb(phoneNumber, "phoneNumber");
            return new WithPhoneNumber(phoneNumber);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof WithPhoneNumber) && zdlpuopuiu.eablkybsjg(this.phoneNumber, ((WithPhoneNumber) other).phoneNumber);
        }

        public final String getPhoneNumber() {
            return this.phoneNumber;
        }

        public int hashCode() {
            return this.phoneNumber.hashCode();
        }

        public String toString() {
            return "WithPhoneNumber(phoneNumber=" + this.phoneNumber + ')';
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int flags) {
            zdlpuopuiu.btonecajqb(parcel, "out");
            parcel.writeString(this.phoneNumber);
        }
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J \u0010\u000b\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lmodern/payments/ecomAndroid/api/EcomSPayMethod$WithoutRefresh;", "Lmodern/payments/ecomAndroid/api/EcomSPayMethod;", "<init>", "()V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Lgg/wwaezpbzkn;", "writeToParcel", "(Landroid/os/Parcel;I)V", "ecomAndroid_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class WithoutRefresh implements EcomSPayMethod {
        public static final WithoutRefresh INSTANCE = new WithoutRefresh();
        public static final Parcelable.Creator<WithoutRefresh> CREATOR = new Creator();

        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<WithoutRefresh> {
            @Override // android.os.Parcelable.Creator
            public final WithoutRefresh createFromParcel(Parcel parcel) {
                zdlpuopuiu.btonecajqb(parcel, "parcel");
                parcel.readInt();
                return WithoutRefresh.INSTANCE;
            }

            @Override // android.os.Parcelable.Creator
            public final WithoutRefresh[] newArray(int i13) {
                return new WithoutRefresh[i13];
            }
        }

        private WithoutRefresh() {
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int flags) {
            zdlpuopuiu.btonecajqb(parcel, "out");
            parcel.writeInt(1);
        }
    }
}
