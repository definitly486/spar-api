package b80;

import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import gg.kcexrzcfyt;
import gg.wwaezpbzkn;
import gg.zdlpuopuiu;
import hg.jyumaefscl;
import java.util.ArrayList;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.jvm.internal.draadjrbmk;
import kotlin.jvm.internal.gtknphoqwx;
import pj.auzgnhcxok;
import pj.cllcsxoeiz;
import pj.dsvhmnatus;
import pm.dxjokdxxww;
import ru.myspar.core.models.paging.Paging;
import ru.myspar.domain.feature.review.store.State;
import ru.myspar.rate.review.api.model.ReviewItem;
import ru.myspar.rate.review.api.model.Reviews;
import tg.rgvfuqvkyq;

/* JADX INFO: loaded from: classes4.dex */
public final class zoijcleaow extends e8.iobyxmoadg {

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private final y02.iobyxmoadg f15495eablkybsjg;

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    private final ns.iobyxmoadg f15496gxszxtbevo;

    /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
    private auzgnhcxok f15497lqeggnwhkg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final b12.zoijcleaow f15498ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final c20.eablkybsjg f15499wkgbmnqykc;

    /* JADX INFO: renamed from: nufgyqmvbu, reason: collision with root package name */
    public static final iobyxmoadg f15494nufgyqmvbu = new iobyxmoadg(null);

    /* JADX INFO: renamed from: dxjokdxxww, reason: collision with root package name */
    public static final int f15492dxjokdxxww = 8;

    /* JADX INFO: renamed from: btonecajqb, reason: collision with root package name */
    private static final int f15491btonecajqb = dxjokdxxww.reviews_answer_default_title;

    /* JADX INFO: renamed from: gtknphoqwx, reason: collision with root package name */
    private static final int f15493gtknphoqwx = dxjokdxxww.reviews_answer_short_title;

    static final class eablkybsjg extends draadjrbmk implements rgvfuqvkyq {

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        /* synthetic */ Object f15501yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        int f15502zdlpuopuiu;

