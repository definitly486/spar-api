package modern.payments.ecomAndroid.domain.configService;

import kotlin.Metadata;
import lg.gxszxtbevo;
import modern.payments.ecomAndroid.domain.model.response.EcomSdkConfig;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b`\u0018\u0000 \u00072\u00020\u0001:\u0001\u0007J\u0012\u0010\u0003\u001a\u0004\u0018\u00010\u0002H¦@¢\u0006\u0004\b\u0003\u0010\u0004J\u0011\u0010\u0005\u001a\u0004\u0018\u00010\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"Lmodern/payments/ecomAndroid/domain/configService/ConfigService;", "", "Lmodern/payments/ecomAndroid/domain/model/response/EcomSdkConfig;", "getRemoteConfig", "(Llg/gxszxtbevo;)Ljava/lang/Object;", "getConfigFromAssets", "()Lmodern/payments/ecomAndroid/domain/model/response/EcomSdkConfig;", "Companion", "ecomAndroid_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public interface ConfigService {
    public static final String CONFIG_FROM_API = "CONFIG_FROM_API : ";
    public static final String CONFIG_FROM_ASSETS = "CONFIG_FROM_ASSETS : ";

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = Companion.$$INSTANCE;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lmodern/payments/ecomAndroid/domain/configService/ConfigService$Companion;", "", "()V", "CONFIG_FROM_API", "", "CONFIG_FROM_ASSETS", "ecomAndroid_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();
        public static final String CONFIG_FROM_API = "CONFIG_FROM_API : ";
        public static final String CONFIG_FROM_ASSETS = "CONFIG_FROM_ASSETS : ";

        private Companion() {
        }
    }

    EcomSdkConfig getConfigFromAssets();

    Object getRemoteConfig(gxszxtbevo<? super EcomSdkConfig> gxszxtbevoVar);
}
