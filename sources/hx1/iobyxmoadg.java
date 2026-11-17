package hx1;

import gg.kcexrzcfyt;
import gg.wwaezpbzkn;
import gg.zdlpuopuiu;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.jvm.internal.draadjrbmk;
import pj.cllcsxoeiz;
import pj.gtknphoqwx;
import ru.myspar.components.promo_collection.api.models.PromoCollectionInfo;
import ru.myspar.components.promo_collection.api.models.PromoCollectionItem;
import ru.myspar.core.error_handler.exceptions.DomainException;
import ru.myspar.promo_collection.impl.domain.store.State;
import sj.nufgyqmvbu;
import tg.rgvfuqvkyq;

/* JADX INFO: loaded from: classes6.dex */
public final class iobyxmoadg extends e8.iobyxmoadg {

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private String f41260eablkybsjg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final ns.iobyxmoadg f41261ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final jw.iobyxmoadg f41262wkgbmnqykc;

    /* JADX INFO: renamed from: hx1.iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
    static final class C0959iobyxmoadg extends draadjrbmk implements rgvfuqvkyq {

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        final /* synthetic */ iobyxmoadg f41263jyumaefscl;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        final /* synthetic */ wkgbmnqykc f41264yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        int f41265zdlpuopuiu;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C0959iobyxmoadg(wkgbmnqykc wkgbmnqykcVar, iobyxmoadg iobyxmoadgVar, lg.gxszxtbevo gxszxtbevoVar) {
            super(2, gxszxtbevoVar);
            this.f41264yggfygwlhe = wkgbmnqykcVar;
            this.f41263jyumaefscl = iobyxmoadgVar;
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
            return new C0959iobyxmoadg(this.f41264yggfygwlhe, this.f41263jyumaefscl, gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
            int i13 = this.f41265zdlpuopuiu;
            if (i13 == 0) {
                zdlpuopuiu.zoijcleaow(obj);
                wkgbmnqykc wkgbmnqykcVar = this.f41264yggfygwlhe;
                if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(wkgbmnqykcVar, wkgbmnqykc.iobyxmoadg.f41277iobyxmoadg)) {
                    this.f41263jyumaefscl.f41262wkgbmnqykc.ppxfxbqfkf(this.f41263jyumaefscl.f41260eablkybsjg);
                    this.f41263jyumaefscl.crxdokpmqz(eablkybsjg.iobyxmoadg.f41251iobyxmoadg);
                } else {
                    if (!(wkgbmnqykcVar instanceof wkgbmnqykc.zoijcleaow)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    iobyxmoadg iobyxmoadgVar = this.f41263jyumaefscl;
                    String strIobyxmoadg = ((wkgbmnqykc.zoijcleaow) this.f41264yggfygwlhe).iobyxmoadg();
                    this.f41265zdlpuopuiu = 1;
                    if (iobyxmoadgVar.rlfsiqarku(strIobyxmoadg, this) == objGxszxtbevo) {
                        return objGxszxtbevo;
                    }
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
            return ((C0959iobyxmoadg) create(cllcsxoeizVar, gxszxtbevoVar)).invokeSuspend(wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    static final class ppxfxbqfkf extends draadjrbmk implements rgvfuqvkyq {

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        final /* synthetic */ String f41266jyumaefscl;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        int f41268zdlpuopuiu;

        /* JADX INFO: renamed from: hx1.iobyxmoadg$ppxfxbqfkf$iobyxmoadg, reason: collision with other inner class name */
        static final class C0960iobyxmoadg implements nufgyqmvbu {

            /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
            final /* synthetic */ iobyxmoadg f41269zdlpuopuiu;

            C0960iobyxmoadg(iobyxmoadg iobyxmoadgVar) {
                this.f41269zdlpuopuiu = iobyxmoadgVar;
            }

            @Override // sj.nufgyqmvbu
            /* JADX INFO: renamed from: zoijcleaow, reason: merged with bridge method [inline-methods] */
            public final Object emit(List list, lg.gxszxtbevo gxszxtbevoVar) {
                this.f41269zdlpuopuiu.ulzqkzuiru(new gxszxtbevo.iobyxmoadg(list));
                return wwaezpbzkn.f37140iobyxmoadg;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        ppxfxbqfkf(String str, lg.gxszxtbevo gxszxtbevoVar) {
            super(2, gxszxtbevoVar);
            this.f41266jyumaefscl = str;
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
            return iobyxmoadg.this.new ppxfxbqfkf(this.f41266jyumaefscl, gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
            int i13 = this.f41268zdlpuopuiu;
            if (i13 == 0) {
                zdlpuopuiu.zoijcleaow(obj);
                sj.lqeggnwhkg lqeggnwhkgVarZoijcleaow = iobyxmoadg.this.f41262wkgbmnqykc.zoijcleaow(this.f41266jyumaefscl, iobyxmoadg.this.f41260eablkybsjg);
                C0960iobyxmoadg c0960iobyxmoadg = new C0960iobyxmoadg(iobyxmoadg.this);
                this.f41268zdlpuopuiu = 1;
                if (lqeggnwhkgVarZoijcleaow.collect(c0960iobyxmoadg, this) == objGxszxtbevo) {
                    return objGxszxtbevo;
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

        /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
        int f41270iwizpuwonk;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        /* synthetic */ Object f41272yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        Object f41273zdlpuopuiu;

        zoijcleaow(lg.gxszxtbevo gxszxtbevoVar) {
            super(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            this.f41272yggfygwlhe = obj;
            this.f41270iwizpuwonk |= Integer.MIN_VALUE;
            return iobyxmoadg.this.rlfsiqarku(null, this);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public iobyxmoadg(ns.iobyxmoadg dispatchersProvider, jw.iobyxmoadg promoCollectionComponentApi) {
        super(dispatchersProvider.iobyxmoadg());
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(dispatchersProvider, "dispatchersProvider");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(promoCollectionComponentApi, "promoCollectionComponentApi");
        this.f41261ppxfxbqfkf = dispatchersProvider;
        this.f41262wkgbmnqykc = promoCollectionComponentApi;
        String string = UUID.randomUUID().toString();
        kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(string, "toString(...)");
        this.f41260eablkybsjg = string;
    }

    private final void metgxyhuhe(String str) {
        String collectionId;
        PromoCollectionInfo promoCollectionInfoIobyxmoadg = this.f41262wkgbmnqykc.iobyxmoadg(str);
        ulzqkzuiru(new gxszxtbevo.zoijcleaow(promoCollectionInfoIobyxmoadg == null ? kw.iobyxmoadg.iobyxmoadg() : promoCollectionInfoIobyxmoadg));
        if (promoCollectionInfoIobyxmoadg == null || (collectionId = promoCollectionInfoIobyxmoadg.getCollectionId()) == null) {
            czzsidtyhn(new DomainException("Что-то пошло не так. Блок коллекции не найден", null, 2, null));
        } else {
            yfnezrywwk(collectionId);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    public final Object rlfsiqarku(String str, lg.gxszxtbevo gxszxtbevoVar) {
        zoijcleaow zoijcleaowVar;
        Object next;
        iobyxmoadg iobyxmoadgVar;
        Object objWkgbmnqykc;
        if (gxszxtbevoVar instanceof zoijcleaow) {
            zoijcleaowVar = (zoijcleaow) gxszxtbevoVar;
            int i13 = zoijcleaowVar.f41270iwizpuwonk;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                zoijcleaowVar.f41270iwizpuwonk = i13 - Integer.MIN_VALUE;
            } else {
                zoijcleaowVar = new zoijcleaow(gxszxtbevoVar);
            }
        } else {
            zoijcleaowVar = new zoijcleaow(gxszxtbevoVar);
        }
        zoijcleaow zoijcleaowVar2 = zoijcleaowVar;
        Object obj = zoijcleaowVar2.f41272yggfygwlhe;
        Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
        int i14 = zoijcleaowVar2.f41270iwizpuwonk;
        if (i14 == 0) {
            zdlpuopuiu.zoijcleaow(obj);
            Iterator it = ((State) jlmebxxoox()).getPromoCollectionItems().iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (!kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(((PromoCollectionItem) next).getId(), str));
            PromoCollectionItem promoCollectionItem = (PromoCollectionItem) next;
            if (promoCollectionItem == null) {
                return wwaezpbzkn.f37140iobyxmoadg;
            }
            PromoCollectionItem.Status currentStatus = promoCollectionItem.getCurrentStatus();
            if (!(currentStatus instanceof PromoCollectionItem.Status.Blocked)) {
                if (currentStatus instanceof PromoCollectionItem.Status.Opened) {
                    uwvvkdfqfp(promoCollectionItem);
                } else {
                    if (!(currentStatus instanceof PromoCollectionItem.Status.ReadyToOpen)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    ulzqkzuiru(new gxszxtbevo.ppxfxbqfkf(true));
                    PromoCollectionInfo promoCollectionInfo = ((State) jlmebxxoox()).getPromoCollectionInfo();
                    try {
                        kcexrzcfyt.iobyxmoadg iobyxmoadgVar2 = kcexrzcfyt.f37117yggfygwlhe;
                        jw.iobyxmoadg iobyxmoadgVar3 = this.f41262wkgbmnqykc;
                        String collectionId = promoCollectionInfo.getCollectionId();
                        String landingPageId = ((State) jlmebxxoox()).getLandingPageId();
                        String specialPromoBannerId = ((State) jlmebxxoox()).getSpecialPromoBannerId();
                        zoijcleaowVar2.f41273zdlpuopuiu = this;
                        zoijcleaowVar2.f41270iwizpuwonk = 1;
                        if (iobyxmoadgVar3.wkgbmnqykc(collectionId, landingPageId, specialPromoBannerId, str, zoijcleaowVar2) == objGxszxtbevo) {
                            return objGxszxtbevo;
                        }
                        iobyxmoadgVar = this;
                    } catch (Throwable th2) {
                        th = th2;
                        iobyxmoadgVar = this;
                        kcexrzcfyt.iobyxmoadg iobyxmoadgVar4 = kcexrzcfyt.f37117yggfygwlhe;
                        objWkgbmnqykc = kcexrzcfyt.wkgbmnqykc(zdlpuopuiu.iobyxmoadg(th));
                    }
                }
            }
            return wwaezpbzkn.f37140iobyxmoadg;
        }
        if (i14 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        iobyxmoadgVar = (iobyxmoadg) zoijcleaowVar2.f41273zdlpuopuiu;
        try {
            zdlpuopuiu.zoijcleaow(obj);
        } catch (Throwable th3) {
            th = th3;
            kcexrzcfyt.iobyxmoadg iobyxmoadgVar5 = kcexrzcfyt.f37117yggfygwlhe;
            objWkgbmnqykc = kcexrzcfyt.wkgbmnqykc(zdlpuopuiu.iobyxmoadg(th));
        }
        objWkgbmnqykc = kcexrzcfyt.wkgbmnqykc(wwaezpbzkn.f37140iobyxmoadg);
        if (kcexrzcfyt.dxjokdxxww(objWkgbmnqykc) != null) {
            iobyxmoadgVar.crxdokpmqz(eablkybsjg.ppxfxbqfkf.f41252iobyxmoadg);
        }
        iobyxmoadgVar.ulzqkzuiru(new gxszxtbevo.ppxfxbqfkf(false));
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    private final void uwvvkdfqfp(PromoCollectionItem promoCollectionItem) {
        crxdokpmqz(new eablkybsjg.wkgbmnqykc(promoCollectionItem.getCurrentStatus().getName(), promoCollectionItem.getDescription(), promoCollectionItem.getCurrentStatus().getImageUrl()));
    }

    private final void yfnezrywwk(String str) {
        gtknphoqwx.wkgbmnqykc(sopmlzcsov(), null, null, new ppxfxbqfkf(str, null), 3, null);
    }

    public final void czzsidtyhn(Throwable error) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(error, "error");
        crxdokpmqz(new eablkybsjg.zoijcleaow(error));
    }

    @Override // e8.iobyxmoadg, a8.zoijcleaow
    /* JADX INFO: renamed from: jztzpxfvev, reason: merged with bridge method [inline-methods] */
    public void pmvmpeiblj(hx1.ppxfxbqfkf action) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(action, "action");
        if (!(action instanceof hx1.ppxfxbqfkf.iobyxmoadg)) {
            throw new NoWhenBranchMatchedException();
        }
        metgxyhuhe(((hx1.ppxfxbqfkf.iobyxmoadg) action).iobyxmoadg());
    }

    @Override // a8.zoijcleaow
    /* JADX INFO: renamed from: xrmfcynszj, reason: merged with bridge method [inline-methods] */
    public void zynmafqrjb(wkgbmnqykc intent) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(intent, "intent");
        gtknphoqwx.wkgbmnqykc(sopmlzcsov(), null, null, new C0959iobyxmoadg(intent, this, null), 3, null);
    }
}
