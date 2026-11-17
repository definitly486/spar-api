package modern.payments.ecomAndroid.util.jsonParamHelper;

import java.util.Map;
import kotlin.Metadata;
import lg.gxszxtbevo;
import modern.payments.ecomAndroid.data.common.Constants;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001J.\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004H¦@¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lmodern/payments/ecomAndroid/util/jsonParamHelper/JsonParamHelperUtil;", "", "", "encryptedString", "Lmodern/payments/ecomAndroid/data/common/Constants$DeviceCategory;", "deviceCategory", "", "getParamsMap", "(Ljava/lang/String;Lmodern/payments/ecomAndroid/data/common/Constants$DeviceCategory;Llg/gxszxtbevo;)Ljava/lang/Object;", "ecomAndroid_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public interface JsonParamHelperUtil {

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class DefaultImpls {
        public static /* synthetic */ Object getParamsMap$default(JsonParamHelperUtil jsonParamHelperUtil, String str, Constants.DeviceCategory deviceCategory, gxszxtbevo gxszxtbevoVar, int i13, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getParamsMap");
            }
            if ((i13 & 2) != 0) {
                deviceCategory = Constants.DeviceCategory.BRW;
            }
            return jsonParamHelperUtil.getParamsMap(str, deviceCategory, gxszxtbevoVar);
        }
    }

    Object getParamsMap(String str, Constants.DeviceCategory deviceCategory, gxszxtbevo<? super Map<String, String>> gxszxtbevoVar);
}
