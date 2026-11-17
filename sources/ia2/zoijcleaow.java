package ia2;

import ea2.ActivePushTokensResponse;
import gg.wwaezpbzkn;
import kotlin.jvm.internal.vdvldrhtss;
import kotlin.jvm.internal.zdlpuopuiu;
import la2.UpdateAgreementsParams;
import la2.UpdateEmailParamsRequest;
import la2.UpdateUserInfoParamsRequest;
import la2.UpdateUserNotificationsRequest;
import la2.UpdateUserPushTokenRequest;
import la2.UserChangeFavoriteRequest;
import ma2.UserDto;
import ma2.UserDynamicQrCodeDto;
import ma2.UserSharePromoDto;
import ru.myspar.core.error_handler.exceptions.SharePromoNotValidException;
import ru.myspar.core.network.model.BasicResponse;
import ru.myspar.core.network.model.ErrorResponse;
import ru.myspar.user.models.UserNotifications;

/* JADX INFO: loaded from: classes6.dex */
public final class zoijcleaow implements qa2.zoijcleaow {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final ja2.iobyxmoadg f42261iobyxmoadg;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final na2.iobyxmoadg f42262zoijcleaow;

    static final class agtfadlqog extends kotlin.coroutines.jvm.internal.wkgbmnqykc {

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        int f42263jyumaefscl;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        /* synthetic */ Object f42265zdlpuopuiu;

        agtfadlqog(lg.gxszxtbevo gxszxtbevoVar) {
            super(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            this.f42265zdlpuopuiu = obj;
            this.f42263jyumaefscl |= Integer.MIN_VALUE;
            return zoijcleaow.this.gxszxtbevo(null, this);
        }
    }

    static final class btonecajqb extends kotlin.coroutines.jvm.internal.wkgbmnqykc {

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        int f42266jyumaefscl;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        /* synthetic */ Object f42268zdlpuopuiu;

        btonecajqb(lg.gxszxtbevo gxszxtbevoVar) {
            super(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            this.f42268zdlpuopuiu = obj;
            this.f42266jyumaefscl |= Integer.MIN_VALUE;
            return zoijcleaow.this.nufgyqmvbu(null, this);
        }
    }

    static final class draadjrbmk extends kotlin.coroutines.jvm.internal.wkgbmnqykc {

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        int f42269jyumaefscl;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        /* synthetic */ Object f42271zdlpuopuiu;

        draadjrbmk(lg.gxszxtbevo gxszxtbevoVar) {
            super(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            this.f42271zdlpuopuiu = obj;
            this.f42269jyumaefscl |= Integer.MIN_VALUE;
            return zoijcleaow.this.ppxfxbqfkf(null, this);
        }
    }

    static final class dxjokdxxww extends kotlin.coroutines.jvm.internal.wkgbmnqykc {

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        int f42272jyumaefscl;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        /* synthetic */ Object f42274zdlpuopuiu;

        dxjokdxxww(lg.gxszxtbevo gxszxtbevoVar) {
            super(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            this.f42274zdlpuopuiu = obj;
            this.f42272jyumaefscl |= Integer.MIN_VALUE;
            return zoijcleaow.this.iobyxmoadg(false, this);
        }
    }

    static final class eablkybsjg extends kotlin.coroutines.jvm.internal.wkgbmnqykc {

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        int f42275jyumaefscl;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        /* synthetic */ Object f42277zdlpuopuiu;

        eablkybsjg(lg.gxszxtbevo gxszxtbevoVar) {
            super(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            this.f42277zdlpuopuiu = obj;
            this.f42275jyumaefscl |= Integer.MIN_VALUE;
            return zoijcleaow.this.draadjrbmk(this);
        }
    }

    static final class gtknphoqwx extends kotlin.coroutines.jvm.internal.wkgbmnqykc {

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        int f42278jyumaefscl;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        /* synthetic */ Object f42280zdlpuopuiu;

        gtknphoqwx(lg.gxszxtbevo gxszxtbevoVar) {
            super(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            this.f42280zdlpuopuiu = obj;
            this.f42278jyumaefscl |= Integer.MIN_VALUE;
            return zoijcleaow.this.lqeggnwhkg(null, this);
        }
    }

