package ru.myspar.proloyalty.purchases.impl.create_list.domain.store;

import gg.kcexrzcfyt;
import gg.wwaezpbzkn;
import gg.zdlpuopuiu;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.jvm.internal.draadjrbmk;
import p0.tzroggbefp;
import pj.cllcsxoeiz;
import pj.gtknphoqwx;
import tg.rgvfuqvkyq;

/* JADX INFO: loaded from: classes6.dex */
public final class iobyxmoadg extends e8.iobyxmoadg {

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final ek1.iobyxmoadg f99531ppxfxbqfkf;

    /* JADX INFO: renamed from: ru.myspar.proloyalty.purchases.impl.create_list.domain.store.iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
    static final class C2382iobyxmoadg extends kotlin.coroutines.jvm.internal.wkgbmnqykc {

        /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
        int f99532iwizpuwonk;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        /* synthetic */ Object f99534yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        Object f99535zdlpuopuiu;

        C2382iobyxmoadg(lg.gxszxtbevo gxszxtbevoVar) {
            super(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            this.f99534yggfygwlhe = obj;
            this.f99532iwizpuwonk |= Integer.MIN_VALUE;
            return iobyxmoadg.this.jztzpxfvev(null, null, null, this);
        }
    }

    static final class ppxfxbqfkf extends draadjrbmk implements rgvfuqvkyq {

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        final /* synthetic */ iobyxmoadg f99536jyumaefscl;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        final /* synthetic */ ru.myspar.proloyalty.purchases.impl.create_list.domain.store.ppxfxbqfkf f99537yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        int f99538zdlpuopuiu;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        ppxfxbqfkf(ru.myspar.proloyalty.purchases.impl.create_list.domain.store.ppxfxbqfkf ppxfxbqfkfVar, iobyxmoadg iobyxmoadgVar, lg.gxszxtbevo gxszxtbevoVar) {
            super(2, gxszxtbevoVar);
            this.f99537yggfygwlhe = ppxfxbqfkfVar;
            this.f99536jyumaefscl = iobyxmoadgVar;
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
            return new ppxfxbqfkf(this.f99537yggfygwlhe, this.f99536jyumaefscl, gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
            int i13 = this.f99538zdlpuopuiu;
            if (i13 == 0) {
                zdlpuopuiu.zoijcleaow(obj);
                ru.myspar.proloyalty.purchases.impl.create_list.domain.store.ppxfxbqfkf ppxfxbqfkfVar = this.f99537yggfygwlhe;
                if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(ppxfxbqfkfVar, ru.myspar.proloyalty.purchases.impl.create_list.domain.store.ppxfxbqfkf.iobyxmoadg.f99545iobyxmoadg)) {
                    this.f99536jyumaefscl.crxdokpmqz(wkgbmnqykc.iobyxmoadg.f99549iobyxmoadg);
                } else if (ppxfxbqfkfVar instanceof ru.myspar.proloyalty.purchases.impl.create_list.domain.store.ppxfxbqfkf.zoijcleaow) {
                    iobyxmoadg iobyxmoadgVar = this.f99536jyumaefscl;
                    this.f99538zdlpuopuiu = 1;
                    if (iobyxmoadgVar.metgxyhuhe(this) == objGxszxtbevo) {
                        return objGxszxtbevo;
                    }
                } else {
                    if (!(ppxfxbqfkfVar instanceof ru.myspar.proloyalty.purchases.impl.create_list.domain.store.ppxfxbqfkf.C2383ppxfxbqfkf)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    this.f99536jyumaefscl.czzsidtyhn(((ru.myspar.proloyalty.purchases.impl.create_list.domain.store.ppxfxbqfkf.C2383ppxfxbqfkf) this.f99537yggfygwlhe).iobyxmoadg());
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
            return ((ppxfxbqfkf) create(cllcsxoeizVar, gxszxtbevoVar)).invokeSuspend(wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    static final class zoijcleaow extends kotlin.coroutines.jvm.internal.wkgbmnqykc {

        /* JADX INFO: renamed from: esjtqupxsv, reason: collision with root package name */
        int f99540esjtqupxsv;

        /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
        /* synthetic */ Object f99541iwizpuwonk;

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        Object f99542jyumaefscl;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        Object f99543yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        Object f99544zdlpuopuiu;

        zoijcleaow(lg.gxszxtbevo gxszxtbevoVar) {
            super(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            this.f99541iwizpuwonk = obj;
            this.f99540esjtqupxsv |= Integer.MIN_VALUE;
            return iobyxmoadg.this.metgxyhuhe(this);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public iobyxmoadg(dr0.iobyxmoadg dispatchersProvider, ek1.iobyxmoadg purchasesListComponentApi) {
        super(dispatchersProvider.iobyxmoadg());
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(dispatchersProvider, "dispatchersProvider");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(purchasesListComponentApi, "purchasesListComponentApi");
        this.f99531ppxfxbqfkf = purchasesListComponentApi;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void czzsidtyhn(tzroggbefp tzroggbefpVar) {
        ulzqkzuiru(new eablkybsjg.zoijcleaow(tzroggbefpVar));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object jztzpxfvev(String str, String str2, CreatePurchaseListsFragmentArgs createPurchaseListsFragmentArgs, lg.gxszxtbevo gxszxtbevoVar) {
        C2382iobyxmoadg c2382iobyxmoadg;
        iobyxmoadg iobyxmoadgVar;
        Object objWkgbmnqykc;
        if (gxszxtbevoVar instanceof C2382iobyxmoadg) {
            c2382iobyxmoadg = (C2382iobyxmoadg) gxszxtbevoVar;
            int i13 = c2382iobyxmoadg.f99532iwizpuwonk;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                c2382iobyxmoadg.f99532iwizpuwonk = i13 - Integer.MIN_VALUE;
            } else {
                c2382iobyxmoadg = new C2382iobyxmoadg(gxszxtbevoVar);
            }
        } else {
            c2382iobyxmoadg = new C2382iobyxmoadg(gxszxtbevoVar);
        }
        Object obj = c2382iobyxmoadg.f99534yggfygwlhe;
        Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
        int i14 = c2382iobyxmoadg.f99532iwizpuwonk;
        if (i14 == 0) {
            zdlpuopuiu.zoijcleaow(obj);
            ulzqkzuiru(new eablkybsjg.iobyxmoadg(true));
            try {
                kcexrzcfyt.iobyxmoadg iobyxmoadgVar2 = kcexrzcfyt.f37117yggfygwlhe;
                c2382iobyxmoadg.f99535zdlpuopuiu = this;
                c2382iobyxmoadg.f99532iwizpuwonk = 1;
                if (xrmfcynszj(str, str2, createPurchaseListsFragmentArgs, c2382iobyxmoadg) == objGxszxtbevo) {
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
            iobyxmoadgVar = (iobyxmoadg) c2382iobyxmoadg.f99535zdlpuopuiu;
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
            iobyxmoadgVar.crxdokpmqz(wkgbmnqykc.zoijcleaow.f99553iobyxmoadg);
        }
        Throwable thDxjokdxxww = kcexrzcfyt.dxjokdxxww(objWkgbmnqykc);
        if (thDxjokdxxww != null) {
            iobyxmoadgVar.uwvvkdfqfp(thDxjokdxxww);
        }
        iobyxmoadgVar.ulzqkzuiru(new eablkybsjg.iobyxmoadg(false));
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:40:0x00af  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object metgxyhuhe(lg.gxszxtbevo gxszxtbevoVar) {
        zoijcleaow zoijcleaowVar;
        String strDraadjrbmk;
        iobyxmoadg iobyxmoadgVar;
        Object objWkgbmnqykc;
        Object obj;
        iobyxmoadg iobyxmoadgVar2;
        Throwable thDxjokdxxww;
        if (gxszxtbevoVar instanceof zoijcleaow) {
            zoijcleaowVar = (zoijcleaow) gxszxtbevoVar;
            int i13 = zoijcleaowVar.f99540esjtqupxsv;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                zoijcleaowVar.f99540esjtqupxsv = i13 - Integer.MIN_VALUE;
            } else {
                zoijcleaowVar = new zoijcleaow(gxszxtbevoVar);
            }
        } else {
            zoijcleaowVar = new zoijcleaow(gxszxtbevoVar);
        }
        Object objNufgyqmvbu = zoijcleaowVar.f99541iwizpuwonk;
        Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
        int i14 = zoijcleaowVar.f99540esjtqupxsv;
        if (i14 != 0) {
            if (i14 == 1) {
                strDraadjrbmk = (String) zoijcleaowVar.f99543yggfygwlhe;
                iobyxmoadgVar = (iobyxmoadg) zoijcleaowVar.f99544zdlpuopuiu;
                try {
                    zdlpuopuiu.zoijcleaow(objNufgyqmvbu);
                } catch (Throwable th2) {
                    th = th2;
                    kcexrzcfyt.iobyxmoadg iobyxmoadgVar3 = kcexrzcfyt.f37117yggfygwlhe;
                    objWkgbmnqykc = kcexrzcfyt.wkgbmnqykc(zdlpuopuiu.iobyxmoadg(th));
                }
            } else {
                if (i14 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                obj = zoijcleaowVar.f99543yggfygwlhe;
                iobyxmoadgVar2 = (iobyxmoadg) zoijcleaowVar.f99544zdlpuopuiu;
                zdlpuopuiu.zoijcleaow(objNufgyqmvbu);
            }
            iobyxmoadgVar = iobyxmoadgVar2;
            objWkgbmnqykc = obj;
            thDxjokdxxww = kcexrzcfyt.dxjokdxxww(objWkgbmnqykc);
            if (thDxjokdxxww != null) {
                iobyxmoadgVar.uwvvkdfqfp(thDxjokdxxww);
            }
            iobyxmoadgVar.ulzqkzuiru(new eablkybsjg.iobyxmoadg(false));
            return wwaezpbzkn.f37140iobyxmoadg;
        }
        zdlpuopuiu.zoijcleaow(objNufgyqmvbu);
        ulzqkzuiru(new eablkybsjg.iobyxmoadg(true));
        strDraadjrbmk = ((State) jlmebxxoox()).getListName().draadjrbmk();
        if (mj.kcexrzcfyt.zfvoamnweg(strDraadjrbmk)) {
            crxdokpmqz(wkgbmnqykc.ppxfxbqfkf.f99550iobyxmoadg);
            iobyxmoadgVar = this;
        } else {
            try {
                kcexrzcfyt.iobyxmoadg iobyxmoadgVar4 = kcexrzcfyt.f37117yggfygwlhe;
                ek1.iobyxmoadg iobyxmoadgVar5 = this.f99531ppxfxbqfkf;
                zoijcleaowVar.f99544zdlpuopuiu = this;
                zoijcleaowVar.f99543yggfygwlhe = strDraadjrbmk;
                zoijcleaowVar.f99540esjtqupxsv = 1;
                objNufgyqmvbu = iobyxmoadgVar5.nufgyqmvbu(strDraadjrbmk, zoijcleaowVar);
                if (objNufgyqmvbu == objGxszxtbevo) {
                    return objGxszxtbevo;
                }
                iobyxmoadgVar = this;
            } catch (Throwable th3) {
                th = th3;
                iobyxmoadgVar = this;
                kcexrzcfyt.iobyxmoadg iobyxmoadgVar6 = kcexrzcfyt.f37117yggfygwlhe;
                objWkgbmnqykc = kcexrzcfyt.wkgbmnqykc(zdlpuopuiu.iobyxmoadg(th));
            }
        }
        iobyxmoadgVar.ulzqkzuiru(new eablkybsjg.iobyxmoadg(false));
        return wwaezpbzkn.f37140iobyxmoadg;
        objWkgbmnqykc = kcexrzcfyt.wkgbmnqykc((String) objNufgyqmvbu);
        if (kcexrzcfyt.agtfadlqog(objWkgbmnqykc)) {
            zoijcleaowVar.f99544zdlpuopuiu = iobyxmoadgVar;
            zoijcleaowVar.f99543yggfygwlhe = objWkgbmnqykc;
            zoijcleaowVar.f99542jyumaefscl = objWkgbmnqykc;
            zoijcleaowVar.f99540esjtqupxsv = 2;
            if (iobyxmoadgVar.yfnezrywwk((String) objWkgbmnqykc, strDraadjrbmk, zoijcleaowVar) == objGxszxtbevo) {
                return objGxszxtbevo;
            }
            obj = objWkgbmnqykc;
            iobyxmoadgVar2 = iobyxmoadgVar;
            iobyxmoadgVar = iobyxmoadgVar2;
            objWkgbmnqykc = obj;
            thDxjokdxxww = kcexrzcfyt.dxjokdxxww(objWkgbmnqykc);
            if (thDxjokdxxww != null) {
                iobyxmoadgVar.uwvvkdfqfp(thDxjokdxxww);
            }
        } else {
            thDxjokdxxww = kcexrzcfyt.dxjokdxxww(objWkgbmnqykc);
            if (thDxjokdxxww != null) {
                iobyxmoadgVar.uwvvkdfqfp(thDxjokdxxww);
            }
        }
        iobyxmoadgVar.ulzqkzuiru(new eablkybsjg.iobyxmoadg(false));
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    private final Object xrmfcynszj(String str, String str2, CreatePurchaseListsFragmentArgs createPurchaseListsFragmentArgs, lg.gxszxtbevo gxszxtbevoVar) {
        if (createPurchaseListsFragmentArgs instanceof CreatePurchaseListsFragmentArgs.ProductsListFromBanner) {
            CreatePurchaseListsFragmentArgs.ProductsListFromBanner productsListFromBanner = (CreatePurchaseListsFragmentArgs.ProductsListFromBanner) createPurchaseListsFragmentArgs;
            Object objBtonecajqb = this.f99531ppxfxbqfkf.btonecajqb(productsListFromBanner.getBlockId(), productsListFromBanner.getProductListName(), str, str2, gxszxtbevoVar);
            return objBtonecajqb == mg.zoijcleaow.gxszxtbevo() ? objBtonecajqb : wwaezpbzkn.f37140iobyxmoadg;
        }
        if (createPurchaseListsFragmentArgs instanceof CreatePurchaseListsFragmentArgs.SingleProduct) {
            CreatePurchaseListsFragmentArgs.SingleProduct singleProduct = (CreatePurchaseListsFragmentArgs.SingleProduct) createPurchaseListsFragmentArgs;
            Object objGxszxtbevo = this.f99531ppxfxbqfkf.gxszxtbevo(str, singleProduct.getArticle(), singleProduct.getQuantity(), singleProduct.getMeasure(), gxszxtbevoVar);
            return objGxszxtbevo == mg.zoijcleaow.gxszxtbevo() ? objGxszxtbevo : wwaezpbzkn.f37140iobyxmoadg;
        }
        if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(createPurchaseListsFragmentArgs, CreatePurchaseListsFragmentArgs.Empty.f99518zdlpuopuiu)) {
            return wwaezpbzkn.f37140iobyxmoadg;
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object yfnezrywwk(String str, String str2, lg.gxszxtbevo gxszxtbevoVar) {
        CreatePurchaseListsFragmentArgs fragmentArgs = ((State) jlmebxxoox()).getFragmentArgs();
        if (!kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(fragmentArgs, CreatePurchaseListsFragmentArgs.Empty.f99518zdlpuopuiu)) {
            Object objJztzpxfvev = jztzpxfvev(str, str2, fragmentArgs, gxszxtbevoVar);
            return objJztzpxfvev == mg.zoijcleaow.gxszxtbevo() ? objJztzpxfvev : wwaezpbzkn.f37140iobyxmoadg;
        }
        crxdokpmqz(new wkgbmnqykc.C2384wkgbmnqykc(str, str2));
        Object objZoijcleaow = this.f99531ppxfxbqfkf.eablkybsjg().zoijcleaow(gxszxtbevoVar);
        return objZoijcleaow == mg.zoijcleaow.gxszxtbevo() ? objZoijcleaow : wwaezpbzkn.f37140iobyxmoadg;
    }

    @Override // a8.zoijcleaow
    /* JADX INFO: renamed from: rlfsiqarku, reason: merged with bridge method [inline-methods] */
    public void zynmafqrjb(ru.myspar.proloyalty.purchases.impl.create_list.domain.store.ppxfxbqfkf intent) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(intent, "intent");
        gtknphoqwx.wkgbmnqykc(sopmlzcsov(), null, null, new ppxfxbqfkf(intent, this, null), 3, null);
    }

    public final void uwvvkdfqfp(Throwable error) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(error, "error");
        crxdokpmqz(new wkgbmnqykc.eablkybsjg(error));
    }
}
