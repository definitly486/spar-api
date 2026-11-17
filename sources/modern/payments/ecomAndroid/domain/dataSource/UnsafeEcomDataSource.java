package modern.payments.ecomAndroid.domain.dataSource;

import kotlin.Metadata;
import lg.gxszxtbevo;
import lm.kcexrzcfyt;
import modern.payments.ecomAndroid.data.dto.EcomSbpConfigDto;
import modern.payments.ecomAndroid.data.dto.EcomSdkConfigDto;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\b`\u0018\u00002\u00020\u0001J\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H¦@¢\u0006\u0004\b\u0004\u0010\u0005J\u0016\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0002H¦@¢\u0006\u0004\b\u0007\u0010\u0005J\u001e\u0010\n\u001a\b\u0012\u0004\u0012\u00020\b0\u00022\u0006\u0010\t\u001a\u00020\bH¦@¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lmodern/payments/ecomAndroid/domain/dataSource/UnsafeEcomDataSource;", "", "Llm/kcexrzcfyt;", "Lmodern/payments/ecomAndroid/data/dto/EcomSdkConfigDto;", "getConfig", "(Llg/gxszxtbevo;)Ljava/lang/Object;", "Lmodern/payments/ecomAndroid/data/dto/EcomSbpConfigDto;", "getSbpConfig", "", "serviceUrl", "getIpAddress", "(Ljava/lang/String;Llg/gxszxtbevo;)Ljava/lang/Object;", "ecomAndroid_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public interface UnsafeEcomDataSource {
    Object getConfig(gxszxtbevo<? super kcexrzcfyt<EcomSdkConfigDto>> gxszxtbevoVar);

    Object getIpAddress(String str, gxszxtbevo<? super kcexrzcfyt<String>> gxszxtbevoVar);

    Object getSbpConfig(gxszxtbevo<? super kcexrzcfyt<EcomSbpConfigDto>> gxszxtbevoVar);
}
