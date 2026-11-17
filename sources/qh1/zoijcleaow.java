package qh1;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.zdlpuopuiu;
import lg.gxszxtbevo;
import ru.myspar.proloyalty.core.domain.models.cart.CartProduct;

/* JADX INFO: loaded from: classes6.dex */
public final class zoijcleaow implements oh1.iobyxmoadg {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final ai1.iobyxmoadg f78843iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final f11.iobyxmoadg f78844ppxfxbqfkf;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final cz0.iobyxmoadg f78845zoijcleaow;

    static final class iobyxmoadg extends kotlin.coroutines.jvm.internal.wkgbmnqykc {

        /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
        int f78846iwizpuwonk;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        /* synthetic */ Object f78848yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        Object f78849zdlpuopuiu;

        iobyxmoadg(gxszxtbevo gxszxtbevoVar) {
            super(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            this.f78848yggfygwlhe = obj;
            this.f78846iwizpuwonk |= Integer.MIN_VALUE;
            return zoijcleaow.this.iobyxmoadg(null, this);
        }
    }

    public zoijcleaow(ai1.iobyxmoadg repository, cz0.iobyxmoadg cartInteractor, f11.iobyxmoadg addProductsToBasketUseCase) {
        zdlpuopuiu.btonecajqb(repository, "repository");
        zdlpuopuiu.btonecajqb(cartInteractor, "cartInteractor");
        zdlpuopuiu.btonecajqb(addProductsToBasketUseCase, "addProductsToBasketUseCase");
        this.f78843iobyxmoadg = repository;
        this.f78845zoijcleaow = cartInteractor;
        this.f78844ppxfxbqfkf = addProductsToBasketUseCase;
    }

    /* JADX WARN: Code duplicated, block: B:27:0x0082  */
    /* JADX WARN: Code duplicated, block: B:33:0x0097 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:35:0x007c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // oh1.iobyxmoadg
    public Object iobyxmoadg(List list, gxszxtbevo gxszxtbevoVar) {
        iobyxmoadg iobyxmoadgVar;
        zoijcleaow zoijcleaowVar;
        f11.iobyxmoadg.wkgbmnqykc wkgbmnqykcVar;
        ArrayList arrayList;
        if (gxszxtbevoVar instanceof iobyxmoadg) {
            iobyxmoadgVar = (iobyxmoadg) gxszxtbevoVar;
            int i13 = iobyxmoadgVar.f78846iwizpuwonk;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                iobyxmoadgVar.f78846iwizpuwonk = i13 - Integer.MIN_VALUE;
            } else {
                iobyxmoadgVar = new iobyxmoadg(gxszxtbevoVar);
            }
        } else {
            iobyxmoadgVar = new iobyxmoadg(gxszxtbevoVar);
        }
        Object objInvoke = iobyxmoadgVar.f78848yggfygwlhe;
        Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
        int i14 = iobyxmoadgVar.f78846iwizpuwonk;
        if (i14 != 0) {
            if (i14 == 1) {
                zoijcleaowVar = (zoijcleaow) iobyxmoadgVar.f78849zdlpuopuiu;
                gg.zdlpuopuiu.zoijcleaow(objInvoke);
            } else {
                if (i14 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                wkgbmnqykcVar = (f11.iobyxmoadg.wkgbmnqykc) iobyxmoadgVar.f78849zdlpuopuiu;
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
            return new ph1.iobyxmoadg(listPpxfxbqfkf, arrayList);
        }
        gg.zdlpuopuiu.zoijcleaow(objInvoke);
        f11.iobyxmoadg.ppxfxbqfkf ppxfxbqfkfVar = new f11.iobyxmoadg.ppxfxbqfkf(list, f11.iobyxmoadg.zoijcleaow.ADD, false, "ProductsFromBannerComponentApi");
        f11.iobyxmoadg iobyxmoadgVar2 = this.f78844ppxfxbqfkf;
        iobyxmoadgVar.f78849zdlpuopuiu = this;
        iobyxmoadgVar.f78846iwizpuwonk = 1;
        objInvoke = iobyxmoadgVar2.invoke(ppxfxbqfkfVar, iobyxmoadgVar);
        if (objInvoke == objGxszxtbevo) {
            return objGxszxtbevo;
        }
        zoijcleaowVar = this;
        f11.iobyxmoadg.wkgbmnqykc wkgbmnqykcVar2 = (f11.iobyxmoadg.wkgbmnqykc) objInvoke;
        cz0.iobyxmoadg iobyxmoadgVar3 = zoijcleaowVar.f78845zoijcleaow;
        iobyxmoadgVar.f78849zdlpuopuiu = wkgbmnqykcVar2;
        iobyxmoadgVar.f78846iwizpuwonk = 2;
        if (iobyxmoadgVar3.cdpycssgdh(iobyxmoadgVar) == objGxszxtbevo) {
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
        return new ph1.iobyxmoadg(listPpxfxbqfkf2, arrayList);
    }

    @Override // oh1.iobyxmoadg
    public Object ppxfxbqfkf(ph1.ppxfxbqfkf ppxfxbqfkfVar, gxszxtbevo gxszxtbevoVar) {
        return this.f78843iobyxmoadg.wkgbmnqykc(ppxfxbqfkfVar, gxszxtbevoVar);
    }

    @Override // oh1.iobyxmoadg
    public Object zoijcleaow(ph1.ppxfxbqfkf ppxfxbqfkfVar, gxszxtbevo gxszxtbevoVar) {
        return this.f78843iobyxmoadg.zoijcleaow(ppxfxbqfkfVar, gxszxtbevoVar);
    }
}
