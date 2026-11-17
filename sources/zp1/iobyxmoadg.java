package zp1;

import gg.wwaezpbzkn;
import gg.zdlpuopuiu;
import kotlin.coroutines.jvm.internal.draadjrbmk;
import lg.gxszxtbevo;
import ow1.jpowsppfya;
import pj.cllcsxoeiz;
import pj.gtknphoqwx;
import ru.myspar.proloyalty.services.crash_logger.api.CrashlyticsKey;
import ru.myspar.proloyalty.user.domain.model.UserInfo;
import ru.myspar.proloyalty.user.domain.model.UserState;
import sj.lqeggnwhkg;
import sj.nufgyqmvbu;
import tg.rgvfuqvkyq;

/* JADX INFO: loaded from: classes6.dex */
public final class iobyxmoadg implements yp1.zoijcleaow {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final cllcsxoeiz f130907iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private String f130908ppxfxbqfkf;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final jpowsppfya f130909zoijcleaow;

    /* JADX INFO: renamed from: zp1.iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
    static final class C3347iobyxmoadg extends draadjrbmk implements rgvfuqvkyq {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        int f130911zdlpuopuiu;

        /* JADX INFO: renamed from: zp1.iobyxmoadg$iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
        static final class C3348iobyxmoadg implements nufgyqmvbu {

            /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
            final /* synthetic */ iobyxmoadg f130912zdlpuopuiu;

            C3348iobyxmoadg(iobyxmoadg iobyxmoadgVar) {
                this.f130912zdlpuopuiu = iobyxmoadgVar;
            }

            @Override // sj.nufgyqmvbu
            /* JADX INFO: renamed from: zoijcleaow, reason: merged with bridge method [inline-methods] */
            public final Object emit(UserState userState, gxszxtbevo gxszxtbevoVar) {
                UserState.IsAuth isAuth = userState instanceof UserState.IsAuth ? (UserState.IsAuth) userState : null;
                UserInfo userInfo = isAuth != null ? isAuth.getUserInfo() : null;
                this.f130912zdlpuopuiu.f130908ppxfxbqfkf = userInfo != null ? userInfo.getId() : null;
                return wwaezpbzkn.f37140iobyxmoadg;
            }
        }

        C3347iobyxmoadg(gxszxtbevo gxszxtbevoVar) {
            super(2, gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final gxszxtbevo create(Object obj, gxszxtbevo gxszxtbevoVar) {
            return iobyxmoadg.this.new C3347iobyxmoadg(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
            int i13 = this.f130911zdlpuopuiu;
            if (i13 == 0) {
                zdlpuopuiu.zoijcleaow(obj);
                lqeggnwhkg lqeggnwhkgVar = (lqeggnwhkg) iobyxmoadg.this.f130909zoijcleaow.zoijcleaow(wwaezpbzkn.f37140iobyxmoadg);
                C3348iobyxmoadg c3348iobyxmoadg = new C3348iobyxmoadg(iobyxmoadg.this);
                this.f130911zdlpuopuiu = 1;
                if (lqeggnwhkgVar.collect(c3348iobyxmoadg, this) == objGxszxtbevo) {
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
        public final Object invoke(cllcsxoeiz cllcsxoeizVar, gxszxtbevo gxszxtbevoVar) {
            return ((C3347iobyxmoadg) create(cllcsxoeizVar, gxszxtbevoVar)).invokeSuspend(wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    static final class zoijcleaow extends draadjrbmk implements rgvfuqvkyq {

        /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
        final /* synthetic */ CrashlyticsKey[] f130913iwizpuwonk;

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        final /* synthetic */ iobyxmoadg f130914jyumaefscl;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        final /* synthetic */ Throwable f130915yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        int f130916zdlpuopuiu;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        zoijcleaow(Throwable th2, iobyxmoadg iobyxmoadgVar, CrashlyticsKey[] crashlyticsKeyArr, gxszxtbevo gxszxtbevoVar) {
            super(2, gxszxtbevoVar);
            this.f130915yggfygwlhe = th2;
            this.f130914jyumaefscl = iobyxmoadgVar;
            this.f130913iwizpuwonk = crashlyticsKeyArr;
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final gxszxtbevo create(Object obj, gxszxtbevo gxszxtbevoVar) {
            return new zoijcleaow(this.f130915yggfygwlhe, this.f130914jyumaefscl, this.f130913iwizpuwonk, gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            mg.zoijcleaow.gxszxtbevo();
            if (this.f130916zdlpuopuiu != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            zdlpuopuiu.zoijcleaow(obj);
            com.google.firebase.crashlytics.iobyxmoadg iobyxmoadgVarZoijcleaow = com.google.firebase.crashlytics.iobyxmoadg.zoijcleaow();
            iobyxmoadg iobyxmoadgVar = this.f130914jyumaefscl;
            CrashlyticsKey[] crashlyticsKeyArr = this.f130913iwizpuwonk;
            String str = iobyxmoadgVar.f130908ppxfxbqfkf;
            if (str == null) {
                str = "";
            }
            iobyxmoadgVarZoijcleaow.lqeggnwhkg(str);
            for (CrashlyticsKey crashlyticsKey : crashlyticsKeyArr) {
                iobyxmoadgVarZoijcleaow.gxszxtbevo(crashlyticsKey.getCode(), crashlyticsKey.getValue());
            }
            iobyxmoadgVarZoijcleaow.eablkybsjg(this.f130915yggfygwlhe);
            return wwaezpbzkn.f37140iobyxmoadg;
        }

        @Override // tg.rgvfuqvkyq
        public final Object invoke(cllcsxoeiz cllcsxoeizVar, gxszxtbevo gxszxtbevoVar) {
            return ((zoijcleaow) create(cllcsxoeizVar, gxszxtbevoVar)).invokeSuspend(wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    public iobyxmoadg(cllcsxoeiz scope, jpowsppfya subscribeUserStateUseCase) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(scope, "scope");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(subscribeUserStateUseCase, "subscribeUserStateUseCase");
        this.f130907iobyxmoadg = scope;
        this.f130909zoijcleaow = subscribeUserStateUseCase;
        gtknphoqwx.wkgbmnqykc(scope, null, null, new C3347iobyxmoadg(null), 3, null);
    }

    @Override // yp1.zoijcleaow
    public void iobyxmoadg(Throwable throwable, CrashlyticsKey... keys) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(throwable, "throwable");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(keys, "keys");
        gtknphoqwx.wkgbmnqykc(this.f130907iobyxmoadg, null, null, new zoijcleaow(throwable, this, keys, null), 3, null);
    }
}
