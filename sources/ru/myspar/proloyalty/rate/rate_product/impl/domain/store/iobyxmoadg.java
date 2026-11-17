package ru.myspar.proloyalty.rate.rate_product.impl.domain.store;

import gg.kcexrzcfyt;
import gg.pmvmpeiblj;
import gg.wwaezpbzkn;
import gg.zdlpuopuiu;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.jvm.internal.draadjrbmk;
import pj.cllcsxoeiz;
import pj.gtknphoqwx;
import ru.myspar.proloyalty.rate.rate_product.api.model.RateType;
import ru.myspar.proloyalty.rate.rate_product.impl.domain.model.RateProductItem;
import ru.myspar.proloyalty.rate.rate_product.impl.domain.model.RateProductReviewData;
import tg.rgvfuqvkyq;

/* JADX INFO: loaded from: classes6.dex */
public final class iobyxmoadg extends e8.iobyxmoadg {

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private final lm1.ppxfxbqfkf f100263eablkybsjg;

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    private final pm1.iobyxmoadg f100264gxszxtbevo;

    /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
    private final vm0.zoijcleaow f100265lqeggnwhkg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final lm1.iobyxmoadg f100266ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final lm1.zoijcleaow f100267wkgbmnqykc;

    /* JADX INFO: renamed from: ru.myspar.proloyalty.rate.rate_product.impl.domain.store.iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
    static final class C2406iobyxmoadg extends draadjrbmk implements rgvfuqvkyq {

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        final /* synthetic */ iobyxmoadg f100268jyumaefscl;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        final /* synthetic */ ru.myspar.proloyalty.rate.rate_product.impl.domain.store.ppxfxbqfkf f100269yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        int f100270zdlpuopuiu;

        /* JADX INFO: renamed from: ru.myspar.proloyalty.rate.rate_product.impl.domain.store.iobyxmoadg$iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
        static final class C2407iobyxmoadg extends draadjrbmk implements rgvfuqvkyq {

            /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
            final /* synthetic */ iobyxmoadg f100271jyumaefscl;

            /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
            /* synthetic */ Object f100272yggfygwlhe;

            /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
            int f100273zdlpuopuiu;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C2407iobyxmoadg(iobyxmoadg iobyxmoadgVar, lg.gxszxtbevo gxszxtbevoVar) {
                super(2, gxszxtbevoVar);
                this.f100271jyumaefscl = iobyxmoadgVar;
            }