    static final class gxszxtbevo extends kotlin.coroutines.jvm.internal.wkgbmnqykc {

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        int f42281jyumaefscl;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        /* synthetic */ Object f42283zdlpuopuiu;

        gxszxtbevo(lg.gxszxtbevo gxszxtbevoVar) {
            super(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            this.f42283zdlpuopuiu = obj;
            this.f42281jyumaefscl |= Integer.MIN_VALUE;
            return zoijcleaow.this.gtknphoqwx(this);
        }
    }

    static final class iobyxmoadg extends kotlin.coroutines.jvm.internal.wkgbmnqykc {

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        int f42284jyumaefscl;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        /* synthetic */ Object f42286zdlpuopuiu;

        iobyxmoadg(lg.gxszxtbevo gxszxtbevoVar) {
            super(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            this.f42286zdlpuopuiu = obj;
            this.f42284jyumaefscl |= Integer.MIN_VALUE;
            return zoijcleaow.this.lereixgezr(this);
        }
    }

    static final class lqeggnwhkg extends kotlin.coroutines.jvm.internal.wkgbmnqykc {

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        int f42287jyumaefscl;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        /* synthetic */ Object f42289zdlpuopuiu;

        lqeggnwhkg(lg.gxszxtbevo gxszxtbevoVar) {
            super(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            this.f42289zdlpuopuiu = obj;
            this.f42287jyumaefscl |= Integer.MIN_VALUE;
            return zoijcleaow.this.eablkybsjg(this);
        }
    }

    static final class nufgyqmvbu extends kotlin.coroutines.jvm.internal.wkgbmnqykc {

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        int f42290jyumaefscl;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        /* synthetic */ Object f42292zdlpuopuiu;

        nufgyqmvbu(lg.gxszxtbevo gxszxtbevoVar) {
            super(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            this.f42292zdlpuopuiu = obj;
            this.f42290jyumaefscl |= Integer.MIN_VALUE;
            return zoijcleaow.this.wkgbmnqykc(this);
        }
    }

    static final class ppxfxbqfkf extends kotlin.coroutines.jvm.internal.wkgbmnqykc {

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        int f42293jyumaefscl;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        /* synthetic */ Object f42295zdlpuopuiu;

        ppxfxbqfkf(lg.gxszxtbevo gxszxtbevoVar) {
            super(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            this.f42295zdlpuopuiu = obj;
            this.f42293jyumaefscl |= Integer.MIN_VALUE;
            return zoijcleaow.this.btonecajqb(null, this);
        }
    }

    static final class wflxmlrfwp extends kotlin.coroutines.jvm.internal.wkgbmnqykc {

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        int f42296jyumaefscl;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        /* synthetic */ Object f42298zdlpuopuiu;

        wflxmlrfwp(lg.gxszxtbevo gxszxtbevoVar) {
            super(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            this.f42298zdlpuopuiu = obj;
            this.f42296jyumaefscl |= Integer.MIN_VALUE;
            return zoijcleaow.this.zoijcleaow(null, this);
        }
    }

    static final class wkgbmnqykc extends kotlin.coroutines.jvm.internal.wkgbmnqykc {

        /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
        int f42299iwizpuwonk;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        /* synthetic */ Object f42301yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        Object f42302zdlpuopuiu;

        wkgbmnqykc(lg.gxszxtbevo gxszxtbevoVar) {
            super(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            this.f42301yggfygwlhe = obj;
            this.f42299iwizpuwonk |= Integer.MIN_VALUE;
            return zoijcleaow.this.dxjokdxxww(this);
        }
    }

    /* JADX INFO: renamed from: ia2.zoijcleaow$zoijcleaow, reason: collision with other inner class name */
    /* synthetic */ class C0996zoijcleaow extends vdvldrhtss implements tg.draadjrbmk {
        C0996zoijcleaow(Object obj) {
            super(1, obj, ha2.iobyxmoadg.C0925iobyxmoadg.class, "factory", "factory(Lru/myspar/core/network/model/ErrorResponse;)Ljava/lang/Throwable;", 0);
        }

        @Override // tg.draadjrbmk
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public final Throwable invoke(ErrorResponse p13) {
            zdlpuopuiu.btonecajqb(p13, "p0");
            return ((ha2.iobyxmoadg.C0925iobyxmoadg) this.receiver).iobyxmoadg(p13);
        }
    }

