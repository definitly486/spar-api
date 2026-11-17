package ud;

import android.content.Context;
import android.util.Log;
import androidx.datastore.core.CorruptionException;
import java.io.IOException;
import java.util.concurrent.atomic.AtomicReference;
import pj.cllcsxoeiz;
import pj.dsvhmnatus;

/* JADX INFO: loaded from: classes2.dex */
public final class cqumvgiudr implements com.google.firebase.sessions.iobyxmoadg {

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    private static final ppxfxbqfkf f113324gxszxtbevo = new ppxfxbqfkf(null);

    /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
    private static final wg.wkgbmnqykc f113325lqeggnwhkg = f2.iobyxmoadg.zoijcleaow(iwizpuwonk.f113386iobyxmoadg.iobyxmoadg(), new e2.zoijcleaow(zoijcleaow.f113352zdlpuopuiu), null, null, 12, null);

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private final sj.lqeggnwhkg f113326eablkybsjg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final lg.btonecajqb f113327ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final AtomicReference f113328wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final Context f113329zoijcleaow;

    static final class eablkybsjg extends kotlin.coroutines.jvm.internal.draadjrbmk implements tg.vdvldrhtss {

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        /* synthetic */ Object f113330jyumaefscl;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        private /* synthetic */ Object f113331yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        int f113332zdlpuopuiu;

