package zeieaojujs;

import g.eablkybsjg;
import gg.wwaezpbzkn;
import gg.zdlpuopuiu;
import jztzpxfvev.cllcsxoeiz;
import jztzpxfvev.nuxfzjnpeb;
import kotlin.coroutines.jvm.internal.gtknphoqwx;
import kotlin.coroutines.jvm.internal.wkgbmnqykc;
import lg.gxszxtbevo;
import t.pmvmpeiblj;
import t.ylkuphrtab;
import tg.draadjrbmk;
import tg.rgvfuqvkyq;

/* JADX INFO: loaded from: classes.dex */
public abstract class iobyxmoadg {

    /* JADX INFO: renamed from: zeieaojujs.iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
    static final class C3303iobyxmoadg extends wkgbmnqykc {

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        int f129824jyumaefscl;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        /* synthetic */ Object f129825yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        Object f129826zdlpuopuiu;

        C3303iobyxmoadg(gxszxtbevo gxszxtbevoVar) {
            super(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            this.f129825yggfygwlhe = obj;
            this.f129824jyumaefscl |= Integer.MIN_VALUE;
            return iobyxmoadg.zoijcleaow(null, this);
        }
    }

    static final class zoijcleaow extends gtknphoqwx implements rgvfuqvkyq {

        /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
        final /* synthetic */ draadjrbmk f129827iwizpuwonk;

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        private /* synthetic */ Object f129828jyumaefscl;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        int f129829yggfygwlhe;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        zoijcleaow(draadjrbmk draadjrbmkVar, gxszxtbevo gxszxtbevoVar) {
            super(2, gxszxtbevoVar);
            this.f129827iwizpuwonk = draadjrbmkVar;
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final gxszxtbevo create(Object obj, gxszxtbevo gxszxtbevoVar) {
            zoijcleaow zoijcleaowVar = new zoijcleaow(this.f129827iwizpuwonk, gxszxtbevoVar);
            zoijcleaowVar.f129828jyumaefscl = obj;
            return zoijcleaowVar;
        }

        /* JADX WARN: Code duplicated, block: B:18:0x0057  */
        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            t.zoijcleaow zoijcleaowVar;
            pmvmpeiblj pmvmpeibljVar;
            Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
            int i13 = this.f129829yggfygwlhe;
            if (i13 != 0) {
                if (i13 == 1) {
                    zoijcleaowVar = (t.zoijcleaow) this.f129828jyumaefscl;
                    zdlpuopuiu.zoijcleaow(obj);
                } else {
                    if (i13 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    zdlpuopuiu.zoijcleaow(obj);
                }
                pmvmpeibljVar = (pmvmpeiblj) obj;
                if (pmvmpeibljVar != null) {
                    pmvmpeibljVar.iobyxmoadg();
                }
                return wwaezpbzkn.f37140iobyxmoadg;
            }
            zdlpuopuiu.zoijcleaow(obj);
            zoijcleaowVar = (t.zoijcleaow) this.f129828jyumaefscl;
            this.f129828jyumaefscl = zoijcleaowVar;
            this.f129829yggfygwlhe = 1;
            obj = iobyxmoadg.zoijcleaow(zoijcleaowVar, this);
            if (obj == objGxszxtbevo) {
                return objGxszxtbevo;
            }
            pmvmpeiblj pmvmpeibljVar2 = (pmvmpeiblj) obj;
            pmvmpeibljVar2.iobyxmoadg();
            this.f129827iwizpuwonk.invoke(eablkybsjg.wkgbmnqykc(pmvmpeibljVar2.nufgyqmvbu()));
            this.f129828jyumaefscl = null;
            this.f129829yggfygwlhe = 2;
            obj = nuxfzjnpeb.zdlpuopuiu(zoijcleaowVar, null, this, 1, null);
            if (obj == objGxszxtbevo) {
                return objGxszxtbevo;
            }
            pmvmpeibljVar = (pmvmpeiblj) obj;
            if (pmvmpeibljVar != null) {
                pmvmpeibljVar.iobyxmoadg();
            }
            return wwaezpbzkn.f37140iobyxmoadg;
        }

        @Override // tg.rgvfuqvkyq
        /* JADX INFO: renamed from: ojitshcjhn, reason: merged with bridge method [inline-methods] */
        public final Object invoke(t.zoijcleaow zoijcleaowVar, gxszxtbevo gxszxtbevoVar) {
            return ((zoijcleaow) create(zoijcleaowVar, gxszxtbevoVar)).invokeSuspend(wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    public static final Object ppxfxbqfkf(ylkuphrtab ylkuphrtabVar, draadjrbmk draadjrbmkVar, gxszxtbevo gxszxtbevoVar) {
        Object objWkgbmnqykc = cllcsxoeiz.wkgbmnqykc(ylkuphrtabVar, new zoijcleaow(draadjrbmkVar, null), gxszxtbevoVar);
        return objWkgbmnqykc == mg.zoijcleaow.gxszxtbevo() ? objWkgbmnqykc : wwaezpbzkn.f37140iobyxmoadg;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:22:0x005c  */
    /* JADX WARN: Code duplicated, block: B:25:0x0069 A[LOOP:0: B:21:0x005a->B:25:0x0069, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:29:0x0038 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x0041 -> B:18:0x0044). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public static final java.lang.Object zoijcleaow(t.zoijcleaow r8, lg.gxszxtbevo r9) {
        /*
            boolean r0 = r9 instanceof zeieaojujs.iobyxmoadg.C3303iobyxmoadg
            if (r0 == 0) goto L13
            r0 = r9
            zeieaojujs.iobyxmoadg$iobyxmoadg r0 = (zeieaojujs.iobyxmoadg.C3303iobyxmoadg) r0
            int r1 = r0.f129824jyumaefscl
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f129824jyumaefscl = r1
            goto L18
        L13:
            zeieaojujs.iobyxmoadg$iobyxmoadg r0 = new zeieaojujs.iobyxmoadg$iobyxmoadg
            r0.<init>(r9)
        L18:
            java.lang.Object r9 = r0.f129825yggfygwlhe
            java.lang.Object r1 = mg.zoijcleaow.gxszxtbevo()
            int r2 = r0.f129824jyumaefscl
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            java.lang.Object r8 = r0.f129826zdlpuopuiu
            t.zoijcleaow r8 = (t.zoijcleaow) r8
            gg.zdlpuopuiu.zoijcleaow(r9)
            goto L44
        L2d:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L35:
            gg.zdlpuopuiu.zoijcleaow(r9)
        L38:
            r0.f129826zdlpuopuiu = r8
            r0.f129824jyumaefscl = r3
            r9 = 0
            java.lang.Object r9 = t.zoijcleaow.o(r8, r9, r0, r3, r9)
            if (r9 != r1) goto L44
            return r1
        L44:
            t.rgvfuqvkyq r9 = (t.rgvfuqvkyq) r9
            int r2 = r9.zoijcleaow()
            boolean r2 = t.zdlpuopuiu.ppxfxbqfkf(r2)
            if (r2 == 0) goto L38
            java.util.List r2 = r9.ppxfxbqfkf()
            int r4 = r2.size()
            r5 = 0
            r6 = r5
        L5a:
            if (r6 >= r4) goto L6c
            java.lang.Object r7 = r2.get(r6)
            t.pmvmpeiblj r7 = (t.pmvmpeiblj) r7
            boolean r7 = t.vdvldrhtss.iobyxmoadg(r7)
            if (r7 != 0) goto L69
            goto L38
        L69:
            int r6 = r6 + 1
            goto L5a
        L6c:
            java.util.List r8 = r9.ppxfxbqfkf()
            java.lang.Object r8 = r8.get(r5)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: zeieaojujs.iobyxmoadg.zoijcleaow(t.zoijcleaow, lg.gxszxtbevo):java.lang.Object");
    }
}
