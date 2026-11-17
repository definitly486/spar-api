package e11;

import android.os.Build;
import gg.wwaezpbzkn;
import kotlin.jvm.internal.zdlpuopuiu;
import zr0.zoijcleaow;

/* JADX INFO: loaded from: classes5.dex */
public final class iobyxmoadg extends zoijcleaow {
    /* JADX INFO: Access modifiers changed from: protected */
    @Override // zr0.zoijcleaow
    /* JADX INFO: renamed from: ppxfxbqfkf, reason: merged with bridge method [inline-methods] */
    public String[] iobyxmoadg(wwaezpbzkn parameters) {
        zdlpuopuiu.btonecajqb(parameters, "parameters");
        return Build.VERSION.SDK_INT >= 33 ? new String[]{"android.permission.POST_NOTIFICATIONS"} : new String[0];
    }
}
