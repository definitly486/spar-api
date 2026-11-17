package modern.payments.ecomAndroid.util.extension;

import kotlin.Metadata;
import kotlin.jvm.internal.zdlpuopuiu;
import modern.payments.ecomAndroid.data.common.Constants;
import modern.payments.ecomAndroid.domain.model.feature.EcomFeatureParam;
import modern.payments.ecomAndroid.domain.repository.EcomSdkOptionsRepository;
import modern.payments.tracker.ITracker;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\u001aE\u0010\u000b\u001a\u00020\n*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\b\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u0003H\u0000¢\u0006\u0004\b\u000b\u0010\f\u001a\u0013\u0010\u000e\u001a\u00020\r*\u00020\u0001H\u0000¢\u0006\u0004\b\u000e\u0010\u000f\u001a\u0013\u0010\u0010\u001a\u00020\r*\u00020\u0001H\u0000¢\u0006\u0004\b\u0010\u0010\u000f\u001a\u0013\u0010\u0011\u001a\u00020\r*\u00020\u0001H\u0000¢\u0006\u0004\b\u0011\u0010\u000f\u001a\u0013\u0010\u0012\u001a\u00020\r*\u00020\u0001H\u0000¢\u0006\u0004\b\u0012\u0010\u000f¨\u0006\u0013"}, d2 = {"Lmodern/payments/tracker/ITracker;", "Lmodern/payments/ecomAndroid/domain/repository/EcomSdkOptionsRepository;", "options", "", "event", "", "exception", "Lmodern/payments/tracker/ITracker$Priority;", "priority", "tag", "Lgg/wwaezpbzkn;", "track", "(Lmodern/payments/tracker/ITracker;Lmodern/payments/ecomAndroid/domain/repository/EcomSdkOptionsRepository;Ljava/lang/String;Ljava/lang/Throwable;Lmodern/payments/tracker/ITracker$Priority;Ljava/lang/String;)V", "", "isNewCardEnable", "(Lmodern/payments/ecomAndroid/domain/repository/EcomSdkOptionsRepository;)Z", "isBindingEnable", "isSpayEnable", "isSbpEnabled", "ecomAndroid_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class FeatureExtensionsKt {
    public static final boolean isBindingEnable(EcomSdkOptionsRepository ecomSdkOptionsRepository) {
        zdlpuopuiu.btonecajqb(ecomSdkOptionsRepository, "<this>");
        return ecomSdkOptionsRepository.isFeatureEnabled(Constants.FeatureName.BINDING);
    }

    public static final boolean isNewCardEnable(EcomSdkOptionsRepository ecomSdkOptionsRepository) {
        zdlpuopuiu.btonecajqb(ecomSdkOptionsRepository, "<this>");
        return ecomSdkOptionsRepository.isFeatureEnabled(Constants.FeatureName.NEW_CARD);
    }

    public static final boolean isSbpEnabled(EcomSdkOptionsRepository ecomSdkOptionsRepository) {
        zdlpuopuiu.btonecajqb(ecomSdkOptionsRepository, "<this>");
        return ecomSdkOptionsRepository.isFeatureEnabled(Constants.FeatureName.SBP);
    }

    public static final boolean isSpayEnable(EcomSdkOptionsRepository ecomSdkOptionsRepository) {
        zdlpuopuiu.btonecajqb(ecomSdkOptionsRepository, "<this>");
        return ecomSdkOptionsRepository.isFeatureEnabled(Constants.FeatureName.SPAY);
    }

    public static final void track(ITracker iTracker, EcomSdkOptionsRepository options, String str, Throwable th2, ITracker.Priority priority, String tag) {
        zdlpuopuiu.btonecajqb(iTracker, "<this>");
        zdlpuopuiu.btonecajqb(options, "options");
        zdlpuopuiu.btonecajqb(priority, "priority");
        zdlpuopuiu.btonecajqb(tag, "tag");
        if (options.isFeatureEnabledBy(Constants.FeatureName.ENABLE_LOGGING, EcomFeatureParam.ENABLED_BY_MERCHANT)) {
            iTracker.track(str, th2, priority, tag);
        }
    }

    public static /* synthetic */ void track$default(ITracker iTracker, EcomSdkOptionsRepository ecomSdkOptionsRepository, String str, Throwable th2, ITracker.Priority priority, String str2, int i13, Object obj) {
        if ((i13 & 4) != 0) {
            th2 = null;
        }
        Throwable th3 = th2;
        if ((i13 & 8) != 0) {
            priority = ITracker.Priority.DEBUG;
        }
        ITracker.Priority priority2 = priority;
        if ((i13 & 16) != 0) {
            str2 = "Ecom Tracker";
        }
        track(iTracker, ecomSdkOptionsRepository, str, th3, priority2, str2);
    }
}
