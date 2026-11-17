package fq1;

import android.content.Context;
import android.location.Location;
import android.location.LocationManager;
import com.google.android.gms.common.GoogleApiAvailability;
import com.google.android.gms.location.FusedLocationProviderClient;
import com.google.android.gms.location.LocationServices;
import com.google.android.gms.tasks.CancellationTokenSource;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import gg.kcexrzcfyt;
import gg.wwaezpbzkn;
import gg.zdlpuopuiu;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.jvm.internal.draadjrbmk;
import kotlin.jvm.internal.hkdspvbjdz;
import pj.agtfadlqog;
import pj.cllcsxoeiz;
import pj.dxjokdxxww;
import pj.f;
import pj.ikoacuggdj;
import pj.pkzmftpjix;
import ru.myspar.proloyalty.common.models.LocationData;
import ru.myspar.proloyalty.core.error_handler.exceptions.LocationException;
import ru.myspar.proloyalty.services.location.api.SystemServicesUnavailableException;
import tg.rgvfuqvkyq;

/* JADX INFO: loaded from: classes6.dex */
public final class wkgbmnqykc implements eq1.zoijcleaow {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final Context f34575iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final FusedLocationProviderClient f34576ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final boolean f34577wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final LocationManager f34578zoijcleaow;

    static final class eablkybsjg extends draadjrbmk implements rgvfuqvkyq {

        /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
        final /* synthetic */ long f34579iwizpuwonk;

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        final /* synthetic */ long f34580jyumaefscl;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        int f34582zdlpuopuiu;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        eablkybsjg(long j13, long j14, lg.gxszxtbevo gxszxtbevoVar) {
            super(2, gxszxtbevoVar);
            this.f34580jyumaefscl = j13;
            this.f34579iwizpuwonk = j14;
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
            return wkgbmnqykc.this.new eablkybsjg(this.f34580jyumaefscl, this.f34579iwizpuwonk, gxszxtbevoVar);
        }

        /* JADX WARN: Code duplicated, block: B:24:0x0061  */
        /* JADX WARN: Code duplicated, block: B:27:0x0066  */
        /* JADX WARN: Code duplicated, block: B:29:0x006f  */
        /* JADX WARN: Code duplicated, block: B:31:0x007d A[RETURN] */
        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            Object objEablkybsjg;
            LocationData locationData;
            Object objEablkybsjg2;
            Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
            int i13 = this.f34582zdlpuopuiu;
            if (i13 != 0) {
                if (i13 == 1) {
                    zdlpuopuiu.zoijcleaow(obj);
                } else if (i13 == 2) {
                    zdlpuopuiu.zoijcleaow(obj);
                    objEablkybsjg = ((kcexrzcfyt) obj).rgvfuqvkyq();
                    if (kcexrzcfyt.draadjrbmk(objEablkybsjg)) {
                        objEablkybsjg = null;
                    }
                    locationData = (LocationData) objEablkybsjg;
                    if (locationData != null) {
                        return kcexrzcfyt.iobyxmoadg(kcexrzcfyt.wkgbmnqykc(locationData));
                    }
                    wkgbmnqykc wkgbmnqykcVar = wkgbmnqykc.this;
                    long j13 = this.f34579iwizpuwonk;
                    eq1.iobyxmoadg iobyxmoadgVar = eq1.iobyxmoadg.HIGH_ACCURACY;
                    this.f34582zdlpuopuiu = 3;
                    objEablkybsjg2 = wkgbmnqykcVar.eablkybsjg(j13, iobyxmoadgVar, this);
                    if (objEablkybsjg2 == objGxszxtbevo) {
                        return objGxszxtbevo;
                    }
                } else {
                    if (i13 != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    zdlpuopuiu.zoijcleaow(obj);
                    objEablkybsjg2 = ((kcexrzcfyt) obj).rgvfuqvkyq();
                }
                return kcexrzcfyt.iobyxmoadg(objEablkybsjg2);
            }
            zdlpuopuiu.zoijcleaow(obj);
            wkgbmnqykc wkgbmnqykcVar2 = wkgbmnqykc.this;
            this.f34582zdlpuopuiu = 1;
            obj = wkgbmnqykcVar2.zdlpuopuiu(this);
            if (obj == objGxszxtbevo) {
                return objGxszxtbevo;
            }
            LocationData locationData2 = (LocationData) obj;
            if (locationData2 != null) {
                return kcexrzcfyt.iobyxmoadg(kcexrzcfyt.wkgbmnqykc(locationData2));
            }
            wkgbmnqykc wkgbmnqykcVar3 = wkgbmnqykc.this;
            long j14 = this.f34580jyumaefscl;
            eq1.iobyxmoadg iobyxmoadgVar2 = eq1.iobyxmoadg.BALANCED_POWER_ACCURACY;
            this.f34582zdlpuopuiu = 2;
            objEablkybsjg = wkgbmnqykcVar3.eablkybsjg(j14, iobyxmoadgVar2, this);
            if (objEablkybsjg == objGxszxtbevo) {
                return objGxszxtbevo;
            }
            if (kcexrzcfyt.draadjrbmk(objEablkybsjg)) {
                objEablkybsjg = null;
            }
            locationData = (LocationData) objEablkybsjg;
            if (locationData != null) {
                return kcexrzcfyt.iobyxmoadg(kcexrzcfyt.wkgbmnqykc(locationData));
            }
            wkgbmnqykc wkgbmnqykcVar4 = wkgbmnqykc.this;
            long j15 = this.f34579iwizpuwonk;
            eq1.iobyxmoadg iobyxmoadgVar3 = eq1.iobyxmoadg.HIGH_ACCURACY;
            this.f34582zdlpuopuiu = 3;
            objEablkybsjg2 = wkgbmnqykcVar4.eablkybsjg(j15, iobyxmoadgVar3, this);
            if (objEablkybsjg2 == objGxszxtbevo) {
                return objGxszxtbevo;
            }
            return kcexrzcfyt.iobyxmoadg(objEablkybsjg2);
        }

