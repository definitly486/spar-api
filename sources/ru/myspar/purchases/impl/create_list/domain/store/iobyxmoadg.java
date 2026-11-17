package ru.myspar.purchases.impl.create_list.domain.store;

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
    private final yy1.iobyxmoadg f102239ppxfxbqfkf;

    /* JADX INFO: renamed from: ru.myspar.purchases.impl.create_list.domain.store.iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
    static final class C2464iobyxmoadg extends kotlin.coroutines.jvm.internal.wkgbmnqykc {

        /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
        int f102240iwizpuwonk;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        /* synthetic */ Object f102242yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        Object f102243zdlpuopuiu;

        C2464iobyxmoadg(lg.gxszxtbevo gxszxtbevoVar) {
            super(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            this.f102242yggfygwlhe = obj;
            this.f102240iwizpuwonk |= Integer.MIN_VALUE;
            return iobyxmoadg.this.jztzpxfvev(null, null, null, this);
        }
    }

    static final class ppxfxbqfkf extends draadjrbmk implements rgvfuqvkyq {

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        final /* synthetic */ iobyxmoadg f102244jyumaefscl;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        final /* synthetic */ ru.myspar.purchases.impl.create_list.domain.store.ppxfxbqfkf f102245yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        int f102246zdlpuopuiu;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        ppxfxbqfkf(ru.myspar.purchases.impl.create_list.domain.store.ppxfxbqfkf ppxfxbqfkfVar, iobyxmoadg iobyxmoadgVar, lg.gxszxtbevo gxszxtbevoVar) {
            super(2, gxszxtbevoVar);
            this.f102245yggfygwlhe = ppxfxbqfkfVar;
            this.f102244jyumaefscl = iobyxmoadgVar;
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
            return new ppxfxbqfkf(this.f102245yggfygwlhe, this.f102244jyumaefscl, gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
            int i13 = this.f102246zdlpuopuiu;
            if (i13 == 0) {
                zdlpuopuiu.zoijcleaow(obj);
                ru.myspar.purchases.impl.create_list.domain.store.ppxfxbqfkf ppxfxbqfkfVar = this.f102245yggfygwlhe;
                if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(ppxfxbqfkfVar, ru.myspar.purchases.impl.create_list.domain.store.ppxfxbqfkf.iobyxmoadg.f102253iobyxmoadg)) {
                    this.f102244jyumaefscl.crxdokpmqz(wkgbmnqykc.iobyxmoadg.f102257iobyxmoadg);
                } else if (ppxfxbqfkfVar instanceof ru.myspar.purchases.impl.create_list.domain.store.ppxfxbqfkf.zoijcleaow) {
                    iobyxmoadg iobyxmoadgVar = this.f102244jyumaefscl;
                    this.f102246zdlpuopuiu = 1;
                    if (iobyxmoadgVar.metgxyhuhe(this) == objGxszxtbevo) {
                        return objGxszxtbevo;
                    }
                } else {
                    if (!(ppxfxbqfkfVar instanceof ru.myspar.purchases.impl.create_list.domain.store.ppxfxbqfkf.C2465ppxfxbqfkf)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    this.f102244jyumaefscl.czzsidtyhn(((ru.myspar.purchases.impl.create_list.domain.store.ppxfxbqfkf.C2465ppxfxbqfkf) this.f102245yggfygwlhe).iobyxmoadg());
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
        int f102248esjtqupxsv;

        /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
        /* synthetic */ Object f102249iwizpuwonk;

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        Object f102250jyumaefscl;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        Object f102251yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        Object f102252zdlpuopuiu;

        zoijcleaow(lg.gxszxtbevo gxszxtbevoVar) {
            super(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            this.f102249iwizpuwonk = obj;
            this.f102248esjtqupxsv |= Integer.MIN_VALUE;
            return iobyxmoadg.this.metgxyhuhe(this);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public iobyxmoadg(ns.iobyxmoadg dispatchersProvider, yy1.iobyxmoadg purchasesListComponentApi) {
        super(dispatchersProvider.iobyxmoadg());
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(dispatchersProvider, "dispatchersProvider");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(purchasesListComponentApi, "purchasesListComponentApi");
        this.f102239ppxfxbqfkf = purchasesListComponentApi;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void czzsidtyhn(tzroggbefp tzroggbefpVar) {
        ulzqkzuiru(new eablkybsjg.zoijcleaow(tzroggbefpVar));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object jztzpxfvev(String str, String str2, CreatePurchaseListsFragmentArgs createPurchaseListsFragmentArgs, lg.gxszxtbevo gxszxtbevoVar) {
        C2464iobyxmoadg c2464iobyxmoadg;
        iobyxmoadg iobyxmoadgVar;
        Object objWkgbmnqykc;
        if (gxszxtbevoVar instanceof C2464iobyxmoadg) {
            c2464iobyxmoadg = (C2464iobyxmoadg) gxszxtbevoVar;
            int i13 = c2464iobyxmoadg.f102240iwizpuwonk;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                c2464iobyxmoadg.f102240iwizpuwonk = i13 - Integer.MIN_VALUE;
            } else {
                c2464iobyxmoadg = new C2464iobyxmoadg(gxszxtbevoVar);
            }
        } else {
            c2464iobyxmoadg = new C2464iobyxmoadg(gxszxtbevoVar);
        }
        Object obj = c2464iobyxmoadg.f102242yggfygwlhe;
        Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
        int i14 = c2464iobyxmoadg.f102240iwizpuwonk;
        if (i14 == 0) {
            zdlpuopuiu.zoijcleaow(obj);
            ulzqkzuiru(new eablkybsjg.iobyxmoadg(true));
            try {
                kcexrzcfyt.iobyxmoadg iobyxmoadgVar2 = kcexrzcfyt.f37117yggfygwlhe;
                c2464iobyxmoadg.f102243zdlpuopuiu = this;
                c2464iobyxmoadg.f102240iwizpuwonk = 1;
                if (xrmfcynszj(str, str2, createPurchaseListsFragmentArgs, c2464iobyxmoadg) == objGxszxtbevo) {
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
            iobyxmoadgVar = (iobyxmoadg) c2464iobyxmoadg.f102243zdlpuopuiu;
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
            iobyxmoadgVar.crxdokpmqz(wkgbmnqykc.zoijcleaow.f102261iobyxmoadg);
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
            int i13 = zoijcleaowVar.f102248esjtqupxsv;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                zoijcleaowVar.f102248esjtqupxsv = i13 - Integer.MIN_VALUE;
            } else {
                zoijcleaowVar = new zoijcleaow(gxszxtbevoVar);
            }
        } else {
            zoijcleaowVar = new zoijcleaow(gxszxtbevoVar);
        }
        Object objNufgyqmvbu = zoijcleaowVar.f102249iwizpuwonk;
        Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
        int i14 = zoijcleaowVar.f102248esjtqupxsv;
        if (i14 != 0) {
            if (i14 == 1) {
                strDraadjrbmk = (String) zoijcleaowVar.f102251yggfygwlhe;
                iobyxmoadgVar = (iobyxmoadg) zoijcleaowVar.f102252zdlpuopuiu;
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
                obj = zoijcleaowVar.f102251yggfygwlhe;
                iobyxmoadgVar2 = (iobyxmoadg) zoijcleaowVar.f102252zdlpuopuiu;
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
            crxdokpmqz(wkgbmnqykc.ppxfxbqfkf.f102258iobyxmoadg);
            iobyxmoadgVar = this;
        } else {
            try {
                kcexrzcfyt.iobyxmoadg iobyxmoadgVar4 = kcexrzcfyt.f37117yggfygwlhe;
                yy1.iobyxmoadg iobyxmoadgVar5 = this.f102239ppxfxbqfkf;
                zoijcleaowVar.f102252zdlpuopuiu = this;
                zoijcleaowVar.f102251yggfygwlhe = strDraadjrbmk;
                zoijcleaowVar.f102248esjtqupxsv = 1;
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
            zoijcleaowVar.f102252zdlpuopuiu = iobyxmoadgVar;
            zoijcleaowVar.f102251yggfygwlhe = objWkgbmnqykc;
            zoijcleaowVar.f102250jyumaefscl = objWkgbmnqykc;
            zoijcleaowVar.f102248esjtqupxsv = 2;
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
            Object objBtonecajqb = this.f102239ppxfxbqfkf.btonecajqb(productsListFromBanner.getBlockId(), productsListFromBanner.getProductListName(), str, str2, gxszxtbevoVar);
            return objBtonecajqb == mg.zoijcleaow.gxszxtbevo() ? objBtonecajqb : wwaezpbzkn.f37140iobyxmoadg;
        }
        if (createPurchaseListsFragmentArgs instanceof CreatePurchaseListsFragmentArgs.SingleProduct) {
            CreatePurchaseListsFragmentArgs.SingleProduct singleProduct = (CreatePurchaseListsFragmentArgs.SingleProduct) createPurchaseListsFragmentArgs;
            Object objGxszxtbevo = this.f102239ppxfxbqfkf.gxszxtbevo(str, singleProduct.getArticle(), singleProduct.getQuantity(), singleProduct.getMeasure(), gxszxtbevoVar);
            return objGxszxtbevo == mg.zoijcleaow.gxszxtbevo() ? objGxszxtbevo : wwaezpbzkn.f37140iobyxmoadg;
        }
        if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(createPurchaseListsFragmentArgs, CreatePurchaseListsFragmentArgs.Empty.f102226zdlpuopuiu)) {
            return wwaezpbzkn.f37140iobyxmoadg;
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object yfnezrywwk(String str, String str2, lg.gxszxtbevo gxszxtbevoVar) {
        CreatePurchaseListsFragmentArgs fragmentArgs = ((State) jlmebxxoox()).getFragmentArgs();
        if (!kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(fragmentArgs, CreatePurchaseListsFragmentArgs.Empty.f102226zdlpuopuiu)) {
            Object objJztzpxfvev = jztzpxfvev(str, str2, fragmentArgs, gxszxtbevoVar);
            return objJztzpxfvev == mg.zoijcleaow.gxszxtbevo() ? objJztzpxfvev : wwaezpbzkn.f37140iobyxmoadg;
        }
        crxdokpmqz(new wkgbmnqykc.C2466wkgbmnqykc(str, str2));
        Object objZoijcleaow = this.f102239ppxfxbqfkf.eablkybsjg().zoijcleaow(gxszxtbevoVar);
        return objZoijcleaow == mg.zoijcleaow.gxszxtbevo() ? objZoijcleaow : wwaezpbzkn.f37140iobyxmoadg;
    }

    @Override // a8.zoijcleaow
    /* JADX INFO: renamed from: rlfsiqarku, reason: merged with bridge method [inline-methods] */
    public void zynmafqrjb(ru.myspar.purchases.impl.create_list.domain.store.ppxfxbqfkf intent) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(intent, "intent");
        gtknphoqwx.wkgbmnqykc(sopmlzcsov(), null, null, new ppxfxbqfkf(intent, this, null), 3, null);
    }

    public final void uwvvkdfqfp(Throwable error) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(error, "error");
        crxdokpmqz(new wkgbmnqykc.eablkybsjg(error));
    }
}
