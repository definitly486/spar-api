package androidx.compose.ui.platform;

import android.content.ContentResolver;
import android.content.Context;
import android.database.ContentObserver;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.provider.Settings;
import android.view.View;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.KotlinNothingValueException;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes.dex */
public abstract class g0 {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private static final Map f6895iobyxmoadg = new LinkedHashMap();

    public static final class iobyxmoadg implements View.OnAttachStateChangeListener {

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        final /* synthetic */ androidx.compose.runtime.n f6896yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final /* synthetic */ View f6897zdlpuopuiu;

        iobyxmoadg(View view, androidx.compose.runtime.n nVar) {
            this.f6897zdlpuopuiu = view;
            this.f6896yggfygwlhe = nVar;
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
            this.f6897zdlpuopuiu.removeOnAttachStateChangeListener(this);
            this.f6896yggfygwlhe.metgxyhuhe();
        }
    }

    static final class ppxfxbqfkf extends kotlin.coroutines.jvm.internal.draadjrbmk implements tg.rgvfuqvkyq {

        /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
        final /* synthetic */ Uri f6898cqumvgiudr;

        /* JADX INFO: renamed from: esjtqupxsv, reason: collision with root package name */
        final /* synthetic */ wkgbmnqykc f6899esjtqupxsv;

        /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
        final /* synthetic */ ContentResolver f6900iwizpuwonk;

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        private /* synthetic */ Object f6901jyumaefscl;

        /* JADX INFO: renamed from: lereixgezr, reason: collision with root package name */
        final /* synthetic */ rj.lqeggnwhkg f6902lereixgezr;

        /* JADX INFO: renamed from: pmvmpeiblj, reason: collision with root package name */
        final /* synthetic */ Context f6903pmvmpeiblj;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        int f6904yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        Object f6905zdlpuopuiu;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        ppxfxbqfkf(ContentResolver contentResolver, Uri uri, wkgbmnqykc wkgbmnqykcVar, rj.lqeggnwhkg lqeggnwhkgVar, Context context, lg.gxszxtbevo gxszxtbevoVar) {
            super(2, gxszxtbevoVar);
            this.f6900iwizpuwonk = contentResolver;
            this.f6898cqumvgiudr = uri;
            this.f6899esjtqupxsv = wkgbmnqykcVar;
            this.f6902lereixgezr = lqeggnwhkgVar;
            this.f6903pmvmpeiblj = context;
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
            ppxfxbqfkf ppxfxbqfkfVar = new ppxfxbqfkf(this.f6900iwizpuwonk, this.f6898cqumvgiudr, this.f6899esjtqupxsv, this.f6902lereixgezr, this.f6903pmvmpeiblj, gxszxtbevoVar);
            ppxfxbqfkfVar.f6901jyumaefscl = obj;
            return ppxfxbqfkfVar;
        }