    public zoijcleaow(ja2.iobyxmoadg userApiService, na2.iobyxmoadg dynamicQrCodeResponseMapper) {
        zdlpuopuiu.btonecajqb(userApiService, "userApiService");
        zdlpuopuiu.btonecajqb(dynamicQrCodeResponseMapper, "dynamicQrCodeResponseMapper");
        this.f42261iobyxmoadg = userApiService;
        this.f42262zoijcleaow = dynamicQrCodeResponseMapper;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Throwable agtfadlqog(ErrorResponse it) {
        zdlpuopuiu.btonecajqb(it, "it");
        return new SharePromoNotValidException(it.getMessage());
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // qa2.zoijcleaow
    public Object btonecajqb(ha2.zoijcleaow zoijcleaowVar, lg.gxszxtbevo gxszxtbevoVar) throws Throwable {
        ppxfxbqfkf ppxfxbqfkfVar;
        if (gxszxtbevoVar instanceof ppxfxbqfkf) {
            ppxfxbqfkfVar = (ppxfxbqfkf) gxszxtbevoVar;
            int i13 = ppxfxbqfkfVar.f42293jyumaefscl;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                ppxfxbqfkfVar.f42293jyumaefscl = i13 - Integer.MIN_VALUE;
            } else {
                ppxfxbqfkfVar = new ppxfxbqfkf(gxszxtbevoVar);
            }
        } else {
            ppxfxbqfkfVar = new ppxfxbqfkf(gxszxtbevoVar);
        }
        Object objIobyxmoadg = ppxfxbqfkfVar.f42295zdlpuopuiu;
        Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
        int i14 = ppxfxbqfkfVar.f42293jyumaefscl;
        if (i14 == 0) {
            gg.zdlpuopuiu.zoijcleaow(objIobyxmoadg);
            ja2.iobyxmoadg iobyxmoadgVar = this.f42261iobyxmoadg;
            UserChangeFavoriteRequest userChangeFavoriteRequestIobyxmoadg = la2.gtknphoqwx.iobyxmoadg(zoijcleaowVar);
            ppxfxbqfkfVar.f42293jyumaefscl = 1;
            objIobyxmoadg = iobyxmoadgVar.iobyxmoadg(userChangeFavoriteRequestIobyxmoadg, ppxfxbqfkfVar);
            if (objIobyxmoadg == objGxszxtbevo) {
                return objGxszxtbevo;
            }
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            gg.zdlpuopuiu.zoijcleaow(objIobyxmoadg);
        }
        o40.eablkybsjg.btonecajqb((BasicResponse) objIobyxmoadg, null, 1, null);
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // qa2.zoijcleaow
    public Object draadjrbmk(lg.gxszxtbevo gxszxtbevoVar) {
        eablkybsjg eablkybsjgVar;
        if (gxszxtbevoVar instanceof eablkybsjg) {
            eablkybsjgVar = (eablkybsjg) gxszxtbevoVar;
            int i13 = eablkybsjgVar.f42275jyumaefscl;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                eablkybsjgVar.f42275jyumaefscl = i13 - Integer.MIN_VALUE;
            } else {
                eablkybsjgVar = new eablkybsjg(gxszxtbevoVar);
            }
        } else {
            eablkybsjgVar = new eablkybsjg(gxszxtbevoVar);
        }
        Object objPpxfxbqfkf = eablkybsjgVar.f42277zdlpuopuiu;
        Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
        int i14 = eablkybsjgVar.f42275jyumaefscl;
        if (i14 == 0) {
            gg.zdlpuopuiu.zoijcleaow(objPpxfxbqfkf);
            ja2.iobyxmoadg iobyxmoadgVar = this.f42261iobyxmoadg;
            eablkybsjgVar.f42275jyumaefscl = 1;
            objPpxfxbqfkf = iobyxmoadgVar.ppxfxbqfkf(eablkybsjgVar);
            if (objPpxfxbqfkf == objGxszxtbevo) {
                return objGxszxtbevo;
            }
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            gg.zdlpuopuiu.zoijcleaow(objPpxfxbqfkf);
        }
        UserSharePromoDto userSharePromoDto = (UserSharePromoDto) o40.eablkybsjg.lqeggnwhkg((BasicResponse) objPpxfxbqfkf, new tg.draadjrbmk() { // from class: ia2.iobyxmoadg
            @Override // tg.draadjrbmk
            public final Object invoke(Object obj) {
                return zoijcleaow.agtfadlqog((ErrorResponse) obj);
            }
        });
        if (userSharePromoDto != null) {
            return ma2.wkgbmnqykc.iobyxmoadg(userSharePromoDto);
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // qa2.zoijcleaow
    public Object dxjokdxxww(lg.gxszxtbevo gxszxtbevoVar) {
        wkgbmnqykc wkgbmnqykcVar;
        zoijcleaow zoijcleaowVar;
        if (gxszxtbevoVar instanceof wkgbmnqykc) {
            wkgbmnqykcVar = (wkgbmnqykc) gxszxtbevoVar;
            int i13 = wkgbmnqykcVar.f42299iwizpuwonk;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                wkgbmnqykcVar.f42299iwizpuwonk = i13 - Integer.MIN_VALUE;
            } else {
                wkgbmnqykcVar = new wkgbmnqykc(gxszxtbevoVar);
            }
        } else {
            wkgbmnqykcVar = new wkgbmnqykc(gxszxtbevoVar);
        }
        Object objDxjokdxxww = wkgbmnqykcVar.f42301yggfygwlhe;
        Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
        int i14 = wkgbmnqykcVar.f42299iwizpuwonk;
        if (i14 == 0) {
            gg.zdlpuopuiu.zoijcleaow(objDxjokdxxww);
            ja2.iobyxmoadg iobyxmoadgVar = this.f42261iobyxmoadg;
            wkgbmnqykcVar.f42302zdlpuopuiu = this;
            wkgbmnqykcVar.f42299iwizpuwonk = 1;
            objDxjokdxxww = iobyxmoadgVar.dxjokdxxww(wkgbmnqykcVar);
            if (objDxjokdxxww == objGxszxtbevo) {
                return objGxszxtbevo;
            }
            zoijcleaowVar = this;
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            zoijcleaowVar = (zoijcleaow) wkgbmnqykcVar.f42302zdlpuopuiu;
            gg.zdlpuopuiu.zoijcleaow(objDxjokdxxww);
        }
        return zoijcleaowVar.f42262zoijcleaow.iobyxmoadg((UserDynamicQrCodeDto) o40.eablkybsjg.agtfadlqog((BasicResponse) objDxjokdxxww, null, 1, null));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // qa2.zoijcleaow
    public Object eablkybsjg(lg.gxszxtbevo gxszxtbevoVar) {
        lqeggnwhkg lqeggnwhkgVar;
        if (gxszxtbevoVar instanceof lqeggnwhkg) {
            lqeggnwhkgVar = (lqeggnwhkg) gxszxtbevoVar;
            int i13 = lqeggnwhkgVar.f42287jyumaefscl;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                lqeggnwhkgVar.f42287jyumaefscl = i13 - Integer.MIN_VALUE;
            } else {
                lqeggnwhkgVar = new lqeggnwhkg(gxszxtbevoVar);
            }
        } else {
            lqeggnwhkgVar = new lqeggnwhkg(gxszxtbevoVar);
        }
        Object objEablkybsjg = lqeggnwhkgVar.f42289zdlpuopuiu;
        Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
        int i14 = lqeggnwhkgVar.f42287jyumaefscl;
        if (i14 == 0) {
            gg.zdlpuopuiu.zoijcleaow(objEablkybsjg);
            ja2.iobyxmoadg iobyxmoadgVar = this.f42261iobyxmoadg;
            lqeggnwhkgVar.f42287jyumaefscl = 1;
            objEablkybsjg = iobyxmoadgVar.eablkybsjg(lqeggnwhkgVar);
            if (objEablkybsjg == objGxszxtbevo) {
                return objGxszxtbevo;
            }
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            gg.zdlpuopuiu.zoijcleaow(objEablkybsjg);
        }
        return ((ActivePushTokensResponse) o40.eablkybsjg.agtfadlqog((BasicResponse) objEablkybsjg, null, 1, null)).getPushTokens();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // qa2.zoijcleaow
    public Object gtknphoqwx(lg.gxszxtbevo gxszxtbevoVar) {
        gxszxtbevo gxszxtbevoVar2;
        if (gxszxtbevoVar instanceof gxszxtbevo) {
            gxszxtbevoVar2 = (gxszxtbevo) gxszxtbevoVar;
            int i13 = gxszxtbevoVar2.f42281jyumaefscl;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                gxszxtbevoVar2.f42281jyumaefscl = i13 - Integer.MIN_VALUE;
            } else {
                gxszxtbevoVar2 = new gxszxtbevo(gxszxtbevoVar);
            }
        } else {
            gxszxtbevoVar2 = new gxszxtbevo(gxszxtbevoVar);
        }
        Object objZoijcleaow = gxszxtbevoVar2.f42283zdlpuopuiu;
        Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
        int i14 = gxszxtbevoVar2.f42281jyumaefscl;
        if (i14 == 0) {
            gg.zdlpuopuiu.zoijcleaow(objZoijcleaow);
            ja2.iobyxmoadg iobyxmoadgVar = this.f42261iobyxmoadg;
            gxszxtbevoVar2.f42281jyumaefscl = 1;
            objZoijcleaow = iobyxmoadgVar.zoijcleaow(gxszxtbevoVar2);
            if (objZoijcleaow == objGxszxtbevo) {
                return objGxszxtbevo;
            }
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            gg.zdlpuopuiu.zoijcleaow(objZoijcleaow);
        }
        return ga2.ppxfxbqfkf.iobyxmoadg((UserDto) o40.eablkybsjg.agtfadlqog((BasicResponse) objZoijcleaow, null, 1, null));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // qa2.zoijcleaow
    public Object gxszxtbevo(ha2.wkgbmnqykc wkgbmnqykcVar, lg.gxszxtbevo gxszxtbevoVar) throws Throwable {
        agtfadlqog agtfadlqogVar;
        if (gxszxtbevoVar instanceof agtfadlqog) {
            agtfadlqogVar = (agtfadlqog) gxszxtbevoVar;
            int i13 = agtfadlqogVar.f42263jyumaefscl;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                agtfadlqogVar.f42263jyumaefscl = i13 - Integer.MIN_VALUE;
            } else {
                agtfadlqogVar = new agtfadlqog(gxszxtbevoVar);
            }
        } else {
            agtfadlqogVar = new agtfadlqog(gxszxtbevoVar);
        }
        Object objNufgyqmvbu = agtfadlqogVar.f42265zdlpuopuiu;
        Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
        int i14 = agtfadlqogVar.f42263jyumaefscl;
        if (i14 == 0) {
            gg.zdlpuopuiu.zoijcleaow(objNufgyqmvbu);
            ja2.iobyxmoadg iobyxmoadgVar = this.f42261iobyxmoadg;
            UpdateUserInfoParamsRequest updateUserInfoParamsRequestIobyxmoadg = la2.eablkybsjg.iobyxmoadg(wkgbmnqykcVar);
            agtfadlqogVar.f42263jyumaefscl = 1;
            objNufgyqmvbu = iobyxmoadgVar.nufgyqmvbu(updateUserInfoParamsRequestIobyxmoadg, agtfadlqogVar);
            if (objNufgyqmvbu == objGxszxtbevo) {
                return objGxszxtbevo;
            }
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            gg.zdlpuopuiu.zoijcleaow(objNufgyqmvbu);
        }
        o40.eablkybsjg.btonecajqb((BasicResponse) objNufgyqmvbu, null, 1, null);
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // qa2.zoijcleaow
    public Object iobyxmoadg(boolean z13, lg.gxszxtbevo gxszxtbevoVar) throws Throwable {
        dxjokdxxww dxjokdxxwwVar;
        if (gxszxtbevoVar instanceof dxjokdxxww) {
            dxjokdxxwwVar = (dxjokdxxww) gxszxtbevoVar;
            int i13 = dxjokdxxwwVar.f42272jyumaefscl;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                dxjokdxxwwVar.f42272jyumaefscl = i13 - Integer.MIN_VALUE;
            } else {
                dxjokdxxwwVar = new dxjokdxxww(gxszxtbevoVar);
            }
        } else {
            dxjokdxxwwVar = new dxjokdxxww(gxszxtbevoVar);
        }
        Object objGxszxtbevo = dxjokdxxwwVar.f42274zdlpuopuiu;
        Object objGxszxtbevo2 = mg.zoijcleaow.gxszxtbevo();
        int i14 = dxjokdxxwwVar.f42272jyumaefscl;
        if (i14 == 0) {
            gg.zdlpuopuiu.zoijcleaow(objGxszxtbevo);
            ja2.iobyxmoadg iobyxmoadgVar = this.f42261iobyxmoadg;
            UpdateAgreementsParams updateAgreementsParams = new UpdateAgreementsParams(z13);
            dxjokdxxwwVar.f42272jyumaefscl = 1;
            objGxszxtbevo = iobyxmoadgVar.gxszxtbevo(updateAgreementsParams, dxjokdxxwwVar);
            if (objGxszxtbevo == objGxszxtbevo2) {
                return objGxszxtbevo2;
            }
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            gg.zdlpuopuiu.zoijcleaow(objGxszxtbevo);
        }
        o40.eablkybsjg.btonecajqb((BasicResponse) objGxszxtbevo, null, 1, null);
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // qa2.zoijcleaow
    public Object lereixgezr(lg.gxszxtbevo gxszxtbevoVar) throws Throwable {
        iobyxmoadg iobyxmoadgVar;
        if (gxszxtbevoVar instanceof iobyxmoadg) {
            iobyxmoadgVar = (iobyxmoadg) gxszxtbevoVar;
            int i13 = iobyxmoadgVar.f42284jyumaefscl;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                iobyxmoadgVar.f42284jyumaefscl = i13 - Integer.MIN_VALUE;
            } else {
                iobyxmoadgVar = new iobyxmoadg(gxszxtbevoVar);
            }
        } else {
            iobyxmoadgVar = new iobyxmoadg(gxszxtbevoVar);
        }
        Object objWkgbmnqykc = iobyxmoadgVar.f42286zdlpuopuiu;
        Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
        int i14 = iobyxmoadgVar.f42284jyumaefscl;
        if (i14 == 0) {
            gg.zdlpuopuiu.zoijcleaow(objWkgbmnqykc);
            ja2.iobyxmoadg iobyxmoadgVar2 = this.f42261iobyxmoadg;
            iobyxmoadgVar.f42284jyumaefscl = 1;
            objWkgbmnqykc = iobyxmoadgVar2.wkgbmnqykc(iobyxmoadgVar);
            if (objWkgbmnqykc == objGxszxtbevo) {
                return objGxszxtbevo;
            }
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            gg.zdlpuopuiu.zoijcleaow(objWkgbmnqykc);
        }
        o40.eablkybsjg.dxjokdxxww((BasicResponse) objWkgbmnqykc, new C0996zoijcleaow(ha2.iobyxmoadg.f39960yggfygwlhe));
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // qa2.zoijcleaow
    public Object lqeggnwhkg(String str, lg.gxszxtbevo gxszxtbevoVar) throws Throwable {
        gtknphoqwx gtknphoqwxVar;
        if (gxszxtbevoVar instanceof gtknphoqwx) {
            gtknphoqwxVar = (gtknphoqwx) gxszxtbevoVar;
            int i13 = gtknphoqwxVar.f42278jyumaefscl;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                gtknphoqwxVar.f42278jyumaefscl = i13 - Integer.MIN_VALUE;
            } else {
                gtknphoqwxVar = new gtknphoqwx(gxszxtbevoVar);
            }
        } else {
            gtknphoqwxVar = new gtknphoqwx(gxszxtbevoVar);
        }
        Object objWflxmlrfwp = gtknphoqwxVar.f42280zdlpuopuiu;
        Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
        int i14 = gtknphoqwxVar.f42278jyumaefscl;
        if (i14 == 0) {
            gg.zdlpuopuiu.zoijcleaow(objWflxmlrfwp);
            ja2.iobyxmoadg iobyxmoadgVar = this.f42261iobyxmoadg;
            la2.ppxfxbqfkf ppxfxbqfkfVar = new la2.ppxfxbqfkf(str);
            gtknphoqwxVar.f42278jyumaefscl = 1;
            objWflxmlrfwp = iobyxmoadgVar.wflxmlrfwp(ppxfxbqfkfVar, gtknphoqwxVar);
            if (objWflxmlrfwp == objGxszxtbevo) {
                return objGxszxtbevo;
            }
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            gg.zdlpuopuiu.zoijcleaow(objWflxmlrfwp);
        }
        o40.eablkybsjg.btonecajqb((BasicResponse) objWflxmlrfwp, null, 1, null);
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // qa2.zoijcleaow
    public Object nufgyqmvbu(String str, lg.gxszxtbevo gxszxtbevoVar) throws Throwable {
        btonecajqb btonecajqbVar;
        if (gxszxtbevoVar instanceof btonecajqb) {
            btonecajqbVar = (btonecajqb) gxszxtbevoVar;
            int i13 = btonecajqbVar.f42266jyumaefscl;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                btonecajqbVar.f42266jyumaefscl = i13 - Integer.MIN_VALUE;
            } else {
                btonecajqbVar = new btonecajqb(gxszxtbevoVar);
            }
        } else {
            btonecajqbVar = new btonecajqb(gxszxtbevoVar);
        }
        Object objDraadjrbmk = btonecajqbVar.f42268zdlpuopuiu;
        Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
        int i14 = btonecajqbVar.f42266jyumaefscl;
        if (i14 == 0) {
            gg.zdlpuopuiu.zoijcleaow(objDraadjrbmk);
            ja2.iobyxmoadg iobyxmoadgVar = this.f42261iobyxmoadg;
            UpdateEmailParamsRequest updateEmailParamsRequest = new UpdateEmailParamsRequest(str);
            btonecajqbVar.f42266jyumaefscl = 1;
            objDraadjrbmk = iobyxmoadgVar.draadjrbmk(updateEmailParamsRequest, btonecajqbVar);
            if (objDraadjrbmk == objGxszxtbevo) {
                return objGxszxtbevo;
            }
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            gg.zdlpuopuiu.zoijcleaow(objDraadjrbmk);
        }
        o40.eablkybsjg.btonecajqb((BasicResponse) objDraadjrbmk, null, 1, null);
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // qa2.zoijcleaow
    public Object ppxfxbqfkf(UserNotifications userNotifications, lg.gxszxtbevo gxszxtbevoVar) throws Throwable {
        draadjrbmk draadjrbmkVar;
        if (gxszxtbevoVar instanceof draadjrbmk) {
            draadjrbmkVar = (draadjrbmk) gxszxtbevoVar;
            int i13 = draadjrbmkVar.f42269jyumaefscl;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                draadjrbmkVar.f42269jyumaefscl = i13 - Integer.MIN_VALUE;
            } else {
                draadjrbmkVar = new draadjrbmk(gxszxtbevoVar);
            }
        } else {
            draadjrbmkVar = new draadjrbmk(gxszxtbevoVar);
        }
        Object objBtonecajqb = draadjrbmkVar.f42271zdlpuopuiu;
        Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
        int i14 = draadjrbmkVar.f42269jyumaefscl;
        if (i14 == 0) {
            gg.zdlpuopuiu.zoijcleaow(objBtonecajqb);
            ja2.iobyxmoadg iobyxmoadgVar = this.f42261iobyxmoadg;
            UpdateUserNotificationsRequest updateUserNotificationsRequestIobyxmoadg = la2.lqeggnwhkg.iobyxmoadg(userNotifications);
            draadjrbmkVar.f42269jyumaefscl = 1;
            objBtonecajqb = iobyxmoadgVar.btonecajqb(updateUserNotificationsRequestIobyxmoadg, draadjrbmkVar);
            if (objBtonecajqb == objGxszxtbevo) {
                return objGxszxtbevo;
            }
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            gg.zdlpuopuiu.zoijcleaow(objBtonecajqb);
        }
        o40.eablkybsjg.btonecajqb((BasicResponse) objBtonecajqb, null, 1, null);
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // qa2.zoijcleaow
    public Object wkgbmnqykc(lg.gxszxtbevo gxszxtbevoVar) {
        nufgyqmvbu nufgyqmvbuVar;
        if (gxszxtbevoVar instanceof nufgyqmvbu) {
            nufgyqmvbuVar = (nufgyqmvbu) gxszxtbevoVar;
            int i13 = nufgyqmvbuVar.f42290jyumaefscl;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                nufgyqmvbuVar.f42290jyumaefscl = i13 - Integer.MIN_VALUE;
            } else {
                nufgyqmvbuVar = new nufgyqmvbu(gxszxtbevoVar);
            }
        } else {
            nufgyqmvbuVar = new nufgyqmvbu(gxszxtbevoVar);
        }
        Object objGtknphoqwx = nufgyqmvbuVar.f42292zdlpuopuiu;
        Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
        int i14 = nufgyqmvbuVar.f42290jyumaefscl;
        if (i14 == 0) {
            gg.zdlpuopuiu.zoijcleaow(objGtknphoqwx);
            ja2.iobyxmoadg iobyxmoadgVar = this.f42261iobyxmoadg;
            nufgyqmvbuVar.f42290jyumaefscl = 1;
            objGtknphoqwx = iobyxmoadgVar.gtknphoqwx(nufgyqmvbuVar);
            if (objGtknphoqwx == objGxszxtbevo) {
                return objGxszxtbevo;
            }
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            gg.zdlpuopuiu.zoijcleaow(objGtknphoqwx);
        }
        return o40.eablkybsjg.agtfadlqog((BasicResponse) objGtknphoqwx, null, 1, null);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // qa2.zoijcleaow
    public Object zoijcleaow(ha2.eablkybsjg eablkybsjgVar, lg.gxszxtbevo gxszxtbevoVar) throws Throwable {
        wflxmlrfwp wflxmlrfwpVar;
        if (gxszxtbevoVar instanceof wflxmlrfwp) {
            wflxmlrfwpVar = (wflxmlrfwp) gxszxtbevoVar;
            int i13 = wflxmlrfwpVar.f42296jyumaefscl;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                wflxmlrfwpVar.f42296jyumaefscl = i13 - Integer.MIN_VALUE;
            } else {
                wflxmlrfwpVar = new wflxmlrfwp(gxszxtbevoVar);
            }
        } else {
            wflxmlrfwpVar = new wflxmlrfwp(gxszxtbevoVar);
        }
        Object objLqeggnwhkg = wflxmlrfwpVar.f42298zdlpuopuiu;
        Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
        int i14 = wflxmlrfwpVar.f42296jyumaefscl;
        if (i14 == 0) {
            gg.zdlpuopuiu.zoijcleaow(objLqeggnwhkg);
            ja2.iobyxmoadg iobyxmoadgVar = this.f42261iobyxmoadg;
            UpdateUserPushTokenRequest updateUserPushTokenRequestIobyxmoadg = la2.dxjokdxxww.iobyxmoadg(eablkybsjgVar);
            wflxmlrfwpVar.f42296jyumaefscl = 1;
            objLqeggnwhkg = iobyxmoadgVar.lqeggnwhkg(updateUserPushTokenRequestIobyxmoadg, wflxmlrfwpVar);
            if (objLqeggnwhkg == objGxszxtbevo) {
                return objGxszxtbevo;
            }
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            gg.zdlpuopuiu.zoijcleaow(objLqeggnwhkg);
        }
        o40.eablkybsjg.btonecajqb((BasicResponse) objLqeggnwhkg, null, 1, null);
        return wwaezpbzkn.f37140iobyxmoadg;
    }
}
