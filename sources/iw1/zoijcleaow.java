package iw1;

import aw1.AuthSignupResponse;
import aw1.AuthTokenResponse;
import bw1.UserChangeFavoriteRequest;
import bw1.UserEReceiptRequest;
import bw1.UserEditPersonalDataRequest;
import bw1.UserRegistrationRequest;
import bw1.UserSetAgreementRequest;
import bw1.UserSettingsRequest;
import bw1.UserUploadDeviceInfoRequest;
import cw1.UploadUserSettingsResponse;
import cw1.UserFetchPushTokensResponse;
import cw1.UserGetAgreementResponse;
import cw1.UserGetNewsResponse;
import cw1.UserPersonalDataResponse;
import cw1.UserSettingsResponse;
import cw1.UserSharePromoDto;
import dw1.TokenInfoEntity;
import dw1.UserNewsEntity;
import gg.wwaezpbzkn;
import java.time.LocalDate;
import ru.myspar.proloyalty.core.network.model.BasicResponse;
import ru.myspar.proloyalty.core.network.model.ErrorResponse;
import ru.myspar.proloyalty.user.domain.model.TokenInfo;
import ru.myspar.proloyalty.user.domain.model.UserInfo;
import ru.myspar.proloyalty.user.domain.model.UserNews;
import ru.myspar.proloyalty.user.domain.model.UserState;
import zv1.AuthLogoutRequest;
import zv1.AuthNewTokenRequest;
import zv1.AuthSignupRequest;
import zv1.AuthVerifyRequest;

/* JADX INFO: loaded from: classes6.dex */
public final class zoijcleaow implements iw1.iobyxmoadg {

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private final sj.lqeggnwhkg f49696eablkybsjg;

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    private final sj.lqeggnwhkg f49697gxszxtbevo;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final fw1.iobyxmoadg f49698iobyxmoadg;

    /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
    private final sj.lqeggnwhkg f49699lqeggnwhkg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final wv1.iobyxmoadg f49700ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final wv1.ppxfxbqfkf f49701wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final wv1.zoijcleaow f49702zoijcleaow;

    static final class agtfadlqog extends kotlin.coroutines.jvm.internal.wkgbmnqykc {

        /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
        int f49703cqumvgiudr;

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        /* synthetic */ Object f49705jyumaefscl;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        Object f49706yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        Object f49707zdlpuopuiu;

        agtfadlqog(lg.gxszxtbevo gxszxtbevoVar) {
            super(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            this.f49705jyumaefscl = obj;
            this.f49703cqumvgiudr |= Integer.MIN_VALUE;
            return zoijcleaow.this.crxdokpmqz(null, null, this);
        }
    }

    static final class btonecajqb extends kotlin.coroutines.jvm.internal.wkgbmnqykc {

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        int f49708jyumaefscl;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        /* synthetic */ Object f49710zdlpuopuiu;

        btonecajqb(lg.gxszxtbevo gxszxtbevoVar) {
            super(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            this.f49710zdlpuopuiu = obj;
            this.f49708jyumaefscl |= Integer.MIN_VALUE;
            return zoijcleaow.this.vdvldrhtss(this);
        }
    }

    static final class cdpycssgdh extends kotlin.coroutines.jvm.internal.wkgbmnqykc {

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        int f49711jyumaefscl;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        /* synthetic */ Object f49713zdlpuopuiu;

        cdpycssgdh(lg.gxszxtbevo gxszxtbevoVar) {
            super(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            this.f49713zdlpuopuiu = obj;
            this.f49711jyumaefscl |= Integer.MIN_VALUE;
            return zoijcleaow.this.pkzmftpjix(null, null, null, this);
        }
    }

    static final class cqumvgiudr extends kotlin.coroutines.jvm.internal.wkgbmnqykc {

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        int f49714jyumaefscl;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        /* synthetic */ Object f49716zdlpuopuiu;

        cqumvgiudr(lg.gxszxtbevo gxszxtbevoVar) {
            super(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            this.f49716zdlpuopuiu = obj;
            this.f49714jyumaefscl |= Integer.MIN_VALUE;
            return zoijcleaow.this.wwaezpbzkn(false, this);
        }
    }

    static final class draadjrbmk extends kotlin.coroutines.jvm.internal.wkgbmnqykc {

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        int f49717jyumaefscl;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        /* synthetic */ Object f49719zdlpuopuiu;

        draadjrbmk(lg.gxszxtbevo gxszxtbevoVar) {
            super(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            this.f49719zdlpuopuiu = obj;
            this.f49717jyumaefscl |= Integer.MIN_VALUE;
            return zoijcleaow.this.lmojexxdyd(null, this);
        }
    }

    static final class dxjokdxxww extends kotlin.coroutines.jvm.internal.wkgbmnqykc {

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        int f49720jyumaefscl;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        /* synthetic */ Object f49722zdlpuopuiu;

        dxjokdxxww(lg.gxszxtbevo gxszxtbevoVar) {
            super(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            this.f49722zdlpuopuiu = obj;
            this.f49720jyumaefscl |= Integer.MIN_VALUE;
            return zoijcleaow.this.dsvhmnatus(this);
        }
    }

    static final class eablkybsjg extends kotlin.coroutines.jvm.internal.wkgbmnqykc {

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        int f49723jyumaefscl;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        /* synthetic */ Object f49725zdlpuopuiu;

        eablkybsjg(lg.gxszxtbevo gxszxtbevoVar) {
            super(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            this.f49725zdlpuopuiu = obj;
            this.f49723jyumaefscl |= Integer.MIN_VALUE;
            return zoijcleaow.this.zynmafqrjb(this);
        }
    }

    static final class esjtqupxsv extends kotlin.coroutines.jvm.internal.wkgbmnqykc {

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        int f49726jyumaefscl;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        /* synthetic */ Object f49728zdlpuopuiu;

        esjtqupxsv(lg.gxszxtbevo gxszxtbevoVar) {
            super(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            this.f49728zdlpuopuiu = obj;
            this.f49726jyumaefscl |= Integer.MIN_VALUE;
            return zoijcleaow.this.iozdgvuglv(false, this);
        }
    }

    static final class gtknphoqwx extends kotlin.coroutines.jvm.internal.wkgbmnqykc {

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        int f49729jyumaefscl;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        /* synthetic */ Object f49731zdlpuopuiu;

        gtknphoqwx(lg.gxszxtbevo gxszxtbevoVar) {
            super(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            this.f49731zdlpuopuiu = obj;
            this.f49729jyumaefscl |= Integer.MIN_VALUE;
            return zoijcleaow.this.zoijcleaow(this);
        }
    }

    static final class gxszxtbevo extends kotlin.coroutines.jvm.internal.wkgbmnqykc {

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        int f49732jyumaefscl;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        /* synthetic */ Object f49734zdlpuopuiu;

        gxszxtbevo(lg.gxszxtbevo gxszxtbevoVar) {
            super(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            this.f49734zdlpuopuiu = obj;
            this.f49732jyumaefscl |= Integer.MIN_VALUE;
            return zoijcleaow.this.nufgyqmvbu(this);
        }
    }

    static final class iobyxmoadg extends kotlin.coroutines.jvm.internal.wkgbmnqykc {

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        int f49735jyumaefscl;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        /* synthetic */ Object f49737zdlpuopuiu;

        iobyxmoadg(lg.gxszxtbevo gxszxtbevoVar) {
            super(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            this.f49737zdlpuopuiu = obj;
            this.f49735jyumaefscl |= Integer.MIN_VALUE;
            return zoijcleaow.this.lereixgezr(this);
        }
    }

    static final class istkbnxepw extends kotlin.coroutines.jvm.internal.wkgbmnqykc {

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        int f49738jyumaefscl;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        /* synthetic */ Object f49740zdlpuopuiu;

        istkbnxepw(lg.gxszxtbevo gxszxtbevoVar) {
            super(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            this.f49740zdlpuopuiu = obj;
            this.f49738jyumaefscl |= Integer.MIN_VALUE;
            return zoijcleaow.this.mbcevpiqjq(null, false, this);
        }
    }

    static final class iwizpuwonk extends kotlin.coroutines.jvm.internal.wkgbmnqykc {

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        int f49741jyumaefscl;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        /* synthetic */ Object f49743zdlpuopuiu;

        iwizpuwonk(lg.gxszxtbevo gxszxtbevoVar) {
            super(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            this.f49743zdlpuopuiu = obj;
            this.f49741jyumaefscl |= Integer.MIN_VALUE;
            return zoijcleaow.this.kcexrzcfyt(this);
        }
    }

    static final class jyumaefscl extends kotlin.coroutines.jvm.internal.wkgbmnqykc {

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        int f49744jyumaefscl;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        /* synthetic */ Object f49746zdlpuopuiu;

        jyumaefscl(lg.gxszxtbevo gxszxtbevoVar) {
            super(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            this.f49746zdlpuopuiu = obj;
            this.f49744jyumaefscl |= Integer.MIN_VALUE;
            return zoijcleaow.this.istkbnxepw(null, false, this);
        }
    }

    public static final class kcexrzcfyt implements sj.lqeggnwhkg {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final /* synthetic */ sj.lqeggnwhkg f49747zdlpuopuiu;

        public static final class iobyxmoadg implements sj.nufgyqmvbu {

            /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
            final /* synthetic */ sj.nufgyqmvbu f49748zdlpuopuiu;

            /* JADX INFO: renamed from: iw1.zoijcleaow$kcexrzcfyt$iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
            public static final class C1057iobyxmoadg extends kotlin.coroutines.jvm.internal.wkgbmnqykc {

                /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
                int f49750yggfygwlhe;

                /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
                /* synthetic */ Object f49751zdlpuopuiu;

                public C1057iobyxmoadg(lg.gxszxtbevo gxszxtbevoVar) {
                    super(gxszxtbevoVar);
                }

                @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
                public final Object invokeSuspend(Object obj) {
                    this.f49751zdlpuopuiu = obj;
                    this.f49750yggfygwlhe |= Integer.MIN_VALUE;
                    return iobyxmoadg.this.emit(null, this);
                }
            }