        eablkybsjg(lg.gxszxtbevo gxszxtbevoVar) {
            super(3, gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
            int i13 = this.f113332zdlpuopuiu;
            if (i13 == 0) {
                gg.zdlpuopuiu.zoijcleaow(obj);
                sj.nufgyqmvbu nufgyqmvbuVar = (sj.nufgyqmvbu) this.f113331yggfygwlhe;
                Log.e("FirebaseSessionsRepo", "Error reading stored session data.", (Throwable) this.f113330jyumaefscl);
                g2.wkgbmnqykc wkgbmnqykcVarIobyxmoadg = g2.eablkybsjg.iobyxmoadg();
                this.f113331yggfygwlhe = null;
                this.f113332zdlpuopuiu = 1;
                if (nufgyqmvbuVar.emit(wkgbmnqykcVarIobyxmoadg, this) == objGxszxtbevo) {
                    return objGxszxtbevo;
                }
            } else {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                gg.zdlpuopuiu.zoijcleaow(obj);
            }
            return gg.wwaezpbzkn.f37140iobyxmoadg;
        }

        @Override // tg.vdvldrhtss
        /* JADX INFO: renamed from: ojitshcjhn, reason: merged with bridge method [inline-methods] */
        public final Object invoke(sj.nufgyqmvbu nufgyqmvbuVar, Throwable th2, lg.gxszxtbevo gxszxtbevoVar) {
            eablkybsjg eablkybsjgVar = new eablkybsjg(gxszxtbevoVar);
            eablkybsjgVar.f113331yggfygwlhe = nufgyqmvbuVar;
            eablkybsjgVar.f113330jyumaefscl = th2;
            return eablkybsjgVar.invokeSuspend(gg.wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    public static final class gxszxtbevo implements sj.lqeggnwhkg {

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        final /* synthetic */ cqumvgiudr f113333yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final /* synthetic */ sj.lqeggnwhkg f113334zdlpuopuiu;

        public static final class iobyxmoadg implements sj.nufgyqmvbu {

            /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
            final /* synthetic */ cqumvgiudr f113335yggfygwlhe;

            /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
            final /* synthetic */ sj.nufgyqmvbu f113336zdlpuopuiu;

            /* JADX INFO: renamed from: ud.cqumvgiudr$gxszxtbevo$iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
            public static final class C2809iobyxmoadg extends kotlin.coroutines.jvm.internal.wkgbmnqykc {

                /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
                int f113338yggfygwlhe;

                /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
                /* synthetic */ Object f113339zdlpuopuiu;

                public C2809iobyxmoadg(lg.gxszxtbevo gxszxtbevoVar) {
                    super(gxszxtbevoVar);
                }

                @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
                public final Object invokeSuspend(Object obj) {
                    this.f113339zdlpuopuiu = obj;
                    this.f113338yggfygwlhe |= Integer.MIN_VALUE;
                    return iobyxmoadg.this.emit(null, this);
                }
            }

            public iobyxmoadg(sj.nufgyqmvbu nufgyqmvbuVar, cqumvgiudr cqumvgiudrVar) {
                this.f113336zdlpuopuiu = nufgyqmvbuVar;
                this.f113335yggfygwlhe = cqumvgiudrVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // sj.nufgyqmvbu
            public final Object emit(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
                C2809iobyxmoadg c2809iobyxmoadg;
                if (gxszxtbevoVar instanceof C2809iobyxmoadg) {
                    c2809iobyxmoadg = (C2809iobyxmoadg) gxszxtbevoVar;
                    int i13 = c2809iobyxmoadg.f113338yggfygwlhe;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        c2809iobyxmoadg.f113338yggfygwlhe = i13 - Integer.MIN_VALUE;
                    } else {
                        c2809iobyxmoadg = new C2809iobyxmoadg(gxszxtbevoVar);
                    }
                } else {
                    c2809iobyxmoadg = new C2809iobyxmoadg(gxszxtbevoVar);
                }
                Object obj2 = c2809iobyxmoadg.f113339zdlpuopuiu;
                Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
                int i14 = c2809iobyxmoadg.f113338yggfygwlhe;
                if (i14 == 0) {
                    gg.zdlpuopuiu.zoijcleaow(obj2);
                    sj.nufgyqmvbu nufgyqmvbuVar = this.f113336zdlpuopuiu;
                    draadjrbmk draadjrbmkVarDxjokdxxww = this.f113335yggfygwlhe.dxjokdxxww((g2.wkgbmnqykc) obj);
                    c2809iobyxmoadg.f113338yggfygwlhe = 1;
                    if (nufgyqmvbuVar.emit(draadjrbmkVarDxjokdxxww, c2809iobyxmoadg) == objGxszxtbevo) {
                        return objGxszxtbevo;
                    }
                } else {
                    if (i14 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    gg.zdlpuopuiu.zoijcleaow(obj2);
                }
                return gg.wwaezpbzkn.f37140iobyxmoadg;
            }
        }

        public gxszxtbevo(sj.lqeggnwhkg lqeggnwhkgVar, cqumvgiudr cqumvgiudrVar) {
            this.f113334zdlpuopuiu = lqeggnwhkgVar;
            this.f113333yggfygwlhe = cqumvgiudrVar;
        }

        @Override // sj.lqeggnwhkg
        public Object collect(sj.nufgyqmvbu nufgyqmvbuVar, lg.gxszxtbevo gxszxtbevoVar) {
            Object objCollect = this.f113334zdlpuopuiu.collect(new iobyxmoadg(nufgyqmvbuVar, this.f113333yggfygwlhe), gxszxtbevoVar);
            return objCollect == mg.zoijcleaow.gxszxtbevo() ? objCollect : gg.wwaezpbzkn.f37140iobyxmoadg;
        }
    }

    static final class iobyxmoadg extends kotlin.coroutines.jvm.internal.draadjrbmk implements tg.rgvfuqvkyq {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        int f113341zdlpuopuiu;

        /* JADX INFO: renamed from: ud.cqumvgiudr$iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
        static final class C2810iobyxmoadg implements sj.nufgyqmvbu {

            /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
            final /* synthetic */ cqumvgiudr f113342zdlpuopuiu;

            C2810iobyxmoadg(cqumvgiudr cqumvgiudrVar) {
                this.f113342zdlpuopuiu = cqumvgiudrVar;
            }

            @Override // sj.nufgyqmvbu
            /* JADX INFO: renamed from: zoijcleaow, reason: merged with bridge method [inline-methods] */
            public final Object emit(draadjrbmk draadjrbmkVar, lg.gxszxtbevo gxszxtbevoVar) {
                this.f113342zdlpuopuiu.f113328wkgbmnqykc.set(draadjrbmkVar);
                return gg.wwaezpbzkn.f37140iobyxmoadg;
            }
        }

        iobyxmoadg(lg.gxszxtbevo gxszxtbevoVar) {
            super(2, gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
            return cqumvgiudr.this.new iobyxmoadg(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
            int i13 = this.f113341zdlpuopuiu;
            if (i13 == 0) {
                gg.zdlpuopuiu.zoijcleaow(obj);
                sj.lqeggnwhkg lqeggnwhkgVar = cqumvgiudr.this.f113326eablkybsjg;
                C2810iobyxmoadg c2810iobyxmoadg = new C2810iobyxmoadg(cqumvgiudr.this);
                this.f113341zdlpuopuiu = 1;
                if (lqeggnwhkgVar.collect(c2810iobyxmoadg, this) == objGxszxtbevo) {
                    return objGxszxtbevo;
                }
            } else {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                gg.zdlpuopuiu.zoijcleaow(obj);
            }
            return gg.wwaezpbzkn.f37140iobyxmoadg;
        }

        @Override // tg.rgvfuqvkyq
        public final Object invoke(cllcsxoeiz cllcsxoeizVar, lg.gxszxtbevo gxszxtbevoVar) {
            return ((iobyxmoadg) create(cllcsxoeizVar, gxszxtbevoVar)).invokeSuspend(gg.wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    static final class lqeggnwhkg extends kotlin.coroutines.jvm.internal.draadjrbmk implements tg.rgvfuqvkyq {

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        final /* synthetic */ String f113343jyumaefscl;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        int f113345zdlpuopuiu;

        static final class iobyxmoadg extends kotlin.coroutines.jvm.internal.draadjrbmk implements tg.rgvfuqvkyq {

            /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
            final /* synthetic */ String f113346jyumaefscl;

            /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
            /* synthetic */ Object f113347yggfygwlhe;

            /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
            int f113348zdlpuopuiu;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            iobyxmoadg(String str, lg.gxszxtbevo gxszxtbevoVar) {
                super(2, gxszxtbevoVar);
                this.f113346jyumaefscl = str;
            }

            @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
            public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
                iobyxmoadg iobyxmoadgVar = new iobyxmoadg(this.f113346jyumaefscl, gxszxtbevoVar);
                iobyxmoadgVar.f113347yggfygwlhe = obj;
                return iobyxmoadgVar;
            }

            @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
            public final Object invokeSuspend(Object obj) {
                mg.zoijcleaow.gxszxtbevo();
                if (this.f113348zdlpuopuiu != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                gg.zdlpuopuiu.zoijcleaow(obj);
                ((g2.iobyxmoadg) this.f113347yggfygwlhe).dxjokdxxww(wkgbmnqykc.f113350iobyxmoadg.iobyxmoadg(), this.f113346jyumaefscl);
                return gg.wwaezpbzkn.f37140iobyxmoadg;
            }

            @Override // tg.rgvfuqvkyq
            /* JADX INFO: renamed from: ojitshcjhn, reason: merged with bridge method [inline-methods] */
            public final Object invoke(g2.iobyxmoadg iobyxmoadgVar, lg.gxszxtbevo gxszxtbevoVar) {
                return ((iobyxmoadg) create(iobyxmoadgVar, gxszxtbevoVar)).invokeSuspend(gg.wwaezpbzkn.f37140iobyxmoadg);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        lqeggnwhkg(String str, lg.gxszxtbevo gxszxtbevoVar) {
            super(2, gxszxtbevoVar);
            this.f113343jyumaefscl = str;
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
            return cqumvgiudr.this.new lqeggnwhkg(this.f113343jyumaefscl, gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
            int i13 = this.f113345zdlpuopuiu;
            try {
                if (i13 == 0) {
                    gg.zdlpuopuiu.zoijcleaow(obj);
                    d2.eablkybsjg eablkybsjgVarZoijcleaow = cqumvgiudr.f113324gxszxtbevo.zoijcleaow(cqumvgiudr.this.f113329zoijcleaow);
                    iobyxmoadg iobyxmoadgVar = new iobyxmoadg(this.f113343jyumaefscl, null);
                    this.f113345zdlpuopuiu = 1;
                    if (g2.lqeggnwhkg.iobyxmoadg(eablkybsjgVarZoijcleaow, iobyxmoadgVar, this) == objGxszxtbevo) {
                        return objGxszxtbevo;
                    }
                } else {
                    if (i13 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    gg.zdlpuopuiu.zoijcleaow(obj);
                }
            } catch (IOException e13) {
                Log.w("FirebaseSessionsRepo", "Failed to update session Id: " + e13);
            }
            return gg.wwaezpbzkn.f37140iobyxmoadg;
        }

        @Override // tg.rgvfuqvkyq
        public final Object invoke(cllcsxoeiz cllcsxoeizVar, lg.gxszxtbevo gxszxtbevoVar) {
            return ((lqeggnwhkg) create(cllcsxoeizVar, gxszxtbevoVar)).invokeSuspend(gg.wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    private static final class ppxfxbqfkf {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        static final /* synthetic */ ah.gtknphoqwx[] f113349iobyxmoadg = {kotlin.jvm.internal.cllcsxoeiz.nufgyqmvbu(new kotlin.jvm.internal.lmojexxdyd(ppxfxbqfkf.class, "dataStore", "getDataStore(Landroid/content/Context;)Landroidx/datastore/core/DataStore;", 0))};

        public /* synthetic */ ppxfxbqfkf(kotlin.jvm.internal.gtknphoqwx gtknphoqwxVar) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final d2.eablkybsjg zoijcleaow(Context context) {
            return (d2.eablkybsjg) cqumvgiudr.f113325lqeggnwhkg.iobyxmoadg(context, f113349iobyxmoadg[0]);
        }

        private ppxfxbqfkf() {
        }
    }

    private static final class wkgbmnqykc {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final wkgbmnqykc f113350iobyxmoadg = new wkgbmnqykc();

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private static final g2.wkgbmnqykc.iobyxmoadg f113351zoijcleaow = g2.gxszxtbevo.gxszxtbevo("session_id");

        private wkgbmnqykc() {
        }

        public final g2.wkgbmnqykc.iobyxmoadg iobyxmoadg() {
            return f113351zoijcleaow;
        }
    }

    static final class zoijcleaow extends kotlin.jvm.internal.jyumaefscl implements tg.draadjrbmk {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        public static final zoijcleaow f113352zdlpuopuiu = new zoijcleaow();

        zoijcleaow() {
            super(1);
        }

        @Override // tg.draadjrbmk
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public final g2.wkgbmnqykc invoke(CorruptionException ex2) {
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(ex2, "ex");
            Log.w("FirebaseSessionsRepo", "CorruptionException in sessions DataStore in " + jyumaefscl.f113390iobyxmoadg.eablkybsjg() + '.', ex2);
            return g2.eablkybsjg.iobyxmoadg();
        }
    }

    public cqumvgiudr(Context context, lg.btonecajqb backgroundDispatcher) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(context, "context");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(backgroundDispatcher, "backgroundDispatcher");
        this.f113329zoijcleaow = context;
        this.f113327ppxfxbqfkf = backgroundDispatcher;
        this.f113328wkgbmnqykc = new AtomicReference();
        this.f113326eablkybsjg = new gxszxtbevo(sj.dxjokdxxww.gxszxtbevo(f113324gxszxtbevo.zoijcleaow(context).getData(), new eablkybsjg(null)), this);
        pj.gtknphoqwx.wkgbmnqykc(dsvhmnatus.iobyxmoadg(backgroundDispatcher), null, null, new iobyxmoadg(null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final draadjrbmk dxjokdxxww(g2.wkgbmnqykc wkgbmnqykcVar) {
        return new draadjrbmk((String) wkgbmnqykcVar.zoijcleaow(wkgbmnqykc.f113350iobyxmoadg.iobyxmoadg()));
    }

    @Override // com.google.firebase.sessions.iobyxmoadg
    public String iobyxmoadg() {
        draadjrbmk draadjrbmkVar = (draadjrbmk) this.f113328wkgbmnqykc.get();
        if (draadjrbmkVar != null) {
            return draadjrbmkVar.iobyxmoadg();
        }
        return null;
    }

    @Override // com.google.firebase.sessions.iobyxmoadg
    public void zoijcleaow(String sessionId) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(sessionId, "sessionId");
        pj.gtknphoqwx.wkgbmnqykc(dsvhmnatus.iobyxmoadg(this.f113327ppxfxbqfkf), null, null, new lqeggnwhkg(sessionId, null), 3, null);
    }
}
