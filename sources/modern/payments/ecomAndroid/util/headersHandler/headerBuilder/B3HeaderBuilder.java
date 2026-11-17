package modern.payments.ecomAndroid.util.headersHandler.headerBuilder;

import kotlin.Metadata;
import modern.payments.ecomAndroid.data.Utils;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\b\u0000\u0018\u0000 \u000b2\u00020\u0001:\u0001\u000bB\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\t\u001a\u00020\u0004H\u0002J\b\u0010\n\u001a\u00020\u0004H\u0002R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u0011\u0010\u0007\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0006¨\u0006\f"}, d2 = {"Lmodern/payments/ecomAndroid/util/headersHandler/headerBuilder/B3HeaderBuilder;", "", "()V", "spanId", "", "getSpanId", "()Ljava/lang/String;", "traceId", "getTraceId", "buildSpanIdHeader", "buildTraceIdHeader", "Companion", "ecomAndroid_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class B3HeaderBuilder {
    private static final int SPAN_ID_LENGTH = 16;
    private static final int TRACE_ID_LENGTH = 32;
    private final String traceId = buildTraceIdHeader();
    private final String spanId = buildSpanIdHeader();

    private final String buildSpanIdHeader() {
        return Utils.INSTANCE.generateHex(16);
    }

    private final String buildTraceIdHeader() {
        return Utils.INSTANCE.generateHex(32);
    }

    public final String getSpanId() {
        return this.spanId;
    }

    public final String getTraceId() {
        return this.traceId;
    }
}
