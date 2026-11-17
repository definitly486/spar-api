package modern.payments.ecomAndroid.util.interceptor.impl;

import java.io.IOException;
import kotlin.Metadata;
import kotlin.jvm.internal.gtknphoqwx;
import kotlin.jvm.internal.zdlpuopuiu;
import lk.cdpycssgdh;
import lk.iwizpuwonk;
import lk.jyumaefscl;
import lk.zynmafqrjb;
import modern.payments.ecomAndroid.data.config.DataModes;
import modern.payments.ecomAndroid.data.config.EcomStagingConfig;
import modern.payments.ecomAndroid.di.module.sdkFlowModule.EcomSdkFlowNetworkModule;
import modern.payments.ecomAndroid.util.interceptor.HostSelectionInterceptor;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u0000 \u00142\u00020\u0001:\u0001\u0014B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001b\u0010\b\u001a\u00020\u0007*\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000b\u0010\u0003J\u0011\u0010\f\u001a\u0004\u0018\u00010\u0005H\u0016¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0011\u0010\u0012R\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0006\u0010\u0013¨\u0006\u0015"}, d2 = {"Lmodern/payments/ecomAndroid/util/interceptor/impl/HostSelectionInterceptorImpl;", "Lmodern/payments/ecomAndroid/util/interceptor/HostSelectionInterceptor;", "<init>", "()V", "Llk/zynmafqrjb;", "Lmodern/payments/ecomAndroid/util/interceptor/impl/HostConfig;", "host", "Llk/jyumaefscl;", "getNewUrl", "(Llk/zynmafqrjb;Lmodern/payments/ecomAndroid/util/interceptor/impl/HostConfig;)Llk/jyumaefscl;", "Lgg/wwaezpbzkn;", "setHostBaseUrl", "getHostBaseUrl", "()Lmodern/payments/ecomAndroid/util/interceptor/impl/HostConfig;", "Llk/iwizpuwonk$iobyxmoadg;", "chain", "Llk/cdpycssgdh;", "intercept", "(Llk/iwizpuwonk$iobyxmoadg;)Llk/cdpycssgdh;", "Lmodern/payments/ecomAndroid/util/interceptor/impl/HostConfig;", "Companion", "ecomAndroid_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class HostSelectionInterceptorImpl implements HostSelectionInterceptor {
    private static final Companion Companion = new Companion(null);

    @Deprecated
    public static final String IFT_URL = "https://ift.gate1.spaymentsplus.ru/";

    @Deprecated
    public static final String PROD_URL = "https://gate1.spaymentsplus.ru/";

    @Deprecated
    public static final String PROTOCOL_HTTP = "http";

    @Deprecated
    public static final String PROTOCOL_HTTPS = "https";

    @Deprecated
    public static final String PSI_URL = "https://psi.gate1.spaymentsplus.ru/";

    @Deprecated
    public static final String SANDBOX_URL = "https://ift.gate2.spaymentsplus.ru/";
    private volatile HostConfig host;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0082\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lmodern/payments/ecomAndroid/util/interceptor/impl/HostSelectionInterceptorImpl$Companion;", "", "()V", "IFT_URL", "", "PROD_URL", "PROTOCOL_HTTP", "PROTOCOL_HTTPS", "PSI_URL", "SANDBOX_URL", "ecomAndroid_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(gtknphoqwx gtknphoqwxVar) {
            this();
        }

        private Companion() {
        }
    }

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[DataModes.values().length];
            try {
                iArr[DataModes.IFT_SERVER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[DataModes.LOCAL_MOCKS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[DataModes.PSI_SERVER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[DataModes.SANDBOX_SERVER.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    private final jyumaefscl getNewUrl(zynmafqrjb zynmafqrjbVar, HostConfig hostConfig) {
        Integer port = hostConfig.getPort();
        if (port != null) {
            jyumaefscl jyumaefsclVarPpxfxbqfkf = zynmafqrjbVar.gtknphoqwx().gtknphoqwx().nufgyqmvbu(hostConfig.getHost()).agtfadlqog(port.intValue()).kcexrzcfyt(hostConfig.getProtocol()).ppxfxbqfkf();
            if (jyumaefsclVarPpxfxbqfkf != null) {
                return jyumaefsclVarPpxfxbqfkf;
            }
        }
        return zynmafqrjbVar.gtknphoqwx().gtknphoqwx().nufgyqmvbu(hostConfig.getHost()).kcexrzcfyt(hostConfig.getProtocol()).ppxfxbqfkf();
    }

    @Override // modern.payments.ecomAndroid.util.interceptor.HostSelectionInterceptor
    /* JADX INFO: renamed from: getHostBaseUrl, reason: from getter */
    public HostConfig getHost() {
        return this.host;
    }

    @Override // modern.payments.ecomAndroid.util.interceptor.HostSelectionInterceptor, lk.iwizpuwonk
    public cdpycssgdh intercept(iwizpuwonk.iobyxmoadg chain) throws IOException {
        zdlpuopuiu.btonecajqb(chain, "chain");
        zynmafqrjb zynmafqrjbVarDxjokdxxww = chain.dxjokdxxww();
        HostConfig hostConfig = this.host;
        if (hostConfig != null) {
            String strDxjokdxxww = zynmafqrjbVarDxjokdxxww.gtknphoqwx().dxjokdxxww();
            jyumaefscl jyumaefsclVarGxszxtbevo = jyumaefscl.f63067gtknphoqwx.gxszxtbevo(EcomSdkFlowNetworkModule.DEFAULT_BASE_URL);
            String strDxjokdxxww2 = jyumaefsclVarGxszxtbevo != null ? jyumaefsclVarGxszxtbevo.dxjokdxxww() : null;
            if (strDxjokdxxww2 == null) {
                strDxjokdxxww2 = "";
            }
            if (zdlpuopuiu.eablkybsjg(strDxjokdxxww, strDxjokdxxww2)) {
                zynmafqrjbVarDxjokdxxww = zynmafqrjbVarDxjokdxxww.nufgyqmvbu().zdlpuopuiu(getNewUrl(zynmafqrjbVarDxjokdxxww, hostConfig)).zoijcleaow();
            }
        }
        return chain.zoijcleaow(zynmafqrjbVarDxjokdxxww);
    }

    @Override // modern.payments.ecomAndroid.util.interceptor.HostSelectionInterceptor
    public void setHostBaseUrl() {
        HostConfig hostConfig;
        String strDxjokdxxww;
        int i13 = WhenMappings.$EnumSwitchMapping$0[EcomStagingConfig.INSTANCE.getDataMode().ordinal()];
        if (i13 == 1 || i13 == 2) {
            jyumaefscl jyumaefsclVarGxszxtbevo = jyumaefscl.f63067gtknphoqwx.gxszxtbevo(IFT_URL);
            strDxjokdxxww = jyumaefsclVarGxszxtbevo != null ? jyumaefsclVarGxszxtbevo.dxjokdxxww() : null;
            hostConfig = new HostConfig(PROTOCOL_HTTPS, strDxjokdxxww == null ? "" : strDxjokdxxww, null, 4, null);
        } else if (i13 == 3) {
            jyumaefscl jyumaefsclVarGxszxtbevo2 = jyumaefscl.f63067gtknphoqwx.gxszxtbevo(PSI_URL);
            strDxjokdxxww = jyumaefsclVarGxszxtbevo2 != null ? jyumaefsclVarGxszxtbevo2.dxjokdxxww() : null;
            if (strDxjokdxxww == null) {
                strDxjokdxxww = "";
            }
            hostConfig = new HostConfig(PROTOCOL_HTTPS, strDxjokdxxww, null, 4, null);
        } else if (i13 != 4) {
            jyumaefscl jyumaefsclVarGxszxtbevo3 = jyumaefscl.f63067gtknphoqwx.gxszxtbevo(PROD_URL);
            strDxjokdxxww = jyumaefsclVarGxszxtbevo3 != null ? jyumaefsclVarGxszxtbevo3.dxjokdxxww() : null;
            hostConfig = new HostConfig(PROTOCOL_HTTPS, strDxjokdxxww == null ? "" : strDxjokdxxww, null, 4, null);
        } else {
            jyumaefscl jyumaefsclVarGxszxtbevo4 = jyumaefscl.f63067gtknphoqwx.gxszxtbevo(SANDBOX_URL);
            strDxjokdxxww = jyumaefsclVarGxszxtbevo4 != null ? jyumaefsclVarGxszxtbevo4.dxjokdxxww() : null;
            hostConfig = new HostConfig(PROTOCOL_HTTPS, strDxjokdxxww == null ? "" : strDxjokdxxww, null, 4, null);
        }
        this.host = hostConfig;
    }
}
