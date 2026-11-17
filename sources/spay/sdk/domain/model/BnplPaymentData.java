package spay.sdk.domain.model;

import kk.ag;
import kotlin.Metadata;
import kotlin.jvm.internal.gtknphoqwx;
import kotlin.jvm.internal.zdlpuopuiu;
import npi.spay.Kn;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\b\u0018\u0000 \u00122\u00020\u0001:\u0001\u0012B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\t\u0010\t\u001a\u00020\u0003HÆ\u0003J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\u0013"}, d2 = {"Lspay/sdk/domain/model/BnplPaymentData;", "", "merchantLogin", "", "apiKey", "(Ljava/lang/String;Ljava/lang/String;)V", "getApiKey", "()Ljava/lang/String;", "getMerchantLogin", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "Companion", "SPaySDK_baseRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class BnplPaymentData {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final String apiKey;
    private final String merchantLogin;

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0006\u0010\u0003\u001a\u00020\u0004¨\u0006\u0005"}, d2 = {"Lspay/sdk/domain/model/BnplPaymentData$Companion;", "", "()V", "getBnplPaymentData", "Lspay/sdk/domain/model/BnplPaymentData;", "SPaySDK_baseRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(gtknphoqwx gtknphoqwxVar) {
            this();
        }

        public final BnplPaymentData getBnplPaymentData() {
            int i13 = ag.f55814zoijcleaow;
            if (i13 == 1) {
                return new BnplPaymentData("bnpl-sbrf", "AHMjXmv8vkVhvybwIqlm2cIAAAAAAAAADHRDSikJqKmlyVz6NxPPBwS3tuDjhZMYQjoj4LwfvhrdJ2w5XUfZc8/nGNWtc0QVMH37jvx5G3B+HqJ8/eMEN6xOXD7cxvXGdN2eh1l7oc6wqq+IozWI+jtlX6R5ZfpqT2c0aEAEZegwFuhfg66gBKi4DdMcDw==");
            }
            if (i13 == 3) {
                return new BnplPaymentData("bnpl_sbrf", "AL6zIhba+UMTsQmd/nRpFbQAAAAAAAAADJXNTkFfYPGQfnUNkAile/7RAcbRtqIcsm64coPhlMKLhpc9J5vJq8hTm9JkA2FFyrZPBJ56e1yyaAiQ47r74zhUDkBXwbmVOKOXIQTnhFflBcpIpwsrCMVSNPGAhFR7z3DqbwSf3qzJ0gLOcoEte/nQs8sNbw==");
            }
            if (i13 == 2) {
                return new BnplPaymentData("bnpl_sbrf", "AHMjXmv8vkVhvybwIqlm2cIAAAAAAAAADHRDSikJqKmlyVz6NxPPBwS3tuDjhZMYQjoj4LwfvhrdJ2w5XUfZc8/nGNWtc0QVMH37jvx5G3B+HqJ8/eMEN6xOXD7cxvXGdN2eh1l7oc6wqq+IozWI+jtlX6R5ZfpqT2c0aEAEZegwFuhfg66gBKi4DdMcDw==");
            }
            if (i13 == 6 || i13 == 7) {
                return new BnplPaymentData("bnpl_sbrf", "AL6zIhba+UMTsQmd/nRpFbQAAAAAAAAADJXNTkFfYPGQfnUNkAile/7RAcbRtqIcsm64coPhlMKLhpc9J5vJq8hTm9JkA2FFyrZPBJ56e1yyaAiQ47r74zhUDkBXwbmVOKOXIQTnhFflBcpIpwsrCMVSNPGAhFR7z3DqbwSf3qzJ0gLOcoEte/nQs8sNbw==");
            }
            if (i13 == 5) {
                return new BnplPaymentData("bnpl_sbrf", "AL6zIhba+UMTsQmd/nRpFbQAAAAAAAAADJXNTkFfYPGQfnUNkAile/7RAcbRtqIcsm64coPhlMKLhpc9J5vJq8hTm9JkA2FFyrZPBJ56e1yyaAiQ47r74zhUDkBXwbmVOKOXIQTnhFflBcpIpwsrCMVSNPGAhFR7z3DqbwSf3qzJ0gLOcoEte/nQs8sNbw==");
            }
            throw Kn.f70553zdlpuopuiu;
        }

        private Companion() {
        }
    }

    public BnplPaymentData(String merchantLogin, String apiKey) {
        zdlpuopuiu.btonecajqb(merchantLogin, "merchantLogin");
        zdlpuopuiu.btonecajqb(apiKey, "apiKey");
        this.merchantLogin = merchantLogin;
        this.apiKey = apiKey;
    }

    public static /* synthetic */ BnplPaymentData copy$default(BnplPaymentData bnplPaymentData, String str, String str2, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = bnplPaymentData.merchantLogin;
        }
        if ((i13 & 2) != 0) {
            str2 = bnplPaymentData.apiKey;
        }
        return bnplPaymentData.copy(str, str2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getMerchantLogin() {
        return this.merchantLogin;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getApiKey() {
        return this.apiKey;
    }

    public final BnplPaymentData copy(String merchantLogin, String apiKey) {
        zdlpuopuiu.btonecajqb(merchantLogin, "merchantLogin");
        zdlpuopuiu.btonecajqb(apiKey, "apiKey");
        return new BnplPaymentData(merchantLogin, apiKey);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BnplPaymentData)) {
            return false;
        }
        BnplPaymentData bnplPaymentData = (BnplPaymentData) other;
        return zdlpuopuiu.eablkybsjg(this.merchantLogin, bnplPaymentData.merchantLogin) && zdlpuopuiu.eablkybsjg(this.apiKey, bnplPaymentData.apiKey);
    }

    public final String getApiKey() {
        return this.apiKey;
    }

    public final String getMerchantLogin() {
        return this.merchantLogin;
    }

    public int hashCode() {
        return this.apiKey.hashCode() + (this.merchantLogin.hashCode() * 31);
    }

    public String toString() {
        return "BnplPaymentData(merchantLogin=" + this.merchantLogin + ", apiKey=" + this.apiKey + ")";
    }
}
