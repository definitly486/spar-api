package r81;

import android.content.Context;
import android.content.SharedPreferences;
import gg.cqumvgiudr;
import gg.gtknphoqwx;
import gg.kcexrzcfyt;
import gg.wwaezpbzkn;
import gg.zdlpuopuiu;
import gk.eablkybsjg;
import gk.jyumaefscl;
import hg.tzroggbefp;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import kotlin.coroutines.jvm.internal.draadjrbmk;
import ow1.esjtqupxsv;
import ow1.vdvldrhtss;
import ow1.ylkuphrtab;
import pj.cllcsxoeiz;
import pj.dsvhmnatus;
import pj.f;
import pj.krqnebusok;
import q81.FeatureToggleRemoteConfig;
import q81.FeatureTogglesRemoteConfig;
import q81.ForceUpdateRemoteConfig;
import ru.myspar.proloyalty.services.crash_logger.api.CrashlyticsKey;
import tg.rgvfuqvkyq;

/* JADX INFO: loaded from: classes5.dex */
public final class ppxfxbqfkf implements t81.iobyxmoadg {

    /* JADX INFO: renamed from: wflxmlrfwp, reason: collision with root package name */
    public static final iobyxmoadg f82132wflxmlrfwp = new iobyxmoadg(null);

    /* JADX INFO: renamed from: btonecajqb, reason: collision with root package name */
    private List f82133btonecajqb;

    /* JADX INFO: renamed from: draadjrbmk, reason: collision with root package name */
    private final gtknphoqwx f82134draadjrbmk;

    /* JADX INFO: renamed from: dxjokdxxww, reason: collision with root package name */
    private final yj.iobyxmoadg f82135dxjokdxxww;

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private final gk.zoijcleaow f82136eablkybsjg;

    /* JADX INFO: renamed from: gtknphoqwx, reason: collision with root package name */
    private final ConcurrentMap f82137gtknphoqwx;

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    private final cllcsxoeiz f82138gxszxtbevo;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final vdvldrhtss f82139iobyxmoadg;

    /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
    private final SharedPreferences f82140lqeggnwhkg;

    /* JADX INFO: renamed from: nufgyqmvbu, reason: collision with root package name */
    private final yj.iobyxmoadg f82141nufgyqmvbu;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final ylkuphrtab f82142ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final gq1.iobyxmoadg f82143wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final esjtqupxsv f82144zoijcleaow;

    static final class dxjokdxxww extends draadjrbmk implements rgvfuqvkyq {

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        /* synthetic */ boolean f82146yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        int f82147zdlpuopuiu;

        dxjokdxxww(lg.gxszxtbevo gxszxtbevoVar) {
            super(2, gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
            dxjokdxxww dxjokdxxwwVar = ppxfxbqfkf.this.new dxjokdxxww(gxszxtbevoVar);
            dxjokdxxwwVar.f82146yggfygwlhe = ((Boolean) obj).booleanValue();
            return dxjokdxxwwVar;
        }

        @Override // tg.rgvfuqvkyq
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return invoke(((Boolean) obj).booleanValue(), (lg.gxszxtbevo) obj2);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
            int i13 = this.f82147zdlpuopuiu;
            if (i13 == 0) {
                zdlpuopuiu.zoijcleaow(obj);
                boolean z13 = this.f82146yggfygwlhe;
                ppxfxbqfkf.this.f82133btonecajqb = null;
                if (z13) {
                    ppxfxbqfkf ppxfxbqfkfVar = ppxfxbqfkf.this;
                    this.f82147zdlpuopuiu = 1;
                    if (ppxfxbqfkfVar.agtfadlqog(this) == objGxszxtbevo) {
                        return objGxszxtbevo;
                    }
                }
            } else {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                zdlpuopuiu.zoijcleaow(obj);
            }
            return wwaezpbzkn.f37140iobyxmoadg;
        }

