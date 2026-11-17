package l6;

import android.os.Build;
import gg.wwaezpbzkn;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.jyumaefscl;
import kotlin.jvm.internal.zdlpuopuiu;
import n6.agtfadlqog;
import p6.yggfygwlhe;
import sj.dxjokdxxww;
import sj.nufgyqmvbu;
import tg.draadjrbmk;
import tg.vdvldrhtss;
import tj.gtknphoqwx;

/* JADX INFO: loaded from: classes2.dex */
public final class gxszxtbevo {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final List f61658iobyxmoadg;

    static final class iobyxmoadg extends jyumaefscl implements draadjrbmk {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        public static final iobyxmoadg f61659zdlpuopuiu = new iobyxmoadg();

        iobyxmoadg() {
            super(1);
        }

        @Override // tg.draadjrbmk
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public final CharSequence invoke(m6.wkgbmnqykc it) {
            zdlpuopuiu.btonecajqb(it, "it");
            String simpleName = it.getClass().getSimpleName();
            zdlpuopuiu.dxjokdxxww(simpleName, "it.javaClass.simpleName");
            return simpleName;
        }
    }

    public static final class zoijcleaow implements sj.lqeggnwhkg {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final /* synthetic */ sj.lqeggnwhkg[] f61660zdlpuopuiu;

        static final class iobyxmoadg extends jyumaefscl implements tg.iobyxmoadg {

            /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
            final /* synthetic */ sj.lqeggnwhkg[] f61661zdlpuopuiu;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public iobyxmoadg(sj.lqeggnwhkg[] lqeggnwhkgVarArr) {
                super(0);
                this.f61661zdlpuopuiu = lqeggnwhkgVarArr;
            }

            @Override // tg.iobyxmoadg
            /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
            public final Object[] invoke() {
                return new l6.zoijcleaow[this.f61661zdlpuopuiu.length];
            }
        }

        /* JADX INFO: renamed from: l6.gxszxtbevo$zoijcleaow$zoijcleaow, reason: collision with other inner class name */
        public static final class C1244zoijcleaow extends kotlin.coroutines.jvm.internal.draadjrbmk implements vdvldrhtss {

            /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
            /* synthetic */ Object f61662jyumaefscl;

            /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
            private /* synthetic */ Object f61663yggfygwlhe;

            /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
            int f61664zdlpuopuiu;

            public C1244zoijcleaow(lg.gxszxtbevo gxszxtbevoVar) {
                super(3, gxszxtbevoVar);
            }

            @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
            public final Object invokeSuspend(Object obj) {
                l6.zoijcleaow zoijcleaowVar;
                Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
                int i13 = this.f61664zdlpuopuiu;
                if (i13 == 0) {
                    gg.zdlpuopuiu.zoijcleaow(obj);
                    nufgyqmvbu nufgyqmvbuVar = (nufgyqmvbu) this.f61663yggfygwlhe;
                    l6.zoijcleaow[] zoijcleaowVarArr = (l6.zoijcleaow[]) ((Object[]) this.f61662jyumaefscl);
                    int length = zoijcleaowVarArr.length;
                    int i14 = 0;
                    while (true) {
                        if (i14 >= length) {
                            zoijcleaowVar = null;
                            break;
                        }
                        zoijcleaowVar = zoijcleaowVarArr[i14];
                        if (!zdlpuopuiu.eablkybsjg(zoijcleaowVar, l6.zoijcleaow.iobyxmoadg.f61690iobyxmoadg)) {
                            break;
                        }
                        i14++;
                    }
                    if (zoijcleaowVar == null) {
                        zoijcleaowVar = l6.zoijcleaow.iobyxmoadg.f61690iobyxmoadg;
                    }
                    this.f61664zdlpuopuiu = 1;
                    if (nufgyqmvbuVar.emit(zoijcleaowVar, this) == objGxszxtbevo) {
                        return objGxszxtbevo;
                    }
                } else {
                    if (i13 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    gg.zdlpuopuiu.zoijcleaow(obj);
                }
                return wwaezpbzkn.f37140iobyxmoadg;
            }

            @Override // tg.vdvldrhtss
            /* JADX INFO: renamed from: ojitshcjhn, reason: merged with bridge method [inline-methods] */
            public final Object invoke(nufgyqmvbu nufgyqmvbuVar, Object[] objArr, lg.gxszxtbevo gxszxtbevoVar) {
                C1244zoijcleaow c1244zoijcleaow = new C1244zoijcleaow(gxszxtbevoVar);
                c1244zoijcleaow.f61663yggfygwlhe = nufgyqmvbuVar;
                c1244zoijcleaow.f61662jyumaefscl = objArr;
                return c1244zoijcleaow.invokeSuspend(wwaezpbzkn.f37140iobyxmoadg);
            }
        }

