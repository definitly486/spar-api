package modern.payments.ecomAndroid.util.exception;

import kotlin.Metadata;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0000\u0018\u00002\u00060\u0001j\u0002`\u0002B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lmodern/payments/ecomAndroid/util/exception/NullRequiredBodyException;", "Ljava/lang/IllegalStateException;", "Lkotlin/IllegalStateException;", "endPoint", "", "(Ljava/lang/String;)V", "getEndPoint", "()Ljava/lang/String;", "ecomAndroid_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class NullRequiredBodyException extends IllegalStateException {
    private final String endPoint;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NullRequiredBodyException(String endPoint) {
        super("Body from this service ---" + endPoint + "--- can not be null");
        zdlpuopuiu.btonecajqb(endPoint, "endPoint");
        this.endPoint = endPoint;
    }

    public final String getEndPoint() {
        return this.endPoint;
    }
}
