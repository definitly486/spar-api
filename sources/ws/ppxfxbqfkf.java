package ws;

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

/* JADX INFO: loaded from: classes4.dex */
public final class ppxfxbqfkf {

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private final lqeggnwhkg f120534eablkybsjg;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final int f120535iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final List f120536ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final pmvmpeiblj f120537wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final yj.iobyxmoadg f120538zoijcleaow;

    static final class iobyxmoadg extends wkgbmnqykc {

        /* JADX INFO: renamed from: esjtqupxsv, reason: collision with root package name */
        int f120540esjtqupxsv;

        /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
        /* synthetic */ Object f120541iwizpuwonk;

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        Object f120542jyumaefscl;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        Object f120543yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        Object f120544zdlpuopuiu;

        iobyxmoadg(gxszxtbevo gxszxtbevoVar) {
            super(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            this.f120541iwizpuwonk = obj;
            this.f120540esjtqupxsv |= Integer.MIN_VALUE;
            return ppxfxbqfkf.this.ppxfxbqfkf(null, this);
        }
    }

    /* JADX INFO: renamed from: ws.ppxfxbqfkf$ppxfxbqfkf, reason: collision with other inner class name */
    static final class C3026ppxfxbqfkf extends draadjrbmk implements vdvldrhtss {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        int f120546zdlpuopuiu;

