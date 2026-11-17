package hq1;

import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.Task;
import gg.draadjrbmk;
import gg.gtknphoqwx;
import gg.wwaezpbzkn;
import gg.zdlpuopuiu;
import hg.tzroggbefp;
import java.util.LinkedHashMap;
import java.util.Map;
import lg.gxszxtbevo;
import pd.ojitshcjhn;
import ru.myspar.proloyalty.services.crash_logger.api.CrashlyticsKey;
import sj.dxjokdxxww;
import sj.lqeggnwhkg;
import sj.nufgyqmvbu;
import tg.rgvfuqvkyq;

/* JADX INFO: loaded from: classes6.dex */
public final class wkgbmnqykc implements gq1.iobyxmoadg {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final gtknphoqwx f40918iobyxmoadg = draadjrbmk.zoijcleaow(new tg.iobyxmoadg() { // from class: hq1.zoijcleaow
        @Override // tg.iobyxmoadg
        public final Object invoke() {
            return wkgbmnqykc.gtknphoqwx();
        }
    });

    static final class iobyxmoadg extends kotlin.coroutines.jvm.internal.draadjrbmk implements rgvfuqvkyq {

        /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
        final /* synthetic */ wkgbmnqykc f40919cqumvgiudr;

        /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
        final /* synthetic */ long f40920iwizpuwonk;

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        private /* synthetic */ Object f40921jyumaefscl;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        int f40922yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        Object f40923zdlpuopuiu;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        iobyxmoadg(long j13, wkgbmnqykc wkgbmnqykcVar, gxszxtbevo gxszxtbevoVar) {
            super(2, gxszxtbevoVar);
            this.f40920iwizpuwonk = j13;
            this.f40919cqumvgiudr = wkgbmnqykcVar;
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final gxszxtbevo create(Object obj, gxszxtbevo gxszxtbevoVar) {
            iobyxmoadg iobyxmoadgVar = new iobyxmoadg(this.f40920iwizpuwonk, this.f40919cqumvgiudr, gxszxtbevoVar);
            iobyxmoadgVar.f40921jyumaefscl = obj;
            return iobyxmoadgVar;
        }

        /* JADX WARN: Code duplicated, block: B:24:0x0053 A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:25:0x0054  */
        /* JADX WARN: Code duplicated, block: B:28:0x0061 A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:29:0x0062  */
        /* JADX WARN: Code duplicated, block: B:35:0x0088 A[RETURN] */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:34:0x0086 -> B:21:0x0043). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final java.lang.Object invokeSuspend(java.lang.Object r9) {
            /*
                r8 = this;
                java.lang.Object r0 = mg.zoijcleaow.gxszxtbevo()
                int r1 = r8.f40922yggfygwlhe
                r2 = 0
                r3 = 3
                r4 = 2
                r5 = 1
                if (r1 == 0) goto L3b
                if (r1 == r5) goto L2c
                if (r1 == r4) goto L22
                if (r1 != r3) goto L1a
                java.lang.Object r1 = r8.f40921jyumaefscl
                sj.nufgyqmvbu r1 = (sj.nufgyqmvbu) r1
                gg.zdlpuopuiu.zoijcleaow(r9)
                goto L43
            L1a:
                java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r9.<init>(r0)
                throw r9
            L22:
                java.lang.Object r1 = r8.f40921jyumaefscl
                sj.nufgyqmvbu r1 = (sj.nufgyqmvbu) r1
                gg.zdlpuopuiu.zoijcleaow(r9)     // Catch: java.lang.Throwable -> L2a
                goto L63
            L2a:
                r9 = move-exception
                goto L69
            L2c:
                java.lang.Object r1 = r8.f40923zdlpuopuiu
                sj.nufgyqmvbu r1 = (sj.nufgyqmvbu) r1
                java.lang.Object r6 = r8.f40921jyumaefscl
                sj.nufgyqmvbu r6 = (sj.nufgyqmvbu) r6
                gg.zdlpuopuiu.zoijcleaow(r9)     // Catch: java.lang.Throwable -> L38
                goto L55
            L38:
                r9 = move-exception
                r1 = r6
                goto L69
            L3b:
                gg.zdlpuopuiu.zoijcleaow(r9)
                java.lang.Object r9 = r8.f40921jyumaefscl
                sj.nufgyqmvbu r9 = (sj.nufgyqmvbu) r9
                r1 = r9
            L43:
                hq1.wkgbmnqykc r9 = r8.f40919cqumvgiudr
                gg.kcexrzcfyt$iobyxmoadg r6 = gg.kcexrzcfyt.f37117yggfygwlhe     // Catch: java.lang.Throwable -> L2a
                r8.f40921jyumaefscl = r1     // Catch: java.lang.Throwable -> L2a
                r8.f40923zdlpuopuiu = r1     // Catch: java.lang.Throwable -> L2a
                r8.f40922yggfygwlhe = r5     // Catch: java.lang.Throwable -> L2a
                java.lang.Object r9 = r9.iobyxmoadg(r8)     // Catch: java.lang.Throwable -> L2a
                if (r9 != r0) goto L54
                return r0
            L54:
                r6 = r1
            L55:
                r8.f40921jyumaefscl = r6     // Catch: java.lang.Throwable -> L38
                r8.f40923zdlpuopuiu = r2     // Catch: java.lang.Throwable -> L38
                r8.f40922yggfygwlhe = r4     // Catch: java.lang.Throwable -> L38
                java.lang.Object r9 = r1.emit(r9, r8)     // Catch: java.lang.Throwable -> L38
                if (r9 != r0) goto L62
                return r0
            L62:
                r1 = r6
            L63:
                gg.wwaezpbzkn r9 = gg.wwaezpbzkn.f37140iobyxmoadg     // Catch: java.lang.Throwable -> L2a
                gg.kcexrzcfyt.wkgbmnqykc(r9)     // Catch: java.lang.Throwable -> L2a
                goto L72
            L69:
                gg.kcexrzcfyt$iobyxmoadg r6 = gg.kcexrzcfyt.f37117yggfygwlhe
                java.lang.Object r9 = gg.zdlpuopuiu.iobyxmoadg(r9)
                gg.kcexrzcfyt.wkgbmnqykc(r9)
            L72:
                nj.iobyxmoadg$iobyxmoadg r9 = nj.iobyxmoadg.f70173yggfygwlhe
                long r6 = r8.f40920iwizpuwonk
                nj.wkgbmnqykc r9 = nj.wkgbmnqykc.SECONDS
                long r6 = nj.ppxfxbqfkf.zdlpuopuiu(r6, r9)
                r8.f40921jyumaefscl = r1
                r8.f40923zdlpuopuiu = r2
                r8.f40922yggfygwlhe = r3
                java.lang.Object r9 = pj.crxdokpmqz.ppxfxbqfkf(r6, r8)
                if (r9 != r0) goto L43
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: hq1.wkgbmnqykc.iobyxmoadg.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // tg.rgvfuqvkyq
        /* JADX INFO: renamed from: ojitshcjhn, reason: merged with bridge method [inline-methods] */
        public final Object invoke(nufgyqmvbu nufgyqmvbuVar, gxszxtbevo gxszxtbevoVar) {
            return ((iobyxmoadg) create(nufgyqmvbuVar, gxszxtbevoVar)).invokeSuspend(wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    public static final class ppxfxbqfkf implements lqeggnwhkg {

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        final /* synthetic */ wkgbmnqykc f40924yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final /* synthetic */ lqeggnwhkg f40925zdlpuopuiu;

        public static final class iobyxmoadg implements nufgyqmvbu {

            /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
            final /* synthetic */ wkgbmnqykc f40926yggfygwlhe;

            /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
            final /* synthetic */ nufgyqmvbu f40927zdlpuopuiu;

            /* JADX INFO: renamed from: hq1.wkgbmnqykc$ppxfxbqfkf$iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
            public static final class C0947iobyxmoadg extends kotlin.coroutines.jvm.internal.wkgbmnqykc {

                /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
                Object f40928cqumvgiudr;

                /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
                Object f40930jyumaefscl;

                /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
                int f40931yggfygwlhe;

                /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
                /* synthetic */ Object f40932zdlpuopuiu;

                public C0947iobyxmoadg(gxszxtbevo gxszxtbevoVar) {
                    super(gxszxtbevoVar);
                }

                @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
                public final Object invokeSuspend(Object obj) {
                    this.f40932zdlpuopuiu = obj;
                    this.f40931yggfygwlhe |= Integer.MIN_VALUE;
                    return iobyxmoadg.this.emit(null, this);
                }
            }

            public iobyxmoadg(nufgyqmvbu nufgyqmvbuVar, wkgbmnqykc wkgbmnqykcVar) {
                this.f40927zdlpuopuiu = nufgyqmvbuVar;
                this.f40926yggfygwlhe = wkgbmnqykcVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // sj.nufgyqmvbu
            public final Object emit(Object obj, gxszxtbevo gxszxtbevoVar) {
                C0947iobyxmoadg c0947iobyxmoadg;
                iobyxmoadg iobyxmoadgVar;
                nufgyqmvbu nufgyqmvbuVar;
                if (gxszxtbevoVar instanceof C0947iobyxmoadg) {
                    c0947iobyxmoadg = (C0947iobyxmoadg) gxszxtbevoVar;
                    int i13 = c0947iobyxmoadg.f40931yggfygwlhe;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        c0947iobyxmoadg.f40931yggfygwlhe = i13 - Integer.MIN_VALUE;
                    } else {
                        c0947iobyxmoadg = new C0947iobyxmoadg(gxszxtbevoVar);
                    }
                } else {
                    c0947iobyxmoadg = new C0947iobyxmoadg(gxszxtbevoVar);
                }
                Object obj2 = c0947iobyxmoadg.f40932zdlpuopuiu;
                Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
                int i14 = c0947iobyxmoadg.f40931yggfygwlhe;
                if (i14 != 0) {
                    if (i14 == 1) {
                        nufgyqmvbuVar = (nufgyqmvbu) c0947iobyxmoadg.f40928cqumvgiudr;
                        iobyxmoadgVar = (iobyxmoadg) c0947iobyxmoadg.f40930jyumaefscl;
                        zdlpuopuiu.zoijcleaow(obj2);
                    } else {
                        if (i14 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        zdlpuopuiu.zoijcleaow(obj2);
                    }
                    return wwaezpbzkn.f37140iobyxmoadg;
                }
                zdlpuopuiu.zoijcleaow(obj2);
                nufgyqmvbu nufgyqmvbuVar2 = this.f40927zdlpuopuiu;
                Task taskAddOnFailureListener = this.f40926yggfygwlhe.dxjokdxxww().gxszxtbevo().addOnFailureListener(C0948wkgbmnqykc.f40933iobyxmoadg);
                kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(taskAddOnFailureListener, "addOnFailureListener(...)");
                c0947iobyxmoadg.f40930jyumaefscl = this;
                c0947iobyxmoadg.f40928cqumvgiudr = nufgyqmvbuVar2;
                c0947iobyxmoadg.f40931yggfygwlhe = 1;
                if (zj.zoijcleaow.iobyxmoadg(taskAddOnFailureListener, c0947iobyxmoadg) == objGxszxtbevo) {
                    return objGxszxtbevo;
                }
                iobyxmoadgVar = this;
                nufgyqmvbuVar = nufgyqmvbuVar2;
                Map mapBtonecajqb = iobyxmoadgVar.f40926yggfygwlhe.dxjokdxxww().btonecajqb();
                kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(mapBtonecajqb, "getAll(...)");
                LinkedHashMap linkedHashMap = new LinkedHashMap(tzroggbefp.eablkybsjg(mapBtonecajqb.size()));
                for (Map.Entry entry : mapBtonecajqb.entrySet()) {
                    linkedHashMap.put(entry.getKey(), ((pd.draadjrbmk) entry.getValue()).iobyxmoadg());
                }
                c0947iobyxmoadg.f40930jyumaefscl = null;
                c0947iobyxmoadg.f40928cqumvgiudr = null;
                c0947iobyxmoadg.f40931yggfygwlhe = 2;
                if (nufgyqmvbuVar.emit(linkedHashMap, c0947iobyxmoadg) == objGxszxtbevo) {
                    return objGxszxtbevo;
                }
                return wwaezpbzkn.f37140iobyxmoadg;
            }
        }

        public ppxfxbqfkf(lqeggnwhkg lqeggnwhkgVar, wkgbmnqykc wkgbmnqykcVar) {
            this.f40925zdlpuopuiu = lqeggnwhkgVar;
            this.f40924yggfygwlhe = wkgbmnqykcVar;
        }

        @Override // sj.lqeggnwhkg
        public Object collect(nufgyqmvbu nufgyqmvbuVar, gxszxtbevo gxszxtbevoVar) {
            Object objCollect = this.f40925zdlpuopuiu.collect(new iobyxmoadg(nufgyqmvbuVar, this.f40924yggfygwlhe), gxszxtbevoVar);
            return objCollect == mg.zoijcleaow.gxszxtbevo() ? objCollect : wwaezpbzkn.f37140iobyxmoadg;
        }
    }

    /* JADX INFO: renamed from: hq1.wkgbmnqykc$wkgbmnqykc, reason: collision with other inner class name */
    static final class C0948wkgbmnqykc implements OnFailureListener {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final C0948wkgbmnqykc f40933iobyxmoadg = new C0948wkgbmnqykc();

        C0948wkgbmnqykc() {
        }

        @Override // com.google.android.gms.tasks.OnFailureListener
        public final void onFailure(Exception it) {
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(it, "it");
            kr0.wkgbmnqykc.f60450iobyxmoadg.gxszxtbevo(it, new CrashlyticsKey[0]);
        }
    }

    static final class zoijcleaow extends kotlin.coroutines.jvm.internal.wkgbmnqykc {

        /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
        int f40934iwizpuwonk;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        /* synthetic */ Object f40936yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        Object f40937zdlpuopuiu;

        zoijcleaow(gxszxtbevo gxszxtbevoVar) {
            super(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            this.f40936yggfygwlhe = obj;
            this.f40934iwizpuwonk |= Integer.MIN_VALUE;
            return wkgbmnqykc.this.iobyxmoadg(this);
        }
    }

    private final lqeggnwhkg btonecajqb() {
        return new ppxfxbqfkf(ojitshcjhn.iobyxmoadg(dxjokdxxww()), this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wwaezpbzkn draadjrbmk(pd.gtknphoqwx.zoijcleaow remoteConfigSettings) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(remoteConfigSettings, "$this$remoteConfigSettings");
        remoteConfigSettings.eablkybsjg(300L);
        remoteConfigSettings.wkgbmnqykc(3L);
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final com.google.firebase.remoteconfig.iobyxmoadg dxjokdxxww() {
        return (com.google.firebase.remoteconfig.iobyxmoadg) this.f40918iobyxmoadg.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final com.google.firebase.remoteconfig.iobyxmoadg gtknphoqwx() {
        com.google.firebase.remoteconfig.iobyxmoadg iobyxmoadgVarIobyxmoadg = td.iobyxmoadg.iobyxmoadg(zc.iobyxmoadg.f129562iobyxmoadg);
        iobyxmoadgVarIobyxmoadg.iwizpuwonk(td.iobyxmoadg.zoijcleaow(new tg.draadjrbmk() { // from class: hq1.ppxfxbqfkf
            @Override // tg.draadjrbmk
            public final Object invoke(Object obj) {
                return wkgbmnqykc.draadjrbmk((pd.gtknphoqwx.zoijcleaow) obj);
            }
        }));
        return iobyxmoadgVarIobyxmoadg;
    }

    private final lqeggnwhkg lqeggnwhkg(long j13) {
        return dxjokdxxww.wwaezpbzkn(new iobyxmoadg(j13, this, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void nufgyqmvbu(Exception it) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(it, "it");
        kr0.wkgbmnqykc.f60450iobyxmoadg.gxszxtbevo(it, new CrashlyticsKey[0]);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // gq1.iobyxmoadg
    public Object iobyxmoadg(gxszxtbevo gxszxtbevoVar) {
        zoijcleaow zoijcleaowVar;
        wkgbmnqykc wkgbmnqykcVar;
        if (gxszxtbevoVar instanceof zoijcleaow) {
            zoijcleaowVar = (zoijcleaow) gxszxtbevoVar;
            int i13 = zoijcleaowVar.f40934iwizpuwonk;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                zoijcleaowVar.f40934iwizpuwonk = i13 - Integer.MIN_VALUE;
            } else {
                zoijcleaowVar = new zoijcleaow(gxszxtbevoVar);
            }
        } else {
            zoijcleaowVar = new zoijcleaow(gxszxtbevoVar);
        }
        Object obj = zoijcleaowVar.f40936yggfygwlhe;
        Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
        int i14 = zoijcleaowVar.f40934iwizpuwonk;
        if (i14 == 0) {
            zdlpuopuiu.zoijcleaow(obj);
            Task taskAddOnFailureListener = dxjokdxxww().dxjokdxxww().addOnFailureListener(new OnFailureListener() { // from class: hq1.iobyxmoadg
                @Override // com.google.android.gms.tasks.OnFailureListener
                public final void onFailure(Exception exc) {
                    wkgbmnqykc.nufgyqmvbu(exc);
                }
            });
            kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(taskAddOnFailureListener, "addOnFailureListener(...)");
            zoijcleaowVar.f40937zdlpuopuiu = this;
            zoijcleaowVar.f40934iwizpuwonk = 1;
            if (zj.zoijcleaow.iobyxmoadg(taskAddOnFailureListener, zoijcleaowVar) == objGxszxtbevo) {
                return objGxszxtbevo;
            }
            wkgbmnqykcVar = this;
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            wkgbmnqykcVar = (wkgbmnqykc) zoijcleaowVar.f40937zdlpuopuiu;
            zdlpuopuiu.zoijcleaow(obj);
        }
        Map mapBtonecajqb = wkgbmnqykcVar.dxjokdxxww().btonecajqb();
        kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(mapBtonecajqb, "getAll(...)");
        LinkedHashMap linkedHashMap = new LinkedHashMap(tzroggbefp.eablkybsjg(mapBtonecajqb.size()));
        for (Map.Entry entry : mapBtonecajqb.entrySet()) {
            linkedHashMap.put(entry.getKey(), ((pd.draadjrbmk) entry.getValue()).iobyxmoadg());
        }
        return linkedHashMap;
    }

    @Override // gq1.iobyxmoadg
    public lqeggnwhkg zoijcleaow(long j13) {
        return dxjokdxxww.vdvldrhtss(dxjokdxxww.wypolnanlu(btonecajqb(), lqeggnwhkg(j13)));
    }
}
