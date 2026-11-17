package kd0;

import gg.vdvldrhtss;
import hg.jyumaefscl;
import id0.nufgyqmvbu;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.gtknphoqwx;
import kotlin.jvm.internal.zdlpuopuiu;
import ld0.ppxfxbqfkf;
import ld0.wkgbmnqykc;
import pm.dxjokdxxww;
import ru.myspar.core.domain.models.savedcards.Card;
import ru.myspar.domain.feature.savedcards.store.State;
import tg.draadjrbmk;

/* JADX INFO: loaded from: classes4.dex */
public final class iobyxmoadg implements draadjrbmk {

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    public static final C1171iobyxmoadg f55121zdlpuopuiu = new C1171iobyxmoadg(null);

    /* JADX INFO: renamed from: kd0.iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
    public static final class C1171iobyxmoadg {
        public /* synthetic */ C1171iobyxmoadg(gtknphoqwx gtknphoqwxVar) {
            this();
        }

        private C1171iobyxmoadg() {
        }
    }

    public /* synthetic */ class zoijcleaow {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final /* synthetic */ int[] f55122iobyxmoadg;

        static {
            int[] iArr = new int[q10.iobyxmoadg.values().length];
            try {
                iArr[q10.iobyxmoadg.PAYMENT_METHODS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[q10.iobyxmoadg.REMOVE_CARD.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[q10.iobyxmoadg.WILL_RECEIVE_A_CHECK.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[q10.iobyxmoadg.ONLINE_PAYMENT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[q10.iobyxmoadg.REFUND_PERIOD.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[q10.iobyxmoadg.CHANGE_CARD.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[q10.iobyxmoadg.UNSUCCESSFUL_PAYMENT.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            f55122iobyxmoadg = iArr;
        }
    }

    private final List eablkybsjg(Set set) {
        ng.iobyxmoadg<q10.iobyxmoadg> iobyxmoadgVarWkgbmnqykc = q10.iobyxmoadg.wkgbmnqykc();
        ArrayList arrayList = new ArrayList(jyumaefscl.cqumvgiudr(iobyxmoadgVarWkgbmnqykc, 10));
        for (q10.iobyxmoadg iobyxmoadgVar : iobyxmoadgVarWkgbmnqykc) {
            arrayList.add(gxszxtbevo(iobyxmoadgVar, set.contains(iobyxmoadgVar)));
        }
        return arrayList;
    }

    private final ppxfxbqfkf gxszxtbevo(q10.iobyxmoadg iobyxmoadgVar, boolean z13) {
        vdvldrhtss vdvldrhtssVar;
        switch (zoijcleaow.f55122iobyxmoadg[iobyxmoadgVar.ordinal()]) {
            case 1:
                vdvldrhtssVar = new vdvldrhtss(Integer.valueOf(dxjokdxxww.payment_methods_question), Integer.valueOf(dxjokdxxww.payment_methods_answer));
                break;
            case 2:
                vdvldrhtssVar = new vdvldrhtss(Integer.valueOf(dxjokdxxww.remove_card_question), Integer.valueOf(dxjokdxxww.remove_card_answer));
                break;
            case 3:
                vdvldrhtssVar = new vdvldrhtss(Integer.valueOf(dxjokdxxww.will_receive_a_check_question), Integer.valueOf(dxjokdxxww.will_receive_a_check_answer));
                break;
            case 4:
                vdvldrhtssVar = new vdvldrhtss(Integer.valueOf(dxjokdxxww.online_payment_question), Integer.valueOf(dxjokdxxww.online_payment_answer));
                break;
            case 5:
                vdvldrhtssVar = new vdvldrhtss(Integer.valueOf(dxjokdxxww.refund_period_question), Integer.valueOf(dxjokdxxww.refund_period_answer));
                break;
            case 6:
                vdvldrhtssVar = new vdvldrhtss(Integer.valueOf(dxjokdxxww.change_card_question), Integer.valueOf(dxjokdxxww.change_card_answer));
                break;
            case 7:
                vdvldrhtssVar = new vdvldrhtss(Integer.valueOf(dxjokdxxww.unsuccessful_payment_question), Integer.valueOf(dxjokdxxww.unsuccessful_payment_answer));
                break;
            default:
                throw new NoWhenBranchMatchedException();
        }
        int iIntValue = ((Number) vdvldrhtssVar.iobyxmoadg()).intValue();
        return new ppxfxbqfkf(String.valueOf(iIntValue), ((Number) vdvldrhtssVar.wkgbmnqykc()).intValue(), iIntValue, iobyxmoadgVar, z13);
    }

    private final List iobyxmoadg(List list, Set set) {
        List listPpxfxbqfkf = jyumaefscl.ppxfxbqfkf();
        listPpxfxbqfkf.add(ppxfxbqfkf(list));
        listPpxfxbqfkf.add(new wkgbmnqykc("subtitle_item_id"));
        listPpxfxbqfkf.addAll(eablkybsjg(set));
        return jyumaefscl.iobyxmoadg(listPpxfxbqfkf);
    }

    private final List lqeggnwhkg(List list) {
        ArrayList arrayList = new ArrayList(jyumaefscl.cqumvgiudr(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Card card = (Card) it.next();
            arrayList.add(new ld0.iobyxmoadg(card.getId(), card.getCardNumberMask(), card.getDate(), card.getIcon()));
        }
        return arrayList;
    }

    private final w30.ppxfxbqfkf ppxfxbqfkf(List list) {
        return new ld0.zoijcleaow("cards_item_id", lqeggnwhkg(list));
    }

    @Override // tg.draadjrbmk
    /* JADX INFO: renamed from: zoijcleaow, reason: merged with bridge method [inline-methods] */
    public nufgyqmvbu invoke(State state) {
        zdlpuopuiu.btonecajqb(state, "state");
        return new nufgyqmvbu(state.getIsLoading(), iobyxmoadg(state.getCards(), state.getExpandedQuestions()));
    }
}
