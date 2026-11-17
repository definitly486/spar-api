package z01;

import gg.kcexrzcfyt;
import gg.wwaezpbzkn;
import kotlin.coroutines.jvm.internal.wkgbmnqykc;
import kotlin.jvm.internal.zdlpuopuiu;
import lg.gxszxtbevo;
import pj.pkzmftpjix;
import ru.myspar.proloyalty.common.models.LocationData;
import ru.myspar.proloyalty.core.error_handler.exceptions.LocationException;

/* JADX INFO: loaded from: classes5.dex */
public final class iobyxmoadg extends zr0.ppxfxbqfkf {

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final s11.iobyxmoadg f127512ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final z01.zoijcleaow f127513wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final eq1.zoijcleaow f127514zoijcleaow;

    /* JADX INFO: renamed from: z01.iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
    static final class C3253iobyxmoadg extends wkgbmnqykc {

        /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
        int f127515iwizpuwonk;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        /* synthetic */ Object f127517yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        Object f127518zdlpuopuiu;

        C3253iobyxmoadg(gxszxtbevo gxszxtbevoVar) {
            super(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            this.f127517yggfygwlhe = obj;
            this.f127515iwizpuwonk |= Integer.MIN_VALUE;
            return iobyxmoadg.this.iobyxmoadg(null, this);
        }
    }

    static final class zoijcleaow extends wkgbmnqykc {

        /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
        int f127519iwizpuwonk;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        /* synthetic */ Object f127521yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        Object f127522zdlpuopuiu;

