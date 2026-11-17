package aa2;

import ba2.dxjokdxxww;
import ba2.eablkybsjg;
import ba2.gxszxtbevo;
import ba2.lqeggnwhkg;
import ba2.nufgyqmvbu;
import ba2.ppxfxbqfkf;
import ba2.wkgbmnqykc;
import ba2.zoijcleaow;
import hg.jyumaefscl;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.zdlpuopuiu;
import p0.tzroggbefp;
import ru.myspar.common.view.payment.cards.model.PaymentList;
import ru.myspar.common.view.payment.cards.model.PaymentMethodUiModel;
import ru.myspar.tipsorder.impl.domain.model.PaymentMethod;
import ru.myspar.tipsorder.impl.domain.model.TipOption;
import ru.myspar.tipsorder.impl.domain.model.TipValue;
import ru.myspar.tipsorder.impl.domain.store.State;
import ru.myspar.tipsorder.impl.domain.store.TipsOrderStore$TipsMessage;
import zg.gtknphoqwx;

/* JADX INFO: loaded from: classes6.dex */
public final class iobyxmoadg {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final d60.iobyxmoadg f1280iobyxmoadg;

    public iobyxmoadg(d60.iobyxmoadg resourcesManager) {
        zdlpuopuiu.btonecajqb(resourcesManager, "resourcesManager");
        this.f1280iobyxmoadg = resourcesManager;
    }

    private final nufgyqmvbu eablkybsjg(TipsOrderStore$TipsMessage tipsOrderStore$TipsMessage) {
        if (tipsOrderStore$TipsMessage instanceof TipsOrderStore$TipsMessage.Error) {
            return new nufgyqmvbu(this.f1280iobyxmoadg.getString(n92.iobyxmoadg.dialog_error_title), ((TipsOrderStore$TipsMessage.Error) tipsOrderStore$TipsMessage).getMessage(), this.f1280iobyxmoadg.getString(n92.iobyxmoadg.dialog_error_button));
        }
        if (zdlpuopuiu.eablkybsjg(tipsOrderStore$TipsMessage, TipsOrderStore$TipsMessage.Success.f104541zdlpuopuiu)) {
            return new nufgyqmvbu(this.f1280iobyxmoadg.getString(n92.iobyxmoadg.dialog_success_title), this.f1280iobyxmoadg.getString(n92.iobyxmoadg.dialog_success_subtitle), this.f1280iobyxmoadg.getString(n92.iobyxmoadg.dialog_success_button));
        }
        if (zdlpuopuiu.eablkybsjg(tipsOrderStore$TipsMessage, TipsOrderStore$TipsMessage.Verify.f104542zdlpuopuiu)) {
            return new nufgyqmvbu(this.f1280iobyxmoadg.getString(n92.iobyxmoadg.dialog_success_title), this.f1280iobyxmoadg.getString(n92.iobyxmoadg.dialog_verify_subtitle), this.f1280iobyxmoadg.getString(n92.iobyxmoadg.dialog_success_button));
        }
        throw new NoWhenBranchMatchedException();
    }

    private final ba2.iobyxmoadg.zoijcleaow ppxfxbqfkf(TipValue tipValue, String str) {
        Long value;
        String name = tipValue.getName();
        tzroggbefp field = tipValue.getField();
        boolean z13 = tipValue.getValue() != null && ((value = tipValue.getValue()) == null || value.longValue() != 0);
        eablkybsjg iobyxmoadgVar = null;
        if (tipValue.getValue() != null) {
            if (gtknphoqwx.oxmwwwfdhm(gtknphoqwx.jyumaefscl(1, tipValue.getMin()), tipValue.getValue().longValue())) {
                iobyxmoadgVar = new eablkybsjg.zoijcleaow(tipValue.getMin());
            } else if (tipValue.getValue().longValue() > tipValue.getMax()) {
                iobyxmoadgVar = new eablkybsjg.iobyxmoadg(tipValue.getMax());
            }
        }
        dxjokdxxww dxjokdxxwwVar = new dxjokdxxww(field, z13, iobyxmoadgVar);
        List<TipOption> options = tipValue.getOptions();
        ArrayList arrayList = new ArrayList(jyumaefscl.cqumvgiudr(options, 10));
        for (TipOption tipOption : options) {
            Long value2 = tipValue.getValue();
            arrayList.add(wkgbmnqykc(tipOption, value2 != null && value2.longValue() == tipOption.getSum()));
        }
        return new ba2.iobyxmoadg.zoijcleaow(str, name, dxjokdxxwwVar, new gxszxtbevo(arrayList));
    }

