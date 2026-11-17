package z20;

import android.os.Build;
import ft.zoijcleaow;
import gg.wwaezpbzkn;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes4.dex */
public final class iobyxmoadg extends zoijcleaow {
    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ft.zoijcleaow
    /* JADX INFO: renamed from: ppxfxbqfkf, reason: merged with bridge method [inline-methods] */
    public String[] iobyxmoadg(wwaezpbzkn parameters) {
        zdlpuopuiu.btonecajqb(parameters, "parameters");
        return Build.VERSION.SDK_INT >= 33 ? new String[]{"android.permission.POST_NOTIFICATIONS"} : new String[0];
    }
}