        public final Object invoke(boolean z13, lg.gxszxtbevo gxszxtbevoVar) {
            return ((dxjokdxxww) create(Boolean.valueOf(z13), gxszxtbevoVar)).invokeSuspend(wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    static final class eablkybsjg extends kotlin.coroutines.jvm.internal.wkgbmnqykc {

        /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
        Object f82148cqumvgiudr;

        /* JADX INFO: renamed from: esjtqupxsv, reason: collision with root package name */
        boolean f82149esjtqupxsv;

        /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
        Object f82150iwizpuwonk;

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        Object f82151jyumaefscl;

        /* JADX INFO: renamed from: lereixgezr, reason: collision with root package name */
        /* synthetic */ Object f82152lereixgezr;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        Object f82154yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        Object f82155zdlpuopuiu;

        /* JADX INFO: renamed from: zynmafqrjb, reason: collision with root package name */
        int f82156zynmafqrjb;

        eablkybsjg(lg.gxszxtbevo gxszxtbevoVar) {
            super(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            this.f82152lereixgezr = obj;
            this.f82156zynmafqrjb |= Integer.MIN_VALUE;
            return ppxfxbqfkf.this.ppxfxbqfkf(null, this);
        }
    }

    static final class gxszxtbevo extends draadjrbmk implements tg.vdvldrhtss {

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        /* synthetic */ Object f82157yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        int f82158zdlpuopuiu;

        gxszxtbevo(lg.gxszxtbevo gxszxtbevoVar) {
            super(3, gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            mg.zoijcleaow.gxszxtbevo();
            if (this.f82158zdlpuopuiu != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            zdlpuopuiu.zoijcleaow(obj);
            kr0.wkgbmnqykc.f60450iobyxmoadg.gxszxtbevo((Throwable) this.f82157yggfygwlhe, new CrashlyticsKey[0]);
            return wwaezpbzkn.f37140iobyxmoadg;
        }

        @Override // tg.vdvldrhtss
        /* JADX INFO: renamed from: ojitshcjhn, reason: merged with bridge method [inline-methods] */
        public final Object invoke(sj.nufgyqmvbu nufgyqmvbuVar, Throwable th2, lg.gxszxtbevo gxszxtbevoVar) {
            gxszxtbevo gxszxtbevoVar2 = new gxszxtbevo(gxszxtbevoVar);
            gxszxtbevoVar2.f82157yggfygwlhe = th2;
            return gxszxtbevoVar2.invokeSuspend(wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    public static final class iobyxmoadg {
        public /* synthetic */ iobyxmoadg(kotlin.jvm.internal.gtknphoqwx gtknphoqwxVar) {
            this();
        }

        private iobyxmoadg() {
        }
    }

    static final class lqeggnwhkg extends draadjrbmk implements rgvfuqvkyq {

        /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
        /* synthetic */ Object f82160iwizpuwonk;

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        int f82161jyumaefscl;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        Object f82162yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        Object f82163zdlpuopuiu;

        lqeggnwhkg(lg.gxszxtbevo gxszxtbevoVar) {
            super(2, gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
            lqeggnwhkg lqeggnwhkgVar = ppxfxbqfkf.this.new lqeggnwhkg(gxszxtbevoVar);
            lqeggnwhkgVar.f82160iwizpuwonk = obj;
            return lqeggnwhkgVar;
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            yj.iobyxmoadg iobyxmoadgVar;
            Map map;
            ppxfxbqfkf ppxfxbqfkfVar;
            Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
            int i13 = this.f82161jyumaefscl;
            if (i13 == 0) {
                zdlpuopuiu.zoijcleaow(obj);
                Map map2 = (Map) this.f82160iwizpuwonk;
                iobyxmoadgVar = ppxfxbqfkf.this.f82141nufgyqmvbu;
                ppxfxbqfkf ppxfxbqfkfVar2 = ppxfxbqfkf.this;
                this.f82160iwizpuwonk = map2;
                this.f82163zdlpuopuiu = iobyxmoadgVar;
                this.f82162yggfygwlhe = ppxfxbqfkfVar2;
                this.f82161jyumaefscl = 1;
                if (iobyxmoadgVar.iobyxmoadg(null, this) == objGxszxtbevo) {
                    return objGxszxtbevo;
                }
                map = map2;
                ppxfxbqfkfVar = ppxfxbqfkfVar2;
            } else {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ppxfxbqfkfVar = (ppxfxbqfkf) this.f82162yggfygwlhe;
                iobyxmoadgVar = (yj.iobyxmoadg) this.f82163zdlpuopuiu;
                map = (Map) this.f82160iwizpuwonk;
                zdlpuopuiu.zoijcleaow(obj);
            }
            try {
                ppxfxbqfkfVar.vdvldrhtss(map);
                wwaezpbzkn wwaezpbzknVar = wwaezpbzkn.f37140iobyxmoadg;
                return wwaezpbzkn.f37140iobyxmoadg;
            } finally {
                iobyxmoadgVar.eablkybsjg(null);
            }
        }

        @Override // tg.rgvfuqvkyq
        /* JADX INFO: renamed from: ojitshcjhn, reason: merged with bridge method [inline-methods] */
        public final Object invoke(Map map, lg.gxszxtbevo gxszxtbevoVar) {
            return ((lqeggnwhkg) create(map, gxszxtbevoVar)).invokeSuspend(wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    static final class nufgyqmvbu extends draadjrbmk implements tg.vdvldrhtss {

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        /* synthetic */ Object f82164yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        int f82165zdlpuopuiu;

        nufgyqmvbu(lg.gxszxtbevo gxszxtbevoVar) {
            super(3, gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            mg.zoijcleaow.gxszxtbevo();
            if (this.f82165zdlpuopuiu != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            zdlpuopuiu.zoijcleaow(obj);
            kr0.wkgbmnqykc.f60450iobyxmoadg.gxszxtbevo((Throwable) this.f82164yggfygwlhe, new CrashlyticsKey[0]);
            return wwaezpbzkn.f37140iobyxmoadg;
        }

        @Override // tg.vdvldrhtss
        /* JADX INFO: renamed from: ojitshcjhn, reason: merged with bridge method [inline-methods] */
        public final Object invoke(sj.nufgyqmvbu nufgyqmvbuVar, Throwable th2, lg.gxszxtbevo gxszxtbevoVar) {
            nufgyqmvbu nufgyqmvbuVar2 = new nufgyqmvbu(gxszxtbevoVar);
            nufgyqmvbuVar2.f82164yggfygwlhe = th2;
            return nufgyqmvbuVar2.invokeSuspend(wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    /* JADX INFO: renamed from: r81.ppxfxbqfkf$ppxfxbqfkf, reason: collision with other inner class name */
    public static final class C1835ppxfxbqfkf extends draadjrbmk implements rgvfuqvkyq {

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        final /* synthetic */ Object f82166yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        int f82167zdlpuopuiu;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C1835ppxfxbqfkf(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
            super(2, gxszxtbevoVar);
            this.f82166yggfygwlhe = obj;
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
            return new C1835ppxfxbqfkf(this.f82166yggfygwlhe, gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
            int i13 = this.f82167zdlpuopuiu;
            if (i13 == 0) {
                zdlpuopuiu.zoijcleaow(obj);
                vdvldrhtss vdvldrhtssVar = ((ppxfxbqfkf) this.f82166yggfygwlhe).f82139iobyxmoadg;
                wwaezpbzkn wwaezpbzknVar = wwaezpbzkn.f37140iobyxmoadg;
                this.f82167zdlpuopuiu = 1;
                obj = vdvldrhtssVar.zoijcleaow(wwaezpbzknVar, this);
                if (obj == objGxszxtbevo) {
                    return objGxszxtbevo;
                }
            } else {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                zdlpuopuiu.zoijcleaow(obj);
            }
            return obj;
        }

        @Override // tg.rgvfuqvkyq
        public final Object invoke(cllcsxoeiz cllcsxoeizVar, lg.gxszxtbevo gxszxtbevoVar) {
            return ((C1835ppxfxbqfkf) create(cllcsxoeizVar, gxszxtbevoVar)).invokeSuspend(wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    static final class wkgbmnqykc extends kotlin.coroutines.jvm.internal.wkgbmnqykc {

        /* JADX INFO: renamed from: esjtqupxsv, reason: collision with root package name */
        int f82169esjtqupxsv;

        /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
        /* synthetic */ Object f82170iwizpuwonk;

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        Object f82171jyumaefscl;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        Object f82172yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        Object f82173zdlpuopuiu;

        wkgbmnqykc(lg.gxszxtbevo gxszxtbevoVar) {
            super(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            this.f82170iwizpuwonk = obj;
            this.f82169esjtqupxsv |= Integer.MIN_VALUE;
            return ppxfxbqfkf.this.iobyxmoadg(this);
        }
    }

    static final class zoijcleaow extends kotlin.coroutines.jvm.internal.wkgbmnqykc {

        /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
        int f82174cqumvgiudr;

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        /* synthetic */ Object f82176jyumaefscl;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        Object f82177yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        Object f82178zdlpuopuiu;

        zoijcleaow(lg.gxszxtbevo gxszxtbevoVar) {
            super(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            this.f82176jyumaefscl = obj;
            this.f82174cqumvgiudr |= Integer.MIN_VALUE;
            return ppxfxbqfkf.this.agtfadlqog(this);
        }
    }

    public ppxfxbqfkf(Context context, dr0.iobyxmoadg dispatchersProvider, vdvldrhtss fetchTesterFunction, esjtqupxsv isAuthUseCase, ylkuphrtab subscribeUserIsAuthUseCase, gq1.iobyxmoadg remoteConfig) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(context, "context");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(dispatchersProvider, "dispatchersProvider");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(fetchTesterFunction, "fetchTesterFunction");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(isAuthUseCase, "isAuthUseCase");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(subscribeUserIsAuthUseCase, "subscribeUserIsAuthUseCase");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(remoteConfig, "remoteConfig");
        this.f82139iobyxmoadg = fetchTesterFunction;
        this.f82144zoijcleaow = isAuthUseCase;
        this.f82142ppxfxbqfkf = subscribeUserIsAuthUseCase;
        this.f82143wkgbmnqykc = remoteConfig;
        this.f82136eablkybsjg = jyumaefscl.zoijcleaow(null, new tg.draadjrbmk() { // from class: r81.iobyxmoadg
            @Override // tg.draadjrbmk
            public final Object invoke(Object obj) {
                return ppxfxbqfkf.rgvfuqvkyq((eablkybsjg) obj);
            }
        }, 1, null);
        this.f82138gxszxtbevo = dsvhmnatus.iobyxmoadg(krqnebusok.zoijcleaow(null, 1, null).plus(dispatchersProvider.zoijcleaow()));
        SharedPreferences sharedPreferences = context.getSharedPreferences("REMOTE_CONFIG_PREFERENCES", 0);
        this.f82140lqeggnwhkg = sharedPreferences;
        this.f82141nufgyqmvbu = yj.lqeggnwhkg.zoijcleaow(false, 1, null);
        this.f82135dxjokdxxww = yj.lqeggnwhkg.zoijcleaow(false, 1, null);
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        this.f82137gtknphoqwx = concurrentHashMap;
        this.f82134draadjrbmk = gg.draadjrbmk.zoijcleaow(new tg.iobyxmoadg() { // from class: r81.zoijcleaow
            @Override // tg.iobyxmoadg
            public final Object invoke() {
                return ppxfxbqfkf.draadjrbmk(this.f82181zdlpuopuiu);
            }
        });
        Map<String, ?> all = sharedPreferences.getAll();
        kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(all, "getAll(...)");
        LinkedHashMap linkedHashMap = new LinkedHashMap(tzroggbefp.eablkybsjg(all.size()));
        Iterator<T> it = all.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            linkedHashMap.put(entry.getKey(), String.valueOf(entry.getValue()));
        }
        concurrentHashMap.putAll(linkedHashMap);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:46:0x00b9 A[Catch: all -> 0x00c0, TryCatch #1 {all -> 0x00c0, blocks: (B:44:0x00b1, B:46:0x00b9, B:49:0x00c3, B:52:0x00ca, B:54:0x00ce, B:55:0x00d2, B:43:0x00a6), top: B:66:0x00a6 }] */
    /* JADX WARN: Code duplicated, block: B:51:0x00c9  */
    /* JADX WARN: Code duplicated, block: B:54:0x00ce A[Catch: all -> 0x00c0, TryCatch #1 {all -> 0x00c0, blocks: (B:44:0x00b1, B:46:0x00b9, B:49:0x00c3, B:52:0x00ca, B:54:0x00ce, B:55:0x00d2, B:43:0x00a6), top: B:66:0x00a6 }] */
    /* JADX WARN: Code duplicated, block: B:59:0x00d9 A[Catch: all -> 0x0080, TRY_LEAVE, TryCatch #0 {all -> 0x0080, blocks: (B:57:0x00d5, B:59:0x00d9, B:28:0x0075, B:30:0x0079), top: B:64:0x0075 }] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object agtfadlqog(lg.gxszxtbevo gxszxtbevoVar) throws Throwable {
        zoijcleaow zoijcleaowVar;
        yj.iobyxmoadg iobyxmoadgVar;
        ppxfxbqfkf ppxfxbqfkfVar;
        yj.iobyxmoadg iobyxmoadgVar2;
        Throwable th2;
        ppxfxbqfkf ppxfxbqfkfVar2;
        Object objWkgbmnqykc;
        List listWflxmlrfwp;
        kr0.wkgbmnqykc wkgbmnqykcVar;
        Throwable thDxjokdxxww;
        List listWflxmlrfwp2;
        if (gxszxtbevoVar instanceof zoijcleaow) {
            zoijcleaowVar = (zoijcleaow) gxszxtbevoVar;
            int i13 = zoijcleaowVar.f82174cqumvgiudr;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                zoijcleaowVar.f82174cqumvgiudr = i13 - Integer.MIN_VALUE;
            } else {
                zoijcleaowVar = new zoijcleaow(gxszxtbevoVar);
            }
        } else {
            zoijcleaowVar = new zoijcleaow(gxszxtbevoVar);
        }
        Object obj = zoijcleaowVar.f82176jyumaefscl;
        Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
        int i14 = zoijcleaowVar.f82174cqumvgiudr;
        try {
            if (i14 == 0) {
                zdlpuopuiu.zoijcleaow(obj);
                if (!((Boolean) this.f82144zoijcleaow.zoijcleaow(wwaezpbzkn.f37140iobyxmoadg)).booleanValue()) {
                    return hg.jyumaefscl.wflxmlrfwp();
                }
                iobyxmoadgVar = this.f82135dxjokdxxww;
                zoijcleaowVar.f82178zdlpuopuiu = this;
                zoijcleaowVar.f82177yggfygwlhe = iobyxmoadgVar;
                zoijcleaowVar.f82174cqumvgiudr = 1;
                if (iobyxmoadgVar.iobyxmoadg(null, zoijcleaowVar) == objGxszxtbevo) {
                    return objGxszxtbevo;
                }
                ppxfxbqfkfVar = this;
            } else {
                if (i14 != 1) {
                    if (i14 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    iobyxmoadgVar2 = (yj.iobyxmoadg) zoijcleaowVar.f82177yggfygwlhe;
                    ppxfxbqfkfVar2 = (ppxfxbqfkf) zoijcleaowVar.f82178zdlpuopuiu;
                    try {
                        zdlpuopuiu.zoijcleaow(obj);
                        objWkgbmnqykc = kcexrzcfyt.wkgbmnqykc(obj);
                    } catch (Throwable th3) {
                        th2 = th3;
                        try {
                            kcexrzcfyt.iobyxmoadg iobyxmoadgVar3 = kcexrzcfyt.f37117yggfygwlhe;
                            objWkgbmnqykc = kcexrzcfyt.wkgbmnqykc(zdlpuopuiu.iobyxmoadg(th2));
                        } catch (Throwable th4) {
                            th = th4;
                            iobyxmoadgVar = iobyxmoadgVar2;
                            iobyxmoadgVar.eablkybsjg(null);
                            throw th;
                        }
                    }
                    ppxfxbqfkfVar = ppxfxbqfkfVar2;
                    wkgbmnqykcVar = kr0.wkgbmnqykc.f60450iobyxmoadg;
                    thDxjokdxxww = kcexrzcfyt.dxjokdxxww(objWkgbmnqykc);
                    if (thDxjokdxxww != null) {
                        wkgbmnqykcVar.gxszxtbevo(thDxjokdxxww, new CrashlyticsKey[0]);
                    }
                    if (kcexrzcfyt.draadjrbmk(objWkgbmnqykc)) {
                        objWkgbmnqykc = null;
                    }
                    listWflxmlrfwp2 = (List) objWkgbmnqykc;
                    if (listWflxmlrfwp2 == null) {
                        listWflxmlrfwp2 = hg.jyumaefscl.wflxmlrfwp();
                    }
                    ppxfxbqfkfVar.f82133btonecajqb = listWflxmlrfwp2;
                    iobyxmoadgVar = iobyxmoadgVar2;
                    listWflxmlrfwp = ppxfxbqfkfVar.f82133btonecajqb;
                    if (listWflxmlrfwp == null) {
                        listWflxmlrfwp = hg.jyumaefscl.wflxmlrfwp();
                    }
                    iobyxmoadgVar.eablkybsjg(null);
                    return listWflxmlrfwp;
                }
                yj.iobyxmoadg iobyxmoadgVar4 = (yj.iobyxmoadg) zoijcleaowVar.f82177yggfygwlhe;
                ppxfxbqfkfVar = (ppxfxbqfkf) zoijcleaowVar.f82178zdlpuopuiu;
                zdlpuopuiu.zoijcleaow(obj);
                iobyxmoadgVar = iobyxmoadgVar4;
            }
            List list = ppxfxbqfkfVar.f82133btonecajqb;
            if (list == null || list.isEmpty()) {
                try {
                    kcexrzcfyt.iobyxmoadg iobyxmoadgVar5 = kcexrzcfyt.f37117yggfygwlhe;
                    C1835ppxfxbqfkf c1835ppxfxbqfkf = new C1835ppxfxbqfkf(ppxfxbqfkfVar, null);
                    zoijcleaowVar.f82178zdlpuopuiu = ppxfxbqfkfVar;
                    zoijcleaowVar.f82177yggfygwlhe = iobyxmoadgVar;
                    zoijcleaowVar.f82174cqumvgiudr = 2;
                    Object objPpxfxbqfkf = f.ppxfxbqfkf(3000L, c1835ppxfxbqfkf, zoijcleaowVar);
                    if (objPpxfxbqfkf == objGxszxtbevo) {
                        return objGxszxtbevo;
                    }
                    iobyxmoadgVar2 = iobyxmoadgVar;
                    obj = objPpxfxbqfkf;
                    ppxfxbqfkfVar2 = ppxfxbqfkfVar;
                    objWkgbmnqykc = kcexrzcfyt.wkgbmnqykc(obj);
                    ppxfxbqfkfVar = ppxfxbqfkfVar2;
                    wkgbmnqykcVar = kr0.wkgbmnqykc.f60450iobyxmoadg;
                    thDxjokdxxww = kcexrzcfyt.dxjokdxxww(objWkgbmnqykc);
                    if (thDxjokdxxww != null) {
                        wkgbmnqykcVar.gxszxtbevo(thDxjokdxxww, new CrashlyticsKey[0]);
                    }
                    if (kcexrzcfyt.draadjrbmk(objWkgbmnqykc)) {
                        objWkgbmnqykc = null;
                    }
                    listWflxmlrfwp2 = (List) objWkgbmnqykc;
                    if (listWflxmlrfwp2 == null) {
                        listWflxmlrfwp2 = hg.jyumaefscl.wflxmlrfwp();
                    }
                    ppxfxbqfkfVar.f82133btonecajqb = listWflxmlrfwp2;
                    iobyxmoadgVar = iobyxmoadgVar2;
                } catch (Throwable th5) {
                    iobyxmoadgVar2 = iobyxmoadgVar;
                    th2 = th5;
                    ppxfxbqfkfVar2 = ppxfxbqfkfVar;
                    kcexrzcfyt.iobyxmoadg iobyxmoadgVar6 = kcexrzcfyt.f37117yggfygwlhe;
                    objWkgbmnqykc = kcexrzcfyt.wkgbmnqykc(zdlpuopuiu.iobyxmoadg(th2));
                }
            }
            listWflxmlrfwp = ppxfxbqfkfVar.f82133btonecajqb;
            if (listWflxmlrfwp == null) {
                listWflxmlrfwp = hg.jyumaefscl.wflxmlrfwp();
            }
            iobyxmoadgVar.eablkybsjg(null);
            return listWflxmlrfwp;
        } catch (Throwable th6) {
            th = th6;
            iobyxmoadgVar.eablkybsjg(null);
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List draadjrbmk(ppxfxbqfkf ppxfxbqfkfVar) {
        Object objWkgbmnqykc;
        String strYggfygwlhe = uw0.ppxfxbqfkf.f114521iobyxmoadg.yggfygwlhe();
        try {
            kcexrzcfyt.iobyxmoadg iobyxmoadgVar = kcexrzcfyt.f37117yggfygwlhe;
            gk.zoijcleaow zoijcleaowVar = ppxfxbqfkfVar.f82136eablkybsjg;
            zoijcleaowVar.iobyxmoadg();
            objWkgbmnqykc = kcexrzcfyt.wkgbmnqykc((FeatureTogglesRemoteConfig) zoijcleaowVar.ppxfxbqfkf(FeatureTogglesRemoteConfig.INSTANCE.serializer(), strYggfygwlhe));
        } catch (Throwable th2) {
            kcexrzcfyt.iobyxmoadg iobyxmoadgVar2 = kcexrzcfyt.f37117yggfygwlhe;
            objWkgbmnqykc = kcexrzcfyt.wkgbmnqykc(zdlpuopuiu.iobyxmoadg(th2));
        }
        if (kcexrzcfyt.draadjrbmk(objWkgbmnqykc)) {
            objWkgbmnqykc = null;
        }
        FeatureTogglesRemoteConfig featureTogglesRemoteConfig = (FeatureTogglesRemoteConfig) objWkgbmnqykc;
        List items = featureTogglesRemoteConfig != null ? featureTogglesRemoteConfig.getItems() : null;
        return items == null ? hg.jyumaefscl.wflxmlrfwp() : items;
    }

    private final List ojitshcjhn() {
        return (List) this.f82134draadjrbmk.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wwaezpbzkn rgvfuqvkyq(gk.eablkybsjg Json) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(Json, "$this$Json");
        Json.wkgbmnqykc(true);
        Json.eablkybsjg(true);
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void vdvldrhtss(Map map) {
        if (map.isEmpty()) {
            map = null;
        }
        if (map == null) {
            map = tzroggbefp.gxszxtbevo(cqumvgiudr.iobyxmoadg("feature_toggles_android_app", uw0.ppxfxbqfkf.f114521iobyxmoadg.yggfygwlhe()));
        }
        this.f82137gtknphoqwx.clear();
        this.f82137gtknphoqwx.putAll(map);
        SharedPreferences pref = this.f82140lqeggnwhkg;
        kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(pref, "pref");
        SharedPreferences.Editor editorEdit = pref.edit();
        editorEdit.clear();
        for (Map.Entry entry : this.f82137gtknphoqwx.entrySet()) {
            editorEdit.putString((String) entry.getKey(), (String) entry.getValue());
        }
        editorEdit.apply();
    }

    /* JADX WARN: Code duplicated, block: B:37:0x00ad A[Catch: all -> 0x00b3, TryCatch #1 {all -> 0x00b3, blocks: (B:35:0x00a5, B:37:0x00ad, B:40:0x00b6, B:43:0x00bd, B:45:0x00c1, B:46:0x00c5, B:34:0x009a), top: B:73:0x009a }] */
    /* JADX WARN: Code duplicated, block: B:42:0x00bc  */
    /* JADX WARN: Code duplicated, block: B:45:0x00c1 A[Catch: all -> 0x00b3, TryCatch #1 {all -> 0x00b3, blocks: (B:35:0x00a5, B:37:0x00ad, B:40:0x00b6, B:43:0x00bd, B:45:0x00c1, B:46:0x00c5, B:34:0x009a), top: B:73:0x009a }] */
    /* JADX WARN: Code duplicated, block: B:56:0x00fc A[Catch: all -> 0x0102, TryCatch #0 {all -> 0x0102, blocks: (B:48:0x00c9, B:54:0x00f4, B:56:0x00fc, B:59:0x0106, B:53:0x00ea, B:24:0x006d, B:50:0x00d3), top: B:71:0x006d, inners: #3 }] */
    /* JADX WARN: Code duplicated, block: B:61:0x010c  */
    /* JADX WARN: Code duplicated, block: B:64:0x0114  */
    /* JADX WARN: Code duplicated, block: B:77:0x00d3 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // t81.iobyxmoadg
    public Object iobyxmoadg(lg.gxszxtbevo gxszxtbevoVar) throws Throwable {
        wkgbmnqykc wkgbmnqykcVar;
        yj.iobyxmoadg iobyxmoadgVar;
        String str;
        ppxfxbqfkf ppxfxbqfkfVar;
        yj.iobyxmoadg iobyxmoadgVar2;
        Throwable th2;
        ppxfxbqfkf ppxfxbqfkfVar2;
        Object objWkgbmnqykc;
        String str2;
        Object objWkgbmnqykc2;
        kr0.wkgbmnqykc wkgbmnqykcVar2;
        Throwable thDxjokdxxww;
        s81.zoijcleaow zoijcleaowVarIobyxmoadg;
        kr0.wkgbmnqykc wkgbmnqykcVar3;
        Throwable thDxjokdxxww2;
        Map mapDxjokdxxww;
        if (gxszxtbevoVar instanceof wkgbmnqykc) {
            wkgbmnqykcVar = (wkgbmnqykc) gxszxtbevoVar;
            int i13 = wkgbmnqykcVar.f82169esjtqupxsv;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                wkgbmnqykcVar.f82169esjtqupxsv = i13 - Integer.MIN_VALUE;
            } else {
                wkgbmnqykcVar = new wkgbmnqykc(gxszxtbevoVar);
            }
        } else {
            wkgbmnqykcVar = new wkgbmnqykc(gxszxtbevoVar);
        }
        Object obj = wkgbmnqykcVar.f82170iwizpuwonk;
        Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
        int i14 = wkgbmnqykcVar.f82169esjtqupxsv;
        try {
            if (i14 == 0) {
                zdlpuopuiu.zoijcleaow(obj);
                iobyxmoadgVar = this.f82141nufgyqmvbu;
                wkgbmnqykcVar.f82173zdlpuopuiu = this;
                str = "force_update_android_app";
                wkgbmnqykcVar.f82172yggfygwlhe = "force_update_android_app";
                wkgbmnqykcVar.f82171jyumaefscl = iobyxmoadgVar;
                wkgbmnqykcVar.f82169esjtqupxsv = 1;
                if (iobyxmoadgVar.iobyxmoadg(null, wkgbmnqykcVar) == objGxszxtbevo) {
                    return objGxszxtbevo;
                }
                ppxfxbqfkfVar = this;
            } else {
                if (i14 != 1) {
                    if (i14 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    iobyxmoadgVar2 = (yj.iobyxmoadg) wkgbmnqykcVar.f82171jyumaefscl;
                    str = (String) wkgbmnqykcVar.f82172yggfygwlhe;
                    ppxfxbqfkfVar2 = (ppxfxbqfkf) wkgbmnqykcVar.f82173zdlpuopuiu;
                    try {
                        zdlpuopuiu.zoijcleaow(obj);
                        objWkgbmnqykc = kcexrzcfyt.wkgbmnqykc(obj);
                    } catch (Throwable th3) {
                        th2 = th3;
                        try {
                            kcexrzcfyt.iobyxmoadg iobyxmoadgVar3 = kcexrzcfyt.f37117yggfygwlhe;
                            objWkgbmnqykc = kcexrzcfyt.wkgbmnqykc(zdlpuopuiu.iobyxmoadg(th2));
                        } catch (Throwable th4) {
                            th = th4;
                        }
                    }
                    ppxfxbqfkfVar = ppxfxbqfkfVar2;
                    wkgbmnqykcVar3 = kr0.wkgbmnqykc.f60450iobyxmoadg;
                    thDxjokdxxww2 = kcexrzcfyt.dxjokdxxww(objWkgbmnqykc);
                    if (thDxjokdxxww2 != null) {
                        wkgbmnqykcVar3.gxszxtbevo(thDxjokdxxww2, new CrashlyticsKey[0]);
                    }
                    if (kcexrzcfyt.draadjrbmk(objWkgbmnqykc)) {
                        objWkgbmnqykc = null;
                    }
                    mapDxjokdxxww = (Map) objWkgbmnqykc;
                    if (mapDxjokdxxww == null) {
                        mapDxjokdxxww = tzroggbefp.dxjokdxxww();
                    }
                    ppxfxbqfkfVar.vdvldrhtss(mapDxjokdxxww);
                    iobyxmoadgVar = iobyxmoadgVar2;
                    str2 = (String) ppxfxbqfkfVar.f82137gtknphoqwx.get(str);
                    if (str2 != null) {
                        try {
                            kcexrzcfyt.iobyxmoadg iobyxmoadgVar4 = kcexrzcfyt.f37117yggfygwlhe;
                            gk.zoijcleaow zoijcleaowVar = ppxfxbqfkfVar.f82136eablkybsjg;
                            zoijcleaowVar.iobyxmoadg();
                            objWkgbmnqykc2 = kcexrzcfyt.wkgbmnqykc(zoijcleaowVar.ppxfxbqfkf(ForceUpdateRemoteConfig.INSTANCE.serializer(), str2));
                        } catch (Throwable th5) {
                            kcexrzcfyt.iobyxmoadg iobyxmoadgVar5 = kcexrzcfyt.f37117yggfygwlhe;
                            objWkgbmnqykc2 = kcexrzcfyt.wkgbmnqykc(zdlpuopuiu.iobyxmoadg(th5));
                        }
                        wkgbmnqykcVar2 = kr0.wkgbmnqykc.f60450iobyxmoadg;
                        thDxjokdxxww = kcexrzcfyt.dxjokdxxww(objWkgbmnqykc2);
                        if (thDxjokdxxww != null) {
                            wkgbmnqykcVar2.gxszxtbevo(thDxjokdxxww, new CrashlyticsKey[0]);
                        }
                        if (kcexrzcfyt.draadjrbmk(objWkgbmnqykc2)) {
                            objWkgbmnqykc2 = null;
                        }
                    } else {
                        objWkgbmnqykc2 = null;
                    }
                    iobyxmoadgVar.eablkybsjg(null);
                    ForceUpdateRemoteConfig forceUpdateRemoteConfig = (ForceUpdateRemoteConfig) objWkgbmnqykc2;
                    return (forceUpdateRemoteConfig != null || (zoijcleaowVarIobyxmoadg = p81.iobyxmoadg.iobyxmoadg(forceUpdateRemoteConfig)) == null) ? new s81.zoijcleaow(null, null, false, false, null, 31, null) : zoijcleaowVarIobyxmoadg;
                }
                yj.iobyxmoadg iobyxmoadgVar6 = (yj.iobyxmoadg) wkgbmnqykcVar.f82171jyumaefscl;
                String str3 = (String) wkgbmnqykcVar.f82172yggfygwlhe;
                ppxfxbqfkfVar = (ppxfxbqfkf) wkgbmnqykcVar.f82173zdlpuopuiu;
                zdlpuopuiu.zoijcleaow(obj);
                iobyxmoadgVar = iobyxmoadgVar6;
                str = str3;
            }
            if (!ppxfxbqfkfVar.f82137gtknphoqwx.isEmpty()) {
                str2 = (String) ppxfxbqfkfVar.f82137gtknphoqwx.get(str);
                if (str2 != null) {
                    kcexrzcfyt.iobyxmoadg iobyxmoadgVar7 = kcexrzcfyt.f37117yggfygwlhe;
                    gk.zoijcleaow zoijcleaowVar2 = ppxfxbqfkfVar.f82136eablkybsjg;
                    zoijcleaowVar2.iobyxmoadg();
                    objWkgbmnqykc2 = kcexrzcfyt.wkgbmnqykc(zoijcleaowVar2.ppxfxbqfkf(ForceUpdateRemoteConfig.INSTANCE.serializer(), str2));
                    wkgbmnqykcVar2 = kr0.wkgbmnqykc.f60450iobyxmoadg;
                    thDxjokdxxww = kcexrzcfyt.dxjokdxxww(objWkgbmnqykc2);
                    if (thDxjokdxxww != null) {
                        wkgbmnqykcVar2.gxszxtbevo(thDxjokdxxww, new CrashlyticsKey[0]);
                    }
                    if (kcexrzcfyt.draadjrbmk(objWkgbmnqykc2)) {
                        objWkgbmnqykc2 = null;
                    }
                } else {
                    objWkgbmnqykc2 = null;
                }
                iobyxmoadgVar.eablkybsjg(null);
                ForceUpdateRemoteConfig forceUpdateRemoteConfig2 = (ForceUpdateRemoteConfig) objWkgbmnqykc2;
                if (forceUpdateRemoteConfig2 != null) {
                }
            }
            try {
                kcexrzcfyt.iobyxmoadg iobyxmoadgVar8 = kcexrzcfyt.f37117yggfygwlhe;
                r81.wkgbmnqykc wkgbmnqykcVar4 = new r81.wkgbmnqykc(ppxfxbqfkfVar, null);
                wkgbmnqykcVar.f82173zdlpuopuiu = ppxfxbqfkfVar;
                wkgbmnqykcVar.f82172yggfygwlhe = str;
                wkgbmnqykcVar.f82171jyumaefscl = iobyxmoadgVar;
                wkgbmnqykcVar.f82169esjtqupxsv = 2;
                Object objPpxfxbqfkf = f.ppxfxbqfkf(3000L, wkgbmnqykcVar4, wkgbmnqykcVar);
                if (objPpxfxbqfkf == objGxszxtbevo) {
                    return objGxszxtbevo;
                }
                iobyxmoadgVar2 = iobyxmoadgVar;
                obj = objPpxfxbqfkf;
                ppxfxbqfkfVar2 = ppxfxbqfkfVar;
                objWkgbmnqykc = kcexrzcfyt.wkgbmnqykc(obj);
                ppxfxbqfkfVar = ppxfxbqfkfVar2;
                wkgbmnqykcVar3 = kr0.wkgbmnqykc.f60450iobyxmoadg;
                thDxjokdxxww2 = kcexrzcfyt.dxjokdxxww(objWkgbmnqykc);
                if (thDxjokdxxww2 != null) {
                    wkgbmnqykcVar3.gxszxtbevo(thDxjokdxxww2, new CrashlyticsKey[0]);
                }
                if (kcexrzcfyt.draadjrbmk(objWkgbmnqykc)) {
                    objWkgbmnqykc = null;
                }
                mapDxjokdxxww = (Map) objWkgbmnqykc;
                if (mapDxjokdxxww == null) {
                    mapDxjokdxxww = tzroggbefp.dxjokdxxww();
                }
                ppxfxbqfkfVar.vdvldrhtss(mapDxjokdxxww);
                iobyxmoadgVar = iobyxmoadgVar2;
                str2 = (String) ppxfxbqfkfVar.f82137gtknphoqwx.get(str);
                if (str2 != null) {
                    kcexrzcfyt.iobyxmoadg iobyxmoadgVar9 = kcexrzcfyt.f37117yggfygwlhe;
                    gk.zoijcleaow zoijcleaowVar3 = ppxfxbqfkfVar.f82136eablkybsjg;
                    zoijcleaowVar3.iobyxmoadg();
                    objWkgbmnqykc2 = kcexrzcfyt.wkgbmnqykc(zoijcleaowVar3.ppxfxbqfkf(ForceUpdateRemoteConfig.INSTANCE.serializer(), str2));
                    wkgbmnqykcVar2 = kr0.wkgbmnqykc.f60450iobyxmoadg;
                    thDxjokdxxww = kcexrzcfyt.dxjokdxxww(objWkgbmnqykc2);
                    if (thDxjokdxxww != null) {
                        wkgbmnqykcVar2.gxszxtbevo(thDxjokdxxww, new CrashlyticsKey[0]);
                    }
                    if (kcexrzcfyt.draadjrbmk(objWkgbmnqykc2)) {
                        objWkgbmnqykc2 = null;
                    }
                } else {
                    objWkgbmnqykc2 = null;
                }
                iobyxmoadgVar.eablkybsjg(null);
                ForceUpdateRemoteConfig forceUpdateRemoteConfig3 = (ForceUpdateRemoteConfig) objWkgbmnqykc2;
                if (forceUpdateRemoteConfig3 != null) {
                }
            } catch (Throwable th6) {
                iobyxmoadgVar2 = iobyxmoadgVar;
                th2 = th6;
                ppxfxbqfkfVar2 = ppxfxbqfkfVar;
                kcexrzcfyt.iobyxmoadg iobyxmoadgVar10 = kcexrzcfyt.f37117yggfygwlhe;
                objWkgbmnqykc = kcexrzcfyt.wkgbmnqykc(zdlpuopuiu.iobyxmoadg(th2));
            }
        } catch (Throwable th7) {
            iobyxmoadgVar2 = iobyxmoadgVar;
            th = th7;
        }
        iobyxmoadgVar2 = iobyxmoadgVar;
        th = th7;
        iobyxmoadgVar2.eablkybsjg(null);
        throw th;
    }

    /* JADX WARN: Code duplicated, block: B:40:0x00eb A[Catch: all -> 0x00f1, TryCatch #0 {all -> 0x00f1, blocks: (B:38:0x00e3, B:40:0x00eb, B:43:0x00f4, B:46:0x00fb, B:48:0x00ff, B:49:0x0103, B:52:0x010b, B:58:0x0136, B:60:0x013e, B:61:0x0143, B:57:0x012c, B:26:0x009f, B:54:0x0115), top: B:91:0x009f, inners: #3 }] */
    /* JADX WARN: Code duplicated, block: B:45:0x00fa  */
    /* JADX WARN: Code duplicated, block: B:48:0x00ff A[Catch: all -> 0x00f1, TryCatch #0 {all -> 0x00f1, blocks: (B:38:0x00e3, B:40:0x00eb, B:43:0x00f4, B:46:0x00fb, B:48:0x00ff, B:49:0x0103, B:52:0x010b, B:58:0x0136, B:60:0x013e, B:61:0x0143, B:57:0x012c, B:26:0x009f, B:54:0x0115), top: B:91:0x009f, inners: #3 }] */
    /* JADX WARN: Code duplicated, block: B:60:0x013e A[Catch: all -> 0x00f1, TryCatch #0 {all -> 0x00f1, blocks: (B:38:0x00e3, B:40:0x00eb, B:43:0x00f4, B:46:0x00fb, B:48:0x00ff, B:49:0x0103, B:52:0x010b, B:58:0x0136, B:60:0x013e, B:61:0x0143, B:57:0x012c, B:26:0x009f, B:54:0x0115), top: B:91:0x009f, inners: #3 }] */
    /* JADX WARN: Code duplicated, block: B:63:0x0149  */
    /* JADX WARN: Code duplicated, block: B:66:0x0151  */
    /* JADX WARN: Code duplicated, block: B:78:0x0181  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Code duplicated, block: B:81:0x0199 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:82:0x019a  */
    /* JADX WARN: Code duplicated, block: B:85:0x01a9 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:86:0x01ab  */
    /* JADX WARN: Code duplicated, block: B:97:0x0115 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // t81.iobyxmoadg
    public Object ppxfxbqfkf(s81.iobyxmoadg iobyxmoadgVar, lg.gxszxtbevo gxszxtbevoVar) throws Throwable {
        eablkybsjg eablkybsjgVar;
        s81.iobyxmoadg iobyxmoadgVar2;
        ppxfxbqfkf ppxfxbqfkfVar;
        ppxfxbqfkf ppxfxbqfkfVar2;
        String str;
        yj.iobyxmoadg iobyxmoadgVar3;
        String str2;
        s81.iobyxmoadg iobyxmoadgVar4;
        yj.iobyxmoadg iobyxmoadgVar5;
        ppxfxbqfkf ppxfxbqfkfVar3;
        ppxfxbqfkf ppxfxbqfkfVar4;
        Object objWkgbmnqykc;
        String str3;
        Object objWkgbmnqykc2;
        kr0.wkgbmnqykc wkgbmnqykcVar;
        Throwable thDxjokdxxww;
        FeatureTogglesRemoteConfig featureTogglesRemoteConfig;
        boolean zWflxmlrfwp;
        Object objAgtfadlqog;
        boolean z13;
        s81.iobyxmoadg iobyxmoadgVar6;
        List items;
        Object next;
        kr0.wkgbmnqykc wkgbmnqykcVar2;
        Throwable thDxjokdxxww2;
        Map mapDxjokdxxww;
        if (gxszxtbevoVar instanceof eablkybsjg) {
            eablkybsjgVar = (eablkybsjg) gxszxtbevoVar;
            int i13 = eablkybsjgVar.f82156zynmafqrjb;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                eablkybsjgVar.f82156zynmafqrjb = i13 - Integer.MIN_VALUE;
            } else {
                eablkybsjgVar = new eablkybsjg(gxszxtbevoVar);
            }
        } else {
            eablkybsjgVar = new eablkybsjg(gxszxtbevoVar);
        }
        Object objPpxfxbqfkf = eablkybsjgVar.f82152lereixgezr;
        Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
        int i14 = eablkybsjgVar.f82156zynmafqrjb;
        try {
            if (i14 != 0) {
                if (i14 == 1) {
                    yj.iobyxmoadg iobyxmoadgVar7 = (yj.iobyxmoadg) eablkybsjgVar.f82148cqumvgiudr;
                    String str4 = (String) eablkybsjgVar.f82150iwizpuwonk;
                    ppxfxbqfkf ppxfxbqfkfVar5 = (ppxfxbqfkf) eablkybsjgVar.f82151jyumaefscl;
                    s81.iobyxmoadg iobyxmoadgVar8 = (s81.iobyxmoadg) eablkybsjgVar.f82154yggfygwlhe;
                    ppxfxbqfkfVar2 = (ppxfxbqfkf) eablkybsjgVar.f82155zdlpuopuiu;
                    zdlpuopuiu.zoijcleaow(objPpxfxbqfkf);
                    iobyxmoadgVar3 = iobyxmoadgVar7;
                    iobyxmoadgVar2 = iobyxmoadgVar8;
                    ppxfxbqfkfVar = ppxfxbqfkfVar5;
                    str = str4;
                } else if (i14 == 2) {
                    iobyxmoadgVar5 = (yj.iobyxmoadg) eablkybsjgVar.f82148cqumvgiudr;
                    str2 = (String) eablkybsjgVar.f82150iwizpuwonk;
                    ppxfxbqfkfVar3 = (ppxfxbqfkf) eablkybsjgVar.f82151jyumaefscl;
                    iobyxmoadgVar4 = (s81.iobyxmoadg) eablkybsjgVar.f82154yggfygwlhe;
                    ppxfxbqfkfVar4 = (ppxfxbqfkf) eablkybsjgVar.f82155zdlpuopuiu;
                    try {
                        zdlpuopuiu.zoijcleaow(objPpxfxbqfkf);
                        objWkgbmnqykc = kcexrzcfyt.wkgbmnqykc(objPpxfxbqfkf);
                    } catch (Throwable th2) {
                        th = th2;
                        try {
                            kcexrzcfyt.iobyxmoadg iobyxmoadgVar9 = kcexrzcfyt.f37117yggfygwlhe;
                            objWkgbmnqykc = kcexrzcfyt.wkgbmnqykc(zdlpuopuiu.iobyxmoadg(th));
                        } catch (Throwable th3) {
                            th = th3;
                            iobyxmoadgVar3 = iobyxmoadgVar5;
                        }
                    }
                    ppxfxbqfkfVar2 = ppxfxbqfkfVar4;
                    ppxfxbqfkfVar = ppxfxbqfkfVar3;
                    iobyxmoadgVar3 = iobyxmoadgVar5;
                    iobyxmoadgVar2 = iobyxmoadgVar4;
                    str = str2;
                    wkgbmnqykcVar2 = kr0.wkgbmnqykc.f60450iobyxmoadg;
                    thDxjokdxxww2 = kcexrzcfyt.dxjokdxxww(objWkgbmnqykc);
                    if (thDxjokdxxww2 != null) {
                        wkgbmnqykcVar2.gxszxtbevo(thDxjokdxxww2, new CrashlyticsKey[0]);
                    }
                    if (kcexrzcfyt.draadjrbmk(objWkgbmnqykc)) {
                        objWkgbmnqykc = null;
                    }
                    mapDxjokdxxww = (Map) objWkgbmnqykc;
                    if (mapDxjokdxxww == null) {
                        mapDxjokdxxww = tzroggbefp.dxjokdxxww();
                    }
                    ppxfxbqfkfVar.vdvldrhtss(mapDxjokdxxww);
                    str3 = (String) ppxfxbqfkfVar.f82137gtknphoqwx.get(str);
                    if (str3 != null) {
                        try {
                            kcexrzcfyt.iobyxmoadg iobyxmoadgVar10 = kcexrzcfyt.f37117yggfygwlhe;
                            gk.zoijcleaow zoijcleaowVar = ppxfxbqfkfVar.f82136eablkybsjg;
                            zoijcleaowVar.iobyxmoadg();
                            objWkgbmnqykc2 = kcexrzcfyt.wkgbmnqykc(zoijcleaowVar.ppxfxbqfkf(FeatureTogglesRemoteConfig.INSTANCE.serializer(), str3));
                        } catch (Throwable th4) {
                            kcexrzcfyt.iobyxmoadg iobyxmoadgVar11 = kcexrzcfyt.f37117yggfygwlhe;
                            objWkgbmnqykc2 = kcexrzcfyt.wkgbmnqykc(zdlpuopuiu.iobyxmoadg(th4));
                        }
                        wkgbmnqykcVar = kr0.wkgbmnqykc.f60450iobyxmoadg;
                        thDxjokdxxww = kcexrzcfyt.dxjokdxxww(objWkgbmnqykc2);
                        if (thDxjokdxxww != null) {
                            wkgbmnqykcVar.gxszxtbevo(thDxjokdxxww, new CrashlyticsKey[0]);
                        }
                        if (kcexrzcfyt.draadjrbmk(objWkgbmnqykc2)) {
                            objWkgbmnqykc2 = null;
                        }
                    } else {
                        objWkgbmnqykc2 = null;
                    }
                    iobyxmoadgVar3.eablkybsjg(null);
                    featureTogglesRemoteConfig = (FeatureTogglesRemoteConfig) objWkgbmnqykc2;
                    if (featureTogglesRemoteConfig != null || (items = featureTogglesRemoteConfig.getItems()) == null) {
                        zWflxmlrfwp = ppxfxbqfkfVar2.wflxmlrfwp(iobyxmoadgVar2);
                    } else {
                        Iterator it = items.iterator();
                        do {
                            if (!it.hasNext()) {
                                next = null;
                                break;
                            }
                            next = it.next();
                        } while (!kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(((FeatureToggleRemoteConfig) next).getName(), iobyxmoadgVar2.wkgbmnqykc()));
                        FeatureToggleRemoteConfig featureToggleRemoteConfig = (FeatureToggleRemoteConfig) next;
                        if (featureToggleRemoteConfig != null) {
                            zWflxmlrfwp = featureToggleRemoteConfig.getIsEnabled();
                        } else {
                            zWflxmlrfwp = ppxfxbqfkfVar2.wflxmlrfwp(iobyxmoadgVar2);
                        }
                    }
                    eablkybsjgVar.f82155zdlpuopuiu = iobyxmoadgVar2;
                    eablkybsjgVar.f82154yggfygwlhe = null;
                    eablkybsjgVar.f82151jyumaefscl = null;
                    eablkybsjgVar.f82150iwizpuwonk = null;
                    eablkybsjgVar.f82148cqumvgiudr = null;
                    eablkybsjgVar.f82149esjtqupxsv = zWflxmlrfwp;
                    eablkybsjgVar.f82156zynmafqrjb = 3;
                    objAgtfadlqog = ppxfxbqfkfVar2.agtfadlqog(eablkybsjgVar);
                    if (objAgtfadlqog == objGxszxtbevo) {
                        return objGxszxtbevo;
                    }
                    z13 = zWflxmlrfwp;
                    objPpxfxbqfkf = objAgtfadlqog;
                    iobyxmoadgVar6 = iobyxmoadgVar2;
                } else {
                    if (i14 != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    z13 = eablkybsjgVar.f82149esjtqupxsv;
                    iobyxmoadgVar6 = (s81.iobyxmoadg) eablkybsjgVar.f82155zdlpuopuiu;
                    zdlpuopuiu.zoijcleaow(objPpxfxbqfkf);
                }
                return kotlin.coroutines.jvm.internal.zoijcleaow.iobyxmoadg(!z13 || hg.jyumaefscl.xrmfcynszj((Iterable) objPpxfxbqfkf, iobyxmoadgVar6.lqeggnwhkg()));
            }
            zdlpuopuiu.zoijcleaow(objPpxfxbqfkf);
            yj.iobyxmoadg iobyxmoadgVar12 = this.f82141nufgyqmvbu;
            eablkybsjgVar.f82155zdlpuopuiu = this;
            iobyxmoadgVar2 = iobyxmoadgVar;
            eablkybsjgVar.f82154yggfygwlhe = iobyxmoadgVar2;
            eablkybsjgVar.f82151jyumaefscl = this;
            eablkybsjgVar.f82150iwizpuwonk = "feature_toggles_android_app";
            eablkybsjgVar.f82148cqumvgiudr = iobyxmoadgVar12;
            eablkybsjgVar.f82156zynmafqrjb = 1;
            if (iobyxmoadgVar12.iobyxmoadg(null, eablkybsjgVar) == objGxszxtbevo) {
                return objGxszxtbevo;
            }
            ppxfxbqfkfVar = this;
            ppxfxbqfkfVar2 = ppxfxbqfkfVar;
            str = "feature_toggles_android_app";
            iobyxmoadgVar3 = iobyxmoadgVar12;
            if (!ppxfxbqfkfVar.f82137gtknphoqwx.isEmpty()) {
                str3 = (String) ppxfxbqfkfVar.f82137gtknphoqwx.get(str);
                if (str3 != null) {
                    kcexrzcfyt.iobyxmoadg iobyxmoadgVar13 = kcexrzcfyt.f37117yggfygwlhe;
                    gk.zoijcleaow zoijcleaowVar2 = ppxfxbqfkfVar.f82136eablkybsjg;
                    zoijcleaowVar2.iobyxmoadg();
                    objWkgbmnqykc2 = kcexrzcfyt.wkgbmnqykc(zoijcleaowVar2.ppxfxbqfkf(FeatureTogglesRemoteConfig.INSTANCE.serializer(), str3));
                    wkgbmnqykcVar = kr0.wkgbmnqykc.f60450iobyxmoadg;
                    thDxjokdxxww = kcexrzcfyt.dxjokdxxww(objWkgbmnqykc2);
                    if (thDxjokdxxww != null) {
                        wkgbmnqykcVar.gxszxtbevo(thDxjokdxxww, new CrashlyticsKey[0]);
                    }
                    if (kcexrzcfyt.draadjrbmk(objWkgbmnqykc2)) {
                        objWkgbmnqykc2 = null;
                    }
                } else {
                    objWkgbmnqykc2 = null;
                }
                iobyxmoadgVar3.eablkybsjg(null);
                featureTogglesRemoteConfig = (FeatureTogglesRemoteConfig) objWkgbmnqykc2;
                if (featureTogglesRemoteConfig != null) {
                    zWflxmlrfwp = ppxfxbqfkfVar2.wflxmlrfwp(iobyxmoadgVar2);
                } else {
                    zWflxmlrfwp = ppxfxbqfkfVar2.wflxmlrfwp(iobyxmoadgVar2);
                }
                eablkybsjgVar.f82155zdlpuopuiu = iobyxmoadgVar2;
                eablkybsjgVar.f82154yggfygwlhe = null;
                eablkybsjgVar.f82151jyumaefscl = null;
                eablkybsjgVar.f82150iwizpuwonk = null;
                eablkybsjgVar.f82148cqumvgiudr = null;
                eablkybsjgVar.f82149esjtqupxsv = zWflxmlrfwp;
                eablkybsjgVar.f82156zynmafqrjb = 3;
                objAgtfadlqog = ppxfxbqfkfVar2.agtfadlqog(eablkybsjgVar);
                if (objAgtfadlqog == objGxszxtbevo) {
                    return objGxszxtbevo;
                }
                z13 = zWflxmlrfwp;
                objPpxfxbqfkf = objAgtfadlqog;
                iobyxmoadgVar6 = iobyxmoadgVar2;
                return kotlin.coroutines.jvm.internal.zoijcleaow.iobyxmoadg(!z13 || hg.jyumaefscl.xrmfcynszj((Iterable) objPpxfxbqfkf, iobyxmoadgVar6.lqeggnwhkg()));
            }
            try {
                kcexrzcfyt.iobyxmoadg iobyxmoadgVar14 = kcexrzcfyt.f37117yggfygwlhe;
                r81.wkgbmnqykc wkgbmnqykcVar3 = new r81.wkgbmnqykc(ppxfxbqfkfVar, null);
                eablkybsjgVar.f82155zdlpuopuiu = ppxfxbqfkfVar2;
                eablkybsjgVar.f82154yggfygwlhe = iobyxmoadgVar2;
                eablkybsjgVar.f82151jyumaefscl = ppxfxbqfkfVar;
                eablkybsjgVar.f82150iwizpuwonk = str;
                eablkybsjgVar.f82148cqumvgiudr = iobyxmoadgVar3;
                eablkybsjgVar.f82156zynmafqrjb = 2;
                objPpxfxbqfkf = f.ppxfxbqfkf(3000L, wkgbmnqykcVar3, eablkybsjgVar);
                if (objPpxfxbqfkf == objGxszxtbevo) {
                    return objGxszxtbevo;
                }
                str2 = str;
                iobyxmoadgVar4 = iobyxmoadgVar2;
                iobyxmoadgVar5 = iobyxmoadgVar3;
                ppxfxbqfkfVar3 = ppxfxbqfkfVar;
                ppxfxbqfkfVar4 = ppxfxbqfkfVar2;
                objWkgbmnqykc = kcexrzcfyt.wkgbmnqykc(objPpxfxbqfkf);
                ppxfxbqfkfVar2 = ppxfxbqfkfVar4;
                ppxfxbqfkfVar = ppxfxbqfkfVar3;
                iobyxmoadgVar3 = iobyxmoadgVar5;
                iobyxmoadgVar2 = iobyxmoadgVar4;
                str = str2;
                wkgbmnqykcVar2 = kr0.wkgbmnqykc.f60450iobyxmoadg;
                thDxjokdxxww2 = kcexrzcfyt.dxjokdxxww(objWkgbmnqykc);
                if (thDxjokdxxww2 != null) {
                    wkgbmnqykcVar2.gxszxtbevo(thDxjokdxxww2, new CrashlyticsKey[0]);
                }
                if (kcexrzcfyt.draadjrbmk(objWkgbmnqykc)) {
                    objWkgbmnqykc = null;
                }
                mapDxjokdxxww = (Map) objWkgbmnqykc;
                if (mapDxjokdxxww == null) {
                    mapDxjokdxxww = tzroggbefp.dxjokdxxww();
                }
                ppxfxbqfkfVar.vdvldrhtss(mapDxjokdxxww);
                str3 = (String) ppxfxbqfkfVar.f82137gtknphoqwx.get(str);
                if (str3 != null) {
                    kcexrzcfyt.iobyxmoadg iobyxmoadgVar15 = kcexrzcfyt.f37117yggfygwlhe;
                    gk.zoijcleaow zoijcleaowVar3 = ppxfxbqfkfVar.f82136eablkybsjg;
                    zoijcleaowVar3.iobyxmoadg();
                    objWkgbmnqykc2 = kcexrzcfyt.wkgbmnqykc(zoijcleaowVar3.ppxfxbqfkf(FeatureTogglesRemoteConfig.INSTANCE.serializer(), str3));
                    wkgbmnqykcVar = kr0.wkgbmnqykc.f60450iobyxmoadg;
                    thDxjokdxxww = kcexrzcfyt.dxjokdxxww(objWkgbmnqykc2);
                    if (thDxjokdxxww != null) {
                        wkgbmnqykcVar.gxszxtbevo(thDxjokdxxww, new CrashlyticsKey[0]);
                    }
                    if (kcexrzcfyt.draadjrbmk(objWkgbmnqykc2)) {
                        objWkgbmnqykc2 = null;
                    }
                } else {
                    objWkgbmnqykc2 = null;
                }
                iobyxmoadgVar3.eablkybsjg(null);
                featureTogglesRemoteConfig = (FeatureTogglesRemoteConfig) objWkgbmnqykc2;
                if (featureTogglesRemoteConfig != null) {
                    zWflxmlrfwp = ppxfxbqfkfVar2.wflxmlrfwp(iobyxmoadgVar2);
                } else {
                    zWflxmlrfwp = ppxfxbqfkfVar2.wflxmlrfwp(iobyxmoadgVar2);
                }
                eablkybsjgVar.f82155zdlpuopuiu = iobyxmoadgVar2;
                eablkybsjgVar.f82154yggfygwlhe = null;
                eablkybsjgVar.f82151jyumaefscl = null;
                eablkybsjgVar.f82150iwizpuwonk = null;
                eablkybsjgVar.f82148cqumvgiudr = null;
                eablkybsjgVar.f82149esjtqupxsv = zWflxmlrfwp;
                eablkybsjgVar.f82156zynmafqrjb = 3;
                objAgtfadlqog = ppxfxbqfkfVar2.agtfadlqog(eablkybsjgVar);
                if (objAgtfadlqog == objGxszxtbevo) {
                    return objGxszxtbevo;
                }
                z13 = zWflxmlrfwp;
                objPpxfxbqfkf = objAgtfadlqog;
                iobyxmoadgVar6 = iobyxmoadgVar2;
                return kotlin.coroutines.jvm.internal.zoijcleaow.iobyxmoadg(!z13 || hg.jyumaefscl.xrmfcynszj((Iterable) objPpxfxbqfkf, iobyxmoadgVar6.lqeggnwhkg()));
            } catch (Throwable th5) {
                th = th5;
                str2 = str;
                iobyxmoadgVar4 = iobyxmoadgVar2;
                iobyxmoadgVar5 = iobyxmoadgVar3;
                ppxfxbqfkfVar3 = ppxfxbqfkfVar;
                ppxfxbqfkfVar4 = ppxfxbqfkfVar2;
                kcexrzcfyt.iobyxmoadg iobyxmoadgVar16 = kcexrzcfyt.f37117yggfygwlhe;
                objWkgbmnqykc = kcexrzcfyt.wkgbmnqykc(zdlpuopuiu.iobyxmoadg(th));
            }
        } catch (Throwable th6) {
            th = th6;
        }
        th = th6;
        iobyxmoadgVar3.eablkybsjg(null);
        throw th;
    }

    public boolean wflxmlrfwp(s81.iobyxmoadg toggle) {
        Object next;
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(toggle, "toggle");
        Iterator it = ojitshcjhn().iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(((FeatureToggleRemoteConfig) next).getName(), toggle.wkgbmnqykc()));
        FeatureToggleRemoteConfig featureToggleRemoteConfig = (FeatureToggleRemoteConfig) next;
        if (featureToggleRemoteConfig != null) {
            return featureToggleRemoteConfig.getIsEnabled();
        }
        return false;
    }

    @Override // t81.iobyxmoadg
    public void zoijcleaow() {
        sj.dxjokdxxww.hkdspvbjdz(sj.dxjokdxxww.kegysxyocb(sj.dxjokdxxww.gxszxtbevo(this.f82143wkgbmnqykc.zoijcleaow(300L), new gxszxtbevo(null)), new lqeggnwhkg(null)), this.f82138gxszxtbevo);
        sj.dxjokdxxww.hkdspvbjdz(sj.dxjokdxxww.kegysxyocb(sj.dxjokdxxww.gxszxtbevo((sj.lqeggnwhkg) this.f82142ppxfxbqfkf.zoijcleaow(wwaezpbzkn.f37140iobyxmoadg), new nufgyqmvbu(null)), new dxjokdxxww(null)), this.f82138gxszxtbevo);
    }
}
