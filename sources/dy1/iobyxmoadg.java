package dy1;

import gg.kcexrzcfyt;
import gg.wwaezpbzkn;
import gg.zdlpuopuiu;
import java.util.Iterator;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.jvm.internal.draadjrbmk;
import pj.cllcsxoeiz;
import pj.gtknphoqwx;
import ru.myspar.purchases.impl.create_list.domain.store.CreatePurchaseListsFragmentArgs;
import ru.myspar.purchases.impl.list_add_product.domain.model.AddProductType;
import ru.myspar.purchases.impl.list_add_product.domain.store.State;
import ru.myspar.purchases_list.api.models.PurchaseList;
import tg.rgvfuqvkyq;

/* JADX INFO: loaded from: classes6.dex */
public final class iobyxmoadg extends e8.iobyxmoadg {

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final yy1.iobyxmoadg f29948ppxfxbqfkf;

    /* JADX INFO: renamed from: dy1.iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
    static final class C0617iobyxmoadg extends draadjrbmk implements rgvfuqvkyq {

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        final /* synthetic */ iobyxmoadg f29949jyumaefscl;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        final /* synthetic */ wkgbmnqykc f29950yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        int f29951zdlpuopuiu;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C0617iobyxmoadg(wkgbmnqykc wkgbmnqykcVar, iobyxmoadg iobyxmoadgVar, lg.gxszxtbevo gxszxtbevoVar) {
            super(2, gxszxtbevoVar);
            this.f29950yggfygwlhe = wkgbmnqykcVar;
            this.f29949jyumaefscl = iobyxmoadgVar;
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
            return new C0617iobyxmoadg(this.f29950yggfygwlhe, this.f29949jyumaefscl, gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
            int i13 = this.f29951zdlpuopuiu;
            if (i13 == 0) {
                zdlpuopuiu.zoijcleaow(obj);
                wkgbmnqykc wkgbmnqykcVar = this.f29950yggfygwlhe;
                if (wkgbmnqykcVar instanceof wkgbmnqykc.zoijcleaow) {
                    iobyxmoadg iobyxmoadgVar = this.f29949jyumaefscl;
                    String strIobyxmoadg = ((wkgbmnqykc.zoijcleaow) wkgbmnqykcVar).iobyxmoadg();
                    this.f29951zdlpuopuiu = 1;
                    if (iobyxmoadgVar.metgxyhuhe(strIobyxmoadg, this) == objGxszxtbevo) {
                        return objGxszxtbevo;
                    }
                } else {
                    if (!kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(wkgbmnqykcVar, wkgbmnqykc.iobyxmoadg.f29959iobyxmoadg)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    iobyxmoadg iobyxmoadgVar2 = this.f29949jyumaefscl;
                    iobyxmoadgVar2.xrmfcynszj(iobyxmoadg.ikoacuggdj(iobyxmoadgVar2).getTypeOfUse());
                }
            } else {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                zdlpuopuiu.zoijcleaow(obj);
            }
            return wwaezpbzkn.f37140iobyxmoadg;
        }

        @Override // tg.rgvfuqvkyq
        public final Object invoke(cllcsxoeiz cllcsxoeizVar, lg.gxszxtbevo gxszxtbevoVar) {
            return ((C0617iobyxmoadg) create(cllcsxoeizVar, gxszxtbevoVar)).invokeSuspend(wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    static final class zoijcleaow extends kotlin.coroutines.jvm.internal.wkgbmnqykc {

        /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
        int f29952iwizpuwonk;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        /* synthetic */ Object f29954yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        Object f29955zdlpuopuiu;

        zoijcleaow(lg.gxszxtbevo gxszxtbevoVar) {
            super(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            this.f29954yggfygwlhe = obj;
            this.f29952iwizpuwonk |= Integer.MIN_VALUE;
            return iobyxmoadg.this.metgxyhuhe(null, this);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public iobyxmoadg(ns.iobyxmoadg dispatchersProvider, yy1.iobyxmoadg purchasesListComponentApi) {
        super(dispatchersProvider.iobyxmoadg());
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(dispatchersProvider, "dispatchersProvider");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(purchasesListComponentApi, "purchasesListComponentApi");
        this.f29948ppxfxbqfkf = purchasesListComponentApi;
    }

    public static final /* synthetic */ State ikoacuggdj(iobyxmoadg iobyxmoadgVar) {
        return (State) iobyxmoadgVar.jlmebxxoox();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object metgxyhuhe(String str, lg.gxszxtbevo gxszxtbevoVar) {
        zoijcleaow zoijcleaowVar;
        Object next;
        iobyxmoadg iobyxmoadgVar;
        Object objWkgbmnqykc;
        if (gxszxtbevoVar instanceof zoijcleaow) {
            zoijcleaowVar = (zoijcleaow) gxszxtbevoVar;
            int i13 = zoijcleaowVar.f29952iwizpuwonk;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                zoijcleaowVar.f29952iwizpuwonk = i13 - Integer.MIN_VALUE;
            } else {
                zoijcleaowVar = new zoijcleaow(gxszxtbevoVar);
            }
        } else {
            zoijcleaowVar = new zoijcleaow(gxszxtbevoVar);
        }
        Object obj = zoijcleaowVar.f29954yggfygwlhe;
        Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
        int i14 = zoijcleaowVar.f29952iwizpuwonk;
        if (i14 == 0) {
            zdlpuopuiu.zoijcleaow(obj);
            Iterator it = ((State) jlmebxxoox()).getPurchaseLists().iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (!kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(((PurchaseList) next).getId(), str));
            PurchaseList purchaseList = (PurchaseList) next;
            if (purchaseList == null) {
                return wwaezpbzkn.f37140iobyxmoadg;
            }
            ulzqkzuiru(gxszxtbevo.zoijcleaow.f29947iobyxmoadg);
            try {
                kcexrzcfyt.iobyxmoadg iobyxmoadgVar2 = kcexrzcfyt.f37117yggfygwlhe;
                String name = purchaseList.getName();
                AddProductType typeOfUse = ((State) jlmebxxoox()).getTypeOfUse();
                zoijcleaowVar.f29955zdlpuopuiu = this;
                zoijcleaowVar.f29952iwizpuwonk = 1;
                if (okpsazkaxt(str, name, typeOfUse, zoijcleaowVar) == objGxszxtbevo) {
                    return objGxszxtbevo;
                }
                iobyxmoadgVar = this;
            } catch (Throwable th2) {
                th = th2;
                iobyxmoadgVar = this;
                kcexrzcfyt.iobyxmoadg iobyxmoadgVar3 = kcexrzcfyt.f37117yggfygwlhe;
                objWkgbmnqykc = kcexrzcfyt.wkgbmnqykc(zdlpuopuiu.iobyxmoadg(th));
            }
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            iobyxmoadgVar = (iobyxmoadg) zoijcleaowVar.f29955zdlpuopuiu;
            try {
                zdlpuopuiu.zoijcleaow(obj);
            } catch (Throwable th3) {
                th = th3;
                kcexrzcfyt.iobyxmoadg iobyxmoadgVar4 = kcexrzcfyt.f37117yggfygwlhe;
                objWkgbmnqykc = kcexrzcfyt.wkgbmnqykc(zdlpuopuiu.iobyxmoadg(th));
            }
        }
        objWkgbmnqykc = kcexrzcfyt.wkgbmnqykc(wwaezpbzkn.f37140iobyxmoadg);
        if (kcexrzcfyt.agtfadlqog(objWkgbmnqykc)) {
            iobyxmoadgVar.crxdokpmqz(eablkybsjg.ppxfxbqfkf.f29943iobyxmoadg);
        }
        Throwable thDxjokdxxww = kcexrzcfyt.dxjokdxxww(objWkgbmnqykc);
        if (thDxjokdxxww != null) {
            iobyxmoadgVar.rlfsiqarku(thDxjokdxxww);
        }
        iobyxmoadgVar.ulzqkzuiru(gxszxtbevo.iobyxmoadg.f29946iobyxmoadg);
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    private final Object okpsazkaxt(String str, String str2, AddProductType addProductType, lg.gxszxtbevo gxszxtbevoVar) {
        if (addProductType instanceof AddProductType.ProductsListFromBanner) {
            AddProductType.ProductsListFromBanner productsListFromBanner = (AddProductType.ProductsListFromBanner) addProductType;
            Object objBtonecajqb = this.f29948ppxfxbqfkf.btonecajqb(productsListFromBanner.getBlockId(), productsListFromBanner.getProductListName(), str, str2, gxszxtbevoVar);
            return objBtonecajqb == mg.zoijcleaow.gxszxtbevo() ? objBtonecajqb : wwaezpbzkn.f37140iobyxmoadg;
        }
        if (!(addProductType instanceof AddProductType.SingleProduct)) {
            throw new NoWhenBranchMatchedException();
        }
        AddProductType.SingleProduct singleProduct = (AddProductType.SingleProduct) addProductType;
        Object objGxszxtbevo = this.f29948ppxfxbqfkf.gxszxtbevo(str, singleProduct.getProductArticle(), singleProduct.getProductQuantity(), singleProduct.getProductMeasure(), gxszxtbevoVar);
        return objGxszxtbevo == mg.zoijcleaow.gxszxtbevo() ? objGxszxtbevo : wwaezpbzkn.f37140iobyxmoadg;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void xrmfcynszj(AddProductType addProductType) {
        CreatePurchaseListsFragmentArgs singleProduct;
        if (addProductType instanceof AddProductType.ProductsListFromBanner) {
            AddProductType.ProductsListFromBanner productsListFromBanner = (AddProductType.ProductsListFromBanner) addProductType;
            singleProduct = new CreatePurchaseListsFragmentArgs.ProductsListFromBanner(productsListFromBanner.getProductListName(), productsListFromBanner.getBlockId());
        } else {
            if (!(addProductType instanceof AddProductType.SingleProduct)) {
                throw new NoWhenBranchMatchedException();
            }
            AddProductType.SingleProduct singleProduct2 = (AddProductType.SingleProduct) addProductType;
            singleProduct = new CreatePurchaseListsFragmentArgs.SingleProduct(singleProduct2.getProductArticle(), singleProduct2.getProductQuantity(), singleProduct2.getProductMeasure());
        }
        crxdokpmqz(new eablkybsjg.zoijcleaow(singleProduct));
    }

    @Override // a8.zoijcleaow
    /* JADX INFO: renamed from: jztzpxfvev, reason: merged with bridge method [inline-methods] */
    public void zynmafqrjb(wkgbmnqykc intent) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(intent, "intent");
        gtknphoqwx.wkgbmnqykc(sopmlzcsov(), null, null, new C0617iobyxmoadg(intent, this, null), 3, null);
    }

    public final void rlfsiqarku(Throwable error) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(error, "error");
        crxdokpmqz(new eablkybsjg.wkgbmnqykc(error));
    }
}
