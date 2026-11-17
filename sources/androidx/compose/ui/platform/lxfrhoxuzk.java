package androidx.compose.ui.platform;

import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes.dex */
public final class lxfrhoxuzk {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    public static final lxfrhoxuzk f7005iobyxmoadg = new lxfrhoxuzk();

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private static final AtomicBoolean f7008zoijcleaow = new AtomicBoolean(false);

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private static final AtomicBoolean f7006ppxfxbqfkf = new AtomicBoolean(false);

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    public static final int f7007wkgbmnqykc = 8;

    static final class iobyxmoadg extends kotlin.coroutines.jvm.internal.draadjrbmk implements tg.rgvfuqvkyq {

        /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
        final /* synthetic */ rj.lqeggnwhkg f7009iwizpuwonk;

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        int f7010jyumaefscl;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        Object f7011yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        Object f7012zdlpuopuiu;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        iobyxmoadg(rj.lqeggnwhkg lqeggnwhkgVar, lg.gxszxtbevo gxszxtbevoVar) {
            super(2, gxszxtbevoVar);
            this.f7009iwizpuwonk = lqeggnwhkgVar;
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
            return new iobyxmoadg(this.f7009iwizpuwonk, gxszxtbevoVar);
        }

        /* JADX WARN: Code duplicated, block: B:16:0x0037 A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:19:0x0040 A[Catch: all -> 0x0017, TryCatch #0 {all -> 0x0017, blocks: (B:6:0x0013, B:17:0x0038, B:19:0x0040, B:14:0x002b, B:20:0x0054, B:13:0x0026), top: B:27:0x0007 }] */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:15:0x0035 -> B:17:0x0038). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final java.lang.Object invokeSuspend(java.lang.Object r6) {
            /*
                r5 = this;
                java.lang.Object r0 = mg.zoijcleaow.gxszxtbevo()
                int r1 = r5.f7010jyumaefscl
                r2 = 1
                if (r1 == 0) goto L21
                if (r1 != r2) goto L19
                java.lang.Object r1 = r5.f7011yggfygwlhe
                rj.dxjokdxxww r1 = (rj.dxjokdxxww) r1
                java.lang.Object r3 = r5.f7012zdlpuopuiu
                rj.jyumaefscl r3 = (rj.jyumaefscl) r3
                gg.zdlpuopuiu.zoijcleaow(r6)     // Catch: java.lang.Throwable -> L17
                goto L38
            L17:
                r6 = move-exception
                goto L5d
            L19:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r0)
                throw r6
            L21:
                gg.zdlpuopuiu.zoijcleaow(r6)
                rj.lqeggnwhkg r3 = r5.f7009iwizpuwonk
                rj.dxjokdxxww r6 = r3.iterator()     // Catch: java.lang.Throwable -> L17
                r1 = r6
            L2b:
                r5.f7012zdlpuopuiu = r3     // Catch: java.lang.Throwable -> L17
                r5.f7011yggfygwlhe = r1     // Catch: java.lang.Throwable -> L17
                r5.f7010jyumaefscl = r2     // Catch: java.lang.Throwable -> L17
                java.lang.Object r6 = r1.iobyxmoadg(r5)     // Catch: java.lang.Throwable -> L17
                if (r6 != r0) goto L38
                return r0
            L38:
                java.lang.Boolean r6 = (java.lang.Boolean) r6     // Catch: java.lang.Throwable -> L17
                boolean r6 = r6.booleanValue()     // Catch: java.lang.Throwable -> L17
                if (r6 == 0) goto L54
                java.lang.Object r6 = r1.next()     // Catch: java.lang.Throwable -> L17
                gg.wwaezpbzkn r6 = (gg.wwaezpbzkn) r6     // Catch: java.lang.Throwable -> L17
                java.util.concurrent.atomic.AtomicBoolean r6 = androidx.compose.ui.platform.lxfrhoxuzk.iobyxmoadg()     // Catch: java.lang.Throwable -> L17
                r4 = 0
                r6.set(r4)     // Catch: java.lang.Throwable -> L17
                androidx.compose.runtime.snapshots.lqeggnwhkg$iobyxmoadg r6 = androidx.compose.runtime.snapshots.lqeggnwhkg.f6010eablkybsjg     // Catch: java.lang.Throwable -> L17
                r6.agtfadlqog()     // Catch: java.lang.Throwable -> L17
                goto L2b
            L54:
                gg.wwaezpbzkn r6 = gg.wwaezpbzkn.f37140iobyxmoadg     // Catch: java.lang.Throwable -> L17
                r6 = 0
                rj.agtfadlqog.iobyxmoadg(r3, r6)
                gg.wwaezpbzkn r6 = gg.wwaezpbzkn.f37140iobyxmoadg
                return r6
            L5d:
                throw r6     // Catch: java.lang.Throwable -> L5e
            L5e:
                r0 = move-exception
                rj.agtfadlqog.iobyxmoadg(r3, r6)
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.platform.lxfrhoxuzk.iobyxmoadg.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // tg.rgvfuqvkyq
        public final Object invoke(pj.cllcsxoeiz cllcsxoeizVar, lg.gxszxtbevo gxszxtbevoVar) {
            return ((iobyxmoadg) create(cllcsxoeizVar, gxszxtbevoVar)).invokeSuspend(gg.wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    static final class zoijcleaow extends kotlin.jvm.internal.jyumaefscl implements tg.draadjrbmk {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final /* synthetic */ rj.lqeggnwhkg f7013zdlpuopuiu;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        zoijcleaow(rj.lqeggnwhkg lqeggnwhkgVar) {
            super(1);
            this.f7013zdlpuopuiu = lqeggnwhkgVar;
        }

        @Override // tg.draadjrbmk
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            m1invoke(obj);
            return gg.wwaezpbzkn.f37140iobyxmoadg;
        }

        /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
        public final void m1invoke(Object obj) {
            if (lxfrhoxuzk.f7006ppxfxbqfkf.compareAndSet(false, true)) {
                this.f7013zdlpuopuiu.eablkybsjg(gg.wwaezpbzkn.f37140iobyxmoadg);
            }
        }
    }

    private lxfrhoxuzk() {
    }

    public final void zoijcleaow() {
        if (f7008zoijcleaow.compareAndSet(false, true)) {
            rj.lqeggnwhkg lqeggnwhkgVarZoijcleaow = rj.btonecajqb.zoijcleaow(1, null, null, 6, null);
            pj.gtknphoqwx.wkgbmnqykc(pj.dsvhmnatus.iobyxmoadg(dsvhmnatus.f6850yadqdtsiqt.zoijcleaow()), null, null, new iobyxmoadg(lqeggnwhkgVarZoijcleaow, null), 3, null);
            androidx.compose.runtime.snapshots.lqeggnwhkg.f6010eablkybsjg.gtknphoqwx(new zoijcleaow(lqeggnwhkgVarZoijcleaow));
        }
    }
}
