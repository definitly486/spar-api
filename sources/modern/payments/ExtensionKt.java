package modern.payments;

import kotlin.Metadata;
import kotlin.jvm.internal.zdlpuopuiu;
import modern.payments.ecomAndroid.Stage;
import modern.payments.ecomAndroid.data.config.DataModes;
import modern.payments.ecomAndroid.data.config.EcomStagingConfig;
import spay.sdk.api.SPayStage;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0013\u0010\u0006\u001a\u00020\u0005*\u00020\u0004H\u0000¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lmodern/payments/ecomAndroid/data/config/EcomStagingConfig;", "Lspay/sdk/api/SPayStage;", "mapToSPaySdkStage", "(Lmodern/payments/ecomAndroid/data/config/EcomStagingConfig;)Lspay/sdk/api/SPayStage;", "Lmodern/payments/ecomAndroid/Stage;", "Lgg/wwaezpbzkn;", "processStageMode", "(Lmodern/payments/ecomAndroid/Stage;)V", "ecomAndroid_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class ExtensionKt {

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[DataModes.values().length];
            try {
                iArr[DataModes.PROD_SERVER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[DataModes.SANDBOX_SERVER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[EcomSdkStage.values().length];
            try {
                iArr2[EcomSdkStage.PROD.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[EcomSdkStage.SANDBOX.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    public static final SPayStage mapToSPaySdkStage(EcomStagingConfig ecomStagingConfig) {
        zdlpuopuiu.btonecajqb(ecomStagingConfig, "<this>");
        int i13 = WhenMappings.$EnumSwitchMapping$0[ecomStagingConfig.getDataMode().ordinal()];
        if (i13 != 1 && i13 == 2) {
            return SPayStage.SandboxRealBankApp;
        }
        return SPayStage.Prod;
    }

    public static final void processStageMode(Stage stage) {
        zdlpuopuiu.btonecajqb(stage, "<this>");
        int i13 = WhenMappings.$EnumSwitchMapping$1[((EcomSdkStage) stage).ordinal()];
        if (i13 == 1) {
            EcomStagingConfig.INSTANCE.setProdDataMode();
        } else {
            if (i13 != 2) {
                return;
            }
            EcomStagingConfig.INSTANCE.setSandboxRealBankApp();
        }
    }
}
