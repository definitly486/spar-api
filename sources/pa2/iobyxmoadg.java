package pa2;

import android.content.Context;
import android.content.SharedPreferences;
import gg.wwaezpbzkn;
import gg.zdlpuopuiu;
import kotlin.coroutines.jvm.internal.draadjrbmk;
import kotlin.jvm.internal.gtknphoqwx;
import lg.gxszxtbevo;
import mj.kcexrzcfyt;
import sj.dxjokdxxww;
import sj.lqeggnwhkg;
import sj.nufgyqmvbu;
import tg.rgvfuqvkyq;

/* JADX INFO: loaded from: classes6.dex */
public final class iobyxmoadg {

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private static final C1682iobyxmoadg f76282zoijcleaow = new C1682iobyxmoadg(null);

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final Context f76283iobyxmoadg;

    /* JADX INFO: renamed from: pa2.iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
    private static final class C1682iobyxmoadg {
        public /* synthetic */ C1682iobyxmoadg(gtknphoqwx gtknphoqwxVar) {
            this();
        }

        private C1682iobyxmoadg() {
        }
    }

    static final class ppxfxbqfkf extends draadjrbmk implements rgvfuqvkyq {

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        private /* synthetic */ Object f76284yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        int f76285zdlpuopuiu;

        ppxfxbqfkf(gxszxtbevo gxszxtbevoVar) {
            super(2, gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final gxszxtbevo create(Object obj, gxszxtbevo gxszxtbevoVar) {
            ppxfxbqfkf ppxfxbqfkfVar = new ppxfxbqfkf(gxszxtbevoVar);
            ppxfxbqfkfVar.f76284yggfygwlhe = obj;
            return ppxfxbqfkfVar;
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
            int i13 = this.f76285zdlpuopuiu;
            if (i13 == 0) {
                zdlpuopuiu.zoijcleaow(obj);
                nufgyqmvbu nufgyqmvbuVar = (nufgyqmvbu) this.f76284yggfygwlhe;
                wwaezpbzkn wwaezpbzknVar = wwaezpbzkn.f37140iobyxmoadg;
                this.f76285zdlpuopuiu = 1;
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
        public final Object invoke(nufgyqmvbu nufgyqmvbuVar, gxszxtbevo gxszxtbevoVar) {
            return ((ppxfxbqfkf) create(nufgyqmvbuVar, gxszxtbevoVar)).invokeSuspend(wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    public static final class zoijcleaow implements lqeggnwhkg {

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        final /* synthetic */ iobyxmoadg f76286yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final /* synthetic */ lqeggnwhkg f76287zdlpuopuiu;

        /* JADX INFO: renamed from: pa2.iobyxmoadg$zoijcleaow$iobyxmoadg, reason: collision with other inner class name */
        public static final class C1683iobyxmoadg implements nufgyqmvbu {

            /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
            final /* synthetic */ iobyxmoadg f76288yggfygwlhe;

            /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
            final /* synthetic */ nufgyqmvbu f76289zdlpuopuiu;

            /* JADX INFO: renamed from: pa2.iobyxmoadg$zoijcleaow$iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
            public static final class C1684iobyxmoadg extends kotlin.coroutines.jvm.internal.wkgbmnqykc {

                /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
                int f76291yggfygwlhe;

                /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
                /* synthetic */ Object f76292zdlpuopuiu;

                public C1684iobyxmoadg(gxszxtbevo gxszxtbevoVar) {
                    super(gxszxtbevoVar);
                }

                @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
                public final Object invokeSuspend(Object obj) {
                    this.f76292zdlpuopuiu = obj;
                    this.f76291yggfygwlhe |= Integer.MIN_VALUE;
                    return C1683iobyxmoadg.this.emit(null, this);
                }
            }

            public C1683iobyxmoadg(nufgyqmvbu nufgyqmvbuVar, iobyxmoadg iobyxmoadgVar) {
                this.f76289zdlpuopuiu = nufgyqmvbuVar;
                this.f76288yggfygwlhe = iobyxmoadgVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // sj.nufgyqmvbu
            public final Object emit(Object obj, gxszxtbevo gxszxtbevoVar) {
                C1684iobyxmoadg c1684iobyxmoadg;
                if (gxszxtbevoVar instanceof C1684iobyxmoadg) {
                    c1684iobyxmoadg = (C1684iobyxmoadg) gxszxtbevoVar;
                    int i13 = c1684iobyxmoadg.f76291yggfygwlhe;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        c1684iobyxmoadg.f76291yggfygwlhe = i13 - Integer.MIN_VALUE;
                    } else {
                        c1684iobyxmoadg = new C1684iobyxmoadg(gxszxtbevoVar);
                    }
                } else {
                    c1684iobyxmoadg = new C1684iobyxmoadg(gxszxtbevoVar);
                }
                Object obj2 = c1684iobyxmoadg.f76292zdlpuopuiu;
                Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
                int i14 = c1684iobyxmoadg.f76291yggfygwlhe;
                if (i14 == 0) {
                    zdlpuopuiu.zoijcleaow(obj2);
                    nufgyqmvbu nufgyqmvbuVar = this.f76289zdlpuopuiu;
                    Boolean boolIobyxmoadg = kotlin.coroutines.jvm.internal.zoijcleaow.iobyxmoadg(this.f76288yggfygwlhe.gxszxtbevo());
                    c1684iobyxmoadg.f76291yggfygwlhe = 1;
                    if (nufgyqmvbuVar.emit(boolIobyxmoadg, c1684iobyxmoadg) == objGxszxtbevo) {
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

        public zoijcleaow(lqeggnwhkg lqeggnwhkgVar, iobyxmoadg iobyxmoadgVar) {
            this.f76287zdlpuopuiu = lqeggnwhkgVar;
            this.f76286yggfygwlhe = iobyxmoadgVar;
        }

        @Override // sj.lqeggnwhkg
        public Object collect(nufgyqmvbu nufgyqmvbuVar, gxszxtbevo gxszxtbevoVar) {
            Object objCollect = this.f76287zdlpuopuiu.collect(new C1683iobyxmoadg(nufgyqmvbuVar, this.f76286yggfygwlhe), gxszxtbevoVar);
            return objCollect == mg.zoijcleaow.gxszxtbevo() ? objCollect : wwaezpbzkn.f37140iobyxmoadg;
        }
    }

    public iobyxmoadg(Context context) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(context, "context");
        this.f76283iobyxmoadg = context;
    }

    private final SharedPreferences zoijcleaow() {
        SharedPreferences sharedPreferences = this.f76283iobyxmoadg.getSharedPreferences("credentials", 0);
        kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(sharedPreferences, "getSharedPreferences(...)");
        return sharedPreferences;
    }

    public final lqeggnwhkg btonecajqb() {
        return dxjokdxxww.vdvldrhtss(new zoijcleaow(dxjokdxxww.tzroggbefp(wkgbmnqykc.iobyxmoadg(zoijcleaow(), "auth_token"), new ppxfxbqfkf(null)), this));
    }

    public final void dxjokdxxww(String str) {
        SharedPreferences.Editor editorEdit = zoijcleaow().edit();
        editorEdit.putString("instance_id", str);
        editorEdit.apply();
    }

    public final String eablkybsjg() {
        String string = zoijcleaow().getString("push_token", null);
        return string == null ? "" : string;
    }

    public final boolean gxszxtbevo() {
        String strIobyxmoadg = iobyxmoadg();
        return !(strIobyxmoadg == null || kcexrzcfyt.zfvoamnweg(strIobyxmoadg));
    }

    public final String iobyxmoadg() {
        return zoijcleaow().getString("auth_token", null);
    }

    public final void lqeggnwhkg(String str) {
        SharedPreferences.Editor editorEdit = zoijcleaow().edit();
        editorEdit.putString("auth_token", str);
        editorEdit.apply();
    }

    public final void nufgyqmvbu(String value) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(value, "value");
        SharedPreferences.Editor editorEdit = zoijcleaow().edit();
        editorEdit.putString("device_id", value);
        editorEdit.apply();
    }

    public final String ppxfxbqfkf() {
        String string = zoijcleaow().getString("device_id", null);
        return string == null ? "" : string;
    }

    public final String wkgbmnqykc() {
        String string = zoijcleaow().getString("instance_id", null);
        return string == null ? "" : string;
    }
}
