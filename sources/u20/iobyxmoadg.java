package u20;

import gg.kcexrzcfyt;
import gg.wwaezpbzkn;
import kotlin.coroutines.jvm.internal.wkgbmnqykc;
import kotlin.jvm.internal.zdlpuopuiu;
import lg.gxszxtbevo;
import pj.pkzmftpjix;
import ru.myspar.common.models.LocationData;
import ru.myspar.core.error_handler.exceptions.LocationException;

/* JADX INFO: loaded from: classes4.dex */
public final class iobyxmoadg extends ft.ppxfxbqfkf {

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final m30.iobyxmoadg f112514ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final u20.zoijcleaow f112515wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final j42.zoijcleaow f112516zoijcleaow;

    /* JADX INFO: renamed from: u20.iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
    static final class C2780iobyxmoadg extends wkgbmnqykc {

        /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
        int f112517iwizpuwonk;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        /* synthetic */ Object f112519yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        Object f112520zdlpuopuiu;

        C2780iobyxmoadg(gxszxtbevo gxszxtbevoVar) {
            super(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            this.f112519yggfygwlhe = obj;
            this.f112517iwizpuwonk |= Integer.MIN_VALUE;
            return iobyxmoadg.this.iobyxmoadg(null, this);
        }
    }

    static final class zoijcleaow extends wkgbmnqykc {

        /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
        int f112521iwizpuwonk;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        /* synthetic */ Object f112523yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        Object f112524zdlpuopuiu;

