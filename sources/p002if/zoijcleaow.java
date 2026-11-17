package p002if;

import com.pandulapeter.beagle.common.configuration.Text;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes2.dex */
public interface zoijcleaow {

    public static final class iobyxmoadg {
        public static String iobyxmoadg(zoijcleaow zoijcleaowVar) {
            Text title = zoijcleaowVar.getTitle();
            if (title instanceof Text.CharSequence) {
                return ((Text.CharSequence) title).getCharSequence().toString();
            }
            if (title instanceof Text.ResourceId) {
                return String.valueOf(((Text.ResourceId) title).getResourceId());
            }
            throw new NoWhenBranchMatchedException();
        }
    }

    String getId();

    Text getTitle();
}
