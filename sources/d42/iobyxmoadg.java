package d42;

import ca2.ppxfxbqfkf;
import gg.wwaezpbzkn;
import gg.zdlpuopuiu;
import kotlin.coroutines.jvm.internal.draadjrbmk;
import lg.gxszxtbevo;
import pj.cllcsxoeiz;
import pj.gtknphoqwx;
import ru.myspar.services.crash_logger.api.CrashlyticsKey;
import ru.myspar.user.models.User;
import sj.lqeggnwhkg;
import sj.nufgyqmvbu;
import tg.rgvfuqvkyq;

/* JADX INFO: loaded from: classes6.dex */
public final class iobyxmoadg implements c42.zoijcleaow {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final cllcsxoeiz f27038iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private CrashlyticsKey f27039ppxfxbqfkf;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private String f27040zoijcleaow;

    /* JADX INFO: renamed from: d42.iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
    static final class C0495iobyxmoadg extends draadjrbmk implements rgvfuqvkyq {

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        final /* synthetic */ iobyxmoadg f27041jyumaefscl;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        final /* synthetic */ ppxfxbqfkf f27042yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        int f27043zdlpuopuiu;

        /* JADX INFO: renamed from: d42.iobyxmoadg$iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
        static final class C0496iobyxmoadg implements nufgyqmvbu {

            /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
            final /* synthetic */ iobyxmoadg f27044zdlpuopuiu;

            C0496iobyxmoadg(iobyxmoadg iobyxmoadgVar) {
                this.f27044zdlpuopuiu = iobyxmoadgVar;
            }

            @Override // sj.nufgyqmvbu
            /* JADX INFO: renamed from: zoijcleaow, reason: merged with bridge method [inline-methods] */
            public final Object emit(User user, gxszxtbevo gxszxtbevoVar) {
                this.f27044zdlpuopuiu.f27040zoijcleaow = user != null ? user.getXmlId() : null;
                iobyxmoadg iobyxmoadgVar = this.f27044zdlpuopuiu;
                CrashlyticsKey.Companion companion = CrashlyticsKey.INSTANCE;
                String phone = user != null ? user.getPhone() : null;
                if (phone == null) {
                    phone = "";
                }
                iobyxmoadgVar.f27039ppxfxbqfkf = companion.zoijcleaow(phone);
                return wwaezpbzkn.f37140iobyxmoadg;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C0495iobyxmoadg(ppxfxbqfkf ppxfxbqfkfVar, iobyxmoadg iobyxmoadgVar, gxszxtbevo gxszxtbevoVar) {
            super(2, gxszxtbevoVar);
            this.f27042yggfygwlhe = ppxfxbqfkfVar;
            this.f27041jyumaefscl = iobyxmoadgVar;
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final gxszxtbevo create(Object obj, gxszxtbevo gxszxtbevoVar) {
            return new C0495iobyxmoadg(this.f27042yggfygwlhe, this.f27041jyumaefscl, gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
            int i13 = this.f27043zdlpuopuiu;
            if (i13 == 0) {
                zdlpuopuiu.zoijcleaow(obj);
                lqeggnwhkg lqeggnwhkgVarZoijcleaow = this.f27042yggfygwlhe.zoijcleaow();
                C0496iobyxmoadg c0496iobyxmoadg = new C0496iobyxmoadg(this.f27041jyumaefscl);
                this.f27043zdlpuopuiu = 1;
                if (lqeggnwhkgVarZoijcleaow.collect(c0496iobyxmoadg, this) == objGxszxtbevo) {
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
            return ((C0495iobyxmoadg) create(cllcsxoeizVar, gxszxtbevoVar)).invokeSuspend(wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    static final class zoijcleaow extends draadjrbmk implements rgvfuqvkyq {

        /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
        final /* synthetic */ CrashlyticsKey[] f27045iwizpuwonk;

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        final /* synthetic */ iobyxmoadg f27046jyumaefscl;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        final /* synthetic */ Throwable f27047yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        int f27048zdlpuopuiu;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        zoijcleaow(Throwable th2, iobyxmoadg iobyxmoadgVar, CrashlyticsKey[] crashlyticsKeyArr, gxszxtbevo gxszxtbevoVar) {
            super(2, gxszxtbevoVar);
            this.f27047yggfygwlhe = th2;
            this.f27046jyumaefscl = iobyxmoadgVar;
            this.f27045iwizpuwonk = crashlyticsKeyArr;
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final gxszxtbevo create(Object obj, gxszxtbevo gxszxtbevoVar) {
            return new zoijcleaow(this.f27047yggfygwlhe, this.f27046jyumaefscl, this.f27045iwizpuwonk, gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            mg.zoijcleaow.gxszxtbevo();
            if (this.f27048zdlpuopuiu != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            zdlpuopuiu.zoijcleaow(obj);
            com.google.firebase.crashlytics.iobyxmoadg iobyxmoadgVarZoijcleaow = com.google.firebase.crashlytics.iobyxmoadg.zoijcleaow();
            iobyxmoadg iobyxmoadgVar = this.f27046jyumaefscl;
            CrashlyticsKey[] crashlyticsKeyArr = this.f27045iwizpuwonk;
            String str = iobyxmoadgVar.f27040zoijcleaow;
            if (str == null) {
                str = "";
            }
            iobyxmoadgVarZoijcleaow.lqeggnwhkg(str);
            kotlin.jvm.internal.zdlpuopuiu.lqeggnwhkg(iobyxmoadgVarZoijcleaow);
            d42.zoijcleaow.zoijcleaow(iobyxmoadgVarZoijcleaow, iobyxmoadgVar.f27039ppxfxbqfkf);
            for (CrashlyticsKey crashlyticsKey : crashlyticsKeyArr) {
                iobyxmoadgVarZoijcleaow.gxszxtbevo(crashlyticsKey.getCode(), crashlyticsKey.getValue());
            }
            iobyxmoadgVarZoijcleaow.eablkybsjg(this.f27047yggfygwlhe);
            return wwaezpbzkn.f37140iobyxmoadg;
        }

        @Override // tg.rgvfuqvkyq
        public final Object invoke(cllcsxoeiz cllcsxoeizVar, gxszxtbevo gxszxtbevoVar) {
            return ((zoijcleaow) create(cllcsxoeizVar, gxszxtbevoVar)).invokeSuspend(wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    public iobyxmoadg(cllcsxoeiz scope, ppxfxbqfkf userRepository) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(scope, "scope");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(userRepository, "userRepository");
        this.f27038iobyxmoadg = scope;
        gtknphoqwx.wkgbmnqykc(scope, null, null, new C0495iobyxmoadg(userRepository, this, null), 3, null);
    }

    @Override // c42.zoijcleaow
    public void iobyxmoadg(Throwable throwable, CrashlyticsKey... keys) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(throwable, "throwable");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(keys, "keys");
        gtknphoqwx.wkgbmnqykc(this.f27038iobyxmoadg, null, null, new zoijcleaow(throwable, this, keys, null), 3, null);
    }
}
