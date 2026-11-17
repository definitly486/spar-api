package dz0;

import hg.jyumaefscl;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.zdlpuopuiu;
import pj.pkzmftpjix;
import ru.myspar.proloyalty.core.domain.models.cart.Cart;
import ru.myspar.proloyalty.core.domain.models.cart.CartProduct;

/* JADX INFO: loaded from: classes5.dex */
public final class ppxfxbqfkf extends dz0.iobyxmoadg {

    /* JADX INFO: renamed from: agtfadlqog, reason: collision with root package name */
    private final k01.ppxfxbqfkf f30051agtfadlqog;

    /* JADX INFO: renamed from: ojitshcjhn, reason: collision with root package name */
    private final k01.wkgbmnqykc f30052ojitshcjhn;

    static final class iobyxmoadg extends kotlin.coroutines.jvm.internal.wkgbmnqykc {

        /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
        int f30053iwizpuwonk;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        /* synthetic */ Object f30055yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        Object f30056zdlpuopuiu;

        iobyxmoadg(lg.gxszxtbevo gxszxtbevoVar) {
            super(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            this.f30055yggfygwlhe = obj;
            this.f30053iwizpuwonk |= Integer.MIN_VALUE;
            return ppxfxbqfkf.this.cdpycssgdh(null, this);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ppxfxbqfkf(k01.ppxfxbqfkf cartLocalSource, k01.wkgbmnqykc cartRemoteSource, lqeggnwhkg analyticHelper, pkzmftpjix dispatcher) {
        super(analyticHelper, dispatcher);
        zdlpuopuiu.btonecajqb(cartLocalSource, "cartLocalSource");
        zdlpuopuiu.btonecajqb(cartRemoteSource, "cartRemoteSource");
        zdlpuopuiu.btonecajqb(analyticHelper, "analyticHelper");
        zdlpuopuiu.btonecajqb(dispatcher, "dispatcher");
        this.f30051agtfadlqog = cartLocalSource;
        this.f30052ojitshcjhn = cartRemoteSource;
        kcexrzcfyt();
    }

    /* JADX WARN: Code duplicated, block: B:30:0x0070  */
    /* JADX WARN: Code duplicated, block: B:33:0x0085 A[LOOP:0: B:31:0x007f->B:33:0x0085, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:34:0x0093  */
    /* JADX WARN: Code duplicated, block: B:36:0x0096  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // dz0.iobyxmoadg
    public Object cdpycssgdh(List list, lg.gxszxtbevo gxszxtbevoVar) {
        iobyxmoadg iobyxmoadgVar;
        ppxfxbqfkf ppxfxbqfkfVar;
        Cart cart;
        List basket;
        List listWflxmlrfwp;
        Iterator it;
        if (gxszxtbevoVar instanceof iobyxmoadg) {
            iobyxmoadgVar = (iobyxmoadg) gxszxtbevoVar;
            int i13 = iobyxmoadgVar.f30053iwizpuwonk;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                iobyxmoadgVar.f30053iwizpuwonk = i13 - Integer.MIN_VALUE;
            } else {
                iobyxmoadgVar = new iobyxmoadg(gxszxtbevoVar);
            }
        } else {
            iobyxmoadgVar = new iobyxmoadg(gxszxtbevoVar);
        }
        Object objZoijcleaow = iobyxmoadgVar.f30055yggfygwlhe;
        Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
        int i14 = iobyxmoadgVar.f30053iwizpuwonk;
        if (i14 != 0) {
            if (i14 == 1) {
                ppxfxbqfkfVar = (ppxfxbqfkf) iobyxmoadgVar.f30056zdlpuopuiu;
                gg.zdlpuopuiu.zoijcleaow(objZoijcleaow);
            } else {
                if (i14 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                cart = (Cart) iobyxmoadgVar.f30056zdlpuopuiu;
                gg.zdlpuopuiu.zoijcleaow(objZoijcleaow);
            }
            basket = cart.getBasket();
            if (basket != null) {
                listWflxmlrfwp = new ArrayList(jyumaefscl.cqumvgiudr(basket, 10));
                it = basket.iterator();
                while (it.hasNext()) {
                    listWflxmlrfwp.add(lz0.zoijcleaow.iobyxmoadg((CartProduct) it.next()));
                }
            } else {
                listWflxmlrfwp = null;
            }
            if (listWflxmlrfwp == null) {
                listWflxmlrfwp = jyumaefscl.wflxmlrfwp();
            }
            return new nufgyqmvbu.iobyxmoadg(listWflxmlrfwp, jyumaefscl.eablkybsjg(cart.getWarning()), jyumaefscl.wflxmlrfwp());
        }
        gg.zdlpuopuiu.zoijcleaow(objZoijcleaow);
        if (list.isEmpty()) {
            return nufgyqmvbu.ppxfxbqfkf.f30047iobyxmoadg;
        }
        k01.wkgbmnqykc wkgbmnqykcVar = this.f30052ojitshcjhn;
        iobyxmoadgVar.f30056zdlpuopuiu = this;
        iobyxmoadgVar.f30053iwizpuwonk = 1;
        objZoijcleaow = wkgbmnqykcVar.zoijcleaow(list, iobyxmoadgVar);
        if (objZoijcleaow == objGxszxtbevo) {
            return objGxszxtbevo;
        }
        ppxfxbqfkfVar = this;
        Cart cart2 = (Cart) objZoijcleaow;
        k01.ppxfxbqfkf ppxfxbqfkfVar2 = ppxfxbqfkfVar.f30051agtfadlqog;
        iobyxmoadgVar.f30056zdlpuopuiu = cart2;
        iobyxmoadgVar.f30053iwizpuwonk = 2;
        if (ppxfxbqfkfVar2.dxjokdxxww(cart2, iobyxmoadgVar) == objGxszxtbevo) {
            return objGxszxtbevo;
        }
        cart = cart2;
        basket = cart.getBasket();
        if (basket != null) {
            listWflxmlrfwp = new ArrayList(jyumaefscl.cqumvgiudr(basket, 10));
            it = basket.iterator();
            while (it.hasNext()) {
                listWflxmlrfwp.add(lz0.zoijcleaow.iobyxmoadg((CartProduct) it.next()));
            }
        } else {
            listWflxmlrfwp = null;
        }
        if (listWflxmlrfwp == null) {
            listWflxmlrfwp = jyumaefscl.wflxmlrfwp();
        }
        return new nufgyqmvbu.iobyxmoadg(listWflxmlrfwp, jyumaefscl.eablkybsjg(cart.getWarning()), jyumaefscl.wflxmlrfwp());
    }

    @Override // dz0.iobyxmoadg
    protected sj.lqeggnwhkg cqumvgiudr() {
        return this.f30051agtfadlqog.lqeggnwhkg();
    }
}
