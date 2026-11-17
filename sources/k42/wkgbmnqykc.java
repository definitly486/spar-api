package k42;

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
import ru.myspar.common.models.LocationData;
import ru.myspar.core.error_handler.exceptions.LocationException;
import ru.myspar.services.location.api.SystemServicesUnavailableException;
import tg.rgvfuqvkyq;

/* JADX INFO: loaded from: classes6.dex */
public final class wkgbmnqykc implements j42.zoijcleaow {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final Context f53790iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final FusedLocationProviderClient f53791ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final boolean f53792wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final LocationManager f53793zoijcleaow;

    static final class eablkybsjg extends draadjrbmk implements rgvfuqvkyq {

        /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
        final /* synthetic */ long f53794iwizpuwonk;

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        final /* synthetic */ long f53795jyumaefscl;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        int f53797zdlpuopuiu;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        eablkybsjg(long j13, long j14, lg.gxszxtbevo gxszxtbevoVar) {
            super(2, gxszxtbevoVar);
            this.f53795jyumaefscl = j13;
            this.f53794iwizpuwonk = j14;
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
            return wkgbmnqykc.this.new eablkybsjg(this.f53795jyumaefscl, this.f53794iwizpuwonk, gxszxtbevoVar);
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
            int i13 = this.f53797zdlpuopuiu;
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
                    long j13 = this.f53794iwizpuwonk;
                    j42.iobyxmoadg iobyxmoadgVar = j42.iobyxmoadg.HIGH_ACCURACY;
                    this.f53797zdlpuopuiu = 3;
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
            this.f53797zdlpuopuiu = 1;
            obj = wkgbmnqykcVar2.zdlpuopuiu(this);
            if (obj == objGxszxtbevo) {
                return objGxszxtbevo;
            }
            LocationData locationData2 = (LocationData) obj;
            if (locationData2 != null) {
                return kcexrzcfyt.iobyxmoadg(kcexrzcfyt.wkgbmnqykc(locationData2));
            }
            wkgbmnqykc wkgbmnqykcVar3 = wkgbmnqykc.this;
            long j14 = this.f53795jyumaefscl;
            j42.iobyxmoadg iobyxmoadgVar2 = j42.iobyxmoadg.BALANCED_POWER_ACCURACY;
            this.f53797zdlpuopuiu = 2;
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
            long j15 = this.f53794iwizpuwonk;
            j42.iobyxmoadg iobyxmoadgVar3 = j42.iobyxmoadg.HIGH_ACCURACY;
            this.f53797zdlpuopuiu = 3;
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
        final /* synthetic */ agtfadlqog f53798zdlpuopuiu;

        gxszxtbevo(agtfadlqog agtfadlqogVar) {
            this.f53798zdlpuopuiu = agtfadlqogVar;
        }

        @Override // tg.draadjrbmk
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            iobyxmoadg((LocationData) obj);
            return wwaezpbzkn.f37140iobyxmoadg;
        }

        public final void iobyxmoadg(LocationData locationData) {
            if (this.f53798zdlpuopuiu.isActive()) {
                this.f53798zdlpuopuiu.cllcsxoeiz(locationData, null);
            }
        }
    }

    public /* synthetic */ class iobyxmoadg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final /* synthetic */ int[] f53799iobyxmoadg;

