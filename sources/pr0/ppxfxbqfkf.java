package pr0;

import gg.wwaezpbzkn;
import gg.zdlpuopuiu;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.coroutines.jvm.internal.draadjrbmk;
import kotlin.coroutines.jvm.internal.wkgbmnqykc;
import kotlin.jvm.internal.gtknphoqwx;
import lg.gxszxtbevo;
import sj.dxjokdxxww;
import sj.lqeggnwhkg;
import sj.nufgyqmvbu;
import sj.pmvmpeiblj;
import tg.rgvfuqvkyq;
import tg.vdvldrhtss;

/* JADX INFO: loaded from: classes5.dex */
public final class ppxfxbqfkf {

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private final lqeggnwhkg f77175eablkybsjg;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final int f77176iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final List f77177ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final pmvmpeiblj f77178wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final yj.iobyxmoadg f77179zoijcleaow;

    static final class iobyxmoadg extends wkgbmnqykc {

        /* JADX INFO: renamed from: esjtqupxsv, reason: collision with root package name */
        int f77181esjtqupxsv;

        /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
        /* synthetic */ Object f77182iwizpuwonk;

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        Object f77183jyumaefscl;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        Object f77184yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        Object f77185zdlpuopuiu;

        iobyxmoadg(gxszxtbevo gxszxtbevoVar) {
            super(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            this.f77182iwizpuwonk = obj;
            this.f77181esjtqupxsv |= Integer.MIN_VALUE;
            return ppxfxbqfkf.this.ppxfxbqfkf(null, this);
        }
    }

    /* JADX INFO: renamed from: pr0.ppxfxbqfkf$ppxfxbqfkf, reason: collision with other inner class name */
    static final class C1709ppxfxbqfkf extends draadjrbmk implements vdvldrhtss {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        int f77187zdlpuopuiu;

