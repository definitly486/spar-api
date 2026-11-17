package ty;

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
import ru.myspar.components.geo.api.models.City;
import sj.kegysxyocb;
import sj.zynmafqrjb;
import tg.rgvfuqvkyq;
import tg.vdvldrhtss;

/* JADX INFO: loaded from: classes4.dex */
public final class ppxfxbqfkf implements v10.zoijcleaow, v10.iobyxmoadg {

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    public static final iobyxmoadg f111799wkgbmnqykc = new iobyxmoadg(null);

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final Context f111800iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final SharedPreferences f111801ppxfxbqfkf;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final gk.zoijcleaow f111802zoijcleaow;

    public static final class btonecajqb extends draadjrbmk implements vdvldrhtss {

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        final /* synthetic */ SharedPreferences.OnSharedPreferenceChangeListener f111803jyumaefscl;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        final /* synthetic */ SharedPreferences f111804yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        int f111805zdlpuopuiu;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public btonecajqb(SharedPreferences sharedPreferences, SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener, lg.gxszxtbevo gxszxtbevoVar) {
            super(3, gxszxtbevoVar);
            this.f111804yggfygwlhe = sharedPreferences;
            this.f111803jyumaefscl = onSharedPreferenceChangeListener;
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            mg.zoijcleaow.gxszxtbevo();
            if (this.f111805zdlpuopuiu != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            zdlpuopuiu.zoijcleaow(obj);
            this.f111804yggfygwlhe.unregisterOnSharedPreferenceChangeListener(this.f111803jyumaefscl);
            return wwaezpbzkn.f37140iobyxmoadg;
        }

        @Override // tg.vdvldrhtss
        /* JADX INFO: renamed from: ojitshcjhn, reason: merged with bridge method [inline-methods] */
        public final Object invoke(sj.nufgyqmvbu nufgyqmvbuVar, Throwable th2, lg.gxszxtbevo gxszxtbevoVar) {
            return new btonecajqb(this.f111804yggfygwlhe, this.f111803jyumaefscl, gxszxtbevoVar).invokeSuspend(wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    public static final class dxjokdxxww implements SharedPreferences.OnSharedPreferenceChangeListener {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        final /* synthetic */ String f111806iobyxmoadg;

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        final /* synthetic */ SharedPreferences f111807ppxfxbqfkf;

        /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
        final /* synthetic */ Object f111808wkgbmnqykc;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        final /* synthetic */ zynmafqrjb f111809zoijcleaow;

        public dxjokdxxww(String str, zynmafqrjb zynmafqrjbVar, SharedPreferences sharedPreferences, Object obj) {
            this.f111806iobyxmoadg = str;
            this.f111809zoijcleaow = zynmafqrjbVar;
            this.f111807ppxfxbqfkf = sharedPreferences;
            this.f111808wkgbmnqykc = obj;
        }

        @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
        public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str) {
            String string;
            if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f111806iobyxmoadg, str)) {
                zynmafqrjb zynmafqrjbVar = this.f111809zoijcleaow;
                SharedPreferences sharedPreferences2 = this.f111807ppxfxbqfkf;
                String str2 = this.f111806iobyxmoadg;
                Object obj = this.f111808wkgbmnqykc;
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
                zynmafqrjbVar.setValue(string);
            }
        }
    }

    static final class eablkybsjg extends draadjrbmk implements rgvfuqvkyq {

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        private /* synthetic */ Object f111810yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        int f111811zdlpuopuiu;