        /* JADX WARN: Code duplicated, block: B:20:0x0054 A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:21:0x0055  */
        /* JADX WARN: Code duplicated, block: B:24:0x0060 A[Catch: all -> 0x001b, TRY_LEAVE, TryCatch #0 {all -> 0x001b, blocks: (B:7:0x0016, B:18:0x0048, B:22:0x0058, B:24:0x0060, B:14:0x002d, B:17:0x0042), top: B:31:0x0008 }] */
        /* JADX WARN: Code duplicated, block: B:26:0x0081 A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:27:0x0082  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:25:0x007f -> B:8:0x0019). Please report as a decompilation issue!!! */
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
                int r1 = r8.f6904yggfygwlhe
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L31
                if (r1 == r3) goto L25
                if (r1 != r2) goto L1d
                java.lang.Object r1 = r8.f6905zdlpuopuiu
                rj.dxjokdxxww r1 = (rj.dxjokdxxww) r1
                java.lang.Object r4 = r8.f6901jyumaefscl
                sj.nufgyqmvbu r4 = (sj.nufgyqmvbu) r4
                gg.zdlpuopuiu.zoijcleaow(r9)     // Catch: java.lang.Throwable -> L1b
            L19:
                r9 = r4
                goto L48
            L1b:
                r9 = move-exception
                goto L8c
            L1d:
                java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r9.<init>(r0)
                throw r9
            L25:
                java.lang.Object r1 = r8.f6905zdlpuopuiu
                rj.dxjokdxxww r1 = (rj.dxjokdxxww) r1
                java.lang.Object r4 = r8.f6901jyumaefscl
                sj.nufgyqmvbu r4 = (sj.nufgyqmvbu) r4
                gg.zdlpuopuiu.zoijcleaow(r9)     // Catch: java.lang.Throwable -> L1b
                goto L58
            L31:
                gg.zdlpuopuiu.zoijcleaow(r9)
                java.lang.Object r9 = r8.f6901jyumaefscl
                sj.nufgyqmvbu r9 = (sj.nufgyqmvbu) r9
                android.content.ContentResolver r1 = r8.f6900iwizpuwonk
                android.net.Uri r4 = r8.f6898cqumvgiudr
                r5 = 0
                androidx.compose.ui.platform.g0$wkgbmnqykc r6 = r8.f6899esjtqupxsv
                r1.registerContentObserver(r4, r5, r6)
                rj.lqeggnwhkg r1 = r8.f6902lereixgezr     // Catch: java.lang.Throwable -> L1b
                rj.dxjokdxxww r1 = r1.iterator()     // Catch: java.lang.Throwable -> L1b
            L48:
                r8.f6901jyumaefscl = r9     // Catch: java.lang.Throwable -> L1b
                r8.f6905zdlpuopuiu = r1     // Catch: java.lang.Throwable -> L1b
                r8.f6904yggfygwlhe = r3     // Catch: java.lang.Throwable -> L1b
                java.lang.Object r4 = r1.iobyxmoadg(r8)     // Catch: java.lang.Throwable -> L1b
                if (r4 != r0) goto L55
                return r0
            L55:
                r7 = r4
                r4 = r9
                r9 = r7
            L58:
                java.lang.Boolean r9 = (java.lang.Boolean) r9     // Catch: java.lang.Throwable -> L1b
                boolean r9 = r9.booleanValue()     // Catch: java.lang.Throwable -> L1b
                if (r9 == 0) goto L82
                r1.next()     // Catch: java.lang.Throwable -> L1b
                android.content.Context r9 = r8.f6903pmvmpeiblj     // Catch: java.lang.Throwable -> L1b
                android.content.ContentResolver r9 = r9.getContentResolver()     // Catch: java.lang.Throwable -> L1b
                java.lang.String r5 = "animator_duration_scale"
                r6 = 1065353216(0x3f800000, float:1.0)
                float r9 = android.provider.Settings.Global.getFloat(r9, r5, r6)     // Catch: java.lang.Throwable -> L1b
                java.lang.Float r9 = kotlin.coroutines.jvm.internal.zoijcleaow.ppxfxbqfkf(r9)     // Catch: java.lang.Throwable -> L1b
                r8.f6901jyumaefscl = r4     // Catch: java.lang.Throwable -> L1b
                r8.f6905zdlpuopuiu = r1     // Catch: java.lang.Throwable -> L1b
                r8.f6904yggfygwlhe = r2     // Catch: java.lang.Throwable -> L1b
                java.lang.Object r9 = r4.emit(r9, r8)     // Catch: java.lang.Throwable -> L1b
                if (r9 != r0) goto L19
                return r0
            L82:
                android.content.ContentResolver r9 = r8.f6900iwizpuwonk
                androidx.compose.ui.platform.g0$wkgbmnqykc r0 = r8.f6899esjtqupxsv
                r9.unregisterContentObserver(r0)
                gg.wwaezpbzkn r9 = gg.wwaezpbzkn.f37140iobyxmoadg
                return r9
            L8c:
                android.content.ContentResolver r0 = r8.f6900iwizpuwonk
                androidx.compose.ui.platform.g0$wkgbmnqykc r1 = r8.f6899esjtqupxsv
                r0.unregisterContentObserver(r1)
                throw r9
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.platform.g0.ppxfxbqfkf.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // tg.rgvfuqvkyq
        /* JADX INFO: renamed from: ojitshcjhn, reason: merged with bridge method [inline-methods] */
        public final Object invoke(sj.nufgyqmvbu nufgyqmvbuVar, lg.gxszxtbevo gxszxtbevoVar) {
            return ((ppxfxbqfkf) create(nufgyqmvbuVar, gxszxtbevoVar)).invokeSuspend(gg.wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    public static final class wkgbmnqykc extends ContentObserver {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        final /* synthetic */ rj.lqeggnwhkg f6906iobyxmoadg;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        wkgbmnqykc(rj.lqeggnwhkg lqeggnwhkgVar, Handler handler) {
            super(handler);
            this.f6906iobyxmoadg = lqeggnwhkgVar;
        }

        @Override // android.database.ContentObserver
        public void onChange(boolean z13, Uri uri) {
            this.f6906iobyxmoadg.eablkybsjg(gg.wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    public static final class zoijcleaow implements androidx.lifecycle.agtfadlqog {

        /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
        final /* synthetic */ View f6907cqumvgiudr;

        /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
        final /* synthetic */ kotlin.jvm.internal.hkdspvbjdz f6908iwizpuwonk;

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        final /* synthetic */ androidx.compose.runtime.n f6909jyumaefscl;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        final /* synthetic */ androidx.compose.runtime.fyldjkxazc f6910yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final /* synthetic */ pj.cllcsxoeiz f6911zdlpuopuiu;

        public /* synthetic */ class iobyxmoadg {

            /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
            public static final /* synthetic */ int[] f6912iobyxmoadg;

            static {
                int[] iArr = new int[androidx.lifecycle.gtknphoqwx.iobyxmoadg.values().length];
                try {
                    iArr[androidx.lifecycle.gtknphoqwx.iobyxmoadg.ON_CREATE.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[androidx.lifecycle.gtknphoqwx.iobyxmoadg.ON_START.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[androidx.lifecycle.gtknphoqwx.iobyxmoadg.ON_STOP.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[androidx.lifecycle.gtknphoqwx.iobyxmoadg.ON_DESTROY.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                try {
                    iArr[androidx.lifecycle.gtknphoqwx.iobyxmoadg.ON_PAUSE.ordinal()] = 5;
                } catch (NoSuchFieldError unused5) {
                }
                try {
                    iArr[androidx.lifecycle.gtknphoqwx.iobyxmoadg.ON_RESUME.ordinal()] = 6;
                } catch (NoSuchFieldError unused6) {
                }
                try {
                    iArr[androidx.lifecycle.gtknphoqwx.iobyxmoadg.ON_ANY.ordinal()] = 7;
                } catch (NoSuchFieldError unused7) {
                }
                f6912iobyxmoadg = iArr;
            }
        }

        /* JADX INFO: renamed from: androidx.compose.ui.platform.g0$zoijcleaow$zoijcleaow, reason: collision with other inner class name */
        static final class C0115zoijcleaow extends kotlin.coroutines.jvm.internal.draadjrbmk implements tg.rgvfuqvkyq {

            /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
            final /* synthetic */ androidx.lifecycle.vdvldrhtss f6913cqumvgiudr;

            /* JADX INFO: renamed from: esjtqupxsv, reason: collision with root package name */
            final /* synthetic */ zoijcleaow f6914esjtqupxsv;

            /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
            final /* synthetic */ androidx.compose.runtime.n f6915iwizpuwonk;

            /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
            final /* synthetic */ kotlin.jvm.internal.hkdspvbjdz f6916jyumaefscl;

            /* JADX INFO: renamed from: lereixgezr, reason: collision with root package name */
            final /* synthetic */ View f6917lereixgezr;

            /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
            private /* synthetic */ Object f6918yggfygwlhe;

            /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
            int f6919zdlpuopuiu;

            /* JADX INFO: renamed from: androidx.compose.ui.platform.g0$zoijcleaow$zoijcleaow$iobyxmoadg */
            static final class iobyxmoadg extends kotlin.coroutines.jvm.internal.draadjrbmk implements tg.rgvfuqvkyq {

                /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
                final /* synthetic */ eslsurpljm f6920jyumaefscl;

                /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
                final /* synthetic */ sj.wypolnanlu f6921yggfygwlhe;

                /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
                int f6922zdlpuopuiu;

                /* JADX INFO: renamed from: androidx.compose.ui.platform.g0$zoijcleaow$zoijcleaow$iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
                static final class C0116iobyxmoadg implements sj.nufgyqmvbu {

                    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
                    final /* synthetic */ eslsurpljm f6923zdlpuopuiu;

                    C0116iobyxmoadg(eslsurpljm eslsurpljmVar) {
                        this.f6923zdlpuopuiu = eslsurpljmVar;
                    }

                    @Override // sj.nufgyqmvbu
                    public /* bridge */ /* synthetic */ Object emit(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
                        return zoijcleaow(((Number) obj).floatValue(), gxszxtbevoVar);
                    }

                    public final Object zoijcleaow(float f13, lg.gxszxtbevo gxszxtbevoVar) {
                        this.f6923zdlpuopuiu.zoijcleaow(f13);
                        return gg.wwaezpbzkn.f37140iobyxmoadg;
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                iobyxmoadg(sj.wypolnanlu wypolnanluVar, eslsurpljm eslsurpljmVar, lg.gxszxtbevo gxszxtbevoVar) {
                    super(2, gxszxtbevoVar);
                    this.f6921yggfygwlhe = wypolnanluVar;
                    this.f6920jyumaefscl = eslsurpljmVar;
                }

                @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
                public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
                    return new iobyxmoadg(this.f6921yggfygwlhe, this.f6920jyumaefscl, gxszxtbevoVar);
                }

                @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
                public final Object invokeSuspend(Object obj) {
                    Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
                    int i13 = this.f6922zdlpuopuiu;
                    if (i13 == 0) {
                        gg.zdlpuopuiu.zoijcleaow(obj);
                        sj.wypolnanlu wypolnanluVar = this.f6921yggfygwlhe;
                        C0116iobyxmoadg c0116iobyxmoadg = new C0116iobyxmoadg(this.f6920jyumaefscl);
                        this.f6922zdlpuopuiu = 1;
                        if (wypolnanluVar.collect(c0116iobyxmoadg, this) == objGxszxtbevo) {
                            return objGxszxtbevo;
                        }
                    } else {
                        if (i13 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        gg.zdlpuopuiu.zoijcleaow(obj);
                    }
                    throw new KotlinNothingValueException();
                }

                @Override // tg.rgvfuqvkyq
                public final Object invoke(pj.cllcsxoeiz cllcsxoeizVar, lg.gxszxtbevo gxszxtbevoVar) {
                    return ((iobyxmoadg) create(cllcsxoeizVar, gxszxtbevoVar)).invokeSuspend(gg.wwaezpbzkn.f37140iobyxmoadg);
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0115zoijcleaow(kotlin.jvm.internal.hkdspvbjdz hkdspvbjdzVar, androidx.compose.runtime.n nVar, androidx.lifecycle.vdvldrhtss vdvldrhtssVar, zoijcleaow zoijcleaowVar, View view, lg.gxszxtbevo gxszxtbevoVar) {
                super(2, gxszxtbevoVar);
                this.f6916jyumaefscl = hkdspvbjdzVar;
                this.f6915iwizpuwonk = nVar;
                this.f6913cqumvgiudr = vdvldrhtssVar;
                this.f6914esjtqupxsv = zoijcleaowVar;
                this.f6917lereixgezr = view;
            }

            @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
            public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
                C0115zoijcleaow c0115zoijcleaow = new C0115zoijcleaow(this.f6916jyumaefscl, this.f6915iwizpuwonk, this.f6913cqumvgiudr, this.f6914esjtqupxsv, this.f6917lereixgezr, gxszxtbevoVar);
                c0115zoijcleaow.f6918yggfygwlhe = obj;
                return c0115zoijcleaow;
            }

            /* JADX WARN: Code duplicated, block: B:25:0x006c  */
            /* JADX WARN: Code duplicated, block: B:31:0x0083  */
            @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
            public final Object invokeSuspend(Object obj) throws Throwable {
                pj.auzgnhcxok auzgnhcxokVar;
                pj.auzgnhcxok auzgnhcxokVarWkgbmnqykc;
                Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
                int i13 = this.f6919zdlpuopuiu;
                if (i13 != 0) {
                    if (i13 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    auzgnhcxokVar = (pj.auzgnhcxok) this.f6918yggfygwlhe;
                    try {
                        gg.zdlpuopuiu.zoijcleaow(obj);
                        if (auzgnhcxokVar != null) {
                            pj.auzgnhcxok.iobyxmoadg.iobyxmoadg(auzgnhcxokVar, null, 1, null);
                        }
                        this.f6913cqumvgiudr.getLifecycle().wkgbmnqykc(this.f6914esjtqupxsv);
                        return gg.wwaezpbzkn.f37140iobyxmoadg;
                    } catch (Throwable th2) {
                        th = th2;
                        if (auzgnhcxokVar != null) {
                            pj.auzgnhcxok.iobyxmoadg.iobyxmoadg(auzgnhcxokVar, null, 1, null);
                        }
                        this.f6913cqumvgiudr.getLifecycle().wkgbmnqykc(this.f6914esjtqupxsv);
                        throw th;
                    }
                }
                gg.zdlpuopuiu.zoijcleaow(obj);
                pj.cllcsxoeiz cllcsxoeizVar = (pj.cllcsxoeiz) this.f6918yggfygwlhe;
                try {
                    eslsurpljm eslsurpljmVar = (eslsurpljm) this.f6916jyumaefscl.f60015zdlpuopuiu;
                    if (eslsurpljmVar != null) {
                        sj.wypolnanlu wypolnanluVarEablkybsjg = g0.eablkybsjg(this.f6917lereixgezr.getContext().getApplicationContext());
                        eslsurpljmVar.zoijcleaow(((Number) wypolnanluVarEablkybsjg.getValue()).floatValue());
                        auzgnhcxokVarWkgbmnqykc = pj.gtknphoqwx.wkgbmnqykc(cllcsxoeizVar, null, null, new iobyxmoadg(wypolnanluVarEablkybsjg, eslsurpljmVar, null), 3, null);
                    } else {
                        auzgnhcxokVarWkgbmnqykc = null;
                    }
                    try {
                        androidx.compose.runtime.n nVar = this.f6915iwizpuwonk;
                        this.f6918yggfygwlhe = auzgnhcxokVarWkgbmnqykc;
                        this.f6919zdlpuopuiu = 1;
                        if (nVar.ixidwrxhsl(this) == objGxszxtbevo) {
                            return objGxszxtbevo;
                        }
                        auzgnhcxokVar = auzgnhcxokVarWkgbmnqykc;
                        if (auzgnhcxokVar != null) {
                            pj.auzgnhcxok.iobyxmoadg.iobyxmoadg(auzgnhcxokVar, null, 1, null);
                        }
                        this.f6913cqumvgiudr.getLifecycle().wkgbmnqykc(this.f6914esjtqupxsv);
                        return gg.wwaezpbzkn.f37140iobyxmoadg;
                    } catch (Throwable th3) {
                        auzgnhcxokVar = auzgnhcxokVarWkgbmnqykc;
                        th = th3;
                        if (auzgnhcxokVar != null) {
                            pj.auzgnhcxok.iobyxmoadg.iobyxmoadg(auzgnhcxokVar, null, 1, null);
                        }
                        this.f6913cqumvgiudr.getLifecycle().wkgbmnqykc(this.f6914esjtqupxsv);
                        throw th;
                    }
                } catch (Throwable th4) {
                    th = th4;
                    auzgnhcxokVar = null;
                }
            }

            @Override // tg.rgvfuqvkyq
            public final Object invoke(pj.cllcsxoeiz cllcsxoeizVar, lg.gxszxtbevo gxszxtbevoVar) {
                return ((C0115zoijcleaow) create(cllcsxoeizVar, gxszxtbevoVar)).invokeSuspend(gg.wwaezpbzkn.f37140iobyxmoadg);
            }
        }

        zoijcleaow(pj.cllcsxoeiz cllcsxoeizVar, androidx.compose.runtime.fyldjkxazc fyldjkxazcVar, androidx.compose.runtime.n nVar, kotlin.jvm.internal.hkdspvbjdz hkdspvbjdzVar, View view) {
            this.f6911zdlpuopuiu = cllcsxoeizVar;
            this.f6910yggfygwlhe = fyldjkxazcVar;
            this.f6909jyumaefscl = nVar;
            this.f6908iwizpuwonk = hkdspvbjdzVar;
            this.f6907cqumvgiudr = view;
        }

        @Override // androidx.lifecycle.agtfadlqog
        public void nufgyqmvbu(androidx.lifecycle.vdvldrhtss vdvldrhtssVar, androidx.lifecycle.gtknphoqwx.iobyxmoadg iobyxmoadgVar) {
            switch (iobyxmoadg.f6912iobyxmoadg[iobyxmoadgVar.ordinal()]) {
                case 1:
                    pj.gtknphoqwx.wkgbmnqykc(this.f6911zdlpuopuiu, null, pj.wypolnanlu.UNDISPATCHED, new C0115zoijcleaow(this.f6908iwizpuwonk, this.f6909jyumaefscl, vdvldrhtssVar, this, this.f6907cqumvgiudr, null), 1, null);
                    return;
                case 2:
                    androidx.compose.runtime.fyldjkxazc fyldjkxazcVar = this.f6910yggfygwlhe;
                    if (fyldjkxazcVar != null) {
                        fyldjkxazcVar.ppxfxbqfkf();
                    }
                    this.f6909jyumaefscl.mhtqkkgtqm();
                    return;
                case 3:
                    this.f6909jyumaefscl.tbqsvytpvh();
                    return;
                case 4:
                    this.f6909jyumaefscl.metgxyhuhe();
                    return;
                case 5:
                case 6:
                case 7:
                    return;
                default:
                    throw new NoWhenBranchMatchedException();
            }
        }
    }

    public static final void dxjokdxxww(View view, androidx.compose.runtime.cqumvgiudr cqumvgiudrVar) {
        view.setTag(a.gtknphoqwx.androidx_compose_ui_view_composition_context, cqumvgiudrVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final sj.wypolnanlu eablkybsjg(Context context) {
        sj.wypolnanlu wypolnanluVar;
        Map map = f6895iobyxmoadg;
        synchronized (map) {
            try {
                Object objRibwqtqdhb = map.get(context);
                if (objRibwqtqdhb == null) {
                    ContentResolver contentResolver = context.getContentResolver();
                    Uri uriFor = Settings.Global.getUriFor("animator_duration_scale");
                    rj.lqeggnwhkg lqeggnwhkgVarZoijcleaow = rj.btonecajqb.zoijcleaow(-1, null, null, 6, null);
                    objRibwqtqdhb = sj.dxjokdxxww.ribwqtqdhb(sj.dxjokdxxww.wwaezpbzkn(new ppxfxbqfkf(contentResolver, uriFor, new wkgbmnqykc(lqeggnwhkgVarZoijcleaow, q1.lqeggnwhkg.iobyxmoadg(Looper.getMainLooper())), lqeggnwhkgVarZoijcleaow, context, null)), pj.dsvhmnatus.zoijcleaow(), sj.jpowsppfya.iobyxmoadg.zoijcleaow(sj.jpowsppfya.f106926iobyxmoadg, 0L, 0L, 3, null), Float.valueOf(Settings.Global.getFloat(context.getContentResolver(), "animator_duration_scale", 1.0f)));
                    map.put(context, objRibwqtqdhb);
                }
                wypolnanluVar = (sj.wypolnanlu) objRibwqtqdhb;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return wypolnanluVar;
    }

    public static final androidx.compose.runtime.cqumvgiudr gxszxtbevo(View view) {
        Object tag = view.getTag(a.gtknphoqwx.androidx_compose_ui_view_composition_context);
        if (tag instanceof androidx.compose.runtime.cqumvgiudr) {
            return (androidx.compose.runtime.cqumvgiudr) tag;
        }
        return null;
    }

    private static final View lqeggnwhkg(View view) {
        Object parent = view.getParent();
        while (parent instanceof View) {
            View view2 = (View) parent;
            if (view2.getId() == 16908290) {
                return view;
            }
            parent = view2.getParent();
            view = view2;
        }
        return view;
    }

    public static final androidx.compose.runtime.n nufgyqmvbu(View view) {
        if (!view.isAttachedToWindow()) {
            w.iobyxmoadg.zoijcleaow("Cannot locate windowRecomposer; View " + view + " is not attached to a window");
        }
        View viewLqeggnwhkg = lqeggnwhkg(view);
        androidx.compose.runtime.cqumvgiudr cqumvgiudrVarGxszxtbevo = gxszxtbevo(viewLqeggnwhkg);
        if (cqumvgiudrVarGxszxtbevo == null) {
            return f0.f6881iobyxmoadg.iobyxmoadg(viewLqeggnwhkg);
        }
        if (cqumvgiudrVarGxszxtbevo instanceof androidx.compose.runtime.n) {
            return (androidx.compose.runtime.n) cqumvgiudrVarGxszxtbevo;
        }
        throw new IllegalStateException("root viewTreeParentCompositionContext is not a Recomposer");
    }

    public static /* synthetic */ androidx.compose.runtime.n ppxfxbqfkf(View view, lg.btonecajqb btonecajqbVar, androidx.lifecycle.gtknphoqwx gtknphoqwxVar, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            btonecajqbVar = lg.gtknphoqwx.f62507zdlpuopuiu;
        }
        if ((i13 & 2) != 0) {
            gtknphoqwxVar = null;
        }
        return zoijcleaow(view, btonecajqbVar, gtknphoqwxVar);
    }

    public static final androidx.compose.runtime.cqumvgiudr wkgbmnqykc(View view) {
        androidx.compose.runtime.cqumvgiudr cqumvgiudrVarGxszxtbevo = gxszxtbevo(view);
        if (cqumvgiudrVarGxszxtbevo != null) {
            return cqumvgiudrVarGxszxtbevo;
        }
        Object parent = view.getParent();
        while (cqumvgiudrVarGxszxtbevo == null && (parent instanceof View)) {
            View view2 = (View) parent;
            cqumvgiudrVarGxszxtbevo = gxszxtbevo(view2);
            parent = view2.getParent();
        }
        return cqumvgiudrVarGxszxtbevo;
    }

    public static final androidx.compose.runtime.n zoijcleaow(View view, lg.btonecajqb btonecajqbVar, androidx.lifecycle.gtknphoqwx gtknphoqwxVar) {
        androidx.compose.runtime.fyldjkxazc fyldjkxazcVar;
        if (btonecajqbVar.get(lg.lqeggnwhkg.f62508dxjokdxxww) == null || btonecajqbVar.get(androidx.compose.runtime.opjhrmiecq.f5815ppxfxbqfkf) == null) {
            btonecajqbVar = dsvhmnatus.f6850yadqdtsiqt.iobyxmoadg().plus(btonecajqbVar);
        }
        androidx.compose.runtime.opjhrmiecq opjhrmiecqVar = (androidx.compose.runtime.opjhrmiecq) btonecajqbVar.get(androidx.compose.runtime.opjhrmiecq.f5815ppxfxbqfkf);
        if (opjhrmiecqVar != null) {
            androidx.compose.runtime.fyldjkxazc fyldjkxazcVar2 = new androidx.compose.runtime.fyldjkxazc(opjhrmiecqVar);
            fyldjkxazcVar2.zoijcleaow();
            fyldjkxazcVar = fyldjkxazcVar2;
        } else {
            fyldjkxazcVar = null;
        }
        kotlin.jvm.internal.hkdspvbjdz hkdspvbjdzVar = new kotlin.jvm.internal.hkdspvbjdz();
        lg.btonecajqb eslsurpljmVar = (a.btonecajqb) btonecajqbVar.get(a.btonecajqb.f14iobyxmoadg);
        if (eslsurpljmVar == null) {
            eslsurpljmVar = new eslsurpljm();
            hkdspvbjdzVar.f60015zdlpuopuiu = eslsurpljmVar;
        }
        lg.btonecajqb btonecajqbVarPlus = btonecajqbVar.plus(fyldjkxazcVar != null ? fyldjkxazcVar : lg.gtknphoqwx.f62507zdlpuopuiu).plus(eslsurpljmVar);
        androidx.compose.runtime.n nVar = new androidx.compose.runtime.n(btonecajqbVarPlus);
        nVar.tbqsvytpvh();
        pj.cllcsxoeiz cllcsxoeizVarIobyxmoadg = pj.dsvhmnatus.iobyxmoadg(btonecajqbVarPlus);
        if (gtknphoqwxVar == null) {
            androidx.lifecycle.vdvldrhtss vdvldrhtssVarIobyxmoadg = androidx.lifecycle.vipkmwdibw.iobyxmoadg(view);
            gtknphoqwxVar = vdvldrhtssVarIobyxmoadg != null ? vdvldrhtssVarIobyxmoadg.getLifecycle() : null;
        }
        if (gtknphoqwxVar != null) {
            view.addOnAttachStateChangeListener(new iobyxmoadg(view, nVar));
            gtknphoqwxVar.iobyxmoadg(new zoijcleaow(cllcsxoeizVarIobyxmoadg, fyldjkxazcVar, nVar, hkdspvbjdzVar, view));
            return nVar;
        }
        w.iobyxmoadg.ppxfxbqfkf("ViewTreeLifecycleOwner not found from " + view);
        throw new KotlinNothingValueException();
    }
}
