package fv1;

import k21.ojitshcjhn;
import kotlin.jvm.internal.zdlpuopuiu;
import ru.myspar.proloyalty.support_service.impl.domain.model.SupportAction;

/* JADX INFO: loaded from: classes6.dex */
public abstract class zoijcleaow {
    public static final iobyxmoadg iobyxmoadg(SupportAction supportAction, int i13) {
        zdlpuopuiu.btonecajqb(supportAction, "<this>");
        String name = supportAction.getName();
        String iconUrl = supportAction.getIconUrl();
        if (supportAction.getPayload().getNavigationLink() != ojitshcjhn.CHAT) {
            i13 = 0;
        }
        return new iobyxmoadg(name, iconUrl, i13);
    }
}