        C1709ppxfxbqfkf(gxszxtbevo gxszxtbevoVar) {
            super(3, gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            mg.zoijcleaow.gxszxtbevo();
            if (this.f77187zdlpuopuiu != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            zdlpuopuiu.zoijcleaow(obj);
            ppxfxbqfkf.this.f77177ppxfxbqfkf.clear();
            return wwaezpbzkn.f37140iobyxmoadg;
        }

        @Override // tg.vdvldrhtss
        /* JADX INFO: renamed from: ojitshcjhn, reason: merged with bridge method [inline-methods] */
        public final Object invoke(nufgyqmvbu nufgyqmvbuVar, Throwable th2, gxszxtbevo gxszxtbevoVar) {
            return ppxfxbqfkf.this.new C1709ppxfxbqfkf(gxszxtbevoVar).invokeSuspend(wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    static final class zoijcleaow extends draadjrbmk implements rgvfuqvkyq {

        /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
        private /* synthetic */ Object f77188cqumvgiudr;

        /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
        int f77190iwizpuwonk;

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        Object f77191jyumaefscl;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        Object f77192yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        Object f77193zdlpuopuiu;

        zoijcleaow(gxszxtbevo gxszxtbevoVar) {
            super(2, gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final gxszxtbevo create(Object obj, gxszxtbevo gxszxtbevoVar) {
            zoijcleaow zoijcleaowVar = ppxfxbqfkf.this.new zoijcleaow(gxszxtbevoVar);
            zoijcleaowVar.f77188cqumvgiudr = obj;
            return zoijcleaowVar;
        }

        /* JADX WARN: Code duplicated, block: B:23:0x007e A[Catch: all -> 0x0023, TryCatch #0 {all -> 0x0023, blocks: (B:7:0x001f, B:21:0x0078, B:23:0x007e, B:26:0x0093, B:27:0x009a, B:18:0x0062, B:20:0x006c), top: B:32:0x0009 }] */
        /* JADX WARN: Code duplicated, block: B:35:0x0092 A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:37:? A[LOOP:0: B:21:0x0078->B:37:?, LOOP_END, SYNTHETIC] */
        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            ppxfxbqfkf ppxfxbqfkfVar;
            yj.iobyxmoadg iobyxmoadgVar;
            nufgyqmvbu nufgyqmvbuVar;
            nufgyqmvbu nufgyqmvbuVar2;
            ppxfxbqfkf ppxfxbqfkfVar2;
            Iterator it;
            Object next;
            Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
            int i13 = this.f77190iwizpuwonk;
            try {
                if (i13 != 0) {
                    if (i13 == 1) {
                        ppxfxbqfkfVar = (ppxfxbqfkf) this.f77192yggfygwlhe;
                        yj.iobyxmoadg iobyxmoadgVar2 = (yj.iobyxmoadg) this.f77193zdlpuopuiu;
                        nufgyqmvbu nufgyqmvbuVar3 = (nufgyqmvbu) this.f77188cqumvgiudr;
                        zdlpuopuiu.zoijcleaow(obj);
                        nufgyqmvbuVar = nufgyqmvbuVar3;
                        iobyxmoadgVar = iobyxmoadgVar2;
                    } else {
                        if (i13 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        it = (Iterator) this.f77191jyumaefscl;
                        ppxfxbqfkfVar2 = (ppxfxbqfkf) this.f77192yggfygwlhe;
                        iobyxmoadgVar = (yj.iobyxmoadg) this.f77193zdlpuopuiu;
                        nufgyqmvbuVar2 = (nufgyqmvbu) this.f77188cqumvgiudr;
                        zdlpuopuiu.zoijcleaow(obj);
                    }
                    while (it.hasNext()) {
                        next = it.next();
                        this.f77188cqumvgiudr = nufgyqmvbuVar2;
                        this.f77193zdlpuopuiu = iobyxmoadgVar;
                        this.f77192yggfygwlhe = ppxfxbqfkfVar2;
                        this.f77191jyumaefscl = it;
                        this.f77190iwizpuwonk = 2;
                        if (nufgyqmvbuVar2.emit(next, this) == objGxszxtbevo) {
                            return objGxszxtbevo;
                        }
                    }
                    ppxfxbqfkfVar2.f77177ppxfxbqfkf.clear();
                    wwaezpbzkn wwaezpbzknVar = wwaezpbzkn.f37140iobyxmoadg;
                    iobyxmoadgVar.eablkybsjg(null);
                    return wwaezpbzkn.f37140iobyxmoadg;
                }
                zdlpuopuiu.zoijcleaow(obj);
                nufgyqmvbu nufgyqmvbuVar4 = (nufgyqmvbu) this.f77188cqumvgiudr;
                yj.iobyxmoadg iobyxmoadgVar3 = ppxfxbqfkf.this.f77179zoijcleaow;
                ppxfxbqfkfVar = ppxfxbqfkf.this;
                this.f77188cqumvgiudr = nufgyqmvbuVar4;
                this.f77193zdlpuopuiu = iobyxmoadgVar3;
                this.f77192yggfygwlhe = ppxfxbqfkfVar;
                this.f77190iwizpuwonk = 1;
                if (iobyxmoadgVar3.iobyxmoadg(null, this) == objGxszxtbevo) {
                    return objGxszxtbevo;
                }
                iobyxmoadgVar = iobyxmoadgVar3;
                nufgyqmvbuVar = nufgyqmvbuVar4;
                if (!ppxfxbqfkfVar.f77177ppxfxbqfkf.isEmpty()) {
                    nufgyqmvbuVar2 = nufgyqmvbuVar;
                    ppxfxbqfkfVar2 = ppxfxbqfkfVar;
                    it = ppxfxbqfkfVar.f77177ppxfxbqfkf.iterator();
                    while (it.hasNext()) {
                        next = it.next();
                        this.f77188cqumvgiudr = nufgyqmvbuVar2;
                        this.f77193zdlpuopuiu = iobyxmoadgVar;
                        this.f77192yggfygwlhe = ppxfxbqfkfVar2;
                        this.f77191jyumaefscl = it;
                        this.f77190iwizpuwonk = 2;
                        if (nufgyqmvbuVar2.emit(next, this) == objGxszxtbevo) {
                            return objGxszxtbevo;
                        }
                    }
                    ppxfxbqfkfVar2.f77177ppxfxbqfkf.clear();
                }
                wwaezpbzkn wwaezpbzknVar2 = wwaezpbzkn.f37140iobyxmoadg;
                iobyxmoadgVar.eablkybsjg(null);
                return wwaezpbzkn.f37140iobyxmoadg;
            } catch (Throwable th2) {
                iobyxmoadgVar.eablkybsjg(null);
                throw th2;
            }
        }

        @Override // tg.rgvfuqvkyq
        /* JADX INFO: renamed from: ojitshcjhn, reason: merged with bridge method [inline-methods] */
        public final Object invoke(nufgyqmvbu nufgyqmvbuVar, gxszxtbevo gxszxtbevoVar) {
            return ((zoijcleaow) create(nufgyqmvbuVar, gxszxtbevoVar)).invokeSuspend(wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    public ppxfxbqfkf(int i13, int i14, rj.iobyxmoadg onBufferOverflow, int i15) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(onBufferOverflow, "onBufferOverflow");
        this.f77176iobyxmoadg = i15;
        this.f77179zoijcleaow = yj.lqeggnwhkg.zoijcleaow(false, 1, null);
        this.f77177ppxfxbqfkf = new ArrayList();
        pmvmpeiblj pmvmpeibljVarIobyxmoadg = sj.wwaezpbzkn.iobyxmoadg(i13, i14, onBufferOverflow);
        this.f77178wkgbmnqykc = pmvmpeibljVarIobyxmoadg;
        this.f77175eablkybsjg = dxjokdxxww.stevsuqkhv(dxjokdxxww.tzroggbefp(pmvmpeibljVarIobyxmoadg, new zoijcleaow(null)), new C1709ppxfxbqfkf(null));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object ppxfxbqfkf(Object obj, gxszxtbevo gxszxtbevoVar) {
        iobyxmoadg iobyxmoadgVar;
        yj.iobyxmoadg iobyxmoadgVar2;
        ppxfxbqfkf ppxfxbqfkfVar;
        Throwable th2;
        yj.iobyxmoadg iobyxmoadgVar3;
        if (gxszxtbevoVar instanceof iobyxmoadg) {
            iobyxmoadgVar = (iobyxmoadg) gxszxtbevoVar;
            int i13 = iobyxmoadgVar.f77181esjtqupxsv;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                iobyxmoadgVar.f77181esjtqupxsv = i13 - Integer.MIN_VALUE;
            } else {
                iobyxmoadgVar = new iobyxmoadg(gxszxtbevoVar);
            }
        } else {
            iobyxmoadgVar = new iobyxmoadg(gxszxtbevoVar);
        }
        Object obj2 = iobyxmoadgVar.f77182iwizpuwonk;
        Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
        int i14 = iobyxmoadgVar.f77181esjtqupxsv;
        try {
            if (i14 == 0) {
                zdlpuopuiu.zoijcleaow(obj2);
                iobyxmoadgVar2 = this.f77179zoijcleaow;
                iobyxmoadgVar.f77185zdlpuopuiu = this;
                iobyxmoadgVar.f77184yggfygwlhe = obj;
                iobyxmoadgVar.f77183jyumaefscl = iobyxmoadgVar2;
                iobyxmoadgVar.f77181esjtqupxsv = 1;
                if (iobyxmoadgVar2.iobyxmoadg(null, iobyxmoadgVar) == objGxszxtbevo) {
                    return objGxszxtbevo;
                }
                ppxfxbqfkfVar = this;
            } else {
                if (i14 != 1) {
                    if (i14 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    iobyxmoadgVar3 = (yj.iobyxmoadg) iobyxmoadgVar.f77185zdlpuopuiu;
                    try {
                        zdlpuopuiu.zoijcleaow(obj2);
                        wwaezpbzkn wwaezpbzknVar = wwaezpbzkn.f37140iobyxmoadg;
                        iobyxmoadgVar2 = iobyxmoadgVar3;
                        iobyxmoadgVar2.eablkybsjg(null);
                        return wwaezpbzkn.f37140iobyxmoadg;
                    } catch (Throwable th3) {
                        th2 = th3;
                        iobyxmoadgVar3.eablkybsjg(null);
                        throw th2;
                    }
                }
                yj.iobyxmoadg iobyxmoadgVar4 = (yj.iobyxmoadg) iobyxmoadgVar.f77183jyumaefscl;
                Object obj3 = iobyxmoadgVar.f77184yggfygwlhe;
                ppxfxbqfkfVar = (ppxfxbqfkf) iobyxmoadgVar.f77185zdlpuopuiu;
                zdlpuopuiu.zoijcleaow(obj2);
                iobyxmoadgVar2 = iobyxmoadgVar4;
                obj = obj3;
            }
            if (((Number) ppxfxbqfkfVar.f77178wkgbmnqykc.lqeggnwhkg().getValue()).intValue() == 0) {
                if (ppxfxbqfkfVar.f77177ppxfxbqfkf.size() >= ppxfxbqfkfVar.f77176iobyxmoadg) {
                    ppxfxbqfkfVar.f77177ppxfxbqfkf.remove(0);
                }
                kotlin.coroutines.jvm.internal.zoijcleaow.iobyxmoadg(ppxfxbqfkfVar.f77177ppxfxbqfkf.add(obj));
            } else {
                pmvmpeiblj pmvmpeibljVar = ppxfxbqfkfVar.f77178wkgbmnqykc;
                iobyxmoadgVar.f77185zdlpuopuiu = iobyxmoadgVar2;
                iobyxmoadgVar.f77184yggfygwlhe = null;
                iobyxmoadgVar.f77183jyumaefscl = null;
                iobyxmoadgVar.f77181esjtqupxsv = 2;
                if (pmvmpeibljVar.emit(obj, iobyxmoadgVar) == objGxszxtbevo) {
                    return objGxszxtbevo;
                }
                iobyxmoadgVar3 = iobyxmoadgVar2;
                wwaezpbzkn wwaezpbzknVar2 = wwaezpbzkn.f37140iobyxmoadg;
                iobyxmoadgVar2 = iobyxmoadgVar3;
            }
            iobyxmoadgVar2.eablkybsjg(null);
            return wwaezpbzkn.f37140iobyxmoadg;
        } catch (Throwable th4) {
            yj.iobyxmoadg iobyxmoadgVar5 = iobyxmoadgVar2;
            th2 = th4;
            iobyxmoadgVar3 = iobyxmoadgVar5;
            iobyxmoadgVar3.eablkybsjg(null);
            throw th2;
        }
    }

    public final lqeggnwhkg wkgbmnqykc() {
        return this.f77175eablkybsjg;
    }

    public /* synthetic */ ppxfxbqfkf(int i13, int i14, rj.iobyxmoadg iobyxmoadgVar, int i15, int i16, gtknphoqwx gtknphoqwxVar) {
        this((i16 & 1) != 0 ? 0 : i13, (i16 & 2) != 0 ? 0 : i14, (i16 & 4) != 0 ? rj.iobyxmoadg.SUSPEND : iobyxmoadgVar, (i16 & 8) != 0 ? Integer.MAX_VALUE : i15);
    }
}
