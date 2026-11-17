package qb2;

import android.content.Context;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
public final class eablkybsjg {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    public static final eablkybsjg f78425iobyxmoadg = new eablkybsjg();

    private eablkybsjg() {
    }

    public static /* synthetic */ wkgbmnqykc zoijcleaow(eablkybsjg eablkybsjgVar, Context context, Map map, int i13, Object obj) {
        if ((i13 & 2) != 0) {
            map = null;
        }
        return eablkybsjgVar.iobyxmoadg(context, map);
    }

    public final wkgbmnqykc iobyxmoadg(Context context, Map map) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(context, "context");
        Context applicationContext = context.getApplicationContext();
        kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(applicationContext, "context.applicationContext");
        return new wkgbmnqykc(applicationContext, map);
    }
}
