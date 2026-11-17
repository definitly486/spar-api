package dd;

import android.content.Context;
import com.google.firebase.agtfadlqog;
import com.google.firebase.perf.metrics.AppStartTrace;
import com.google.firebase.perf.session.SessionManager;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes2.dex */
public class zoijcleaow {
    public zoijcleaow(com.google.firebase.gxszxtbevo gxszxtbevoVar, agtfadlqog agtfadlqogVar, Executor executor) {
        Context contextGtknphoqwx = gxszxtbevoVar.gtknphoqwx();
        com.google.firebase.perf.config.iobyxmoadg.lqeggnwhkg().dsvhmnatus(contextGtknphoqwx);
        com.google.firebase.perf.application.iobyxmoadg iobyxmoadgVarZoijcleaow = com.google.firebase.perf.application.iobyxmoadg.zoijcleaow();
        iobyxmoadgVarZoijcleaow.dxjokdxxww(contextGtknphoqwx);
        iobyxmoadgVarZoijcleaow.btonecajqb(new gxszxtbevo());
        if (agtfadlqogVar != null) {
            AppStartTrace appStartTraceWflxmlrfwp = AppStartTrace.wflxmlrfwp();
            appStartTraceWflxmlrfwp.iwizpuwonk(contextGtknphoqwx);
            executor.execute(new AppStartTrace.ppxfxbqfkf(appStartTraceWflxmlrfwp));
        }
        SessionManager.getInstance().initializeGaugeCollection();
    }
}
