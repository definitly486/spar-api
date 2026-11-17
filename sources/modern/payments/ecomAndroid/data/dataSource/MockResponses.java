package modern.payments.ecomAndroid.data.dataSource;

import kotlin.Metadata;
import kotlin.jvm.internal.zdlpuopuiu;
import lk.cqumvgiudr;
import lk.yadqdtsiqt;
import lm.kcexrzcfyt;
import modern.payments.ecomAndroid.di.module.paymentFlowModule.PaymentFlowNetworkModuleKt;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\b`\u0018\u00002\u00020\u0001J#\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u0003\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0005\u0010\u0006JG\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\"\u0004\b\u0000\u0010\u00022\u0006\u0010\b\u001a\u00020\u00072\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\tH\u0016¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lmodern/payments/ecomAndroid/data/dataSource/MockResponses;", "", "T", "successfulResponseBody", "Llm/kcexrzcfyt;", "successfulResponse", "(Ljava/lang/Object;)Llm/kcexrzcfyt;", "", "httpErrorCode", "", "errorCode", "description", "info", "errorResponse", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)Llm/kcexrzcfyt;", "ecomAndroid_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public interface MockResponses {

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class DefaultImpls {
        public static <T> kcexrzcfyt<T> errorResponse(MockResponses mockResponses, int i13, String str, String str2, String str3) {
            kcexrzcfyt<T> kcexrzcfytVarPpxfxbqfkf = kcexrzcfyt.ppxfxbqfkf(i13, yadqdtsiqt.f63238yggfygwlhe.zoijcleaow("{\"errorCode\":\"" + str + "\", \"description\":\"" + str2 + "\", \"info\":\"" + str3 + "\"}", cqumvgiudr.f62887eablkybsjg.zoijcleaow(PaymentFlowNetworkModuleKt.REQUEST_TYPE)));
            zdlpuopuiu.dxjokdxxww(kcexrzcfytVarPpxfxbqfkf, "error(...)");
            return kcexrzcfytVarPpxfxbqfkf;
        }

        public static /* synthetic */ kcexrzcfyt errorResponse$default(MockResponses mockResponses, int i13, String str, String str2, String str3, int i14, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: errorResponse");
            }
            if ((i14 & 2) != 0) {
                str = "13.31";
            }
            if ((i14 & 4) != 0) {
                str2 = "Some Error";
            }
            if ((i14 & 8) != 0) {
                str3 = "Some info";
            }
            return mockResponses.errorResponse(i13, str, str2, str3);
        }

        public static <T> kcexrzcfyt<T> successfulResponse(MockResponses mockResponses, T t13) {
            kcexrzcfyt<T> kcexrzcfytVarBtonecajqb = kcexrzcfyt.btonecajqb(t13);
            zdlpuopuiu.dxjokdxxww(kcexrzcfytVarBtonecajqb, "success(...)");
            return kcexrzcfytVarBtonecajqb;
        }
    }

    <T> kcexrzcfyt<T> errorResponse(int httpErrorCode, String errorCode, String description, String info);

    <T> kcexrzcfyt<T> successfulResponse(T successfulResponseBody);
}