    private final lqeggnwhkg wkgbmnqykc(TipOption tipOption, boolean z13) {
        return new lqeggnwhkg(tipOption.getSum(), tipOption.getTitle(), tipOption.getSubtitle(), z13);
    }

    private final ba2.iobyxmoadg.C0270iobyxmoadg zoijcleaow(Set set, String str) {
        Set<PaymentMethod> set2 = set;
        ArrayList arrayList = new ArrayList(jyumaefscl.cqumvgiudr(set2, 10));
        for (PaymentMethod paymentMethod : set2) {
            arrayList.add(new PaymentMethodUiModel(paymentMethod.getId(), paymentMethod.getIconUrl(), paymentMethod.getName(), zdlpuopuiu.eablkybsjg(paymentMethod.getId(), str), paymentMethod instanceof PaymentMethod.Online ? du.iobyxmoadg.PRIMARY : du.iobyxmoadg.DEFAULT));
        }
        return new ba2.iobyxmoadg.C0270iobyxmoadg(new PaymentList(arrayList));
    }

    public final v92.nufgyqmvbu iobyxmoadg(State state) {
        zdlpuopuiu.btonecajqb(state, "state");
        TipsOrderStore$TipsMessage message = state.getMessage();
        Object obj = null;
        nufgyqmvbu nufgyqmvbuVarEablkybsjg = message != null ? eablkybsjg(message) : null;
        boolean z13 = true;
        if (state.getTipsOrderParams() == null) {
            return new v92.nufgyqmvbu(true, null, null, nufgyqmvbuVarEablkybsjg);
        }
        for (Object obj2 : state.getTipsOrderParams().getPayments()) {
            if (zdlpuopuiu.eablkybsjg(((PaymentMethod) obj2).getId(), state.getTipsOrderParams().getCurrentPaymentId())) {
                obj = obj2;
                break;
            }
        }
        PaymentMethod paymentMethod = (PaymentMethod) obj;
        ba2.iobyxmoadg.C0270iobyxmoadg c0270iobyxmoadgZoijcleaow = zoijcleaow(state.getTipsOrderParams().getPayments(), state.getTipsOrderParams().getCurrentPaymentId());
        Map tips = state.getTipsOrderParams().getTips();
        ArrayList arrayList = new ArrayList(tips.size());
        for (Map.Entry entry : tips.entrySet()) {
            arrayList.add(ppxfxbqfkf((TipValue) entry.getValue(), (String) entry.getKey()));
        }
        Iterator it = state.getTipsOrderParams().getTips().values().iterator();
        long jLongValue = 0;
        while (it.hasNext()) {
            Long value = ((TipValue) it.next()).getValue();
            jLongValue += value != null ? value.longValue() : 0L;
        }
        if (!state.getTipsIsSending() && jLongValue > 0 && paymentMethod != null && !state.getVerifyFlag()) {
            if (!arrayList.isEmpty()) {
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    if (((ba2.iobyxmoadg.zoijcleaow) it2.next()).zoijcleaow().zoijcleaow() != null) {
                        z13 = false;
                        break;
                    }
                }
            }
        } else {
            z13 = false;
            break;
        }
        return new v92.nufgyqmvbu(state.getTipsIsSending(), new zoijcleaow(jyumaefscl.ixidwrxhsl(arrayList, jyumaefscl.eablkybsjg(c0270iobyxmoadgZoijcleaow))), new ppxfxbqfkf(jLongValue, z13, paymentMethod instanceof PaymentMethod.SbpOnline ? wkgbmnqykc.SECONDARY : wkgbmnqykc.PRIMARY), nufgyqmvbuVarEablkybsjg);
    }
}
