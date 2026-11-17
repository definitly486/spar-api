package modern.payments.ecomAndroid.data.api;

import kotlin.Metadata;
import kotlin.jvm.internal.zdlpuopuiu;
import tg.draadjrbmk;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0010\b\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\u0011\u0010\u0002\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a+\u0010\b\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0004*\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u0006H\u0000¢\u0006\u0004\b\b\u0010\t\u001aA\u0010\u000e\u001a\u00028\u0001\"\u0004\b\u0000\u0010\u0004\"\u0004\b\u0001\u0010\n*\b\u0012\u0004\u0012\u00028\u00000\u00052\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u000b2\u0006\u0010\r\u001a\u00028\u0001H\u0000¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"", "", "success", "(I)Z", "T", "Lmodern/payments/ecomAndroid/data/api/ContentResponse;", "Ljava/lang/Exception;", "exception", "getOrThrow", "(Lmodern/payments/ecomAndroid/data/api/ContentResponse;Ljava/lang/Exception;)Ljava/lang/Object;", "R", "Lkotlin/Function1;", "value", "defaultValue", "getOrDefault", "(Lmodern/payments/ecomAndroid/data/api/ContentResponse;Ltg/draadjrbmk;Ljava/lang/Object;)Ljava/lang/Object;", "ecomAndroid_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class ContentResponseKt {
    public static final <T, R> R getOrDefault(ContentResponse<T> contentResponse, draadjrbmk value, R r13) {
        zdlpuopuiu.btonecajqb(contentResponse, "<this>");
        zdlpuopuiu.btonecajqb(value, "value");
        return contentResponse instanceof ContentResponse.Success ? (R) value.invoke(((ContentResponse.Success) contentResponse).getData()) : r13;
    }

    public static final <T> T getOrThrow(ContentResponse<T> contentResponse, Exception exception) throws Exception {
        zdlpuopuiu.btonecajqb(exception, "exception");
        if (contentResponse instanceof ContentResponse.Success) {
            return (T) ((ContentResponse.Success) contentResponse).getData();
        }
        throw exception;
    }

    public static /* synthetic */ Object getOrThrow$default(ContentResponse contentResponse, Exception exc, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            exc = new IllegalStateException("Value should be success on the current step");
        }
        return getOrThrow(contentResponse, exc);
    }

    public static final boolean success(int i13) {
        return 200 <= i13 && i13 < 400;
    }
}
