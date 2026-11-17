package dz0;

import hg.jyumaefscl;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.zdlpuopuiu;
import pj.pkzmftpjix;
import ru.myspar.proloyalty.core.domain.models.cart.CartProduct;

/* JADX INFO: loaded from: classes5.dex */
public final class wkgbmnqykc extends dz0.iobyxmoadg {

    /* JADX INFO: renamed from: agtfadlqog, reason: collision with root package name */
    private final k01.ppxfxbqfkf f30057agtfadlqog;

    /* JADX INFO: renamed from: ojitshcjhn, reason: collision with root package name */
    private final f11.iobyxmoadg f30058ojitshcjhn;

    static final class iobyxmoadg extends kotlin.coroutines.jvm.internal.wkgbmnqykc {

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        int f30059jyumaefscl;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        /* synthetic */ Object f30061zdlpuopuiu;

        iobyxmoadg(lg.gxszxtbevo gxszxtbevoVar) {
            super(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            this.f30061zdlpuopuiu = obj;
            this.f30059jyumaefscl |= Integer.MIN_VALUE;
            return wkgbmnqykc.this.cdpycssgdh(null, this);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wkgbmnqykc(k01.ppxfxbqfkf cartLocalSource, f11.iobyxmoadg addProductsToBasketUseCase, lqeggnwhkg analyticHelper, pkzmftpjix dispatcher) {
        super(analyticHelper, dispatcher);
        zdlpuopuiu.btonecajqb(cartLocalSource, "cartLocalSource");
        zdlpuopuiu.btonecajqb(addProductsToBasketUseCase, "addProductsToBasketUseCase");
        zdlpuopuiu.btonecajqb(analyticHelper, "analyticHelper");
        zdlpuopuiu.btonecajqb(dispatcher, "dispatcher");
        this.f30057agtfadlqog = cartLocalSource;
        this.f30058ojitshcjhn = addProductsToBasketUseCase;
        kcexrzcfyt();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // dz0.iobyxmoadg
    public Object cdpycssgdh(List list, lg.gxszxtbevo gxszxtbevoVar) {
        iobyxmoadg iobyxmoadgVar;
        if (gxszxtbevoVar instanceof iobyxmoadg) {
            iobyxmoadgVar = (iobyxmoadg) gxszxtbevoVar;
            int i13 = iobyxmoadgVar.f30059jyumaefscl;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                iobyxmoadgVar.f30059jyumaefscl = i13 - Integer.MIN_VALUE;
            } else {
                iobyxmoadgVar = new iobyxmoadg(gxszxtbevoVar);
            }
        } else {
            iobyxmoadgVar = new iobyxmoadg(gxszxtbevoVar);
        }
        Object objInvoke = iobyxmoadgVar.f30061zdlpuopuiu;
        Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
        int i14 = iobyxmoadgVar.f30059jyumaefscl;
        if (i14 == 0) {
            gg.zdlpuopuiu.zoijcleaow(objInvoke);
            f11.iobyxmoadg.ppxfxbqfkf ppxfxbqfkfVar = new f11.iobyxmoadg.ppxfxbqfkf(list, f11.iobyxmoadg.zoijcleaow.REPLACE, false, "ChangeProductInteractor");
            f11.iobyxmoadg iobyxmoadgVar2 = this.f30058ojitshcjhn;
            iobyxmoadgVar.f30059jyumaefscl = 1;
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
        f11.iobyxmoadg.wkgbmnqykc wkgbmnqykcVar = (f11.iobyxmoadg.wkgbmnqykc) objInvoke;
        List listZoijcleaow = wkgbmnqykcVar.zoijcleaow();
        ArrayList arrayList = new ArrayList(jyumaefscl.cqumvgiudr(listZoijcleaow, 10));
        Iterator it = listZoijcleaow.iterator();
        while (it.hasNext()) {
            arrayList.add(lz0.zoijcleaow.iobyxmoadg((CartProduct) it.next()));
        }
        return new nufgyqmvbu.iobyxmoadg(arrayList, wkgbmnqykcVar.ppxfxbqfkf(), wkgbmnqykcVar.iobyxmoadg());
    }

    @Override // dz0.iobyxmoadg
    protected sj.lqeggnwhkg cqumvgiudr() {
        return this.f30057agtfadlqog.lqeggnwhkg();
    }
}
