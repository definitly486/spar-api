package modern.payments.ecomAndroid.util.networkErrorHandler;

import kotlin.Metadata;
import modern.payments.ecomAndroid.data.api.ErrorEntity;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b`\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002J\u0015\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00028\u0000H&¢\u0006\u0002\u0010\u0006¨\u0006\u0007"}, d2 = {"Lmodern/payments/ecomAndroid/util/networkErrorHandler/NetworkErrorHandler;", "T", "", "getError", "Lmodern/payments/ecomAndroid/data/api/ErrorEntity;", "error", "(Ljava/lang/Object;)Lmodern/payments/ecomAndroid/data/api/ErrorEntity;", "ecomAndroid_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public interface NetworkErrorHandler<T> {
    ErrorEntity getError(T error);
}