        public zoijcleaow(sj.lqeggnwhkg[] lqeggnwhkgVarArr) {
            this.f61660zdlpuopuiu = lqeggnwhkgVarArr;
        }

        @Override // sj.lqeggnwhkg
        public Object collect(nufgyqmvbu nufgyqmvbuVar, lg.gxszxtbevo gxszxtbevoVar) {
            sj.lqeggnwhkg[] lqeggnwhkgVarArr = this.f61660zdlpuopuiu;
            Object objIobyxmoadg = gtknphoqwx.iobyxmoadg(nufgyqmvbuVar, lqeggnwhkgVarArr, new iobyxmoadg(lqeggnwhkgVarArr), new C1244zoijcleaow(null), gxszxtbevoVar);
            return objIobyxmoadg == mg.zoijcleaow.gxszxtbevo() ? objIobyxmoadg : wwaezpbzkn.f37140iobyxmoadg;
        }
    }

    public gxszxtbevo(List controllers) {
        zdlpuopuiu.btonecajqb(controllers, "controllers");
        this.f61658iobyxmoadg = controllers;
    }

    public final boolean iobyxmoadg(yggfygwlhe workSpec) {
        zdlpuopuiu.btonecajqb(workSpec, "workSpec");
        List list = this.f61658iobyxmoadg;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (((m6.wkgbmnqykc) obj).ppxfxbqfkf(workSpec)) {
                arrayList.add(obj);
            }
        }
        if (!arrayList.isEmpty()) {
            g6.yggfygwlhe.eablkybsjg().iobyxmoadg(lqeggnwhkg.f61665iobyxmoadg, "Work " + workSpec.f75796iobyxmoadg + " constrained by " + hg.jyumaefscl.iwxlajgraz(arrayList, null, null, null, 0, null, iobyxmoadg.f61659zdlpuopuiu, 31, null));
        }
        return arrayList.isEmpty();
    }

    public final sj.lqeggnwhkg zoijcleaow(yggfygwlhe spec) {
        zdlpuopuiu.btonecajqb(spec, "spec");
        List list = this.f61658iobyxmoadg;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (((m6.wkgbmnqykc) obj).iobyxmoadg(spec)) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(hg.jyumaefscl.cqumvgiudr(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(((m6.wkgbmnqykc) it.next()).zoijcleaow(spec.f75789btonecajqb));
        }
        return dxjokdxxww.vdvldrhtss(new zoijcleaow((sj.lqeggnwhkg[]) hg.jyumaefscl.m(arrayList2).toArray(new sj.lqeggnwhkg[0])));
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public gxszxtbevo(agtfadlqog trackers) {
        this(hg.jyumaefscl.oxmwwwfdhm(new m6.zoijcleaow(trackers.iobyxmoadg()), new m6.ppxfxbqfkf(trackers.zoijcleaow()), new m6.dxjokdxxww(trackers.eablkybsjg()), new m6.eablkybsjg(trackers.wkgbmnqykc()), new m6.nufgyqmvbu(trackers.wkgbmnqykc()), new m6.lqeggnwhkg(trackers.wkgbmnqykc()), new m6.gxszxtbevo(trackers.wkgbmnqykc()), Build.VERSION.SDK_INT >= 28 ? lqeggnwhkg.iobyxmoadg(trackers.ppxfxbqfkf()) : null));
        zdlpuopuiu.btonecajqb(trackers, "trackers");
    }
}
