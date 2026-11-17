package d42;

import gg.wwaezpbzkn;
import ru.myspar.services.crash_logger.api.CrashlyticsKey;

/* JADX INFO: loaded from: classes6.dex */
public abstract class zoijcleaow {
    /* JADX INFO: Access modifiers changed from: private */
    public static final wwaezpbzkn zoijcleaow(com.google.firebase.crashlytics.iobyxmoadg iobyxmoadgVar, CrashlyticsKey crashlyticsKey) {
        if (crashlyticsKey == null) {
            return null;
        }
        iobyxmoadgVar.gxszxtbevo(crashlyticsKey.getCode(), crashlyticsKey.getValue());
        return wwaezpbzkn.f37140iobyxmoadg;
    }
}
