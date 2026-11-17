package m61;

import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import gg.kcexrzcfyt;
import gg.wwaezpbzkn;
import gg.zdlpuopuiu;
import hg.jyumaefscl;
import java.util.ArrayList;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.jvm.internal.draadjrbmk;
import ow1.esjtqupxsv;
import pj.auzgnhcxok;
import pj.cllcsxoeiz;
import pj.dsvhmnatus;
import pj.gtknphoqwx;
import ru.myspar.proloyalty.core.models.paging.Paging;
import ru.myspar.proloyalty.domain.feature.review.store.State;
import ru.myspar.proloyalty.rate.review.api.model.ReviewItem;
import ru.myspar.proloyalty.rate.review.api.model.Reviews;
import sj.dxjokdxxww;
import tg.rgvfuqvkyq;

/* JADX INFO: loaded from: classes5.dex */
public final class zoijcleaow extends e8.iobyxmoadg {

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private final pm1.iobyxmoadg f66240eablkybsjg;

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    private auzgnhcxok f66241gxszxtbevo;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final sm1.zoijcleaow f66242ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final esjtqupxsv f66243wkgbmnqykc;

    /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
    public static final iobyxmoadg f66238lqeggnwhkg = new iobyxmoadg(null);

    /* JADX INFO: renamed from: nufgyqmvbu, reason: collision with root package name */
    public static final int f66239nufgyqmvbu = 8;

    /* JADX INFO: renamed from: dxjokdxxww, reason: collision with root package name */
    private static final int f66237dxjokdxxww = vk0.lqeggnwhkg.proloyalty_reviews_answer_default_title;

    /* JADX INFO: renamed from: btonecajqb, reason: collision with root package name */
    private static final int f66236btonecajqb = vk0.lqeggnwhkg.proloyalty_reviews_answer_short_title;

    static final class eablkybsjg extends draadjrbmk implements rgvfuqvkyq {

        /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
        final /* synthetic */ int f66244cqumvgiudr;

        /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
        final /* synthetic */ String f66245iwizpuwonk;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        private /* synthetic */ Object f66247yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        int f66248zdlpuopuiu;

        static final class iobyxmoadg extends draadjrbmk implements rgvfuqvkyq {

            /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
            final /* synthetic */ int f66249iwizpuwonk;

            /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
            final /* synthetic */ String f66250jyumaefscl;

            /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
            final /* synthetic */ zoijcleaow f66251yggfygwlhe;

            /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
            int f66252zdlpuopuiu;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            iobyxmoadg(zoijcleaow zoijcleaowVar, String str, int i13, lg.gxszxtbevo gxszxtbevoVar) {
                super(2, gxszxtbevoVar);
                this.f66251yggfygwlhe = zoijcleaowVar;
                this.f66250jyumaefscl = str;
                this.f66249iwizpuwonk = i13;
            }

            @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
            public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
                return new iobyxmoadg(this.f66251yggfygwlhe, this.f66250jyumaefscl, this.f66249iwizpuwonk, gxszxtbevoVar);
            }

