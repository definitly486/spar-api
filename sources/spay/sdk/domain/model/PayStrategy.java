package spay.sdk.domain.model;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bp\u0018\u00002\u00020\u0001:\b\u0002\u0003\u0004\u0005\u0006\u0007\b\t\u0082\u0001\b\n\u000b\f\r\u000e\u000f\u0010\u0011¨\u0006\u0012"}, d2 = {"Lspay/sdk/domain/model/PayStrategy;", "", "BasePay", "PartsStartPay", "PayOnline", "PayWithBinding", "PayWithBonuses", "PayWithPartsOnly", "PayWithPaymentAccount", "PayWithPhoneNumber", "Lspay/sdk/domain/model/PayStrategy$BasePay;", "Lspay/sdk/domain/model/PayStrategy$PartsStartPay;", "Lspay/sdk/domain/model/PayStrategy$PayOnline;", "Lspay/sdk/domain/model/PayStrategy$PayWithBinding;", "Lspay/sdk/domain/model/PayStrategy$PayWithBonuses;", "Lspay/sdk/domain/model/PayStrategy$PayWithPartsOnly;", "Lspay/sdk/domain/model/PayStrategy$PayWithPaymentAccount;", "Lspay/sdk/domain/model/PayStrategy$PayWithPhoneNumber;", "SPaySDK_baseRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
public interface PayStrategy {

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u00052\u00020\u00062\u00020\u0007B\u0007\b\u0002¢\u0006\u0002\u0010\b¨\u0006\t"}, d2 = {"Lspay/sdk/domain/model/PayStrategy$BasePay;", "Lspay/sdk/domain/model/PayStrategy;", "Lspay/sdk/domain/model/AuthMethod$ByMobileApp;", "Lspay/sdk/domain/model/AuthMethod$ByRefreshToken;", "Lspay/sdk/domain/model/AuthMethod$ByAuthToken;", "Lspay/sdk/domain/model/AuthMethod$ByPhoneNumber;", "Lspay/sdk/domain/model/DeprecatedPaymentMethod;", "Lspay/sdk/domain/model/BnplMethod$FourPartPayment;", "()V", "SPaySDK_baseRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class BasePay implements PayStrategy, AuthMethod.ByMobileApp, AuthMethod.ByRefreshToken, AuthMethod.ByAuthToken, AuthMethod.ByPhoneNumber, DeprecatedPaymentMethod, BnplMethod.FourPartPayment {
        public static final BasePay INSTANCE = new BasePay();

        private BasePay() {
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u0005B\u0007\b\u0002¢\u0006\u0002\u0010\u0006¨\u0006\u0007"}, d2 = {"Lspay/sdk/domain/model/PayStrategy$PartsStartPay;", "Lspay/sdk/domain/model/PayStrategy;", "Lspay/sdk/domain/model/AuthMethod$ByMobileApp;", "Lspay/sdk/domain/model/AuthMethod$ByAuthToken;", "Lspay/sdk/domain/model/AuthMethod$ByPhoneNumber;", "Lspay/sdk/domain/model/BnplMethod$SixPartPayment;", "()V", "SPaySDK_baseRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class PartsStartPay implements PayStrategy, AuthMethod.ByMobileApp, AuthMethod.ByAuthToken, AuthMethod.ByPhoneNumber, BnplMethod.SixPartPayment {
        public static final PartsStartPay INSTANCE = new PartsStartPay();

        private PartsStartPay() {
        }
    }

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u00052\u00020\u0006B\u0007\b\u0002¢\u0006\u0002\u0010\u0007¨\u0006\b"}, d2 = {"Lspay/sdk/domain/model/PayStrategy$PayOnline;", "Lspay/sdk/domain/model/PayStrategy;", "Lspay/sdk/domain/model/AuthMethod$ByMobileApp;", "Lspay/sdk/domain/model/AuthMethod$ByRefreshToken;", "Lspay/sdk/domain/model/AuthMethod$ByAuthToken;", "Lspay/sdk/domain/model/AuthMethod$ByPhoneNumber;", "Lspay/sdk/domain/model/BnplMethod$SixPartPayment;", "()V", "SPaySDK_baseRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class PayOnline implements PayStrategy, AuthMethod.ByMobileApp, AuthMethod.ByRefreshToken, AuthMethod.ByAuthToken, AuthMethod.ByPhoneNumber, BnplMethod.SixPartPayment {
        public static final PayOnline INSTANCE = new PayOnline();

        private PayOnline() {
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lspay/sdk/domain/model/PayStrategy$PayWithBinding;", "Lspay/sdk/domain/model/PayStrategy;", "()V", "SPaySDK_baseRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class PayWithBinding implements PayStrategy {
        public static final PayWithBinding INSTANCE = new PayWithBinding();

        private PayWithBinding() {
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004B\u0007\b\u0002¢\u0006\u0002\u0010\u0005¨\u0006\u0006"}, d2 = {"Lspay/sdk/domain/model/PayStrategy$PayWithBonuses;", "Lspay/sdk/domain/model/PayStrategy;", "Lspay/sdk/domain/model/AuthMethod$ByMobileApp;", "Lspay/sdk/domain/model/AuthMethod$ByAuthToken;", "Lspay/sdk/domain/model/AuthMethod$ByPhoneNumber;", "()V", "SPaySDK_baseRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class PayWithBonuses implements PayStrategy, AuthMethod.ByMobileApp, AuthMethod.ByAuthToken, AuthMethod.ByPhoneNumber {
        public static final PayWithBonuses INSTANCE = new PayWithBonuses();

        private PayWithBonuses() {
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u0005B\u0007\b\u0002¢\u0006\u0002\u0010\u0006¨\u0006\u0007"}, d2 = {"Lspay/sdk/domain/model/PayStrategy$PayWithPartsOnly;", "Lspay/sdk/domain/model/PayStrategy;", "Lspay/sdk/domain/model/AuthMethod$ByMobileApp;", "Lspay/sdk/domain/model/AuthMethod$ByAuthToken;", "Lspay/sdk/domain/model/AuthMethod$ByPhoneNumber;", "Lspay/sdk/domain/model/BnplMethod$SixPartPayment;", "()V", "SPaySDK_baseRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class PayWithPartsOnly implements PayStrategy, AuthMethod.ByMobileApp, AuthMethod.ByAuthToken, AuthMethod.ByPhoneNumber, BnplMethod.SixPartPayment {
        public static final PayWithPartsOnly INSTANCE = new PayWithPartsOnly();

        private PayWithPartsOnly() {
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004B\u0007\b\u0002¢\u0006\u0002\u0010\u0005¨\u0006\u0006"}, d2 = {"Lspay/sdk/domain/model/PayStrategy$PayWithPaymentAccount;", "Lspay/sdk/domain/model/PayStrategy;", "Lspay/sdk/domain/model/AuthMethod$ByMobileApp;", "Lspay/sdk/domain/model/AuthMethod$ByAuthToken;", "Lspay/sdk/domain/model/AuthMethod$ByPhoneNumber;", "()V", "SPaySDK_baseRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class PayWithPaymentAccount implements PayStrategy, AuthMethod.ByMobileApp, AuthMethod.ByAuthToken, AuthMethod.ByPhoneNumber {
        public static final PayWithPaymentAccount INSTANCE = new PayWithPaymentAccount();

        private PayWithPaymentAccount() {
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u0007\b\u0002¢\u0006\u0002\u0010\u0004¨\u0006\u0005"}, d2 = {"Lspay/sdk/domain/model/PayStrategy$PayWithPhoneNumber;", "Lspay/sdk/domain/model/PayStrategy;", "Lspay/sdk/domain/model/AuthMethod$ByPhoneNumber;", "Lspay/sdk/domain/model/BnplMethod$SixPartPayment;", "()V", "SPaySDK_baseRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class PayWithPhoneNumber implements PayStrategy, AuthMethod.ByPhoneNumber, BnplMethod.SixPartPayment {
        public static final PayWithPhoneNumber INSTANCE = new PayWithPhoneNumber();

        private PayWithPhoneNumber() {
        }
    }
}
