package ak0;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.zdlpuopuiu;
import lg.gxszxtbevo;
import ru.myspar.core.domain.models.cart.CartProduct;

/* JADX INFO: loaded from: classes3.dex */
public final class zoijcleaow implements yj0.iobyxmoadg {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final kk0.iobyxmoadg f2104iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final a30.iobyxmoadg f2105ppxfxbqfkf;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final k00.iobyxmoadg f2106zoijcleaow;

    static final class iobyxmoadg extends kotlin.coroutines.jvm.internal.wkgbmnqykc {

        /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
        int f2107iwizpuwonk;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        /* synthetic */ Object f2109yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        Object f2110zdlpuopuiu;

        iobyxmoadg(gxszxtbevo gxszxtbevoVar) {
            super(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            this.f2109yggfygwlhe = obj;
            this.f2107iwizpuwonk |= Integer.MIN_VALUE;
            return zoijcleaow.this.iobyxmoadg(null, this);
        }
    }

    public zoijcleaow(kk0.iobyxmoadg repository, k00.iobyxmoadg cartInteractor, a30.iobyxmoadg addProductsToBasketUseCase) {
        zdlpuopuiu.btonecajqb(repository, "repository");
        zdlpuopuiu.btonecajqb(cartInteractor, "cartInteractor");
        zdlpuopuiu.btonecajqb(addProductsToBasketUseCase, "addProductsToBasketUseCase");
        this.f2104iobyxmoadg = repository;
        this.f2106zoijcleaow = cartInteractor;
        this.f2105ppxfxbqfkf = addProductsToBasketUseCase;
    }

    /* JADX WARN: Code duplicated, block: B:27:0x0083  */
    /* JADX WARN: Code duplicated, block: B:33:0x0098 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:35:0x007d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // yj0.iobyxmoadg
    public Object iobyxmoadg(List list, gxszxtbevo gxszxtbevoVar) {
        iobyxmoadg iobyxmoadgVar;
        zoijcleaow zoijcleaowVar;
        a30.iobyxmoadg.wkgbmnqykc wkgbmnqykcVar;
        ArrayList arrayList;
        if (gxszxtbevoVar instanceof iobyxmoadg) {
            iobyxmoadgVar = (iobyxmoadg) gxszxtbevoVar;
            int i13 = iobyxmoadgVar.f2107iwizpuwonk;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                iobyxmoadgVar.f2107iwizpuwonk = i13 - Integer.MIN_VALUE;
            } else {
                iobyxmoadgVar = new iobyxmoadg(gxszxtbevoVar);
            }
        } else {
            iobyxmoadgVar = new iobyxmoadg(gxszxtbevoVar);
        }
        Object objInvoke = iobyxmoadgVar.f2109yggfygwlhe;
        Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
        int i14 = iobyxmoadgVar.f2107iwizpuwonk;
        if (i14 != 0) {
            if (i14 == 1) {
                zoijcleaowVar = (zoijcleaow) iobyxmoadgVar.f2110zdlpuopuiu;
                gg.zdlpuopuiu.zoijcleaow(objInvoke);
            } else {
                if (i14 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                wkgbmnqykcVar = (a30.iobyxmoadg.wkgbmnqykc) iobyxmoadgVar.f2110zdlpuopuiu;
                gg.zdlpuopuiu.zoijcleaow(objInvoke);
            }
            List listPpxfxbqfkf = wkgbmnqykcVar.ppxfxbqfkf();
            List listZoijcleaow = wkgbmnqykcVar.zoijcleaow();
            arrayList = new ArrayList();
            for (Object obj : listZoijcleaow) {
                if (wkgbmnqykcVar.iobyxmoadg().contains(((CartProduct) obj).getId())) {
                    arrayList.add(obj);
                }
            }
            return new zj0.iobyxmoadg(listPpxfxbqfkf, arrayList);
        }
        gg.zdlpuopuiu.zoijcleaow(objInvoke);
        a30.iobyxmoadg.ppxfxbqfkf ppxfxbqfkfVar = new a30.iobyxmoadg.ppxfxbqfkf(list, a30.iobyxmoadg.zoijcleaow.ADD, false, "ProductsFromBannerComponentApi");
        a30.iobyxmoadg iobyxmoadgVar2 = this.f2105ppxfxbqfkf;
        iobyxmoadgVar.f2110zdlpuopuiu = this;
        iobyxmoadgVar.f2107iwizpuwonk = 1;
        objInvoke = iobyxmoadgVar2.invoke(ppxfxbqfkfVar, iobyxmoadgVar);
        if (objInvoke == objGxszxtbevo) {
            return objGxszxtbevo;
        }
        zoijcleaowVar = this;
        a30.iobyxmoadg.wkgbmnqykc wkgbmnqykcVar2 = (a30.iobyxmoadg.wkgbmnqykc) objInvoke;
        k00.iobyxmoadg iobyxmoadgVar3 = zoijcleaowVar.f2106zoijcleaow;
        iobyxmoadgVar.f2110zdlpuopuiu = wkgbmnqykcVar2;
        iobyxmoadgVar.f2107iwizpuwonk = 2;
        if (k00.iobyxmoadg.yadqdtsiqt(iobyxmoadgVar3, false, iobyxmoadgVar, 1, null) == objGxszxtbevo) {
            return objGxszxtbevo;
        }
        wkgbmnqykcVar = wkgbmnqykcVar2;
        List listPpxfxbqfkf2 = wkgbmnqykcVar.ppxfxbqfkf();
        List listZoijcleaow2 = wkgbmnqykcVar.zoijcleaow();
        arrayList = new ArrayList();
        while (r0.hasNext()) {
            if (wkgbmnqykcVar.iobyxmoadg().contains(((CartProduct) obj).getId())) {
                arrayList.add(obj);
            }
        }
        return new zj0.iobyxmoadg(listPpxfxbqfkf2, arrayList);
    }

    @Override // yj0.iobyxmoadg
    public Object ppxfxbqfkf(zj0.ppxfxbqfkf ppxfxbqfkfVar, gxszxtbevo gxszxtbevoVar) {
        return this.f2104iobyxmoadg.wkgbmnqykc(ppxfxbqfkfVar, gxszxtbevoVar);
    }

    @Override // yj0.iobyxmoadg
    public Object zoijcleaow(zj0.ppxfxbqfkf ppxfxbqfkfVar, gxszxtbevo gxszxtbevoVar) {
        return this.f2104iobyxmoadg.zoijcleaow(ppxfxbqfkfVar, gxszxtbevoVar);
    }
}
