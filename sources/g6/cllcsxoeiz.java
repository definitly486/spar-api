package g6;

import android.content.Context;
import java.util.List;
import java.util.UUID;

/* JADX INFO: loaded from: classes2.dex */
public abstract class cllcsxoeiz {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    public static final iobyxmoadg f36369iobyxmoadg = new iobyxmoadg(null);

    public static final class iobyxmoadg {
        public /* synthetic */ iobyxmoadg(kotlin.jvm.internal.gtknphoqwx gtknphoqwxVar) {
            this();
        }

        public cllcsxoeiz iobyxmoadg(Context context) {
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(context, "context");
            h6.dsvhmnatus dsvhmnatusVarRgvfuqvkyq = h6.dsvhmnatus.rgvfuqvkyq(context);
            kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(dsvhmnatusVarRgvfuqvkyq, "getInstance(context)");
            return dsvhmnatusVarRgvfuqvkyq;
        }

        private iobyxmoadg() {
        }
    }

    public enum zoijcleaow {
        NOT_APPLIED,
        APPLIED_IMMEDIATELY,
        APPLIED_FOR_NEXT_RUN
    }

    public static cllcsxoeiz nufgyqmvbu(Context context) {
        return f36369iobyxmoadg.iobyxmoadg(context);
    }

    public abstract androidx.lifecycle.cqumvgiudr dxjokdxxww(UUID uuid);

    public abstract esjtqupxsv eablkybsjg(String str, nufgyqmvbu nufgyqmvbuVar, yadqdtsiqt yadqdtsiqtVar);

    public esjtqupxsv gxszxtbevo(String uniqueWorkName, dxjokdxxww existingWorkPolicy, cqumvgiudr request) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(uniqueWorkName, "uniqueWorkName");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(existingWorkPolicy, "existingWorkPolicy");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(request, "request");
        return lqeggnwhkg(uniqueWorkName, existingWorkPolicy, hg.jyumaefscl.eablkybsjg(request));
    }

    public abstract esjtqupxsv iobyxmoadg(String str);

    public abstract esjtqupxsv lqeggnwhkg(String str, dxjokdxxww dxjokdxxwwVar, List list);

    public final esjtqupxsv ppxfxbqfkf(dsvhmnatus request) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(request, "request");
        return wkgbmnqykc(hg.jyumaefscl.eablkybsjg(request));
    }

    public abstract esjtqupxsv wkgbmnqykc(List list);

    public abstract esjtqupxsv zoijcleaow(String str);
}
