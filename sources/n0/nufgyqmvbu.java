package n0;

import androidx.compose.runtime.c1;
import androidx.compose.runtime.i1;
import androidx.compose.runtime.iwxlajgraz;
import java.util.List;
import java.util.concurrent.CancellationException;
import pj.dvvnrvtcbc;
import pj.f;

/* JADX INFO: loaded from: classes.dex */
public final class nufgyqmvbu implements i1 {

    /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
    private final jpowsppfya f68291cqumvgiudr;

    /* JADX INFO: renamed from: esjtqupxsv, reason: collision with root package name */
    private final iwxlajgraz f68292esjtqupxsv;

    /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
    private final tg.draadjrbmk f68293iwizpuwonk;

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
    private final dxjokdxxww f68294jyumaefscl;

    /* JADX INFO: renamed from: lereixgezr, reason: collision with root package name */
    private boolean f68295lereixgezr = true;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    private final ribwqtqdhb f68296yggfygwlhe;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    private final List f68297zdlpuopuiu;

    static final class iobyxmoadg extends kotlin.coroutines.jvm.internal.wkgbmnqykc {

        /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
        /* synthetic */ Object f68298cqumvgiudr;

        /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
        int f68300iwizpuwonk;

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        int f68301jyumaefscl;

        /* JADX INFO: renamed from: lereixgezr, reason: collision with root package name */
        int f68302lereixgezr;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        Object f68303yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        Object f68304zdlpuopuiu;

        iobyxmoadg(lg.gxszxtbevo gxszxtbevoVar) {
            super(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            this.f68298cqumvgiudr = obj;
            this.f68302lereixgezr |= Integer.MIN_VALUE;
            return nufgyqmvbu.this.draadjrbmk(this);
        }
    }

    static final class ppxfxbqfkf extends kotlin.coroutines.jvm.internal.wkgbmnqykc {

        /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
        int f68305iwizpuwonk;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        /* synthetic */ Object f68307yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        Object f68308zdlpuopuiu;

        ppxfxbqfkf(lg.gxszxtbevo gxszxtbevoVar) {
            super(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            this.f68307yggfygwlhe = obj;
            this.f68305iwizpuwonk |= Integer.MIN_VALUE;
            return nufgyqmvbu.this.agtfadlqog(null, this);
        }
    }

