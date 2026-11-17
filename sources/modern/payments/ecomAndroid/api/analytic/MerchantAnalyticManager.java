package modern.payments.ecomAndroid.api.analytic;

import gg.wwaezpbzkn;
import kotlin.Metadata;
import lg.gxszxtbevo;
import tg.draadjrbmk;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b`\u0018\u00002\u00020\u0001J<\u0010\n\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0006H¦@¢\u0006\u0004\b\n\u0010\u000bJ2\u0010\u0010\u001a\u00020\t2 \u0010\u000f\u001a\u001c\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00040\r\u0012\u0004\u0012\u00020\t\u0018\u00010\fH¦@¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Lmodern/payments/ecomAndroid/api/analytic/MerchantAnalyticManager;", "", "Lmodern/payments/ecomAndroid/api/analytic/Action;", "action", "", "httpCode", "", "errorCode", "description", "Lgg/wwaezpbzkn;", "sendMetric", "(Lmodern/payments/ecomAndroid/api/analytic/Action;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Llg/gxszxtbevo;)Ljava/lang/Object;", "Lkotlin/Function1;", "Lgg/vdvldrhtss;", "Lmodern/payments/ecomAndroid/api/analytic/model/AnalyticalEvent;", "callback", "collectMetrics", "(Ltg/draadjrbmk;Llg/gxszxtbevo;)Ljava/lang/Object;", "ecomAndroid_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public interface MerchantAnalyticManager {

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class DefaultImpls {
        public static /* synthetic */ Object sendMetric$default(MerchantAnalyticManager merchantAnalyticManager, Action action, Integer num, String str, String str2, gxszxtbevo gxszxtbevoVar, int i13, Object obj) {
            if (obj == null) {
                return merchantAnalyticManager.sendMetric(action, (i13 & 2) != 0 ? null : num, (i13 & 4) != 0 ? null : str, (i13 & 8) != 0 ? null : str2, gxszxtbevoVar);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: sendMetric");
        }
    }

    Object collectMetrics(draadjrbmk draadjrbmkVar, gxszxtbevo<? super wwaezpbzkn> gxszxtbevoVar);

    Object sendMetric(Action action, Integer num, String str, String str2, gxszxtbevo<? super wwaezpbzkn> gxszxtbevoVar);
}
