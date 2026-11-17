package modern.payments.ecomAndroid.util.logging;

import kotlin.Metadata;
import kotlin.jvm.internal.zdlpuopuiu;
import modern.payments.ecomAndroid.data.common.Constants;
import modern.payments.ecomAndroid.domain.model.feature.EcomFeatureParam;
import modern.payments.ecomAndroid.domain.repository.EcomSdkOptionsRepository;
import modern.payments.tracker.util.contract.LoggingContract;
import uk.agtfadlqog;
import zk.iobyxmoadg;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\rR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u000e¨\u0006\u000f"}, d2 = {"Lmodern/payments/ecomAndroid/util/logging/CustomHttpLoggerImpl;", "", "Lmodern/payments/tracker/util/contract/LoggingContract;", "loggingContract", "Lmodern/payments/ecomAndroid/domain/repository/EcomSdkOptionsRepository;", "ecomSdkOptionsRepository", "<init>", "(Lmodern/payments/tracker/util/contract/LoggingContract;Lmodern/payments/ecomAndroid/domain/repository/EcomSdkOptionsRepository;)V", "", "message", "Lgg/wwaezpbzkn;", "log", "(Ljava/lang/String;)V", "Lmodern/payments/tracker/util/contract/LoggingContract;", "Lmodern/payments/ecomAndroid/domain/repository/EcomSdkOptionsRepository;", "ecomAndroid_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class CustomHttpLoggerImpl implements iobyxmoadg.zoijcleaow {
    private final EcomSdkOptionsRepository ecomSdkOptionsRepository;
    private final LoggingContract loggingContract;

    public CustomHttpLoggerImpl(LoggingContract loggingContract, EcomSdkOptionsRepository ecomSdkOptionsRepository) {
        zdlpuopuiu.btonecajqb(loggingContract, "loggingContract");
        zdlpuopuiu.btonecajqb(ecomSdkOptionsRepository, "ecomSdkOptionsRepository");
        this.loggingContract = loggingContract;
        this.ecomSdkOptionsRepository = ecomSdkOptionsRepository;
    }

    @Override // zk.iobyxmoadg.zoijcleaow
    public void log(String message) {
        zdlpuopuiu.btonecajqb(message, "message");
        EcomSdkOptionsRepository ecomSdkOptionsRepository = this.ecomSdkOptionsRepository;
        if (this.loggingContract.getLoggerInitialized() || !ecomSdkOptionsRepository.isFeatureEnabledBy(Constants.FeatureName.ENABLE_LOGGING, EcomFeatureParam.ENABLED_BY_MERCHANT)) {
            return;
        }
        agtfadlqog.gtknphoqwx(agtfadlqog.f113749iobyxmoadg.lqeggnwhkg(), message, 0, null, 6, null);
    }
}
