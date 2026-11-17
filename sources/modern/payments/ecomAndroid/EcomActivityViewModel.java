package modern.payments.ecomAndroid;

import androidx.lifecycle.ntlheqmsrt;
import androidx.lifecycle.ulzqkzuiru;
import gg.cqumvgiudr;
import hg.tzroggbefp;
import java.io.PrintWriter;
import java.io.StringWriter;
import kotlin.Metadata;
import kotlin.jvm.internal.zdlpuopuiu;
import modern.payments.ecomAndroid.data.api.ErrorEntity;
import modern.payments.ecomAndroid.domain.State;
import modern.payments.ecomAndroid.domain.analytics.EcomMetricUtil;
import modern.payments.ecomAndroid.domain.reducer.Reducer;
import modern.payments.ecomAndroid.presentation.Action;
import modern.payments.ecomAndroid.util.analytics.metrics.ActionType;
import modern.payments.ecomAndroid.util.analytics.metrics.actions.AuthViewAction;
import sj.dxjokdxxww;
import sj.jpowsppfya;
import sj.kegysxyocb;
import sj.wypolnanlu;
import sj.zynmafqrjb;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0010R\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R+\u0010\u0019\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u00180\u00178\u0006¢\u0006\u0012\n\u0004\b\u0019\u0010\u001a\u0012\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001b\u0010\u001c¨\u0006\u001f"}, d2 = {"Lmodern/payments/ecomAndroid/EcomActivityViewModel;", "Landroidx/lifecycle/ntlheqmsrt;", "Lmodern/payments/ecomAndroid/domain/reducer/Reducer;", "reducer", "Lmodern/payments/ecomAndroid/domain/analytics/EcomMetricUtil;", "ecomMetricUtil", "<init>", "(Lmodern/payments/ecomAndroid/domain/reducer/Reducer;Lmodern/payments/ecomAndroid/domain/analytics/EcomMetricUtil;)V", "", "exception", "Lgg/wwaezpbzkn;", "processUncaughtException", "(Ljava/lang/Throwable;)V", "Lmodern/payments/ecomAndroid/domain/reducer/Reducer;", "getReducer", "()Lmodern/payments/ecomAndroid/domain/reducer/Reducer;", "Lmodern/payments/ecomAndroid/domain/analytics/EcomMetricUtil;", "Lsj/zynmafqrjb;", "", "state", "Lsj/zynmafqrjb;", "getState", "()Lsj/zynmafqrjb;", "Lsj/wypolnanlu;", "Lmodern/payments/ecomAndroid/util/event/Event;", "bottomSheetShowEvent", "Lsj/wypolnanlu;", "getBottomSheetShowEvent", "()Lsj/wypolnanlu;", "getBottomSheetShowEvent$annotations", "()V", "ecomAndroid_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class EcomActivityViewModel extends ntlheqmsrt {
    private final wypolnanlu bottomSheetShowEvent;
    private final EcomMetricUtil ecomMetricUtil;
    private final Reducer reducer;
    private final zynmafqrjb state;

    public EcomActivityViewModel(Reducer reducer, EcomMetricUtil ecomMetricUtil) {
        zdlpuopuiu.btonecajqb(reducer, "reducer");
        zdlpuopuiu.btonecajqb(ecomMetricUtil, "ecomMetricUtil");
        this.reducer = reducer;
        this.ecomMetricUtil = ecomMetricUtil;
        Boolean bool = Boolean.TRUE;
        zynmafqrjb zynmafqrjbVarIobyxmoadg = kegysxyocb.iobyxmoadg(bool);
        this.state = zynmafqrjbVarIobyxmoadg;
        this.bottomSheetShowEvent = dxjokdxxww.ribwqtqdhb(dxjokdxxww.cllcsxoeiz(zynmafqrjbVarIobyxmoadg, new EcomActivityViewModel$bottomSheetShowEvent$1(null)), ulzqkzuiru.iobyxmoadg(this), jpowsppfya.iobyxmoadg.zoijcleaow(jpowsppfya.f106926iobyxmoadg, 0L, 0L, 3, null), null);
        zynmafqrjbVarIobyxmoadg.iobyxmoadg(bool);
    }

    public static /* synthetic */ void getBottomSheetShowEvent$annotations() {
    }

    public final wypolnanlu getBottomSheetShowEvent() {
        return this.bottomSheetShowEvent;
    }

    public final Reducer getReducer() {
        return this.reducer;
    }

    public final zynmafqrjb getState() {
        return this.state;
    }

    public final void processUncaughtException(Throwable exception) {
        zdlpuopuiu.btonecajqb(exception, "exception");
        StringWriter stringWriter = new StringWriter();
        exception.printStackTrace(new PrintWriter(stringWriter));
        this.ecomMetricUtil.report(new EcomMetricUtil.MetricEvent(AuthViewAction.EX_PAY, null, ActionType.EX, null, tzroggbefp.draadjrbmk(cqumvgiudr.iobyxmoadg("Exception", exception.toString()), cqumvgiudr.iobyxmoadg("StackTrace", stringWriter.toString())), null, null, null, 234, null));
        this.reducer.invoke(new Action.HandleException(new State.Error.DefaultException.UncaughtException(new ErrorEntity.EcomSdkError.Unknown("1", exception.getMessage()), false, 2, null)));
    }
}
