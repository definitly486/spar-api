package modern.payments.ecomAndroid.presentation.viewModel;

import gg.cqumvgiudr;
import gg.wwaezpbzkn;
import gg.zdlpuopuiu;
import hg.tzroggbefp;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.draadjrbmk;
import kotlin.coroutines.jvm.internal.gxszxtbevo;
import mg.zoijcleaow;
import mj.kcexrzcfyt;
import modern.payments.ecomAndroid.domain.analytics.EcomMetricUtil;
import modern.payments.ecomAndroid.presentation.base.BaseViewModel;
import modern.payments.ecomAndroid.util.analytics.metrics.ActionType;
import modern.payments.ecomAndroid.util.analytics.metrics.Views;
import modern.payments.ecomAndroid.util.analytics.metrics.actions.WebViewAction;
import tg.vdvldrhtss;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\u0010\u0000\u001a\u0004\u0018\u00010\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u008a@"}, d2 = {"<anonymous>", "Lmodern/payments/ecomAndroid/domain/analytics/EcomMetricUtil$MetricEvent;", "viewState", "Lmodern/payments/ecomAndroid/presentation/base/BaseViewModel$LifecycleEvent;", "data", ""}, k = 3, mv = {1, 9, 0}, xi = 48)
@gxszxtbevo(c = "modern.payments.ecomAndroid.presentation.viewModel.EcomChallengeViewModel$metricToSend$1", f = "EcomChallengeViewModel.kt", l = {}, m = "invokeSuspend")
final class EcomChallengeViewModel$metricToSend$1 extends draadjrbmk implements vdvldrhtss {
    /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;

    EcomChallengeViewModel$metricToSend$1(lg.gxszxtbevo<? super EcomChallengeViewModel$metricToSend$1> gxszxtbevoVar) {
        super(3, gxszxtbevoVar);
    }

    @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
    public final Object invokeSuspend(Object obj) {
        zoijcleaow.gxszxtbevo();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        zdlpuopuiu.zoijcleaow(obj);
        BaseViewModel.LifecycleEvent lifecycleEvent = (BaseViewModel.LifecycleEvent) this.L$0;
        String str = (String) this.L$1;
        boolean z13 = lifecycleEvent instanceof BaseViewModel.LifecycleEvent.OnStart;
        if (z13 && str != null && kcexrzcfyt.sopmlzcsov(str, EcomChallengeViewModel.UrlParamName.CREQ.getParam(), false, 2, null)) {
            return new EcomMetricUtil.MetricEvent(WebViewAction.WEB_VIEW_APPEARED, Views.WEB_VIEW, ActionType.LC, null, tzroggbefp.gxszxtbevo(cqumvgiudr.iobyxmoadg("challengeState", "payment")), null, null, null, 232, null);
        }
        if (z13 && str != null && kcexrzcfyt.sopmlzcsov(str, EcomChallengeViewModel.UrlParamName.PAREQ.getParam(), false, 2, null)) {
            return new EcomMetricUtil.MetricEvent(WebViewAction.WEB_VIEW_APPEARED, Views.WEB_VIEW, ActionType.LC, null, tzroggbefp.gxszxtbevo(cqumvgiudr.iobyxmoadg("challengeState", "method")), null, null, null, 232, null);
        }
        if (!(lifecycleEvent instanceof BaseViewModel.LifecycleEvent.OnStop)) {
            return null;
        }
        return new EcomMetricUtil.MetricEvent(WebViewAction.WEB_VIEW_DISAPPEARED, Views.WEB_VIEW, ActionType.LC, null, null, null, null, null, 248, null);
    }

    @Override // tg.vdvldrhtss
    public final Object invoke(BaseViewModel.LifecycleEvent lifecycleEvent, String str, lg.gxszxtbevo<? super EcomMetricUtil.MetricEvent> gxszxtbevoVar) {
        EcomChallengeViewModel$metricToSend$1 ecomChallengeViewModel$metricToSend$1 = new EcomChallengeViewModel$metricToSend$1(gxszxtbevoVar);
        ecomChallengeViewModel$metricToSend$1.L$0 = lifecycleEvent;
        ecomChallengeViewModel$metricToSend$1.L$1 = str;
        return ecomChallengeViewModel$metricToSend$1.invokeSuspend(wwaezpbzkn.f37140iobyxmoadg);
    }
}
