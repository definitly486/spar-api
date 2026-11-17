package spay.sdk.api;

import kotlin.Metadata;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\b\u0002\u0003\u0004\u0005\u0006\u0007\b\t\u0082\u0001\b\n\u000b\f\r\u000e\u000f\u0010\u0011¨\u0006\u0012"}, d2 = {"Lspay/sdk/api/SPayMethod;", "", "Default", "WithBankInvoiceId", "WithBinding", "WithBonuses", "WithPartPay", "WithPaymentAccount", "WithPhoneNumber", "WithoutRefresh", "Lspay/sdk/api/SPayMethod$Default;", "Lspay/sdk/api/SPayMethod$WithBankInvoiceId;", "Lspay/sdk/api/SPayMethod$WithBinding;", "Lspay/sdk/api/SPayMethod$WithBonuses;", "Lspay/sdk/api/SPayMethod$WithPartPay;", "Lspay/sdk/api/SPayMethod$WithPaymentAccount;", "Lspay/sdk/api/SPayMethod$WithPhoneNumber;", "Lspay/sdk/api/SPayMethod$WithoutRefresh;", "SPaySDK_baseRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
public interface SPayMethod {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lspay/sdk/api/SPayMethod$Default;", "Lspay/sdk/api/SPayMethod;", "()V", "SPaySDK_baseRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Default implements SPayMethod {
        public static final Default INSTANCE = new Default();

        private Default() {
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lspay/sdk/api/SPayMethod$WithBankInvoiceId;", "Lspay/sdk/api/SPayMethod;", "()V", "SPaySDK_baseRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class WithBankInvoiceId implements SPayMethod {
        public static final WithBankInvoiceId INSTANCE = new WithBankInvoiceId();

        private WithBankInvoiceId() {
        }
    }

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fHÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0010"}, d2 = {"Lspay/sdk/api/SPayMethod$WithBinding;", "Lspay/sdk/api/SPayMethod;", "bindingId", "", "(Ljava/lang/String;)V", "getBindingId", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "SPaySDK_baseRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final /* data */ class WithBinding implements SPayMethod {
        private final String bindingId;

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
            return "WithBinding(bindingId=" + this.bindingId + ")";
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lspay/sdk/api/SPayMethod$WithBonuses;", "Lspay/sdk/api/SPayMethod;", "()V", "SPaySDK_baseRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class WithBonuses implements SPayMethod {
        public static final WithBonuses INSTANCE = new WithBonuses();

        private WithBonuses() {
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lspay/sdk/api/SPayMethod$WithPartPay;", "Lspay/sdk/api/SPayMethod;", "()V", "SPaySDK_baseRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class WithPartPay implements SPayMethod {
        public static final WithPartPay INSTANCE = new WithPartPay();

        private WithPartPay() {
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lspay/sdk/api/SPayMethod$WithPaymentAccount;", "Lspay/sdk/api/SPayMethod;", "()V", "SPaySDK_baseRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class WithPaymentAccount implements SPayMethod {
        public static final WithPaymentAccount INSTANCE = new WithPaymentAccount();

        private WithPaymentAccount() {
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lspay/sdk/api/SPayMethod$WithPhoneNumber;", "Lspay/sdk/api/SPayMethod;", "()V", "SPaySDK_baseRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class WithPhoneNumber implements SPayMethod {
        public static final WithPhoneNumber INSTANCE = new WithPhoneNumber();

        private WithPhoneNumber() {
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lspay/sdk/api/SPayMethod$WithoutRefresh;", "Lspay/sdk/api/SPayMethod;", "()V", "SPaySDK_baseRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class WithoutRefresh implements SPayMethod {
        public static final WithoutRefresh INSTANCE = new WithoutRefresh();

        private WithoutRefresh() {
        }
    }
}