        @Override // tg.rgvfuqvkyq
        public final Object invoke(cllcsxoeiz cllcsxoeizVar, lg.gxszxtbevo gxszxtbevoVar) {
            return ((eablkybsjg) create(cllcsxoeizVar, gxszxtbevoVar)).invokeSuspend(wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    static final class gxszxtbevo implements tg.draadjrbmk {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final /* synthetic */ agtfadlqog f34583zdlpuopuiu;

        gxszxtbevo(agtfadlqog agtfadlqogVar) {
            this.f34583zdlpuopuiu = agtfadlqogVar;
        }

        @Override // tg.draadjrbmk
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            iobyxmoadg((LocationData) obj);
            return wwaezpbzkn.f37140iobyxmoadg;
        }

        public final void iobyxmoadg(LocationData locationData) {
            if (this.f34583zdlpuopuiu.isActive()) {
                this.f34583zdlpuopuiu.cllcsxoeiz(locationData, null);
            }
        }
    }

    public /* synthetic */ class iobyxmoadg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final /* synthetic */ int[] f34584iobyxmoadg;

        static {
            int[] iArr = new int[eq1.iobyxmoadg.values().length];
            try {
                iArr[eq1.iobyxmoadg.HIGH_ACCURACY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[eq1.iobyxmoadg.BALANCED_POWER_ACCURACY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[eq1.iobyxmoadg.LOW_POWER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[eq1.iobyxmoadg.PASSIVE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f34584iobyxmoadg = iArr;
        }
    }

    static final class lqeggnwhkg implements tg.draadjrbmk {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final /* synthetic */ agtfadlqog f34585zdlpuopuiu;

        lqeggnwhkg(agtfadlqog agtfadlqogVar) {
            this.f34585zdlpuopuiu = agtfadlqogVar;
        }

        @Override // tg.draadjrbmk
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            iobyxmoadg((Exception) obj);
            return wwaezpbzkn.f37140iobyxmoadg;
        }

        public final void iobyxmoadg(Exception it) {
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(it, "it");
            if (this.f34585zdlpuopuiu.isActive()) {
                this.f34585zdlpuopuiu.cllcsxoeiz(null, null);
            }
        }
    }

    static final class nufgyqmvbu implements OnSuccessListener {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final /* synthetic */ tg.draadjrbmk f34586iobyxmoadg;

        nufgyqmvbu(tg.draadjrbmk function) {
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(function, "function");
            this.f34586iobyxmoadg = function;
        }

        @Override // com.google.android.gms.tasks.OnSuccessListener
        public final /* synthetic */ void onSuccess(Object obj) {
            this.f34586iobyxmoadg.invoke(obj);
        }
    }

    static final class ppxfxbqfkf extends draadjrbmk implements rgvfuqvkyq {

        /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
        final /* synthetic */ long f34587cqumvgiudr;

        /* JADX INFO: renamed from: esjtqupxsv, reason: collision with root package name */
        final /* synthetic */ eq1.iobyxmoadg f34588esjtqupxsv;

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        int f34590jyumaefscl;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        Object f34591yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        Object f34592zdlpuopuiu;

        public static final class eablkybsjg extends draadjrbmk implements rgvfuqvkyq {

            /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
            final /* synthetic */ eq1.iobyxmoadg f34593cqumvgiudr;

            /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
            final /* synthetic */ wkgbmnqykc f34594iwizpuwonk;

            /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
            final /* synthetic */ hkdspvbjdz f34595jyumaefscl;

            /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
            int f34596yggfygwlhe;

            /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
            Object f34597zdlpuopuiu;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public eablkybsjg(hkdspvbjdz hkdspvbjdzVar, lg.gxszxtbevo gxszxtbevoVar, wkgbmnqykc wkgbmnqykcVar, eq1.iobyxmoadg iobyxmoadgVar) {
                super(2, gxszxtbevoVar);
                this.f34595jyumaefscl = hkdspvbjdzVar;
                this.f34594iwizpuwonk = wkgbmnqykcVar;
                this.f34593cqumvgiudr = iobyxmoadgVar;
            }

            @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
            public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
                return new eablkybsjg(this.f34595jyumaefscl, gxszxtbevoVar, this.f34594iwizpuwonk, this.f34593cqumvgiudr);
            }

            @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
            public final Object invokeSuspend(Object obj) {
                hkdspvbjdz hkdspvbjdzVar;
                Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
                int i13 = this.f34596yggfygwlhe;
                if (i13 == 0) {
                    zdlpuopuiu.zoijcleaow(obj);
                    hkdspvbjdz hkdspvbjdzVar2 = this.f34595jyumaefscl;
                    this.f34597zdlpuopuiu = hkdspvbjdzVar2;
                    this.f34596yggfygwlhe = 1;
                    pj.rgvfuqvkyq rgvfuqvkyqVar = new pj.rgvfuqvkyq(mg.zoijcleaow.ppxfxbqfkf(this), 1);
                    rgvfuqvkyqVar.lereixgezr();
                    if (!this.f34594iwizpuwonk.f34577wkgbmnqykc) {
                        kcexrzcfyt.iobyxmoadg iobyxmoadgVar = kcexrzcfyt.f37117yggfygwlhe;
                        rgvfuqvkyqVar.cllcsxoeiz(kcexrzcfyt.iobyxmoadg(kcexrzcfyt.wkgbmnqykc(zdlpuopuiu.iobyxmoadg(this.f34594iwizpuwonk.yggfygwlhe()))), null);
                    }
                    if (!this.f34594iwizpuwonk.jyumaefscl() && this.f34593cqumvgiudr == eq1.iobyxmoadg.HIGH_ACCURACY) {
                        rgvfuqvkyqVar.cllcsxoeiz(kcexrzcfyt.iobyxmoadg(kcexrzcfyt.wkgbmnqykc(null)), null);
                    }
                    CancellationTokenSource cancellationTokenSource = new CancellationTokenSource();
                    this.f34594iwizpuwonk.f34576ppxfxbqfkf.getCurrentLocation(this.f34594iwizpuwonk.cqumvgiudr(this.f34593cqumvgiudr), cancellationTokenSource.getToken()).addOnSuccessListener(new nufgyqmvbu(new iobyxmoadg(this.f34594iwizpuwonk, rgvfuqvkyqVar, cancellationTokenSource))).addOnFailureListener(new zoijcleaow(rgvfuqvkyqVar, cancellationTokenSource));
                    rgvfuqvkyqVar.stevsuqkhv(new C0764ppxfxbqfkf(cancellationTokenSource));
                    Object objZdlpuopuiu = rgvfuqvkyqVar.zdlpuopuiu();
                    if (objZdlpuopuiu == mg.zoijcleaow.gxszxtbevo()) {
                        kotlin.coroutines.jvm.internal.nufgyqmvbu.ppxfxbqfkf(this);
                    }
                    if (objZdlpuopuiu == objGxszxtbevo) {
                        return objGxszxtbevo;
                    }
                    hkdspvbjdzVar = hkdspvbjdzVar2;
                    obj = objZdlpuopuiu;
                } else {
                    if (i13 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    hkdspvbjdzVar = (hkdspvbjdz) this.f34597zdlpuopuiu;
                    zdlpuopuiu.zoijcleaow(obj);
                }
                hkdspvbjdzVar.f60015zdlpuopuiu = obj;
                return wwaezpbzkn.f37140iobyxmoadg;
            }

            @Override // tg.rgvfuqvkyq
            public final Object invoke(cllcsxoeiz cllcsxoeizVar, lg.gxszxtbevo gxszxtbevoVar) {
                return ((eablkybsjg) create(cllcsxoeizVar, gxszxtbevoVar)).invokeSuspend(wwaezpbzkn.f37140iobyxmoadg);
            }
        }

        static final class iobyxmoadg implements tg.draadjrbmk {

            /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
            final /* synthetic */ CancellationTokenSource f34598jyumaefscl;

            /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
            final /* synthetic */ agtfadlqog f34599yggfygwlhe;

            /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
            final /* synthetic */ wkgbmnqykc f34600zdlpuopuiu;

            iobyxmoadg(wkgbmnqykc wkgbmnqykcVar, agtfadlqog agtfadlqogVar, CancellationTokenSource cancellationTokenSource) {
                this.f34600zdlpuopuiu = wkgbmnqykcVar;
                this.f34599yggfygwlhe = agtfadlqogVar;
                this.f34598jyumaefscl = cancellationTokenSource;
            }

            @Override // tg.draadjrbmk
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                iobyxmoadg((Location) obj);
                return wwaezpbzkn.f37140iobyxmoadg;
            }

            public final void iobyxmoadg(Location location) {
                agtfadlqog agtfadlqogVar = this.f34599yggfygwlhe;
                CancellationTokenSource cancellationTokenSource = this.f34598jyumaefscl;
                kcexrzcfyt.iobyxmoadg iobyxmoadgVar = kcexrzcfyt.f37117yggfygwlhe;
                ppxfxbqfkf.kcexrzcfyt(agtfadlqogVar, cancellationTokenSource, kcexrzcfyt.wkgbmnqykc(location != null ? this.f34600zdlpuopuiu.iwizpuwonk(location) : null));
            }
        }

        /* JADX INFO: renamed from: fq1.wkgbmnqykc$ppxfxbqfkf$ppxfxbqfkf, reason: collision with other inner class name */
        static final class C0764ppxfxbqfkf implements tg.draadjrbmk {

            /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
            final /* synthetic */ CancellationTokenSource f34601zdlpuopuiu;

            C0764ppxfxbqfkf(CancellationTokenSource cancellationTokenSource) {
                this.f34601zdlpuopuiu = cancellationTokenSource;
            }

            @Override // tg.draadjrbmk
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                iobyxmoadg((Throwable) obj);
                return wwaezpbzkn.f37140iobyxmoadg;
            }

            public final void iobyxmoadg(Throwable th2) {
                this.f34601zdlpuopuiu.cancel();
            }
        }

        /* JADX INFO: renamed from: fq1.wkgbmnqykc$ppxfxbqfkf$wkgbmnqykc, reason: collision with other inner class name */
        static final class C0765wkgbmnqykc implements tg.draadjrbmk {

            /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
            final /* synthetic */ CancellationTokenSource f34602zdlpuopuiu;

            C0765wkgbmnqykc(CancellationTokenSource cancellationTokenSource) {
                this.f34602zdlpuopuiu = cancellationTokenSource;
            }

            @Override // tg.draadjrbmk
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                iobyxmoadg((Throwable) obj);
                return wwaezpbzkn.f37140iobyxmoadg;
            }

            public final void iobyxmoadg(Throwable it) {
                kotlin.jvm.internal.zdlpuopuiu.btonecajqb(it, "it");
                this.f34602zdlpuopuiu.cancel();
            }
        }

        static final class zoijcleaow implements OnFailureListener {

            /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
            final /* synthetic */ agtfadlqog f34603iobyxmoadg;

            /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
            final /* synthetic */ CancellationTokenSource f34604zoijcleaow;

            zoijcleaow(agtfadlqog agtfadlqogVar, CancellationTokenSource cancellationTokenSource) {
                this.f34603iobyxmoadg = agtfadlqogVar;
                this.f34604zoijcleaow = cancellationTokenSource;
            }

            @Override // com.google.android.gms.tasks.OnFailureListener
            public final void onFailure(Exception it) {
                kotlin.jvm.internal.zdlpuopuiu.btonecajqb(it, "it");
                agtfadlqog agtfadlqogVar = this.f34603iobyxmoadg;
                CancellationTokenSource cancellationTokenSource = this.f34604zoijcleaow;
                kcexrzcfyt.iobyxmoadg iobyxmoadgVar = kcexrzcfyt.f37117yggfygwlhe;
                ppxfxbqfkf.kcexrzcfyt(agtfadlqogVar, cancellationTokenSource, kcexrzcfyt.wkgbmnqykc(zdlpuopuiu.iobyxmoadg(new LocationException())));
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        ppxfxbqfkf(long j13, eq1.iobyxmoadg iobyxmoadgVar, lg.gxszxtbevo gxszxtbevoVar) {
            super(2, gxszxtbevoVar);
            this.f34587cqumvgiudr = j13;
            this.f34588esjtqupxsv = iobyxmoadgVar;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void kcexrzcfyt(agtfadlqog agtfadlqogVar, CancellationTokenSource cancellationTokenSource, Object obj) {
            if (agtfadlqogVar.isActive()) {
                agtfadlqogVar.cllcsxoeiz(kcexrzcfyt.iobyxmoadg(obj), new C0765wkgbmnqykc(cancellationTokenSource));
            }
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
            return wkgbmnqykc.this.new ppxfxbqfkf(this.f34587cqumvgiudr, this.f34588esjtqupxsv, gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            kcexrzcfyt kcexrzcfytVarIobyxmoadg;
            hkdspvbjdz hkdspvbjdzVar;
            Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
            int i13 = this.f34590jyumaefscl;
            if (i13 == 0) {
                zdlpuopuiu.zoijcleaow(obj);
                long j13 = this.f34587cqumvgiudr;
                kcexrzcfytVarIobyxmoadg = kcexrzcfyt.iobyxmoadg(kcexrzcfyt.wkgbmnqykc(null));
                wkgbmnqykc wkgbmnqykcVar = wkgbmnqykc.this;
                eq1.iobyxmoadg iobyxmoadgVar = this.f34588esjtqupxsv;
                hkdspvbjdz hkdspvbjdzVar2 = new hkdspvbjdz();
                eablkybsjg eablkybsjgVar = new eablkybsjg(hkdspvbjdzVar2, null, wkgbmnqykcVar, iobyxmoadgVar);
                this.f34592zdlpuopuiu = kcexrzcfytVarIobyxmoadg;
                this.f34591yggfygwlhe = hkdspvbjdzVar2;
                this.f34590jyumaefscl = 1;
                if (f.eablkybsjg(j13, eablkybsjgVar, this) == objGxszxtbevo) {
                    return objGxszxtbevo;
                }
                hkdspvbjdzVar = hkdspvbjdzVar2;
            } else {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                hkdspvbjdzVar = (hkdspvbjdz) this.f34591yggfygwlhe;
                kcexrzcfytVarIobyxmoadg = (kcexrzcfyt) this.f34592zdlpuopuiu;
                zdlpuopuiu.zoijcleaow(obj);
            }
            Object obj2 = hkdspvbjdzVar.f60015zdlpuopuiu;
            return obj2 == null ? kcexrzcfytVarIobyxmoadg : obj2;
        }

        @Override // tg.rgvfuqvkyq
        public final Object invoke(cllcsxoeiz cllcsxoeizVar, lg.gxszxtbevo gxszxtbevoVar) {
            return ((ppxfxbqfkf) create(cllcsxoeizVar, gxszxtbevoVar)).invokeSuspend(wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    /* JADX INFO: renamed from: fq1.wkgbmnqykc$wkgbmnqykc, reason: collision with other inner class name */
    static final class C0766wkgbmnqykc extends kotlin.coroutines.jvm.internal.wkgbmnqykc {

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        int f34605jyumaefscl;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        /* synthetic */ Object f34607zdlpuopuiu;

        C0766wkgbmnqykc(lg.gxszxtbevo gxszxtbevoVar) {
            super(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            this.f34607zdlpuopuiu = obj;
            this.f34605jyumaefscl |= Integer.MIN_VALUE;
            Object objPpxfxbqfkf = wkgbmnqykc.this.ppxfxbqfkf(0L, 0L, this);
            return objPpxfxbqfkf == mg.zoijcleaow.gxszxtbevo() ? objPpxfxbqfkf : kcexrzcfyt.iobyxmoadg(objPpxfxbqfkf);
        }
    }

    static final class zoijcleaow extends kotlin.coroutines.jvm.internal.wkgbmnqykc {

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        int f34608jyumaefscl;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        /* synthetic */ Object f34610zdlpuopuiu;

        zoijcleaow(lg.gxszxtbevo gxszxtbevoVar) {
            super(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            this.f34610zdlpuopuiu = obj;
            this.f34608jyumaefscl |= Integer.MIN_VALUE;
            Object objEablkybsjg = wkgbmnqykc.this.eablkybsjg(0L, null, this);
            return objEablkybsjg == mg.zoijcleaow.gxszxtbevo() ? objEablkybsjg : kcexrzcfyt.iobyxmoadg(objEablkybsjg);
        }
    }

    public wkgbmnqykc(Context context, LocationManager locationManager) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(context, "context");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(locationManager, "locationManager");
        this.f34575iobyxmoadg = context;
        this.f34578zoijcleaow = locationManager;
        FusedLocationProviderClient fusedLocationProviderClient = LocationServices.getFusedLocationProviderClient(context);
        kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(fusedLocationProviderClient, "getFusedLocationProviderClient(...)");
        this.f34576ppxfxbqfkf = fusedLocationProviderClient;
        this.f34577wkgbmnqykc = GoogleApiAvailability.getInstance().isGooglePlayServicesAvailable(context) == 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int cqumvgiudr(eq1.iobyxmoadg iobyxmoadgVar) {
        int i13 = iobyxmoadg.f34584iobyxmoadg[iobyxmoadgVar.ordinal()];
        if (i13 == 1) {
            return 100;
        }
        if (i13 == 2) {
            return 102;
        }
        if (i13 == 3 || i13 == 4) {
            return 104;
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final LocationData iwizpuwonk(Location location) {
        return new LocationData(location.getLatitude(), location.getLongitude());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean jyumaefscl() {
        return this.f34578zoijcleaow.isProviderEnabled("gps");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void kcexrzcfyt(tg.draadjrbmk draadjrbmkVar, Exception it) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(it, "it");
        if (draadjrbmkVar != null) {
            draadjrbmkVar.invoke(new LocationException());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void oxmwwwfdhm(tg.draadjrbmk draadjrbmkVar, Object obj) {
        draadjrbmkVar.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wwaezpbzkn vdvldrhtss(tg.draadjrbmk draadjrbmkVar, wkgbmnqykc wkgbmnqykcVar, Location location) {
        draadjrbmkVar.invoke(location != null ? wkgbmnqykcVar.iwizpuwonk(location) : null);
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final SystemServicesUnavailableException yggfygwlhe() {
        String string = this.f34575iobyxmoadg.getString(fq1.eablkybsjg.proloyalty_error_system_services_unavailable);
        kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(string, "getString(...)");
        return new SystemServicesUnavailableException(string);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object zdlpuopuiu(lg.gxszxtbevo gxszxtbevoVar) {
        pj.rgvfuqvkyq rgvfuqvkyqVar = new pj.rgvfuqvkyq(mg.zoijcleaow.ppxfxbqfkf(gxszxtbevoVar), 1);
        rgvfuqvkyqVar.lereixgezr();
        iobyxmoadg(new gxszxtbevo(rgvfuqvkyqVar), new lqeggnwhkg(rgvfuqvkyqVar));
        Object objZdlpuopuiu = rgvfuqvkyqVar.zdlpuopuiu();
        if (objZdlpuopuiu == mg.zoijcleaow.gxszxtbevo()) {
            kotlin.coroutines.jvm.internal.nufgyqmvbu.ppxfxbqfkf(gxszxtbevoVar);
        }
        return objZdlpuopuiu;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // eq1.zoijcleaow
    public Object eablkybsjg(long j13, eq1.iobyxmoadg iobyxmoadgVar, lg.gxszxtbevo gxszxtbevoVar) {
        zoijcleaow zoijcleaowVar;
        if (gxszxtbevoVar instanceof zoijcleaow) {
            zoijcleaowVar = (zoijcleaow) gxszxtbevoVar;
            int i13 = zoijcleaowVar.f34608jyumaefscl;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                zoijcleaowVar.f34608jyumaefscl = i13 - Integer.MIN_VALUE;
            } else {
                zoijcleaowVar = new zoijcleaow(gxszxtbevoVar);
            }
        } else {
            zoijcleaowVar = new zoijcleaow(gxszxtbevoVar);
        }
        Object objLqeggnwhkg = zoijcleaowVar.f34610zdlpuopuiu;
        Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
        int i14 = zoijcleaowVar.f34608jyumaefscl;
        if (i14 == 0) {
            zdlpuopuiu.zoijcleaow(objLqeggnwhkg);
            pkzmftpjix pkzmftpjixVarZoijcleaow = ikoacuggdj.zoijcleaow();
            ppxfxbqfkf ppxfxbqfkfVar = new ppxfxbqfkf(j13, iobyxmoadgVar, null);
            zoijcleaowVar.f34608jyumaefscl = 1;
            objLqeggnwhkg = dxjokdxxww.lqeggnwhkg(pkzmftpjixVarZoijcleaow, ppxfxbqfkfVar, zoijcleaowVar);
            if (objLqeggnwhkg == objGxszxtbevo) {
                return objGxszxtbevo;
            }
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            zdlpuopuiu.zoijcleaow(objLqeggnwhkg);
        }
        return ((kcexrzcfyt) objLqeggnwhkg).rgvfuqvkyq();
    }

    @Override // eq1.zoijcleaow
    public void iobyxmoadg(final tg.draadjrbmk successListener, final tg.draadjrbmk draadjrbmkVar) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(successListener, "successListener");
        if (this.f34577wkgbmnqykc) {
            Task<Location> lastLocation = this.f34576ppxfxbqfkf.getLastLocation();
            final tg.draadjrbmk draadjrbmkVar2 = new tg.draadjrbmk() { // from class: fq1.iobyxmoadg
                @Override // tg.draadjrbmk
                public final Object invoke(Object obj) {
                    return wkgbmnqykc.vdvldrhtss(successListener, this, (Location) obj);
                }
            };
            lastLocation.addOnSuccessListener(new OnSuccessListener() { // from class: fq1.zoijcleaow
                @Override // com.google.android.gms.tasks.OnSuccessListener
                public final void onSuccess(Object obj) {
                    wkgbmnqykc.oxmwwwfdhm(draadjrbmkVar2, obj);
                }
            }).addOnFailureListener(new OnFailureListener() { // from class: fq1.ppxfxbqfkf
                @Override // com.google.android.gms.tasks.OnFailureListener
                public final void onFailure(Exception exc) {
                    wkgbmnqykc.kcexrzcfyt(draadjrbmkVar, exc);
                }
            });
        } else if (draadjrbmkVar != null) {
            draadjrbmkVar.invoke(yggfygwlhe());
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    @Override // eq1.zoijcleaow
    public Object ppxfxbqfkf(long j13, long j14, lg.gxszxtbevo gxszxtbevoVar) {
        C0766wkgbmnqykc c0766wkgbmnqykc;
        if (gxszxtbevoVar instanceof C0766wkgbmnqykc) {
            c0766wkgbmnqykc = (C0766wkgbmnqykc) gxszxtbevoVar;
            int i13 = c0766wkgbmnqykc.f34605jyumaefscl;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                c0766wkgbmnqykc.f34605jyumaefscl = i13 - Integer.MIN_VALUE;
            } else {
                c0766wkgbmnqykc = new C0766wkgbmnqykc(gxszxtbevoVar);
            }
        } else {
            c0766wkgbmnqykc = new C0766wkgbmnqykc(gxszxtbevoVar);
        }
        Object objLqeggnwhkg = c0766wkgbmnqykc.f34607zdlpuopuiu;
        Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
        int i14 = c0766wkgbmnqykc.f34605jyumaefscl;
        if (i14 == 0) {
            zdlpuopuiu.zoijcleaow(objLqeggnwhkg);
            pkzmftpjix pkzmftpjixVarZoijcleaow = ikoacuggdj.zoijcleaow();
            eablkybsjg eablkybsjgVar = new eablkybsjg(j13, j14, null);
            c0766wkgbmnqykc.f34605jyumaefscl = 1;
            objLqeggnwhkg = dxjokdxxww.lqeggnwhkg(pkzmftpjixVarZoijcleaow, eablkybsjgVar, c0766wkgbmnqykc);
            if (objLqeggnwhkg == objGxszxtbevo) {
                return objGxszxtbevo;
            }
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            zdlpuopuiu.zoijcleaow(objLqeggnwhkg);
        }
        return ((kcexrzcfyt) objLqeggnwhkg).rgvfuqvkyq();
    }
}