        static {
            int[] iArr = new int[j42.iobyxmoadg.values().length];
            try {
                iArr[j42.iobyxmoadg.HIGH_ACCURACY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[j42.iobyxmoadg.BALANCED_POWER_ACCURACY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[j42.iobyxmoadg.LOW_POWER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[j42.iobyxmoadg.PASSIVE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f53799iobyxmoadg = iArr;
        }
    }

    static final class lqeggnwhkg implements tg.draadjrbmk {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final /* synthetic */ agtfadlqog f53800zdlpuopuiu;

        lqeggnwhkg(agtfadlqog agtfadlqogVar) {
            this.f53800zdlpuopuiu = agtfadlqogVar;
        }

        @Override // tg.draadjrbmk
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            iobyxmoadg((Exception) obj);
            return wwaezpbzkn.f37140iobyxmoadg;
        }

        public final void iobyxmoadg(Exception it) {
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(it, "it");
            if (this.f53800zdlpuopuiu.isActive()) {
                this.f53800zdlpuopuiu.cllcsxoeiz(null, null);
            }
        }
    }

    static final class nufgyqmvbu implements OnSuccessListener {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final /* synthetic */ tg.draadjrbmk f53801iobyxmoadg;

        nufgyqmvbu(tg.draadjrbmk function) {
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(function, "function");
            this.f53801iobyxmoadg = function;
        }

        @Override // com.google.android.gms.tasks.OnSuccessListener
        public final /* synthetic */ void onSuccess(Object obj) {
            this.f53801iobyxmoadg.invoke(obj);
        }
    }

    static final class ppxfxbqfkf extends draadjrbmk implements rgvfuqvkyq {

        /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
        final /* synthetic */ long f53802cqumvgiudr;

        /* JADX INFO: renamed from: esjtqupxsv, reason: collision with root package name */
        final /* synthetic */ j42.iobyxmoadg f53803esjtqupxsv;

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        int f53805jyumaefscl;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        Object f53806yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        Object f53807zdlpuopuiu;

        public static final class eablkybsjg extends draadjrbmk implements rgvfuqvkyq {

            /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
            final /* synthetic */ j42.iobyxmoadg f53808cqumvgiudr;

            /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
            final /* synthetic */ wkgbmnqykc f53809iwizpuwonk;

            /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
            final /* synthetic */ hkdspvbjdz f53810jyumaefscl;

            /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
            int f53811yggfygwlhe;

            /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
            Object f53812zdlpuopuiu;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public eablkybsjg(hkdspvbjdz hkdspvbjdzVar, lg.gxszxtbevo gxszxtbevoVar, wkgbmnqykc wkgbmnqykcVar, j42.iobyxmoadg iobyxmoadgVar) {
                super(2, gxszxtbevoVar);
                this.f53810jyumaefscl = hkdspvbjdzVar;
                this.f53809iwizpuwonk = wkgbmnqykcVar;
                this.f53808cqumvgiudr = iobyxmoadgVar;
            }

            @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
            public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
                return new eablkybsjg(this.f53810jyumaefscl, gxszxtbevoVar, this.f53809iwizpuwonk, this.f53808cqumvgiudr);
            }

            @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
            public final Object invokeSuspend(Object obj) {
                hkdspvbjdz hkdspvbjdzVar;
                Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
                int i13 = this.f53811yggfygwlhe;
                if (i13 == 0) {
                    zdlpuopuiu.zoijcleaow(obj);
                    hkdspvbjdz hkdspvbjdzVar2 = this.f53810jyumaefscl;
                    this.f53812zdlpuopuiu = hkdspvbjdzVar2;
                    this.f53811yggfygwlhe = 1;
                    pj.rgvfuqvkyq rgvfuqvkyqVar = new pj.rgvfuqvkyq(mg.zoijcleaow.ppxfxbqfkf(this), 1);
                    rgvfuqvkyqVar.lereixgezr();
                    if (!this.f53809iwizpuwonk.f53792wkgbmnqykc) {
                        kcexrzcfyt.iobyxmoadg iobyxmoadgVar = kcexrzcfyt.f37117yggfygwlhe;
                        rgvfuqvkyqVar.cllcsxoeiz(kcexrzcfyt.iobyxmoadg(kcexrzcfyt.wkgbmnqykc(zdlpuopuiu.iobyxmoadg(this.f53809iwizpuwonk.yggfygwlhe()))), null);
                    }
                    if (!this.f53809iwizpuwonk.jyumaefscl() && this.f53808cqumvgiudr == j42.iobyxmoadg.HIGH_ACCURACY) {
                        rgvfuqvkyqVar.cllcsxoeiz(kcexrzcfyt.iobyxmoadg(kcexrzcfyt.wkgbmnqykc(null)), null);
                    }
                    CancellationTokenSource cancellationTokenSource = new CancellationTokenSource();
                    this.f53809iwizpuwonk.f53791ppxfxbqfkf.getCurrentLocation(this.f53809iwizpuwonk.cqumvgiudr(this.f53808cqumvgiudr), cancellationTokenSource.getToken()).addOnSuccessListener(new nufgyqmvbu(new iobyxmoadg(this.f53809iwizpuwonk, rgvfuqvkyqVar, cancellationTokenSource))).addOnFailureListener(new zoijcleaow(rgvfuqvkyqVar, cancellationTokenSource));
                    rgvfuqvkyqVar.stevsuqkhv(new C1148ppxfxbqfkf(cancellationTokenSource));
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
                    hkdspvbjdzVar = (hkdspvbjdz) this.f53812zdlpuopuiu;
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
            final /* synthetic */ CancellationTokenSource f53813jyumaefscl;

            /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
            final /* synthetic */ agtfadlqog f53814yggfygwlhe;

            /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
            final /* synthetic */ wkgbmnqykc f53815zdlpuopuiu;

            iobyxmoadg(wkgbmnqykc wkgbmnqykcVar, agtfadlqog agtfadlqogVar, CancellationTokenSource cancellationTokenSource) {
                this.f53815zdlpuopuiu = wkgbmnqykcVar;
                this.f53814yggfygwlhe = agtfadlqogVar;
                this.f53813jyumaefscl = cancellationTokenSource;
            }

            @Override // tg.draadjrbmk
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                iobyxmoadg((Location) obj);
                return wwaezpbzkn.f37140iobyxmoadg;
            }

            public final void iobyxmoadg(Location location) {
                agtfadlqog agtfadlqogVar = this.f53814yggfygwlhe;
                CancellationTokenSource cancellationTokenSource = this.f53813jyumaefscl;
                kcexrzcfyt.iobyxmoadg iobyxmoadgVar = kcexrzcfyt.f37117yggfygwlhe;
                ppxfxbqfkf.kcexrzcfyt(agtfadlqogVar, cancellationTokenSource, kcexrzcfyt.wkgbmnqykc(location != null ? this.f53815zdlpuopuiu.iwizpuwonk(location) : null));
            }
        }

        /* JADX INFO: renamed from: k42.wkgbmnqykc$ppxfxbqfkf$ppxfxbqfkf, reason: collision with other inner class name */
        static final class C1148ppxfxbqfkf implements tg.draadjrbmk {

            /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
            final /* synthetic */ CancellationTokenSource f53816zdlpuopuiu;

            C1148ppxfxbqfkf(CancellationTokenSource cancellationTokenSource) {
                this.f53816zdlpuopuiu = cancellationTokenSource;
            }

            @Override // tg.draadjrbmk
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                iobyxmoadg((Throwable) obj);
                return wwaezpbzkn.f37140iobyxmoadg;
            }

            public final void iobyxmoadg(Throwable th2) {
                this.f53816zdlpuopuiu.cancel();
            }
        }

        /* JADX INFO: renamed from: k42.wkgbmnqykc$ppxfxbqfkf$wkgbmnqykc, reason: collision with other inner class name */
        static final class C1149wkgbmnqykc implements tg.draadjrbmk {

            /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
            final /* synthetic */ CancellationTokenSource f53817zdlpuopuiu;

            C1149wkgbmnqykc(CancellationTokenSource cancellationTokenSource) {
                this.f53817zdlpuopuiu = cancellationTokenSource;
            }

            @Override // tg.draadjrbmk
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                iobyxmoadg((Throwable) obj);
                return wwaezpbzkn.f37140iobyxmoadg;
            }

            public final void iobyxmoadg(Throwable it) {
                kotlin.jvm.internal.zdlpuopuiu.btonecajqb(it, "it");
                this.f53817zdlpuopuiu.cancel();
            }
        }

        static final class zoijcleaow implements OnFailureListener {

            /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
            final /* synthetic */ agtfadlqog f53818iobyxmoadg;

            /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
            final /* synthetic */ CancellationTokenSource f53819zoijcleaow;

            zoijcleaow(agtfadlqog agtfadlqogVar, CancellationTokenSource cancellationTokenSource) {
                this.f53818iobyxmoadg = agtfadlqogVar;
                this.f53819zoijcleaow = cancellationTokenSource;
            }

            @Override // com.google.android.gms.tasks.OnFailureListener
            public final void onFailure(Exception it) {
                kotlin.jvm.internal.zdlpuopuiu.btonecajqb(it, "it");
                agtfadlqog agtfadlqogVar = this.f53818iobyxmoadg;
                CancellationTokenSource cancellationTokenSource = this.f53819zoijcleaow;
                kcexrzcfyt.iobyxmoadg iobyxmoadgVar = kcexrzcfyt.f37117yggfygwlhe;
                ppxfxbqfkf.kcexrzcfyt(agtfadlqogVar, cancellationTokenSource, kcexrzcfyt.wkgbmnqykc(zdlpuopuiu.iobyxmoadg(new LocationException())));
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        ppxfxbqfkf(long j13, j42.iobyxmoadg iobyxmoadgVar, lg.gxszxtbevo gxszxtbevoVar) {
            super(2, gxszxtbevoVar);
            this.f53802cqumvgiudr = j13;
            this.f53803esjtqupxsv = iobyxmoadgVar;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void kcexrzcfyt(agtfadlqog agtfadlqogVar, CancellationTokenSource cancellationTokenSource, Object obj) {
            if (agtfadlqogVar.isActive()) {
                agtfadlqogVar.cllcsxoeiz(kcexrzcfyt.iobyxmoadg(obj), new C1149wkgbmnqykc(cancellationTokenSource));
            }
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
            return wkgbmnqykc.this.new ppxfxbqfkf(this.f53802cqumvgiudr, this.f53803esjtqupxsv, gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            kcexrzcfyt kcexrzcfytVarIobyxmoadg;
            hkdspvbjdz hkdspvbjdzVar;
            Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
            int i13 = this.f53805jyumaefscl;
            if (i13 == 0) {
                zdlpuopuiu.zoijcleaow(obj);
                long j13 = this.f53802cqumvgiudr;
                kcexrzcfytVarIobyxmoadg = kcexrzcfyt.iobyxmoadg(kcexrzcfyt.wkgbmnqykc(null));
                wkgbmnqykc wkgbmnqykcVar = wkgbmnqykc.this;
                j42.iobyxmoadg iobyxmoadgVar = this.f53803esjtqupxsv;
                hkdspvbjdz hkdspvbjdzVar2 = new hkdspvbjdz();
                eablkybsjg eablkybsjgVar = new eablkybsjg(hkdspvbjdzVar2, null, wkgbmnqykcVar, iobyxmoadgVar);
                this.f53807zdlpuopuiu = kcexrzcfytVarIobyxmoadg;
                this.f53806yggfygwlhe = hkdspvbjdzVar2;
                this.f53805jyumaefscl = 1;
                if (f.eablkybsjg(j13, eablkybsjgVar, this) == objGxszxtbevo) {
                    return objGxszxtbevo;
                }
                hkdspvbjdzVar = hkdspvbjdzVar2;
            } else {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                hkdspvbjdzVar = (hkdspvbjdz) this.f53806yggfygwlhe;
                kcexrzcfytVarIobyxmoadg = (kcexrzcfyt) this.f53807zdlpuopuiu;
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

    /* JADX INFO: renamed from: k42.wkgbmnqykc$wkgbmnqykc, reason: collision with other inner class name */
    static final class C1150wkgbmnqykc extends kotlin.coroutines.jvm.internal.wkgbmnqykc {

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        int f53820jyumaefscl;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        /* synthetic */ Object f53822zdlpuopuiu;

        C1150wkgbmnqykc(lg.gxszxtbevo gxszxtbevoVar) {
            super(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            this.f53822zdlpuopuiu = obj;
            this.f53820jyumaefscl |= Integer.MIN_VALUE;
            Object objPpxfxbqfkf = wkgbmnqykc.this.ppxfxbqfkf(0L, 0L, this);
            return objPpxfxbqfkf == mg.zoijcleaow.gxszxtbevo() ? objPpxfxbqfkf : kcexrzcfyt.iobyxmoadg(objPpxfxbqfkf);
        }
    }

    static final class zoijcleaow extends kotlin.coroutines.jvm.internal.wkgbmnqykc {

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        int f53823jyumaefscl;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        /* synthetic */ Object f53825zdlpuopuiu;

        zoijcleaow(lg.gxszxtbevo gxszxtbevoVar) {
            super(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            this.f53825zdlpuopuiu = obj;
            this.f53823jyumaefscl |= Integer.MIN_VALUE;
            Object objEablkybsjg = wkgbmnqykc.this.eablkybsjg(0L, null, this);
            return objEablkybsjg == mg.zoijcleaow.gxszxtbevo() ? objEablkybsjg : kcexrzcfyt.iobyxmoadg(objEablkybsjg);
        }
    }

    public wkgbmnqykc(Context context, LocationManager locationManager) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(context, "context");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(locationManager, "locationManager");
        this.f53790iobyxmoadg = context;
        this.f53793zoijcleaow = locationManager;
        FusedLocationProviderClient fusedLocationProviderClient = LocationServices.getFusedLocationProviderClient(context);
        kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(fusedLocationProviderClient, "getFusedLocationProviderClient(...)");
        this.f53791ppxfxbqfkf = fusedLocationProviderClient;
        this.f53792wkgbmnqykc = GoogleApiAvailability.getInstance().isGooglePlayServicesAvailable(context) == 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int cqumvgiudr(j42.iobyxmoadg iobyxmoadgVar) {
        int i13 = iobyxmoadg.f53799iobyxmoadg[iobyxmoadgVar.ordinal()];
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
        return this.f53793zoijcleaow.isProviderEnabled("gps");
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
        String string = this.f53790iobyxmoadg.getString(k42.eablkybsjg.error_system_services_unavailable);
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
    @Override // j42.zoijcleaow
    public Object eablkybsjg(long j13, j42.iobyxmoadg iobyxmoadgVar, lg.gxszxtbevo gxszxtbevoVar) {
        zoijcleaow zoijcleaowVar;
        if (gxszxtbevoVar instanceof zoijcleaow) {
            zoijcleaowVar = (zoijcleaow) gxszxtbevoVar;
            int i13 = zoijcleaowVar.f53823jyumaefscl;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                zoijcleaowVar.f53823jyumaefscl = i13 - Integer.MIN_VALUE;
            } else {
                zoijcleaowVar = new zoijcleaow(gxszxtbevoVar);
            }
        } else {
            zoijcleaowVar = new zoijcleaow(gxszxtbevoVar);
        }
        Object objLqeggnwhkg = zoijcleaowVar.f53825zdlpuopuiu;
        Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
        int i14 = zoijcleaowVar.f53823jyumaefscl;
        if (i14 == 0) {
            zdlpuopuiu.zoijcleaow(objLqeggnwhkg);
            pkzmftpjix pkzmftpjixVarZoijcleaow = ikoacuggdj.zoijcleaow();
            ppxfxbqfkf ppxfxbqfkfVar = new ppxfxbqfkf(j13, iobyxmoadgVar, null);
            zoijcleaowVar.f53823jyumaefscl = 1;
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

    @Override // j42.zoijcleaow
    public void iobyxmoadg(final tg.draadjrbmk successListener, final tg.draadjrbmk draadjrbmkVar) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(successListener, "successListener");
        if (this.f53792wkgbmnqykc) {
            Task<Location> lastLocation = this.f53791ppxfxbqfkf.getLastLocation();
            final tg.draadjrbmk draadjrbmkVar2 = new tg.draadjrbmk() { // from class: k42.iobyxmoadg
                @Override // tg.draadjrbmk
                public final Object invoke(Object obj) {
                    return wkgbmnqykc.vdvldrhtss(successListener, this, (Location) obj);
                }
            };
            lastLocation.addOnSuccessListener(new OnSuccessListener() { // from class: k42.zoijcleaow
                @Override // com.google.android.gms.tasks.OnSuccessListener
                public final void onSuccess(Object obj) {
                    wkgbmnqykc.oxmwwwfdhm(draadjrbmkVar2, obj);
                }
            }).addOnFailureListener(new OnFailureListener() { // from class: k42.ppxfxbqfkf
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
    @Override // j42.zoijcleaow
    public Object ppxfxbqfkf(long j13, long j14, lg.gxszxtbevo gxszxtbevoVar) {
        C1150wkgbmnqykc c1150wkgbmnqykc;
        if (gxszxtbevoVar instanceof C1150wkgbmnqykc) {
            c1150wkgbmnqykc = (C1150wkgbmnqykc) gxszxtbevoVar;
            int i13 = c1150wkgbmnqykc.f53820jyumaefscl;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                c1150wkgbmnqykc.f53820jyumaefscl = i13 - Integer.MIN_VALUE;
            } else {
                c1150wkgbmnqykc = new C1150wkgbmnqykc(gxszxtbevoVar);
            }
        } else {
            c1150wkgbmnqykc = new C1150wkgbmnqykc(gxszxtbevoVar);
        }
        Object objLqeggnwhkg = c1150wkgbmnqykc.f53822zdlpuopuiu;
        Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
        int i14 = c1150wkgbmnqykc.f53820jyumaefscl;
        if (i14 == 0) {
            zdlpuopuiu.zoijcleaow(objLqeggnwhkg);
            pkzmftpjix pkzmftpjixVarZoijcleaow = ikoacuggdj.zoijcleaow();
            eablkybsjg eablkybsjgVar = new eablkybsjg(j13, j14, null);
            c1150wkgbmnqykc.f53820jyumaefscl = 1;
            objLqeggnwhkg = dxjokdxxww.lqeggnwhkg(pkzmftpjixVarZoijcleaow, eablkybsjgVar, c1150wkgbmnqykc);
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
