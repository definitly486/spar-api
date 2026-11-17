package bl1;

import m9.wkgbmnqykc;
import ru.myspar.proloyalty.rate.feedback.api.models.FeedbackArgs;

/* JADX INFO: loaded from: classes6.dex */
public interface iobyxmoadg {
    static /* synthetic */ wkgbmnqykc zoijcleaow(iobyxmoadg iobyxmoadgVar, FeedbackArgs feedbackArgs, int i13, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: feedbackScreen");
        }
        if ((i13 & 1) != 0) {
            feedbackArgs = new FeedbackArgs(null, 1, null);
        }
        return iobyxmoadgVar.iobyxmoadg(feedbackArgs);
    }

    wkgbmnqykc iobyxmoadg(FeedbackArgs feedbackArgs);
}
