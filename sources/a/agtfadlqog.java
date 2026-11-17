package a;

import gg.wwaezpbzkn;
import gg.zdlpuopuiu;
import java.util.concurrent.atomic.AtomicReference;
import pj.auzgnhcxok;
import pj.cllcsxoeiz;
import pj.dsvhmnatus;
import pj.dvvnrvtcbc;
import tg.rgvfuqvkyq;

/* JADX INFO: loaded from: classes.dex */
public abstract class agtfadlqog {

    private static final class iobyxmoadg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final auzgnhcxok f7iobyxmoadg;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final Object f8zoijcleaow;

        public iobyxmoadg(auzgnhcxok auzgnhcxokVar, Object obj) {
            this.f7iobyxmoadg = auzgnhcxokVar;
            this.f8zoijcleaow = obj;
        }

        public final auzgnhcxok iobyxmoadg() {
            return this.f7iobyxmoadg;
        }

        public final Object zoijcleaow() {
            return this.f8zoijcleaow;
        }
    }

    static final class zoijcleaow extends kotlin.coroutines.jvm.internal.draadjrbmk implements rgvfuqvkyq {

        /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
        final /* synthetic */ rgvfuqvkyq f9cqumvgiudr;

        /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
        final /* synthetic */ AtomicReference f10iwizpuwonk;

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        final /* synthetic */ tg.draadjrbmk f11jyumaefscl;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        private /* synthetic */ Object f12yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        int f13zdlpuopuiu;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        zoijcleaow(tg.draadjrbmk draadjrbmkVar, AtomicReference atomicReference, rgvfuqvkyq rgvfuqvkyqVar, lg.gxszxtbevo gxszxtbevoVar) {
            super(2, gxszxtbevoVar);
            this.f11jyumaefscl = draadjrbmkVar;
            this.f10iwizpuwonk = atomicReference;
            this.f9cqumvgiudr = rgvfuqvkyqVar;
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
            zoijcleaow zoijcleaowVar = new zoijcleaow(this.f11jyumaefscl, this.f10iwizpuwonk, this.f9cqumvgiudr, gxszxtbevoVar);
            zoijcleaowVar.f12yggfygwlhe = obj;
            return zoijcleaowVar;
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) throws Throwable {
            iobyxmoadg iobyxmoadgVar;
            auzgnhcxok auzgnhcxokVarIobyxmoadg;
            iobyxmoadg iobyxmoadgVar2;
            Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
            int i13 = this.f13zdlpuopuiu;
            try {
                if (i13 == 0) {
                    zdlpuopuiu.zoijcleaow(obj);
                    cllcsxoeiz cllcsxoeizVar = (cllcsxoeiz) this.f12yggfygwlhe;
                    iobyxmoadgVar = new iobyxmoadg(dvvnrvtcbc.gtknphoqwx(cllcsxoeizVar.getCoroutineContext()), this.f11jyumaefscl.invoke(cllcsxoeizVar));
                    iobyxmoadg iobyxmoadgVar3 = (iobyxmoadg) this.f10iwizpuwonk.getAndSet(iobyxmoadgVar);
                    if (iobyxmoadgVar3 != null && (auzgnhcxokVarIobyxmoadg = iobyxmoadgVar3.iobyxmoadg()) != null) {
                        this.f12yggfygwlhe = iobyxmoadgVar;
                        this.f13zdlpuopuiu = 1;
                        if (dvvnrvtcbc.lqeggnwhkg(auzgnhcxokVarIobyxmoadg, this) == objGxszxtbevo) {
                            return objGxszxtbevo;
                        }
                    }
                } else {
                    if (i13 != 1) {
                        if (i13 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        iobyxmoadgVar2 = (iobyxmoadg) this.f12yggfygwlhe;
                        try {
                            zdlpuopuiu.zoijcleaow(obj);
                            mbcevpiqjq.wkgbmnqykc.iobyxmoadg(this.f10iwizpuwonk, iobyxmoadgVar2, null);
                            return obj;
                        } catch (Throwable th2) {
                            th = th2;
                            mbcevpiqjq.wkgbmnqykc.iobyxmoadg(this.f10iwizpuwonk, iobyxmoadgVar2, null);
                            throw th;
                        }
                    }
                    iobyxmoadgVar = (iobyxmoadg) this.f12yggfygwlhe;
                    zdlpuopuiu.zoijcleaow(obj);
                }
                rgvfuqvkyq rgvfuqvkyqVar = this.f9cqumvgiudr;
                Object objZoijcleaow = iobyxmoadgVar.zoijcleaow();
                this.f12yggfygwlhe = iobyxmoadgVar;
                this.f13zdlpuopuiu = 2;
                obj = rgvfuqvkyqVar.invoke(objZoijcleaow, this);
                if (obj == objGxszxtbevo) {
                    return objGxszxtbevo;
                }
                iobyxmoadgVar2 = iobyxmoadgVar;
                mbcevpiqjq.wkgbmnqykc.iobyxmoadg(this.f10iwizpuwonk, iobyxmoadgVar2, null);
                return obj;
            } catch (Throwable th3) {
                th = th3;
                iobyxmoadgVar2 = iobyxmoadgVar;
                mbcevpiqjq.wkgbmnqykc.iobyxmoadg(this.f10iwizpuwonk, iobyxmoadgVar2, null);
                throw th;
            }
        }

        @Override // tg.rgvfuqvkyq
        public final Object invoke(cllcsxoeiz cllcsxoeizVar, lg.gxszxtbevo gxszxtbevoVar) {
            return ((zoijcleaow) create(cllcsxoeizVar, gxszxtbevoVar)).invokeSuspend(wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    public static AtomicReference iobyxmoadg() {
        return zoijcleaow(new AtomicReference(null));
    }

    public static final Object ppxfxbqfkf(AtomicReference atomicReference) {
        iobyxmoadg iobyxmoadgVar = (iobyxmoadg) atomicReference.get();
        if (iobyxmoadgVar != null) {
            return iobyxmoadgVar.zoijcleaow();
        }
        return null;
    }

    public static final Object wkgbmnqykc(AtomicReference atomicReference, tg.draadjrbmk draadjrbmkVar, rgvfuqvkyq rgvfuqvkyqVar, lg.gxszxtbevo gxszxtbevoVar) {
        return dsvhmnatus.gxszxtbevo(new zoijcleaow(draadjrbmkVar, atomicReference, rgvfuqvkyqVar, null), gxszxtbevoVar);
    }

    private static AtomicReference zoijcleaow(AtomicReference atomicReference) {
        return atomicReference;
    }
}