        zoijcleaow(gxszxtbevo gxszxtbevoVar) {
            super(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            this.f112523yggfygwlhe = obj;
            this.f112521iwizpuwonk |= Integer.MIN_VALUE;
            return iobyxmoadg.this.eablkybsjg(null, this);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public iobyxmoadg(j42.zoijcleaow locationProvider, m30.iobyxmoadg platformLocationProvider, u20.zoijcleaow getGpsEnabledUseCase, pkzmftpjix coroutineDispatcher) {
        super(coroutineDispatcher);
        zdlpuopuiu.btonecajqb(locationProvider, "locationProvider");
        zdlpuopuiu.btonecajqb(platformLocationProvider, "platformLocationProvider");
        zdlpuopuiu.btonecajqb(getGpsEnabledUseCase, "getGpsEnabledUseCase");
        zdlpuopuiu.btonecajqb(coroutineDispatcher, "coroutineDispatcher");
        this.f112516zoijcleaow = locationProvider;
        this.f112514ppxfxbqfkf = platformLocationProvider;
        this.f112515wkgbmnqykc = getGpsEnabledUseCase;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object eablkybsjg(Throwable th2, gxszxtbevo gxszxtbevoVar) throws Throwable {
        zoijcleaow zoijcleaowVar;
        if (gxszxtbevoVar instanceof zoijcleaow) {
            zoijcleaowVar = (zoijcleaow) gxszxtbevoVar;
            int i13 = zoijcleaowVar.f112521iwizpuwonk;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                zoijcleaowVar.f112521iwizpuwonk = i13 - Integer.MIN_VALUE;
            } else {
                zoijcleaowVar = new zoijcleaow(gxszxtbevoVar);
            }
        } else {
            zoijcleaowVar = new zoijcleaow(gxszxtbevoVar);
        }
        Object objZoijcleaow = zoijcleaowVar.f112523yggfygwlhe;
        Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
        int i14 = zoijcleaowVar.f112521iwizpuwonk;
        if (i14 == 0) {
            gg.zdlpuopuiu.zoijcleaow(objZoijcleaow);
            LocationData lastLocation = this.f112514ppxfxbqfkf.getLastLocation();
            if (lastLocation != null) {
                return lastLocation;
            }
            u20.zoijcleaow zoijcleaowVar2 = this.f112515wkgbmnqykc;
            wwaezpbzkn wwaezpbzknVar = wwaezpbzkn.f37140iobyxmoadg;
            zoijcleaowVar.f112524zdlpuopuiu = th2;
            zoijcleaowVar.f112521iwizpuwonk = 1;
            objZoijcleaow = zoijcleaowVar2.zoijcleaow(wwaezpbzknVar, zoijcleaowVar);
            if (objZoijcleaow == objGxszxtbevo) {
                return objGxszxtbevo;
            }
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            th2 = (Throwable) zoijcleaowVar.f112524zdlpuopuiu;
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
    @Override // ft.ppxfxbqfkf
    /* JADX INFO: renamed from: wkgbmnqykc, reason: merged with bridge method [inline-methods] */
    public Object iobyxmoadg(wwaezpbzkn wwaezpbzknVar, gxszxtbevo gxszxtbevoVar) throws Throwable {
        C2780iobyxmoadg c2780iobyxmoadg;
        Object objGxszxtbevo;
        iobyxmoadg iobyxmoadgVar;
        if (gxszxtbevoVar instanceof C2780iobyxmoadg) {
            c2780iobyxmoadg = (C2780iobyxmoadg) gxszxtbevoVar;
            int i13 = c2780iobyxmoadg.f112517iwizpuwonk;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                c2780iobyxmoadg.f112517iwizpuwonk = i13 - Integer.MIN_VALUE;
            } else {
                c2780iobyxmoadg = new C2780iobyxmoadg(gxszxtbevoVar);
            }
        } else {
            c2780iobyxmoadg = new C2780iobyxmoadg(gxszxtbevoVar);
        }
        Object objEablkybsjg = c2780iobyxmoadg.f112519yggfygwlhe;
        Object objGxszxtbevo2 = mg.zoijcleaow.gxszxtbevo();
        int i14 = c2780iobyxmoadg.f112517iwizpuwonk;
        if (i14 != 0) {
            if (i14 == 1) {
                iobyxmoadgVar = (iobyxmoadg) c2780iobyxmoadg.f112520zdlpuopuiu;
                gg.zdlpuopuiu.zoijcleaow(objEablkybsjg);
                objGxszxtbevo = ((kcexrzcfyt) objEablkybsjg).rgvfuqvkyq();
            } else if (i14 == 2) {
                iobyxmoadgVar = (iobyxmoadg) c2780iobyxmoadg.f112520zdlpuopuiu;
                gg.zdlpuopuiu.zoijcleaow(objEablkybsjg);
                objGxszxtbevo = (LocationData) objEablkybsjg;
                objEablkybsjg = (LocationData) objGxszxtbevo;
                if (objEablkybsjg == null) {
                    c2780iobyxmoadg.f112520zdlpuopuiu = null;
                    c2780iobyxmoadg.f112517iwizpuwonk = 3;
                    objEablkybsjg = gxszxtbevo(iobyxmoadgVar, null, c2780iobyxmoadg, 1, null);
                    if (objEablkybsjg == objGxszxtbevo2) {
                        return objGxszxtbevo2;
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
        j42.zoijcleaow zoijcleaowVar = this.f112516zoijcleaow;
        c2780iobyxmoadg.f112520zdlpuopuiu = this;
        c2780iobyxmoadg.f112517iwizpuwonk = 1;
        objGxszxtbevo = j42.zoijcleaow.gxszxtbevo(zoijcleaowVar, 0L, null, c2780iobyxmoadg, 3, null);
        if (objGxszxtbevo == objGxszxtbevo2) {
            return objGxszxtbevo2;
        }
        iobyxmoadgVar = this;
        Throwable thDxjokdxxww = kcexrzcfyt.dxjokdxxww(objGxszxtbevo);
        if (thDxjokdxxww == null) {
            objEablkybsjg = (LocationData) objGxszxtbevo;
            if (objEablkybsjg == null) {
                c2780iobyxmoadg.f112520zdlpuopuiu = null;
                c2780iobyxmoadg.f112517iwizpuwonk = 3;
                objEablkybsjg = gxszxtbevo(iobyxmoadgVar, null, c2780iobyxmoadg, 1, null);
                if (objEablkybsjg == objGxszxtbevo2) {
                    return objGxszxtbevo2;
                }
            }
        } else {
            c2780iobyxmoadg.f112520zdlpuopuiu = iobyxmoadgVar;
            c2780iobyxmoadg.f112517iwizpuwonk = 2;
            objEablkybsjg = iobyxmoadgVar.eablkybsjg(thDxjokdxxww, c2780iobyxmoadg);
            if (objEablkybsjg == objGxszxtbevo2) {
                return objGxszxtbevo2;
            }
            objGxszxtbevo = (LocationData) objEablkybsjg;
            objEablkybsjg = (LocationData) objGxszxtbevo;
            if (objEablkybsjg == null) {
                c2780iobyxmoadg.f112520zdlpuopuiu = null;
                c2780iobyxmoadg.f112517iwizpuwonk = 3;
                objEablkybsjg = gxszxtbevo(iobyxmoadgVar, null, c2780iobyxmoadg, 1, null);
                if (objEablkybsjg == objGxszxtbevo2) {
                    return objGxszxtbevo2;
                }
            }
        }
        return objEablkybsjg;
    }
}