        zoijcleaow(gxszxtbevo gxszxtbevoVar) {
            super(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            this.f127521yggfygwlhe = obj;
            this.f127519iwizpuwonk |= Integer.MIN_VALUE;
            return iobyxmoadg.this.eablkybsjg(null, this);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public iobyxmoadg(eq1.zoijcleaow locationProvider, s11.iobyxmoadg platformLocationProvider, z01.zoijcleaow getGpsEnabledUseCase, pkzmftpjix coroutineDispatcher) {
        super(coroutineDispatcher);
        zdlpuopuiu.btonecajqb(locationProvider, "locationProvider");
        zdlpuopuiu.btonecajqb(platformLocationProvider, "platformLocationProvider");
        zdlpuopuiu.btonecajqb(getGpsEnabledUseCase, "getGpsEnabledUseCase");
        zdlpuopuiu.btonecajqb(coroutineDispatcher, "coroutineDispatcher");
        this.f127514zoijcleaow = locationProvider;
        this.f127512ppxfxbqfkf = platformLocationProvider;
        this.f127513wkgbmnqykc = getGpsEnabledUseCase;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object eablkybsjg(Throwable th2, gxszxtbevo gxszxtbevoVar) throws Throwable {
        zoijcleaow zoijcleaowVar;
        if (gxszxtbevoVar instanceof zoijcleaow) {
            zoijcleaowVar = (zoijcleaow) gxszxtbevoVar;
            int i13 = zoijcleaowVar.f127519iwizpuwonk;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                zoijcleaowVar.f127519iwizpuwonk = i13 - Integer.MIN_VALUE;
            } else {
                zoijcleaowVar = new zoijcleaow(gxszxtbevoVar);
            }
        } else {
            zoijcleaowVar = new zoijcleaow(gxszxtbevoVar);
        }
        Object objZoijcleaow = zoijcleaowVar.f127521yggfygwlhe;
        Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
        int i14 = zoijcleaowVar.f127519iwizpuwonk;
        if (i14 == 0) {
            gg.zdlpuopuiu.zoijcleaow(objZoijcleaow);
            LocationData lastLocation = this.f127512ppxfxbqfkf.getLastLocation();
            if (lastLocation != null) {
                return lastLocation;
            }
            z01.zoijcleaow zoijcleaowVar2 = this.f127513wkgbmnqykc;
            wwaezpbzkn wwaezpbzknVar = wwaezpbzkn.f37140iobyxmoadg;
            zoijcleaowVar.f127522zdlpuopuiu = th2;
            zoijcleaowVar.f127519iwizpuwonk = 1;
            objZoijcleaow = zoijcleaowVar2.zoijcleaow(wwaezpbzknVar, zoijcleaowVar);
            if (objZoijcleaow == objGxszxtbevo) {
                return objGxszxtbevo;
            }
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            th2 = (Throwable) zoijcleaowVar.f127522zdlpuopuiu;
            gg.zdlpuopuiu.zoijcleaow(objZoijcleaow);
        }
        gg.zdlpuopuiu.zoijcleaow(((kcexrzcfyt) objZoijcleaow).rgvfuqvkyq());
        throw th2;
    }

    static /* synthetic */ Object gxszxtbevo(iobyxmoadg iobyxmoadgVar, Throwable th2, gxszxtbevo gxszxtbevoVar, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            th2 = new LocationException();
        }
        return iobyxmoadgVar.eablkybsjg(th2, gxszxtbevoVar);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Code duplicated, block: B:31:0x007c  */
    /* JADX WARN: Code duplicated, block: B:33:0x0087 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // zr0.ppxfxbqfkf
    /* JADX INFO: renamed from: wkgbmnqykc, reason: merged with bridge method [inline-methods] */
    public Object iobyxmoadg(wwaezpbzkn wwaezpbzknVar, gxszxtbevo gxszxtbevoVar) throws Throwable {
        C3253iobyxmoadg c3253iobyxmoadg;
        Object objWkgbmnqykc;
        iobyxmoadg iobyxmoadgVar;
        if (gxszxtbevoVar instanceof C3253iobyxmoadg) {
            c3253iobyxmoadg = (C3253iobyxmoadg) gxszxtbevoVar;
            int i13 = c3253iobyxmoadg.f127515iwizpuwonk;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                c3253iobyxmoadg.f127515iwizpuwonk = i13 - Integer.MIN_VALUE;
            } else {
                c3253iobyxmoadg = new C3253iobyxmoadg(gxszxtbevoVar);
            }
        } else {
            c3253iobyxmoadg = new C3253iobyxmoadg(gxszxtbevoVar);
        }
        Object objEablkybsjg = c3253iobyxmoadg.f127517yggfygwlhe;
        Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
        int i14 = c3253iobyxmoadg.f127515iwizpuwonk;
        if (i14 != 0) {
            if (i14 == 1) {
                iobyxmoadgVar = (iobyxmoadg) c3253iobyxmoadg.f127518zdlpuopuiu;
                gg.zdlpuopuiu.zoijcleaow(objEablkybsjg);
                objWkgbmnqykc = ((kcexrzcfyt) objEablkybsjg).rgvfuqvkyq();
            } else if (i14 == 2) {
                iobyxmoadgVar = (iobyxmoadg) c3253iobyxmoadg.f127518zdlpuopuiu;
                gg.zdlpuopuiu.zoijcleaow(objEablkybsjg);
                objWkgbmnqykc = (LocationData) objEablkybsjg;
                objEablkybsjg = (LocationData) objWkgbmnqykc;
                if (objEablkybsjg == null) {
                    c3253iobyxmoadg.f127518zdlpuopuiu = null;
                    c3253iobyxmoadg.f127515iwizpuwonk = 3;
                    objEablkybsjg = gxszxtbevo(iobyxmoadgVar, null, c3253iobyxmoadg, 1, null);
                    if (objEablkybsjg == objGxszxtbevo) {
                        return objGxszxtbevo;
                    }
                }
            } else {
                if (i14 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                gg.zdlpuopuiu.zoijcleaow(objEablkybsjg);
            }
            return objEablkybsjg;
        }
        gg.zdlpuopuiu.zoijcleaow(objEablkybsjg);
        eq1.zoijcleaow zoijcleaowVar = this.f127514zoijcleaow;
        c3253iobyxmoadg.f127518zdlpuopuiu = this;
        c3253iobyxmoadg.f127515iwizpuwonk = 1;
        objWkgbmnqykc = eq1.zoijcleaow.wkgbmnqykc(zoijcleaowVar, 0L, null, c3253iobyxmoadg, 3, null);
        if (objWkgbmnqykc == objGxszxtbevo) {
            return objGxszxtbevo;
        }
        iobyxmoadgVar = this;
        Throwable thDxjokdxxww = kcexrzcfyt.dxjokdxxww(objWkgbmnqykc);
        if (thDxjokdxxww == null) {
            objEablkybsjg = (LocationData) objWkgbmnqykc;
            if (objEablkybsjg == null) {
                c3253iobyxmoadg.f127518zdlpuopuiu = null;
                c3253iobyxmoadg.f127515iwizpuwonk = 3;
                objEablkybsjg = gxszxtbevo(iobyxmoadgVar, null, c3253iobyxmoadg, 1, null);
                if (objEablkybsjg == objGxszxtbevo) {
                    return objGxszxtbevo;
                }
            }
        } else {
            c3253iobyxmoadg.f127518zdlpuopuiu = iobyxmoadgVar;
            c3253iobyxmoadg.f127515iwizpuwonk = 2;
            objEablkybsjg = iobyxmoadgVar.eablkybsjg(thDxjokdxxww, c3253iobyxmoadg);
            if (objEablkybsjg == objGxszxtbevo) {
                return objGxszxtbevo;
            }
            objWkgbmnqykc = (LocationData) objEablkybsjg;
            objEablkybsjg = (LocationData) objWkgbmnqykc;
            if (objEablkybsjg == null) {
                c3253iobyxmoadg.f127518zdlpuopuiu = null;
                c3253iobyxmoadg.f127515iwizpuwonk = 3;
                objEablkybsjg = gxszxtbevo(iobyxmoadgVar, null, c3253iobyxmoadg, 1, null);
                if (objEablkybsjg == objGxszxtbevo) {
                    return objGxszxtbevo;
                }
            }
        }
        return objEablkybsjg;
    }
}