    static final class wkgbmnqykc extends kotlin.coroutines.jvm.internal.draadjrbmk implements tg.rgvfuqvkyq {

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        final /* synthetic */ draadjrbmk f68309jyumaefscl;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        int f68311zdlpuopuiu;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        wkgbmnqykc(draadjrbmk draadjrbmkVar, lg.gxszxtbevo gxszxtbevoVar) {
            super(2, gxszxtbevoVar);
            this.f68309jyumaefscl = draadjrbmkVar;
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
            return nufgyqmvbu.this.new wkgbmnqykc(this.f68309jyumaefscl, gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
            int i13 = this.f68311zdlpuopuiu;
            if (i13 == 0) {
                gg.zdlpuopuiu.zoijcleaow(obj);
                jpowsppfya jpowsppfyaVar = nufgyqmvbu.this.f68291cqumvgiudr;
                draadjrbmk draadjrbmkVar = this.f68309jyumaefscl;
                this.f68311zdlpuopuiu = 1;
                obj = jpowsppfyaVar.ppxfxbqfkf(draadjrbmkVar, this);
                if (obj == objGxszxtbevo) {
                    return objGxszxtbevo;
                }
            } else {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                gg.zdlpuopuiu.zoijcleaow(obj);
            }
            return obj;
        }

        @Override // tg.rgvfuqvkyq
        public final Object invoke(pj.cllcsxoeiz cllcsxoeizVar, lg.gxszxtbevo gxszxtbevoVar) {
            return ((wkgbmnqykc) create(cllcsxoeizVar, gxszxtbevoVar)).invokeSuspend(gg.wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    static final class zoijcleaow extends kotlin.coroutines.jvm.internal.draadjrbmk implements tg.draadjrbmk {

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        final /* synthetic */ draadjrbmk f68312jyumaefscl;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        int f68314zdlpuopuiu;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        zoijcleaow(draadjrbmk draadjrbmkVar, lg.gxszxtbevo gxszxtbevoVar) {
            super(1, gxszxtbevoVar);
            this.f68312jyumaefscl = draadjrbmkVar;
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final lg.gxszxtbevo create(lg.gxszxtbevo gxszxtbevoVar) {
            return nufgyqmvbu.this.new zoijcleaow(this.f68312jyumaefscl, gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
            int i13 = this.f68314zdlpuopuiu;
            if (i13 == 0) {
                gg.zdlpuopuiu.zoijcleaow(obj);
                nufgyqmvbu nufgyqmvbuVar = nufgyqmvbu.this;
                draadjrbmk draadjrbmkVar = this.f68312jyumaefscl;
                this.f68314zdlpuopuiu = 1;
                obj = nufgyqmvbuVar.agtfadlqog(draadjrbmkVar, this);
                if (obj == objGxszxtbevo) {
                    return objGxszxtbevo;
                }
            } else {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                gg.zdlpuopuiu.zoijcleaow(obj);
            }
            return obj;
        }

        @Override // tg.draadjrbmk
        public final Object invoke(lg.gxszxtbevo gxszxtbevoVar) {
            return ((zoijcleaow) create(gxszxtbevoVar)).invokeSuspend(gg.wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    public nufgyqmvbu(List list, Object obj, ribwqtqdhb ribwqtqdhbVar, dxjokdxxww dxjokdxxwwVar, tg.draadjrbmk draadjrbmkVar, jpowsppfya jpowsppfyaVar) {
        this.f68297zdlpuopuiu = list;
        this.f68296yggfygwlhe = ribwqtqdhbVar;
        this.f68294jyumaefscl = dxjokdxxwwVar;
        this.f68293iwizpuwonk = draadjrbmkVar;
        this.f68291cqumvgiudr = jpowsppfyaVar;
        this.f68292esjtqupxsv = c1.ppxfxbqfkf(obj, null, 2, null);
    }

    private void setValue(Object obj) {
        this.f68292esjtqupxsv.setValue(obj);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object agtfadlqog(draadjrbmk draadjrbmkVar, lg.gxszxtbevo gxszxtbevoVar) {
        ppxfxbqfkf ppxfxbqfkfVar;
        if (gxszxtbevoVar instanceof ppxfxbqfkf) {
            ppxfxbqfkfVar = (ppxfxbqfkf) gxszxtbevoVar;
            int i13 = ppxfxbqfkfVar.f68305iwizpuwonk;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                ppxfxbqfkfVar.f68305iwizpuwonk = i13 - Integer.MIN_VALUE;
            } else {
                ppxfxbqfkfVar = new ppxfxbqfkf(gxszxtbevoVar);
            }
        } else {
            ppxfxbqfkfVar = new ppxfxbqfkf(gxszxtbevoVar);
        }
        Object objWkgbmnqykc = ppxfxbqfkfVar.f68307yggfygwlhe;
        Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
        int i14 = ppxfxbqfkfVar.f68305iwizpuwonk;
        Object obj = null;
        try {
            if (i14 == 0) {
                gg.zdlpuopuiu.zoijcleaow(objWkgbmnqykc);
                wkgbmnqykc wkgbmnqykcVar = new wkgbmnqykc(draadjrbmkVar, null);
                ppxfxbqfkfVar.f68308zdlpuopuiu = draadjrbmkVar;
                ppxfxbqfkfVar.f68305iwizpuwonk = 1;
                objWkgbmnqykc = f.wkgbmnqykc(15000L, wkgbmnqykcVar, ppxfxbqfkfVar);
                if (objWkgbmnqykc == objGxszxtbevo) {
                    return objGxszxtbevo;
                }
            } else {
                if (i14 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                draadjrbmkVar = (draadjrbmk) ppxfxbqfkfVar.f68308zdlpuopuiu;
                gg.zdlpuopuiu.zoijcleaow(objWkgbmnqykc);
            }
            obj = objWkgbmnqykc;
            return obj;
        } catch (CancellationException e13) {
            if (dvvnrvtcbc.agtfadlqog(ppxfxbqfkfVar.getContext())) {
                return obj;
            }
            throw e13;
        } catch (Exception e14) {
            pj.hcddaimhww hcddaimhwwVar = (pj.hcddaimhww) ppxfxbqfkfVar.getContext().get(pj.hcddaimhww.f76711btonecajqb);
            if (hcddaimhwwVar == null) {
                return obj;
            }
            hcddaimhwwVar.handleException(ppxfxbqfkfVar.getContext(), new IllegalStateException("Unable to load font " + draadjrbmkVar, e14));
            return obj;
        }
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0067 A[Catch: all -> 0x003b, TryCatch #0 {all -> 0x003b, blocks: (B:13:0x0036, B:25:0x0067, B:27:0x007e, B:32:0x00a4, B:35:0x00d8, B:20:0x0052, B:23:0x005e), top: B:44:0x0028 }] */
    /* JADX WARN: Code duplicated, block: B:27:0x007e A[Catch: all -> 0x003b, TryCatch #0 {all -> 0x003b, blocks: (B:13:0x0036, B:25:0x0067, B:27:0x007e, B:32:0x00a4, B:35:0x00d8, B:20:0x0052, B:23:0x005e), top: B:44:0x0028 }] */
    /* JADX WARN: Code duplicated, block: B:29:0x009c A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:30:0x009d  */
    /* JADX WARN: Code duplicated, block: B:32:0x00a4 A[Catch: all -> 0x003b, TRY_LEAVE, TryCatch #0 {all -> 0x003b, blocks: (B:13:0x0036, B:25:0x0067, B:27:0x007e, B:32:0x00a4, B:35:0x00d8, B:20:0x0052, B:23:0x005e), top: B:44:0x0028 }] */
    /* JADX WARN: Code duplicated, block: B:35:0x00d8 A[Catch: all -> 0x003b, TRY_ENTER, TRY_LEAVE, TryCatch #0 {all -> 0x003b, blocks: (B:13:0x0036, B:25:0x0067, B:27:0x007e, B:32:0x00a4, B:35:0x00d8, B:20:0x0052, B:23:0x005e), top: B:44:0x0028 }] */
    /* JADX WARN: Code duplicated, block: B:37:0x00e8 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:26:0x007c -> B:39:0x00eb). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:36:0x00e6 -> B:38:0x00e9). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final java.lang.Object draadjrbmk(lg.gxszxtbevo r19) {
        /*
            Method dump skipped, instruction units count: 290
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: n0.nufgyqmvbu.draadjrbmk(lg.gxszxtbevo):java.lang.Object");
    }

    @Override // androidx.compose.runtime.i1
    public Object getValue() {
        return this.f68292esjtqupxsv.getValue();
    }

    public final boolean wkgbmnqykc() {
        return this.f68295lereixgezr;
    }
}
