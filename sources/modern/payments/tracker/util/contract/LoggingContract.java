package modern.payments.tracker.util.contract;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\bf\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006J\u0019\u0010\b\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0002H&¢\u0006\u0004\b\b\u0010\u0006R\u0014\u0010\u000b\u001a\u00020\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\nR\u0014\u0010\r\u001a\u00020\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\n¨\u0006\u000e"}, d2 = {"Lmodern/payments/tracker/util/contract/LoggingContract;", "", "", "isInitialized", "Lgg/wwaezpbzkn;", "setLoggerState", "(Z)V", "isEnabled", "setLoggingEnabledState", "getLoggerInitialized", "()Z", "loggerInitialized", "getLoggingEnabled", "loggingEnabled", "ecomAndroid_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public interface LoggingContract {

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class DefaultImpls {
        public static /* synthetic */ void setLoggingEnabledState$default(LoggingContract loggingContract, boolean z13, int i13, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: setLoggingEnabledState");
            }
            if ((i13 & 1) != 0) {
                z13 = false;
            }
            loggingContract.setLoggingEnabledState(z13);
        }
    }

    boolean getLoggerInitialized();

    boolean getLoggingEnabled();

    void setLoggerState(boolean isInitialized);

    void setLoggingEnabledState(boolean isEnabled);
}