        eablkybsjg(lg.gxszxtbevo gxszxtbevoVar) {
            super(2, gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
            eablkybsjg eablkybsjgVar = zoijcleaow.this.new eablkybsjg(gxszxtbevoVar);
            eablkybsjgVar.f15501yggfygwlhe = obj;
            return eablkybsjgVar;
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            mg.zoijcleaow.gxszxtbevo();
            if (this.f15502zdlpuopuiu != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            zdlpuopuiu.zoijcleaow(obj);
            zoijcleaow.weqkydbzbr(zoijcleaow.this, ((y02.iobyxmoadg.C3119iobyxmoadg) this.f15501yggfygwlhe).iobyxmoadg(), 0, 2, null);
            return wwaezpbzkn.f37140iobyxmoadg;
        }

        @Override // tg.rgvfuqvkyq
        /* JADX INFO: renamed from: ojitshcjhn, reason: merged with bridge method [inline-methods] */
        public final Object invoke(y02.iobyxmoadg.C3119iobyxmoadg c3119iobyxmoadg, lg.gxszxtbevo gxszxtbevoVar) {
            return ((eablkybsjg) create(c3119iobyxmoadg, gxszxtbevoVar)).invokeSuspend(wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    public static final class iobyxmoadg {
        public /* synthetic */ iobyxmoadg(gtknphoqwx gtknphoqwxVar) {
            this();
        }

        private iobyxmoadg() {
        }
    }

    static final class ppxfxbqfkf extends draadjrbmk implements rgvfuqvkyq {

        /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
        final /* synthetic */ String f15503iwizpuwonk;

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        final /* synthetic */ int f15504jyumaefscl;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        int f15506zdlpuopuiu;

        static final class iobyxmoadg extends draadjrbmk implements rgvfuqvkyq {

            /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
            final /* synthetic */ int f15507cqumvgiudr;

            /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
            final /* synthetic */ String f15508iwizpuwonk;

            /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
            final /* synthetic */ zoijcleaow f15509jyumaefscl;

            /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
            private /* synthetic */ Object f15510yggfygwlhe;

            /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
            int f15511zdlpuopuiu;

            /* JADX INFO: renamed from: b80.zoijcleaow$ppxfxbqfkf$iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
            static final class C0263iobyxmoadg extends draadjrbmk implements rgvfuqvkyq {

                /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
                final /* synthetic */ int f15512iwizpuwonk;

                /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
                final /* synthetic */ String f15513jyumaefscl;

                /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
                final /* synthetic */ zoijcleaow f15514yggfygwlhe;

                /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
                int f15515zdlpuopuiu;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C0263iobyxmoadg(zoijcleaow zoijcleaowVar, String str, int i13, lg.gxszxtbevo gxszxtbevoVar) {
                    super(2, gxszxtbevoVar);
                    this.f15514yggfygwlhe = zoijcleaowVar;
                    this.f15513jyumaefscl = str;
                    this.f15512iwizpuwonk = i13;
                }

                @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
                public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
                    return new C0263iobyxmoadg(this.f15514yggfygwlhe, this.f15513jyumaefscl, this.f15512iwizpuwonk, gxszxtbevoVar);
                }

                @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
                public final Object invokeSuspend(Object obj) {
                    Object objWkgbmnqykc;
                    Object objZoijcleaow;
                    Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
                    int i13 = this.f15515zdlpuopuiu;
                    try {
                        if (i13 == 0) {
                            zdlpuopuiu.zoijcleaow(obj);
                            zoijcleaow zoijcleaowVar = this.f15514yggfygwlhe;
                            String str = this.f15513jyumaefscl;
                            int i14 = this.f15512iwizpuwonk;
                            kcexrzcfyt.iobyxmoadg iobyxmoadgVar = kcexrzcfyt.f37117yggfygwlhe;
                            b12.zoijcleaow zoijcleaowVar2 = zoijcleaowVar.f15498ppxfxbqfkf;
                            b12.zoijcleaow.iobyxmoadg iobyxmoadgVar2 = new b12.zoijcleaow.iobyxmoadg(str, i14);
                            this.f15515zdlpuopuiu = 1;
                            objZoijcleaow = zoijcleaowVar2.zoijcleaow(iobyxmoadgVar2, this);
                            if (objZoijcleaow == objGxszxtbevo) {
                                return objGxszxtbevo;
                            }
                        } else {
                            if (i13 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            zdlpuopuiu.zoijcleaow(obj);
                            objZoijcleaow = obj;
                        }
                        objWkgbmnqykc = kcexrzcfyt.wkgbmnqykc((Reviews) objZoijcleaow);
                    } catch (Throwable th2) {
                        kcexrzcfyt.iobyxmoadg iobyxmoadgVar3 = kcexrzcfyt.f37117yggfygwlhe;
                        objWkgbmnqykc = kcexrzcfyt.wkgbmnqykc(zdlpuopuiu.iobyxmoadg(th2));
                    }
                    int i15 = this.f15512iwizpuwonk;
                    zoijcleaow zoijcleaowVar3 = this.f15514yggfygwlhe;
                    if (kcexrzcfyt.agtfadlqog(objWkgbmnqykc)) {
                        Reviews reviewsPpxfxbqfkf = (Reviews) objWkgbmnqykc;
                        if (i15 != 1) {
                            reviewsPpxfxbqfkf = Reviews.ppxfxbqfkf(reviewsPpxfxbqfkf, null, null, jyumaefscl.ixidwrxhsl(zoijcleaow.yfnezrywwk(zoijcleaowVar3).getItems(), reviewsPpxfxbqfkf.getItems()), null, 11, null);
                        }
                        Reviews reviews = reviewsPpxfxbqfkf;
                        List<ReviewItem> items = reviews.getItems();
                        ArrayList arrayList = new ArrayList(jyumaefscl.cqumvgiudr(items, 10));
                        for (ReviewItem reviewItem : items) {
                            arrayList.add(reviewItem.zoijcleaow((1535 & 1) != 0 ? reviewItem.id : null, (1535 & 2) != 0 ? reviewItem.date : null, (1535 & 4) != 0 ? reviewItem.user : null, (1535 & 8) != 0 ? reviewItem.rating : 0, (1535 & 16) != 0 ? reviewItem.comment : null, (1535 & 32) != 0 ? reviewItem.answer : null, (1535 & 64) != 0 ? reviewItem.isCollapsed : false, (1535 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? reviewItem.fromDegrees : 0.0f, (1535 & UserVerificationMethods.USER_VERIFY_HANDPRINT) != 0 ? reviewItem.toDegrees : 0.0f, (1535 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? reviewItem.answerTitleRes : kotlin.coroutines.jvm.internal.zoijcleaow.wkgbmnqykc(zoijcleaowVar3.zfvoamnweg(!reviewItem.getIsCollapsed())), (1535 & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? reviewItem.isNeedToAnimate : false));
                        }
                        zoijcleaowVar3.ulzqkzuiru(new lqeggnwhkg.ppxfxbqfkf(Reviews.ppxfxbqfkf(reviews, null, null, arrayList, null, 11, null), i15, i15 == 1, ((Boolean) zoijcleaowVar3.f15499wkgbmnqykc.zoijcleaow(wwaezpbzkn.f37140iobyxmoadg)).booleanValue()));
                    }
                    Throwable thDxjokdxxww = kcexrzcfyt.dxjokdxxww(objWkgbmnqykc);
                    if (thDxjokdxxww != null) {
                        zoijcleaowVar3.roivzttewh(thDxjokdxxww);
                    }
                    return wwaezpbzkn.f37140iobyxmoadg;
                }

                @Override // tg.rgvfuqvkyq
                public final Object invoke(cllcsxoeiz cllcsxoeizVar, lg.gxszxtbevo gxszxtbevoVar) {
                    return ((C0263iobyxmoadg) create(cllcsxoeizVar, gxszxtbevoVar)).invokeSuspend(wwaezpbzkn.f37140iobyxmoadg);
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            iobyxmoadg(zoijcleaow zoijcleaowVar, String str, int i13, lg.gxszxtbevo gxszxtbevoVar) {
                super(2, gxszxtbevoVar);
                this.f15509jyumaefscl = zoijcleaowVar;
                this.f15508iwizpuwonk = str;
                this.f15507cqumvgiudr = i13;
            }

            @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
            public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
                iobyxmoadg iobyxmoadgVar = new iobyxmoadg(this.f15509jyumaefscl, this.f15508iwizpuwonk, this.f15507cqumvgiudr, gxszxtbevoVar);
                iobyxmoadgVar.f15510yggfygwlhe = obj;
                return iobyxmoadgVar;
            }

            @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
            public final Object invokeSuspend(Object obj) {
                mg.zoijcleaow.gxszxtbevo();
                if (this.f15511zdlpuopuiu != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                zdlpuopuiu.zoijcleaow(obj);
                cllcsxoeiz cllcsxoeizVar = (cllcsxoeiz) this.f15510yggfygwlhe;
                auzgnhcxok auzgnhcxokVar = this.f15509jyumaefscl.f15497lqeggnwhkg;
                if (auzgnhcxokVar != null) {
                    auzgnhcxok.iobyxmoadg.iobyxmoadg(auzgnhcxokVar, null, 1, null);
                }
                zoijcleaow zoijcleaowVar = this.f15509jyumaefscl;
                zoijcleaowVar.f15497lqeggnwhkg = pj.gtknphoqwx.wkgbmnqykc(cllcsxoeizVar, null, null, new C0263iobyxmoadg(zoijcleaowVar, this.f15508iwizpuwonk, this.f15507cqumvgiudr, null), 3, null);
                return wwaezpbzkn.f37140iobyxmoadg;
            }

            @Override // tg.rgvfuqvkyq
            public final Object invoke(cllcsxoeiz cllcsxoeizVar, lg.gxszxtbevo gxszxtbevoVar) {
                return ((iobyxmoadg) create(cllcsxoeizVar, gxszxtbevoVar)).invokeSuspend(wwaezpbzkn.f37140iobyxmoadg);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        ppxfxbqfkf(int i13, String str, lg.gxszxtbevo gxszxtbevoVar) {
            super(2, gxszxtbevoVar);
            this.f15504jyumaefscl = i13;
            this.f15503iwizpuwonk = str;
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
            return zoijcleaow.this.new ppxfxbqfkf(this.f15504jyumaefscl, this.f15503iwizpuwonk, gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
            int i13 = this.f15506zdlpuopuiu;
            if (i13 == 0) {
                zdlpuopuiu.zoijcleaow(obj);
                zoijcleaow.this.ulzqkzuiru(new lqeggnwhkg.zoijcleaow(true, this.f15504jyumaefscl == 1));
                iobyxmoadg iobyxmoadgVar = new iobyxmoadg(zoijcleaow.this, this.f15503iwizpuwonk, this.f15504jyumaefscl, null);
                this.f15506zdlpuopuiu = 1;
                if (dsvhmnatus.gxszxtbevo(iobyxmoadgVar, this) == objGxszxtbevo) {
                    return objGxszxtbevo;
                }
            } else {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                zdlpuopuiu.zoijcleaow(obj);
            }
            zoijcleaow.this.ulzqkzuiru(new lqeggnwhkg.zoijcleaow(false, false, 2, null));
            return wwaezpbzkn.f37140iobyxmoadg;
        }

        @Override // tg.rgvfuqvkyq
        public final Object invoke(cllcsxoeiz cllcsxoeizVar, lg.gxszxtbevo gxszxtbevoVar) {
            return ((ppxfxbqfkf) create(cllcsxoeizVar, gxszxtbevoVar)).invokeSuspend(wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    public static final class wkgbmnqykc implements sj.lqeggnwhkg {

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        final /* synthetic */ zoijcleaow f15516yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final /* synthetic */ sj.lqeggnwhkg f15517zdlpuopuiu;

        public static final class iobyxmoadg implements sj.nufgyqmvbu {

            /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
            final /* synthetic */ zoijcleaow f15518yggfygwlhe;

            /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
            final /* synthetic */ sj.nufgyqmvbu f15519zdlpuopuiu;

            /* JADX INFO: renamed from: b80.zoijcleaow$wkgbmnqykc$iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
            public static final class C0264iobyxmoadg extends kotlin.coroutines.jvm.internal.wkgbmnqykc {

                /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
                int f15521yggfygwlhe;

                /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
                /* synthetic */ Object f15522zdlpuopuiu;

                public C0264iobyxmoadg(lg.gxszxtbevo gxszxtbevoVar) {
                    super(gxszxtbevoVar);
                }

                @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
                public final Object invokeSuspend(Object obj) {
                    this.f15522zdlpuopuiu = obj;
                    this.f15521yggfygwlhe |= Integer.MIN_VALUE;
                    return iobyxmoadg.this.emit(null, this);
                }
            }

            public iobyxmoadg(sj.nufgyqmvbu nufgyqmvbuVar, zoijcleaow zoijcleaowVar) {
                this.f15519zdlpuopuiu = nufgyqmvbuVar;
                this.f15518yggfygwlhe = zoijcleaowVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // sj.nufgyqmvbu
            public final Object emit(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
                C0264iobyxmoadg c0264iobyxmoadg;
                if (gxszxtbevoVar instanceof C0264iobyxmoadg) {
                    c0264iobyxmoadg = (C0264iobyxmoadg) gxszxtbevoVar;
                    int i13 = c0264iobyxmoadg.f15521yggfygwlhe;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        c0264iobyxmoadg.f15521yggfygwlhe = i13 - Integer.MIN_VALUE;
                    } else {
                        c0264iobyxmoadg = new C0264iobyxmoadg(gxszxtbevoVar);
                    }
                } else {
                    c0264iobyxmoadg = new C0264iobyxmoadg(gxszxtbevoVar);
                }
                Object obj2 = c0264iobyxmoadg.f15522zdlpuopuiu;
                Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
                int i14 = c0264iobyxmoadg.f15521yggfygwlhe;
                if (i14 == 0) {
                    zdlpuopuiu.zoijcleaow(obj2);
                    sj.nufgyqmvbu nufgyqmvbuVar = this.f15519zdlpuopuiu;
                    if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(zoijcleaow.yfnezrywwk(this.f15518yggfygwlhe).getProductArticle(), ((y02.iobyxmoadg.C3119iobyxmoadg) obj).iobyxmoadg())) {
                        c0264iobyxmoadg.f15521yggfygwlhe = 1;
                        if (nufgyqmvbuVar.emit(obj, c0264iobyxmoadg) == objGxszxtbevo) {
                            return objGxszxtbevo;
                        }
                    }
                } else {
                    if (i14 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    zdlpuopuiu.zoijcleaow(obj2);
                }
                return wwaezpbzkn.f37140iobyxmoadg;
            }
        }

        public wkgbmnqykc(sj.lqeggnwhkg lqeggnwhkgVar, zoijcleaow zoijcleaowVar) {
            this.f15517zdlpuopuiu = lqeggnwhkgVar;
            this.f15516yggfygwlhe = zoijcleaowVar;
        }

        @Override // sj.lqeggnwhkg
        public Object collect(sj.nufgyqmvbu nufgyqmvbuVar, lg.gxszxtbevo gxszxtbevoVar) {
            Object objCollect = this.f15517zdlpuopuiu.collect(new iobyxmoadg(nufgyqmvbuVar, this.f15516yggfygwlhe), gxszxtbevoVar);
            return objCollect == mg.zoijcleaow.gxszxtbevo() ? objCollect : wwaezpbzkn.f37140iobyxmoadg;
        }
    }

    /* JADX INFO: renamed from: b80.zoijcleaow$zoijcleaow, reason: collision with other inner class name */
    static final class C0265zoijcleaow extends draadjrbmk implements rgvfuqvkyq {

        /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
        final /* synthetic */ int f15523iwizpuwonk;

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        final /* synthetic */ State f15524jyumaefscl;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        int f15526zdlpuopuiu;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C0265zoijcleaow(State state, int i13, lg.gxszxtbevo gxszxtbevoVar) {
            super(2, gxszxtbevoVar);
            this.f15524jyumaefscl = state;
            this.f15523iwizpuwonk = i13;
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
            return zoijcleaow.this.new C0265zoijcleaow(this.f15524jyumaefscl, this.f15523iwizpuwonk, gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            mg.zoijcleaow.gxszxtbevo();
            if (this.f15526zdlpuopuiu != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            zdlpuopuiu.zoijcleaow(obj);
            if (!zoijcleaow.this.bfopjjpdmp(this.f15524jyumaefscl.getPaging(), this.f15524jyumaefscl.getCurrentPage()) && !zoijcleaow.this.oipsdeybqn() && zoijcleaow.this.lrnfpwlwnk(this.f15524jyumaefscl.getPaging(), this.f15523iwizpuwonk, this.f15524jyumaefscl.getItems().size())) {
                zoijcleaow.this.iyctptxqzt(this.f15524jyumaefscl.getProductArticle(), this.f15524jyumaefscl.getCurrentPage() + 1);
            }
            return wwaezpbzkn.f37140iobyxmoadg;
        }

        @Override // tg.rgvfuqvkyq
        public final Object invoke(cllcsxoeiz cllcsxoeizVar, lg.gxszxtbevo gxszxtbevoVar) {
            return ((C0265zoijcleaow) create(cllcsxoeizVar, gxszxtbevoVar)).invokeSuspend(wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zoijcleaow(b12.zoijcleaow getReviewsUseCase, c20.eablkybsjg isLoggedInUseCase, y02.iobyxmoadg changeProductReviewObserver, ns.iobyxmoadg dispatchersProvider) {
        super(dispatchersProvider.iobyxmoadg());
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(getReviewsUseCase, "getReviewsUseCase");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(isLoggedInUseCase, "isLoggedInUseCase");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(changeProductReviewObserver, "changeProductReviewObserver");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(dispatchersProvider, "dispatchersProvider");
        this.f15498ppxfxbqfkf = getReviewsUseCase;
        this.f15499wkgbmnqykc = isLoggedInUseCase;
        this.f15495eablkybsjg = changeProductReviewObserver;
        this.f15496gxszxtbevo = dispatchersProvider;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean bfopjjpdmp(Paging paging, int i13) {
        return i13 == paging.getPagesCount();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final auzgnhcxok iyctptxqzt(String str, int i13) {
        return pj.gtknphoqwx.wkgbmnqykc(sopmlzcsov(), null, null, new ppxfxbqfkf(i13, str, null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean lrnfpwlwnk(Paging paging, int i13, int i14) {
        return i13 >= i14 - (paging.getItemsOnPageCount() / 3);
    }

    private final void nuxfzjnpeb() {
        State state = (State) jlmebxxoox();
        if (((Boolean) this.f15499wkgbmnqykc.zoijcleaow(wwaezpbzkn.f37140iobyxmoadg)).booleanValue()) {
            crxdokpmqz(new gxszxtbevo.wkgbmnqykc(state.getProductArticle(), state.getProductName()));
        } else {
            ulzqkzuiru(new lqeggnwhkg.zoijcleaow(false, state.getCurrentPage() == 1));
            crxdokpmqz(gxszxtbevo.zoijcleaow.f15479iobyxmoadg);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean oipsdeybqn() {
        auzgnhcxok auzgnhcxokVar = this.f15497lqeggnwhkg;
        return (auzgnhcxokVar == null || auzgnhcxokVar.agtfadlqog()) ? false : true;
    }

    private final auzgnhcxok opjhrmiecq(State state, int i13) {
        return pj.gtknphoqwx.wkgbmnqykc(sopmlzcsov(), null, null, new C0265zoijcleaow(state, i13, null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void roivzttewh(Throwable th2) {
        ulzqkzuiru(new lqeggnwhkg.zoijcleaow(false, false, 2, null));
        crxdokpmqz(new gxszxtbevo.ppxfxbqfkf(th2));
    }

    private final void tbqsvytpvh(String str) {
        List<ReviewItem> items = ((State) jlmebxxoox()).getItems();
        ArrayList arrayList = new ArrayList(jyumaefscl.cqumvgiudr(items, 10));
        for (ReviewItem reviewItemZoijcleaow : items) {
            if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(reviewItemZoijcleaow.getId(), str)) {
                boolean isCollapsed = reviewItemZoijcleaow.getIsCollapsed();
                reviewItemZoijcleaow = reviewItemZoijcleaow.zoijcleaow((1535 & 1) != 0 ? reviewItemZoijcleaow.id : null, (1535 & 2) != 0 ? reviewItemZoijcleaow.date : null, (1535 & 4) != 0 ? reviewItemZoijcleaow.user : null, (1535 & 8) != 0 ? reviewItemZoijcleaow.rating : 0, (1535 & 16) != 0 ? reviewItemZoijcleaow.comment : null, (1535 & 32) != 0 ? reviewItemZoijcleaow.answer : null, (1535 & 64) != 0 ? reviewItemZoijcleaow.isCollapsed : !isCollapsed, (1535 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? reviewItemZoijcleaow.fromDegrees : isCollapsed ? 180.0f : 0.0f, (1535 & UserVerificationMethods.USER_VERIFY_HANDPRINT) != 0 ? reviewItemZoijcleaow.toDegrees : isCollapsed ? 0.0f : 180.0f, (1535 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? reviewItemZoijcleaow.answerTitleRes : Integer.valueOf(zfvoamnweg(isCollapsed)), (1535 & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? reviewItemZoijcleaow.isNeedToAnimate : true);
            }
            arrayList.add(reviewItemZoijcleaow);
        }
        ulzqkzuiru(new lqeggnwhkg.iobyxmoadg(arrayList));
    }

    private final void uawqvzlxes() {
        sj.dxjokdxxww.hkdspvbjdz(sj.dxjokdxxww.kegysxyocb(new wkgbmnqykc(this.f15495eablkybsjg.btonecajqb(), this), new eablkybsjg(null)), sopmlzcsov());
    }

    static /* synthetic */ auzgnhcxok weqkydbzbr(zoijcleaow zoijcleaowVar, String str, int i13, int i14, Object obj) {
        if ((i14 & 2) != 0) {
            i13 = 1;
        }
        return zoijcleaowVar.iyctptxqzt(str, i13);
    }

    public static final /* synthetic */ State yfnezrywwk(zoijcleaow zoijcleaowVar) {
        return (State) zoijcleaowVar.jlmebxxoox();
    }

    private final void zeieaojujs(String str) {
        List<ReviewItem> items = ((State) jlmebxxoox()).getItems();
        ArrayList arrayList = new ArrayList(jyumaefscl.cqumvgiudr(items, 10));
        for (ReviewItem reviewItemZoijcleaow : items) {
            if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(reviewItemZoijcleaow.getId(), str)) {
                reviewItemZoijcleaow = reviewItemZoijcleaow.zoijcleaow((1535 & 1) != 0 ? reviewItemZoijcleaow.id : null, (1535 & 2) != 0 ? reviewItemZoijcleaow.date : null, (1535 & 4) != 0 ? reviewItemZoijcleaow.user : null, (1535 & 8) != 0 ? reviewItemZoijcleaow.rating : 0, (1535 & 16) != 0 ? reviewItemZoijcleaow.comment : null, (1535 & 32) != 0 ? reviewItemZoijcleaow.answer : null, (1535 & 64) != 0 ? reviewItemZoijcleaow.isCollapsed : false, (1535 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? reviewItemZoijcleaow.fromDegrees : 0.0f, (1535 & UserVerificationMethods.USER_VERIFY_HANDPRINT) != 0 ? reviewItemZoijcleaow.toDegrees : 0.0f, (1535 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? reviewItemZoijcleaow.answerTitleRes : null, (1535 & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? reviewItemZoijcleaow.isNeedToAnimate : false);
            }
            arrayList.add(reviewItemZoijcleaow);
        }
        ulzqkzuiru(new lqeggnwhkg.iobyxmoadg(arrayList));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int zfvoamnweg(boolean z13) {
        return z13 ? f15493gtknphoqwx : f15491btonecajqb;
    }

    @Override // a8.zoijcleaow
    /* JADX INFO: renamed from: sflfametgt, reason: merged with bridge method [inline-methods] */
    public void zynmafqrjb(b80.eablkybsjg intent) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(intent, "intent");
        if (intent instanceof b80.eablkybsjg.wkgbmnqykc) {
            opjhrmiecq((State) jlmebxxoox(), ((b80.eablkybsjg.wkgbmnqykc) intent).iobyxmoadg());
            return;
        }
        if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(intent, b80.eablkybsjg.zoijcleaow.f15474iobyxmoadg)) {
            crxdokpmqz(gxszxtbevo.iobyxmoadg.f15475iobyxmoadg);
            return;
        }
        if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(intent, b80.eablkybsjg.ppxfxbqfkf.f15472iobyxmoadg)) {
            nuxfzjnpeb();
            return;
        }
        if (intent instanceof b80.eablkybsjg.iobyxmoadg) {
            zeieaojujs(((b80.eablkybsjg.iobyxmoadg) intent).iobyxmoadg());
            return;
        }
        if (intent instanceof b80.eablkybsjg.gxszxtbevo) {
            tbqsvytpvh(((b80.eablkybsjg.gxszxtbevo) intent).iobyxmoadg());
        } else {
            if (!(intent instanceof b80.eablkybsjg.C0262eablkybsjg)) {
                throw new NoWhenBranchMatchedException();
            }
            if (((b80.eablkybsjg.C0262eablkybsjg) intent).iobyxmoadg()) {
                return;
            }
            ulzqkzuiru(lqeggnwhkg.wkgbmnqykc.f15485iobyxmoadg);
        }
    }

    @Override // e8.iobyxmoadg, a8.zoijcleaow
    /* JADX INFO: renamed from: ydmasvzmpa, reason: merged with bridge method [inline-methods] */
    public void pmvmpeiblj(b80.wkgbmnqykc action) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(action, "action");
        if (!kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(action, b80.wkgbmnqykc.iobyxmoadg.f15490iobyxmoadg)) {
            throw new NoWhenBranchMatchedException();
        }
        uawqvzlxes();
        weqkydbzbr(this, ((State) jlmebxxoox()).getProductArticle(), 0, 2, null);
    }
}