            public iobyxmoadg(sj.nufgyqmvbu nufgyqmvbuVar) {
                this.f49748zdlpuopuiu = nufgyqmvbuVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // sj.nufgyqmvbu
            public final Object emit(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
                C1057iobyxmoadg c1057iobyxmoadg;
                if (gxszxtbevoVar instanceof C1057iobyxmoadg) {
                    c1057iobyxmoadg = (C1057iobyxmoadg) gxszxtbevoVar;
                    int i13 = c1057iobyxmoadg.f49750yggfygwlhe;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        c1057iobyxmoadg.f49750yggfygwlhe = i13 - Integer.MIN_VALUE;
                    } else {
                        c1057iobyxmoadg = new C1057iobyxmoadg(gxszxtbevoVar);
                    }
                } else {
                    c1057iobyxmoadg = new C1057iobyxmoadg(gxszxtbevoVar);
                }
                Object obj2 = c1057iobyxmoadg.f49751zdlpuopuiu;
                Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
                int i14 = c1057iobyxmoadg.f49750yggfygwlhe;
                if (i14 == 0) {
                    gg.zdlpuopuiu.zoijcleaow(obj2);
                    sj.nufgyqmvbu nufgyqmvbuVar = this.f49748zdlpuopuiu;
                    TokenInfoEntity tokenInfoEntity = (TokenInfoEntity) obj;
                    TokenInfo tokenInfoJyumaefscl = tokenInfoEntity != null ? gw1.iobyxmoadg.jyumaefscl(tokenInfoEntity) : null;
                    c1057iobyxmoadg.f49750yggfygwlhe = 1;
                    if (nufgyqmvbuVar.emit(tokenInfoJyumaefscl, c1057iobyxmoadg) == objGxszxtbevo) {
                        return objGxszxtbevo;
                    }
                } else {
                    if (i14 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    gg.zdlpuopuiu.zoijcleaow(obj2);
                }
                return wwaezpbzkn.f37140iobyxmoadg;
            }
        }

        public kcexrzcfyt(sj.lqeggnwhkg lqeggnwhkgVar) {
            this.f49747zdlpuopuiu = lqeggnwhkgVar;
        }

        @Override // sj.lqeggnwhkg
        public Object collect(sj.nufgyqmvbu nufgyqmvbuVar, lg.gxszxtbevo gxszxtbevoVar) {
            Object objCollect = this.f49747zdlpuopuiu.collect(new iobyxmoadg(nufgyqmvbuVar), gxszxtbevoVar);
            return objCollect == mg.zoijcleaow.gxszxtbevo() ? objCollect : wwaezpbzkn.f37140iobyxmoadg;
        }
    }

    static final class lereixgezr extends kotlin.coroutines.jvm.internal.wkgbmnqykc {

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        int f49752jyumaefscl;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        /* synthetic */ Object f49754zdlpuopuiu;

        lereixgezr(lg.gxszxtbevo gxszxtbevoVar) {
            super(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            this.f49754zdlpuopuiu = obj;
            this.f49752jyumaefscl |= Integer.MIN_VALUE;
            return zoijcleaow.this.yadqdtsiqt(null, this);
        }
    }

    static final class lqeggnwhkg extends kotlin.coroutines.jvm.internal.wkgbmnqykc {

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        int f49755jyumaefscl;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        /* synthetic */ Object f49757zdlpuopuiu;

        lqeggnwhkg(lg.gxszxtbevo gxszxtbevoVar) {
            super(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            this.f49757zdlpuopuiu = obj;
            this.f49755jyumaefscl |= Integer.MIN_VALUE;
            return zoijcleaow.this.oxmwwwfdhm(this);
        }
    }

    static final class nufgyqmvbu extends kotlin.coroutines.jvm.internal.wkgbmnqykc {

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        int f49758jyumaefscl;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        /* synthetic */ Object f49760zdlpuopuiu;

        nufgyqmvbu(lg.gxszxtbevo gxszxtbevoVar) {
            super(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            this.f49760zdlpuopuiu = obj;
            this.f49758jyumaefscl |= Integer.MIN_VALUE;
            return zoijcleaow.this.stevsuqkhv(this);
        }
    }

    static final class ojitshcjhn extends kotlin.coroutines.jvm.internal.wkgbmnqykc {

        /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
        int f49761cqumvgiudr;

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        /* synthetic */ Object f49763jyumaefscl;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        boolean f49764yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        Object f49765zdlpuopuiu;

        ojitshcjhn(lg.gxszxtbevo gxszxtbevoVar) {
            super(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            this.f49763jyumaefscl = obj;
            this.f49761cqumvgiudr |= Integer.MIN_VALUE;
            return zoijcleaow.this.jpowsppfya(false, this);
        }
    }

    static final class oxmwwwfdhm extends kotlin.coroutines.jvm.internal.wkgbmnqykc {

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        int f49766jyumaefscl;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        /* synthetic */ Object f49768zdlpuopuiu;

        oxmwwwfdhm(lg.gxszxtbevo gxszxtbevoVar) {
            super(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            this.f49768zdlpuopuiu = obj;
            this.f49766jyumaefscl |= Integer.MIN_VALUE;
            return zoijcleaow.this.ulzqkzuiru(null, this);
        }
    }

    static final class pmvmpeiblj extends kotlin.coroutines.jvm.internal.wkgbmnqykc {

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        int f49769jyumaefscl;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        /* synthetic */ Object f49771zdlpuopuiu;

        pmvmpeiblj(lg.gxszxtbevo gxszxtbevoVar) {
            super(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            this.f49771zdlpuopuiu = obj;
            this.f49769jyumaefscl |= Integer.MIN_VALUE;
            return zoijcleaow.this.cdpycssgdh(null, null, this);
        }
    }

    static final class ppxfxbqfkf extends kotlin.coroutines.jvm.internal.wkgbmnqykc {

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        int f49772jyumaefscl;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        /* synthetic */ Object f49774zdlpuopuiu;

        ppxfxbqfkf(lg.gxszxtbevo gxszxtbevoVar) {
            super(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            this.f49774zdlpuopuiu = obj;
            this.f49772jyumaefscl |= Integer.MIN_VALUE;
            return zoijcleaow.this.sopmlzcsov(this);
        }
    }

    static final class rgvfuqvkyq extends kotlin.coroutines.jvm.internal.wkgbmnqykc {

        /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
        int f49775cqumvgiudr;

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        /* synthetic */ Object f49777jyumaefscl;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        boolean f49778yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        Object f49779zdlpuopuiu;

        rgvfuqvkyq(lg.gxszxtbevo gxszxtbevoVar) {
            super(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            this.f49777jyumaefscl = obj;
            this.f49775cqumvgiudr |= Integer.MIN_VALUE;
            return zoijcleaow.this.kegysxyocb(false, this);
        }
    }

    static final class vdvldrhtss extends kotlin.coroutines.jvm.internal.wkgbmnqykc {

        /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
        int f49780cqumvgiudr;

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        /* synthetic */ Object f49782jyumaefscl;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        Object f49783yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        Object f49784zdlpuopuiu;

        vdvldrhtss(lg.gxszxtbevo gxszxtbevoVar) {
            super(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            this.f49782jyumaefscl = obj;
            this.f49780cqumvgiudr |= Integer.MIN_VALUE;
            return zoijcleaow.this.hcddaimhww(null, this);
        }
    }

    static final class wflxmlrfwp extends kotlin.coroutines.jvm.internal.wkgbmnqykc {

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        int f49785jyumaefscl;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        /* synthetic */ Object f49787zdlpuopuiu;

        wflxmlrfwp(lg.gxszxtbevo gxszxtbevoVar) {
            super(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            this.f49787zdlpuopuiu = obj;
            this.f49785jyumaefscl |= Integer.MIN_VALUE;
            return zoijcleaow.this.ylkuphrtab(null, null, null, this);
        }
    }

    static final class wkgbmnqykc extends kotlin.coroutines.jvm.internal.wkgbmnqykc {

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        int f49788jyumaefscl;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        /* synthetic */ Object f49790zdlpuopuiu;

        wkgbmnqykc(lg.gxszxtbevo gxszxtbevoVar) {
            super(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            this.f49790zdlpuopuiu = obj;
            this.f49788jyumaefscl |= Integer.MIN_VALUE;
            return zoijcleaow.this.wypolnanlu(this);
        }
    }

    public static final class yggfygwlhe implements sj.lqeggnwhkg {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final /* synthetic */ sj.lqeggnwhkg f49791zdlpuopuiu;

        public static final class iobyxmoadg implements sj.nufgyqmvbu {

            /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
            final /* synthetic */ sj.nufgyqmvbu f49792zdlpuopuiu;

            /* JADX INFO: renamed from: iw1.zoijcleaow$yggfygwlhe$iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
            public static final class C1058iobyxmoadg extends kotlin.coroutines.jvm.internal.wkgbmnqykc {

                /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
                int f49794yggfygwlhe;

                /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
                /* synthetic */ Object f49795zdlpuopuiu;

                public C1058iobyxmoadg(lg.gxszxtbevo gxszxtbevoVar) {
                    super(gxszxtbevoVar);
                }

                @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
                public final Object invokeSuspend(Object obj) {
                    this.f49795zdlpuopuiu = obj;
                    this.f49794yggfygwlhe |= Integer.MIN_VALUE;
                    return iobyxmoadg.this.emit(null, this);
                }
            }

            public iobyxmoadg(sj.nufgyqmvbu nufgyqmvbuVar) {
                this.f49792zdlpuopuiu = nufgyqmvbuVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // sj.nufgyqmvbu
            public final Object emit(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
                C1058iobyxmoadg c1058iobyxmoadg;
                UserNews userNewsIobyxmoadg;
                if (gxszxtbevoVar instanceof C1058iobyxmoadg) {
                    c1058iobyxmoadg = (C1058iobyxmoadg) gxszxtbevoVar;
                    int i13 = c1058iobyxmoadg.f49794yggfygwlhe;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        c1058iobyxmoadg.f49794yggfygwlhe = i13 - Integer.MIN_VALUE;
                    } else {
                        c1058iobyxmoadg = new C1058iobyxmoadg(gxszxtbevoVar);
                    }
                } else {
                    c1058iobyxmoadg = new C1058iobyxmoadg(gxszxtbevoVar);
                }
                Object obj2 = c1058iobyxmoadg.f49795zdlpuopuiu;
                Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
                int i14 = c1058iobyxmoadg.f49794yggfygwlhe;
                if (i14 == 0) {
                    gg.zdlpuopuiu.zoijcleaow(obj2);
                    sj.nufgyqmvbu nufgyqmvbuVar = this.f49792zdlpuopuiu;
                    UserNewsEntity userNewsEntity = (UserNewsEntity) obj;
                    if (userNewsEntity == null || (userNewsIobyxmoadg = gw1.iobyxmoadg.esjtqupxsv(userNewsEntity)) == null) {
                        userNewsIobyxmoadg = UserNews.INSTANCE.iobyxmoadg();
                    }
                    c1058iobyxmoadg.f49794yggfygwlhe = 1;
                    if (nufgyqmvbuVar.emit(userNewsIobyxmoadg, c1058iobyxmoadg) == objGxszxtbevo) {
                        return objGxszxtbevo;
                    }
                } else {
                    if (i14 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    gg.zdlpuopuiu.zoijcleaow(obj2);
                }
                return wwaezpbzkn.f37140iobyxmoadg;
            }
        }

