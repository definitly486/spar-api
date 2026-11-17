package modern.payments.tracker.util.contract.impl;

import kotlin.Metadata;
import modern.payments.tracker.util.contract.LoggingContract;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\n\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\n\u0010\bR$\u0010\f\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u00048\u0016@RX\u0096\u000e¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR$\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u00048\u0016@RX\u0096\u000e¢\u0006\f\n\u0004\b\u0010\u0010\r\u001a\u0004\b\u0011\u0010\u000f¨\u0006\u0012"}, d2 = {"Lmodern/payments/tracker/util/contract/impl/LoggingContractImpl;", "Lmodern/payments/tracker/util/contract/LoggingContract;", "<init>", "()V", "", "isInitialized", "Lgg/wwaezpbzkn;", "setLoggerState", "(Z)V", "isEnabled", "setLoggingEnabledState", "<set-?>", "loggerInitialized", "Z", "getLoggerInitialized", "()Z", "loggingEnabled", "getLoggingEnabled", "ecomAndroid_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class LoggingContractImpl implements LoggingContract {
    private boolean loggerInitialized;
    private boolean loggingEnabled = true;

    @Override // modern.payments.tracker.util.contract.LoggingContract
    public boolean getLoggerInitialized() {
        return this.loggerInitialized;
    }

    @Override // modern.payments.tracker.util.contract.LoggingContract
    public boolean getLoggingEnabled() {
        return this.loggingEnabled;
    }

    @Override // modern.payments.tracker.util.contract.LoggingContract
    public void setLoggerState(boolean isInitialized) {
        this.loggerInitialized = isInitialized;
    }

    @Override // modern.payments.tracker.util.contract.LoggingContract
    public void setLoggingEnabledState(boolean isEnabled) {
        this.loggingEnabled = isEnabled;
    }
}
