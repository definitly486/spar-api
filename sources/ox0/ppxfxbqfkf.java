package ox0;

import android.content.Context;
import android.content.SharedPreferences;
import gg.wwaezpbzkn;
import gg.zdlpuopuiu;
import gk.eablkybsjg;
import gk.jyumaefscl;
import hg.ikoacuggdj;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Iterator;
import java.util.Set;
import kotlin.coroutines.jvm.internal.draadjrbmk;
import kotlin.jvm.internal.gtknphoqwx;
import kotlin.jvm.internal.mbcevpiqjq;
import rj.agtfadlqog;
import rj.oxmwwwfdhm;
import ru.myspar.proloyalty.components.geo.api.models.City;
import sj.dxjokdxxww;
import sj.wflxmlrfwp;
import tg.rgvfuqvkyq;
import tg.vdvldrhtss;

/* JADX INFO: loaded from: classes5.dex */
public final class ppxfxbqfkf implements j01.zoijcleaow, j01.iobyxmoadg {

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    public static final iobyxmoadg f75023wkgbmnqykc = new iobyxmoadg(null);

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final Context f75024iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final SharedPreferences f75025ppxfxbqfkf;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final gk.zoijcleaow f75026zoijcleaow;

    public static final class eablkybsjg extends draadjrbmk implements vdvldrhtss {

        /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
        final /* synthetic */ ppxfxbqfkf f75027iwizpuwonk;

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        /* synthetic */ Object f75028jyumaefscl;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        private /* synthetic */ Object f75029yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        int f75030zdlpuopuiu;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public eablkybsjg(lg.gxszxtbevo gxszxtbevoVar, ppxfxbqfkf ppxfxbqfkfVar) {
            super(3, gxszxtbevoVar);
            this.f75027iwizpuwonk = ppxfxbqfkfVar;
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
            int i13 = this.f75030zdlpuopuiu;
            if (i13 == 0) {
                zdlpuopuiu.zoijcleaow(obj);
                sj.nufgyqmvbu nufgyqmvbuVar = (sj.nufgyqmvbu) this.f75029yggfygwlhe;
                sj.lqeggnwhkg lqeggnwhkgVarPkzmftpjix = dxjokdxxww.pkzmftpjix(this.f75027iwizpuwonk.vdvldrhtss());
                this.f75030zdlpuopuiu = 1;
                if (dxjokdxxww.iwizpuwonk(nufgyqmvbuVar, lqeggnwhkgVarPkzmftpjix, this) == objGxszxtbevo) {
                    return objGxszxtbevo;
                }
            } else {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                zdlpuopuiu.zoijcleaow(obj);
            }
            return wwaezpbzkn.f37140iobyxmoadg;
        }

