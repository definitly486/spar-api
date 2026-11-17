package d40;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.jpowsppfya;
import androidx.lifecycle.ribwqtqdhb;
import gg.wwaezpbzkn;
import gg.zdlpuopuiu;
import hg.jyumaefscl;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import kotlin.NoWhenBranchMatchedException;
import pj.cllcsxoeiz;
import pj.dsvhmnatus;
import pj.hcddaimhww;
import pj.ikoacuggdj;
import pj.krqnebusok;
import ru.myspar.core.navigation.model.NavigationPayload;
import ru.myspar.core.ui.model.MainTab;

/* JADX INFO: loaded from: classes4.dex */
public final class iobyxmoadg {

    /* JADX INFO: renamed from: agtfadlqog, reason: collision with root package name */
    private static final cllcsxoeiz f26924agtfadlqog;

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private static tg.iobyxmoadg f26928eablkybsjg;

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    private static tg.iobyxmoadg f26930gxszxtbevo;

    /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
    private static tg.iobyxmoadg f26932lqeggnwhkg;

    /* JADX INFO: renamed from: nufgyqmvbu, reason: collision with root package name */
    private static tg.iobyxmoadg f26933nufgyqmvbu;

    /* JADX INFO: renamed from: ojitshcjhn, reason: collision with root package name */
    public static final int f26934ojitshcjhn;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private static tg.iobyxmoadg f26935ppxfxbqfkf;

    /* JADX INFO: renamed from: wflxmlrfwp, reason: collision with root package name */
    private static final hcddaimhww f26936wflxmlrfwp;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private static tg.iobyxmoadg f26937wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private static FragmentManager f26938zoijcleaow;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    public static final iobyxmoadg f26931iobyxmoadg = new iobyxmoadg();

    /* JADX INFO: renamed from: dxjokdxxww, reason: collision with root package name */
    private static final List f26927dxjokdxxww = jyumaefscl.kcexrzcfyt(MainTab.MY_SPAR);

    /* JADX INFO: renamed from: btonecajqb, reason: collision with root package name */
    private static final rj.lqeggnwhkg f26925btonecajqb = rj.btonecajqb.zoijcleaow(0, null, null, 7, null);

    /* JADX INFO: renamed from: gtknphoqwx, reason: collision with root package name */
    private static final rj.lqeggnwhkg f26929gtknphoqwx = rj.btonecajqb.zoijcleaow(0, null, null, 7, null);

    /* JADX INFO: renamed from: draadjrbmk, reason: collision with root package name */
    private static final rj.lqeggnwhkg f26926draadjrbmk = rj.btonecajqb.zoijcleaow(0, null, null, 7, null);