        public yggfygwlhe(sj.lqeggnwhkg lqeggnwhkgVar) {
            this.f49791zdlpuopuiu = lqeggnwhkgVar;
        }

        @Override // sj.lqeggnwhkg
        public Object collect(sj.nufgyqmvbu nufgyqmvbuVar, lg.gxszxtbevo gxszxtbevoVar) {
            Object objCollect = this.f49791zdlpuopuiu.collect(new iobyxmoadg(nufgyqmvbuVar), gxszxtbevoVar);
            return objCollect == mg.zoijcleaow.gxszxtbevo() ? objCollect : wwaezpbzkn.f37140iobyxmoadg;
        }
    }

    public static final class zdlpuopuiu implements sj.lqeggnwhkg {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final /* synthetic */ sj.lqeggnwhkg f49796zdlpuopuiu;

        public static final class iobyxmoadg implements sj.nufgyqmvbu {

            /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
            final /* synthetic */ sj.nufgyqmvbu f49797zdlpuopuiu;

            /* JADX INFO: renamed from: iw1.zoijcleaow$zdlpuopuiu$iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
            public static final class C1059iobyxmoadg extends kotlin.coroutines.jvm.internal.wkgbmnqykc {

                /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
                int f49799yggfygwlhe;

                /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
                /* synthetic */ Object f49800zdlpuopuiu;

                public C1059iobyxmoadg(lg.gxszxtbevo gxszxtbevoVar) {
                    super(gxszxtbevoVar);
                }

                @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
                public final Object invokeSuspend(Object obj) {
                    this.f49800zdlpuopuiu = obj;
                    this.f49799yggfygwlhe |= Integer.MIN_VALUE;
                    return iobyxmoadg.this.emit(null, this);
                }
            }

            public iobyxmoadg(sj.nufgyqmvbu nufgyqmvbuVar) {
                this.f49797zdlpuopuiu = nufgyqmvbuVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // sj.nufgyqmvbu
            public final Object emit(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
                C1059iobyxmoadg c1059iobyxmoadg;
                if (gxszxtbevoVar instanceof C1059iobyxmoadg) {
                    c1059iobyxmoadg = (C1059iobyxmoadg) gxszxtbevoVar;
                    int i13 = c1059iobyxmoadg.f49799yggfygwlhe;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        c1059iobyxmoadg.f49799yggfygwlhe = i13 - Integer.MIN_VALUE;
                    } else {
                        c1059iobyxmoadg = new C1059iobyxmoadg(gxszxtbevoVar);
                    }
                } else {
                    c1059iobyxmoadg = new C1059iobyxmoadg(gxszxtbevoVar);
                }
                Object obj2 = c1059iobyxmoadg.f49800zdlpuopuiu;
                Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
                int i14 = c1059iobyxmoadg.f49799yggfygwlhe;
                if (i14 == 0) {
                    gg.zdlpuopuiu.zoijcleaow(obj2);
                    sj.nufgyqmvbu nufgyqmvbuVar = this.f49797zdlpuopuiu;
                    dw1.ppxfxbqfkf ppxfxbqfkfVar = (dw1.ppxfxbqfkf) obj;
                    Object isAuth = ppxfxbqfkfVar != null ? new UserState.IsAuth(gw1.iobyxmoadg.iwizpuwonk(ppxfxbqfkfVar)) : UserState.NonAuth.f102010zdlpuopuiu;
                    c1059iobyxmoadg.f49799yggfygwlhe = 1;
                    if (nufgyqmvbuVar.emit(isAuth, c1059iobyxmoadg) == objGxszxtbevo) {
                        return objGxszxtbevo;
                    }
                } else {
                    if (i14 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    gg.zdlpuopuiu.zoijcleaow(obj2);
                }
                return wwaezpbzkn.f37140iobyxmoadg;
            }
        }

        public zdlpuopuiu(sj.lqeggnwhkg lqeggnwhkgVar) {
            this.f49796zdlpuopuiu = lqeggnwhkgVar;
        }

        @Override // sj.lqeggnwhkg
        public Object collect(sj.nufgyqmvbu nufgyqmvbuVar, lg.gxszxtbevo gxszxtbevoVar) {
            Object objCollect = this.f49796zdlpuopuiu.collect(new iobyxmoadg(nufgyqmvbuVar), gxszxtbevoVar);
            return objCollect == mg.zoijcleaow.gxszxtbevo() ? objCollect : wwaezpbzkn.f37140iobyxmoadg;
        }
    }

    /* JADX INFO: renamed from: iw1.zoijcleaow$zoijcleaow, reason: collision with other inner class name */
    /* synthetic */ class C1060zoijcleaow extends kotlin.jvm.internal.vdvldrhtss implements tg.draadjrbmk {
        C1060zoijcleaow(Object obj) {
            super(1, obj, kw1.iobyxmoadg.C1221iobyxmoadg.class, "factory", "factory(Lru/myspar/proloyalty/core/network/model/ErrorResponse;)Ljava/lang/Throwable;", 0);
        }

        @Override // tg.draadjrbmk
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public final Throwable invoke(ErrorResponse p13) {
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(p13, "p0");
            return ((kw1.iobyxmoadg.C1221iobyxmoadg) this.receiver).iobyxmoadg(p13);
        }
    }

    static final class zynmafqrjb extends kotlin.coroutines.jvm.internal.wkgbmnqykc {

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        int f49801jyumaefscl;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        /* synthetic */ Object f49803zdlpuopuiu;

        zynmafqrjb(lg.gxszxtbevo gxszxtbevoVar) {
            super(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            this.f49803zdlpuopuiu = obj;
            this.f49801jyumaefscl |= Integer.MIN_VALUE;
            return zoijcleaow.this.hkdspvbjdz(null, this);
        }
    }

    public zoijcleaow(fw1.iobyxmoadg userLocalSource, wv1.zoijcleaow userApi, wv1.iobyxmoadg authApi, wv1.ppxfxbqfkf userOldApi) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(userLocalSource, "userLocalSource");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(userApi, "userApi");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(authApi, "authApi");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(userOldApi, "userOldApi");
        this.f49698iobyxmoadg = userLocalSource;
        this.f49702zoijcleaow = userApi;
        this.f49700ppxfxbqfkf = authApi;
        this.f49701wkgbmnqykc = userOldApi;
        this.f49696eablkybsjg = new kcexrzcfyt(userLocalSource.zynmafqrjb());
        this.f49697gxszxtbevo = new zdlpuopuiu(userLocalSource.yadqdtsiqt());
        this.f49699lqeggnwhkg = new yggfygwlhe(userLocalSource.iwizpuwonk());
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // iw1.iobyxmoadg
    public Object cdpycssgdh(String str, String str2, lg.gxszxtbevo gxszxtbevoVar) throws Throwable {
        pmvmpeiblj pmvmpeibljVar;
        if (gxszxtbevoVar instanceof pmvmpeiblj) {
            pmvmpeibljVar = (pmvmpeiblj) gxszxtbevoVar;
            int i13 = pmvmpeibljVar.f49769jyumaefscl;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                pmvmpeibljVar.f49769jyumaefscl = i13 - Integer.MIN_VALUE;
            } else {
                pmvmpeibljVar = new pmvmpeiblj(gxszxtbevoVar);
            }
        } else {
            pmvmpeibljVar = new pmvmpeiblj(gxszxtbevoVar);
        }
        Object objGxszxtbevo = pmvmpeibljVar.f49771zdlpuopuiu;
        Object objGxszxtbevo2 = mg.zoijcleaow.gxszxtbevo();
        int i14 = pmvmpeibljVar.f49769jyumaefscl;
        if (i14 == 0) {
            gg.zdlpuopuiu.zoijcleaow(objGxszxtbevo);
            wv1.iobyxmoadg iobyxmoadgVar = this.f49700ppxfxbqfkf;
            UserUploadDeviceInfoRequest dxjokdxxwwVarWflxmlrfwp = gw1.iobyxmoadg.wflxmlrfwp(UserUploadDeviceInfoRequest.INSTANCE, str2, str, gw1.iobyxmoadg.ojitshcjhn(uw0.ppxfxbqfkf.f114521iobyxmoadg));
            pmvmpeibljVar.f49769jyumaefscl = 1;
            objGxszxtbevo = iobyxmoadgVar.gxszxtbevo(dxjokdxxwwVarWflxmlrfwp, pmvmpeibljVar);
            if (objGxszxtbevo == objGxszxtbevo2) {
                return objGxszxtbevo2;
            }
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            gg.zdlpuopuiu.zoijcleaow(objGxszxtbevo);
        }
        x21.wkgbmnqykc.agtfadlqog((BasicResponse) objGxszxtbevo, null, 1, null);
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    @Override // iw1.iobyxmoadg
    public UserNews cllcsxoeiz() {
        UserNewsEntity userNewsEntityLmojexxdyd = this.f49698iobyxmoadg.lmojexxdyd();
        if (userNewsEntityLmojexxdyd != null) {
            return gw1.iobyxmoadg.esjtqupxsv(userNewsEntityLmojexxdyd);
        }
        return null;
    }