        C3026ppxfxbqfkf(gxszxtbevo gxszxtbevoVar) {
            super(3, gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            mg.zoijcleaow.gxszxtbevo();
            if (this.f120546zdlpuopuiu != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            zdlpuopuiu.zoijcleaow(obj);
            ppxfxbqfkf.this.f120536ppxfxbqfkf.clear();
            return wwaezpbzkn.f37140iobyxmoadg;
        }

        @Override // tg.vdvldrhtss
        /* JADX INFO: renamed from: ojitshcjhn, reason: merged with bridge method [inline-methods] */
        public final Object invoke(nufgyqmvbu nufgyqmvbuVar, Throwable th2, gxszxtbevo gxszxtbevoVar) {
            return ppxfxbqfkf.this.new C3026ppxfxbqfkf(gxszxtbevoVar).invokeSuspend(wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    static final class zoijcleaow extends draadjrbmk implements rgvfuqvkyq {

        /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
        private /* synthetic */ Object f120547cqumvgiudr;

        /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
        int f120549iwizpuwonk;

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        Object f120550jyumaefscl;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        Object f120551yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        Object f120552zdlpuopuiu;

        zoijcleaow(gxszxtbevo gxszxtbevoVar) {
            super(2, gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final gxszxtbevo create(Object obj, gxszxtbevo gxszxtbevoVar) {
            zoijcleaow zoijcleaowVar = ppxfxbqfkf.this.new zoijcleaow(gxszxtbevoVar);
            zoijcleaowVar.f120547cqumvgiudr = obj;
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
            int i13 = this.f120549iwizpuwonk;
            try {
                if (i13 != 0) {
                    if (i13 == 1) {
                        ppxfxbqfkfVar = (ppxfxbqfkf) this.f120551yggfygwlhe;
                        yj.iobyxmoadg iobyxmoadgVar2 = (yj.iobyxmoadg) this.f120552zdlpuopuiu;
                        nufgyqmvbu nufgyqmvbuVar3 = (nufgyqmvbu) this.f120547cqumvgiudr;
                        zdlpuopuiu.zoijcleaow(obj);
                        nufgyqmvbuVar = nufgyqmvbuVar3;
                        iobyxmoadgVar = iobyxmoadgVar2;
                    } else {
                        if (i13 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        it = (Iterator) this.f120550jyumaefscl;
                        ppxfxbqfkfVar2 = (ppxfxbqfkf) this.f120551yggfygwlhe;
                        iobyxmoadgVar = (yj.iobyxmoadg) this.f120552zdlpuopuiu;
                        nufgyqmvbuVar2 = (nufgyqmvbu) this.f120547cqumvgiudr;
                        zdlpuopuiu.zoijcleaow(obj);
                    }
                    while (it.hasNext()) {
                        next = it.next();
                        this.f120547cqumvgiudr = nufgyqmvbuVar2;
                        this.f120552zdlpuopuiu = iobyxmoadgVar;
                        this.f120551yggfygwlhe = ppxfxbqfkfVar2;
                        this.f120550jyumaefscl = it;
                        this.f120549iwizpuwonk = 2;
                        if (nufgyqmvbuVar2.emit(next, this) == objGxszxtbevo) {
                            return objGxszxtbevo;
                        }
                    }
                    ppxfxbqfkfVar2.f120536ppxfxbqfkf.clear();
                    wwaezpbzkn wwaezpbzknVar = wwaezpbzkn.f37140iobyxmoadg;
                    iobyxmoadgVar.eablkybsjg(null);
                    return wwaezpbzkn.f37140iobyxmoadg;
                }
                zdlpuopuiu.zoijcleaow(obj);
                nufgyqmvbu nufgyqmvbuVar4 = (nufgyqmvbu) this.f120547cqumvgiudr;
                yj.iobyxmoadg iobyxmoadgVar3 = ppxfxbqfkf.this.f120538zoijcleaow;
                ppxfxbqfkfVar = ppxfxbqfkf.this;
                this.f120547cqumvgiudr = nufgyqmvbuVar4;
                this.f120552zdlpuopuiu = iobyxmoadgVar3;
                this.f120551yggfygwlhe = ppxfxbqfkfVar;
                this.f120549iwizpuwonk = 1;
                if (iobyxmoadgVar3.iobyxmoadg(null, this) == objGxszxtbevo) {
                    return objGxszxtbevo;
                }
                iobyxmoadgVar = iobyxmoadgVar3;
                nufgyqmvbuVar = nufgyqmvbuVar4;
                if (!ppxfxbqfkfVar.f120536ppxfxbqfkf.isEmpty()) {
                    nufgyqmvbuVar2 = nufgyqmvbuVar;
                    ppxfxbqfkfVar2 = ppxfxbqfkfVar;
                    it = ppxfxbqfkfVar.f120536ppxfxbqfkf.iterator();
                    while (it.hasNext()) {
                        next = it.next();
                        this.f120547cqumvgiudr = nufgyqmvbuVar2;
                        this.f120552zdlpuopuiu = iobyxmoadgVar;
                        this.f120551yggfygwlhe = ppxfxbqfkfVar2;
                        this.f120550jyumaefscl = it;
                        this.f120549iwizpuwonk = 2;
                        if (nufgyqmvbuVar2.emit(next, this) == objGxszxtbevo) {
                            return objGxszxtbevo;
                        }
                    }
                    ppxfxbqfkfVar2.f120536ppxfxbqfkf.clear();
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
        this.f120535iobyxmoadg = i15;
        this.f120538zoijcleaow = yj.lqeggnwhkg.zoijcleaow(false, 1, null);
        this.f120536ppxfxbqfkf = new ArrayList();
        pmvmpeiblj pmvmpeibljVarIobyxmoadg = sj.wwaezpbzkn.iobyxmoadg(i13, i14, onBufferOverflow);
        this.f120537wkgbmnqykc = pmvmpeibljVarIobyxmoadg;
        this.f120534eablkybsjg = dxjokdxxww.stevsuqkhv(dxjokdxxww.tzroggbefp(pmvmpeibljVarIobyxmoadg, new zoijcleaow(null)), new C3026ppxfxbqfkf(null));
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
            int i13 = iobyxmoadgVar.f120540esjtqupxsv;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                iobyxmoadgVar.f120540esjtqupxsv = i13 - Integer.MIN_VALUE;
            } else {
                iobyxmoadgVar = new iobyxmoadg(gxszxtbevoVar);
            }
        } else {
            iobyxmoadgVar = new iobyxmoadg(gxszxtbevoVar);
        }
        Object obj2 = iobyxmoadgVar.f120541iwizpuwonk;
        Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
        int i14 = iobyxmoadgVar.f120540esjtqupxsv;
        try {
            if (i14 == 0) {
                zdlpuopuiu.zoijcleaow(obj2);
                iobyxmoadgVar2 = this.f120538zoijcleaow;
                iobyxmoadgVar.f120544zdlpuopuiu = this;
                iobyxmoadgVar.f120543yggfygwlhe = obj;
                iobyxmoadgVar.f120542jyumaefscl = iobyxmoadgVar2;
                iobyxmoadgVar.f120540esjtqupxsv = 1;
                if (iobyxmoadgVar2.iobyxmoadg(null, iobyxmoadgVar) == objGxszxtbevo) {
                    return objGxszxtbevo;
                }
                ppxfxbqfkfVar = this;
            } else {
                if (i14 != 1) {
                    if (i14 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    iobyxmoadgVar3 = (yj.iobyxmoadg) iobyxmoadgVar.f120544zdlpuopuiu;
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
                yj.iobyxmoadg iobyxmoadgVar4 = (yj.iobyxmoadg) iobyxmoadgVar.f120542jyumaefscl;
                Object obj3 = iobyxmoadgVar.f120543yggfygwlhe;
                ppxfxbqfkfVar = (ppxfxbqfkf) iobyxmoadgVar.f120544zdlpuopuiu;
                zdlpuopuiu.zoijcleaow(obj2);
                iobyxmoadgVar2 = iobyxmoadgVar4;
                obj = obj3;
            }
            if (((Number) ppxfxbqfkfVar.f120537wkgbmnqykc.lqeggnwhkg().getValue()).intValue() == 0) {
                if (ppxfxbqfkfVar.f120536ppxfxbqfkf.size() >= ppxfxbqfkfVar.f120535iobyxmoadg) {
                    ppxfxbqfkfVar.f120536ppxfxbqfkf.remove(0);
                }
                kotlin.coroutines.jvm.internal.zoijcleaow.iobyxmoadg(ppxfxbqfkfVar.f120536ppxfxbqfkf.add(obj));
            } else {
                pmvmpeiblj pmvmpeibljVar = ppxfxbqfkfVar.f120537wkgbmnqykc;
                iobyxmoadgVar.f120544zdlpuopuiu = iobyxmoadgVar2;
                iobyxmoadgVar.f120543yggfygwlhe = null;
                iobyxmoadgVar.f120542jyumaefscl = null;
                iobyxmoadgVar.f120540esjtqupxsv = 2;
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
        return this.f120534eablkybsjg;
    }

    public /* synthetic */ ppxfxbqfkf(int i13, int i14, rj.iobyxmoadg iobyxmoadgVar, int i15, int i16, gtknphoqwx gtknphoqwxVar) {
        this((i16 & 1) != 0 ? 0 : i13, (i16 & 2) != 0 ? 0 : i14, (i16 & 4) != 0 ? rj.iobyxmoadg.SUSPEND : iobyxmoadgVar, (i16 & 8) != 0 ? Integer.MAX_VALUE : i15);
    }
}
