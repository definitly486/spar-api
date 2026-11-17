package lm;

import gg.wwaezpbzkn;
import java.lang.reflect.Method;
import kotlin.KotlinNullPointerException;
import pj.ikoacuggdj;
import retrofit2.HttpException;

/* JADX INFO: loaded from: classes3.dex */
public abstract class draadjrbmk {

    static final class eablkybsjg extends kotlin.jvm.internal.jyumaefscl implements tg.draadjrbmk {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final /* synthetic */ lm.zoijcleaow f63423zdlpuopuiu;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        eablkybsjg(lm.zoijcleaow zoijcleaowVar) {
            super(1);
            this.f63423zdlpuopuiu = zoijcleaowVar;
        }

        @Override // tg.draadjrbmk
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            iobyxmoadg((Throwable) obj);
            return wwaezpbzkn.f37140iobyxmoadg;
        }

        public final void iobyxmoadg(Throwable th2) {
            this.f63423zdlpuopuiu.cancel();
        }
    }

    public static final class gxszxtbevo implements lm.wkgbmnqykc {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        final /* synthetic */ pj.agtfadlqog f63424iobyxmoadg;

        gxszxtbevo(pj.agtfadlqog agtfadlqogVar) {
            this.f63424iobyxmoadg = agtfadlqogVar;
        }

        @Override // lm.wkgbmnqykc
        public void iobyxmoadg(lm.zoijcleaow call, kcexrzcfyt response) {
            kotlin.jvm.internal.zdlpuopuiu.gtknphoqwx(call, "call");
            kotlin.jvm.internal.zdlpuopuiu.gtknphoqwx(response, "response");
            this.f63424iobyxmoadg.resumeWith(gg.kcexrzcfyt.wkgbmnqykc(response));
        }

        @Override // lm.wkgbmnqykc
        public void zoijcleaow(lm.zoijcleaow call, Throwable t13) {
            kotlin.jvm.internal.zdlpuopuiu.gtknphoqwx(call, "call");
            kotlin.jvm.internal.zdlpuopuiu.gtknphoqwx(t13, "t");
            pj.agtfadlqog agtfadlqogVar = this.f63424iobyxmoadg;
            gg.kcexrzcfyt.iobyxmoadg iobyxmoadgVar = gg.kcexrzcfyt.f37117yggfygwlhe;
            agtfadlqogVar.resumeWith(gg.kcexrzcfyt.wkgbmnqykc(gg.zdlpuopuiu.iobyxmoadg(t13)));
        }
    }

    static final class iobyxmoadg extends kotlin.jvm.internal.jyumaefscl implements tg.draadjrbmk {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final /* synthetic */ lm.zoijcleaow f63425zdlpuopuiu;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        iobyxmoadg(lm.zoijcleaow zoijcleaowVar) {
            super(1);
            this.f63425zdlpuopuiu = zoijcleaowVar;
        }

        @Override // tg.draadjrbmk
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            iobyxmoadg((Throwable) obj);
            return wwaezpbzkn.f37140iobyxmoadg;
        }

        public final void iobyxmoadg(Throwable th2) {
            this.f63425zdlpuopuiu.cancel();
        }
    }

    static final class lqeggnwhkg implements Runnable {

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        final /* synthetic */ Exception f63426yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final /* synthetic */ lg.gxszxtbevo f63427zdlpuopuiu;

        lqeggnwhkg(lg.gxszxtbevo gxszxtbevoVar, Exception exc) {
            this.f63427zdlpuopuiu = gxszxtbevoVar;
            this.f63426yggfygwlhe = exc;
        }

        @Override // java.lang.Runnable
        public final void run() {
            lg.gxszxtbevo gxszxtbevoVarPpxfxbqfkf = mg.zoijcleaow.ppxfxbqfkf(this.f63427zdlpuopuiu);
            Exception exc = this.f63426yggfygwlhe;
            gg.kcexrzcfyt.iobyxmoadg iobyxmoadgVar = gg.kcexrzcfyt.f37117yggfygwlhe;
            gxszxtbevoVarPpxfxbqfkf.resumeWith(gg.kcexrzcfyt.wkgbmnqykc(gg.zdlpuopuiu.iobyxmoadg(exc)));
        }
    }

    static final class nufgyqmvbu extends kotlin.coroutines.jvm.internal.wkgbmnqykc {

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        Object f63428jyumaefscl;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        int f63429yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        /* synthetic */ Object f63430zdlpuopuiu;

        nufgyqmvbu(lg.gxszxtbevo gxszxtbevoVar) {
            super(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            this.f63430zdlpuopuiu = obj;
            this.f63429yggfygwlhe |= Integer.MIN_VALUE;
            return draadjrbmk.wkgbmnqykc(null, this);
        }
    }

    public static final class ppxfxbqfkf implements lm.wkgbmnqykc {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        final /* synthetic */ pj.agtfadlqog f63431iobyxmoadg;

        ppxfxbqfkf(pj.agtfadlqog agtfadlqogVar) {
            this.f63431iobyxmoadg = agtfadlqogVar;
        }

        @Override // lm.wkgbmnqykc
        public void iobyxmoadg(lm.zoijcleaow call, kcexrzcfyt response) {
            kotlin.jvm.internal.zdlpuopuiu.gtknphoqwx(call, "call");
            kotlin.jvm.internal.zdlpuopuiu.gtknphoqwx(response, "response");
            if (!response.gxszxtbevo()) {
                pj.agtfadlqog agtfadlqogVar = this.f63431iobyxmoadg;
                HttpException httpException = new HttpException(response);
                gg.kcexrzcfyt.iobyxmoadg iobyxmoadgVar = gg.kcexrzcfyt.f37117yggfygwlhe;
                agtfadlqogVar.resumeWith(gg.kcexrzcfyt.wkgbmnqykc(gg.zdlpuopuiu.iobyxmoadg(httpException)));
                return;
            }
            Object objIobyxmoadg = response.iobyxmoadg();
            if (objIobyxmoadg != null) {
                this.f63431iobyxmoadg.resumeWith(gg.kcexrzcfyt.wkgbmnqykc(objIobyxmoadg));
                return;
            }
            Object objBtonecajqb = call.dxjokdxxww().btonecajqb(gtknphoqwx.class);
            if (objBtonecajqb == null) {
                kotlin.jvm.internal.zdlpuopuiu.yggfygwlhe();
            }
            kotlin.jvm.internal.zdlpuopuiu.gxszxtbevo(objBtonecajqb, "call.request().tag(Invocation::class.java)!!");
            Method method = ((gtknphoqwx) objBtonecajqb).iobyxmoadg();
            StringBuilder sb3 = new StringBuilder();
            sb3.append("Response from ");
            kotlin.jvm.internal.zdlpuopuiu.gxszxtbevo(method, "method");
            Class<?> declaringClass = method.getDeclaringClass();
            kotlin.jvm.internal.zdlpuopuiu.gxszxtbevo(declaringClass, "method.declaringClass");
            sb3.append(declaringClass.getName());
            sb3.append('.');
            sb3.append(method.getName());
            sb3.append(" was null but response body type was declared as non-null");
            KotlinNullPointerException kotlinNullPointerException = new KotlinNullPointerException(sb3.toString());
            pj.agtfadlqog agtfadlqogVar2 = this.f63431iobyxmoadg;
            gg.kcexrzcfyt.iobyxmoadg iobyxmoadgVar2 = gg.kcexrzcfyt.f37117yggfygwlhe;
            agtfadlqogVar2.resumeWith(gg.kcexrzcfyt.wkgbmnqykc(gg.zdlpuopuiu.iobyxmoadg(kotlinNullPointerException)));
        }

        @Override // lm.wkgbmnqykc
        public void zoijcleaow(lm.zoijcleaow call, Throwable t13) {
            kotlin.jvm.internal.zdlpuopuiu.gtknphoqwx(call, "call");
            kotlin.jvm.internal.zdlpuopuiu.gtknphoqwx(t13, "t");
            pj.agtfadlqog agtfadlqogVar = this.f63431iobyxmoadg;
            gg.kcexrzcfyt.iobyxmoadg iobyxmoadgVar = gg.kcexrzcfyt.f37117yggfygwlhe;
            agtfadlqogVar.resumeWith(gg.kcexrzcfyt.wkgbmnqykc(gg.zdlpuopuiu.iobyxmoadg(t13)));
        }
    }

    public static final class wkgbmnqykc implements lm.wkgbmnqykc {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        final /* synthetic */ pj.agtfadlqog f63432iobyxmoadg;

        wkgbmnqykc(pj.agtfadlqog agtfadlqogVar) {
            this.f63432iobyxmoadg = agtfadlqogVar;
        }

        @Override // lm.wkgbmnqykc
        public void iobyxmoadg(lm.zoijcleaow call, kcexrzcfyt response) {
            kotlin.jvm.internal.zdlpuopuiu.gtknphoqwx(call, "call");
            kotlin.jvm.internal.zdlpuopuiu.gtknphoqwx(response, "response");
            if (response.gxszxtbevo()) {
                this.f63432iobyxmoadg.resumeWith(gg.kcexrzcfyt.wkgbmnqykc(response.iobyxmoadg()));
                return;
            }
            pj.agtfadlqog agtfadlqogVar = this.f63432iobyxmoadg;
            HttpException httpException = new HttpException(response);
            gg.kcexrzcfyt.iobyxmoadg iobyxmoadgVar = gg.kcexrzcfyt.f37117yggfygwlhe;
            agtfadlqogVar.resumeWith(gg.kcexrzcfyt.wkgbmnqykc(gg.zdlpuopuiu.iobyxmoadg(httpException)));
        }

        @Override // lm.wkgbmnqykc
        public void zoijcleaow(lm.zoijcleaow call, Throwable t13) {
            kotlin.jvm.internal.zdlpuopuiu.gtknphoqwx(call, "call");
            kotlin.jvm.internal.zdlpuopuiu.gtknphoqwx(t13, "t");
            pj.agtfadlqog agtfadlqogVar = this.f63432iobyxmoadg;
            gg.kcexrzcfyt.iobyxmoadg iobyxmoadgVar = gg.kcexrzcfyt.f37117yggfygwlhe;
            agtfadlqogVar.resumeWith(gg.kcexrzcfyt.wkgbmnqykc(gg.zdlpuopuiu.iobyxmoadg(t13)));
        }
    }

    static final class zoijcleaow extends kotlin.jvm.internal.jyumaefscl implements tg.draadjrbmk {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final /* synthetic */ lm.zoijcleaow f63433zdlpuopuiu;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        zoijcleaow(lm.zoijcleaow zoijcleaowVar) {
            super(1);
            this.f63433zdlpuopuiu = zoijcleaowVar;
        }

        @Override // tg.draadjrbmk
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            iobyxmoadg((Throwable) obj);
            return wwaezpbzkn.f37140iobyxmoadg;
        }

        public final void iobyxmoadg(Throwable th2) {
            this.f63433zdlpuopuiu.cancel();
        }
    }

    public static final Object iobyxmoadg(lm.zoijcleaow zoijcleaowVar, lg.gxszxtbevo gxszxtbevoVar) {
        pj.rgvfuqvkyq rgvfuqvkyqVar = new pj.rgvfuqvkyq(mg.zoijcleaow.ppxfxbqfkf(gxszxtbevoVar), 1);
        rgvfuqvkyqVar.stevsuqkhv(new iobyxmoadg(zoijcleaowVar));
        zoijcleaowVar.m(new ppxfxbqfkf(rgvfuqvkyqVar));
        Object objZdlpuopuiu = rgvfuqvkyqVar.zdlpuopuiu();
        if (objZdlpuopuiu == mg.zoijcleaow.gxszxtbevo()) {
            kotlin.coroutines.jvm.internal.nufgyqmvbu.ppxfxbqfkf(gxszxtbevoVar);
        }
        return objZdlpuopuiu;
    }

    public static final Object ppxfxbqfkf(lm.zoijcleaow zoijcleaowVar, lg.gxszxtbevo gxszxtbevoVar) {
        pj.rgvfuqvkyq rgvfuqvkyqVar = new pj.rgvfuqvkyq(mg.zoijcleaow.ppxfxbqfkf(gxszxtbevoVar), 1);
        rgvfuqvkyqVar.stevsuqkhv(new eablkybsjg(zoijcleaowVar));
        zoijcleaowVar.m(new gxszxtbevo(rgvfuqvkyqVar));
        Object objZdlpuopuiu = rgvfuqvkyqVar.zdlpuopuiu();
        if (objZdlpuopuiu == mg.zoijcleaow.gxszxtbevo()) {
            kotlin.coroutines.jvm.internal.nufgyqmvbu.ppxfxbqfkf(gxszxtbevoVar);
        }
        return objZdlpuopuiu;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Object wkgbmnqykc(Exception exc, lg.gxszxtbevo gxszxtbevoVar) {
        nufgyqmvbu nufgyqmvbuVar;
        if (gxszxtbevoVar instanceof nufgyqmvbu) {
            nufgyqmvbuVar = (nufgyqmvbu) gxszxtbevoVar;
            int i13 = nufgyqmvbuVar.f63429yggfygwlhe;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                nufgyqmvbuVar.f63429yggfygwlhe = i13 - Integer.MIN_VALUE;
            } else {
                nufgyqmvbuVar = new nufgyqmvbu(gxszxtbevoVar);
            }
        } else {
            nufgyqmvbuVar = new nufgyqmvbu(gxszxtbevoVar);
        }
        Object obj = nufgyqmvbuVar.f63430zdlpuopuiu;
        Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
        int i14 = nufgyqmvbuVar.f63429yggfygwlhe;
        if (i14 == 0) {
            gg.zdlpuopuiu.zoijcleaow(obj);
            nufgyqmvbuVar.f63428jyumaefscl = exc;
            nufgyqmvbuVar.f63429yggfygwlhe = 1;
            ikoacuggdj.iobyxmoadg().dsvhmnatus(nufgyqmvbuVar.getContext(), new lqeggnwhkg(nufgyqmvbuVar, exc));
            Object objGxszxtbevo2 = mg.zoijcleaow.gxszxtbevo();
            if (objGxszxtbevo2 == mg.zoijcleaow.gxszxtbevo()) {
                kotlin.coroutines.jvm.internal.nufgyqmvbu.ppxfxbqfkf(nufgyqmvbuVar);
            }
            if (objGxszxtbevo2 == objGxszxtbevo) {
                return objGxszxtbevo;
            }
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            gg.zdlpuopuiu.zoijcleaow(obj);
        }
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    public static final Object zoijcleaow(lm.zoijcleaow zoijcleaowVar, lg.gxszxtbevo gxszxtbevoVar) {
        pj.rgvfuqvkyq rgvfuqvkyqVar = new pj.rgvfuqvkyq(mg.zoijcleaow.ppxfxbqfkf(gxszxtbevoVar), 1);
        rgvfuqvkyqVar.stevsuqkhv(new zoijcleaow(zoijcleaowVar));
        zoijcleaowVar.m(new wkgbmnqykc(rgvfuqvkyqVar));
        Object objZdlpuopuiu = rgvfuqvkyqVar.zdlpuopuiu();
        if (objZdlpuopuiu == mg.zoijcleaow.gxszxtbevo()) {
            kotlin.coroutines.jvm.internal.nufgyqmvbu.ppxfxbqfkf(gxszxtbevoVar);
        }
        return objZdlpuopuiu;
    }
}
