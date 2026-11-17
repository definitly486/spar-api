package ezmngbhpjk;

import androidx.compose.runtime.a0;
import androidx.compose.runtime.c;
import androidx.compose.runtime.f;
import gg.wwaezpbzkn;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.mbcevpiqjq;

/* JADX INFO: loaded from: classes.dex */
public final class lqeggnwhkg implements zoijcleaow {

    /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
    private List f32440cqumvgiudr;

    /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
    private c f32441iwizpuwonk;

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
    private Object f32442jyumaefscl;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    private final boolean f32443yggfygwlhe;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    private final int f32444zdlpuopuiu;

    /* synthetic */ class iobyxmoadg extends kotlin.jvm.internal.iobyxmoadg implements tg.rgvfuqvkyq {
        iobyxmoadg(Object obj) {
            super(2, obj, lqeggnwhkg.class, "invoke", "invoke(Landroidx/compose/runtime/Composer;I)Ljava/lang/Object;", 8);
        }

        @Override // tg.rgvfuqvkyq
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            iobyxmoadg((androidx.compose.runtime.draadjrbmk) obj, ((Number) obj2).intValue());
            return wwaezpbzkn.f37140iobyxmoadg;
        }

        public final void iobyxmoadg(androidx.compose.runtime.draadjrbmk draadjrbmkVar, int i13) {
            ((lqeggnwhkg) this.f60022zdlpuopuiu).gxszxtbevo(draadjrbmkVar, i13);
        }
    }

    public lqeggnwhkg(int i13, boolean z13, Object obj) {
        this.f32444zdlpuopuiu = i13;
        this.f32443yggfygwlhe = z13;
        this.f32442jyumaefscl = obj;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wwaezpbzkn agtfadlqog(lqeggnwhkg lqeggnwhkgVar, Object obj, int i13, androidx.compose.runtime.draadjrbmk draadjrbmkVar, int i14) {
        lqeggnwhkgVar.lqeggnwhkg(obj, draadjrbmkVar, f.iobyxmoadg(i13) | 1);
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wwaezpbzkn kcexrzcfyt(lqeggnwhkg lqeggnwhkgVar, Object obj, Object obj2, Object obj3, Object obj4, int i13, androidx.compose.runtime.draadjrbmk draadjrbmkVar, int i14) {
        lqeggnwhkgVar.wflxmlrfwp(obj, obj2, obj3, obj4, draadjrbmkVar, f.iobyxmoadg(i13) | 1);
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wwaezpbzkn ojitshcjhn(lqeggnwhkg lqeggnwhkgVar, Object obj, Object obj2, int i13, androidx.compose.runtime.draadjrbmk draadjrbmkVar, int i14) {
        lqeggnwhkgVar.btonecajqb(obj, obj2, draadjrbmkVar, f.iobyxmoadg(i13) | 1);
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wwaezpbzkn oxmwwwfdhm(lqeggnwhkg lqeggnwhkgVar, Object obj, Object obj2, Object obj3, int i13, androidx.compose.runtime.draadjrbmk draadjrbmkVar, int i14) {
        lqeggnwhkgVar.gtknphoqwx(obj, obj2, obj3, draadjrbmkVar, f.iobyxmoadg(i13) | 1);
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    private final void yggfygwlhe() {
        if (this.f32443yggfygwlhe) {
            c cVar = this.f32441iwizpuwonk;
            if (cVar != null) {
                cVar.invalidate();
                this.f32441iwizpuwonk = null;
            }
            List list = this.f32440cqumvgiudr;
            if (list != null) {
                int size = list.size();
                for (int i13 = 0; i13 < size; i13++) {
                    ((c) list.get(i13)).invalidate();
                }
                list.clear();
            }
        }
    }

    private final void zdlpuopuiu(androidx.compose.runtime.draadjrbmk draadjrbmkVar) {
        c cVarZynmafqrjb;
        if (!this.f32443yggfygwlhe || (cVarZynmafqrjb = draadjrbmkVar.zynmafqrjb()) == null) {
            return;
        }
        draadjrbmkVar.wypolnanlu(cVarZynmafqrjb);
        if (nufgyqmvbu.gxszxtbevo(this.f32441iwizpuwonk, cVarZynmafqrjb)) {
            this.f32441iwizpuwonk = cVarZynmafqrjb;
            return;
        }
        List list = this.f32440cqumvgiudr;
        if (list == null) {
            ArrayList arrayList = new ArrayList();
            this.f32440cqumvgiudr = arrayList;
            arrayList.add(cVarZynmafqrjb);
            return;
        }
        int size = list.size();
        for (int i13 = 0; i13 < size; i13++) {
            if (nufgyqmvbu.gxszxtbevo((c) list.get(i13), cVarZynmafqrjb)) {
                list.set(i13, cVarZynmafqrjb);
                return;
            }
        }
        list.add(cVarZynmafqrjb);
    }

    public Object btonecajqb(final Object obj, final Object obj2, androidx.compose.runtime.draadjrbmk draadjrbmkVar, final int i13) {
        androidx.compose.runtime.draadjrbmk draadjrbmkVarBtonecajqb = draadjrbmkVar.btonecajqb(this.f32444zdlpuopuiu);
        zdlpuopuiu(draadjrbmkVarBtonecajqb);
        int iWkgbmnqykc = draadjrbmkVarBtonecajqb.ulzqkzuiru(this) ? nufgyqmvbu.wkgbmnqykc(2) : nufgyqmvbu.lqeggnwhkg(2);
        Object obj3 = this.f32442jyumaefscl;
        kotlin.jvm.internal.zdlpuopuiu.nufgyqmvbu(obj3, "null cannot be cast to non-null type kotlin.Function4<@[ParameterName(name = \"p1\")] kotlin.Any?, @[ParameterName(name = \"p2\")] kotlin.Any?, @[ParameterName(name = \"c\")] androidx.compose.runtime.Composer, @[ParameterName(name = \"changed\")] kotlin.Int, kotlin.Any?>");
        Object objInvoke = ((tg.oxmwwwfdhm) mbcevpiqjq.eablkybsjg(obj3, 4)).invoke(obj, obj2, draadjrbmkVarBtonecajqb, Integer.valueOf(iWkgbmnqykc | i13));
        a0 a0VarWflxmlrfwp = draadjrbmkVarBtonecajqb.wflxmlrfwp();
        if (a0VarWflxmlrfwp != null) {
            a0VarWflxmlrfwp.iobyxmoadg(new tg.rgvfuqvkyq() { // from class: ezmngbhpjk.ppxfxbqfkf
                @Override // tg.rgvfuqvkyq
                public final Object invoke(Object obj4, Object obj5) {
                    return lqeggnwhkg.ojitshcjhn(this.f32460zdlpuopuiu, obj, obj2, i13, (androidx.compose.runtime.draadjrbmk) obj4, ((Integer) obj5).intValue());
                }
            });
        }
        return objInvoke;
    }

    @Override // tg.zdlpuopuiu
    public /* bridge */ /* synthetic */ Object dxjokdxxww(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
        return wflxmlrfwp(obj, obj2, obj3, obj4, (androidx.compose.runtime.draadjrbmk) obj5, ((Number) obj6).intValue());
    }

    public Object gtknphoqwx(final Object obj, final Object obj2, final Object obj3, androidx.compose.runtime.draadjrbmk draadjrbmkVar, final int i13) {
        androidx.compose.runtime.draadjrbmk draadjrbmkVarBtonecajqb = draadjrbmkVar.btonecajqb(this.f32444zdlpuopuiu);
        zdlpuopuiu(draadjrbmkVarBtonecajqb);
        int iWkgbmnqykc = draadjrbmkVarBtonecajqb.ulzqkzuiru(this) ? nufgyqmvbu.wkgbmnqykc(3) : nufgyqmvbu.lqeggnwhkg(3);
        Object obj4 = this.f32442jyumaefscl;
        kotlin.jvm.internal.zdlpuopuiu.nufgyqmvbu(obj4, "null cannot be cast to non-null type kotlin.Function5<@[ParameterName(name = \"p1\")] kotlin.Any?, @[ParameterName(name = \"p2\")] kotlin.Any?, @[ParameterName(name = \"p3\")] kotlin.Any?, @[ParameterName(name = \"c\")] androidx.compose.runtime.Composer, @[ParameterName(name = \"changed\")] kotlin.Int, kotlin.Any?>");
        Object objInvoke = ((tg.kcexrzcfyt) mbcevpiqjq.eablkybsjg(obj4, 5)).invoke(obj, obj2, obj3, draadjrbmkVarBtonecajqb, Integer.valueOf(iWkgbmnqykc | i13));
        a0 a0VarWflxmlrfwp = draadjrbmkVarBtonecajqb.wflxmlrfwp();
        if (a0VarWflxmlrfwp != null) {
            a0VarWflxmlrfwp.iobyxmoadg(new tg.rgvfuqvkyq() { // from class: ezmngbhpjk.wkgbmnqykc
                @Override // tg.rgvfuqvkyq
                public final Object invoke(Object obj5, Object obj6) {
                    return lqeggnwhkg.oxmwwwfdhm(this.f32469zdlpuopuiu, obj, obj2, obj3, i13, (androidx.compose.runtime.draadjrbmk) obj5, ((Integer) obj6).intValue());
                }
            });
        }
        return objInvoke;
    }

    public Object gxszxtbevo(androidx.compose.runtime.draadjrbmk draadjrbmkVar, int i13) {
        androidx.compose.runtime.draadjrbmk draadjrbmkVarBtonecajqb = draadjrbmkVar.btonecajqb(this.f32444zdlpuopuiu);
        zdlpuopuiu(draadjrbmkVarBtonecajqb);
        int iWkgbmnqykc = i13 | (draadjrbmkVarBtonecajqb.ulzqkzuiru(this) ? nufgyqmvbu.wkgbmnqykc(0) : nufgyqmvbu.lqeggnwhkg(0));
        Object obj = this.f32442jyumaefscl;
        kotlin.jvm.internal.zdlpuopuiu.nufgyqmvbu(obj, "null cannot be cast to non-null type kotlin.Function2<@[ParameterName(name = \"c\")] androidx.compose.runtime.Composer, @[ParameterName(name = \"changed\")] kotlin.Int, kotlin.Any?>");
        Object objInvoke = ((tg.rgvfuqvkyq) mbcevpiqjq.eablkybsjg(obj, 2)).invoke(draadjrbmkVarBtonecajqb, Integer.valueOf(iWkgbmnqykc));
        a0 a0VarWflxmlrfwp = draadjrbmkVarBtonecajqb.wflxmlrfwp();
        if (a0VarWflxmlrfwp != null) {
            a0VarWflxmlrfwp.iobyxmoadg(new iobyxmoadg(this));
        }
        return objInvoke;
    }

    @Override // tg.rgvfuqvkyq
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return gxszxtbevo((androidx.compose.runtime.draadjrbmk) obj, ((Number) obj2).intValue());
    }

    public final void jyumaefscl(Object obj) {
        if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f32442jyumaefscl, obj)) {
            return;
        }
        boolean z13 = this.f32442jyumaefscl == null;
        this.f32442jyumaefscl = obj;
        if (z13) {
            return;
        }
        yggfygwlhe();
    }

    public Object lqeggnwhkg(final Object obj, androidx.compose.runtime.draadjrbmk draadjrbmkVar, final int i13) {
        androidx.compose.runtime.draadjrbmk draadjrbmkVarBtonecajqb = draadjrbmkVar.btonecajqb(this.f32444zdlpuopuiu);
        zdlpuopuiu(draadjrbmkVarBtonecajqb);
        int iWkgbmnqykc = draadjrbmkVarBtonecajqb.ulzqkzuiru(this) ? nufgyqmvbu.wkgbmnqykc(1) : nufgyqmvbu.lqeggnwhkg(1);
        Object obj2 = this.f32442jyumaefscl;
        kotlin.jvm.internal.zdlpuopuiu.nufgyqmvbu(obj2, "null cannot be cast to non-null type kotlin.Function3<@[ParameterName(name = \"p1\")] kotlin.Any?, @[ParameterName(name = \"c\")] androidx.compose.runtime.Composer, @[ParameterName(name = \"changed\")] kotlin.Int, kotlin.Any?>");
        Object objInvoke = ((tg.vdvldrhtss) mbcevpiqjq.eablkybsjg(obj2, 3)).invoke(obj, draadjrbmkVarBtonecajqb, Integer.valueOf(iWkgbmnqykc | i13));
        a0 a0VarWflxmlrfwp = draadjrbmkVarBtonecajqb.wflxmlrfwp();
        if (a0VarWflxmlrfwp != null) {
            a0VarWflxmlrfwp.iobyxmoadg(new tg.rgvfuqvkyq() { // from class: ezmngbhpjk.eablkybsjg
                @Override // tg.rgvfuqvkyq
                public final Object invoke(Object obj3, Object obj4) {
                    return lqeggnwhkg.agtfadlqog(this.f32427zdlpuopuiu, obj, i13, (androidx.compose.runtime.draadjrbmk) obj3, ((Integer) obj4).intValue());
                }
            });
        }
        return objInvoke;
    }

    public Object wflxmlrfwp(final Object obj, final Object obj2, final Object obj3, final Object obj4, androidx.compose.runtime.draadjrbmk draadjrbmkVar, final int i13) {
        androidx.compose.runtime.draadjrbmk draadjrbmkVarBtonecajqb = draadjrbmkVar.btonecajqb(this.f32444zdlpuopuiu);
        zdlpuopuiu(draadjrbmkVarBtonecajqb);
        int iWkgbmnqykc = draadjrbmkVarBtonecajqb.ulzqkzuiru(this) ? nufgyqmvbu.wkgbmnqykc(4) : nufgyqmvbu.lqeggnwhkg(4);
        Object obj5 = this.f32442jyumaefscl;
        kotlin.jvm.internal.zdlpuopuiu.nufgyqmvbu(obj5, "null cannot be cast to non-null type kotlin.Function6<@[ParameterName(name = \"p1\")] kotlin.Any?, @[ParameterName(name = \"p2\")] kotlin.Any?, @[ParameterName(name = \"p3\")] kotlin.Any?, @[ParameterName(name = \"p4\")] kotlin.Any?, @[ParameterName(name = \"c\")] androidx.compose.runtime.Composer, @[ParameterName(name = \"changed\")] kotlin.Int, kotlin.Any?>");
        Object objDxjokdxxww = ((tg.zdlpuopuiu) mbcevpiqjq.eablkybsjg(obj5, 6)).dxjokdxxww(obj, obj2, obj3, obj4, draadjrbmkVarBtonecajqb, Integer.valueOf(iWkgbmnqykc | i13));
        a0 a0VarWflxmlrfwp = draadjrbmkVarBtonecajqb.wflxmlrfwp();
        if (a0VarWflxmlrfwp != null) {
            a0VarWflxmlrfwp.iobyxmoadg(new tg.rgvfuqvkyq() { // from class: ezmngbhpjk.gxszxtbevo
                @Override // tg.rgvfuqvkyq
                public final Object invoke(Object obj6, Object obj7) {
                    return lqeggnwhkg.kcexrzcfyt(this.f32435zdlpuopuiu, obj, obj2, obj3, obj4, i13, (androidx.compose.runtime.draadjrbmk) obj6, ((Integer) obj7).intValue());
                }
            });
        }
        return objDxjokdxxww;
    }

    @Override // tg.vdvldrhtss
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        return lqeggnwhkg(obj, (androidx.compose.runtime.draadjrbmk) obj2, ((Number) obj3).intValue());
    }

    @Override // tg.oxmwwwfdhm
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        return btonecajqb(obj, obj2, (androidx.compose.runtime.draadjrbmk) obj3, ((Number) obj4).intValue());
    }

    @Override // tg.kcexrzcfyt
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        return gtknphoqwx(obj, obj2, obj3, (androidx.compose.runtime.draadjrbmk) obj4, ((Number) obj5).intValue());
    }
}
