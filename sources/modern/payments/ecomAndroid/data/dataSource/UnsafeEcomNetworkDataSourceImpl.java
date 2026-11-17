package modern.payments.ecomAndroid.data.dataSource;

import kotlin.Metadata;
import kotlin.jvm.internal.zdlpuopuiu;
import lg.gxszxtbevo;
import lm.kcexrzcfyt;
import modern.payments.ecomAndroid.data.api.UnsafeCallEcomApi;
import modern.payments.ecomAndroid.data.dto.EcomSbpConfigDto;
import modern.payments.ecomAndroid.data.dto.EcomSdkConfigDto;
import modern.payments.ecomAndroid.domain.dataSource.UnsafeEcomDataSource;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0016\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0096@¢\u0006\u0004\b\b\u0010\tJ\u0016\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u0006H\u0096@¢\u0006\u0004\b\u000b\u0010\tJ\u001e\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\f0\u00062\u0006\u0010\r\u001a\u00020\fH\u0096@¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0010¨\u0006\u0011"}, d2 = {"Lmodern/payments/ecomAndroid/data/dataSource/UnsafeEcomNetworkDataSourceImpl;", "Lmodern/payments/ecomAndroid/domain/dataSource/UnsafeEcomDataSource;", "Lmodern/payments/ecomAndroid/data/api/UnsafeCallEcomApi;", "unsafeCallEcomApi", "<init>", "(Lmodern/payments/ecomAndroid/data/api/UnsafeCallEcomApi;)V", "Llm/kcexrzcfyt;", "Lmodern/payments/ecomAndroid/data/dto/EcomSdkConfigDto;", "getConfig", "(Llg/gxszxtbevo;)Ljava/lang/Object;", "Lmodern/payments/ecomAndroid/data/dto/EcomSbpConfigDto;", "getSbpConfig", "", "serviceUrl", "getIpAddress", "(Ljava/lang/String;Llg/gxszxtbevo;)Ljava/lang/Object;", "Lmodern/payments/ecomAndroid/data/api/UnsafeCallEcomApi;", "ecomAndroid_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class UnsafeEcomNetworkDataSourceImpl implements UnsafeEcomDataSource {
    private final UnsafeCallEcomApi unsafeCallEcomApi;

    public UnsafeEcomNetworkDataSourceImpl(UnsafeCallEcomApi unsafeCallEcomApi) {
        zdlpuopuiu.btonecajqb(unsafeCallEcomApi, "unsafeCallEcomApi");
        this.unsafeCallEcomApi = unsafeCallEcomApi;
    }

    @Override // modern.payments.ecomAndroid.domain.dataSource.UnsafeEcomDataSource
    public Object getConfig(gxszxtbevo<? super kcexrzcfyt<EcomSdkConfigDto>> gxszxtbevoVar) {
        return this.unsafeCallEcomApi.getRemoteConfig(gxszxtbevoVar);
    }

    @Override // modern.payments.ecomAndroid.domain.dataSource.UnsafeEcomDataSource
    public Object getIpAddress(String str, gxszxtbevo<? super kcexrzcfyt<String>> gxszxtbevoVar) {
        return this.unsafeCallEcomApi.getIp(str, gxszxtbevoVar);
    }

    @Override // modern.payments.ecomAndroid.domain.dataSource.UnsafeEcomDataSource
    public Object getSbpConfig(gxszxtbevo<? super kcexrzcfyt<EcomSbpConfigDto>> gxszxtbevoVar) {
        return this.unsafeCallEcomApi.getSbpConfig(gxszxtbevoVar);
    }
}