    static final class agtfadlqog extends kotlin.coroutines.jvm.internal.draadjrbmk implements tg.draadjrbmk {

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        final /* synthetic */ MainTab f26939yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        int f26940zdlpuopuiu;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        agtfadlqog(MainTab mainTab, lg.gxszxtbevo gxszxtbevoVar) {
            super(1, gxszxtbevoVar);
            this.f26939yggfygwlhe = mainTab;
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final lg.gxszxtbevo create(lg.gxszxtbevo gxszxtbevoVar) {
            return new agtfadlqog(this.f26939yggfygwlhe, gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            mg.zoijcleaow.gxszxtbevo();
            if (this.f26940zdlpuopuiu != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            zdlpuopuiu.zoijcleaow(obj);
            iobyxmoadg.f26927dxjokdxxww.add(this.f26939yggfygwlhe);
            return wwaezpbzkn.f37140iobyxmoadg;
        }

        @Override // tg.draadjrbmk
        public final Object invoke(lg.gxszxtbevo gxszxtbevoVar) {
            return ((agtfadlqog) create(gxszxtbevoVar)).invokeSuspend(wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    static final class btonecajqb extends kotlin.coroutines.jvm.internal.draadjrbmk implements tg.draadjrbmk {

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        final /* synthetic */ Fragment f26941yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        int f26942zdlpuopuiu;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        btonecajqb(Fragment fragment, lg.gxszxtbevo gxszxtbevoVar) {
            super(1, gxszxtbevoVar);
            this.f26941yggfygwlhe = fragment;
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final lg.gxszxtbevo create(lg.gxszxtbevo gxszxtbevoVar) {
            return new btonecajqb(this.f26941yggfygwlhe, gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            mg.zoijcleaow.gxszxtbevo();
            if (this.f26942zdlpuopuiu != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            zdlpuopuiu.zoijcleaow(obj);
            ribwqtqdhb ribwqtqdhbVar = this.f26941yggfygwlhe;
            f40.eablkybsjg eablkybsjgVar = ribwqtqdhbVar instanceof f40.eablkybsjg ? (f40.eablkybsjg) ribwqtqdhbVar : null;
            if (eablkybsjgVar != null) {
                eablkybsjgVar.lqeggnwhkg();
            }
            return wwaezpbzkn.f37140iobyxmoadg;
        }

        @Override // tg.draadjrbmk
        public final Object invoke(lg.gxszxtbevo gxszxtbevoVar) {
            return ((btonecajqb) create(gxszxtbevoVar)).invokeSuspend(wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    static final class draadjrbmk extends kotlin.coroutines.jvm.internal.draadjrbmk implements tg.draadjrbmk {

        /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
        final /* synthetic */ Fragment f26943iwizpuwonk;

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        final /* synthetic */ List f26944jyumaefscl;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        final /* synthetic */ b40.wkgbmnqykc f26945yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        int f26946zdlpuopuiu;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        draadjrbmk(b40.wkgbmnqykc wkgbmnqykcVar, List list, Fragment fragment, lg.gxszxtbevo gxszxtbevoVar) {
            super(1, gxszxtbevoVar);
            this.f26945yggfygwlhe = wkgbmnqykcVar;
            this.f26944jyumaefscl = list;
            this.f26943iwizpuwonk = fragment;
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final lg.gxszxtbevo create(lg.gxszxtbevo gxszxtbevoVar) {
            return new draadjrbmk(this.f26945yggfygwlhe, this.f26944jyumaefscl, this.f26943iwizpuwonk, gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
            int i13 = this.f26946zdlpuopuiu;
            if (i13 == 0) {
                zdlpuopuiu.zoijcleaow(obj);
                b40.wkgbmnqykc wkgbmnqykcVar = this.f26945yggfygwlhe;
                l9.vdvldrhtss[] vdvldrhtssVarArr = (l9.vdvldrhtss[]) this.f26944jyumaefscl.toArray(new l9.vdvldrhtss[0]);
                wkgbmnqykcVar.nufgyqmvbu((l9.vdvldrhtss[]) Arrays.copyOf(vdvldrhtssVarArr, vdvldrhtssVarArr.length));
                Fragment fragment = this.f26943iwizpuwonk;
                l9.vdvldrhtss vdvldrhtssVar = (l9.vdvldrhtss) jyumaefscl.lxfrhoxuzk(this.f26944jyumaefscl);
                String strWkgbmnqykc = vdvldrhtssVar != null ? vdvldrhtssVar.wkgbmnqykc() : null;
                this.f26946zdlpuopuiu = 1;
                if (i40.iobyxmoadg.ppxfxbqfkf(fragment, strWkgbmnqykc, this) == objGxszxtbevo) {
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

        @Override // tg.draadjrbmk
        public final Object invoke(lg.gxszxtbevo gxszxtbevoVar) {
            return ((draadjrbmk) create(gxszxtbevoVar)).invokeSuspend(wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    static final class dxjokdxxww extends kotlin.coroutines.jvm.internal.draadjrbmk implements tg.draadjrbmk {

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        final /* synthetic */ List f26947jyumaefscl;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        final /* synthetic */ Fragment f26948yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        int f26949zdlpuopuiu;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        dxjokdxxww(Fragment fragment, List list, lg.gxszxtbevo gxszxtbevoVar) {
            super(1, gxszxtbevoVar);
            this.f26948yggfygwlhe = fragment;
            this.f26947jyumaefscl = list;
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final lg.gxszxtbevo create(lg.gxszxtbevo gxszxtbevoVar) {
            return new dxjokdxxww(this.f26948yggfygwlhe, this.f26947jyumaefscl, gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            mg.zoijcleaow.gxszxtbevo();
            if (this.f26949zdlpuopuiu != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            zdlpuopuiu.zoijcleaow(obj);
            ribwqtqdhb ribwqtqdhbVar = this.f26948yggfygwlhe;
            f40.eablkybsjg eablkybsjgVar = ribwqtqdhbVar instanceof f40.eablkybsjg ? (f40.eablkybsjg) ribwqtqdhbVar : null;
            if (eablkybsjgVar != null) {
                eablkybsjgVar.wkgbmnqykc(this.f26947jyumaefscl);
            }
            return wwaezpbzkn.f37140iobyxmoadg;
        }

        @Override // tg.draadjrbmk
        public final Object invoke(lg.gxszxtbevo gxszxtbevoVar) {
            return ((dxjokdxxww) create(gxszxtbevoVar)).invokeSuspend(wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    static final class eablkybsjg extends kotlin.coroutines.jvm.internal.draadjrbmk implements tg.draadjrbmk {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        int f26950zdlpuopuiu;

        eablkybsjg(lg.gxszxtbevo gxszxtbevoVar) {
            super(1, gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final lg.gxszxtbevo create(lg.gxszxtbevo gxszxtbevoVar) {
            return new eablkybsjg(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            mg.zoijcleaow.gxszxtbevo();
            if (this.f26950zdlpuopuiu != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            zdlpuopuiu.zoijcleaow(obj);
            iobyxmoadg.f26931iobyxmoadg.oxmwwwfdhm().eablkybsjg(null);
            return wwaezpbzkn.f37140iobyxmoadg;
        }

        @Override // tg.draadjrbmk
        public final Object invoke(lg.gxszxtbevo gxszxtbevoVar) {
            return ((eablkybsjg) create(gxszxtbevoVar)).invokeSuspend(wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    static final class gtknphoqwx extends kotlin.coroutines.jvm.internal.draadjrbmk implements tg.draadjrbmk {

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        final /* synthetic */ b40.wkgbmnqykc f26951yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        int f26952zdlpuopuiu;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        gtknphoqwx(b40.wkgbmnqykc wkgbmnqykcVar, lg.gxszxtbevo gxszxtbevoVar) {
            super(1, gxszxtbevoVar);
            this.f26951yggfygwlhe = wkgbmnqykcVar;
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final lg.gxszxtbevo create(lg.gxszxtbevo gxszxtbevoVar) {
            return new gtknphoqwx(this.f26951yggfygwlhe, gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            mg.zoijcleaow.gxszxtbevo();
            if (this.f26952zdlpuopuiu != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            zdlpuopuiu.zoijcleaow(obj);
            this.f26951yggfygwlhe.eablkybsjg(null);
            return wwaezpbzkn.f37140iobyxmoadg;
        }

        @Override // tg.draadjrbmk
        public final Object invoke(lg.gxszxtbevo gxszxtbevoVar) {
            return ((gtknphoqwx) create(gxszxtbevoVar)).invokeSuspend(wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    static final class gxszxtbevo extends kotlin.coroutines.jvm.internal.draadjrbmk implements tg.rgvfuqvkyq {

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        final /* synthetic */ boolean f26953jyumaefscl;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        final /* synthetic */ MainTab f26954yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        int f26955zdlpuopuiu;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        gxszxtbevo(MainTab mainTab, boolean z13, lg.gxszxtbevo gxszxtbevoVar) {
            super(2, gxszxtbevoVar);
            this.f26954yggfygwlhe = mainTab;
            this.f26953jyumaefscl = z13;
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
            return new gxszxtbevo(this.f26954yggfygwlhe, this.f26953jyumaefscl, gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
            int i13 = this.f26955zdlpuopuiu;
            if (i13 == 0) {
                zdlpuopuiu.zoijcleaow(obj);
                rj.lqeggnwhkg lqeggnwhkgVar = iobyxmoadg.f26926draadjrbmk;
                C0491iobyxmoadg c0491iobyxmoadg = new C0491iobyxmoadg(this.f26954yggfygwlhe, this.f26953jyumaefscl, null, false, 12, null);
                this.f26955zdlpuopuiu = 1;
                if (lqeggnwhkgVar.gxszxtbevo(c0491iobyxmoadg, this) == objGxszxtbevo) {
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
        public final Object invoke(cllcsxoeiz cllcsxoeizVar, lg.gxszxtbevo gxszxtbevoVar) {
            return ((gxszxtbevo) create(cllcsxoeizVar, gxszxtbevoVar)).invokeSuspend(wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    public static final class kcexrzcfyt implements sj.lqeggnwhkg {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final /* synthetic */ sj.lqeggnwhkg f26960zdlpuopuiu;

        /* JADX INFO: renamed from: d40.iobyxmoadg$kcexrzcfyt$iobyxmoadg, reason: collision with other inner class name */
        public static final class C0492iobyxmoadg implements sj.nufgyqmvbu {

            /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
            final /* synthetic */ sj.nufgyqmvbu f26961zdlpuopuiu;

            /* JADX INFO: renamed from: d40.iobyxmoadg$kcexrzcfyt$iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
            public static final class C0493iobyxmoadg extends kotlin.coroutines.jvm.internal.wkgbmnqykc {

                /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
                Object f26962cqumvgiudr;

                /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
                Object f26964jyumaefscl;

                /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
                int f26965yggfygwlhe;

                /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
                /* synthetic */ Object f26966zdlpuopuiu;

                public C0493iobyxmoadg(lg.gxszxtbevo gxszxtbevoVar) {
                    super(gxszxtbevoVar);
                }

                @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
                public final Object invokeSuspend(Object obj) {
                    this.f26966zdlpuopuiu = obj;
                    this.f26965yggfygwlhe |= Integer.MIN_VALUE;
                    return C0492iobyxmoadg.this.emit(null, this);
                }
            }

            public C0492iobyxmoadg(sj.nufgyqmvbu nufgyqmvbuVar) {
                this.f26961zdlpuopuiu = nufgyqmvbuVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // sj.nufgyqmvbu
            public final Object emit(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
                C0493iobyxmoadg c0493iobyxmoadg;
                C0491iobyxmoadg c0491iobyxmoadg;
                sj.nufgyqmvbu nufgyqmvbuVar;
                if (gxszxtbevoVar instanceof C0493iobyxmoadg) {
                    c0493iobyxmoadg = (C0493iobyxmoadg) gxszxtbevoVar;
                    int i13 = c0493iobyxmoadg.f26965yggfygwlhe;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        c0493iobyxmoadg.f26965yggfygwlhe = i13 - Integer.MIN_VALUE;
                    } else {
                        c0493iobyxmoadg = new C0493iobyxmoadg(gxszxtbevoVar);
                    }
                } else {
                    c0493iobyxmoadg = new C0493iobyxmoadg(gxszxtbevoVar);
                }
                Object obj2 = c0493iobyxmoadg.f26966zdlpuopuiu;
                Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
                int i14 = c0493iobyxmoadg.f26965yggfygwlhe;
                if (i14 != 0) {
                    if (i14 == 1) {
                        c0491iobyxmoadg = (C0491iobyxmoadg) c0493iobyxmoadg.f26962cqumvgiudr;
                        nufgyqmvbuVar = (sj.nufgyqmvbu) c0493iobyxmoadg.f26964jyumaefscl;
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
                sj.nufgyqmvbu nufgyqmvbuVar2 = this.f26961zdlpuopuiu;
                c0491iobyxmoadg = (C0491iobyxmoadg) obj;
                iobyxmoadg iobyxmoadgVar = iobyxmoadg.f26931iobyxmoadg;
                FragmentManager fragmentManager = iobyxmoadg.f26938zoijcleaow;
                if (fragmentManager == null) {
                    kotlin.jvm.internal.zdlpuopuiu.pmvmpeiblj("fragmentManager");
                    fragmentManager = null;
                }
                MainTab mainTabPpxfxbqfkf = c0491iobyxmoadg.ppxfxbqfkf();
                boolean zZoijcleaow = c0491iobyxmoadg.zoijcleaow();
                List listIobyxmoadg = c0491iobyxmoadg.iobyxmoadg();
                boolean zWkgbmnqykc = c0491iobyxmoadg.wkgbmnqykc();
                c0493iobyxmoadg.f26964jyumaefscl = nufgyqmvbuVar2;
                c0493iobyxmoadg.f26962cqumvgiudr = c0491iobyxmoadg;
                c0493iobyxmoadg.f26965yggfygwlhe = 1;
                if (iobyxmoadgVar.cdpycssgdh(fragmentManager, mainTabPpxfxbqfkf, zZoijcleaow, listIobyxmoadg, zWkgbmnqykc, c0493iobyxmoadg) == objGxszxtbevo) {
                    return objGxszxtbevo;
                }
                nufgyqmvbuVar = nufgyqmvbuVar2;
                MainTab mainTabPpxfxbqfkf2 = c0491iobyxmoadg.ppxfxbqfkf();
                f40.gxszxtbevo.zoijcleaow zoijcleaowVar = mainTabPpxfxbqfkf2 != null ? new f40.gxszxtbevo.zoijcleaow(mainTabPpxfxbqfkf2) : null;
                if (zoijcleaowVar != null) {
                    c0493iobyxmoadg.f26964jyumaefscl = null;
                    c0493iobyxmoadg.f26962cqumvgiudr = null;
                    c0493iobyxmoadg.f26965yggfygwlhe = 2;
                    if (nufgyqmvbuVar.emit(zoijcleaowVar, c0493iobyxmoadg) == objGxszxtbevo) {
                        return objGxszxtbevo;
                    }
                }
                return wwaezpbzkn.f37140iobyxmoadg;
            }
        }

        public kcexrzcfyt(sj.lqeggnwhkg lqeggnwhkgVar) {
            this.f26960zdlpuopuiu = lqeggnwhkgVar;
        }

        @Override // sj.lqeggnwhkg
        public Object collect(sj.nufgyqmvbu nufgyqmvbuVar, lg.gxszxtbevo gxszxtbevoVar) {
            Object objCollect = this.f26960zdlpuopuiu.collect(new C0492iobyxmoadg(nufgyqmvbuVar), gxszxtbevoVar);
            return objCollect == mg.zoijcleaow.gxszxtbevo() ? objCollect : wwaezpbzkn.f37140iobyxmoadg;
        }
    }

    static final class lqeggnwhkg extends kotlin.coroutines.jvm.internal.wkgbmnqykc {

        /* JADX INFO: renamed from: cdpycssgdh, reason: collision with root package name */
        int f26967cdpycssgdh;

        /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
        Object f26968cqumvgiudr;

        /* JADX INFO: renamed from: esjtqupxsv, reason: collision with root package name */
        boolean f26969esjtqupxsv;

        /* JADX INFO: renamed from: iozdgvuglv, reason: collision with root package name */
        /* synthetic */ Object f26970iozdgvuglv;

        /* JADX INFO: renamed from: istkbnxepw, reason: collision with root package name */
        int f26971istkbnxepw;

        /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
        Object f26972iwizpuwonk;

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        Object f26973jyumaefscl;

        /* JADX INFO: renamed from: lereixgezr, reason: collision with root package name */
        boolean f26974lereixgezr;

        /* JADX INFO: renamed from: pmvmpeiblj, reason: collision with root package name */
        boolean f26976pmvmpeiblj;

        /* JADX INFO: renamed from: wwaezpbzkn, reason: collision with root package name */
        int f26977wwaezpbzkn;

        /* JADX INFO: renamed from: yadqdtsiqt, reason: collision with root package name */
        int f26978yadqdtsiqt;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        Object f26979yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        Object f26980zdlpuopuiu;

        /* JADX INFO: renamed from: zynmafqrjb, reason: collision with root package name */
        int f26981zynmafqrjb;

        lqeggnwhkg(lg.gxszxtbevo gxszxtbevoVar) {
            super(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            this.f26970iozdgvuglv = obj;
            this.f26977wwaezpbzkn |= Integer.MIN_VALUE;
            return iobyxmoadg.this.cdpycssgdh(null, null, false, null, false, this);
        }
    }

    static final class nufgyqmvbu extends kotlin.coroutines.jvm.internal.draadjrbmk implements tg.draadjrbmk {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        int f26982zdlpuopuiu;

        nufgyqmvbu(lg.gxszxtbevo gxszxtbevoVar) {
            super(1, gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final lg.gxszxtbevo create(lg.gxszxtbevo gxszxtbevoVar) {
            return new nufgyqmvbu(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            mg.zoijcleaow.gxszxtbevo();
            if (this.f26982zdlpuopuiu != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            zdlpuopuiu.zoijcleaow(obj);
            iobyxmoadg.f26931iobyxmoadg.zdlpuopuiu();
            return wwaezpbzkn.f37140iobyxmoadg;
        }

        @Override // tg.draadjrbmk
        public final Object invoke(lg.gxszxtbevo gxszxtbevoVar) {
            return ((nufgyqmvbu) create(gxszxtbevoVar)).invokeSuspend(wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    static final class ojitshcjhn extends kotlin.coroutines.jvm.internal.draadjrbmk implements tg.rgvfuqvkyq {

        /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
        final /* synthetic */ l9.vdvldrhtss f26983iwizpuwonk;

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        final /* synthetic */ boolean f26984jyumaefscl;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        final /* synthetic */ MainTab f26985yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        int f26986zdlpuopuiu;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        ojitshcjhn(MainTab mainTab, boolean z13, l9.vdvldrhtss vdvldrhtssVar, lg.gxszxtbevo gxszxtbevoVar) {
            super(2, gxszxtbevoVar);
            this.f26985yggfygwlhe = mainTab;
            this.f26984jyumaefscl = z13;
            this.f26983iwizpuwonk = vdvldrhtssVar;
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
            return new ojitshcjhn(this.f26985yggfygwlhe, this.f26984jyumaefscl, this.f26983iwizpuwonk, gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
            int i13 = this.f26986zdlpuopuiu;
            if (i13 == 0) {
                zdlpuopuiu.zoijcleaow(obj);
                rj.lqeggnwhkg lqeggnwhkgVar = iobyxmoadg.f26926draadjrbmk;
                C0491iobyxmoadg c0491iobyxmoadg = new C0491iobyxmoadg(this.f26985yggfygwlhe, this.f26984jyumaefscl, jyumaefscl.eablkybsjg(this.f26983iwizpuwonk), false, 8, null);
                this.f26986zdlpuopuiu = 1;
                if (lqeggnwhkgVar.gxszxtbevo(c0491iobyxmoadg, this) == objGxszxtbevo) {
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
        public final Object invoke(cllcsxoeiz cllcsxoeizVar, lg.gxszxtbevo gxszxtbevoVar) {
            return ((ojitshcjhn) create(cllcsxoeizVar, gxszxtbevoVar)).invokeSuspend(wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    public static final class oxmwwwfdhm extends lg.iobyxmoadg implements hcddaimhww {
        public oxmwwwfdhm(hcddaimhww.zoijcleaow zoijcleaowVar) {
            super(zoijcleaowVar);
        }

        @Override // pj.hcddaimhww
        public void handleException(lg.btonecajqb btonecajqbVar, Throwable th2) {
            q30.iobyxmoadg.f77790iobyxmoadg.zoijcleaow(th2);
        }
    }

    static final class ppxfxbqfkf extends kotlin.coroutines.jvm.internal.draadjrbmk implements tg.rgvfuqvkyq {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        int f26987zdlpuopuiu;

        ppxfxbqfkf(lg.gxszxtbevo gxszxtbevoVar) {
            super(2, gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
            return new ppxfxbqfkf(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
            int i13 = this.f26987zdlpuopuiu;
            if (i13 == 0) {
                zdlpuopuiu.zoijcleaow(obj);
                rj.lqeggnwhkg lqeggnwhkgVar = iobyxmoadg.f26926draadjrbmk;
                C0491iobyxmoadg c0491iobyxmoadg = new C0491iobyxmoadg(iobyxmoadg.f26931iobyxmoadg.vdvldrhtss(), false, null, true, 4, null);
                this.f26987zdlpuopuiu = 1;
                if (lqeggnwhkgVar.gxszxtbevo(c0491iobyxmoadg, this) == objGxszxtbevo) {
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
        public final Object invoke(cllcsxoeiz cllcsxoeizVar, lg.gxszxtbevo gxszxtbevoVar) {
            return ((ppxfxbqfkf) create(cllcsxoeizVar, gxszxtbevoVar)).invokeSuspend(wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    static final class rgvfuqvkyq extends kotlin.coroutines.jvm.internal.draadjrbmk implements tg.rgvfuqvkyq {

        /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
        final /* synthetic */ List f26988iwizpuwonk;

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        final /* synthetic */ boolean f26989jyumaefscl;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        final /* synthetic */ MainTab f26990yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        int f26991zdlpuopuiu;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        rgvfuqvkyq(MainTab mainTab, boolean z13, List list, lg.gxszxtbevo gxszxtbevoVar) {
            super(2, gxszxtbevoVar);
            this.f26990yggfygwlhe = mainTab;
            this.f26989jyumaefscl = z13;
            this.f26988iwizpuwonk = list;
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
            return new rgvfuqvkyq(this.f26990yggfygwlhe, this.f26989jyumaefscl, this.f26988iwizpuwonk, gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
            int i13 = this.f26991zdlpuopuiu;
            if (i13 == 0) {
                zdlpuopuiu.zoijcleaow(obj);
                rj.lqeggnwhkg lqeggnwhkgVar = iobyxmoadg.f26926draadjrbmk;
                C0491iobyxmoadg c0491iobyxmoadg = new C0491iobyxmoadg(this.f26990yggfygwlhe, this.f26989jyumaefscl, this.f26988iwizpuwonk, false, 8, null);
                this.f26991zdlpuopuiu = 1;
                if (lqeggnwhkgVar.gxszxtbevo(c0491iobyxmoadg, this) == objGxszxtbevo) {
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
        public final Object invoke(cllcsxoeiz cllcsxoeizVar, lg.gxszxtbevo gxszxtbevoVar) {
            return ((rgvfuqvkyq) create(cllcsxoeizVar, gxszxtbevoVar)).invokeSuspend(wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    static final class vdvldrhtss extends kotlin.coroutines.jvm.internal.draadjrbmk implements tg.rgvfuqvkyq {

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        final /* synthetic */ NavigationPayload f26992yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        int f26993zdlpuopuiu;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        vdvldrhtss(NavigationPayload navigationPayload, lg.gxszxtbevo gxszxtbevoVar) {
            super(2, gxszxtbevoVar);
            this.f26992yggfygwlhe = navigationPayload;
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
            return new vdvldrhtss(this.f26992yggfygwlhe, gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
            int i13 = this.f26993zdlpuopuiu;
            if (i13 == 0) {
                zdlpuopuiu.zoijcleaow(obj);
                rj.lqeggnwhkg lqeggnwhkgVar = iobyxmoadg.f26925btonecajqb;
                NavigationPayload navigationPayload = this.f26992yggfygwlhe;
                this.f26993zdlpuopuiu = 1;
                if (lqeggnwhkgVar.gxszxtbevo(navigationPayload, this) == objGxszxtbevo) {
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
        public final Object invoke(cllcsxoeiz cllcsxoeizVar, lg.gxszxtbevo gxszxtbevoVar) {
            return ((vdvldrhtss) create(cllcsxoeizVar, gxszxtbevoVar)).invokeSuspend(wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    static final class wflxmlrfwp extends kotlin.coroutines.jvm.internal.draadjrbmk implements tg.draadjrbmk {

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        final /* synthetic */ MainTab f26994yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        int f26995zdlpuopuiu;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        wflxmlrfwp(MainTab mainTab, lg.gxszxtbevo gxszxtbevoVar) {
            super(1, gxszxtbevoVar);
            this.f26994yggfygwlhe = mainTab;
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final lg.gxszxtbevo create(lg.gxszxtbevo gxszxtbevoVar) {
            return new wflxmlrfwp(this.f26994yggfygwlhe, gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            mg.zoijcleaow.gxszxtbevo();
            if (this.f26995zdlpuopuiu != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            zdlpuopuiu.zoijcleaow(obj);
            iobyxmoadg.f26931iobyxmoadg.hcddaimhww(this.f26994yggfygwlhe);
            return wwaezpbzkn.f37140iobyxmoadg;
        }

        @Override // tg.draadjrbmk
        public final Object invoke(lg.gxszxtbevo gxszxtbevoVar) {
            return ((wflxmlrfwp) create(gxszxtbevoVar)).invokeSuspend(wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    static final class wkgbmnqykc extends kotlin.coroutines.jvm.internal.draadjrbmk implements tg.rgvfuqvkyq {

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        final /* synthetic */ boolean f26996yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        int f26997zdlpuopuiu;

        /* JADX INFO: renamed from: d40.iobyxmoadg$wkgbmnqykc$iobyxmoadg, reason: collision with other inner class name */
        static final class C0494iobyxmoadg extends kotlin.coroutines.jvm.internal.draadjrbmk implements tg.draadjrbmk {

            /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
            final /* synthetic */ boolean f26998yggfygwlhe;

            /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
            int f26999zdlpuopuiu;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0494iobyxmoadg(boolean z13, lg.gxszxtbevo gxszxtbevoVar) {
                super(1, gxszxtbevoVar);
                this.f26998yggfygwlhe = z13;
            }

            @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
            public final lg.gxszxtbevo create(lg.gxszxtbevo gxszxtbevoVar) {
                return new C0494iobyxmoadg(this.f26998yggfygwlhe, gxszxtbevoVar);
            }

            @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
            public final Object invokeSuspend(Object obj) {
                mg.zoijcleaow.gxszxtbevo();
                if (this.f26999zdlpuopuiu != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                zdlpuopuiu.zoijcleaow(obj);
                iobyxmoadg iobyxmoadgVar = iobyxmoadg.f26931iobyxmoadg;
                iobyxmoadgVar.agtfadlqog(iobyxmoadgVar.vdvldrhtss(), this.f26998yggfygwlhe);
                return wwaezpbzkn.f37140iobyxmoadg;
            }

            @Override // tg.draadjrbmk
            public final Object invoke(lg.gxszxtbevo gxszxtbevoVar) {
                return ((C0494iobyxmoadg) create(gxszxtbevoVar)).invokeSuspend(wwaezpbzkn.f37140iobyxmoadg);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        wkgbmnqykc(boolean z13, lg.gxszxtbevo gxszxtbevoVar) {
            super(2, gxszxtbevoVar);
            this.f26996yggfygwlhe = z13;
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
            return new wkgbmnqykc(this.f26996yggfygwlhe, gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            FragmentManager fragmentManager;
            Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
            int i13 = this.f26997zdlpuopuiu;
            if (i13 != 0) {
                if (i13 == 1) {
                    zdlpuopuiu.zoijcleaow(obj);
                } else {
                    if (i13 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    zdlpuopuiu.zoijcleaow(obj);
                }
                return wwaezpbzkn.f37140iobyxmoadg;
            }
            zdlpuopuiu.zoijcleaow(obj);
            rj.lqeggnwhkg lqeggnwhkgVar = iobyxmoadg.f26929gtknphoqwx;
            f40.gxszxtbevo.iobyxmoadg iobyxmoadgVar = new f40.gxszxtbevo.iobyxmoadg(this.f26996yggfygwlhe);
            this.f26997zdlpuopuiu = 1;
            if (lqeggnwhkgVar.gxszxtbevo(iobyxmoadgVar, this) == objGxszxtbevo) {
                return objGxszxtbevo;
            }
            FragmentManager fragmentManager2 = iobyxmoadg.f26938zoijcleaow;
            if (fragmentManager2 == null) {
                kotlin.jvm.internal.zdlpuopuiu.pmvmpeiblj("fragmentManager");
                fragmentManager = null;
            } else {
                fragmentManager = fragmentManager2;
            }
            C0494iobyxmoadg c0494iobyxmoadg = new C0494iobyxmoadg(this.f26996yggfygwlhe, null);
            this.f26997zdlpuopuiu = 2;
            if (i40.iobyxmoadg.zoijcleaow(fragmentManager, false, c0494iobyxmoadg, this, 1, null) == objGxszxtbevo) {
                return objGxszxtbevo;
            }
            return wwaezpbzkn.f37140iobyxmoadg;
        }

        @Override // tg.rgvfuqvkyq
        public final Object invoke(cllcsxoeiz cllcsxoeizVar, lg.gxszxtbevo gxszxtbevoVar) {
            return ((wkgbmnqykc) create(cllcsxoeizVar, gxszxtbevoVar)).invokeSuspend(wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    public /* synthetic */ class zoijcleaow {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final /* synthetic */ int[] f27000iobyxmoadg;

        static {
            int[] iArr = new int[MainTab.values().length];
            try {
                iArr[MainTab.MY_SPAR.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[MainTab.CATALOG.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[MainTab.SUPPORT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[MainTab.CART.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[MainTab.PROFILE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            f27000iobyxmoadg = iArr;
        }
    }

    static {
        oxmwwwfdhm oxmwwwfdhmVar = new oxmwwwfdhm(hcddaimhww.f76711btonecajqb);
        f26936wflxmlrfwp = oxmwwwfdhmVar;
        f26924agtfadlqog = dsvhmnatus.iobyxmoadg(ikoacuggdj.ppxfxbqfkf().xrmfcynszj().plus(krqnebusok.zoijcleaow(null, 1, null)).plus(oxmwwwfdhmVar));
        f26934ojitshcjhn = 8;
    }

    private iobyxmoadg() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void agtfadlqog(MainTab mainTab, boolean z13) {
        if (iwizpuwonk()) {
            Fragment fragmentIobyxmoadg = cllcsxoeiz(mainTab).iobyxmoadg();
            tg.iobyxmoadg iobyxmoadgVar = f26933nufgyqmvbu;
            FragmentManager fragmentManager = null;
            if (iobyxmoadgVar == null) {
                kotlin.jvm.internal.zdlpuopuiu.pmvmpeiblj("globalContainer");
                iobyxmoadgVar = null;
            }
            Fragment fragmentIobyxmoadg2 = ((f40.iobyxmoadg) iobyxmoadgVar.invoke()).iobyxmoadg();
            FragmentManager fragmentManager2 = f26938zoijcleaow;
            if (fragmentManager2 == null) {
                kotlin.jvm.internal.zdlpuopuiu.pmvmpeiblj("fragmentManager");
            } else {
                fragmentManager = fragmentManager2;
            }
            jpowsppfya jpowsppfyaVarKcexrzcfyt = fragmentManager.kcexrzcfyt();
            if (z13) {
                jpowsppfyaVarKcexrzcfyt.esjtqupxsv(fragmentIobyxmoadg);
                jpowsppfyaVarKcexrzcfyt.ojitshcjhn(fragmentIobyxmoadg2);
            } else {
                jpowsppfyaVarKcexrzcfyt.esjtqupxsv(fragmentIobyxmoadg2);
                jpowsppfyaVarKcexrzcfyt.ojitshcjhn(fragmentIobyxmoadg);
            }
            jpowsppfyaVarKcexrzcfyt.dxjokdxxww();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:102:0x029a A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:105:0x02bb A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:47:0x0187  */
    /* JADX WARN: Code duplicated, block: B:52:0x0190  */
    /* JADX WARN: Code duplicated, block: B:55:0x01b6 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:56:0x01b7  */
    /* JADX WARN: Code duplicated, block: B:58:0x01c9 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:62:0x01d1  */
    /* JADX WARN: Code duplicated, block: B:65:0x01f9 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:66:0x01fa  */
    /* JADX WARN: Code duplicated, block: B:68:0x0205 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:69:0x0207 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:78:0x0235 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:79:0x0236  */
    /* JADX WARN: Code duplicated, block: B:7:0x001b  */
    /* JADX WARN: Code duplicated, block: B:81:0x0239 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:83:0x023d  */
    /* JADX WARN: Code duplicated, block: B:86:0x025b A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:87:0x025c  */
    /* JADX WARN: Code duplicated, block: B:89:0x0262 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:92:0x0267  */
    /* JADX WARN: Code duplicated, block: B:95:0x027f A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:97:0x0282 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:99:0x0286  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v11 */
    /* JADX WARN: Type inference failed for: r1v28 */
    /* JADX WARN: Type inference failed for: r1v29 */
    /* JADX WARN: Type inference failed for: r1v30 */
    /* JADX WARN: Type inference failed for: r1v31 */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r1v6 */
    /* JADX WARN: Type inference failed for: r1v8, types: [int] */
    /* JADX WARN: Type inference failed for: r8v6 */
    /* JADX WARN: Type inference failed for: r8v7, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r8v9 */
    /* JADX WARN: Type inference failed for: r9v12 */
    /* JADX WARN: Type inference failed for: r9v14 */
    /* JADX WARN: Type inference failed for: r9v9 */
    public final Object cdpycssgdh(FragmentManager fragmentManager, MainTab mainTab, boolean z13, List list, boolean z14, lg.gxszxtbevo gxszxtbevoVar) {
        lqeggnwhkg lqeggnwhkgVar;
        MainTab mainTabVdvldrhtss;
        boolean z15;
        boolean z16;
        b40.wkgbmnqykc wkgbmnqykcVar;
        int i13;
        List list2;
        FragmentManager fragmentManager2;
        int i14;
        Fragment fragment;
        boolean z17;
        boolean z18;
        ?? r13;
        dxjokdxxww dxjokdxxwwVar;
        int i15;
        ?? r14;
        boolean z19;
        MainTab mainTab2;
        List list3;
        FragmentManager fragmentManager3;
        boolean z23;
        boolean z24;
        btonecajqb btonecajqbVar;
        int i16;
        boolean z25;
        int i17;
        MainTab mainTab3;
        FragmentManager fragmentManager4;
        List list4;
        b40.wkgbmnqykc wkgbmnqykcVar2;
        Fragment fragment2;
        boolean z26;
        ?? r15;
        ?? r16;
        boolean z27;
        gtknphoqwx gtknphoqwxVar;
        MainTab mainTab4;
        ?? r17;
        boolean z28;
        draadjrbmk draadjrbmkVar;
        int i18;
        boolean z29;
        MainTab mainTab5;
        FragmentManager fragmentManager5;
        boolean z33;
        wflxmlrfwp wflxmlrfwpVar;
        boolean z34;
        agtfadlqog agtfadlqogVar;
        lg.gxszxtbevo gxszxtbevoVar2;
        eablkybsjg eablkybsjgVar;
        boolean z35 = z14;
        if (gxszxtbevoVar instanceof lqeggnwhkg) {
            lqeggnwhkgVar = (lqeggnwhkg) gxszxtbevoVar;
            int i19 = lqeggnwhkgVar.f26977wwaezpbzkn;
            if ((i19 & Integer.MIN_VALUE) != 0) {
                lqeggnwhkgVar.f26977wwaezpbzkn = i19 - Integer.MIN_VALUE;
            } else {
                lqeggnwhkgVar = new lqeggnwhkg(gxszxtbevoVar);
            }
        } else {
            lqeggnwhkgVar = new lqeggnwhkg(gxszxtbevoVar);
        }
        Object obj = lqeggnwhkgVar.f26970iozdgvuglv;
        Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
        switch (lqeggnwhkgVar.f26977wwaezpbzkn) {
            case 0:
                zdlpuopuiu.zoijcleaow(obj);
                if (!iwizpuwonk()) {
                    return wwaezpbzkn.f37140iobyxmoadg;
                }
                mainTabVdvldrhtss = mainTab == null ? vdvldrhtss() : mainTab;
                f40.eablkybsjg eablkybsjgVarCllcsxoeiz = cllcsxoeiz(mainTabVdvldrhtss);
                b40.wkgbmnqykc wkgbmnqykcVarZoijcleaow = eablkybsjgVarCllcsxoeiz.zoijcleaow();
                int i23 = mainTabVdvldrhtss != vdvldrhtss() ? 1 : 0;
                boolean zIsEmpty = list.isEmpty();
                Fragment fragmentIobyxmoadg = eablkybsjgVarCllcsxoeiz.iobyxmoadg();
                int i24 = fragmentIobyxmoadg.getChildFragmentManager().roivzttewh() == 0 ? 1 : 0;
                boolean z36 = i23 != 0 || z35;
                nufgyqmvbu nufgyqmvbuVar = new nufgyqmvbu(null);
                lqeggnwhkgVar.f26980zdlpuopuiu = fragmentManager;
                lqeggnwhkgVar.f26979yggfygwlhe = list;
                lqeggnwhkgVar.f26973jyumaefscl = mainTabVdvldrhtss;
                lqeggnwhkgVar.f26972iwizpuwonk = wkgbmnqykcVarZoijcleaow;
                lqeggnwhkgVar.f26968cqumvgiudr = fragmentIobyxmoadg;
                z15 = z13;
                lqeggnwhkgVar.f26969esjtqupxsv = z15;
                lqeggnwhkgVar.f26974lereixgezr = z35;
                lqeggnwhkgVar.f26981zynmafqrjb = i23;
                lqeggnwhkgVar.f26976pmvmpeiblj = zIsEmpty;
                lqeggnwhkgVar.f26971istkbnxepw = i24;
                z16 = true;
                lqeggnwhkgVar.f26977wwaezpbzkn = 1;
                if (i40.iobyxmoadg.iobyxmoadg(fragmentManager, z36, nufgyqmvbuVar, lqeggnwhkgVar) == objGxszxtbevo) {
                    return objGxszxtbevo;
                }
                wkgbmnqykcVar = wkgbmnqykcVarZoijcleaow;
                i13 = i23;
                list2 = list;
                fragmentManager2 = fragmentManager;
                i14 = i24;
                fragment = fragmentIobyxmoadg;
                z17 = zIsEmpty;
                if (!z17 || z35) {
                    z18 = false;
                } else {
                    z18 = z16;
                }
                if (i13 != 0 || (i14 == 0 && !z18)) {
                    r13 = 0;
                } else {
                    r13 = z16;
                }
                dxjokdxxwwVar = new dxjokdxxww(fragment, list2, null);
                lqeggnwhkgVar.f26980zdlpuopuiu = fragmentManager2;
                lqeggnwhkgVar.f26979yggfygwlhe = list2;
                lqeggnwhkgVar.f26973jyumaefscl = mainTabVdvldrhtss;
                lqeggnwhkgVar.f26972iwizpuwonk = wkgbmnqykcVar;
                lqeggnwhkgVar.f26968cqumvgiudr = fragment;
                lqeggnwhkgVar.f26969esjtqupxsv = z15;
                lqeggnwhkgVar.f26974lereixgezr = z35;
                lqeggnwhkgVar.f26981zynmafqrjb = i13;
                lqeggnwhkgVar.f26976pmvmpeiblj = z17;
                lqeggnwhkgVar.f26971istkbnxepw = i14;
                lqeggnwhkgVar.f26967cdpycssgdh = r13;
                lqeggnwhkgVar.f26977wwaezpbzkn = 2;
                if (i40.iobyxmoadg.iobyxmoadg(fragmentManager2, r13, dxjokdxxwwVar, lqeggnwhkgVar) == objGxszxtbevo) {
                    return objGxszxtbevo;
                }
                boolean z37 = z35;
                i15 = i14;
                r14 = r13;
                z19 = z37;
                List list5 = list2;
                mainTab2 = mainTabVdvldrhtss;
                list3 = list5;
                boolean z38 = z15;
                fragmentManager3 = fragmentManager2;
                z23 = z38;
                if (i13 == 0 || z19 || !z17 || i15 != 0) {
                    z24 = false;
                } else {
                    z24 = true;
                }
                btonecajqbVar = new btonecajqb(fragment, null);
                lqeggnwhkgVar.f26980zdlpuopuiu = fragmentManager3;
                lqeggnwhkgVar.f26979yggfygwlhe = list3;
                lqeggnwhkgVar.f26973jyumaefscl = mainTab2;
                lqeggnwhkgVar.f26972iwizpuwonk = wkgbmnqykcVar;
                lqeggnwhkgVar.f26968cqumvgiudr = fragment;
                lqeggnwhkgVar.f26969esjtqupxsv = z23;
                lqeggnwhkgVar.f26974lereixgezr = z19;
                lqeggnwhkgVar.f26981zynmafqrjb = i13;
                lqeggnwhkgVar.f26976pmvmpeiblj = z17;
                lqeggnwhkgVar.f26971istkbnxepw = i15;
                lqeggnwhkgVar.f26967cdpycssgdh = r14 == true ? 1 : 0;
                lqeggnwhkgVar.f26978yadqdtsiqt = z24 ? 1 : 0;
                lqeggnwhkgVar.f26977wwaezpbzkn = 3;
                if (i40.iobyxmoadg.iobyxmoadg(fragmentManager3, z24, btonecajqbVar, lqeggnwhkgVar) == objGxszxtbevo) {
                    return objGxszxtbevo;
                }
                i16 = i15;
                z25 = z17;
                i17 = i13;
                mainTab3 = mainTab2;
                fragmentManager4 = fragmentManager3;
                list4 = list3;
                wkgbmnqykcVar2 = wkgbmnqykcVar;
                fragment2 = fragment;
                z26 = z19;
                z27 = ((i17 != 0 && z25) || z23) && !z26 && i16 == 0 && r16 == 0 && r15 == 0;
                gtknphoqwxVar = new gtknphoqwx(wkgbmnqykcVar2, null);
                lqeggnwhkgVar.f26980zdlpuopuiu = fragmentManager4;
                lqeggnwhkgVar.f26979yggfygwlhe = list4;
                lqeggnwhkgVar.f26973jyumaefscl = mainTab3;
                lqeggnwhkgVar.f26972iwizpuwonk = wkgbmnqykcVar2;
                lqeggnwhkgVar.f26968cqumvgiudr = fragment2;
                lqeggnwhkgVar.f26969esjtqupxsv = z26;
                lqeggnwhkgVar.f26981zynmafqrjb = i17;
                lqeggnwhkgVar.f26974lereixgezr = z25;
                lqeggnwhkgVar.f26971istkbnxepw = r16;
                lqeggnwhkgVar.f26977wwaezpbzkn = 4;
                if (i40.iobyxmoadg.iobyxmoadg(fragmentManager4, z27, gtknphoqwxVar, lqeggnwhkgVar) == objGxszxtbevo) {
                    return objGxszxtbevo;
                }
                mainTab4 = mainTab3;
                if (z25 && r17 == 0) {
                    z28 = true;
                } else {
                    r17 = r16;
                    z28 = false;
                }
                draadjrbmkVar = new draadjrbmk(wkgbmnqykcVar2, list4, fragment2, null);
                lqeggnwhkgVar.f26980zdlpuopuiu = fragmentManager4;
                lqeggnwhkgVar.f26979yggfygwlhe = mainTab4;
                lqeggnwhkgVar.f26973jyumaefscl = null;
                lqeggnwhkgVar.f26972iwizpuwonk = null;
                lqeggnwhkgVar.f26968cqumvgiudr = null;
                lqeggnwhkgVar.f26969esjtqupxsv = z26;
                lqeggnwhkgVar.f26981zynmafqrjb = i17;
                lqeggnwhkgVar.f26977wwaezpbzkn = 5;
                if (i40.iobyxmoadg.iobyxmoadg(fragmentManager4, z28, draadjrbmkVar, lqeggnwhkgVar) == objGxszxtbevo) {
                    return objGxszxtbevo;
                }
                i18 = i17;
                z29 = z26;
                mainTab5 = mainTab4;
                fragmentManager5 = fragmentManager4;
                if (i18 == 0 || z29) {
                    z33 = true;
                } else {
                    z33 = false;
                }
                wflxmlrfwpVar = new wflxmlrfwp(mainTab5, null);
                lqeggnwhkgVar.f26980zdlpuopuiu = fragmentManager5;
                lqeggnwhkgVar.f26979yggfygwlhe = mainTab5;
                lqeggnwhkgVar.f26969esjtqupxsv = z29;
                lqeggnwhkgVar.f26981zynmafqrjb = i18;
                lqeggnwhkgVar.f26977wwaezpbzkn = 6;
                if (i40.iobyxmoadg.iobyxmoadg(fragmentManager5, z33, wflxmlrfwpVar, lqeggnwhkgVar) == objGxszxtbevo) {
                    return objGxszxtbevo;
                }
                if (i18 != 0 || z29) {
                    z34 = false;
                } else {
                    z34 = true;
                }
                gxszxtbevoVar2 = null;
                agtfadlqogVar = new agtfadlqog(mainTab5, null);
                lqeggnwhkgVar.f26980zdlpuopuiu = fragmentManager5;
                lqeggnwhkgVar.f26979yggfygwlhe = null;
                lqeggnwhkgVar.f26977wwaezpbzkn = 7;
                if (i40.iobyxmoadg.iobyxmoadg(fragmentManager5, z34, agtfadlqogVar, lqeggnwhkgVar) == objGxszxtbevo) {
                    return objGxszxtbevo;
                }
                eablkybsjgVar = new eablkybsjg(gxszxtbevoVar2);
                lqeggnwhkgVar.f26980zdlpuopuiu = gxszxtbevoVar2;
                lqeggnwhkgVar.f26977wwaezpbzkn = 8;
                if (i40.iobyxmoadg.zoijcleaow(fragmentManager5, false, eablkybsjgVar, lqeggnwhkgVar, 1, null) == objGxszxtbevo) {
                    return objGxszxtbevo;
                }
                return wwaezpbzkn.f37140iobyxmoadg;
            case 1:
                i14 = lqeggnwhkgVar.f26971istkbnxepw;
                boolean z39 = lqeggnwhkgVar.f26976pmvmpeiblj;
                int i25 = lqeggnwhkgVar.f26981zynmafqrjb;
                boolean z43 = lqeggnwhkgVar.f26974lereixgezr;
                boolean z44 = lqeggnwhkgVar.f26969esjtqupxsv;
                Fragment fragment3 = (Fragment) lqeggnwhkgVar.f26968cqumvgiudr;
                b40.wkgbmnqykc wkgbmnqykcVar3 = (b40.wkgbmnqykc) lqeggnwhkgVar.f26972iwizpuwonk;
                MainTab mainTab6 = (MainTab) lqeggnwhkgVar.f26973jyumaefscl;
                list2 = (List) lqeggnwhkgVar.f26979yggfygwlhe;
                fragmentManager2 = (FragmentManager) lqeggnwhkgVar.f26980zdlpuopuiu;
                zdlpuopuiu.zoijcleaow(obj);
                z15 = z44;
                mainTabVdvldrhtss = mainTab6;
                z16 = true;
                wkgbmnqykcVar = wkgbmnqykcVar3;
                fragment = fragment3;
                z17 = z39;
                z35 = z43;
                i13 = i25;
                if (z17) {
                    z18 = false;
                } else {
                    z18 = false;
                }
                if (i13 != 0) {
                    r13 = 0;
                } else {
                    r13 = 0;
                }
                dxjokdxxwwVar = new dxjokdxxww(fragment, list2, null);
                lqeggnwhkgVar.f26980zdlpuopuiu = fragmentManager2;
                lqeggnwhkgVar.f26979yggfygwlhe = list2;
                lqeggnwhkgVar.f26973jyumaefscl = mainTabVdvldrhtss;
                lqeggnwhkgVar.f26972iwizpuwonk = wkgbmnqykcVar;
                lqeggnwhkgVar.f26968cqumvgiudr = fragment;
                lqeggnwhkgVar.f26969esjtqupxsv = z15;
                lqeggnwhkgVar.f26974lereixgezr = z35;
                lqeggnwhkgVar.f26981zynmafqrjb = i13;
                lqeggnwhkgVar.f26976pmvmpeiblj = z17;
                lqeggnwhkgVar.f26971istkbnxepw = i14;
                lqeggnwhkgVar.f26967cdpycssgdh = r13;
                lqeggnwhkgVar.f26977wwaezpbzkn = 2;
                if (i40.iobyxmoadg.iobyxmoadg(fragmentManager2, r13, dxjokdxxwwVar, lqeggnwhkgVar) == objGxszxtbevo) {
                    return objGxszxtbevo;
                }
                boolean z310 = z35;
                i15 = i14;
                r14 = r13;
                z19 = z310;
                List list6 = list2;
                mainTab2 = mainTabVdvldrhtss;
                list3 = list6;
                boolean z311 = z15;
                fragmentManager3 = fragmentManager2;
                z23 = z311;
                if (i13 == 0) {
                    z24 = false;
                } else {
                    z24 = false;
                }
                btonecajqbVar = new btonecajqb(fragment, null);
                lqeggnwhkgVar.f26980zdlpuopuiu = fragmentManager3;
                lqeggnwhkgVar.f26979yggfygwlhe = list3;
                lqeggnwhkgVar.f26973jyumaefscl = mainTab2;
                lqeggnwhkgVar.f26972iwizpuwonk = wkgbmnqykcVar;
                lqeggnwhkgVar.f26968cqumvgiudr = fragment;
                lqeggnwhkgVar.f26969esjtqupxsv = z23;
                lqeggnwhkgVar.f26974lereixgezr = z19;
                lqeggnwhkgVar.f26981zynmafqrjb = i13;
                lqeggnwhkgVar.f26976pmvmpeiblj = z17;
                lqeggnwhkgVar.f26971istkbnxepw = i15;
                lqeggnwhkgVar.f26967cdpycssgdh = r14 == true ? 1 : 0;
                lqeggnwhkgVar.f26978yadqdtsiqt = z24 ? 1 : 0;
                lqeggnwhkgVar.f26977wwaezpbzkn = 3;
                if (i40.iobyxmoadg.iobyxmoadg(fragmentManager3, z24, btonecajqbVar, lqeggnwhkgVar) == objGxszxtbevo) {
                    return objGxszxtbevo;
                }
                i16 = i15;
                z25 = z17;
                i17 = i13;
                mainTab3 = mainTab2;
                fragmentManager4 = fragmentManager3;
                list4 = list3;
                wkgbmnqykcVar2 = wkgbmnqykcVar;
                fragment2 = fragment;
                z26 = z19;
                if (i17 != 0) {
                }
                gtknphoqwxVar = new gtknphoqwx(wkgbmnqykcVar2, null);
                lqeggnwhkgVar.f26980zdlpuopuiu = fragmentManager4;
                lqeggnwhkgVar.f26979yggfygwlhe = list4;
                lqeggnwhkgVar.f26973jyumaefscl = mainTab3;
                lqeggnwhkgVar.f26972iwizpuwonk = wkgbmnqykcVar2;
                lqeggnwhkgVar.f26968cqumvgiudr = fragment2;
                lqeggnwhkgVar.f26969esjtqupxsv = z26;
                lqeggnwhkgVar.f26981zynmafqrjb = i17;
                lqeggnwhkgVar.f26974lereixgezr = z25;
                lqeggnwhkgVar.f26971istkbnxepw = r16;
                lqeggnwhkgVar.f26977wwaezpbzkn = 4;
                if (i40.iobyxmoadg.iobyxmoadg(fragmentManager4, z27, gtknphoqwxVar, lqeggnwhkgVar) == objGxszxtbevo) {
                    return objGxszxtbevo;
                }
                mainTab4 = mainTab3;
                if (z25) {
                    r17 = r16;
                    z28 = false;
                } else {
                    r17 = r16;
                    z28 = false;
                }
                draadjrbmkVar = new draadjrbmk(wkgbmnqykcVar2, list4, fragment2, null);
                lqeggnwhkgVar.f26980zdlpuopuiu = fragmentManager4;
                lqeggnwhkgVar.f26979yggfygwlhe = mainTab4;
                lqeggnwhkgVar.f26973jyumaefscl = null;
                lqeggnwhkgVar.f26972iwizpuwonk = null;
                lqeggnwhkgVar.f26968cqumvgiudr = null;
                lqeggnwhkgVar.f26969esjtqupxsv = z26;
                lqeggnwhkgVar.f26981zynmafqrjb = i17;
                lqeggnwhkgVar.f26977wwaezpbzkn = 5;
                if (i40.iobyxmoadg.iobyxmoadg(fragmentManager4, z28, draadjrbmkVar, lqeggnwhkgVar) == objGxszxtbevo) {
                    return objGxszxtbevo;
                }
                i18 = i17;
                z29 = z26;
                mainTab5 = mainTab4;
                fragmentManager5 = fragmentManager4;
                if (i18 == 0) {
                    z33 = true;
                } else {
                    z33 = true;
                }
                wflxmlrfwpVar = new wflxmlrfwp(mainTab5, null);
                lqeggnwhkgVar.f26980zdlpuopuiu = fragmentManager5;
                lqeggnwhkgVar.f26979yggfygwlhe = mainTab5;
                lqeggnwhkgVar.f26969esjtqupxsv = z29;
                lqeggnwhkgVar.f26981zynmafqrjb = i18;
                lqeggnwhkgVar.f26977wwaezpbzkn = 6;
                if (i40.iobyxmoadg.iobyxmoadg(fragmentManager5, z33, wflxmlrfwpVar, lqeggnwhkgVar) == objGxszxtbevo) {
                    return objGxszxtbevo;
                }
                if (i18 != 0) {
                    z34 = false;
                } else {
                    z34 = false;
                }
                gxszxtbevoVar2 = null;
                agtfadlqogVar = new agtfadlqog(mainTab5, null);
                lqeggnwhkgVar.f26980zdlpuopuiu = fragmentManager5;
                lqeggnwhkgVar.f26979yggfygwlhe = null;
                lqeggnwhkgVar.f26977wwaezpbzkn = 7;
                if (i40.iobyxmoadg.iobyxmoadg(fragmentManager5, z34, agtfadlqogVar, lqeggnwhkgVar) == objGxszxtbevo) {
                    return objGxszxtbevo;
                }
                eablkybsjgVar = new eablkybsjg(gxszxtbevoVar2);
                lqeggnwhkgVar.f26980zdlpuopuiu = gxszxtbevoVar2;
                lqeggnwhkgVar.f26977wwaezpbzkn = 8;
                if (i40.iobyxmoadg.zoijcleaow(fragmentManager5, false, eablkybsjgVar, lqeggnwhkgVar, 1, null) == objGxszxtbevo) {
                    return objGxszxtbevo;
                }
                return wwaezpbzkn.f37140iobyxmoadg;
            case 2:
                int i26 = lqeggnwhkgVar.f26967cdpycssgdh;
                i15 = lqeggnwhkgVar.f26971istkbnxepw;
                z17 = lqeggnwhkgVar.f26976pmvmpeiblj;
                i13 = lqeggnwhkgVar.f26981zynmafqrjb;
                z19 = lqeggnwhkgVar.f26974lereixgezr;
                boolean z45 = lqeggnwhkgVar.f26969esjtqupxsv;
                fragment = (Fragment) lqeggnwhkgVar.f26968cqumvgiudr;
                wkgbmnqykcVar = (b40.wkgbmnqykc) lqeggnwhkgVar.f26972iwizpuwonk;
                mainTab2 = (MainTab) lqeggnwhkgVar.f26973jyumaefscl;
                List list7 = (List) lqeggnwhkgVar.f26979yggfygwlhe;
                fragmentManager3 = (FragmentManager) lqeggnwhkgVar.f26980zdlpuopuiu;
                zdlpuopuiu.zoijcleaow(obj);
                list3 = list7;
                z23 = z45;
                r14 = i26;
                if (i13 == 0) {
                    z24 = false;
                } else {
                    z24 = false;
                }
                btonecajqbVar = new btonecajqb(fragment, null);
                lqeggnwhkgVar.f26980zdlpuopuiu = fragmentManager3;
                lqeggnwhkgVar.f26979yggfygwlhe = list3;
                lqeggnwhkgVar.f26973jyumaefscl = mainTab2;
                lqeggnwhkgVar.f26972iwizpuwonk = wkgbmnqykcVar;
                lqeggnwhkgVar.f26968cqumvgiudr = fragment;
                lqeggnwhkgVar.f26969esjtqupxsv = z23;
                lqeggnwhkgVar.f26974lereixgezr = z19;
                lqeggnwhkgVar.f26981zynmafqrjb = i13;
                lqeggnwhkgVar.f26976pmvmpeiblj = z17;
                lqeggnwhkgVar.f26971istkbnxepw = i15;
                lqeggnwhkgVar.f26967cdpycssgdh = r14 == true ? 1 : 0;
                lqeggnwhkgVar.f26978yadqdtsiqt = z24 ? 1 : 0;
                lqeggnwhkgVar.f26977wwaezpbzkn = 3;
                if (i40.iobyxmoadg.iobyxmoadg(fragmentManager3, z24, btonecajqbVar, lqeggnwhkgVar) == objGxszxtbevo) {
                    return objGxszxtbevo;
                }
                i16 = i15;
                z25 = z17;
                i17 = i13;
                mainTab3 = mainTab2;
                fragmentManager4 = fragmentManager3;
                list4 = list3;
                wkgbmnqykcVar2 = wkgbmnqykcVar;
                fragment2 = fragment;
                z26 = z19;
                if (i17 != 0) {
                }
                gtknphoqwxVar = new gtknphoqwx(wkgbmnqykcVar2, null);
                lqeggnwhkgVar.f26980zdlpuopuiu = fragmentManager4;
                lqeggnwhkgVar.f26979yggfygwlhe = list4;
                lqeggnwhkgVar.f26973jyumaefscl = mainTab3;
                lqeggnwhkgVar.f26972iwizpuwonk = wkgbmnqykcVar2;
                lqeggnwhkgVar.f26968cqumvgiudr = fragment2;
                lqeggnwhkgVar.f26969esjtqupxsv = z26;
                lqeggnwhkgVar.f26981zynmafqrjb = i17;
                lqeggnwhkgVar.f26974lereixgezr = z25;
                lqeggnwhkgVar.f26971istkbnxepw = r16;
                lqeggnwhkgVar.f26977wwaezpbzkn = 4;
                if (i40.iobyxmoadg.iobyxmoadg(fragmentManager4, z27, gtknphoqwxVar, lqeggnwhkgVar) == objGxszxtbevo) {
                    return objGxszxtbevo;
                }
                mainTab4 = mainTab3;
                if (z25) {
                    r17 = r16;
                    z28 = false;
                } else {
                    r17 = r16;
                    z28 = false;
                }
                draadjrbmkVar = new draadjrbmk(wkgbmnqykcVar2, list4, fragment2, null);
                lqeggnwhkgVar.f26980zdlpuopuiu = fragmentManager4;
                lqeggnwhkgVar.f26979yggfygwlhe = mainTab4;
                lqeggnwhkgVar.f26973jyumaefscl = null;
                lqeggnwhkgVar.f26972iwizpuwonk = null;
                lqeggnwhkgVar.f26968cqumvgiudr = null;
                lqeggnwhkgVar.f26969esjtqupxsv = z26;
                lqeggnwhkgVar.f26981zynmafqrjb = i17;
                lqeggnwhkgVar.f26977wwaezpbzkn = 5;
                if (i40.iobyxmoadg.iobyxmoadg(fragmentManager4, z28, draadjrbmkVar, lqeggnwhkgVar) == objGxszxtbevo) {
                    return objGxszxtbevo;
                }
                i18 = i17;
                z29 = z26;
                mainTab5 = mainTab4;
                fragmentManager5 = fragmentManager4;
                if (i18 == 0) {
                    z33 = true;
                } else {
                    z33 = true;
                }
                wflxmlrfwpVar = new wflxmlrfwp(mainTab5, null);
                lqeggnwhkgVar.f26980zdlpuopuiu = fragmentManager5;
                lqeggnwhkgVar.f26979yggfygwlhe = mainTab5;
                lqeggnwhkgVar.f26969esjtqupxsv = z29;
                lqeggnwhkgVar.f26981zynmafqrjb = i18;
                lqeggnwhkgVar.f26977wwaezpbzkn = 6;
                if (i40.iobyxmoadg.iobyxmoadg(fragmentManager5, z33, wflxmlrfwpVar, lqeggnwhkgVar) == objGxszxtbevo) {
                    return objGxszxtbevo;
                }
                if (i18 != 0) {
                    z34 = false;
                } else {
                    z34 = false;
                }
                gxszxtbevoVar2 = null;
                agtfadlqogVar = new agtfadlqog(mainTab5, null);
                lqeggnwhkgVar.f26980zdlpuopuiu = fragmentManager5;
                lqeggnwhkgVar.f26979yggfygwlhe = null;
                lqeggnwhkgVar.f26977wwaezpbzkn = 7;
                if (i40.iobyxmoadg.iobyxmoadg(fragmentManager5, z34, agtfadlqogVar, lqeggnwhkgVar) == objGxszxtbevo) {
                    return objGxszxtbevo;
                }
                eablkybsjgVar = new eablkybsjg(gxszxtbevoVar2);
                lqeggnwhkgVar.f26980zdlpuopuiu = gxszxtbevoVar2;
                lqeggnwhkgVar.f26977wwaezpbzkn = 8;
                if (i40.iobyxmoadg.zoijcleaow(fragmentManager5, false, eablkybsjgVar, lqeggnwhkgVar, 1, null) == objGxszxtbevo) {
                    return objGxszxtbevo;
                }
                return wwaezpbzkn.f37140iobyxmoadg;
            case 3:
                int i27 = lqeggnwhkgVar.f26978yadqdtsiqt;
                int i28 = lqeggnwhkgVar.f26967cdpycssgdh;
                int i29 = lqeggnwhkgVar.f26971istkbnxepw;
                boolean z46 = lqeggnwhkgVar.f26976pmvmpeiblj;
                int i33 = lqeggnwhkgVar.f26981zynmafqrjb;
                boolean z47 = lqeggnwhkgVar.f26974lereixgezr;
                z23 = lqeggnwhkgVar.f26969esjtqupxsv;
                Fragment fragment4 = (Fragment) lqeggnwhkgVar.f26968cqumvgiudr;
                b40.wkgbmnqykc wkgbmnqykcVar4 = (b40.wkgbmnqykc) lqeggnwhkgVar.f26972iwizpuwonk;
                mainTab3 = (MainTab) lqeggnwhkgVar.f26973jyumaefscl;
                List list8 = (List) lqeggnwhkgVar.f26979yggfygwlhe;
                FragmentManager fragmentManager6 = (FragmentManager) lqeggnwhkgVar.f26980zdlpuopuiu;
                zdlpuopuiu.zoijcleaow(obj);
                i16 = i29;
                i17 = i33;
                fragment2 = fragment4;
                list4 = list8;
                r15 = i27;
                r16 = i28;
                z25 = z46;
                z26 = z47;
                wkgbmnqykcVar2 = wkgbmnqykcVar4;
                fragmentManager4 = fragmentManager6;
                if (i17 != 0) {
                }
                gtknphoqwxVar = new gtknphoqwx(wkgbmnqykcVar2, null);
                lqeggnwhkgVar.f26980zdlpuopuiu = fragmentManager4;
                lqeggnwhkgVar.f26979yggfygwlhe = list4;
                lqeggnwhkgVar.f26973jyumaefscl = mainTab3;
                lqeggnwhkgVar.f26972iwizpuwonk = wkgbmnqykcVar2;
                lqeggnwhkgVar.f26968cqumvgiudr = fragment2;
                lqeggnwhkgVar.f26969esjtqupxsv = z26;
                lqeggnwhkgVar.f26981zynmafqrjb = i17;
                lqeggnwhkgVar.f26974lereixgezr = z25;
                lqeggnwhkgVar.f26971istkbnxepw = r16;
                lqeggnwhkgVar.f26977wwaezpbzkn = 4;
                if (i40.iobyxmoadg.iobyxmoadg(fragmentManager4, z27, gtknphoqwxVar, lqeggnwhkgVar) == objGxszxtbevo) {
                    return objGxszxtbevo;
                }
                mainTab4 = mainTab3;
                if (z25) {
                    r17 = r16;
                    z28 = false;
                } else {
                    r17 = r16;
                    z28 = false;
                }
                draadjrbmkVar = new draadjrbmk(wkgbmnqykcVar2, list4, fragment2, null);
                lqeggnwhkgVar.f26980zdlpuopuiu = fragmentManager4;
                lqeggnwhkgVar.f26979yggfygwlhe = mainTab4;
                lqeggnwhkgVar.f26973jyumaefscl = null;
                lqeggnwhkgVar.f26972iwizpuwonk = null;
                lqeggnwhkgVar.f26968cqumvgiudr = null;
                lqeggnwhkgVar.f26969esjtqupxsv = z26;
                lqeggnwhkgVar.f26981zynmafqrjb = i17;
                lqeggnwhkgVar.f26977wwaezpbzkn = 5;
                if (i40.iobyxmoadg.iobyxmoadg(fragmentManager4, z28, draadjrbmkVar, lqeggnwhkgVar) == objGxszxtbevo) {
                    return objGxszxtbevo;
                }
                i18 = i17;
                z29 = z26;
                mainTab5 = mainTab4;
                fragmentManager5 = fragmentManager4;
                if (i18 == 0) {
                    z33 = true;
                } else {
                    z33 = true;
                }
                wflxmlrfwpVar = new wflxmlrfwp(mainTab5, null);
                lqeggnwhkgVar.f26980zdlpuopuiu = fragmentManager5;
                lqeggnwhkgVar.f26979yggfygwlhe = mainTab5;
                lqeggnwhkgVar.f26969esjtqupxsv = z29;
                lqeggnwhkgVar.f26981zynmafqrjb = i18;
                lqeggnwhkgVar.f26977wwaezpbzkn = 6;
                if (i40.iobyxmoadg.iobyxmoadg(fragmentManager5, z33, wflxmlrfwpVar, lqeggnwhkgVar) == objGxszxtbevo) {
                    return objGxszxtbevo;
                }
                if (i18 != 0) {
                    z34 = false;
                } else {
                    z34 = false;
                }
                gxszxtbevoVar2 = null;
                agtfadlqogVar = new agtfadlqog(mainTab5, null);
                lqeggnwhkgVar.f26980zdlpuopuiu = fragmentManager5;
                lqeggnwhkgVar.f26979yggfygwlhe = null;
                lqeggnwhkgVar.f26977wwaezpbzkn = 7;
                if (i40.iobyxmoadg.iobyxmoadg(fragmentManager5, z34, agtfadlqogVar, lqeggnwhkgVar) == objGxszxtbevo) {
                    return objGxszxtbevo;
                }
                eablkybsjgVar = new eablkybsjg(gxszxtbevoVar2);
                lqeggnwhkgVar.f26980zdlpuopuiu = gxszxtbevoVar2;
                lqeggnwhkgVar.f26977wwaezpbzkn = 8;
                if (i40.iobyxmoadg.zoijcleaow(fragmentManager5, false, eablkybsjgVar, lqeggnwhkgVar, 1, null) == objGxszxtbevo) {
                    return objGxszxtbevo;
                }
                return wwaezpbzkn.f37140iobyxmoadg;
            case 4:
                int i34 = lqeggnwhkgVar.f26971istkbnxepw;
                z25 = lqeggnwhkgVar.f26974lereixgezr;
                i17 = lqeggnwhkgVar.f26981zynmafqrjb;
                z26 = lqeggnwhkgVar.f26969esjtqupxsv;
                fragment2 = (Fragment) lqeggnwhkgVar.f26968cqumvgiudr;
                wkgbmnqykcVar2 = (b40.wkgbmnqykc) lqeggnwhkgVar.f26972iwizpuwonk;
                mainTab4 = (MainTab) lqeggnwhkgVar.f26973jyumaefscl;
                list4 = (List) lqeggnwhkgVar.f26979yggfygwlhe;
                fragmentManager4 = (FragmentManager) lqeggnwhkgVar.f26980zdlpuopuiu;
                zdlpuopuiu.zoijcleaow(obj);
                r17 = i34;
                if (z25) {
                    r17 = r16;
                    z28 = false;
                } else {
                    r17 = r16;
                    z28 = false;
                }
                draadjrbmkVar = new draadjrbmk(wkgbmnqykcVar2, list4, fragment2, null);
                lqeggnwhkgVar.f26980zdlpuopuiu = fragmentManager4;
                lqeggnwhkgVar.f26979yggfygwlhe = mainTab4;
                lqeggnwhkgVar.f26973jyumaefscl = null;
                lqeggnwhkgVar.f26972iwizpuwonk = null;
                lqeggnwhkgVar.f26968cqumvgiudr = null;
                lqeggnwhkgVar.f26969esjtqupxsv = z26;
                lqeggnwhkgVar.f26981zynmafqrjb = i17;
                lqeggnwhkgVar.f26977wwaezpbzkn = 5;
                if (i40.iobyxmoadg.iobyxmoadg(fragmentManager4, z28, draadjrbmkVar, lqeggnwhkgVar) == objGxszxtbevo) {
                    return objGxszxtbevo;
                }
                i18 = i17;
                z29 = z26;
                mainTab5 = mainTab4;
                fragmentManager5 = fragmentManager4;
                if (i18 == 0) {
                    z33 = true;
                } else {
                    z33 = true;
                }
                wflxmlrfwpVar = new wflxmlrfwp(mainTab5, null);
                lqeggnwhkgVar.f26980zdlpuopuiu = fragmentManager5;
                lqeggnwhkgVar.f26979yggfygwlhe = mainTab5;
                lqeggnwhkgVar.f26969esjtqupxsv = z29;
                lqeggnwhkgVar.f26981zynmafqrjb = i18;
                lqeggnwhkgVar.f26977wwaezpbzkn = 6;
                if (i40.iobyxmoadg.iobyxmoadg(fragmentManager5, z33, wflxmlrfwpVar, lqeggnwhkgVar) == objGxszxtbevo) {
                    return objGxszxtbevo;
                }
                if (i18 != 0) {
                    z34 = false;
                } else {
                    z34 = false;
                }
                gxszxtbevoVar2 = null;
                agtfadlqogVar = new agtfadlqog(mainTab5, null);
                lqeggnwhkgVar.f26980zdlpuopuiu = fragmentManager5;
                lqeggnwhkgVar.f26979yggfygwlhe = null;
                lqeggnwhkgVar.f26977wwaezpbzkn = 7;
                if (i40.iobyxmoadg.iobyxmoadg(fragmentManager5, z34, agtfadlqogVar, lqeggnwhkgVar) == objGxszxtbevo) {
                    return objGxszxtbevo;
                }
                eablkybsjgVar = new eablkybsjg(gxszxtbevoVar2);
                lqeggnwhkgVar.f26980zdlpuopuiu = gxszxtbevoVar2;
                lqeggnwhkgVar.f26977wwaezpbzkn = 8;
                if (i40.iobyxmoadg.zoijcleaow(fragmentManager5, false, eablkybsjgVar, lqeggnwhkgVar, 1, null) == objGxszxtbevo) {
                    return objGxszxtbevo;
                }
                return wwaezpbzkn.f37140iobyxmoadg;
            case 5:
                i18 = lqeggnwhkgVar.f26981zynmafqrjb;
                z29 = lqeggnwhkgVar.f26969esjtqupxsv;
                mainTab5 = (MainTab) lqeggnwhkgVar.f26979yggfygwlhe;
                fragmentManager5 = (FragmentManager) lqeggnwhkgVar.f26980zdlpuopuiu;
                zdlpuopuiu.zoijcleaow(obj);
                if (i18 == 0) {
                    z33 = true;
                } else {
                    z33 = true;
                }
                wflxmlrfwpVar = new wflxmlrfwp(mainTab5, null);
                lqeggnwhkgVar.f26980zdlpuopuiu = fragmentManager5;
                lqeggnwhkgVar.f26979yggfygwlhe = mainTab5;
                lqeggnwhkgVar.f26969esjtqupxsv = z29;
                lqeggnwhkgVar.f26981zynmafqrjb = i18;
                lqeggnwhkgVar.f26977wwaezpbzkn = 6;
                if (i40.iobyxmoadg.iobyxmoadg(fragmentManager5, z33, wflxmlrfwpVar, lqeggnwhkgVar) == objGxszxtbevo) {
                    return objGxszxtbevo;
                }
                if (i18 != 0) {
                    z34 = false;
                } else {
                    z34 = false;
                }
                gxszxtbevoVar2 = null;
                agtfadlqogVar = new agtfadlqog(mainTab5, null);
                lqeggnwhkgVar.f26980zdlpuopuiu = fragmentManager5;
                lqeggnwhkgVar.f26979yggfygwlhe = null;
                lqeggnwhkgVar.f26977wwaezpbzkn = 7;
                if (i40.iobyxmoadg.iobyxmoadg(fragmentManager5, z34, agtfadlqogVar, lqeggnwhkgVar) == objGxszxtbevo) {
                    return objGxszxtbevo;
                }
                eablkybsjgVar = new eablkybsjg(gxszxtbevoVar2);
                lqeggnwhkgVar.f26980zdlpuopuiu = gxszxtbevoVar2;
                lqeggnwhkgVar.f26977wwaezpbzkn = 8;
                if (i40.iobyxmoadg.zoijcleaow(fragmentManager5, false, eablkybsjgVar, lqeggnwhkgVar, 1, null) == objGxszxtbevo) {
                    return objGxszxtbevo;
                }
                return wwaezpbzkn.f37140iobyxmoadg;
            case 6:
                i18 = lqeggnwhkgVar.f26981zynmafqrjb;
                z29 = lqeggnwhkgVar.f26969esjtqupxsv;
                mainTab5 = (MainTab) lqeggnwhkgVar.f26979yggfygwlhe;
                fragmentManager5 = (FragmentManager) lqeggnwhkgVar.f26980zdlpuopuiu;
                zdlpuopuiu.zoijcleaow(obj);
                if (i18 != 0) {
                    z34 = false;
                } else {
                    z34 = false;
                }
                gxszxtbevoVar2 = null;
                agtfadlqogVar = new agtfadlqog(mainTab5, null);
                lqeggnwhkgVar.f26980zdlpuopuiu = fragmentManager5;
                lqeggnwhkgVar.f26979yggfygwlhe = null;
                lqeggnwhkgVar.f26977wwaezpbzkn = 7;
                if (i40.iobyxmoadg.iobyxmoadg(fragmentManager5, z34, agtfadlqogVar, lqeggnwhkgVar) == objGxszxtbevo) {
                    return objGxszxtbevo;
                }
                eablkybsjgVar = new eablkybsjg(gxszxtbevoVar2);
                lqeggnwhkgVar.f26980zdlpuopuiu = gxszxtbevoVar2;
                lqeggnwhkgVar.f26977wwaezpbzkn = 8;
                if (i40.iobyxmoadg.zoijcleaow(fragmentManager5, false, eablkybsjgVar, lqeggnwhkgVar, 1, null) == objGxszxtbevo) {
                    return objGxszxtbevo;
                }
                return wwaezpbzkn.f37140iobyxmoadg;
            case 7:
                FragmentManager fragmentManager7 = (FragmentManager) lqeggnwhkgVar.f26980zdlpuopuiu;
                zdlpuopuiu.zoijcleaow(obj);
                fragmentManager5 = fragmentManager7;
                gxszxtbevoVar2 = null;
                eablkybsjgVar = new eablkybsjg(gxszxtbevoVar2);
                lqeggnwhkgVar.f26980zdlpuopuiu = gxszxtbevoVar2;
                lqeggnwhkgVar.f26977wwaezpbzkn = 8;
                if (i40.iobyxmoadg.zoijcleaow(fragmentManager5, false, eablkybsjgVar, lqeggnwhkgVar, 1, null) == objGxszxtbevo) {
                    return objGxszxtbevo;
                }
                return wwaezpbzkn.f37140iobyxmoadg;
            case 8:
                zdlpuopuiu.zoijcleaow(obj);
                return wwaezpbzkn.f37140iobyxmoadg;
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    private final f40.eablkybsjg cllcsxoeiz(MainTab mainTab) {
        int i13 = zoijcleaow.f27000iobyxmoadg[mainTab.ordinal()];
        tg.iobyxmoadg iobyxmoadgVar = null;
        if (i13 == 1) {
            tg.iobyxmoadg iobyxmoadgVar2 = f26935ppxfxbqfkf;
            if (iobyxmoadgVar2 == null) {
                kotlin.jvm.internal.zdlpuopuiu.pmvmpeiblj("mainTabContainer");
            } else {
                iobyxmoadgVar = iobyxmoadgVar2;
            }
            return (f40.eablkybsjg) iobyxmoadgVar.invoke();
        }
        if (i13 == 2) {
            tg.iobyxmoadg iobyxmoadgVar3 = f26937wkgbmnqykc;
            if (iobyxmoadgVar3 == null) {
                kotlin.jvm.internal.zdlpuopuiu.pmvmpeiblj("catalogTabContainer");
            } else {
                iobyxmoadgVar = iobyxmoadgVar3;
            }
            return (f40.eablkybsjg) iobyxmoadgVar.invoke();
        }
        if (i13 == 3) {
            tg.iobyxmoadg iobyxmoadgVar4 = f26928eablkybsjg;
            if (iobyxmoadgVar4 == null) {
                kotlin.jvm.internal.zdlpuopuiu.pmvmpeiblj("supportTabContainer");
            } else {
                iobyxmoadgVar = iobyxmoadgVar4;
            }
            return (f40.eablkybsjg) iobyxmoadgVar.invoke();
        }
        if (i13 == 4) {
            tg.iobyxmoadg iobyxmoadgVar5 = f26930gxszxtbevo;
            if (iobyxmoadgVar5 == null) {
                kotlin.jvm.internal.zdlpuopuiu.pmvmpeiblj("cartTabContainer");
            } else {
                iobyxmoadgVar = iobyxmoadgVar5;
            }
            return (f40.eablkybsjg) iobyxmoadgVar.invoke();
        }
        if (i13 != 5) {
            throw new NoWhenBranchMatchedException();
        }
        tg.iobyxmoadg iobyxmoadgVar6 = f26932lqeggnwhkg;
        if (iobyxmoadgVar6 == null) {
            kotlin.jvm.internal.zdlpuopuiu.pmvmpeiblj("profileTabContainer");
        } else {
            iobyxmoadgVar = iobyxmoadgVar6;
        }
        return (f40.eablkybsjg) iobyxmoadgVar.invoke();
    }

    private final boolean cqumvgiudr() {
        tg.iobyxmoadg iobyxmoadgVar = f26933nufgyqmvbu;
        if (iobyxmoadgVar == null) {
            kotlin.jvm.internal.zdlpuopuiu.pmvmpeiblj("globalContainer");
            iobyxmoadgVar = null;
        }
        return ((f40.iobyxmoadg) iobyxmoadgVar.invoke()).eablkybsjg() > 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final FragmentManager hcddaimhww(MainTab mainTab) {
        FragmentManager fragmentManager = f26938zoijcleaow;
        Object obj = null;
        if (fragmentManager == null) {
            kotlin.jvm.internal.zdlpuopuiu.pmvmpeiblj("fragmentManager");
            fragmentManager = null;
        }
        List listIgdgnonuha = fragmentManager.igdgnonuha();
        kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(listIgdgnonuha, "getFragments(...)");
        for (Object obj2 : listIgdgnonuha) {
            ribwqtqdhb ribwqtqdhbVar = (Fragment) obj2;
            if ((ribwqtqdhbVar instanceof f40.eablkybsjg) && ((f40.eablkybsjg) ribwqtqdhbVar).ppxfxbqfkf() == mainTab) {
                obj = obj2;
                break;
            }
        }
        Fragment fragment = (Fragment) obj;
        if (fragment != null) {
            jpowsppfya jpowsppfyaVarKcexrzcfyt = fragmentManager.kcexrzcfyt();
            jpowsppfyaVarKcexrzcfyt.esjtqupxsv(fragment);
            jpowsppfyaVarKcexrzcfyt.dxjokdxxww();
        }
        return fragmentManager;
    }

    public static /* synthetic */ void iozdgvuglv(iobyxmoadg iobyxmoadgVar, MainTab mainTab, boolean z13, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            mainTab = null;
        }
        if ((i13 & 2) != 0) {
            z13 = false;
        }
        iobyxmoadgVar.yadqdtsiqt(mainTab, z13);
    }

    private final boolean iwizpuwonk() {
        return (f26938zoijcleaow == null || f26933nufgyqmvbu == null || f26935ppxfxbqfkf == null || f26937wkgbmnqykc == null || f26930gxszxtbevo == null || f26932lqeggnwhkg == null) ? false : true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final boolean ojitshcjhn(Fragment fragment) {
        return ((fragment instanceof e40.iobyxmoadg) && ((e40.iobyxmoadg) fragment).gxszxtbevo()) ? false : true;
    }

    private final List rgvfuqvkyq(List list) {
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            Fragment fragment = (Fragment) obj;
            if (fragment.isVisible() && f40.wkgbmnqykc.zoijcleaow(fragment)) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final MainTab vdvldrhtss() {
        MainTab mainTab = (MainTab) jyumaefscl.lxfrhoxuzk(f26927dxjokdxxww);
        return mainTab == null ? MainTab.MY_SPAR : mainTab;
    }

    public static /* synthetic */ void wwaezpbzkn(iobyxmoadg iobyxmoadgVar, MainTab mainTab, boolean z13, l9.vdvldrhtss vdvldrhtssVar, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            mainTab = null;
        }
        if ((i13 & 2) != 0) {
            z13 = false;
        }
        iobyxmoadgVar.lmojexxdyd(mainTab, z13, vdvldrhtssVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final FragmentManager zdlpuopuiu() {
        FragmentManager fragmentManager = f26938zoijcleaow;
        if (fragmentManager == null) {
            kotlin.jvm.internal.zdlpuopuiu.pmvmpeiblj("fragmentManager");
            fragmentManager = null;
        }
        jpowsppfya jpowsppfyaVarKcexrzcfyt = fragmentManager.kcexrzcfyt();
        List listIgdgnonuha = fragmentManager.igdgnonuha();
        kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(listIgdgnonuha, "getFragments(...)");
        if (!listIgdgnonuha.isEmpty()) {
            List<Fragment> listIgdgnonuha2 = fragmentManager.igdgnonuha();
            kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(listIgdgnonuha2, "getFragments(...)");
            for (Fragment fragment : listIgdgnonuha2) {
                if (fragment instanceof f40.eablkybsjg) {
                    jpowsppfyaVarKcexrzcfyt.ojitshcjhn(fragment);
                }
            }
            jpowsppfyaVarKcexrzcfyt.dxjokdxxww();
        }
        return fragmentManager;
    }

    public final void draadjrbmk() {
        Object objPrevious;
        FragmentManager childFragmentManager;
        List listIgdgnonuha;
        Fragment fragment;
        Fragment fragment2;
        if (iwizpuwonk()) {
            FragmentManager fragmentManager = f26938zoijcleaow;
            if (fragmentManager == null) {
                kotlin.jvm.internal.zdlpuopuiu.pmvmpeiblj("fragmentManager");
                fragmentManager = null;
            }
            List listIgdgnonuha2 = fragmentManager.igdgnonuha();
            kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(listIgdgnonuha2, "getFragments(...)");
            List listRgvfuqvkyq = rgvfuqvkyq(listIgdgnonuha2);
            if (listRgvfuqvkyq.isEmpty()) {
                return;
            }
            ListIterator listIterator = listRgvfuqvkyq.listIterator(listRgvfuqvkyq.size());
            do {
                if (!listIterator.hasPrevious()) {
                    objPrevious = null;
                    break;
                }
                objPrevious = listIterator.previous();
                fragment2 = (Fragment) objPrevious;
                if (fragment2 instanceof f40.eablkybsjg) {
                    break;
                }
            } while (!(fragment2 instanceof f40.iobyxmoadg));
            Fragment fragment3 = (Fragment) objPrevious;
            if (fragment3 == null || (childFragmentManager = fragment3.getChildFragmentManager()) == null || (listIgdgnonuha = childFragmentManager.igdgnonuha()) == null || (fragment = (Fragment) jyumaefscl.lxfrhoxuzk(listIgdgnonuha)) == null) {
                return;
            }
            iobyxmoadg iobyxmoadgVar = f26931iobyxmoadg;
            if ((iobyxmoadgVar.ojitshcjhn(fragment) ? fragment : null) != null) {
                iobyxmoadgVar.gtknphoqwx();
            }
        }
    }

    public final void esjtqupxsv(boolean z13) {
        pj.gtknphoqwx.wkgbmnqykc(f26924agtfadlqog, null, null, new wkgbmnqykc(z13, null), 3, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void gtknphoqwx() {
        Object objPrevious;
        Object objPrevious2;
        FragmentManager childFragmentManager;
        List listIgdgnonuha;
        if (iwizpuwonk()) {
            FragmentManager fragmentManager = f26938zoijcleaow;
            if (fragmentManager == null) {
                kotlin.jvm.internal.zdlpuopuiu.pmvmpeiblj("fragmentManager");
                fragmentManager = null;
            }
            List listIgdgnonuha2 = fragmentManager.igdgnonuha();
            kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(listIgdgnonuha2, "getFragments(...)");
            List listRgvfuqvkyq = rgvfuqvkyq(listIgdgnonuha2);
            if (listRgvfuqvkyq.isEmpty()) {
                return;
            }
            List list = f26931iobyxmoadg.cqumvgiudr() ? listRgvfuqvkyq : null;
            if (list != null) {
                ListIterator listIterator = list.listIterator(list.size());
                do {
                    if (!listIterator.hasPrevious()) {
                        objPrevious2 = null;
                        break;
                    }
                    objPrevious2 = listIterator.previous();
                } while (!(((Fragment) objPrevious2) instanceof f40.iobyxmoadg));
                Fragment fragment = (Fragment) objPrevious2;
                if (fragment != null && (childFragmentManager = fragment.getChildFragmentManager()) != null && (listIgdgnonuha = childFragmentManager.igdgnonuha()) != null && ((Fragment) jyumaefscl.lxfrhoxuzk(listIgdgnonuha)) != null) {
                    f26931iobyxmoadg.oxmwwwfdhm().gxszxtbevo();
                    return;
                }
            }
            if (f26931iobyxmoadg.cqumvgiudr()) {
                listRgvfuqvkyq = null;
            }
            if (listRgvfuqvkyq != null) {
                ListIterator listIterator2 = listRgvfuqvkyq.listIterator(listRgvfuqvkyq.size());
                do {
                    if (!listIterator2.hasPrevious()) {
                        objPrevious = null;
                        break;
                    }
                    objPrevious = listIterator2.previous();
                } while (!(((Fragment) objPrevious) instanceof f40.eablkybsjg));
                Fragment fragment2 = (Fragment) objPrevious;
                if (fragment2 != 0) {
                    List listIgdgnonuha3 = fragment2.getChildFragmentManager().igdgnonuha();
                    kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(listIgdgnonuha3, "getFragments(...)");
                    if (((Fragment) jyumaefscl.lxfrhoxuzk(listIgdgnonuha3)) != null) {
                        int iRoivzttewh = fragment2.getChildFragmentManager().roivzttewh();
                        List list2 = f26927dxjokdxxww;
                        int size = list2.size();
                        if (iRoivzttewh >= 1 || size <= 1) {
                            iobyxmoadg iobyxmoadgVar = f26931iobyxmoadg;
                            iobyxmoadgVar.cllcsxoeiz(iobyxmoadgVar.vdvldrhtss()).zoijcleaow().gxszxtbevo();
                            return;
                        }
                        f40.eablkybsjg eablkybsjgVar = fragment2 instanceof f40.eablkybsjg ? (f40.eablkybsjg) fragment2 : null;
                        if (eablkybsjgVar != null) {
                            eablkybsjgVar.btonecajqb();
                        }
                        list2.remove(jyumaefscl.ojitshcjhn(list2));
                        pj.gtknphoqwx.wkgbmnqykc(f26924agtfadlqog, null, null, new ppxfxbqfkf(null), 3, null);
                    }
                }
            }
        }
    }

    public final sj.lqeggnwhkg hkdspvbjdz() {
        return sj.dxjokdxxww.wypolnanlu(sj.dxjokdxxww.mbcevpiqjq(f26929gtknphoqwx), new kcexrzcfyt(sj.dxjokdxxww.mbcevpiqjq(f26926draadjrbmk)));
    }

    public final void istkbnxepw() {
        if (iwizpuwonk()) {
            cllcsxoeiz(vdvldrhtss()).lqeggnwhkg();
        }
    }

    public final sj.lqeggnwhkg jpowsppfya() {
        return sj.dxjokdxxww.mbcevpiqjq(f26925btonecajqb);
    }

    public final boolean jyumaefscl(MainTab tab) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(tab, "tab");
        return vdvldrhtss() == tab;
    }

    public final b40.wkgbmnqykc kcexrzcfyt() {
        if (!cqumvgiudr()) {
            return cllcsxoeiz(vdvldrhtss()).zoijcleaow();
        }
        tg.iobyxmoadg iobyxmoadgVar = f26933nufgyqmvbu;
        if (iobyxmoadgVar == null) {
            kotlin.jvm.internal.zdlpuopuiu.pmvmpeiblj("globalContainer");
            iobyxmoadgVar = null;
        }
        return ((f40.iobyxmoadg) iobyxmoadgVar.invoke()).zoijcleaow();
    }

    public final void lereixgezr(tg.iobyxmoadg globalContainer) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(globalContainer, "globalContainer");
        f26933nufgyqmvbu = globalContainer;
    }

    public final void lmojexxdyd(MainTab mainTab, boolean z13, l9.vdvldrhtss screen) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(screen, "screen");
        pj.gtknphoqwx.wkgbmnqykc(f26924agtfadlqog, null, null, new ojitshcjhn(mainTab, z13, screen, null), 3, null);
    }

    public final b40.wkgbmnqykc oxmwwwfdhm() {
        tg.iobyxmoadg iobyxmoadgVar = f26933nufgyqmvbu;
        if (iobyxmoadgVar == null) {
            kotlin.jvm.internal.zdlpuopuiu.pmvmpeiblj("globalContainer");
            iobyxmoadgVar = null;
        }
        return ((f40.iobyxmoadg) iobyxmoadgVar.invoke()).zoijcleaow();
    }

    public final void pkzmftpjix(NavigationPayload payload) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(payload, "payload");
        pj.gtknphoqwx.wkgbmnqykc(f26924agtfadlqog, null, null, new vdvldrhtss(payload, null), 3, null);
    }

    public final void pmvmpeiblj(MainTab tab, tg.iobyxmoadg tabContainer) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(tab, "tab");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(tabContainer, "tabContainer");
        int i13 = zoijcleaow.f27000iobyxmoadg[tab.ordinal()];
        if (i13 == 1) {
            f26935ppxfxbqfkf = tabContainer;
            return;
        }
        if (i13 == 2) {
            f26937wkgbmnqykc = tabContainer;
            return;
        }
        if (i13 == 3) {
            f26928eablkybsjg = tabContainer;
        } else if (i13 == 4) {
            f26930gxszxtbevo = tabContainer;
        } else {
            if (i13 != 5) {
                throw new NoWhenBranchMatchedException();
            }
            f26932lqeggnwhkg = tabContainer;
        }
    }

    public final void wflxmlrfwp() {
        if (cqumvgiudr()) {
            oxmwwwfdhm().eablkybsjg(null);
        }
    }

    public final void yadqdtsiqt(MainTab mainTab, boolean z13) {
        pj.gtknphoqwx.wkgbmnqykc(f26924agtfadlqog, null, null, new gxszxtbevo(mainTab, z13, null), 3, null);
    }

    public final void yggfygwlhe(FragmentManager fragmentManager) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(fragmentManager, "fragmentManager");
        f26938zoijcleaow = fragmentManager;
    }

    public final void ylkuphrtab(MainTab mainTab, boolean z13, List screens) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(screens, "screens");
        pj.gtknphoqwx.wkgbmnqykc(f26924agtfadlqog, null, null, new rgvfuqvkyq(mainTab, z13, screens, null), 3, null);
    }

    public final void zynmafqrjb() {
        if (iwizpuwonk()) {
            Iterator<E> it = MainTab.nufgyqmvbu().iterator();
            while (it.hasNext()) {
                f40.eablkybsjg eablkybsjgVarCllcsxoeiz = f26931iobyxmoadg.cllcsxoeiz((MainTab) it.next());
                eablkybsjgVarCllcsxoeiz.zoijcleaow().eablkybsjg(eablkybsjgVarCllcsxoeiz.nufgyqmvbu());
            }
        }
    }

    /* JADX INFO: renamed from: d40.iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
    private static final class C0491iobyxmoadg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final MainTab f26956iobyxmoadg;

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        private final List f26957ppxfxbqfkf;

        /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
        private final boolean f26958wkgbmnqykc;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final boolean f26959zoijcleaow;

        public C0491iobyxmoadg(MainTab mainTab, boolean z13, List innerScreens, boolean z14) {
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(innerScreens, "innerScreens");
            this.f26956iobyxmoadg = mainTab;
            this.f26959zoijcleaow = z13;
            this.f26957ppxfxbqfkf = innerScreens;
            this.f26958wkgbmnqykc = z14;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C0491iobyxmoadg)) {
                return false;
            }
            C0491iobyxmoadg c0491iobyxmoadg = (C0491iobyxmoadg) obj;
            return this.f26956iobyxmoadg == c0491iobyxmoadg.f26956iobyxmoadg && this.f26959zoijcleaow == c0491iobyxmoadg.f26959zoijcleaow && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f26957ppxfxbqfkf, c0491iobyxmoadg.f26957ppxfxbqfkf) && this.f26958wkgbmnqykc == c0491iobyxmoadg.f26958wkgbmnqykc;
        }

        public int hashCode() {
            MainTab mainTab = this.f26956iobyxmoadg;
            return ((((((mainTab == null ? 0 : mainTab.hashCode()) * 31) + Boolean.hashCode(this.f26959zoijcleaow)) * 31) + this.f26957ppxfxbqfkf.hashCode()) * 31) + Boolean.hashCode(this.f26958wkgbmnqykc);
        }

        public final List iobyxmoadg() {
            return this.f26957ppxfxbqfkf;
        }

        public final MainTab ppxfxbqfkf() {
            return this.f26956iobyxmoadg;
        }

        public String toString() {
            return "SelectTab(tab=" + this.f26956iobyxmoadg + ", popBackStackInTab=" + this.f26959zoijcleaow + ", innerScreens=" + this.f26957ppxfxbqfkf + ", isBackProcess=" + this.f26958wkgbmnqykc + ")";
        }

        public final boolean wkgbmnqykc() {
            return this.f26958wkgbmnqykc;
        }

        public final boolean zoijcleaow() {
            return this.f26959zoijcleaow;
        }

        public /* synthetic */ C0491iobyxmoadg(MainTab mainTab, boolean z13, List list, boolean z14, int i13, kotlin.jvm.internal.gtknphoqwx gtknphoqwxVar) {
            this((i13 & 1) != 0 ? null : mainTab, (i13 & 2) != 0 ? false : z13, (i13 & 4) != 0 ? jyumaefscl.wflxmlrfwp() : list, (i13 & 8) != 0 ? false : z14);
        }
    }
}