            @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
            public final Object invokeSuspend(Object obj) {
                Object objWkgbmnqykc;
                Object objZoijcleaow;
                Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
                int i13 = this.f66252zdlpuopuiu;
                try {
                    if (i13 == 0) {
                        zdlpuopuiu.zoijcleaow(obj);
                        zoijcleaow zoijcleaowVar = this.f66251yggfygwlhe;
                        String str = this.f66250jyumaefscl;
                        int i14 = this.f66249iwizpuwonk;
                        kcexrzcfyt.iobyxmoadg iobyxmoadgVar = kcexrzcfyt.f37117yggfygwlhe;
                        sm1.zoijcleaow zoijcleaowVar2 = zoijcleaowVar.f66242ppxfxbqfkf;
                        sm1.zoijcleaow.iobyxmoadg iobyxmoadgVar2 = new sm1.zoijcleaow.iobyxmoadg(str, i14);
                        this.f66252zdlpuopuiu = 1;
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
                int i15 = this.f66249iwizpuwonk;
                zoijcleaow zoijcleaowVar3 = this.f66251yggfygwlhe;
                if (kcexrzcfyt.agtfadlqog(objWkgbmnqykc)) {
                    Reviews reviewsPpxfxbqfkf = (Reviews) objWkgbmnqykc;
                    if (i15 != 1) {
                        reviewsPpxfxbqfkf = Reviews.ppxfxbqfkf(reviewsPpxfxbqfkf, null, null, jyumaefscl.ixidwrxhsl(zoijcleaow.ydmasvzmpa(zoijcleaowVar3).getItems(), reviewsPpxfxbqfkf.getItems()), null, 11, null);
                    }
                    Reviews reviews = reviewsPpxfxbqfkf;
                    List<ReviewItem> items = reviews.getItems();
                    ArrayList arrayList = new ArrayList(jyumaefscl.cqumvgiudr(items, 10));
                    for (ReviewItem reviewItem : items) {
                        arrayList.add(reviewItem.zoijcleaow((1535 & 1) != 0 ? reviewItem.id : null, (1535 & 2) != 0 ? reviewItem.date : null, (1535 & 4) != 0 ? reviewItem.user : null, (1535 & 8) != 0 ? reviewItem.rating : 0, (1535 & 16) != 0 ? reviewItem.comment : null, (1535 & 32) != 0 ? reviewItem.answer : null, (1535 & 64) != 0 ? reviewItem.isCollapsed : false, (1535 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? reviewItem.fromDegrees : 0.0f, (1535 & UserVerificationMethods.USER_VERIFY_HANDPRINT) != 0 ? reviewItem.toDegrees : 0.0f, (1535 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? reviewItem.answerTitleRes : kotlin.coroutines.jvm.internal.zoijcleaow.wkgbmnqykc(zoijcleaowVar3.bfopjjpdmp(!reviewItem.getIsCollapsed())), (1535 & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? reviewItem.isNeedToAnimate : false));
                    }
                    zoijcleaowVar3.ulzqkzuiru(new m61.lqeggnwhkg.ppxfxbqfkf(Reviews.ppxfxbqfkf(reviews, null, null, arrayList, null, 11, null), i15, i15 == 1, ((Boolean) zoijcleaowVar3.f66243wkgbmnqykc.zoijcleaow(wwaezpbzkn.f37140iobyxmoadg)).booleanValue()));
                }
                Throwable thDxjokdxxww = kcexrzcfyt.dxjokdxxww(objWkgbmnqykc);
                if (thDxjokdxxww != null) {
                    zoijcleaowVar3.auzgnhcxok(thDxjokdxxww);
                }
                return wwaezpbzkn.f37140iobyxmoadg;
            }

            @Override // tg.rgvfuqvkyq
            public final Object invoke(cllcsxoeiz cllcsxoeizVar, lg.gxszxtbevo gxszxtbevoVar) {
                return ((iobyxmoadg) create(cllcsxoeizVar, gxszxtbevoVar)).invokeSuspend(wwaezpbzkn.f37140iobyxmoadg);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        eablkybsjg(String str, int i13, lg.gxszxtbevo gxszxtbevoVar) {
            super(2, gxszxtbevoVar);
            this.f66245iwizpuwonk = str;
            this.f66244cqumvgiudr = i13;
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
            eablkybsjg eablkybsjgVar = zoijcleaow.this.new eablkybsjg(this.f66245iwizpuwonk, this.f66244cqumvgiudr, gxszxtbevoVar);
            eablkybsjgVar.f66247yggfygwlhe = obj;
            return eablkybsjgVar;
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            mg.zoijcleaow.gxszxtbevo();
            if (this.f66248zdlpuopuiu != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            zdlpuopuiu.zoijcleaow(obj);
            cllcsxoeiz cllcsxoeizVar = (cllcsxoeiz) this.f66247yggfygwlhe;
            auzgnhcxok auzgnhcxokVar = zoijcleaow.this.f66241gxszxtbevo;
            if (auzgnhcxokVar != null) {
                auzgnhcxok.iobyxmoadg.iobyxmoadg(auzgnhcxokVar, null, 1, null);
            }
            zoijcleaow zoijcleaowVar = zoijcleaow.this;
            zoijcleaowVar.f66241gxszxtbevo = gtknphoqwx.wkgbmnqykc(cllcsxoeizVar, null, null, new iobyxmoadg(zoijcleaowVar, this.f66245iwizpuwonk, this.f66244cqumvgiudr, null), 3, null);
            return wwaezpbzkn.f37140iobyxmoadg;
        }

        @Override // tg.rgvfuqvkyq
        public final Object invoke(cllcsxoeiz cllcsxoeizVar, lg.gxszxtbevo gxszxtbevoVar) {
            return ((eablkybsjg) create(cllcsxoeizVar, gxszxtbevoVar)).invokeSuspend(wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    public static final class gxszxtbevo implements sj.lqeggnwhkg {

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        final /* synthetic */ zoijcleaow f66253yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final /* synthetic */ sj.lqeggnwhkg f66254zdlpuopuiu;

        public static final class iobyxmoadg implements sj.nufgyqmvbu {

            /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
            final /* synthetic */ zoijcleaow f66255yggfygwlhe;

            /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
            final /* synthetic */ sj.nufgyqmvbu f66256zdlpuopuiu;

            /* JADX INFO: renamed from: m61.zoijcleaow$gxszxtbevo$iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
            public static final class C1364iobyxmoadg extends kotlin.coroutines.jvm.internal.wkgbmnqykc {

                /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
                int f66258yggfygwlhe;

                /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
                /* synthetic */ Object f66259zdlpuopuiu;

                public C1364iobyxmoadg(lg.gxszxtbevo gxszxtbevoVar) {
                    super(gxszxtbevoVar);
                }

                @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
                public final Object invokeSuspend(Object obj) {
                    this.f66259zdlpuopuiu = obj;
                    this.f66258yggfygwlhe |= Integer.MIN_VALUE;
                    return iobyxmoadg.this.emit(null, this);
                }
            }

            public iobyxmoadg(sj.nufgyqmvbu nufgyqmvbuVar, zoijcleaow zoijcleaowVar) {
                this.f66256zdlpuopuiu = nufgyqmvbuVar;
                this.f66255yggfygwlhe = zoijcleaowVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // sj.nufgyqmvbu
            public final Object emit(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
                C1364iobyxmoadg c1364iobyxmoadg;
                if (gxszxtbevoVar instanceof C1364iobyxmoadg) {
                    c1364iobyxmoadg = (C1364iobyxmoadg) gxszxtbevoVar;
                    int i13 = c1364iobyxmoadg.f66258yggfygwlhe;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        c1364iobyxmoadg.f66258yggfygwlhe = i13 - Integer.MIN_VALUE;
                    } else {
                        c1364iobyxmoadg = new C1364iobyxmoadg(gxszxtbevoVar);
                    }
                } else {
                    c1364iobyxmoadg = new C1364iobyxmoadg(gxszxtbevoVar);
                }
                Object obj2 = c1364iobyxmoadg.f66259zdlpuopuiu;
                Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
                int i14 = c1364iobyxmoadg.f66258yggfygwlhe;
                if (i14 == 0) {
                    zdlpuopuiu.zoijcleaow(obj2);
                    sj.nufgyqmvbu nufgyqmvbuVar = this.f66256zdlpuopuiu;
                    if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(zoijcleaow.ydmasvzmpa(this.f66255yggfygwlhe).getProductArticle(), ((pm1.iobyxmoadg.C1703iobyxmoadg) obj).iobyxmoadg())) {
                        c1364iobyxmoadg.f66258yggfygwlhe = 1;
                        if (nufgyqmvbuVar.emit(obj, c1364iobyxmoadg) == objGxszxtbevo) {
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

        public gxszxtbevo(sj.lqeggnwhkg lqeggnwhkgVar, zoijcleaow zoijcleaowVar) {
            this.f66254zdlpuopuiu = lqeggnwhkgVar;
            this.f66253yggfygwlhe = zoijcleaowVar;
        }

        @Override // sj.lqeggnwhkg
        public Object collect(sj.nufgyqmvbu nufgyqmvbuVar, lg.gxszxtbevo gxszxtbevoVar) {
            Object objCollect = this.f66254zdlpuopuiu.collect(new iobyxmoadg(nufgyqmvbuVar, this.f66253yggfygwlhe), gxszxtbevoVar);
            return objCollect == mg.zoijcleaow.gxszxtbevo() ? objCollect : wwaezpbzkn.f37140iobyxmoadg;
        }
    }

    public static final class iobyxmoadg {
        public /* synthetic */ iobyxmoadg(kotlin.jvm.internal.gtknphoqwx gtknphoqwxVar) {
            this();
        }

        private iobyxmoadg() {
        }
    }

    static final class lqeggnwhkg extends draadjrbmk implements rgvfuqvkyq {

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        /* synthetic */ Object f66261yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        int f66262zdlpuopuiu;

        lqeggnwhkg(lg.gxszxtbevo gxszxtbevoVar) {
            super(2, gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
            lqeggnwhkg lqeggnwhkgVar = zoijcleaow.this.new lqeggnwhkg(gxszxtbevoVar);
            lqeggnwhkgVar.f66261yggfygwlhe = obj;
            return lqeggnwhkgVar;
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
            int i13 = this.f66262zdlpuopuiu;
            if (i13 == 0) {
                zdlpuopuiu.zoijcleaow(obj);
                pm1.iobyxmoadg.C1703iobyxmoadg c1703iobyxmoadg = (pm1.iobyxmoadg.C1703iobyxmoadg) this.f66261yggfygwlhe;
                zoijcleaow zoijcleaowVar = zoijcleaow.this;
                String strIobyxmoadg = c1703iobyxmoadg.iobyxmoadg();
                this.f66262zdlpuopuiu = 1;
                if (zoijcleaow.zeieaojujs(zoijcleaowVar, strIobyxmoadg, 0, this, 2, null) == objGxszxtbevo) {
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
        /* JADX INFO: renamed from: ojitshcjhn, reason: merged with bridge method [inline-methods] */
        public final Object invoke(pm1.iobyxmoadg.C1703iobyxmoadg c1703iobyxmoadg, lg.gxszxtbevo gxszxtbevoVar) {
            return ((lqeggnwhkg) create(c1703iobyxmoadg, gxszxtbevoVar)).invokeSuspend(wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    static final class ppxfxbqfkf extends draadjrbmk implements rgvfuqvkyq {

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        final /* synthetic */ zoijcleaow f66263jyumaefscl;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        final /* synthetic */ m61.eablkybsjg f66264yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        int f66265zdlpuopuiu;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        ppxfxbqfkf(m61.eablkybsjg eablkybsjgVar, zoijcleaow zoijcleaowVar, lg.gxszxtbevo gxszxtbevoVar) {
            super(2, gxszxtbevoVar);
            this.f66264yggfygwlhe = eablkybsjgVar;
            this.f66263jyumaefscl = zoijcleaowVar;
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
            return new ppxfxbqfkf(this.f66264yggfygwlhe, this.f66263jyumaefscl, gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
            int i13 = this.f66265zdlpuopuiu;
            if (i13 == 0) {
                zdlpuopuiu.zoijcleaow(obj);
                m61.eablkybsjg eablkybsjgVar = this.f66264yggfygwlhe;
                if (eablkybsjgVar instanceof m61.eablkybsjg.wkgbmnqykc) {
                    zoijcleaow zoijcleaowVar = this.f66263jyumaefscl;
                    State stateYdmasvzmpa = zoijcleaow.ydmasvzmpa(zoijcleaowVar);
                    int iIobyxmoadg = ((m61.eablkybsjg.wkgbmnqykc) this.f66264yggfygwlhe).iobyxmoadg();
                    this.f66265zdlpuopuiu = 1;
                    if (zoijcleaowVar.weqkydbzbr(stateYdmasvzmpa, iIobyxmoadg, this) == objGxszxtbevo) {
                        return objGxszxtbevo;
                    }
                } else if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(eablkybsjgVar, m61.eablkybsjg.zoijcleaow.f66219iobyxmoadg)) {
                    this.f66263jyumaefscl.crxdokpmqz(m61.gxszxtbevo.iobyxmoadg.f66220iobyxmoadg);
                } else if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(eablkybsjgVar, m61.eablkybsjg.ppxfxbqfkf.f66217iobyxmoadg)) {
                    this.f66263jyumaefscl.roivzttewh();
                } else if (eablkybsjgVar instanceof m61.eablkybsjg.iobyxmoadg) {
                    this.f66263jyumaefscl.tbqsvytpvh(((m61.eablkybsjg.iobyxmoadg) this.f66264yggfygwlhe).iobyxmoadg());
                } else if (eablkybsjgVar instanceof m61.eablkybsjg.gxszxtbevo) {
                    this.f66263jyumaefscl.uawqvzlxes(((m61.eablkybsjg.gxszxtbevo) this.f66264yggfygwlhe).iobyxmoadg());
                } else {
                    if (!(eablkybsjgVar instanceof m61.eablkybsjg.C1363eablkybsjg)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    if (!((m61.eablkybsjg.C1363eablkybsjg) this.f66264yggfygwlhe).iobyxmoadg()) {
                        this.f66263jyumaefscl.ulzqkzuiru(m61.lqeggnwhkg.wkgbmnqykc.f66230iobyxmoadg);
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
            return ((ppxfxbqfkf) create(cllcsxoeizVar, gxszxtbevoVar)).invokeSuspend(wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    static final class wkgbmnqykc extends kotlin.coroutines.jvm.internal.wkgbmnqykc {

        /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
        int f66266iwizpuwonk;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        /* synthetic */ Object f66268yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        Object f66269zdlpuopuiu;

        wkgbmnqykc(lg.gxszxtbevo gxszxtbevoVar) {
            super(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            this.f66268yggfygwlhe = obj;
            this.f66266iwizpuwonk |= Integer.MIN_VALUE;
            return zoijcleaow.this.lrnfpwlwnk(null, 0, this);
        }
    }

    /* JADX INFO: renamed from: m61.zoijcleaow$zoijcleaow, reason: collision with other inner class name */
    static final class C1365zoijcleaow extends draadjrbmk implements rgvfuqvkyq {

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        final /* synthetic */ zoijcleaow f66270jyumaefscl;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        final /* synthetic */ m61.wkgbmnqykc f66271yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        int f66272zdlpuopuiu;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C1365zoijcleaow(m61.wkgbmnqykc wkgbmnqykcVar, zoijcleaow zoijcleaowVar, lg.gxszxtbevo gxszxtbevoVar) {
            super(2, gxszxtbevoVar);
            this.f66271yggfygwlhe = wkgbmnqykcVar;
            this.f66270jyumaefscl = zoijcleaowVar;
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
            return new C1365zoijcleaow(this.f66271yggfygwlhe, this.f66270jyumaefscl, gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
            int i13 = this.f66272zdlpuopuiu;
            if (i13 == 0) {
                zdlpuopuiu.zoijcleaow(obj);
                if (!kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f66271yggfygwlhe, m61.wkgbmnqykc.iobyxmoadg.f66235iobyxmoadg)) {
                    throw new NoWhenBranchMatchedException();
                }
                this.f66270jyumaefscl.iwxlajgraz();
                zoijcleaow zoijcleaowVar = this.f66270jyumaefscl;
                String productArticle = zoijcleaow.ydmasvzmpa(zoijcleaowVar).getProductArticle();
                this.f66272zdlpuopuiu = 1;
                if (zoijcleaow.zeieaojujs(zoijcleaowVar, productArticle, 0, this, 2, null) == objGxszxtbevo) {
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
            return ((C1365zoijcleaow) create(cllcsxoeizVar, gxszxtbevoVar)).invokeSuspend(wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zoijcleaow(sm1.zoijcleaow getReviewsUseCase, esjtqupxsv isAuthUseCase, pm1.iobyxmoadg changeProductReviewObserver, dr0.iobyxmoadg dispatchersProvider) {
        super(dispatchersProvider.iobyxmoadg());
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(getReviewsUseCase, "getReviewsUseCase");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(isAuthUseCase, "isAuthUseCase");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(changeProductReviewObserver, "changeProductReviewObserver");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(dispatchersProvider, "dispatchersProvider");
        this.f66242ppxfxbqfkf = getReviewsUseCase;
        this.f66243wkgbmnqykc = isAuthUseCase;
        this.f66240eablkybsjg = changeProductReviewObserver;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int bfopjjpdmp(boolean z13) {
        return z13 ? f66236btonecajqb : f66237dxjokdxxww;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void iwxlajgraz() {
        dxjokdxxww.hkdspvbjdz(dxjokdxxww.kegysxyocb(new gxszxtbevo(this.f66240eablkybsjg.nufgyqmvbu(), this), new lqeggnwhkg(null)), sopmlzcsov());
    }

    private final boolean iyctptxqzt(Paging paging, int i13) {
        return i13 == paging.getPagesCount();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object lrnfpwlwnk(String str, int i13, lg.gxszxtbevo gxszxtbevoVar) {
        wkgbmnqykc wkgbmnqykcVar;
        zoijcleaow zoijcleaowVar;
        if (gxszxtbevoVar instanceof wkgbmnqykc) {
            wkgbmnqykcVar = (wkgbmnqykc) gxszxtbevoVar;
            int i14 = wkgbmnqykcVar.f66266iwizpuwonk;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                wkgbmnqykcVar.f66266iwizpuwonk = i14 - Integer.MIN_VALUE;
            } else {
                wkgbmnqykcVar = new wkgbmnqykc(gxszxtbevoVar);
            }
        } else {
            wkgbmnqykcVar = new wkgbmnqykc(gxszxtbevoVar);
        }
        Object obj = wkgbmnqykcVar.f66268yggfygwlhe;
        Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
        int i15 = wkgbmnqykcVar.f66266iwizpuwonk;
        if (i15 == 0) {
            zdlpuopuiu.zoijcleaow(obj);
            ulzqkzuiru(new m61.lqeggnwhkg.zoijcleaow(true, i13 == 1));
            eablkybsjg eablkybsjgVar = new eablkybsjg(str, i13, null);
            wkgbmnqykcVar.f66269zdlpuopuiu = this;
            wkgbmnqykcVar.f66266iwizpuwonk = 1;
            if (dsvhmnatus.gxszxtbevo(eablkybsjgVar, wkgbmnqykcVar) == objGxszxtbevo) {
                return objGxszxtbevo;
            }
            zoijcleaowVar = this;
        } else {
            if (i15 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            zoijcleaowVar = (zoijcleaow) wkgbmnqykcVar.f66269zdlpuopuiu;
            zdlpuopuiu.zoijcleaow(obj);
        }
        zoijcleaowVar.ulzqkzuiru(new m61.lqeggnwhkg.zoijcleaow(false, false, 2, null));
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    private final boolean nuxfzjnpeb(Paging paging, int i13, int i14) {
        return i13 >= i14 - (paging.getItemsOnPageCount() / 3);
    }

    private final boolean opjhrmiecq() {
        auzgnhcxok auzgnhcxokVar = this.f66241gxszxtbevo;
        return (auzgnhcxokVar == null || auzgnhcxokVar.agtfadlqog()) ? false : true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void roivzttewh() {
        State state = (State) jlmebxxoox();
        if (((Boolean) this.f66243wkgbmnqykc.zoijcleaow(wwaezpbzkn.f37140iobyxmoadg)).booleanValue()) {
            crxdokpmqz(new m61.gxszxtbevo.wkgbmnqykc(state.getProductArticle(), state.getProductName()));
        } else {
            ulzqkzuiru(new m61.lqeggnwhkg.zoijcleaow(false, state.getCurrentPage() == 1));
            crxdokpmqz(m61.gxszxtbevo.zoijcleaow.f66224iobyxmoadg);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void tbqsvytpvh(String str) {
        List<ReviewItem> items = ((State) jlmebxxoox()).getItems();
        ArrayList arrayList = new ArrayList(jyumaefscl.cqumvgiudr(items, 10));
        for (ReviewItem reviewItemZoijcleaow : items) {
            if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(reviewItemZoijcleaow.getId(), str)) {
                reviewItemZoijcleaow = reviewItemZoijcleaow.zoijcleaow((1535 & 1) != 0 ? reviewItemZoijcleaow.id : null, (1535 & 2) != 0 ? reviewItemZoijcleaow.date : null, (1535 & 4) != 0 ? reviewItemZoijcleaow.user : null, (1535 & 8) != 0 ? reviewItemZoijcleaow.rating : 0, (1535 & 16) != 0 ? reviewItemZoijcleaow.comment : null, (1535 & 32) != 0 ? reviewItemZoijcleaow.answer : null, (1535 & 64) != 0 ? reviewItemZoijcleaow.isCollapsed : false, (1535 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? reviewItemZoijcleaow.fromDegrees : 0.0f, (1535 & UserVerificationMethods.USER_VERIFY_HANDPRINT) != 0 ? reviewItemZoijcleaow.toDegrees : 0.0f, (1535 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? reviewItemZoijcleaow.answerTitleRes : null, (1535 & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? reviewItemZoijcleaow.isNeedToAnimate : false);
            }
            arrayList.add(reviewItemZoijcleaow);
        }
        ulzqkzuiru(new m61.lqeggnwhkg.iobyxmoadg(arrayList));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void uawqvzlxes(String str) {
        List<ReviewItem> items = ((State) jlmebxxoox()).getItems();
        ArrayList arrayList = new ArrayList(jyumaefscl.cqumvgiudr(items, 10));
        for (ReviewItem reviewItemZoijcleaow : items) {
            if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(reviewItemZoijcleaow.getId(), str)) {
                boolean isCollapsed = reviewItemZoijcleaow.getIsCollapsed();
                reviewItemZoijcleaow = reviewItemZoijcleaow.zoijcleaow((1535 & 1) != 0 ? reviewItemZoijcleaow.id : null, (1535 & 2) != 0 ? reviewItemZoijcleaow.date : null, (1535 & 4) != 0 ? reviewItemZoijcleaow.user : null, (1535 & 8) != 0 ? reviewItemZoijcleaow.rating : 0, (1535 & 16) != 0 ? reviewItemZoijcleaow.comment : null, (1535 & 32) != 0 ? reviewItemZoijcleaow.answer : null, (1535 & 64) != 0 ? reviewItemZoijcleaow.isCollapsed : !isCollapsed, (1535 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? reviewItemZoijcleaow.fromDegrees : isCollapsed ? 180.0f : 0.0f, (1535 & UserVerificationMethods.USER_VERIFY_HANDPRINT) != 0 ? reviewItemZoijcleaow.toDegrees : isCollapsed ? 0.0f : 180.0f, (1535 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? reviewItemZoijcleaow.answerTitleRes : Integer.valueOf(bfopjjpdmp(isCollapsed)), (1535 & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? reviewItemZoijcleaow.isNeedToAnimate : true);
            }
            arrayList.add(reviewItemZoijcleaow);
        }
        ulzqkzuiru(new m61.lqeggnwhkg.iobyxmoadg(arrayList));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object weqkydbzbr(State state, int i13, lg.gxszxtbevo gxszxtbevoVar) {
        if (iyctptxqzt(state.getPaging(), state.getCurrentPage()) || opjhrmiecq() || !nuxfzjnpeb(state.getPaging(), i13, state.getItems().size())) {
            return wwaezpbzkn.f37140iobyxmoadg;
        }
        Object objLrnfpwlwnk = lrnfpwlwnk(state.getProductArticle(), state.getCurrentPage() + 1, gxszxtbevoVar);
        return objLrnfpwlwnk == mg.zoijcleaow.gxszxtbevo() ? objLrnfpwlwnk : wwaezpbzkn.f37140iobyxmoadg;
    }

    public static final /* synthetic */ State ydmasvzmpa(zoijcleaow zoijcleaowVar) {
        return (State) zoijcleaowVar.jlmebxxoox();
    }

    static /* synthetic */ Object zeieaojujs(zoijcleaow zoijcleaowVar, String str, int i13, lg.gxszxtbevo gxszxtbevoVar, int i14, Object obj) {
        if ((i14 & 2) != 0) {
            i13 = 1;
        }
        return zoijcleaowVar.lrnfpwlwnk(str, i13, gxszxtbevoVar);
    }

    public final void auzgnhcxok(Throwable error) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(error, "error");
        ulzqkzuiru(new m61.lqeggnwhkg.zoijcleaow(false, false, 2, null));
        crxdokpmqz(new m61.gxszxtbevo.ppxfxbqfkf(error));
    }

    @Override // a8.zoijcleaow
    /* JADX INFO: renamed from: oipsdeybqn, reason: merged with bridge method [inline-methods] */
    public void zynmafqrjb(m61.eablkybsjg intent) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(intent, "intent");
        gtknphoqwx.wkgbmnqykc(sopmlzcsov(), null, null, new ppxfxbqfkf(intent, this, null), 3, null);
    }

    @Override // e8.iobyxmoadg, a8.zoijcleaow
    /* JADX INFO: renamed from: zfvoamnweg, reason: merged with bridge method [inline-methods] */
    public void pmvmpeiblj(m61.wkgbmnqykc action) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(action, "action");
        gtknphoqwx.wkgbmnqykc(sopmlzcsov(), null, null, new C1365zoijcleaow(action, this, null), 3, null);
    }
}