    @Override // iw1.iobyxmoadg
    public LocalDate cqumvgiudr() {
        return this.f49698iobyxmoadg.cqumvgiudr();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // iw1.iobyxmoadg
    public Object crxdokpmqz(TokenInfo tokenInfo, UserInfo userInfo, lg.gxszxtbevo gxszxtbevoVar) {
        agtfadlqog agtfadlqogVar;
        zoijcleaow zoijcleaowVar;
        if (gxszxtbevoVar instanceof agtfadlqog) {
            agtfadlqogVar = (agtfadlqog) gxszxtbevoVar;
            int i13 = agtfadlqogVar.f49703cqumvgiudr;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                agtfadlqogVar.f49703cqumvgiudr = i13 - Integer.MIN_VALUE;
            } else {
                agtfadlqogVar = new agtfadlqog(gxszxtbevoVar);
            }
        } else {
            agtfadlqogVar = new agtfadlqog(gxszxtbevoVar);
        }
        Object obj = agtfadlqogVar.f49705jyumaefscl;
        Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
        int i14 = agtfadlqogVar.f49703cqumvgiudr;
        if (i14 != 0) {
            if (i14 == 1) {
                userInfo = (UserInfo) agtfadlqogVar.f49706yggfygwlhe;
                zoijcleaowVar = (zoijcleaow) agtfadlqogVar.f49707zdlpuopuiu;
                gg.zdlpuopuiu.zoijcleaow(obj);
            } else {
                if (i14 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                gg.zdlpuopuiu.zoijcleaow(obj);
            }
            return wwaezpbzkn.f37140iobyxmoadg;
        }
        gg.zdlpuopuiu.zoijcleaow(obj);
        fw1.iobyxmoadg iobyxmoadgVar = this.f49698iobyxmoadg;
        TokenInfoEntity tokenInfoEntityIozdgvuglv = gw1.iobyxmoadg.iozdgvuglv(tokenInfo);
        agtfadlqogVar.f49707zdlpuopuiu = this;
        agtfadlqogVar.f49706yggfygwlhe = userInfo;
        agtfadlqogVar.f49703cqumvgiudr = 1;
        if (iobyxmoadgVar.cdpycssgdh(tokenInfoEntityIozdgvuglv, agtfadlqogVar) == objGxszxtbevo) {
            return objGxszxtbevo;
        }
        zoijcleaowVar = this;
        fw1.iobyxmoadg iobyxmoadgVar2 = zoijcleaowVar.f49698iobyxmoadg;
        dw1.ppxfxbqfkf ppxfxbqfkfVarLmojexxdyd = gw1.iobyxmoadg.lmojexxdyd(userInfo);
        agtfadlqogVar.f49707zdlpuopuiu = null;
        agtfadlqogVar.f49706yggfygwlhe = null;
        agtfadlqogVar.f49703cqumvgiudr = 2;
        if (iobyxmoadgVar2.iozdgvuglv(ppxfxbqfkfVarLmojexxdyd, agtfadlqogVar) == objGxszxtbevo) {
            return objGxszxtbevo;
        }
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // iw1.iobyxmoadg
    public Object dsvhmnatus(lg.gxszxtbevo gxszxtbevoVar) {
        dxjokdxxww dxjokdxxwwVar;
        if (gxszxtbevoVar instanceof dxjokdxxww) {
            dxjokdxxwwVar = (dxjokdxxww) gxszxtbevoVar;
            int i13 = dxjokdxxwwVar.f49720jyumaefscl;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                dxjokdxxwwVar.f49720jyumaefscl = i13 - Integer.MIN_VALUE;
            } else {
                dxjokdxxwwVar = new dxjokdxxww(gxszxtbevoVar);
            }
        } else {
            dxjokdxxwwVar = new dxjokdxxww(gxszxtbevoVar);
        }
        Object objPpxfxbqfkf = dxjokdxxwwVar.f49722zdlpuopuiu;
        Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
        int i14 = dxjokdxxwwVar.f49720jyumaefscl;
        if (i14 == 0) {
            gg.zdlpuopuiu.zoijcleaow(objPpxfxbqfkf);
            wv1.ppxfxbqfkf ppxfxbqfkfVar = this.f49701wkgbmnqykc;
            dxjokdxxwwVar.f49720jyumaefscl = 1;
            objPpxfxbqfkf = ppxfxbqfkfVar.ppxfxbqfkf(dxjokdxxwwVar);
            if (objPpxfxbqfkf == objGxszxtbevo) {
                return objGxszxtbevo;
            }
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            gg.zdlpuopuiu.zoijcleaow(objPpxfxbqfkf);
        }
        return gw1.iobyxmoadg.lereixgezr((UserSharePromoDto) x21.wkgbmnqykc.oxmwwwfdhm((BasicResponse) objPpxfxbqfkf, null, 1, null));
    }

    @Override // iw1.iobyxmoadg
    public void eablkybsjg(LocalDate localDate) {
        this.f49698iobyxmoadg.eablkybsjg(localDate);
    }

    @Override // iw1.iobyxmoadg
    public void esjtqupxsv(LocalDate localDate) {
        this.f49698iobyxmoadg.esjtqupxsv(localDate);
    }

    @Override // iw1.iobyxmoadg
    public void gxszxtbevo(boolean z13) {
        this.f49698iobyxmoadg.gxszxtbevo(z13);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // iw1.iobyxmoadg
    public Object hcddaimhww(nw1.gxszxtbevo gxszxtbevoVar, lg.gxszxtbevo gxszxtbevoVar2) {
        vdvldrhtss vdvldrhtssVar;
        zoijcleaow zoijcleaowVar;
        if (gxszxtbevoVar2 instanceof vdvldrhtss) {
            vdvldrhtssVar = (vdvldrhtss) gxszxtbevoVar2;
            int i13 = vdvldrhtssVar.f49780cqumvgiudr;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                vdvldrhtssVar.f49780cqumvgiudr = i13 - Integer.MIN_VALUE;
            } else {
                vdvldrhtssVar = new vdvldrhtss(gxszxtbevoVar2);
            }
        } else {
            vdvldrhtssVar = new vdvldrhtss(gxszxtbevoVar2);
        }
        Object objZoijcleaow = vdvldrhtssVar.f49782jyumaefscl;
        Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
        int i14 = vdvldrhtssVar.f49780cqumvgiudr;
        if (i14 != 0) {
            if (i14 == 1) {
                gxszxtbevoVar = (nw1.gxszxtbevo) vdvldrhtssVar.f49783yggfygwlhe;
                zoijcleaowVar = (zoijcleaow) vdvldrhtssVar.f49784zdlpuopuiu;
                gg.zdlpuopuiu.zoijcleaow(objZoijcleaow);
            } else {
                if (i14 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                gg.zdlpuopuiu.zoijcleaow(objZoijcleaow);
            }
            return wwaezpbzkn.f37140iobyxmoadg;
        }
        gg.zdlpuopuiu.zoijcleaow(objZoijcleaow);
        fw1.iobyxmoadg iobyxmoadgVar = this.f49698iobyxmoadg;
        vdvldrhtssVar.f49784zdlpuopuiu = this;
        vdvldrhtssVar.f49783yggfygwlhe = gxszxtbevoVar;
        vdvldrhtssVar.f49780cqumvgiudr = 1;
        objZoijcleaow = iobyxmoadgVar.zoijcleaow(vdvldrhtssVar);
        if (objZoijcleaow == objGxszxtbevo) {
            return objGxszxtbevo;
        }
        zoijcleaowVar = this;
        dw1.ppxfxbqfkf ppxfxbqfkfVar = (dw1.ppxfxbqfkf) objZoijcleaow;
        if (ppxfxbqfkfVar != null) {
            fw1.iobyxmoadg iobyxmoadgVar2 = zoijcleaowVar.f49698iobyxmoadg;
            dw1.ppxfxbqfkf ppxfxbqfkfVarGtknphoqwx = gw1.iobyxmoadg.gtknphoqwx(ppxfxbqfkfVar, gxszxtbevoVar);
            vdvldrhtssVar.f49784zdlpuopuiu = null;
            vdvldrhtssVar.f49783yggfygwlhe = null;
            vdvldrhtssVar.f49780cqumvgiudr = 2;
            if (iobyxmoadgVar2.iozdgvuglv(ppxfxbqfkfVarGtknphoqwx, vdvldrhtssVar) == objGxszxtbevo) {
                return objGxszxtbevo;
            }
        }
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // iw1.iobyxmoadg
    public Object hkdspvbjdz(nw1.wkgbmnqykc wkgbmnqykcVar, lg.gxszxtbevo gxszxtbevoVar) throws Throwable {
        zynmafqrjb zynmafqrjbVar;
        if (gxszxtbevoVar instanceof zynmafqrjb) {
            zynmafqrjbVar = (zynmafqrjb) gxszxtbevoVar;
            int i13 = zynmafqrjbVar.f49801jyumaefscl;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                zynmafqrjbVar.f49801jyumaefscl = i13 - Integer.MIN_VALUE;
            } else {
                zynmafqrjbVar = new zynmafqrjb(gxszxtbevoVar);
            }
        } else {
            zynmafqrjbVar = new zynmafqrjb(gxszxtbevoVar);
        }
        Object objZoijcleaow = zynmafqrjbVar.f49803zdlpuopuiu;
        Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
        int i14 = zynmafqrjbVar.f49801jyumaefscl;
        if (i14 == 0) {
            gg.zdlpuopuiu.zoijcleaow(objZoijcleaow);
            wv1.zoijcleaow zoijcleaowVar = this.f49702zoijcleaow;
            UserSettingsRequest lqeggnwhkgVarCdpycssgdh = gw1.iobyxmoadg.cdpycssgdh(wkgbmnqykcVar);
            zynmafqrjbVar.f49801jyumaefscl = 1;
            objZoijcleaow = zoijcleaowVar.zoijcleaow(lqeggnwhkgVarCdpycssgdh, zynmafqrjbVar);
            if (objZoijcleaow == objGxszxtbevo) {
                return objGxszxtbevo;
            }
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            gg.zdlpuopuiu.zoijcleaow(objZoijcleaow);
        }
        x21.wkgbmnqykc.agtfadlqog((BasicResponse) objZoijcleaow, null, 1, null);
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    @Override // iw1.iobyxmoadg
    public Object iobyxmoadg(lg.gxszxtbevo gxszxtbevoVar) {
        Object objIobyxmoadg = this.f49698iobyxmoadg.iobyxmoadg(gxszxtbevoVar);
        return objIobyxmoadg == mg.zoijcleaow.gxszxtbevo() ? objIobyxmoadg : wwaezpbzkn.f37140iobyxmoadg;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // iw1.iobyxmoadg
    public Object iozdgvuglv(boolean z13, lg.gxszxtbevo gxszxtbevoVar) throws Throwable {
        esjtqupxsv esjtqupxsvVar;
        if (gxszxtbevoVar instanceof esjtqupxsv) {
            esjtqupxsvVar = (esjtqupxsv) gxszxtbevoVar;
            int i13 = esjtqupxsvVar.f49726jyumaefscl;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                esjtqupxsvVar.f49726jyumaefscl = i13 - Integer.MIN_VALUE;
            } else {
                esjtqupxsvVar = new esjtqupxsv(gxszxtbevoVar);
            }
        } else {
            esjtqupxsvVar = new esjtqupxsv(gxszxtbevoVar);
        }
        Object objLqeggnwhkg = esjtqupxsvVar.f49728zdlpuopuiu;
        Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
        int i14 = esjtqupxsvVar.f49726jyumaefscl;
        if (i14 == 0) {
            gg.zdlpuopuiu.zoijcleaow(objLqeggnwhkg);
            wv1.zoijcleaow zoijcleaowVar = this.f49702zoijcleaow;
            UserEReceiptRequest zoijcleaowVar2 = new UserEReceiptRequest(z13);
            esjtqupxsvVar.f49726jyumaefscl = 1;
            objLqeggnwhkg = zoijcleaowVar.lqeggnwhkg(zoijcleaowVar2, esjtqupxsvVar);
            if (objLqeggnwhkg == objGxszxtbevo) {
                return objGxszxtbevo;
            }
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            gg.zdlpuopuiu.zoijcleaow(objLqeggnwhkg);
        }
        x21.wkgbmnqykc.agtfadlqog((BasicResponse) objLqeggnwhkg, null, 1, null);
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // iw1.iobyxmoadg
    public Object istkbnxepw(String str, boolean z13, lg.gxszxtbevo gxszxtbevoVar) throws Throwable {
        jyumaefscl jyumaefsclVar;
        if (gxszxtbevoVar instanceof jyumaefscl) {
            jyumaefsclVar = (jyumaefscl) gxszxtbevoVar;
            int i13 = jyumaefsclVar.f49744jyumaefscl;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                jyumaefsclVar.f49744jyumaefscl = i13 - Integer.MIN_VALUE;
            } else {
                jyumaefsclVar = new jyumaefscl(gxszxtbevoVar);
            }
        } else {
            jyumaefsclVar = new jyumaefscl(gxszxtbevoVar);
        }
        Object objIobyxmoadg = jyumaefsclVar.f49746zdlpuopuiu;
        Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
        int i14 = jyumaefsclVar.f49744jyumaefscl;
        if (i14 == 0) {
            gg.zdlpuopuiu.zoijcleaow(objIobyxmoadg);
            wv1.ppxfxbqfkf ppxfxbqfkfVar = this.f49701wkgbmnqykc;
            UserChangeFavoriteRequest iobyxmoadgVarAgtfadlqog = gw1.iobyxmoadg.agtfadlqog(UserChangeFavoriteRequest.INSTANCE, str, z13);
            jyumaefsclVar.f49744jyumaefscl = 1;
            objIobyxmoadg = ppxfxbqfkfVar.iobyxmoadg(iobyxmoadgVarAgtfadlqog, jyumaefsclVar);
            if (objIobyxmoadg == objGxszxtbevo) {
                return objGxszxtbevo;
            }
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            gg.zdlpuopuiu.zoijcleaow(objIobyxmoadg);
        }
        x21.wkgbmnqykc.agtfadlqog((BasicResponse) objIobyxmoadg, null, 1, null);
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    @Override // iw1.iobyxmoadg
    public sj.lqeggnwhkg iwizpuwonk() {
        return this.f49699lqeggnwhkg;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // iw1.iobyxmoadg
    public Object jpowsppfya(boolean z13, lg.gxszxtbevo gxszxtbevoVar) {
        ojitshcjhn ojitshcjhnVar;
        zoijcleaow zoijcleaowVar;
        if (gxszxtbevoVar instanceof ojitshcjhn) {
            ojitshcjhnVar = (ojitshcjhn) gxszxtbevoVar;
            int i13 = ojitshcjhnVar.f49761cqumvgiudr;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                ojitshcjhnVar.f49761cqumvgiudr = i13 - Integer.MIN_VALUE;
            } else {
                ojitshcjhnVar = new ojitshcjhn(gxszxtbevoVar);
            }
        } else {
            ojitshcjhnVar = new ojitshcjhn(gxszxtbevoVar);
        }
        Object objZoijcleaow = ojitshcjhnVar.f49763jyumaefscl;
        Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
        int i14 = ojitshcjhnVar.f49761cqumvgiudr;
        if (i14 != 0) {
            if (i14 == 1) {
                z13 = ojitshcjhnVar.f49764yggfygwlhe;
                zoijcleaowVar = (zoijcleaow) ojitshcjhnVar.f49765zdlpuopuiu;
                gg.zdlpuopuiu.zoijcleaow(objZoijcleaow);
            } else {
                if (i14 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                gg.zdlpuopuiu.zoijcleaow(objZoijcleaow);
            }
            return wwaezpbzkn.f37140iobyxmoadg;
        }
        gg.zdlpuopuiu.zoijcleaow(objZoijcleaow);
        fw1.iobyxmoadg iobyxmoadgVar = this.f49698iobyxmoadg;
        ojitshcjhnVar.f49765zdlpuopuiu = this;
        ojitshcjhnVar.f49764yggfygwlhe = z13;
        ojitshcjhnVar.f49761cqumvgiudr = 1;
        objZoijcleaow = iobyxmoadgVar.zoijcleaow(ojitshcjhnVar);
        if (objZoijcleaow == objGxszxtbevo) {
            return objGxszxtbevo;
        }
        zoijcleaowVar = this;
        dw1.ppxfxbqfkf ppxfxbqfkfVar = (dw1.ppxfxbqfkf) objZoijcleaow;
        if (ppxfxbqfkfVar != null) {
            fw1.iobyxmoadg iobyxmoadgVar2 = zoijcleaowVar.f49698iobyxmoadg;
            dw1.ppxfxbqfkf ppxfxbqfkfVarDxjokdxxww = gw1.iobyxmoadg.dxjokdxxww(ppxfxbqfkfVar, z13);
            ojitshcjhnVar.f49765zdlpuopuiu = null;
            ojitshcjhnVar.f49761cqumvgiudr = 2;
            if (iobyxmoadgVar2.iozdgvuglv(ppxfxbqfkfVarDxjokdxxww, ojitshcjhnVar) == objGxszxtbevo) {
                return objGxszxtbevo;
            }
        }
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    @Override // iw1.iobyxmoadg
    public boolean jyumaefscl() {
        return this.f49698iobyxmoadg.jyumaefscl();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // iw1.iobyxmoadg
    public Object kcexrzcfyt(lg.gxszxtbevo gxszxtbevoVar) throws Throwable {
        iwizpuwonk iwizpuwonkVar;
        if (gxszxtbevoVar instanceof iwizpuwonk) {
            iwizpuwonkVar = (iwizpuwonk) gxszxtbevoVar;
            int i13 = iwizpuwonkVar.f49741jyumaefscl;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                iwizpuwonkVar.f49741jyumaefscl = i13 - Integer.MIN_VALUE;
            } else {
                iwizpuwonkVar = new iwizpuwonk(gxszxtbevoVar);
            }
        } else {
            iwizpuwonkVar = new iwizpuwonk(gxszxtbevoVar);
        }
        Object objKcexrzcfyt = iwizpuwonkVar.f49743zdlpuopuiu;
        Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
        int i14 = iwizpuwonkVar.f49741jyumaefscl;
        if (i14 == 0) {
            gg.zdlpuopuiu.zoijcleaow(objKcexrzcfyt);
            wv1.zoijcleaow zoijcleaowVar = this.f49702zoijcleaow;
            iwizpuwonkVar.f49741jyumaefscl = 1;
            objKcexrzcfyt = zoijcleaowVar.kcexrzcfyt(iwizpuwonkVar);
            if (objKcexrzcfyt == objGxszxtbevo) {
                return objGxszxtbevo;
            }
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            gg.zdlpuopuiu.zoijcleaow(objKcexrzcfyt);
        }
        x21.wkgbmnqykc.agtfadlqog((BasicResponse) objKcexrzcfyt, null, 1, null);
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // iw1.iobyxmoadg
    public Object kegysxyocb(boolean z13, lg.gxszxtbevo gxszxtbevoVar) {
        rgvfuqvkyq rgvfuqvkyqVar;
        zoijcleaow zoijcleaowVar;
        if (gxszxtbevoVar instanceof rgvfuqvkyq) {
            rgvfuqvkyqVar = (rgvfuqvkyq) gxszxtbevoVar;
            int i13 = rgvfuqvkyqVar.f49775cqumvgiudr;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                rgvfuqvkyqVar.f49775cqumvgiudr = i13 - Integer.MIN_VALUE;
            } else {
                rgvfuqvkyqVar = new rgvfuqvkyq(gxszxtbevoVar);
            }
        } else {
            rgvfuqvkyqVar = new rgvfuqvkyq(gxszxtbevoVar);
        }
        Object objZoijcleaow = rgvfuqvkyqVar.f49777jyumaefscl;
        Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
        int i14 = rgvfuqvkyqVar.f49775cqumvgiudr;
        if (i14 != 0) {
            if (i14 == 1) {
                z13 = rgvfuqvkyqVar.f49778yggfygwlhe;
                zoijcleaowVar = (zoijcleaow) rgvfuqvkyqVar.f49779zdlpuopuiu;
                gg.zdlpuopuiu.zoijcleaow(objZoijcleaow);
            } else {
                if (i14 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                gg.zdlpuopuiu.zoijcleaow(objZoijcleaow);
            }
            return wwaezpbzkn.f37140iobyxmoadg;
        }
        gg.zdlpuopuiu.zoijcleaow(objZoijcleaow);
        fw1.iobyxmoadg iobyxmoadgVar = this.f49698iobyxmoadg;
        rgvfuqvkyqVar.f49779zdlpuopuiu = this;
        rgvfuqvkyqVar.f49778yggfygwlhe = z13;
        rgvfuqvkyqVar.f49775cqumvgiudr = 1;
        objZoijcleaow = iobyxmoadgVar.zoijcleaow(rgvfuqvkyqVar);
        if (objZoijcleaow == objGxszxtbevo) {
            return objGxszxtbevo;
        }
        zoijcleaowVar = this;
        dw1.ppxfxbqfkf ppxfxbqfkfVar = (dw1.ppxfxbqfkf) objZoijcleaow;
        if (ppxfxbqfkfVar != null) {
            fw1.iobyxmoadg iobyxmoadgVar2 = zoijcleaowVar.f49698iobyxmoadg;
            dw1.ppxfxbqfkf ppxfxbqfkfVarBtonecajqb = gw1.iobyxmoadg.btonecajqb(ppxfxbqfkfVar, z13);
            rgvfuqvkyqVar.f49779zdlpuopuiu = null;
            rgvfuqvkyqVar.f49775cqumvgiudr = 2;
            if (iobyxmoadgVar2.iozdgvuglv(ppxfxbqfkfVarBtonecajqb, rgvfuqvkyqVar) == objGxszxtbevo) {
                return objGxszxtbevo;
            }
        }
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // iw1.iobyxmoadg
    public Object lereixgezr(lg.gxszxtbevo gxszxtbevoVar) throws Throwable {
        iobyxmoadg iobyxmoadgVar;
        if (gxszxtbevoVar instanceof iobyxmoadg) {
            iobyxmoadgVar = (iobyxmoadg) gxszxtbevoVar;
            int i13 = iobyxmoadgVar.f49735jyumaefscl;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                iobyxmoadgVar.f49735jyumaefscl = i13 - Integer.MIN_VALUE;
            } else {
                iobyxmoadgVar = new iobyxmoadg(gxszxtbevoVar);
            }
        } else {
            iobyxmoadgVar = new iobyxmoadg(gxszxtbevoVar);
        }
        Object objWkgbmnqykc = iobyxmoadgVar.f49737zdlpuopuiu;
        Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
        int i14 = iobyxmoadgVar.f49735jyumaefscl;
        if (i14 == 0) {
            gg.zdlpuopuiu.zoijcleaow(objWkgbmnqykc);
            wv1.ppxfxbqfkf ppxfxbqfkfVar = this.f49701wkgbmnqykc;
            iobyxmoadgVar.f49735jyumaefscl = 1;
            objWkgbmnqykc = ppxfxbqfkfVar.wkgbmnqykc(iobyxmoadgVar);
            if (objWkgbmnqykc == objGxszxtbevo) {
                return objGxszxtbevo;
            }
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            gg.zdlpuopuiu.zoijcleaow(objWkgbmnqykc);
        }
        x21.wkgbmnqykc.wflxmlrfwp((BasicResponse) objWkgbmnqykc, new C1060zoijcleaow(kw1.iobyxmoadg.f60788yggfygwlhe));
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // iw1.iobyxmoadg
    public Object lmojexxdyd(String str, lg.gxszxtbevo gxszxtbevoVar) {
        draadjrbmk draadjrbmkVar;
        if (gxszxtbevoVar instanceof draadjrbmk) {
            draadjrbmkVar = (draadjrbmk) gxszxtbevoVar;
            int i13 = draadjrbmkVar.f49717jyumaefscl;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                draadjrbmkVar.f49717jyumaefscl = i13 - Integer.MIN_VALUE;
            } else {
                draadjrbmkVar = new draadjrbmk(gxszxtbevoVar);
            }
        } else {
            draadjrbmkVar = new draadjrbmk(gxszxtbevoVar);
        }
        Object objEablkybsjg = draadjrbmkVar.f49719zdlpuopuiu;
        Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
        int i14 = draadjrbmkVar.f49717jyumaefscl;
        if (i14 == 0) {
            gg.zdlpuopuiu.zoijcleaow(objEablkybsjg);
            wv1.iobyxmoadg iobyxmoadgVar = this.f49700ppxfxbqfkf;
            AuthNewTokenRequest zoijcleaowVar = new AuthNewTokenRequest(str);
            draadjrbmkVar.f49717jyumaefscl = 1;
            objEablkybsjg = iobyxmoadgVar.eablkybsjg(zoijcleaowVar, draadjrbmkVar);
            if (objEablkybsjg == objGxszxtbevo) {
                return objGxszxtbevo;
            }
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            gg.zdlpuopuiu.zoijcleaow(objEablkybsjg);
        }
        return gw1.iobyxmoadg.yggfygwlhe((AuthTokenResponse) x21.wkgbmnqykc.oxmwwwfdhm((BasicResponse) objEablkybsjg, null, 1, null));
    }

    @Override // iw1.iobyxmoadg
    public void lqeggnwhkg(int i13) {
        this.f49698iobyxmoadg.lqeggnwhkg(i13);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // iw1.iobyxmoadg
    public Object mbcevpiqjq(String str, boolean z13, lg.gxszxtbevo gxszxtbevoVar) {
        istkbnxepw istkbnxepwVar;
        if (gxszxtbevoVar instanceof istkbnxepw) {
            istkbnxepwVar = (istkbnxepw) gxszxtbevoVar;
            int i13 = istkbnxepwVar.f49738jyumaefscl;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                istkbnxepwVar.f49738jyumaefscl = i13 - Integer.MIN_VALUE;
            } else {
                istkbnxepwVar = new istkbnxepw(gxszxtbevoVar);
            }
        } else {
            istkbnxepwVar = new istkbnxepw(gxszxtbevoVar);
        }
        Object objZoijcleaow = istkbnxepwVar.f49740zdlpuopuiu;
        Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
        int i14 = istkbnxepwVar.f49738jyumaefscl;
        if (i14 == 0) {
            gg.zdlpuopuiu.zoijcleaow(objZoijcleaow);
            wv1.zoijcleaow zoijcleaowVar = this.f49702zoijcleaow;
            UserSettingsRequest lqeggnwhkgVarDraadjrbmk = gw1.iobyxmoadg.draadjrbmk(UserSettingsRequest.INSTANCE, str, z13);
            istkbnxepwVar.f49738jyumaefscl = 1;
            objZoijcleaow = zoijcleaowVar.zoijcleaow(lqeggnwhkgVarDraadjrbmk, istkbnxepwVar);
            if (objZoijcleaow == objGxszxtbevo) {
                return objGxszxtbevo;
            }
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            gg.zdlpuopuiu.zoijcleaow(objZoijcleaow);
        }
        UploadUserSettingsResponse iobyxmoadgVar = (UploadUserSettingsResponse) x21.wkgbmnqykc.zdlpuopuiu((BasicResponse) objZoijcleaow);
        return new nw1.iobyxmoadg(iobyxmoadgVar != null ? iobyxmoadgVar.getSurveyUrl() : null);
    }

    @Override // iw1.iobyxmoadg
    public void ntlheqmsrt(UserNews userNews) {
        this.f49698iobyxmoadg.istkbnxepw(userNews != null ? gw1.iobyxmoadg.wwaezpbzkn(userNews) : null);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // iw1.iobyxmoadg
    public Object nufgyqmvbu(lg.gxszxtbevo gxszxtbevoVar) {
        gxszxtbevo gxszxtbevoVar2;
        if (gxszxtbevoVar instanceof gxszxtbevo) {
            gxszxtbevoVar2 = (gxszxtbevo) gxszxtbevoVar;
            int i13 = gxszxtbevoVar2.f49732jyumaefscl;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                gxszxtbevoVar2.f49732jyumaefscl = i13 - Integer.MIN_VALUE;
            } else {
                gxszxtbevoVar2 = new gxszxtbevo(gxszxtbevoVar);
            }
        } else {
            gxszxtbevoVar2 = new gxszxtbevo(gxszxtbevoVar);
        }
        Object objNufgyqmvbu = gxszxtbevoVar2.f49734zdlpuopuiu;
        Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
        int i14 = gxszxtbevoVar2.f49732jyumaefscl;
        if (i14 == 0) {
            gg.zdlpuopuiu.zoijcleaow(objNufgyqmvbu);
            wv1.zoijcleaow zoijcleaowVar = this.f49702zoijcleaow;
            gxszxtbevoVar2.f49732jyumaefscl = 1;
            objNufgyqmvbu = zoijcleaowVar.nufgyqmvbu(gxszxtbevoVar2);
            if (objNufgyqmvbu == objGxszxtbevo) {
                return objGxszxtbevo;
            }
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            gg.zdlpuopuiu.zoijcleaow(objNufgyqmvbu);
        }
        return gw1.iobyxmoadg.cqumvgiudr((UserGetNewsResponse) x21.wkgbmnqykc.oxmwwwfdhm((BasicResponse) objNufgyqmvbu, null, 1, null));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // iw1.iobyxmoadg
    public Object oxmwwwfdhm(lg.gxszxtbevo gxszxtbevoVar) {
        lqeggnwhkg lqeggnwhkgVar;
        if (gxszxtbevoVar instanceof lqeggnwhkg) {
            lqeggnwhkgVar = (lqeggnwhkg) gxszxtbevoVar;
            int i13 = lqeggnwhkgVar.f49755jyumaefscl;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                lqeggnwhkgVar.f49755jyumaefscl = i13 - Integer.MIN_VALUE;
            } else {
                lqeggnwhkgVar = new lqeggnwhkg(gxszxtbevoVar);
            }
        } else {
            lqeggnwhkgVar = new lqeggnwhkg(gxszxtbevoVar);
        }
        Object objOxmwwwfdhm = lqeggnwhkgVar.f49757zdlpuopuiu;
        Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
        int i14 = lqeggnwhkgVar.f49755jyumaefscl;
        if (i14 == 0) {
            gg.zdlpuopuiu.zoijcleaow(objOxmwwwfdhm);
            wv1.zoijcleaow zoijcleaowVar = this.f49702zoijcleaow;
            lqeggnwhkgVar.f49755jyumaefscl = 1;
            objOxmwwwfdhm = zoijcleaowVar.oxmwwwfdhm(lqeggnwhkgVar);
            if (objOxmwwwfdhm == objGxszxtbevo) {
                return objGxszxtbevo;
            }
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            gg.zdlpuopuiu.zoijcleaow(objOxmwwwfdhm);
        }
        return gw1.iobyxmoadg.oxmwwwfdhm((UserPersonalDataResponse) x21.wkgbmnqykc.oxmwwwfdhm((BasicResponse) objOxmwwwfdhm, null, 1, null));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // iw1.iobyxmoadg
    public Object pkzmftpjix(nw1.btonecajqb btonecajqbVar, String str, String str2, lg.gxszxtbevo gxszxtbevoVar) {
        cdpycssgdh cdpycssgdhVar;
        if (gxszxtbevoVar instanceof cdpycssgdh) {
            cdpycssgdhVar = (cdpycssgdh) gxszxtbevoVar;
            int i13 = cdpycssgdhVar.f49711jyumaefscl;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                cdpycssgdhVar.f49711jyumaefscl = i13 - Integer.MIN_VALUE;
            } else {
                cdpycssgdhVar = new cdpycssgdh(gxszxtbevoVar);
            }
        } else {
            cdpycssgdhVar = new cdpycssgdh(gxszxtbevoVar);
        }
        Object objZoijcleaow = cdpycssgdhVar.f49713zdlpuopuiu;
        Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
        int i14 = cdpycssgdhVar.f49711jyumaefscl;
        if (i14 == 0) {
            gg.zdlpuopuiu.zoijcleaow(objZoijcleaow);
            wv1.iobyxmoadg iobyxmoadgVar = this.f49700ppxfxbqfkf;
            AuthVerifyRequest wkgbmnqykcVarYadqdtsiqt = gw1.iobyxmoadg.yadqdtsiqt(btonecajqbVar, str, str2, gw1.iobyxmoadg.ojitshcjhn(uw0.ppxfxbqfkf.f114521iobyxmoadg));
            cdpycssgdhVar.f49711jyumaefscl = 1;
            objZoijcleaow = iobyxmoadgVar.zoijcleaow(wkgbmnqykcVarYadqdtsiqt, cdpycssgdhVar);
            if (objZoijcleaow == objGxszxtbevo) {
                return objGxszxtbevo;
            }
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            gg.zdlpuopuiu.zoijcleaow(objZoijcleaow);
        }
        return gw1.iobyxmoadg.yggfygwlhe((AuthTokenResponse) x21.wkgbmnqykc.oxmwwwfdhm((BasicResponse) objZoijcleaow, null, 1, null));
    }

    @Override // iw1.iobyxmoadg
    public TokenInfo pmvmpeiblj() {
        TokenInfoEntity tokenInfoEntityPmvmpeiblj = this.f49698iobyxmoadg.pmvmpeiblj();
        if (tokenInfoEntityPmvmpeiblj != null) {
            return gw1.iobyxmoadg.jyumaefscl(tokenInfoEntityPmvmpeiblj);
        }
        return null;
    }

    @Override // iw1.iobyxmoadg
    public Object ppxfxbqfkf(lg.gxszxtbevo gxszxtbevoVar) {
        String refreshToken;
        TokenInfoEntity tokenInfoEntityPmvmpeiblj = this.f49698iobyxmoadg.pmvmpeiblj();
        if (tokenInfoEntityPmvmpeiblj != null && (refreshToken = tokenInfoEntityPmvmpeiblj.getRefreshToken()) != null) {
            Object objPpxfxbqfkf = this.f49700ppxfxbqfkf.ppxfxbqfkf(new AuthLogoutRequest(refreshToken), gxszxtbevoVar);
            if (objPpxfxbqfkf == mg.zoijcleaow.gxszxtbevo()) {
                return objPpxfxbqfkf;
            }
        }
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    @Override // iw1.iobyxmoadg
    public boolean rgvfuqvkyq() {
        return this.f49698iobyxmoadg.pmvmpeiblj() != null;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // iw1.iobyxmoadg
    public Object sopmlzcsov(lg.gxszxtbevo gxszxtbevoVar) throws Throwable {
        ppxfxbqfkf ppxfxbqfkfVar;
        if (gxszxtbevoVar instanceof ppxfxbqfkf) {
            ppxfxbqfkfVar = (ppxfxbqfkf) gxszxtbevoVar;
            int i13 = ppxfxbqfkfVar.f49772jyumaefscl;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                ppxfxbqfkfVar.f49772jyumaefscl = i13 - Integer.MIN_VALUE;
            } else {
                ppxfxbqfkfVar = new ppxfxbqfkf(gxszxtbevoVar);
            }
        } else {
            ppxfxbqfkfVar = new ppxfxbqfkf(gxszxtbevoVar);
        }
        Object objIobyxmoadg = ppxfxbqfkfVar.f49774zdlpuopuiu;
        Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
        int i14 = ppxfxbqfkfVar.f49772jyumaefscl;
        if (i14 == 0) {
            gg.zdlpuopuiu.zoijcleaow(objIobyxmoadg);
            wv1.zoijcleaow zoijcleaowVar = this.f49702zoijcleaow;
            ppxfxbqfkfVar.f49772jyumaefscl = 1;
            objIobyxmoadg = zoijcleaowVar.iobyxmoadg(ppxfxbqfkfVar);
            if (objIobyxmoadg == objGxszxtbevo) {
                return objGxszxtbevo;
            }
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            gg.zdlpuopuiu.zoijcleaow(objIobyxmoadg);
        }
        x21.wkgbmnqykc.agtfadlqog((BasicResponse) objIobyxmoadg, null, 1, null);
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // iw1.iobyxmoadg
    public Object stevsuqkhv(lg.gxszxtbevo gxszxtbevoVar) {
        nufgyqmvbu nufgyqmvbuVar;
        if (gxszxtbevoVar instanceof nufgyqmvbu) {
            nufgyqmvbuVar = (nufgyqmvbu) gxszxtbevoVar;
            int i13 = nufgyqmvbuVar.f49758jyumaefscl;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                nufgyqmvbuVar.f49758jyumaefscl = i13 - Integer.MIN_VALUE;
            } else {
                nufgyqmvbuVar = new nufgyqmvbu(gxszxtbevoVar);
            }
        } else {
            nufgyqmvbuVar = new nufgyqmvbu(gxszxtbevoVar);
        }
        Object objGxszxtbevo = nufgyqmvbuVar.f49760zdlpuopuiu;
        Object objGxszxtbevo2 = mg.zoijcleaow.gxszxtbevo();
        int i14 = nufgyqmvbuVar.f49758jyumaefscl;
        if (i14 == 0) {
            gg.zdlpuopuiu.zoijcleaow(objGxszxtbevo);
            wv1.zoijcleaow zoijcleaowVar = this.f49702zoijcleaow;
            nufgyqmvbuVar.f49758jyumaefscl = 1;
            objGxszxtbevo = zoijcleaowVar.gxszxtbevo(nufgyqmvbuVar);
            if (objGxszxtbevo == objGxszxtbevo2) {
                return objGxszxtbevo2;
            }
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            gg.zdlpuopuiu.zoijcleaow(objGxszxtbevo);
        }
        return gw1.iobyxmoadg.kcexrzcfyt((UserSettingsResponse) x21.wkgbmnqykc.oxmwwwfdhm((BasicResponse) objGxszxtbevo, null, 1, null));
    }

    @Override // iw1.iobyxmoadg
    public sj.lqeggnwhkg tzroggbefp() {
        return this.f49697gxszxtbevo;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // iw1.iobyxmoadg
    public Object ulzqkzuiru(String str, lg.gxszxtbevo gxszxtbevoVar) {
        oxmwwwfdhm oxmwwwfdhmVar;
        if (gxszxtbevoVar instanceof oxmwwwfdhm) {
            oxmwwwfdhmVar = (oxmwwwfdhm) gxszxtbevoVar;
            int i13 = oxmwwwfdhmVar.f49766jyumaefscl;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                oxmwwwfdhmVar.f49766jyumaefscl = i13 - Integer.MIN_VALUE;
            } else {
                oxmwwwfdhmVar = new oxmwwwfdhm(gxszxtbevoVar);
            }
        } else {
            oxmwwwfdhmVar = new oxmwwwfdhm(gxszxtbevoVar);
        }
        Object objIobyxmoadg = oxmwwwfdhmVar.f49768zdlpuopuiu;
        Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
        int i14 = oxmwwwfdhmVar.f49766jyumaefscl;
        if (i14 == 0) {
            gg.zdlpuopuiu.zoijcleaow(objIobyxmoadg);
            wv1.iobyxmoadg iobyxmoadgVar = this.f49700ppxfxbqfkf;
            AuthSignupRequest ppxfxbqfkfVar = new AuthSignupRequest(str);
            oxmwwwfdhmVar.f49766jyumaefscl = 1;
            objIobyxmoadg = iobyxmoadgVar.iobyxmoadg(ppxfxbqfkfVar, oxmwwwfdhmVar);
            if (objIobyxmoadg == objGxszxtbevo) {
                return objGxszxtbevo;
            }
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            gg.zdlpuopuiu.zoijcleaow(objIobyxmoadg);
        }
        return gw1.iobyxmoadg.zdlpuopuiu((AuthSignupResponse) x21.wkgbmnqykc.oxmwwwfdhm((BasicResponse) objIobyxmoadg, null, 1, null));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // iw1.iobyxmoadg
    public Object vdvldrhtss(lg.gxszxtbevo gxszxtbevoVar) {
        btonecajqb btonecajqbVar;
        if (gxszxtbevoVar instanceof btonecajqb) {
            btonecajqbVar = (btonecajqb) gxszxtbevoVar;
            int i13 = btonecajqbVar.f49708jyumaefscl;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                btonecajqbVar.f49708jyumaefscl = i13 - Integer.MIN_VALUE;
            } else {
                btonecajqbVar = new btonecajqb(gxszxtbevoVar);
            }
        } else {
            btonecajqbVar = new btonecajqb(gxszxtbevoVar);
        }
        Object objVdvldrhtss = btonecajqbVar.f49710zdlpuopuiu;
        Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
        int i14 = btonecajqbVar.f49708jyumaefscl;
        if (i14 == 0) {
            gg.zdlpuopuiu.zoijcleaow(objVdvldrhtss);
            wv1.zoijcleaow zoijcleaowVar = this.f49702zoijcleaow;
            btonecajqbVar.f49708jyumaefscl = 1;
            objVdvldrhtss = zoijcleaowVar.vdvldrhtss(btonecajqbVar);
            if (objVdvldrhtss == objGxszxtbevo) {
                return objGxszxtbevo;
            }
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            gg.zdlpuopuiu.zoijcleaow(objVdvldrhtss);
        }
        return x21.wkgbmnqykc.oxmwwwfdhm((BasicResponse) objVdvldrhtss, null, 1, null);
    }

    @Override // iw1.iobyxmoadg
    public void wkgbmnqykc(boolean z13) {
        this.f49698iobyxmoadg.wkgbmnqykc(z13);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // iw1.iobyxmoadg
    public Object wwaezpbzkn(boolean z13, lg.gxszxtbevo gxszxtbevoVar) throws Throwable {
        cqumvgiudr cqumvgiudrVar;
        if (gxszxtbevoVar instanceof cqumvgiudr) {
            cqumvgiudrVar = (cqumvgiudr) gxszxtbevoVar;
            int i13 = cqumvgiudrVar.f49714jyumaefscl;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                cqumvgiudrVar.f49714jyumaefscl = i13 - Integer.MIN_VALUE;
            } else {
                cqumvgiudrVar = new cqumvgiudr(gxszxtbevoVar);
            }
        } else {
            cqumvgiudrVar = new cqumvgiudr(gxszxtbevoVar);
        }
        Object objWkgbmnqykc = cqumvgiudrVar.f49716zdlpuopuiu;
        Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
        int i14 = cqumvgiudrVar.f49714jyumaefscl;
        if (i14 == 0) {
            gg.zdlpuopuiu.zoijcleaow(objWkgbmnqykc);
            wv1.zoijcleaow zoijcleaowVar = this.f49702zoijcleaow;
            UserSetAgreementRequest gxszxtbevoVar2 = new UserSetAgreementRequest(z13);
            cqumvgiudrVar.f49714jyumaefscl = 1;
            objWkgbmnqykc = zoijcleaowVar.wkgbmnqykc(gxszxtbevoVar2, cqumvgiudrVar);
            if (objWkgbmnqykc == objGxszxtbevo) {
                return objGxszxtbevo;
            }
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            gg.zdlpuopuiu.zoijcleaow(objWkgbmnqykc);
        }
        x21.wkgbmnqykc.agtfadlqog((BasicResponse) objWkgbmnqykc, null, 1, null);
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // iw1.iobyxmoadg
    public Object wypolnanlu(lg.gxszxtbevo gxszxtbevoVar) {
        wkgbmnqykc wkgbmnqykcVar;
        if (gxszxtbevoVar instanceof wkgbmnqykc) {
            wkgbmnqykcVar = (wkgbmnqykc) gxszxtbevoVar;
            int i13 = wkgbmnqykcVar.f49788jyumaefscl;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                wkgbmnqykcVar.f49788jyumaefscl = i13 - Integer.MIN_VALUE;
            } else {
                wkgbmnqykcVar = new wkgbmnqykc(gxszxtbevoVar);
            }
        } else {
            wkgbmnqykcVar = new wkgbmnqykc(gxszxtbevoVar);
        }
        Object objWkgbmnqykc = wkgbmnqykcVar.f49790zdlpuopuiu;
        Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
        int i14 = wkgbmnqykcVar.f49788jyumaefscl;
        if (i14 == 0) {
            gg.zdlpuopuiu.zoijcleaow(objWkgbmnqykc);
            wv1.iobyxmoadg iobyxmoadgVar = this.f49700ppxfxbqfkf;
            wkgbmnqykcVar.f49788jyumaefscl = 1;
            objWkgbmnqykc = iobyxmoadgVar.wkgbmnqykc(wkgbmnqykcVar);
            if (objWkgbmnqykc == objGxszxtbevo) {
                return objGxszxtbevo;
            }
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            gg.zdlpuopuiu.zoijcleaow(objWkgbmnqykc);
        }
        return ((UserFetchPushTokensResponse) x21.wkgbmnqykc.oxmwwwfdhm((BasicResponse) objWkgbmnqykc, null, 1, null)).getPushTokens();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // iw1.iobyxmoadg
    public Object yadqdtsiqt(nw1.ppxfxbqfkf ppxfxbqfkfVar, lg.gxszxtbevo gxszxtbevoVar) {
        lereixgezr lereixgezrVar;
        if (gxszxtbevoVar instanceof lereixgezr) {
            lereixgezrVar = (lereixgezr) gxszxtbevoVar;
            int i13 = lereixgezrVar.f49752jyumaefscl;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                lereixgezrVar.f49752jyumaefscl = i13 - Integer.MIN_VALUE;
            } else {
                lereixgezrVar = new lereixgezr(gxszxtbevoVar);
            }
        } else {
            lereixgezrVar = new lereixgezr(gxszxtbevoVar);
        }
        Object objPpxfxbqfkf = lereixgezrVar.f49754zdlpuopuiu;
        Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
        int i14 = lereixgezrVar.f49752jyumaefscl;
        if (i14 == 0) {
            gg.zdlpuopuiu.zoijcleaow(objPpxfxbqfkf);
            wv1.zoijcleaow zoijcleaowVar = this.f49702zoijcleaow;
            UserEditPersonalDataRequest ppxfxbqfkfVarZynmafqrjb = gw1.iobyxmoadg.zynmafqrjb(ppxfxbqfkfVar);
            lereixgezrVar.f49752jyumaefscl = 1;
            objPpxfxbqfkf = zoijcleaowVar.ppxfxbqfkf(ppxfxbqfkfVarZynmafqrjb, lereixgezrVar);
            if (objPpxfxbqfkf == objGxszxtbevo) {
                return objGxszxtbevo;
            }
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            gg.zdlpuopuiu.zoijcleaow(objPpxfxbqfkf);
        }
        return gw1.iobyxmoadg.oxmwwwfdhm((UserPersonalDataResponse) x21.wkgbmnqykc.oxmwwwfdhm((BasicResponse) objPpxfxbqfkf, null, 1, null));
    }

    @Override // iw1.iobyxmoadg
    public int yggfygwlhe() {
        return this.f49698iobyxmoadg.yggfygwlhe();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // iw1.iobyxmoadg
    public Object ylkuphrtab(nw1.lqeggnwhkg lqeggnwhkgVar, String str, String str2, lg.gxszxtbevo gxszxtbevoVar) {
        wflxmlrfwp wflxmlrfwpVar;
        if (gxszxtbevoVar instanceof wflxmlrfwp) {
            wflxmlrfwpVar = (wflxmlrfwp) gxszxtbevoVar;
            int i13 = wflxmlrfwpVar.f49785jyumaefscl;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                wflxmlrfwpVar.f49785jyumaefscl = i13 - Integer.MIN_VALUE;
            } else {
                wflxmlrfwpVar = new wflxmlrfwp(gxszxtbevoVar);
            }
        } else {
            wflxmlrfwpVar = new wflxmlrfwp(gxszxtbevoVar);
        }
        Object objEablkybsjg = wflxmlrfwpVar.f49787zdlpuopuiu;
        Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
        int i14 = wflxmlrfwpVar.f49785jyumaefscl;
        if (i14 == 0) {
            gg.zdlpuopuiu.zoijcleaow(objEablkybsjg);
            wv1.zoijcleaow zoijcleaowVar = this.f49702zoijcleaow;
            String strRgvfuqvkyq = gw1.iobyxmoadg.rgvfuqvkyq(str);
            UserRegistrationRequest eablkybsjgVarIstkbnxepw = gw1.iobyxmoadg.istkbnxepw(lqeggnwhkgVar, str2);
            wflxmlrfwpVar.f49785jyumaefscl = 1;
            objEablkybsjg = zoijcleaowVar.eablkybsjg(strRgvfuqvkyq, eablkybsjgVarIstkbnxepw, wflxmlrfwpVar);
            if (objEablkybsjg == objGxszxtbevo) {
                return objGxszxtbevo;
            }
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            gg.zdlpuopuiu.zoijcleaow(objEablkybsjg);
        }
        return gw1.iobyxmoadg.yggfygwlhe((AuthTokenResponse) x21.wkgbmnqykc.oxmwwwfdhm((BasicResponse) objEablkybsjg, null, 1, null));
    }

    @Override // iw1.iobyxmoadg
    public LocalDate zdlpuopuiu() {
        return this.f49698iobyxmoadg.zdlpuopuiu();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // iw1.iobyxmoadg
    public Object zoijcleaow(lg.gxszxtbevo gxszxtbevoVar) {
        gtknphoqwx gtknphoqwxVar;
        if (gxszxtbevoVar instanceof gtknphoqwx) {
            gtknphoqwxVar = (gtknphoqwx) gxszxtbevoVar;
            int i13 = gtknphoqwxVar.f49729jyumaefscl;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                gtknphoqwxVar.f49729jyumaefscl = i13 - Integer.MIN_VALUE;
            } else {
                gtknphoqwxVar = new gtknphoqwx(gxszxtbevoVar);
            }
        } else {
            gtknphoqwxVar = new gtknphoqwx(gxszxtbevoVar);
        }
        Object objZoijcleaow = gtknphoqwxVar.f49731zdlpuopuiu;
        Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
        int i14 = gtknphoqwxVar.f49729jyumaefscl;
        if (i14 == 0) {
            gg.zdlpuopuiu.zoijcleaow(objZoijcleaow);
            fw1.iobyxmoadg iobyxmoadgVar = this.f49698iobyxmoadg;
            gtknphoqwxVar.f49729jyumaefscl = 1;
            objZoijcleaow = iobyxmoadgVar.zoijcleaow(gtknphoqwxVar);
            if (objZoijcleaow == objGxszxtbevo) {
                return objGxszxtbevo;
            }
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            gg.zdlpuopuiu.zoijcleaow(objZoijcleaow);
        }
        dw1.ppxfxbqfkf ppxfxbqfkfVar = (dw1.ppxfxbqfkf) objZoijcleaow;
        if (ppxfxbqfkfVar != null) {
            return gw1.iobyxmoadg.iwizpuwonk(ppxfxbqfkfVar);
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // iw1.iobyxmoadg
    public Object zynmafqrjb(lg.gxszxtbevo gxszxtbevoVar) {
        eablkybsjg eablkybsjgVar;
        if (gxszxtbevoVar instanceof eablkybsjg) {
            eablkybsjgVar = (eablkybsjg) gxszxtbevoVar;
            int i13 = eablkybsjgVar.f49723jyumaefscl;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                eablkybsjgVar.f49723jyumaefscl = i13 - Integer.MIN_VALUE;
            } else {
                eablkybsjgVar = new eablkybsjg(gxszxtbevoVar);
            }
        } else {
            eablkybsjgVar = new eablkybsjg(gxszxtbevoVar);
        }
        Object objZynmafqrjb = eablkybsjgVar.f49725zdlpuopuiu;
        Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
        int i14 = eablkybsjgVar.f49723jyumaefscl;
        if (i14 == 0) {
            gg.zdlpuopuiu.zoijcleaow(objZynmafqrjb);
            wv1.zoijcleaow zoijcleaowVar = this.f49702zoijcleaow;
            eablkybsjgVar.f49723jyumaefscl = 1;
            objZynmafqrjb = zoijcleaowVar.zynmafqrjb(eablkybsjgVar);
            if (objZynmafqrjb == objGxszxtbevo) {
                return objGxszxtbevo;
            }
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            gg.zdlpuopuiu.zoijcleaow(objZynmafqrjb);
        }
        return kotlin.coroutines.jvm.internal.zoijcleaow.iobyxmoadg(((UserGetAgreementResponse) x21.wkgbmnqykc.oxmwwwfdhm((BasicResponse) objZynmafqrjb, null, 1, null)).getIsAgreementAccepted());
    }
}