            @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
            public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
                C2407iobyxmoadg c2407iobyxmoadg = new C2407iobyxmoadg(this.f100271jyumaefscl, gxszxtbevoVar);
                c2407iobyxmoadg.f100272yggfygwlhe = obj;
                return c2407iobyxmoadg;
            }

            @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
            public final Object invokeSuspend(Object obj) {
                mg.zoijcleaow.gxszxtbevo();
                if (this.f100273zdlpuopuiu != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                zdlpuopuiu.zoijcleaow(obj);
                RateProductItem rateProductItem = (RateProductItem) this.f100272yggfygwlhe;
                this.f100271jyumaefscl.czzsidtyhn(dm1.iobyxmoadg.EnumC0582iobyxmoadg.ITEM_REVIEW, rateProductItem.getProductArticle());
                this.f100271jyumaefscl.ulzqkzuiru(new gxszxtbevo.C2405gxszxtbevo(rateProductItem));
                return wwaezpbzkn.f37140iobyxmoadg;
            }

            @Override // tg.rgvfuqvkyq
            /* JADX INFO: renamed from: ojitshcjhn, reason: merged with bridge method [inline-methods] */
            public final Object invoke(RateProductItem rateProductItem, lg.gxszxtbevo gxszxtbevoVar) {
                return ((C2407iobyxmoadg) create(rateProductItem, gxszxtbevoVar)).invokeSuspend(wwaezpbzkn.f37140iobyxmoadg);
            }
        }

        /* JADX INFO: renamed from: ru.myspar.proloyalty.rate.rate_product.impl.domain.store.iobyxmoadg$iobyxmoadg$zoijcleaow */
        static final class zoijcleaow extends draadjrbmk implements rgvfuqvkyq {

            /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
            final /* synthetic */ iobyxmoadg f100274jyumaefscl;

            /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
            /* synthetic */ Object f100275yggfygwlhe;

            /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
            int f100276zdlpuopuiu;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            zoijcleaow(iobyxmoadg iobyxmoadgVar, lg.gxszxtbevo gxszxtbevoVar) {
                super(2, gxszxtbevoVar);
                this.f100274jyumaefscl = iobyxmoadgVar;
            }

            @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
            public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
                zoijcleaow zoijcleaowVar = new zoijcleaow(this.f100274jyumaefscl, gxszxtbevoVar);
                zoijcleaowVar.f100275yggfygwlhe = obj;
                return zoijcleaowVar;
            }

            @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
            public final Object invokeSuspend(Object obj) {
                mg.zoijcleaow.gxszxtbevo();
                if (this.f100276zdlpuopuiu != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                zdlpuopuiu.zoijcleaow(obj);
                Throwable th2 = (Throwable) this.f100275yggfygwlhe;
                iobyxmoadg.uwvvkdfqfp(this.f100274jyumaefscl, dm1.iobyxmoadg.EnumC0582iobyxmoadg.LOADING_ERROR, null, 2, null);
                this.f100274jyumaefscl.ulzqkzuiru(new gxszxtbevo.ppxfxbqfkf(th2 != null ? th2.getMessage() : null));
                return wwaezpbzkn.f37140iobyxmoadg;
            }

            @Override // tg.rgvfuqvkyq
            /* JADX INFO: renamed from: ojitshcjhn, reason: merged with bridge method [inline-methods] */
            public final Object invoke(Throwable th2, lg.gxszxtbevo gxszxtbevoVar) {
                return ((zoijcleaow) create(th2, gxszxtbevoVar)).invokeSuspend(wwaezpbzkn.f37140iobyxmoadg);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C2406iobyxmoadg(ru.myspar.proloyalty.rate.rate_product.impl.domain.store.ppxfxbqfkf ppxfxbqfkfVar, iobyxmoadg iobyxmoadgVar, lg.gxszxtbevo gxszxtbevoVar) {
            super(2, gxszxtbevoVar);
            this.f100269yggfygwlhe = ppxfxbqfkfVar;
            this.f100268jyumaefscl = iobyxmoadgVar;
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
            return new C2406iobyxmoadg(this.f100269yggfygwlhe, this.f100268jyumaefscl, gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
            int i13 = this.f100270zdlpuopuiu;
            if (i13 == 0) {
                zdlpuopuiu.zoijcleaow(obj);
                if (!kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f100269yggfygwlhe, ru.myspar.proloyalty.rate.rate_product.impl.domain.store.ppxfxbqfkf.iobyxmoadg.f100299iobyxmoadg)) {
                    throw new NoWhenBranchMatchedException();
                }
                RateType rateType = iobyxmoadg.okpsazkaxt(this.f100268jyumaefscl).getRateType();
                iobyxmoadg iobyxmoadgVar = this.f100268jyumaefscl;
                C2407iobyxmoadg c2407iobyxmoadg = new C2407iobyxmoadg(iobyxmoadgVar, null);
                zoijcleaow zoijcleaowVar = new zoijcleaow(this.f100268jyumaefscl, null);
                this.f100270zdlpuopuiu = 1;
                if (iobyxmoadgVar.rlfsiqarku(rateType, c2407iobyxmoadg, zoijcleaowVar, this) == objGxszxtbevo) {
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
            return ((C2406iobyxmoadg) create(cllcsxoeizVar, gxszxtbevoVar)).invokeSuspend(wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    static final class ppxfxbqfkf extends kotlin.coroutines.jvm.internal.wkgbmnqykc {

        /* JADX INFO: renamed from: esjtqupxsv, reason: collision with root package name */
        int f100278esjtqupxsv;

        /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
        /* synthetic */ Object f100279iwizpuwonk;

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        Object f100280jyumaefscl;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        Object f100281yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        Object f100282zdlpuopuiu;

        ppxfxbqfkf(lg.gxszxtbevo gxszxtbevoVar) {
            super(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            this.f100279iwizpuwonk = obj;
            this.f100278esjtqupxsv |= Integer.MIN_VALUE;
            return iobyxmoadg.this.rlfsiqarku(null, null, null, this);
        }
    }

    static final class wkgbmnqykc extends kotlin.coroutines.jvm.internal.wkgbmnqykc {

        /* JADX INFO: renamed from: esjtqupxsv, reason: collision with root package name */
        int f100284esjtqupxsv;

        /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
        /* synthetic */ Object f100285iwizpuwonk;

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        Object f100286jyumaefscl;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        Object f100287yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        Object f100288zdlpuopuiu;

        wkgbmnqykc(lg.gxszxtbevo gxszxtbevoVar) {
            super(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            this.f100285iwizpuwonk = obj;
            this.f100284esjtqupxsv |= Integer.MIN_VALUE;
            return iobyxmoadg.this.ydmasvzmpa(null, this);
        }
    }

    static final class zoijcleaow extends draadjrbmk implements rgvfuqvkyq {

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        final /* synthetic */ iobyxmoadg f100289jyumaefscl;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        final /* synthetic */ ru.myspar.proloyalty.rate.rate_product.impl.domain.store.wkgbmnqykc f100290yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        int f100291zdlpuopuiu;

        /* JADX INFO: renamed from: ru.myspar.proloyalty.rate.rate_product.impl.domain.store.iobyxmoadg$zoijcleaow$iobyxmoadg, reason: collision with other inner class name */
        static final class C2408iobyxmoadg extends draadjrbmk implements rgvfuqvkyq {

            /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
            final /* synthetic */ iobyxmoadg f100292jyumaefscl;

            /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
            /* synthetic */ Object f100293yggfygwlhe;

            /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
            int f100294zdlpuopuiu;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C2408iobyxmoadg(iobyxmoadg iobyxmoadgVar, lg.gxszxtbevo gxszxtbevoVar) {
                super(2, gxszxtbevoVar);
                this.f100292jyumaefscl = iobyxmoadgVar;
            }

            @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
            public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
                C2408iobyxmoadg c2408iobyxmoadg = new C2408iobyxmoadg(this.f100292jyumaefscl, gxszxtbevoVar);
                c2408iobyxmoadg.f100293yggfygwlhe = obj;
                return c2408iobyxmoadg;
            }

            @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
            public final Object invokeSuspend(Object obj) {
                mg.zoijcleaow.gxszxtbevo();
                if (this.f100294zdlpuopuiu != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                zdlpuopuiu.zoijcleaow(obj);
                RateProductItem rateProductItem = (RateProductItem) this.f100293yggfygwlhe;
                this.f100292jyumaefscl.czzsidtyhn(dm1.iobyxmoadg.EnumC0582iobyxmoadg.ITEM_REVIEW, rateProductItem.getProductArticle());
                this.f100292jyumaefscl.ulzqkzuiru(new gxszxtbevo.C2405gxszxtbevo(rateProductItem));
                return wwaezpbzkn.f37140iobyxmoadg;
            }

            @Override // tg.rgvfuqvkyq
            /* JADX INFO: renamed from: ojitshcjhn, reason: merged with bridge method [inline-methods] */
            public final Object invoke(RateProductItem rateProductItem, lg.gxszxtbevo gxszxtbevoVar) {
                return ((C2408iobyxmoadg) create(rateProductItem, gxszxtbevoVar)).invokeSuspend(wwaezpbzkn.f37140iobyxmoadg);
            }
        }

        /* JADX INFO: renamed from: ru.myspar.proloyalty.rate.rate_product.impl.domain.store.iobyxmoadg$zoijcleaow$zoijcleaow, reason: collision with other inner class name */
        static final class C2409zoijcleaow extends draadjrbmk implements rgvfuqvkyq {

            /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
            final /* synthetic */ iobyxmoadg f100295yggfygwlhe;

            /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
            int f100296zdlpuopuiu;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C2409zoijcleaow(iobyxmoadg iobyxmoadgVar, lg.gxszxtbevo gxszxtbevoVar) {
                super(2, gxszxtbevoVar);
                this.f100295yggfygwlhe = iobyxmoadgVar;
            }

            @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
            public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
                return new C2409zoijcleaow(this.f100295yggfygwlhe, gxszxtbevoVar);
            }

            @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
            public final Object invokeSuspend(Object obj) {
                mg.zoijcleaow.gxszxtbevo();
                if (this.f100296zdlpuopuiu != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                zdlpuopuiu.zoijcleaow(obj);
                iobyxmoadg.uwvvkdfqfp(this.f100295yggfygwlhe, dm1.iobyxmoadg.EnumC0582iobyxmoadg.UNKNOWN_NEXT_ITEM, null, 2, null);
                this.f100295yggfygwlhe.ulzqkzuiru(gxszxtbevo.wkgbmnqykc.f100261iobyxmoadg);
                return wwaezpbzkn.f37140iobyxmoadg;
            }

            @Override // tg.rgvfuqvkyq
            /* JADX INFO: renamed from: ojitshcjhn, reason: merged with bridge method [inline-methods] */
            public final Object invoke(Throwable th2, lg.gxszxtbevo gxszxtbevoVar) {
                return ((C2409zoijcleaow) create(th2, gxszxtbevoVar)).invokeSuspend(wwaezpbzkn.f37140iobyxmoadg);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        zoijcleaow(ru.myspar.proloyalty.rate.rate_product.impl.domain.store.wkgbmnqykc wkgbmnqykcVar, iobyxmoadg iobyxmoadgVar, lg.gxszxtbevo gxszxtbevoVar) {
            super(2, gxszxtbevoVar);
            this.f100290yggfygwlhe = wkgbmnqykcVar;
            this.f100289jyumaefscl = iobyxmoadgVar;
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
            return new zoijcleaow(this.f100290yggfygwlhe, this.f100289jyumaefscl, gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
            int i13 = this.f100291zdlpuopuiu;
            if (i13 == 0) {
                zdlpuopuiu.zoijcleaow(obj);
                ru.myspar.proloyalty.rate.rate_product.impl.domain.store.wkgbmnqykc wkgbmnqykcVar = this.f100290yggfygwlhe;
                if (wkgbmnqykcVar instanceof ru.myspar.proloyalty.rate.rate_product.impl.domain.store.wkgbmnqykc.iobyxmoadg) {
                    if (iobyxmoadg.okpsazkaxt(this.f100289jyumaefscl).gxszxtbevo() == null) {
                        return wwaezpbzkn.f37140iobyxmoadg;
                    }
                    ru.myspar.proloyalty.rate.rate_product.impl.domain.store.wkgbmnqykc.iobyxmoadg iobyxmoadgVar = (ru.myspar.proloyalty.rate.rate_product.impl.domain.store.wkgbmnqykc.iobyxmoadg) this.f100290yggfygwlhe;
                    if (iobyxmoadgVar instanceof ru.myspar.proloyalty.rate.rate_product.impl.domain.store.wkgbmnqykc.iobyxmoadg.C2410iobyxmoadg) {
                        this.f100289jyumaefscl.ulzqkzuiru(new gxszxtbevo.lqeggnwhkg(((ru.myspar.proloyalty.rate.rate_product.impl.domain.store.wkgbmnqykc.iobyxmoadg.C2410iobyxmoadg) this.f100290yggfygwlhe).iobyxmoadg()));
                    } else {
                        if (!(iobyxmoadgVar instanceof ru.myspar.proloyalty.rate.rate_product.impl.domain.store.wkgbmnqykc.iobyxmoadg.zoijcleaow)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        this.f100289jyumaefscl.ulzqkzuiru(new gxszxtbevo.nufgyqmvbu(((ru.myspar.proloyalty.rate.rate_product.impl.domain.store.wkgbmnqykc.iobyxmoadg.zoijcleaow) this.f100290yggfygwlhe).iobyxmoadg(), null));
                    }
                } else if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(wkgbmnqykcVar, ru.myspar.proloyalty.rate.rate_product.impl.domain.store.wkgbmnqykc.ppxfxbqfkf.f100302iobyxmoadg)) {
                    if (!iobyxmoadg.okpsazkaxt(this.f100289jyumaefscl).dxjokdxxww()) {
                        return wwaezpbzkn.f37140iobyxmoadg;
                    }
                    this.f100289jyumaefscl.ulzqkzuiru(gxszxtbevo.dxjokdxxww.f100253iobyxmoadg);
                    iobyxmoadg iobyxmoadgVar2 = this.f100289jyumaefscl;
                    RateType rateType = iobyxmoadg.okpsazkaxt(iobyxmoadgVar2).getRateType();
                    C2408iobyxmoadg c2408iobyxmoadg = new C2408iobyxmoadg(this.f100289jyumaefscl, null);
                    C2409zoijcleaow c2409zoijcleaow = new C2409zoijcleaow(this.f100289jyumaefscl, null);
                    this.f100291zdlpuopuiu = 1;
                    if (iobyxmoadgVar2.rlfsiqarku(rateType, c2408iobyxmoadg, c2409zoijcleaow, this) == objGxszxtbevo) {
                        return objGxszxtbevo;
                    }
                } else if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(wkgbmnqykcVar, ru.myspar.proloyalty.rate.rate_product.impl.domain.store.wkgbmnqykc.C2411wkgbmnqykc.f100303iobyxmoadg)) {
                    State.Content.Product productGxszxtbevo = iobyxmoadg.okpsazkaxt(this.f100289jyumaefscl).gxszxtbevo();
                    if (productGxszxtbevo == null) {
                        return wwaezpbzkn.f37140iobyxmoadg;
                    }
                    lm1.ppxfxbqfkf.iobyxmoadg iobyxmoadgVar3 = new lm1.ppxfxbqfkf.iobyxmoadg(new jm1.zoijcleaow(productGxszxtbevo.getProductArticle(), new RateProductReviewData(productGxszxtbevo.getRating(), productGxszxtbevo.getComment().draadjrbmk(), null)), iobyxmoadg.okpsazkaxt(this.f100289jyumaefscl).getRateType() instanceof RateType.List);
                    iobyxmoadg iobyxmoadgVar4 = this.f100289jyumaefscl;
                    this.f100291zdlpuopuiu = 2;
                    if (iobyxmoadgVar4.ydmasvzmpa(iobyxmoadgVar3, this) == objGxszxtbevo) {
                        return objGxszxtbevo;
                    }
                } else {
                    if (!kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(wkgbmnqykcVar, ru.myspar.proloyalty.rate.rate_product.impl.domain.store.wkgbmnqykc.zoijcleaow.f100304iobyxmoadg)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    State.Message message = iobyxmoadg.okpsazkaxt(this.f100289jyumaefscl).getMessage();
                    if ((message instanceof State.Message.Success) || (message instanceof State.Message.Error.Init)) {
                        this.f100289jyumaefscl.crxdokpmqz(eablkybsjg.iobyxmoadg.f100250iobyxmoadg);
                    } else if (message instanceof State.Message.Error.Send) {
                        this.f100289jyumaefscl.ulzqkzuiru(gxszxtbevo.iobyxmoadg.f100257iobyxmoadg);
                    } else if (message != null) {
                        throw new NoWhenBranchMatchedException();
                    }
                }
            } else {
                if (i13 != 1 && i13 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                zdlpuopuiu.zoijcleaow(obj);
            }
            return wwaezpbzkn.f37140iobyxmoadg;
        }

        @Override // tg.rgvfuqvkyq
        public final Object invoke(cllcsxoeiz cllcsxoeizVar, lg.gxszxtbevo gxszxtbevoVar) {
            return ((zoijcleaow) create(cllcsxoeizVar, gxszxtbevoVar)).invokeSuspend(wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public iobyxmoadg(lm1.iobyxmoadg getRateProductByArticleUseCase, lm1.zoijcleaow getRateProductPendingReviewUseCase, lm1.ppxfxbqfkf submitRateProductReviewUseCase, pm1.iobyxmoadg changeProductReviewObserver, vm0.zoijcleaow analyticsTracker, dr0.iobyxmoadg dispatchersProvider) {
        super(dispatchersProvider.iobyxmoadg());
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(getRateProductByArticleUseCase, "getRateProductByArticleUseCase");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(getRateProductPendingReviewUseCase, "getRateProductPendingReviewUseCase");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(submitRateProductReviewUseCase, "submitRateProductReviewUseCase");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(changeProductReviewObserver, "changeProductReviewObserver");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(analyticsTracker, "analyticsTracker");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(dispatchersProvider, "dispatchersProvider");
        this.f100266ppxfxbqfkf = getRateProductByArticleUseCase;
        this.f100267wkgbmnqykc = getRateProductPendingReviewUseCase;
        this.f100263eablkybsjg = submitRateProductReviewUseCase;
        this.f100264gxszxtbevo = changeProductReviewObserver;
        this.f100265lqeggnwhkg = analyticsTracker;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void czzsidtyhn(dm1.iobyxmoadg.EnumC0582iobyxmoadg enumC0582iobyxmoadg, String str) {
        this.f100265lqeggnwhkg.wkgbmnqykc(new dm1.iobyxmoadg(enumC0582iobyxmoadg, str));
    }

    public static final /* synthetic */ State okpsazkaxt(iobyxmoadg iobyxmoadgVar) {
        return (State) iobyxmoadgVar.jlmebxxoox();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:37:0x00c9  */
    /* JADX WARN: Code duplicated, block: B:39:0x00d7 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:42:0x00de  */
    /* JADX WARN: Code duplicated, block: B:44:0x00ed A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:54:0x011f A[Catch: all -> 0x013b, TryCatch #2 {all -> 0x013b, blocks: (B:52:0x0115, B:54:0x011f, B:60:0x013d, B:49:0x00f5), top: B:81:0x00f5 }] */
    /* JADX WARN: Code duplicated, block: B:56:0x0138  */
    /* JADX WARN: Code duplicated, block: B:57:0x0139  */
    /* JADX WARN: Code duplicated, block: B:65:0x0158  */
    /* JADX WARN: Code duplicated, block: B:67:0x0167 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:70:0x016e  */
    /* JADX WARN: Code duplicated, block: B:72:0x017d A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:7:0x001d  */
    public final Object rlfsiqarku(RateType rateType, rgvfuqvkyq rgvfuqvkyqVar, rgvfuqvkyq rgvfuqvkyqVar2, lg.gxszxtbevo gxszxtbevoVar) {
        ppxfxbqfkf ppxfxbqfkfVar;
        Throwable th2;
        Object objWkgbmnqykc;
        rgvfuqvkyq rgvfuqvkyqVar3;
        rgvfuqvkyq rgvfuqvkyqVar4;
        Throwable thDxjokdxxww;
        Throwable th3;
        Object objWkgbmnqykc2;
        rgvfuqvkyq rgvfuqvkyqVar5;
        rgvfuqvkyq rgvfuqvkyqVar6;
        RateProductItem rateProductItem;
        pmvmpeiblj selectedRate;
        RateProductItem rateProductItemPpxfxbqfkf;
        Throwable thDxjokdxxww2;
        RateType rateType2 = rateType;
        rgvfuqvkyq rgvfuqvkyqVar7 = rgvfuqvkyqVar;
        rgvfuqvkyq rgvfuqvkyqVar8 = rgvfuqvkyqVar2;
        if (gxszxtbevoVar instanceof ppxfxbqfkf) {
            ppxfxbqfkfVar = (ppxfxbqfkf) gxszxtbevoVar;
            int i13 = ppxfxbqfkfVar.f100278esjtqupxsv;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                ppxfxbqfkfVar.f100278esjtqupxsv = i13 - Integer.MIN_VALUE;
            } else {
                ppxfxbqfkfVar = new ppxfxbqfkf(gxszxtbevoVar);
            }
        } else {
            ppxfxbqfkfVar = new ppxfxbqfkf(gxszxtbevoVar);
        }
        Object objZoijcleaow = ppxfxbqfkfVar.f100279iwizpuwonk;
        Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
        switch (ppxfxbqfkfVar.f100278esjtqupxsv) {
            case 0:
                zdlpuopuiu.zoijcleaow(objZoijcleaow);
                if (rateType2 instanceof RateType.List) {
                    try {
                        kcexrzcfyt.iobyxmoadg iobyxmoadgVar = kcexrzcfyt.f37117yggfygwlhe;
                        lm1.zoijcleaow zoijcleaowVar = this.f100267wkgbmnqykc;
                        wwaezpbzkn wwaezpbzknVar = wwaezpbzkn.f37140iobyxmoadg;
                        ppxfxbqfkfVar.f100282zdlpuopuiu = rgvfuqvkyqVar7;
                        ppxfxbqfkfVar.f100281yggfygwlhe = rgvfuqvkyqVar8;
                        ppxfxbqfkfVar.f100278esjtqupxsv = 1;
                        objZoijcleaow = zoijcleaowVar.zoijcleaow(wwaezpbzknVar, ppxfxbqfkfVar);
                        if (objZoijcleaow == objGxszxtbevo) {
                            return objGxszxtbevo;
                        }
                        objWkgbmnqykc = kcexrzcfyt.wkgbmnqykc((RateProductItem) objZoijcleaow);
                        break;
                    } catch (Throwable th4) {
                        th2 = th4;
                        kcexrzcfyt.iobyxmoadg iobyxmoadgVar2 = kcexrzcfyt.f37117yggfygwlhe;
                        objWkgbmnqykc = kcexrzcfyt.wkgbmnqykc(zdlpuopuiu.iobyxmoadg(th2));
                    }
                    rgvfuqvkyq rgvfuqvkyqVar9 = rgvfuqvkyqVar8;
                    rgvfuqvkyqVar3 = rgvfuqvkyqVar7;
                    rgvfuqvkyqVar4 = rgvfuqvkyqVar9;
                    if (kcexrzcfyt.agtfadlqog(objWkgbmnqykc)) {
                        ppxfxbqfkfVar.f100282zdlpuopuiu = rgvfuqvkyqVar4;
                        ppxfxbqfkfVar.f100281yggfygwlhe = objWkgbmnqykc;
                        ppxfxbqfkfVar.f100280jyumaefscl = objWkgbmnqykc;
                        ppxfxbqfkfVar.f100278esjtqupxsv = 2;
                        if (rgvfuqvkyqVar3.invoke(objWkgbmnqykc, ppxfxbqfkfVar) == objGxszxtbevo) {
                            return objGxszxtbevo;
                        }
                    }
                    thDxjokdxxww = kcexrzcfyt.dxjokdxxww(objWkgbmnqykc);
                    if (thDxjokdxxww != null) {
                        ppxfxbqfkfVar.f100282zdlpuopuiu = objWkgbmnqykc;
                        ppxfxbqfkfVar.f100281yggfygwlhe = null;
                        ppxfxbqfkfVar.f100280jyumaefscl = null;
                        ppxfxbqfkfVar.f100278esjtqupxsv = 3;
                        if (rgvfuqvkyqVar4.invoke(thDxjokdxxww, ppxfxbqfkfVar) == objGxszxtbevo) {
                            return objGxszxtbevo;
                        }
                    }
                    return wwaezpbzkn.f37140iobyxmoadg;
                }
                if (!(rateType2 instanceof RateType.Single)) {
                    throw new NoWhenBranchMatchedException();
                }
                try {
                    kcexrzcfyt.iobyxmoadg iobyxmoadgVar3 = kcexrzcfyt.f37117yggfygwlhe;
                    lm1.iobyxmoadg.C1297iobyxmoadg c1297iobyxmoadg = new lm1.iobyxmoadg.C1297iobyxmoadg(((RateType.Single) rateType2).getProductArticle());
                    lm1.iobyxmoadg iobyxmoadgVar4 = this.f100266ppxfxbqfkf;
                    ppxfxbqfkfVar.f100282zdlpuopuiu = rateType2;
                    ppxfxbqfkfVar.f100281yggfygwlhe = rgvfuqvkyqVar7;
                    ppxfxbqfkfVar.f100280jyumaefscl = rgvfuqvkyqVar8;
                    ppxfxbqfkfVar.f100278esjtqupxsv = 4;
                    objZoijcleaow = iobyxmoadgVar4.zoijcleaow(c1297iobyxmoadg, ppxfxbqfkfVar);
                    if (objZoijcleaow == objGxszxtbevo) {
                        return objGxszxtbevo;
                    }
                    rateProductItem = (RateProductItem) objZoijcleaow;
                    selectedRate = ((RateType.Single) rateType2).getSelectedRate();
                    if (selectedRate != null) {
                        rateProductItemPpxfxbqfkf = RateProductItem.ppxfxbqfkf(rateProductItem, null, null, null, RateProductReviewData.ppxfxbqfkf(rateProductItem.getReview(), selectedRate.gxszxtbevo(), null, 2, null), 7, null);
                        if (rateProductItemPpxfxbqfkf == null) {
                            rateProductItem = rateProductItemPpxfxbqfkf;
                        }
                    }
                    objWkgbmnqykc2 = kcexrzcfyt.wkgbmnqykc(rateProductItem);
                    break;
                } catch (Throwable th5) {
                    th3 = th5;
                    kcexrzcfyt.iobyxmoadg iobyxmoadgVar5 = kcexrzcfyt.f37117yggfygwlhe;
                    objWkgbmnqykc2 = kcexrzcfyt.wkgbmnqykc(zdlpuopuiu.iobyxmoadg(th3));
                }
                rgvfuqvkyq rgvfuqvkyqVar10 = rgvfuqvkyqVar8;
                rgvfuqvkyqVar5 = rgvfuqvkyqVar7;
                rgvfuqvkyqVar6 = rgvfuqvkyqVar10;
                if (kcexrzcfyt.agtfadlqog(objWkgbmnqykc2)) {
                    ppxfxbqfkfVar.f100282zdlpuopuiu = rgvfuqvkyqVar6;
                    ppxfxbqfkfVar.f100281yggfygwlhe = objWkgbmnqykc2;
                    ppxfxbqfkfVar.f100280jyumaefscl = objWkgbmnqykc2;
                    ppxfxbqfkfVar.f100278esjtqupxsv = 5;
                    if (rgvfuqvkyqVar5.invoke(objWkgbmnqykc2, ppxfxbqfkfVar) == objGxszxtbevo) {
                        return objGxszxtbevo;
                    }
                }
                thDxjokdxxww2 = kcexrzcfyt.dxjokdxxww(objWkgbmnqykc2);
                if (thDxjokdxxww2 != null) {
                    ppxfxbqfkfVar.f100282zdlpuopuiu = objWkgbmnqykc2;
                    ppxfxbqfkfVar.f100281yggfygwlhe = null;
                    ppxfxbqfkfVar.f100280jyumaefscl = null;
                    ppxfxbqfkfVar.f100278esjtqupxsv = 6;
                    if (rgvfuqvkyqVar6.invoke(thDxjokdxxww2, ppxfxbqfkfVar) == objGxszxtbevo) {
                        return objGxszxtbevo;
                    }
                }
                return wwaezpbzkn.f37140iobyxmoadg;
            case 1:
                rgvfuqvkyq rgvfuqvkyqVar11 = (rgvfuqvkyq) ppxfxbqfkfVar.f100281yggfygwlhe;
                rgvfuqvkyq rgvfuqvkyqVar12 = (rgvfuqvkyq) ppxfxbqfkfVar.f100282zdlpuopuiu;
                try {
                    zdlpuopuiu.zoijcleaow(objZoijcleaow);
                    rgvfuqvkyqVar8 = rgvfuqvkyqVar11;
                    rgvfuqvkyqVar7 = rgvfuqvkyqVar12;
                    objWkgbmnqykc = kcexrzcfyt.wkgbmnqykc((RateProductItem) objZoijcleaow);
                    break;
                } catch (Throwable th6) {
                    th2 = th6;
                    rgvfuqvkyqVar8 = rgvfuqvkyqVar11;
                    rgvfuqvkyqVar7 = rgvfuqvkyqVar12;
                    kcexrzcfyt.iobyxmoadg iobyxmoadgVar6 = kcexrzcfyt.f37117yggfygwlhe;
                    objWkgbmnqykc = kcexrzcfyt.wkgbmnqykc(zdlpuopuiu.iobyxmoadg(th2));
                }
                rgvfuqvkyq rgvfuqvkyqVar13 = rgvfuqvkyqVar8;
                rgvfuqvkyqVar3 = rgvfuqvkyqVar7;
                rgvfuqvkyqVar4 = rgvfuqvkyqVar13;
                if (kcexrzcfyt.agtfadlqog(objWkgbmnqykc)) {
                    ppxfxbqfkfVar.f100282zdlpuopuiu = rgvfuqvkyqVar4;
                    ppxfxbqfkfVar.f100281yggfygwlhe = objWkgbmnqykc;
                    ppxfxbqfkfVar.f100280jyumaefscl = objWkgbmnqykc;
                    ppxfxbqfkfVar.f100278esjtqupxsv = 2;
                    if (rgvfuqvkyqVar3.invoke(objWkgbmnqykc, ppxfxbqfkfVar) == objGxszxtbevo) {
                        return objGxszxtbevo;
                    }
                }
                thDxjokdxxww = kcexrzcfyt.dxjokdxxww(objWkgbmnqykc);
                if (thDxjokdxxww != null) {
                    ppxfxbqfkfVar.f100282zdlpuopuiu = objWkgbmnqykc;
                    ppxfxbqfkfVar.f100281yggfygwlhe = null;
                    ppxfxbqfkfVar.f100280jyumaefscl = null;
                    ppxfxbqfkfVar.f100278esjtqupxsv = 3;
                    if (rgvfuqvkyqVar4.invoke(thDxjokdxxww, ppxfxbqfkfVar) == objGxszxtbevo) {
                        return objGxszxtbevo;
                    }
                }
                return wwaezpbzkn.f37140iobyxmoadg;
            case 2:
                objWkgbmnqykc = ppxfxbqfkfVar.f100281yggfygwlhe;
                rgvfuqvkyqVar4 = (rgvfuqvkyq) ppxfxbqfkfVar.f100282zdlpuopuiu;
                zdlpuopuiu.zoijcleaow(objZoijcleaow);
                thDxjokdxxww = kcexrzcfyt.dxjokdxxww(objWkgbmnqykc);
                if (thDxjokdxxww != null) {
                    ppxfxbqfkfVar.f100282zdlpuopuiu = objWkgbmnqykc;
                    ppxfxbqfkfVar.f100281yggfygwlhe = null;
                    ppxfxbqfkfVar.f100280jyumaefscl = null;
                    ppxfxbqfkfVar.f100278esjtqupxsv = 3;
                    if (rgvfuqvkyqVar4.invoke(thDxjokdxxww, ppxfxbqfkfVar) == objGxszxtbevo) {
                        return objGxszxtbevo;
                    }
                }
                return wwaezpbzkn.f37140iobyxmoadg;
            case 3:
                zdlpuopuiu.zoijcleaow(objZoijcleaow);
                return wwaezpbzkn.f37140iobyxmoadg;
            case 4:
                rgvfuqvkyq rgvfuqvkyqVar14 = (rgvfuqvkyq) ppxfxbqfkfVar.f100280jyumaefscl;
                rgvfuqvkyq rgvfuqvkyqVar15 = (rgvfuqvkyq) ppxfxbqfkfVar.f100281yggfygwlhe;
                rateType2 = (RateType) ppxfxbqfkfVar.f100282zdlpuopuiu;
                try {
                    zdlpuopuiu.zoijcleaow(objZoijcleaow);
                    rgvfuqvkyqVar8 = rgvfuqvkyqVar14;
                    rgvfuqvkyqVar7 = rgvfuqvkyqVar15;
                    rateProductItem = (RateProductItem) objZoijcleaow;
                    selectedRate = ((RateType.Single) rateType2).getSelectedRate();
                    if (selectedRate != null) {
                        rateProductItemPpxfxbqfkf = RateProductItem.ppxfxbqfkf(rateProductItem, null, null, null, RateProductReviewData.ppxfxbqfkf(rateProductItem.getReview(), selectedRate.gxszxtbevo(), null, 2, null), 7, null);
                        if (rateProductItemPpxfxbqfkf == null) {
                            rateProductItem = rateProductItemPpxfxbqfkf;
                        }
                    }
                    objWkgbmnqykc2 = kcexrzcfyt.wkgbmnqykc(rateProductItem);
                    break;
                } catch (Throwable th7) {
                    th3 = th7;
                    rgvfuqvkyqVar8 = rgvfuqvkyqVar14;
                    rgvfuqvkyqVar7 = rgvfuqvkyqVar15;
                    kcexrzcfyt.iobyxmoadg iobyxmoadgVar7 = kcexrzcfyt.f37117yggfygwlhe;
                    objWkgbmnqykc2 = kcexrzcfyt.wkgbmnqykc(zdlpuopuiu.iobyxmoadg(th3));
                }
                rgvfuqvkyq rgvfuqvkyqVar16 = rgvfuqvkyqVar8;
                rgvfuqvkyqVar5 = rgvfuqvkyqVar7;
                rgvfuqvkyqVar6 = rgvfuqvkyqVar16;
                if (kcexrzcfyt.agtfadlqog(objWkgbmnqykc2)) {
                    ppxfxbqfkfVar.f100282zdlpuopuiu = rgvfuqvkyqVar6;
                    ppxfxbqfkfVar.f100281yggfygwlhe = objWkgbmnqykc2;
                    ppxfxbqfkfVar.f100280jyumaefscl = objWkgbmnqykc2;
                    ppxfxbqfkfVar.f100278esjtqupxsv = 5;
                    if (rgvfuqvkyqVar5.invoke(objWkgbmnqykc2, ppxfxbqfkfVar) == objGxszxtbevo) {
                        return objGxszxtbevo;
                    }
                }
                thDxjokdxxww2 = kcexrzcfyt.dxjokdxxww(objWkgbmnqykc2);
                if (thDxjokdxxww2 != null) {
                    ppxfxbqfkfVar.f100282zdlpuopuiu = objWkgbmnqykc2;
                    ppxfxbqfkfVar.f100281yggfygwlhe = null;
                    ppxfxbqfkfVar.f100280jyumaefscl = null;
                    ppxfxbqfkfVar.f100278esjtqupxsv = 6;
                    if (rgvfuqvkyqVar6.invoke(thDxjokdxxww2, ppxfxbqfkfVar) == objGxszxtbevo) {
                        return objGxszxtbevo;
                    }
                }
                return wwaezpbzkn.f37140iobyxmoadg;
            case 5:
                objWkgbmnqykc2 = ppxfxbqfkfVar.f100281yggfygwlhe;
                rgvfuqvkyqVar6 = (rgvfuqvkyq) ppxfxbqfkfVar.f100282zdlpuopuiu;
                zdlpuopuiu.zoijcleaow(objZoijcleaow);
                thDxjokdxxww2 = kcexrzcfyt.dxjokdxxww(objWkgbmnqykc2);
                if (thDxjokdxxww2 != null) {
                    ppxfxbqfkfVar.f100282zdlpuopuiu = objWkgbmnqykc2;
                    ppxfxbqfkfVar.f100281yggfygwlhe = null;
                    ppxfxbqfkfVar.f100280jyumaefscl = null;
                    ppxfxbqfkfVar.f100278esjtqupxsv = 6;
                    if (rgvfuqvkyqVar6.invoke(thDxjokdxxww2, ppxfxbqfkfVar) == objGxszxtbevo) {
                        return objGxszxtbevo;
                    }
                }
                return wwaezpbzkn.f37140iobyxmoadg;
            case 6:
                zdlpuopuiu.zoijcleaow(objZoijcleaow);
                return wwaezpbzkn.f37140iobyxmoadg;
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    static /* synthetic */ void uwvvkdfqfp(iobyxmoadg iobyxmoadgVar, dm1.iobyxmoadg.EnumC0582iobyxmoadg enumC0582iobyxmoadg, String str, int i13, Object obj) {
        if ((i13 & 2) != 0) {
            str = null;
        }
        iobyxmoadgVar.czzsidtyhn(enumC0582iobyxmoadg, str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object ydmasvzmpa(lm1.ppxfxbqfkf.iobyxmoadg iobyxmoadgVar, lg.gxszxtbevo gxszxtbevoVar) {
        wkgbmnqykc wkgbmnqykcVar;
        iobyxmoadg iobyxmoadgVar2;
        String strIobyxmoadg;
        lm1.ppxfxbqfkf.zoijcleaow zoijcleaowVar;
        iobyxmoadg iobyxmoadgVar3;
        lm1.ppxfxbqfkf.zoijcleaow zoijcleaowVar2;
        iobyxmoadg iobyxmoadgVar4;
        if (gxszxtbevoVar instanceof wkgbmnqykc) {
            wkgbmnqykcVar = (wkgbmnqykc) gxszxtbevoVar;
            int i13 = wkgbmnqykcVar.f100284esjtqupxsv;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                wkgbmnqykcVar.f100284esjtqupxsv = i13 - Integer.MIN_VALUE;
            } else {
                wkgbmnqykcVar = new wkgbmnqykc(gxszxtbevoVar);
            }
        } else {
            wkgbmnqykcVar = new wkgbmnqykc(gxszxtbevoVar);
        }
        Object objZoijcleaow = wkgbmnqykcVar.f100285iwizpuwonk;
        Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
        int i14 = wkgbmnqykcVar.f100284esjtqupxsv;
        if (i14 == 0) {
            zdlpuopuiu.zoijcleaow(objZoijcleaow);
            ulzqkzuiru(gxszxtbevo.btonecajqb.f100252iobyxmoadg);
            yfnezrywwk(iobyxmoadgVar.zoijcleaow());
            lm1.ppxfxbqfkf ppxfxbqfkfVar = this.f100263eablkybsjg;
            wkgbmnqykcVar.f100288zdlpuopuiu = this;
            wkgbmnqykcVar.f100287yggfygwlhe = iobyxmoadgVar;
            wkgbmnqykcVar.f100284esjtqupxsv = 1;
            objZoijcleaow = ppxfxbqfkfVar.zoijcleaow(iobyxmoadgVar, wkgbmnqykcVar);
            if (objZoijcleaow == objGxszxtbevo) {
                return objGxszxtbevo;
            }
            iobyxmoadgVar2 = this;
        } else {
            if (i14 != 1) {
                if (i14 == 2) {
                    zoijcleaowVar2 = (lm1.ppxfxbqfkf.zoijcleaow) wkgbmnqykcVar.f100287yggfygwlhe;
                    iobyxmoadgVar4 = (iobyxmoadg) wkgbmnqykcVar.f100288zdlpuopuiu;
                    zdlpuopuiu.zoijcleaow(objZoijcleaow);
                    uwvvkdfqfp(iobyxmoadgVar4, dm1.iobyxmoadg.EnumC0582iobyxmoadg.REVIEW_COMPLETED, null, 2, null);
                    iobyxmoadgVar4.ulzqkzuiru(new gxszxtbevo.gtknphoqwx(((lm1.ppxfxbqfkf.zoijcleaow.iobyxmoadg) zoijcleaowVar2).iobyxmoadg()));
                    iobyxmoadgVar4.crxdokpmqz(eablkybsjg.zoijcleaow.f100251iobyxmoadg);
                    return wwaezpbzkn.f37140iobyxmoadg;
                }
                if (i14 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                strIobyxmoadg = (String) wkgbmnqykcVar.f100286jyumaefscl;
                zoijcleaowVar = (lm1.ppxfxbqfkf.zoijcleaow) wkgbmnqykcVar.f100287yggfygwlhe;
                iobyxmoadgVar3 = (iobyxmoadg) wkgbmnqykcVar.f100288zdlpuopuiu;
                zdlpuopuiu.zoijcleaow(objZoijcleaow);
                iobyxmoadgVar3.czzsidtyhn(dm1.iobyxmoadg.EnumC0582iobyxmoadg.ITEM_REVIEW, strIobyxmoadg);
                iobyxmoadgVar3.ulzqkzuiru(new gxszxtbevo.C2405gxszxtbevo(((lm1.ppxfxbqfkf.zoijcleaow.C1299ppxfxbqfkf) zoijcleaowVar).iobyxmoadg()));
                return wwaezpbzkn.f37140iobyxmoadg;
            }
            iobyxmoadgVar = (lm1.ppxfxbqfkf.iobyxmoadg) wkgbmnqykcVar.f100287yggfygwlhe;
            iobyxmoadgVar2 = (iobyxmoadg) wkgbmnqykcVar.f100288zdlpuopuiu;
            zdlpuopuiu.zoijcleaow(objZoijcleaow);
        }
        lm1.ppxfxbqfkf.zoijcleaow zoijcleaowVar3 = (lm1.ppxfxbqfkf.zoijcleaow) objZoijcleaow;
        if (zoijcleaowVar3 instanceof lm1.ppxfxbqfkf.zoijcleaow.iobyxmoadg) {
            String strIobyxmoadg2 = iobyxmoadgVar.zoijcleaow().iobyxmoadg();
            pm1.iobyxmoadg iobyxmoadgVar5 = iobyxmoadgVar2.f100264gxszxtbevo;
            wkgbmnqykcVar.f100288zdlpuopuiu = iobyxmoadgVar2;
            wkgbmnqykcVar.f100287yggfygwlhe = zoijcleaowVar3;
            wkgbmnqykcVar.f100284esjtqupxsv = 2;
            if (iobyxmoadgVar5.btonecajqb(strIobyxmoadg2, wkgbmnqykcVar) == objGxszxtbevo) {
                return objGxszxtbevo;
            }
            zoijcleaowVar2 = zoijcleaowVar3;
            iobyxmoadgVar4 = iobyxmoadgVar2;
            uwvvkdfqfp(iobyxmoadgVar4, dm1.iobyxmoadg.EnumC0582iobyxmoadg.REVIEW_COMPLETED, null, 2, null);
            iobyxmoadgVar4.ulzqkzuiru(new gxszxtbevo.gtknphoqwx(((lm1.ppxfxbqfkf.zoijcleaow.iobyxmoadg) zoijcleaowVar2).iobyxmoadg()));
            iobyxmoadgVar4.crxdokpmqz(eablkybsjg.zoijcleaow.f100251iobyxmoadg);
        } else if (zoijcleaowVar3 instanceof lm1.ppxfxbqfkf.zoijcleaow.C1299ppxfxbqfkf) {
            strIobyxmoadg = iobyxmoadgVar.zoijcleaow().iobyxmoadg();
            pm1.iobyxmoadg iobyxmoadgVar6 = iobyxmoadgVar2.f100264gxszxtbevo;
            wkgbmnqykcVar.f100288zdlpuopuiu = iobyxmoadgVar2;
            wkgbmnqykcVar.f100287yggfygwlhe = zoijcleaowVar3;
            wkgbmnqykcVar.f100286jyumaefscl = strIobyxmoadg;
            wkgbmnqykcVar.f100284esjtqupxsv = 3;
            if (iobyxmoadgVar6.btonecajqb(strIobyxmoadg, wkgbmnqykcVar) == objGxszxtbevo) {
                return objGxszxtbevo;
            }
            zoijcleaowVar = zoijcleaowVar3;
            iobyxmoadgVar3 = iobyxmoadgVar2;
            iobyxmoadgVar3.czzsidtyhn(dm1.iobyxmoadg.EnumC0582iobyxmoadg.ITEM_REVIEW, strIobyxmoadg);
            iobyxmoadgVar3.ulzqkzuiru(new gxszxtbevo.C2405gxszxtbevo(((lm1.ppxfxbqfkf.zoijcleaow.C1299ppxfxbqfkf) zoijcleaowVar).iobyxmoadg()));
        } else {
            if (!(zoijcleaowVar3 instanceof lm1.ppxfxbqfkf.zoijcleaow.InterfaceC1300zoijcleaow)) {
                throw new NoWhenBranchMatchedException();
            }
            if (zoijcleaowVar3 instanceof lm1.ppxfxbqfkf.zoijcleaow.InterfaceC1300zoijcleaow.C1301ppxfxbqfkf) {
                uwvvkdfqfp(iobyxmoadgVar2, dm1.iobyxmoadg.EnumC0582iobyxmoadg.UNKNOWN_NEXT_ITEM, null, 2, null);
            } else {
                iobyxmoadgVar2.czzsidtyhn(dm1.iobyxmoadg.EnumC0582iobyxmoadg.REVIEW_ERROR, iobyxmoadgVar.zoijcleaow().iobyxmoadg());
            }
            lm1.ppxfxbqfkf.zoijcleaow.InterfaceC1300zoijcleaow interfaceC1300zoijcleaow = (lm1.ppxfxbqfkf.zoijcleaow.InterfaceC1300zoijcleaow) zoijcleaowVar3;
            if (interfaceC1300zoijcleaow instanceof lm1.ppxfxbqfkf.zoijcleaow.InterfaceC1300zoijcleaow.C1301ppxfxbqfkf) {
                iobyxmoadgVar2.ulzqkzuiru(new gxszxtbevo.zoijcleaow(((lm1.ppxfxbqfkf.zoijcleaow.InterfaceC1300zoijcleaow.C1301ppxfxbqfkf) zoijcleaowVar3).iobyxmoadg()));
            } else if (interfaceC1300zoijcleaow instanceof lm1.ppxfxbqfkf.zoijcleaow.InterfaceC1300zoijcleaow.wkgbmnqykc) {
                iobyxmoadgVar2.ulzqkzuiru(new gxszxtbevo.eablkybsjg(((lm1.ppxfxbqfkf.zoijcleaow.InterfaceC1300zoijcleaow.wkgbmnqykc) zoijcleaowVar3).iobyxmoadg()));
            } else if (interfaceC1300zoijcleaow instanceof lm1.ppxfxbqfkf.zoijcleaow.InterfaceC1300zoijcleaow.iobyxmoadg) {
                iobyxmoadgVar2.ulzqkzuiru(new gxszxtbevo.eablkybsjg(((lm1.ppxfxbqfkf.zoijcleaow.InterfaceC1300zoijcleaow.iobyxmoadg) zoijcleaowVar3).iobyxmoadg()));
            } else {
                if (!kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(interfaceC1300zoijcleaow, lm1.ppxfxbqfkf.zoijcleaow.InterfaceC1300zoijcleaow.C1302zoijcleaow.f63627iobyxmoadg) && !kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(interfaceC1300zoijcleaow, lm1.ppxfxbqfkf.zoijcleaow.InterfaceC1300zoijcleaow.eablkybsjg.f63623iobyxmoadg)) {
                    throw new NoWhenBranchMatchedException();
                }
                iobyxmoadgVar2.ulzqkzuiru(new gxszxtbevo.eablkybsjg(null));
            }
        }
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    private final void yfnezrywwk(jm1.zoijcleaow zoijcleaowVar) {
        this.f100265lqeggnwhkg.wkgbmnqykc(new dm1.zoijcleaow(zoijcleaowVar.iobyxmoadg(), zoijcleaowVar.zoijcleaow().getRating(), zoijcleaowVar.zoijcleaow().getComment(), null));
    }

    @Override // a8.zoijcleaow
    /* JADX INFO: renamed from: metgxyhuhe, reason: merged with bridge method [inline-methods] */
    public void zynmafqrjb(ru.myspar.proloyalty.rate.rate_product.impl.domain.store.wkgbmnqykc intent) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(intent, "intent");
        gtknphoqwx.wkgbmnqykc(sopmlzcsov(), null, null, new zoijcleaow(intent, this, null), 3, null);
    }

    @Override // e8.iobyxmoadg, a8.zoijcleaow
    /* JADX INFO: renamed from: xrmfcynszj, reason: merged with bridge method [inline-methods] */
    public void pmvmpeiblj(ru.myspar.proloyalty.rate.rate_product.impl.domain.store.ppxfxbqfkf action) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(action, "action");
        gtknphoqwx.wkgbmnqykc(sopmlzcsov(), null, null, new C2406iobyxmoadg(action, this, null), 3, null);
    }
}