        eablkybsjg(lg.gxszxtbevo gxszxtbevoVar) {
            super(2, gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
            eablkybsjg eablkybsjgVar = new eablkybsjg(gxszxtbevoVar);
            eablkybsjgVar.f111810yggfygwlhe = obj;
            return eablkybsjgVar;
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
            int i13 = this.f111811zdlpuopuiu;
            if (i13 == 0) {
                zdlpuopuiu.zoijcleaow(obj);
                sj.nufgyqmvbu nufgyqmvbuVar = (sj.nufgyqmvbu) this.f111810yggfygwlhe;
                wwaezpbzkn wwaezpbzknVar = wwaezpbzkn.f37140iobyxmoadg;
                this.f111811zdlpuopuiu = 1;
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
            return ((eablkybsjg) create(nufgyqmvbuVar, gxszxtbevoVar)).invokeSuspend(wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    public static final class gxszxtbevo extends draadjrbmk implements vdvldrhtss {

        /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
        final /* synthetic */ ppxfxbqfkf f111812iwizpuwonk;

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        /* synthetic */ Object f111813jyumaefscl;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        private /* synthetic */ Object f111814yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        int f111815zdlpuopuiu;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public gxszxtbevo(lg.gxszxtbevo gxszxtbevoVar, ppxfxbqfkf ppxfxbqfkfVar) {
            super(3, gxszxtbevoVar);
            this.f111812iwizpuwonk = ppxfxbqfkfVar;
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
            int i13 = this.f111815zdlpuopuiu;
            if (i13 == 0) {
                zdlpuopuiu.zoijcleaow(obj);
                sj.nufgyqmvbu nufgyqmvbuVar = (sj.nufgyqmvbu) this.f111814yggfygwlhe;
                sj.lqeggnwhkg lqeggnwhkgVarPkzmftpjix = sj.dxjokdxxww.pkzmftpjix(this.f111812iwizpuwonk.vdvldrhtss());
                this.f111815zdlpuopuiu = 1;
                if (sj.dxjokdxxww.iwizpuwonk(nufgyqmvbuVar, lqeggnwhkgVarPkzmftpjix, this) == objGxszxtbevo) {
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
            gxszxtbevo gxszxtbevoVar2 = new gxszxtbevo(gxszxtbevoVar, this.f111812iwizpuwonk);
            gxszxtbevoVar2.f111814yggfygwlhe = nufgyqmvbuVar;
            gxszxtbevoVar2.f111813jyumaefscl = obj;
            return gxszxtbevoVar2.invokeSuspend(wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    public static final class iobyxmoadg {
        public /* synthetic */ iobyxmoadg(gtknphoqwx gtknphoqwxVar) {
            this();
        }

        private iobyxmoadg() {
        }
    }

    static final class lqeggnwhkg extends draadjrbmk implements rgvfuqvkyq {

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        private /* synthetic */ Object f111816yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        int f111817zdlpuopuiu;

        lqeggnwhkg(lg.gxszxtbevo gxszxtbevoVar) {
            super(2, gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
            lqeggnwhkg lqeggnwhkgVar = new lqeggnwhkg(gxszxtbevoVar);
            lqeggnwhkgVar.f111816yggfygwlhe = obj;
            return lqeggnwhkgVar;
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
            int i13 = this.f111817zdlpuopuiu;
            if (i13 == 0) {
                zdlpuopuiu.zoijcleaow(obj);
                sj.nufgyqmvbu nufgyqmvbuVar = (sj.nufgyqmvbu) this.f111816yggfygwlhe;
                wwaezpbzkn wwaezpbzknVar = wwaezpbzkn.f37140iobyxmoadg;
                this.f111817zdlpuopuiu = 1;
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
            return ((lqeggnwhkg) create(nufgyqmvbuVar, gxszxtbevoVar)).invokeSuspend(wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    public static final class nufgyqmvbu implements sj.lqeggnwhkg {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final /* synthetic */ sj.lqeggnwhkg f111818zdlpuopuiu;

        public static final class iobyxmoadg implements sj.nufgyqmvbu {

            /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
            final /* synthetic */ sj.nufgyqmvbu f111819zdlpuopuiu;

            /* JADX INFO: renamed from: ty.ppxfxbqfkf$nufgyqmvbu$iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
            public static final class C2749iobyxmoadg extends kotlin.coroutines.jvm.internal.wkgbmnqykc {

                /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
                int f111821yggfygwlhe;

                /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
                /* synthetic */ Object f111822zdlpuopuiu;

                public C2749iobyxmoadg(lg.gxszxtbevo gxszxtbevoVar) {
                    super(gxszxtbevoVar);
                }

                @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
                public final Object invokeSuspend(Object obj) {
                    this.f111822zdlpuopuiu = obj;
                    this.f111821yggfygwlhe |= Integer.MIN_VALUE;
                    return iobyxmoadg.this.emit(null, this);
                }
            }

            public iobyxmoadg(sj.nufgyqmvbu nufgyqmvbuVar) {
                this.f111819zdlpuopuiu = nufgyqmvbuVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // sj.nufgyqmvbu
            public final Object emit(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
                C2749iobyxmoadg c2749iobyxmoadg;
                Object next;
                if (gxszxtbevoVar instanceof C2749iobyxmoadg) {
                    c2749iobyxmoadg = (C2749iobyxmoadg) gxszxtbevoVar;
                    int i13 = c2749iobyxmoadg.f111821yggfygwlhe;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        c2749iobyxmoadg.f111821yggfygwlhe = i13 - Integer.MIN_VALUE;
                    } else {
                        c2749iobyxmoadg = new C2749iobyxmoadg(gxszxtbevoVar);
                    }
                } else {
                    c2749iobyxmoadg = new C2749iobyxmoadg(gxszxtbevoVar);
                }
                Object obj2 = c2749iobyxmoadg.f111822zdlpuopuiu;
                Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
                int i14 = c2749iobyxmoadg.f111821yggfygwlhe;
                if (i14 == 0) {
                    zdlpuopuiu.zoijcleaow(obj2);
                    sj.nufgyqmvbu nufgyqmvbuVar = this.f111819zdlpuopuiu;
                    String str = (String) obj;
                    Iterator<E> it = x00.iobyxmoadg.lqeggnwhkg().iterator();
                    do {
                        if (!it.hasNext()) {
                            next = null;
                            break;
                        }
                        next = it.next();
                    } while (!kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(((x00.iobyxmoadg) next).name(), str));
                    x00.iobyxmoadg iobyxmoadgVarIobyxmoadg = (x00.iobyxmoadg) next;
                    if (iobyxmoadgVarIobyxmoadg == null) {
                        iobyxmoadgVarIobyxmoadg = x00.iobyxmoadg.f120897zdlpuopuiu.iobyxmoadg();
                    }
                    c2749iobyxmoadg.f111821yggfygwlhe = 1;
                    if (nufgyqmvbuVar.emit(iobyxmoadgVarIobyxmoadg, c2749iobyxmoadg) == objGxszxtbevo) {
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

        public nufgyqmvbu(sj.lqeggnwhkg lqeggnwhkgVar) {
            this.f111818zdlpuopuiu = lqeggnwhkgVar;
        }

        @Override // sj.lqeggnwhkg
        public Object collect(sj.nufgyqmvbu nufgyqmvbuVar, lg.gxszxtbevo gxszxtbevoVar) {
            Object objCollect = this.f111818zdlpuopuiu.collect(new iobyxmoadg(nufgyqmvbuVar), gxszxtbevoVar);
            return objCollect == mg.zoijcleaow.gxszxtbevo() ? objCollect : wwaezpbzkn.f37140iobyxmoadg;
        }
    }

    /* JADX INFO: renamed from: ty.ppxfxbqfkf$ppxfxbqfkf, reason: collision with other inner class name */
    public static final class C2750ppxfxbqfkf extends draadjrbmk implements vdvldrhtss {

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        final /* synthetic */ SharedPreferences.OnSharedPreferenceChangeListener f111823jyumaefscl;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        final /* synthetic */ SharedPreferences f111824yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        int f111825zdlpuopuiu;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C2750ppxfxbqfkf(SharedPreferences sharedPreferences, SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener, lg.gxszxtbevo gxszxtbevoVar) {
            super(3, gxszxtbevoVar);
            this.f111824yggfygwlhe = sharedPreferences;
            this.f111823jyumaefscl = onSharedPreferenceChangeListener;
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            mg.zoijcleaow.gxszxtbevo();
            if (this.f111825zdlpuopuiu != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            zdlpuopuiu.zoijcleaow(obj);
            this.f111824yggfygwlhe.unregisterOnSharedPreferenceChangeListener(this.f111823jyumaefscl);
            return wwaezpbzkn.f37140iobyxmoadg;
        }

        @Override // tg.vdvldrhtss
        /* JADX INFO: renamed from: ojitshcjhn, reason: merged with bridge method [inline-methods] */
        public final Object invoke(sj.nufgyqmvbu nufgyqmvbuVar, Throwable th2, lg.gxszxtbevo gxszxtbevoVar) {
            return new C2750ppxfxbqfkf(this.f111824yggfygwlhe, this.f111823jyumaefscl, gxszxtbevoVar).invokeSuspend(wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    public static final class wkgbmnqykc extends draadjrbmk implements vdvldrhtss {

        /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
        final /* synthetic */ ppxfxbqfkf f111826iwizpuwonk;

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        /* synthetic */ Object f111827jyumaefscl;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        private /* synthetic */ Object f111828yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        int f111829zdlpuopuiu;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public wkgbmnqykc(lg.gxszxtbevo gxszxtbevoVar, ppxfxbqfkf ppxfxbqfkfVar) {
            super(3, gxszxtbevoVar);
            this.f111826iwizpuwonk = ppxfxbqfkfVar;
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            sj.lqeggnwhkg lqeggnwhkgVarHcddaimhww;
            Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
            int i13 = this.f111829zdlpuopuiu;
            if (i13 == 0) {
                zdlpuopuiu.zoijcleaow(obj);
                sj.nufgyqmvbu nufgyqmvbuVar = (sj.nufgyqmvbu) this.f111828yggfygwlhe;
                City cityVdvldrhtss = this.f111826iwizpuwonk.vdvldrhtss();
                if (cityVdvldrhtss == null || (lqeggnwhkgVarHcddaimhww = sj.dxjokdxxww.pkzmftpjix(cityVdvldrhtss)) == null) {
                    lqeggnwhkgVarHcddaimhww = sj.dxjokdxxww.hcddaimhww(new City[0]);
                }
                this.f111829zdlpuopuiu = 1;
                if (sj.dxjokdxxww.iwizpuwonk(nufgyqmvbuVar, lqeggnwhkgVarHcddaimhww, this) == objGxszxtbevo) {
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
            wkgbmnqykc wkgbmnqykcVar = new wkgbmnqykc(gxszxtbevoVar, this.f111826iwizpuwonk);
            wkgbmnqykcVar.f111828yggfygwlhe = nufgyqmvbuVar;
            wkgbmnqykcVar.f111827jyumaefscl = obj;
            return wkgbmnqykcVar.invokeSuspend(wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    public static final class zoijcleaow implements SharedPreferences.OnSharedPreferenceChangeListener {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        final /* synthetic */ String f111830iobyxmoadg;

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        final /* synthetic */ SharedPreferences f111831ppxfxbqfkf;

        /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
        final /* synthetic */ Object f111832wkgbmnqykc;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        final /* synthetic */ zynmafqrjb f111833zoijcleaow;

        public zoijcleaow(String str, zynmafqrjb zynmafqrjbVar, SharedPreferences sharedPreferences, Object obj) {
            this.f111830iobyxmoadg = str;
            this.f111833zoijcleaow = zynmafqrjbVar;
            this.f111831ppxfxbqfkf = sharedPreferences;
            this.f111832wkgbmnqykc = obj;
        }

        @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
        public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str) {
            Boolean boolValueOf;
            if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f111830iobyxmoadg, str)) {
                zynmafqrjb zynmafqrjbVar = this.f111833zoijcleaow;
                SharedPreferences sharedPreferences2 = this.f111831ppxfxbqfkf;
                String str2 = this.f111830iobyxmoadg;
                Object obj = this.f111832wkgbmnqykc;
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
                zynmafqrjbVar.setValue(boolValueOf);
            }
        }
    }

    public ppxfxbqfkf(Context context) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(context, "context");
        this.f111800iobyxmoadg = context;
        this.f111802zoijcleaow = jyumaefscl.zoijcleaow(null, new tg.draadjrbmk() { // from class: ty.zoijcleaow
            @Override // tg.draadjrbmk
            public final Object invoke(Object obj) {
                return ppxfxbqfkf.sflfametgt((eablkybsjg) obj);
            }
        }, 1, null);
        this.f111801ppxfxbqfkf = uwvvkdfqfp("network_preferences");
    }

    private final SharedPreferences czzsidtyhn() {
        SharedPreferences sharedPreferencesUwvvkdfqfp = uwvvkdfqfp("options");
        kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(sharedPreferencesUwvvkdfqfp, "getPreferences(...)");
        return sharedPreferencesUwvvkdfqfp;
    }

    private final SharedPreferences metgxyhuhe() {
        SharedPreferences sharedPreferencesUwvvkdfqfp = uwvvkdfqfp("debug_panel_preferences");
        kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(sharedPreferencesUwvvkdfqfp, "getPreferences(...)");
        return sharedPreferencesUwvvkdfqfp;
    }

    private final SharedPreferences rlfsiqarku() {
        SharedPreferences sharedPreferencesUwvvkdfqfp = uwvvkdfqfp("NetworkSharedPreferences");
        kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(sharedPreferencesUwvvkdfqfp, "getPreferences(...)");
        return sharedPreferencesUwvvkdfqfp;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wwaezpbzkn sflfametgt(gk.eablkybsjg Json) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(Json, "$this$Json");
        Json.wkgbmnqykc(true);
        Json.eablkybsjg(true);
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    private final SharedPreferences uwvvkdfqfp(String str) {
        return this.f111800iobyxmoadg.getSharedPreferences(str, 0);
    }

    private final SharedPreferences xrmfcynszj() {
        SharedPreferences sharedPreferencesUwvvkdfqfp = uwvvkdfqfp("cart_options");
        kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(sharedPreferencesUwvvkdfqfp, "getPreferences(...)");
        return sharedPreferencesUwvvkdfqfp;
    }

    private final SharedPreferences ydmasvzmpa() {
        SharedPreferences sharedPreferencesUwvvkdfqfp = uwvvkdfqfp("update_preferences");
        kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(sharedPreferencesUwvvkdfqfp, "getPreferences(...)");
        return sharedPreferencesUwvvkdfqfp;
    }

    private final SharedPreferences yfnezrywwk() {
        SharedPreferences sharedPreferencesUwvvkdfqfp = uwvvkdfqfp("scan_go");
        kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(sharedPreferencesUwvvkdfqfp, "getPreferences(...)");
        return sharedPreferencesUwvvkdfqfp;
    }

    @Override // v10.zoijcleaow
    public x00.iobyxmoadg agtfadlqog() {
        Object next;
        Iterator<E> it = x00.iobyxmoadg.lqeggnwhkg().iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(((x00.iobyxmoadg) next).name(), czzsidtyhn().getString("dark_mode_token", x00.iobyxmoadg.f120897zdlpuopuiu.iobyxmoadg().name())));
        x00.iobyxmoadg iobyxmoadgVar = (x00.iobyxmoadg) next;
        return iobyxmoadgVar == null ? x00.iobyxmoadg.f120897zdlpuopuiu.iobyxmoadg() : iobyxmoadgVar;
    }

    @Override // v10.zoijcleaow
    public boolean btonecajqb() {
        return czzsidtyhn().getBoolean("show_qr", false);
    }

    @Override // v10.zoijcleaow
    public void cdpycssgdh(int i13) {
        SharedPreferences.Editor editorEdit = czzsidtyhn().edit();
        editorEdit.putInt("show_promo_count", i13);
        editorEdit.apply();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // v10.zoijcleaow
    public sj.lqeggnwhkg cllcsxoeiz() {
        String string;
        SharedPreferences sharedPreferencesCzzsidtyhn = czzsidtyhn();
        String strName = x00.iobyxmoadg.f120897zdlpuopuiu.iobyxmoadg().name();
        if (strName != 0) {
            string = sharedPreferencesCzzsidtyhn.getString("dark_mode_token", strName);
            if (string == null) {
                throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
            }
        } else if (strName instanceof Set) {
            kotlin.jvm.internal.zdlpuopuiu.nufgyqmvbu(strName, "null cannot be cast to non-null type kotlin.collections.Set<kotlin.String>");
            Object stringSet = sharedPreferencesCzzsidtyhn.getStringSet("dark_mode_token", (Set) strName);
            if (stringSet == null) {
                throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
            }
            string = (String) stringSet;
        } else {
            if (!mbcevpiqjq.wflxmlrfwp(strName)) {
                throw new IllegalArgumentException("generic type not handle " + String.class.getName());
            }
            kotlin.jvm.internal.zdlpuopuiu.nufgyqmvbu(strName, "null cannot be cast to non-null type kotlin.collections.MutableSet<kotlin.String>");
            Object stringSet2 = sharedPreferencesCzzsidtyhn.getStringSet("dark_mode_token", mbcevpiqjq.wkgbmnqykc(strName));
            if (stringSet2 == null) {
                throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
            }
            string = (String) stringSet2;
        }
        zynmafqrjb zynmafqrjbVarIobyxmoadg = kegysxyocb.iobyxmoadg(string);
        SharedPreferences.OnSharedPreferenceChangeListener dxjokdxxwwVar = new dxjokdxxww("dark_mode_token", zynmafqrjbVarIobyxmoadg, sharedPreferencesCzzsidtyhn, strName);
        sharedPreferencesCzzsidtyhn.registerOnSharedPreferenceChangeListener(dxjokdxxwwVar);
        return new nufgyqmvbu(sj.dxjokdxxww.stevsuqkhv(zynmafqrjbVarIobyxmoadg, new btonecajqb(sharedPreferencesCzzsidtyhn, dxjokdxxwwVar, null)));
    }

    @Override // v10.zoijcleaow
    public boolean cqumvgiudr() {
        return yfnezrywwk().getBoolean("first_scango_launch", true);
    }

    @Override // v10.zoijcleaow
    public void crxdokpmqz() {
        iobyxmoadg(true);
    }

    @Override // v10.zoijcleaow
    public boolean draadjrbmk() {
        return yfnezrywwk().getBoolean("scan_go_amount_product_first_message_viewed", false);
    }

    @Override // v10.zoijcleaow
    public void dsvhmnatus(boolean z13) {
        SharedPreferences.Editor editorEdit = czzsidtyhn().edit();
        editorEdit.putBoolean("show_qr", z13);
        editorEdit.apply();
    }

    @Override // v10.zoijcleaow
    public void dxjokdxxww(LocalDateTime localDateTime) {
        SharedPreferences.Editor editorEdit = yfnezrywwk().edit();
        editorEdit.putString("scan_go_expires_at", localDateTime != null ? localDateTime.toString() : null);
        editorEdit.apply();
    }

    @Override // v10.zoijcleaow
    public String eablkybsjg() {
        String string = metgxyhuhe().getString("debug_panel_api_version", null);
        return string == null ? xx.iobyxmoadg.f123319iobyxmoadg.rgvfuqvkyq().getVersion() : string;
    }

    @Override // v10.zoijcleaow
    public void esjtqupxsv() {
        SharedPreferences.Editor editorEdit = yfnezrywwk().edit();
        editorEdit.putBoolean("first_scango_launch", false);
        editorEdit.apply();
    }

    @Override // v10.zoijcleaow
    public void gtknphoqwx(boolean z13) {
        SharedPreferences.Editor editorEdit = czzsidtyhn().edit();
        editorEdit.putBoolean("is_order_compound_changed", z13);
        editorEdit.apply();
    }

    @Override // v10.zoijcleaow
    public boolean gxszxtbevo() {
        return ydmasvzmpa().getBoolean("ignore_update", false);
    }

    @Override // v10.zoijcleaow
    public void hcddaimhww(LocalDate localDate) {
        SharedPreferences.Editor editorEdit = czzsidtyhn().edit();
        editorEdit.putString("next_rate_date", localDate != null ? localDate.toString() : null);
        editorEdit.apply();
    }

    @Override // v10.zoijcleaow
    public void hkdspvbjdz(boolean z13) {
        SharedPreferences.Editor editorEdit = xrmfcynszj().edit();
        editorEdit.putBoolean("is_products_grid", z13);
        editorEdit.apply();
    }

    @Override // v10.iobyxmoadg
    public void ikoacuggdj(City city) {
        String strZoijcleaow;
        rs.wkgbmnqykc.f83693iobyxmoadg.zoijcleaow("MOB-7588", "SharedPreferencesRepositoryImpl set chosenCity = " + city, true);
        SharedPreferences.Editor editorEdit = czzsidtyhn().edit();
        if (city != null) {
            gk.zoijcleaow zoijcleaowVar = this.f111802zoijcleaow;
            zoijcleaowVar.iobyxmoadg();
            strZoijcleaow = zoijcleaowVar.zoijcleaow(City.INSTANCE.serializer(), city);
        } else {
            strZoijcleaow = null;
        }
        editorEdit.putString("chosen_city_name", strZoijcleaow);
        editorEdit.apply();
    }

    @Override // v10.zoijcleaow
    public void iobyxmoadg(boolean z13) {
        SharedPreferences.Editor editorEdit = ydmasvzmpa().edit();
        editorEdit.putBoolean("ignore_update", z13);
        editorEdit.apply();
    }

    @Override // v10.zoijcleaow
    public void iozdgvuglv(boolean z13) {
        SharedPreferences.Editor editorEdit = czzsidtyhn().edit();
        editorEdit.putBoolean("is_cart_compound_changed", z13);
        editorEdit.apply();
    }

    @Override // v10.iobyxmoadg
    public sj.lqeggnwhkg istkbnxepw() {
        return sj.dxjokdxxww.ikoacuggdj(sj.dxjokdxxww.tzroggbefp(k30.gtknphoqwx.iobyxmoadg(czzsidtyhn(), "chosen_city_name"), new eablkybsjg(null)), new wkgbmnqykc(null, this));
    }

    @Override // v10.zoijcleaow
    public LocalDateTime iwizpuwonk() {
        String string = yfnezrywwk().getString("scan_go_expires_at", null);
        if (string != null) {
            return LocalDateTime.parse(string);
        }
        return null;
    }

    @Override // v10.zoijcleaow
    public LocalDate jhduphickx() {
        String string = czzsidtyhn().getString("iqos_agreements_next_show", null);
        if (string != null) {
            return LocalDate.parse(string);
        }
        return null;
    }

    @Override // v10.zoijcleaow
    public boolean jlmebxxoox() {
        return czzsidtyhn().getBoolean("iqos_agreements", true);
    }

    @Override // v10.zoijcleaow
    public LocalDateTime jpowsppfya() {
        String string = czzsidtyhn().getString("next_show_promo_date", null);
        if (string != null) {
            return LocalDateTime.parse(string);
        }
        return null;
    }

    @Override // v10.zoijcleaow
    public void jyumaefscl(LocalDateTime localDateTime) {
        SharedPreferences.Editor editorEdit = czzsidtyhn().edit();
        editorEdit.putString("next_show_promo_date", localDateTime != null ? localDateTime.toString() : null);
        editorEdit.apply();
    }

    @Override // v10.zoijcleaow
    public boolean kcexrzcfyt() {
        return czzsidtyhn().getBoolean("is_adult", false);
    }

    @Override // v10.zoijcleaow
    public String kegysxyocb() {
        String string = this.f111801ppxfxbqfkf.getString("bitrix_version", null);
        return string == null ? j40.iobyxmoadg.BITRIX_NEW.lqeggnwhkg() : string;
    }

    @Override // v10.zoijcleaow
    public int lereixgezr() {
        return czzsidtyhn().getInt("show_promo_count", 0);
    }

    @Override // v10.zoijcleaow
    public void lmojexxdyd(String value) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(value, "value");
        SharedPreferences.Editor editorEdit = czzsidtyhn().edit();
        editorEdit.putString("last_promotion_id", value);
        editorEdit.apply();
    }

    @Override // v10.zoijcleaow
    public void lqeggnwhkg(boolean z13) {
        SharedPreferences.Editor editorEdit = czzsidtyhn().edit();
        editorEdit.putBoolean("auto_brightness", z13);
        editorEdit.apply();
    }

    @Override // v10.zoijcleaow
    public void mbcevpiqjq(String value) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(value, "value");
        SharedPreferences.Editor editorEdit = rlfsiqarku().edit();
        editorEdit.putString("NetworkSharedPreferencesCurrentEndPoint", value);
        editorEdit.apply();
    }

    @Override // v10.zoijcleaow
    public void ntlheqmsrt(x00.iobyxmoadg value) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(value, "value");
        SharedPreferences.Editor editorEdit = czzsidtyhn().edit();
        editorEdit.putString("dark_mode_token", value.name());
        editorEdit.apply();
    }

    @Override // v10.iobyxmoadg
    public sj.lqeggnwhkg nufgyqmvbu() {
        return sj.dxjokdxxww.ikoacuggdj(sj.dxjokdxxww.tzroggbefp(k30.gtknphoqwx.iobyxmoadg(czzsidtyhn(), "chosen_city_name"), new lqeggnwhkg(null)), new gxszxtbevo(null, this));
    }

    @Override // v10.zoijcleaow
    public void ojitshcjhn(String value) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(value, "value");
        SharedPreferences networkPreferences = this.f111801ppxfxbqfkf;
        kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(networkPreferences, "networkPreferences");
        SharedPreferences.Editor editorEdit = networkPreferences.edit();
        editorEdit.putString("bitrix_version", value);
        editorEdit.commit();
    }

    @Override // v10.zoijcleaow
    public void okpsazkaxt(LocalDate localDate) {
        SharedPreferences.Editor editorEdit = czzsidtyhn().edit();
        editorEdit.putString("iqos_agreements_next_show", localDate != null ? localDate.toString() : null);
        editorEdit.apply();
    }

    @Override // v10.zoijcleaow
    public boolean oxmwwwfdhm() {
        return czzsidtyhn().getBoolean("is_order_compound_changed", false);
    }

    @Override // v10.zoijcleaow
    public void pkzmftpjix() {
        SharedPreferences.Editor editorEdit = yfnezrywwk().edit();
        editorEdit.putBoolean("scan_go_amount_product_first_message_viewed", true);
        editorEdit.apply();
    }

    @Override // v10.zoijcleaow
    public sj.lqeggnwhkg pmvmpeiblj() {
        SharedPreferences sharedPreferencesCzzsidtyhn = czzsidtyhn();
        Boolean bool = Boolean.FALSE;
        zynmafqrjb zynmafqrjbVarIobyxmoadg = kegysxyocb.iobyxmoadg(Boolean.valueOf(sharedPreferencesCzzsidtyhn.getBoolean("is_cart_compound_changed", false)));
        zoijcleaow zoijcleaowVar = new zoijcleaow("is_cart_compound_changed", zynmafqrjbVarIobyxmoadg, sharedPreferencesCzzsidtyhn, bool);
        sharedPreferencesCzzsidtyhn.registerOnSharedPreferenceChangeListener(zoijcleaowVar);
        return sj.dxjokdxxww.stevsuqkhv(zynmafqrjbVarIobyxmoadg, new C2750ppxfxbqfkf(sharedPreferencesCzzsidtyhn, zoijcleaowVar, null));
    }

    @Override // v10.zoijcleaow
    public String ppxfxbqfkf() {
        return xx.iobyxmoadg.f123319iobyxmoadg.skhdrjzrfn();
    }

    @Override // v10.zoijcleaow
    public String rgvfuqvkyq() {
        String string = czzsidtyhn().getString("last_promotion_id", null);
        return string == null ? "" : string;
    }

    @Override // v10.zoijcleaow
    public void ribwqtqdhb(LocalDate localDate) {
        SharedPreferences.Editor editorEdit = czzsidtyhn().edit();
        editorEdit.putString("next_banner_popup_date", localDate != null ? localDate.toString() : null);
        editorEdit.apply();
    }

    @Override // v10.zoijcleaow
    public LocalDate sopmlzcsov() {
        String string = czzsidtyhn().getString("next_banner_popup_date", null);
        if (string != null) {
            return LocalDate.parse(string);
        }
        return null;
    }

    @Override // v10.zoijcleaow
    public Set stevsuqkhv() {
        Set<String> stringSet = czzsidtyhn().getStringSet("set_of_banner_popup_id", ikoacuggdj.eablkybsjg());
        kotlin.jvm.internal.zdlpuopuiu.nufgyqmvbu(stringSet, "null cannot be cast to non-null type kotlin.collections.Set<kotlin.String>");
        return stringSet;
    }

    @Override // v10.zoijcleaow
    public String tzroggbefp() {
        xx.iobyxmoadg iobyxmoadgVar = xx.iobyxmoadg.f123319iobyxmoadg;
        String strEablkybsjg = iobyxmoadgVar.cllcsxoeiz() ? iobyxmoadgVar.eablkybsjg() : l40.ppxfxbqfkf.DEV.wkgbmnqykc();
        String string = rlfsiqarku().getString("NetworkSharedPreferencesCurrentEndPoint", null);
        return string == null ? strEablkybsjg : string;
    }

    @Override // v10.zoijcleaow
    public void ulzqkzuiru(String value) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(value, "value");
        SharedPreferences.Editor editorEdit = metgxyhuhe().edit();
        editorEdit.putString("debug_panel_api_version", value);
        editorEdit.apply();
    }

    @Override // v10.iobyxmoadg
    public City vdvldrhtss() {
        City city;
        try {
            String string = czzsidtyhn().getString("chosen_city_name", null);
            if (string != null) {
                gk.zoijcleaow.iobyxmoadg iobyxmoadgVar = gk.zoijcleaow.f37751wkgbmnqykc;
                iobyxmoadgVar.iobyxmoadg();
                city = (City) iobyxmoadgVar.ppxfxbqfkf(City.INSTANCE.serializer(), string);
            } else {
                city = null;
            }
            rs.wkgbmnqykc.f83693iobyxmoadg.zoijcleaow("MOB-7588", "SharedPreferencesRepositoryImpl get chosenCity = " + city, true);
            return city;
        } catch (Exception unused) {
            ikoacuggdj(null);
            return null;
        }
    }

    @Override // v10.zoijcleaow
    public void vipkmwdibw(boolean z13) {
        SharedPreferences.Editor editorEdit = czzsidtyhn().edit();
        editorEdit.putBoolean("iqos_agreements", z13);
        editorEdit.apply();
    }

    @Override // v10.zoijcleaow
    public boolean wflxmlrfwp() {
        return czzsidtyhn().getBoolean("auto_brightness", false);
    }

    @Override // v10.zoijcleaow
    public void wkgbmnqykc(boolean z13) {
        SharedPreferences.Editor editorEdit = czzsidtyhn().edit();
        editorEdit.putBoolean("is_adult", z13);
        editorEdit.apply();
    }

    @Override // v10.zoijcleaow
    public boolean wwaezpbzkn() {
        return xrmfcynszj().getBoolean("is_products_grid", true);
    }

    @Override // v10.zoijcleaow
    public void wypolnanlu(String value) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(value, "value");
        SharedPreferences.Editor editorEdit = yfnezrywwk().edit();
        editorEdit.putString("scan_go_cart_start_message", value);
        editorEdit.apply();
    }

    @Override // v10.zoijcleaow
    public LocalDate yadqdtsiqt() {
        String string = czzsidtyhn().getString("next_in_app_review_date", null);
        if (string != null) {
            return LocalDate.parse(string);
        }
        return null;
    }

    @Override // v10.zoijcleaow
    public LocalDate yggfygwlhe() {
        String string = czzsidtyhn().getString("next_rate_date", null);
        if (string != null) {
            return LocalDate.parse(string);
        }
        return null;
    }

    @Override // v10.zoijcleaow
    public void ylkuphrtab(Set value) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(value, "value");
        SharedPreferences.Editor editorEdit = czzsidtyhn().edit();
        editorEdit.putStringSet("set_of_banner_popup_id", value);
        editorEdit.apply();
    }

    @Override // v10.zoijcleaow
    public void zdlpuopuiu(LocalDate localDate) {
        SharedPreferences.Editor editorEdit = czzsidtyhn().edit();
        editorEdit.putString("next_in_app_review_date", localDate != null ? localDate.toString() : null);
        editorEdit.apply();
    }

    @Override // v10.zoijcleaow
    public void zoijcleaow() {
        dxjokdxxww(null);
        wkgbmnqykc(false);
        SharedPreferences.Editor editorEdit = czzsidtyhn().edit();
        editorEdit.remove("auth_type");
        editorEdit.apply();
    }

    @Override // v10.zoijcleaow
    public String zynmafqrjb() {
        String string = yfnezrywwk().getString("scan_go_cart_start_message", "");
        return string == null ? "" : string;
    }
}
