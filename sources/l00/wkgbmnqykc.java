package l00;

import hg.jyumaefscl;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.zdlpuopuiu;
import pj.pkzmftpjix;
import ru.myspar.core.domain.models.cart.CartProduct;

/* JADX INFO: loaded from: classes4.dex */
public final class wkgbmnqykc extends l00.iobyxmoadg {

    /* JADX INFO: renamed from: agtfadlqog, reason: collision with root package name */
    private final w10.ppxfxbqfkf f61304agtfadlqog;

    /* JADX INFO: renamed from: ojitshcjhn, reason: collision with root package name */
    private final a30.iobyxmoadg f61305ojitshcjhn;

    static final class iobyxmoadg extends kotlin.coroutines.jvm.internal.wkgbmnqykc {

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        int f61306jyumaefscl;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        /* synthetic */ Object f61308zdlpuopuiu;

        iobyxmoadg(lg.gxszxtbevo gxszxtbevoVar) {
            super(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            this.f61308zdlpuopuiu = obj;
            this.f61306jyumaefscl |= Integer.MIN_VALUE;
            return wkgbmnqykc.this.cdpycssgdh(null, this);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wkgbmnqykc(w10.ppxfxbqfkf cartLocalSource, a30.iobyxmoadg addProductsToBasketUseCase, lqeggnwhkg analyticHelper, pkzmftpjix dispatcher) {
        super(analyticHelper, dispatcher);
        zdlpuopuiu.btonecajqb(cartLocalSource, "cartLocalSource");
        zdlpuopuiu.btonecajqb(addProductsToBasketUseCase, "addProductsToBasketUseCase");
        zdlpuopuiu.btonecajqb(analyticHelper, "analyticHelper");
        zdlpuopuiu.btonecajqb(dispatcher, "dispatcher");
        this.f61304agtfadlqog = cartLocalSource;
        this.f61305ojitshcjhn = addProductsToBasketUseCase;
        kcexrzcfyt();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // l00.iobyxmoadg
    public Object cdpycssgdh(List list, lg.gxszxtbevo gxszxtbevoVar) {
        iobyxmoadg iobyxmoadgVar;
        if (gxszxtbevoVar instanceof iobyxmoadg) {
            iobyxmoadgVar = (iobyxmoadg) gxszxtbevoVar;
            int i13 = iobyxmoadgVar.f61306jyumaefscl;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                iobyxmoadgVar.f61306jyumaefscl = i13 - Integer.MIN_VALUE;
            } else {
                iobyxmoadgVar = new iobyxmoadg(gxszxtbevoVar);
            }
        } else {
            iobyxmoadgVar = new iobyxmoadg(gxszxtbevoVar);
        }
        Object objInvoke = iobyxmoadgVar.f61308zdlpuopuiu;
        Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
        int i14 = iobyxmoadgVar.f61306jyumaefscl;
        if (i14 == 0) {
            gg.zdlpuopuiu.zoijcleaow(objInvoke);
            a30.iobyxmoadg.ppxfxbqfkf ppxfxbqfkfVar = new a30.iobyxmoadg.ppxfxbqfkf(list, a30.iobyxmoadg.zoijcleaow.REPLACE, false, "ChangeProductInteractor");
            a30.iobyxmoadg iobyxmoadgVar2 = this.f61305ojitshcjhn;
            iobyxmoadgVar.f61306jyumaefscl = 1;
            objInvoke = iobyxmoadgVar2.invoke(ppxfxbqfkfVar, iobyxmoadgVar);
            if (objInvoke == objGxszxtbevo) {
                return objGxszxtbevo;
            }
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            gg.zdlpuopuiu.zoijcleaow(objInvoke);
        }
        a30.iobyxmoadg.wkgbmnqykc wkgbmnqykcVar = (a30.iobyxmoadg.wkgbmnqykc) objInvoke;
        List listZoijcleaow = wkgbmnqykcVar.zoijcleaow();
        ArrayList arrayList = new ArrayList(jyumaefscl.cqumvgiudr(listZoijcleaow, 10));
        Iterator it = listZoijcleaow.iterator();
        while (it.hasNext()) {
            arrayList.add(u00.zoijcleaow.zoijcleaow((CartProduct) it.next()));
        }
        return new nufgyqmvbu.iobyxmoadg(arrayList, wkgbmnqykcVar.ppxfxbqfkf(), wkgbmnqykcVar.iobyxmoadg());
    }

    @Override // l00.iobyxmoadg
    protected sj.lqeggnwhkg cqumvgiudr() {
        return this.f61304agtfadlqog.lqeggnwhkg();
    }
}
