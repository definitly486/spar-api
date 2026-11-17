package spay.sdk.domain.model.response;

import java.util.ArrayList;
import java.util.List;
import kk.xg;
import kotlin.Metadata;
import kotlin.jvm.internal.zdlpuopuiu;
import modern.payments.ecomAndroid.util.externalMetrics.ExternalMetricsManagerImpl;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0080\b\u0018\u00002\u00020\u0001:\u0005,-./0B{\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u001a\u0010\u0006\u001a\u0016\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0007j\n\u0012\u0006\u0012\u0004\u0018\u00010\b`\t\u0012\u001a\u0010\n\u001a\u0016\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\u0007j\n\u0012\u0006\u0012\u0004\u0018\u00010\u000b`\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\u001a\u0010\u0010\u001a\u0016\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0007j\n\u0012\u0004\u0012\u00020\u0003\u0018\u0001`\t¢\u0006\u0002\u0010\u0011J\t\u0010\u001e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010 \u001a\u0016\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0007j\n\u0012\u0006\u0012\u0004\u0018\u00010\b`\tHÆ\u0003J\u001d\u0010!\u001a\u0016\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\u0007j\n\u0012\u0006\u0012\u0004\u0018\u00010\u000b`\tHÆ\u0003J\u000b\u0010\"\u001a\u0004\u0018\u00010\rHÆ\u0003J\t\u0010#\u001a\u00020\u000fHÆ\u0003J\u001d\u0010$\u001a\u0016\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0007j\n\u0012\u0004\u0012\u00020\u0003\u0018\u0001`\tHÆ\u0003J\u008d\u0001\u0010%\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\u001c\b\u0002\u0010\u0006\u001a\u0016\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0007j\n\u0012\u0006\u0012\u0004\u0018\u00010\b`\t2\u001c\b\u0002\u0010\n\u001a\u0016\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\u0007j\n\u0012\u0006\u0012\u0004\u0018\u00010\u000b`\t2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r2\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\u001c\b\u0002\u0010\u0010\u001a\u0016\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0007j\n\u0012\u0004\u0012\u00020\u0003\u0018\u0001`\tHÆ\u0001J\u0013\u0010&\u001a\u00020'2\b\u0010(\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010)\u001a\u00020*HÖ\u0001J\t\u0010+\u001a\u00020\u0003HÖ\u0001R%\u0010\n\u001a\u0016\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\u0007j\n\u0012\u0006\u0012\u0004\u0018\u00010\u000b`\t¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\u000e\u001a\u00020\u000f¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R%\u0010\u0006\u001a\u0016\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0007j\n\u0012\u0006\u0012\u0004\u0018\u00010\b`\t¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0013R%\u0010\u0010\u001a\u0016\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0007j\n\u0012\u0004\u0012\u00020\u0003\u0018\u0001`\t¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0013R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0013\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001d¨\u00061"}, d2 = {"Lspay/sdk/domain/model/response/SPaySdkConfig;", "", "version", "", "localization", "Lspay/sdk/domain/model/response/SPaySdkConfig$Localization;", "schemas", "Ljava/util/ArrayList;", "Lspay/sdk/domain/model/response/SPaySdkConfig$Schema;", "Lkotlin/collections/ArrayList;", "featuresToggle", "Lspay/sdk/domain/model/response/SPaySdkConfig$FeatureToggle;", "versionInfo", "Lspay/sdk/domain/model/response/SPaySdkConfig$VersionInfo;", "images", "Lspay/sdk/domain/model/response/SPaySdkConfig$Images;", "sslPins", "(Ljava/lang/String;Lspay/sdk/domain/model/response/SPaySdkConfig$Localization;Ljava/util/ArrayList;Ljava/util/ArrayList;Lspay/sdk/domain/model/response/SPaySdkConfig$VersionInfo;Lspay/sdk/domain/model/response/SPaySdkConfig$Images;Ljava/util/ArrayList;)V", "getFeaturesToggle", "()Ljava/util/ArrayList;", "getImages", "()Lspay/sdk/domain/model/response/SPaySdkConfig$Images;", "getLocalization", "()Lspay/sdk/domain/model/response/SPaySdkConfig$Localization;", "getSchemas", "getSslPins", "getVersion", "()Ljava/lang/String;", "getVersionInfo", "()Lspay/sdk/domain/model/response/SPaySdkConfig$VersionInfo;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "", "other", "hashCode", "", "toString", "FeatureToggle", "Images", "Localization", "Schema", "VersionInfo", "SPaySDK_baseRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class SPaySdkConfig {
    private final ArrayList<FeatureToggle> featuresToggle;
    private final Images images;
    private final Localization localization;
    private final ArrayList<Schema> schemas;
    private final ArrayList<String> sslPins;
    private final String version;
    private final VersionInfo versionInfo;

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u00052\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, d2 = {"Lspay/sdk/domain/model/response/SPaySdkConfig$FeatureToggle;", "", ExternalMetricsManagerImpl.NAME, "", "value", "", "(Ljava/lang/String;Z)V", "getName", "()Ljava/lang/String;", "getValue", "()Z", "component1", "component2", "copy", "equals", "other", "hashCode", "", "toString", "SPaySDK_baseRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final /* data */ class FeatureToggle {
        private final String name;
        private final boolean value;

        public FeatureToggle(String name, boolean z13) {
            zdlpuopuiu.btonecajqb(name, "name");
            this.name = name;
            this.value = z13;
        }

        public static /* synthetic */ FeatureToggle copy$default(FeatureToggle featureToggle, String str, boolean z13, int i13, Object obj) {
            if ((i13 & 1) != 0) {
                str = featureToggle.name;
            }
            if ((i13 & 2) != 0) {
                z13 = featureToggle.value;
            }
            return featureToggle.copy(str, z13);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getName() {
            return this.name;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final boolean getValue() {
            return this.value;
        }

        public final FeatureToggle copy(String name, boolean value) {
            zdlpuopuiu.btonecajqb(name, "name");
            return new FeatureToggle(name, value);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof FeatureToggle)) {
                return false;
            }
            FeatureToggle featureToggle = (FeatureToggle) other;
            return zdlpuopuiu.eablkybsjg(this.name, featureToggle.name) && this.value == featureToggle.value;
        }

        public final String getName() {
            return this.name;
        }

        public final boolean getValue() {
            return this.value;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v3, types: [int] */
        /* JADX WARN: Type inference failed for: r1v1, types: [int] */
        /* JADX WARN: Type inference failed for: r1v2 */
        /* JADX WARN: Type inference failed for: r1v3 */
        public int hashCode() {
            int iHashCode = this.name.hashCode() * 31;
            boolean z13 = this.value;
            ?? r13 = z13;
            if (z13) {
                r13 = 1;
            }
            return iHashCode + r13;
        }

        public String toString() {
            return "FeatureToggle(name=" + this.name + ", value=" + this.value + ")";
        }
    }

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\f\u001a\u00020\rHÖ\u0001J\t\u0010\u000e\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u000f"}, d2 = {"Lspay/sdk/domain/model/response/SPaySdkConfig$Images;", "", "logoIcon", "", "(Ljava/lang/String;)V", "getLogoIcon", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "SPaySDK_baseRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final /* data */ class Images {
        private final String logoIcon;

        public Images(String logoIcon) {
            zdlpuopuiu.btonecajqb(logoIcon, "logoIcon");
            this.logoIcon = logoIcon;
        }

        public static /* synthetic */ Images copy$default(Images images, String str, int i13, Object obj) {
            if ((i13 & 1) != 0) {
                str = images.logoIcon;
            }
            return images.copy(str);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getLogoIcon() {
            return this.logoIcon;
        }

        public final Images copy(String logoIcon) {
            zdlpuopuiu.btonecajqb(logoIcon, "logoIcon");
            return new Images(logoIcon);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Images) && zdlpuopuiu.eablkybsjg(this.logoIcon, ((Images) other).logoIcon);
        }

        public final String getLogoIcon() {
            return this.logoIcon;
        }

        public int hashCode() {
            return this.logoIcon.hashCode();
        }

        public String toString() {
            return "Images(logoIcon=" + this.logoIcon + ")";
        }
    }

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u001e\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001BM\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\u0006\u0010\n\u001a\u00020\u0003\u0012\u0006\u0010\u000b\u001a\u00020\u0003¢\u0006\u0002\u0010\fJ\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001f\u001a\u00020\u0003HÆ\u0003Jc\u0010 \u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u00032\b\b\u0002\u0010\u000b\u001a\u00020\u0003HÆ\u0001J\u0013\u0010!\u001a\u00020\"2\b\u0010#\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010$\u001a\u00020%HÖ\u0001J\t\u0010&\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000eR\u0011\u0010\n\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000eR\u0011\u0010\u000b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000eR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u000eR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u000eR\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u000eR\u0011\u0010\t\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u000e¨\u0006'"}, d2 = {"Lspay/sdk/domain/model/response/SPaySdkConfig$Localization;", "", "bankApp", "", "bankAppLoading", "payLoading", "payError", "enableSPay", "successEnableSPay", "userProfileInfo", "noPaymentsAccount", "payBindingErrorDescription", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getBankApp", "()Ljava/lang/String;", "getBankAppLoading", "getEnableSPay", "getNoPaymentsAccount", "getPayBindingErrorDescription", "getPayError", "getPayLoading", "getSuccessEnableSPay", "getUserProfileInfo", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "", "other", "hashCode", "", "toString", "SPaySDK_baseRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final /* data */ class Localization {
        private final String bankApp;
        private final String bankAppLoading;
        private final String enableSPay;
        private final String noPaymentsAccount;
        private final String payBindingErrorDescription;
        private final String payError;
        private final String payLoading;
        private final String successEnableSPay;
        private final String userProfileInfo;

        public Localization(String bankApp, String bankAppLoading, String payLoading, String payError, String enableSPay, String successEnableSPay, String userProfileInfo, String noPaymentsAccount, String payBindingErrorDescription) {
            zdlpuopuiu.btonecajqb(bankApp, "bankApp");
            zdlpuopuiu.btonecajqb(bankAppLoading, "bankAppLoading");
            zdlpuopuiu.btonecajqb(payLoading, "payLoading");
            zdlpuopuiu.btonecajqb(payError, "payError");
            zdlpuopuiu.btonecajqb(enableSPay, "enableSPay");
            zdlpuopuiu.btonecajqb(successEnableSPay, "successEnableSPay");
            zdlpuopuiu.btonecajqb(userProfileInfo, "userProfileInfo");
            zdlpuopuiu.btonecajqb(noPaymentsAccount, "noPaymentsAccount");
            zdlpuopuiu.btonecajqb(payBindingErrorDescription, "payBindingErrorDescription");
            this.bankApp = bankApp;
            this.bankAppLoading = bankAppLoading;
            this.payLoading = payLoading;
            this.payError = payError;
            this.enableSPay = enableSPay;
            this.successEnableSPay = successEnableSPay;
            this.userProfileInfo = userProfileInfo;
            this.noPaymentsAccount = noPaymentsAccount;
            this.payBindingErrorDescription = payBindingErrorDescription;
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getBankApp() {
            return this.bankApp;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final String getBankAppLoading() {
            return this.bankAppLoading;
        }

        /* JADX INFO: renamed from: component3, reason: from getter */
        public final String getPayLoading() {
            return this.payLoading;
        }

        /* JADX INFO: renamed from: component4, reason: from getter */
        public final String getPayError() {
            return this.payError;
        }

        /* JADX INFO: renamed from: component5, reason: from getter */
        public final String getEnableSPay() {
            return this.enableSPay;
        }

        /* JADX INFO: renamed from: component6, reason: from getter */
        public final String getSuccessEnableSPay() {
            return this.successEnableSPay;
        }

        /* JADX INFO: renamed from: component7, reason: from getter */
        public final String getUserProfileInfo() {
            return this.userProfileInfo;
        }

        /* JADX INFO: renamed from: component8, reason: from getter */
        public final String getNoPaymentsAccount() {
            return this.noPaymentsAccount;
        }

        /* JADX INFO: renamed from: component9, reason: from getter */
        public final String getPayBindingErrorDescription() {
            return this.payBindingErrorDescription;
        }

        public final Localization copy(String bankApp, String bankAppLoading, String payLoading, String payError, String enableSPay, String successEnableSPay, String userProfileInfo, String noPaymentsAccount, String payBindingErrorDescription) {
            zdlpuopuiu.btonecajqb(bankApp, "bankApp");
            zdlpuopuiu.btonecajqb(bankAppLoading, "bankAppLoading");
            zdlpuopuiu.btonecajqb(payLoading, "payLoading");
            zdlpuopuiu.btonecajqb(payError, "payError");
            zdlpuopuiu.btonecajqb(enableSPay, "enableSPay");
            zdlpuopuiu.btonecajqb(successEnableSPay, "successEnableSPay");
            zdlpuopuiu.btonecajqb(userProfileInfo, "userProfileInfo");
            zdlpuopuiu.btonecajqb(noPaymentsAccount, "noPaymentsAccount");
            zdlpuopuiu.btonecajqb(payBindingErrorDescription, "payBindingErrorDescription");
            return new Localization(bankApp, bankAppLoading, payLoading, payError, enableSPay, successEnableSPay, userProfileInfo, noPaymentsAccount, payBindingErrorDescription);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Localization)) {
                return false;
            }
            Localization localization = (Localization) other;
            return zdlpuopuiu.eablkybsjg(this.bankApp, localization.bankApp) && zdlpuopuiu.eablkybsjg(this.bankAppLoading, localization.bankAppLoading) && zdlpuopuiu.eablkybsjg(this.payLoading, localization.payLoading) && zdlpuopuiu.eablkybsjg(this.payError, localization.payError) && zdlpuopuiu.eablkybsjg(this.enableSPay, localization.enableSPay) && zdlpuopuiu.eablkybsjg(this.successEnableSPay, localization.successEnableSPay) && zdlpuopuiu.eablkybsjg(this.userProfileInfo, localization.userProfileInfo) && zdlpuopuiu.eablkybsjg(this.noPaymentsAccount, localization.noPaymentsAccount) && zdlpuopuiu.eablkybsjg(this.payBindingErrorDescription, localization.payBindingErrorDescription);
        }

        public final String getBankApp() {
            return this.bankApp;
        }

        public final String getBankAppLoading() {
            return this.bankAppLoading;
        }

        public final String getEnableSPay() {
            return this.enableSPay;
        }

        public final String getNoPaymentsAccount() {
            return this.noPaymentsAccount;
        }

        public final String getPayBindingErrorDescription() {
            return this.payBindingErrorDescription;
        }

        public final String getPayError() {
            return this.payError;
        }

        public final String getPayLoading() {
            return this.payLoading;
        }

        public final String getSuccessEnableSPay() {
            return this.successEnableSPay;
        }

        public final String getUserProfileInfo() {
            return this.userProfileInfo;
        }

        public int hashCode() {
            return this.payBindingErrorDescription.hashCode() + xg.iobyxmoadg(this.noPaymentsAccount, xg.iobyxmoadg(this.userProfileInfo, xg.iobyxmoadg(this.successEnableSPay, xg.iobyxmoadg(this.enableSPay, xg.iobyxmoadg(this.payError, xg.iobyxmoadg(this.payLoading, xg.iobyxmoadg(this.bankAppLoading, this.bankApp.hashCode() * 31, 31), 31), 31), 31), 31), 31), 31);
        }

        public String toString() {
            return "Localization(bankApp=" + this.bankApp + ", bankAppLoading=" + this.bankAppLoading + ", payLoading=" + this.payLoading + ", payError=" + this.payError + ", enableSPay=" + this.enableSPay + ", successEnableSPay=" + this.successEnableSPay + ", userProfileInfo=" + this.userProfileInfo + ", noPaymentsAccount=" + this.noPaymentsAccount + ", payBindingErrorDescription=" + this.payBindingErrorDescription + ")";
        }
    }

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0018\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001BA\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\nJ\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0003HÆ\u0003JS\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001e\u001a\u00020\u001fHÖ\u0001J\t\u0010 \u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\t\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0013\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\fR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\fR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\fR\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\fR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\f¨\u0006!"}, d2 = {"Lspay/sdk/domain/model/response/SPaySdkConfig$Schema;", "", "stand", "", "bankAppAuthUri", "dynatraceBeaconUri", "dynatraceApplicationId", "getIpUrl", "clickStreamUrl", "clickStreamAppId", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getBankAppAuthUri", "()Ljava/lang/String;", "getClickStreamAppId", "getClickStreamUrl", "getDynatraceApplicationId", "getDynatraceBeaconUri", "getGetIpUrl", "getStand", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "", "other", "hashCode", "", "toString", "SPaySDK_baseRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final /* data */ class Schema {
        private final String bankAppAuthUri;
        private final String clickStreamAppId;
        private final String clickStreamUrl;
        private final String dynatraceApplicationId;
        private final String dynatraceBeaconUri;
        private final String getIpUrl;
        private final String stand;

        public Schema(String stand, String bankAppAuthUri, String dynatraceBeaconUri, String dynatraceApplicationId, String getIpUrl, String str, String str2) {
            zdlpuopuiu.btonecajqb(stand, "stand");
            zdlpuopuiu.btonecajqb(bankAppAuthUri, "bankAppAuthUri");
            zdlpuopuiu.btonecajqb(dynatraceBeaconUri, "dynatraceBeaconUri");
            zdlpuopuiu.btonecajqb(dynatraceApplicationId, "dynatraceApplicationId");
            zdlpuopuiu.btonecajqb(getIpUrl, "getIpUrl");
            this.stand = stand;
            this.bankAppAuthUri = bankAppAuthUri;
            this.dynatraceBeaconUri = dynatraceBeaconUri;
            this.dynatraceApplicationId = dynatraceApplicationId;
            this.getIpUrl = getIpUrl;
            this.clickStreamUrl = str;
            this.clickStreamAppId = str2;
        }

        public static /* synthetic */ Schema copy$default(Schema schema, String str, String str2, String str3, String str4, String str5, String str6, String str7, int i13, Object obj) {
            if ((i13 & 1) != 0) {
                str = schema.stand;
            }
            if ((i13 & 2) != 0) {
                str2 = schema.bankAppAuthUri;
            }
            String str8 = str2;
            if ((i13 & 4) != 0) {
                str3 = schema.dynatraceBeaconUri;
            }
            String str9 = str3;
            if ((i13 & 8) != 0) {
                str4 = schema.dynatraceApplicationId;
            }
            String str10 = str4;
            if ((i13 & 16) != 0) {
                str5 = schema.getIpUrl;
            }
            String str11 = str5;
            if ((i13 & 32) != 0) {
                str6 = schema.clickStreamUrl;
            }
            String str12 = str6;
            if ((i13 & 64) != 0) {
                str7 = schema.clickStreamAppId;
            }
            return schema.copy(str, str8, str9, str10, str11, str12, str7);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getStand() {
            return this.stand;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final String getBankAppAuthUri() {
            return this.bankAppAuthUri;
        }

        /* JADX INFO: renamed from: component3, reason: from getter */
        public final String getDynatraceBeaconUri() {
            return this.dynatraceBeaconUri;
        }

        /* JADX INFO: renamed from: component4, reason: from getter */
        public final String getDynatraceApplicationId() {
            return this.dynatraceApplicationId;
        }

        /* JADX INFO: renamed from: component5, reason: from getter */
        public final String getGetIpUrl() {
            return this.getIpUrl;
        }

        /* JADX INFO: renamed from: component6, reason: from getter */
        public final String getClickStreamUrl() {
            return this.clickStreamUrl;
        }

        /* JADX INFO: renamed from: component7, reason: from getter */
        public final String getClickStreamAppId() {
            return this.clickStreamAppId;
        }

        public final Schema copy(String stand, String bankAppAuthUri, String dynatraceBeaconUri, String dynatraceApplicationId, String getIpUrl, String clickStreamUrl, String clickStreamAppId) {
            zdlpuopuiu.btonecajqb(stand, "stand");
            zdlpuopuiu.btonecajqb(bankAppAuthUri, "bankAppAuthUri");
            zdlpuopuiu.btonecajqb(dynatraceBeaconUri, "dynatraceBeaconUri");
            zdlpuopuiu.btonecajqb(dynatraceApplicationId, "dynatraceApplicationId");
            zdlpuopuiu.btonecajqb(getIpUrl, "getIpUrl");
            return new Schema(stand, bankAppAuthUri, dynatraceBeaconUri, dynatraceApplicationId, getIpUrl, clickStreamUrl, clickStreamAppId);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Schema)) {
                return false;
            }
            Schema schema = (Schema) other;
            return zdlpuopuiu.eablkybsjg(this.stand, schema.stand) && zdlpuopuiu.eablkybsjg(this.bankAppAuthUri, schema.bankAppAuthUri) && zdlpuopuiu.eablkybsjg(this.dynatraceBeaconUri, schema.dynatraceBeaconUri) && zdlpuopuiu.eablkybsjg(this.dynatraceApplicationId, schema.dynatraceApplicationId) && zdlpuopuiu.eablkybsjg(this.getIpUrl, schema.getIpUrl) && zdlpuopuiu.eablkybsjg(this.clickStreamUrl, schema.clickStreamUrl) && zdlpuopuiu.eablkybsjg(this.clickStreamAppId, schema.clickStreamAppId);
        }

        public final String getBankAppAuthUri() {
            return this.bankAppAuthUri;
        }

        public final String getClickStreamAppId() {
            return this.clickStreamAppId;
        }

        public final String getClickStreamUrl() {
            return this.clickStreamUrl;
        }

        public final String getDynatraceApplicationId() {
            return this.dynatraceApplicationId;
        }

        public final String getDynatraceBeaconUri() {
            return this.dynatraceBeaconUri;
        }

        public final String getGetIpUrl() {
            return this.getIpUrl;
        }

        public final String getStand() {
            return this.stand;
        }

        public int hashCode() {
            int iIobyxmoadg = xg.iobyxmoadg(this.getIpUrl, xg.iobyxmoadg(this.dynatraceApplicationId, xg.iobyxmoadg(this.dynatraceBeaconUri, xg.iobyxmoadg(this.bankAppAuthUri, this.stand.hashCode() * 31, 31), 31), 31), 31);
            String str = this.clickStreamUrl;
            int iHashCode = (iIobyxmoadg + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.clickStreamAppId;
            return iHashCode + (str2 != null ? str2.hashCode() : 0);
        }

        public String toString() {
            return "Schema(stand=" + this.stand + ", bankAppAuthUri=" + this.bankAppAuthUri + ", dynatraceBeaconUri=" + this.dynatraceBeaconUri + ", dynatraceApplicationId=" + this.dynatraceApplicationId + ", getIpUrl=" + this.getIpUrl + ", clickStreamUrl=" + this.clickStreamUrl + ", clickStreamAppId=" + this.clickStreamAppId + ")";
        }
    }

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005HÆ\u0003J#\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0014"}, d2 = {"Lspay/sdk/domain/model/response/SPaySdkConfig$VersionInfo;", "", "active", "", "deprecated", "", "(Ljava/lang/String;Ljava/util/List;)V", "getActive", "()Ljava/lang/String;", "getDeprecated", "()Ljava/util/List;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "SPaySDK_baseRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final /* data */ class VersionInfo {
        private final String active;
        private final List<String> deprecated;

        public VersionInfo(String active, List<String> deprecated) {
            zdlpuopuiu.btonecajqb(active, "active");
            zdlpuopuiu.btonecajqb(deprecated, "deprecated");
            this.active = active;
            this.deprecated = deprecated;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ VersionInfo copy$default(VersionInfo versionInfo, String str, List list, int i13, Object obj) {
            if ((i13 & 1) != 0) {
                str = versionInfo.active;
            }
            if ((i13 & 2) != 0) {
                list = versionInfo.deprecated;
            }
            return versionInfo.copy(str, list);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getActive() {
            return this.active;
        }

        public final List<String> component2() {
            return this.deprecated;
        }

        public final VersionInfo copy(String active, List<String> deprecated) {
            zdlpuopuiu.btonecajqb(active, "active");
            zdlpuopuiu.btonecajqb(deprecated, "deprecated");
            return new VersionInfo(active, deprecated);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof VersionInfo)) {
                return false;
            }
            VersionInfo versionInfo = (VersionInfo) other;
            return zdlpuopuiu.eablkybsjg(this.active, versionInfo.active) && zdlpuopuiu.eablkybsjg(this.deprecated, versionInfo.deprecated);
        }

        public final String getActive() {
            return this.active;
        }

        public final List<String> getDeprecated() {
            return this.deprecated;
        }

        public int hashCode() {
            return this.deprecated.hashCode() + (this.active.hashCode() * 31);
        }

        public String toString() {
            return "VersionInfo(active=" + this.active + ", deprecated=" + this.deprecated + ")";
        }
    }

    public SPaySdkConfig(String version, Localization localization, ArrayList<Schema> schemas, ArrayList<FeatureToggle> featuresToggle, VersionInfo versionInfo, Images images, ArrayList<String> arrayList) {
        zdlpuopuiu.btonecajqb(version, "version");
        zdlpuopuiu.btonecajqb(localization, "localization");
        zdlpuopuiu.btonecajqb(schemas, "schemas");
        zdlpuopuiu.btonecajqb(featuresToggle, "featuresToggle");
        zdlpuopuiu.btonecajqb(images, "images");
        this.version = version;
        this.localization = localization;
        this.schemas = schemas;
        this.featuresToggle = featuresToggle;
        this.versionInfo = versionInfo;
        this.images = images;
        this.sslPins = arrayList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ SPaySdkConfig copy$default(SPaySdkConfig sPaySdkConfig, String str, Localization localization, ArrayList arrayList, ArrayList arrayList2, VersionInfo versionInfo, Images images, ArrayList arrayList3, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = sPaySdkConfig.version;
        }
        if ((i13 & 2) != 0) {
            localization = sPaySdkConfig.localization;
        }
        Localization localization2 = localization;
        if ((i13 & 4) != 0) {
            arrayList = sPaySdkConfig.schemas;
        }
        ArrayList arrayList4 = arrayList;
        if ((i13 & 8) != 0) {
            arrayList2 = sPaySdkConfig.featuresToggle;
        }
        ArrayList arrayList5 = arrayList2;
        if ((i13 & 16) != 0) {
            versionInfo = sPaySdkConfig.versionInfo;
        }
        VersionInfo versionInfo2 = versionInfo;
        if ((i13 & 32) != 0) {
            images = sPaySdkConfig.images;
        }
        Images images2 = images;
        if ((i13 & 64) != 0) {
            arrayList3 = sPaySdkConfig.sslPins;
        }
        return sPaySdkConfig.copy(str, localization2, arrayList4, arrayList5, versionInfo2, images2, arrayList3);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getVersion() {
        return this.version;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Localization getLocalization() {
        return this.localization;
    }

    public final ArrayList<Schema> component3() {
        return this.schemas;
    }

    public final ArrayList<FeatureToggle> component4() {
        return this.featuresToggle;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final VersionInfo getVersionInfo() {
        return this.versionInfo;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final Images getImages() {
        return this.images;
    }

    public final ArrayList<String> component7() {
        return this.sslPins;
    }

    public final SPaySdkConfig copy(String version, Localization localization, ArrayList<Schema> schemas, ArrayList<FeatureToggle> featuresToggle, VersionInfo versionInfo, Images images, ArrayList<String> sslPins) {
        zdlpuopuiu.btonecajqb(version, "version");
        zdlpuopuiu.btonecajqb(localization, "localization");
        zdlpuopuiu.btonecajqb(schemas, "schemas");
        zdlpuopuiu.btonecajqb(featuresToggle, "featuresToggle");
        zdlpuopuiu.btonecajqb(images, "images");
        return new SPaySdkConfig(version, localization, schemas, featuresToggle, versionInfo, images, sslPins);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SPaySdkConfig)) {
            return false;
        }
        SPaySdkConfig sPaySdkConfig = (SPaySdkConfig) other;
        return zdlpuopuiu.eablkybsjg(this.version, sPaySdkConfig.version) && zdlpuopuiu.eablkybsjg(this.localization, sPaySdkConfig.localization) && zdlpuopuiu.eablkybsjg(this.schemas, sPaySdkConfig.schemas) && zdlpuopuiu.eablkybsjg(this.featuresToggle, sPaySdkConfig.featuresToggle) && zdlpuopuiu.eablkybsjg(this.versionInfo, sPaySdkConfig.versionInfo) && zdlpuopuiu.eablkybsjg(this.images, sPaySdkConfig.images) && zdlpuopuiu.eablkybsjg(this.sslPins, sPaySdkConfig.sslPins);
    }

    public final ArrayList<FeatureToggle> getFeaturesToggle() {
        return this.featuresToggle;
    }

    public final Images getImages() {
        return this.images;
    }

    public final Localization getLocalization() {
        return this.localization;
    }

    public final ArrayList<Schema> getSchemas() {
        return this.schemas;
    }

    public final ArrayList<String> getSslPins() {
        return this.sslPins;
    }

    public final String getVersion() {
        return this.version;
    }

    public final VersionInfo getVersionInfo() {
        return this.versionInfo;
    }

    public int hashCode() {
        int iHashCode = (this.featuresToggle.hashCode() + ((this.schemas.hashCode() + ((this.localization.hashCode() + (this.version.hashCode() * 31)) * 31)) * 31)) * 31;
        VersionInfo versionInfo = this.versionInfo;
        int iHashCode2 = (this.images.hashCode() + ((iHashCode + (versionInfo == null ? 0 : versionInfo.hashCode())) * 31)) * 31;
        ArrayList<String> arrayList = this.sslPins;
        return iHashCode2 + (arrayList != null ? arrayList.hashCode() : 0);
    }

    public String toString() {
        return "SPaySdkConfig(version=" + this.version + ", localization=" + this.localization + ", schemas=" + this.schemas + ", featuresToggle=" + this.featuresToggle + ", versionInfo=" + this.versionInfo + ", images=" + this.images + ", sslPins=" + this.sslPins + ")";
    }
}
