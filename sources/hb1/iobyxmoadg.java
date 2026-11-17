package hb1;

import fb1.nufgyqmvbu;
import gg.vdvldrhtss;
import hg.jyumaefscl;
import ib1.ppxfxbqfkf;
import ib1.wkgbmnqykc;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.gtknphoqwx;
import kotlin.jvm.internal.zdlpuopuiu;
import ru.myspar.proloyalty.core.domain.models.savedcards.Card;
import ru.myspar.proloyalty.domain.feature.savedcards.store.State;
import tg.draadjrbmk;
import vk0.lqeggnwhkg;

/* JADX INFO: loaded from: classes5.dex */
public final class iobyxmoadg implements draadjrbmk {

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    public static final C0927iobyxmoadg f40010zdlpuopuiu = new C0927iobyxmoadg(null);

    /* JADX INFO: renamed from: hb1.iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
    public static final class C0927iobyxmoadg {
        public /* synthetic */ C0927iobyxmoadg(gtknphoqwx gtknphoqwxVar) {
            this();
        }

        private C0927iobyxmoadg() {
        }
    }

    public /* synthetic */ class zoijcleaow {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final /* synthetic */ int[] f40011iobyxmoadg;

        static {
            int[] iArr = new int[g01.iobyxmoadg.values().length];
            try {
                iArr[g01.iobyxmoadg.PAYMENT_METHODS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[g01.iobyxmoadg.REMOVE_CARD.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[g01.iobyxmoadg.WILL_RECEIVE_A_CHECK.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[g01.iobyxmoadg.ONLINE_PAYMENT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[g01.iobyxmoadg.REFUND_PERIOD.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[g01.iobyxmoadg.CHANGE_CARD.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[g01.iobyxmoadg.UNSUCCESSFUL_PAYMENT.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            f40011iobyxmoadg = iArr;
        }
    }

    private final List eablkybsjg(Set set) {
        ng.iobyxmoadg<g01.iobyxmoadg> iobyxmoadgVarWkgbmnqykc = g01.iobyxmoadg.wkgbmnqykc();
        ArrayList arrayList = new ArrayList(jyumaefscl.cqumvgiudr(iobyxmoadgVarWkgbmnqykc, 10));
        for (g01.iobyxmoadg iobyxmoadgVar : iobyxmoadgVarWkgbmnqykc) {
            arrayList.add(gxszxtbevo(iobyxmoadgVar, set.contains(iobyxmoadgVar)));
        }
        return arrayList;
    }

    private final ppxfxbqfkf gxszxtbevo(g01.iobyxmoadg iobyxmoadgVar, boolean z13) {
        vdvldrhtss vdvldrhtssVar;
        switch (zoijcleaow.f40011iobyxmoadg[iobyxmoadgVar.ordinal()]) {
            case 1:
                vdvldrhtssVar = new vdvldrhtss(Integer.valueOf(lqeggnwhkg.proloyalty_payment_methods_question), Integer.valueOf(lqeggnwhkg.proloyalty_payment_methods_answer));
                break;
            case 2:
                vdvldrhtssVar = new vdvldrhtss(Integer.valueOf(lqeggnwhkg.proloyalty_remove_card_question), Integer.valueOf(lqeggnwhkg.proloyalty_remove_card_answer));
                break;
            case 3:
                vdvldrhtssVar = new vdvldrhtss(Integer.valueOf(lqeggnwhkg.proloyalty_will_receive_a_check_question), Integer.valueOf(lqeggnwhkg.proloyalty_will_receive_a_check_answer));
                break;
            case 4:
                vdvldrhtssVar = new vdvldrhtss(Integer.valueOf(lqeggnwhkg.proloyalty_online_payment_question), Integer.valueOf(lqeggnwhkg.proloyalty_online_payment_answer));
                break;
            case 5:
                vdvldrhtssVar = new vdvldrhtss(Integer.valueOf(lqeggnwhkg.proloyalty_refund_period_question), Integer.valueOf(lqeggnwhkg.proloyalty_refund_period_answer));
                break;
            case 6:
                vdvldrhtssVar = new vdvldrhtss(Integer.valueOf(lqeggnwhkg.proloyalty_change_card_question), Integer.valueOf(lqeggnwhkg.proloyalty_change_card_answer));
                break;
            case 7:
                vdvldrhtssVar = new vdvldrhtss(Integer.valueOf(lqeggnwhkg.proloyalty_unsuccessful_payment_question), Integer.valueOf(lqeggnwhkg.proloyalty_unsuccessful_payment_answer));
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
            arrayList.add(new ib1.iobyxmoadg(card.getId(), card.getCardNumberMask(), card.getDate(), card.getIcon()));
        }
        return arrayList;
    }

    private final b21.ppxfxbqfkf ppxfxbqfkf(List list) {
        return new ib1.zoijcleaow("cards_item_id", lqeggnwhkg(list));
    }

    @Override // tg.draadjrbmk
    /* JADX INFO: renamed from: zoijcleaow, reason: merged with bridge method [inline-methods] */
    public nufgyqmvbu invoke(State state) {
        zdlpuopuiu.btonecajqb(state, "state");
        return new nufgyqmvbu(state.getIsLoading(), iobyxmoadg(state.getCards(), state.getExpandedQuestions()));
    }
}