        @Override // tg.vdvldrhtss
        /* JADX INFO: renamed from: ojitshcjhn, reason: merged with bridge method [inline-methods] */
        public final Object invoke(sj.nufgyqmvbu nufgyqmvbuVar, Object obj, lg.gxszxtbevo gxszxtbevoVar) {
            eablkybsjg eablkybsjgVar = new eablkybsjg(gxszxtbevoVar, this.f75027iwizpuwonk);
            eablkybsjgVar.f75029yggfygwlhe = nufgyqmvbuVar;
            eablkybsjgVar.f75028jyumaefscl = obj;
            return eablkybsjgVar.invokeSuspend(wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    static final class gxszxtbevo extends draadjrbmk implements rgvfuqvkyq {

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        private /* synthetic */ Object f75031yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        int f75032zdlpuopuiu;

        gxszxtbevo(lg.gxszxtbevo gxszxtbevoVar) {
            super(2, gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
            gxszxtbevo gxszxtbevoVar2 = new gxszxtbevo(gxszxtbevoVar);
            gxszxtbevoVar2.f75031yggfygwlhe = obj;
            return gxszxtbevoVar2;
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
            int i13 = this.f75032zdlpuopuiu;
            if (i13 == 0) {
                zdlpuopuiu.zoijcleaow(obj);
                sj.nufgyqmvbu nufgyqmvbuVar = (sj.nufgyqmvbu) this.f75031yggfygwlhe;
                wwaezpbzkn wwaezpbzknVar = wwaezpbzkn.f37140iobyxmoadg;
                this.f75032zdlpuopuiu = 1;
                if (nufgyqmvbuVar.emit(wwaezpbzknVar, this) == objGxszxtbevo) {
                    return objGxszxtbevo;
                }
            } else {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                zdlpuopuiu.zoijcleaow(obj);
            }
            return wwaezpbzkn.f37140iobyxmoadg;
        }

        @Override // tg.rgvfuqvkyq
        /* JADX INFO: renamed from: ojitshcjhn, reason: merged with bridge method [inline-methods] */
        public final Object invoke(sj.nufgyqmvbu nufgyqmvbuVar, lg.gxszxtbevo gxszxtbevoVar) {
            return ((gxszxtbevo) create(nufgyqmvbuVar, gxszxtbevoVar)).invokeSuspend(wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    public static final class iobyxmoadg {
        public /* synthetic */ iobyxmoadg(gtknphoqwx gtknphoqwxVar) {
            this();
        }

        private iobyxmoadg() {
        }
    }

    public static final class lqeggnwhkg implements sj.lqeggnwhkg {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final /* synthetic */ sj.lqeggnwhkg f75033zdlpuopuiu;

        public static final class iobyxmoadg implements sj.nufgyqmvbu {

            /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
            final /* synthetic */ sj.nufgyqmvbu f75034zdlpuopuiu;

            /* JADX INFO: renamed from: ox0.ppxfxbqfkf$lqeggnwhkg$iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
            public static final class C1634iobyxmoadg extends kotlin.coroutines.jvm.internal.wkgbmnqykc {

                /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
                int f75036yggfygwlhe;

                /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
                /* synthetic */ Object f75037zdlpuopuiu;

                public C1634iobyxmoadg(lg.gxszxtbevo gxszxtbevoVar) {
                    super(gxszxtbevoVar);
                }

                @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
                public final Object invokeSuspend(Object obj) {
                    this.f75037zdlpuopuiu = obj;
                    this.f75036yggfygwlhe |= Integer.MIN_VALUE;
                    return iobyxmoadg.this.emit(null, this);
                }
            }

            public iobyxmoadg(sj.nufgyqmvbu nufgyqmvbuVar) {
                this.f75034zdlpuopuiu = nufgyqmvbuVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // sj.nufgyqmvbu
            public final Object emit(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
                C1634iobyxmoadg c1634iobyxmoadg;
                Object next;
                if (gxszxtbevoVar instanceof C1634iobyxmoadg) {
                    c1634iobyxmoadg = (C1634iobyxmoadg) gxszxtbevoVar;
                    int i13 = c1634iobyxmoadg.f75036yggfygwlhe;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        c1634iobyxmoadg.f75036yggfygwlhe = i13 - Integer.MIN_VALUE;
                    } else {
                        c1634iobyxmoadg = new C1634iobyxmoadg(gxszxtbevoVar);
                    }
                } else {
                    c1634iobyxmoadg = new C1634iobyxmoadg(gxszxtbevoVar);
                }
                Object obj2 = c1634iobyxmoadg.f75037zdlpuopuiu;
                Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
                int i14 = c1634iobyxmoadg.f75036yggfygwlhe;
                if (i14 == 0) {
                    zdlpuopuiu.zoijcleaow(obj2);
                    sj.nufgyqmvbu nufgyqmvbuVar = this.f75034zdlpuopuiu;
                    String str = (String) obj;
                    Iterator<E> it = oz0.iobyxmoadg.lqeggnwhkg().iterator();
                    do {
                        if (!it.hasNext()) {
                            next = null;
                            break;
                        }
                        next = it.next();
                    } while (!kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(((oz0.iobyxmoadg) next).name(), str));
                    oz0.iobyxmoadg iobyxmoadgVarIobyxmoadg = (oz0.iobyxmoadg) next;
                    if (iobyxmoadgVarIobyxmoadg == null) {
                        iobyxmoadgVarIobyxmoadg = oz0.iobyxmoadg.f75177zdlpuopuiu.iobyxmoadg();
                    }
                    c1634iobyxmoadg.f75036yggfygwlhe = 1;
                    if (nufgyqmvbuVar.emit(iobyxmoadgVarIobyxmoadg, c1634iobyxmoadg) == objGxszxtbevo) {
                        return objGxszxtbevo;
                    }
                } else {
                    if (i14 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    zdlpuopuiu.zoijcleaow(obj2);
                }
                return wwaezpbzkn.f37140iobyxmoadg;
            }
        }

        public lqeggnwhkg(sj.lqeggnwhkg lqeggnwhkgVar) {
            this.f75033zdlpuopuiu = lqeggnwhkgVar;
        }

        @Override // sj.lqeggnwhkg
        public Object collect(sj.nufgyqmvbu nufgyqmvbuVar, lg.gxszxtbevo gxszxtbevoVar) {
            Object objCollect = this.f75033zdlpuopuiu.collect(new iobyxmoadg(nufgyqmvbuVar), gxszxtbevoVar);
            return objCollect == mg.zoijcleaow.gxszxtbevo() ? objCollect : wwaezpbzkn.f37140iobyxmoadg;
        }
    }

    public static final class nufgyqmvbu extends draadjrbmk implements rgvfuqvkyq {

        /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
        final /* synthetic */ Object f75038cqumvgiudr;

        /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
        final /* synthetic */ String f75039iwizpuwonk;

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        final /* synthetic */ SharedPreferences f75040jyumaefscl;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        private /* synthetic */ Object f75041yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        int f75042zdlpuopuiu;

        public static final class iobyxmoadg implements SharedPreferences.OnSharedPreferenceChangeListener {

            /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
            final /* synthetic */ rj.zdlpuopuiu f75043iobyxmoadg;

            /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
            final /* synthetic */ SharedPreferences f75044ppxfxbqfkf;

            /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
            final /* synthetic */ Object f75045wkgbmnqykc;

            /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
            final /* synthetic */ String f75046zoijcleaow;

            public iobyxmoadg(String str, rj.zdlpuopuiu zdlpuopuiuVar, SharedPreferences sharedPreferences, Object obj) {
                this.f75046zoijcleaow = str;
                this.f75044ppxfxbqfkf = sharedPreferences;
                this.f75045wkgbmnqykc = obj;
                this.f75043iobyxmoadg = zdlpuopuiuVar;
            }

            @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
            public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str) {
                String string;
                if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f75046zoijcleaow, str)) {
                    rj.zdlpuopuiu zdlpuopuiuVar = this.f75043iobyxmoadg;
                    SharedPreferences sharedPreferences2 = this.f75044ppxfxbqfkf;
                    String str2 = this.f75046zoijcleaow;
                    Object obj = this.f75045wkgbmnqykc;
                    if (obj instanceof String) {
                        string = sharedPreferences2.getString(str2, (String) obj);
                        if (string == null) {
                            throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
                        }
                    } else if (obj instanceof Integer) {
                        string = (String) Integer.valueOf(sharedPreferences2.getInt(str2, ((Number) obj).intValue()));
                    } else if (obj instanceof Long) {
                        string = (String) Long.valueOf(sharedPreferences2.getLong(str2, ((Number) obj).longValue()));
                    } else if (obj instanceof Boolean) {
                        string = (String) Boolean.valueOf(sharedPreferences2.getBoolean(str2, ((Boolean) obj).booleanValue()));
                    } else if (obj instanceof Float) {
                        string = (String) Float.valueOf(sharedPreferences2.getFloat(str2, ((Number) obj).floatValue()));
                    } else if (obj instanceof Set) {
                        kotlin.jvm.internal.zdlpuopuiu.nufgyqmvbu(obj, "null cannot be cast to non-null type kotlin.collections.Set<kotlin.String>");
                        Object stringSet = sharedPreferences2.getStringSet(str2, (Set) obj);
                        if (stringSet == null) {
                            throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
                        }
                        string = (String) stringSet;
                    } else {
                        if (!mbcevpiqjq.wflxmlrfwp(obj)) {
                            throw new IllegalArgumentException("generic type not handle " + String.class.getName());
                        }
                        kotlin.jvm.internal.zdlpuopuiu.nufgyqmvbu(obj, "null cannot be cast to non-null type kotlin.collections.MutableSet<kotlin.String>");
                        Object stringSet2 = sharedPreferences2.getStringSet(str2, mbcevpiqjq.wkgbmnqykc(obj));
                        if (stringSet2 == null) {
                            throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
                        }
                        string = (String) stringSet2;
                    }
                    agtfadlqog.zoijcleaow(zdlpuopuiuVar, string);
                }
            }
        }

        public static final class zoijcleaow implements tg.iobyxmoadg {

            /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
            final /* synthetic */ SharedPreferences.OnSharedPreferenceChangeListener f75047yggfygwlhe;

            /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
            final /* synthetic */ SharedPreferences f75048zdlpuopuiu;

            public zoijcleaow(SharedPreferences sharedPreferences, SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener) {
                this.f75048zdlpuopuiu = sharedPreferences;
                this.f75047yggfygwlhe = onSharedPreferenceChangeListener;
            }

            @Override // tg.iobyxmoadg
            public /* bridge */ /* synthetic */ Object invoke() {
                iobyxmoadg();
                return wwaezpbzkn.f37140iobyxmoadg;
            }

            public final void iobyxmoadg() {
                this.f75048zdlpuopuiu.unregisterOnSharedPreferenceChangeListener(this.f75047yggfygwlhe);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public nufgyqmvbu(SharedPreferences sharedPreferences, String str, Object obj, lg.gxszxtbevo gxszxtbevoVar) {
            super(2, gxszxtbevoVar);
            this.f75040jyumaefscl = sharedPreferences;
            this.f75039iwizpuwonk = str;
            this.f75038cqumvgiudr = obj;
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
            nufgyqmvbu nufgyqmvbuVar = new nufgyqmvbu(this.f75040jyumaefscl, this.f75039iwizpuwonk, this.f75038cqumvgiudr, gxszxtbevoVar);
            nufgyqmvbuVar.f75041yggfygwlhe = obj;
            return nufgyqmvbuVar;
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            String string;
            Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
            int i13 = this.f75042zdlpuopuiu;
            if (i13 == 0) {
                zdlpuopuiu.zoijcleaow(obj);
                rj.zdlpuopuiu zdlpuopuiuVar = (rj.zdlpuopuiu) this.f75041yggfygwlhe;
                iobyxmoadg iobyxmoadgVar = new iobyxmoadg(this.f75039iwizpuwonk, zdlpuopuiuVar, this.f75040jyumaefscl, this.f75038cqumvgiudr);
                this.f75040jyumaefscl.registerOnSharedPreferenceChangeListener(iobyxmoadgVar);
                SharedPreferences sharedPreferences = this.f75040jyumaefscl;
                String str = this.f75039iwizpuwonk;
                Object obj2 = this.f75038cqumvgiudr;
                if (obj2 instanceof String) {
                    string = sharedPreferences.getString(str, (String) obj2);
                    if (string == null) {
                        throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
                    }
                } else if (obj2 instanceof Integer) {
                    string = (String) kotlin.coroutines.jvm.internal.zoijcleaow.wkgbmnqykc(sharedPreferences.getInt(str, ((Number) obj2).intValue()));
                } else if (obj2 instanceof Long) {
                    string = (String) kotlin.coroutines.jvm.internal.zoijcleaow.eablkybsjg(sharedPreferences.getLong(str, ((Number) obj2).longValue()));
                } else if (obj2 instanceof Boolean) {
                    string = (String) kotlin.coroutines.jvm.internal.zoijcleaow.iobyxmoadg(sharedPreferences.getBoolean(str, ((Boolean) obj2).booleanValue()));
                } else if (obj2 instanceof Float) {
                    string = (String) kotlin.coroutines.jvm.internal.zoijcleaow.ppxfxbqfkf(sharedPreferences.getFloat(str, ((Number) obj2).floatValue()));
                } else if (obj2 instanceof Set) {
                    kotlin.jvm.internal.zdlpuopuiu.nufgyqmvbu(obj2, "null cannot be cast to non-null type kotlin.collections.Set<kotlin.String>");
                    Object stringSet = sharedPreferences.getStringSet(str, (Set) obj2);
                    if (stringSet == null) {
                        throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
                    }
                    string = (String) stringSet;
                } else {
                    if (!mbcevpiqjq.wflxmlrfwp(obj2)) {
                        throw new IllegalArgumentException("generic type not handle " + String.class.getName());
                    }
                    kotlin.jvm.internal.zdlpuopuiu.nufgyqmvbu(obj2, "null cannot be cast to non-null type kotlin.collections.MutableSet<kotlin.String>");
                    Object stringSet2 = sharedPreferences.getStringSet(str, mbcevpiqjq.wkgbmnqykc(obj2));
                    if (stringSet2 == null) {
                        throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
                    }
                    string = (String) stringSet2;
                }
                zdlpuopuiuVar.eablkybsjg(string);
                zoijcleaow zoijcleaowVar = new zoijcleaow(this.f75040jyumaefscl, iobyxmoadgVar);
                this.f75042zdlpuopuiu = 1;
                if (oxmwwwfdhm.iobyxmoadg(zdlpuopuiuVar, zoijcleaowVar, this) == objGxszxtbevo) {
                    return objGxszxtbevo;
                }
            } else {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                zdlpuopuiu.zoijcleaow(obj);
            }
            return wwaezpbzkn.f37140iobyxmoadg;
        }

        @Override // tg.rgvfuqvkyq
        /* JADX INFO: renamed from: ojitshcjhn, reason: merged with bridge method [inline-methods] */
        public final Object invoke(rj.zdlpuopuiu zdlpuopuiuVar, lg.gxszxtbevo gxszxtbevoVar) {
            return ((nufgyqmvbu) create(zdlpuopuiuVar, gxszxtbevoVar)).invokeSuspend(wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    /* JADX INFO: renamed from: ox0.ppxfxbqfkf$ppxfxbqfkf, reason: collision with other inner class name */
    public static final class C1635ppxfxbqfkf extends draadjrbmk implements vdvldrhtss {

        /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
        final /* synthetic */ ppxfxbqfkf f75049iwizpuwonk;

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        /* synthetic */ Object f75050jyumaefscl;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        private /* synthetic */ Object f75051yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        int f75052zdlpuopuiu;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C1635ppxfxbqfkf(lg.gxszxtbevo gxszxtbevoVar, ppxfxbqfkf ppxfxbqfkfVar) {
            super(3, gxszxtbevoVar);
            this.f75049iwizpuwonk = ppxfxbqfkfVar;
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            sj.lqeggnwhkg lqeggnwhkgVarHcddaimhww;
            Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
            int i13 = this.f75052zdlpuopuiu;
            if (i13 == 0) {
                zdlpuopuiu.zoijcleaow(obj);
                sj.nufgyqmvbu nufgyqmvbuVar = (sj.nufgyqmvbu) this.f75051yggfygwlhe;
                City cityVdvldrhtss = this.f75049iwizpuwonk.vdvldrhtss();
                if (cityVdvldrhtss == null || (lqeggnwhkgVarHcddaimhww = dxjokdxxww.pkzmftpjix(cityVdvldrhtss)) == null) {
                    lqeggnwhkgVarHcddaimhww = dxjokdxxww.hcddaimhww(new City[0]);
                }
                this.f75052zdlpuopuiu = 1;
                if (dxjokdxxww.iwizpuwonk(nufgyqmvbuVar, lqeggnwhkgVarHcddaimhww, this) == objGxszxtbevo) {
                    return objGxszxtbevo;
                }
            } else {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                zdlpuopuiu.zoijcleaow(obj);
            }
            return wwaezpbzkn.f37140iobyxmoadg;
        }

        @Override // tg.vdvldrhtss
        /* JADX INFO: renamed from: ojitshcjhn, reason: merged with bridge method [inline-methods] */
        public final Object invoke(sj.nufgyqmvbu nufgyqmvbuVar, Object obj, lg.gxszxtbevo gxszxtbevoVar) {
            C1635ppxfxbqfkf c1635ppxfxbqfkf = new C1635ppxfxbqfkf(gxszxtbevoVar, this.f75049iwizpuwonk);
            c1635ppxfxbqfkf.f75051yggfygwlhe = nufgyqmvbuVar;
            c1635ppxfxbqfkf.f75050jyumaefscl = obj;
            return c1635ppxfxbqfkf.invokeSuspend(wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    static final class wkgbmnqykc extends draadjrbmk implements rgvfuqvkyq {

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        private /* synthetic */ Object f75053yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        int f75054zdlpuopuiu;

        wkgbmnqykc(lg.gxszxtbevo gxszxtbevoVar) {
            super(2, gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
            wkgbmnqykc wkgbmnqykcVar = new wkgbmnqykc(gxszxtbevoVar);
            wkgbmnqykcVar.f75053yggfygwlhe = obj;
            return wkgbmnqykcVar;
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
            int i13 = this.f75054zdlpuopuiu;
            if (i13 == 0) {
                zdlpuopuiu.zoijcleaow(obj);
                sj.nufgyqmvbu nufgyqmvbuVar = (sj.nufgyqmvbu) this.f75053yggfygwlhe;
                wwaezpbzkn wwaezpbzknVar = wwaezpbzkn.f37140iobyxmoadg;
                this.f75054zdlpuopuiu = 1;
                if (nufgyqmvbuVar.emit(wwaezpbzknVar, this) == objGxszxtbevo) {
                    return objGxszxtbevo;
                }
            } else {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                zdlpuopuiu.zoijcleaow(obj);
            }
            return wwaezpbzkn.f37140iobyxmoadg;
        }

        @Override // tg.rgvfuqvkyq
        /* JADX INFO: renamed from: ojitshcjhn, reason: merged with bridge method [inline-methods] */
        public final Object invoke(sj.nufgyqmvbu nufgyqmvbuVar, lg.gxszxtbevo gxszxtbevoVar) {
            return ((wkgbmnqykc) create(nufgyqmvbuVar, gxszxtbevoVar)).invokeSuspend(wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    public static final class zoijcleaow extends draadjrbmk implements rgvfuqvkyq {

        /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
        final /* synthetic */ Object f75055cqumvgiudr;

        /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
        final /* synthetic */ String f75056iwizpuwonk;

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        final /* synthetic */ SharedPreferences f75057jyumaefscl;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        private /* synthetic */ Object f75058yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        int f75059zdlpuopuiu;

        public static final class iobyxmoadg implements SharedPreferences.OnSharedPreferenceChangeListener {

            /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
            final /* synthetic */ rj.zdlpuopuiu f75060iobyxmoadg;

            /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
            final /* synthetic */ SharedPreferences f75061ppxfxbqfkf;

            /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
            final /* synthetic */ Object f75062wkgbmnqykc;

            /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
            final /* synthetic */ String f75063zoijcleaow;

            public iobyxmoadg(String str, rj.zdlpuopuiu zdlpuopuiuVar, SharedPreferences sharedPreferences, Object obj) {
                this.f75063zoijcleaow = str;
                this.f75061ppxfxbqfkf = sharedPreferences;
                this.f75062wkgbmnqykc = obj;
                this.f75060iobyxmoadg = zdlpuopuiuVar;
            }

            @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
            public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str) {
                Boolean boolValueOf;
                if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f75063zoijcleaow, str)) {
                    rj.zdlpuopuiu zdlpuopuiuVar = this.f75060iobyxmoadg;
                    SharedPreferences sharedPreferences2 = this.f75061ppxfxbqfkf;
                    String str2 = this.f75063zoijcleaow;
                    Object obj = this.f75062wkgbmnqykc;
                    if (obj instanceof String) {
                        Object string = sharedPreferences2.getString(str2, (String) obj);
                        if (string == null) {
                            throw new NullPointerException("null cannot be cast to non-null type kotlin.Boolean");
                        }
                        boolValueOf = (Boolean) string;
                    } else if (obj instanceof Integer) {
                        boolValueOf = (Boolean) Integer.valueOf(sharedPreferences2.getInt(str2, ((Number) obj).intValue()));
                    } else if (obj instanceof Long) {
                        boolValueOf = (Boolean) Long.valueOf(sharedPreferences2.getLong(str2, ((Number) obj).longValue()));
                    } else if (obj instanceof Boolean) {
                        boolValueOf = Boolean.valueOf(sharedPreferences2.getBoolean(str2, ((Boolean) obj).booleanValue()));
                    } else if (obj instanceof Float) {
                        boolValueOf = (Boolean) Float.valueOf(sharedPreferences2.getFloat(str2, ((Number) obj).floatValue()));
                    } else if (obj instanceof Set) {
                        kotlin.jvm.internal.zdlpuopuiu.nufgyqmvbu(obj, "null cannot be cast to non-null type kotlin.collections.Set<kotlin.String>");
                        Object stringSet = sharedPreferences2.getStringSet(str2, (Set) obj);
                        if (stringSet == null) {
                            throw new NullPointerException("null cannot be cast to non-null type kotlin.Boolean");
                        }
                        boolValueOf = (Boolean) stringSet;
                    } else {
                        if (!mbcevpiqjq.wflxmlrfwp(obj)) {
                            throw new IllegalArgumentException("generic type not handle " + Boolean.class.getName());
                        }
                        kotlin.jvm.internal.zdlpuopuiu.nufgyqmvbu(obj, "null cannot be cast to non-null type kotlin.collections.MutableSet<kotlin.String>");
                        Object stringSet2 = sharedPreferences2.getStringSet(str2, mbcevpiqjq.wkgbmnqykc(obj));
                        if (stringSet2 == null) {
                            throw new NullPointerException("null cannot be cast to non-null type kotlin.Boolean");
                        }
                        boolValueOf = (Boolean) stringSet2;
                    }
                    agtfadlqog.zoijcleaow(zdlpuopuiuVar, boolValueOf);
                }
            }
        }

        /* JADX INFO: renamed from: ox0.ppxfxbqfkf$zoijcleaow$zoijcleaow, reason: collision with other inner class name */
        public static final class C1636zoijcleaow implements tg.iobyxmoadg {

            /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
            final /* synthetic */ SharedPreferences.OnSharedPreferenceChangeListener f75064yggfygwlhe;

            /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
            final /* synthetic */ SharedPreferences f75065zdlpuopuiu;

            public C1636zoijcleaow(SharedPreferences sharedPreferences, SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener) {
                this.f75065zdlpuopuiu = sharedPreferences;
                this.f75064yggfygwlhe = onSharedPreferenceChangeListener;
            }

            @Override // tg.iobyxmoadg
            public /* bridge */ /* synthetic */ Object invoke() {
                iobyxmoadg();
                return wwaezpbzkn.f37140iobyxmoadg;
            }

            public final void iobyxmoadg() {
                this.f75065zdlpuopuiu.unregisterOnSharedPreferenceChangeListener(this.f75064yggfygwlhe);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public zoijcleaow(SharedPreferences sharedPreferences, String str, Object obj, lg.gxszxtbevo gxszxtbevoVar) {
            super(2, gxszxtbevoVar);
            this.f75057jyumaefscl = sharedPreferences;
            this.f75056iwizpuwonk = str;
            this.f75055cqumvgiudr = obj;
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
            zoijcleaow zoijcleaowVar = new zoijcleaow(this.f75057jyumaefscl, this.f75056iwizpuwonk, this.f75055cqumvgiudr, gxszxtbevoVar);
            zoijcleaowVar.f75058yggfygwlhe = obj;
            return zoijcleaowVar;
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            Boolean boolIobyxmoadg;
            Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
            int i13 = this.f75059zdlpuopuiu;
            if (i13 == 0) {
                zdlpuopuiu.zoijcleaow(obj);
                rj.zdlpuopuiu zdlpuopuiuVar = (rj.zdlpuopuiu) this.f75058yggfygwlhe;
                iobyxmoadg iobyxmoadgVar = new iobyxmoadg(this.f75056iwizpuwonk, zdlpuopuiuVar, this.f75057jyumaefscl, this.f75055cqumvgiudr);
                this.f75057jyumaefscl.registerOnSharedPreferenceChangeListener(iobyxmoadgVar);
                SharedPreferences sharedPreferences = this.f75057jyumaefscl;
                String str = this.f75056iwizpuwonk;
                Object obj2 = this.f75055cqumvgiudr;
                if (obj2 instanceof String) {
                    Object string = sharedPreferences.getString(str, (String) obj2);
                    if (string == null) {
                        throw new NullPointerException("null cannot be cast to non-null type kotlin.Boolean");
                    }
                    boolIobyxmoadg = (Boolean) string;
                } else if (obj2 instanceof Integer) {
                    boolIobyxmoadg = (Boolean) kotlin.coroutines.jvm.internal.zoijcleaow.wkgbmnqykc(sharedPreferences.getInt(str, ((Number) obj2).intValue()));
                } else if (obj2 instanceof Long) {
                    boolIobyxmoadg = (Boolean) kotlin.coroutines.jvm.internal.zoijcleaow.eablkybsjg(sharedPreferences.getLong(str, ((Number) obj2).longValue()));
                } else if (obj2 instanceof Boolean) {
                    boolIobyxmoadg = kotlin.coroutines.jvm.internal.zoijcleaow.iobyxmoadg(sharedPreferences.getBoolean(str, ((Boolean) obj2).booleanValue()));
                } else if (obj2 instanceof Float) {
                    boolIobyxmoadg = (Boolean) kotlin.coroutines.jvm.internal.zoijcleaow.ppxfxbqfkf(sharedPreferences.getFloat(str, ((Number) obj2).floatValue()));
                } else if (obj2 instanceof Set) {
                    kotlin.jvm.internal.zdlpuopuiu.nufgyqmvbu(obj2, "null cannot be cast to non-null type kotlin.collections.Set<kotlin.String>");
                    Object stringSet = sharedPreferences.getStringSet(str, (Set) obj2);
                    if (stringSet == null) {
                        throw new NullPointerException("null cannot be cast to non-null type kotlin.Boolean");
                    }
                    boolIobyxmoadg = (Boolean) stringSet;
                } else {
                    if (!mbcevpiqjq.wflxmlrfwp(obj2)) {
                        throw new IllegalArgumentException("generic type not handle " + Boolean.class.getName());
                    }
                    kotlin.jvm.internal.zdlpuopuiu.nufgyqmvbu(obj2, "null cannot be cast to non-null type kotlin.collections.MutableSet<kotlin.String>");
                    Object stringSet2 = sharedPreferences.getStringSet(str, mbcevpiqjq.wkgbmnqykc(obj2));
                    if (stringSet2 == null) {
                        throw new NullPointerException("null cannot be cast to non-null type kotlin.Boolean");
                    }
                    boolIobyxmoadg = (Boolean) stringSet2;
                }
                zdlpuopuiuVar.eablkybsjg(boolIobyxmoadg);
                C1636zoijcleaow c1636zoijcleaow = new C1636zoijcleaow(this.f75057jyumaefscl, iobyxmoadgVar);
                this.f75059zdlpuopuiu = 1;
                if (oxmwwwfdhm.iobyxmoadg(zdlpuopuiuVar, c1636zoijcleaow, this) == objGxszxtbevo) {
                    return objGxszxtbevo;
                }
            } else {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                zdlpuopuiu.zoijcleaow(obj);
            }
            return wwaezpbzkn.f37140iobyxmoadg;
        }

        @Override // tg.rgvfuqvkyq
        /* JADX INFO: renamed from: ojitshcjhn, reason: merged with bridge method [inline-methods] */
        public final Object invoke(rj.zdlpuopuiu zdlpuopuiuVar, lg.gxszxtbevo gxszxtbevoVar) {
            return ((zoijcleaow) create(zdlpuopuiuVar, gxszxtbevoVar)).invokeSuspend(wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    public ppxfxbqfkf(Context context) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(context, "context");
        this.f75024iobyxmoadg = context;
        this.f75026zoijcleaow = jyumaefscl.zoijcleaow(null, new tg.draadjrbmk() { // from class: ox0.zoijcleaow
            @Override // tg.draadjrbmk
            public final Object invoke(Object obj) {
                return ppxfxbqfkf.jlmebxxoox((eablkybsjg) obj);
            }
        }, 1, null);
        this.f75025ppxfxbqfkf = ulzqkzuiru("network_preferences");
    }

    private final SharedPreferences crxdokpmqz() {
        SharedPreferences sharedPreferencesUlzqkzuiru = ulzqkzuiru("update_preferences");
        kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(sharedPreferencesUlzqkzuiru, "getPreferences(...)");
        return sharedPreferencesUlzqkzuiru;
    }

    private final SharedPreferences eablkybsjg() {
        SharedPreferences sharedPreferencesUlzqkzuiru = ulzqkzuiru("cart_options");
        kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(sharedPreferencesUlzqkzuiru, "getPreferences(...)");
        return sharedPreferencesUlzqkzuiru;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wwaezpbzkn jlmebxxoox(gk.eablkybsjg Json) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(Json, "$this$Json");
        Json.wkgbmnqykc(true);
        Json.eablkybsjg(true);
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    private final SharedPreferences kcexrzcfyt() {
        SharedPreferences sharedPreferencesUlzqkzuiru = ulzqkzuiru("options");
        kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(sharedPreferencesUlzqkzuiru, "getPreferences(...)");
        return sharedPreferencesUlzqkzuiru;
    }

    private final SharedPreferences sopmlzcsov() {
        SharedPreferences sharedPreferencesUlzqkzuiru = ulzqkzuiru("scan_go");
        kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(sharedPreferencesUlzqkzuiru, "getPreferences(...)");
        return sharedPreferencesUlzqkzuiru;
    }

    private final SharedPreferences ulzqkzuiru(String str) {
        return this.f75024iobyxmoadg.getSharedPreferences(str, 0);
    }

    @Override // j01.zoijcleaow
    public oz0.iobyxmoadg agtfadlqog() {
        Object next;
        Iterator<E> it = oz0.iobyxmoadg.lqeggnwhkg().iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(((oz0.iobyxmoadg) next).name(), kcexrzcfyt().getString("dark_mode_token", oz0.iobyxmoadg.f75177zdlpuopuiu.iobyxmoadg().name())));
        oz0.iobyxmoadg iobyxmoadgVar = (oz0.iobyxmoadg) next;
        return iobyxmoadgVar == null ? oz0.iobyxmoadg.f75177zdlpuopuiu.iobyxmoadg() : iobyxmoadgVar;
    }

    @Override // j01.zoijcleaow
    public boolean btonecajqb() {
        return kcexrzcfyt().getBoolean("show_qr", false);
    }

    @Override // j01.zoijcleaow
    public void cdpycssgdh(int i13) {
        SharedPreferences.Editor editorEdit = kcexrzcfyt().edit();
        editorEdit.putInt("show_promo_count", i13);
        editorEdit.apply();
    }

    @Override // j01.zoijcleaow
    public sj.lqeggnwhkg cllcsxoeiz() {
        return new lqeggnwhkg(wflxmlrfwp.zoijcleaow(dxjokdxxww.eablkybsjg(new nufgyqmvbu(kcexrzcfyt(), "dark_mode_token", oz0.iobyxmoadg.f75177zdlpuopuiu.iobyxmoadg().name(), null)), Integer.MAX_VALUE, null, 2, null));
    }

    @Override // j01.zoijcleaow
    public boolean cqumvgiudr() {
        return sopmlzcsov().getBoolean("first_scango_launch", true);
    }

    @Override // j01.zoijcleaow
    public boolean draadjrbmk() {
        return sopmlzcsov().getBoolean("scan_go_amount_product_first_message_viewed", false);
    }

    @Override // j01.zoijcleaow
    public void dsvhmnatus(boolean z13) {
        SharedPreferences.Editor editorEdit = kcexrzcfyt().edit();
        editorEdit.putBoolean("show_qr", z13);
        editorEdit.apply();
    }

    @Override // j01.zoijcleaow
    public void dxjokdxxww(LocalDateTime localDateTime) {
        SharedPreferences.Editor editorEdit = sopmlzcsov().edit();
        editorEdit.putString("scan_go_expires_at", localDateTime != null ? localDateTime.toString() : null);
        editorEdit.apply();
    }

    @Override // j01.zoijcleaow
    public void esjtqupxsv() {
        SharedPreferences.Editor editorEdit = sopmlzcsov().edit();
        editorEdit.putBoolean("first_scango_launch", false);
        editorEdit.apply();
    }

    @Override // j01.zoijcleaow
    public void gtknphoqwx(boolean z13) {
        SharedPreferences.Editor editorEdit = kcexrzcfyt().edit();
        editorEdit.putBoolean("is_order_compound_changed", z13);
        editorEdit.apply();
    }

    @Override // j01.zoijcleaow
    public boolean gxszxtbevo() {
        return crxdokpmqz().getBoolean("ignore_update", false);
    }

    @Override // j01.zoijcleaow
    public void hcddaimhww(LocalDate localDate) {
        SharedPreferences.Editor editorEdit = kcexrzcfyt().edit();
        editorEdit.putString("next_rate_date", localDate != null ? localDate.toString() : null);
        editorEdit.apply();
    }

    @Override // j01.zoijcleaow
    public void hkdspvbjdz(boolean z13) {
        SharedPreferences.Editor editorEdit = eablkybsjg().edit();
        editorEdit.putBoolean("is_products_grid", z13);
        editorEdit.apply();
    }

    @Override // j01.zoijcleaow
    public void iobyxmoadg(boolean z13) {
        SharedPreferences.Editor editorEdit = crxdokpmqz().edit();
        editorEdit.putBoolean("ignore_update", z13);
        editorEdit.apply();
    }

    @Override // j01.zoijcleaow
    public void iozdgvuglv(boolean z13) {
        SharedPreferences.Editor editorEdit = kcexrzcfyt().edit();
        editorEdit.putBoolean("is_cart_compound_changed", z13);
        editorEdit.apply();
    }

    @Override // j01.iobyxmoadg
    public sj.lqeggnwhkg istkbnxepw() {
        return dxjokdxxww.ikoacuggdj(dxjokdxxww.tzroggbefp(jr0.lqeggnwhkg.iobyxmoadg(kcexrzcfyt(), "chosen_city_name"), new wkgbmnqykc(null)), new C1635ppxfxbqfkf(null, this));
    }

    @Override // j01.zoijcleaow
    public LocalDateTime iwizpuwonk() {
        String string = sopmlzcsov().getString("scan_go_expires_at", null);
        if (string != null) {
            return LocalDateTime.parse(string);
        }
        return null;
    }

    @Override // j01.zoijcleaow
    public LocalDateTime jpowsppfya() {
        String string = kcexrzcfyt().getString("next_show_promo_date", null);
        if (string != null) {
            return LocalDateTime.parse(string);
        }
        return null;
    }

    @Override // j01.zoijcleaow
    public void jyumaefscl(LocalDateTime localDateTime) {
        SharedPreferences.Editor editorEdit = kcexrzcfyt().edit();
        editorEdit.putString("next_show_promo_date", localDateTime != null ? localDateTime.toString() : null);
        editorEdit.apply();
    }

    @Override // j01.iobyxmoadg
    public void kegysxyocb(City city) {
        String strZoijcleaow;
        kr0.wkgbmnqykc.f60450iobyxmoadg.zoijcleaow("MOB-7588", "SharedPreferencesRepositoryImpl set chosenCity = " + city, true);
        SharedPreferences.Editor editorEdit = kcexrzcfyt().edit();
        if (city != null) {
            gk.zoijcleaow.iobyxmoadg iobyxmoadgVar = gk.zoijcleaow.f37751wkgbmnqykc;
            iobyxmoadgVar.iobyxmoadg();
            strZoijcleaow = iobyxmoadgVar.zoijcleaow(City.INSTANCE.serializer(), city);
        } else {
            strZoijcleaow = null;
        }
        editorEdit.putString("chosen_city_name", strZoijcleaow);
        editorEdit.apply();
    }

    @Override // j01.zoijcleaow
    public int lereixgezr() {
        return kcexrzcfyt().getInt("show_promo_count", 0);
    }

    @Override // j01.zoijcleaow
    public void lmojexxdyd(String value) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(value, "value");
        SharedPreferences.Editor editorEdit = kcexrzcfyt().edit();
        editorEdit.putString("last_promotion_id", value);
        editorEdit.apply();
    }

    @Override // j01.zoijcleaow
    public void lqeggnwhkg(boolean z13) {
        SharedPreferences.Editor editorEdit = kcexrzcfyt().edit();
        editorEdit.putBoolean("auto_brightness", z13);
        editorEdit.apply();
    }

    @Override // j01.zoijcleaow
    public void mbcevpiqjq(oz0.iobyxmoadg value) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(value, "value");
        SharedPreferences.Editor editorEdit = kcexrzcfyt().edit();
        editorEdit.putString("dark_mode_token", value.name());
        editorEdit.apply();
    }

    @Override // j01.zoijcleaow
    public LocalDate ntlheqmsrt() {
        String string = kcexrzcfyt().getString("next_banner_popup_date", null);
        if (string != null) {
            return LocalDate.parse(string);
        }
        return null;
    }

    @Override // j01.iobyxmoadg
    public sj.lqeggnwhkg nufgyqmvbu() {
        return dxjokdxxww.ikoacuggdj(dxjokdxxww.tzroggbefp(jr0.lqeggnwhkg.iobyxmoadg(kcexrzcfyt(), "chosen_city_name"), new gxszxtbevo(null)), new eablkybsjg(null, this));
    }

    @Override // j01.zoijcleaow
    public void ojitshcjhn(String value) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(value, "value");
        SharedPreferences networkPreferences = this.f75025ppxfxbqfkf;
        kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(networkPreferences, "networkPreferences");
        SharedPreferences.Editor editorEdit = networkPreferences.edit();
        editorEdit.putString("bitrix_version", value);
        editorEdit.commit();
    }

    @Override // j01.zoijcleaow
    public boolean oxmwwwfdhm() {
        return kcexrzcfyt().getBoolean("is_order_compound_changed", false);
    }

    @Override // j01.zoijcleaow
    public void pkzmftpjix() {
        SharedPreferences.Editor editorEdit = sopmlzcsov().edit();
        editorEdit.putBoolean("scan_go_amount_product_first_message_viewed", true);
        editorEdit.apply();
    }

    @Override // j01.zoijcleaow
    public sj.lqeggnwhkg pmvmpeiblj() {
        return wflxmlrfwp.zoijcleaow(dxjokdxxww.eablkybsjg(new zoijcleaow(kcexrzcfyt(), "is_cart_compound_changed", Boolean.FALSE, null)), Integer.MAX_VALUE, null, 2, null);
    }

    @Override // j01.zoijcleaow
    public String ppxfxbqfkf() {
        return uw0.ppxfxbqfkf.f114521iobyxmoadg.mbcevpiqjq();
    }

    @Override // j01.zoijcleaow
    public String rgvfuqvkyq() {
        String string = kcexrzcfyt().getString("last_promotion_id", null);
        return string == null ? "" : string;
    }

    @Override // j01.zoijcleaow
    public Set stevsuqkhv() {
        Set<String> stringSet = kcexrzcfyt().getStringSet("set_of_banner_popup_id", ikoacuggdj.eablkybsjg());
        kotlin.jvm.internal.zdlpuopuiu.nufgyqmvbu(stringSet, "null cannot be cast to non-null type kotlin.collections.Set<kotlin.String>");
        return stringSet;
    }

    @Override // j01.zoijcleaow
    public void tzroggbefp(LocalDate localDate) {
        SharedPreferences.Editor editorEdit = kcexrzcfyt().edit();
        editorEdit.putString("next_banner_popup_date", localDate != null ? localDate.toString() : null);
        editorEdit.apply();
    }

    @Override // j01.iobyxmoadg
    public City vdvldrhtss() {
        City city;
        try {
            String string = kcexrzcfyt().getString("chosen_city_name", null);
            if (string != null) {
                gk.zoijcleaow.iobyxmoadg iobyxmoadgVar = gk.zoijcleaow.f37751wkgbmnqykc;
                iobyxmoadgVar.iobyxmoadg();
                city = (City) iobyxmoadgVar.ppxfxbqfkf(City.INSTANCE.serializer(), string);
            } else {
                city = null;
            }
            kr0.wkgbmnqykc.f60450iobyxmoadg.zoijcleaow("MOB-7588", "SharedPreferencesRepositoryImpl get chosenCity = " + city, true);
            return city;
        } catch (Exception unused) {
            kegysxyocb(null);
            return null;
        }
    }

    @Override // j01.zoijcleaow
    public boolean wflxmlrfwp() {
        return kcexrzcfyt().getBoolean("auto_brightness", false);
    }

    @Override // j01.zoijcleaow
    public boolean wwaezpbzkn() {
        return eablkybsjg().getBoolean("is_products_grid", true);
    }

    @Override // j01.zoijcleaow
    public void wypolnanlu(String value) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(value, "value");
        SharedPreferences.Editor editorEdit = sopmlzcsov().edit();
        editorEdit.putString("scan_go_cart_start_message", value);
        editorEdit.apply();
    }

    @Override // j01.zoijcleaow
    public LocalDate yadqdtsiqt() {
        String string = kcexrzcfyt().getString("next_in_app_review_date", null);
        if (string != null) {
            return LocalDate.parse(string);
        }
        return null;
    }

    @Override // j01.zoijcleaow
    public LocalDate yggfygwlhe() {
        String string = kcexrzcfyt().getString("next_rate_date", null);
        if (string != null) {
            return LocalDate.parse(string);
        }
        return null;
    }

    @Override // j01.zoijcleaow
    public void ylkuphrtab(Set value) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(value, "value");
        SharedPreferences.Editor editorEdit = kcexrzcfyt().edit();
        editorEdit.putStringSet("set_of_banner_popup_id", value);
        editorEdit.apply();
    }

    @Override // j01.zoijcleaow
    public void zdlpuopuiu(LocalDate localDate) {
        SharedPreferences.Editor editorEdit = kcexrzcfyt().edit();
        editorEdit.putString("next_in_app_review_date", localDate != null ? localDate.toString() : null);
        editorEdit.apply();
    }

    @Override // j01.zoijcleaow
    public void zoijcleaow() {
        dxjokdxxww(null);
        SharedPreferences.Editor editorEdit = kcexrzcfyt().edit();
        editorEdit.remove("auth_type");
        editorEdit.apply();
    }

    @Override // j01.zoijcleaow
    public String zynmafqrjb() {
        String string = sopmlzcsov().getString("scan_go_cart_start_message", "");
        return string == null ? "" : string;
    }
}
