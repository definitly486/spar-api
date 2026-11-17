package jztzpxfvev;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public abstract class cllcsxoeiz {

    static final class iobyxmoadg extends kotlin.coroutines.jvm.internal.wkgbmnqykc {

        /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
        int f52641iwizpuwonk;

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        /* synthetic */ Object f52642jyumaefscl;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        Object f52643yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        Object f52644zdlpuopuiu;

        iobyxmoadg(lg.gxszxtbevo gxszxtbevoVar) {
            super(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            this.f52642jyumaefscl = obj;
            this.f52641iwizpuwonk |= Integer.MIN_VALUE;
            return cllcsxoeiz.zoijcleaow(null, null, this);
        }
    }

    static final class zoijcleaow extends kotlin.coroutines.jvm.internal.gtknphoqwx implements tg.rgvfuqvkyq {

        /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
        final /* synthetic */ tg.rgvfuqvkyq f52645cqumvgiudr;

        /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
        final /* synthetic */ lg.btonecajqb f52646iwizpuwonk;

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        private /* synthetic */ Object f52647jyumaefscl;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        int f52648yggfygwlhe;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        zoijcleaow(lg.btonecajqb btonecajqbVar, tg.rgvfuqvkyq rgvfuqvkyqVar, lg.gxszxtbevo gxszxtbevoVar) {
            super(2, gxszxtbevoVar);
            this.f52646iwizpuwonk = btonecajqbVar;
            this.f52645cqumvgiudr = rgvfuqvkyqVar;
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
            zoijcleaow zoijcleaowVar = new zoijcleaow(this.f52646iwizpuwonk, this.f52645cqumvgiudr, gxszxtbevoVar);
            zoijcleaowVar.f52647jyumaefscl = obj;
            return zoijcleaowVar;
        }

        /* JADX WARN: Code duplicated, block: B:23:0x0050 A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:24:0x0051  */
        /* JADX WARN: Code duplicated, block: B:27:0x005c A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:40:0x0044 A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r1v0, types: [int] */
        /* JADX WARN: Type inference failed for: r1v1 */
        /* JADX WARN: Type inference failed for: r1v10 */
        /* JADX WARN: Type inference failed for: r1v11 */
        /* JADX WARN: Type inference failed for: r1v18 */
        /* JADX WARN: Type inference failed for: r1v19 */
        /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, t.zoijcleaow] */
        /* JADX WARN: Type inference failed for: r1v20 */
        /* JADX WARN: Type inference failed for: r1v21 */
        /* JADX WARN: Type inference failed for: r1v22 */
        /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object, t.zoijcleaow] */
        /* JADX WARN: Type inference failed for: r1v7 */
        /* JADX WARN: Type inference failed for: r1v8, types: [tg.rgvfuqvkyq] */
        /* JADX WARN: Type inference failed for: r9v12 */
        /* JADX WARN: Type inference failed for: r9v5, types: [java.lang.Object] */
        /* JADX WARN: Type inference failed for: r9v8 */
        /* JADX WARN: Type inference fix 'apply assigned field type' failed
        java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
        	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
        	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
        	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
         */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:26:0x005a -> B:12:0x0029). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:33:0x0071 -> B:12:0x0029). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final java.lang.Object invokeSuspend(java.lang.Object r9) {
            /*
                r8 = this;
                java.lang.Object r0 = mg.zoijcleaow.gxszxtbevo()
                int r1 = r8.f52648yggfygwlhe
                r2 = 3
                r3 = 2
                r4 = 0
                r5 = 1
                if (r1 == 0) goto L35
                if (r1 == r5) goto L2d
                if (r1 == r3) goto L22
                if (r1 != r2) goto L1a
                java.lang.Object r1 = r8.f52647jyumaefscl
                t.zoijcleaow r1 = (t.zoijcleaow) r1
                gg.zdlpuopuiu.zoijcleaow(r9)
                goto L29
            L1a:
                java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r9.<init>(r0)
                throw r9
            L22:
                java.lang.Object r1 = r8.f52647jyumaefscl
                t.zoijcleaow r1 = (t.zoijcleaow) r1
                gg.zdlpuopuiu.zoijcleaow(r9)     // Catch: java.util.concurrent.CancellationException -> L2b
            L29:
                r9 = r1
                goto L3c
            L2b:
                r9 = move-exception
                goto L61
            L2d:
                java.lang.Object r1 = r8.f52647jyumaefscl
                t.zoijcleaow r1 = (t.zoijcleaow) r1
                gg.zdlpuopuiu.zoijcleaow(r9)     // Catch: java.util.concurrent.CancellationException -> L2b
                goto L52
            L35:
                gg.zdlpuopuiu.zoijcleaow(r9)
                java.lang.Object r9 = r8.f52647jyumaefscl
                t.zoijcleaow r9 = (t.zoijcleaow) r9
            L3c:
                lg.btonecajqb r1 = r8.f52646iwizpuwonk
                boolean r1 = pj.dvvnrvtcbc.agtfadlqog(r1)
                if (r1 == 0) goto L75
                tg.rgvfuqvkyq r1 = r8.f52645cqumvgiudr     // Catch: java.util.concurrent.CancellationException -> L5d
                r8.f52647jyumaefscl = r9     // Catch: java.util.concurrent.CancellationException -> L5d
                r8.f52648yggfygwlhe = r5     // Catch: java.util.concurrent.CancellationException -> L5d
                java.lang.Object r1 = r1.invoke(r9, r8)     // Catch: java.util.concurrent.CancellationException -> L5d
                if (r1 != r0) goto L51
                return r0
            L51:
                r1 = r9
            L52:
                r8.f52647jyumaefscl = r1     // Catch: java.util.concurrent.CancellationException -> L2b
                r8.f52648yggfygwlhe = r3     // Catch: java.util.concurrent.CancellationException -> L2b
                java.lang.Object r9 = jztzpxfvev.cllcsxoeiz.ppxfxbqfkf(r1, r4, r8, r5, r4)     // Catch: java.util.concurrent.CancellationException -> L2b
                if (r9 != r0) goto L29
                return r0
            L5d:
                r1 = move-exception
                r7 = r1
                r1 = r9
                r9 = r7
            L61:
                lg.btonecajqb r6 = r8.f52646iwizpuwonk
                boolean r6 = pj.dvvnrvtcbc.agtfadlqog(r6)
                if (r6 == 0) goto L74
                r8.f52647jyumaefscl = r1
                r8.f52648yggfygwlhe = r2
                java.lang.Object r9 = jztzpxfvev.cllcsxoeiz.ppxfxbqfkf(r1, r4, r8, r5, r4)
                if (r9 != r0) goto L29
                return r0
            L74:
                throw r9
            L75:
                gg.wwaezpbzkn r9 = gg.wwaezpbzkn.f37140iobyxmoadg
                return r9
            */
            throw new UnsupportedOperationException("Method not decompiled: jztzpxfvev.cllcsxoeiz.zoijcleaow.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // tg.rgvfuqvkyq
        /* JADX INFO: renamed from: ojitshcjhn, reason: merged with bridge method [inline-methods] */
        public final Object invoke(t.zoijcleaow zoijcleaowVar, lg.gxszxtbevo gxszxtbevoVar) {
            return ((zoijcleaow) create(zoijcleaowVar, gxszxtbevoVar)).invokeSuspend(gg.wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    public static final boolean iobyxmoadg(t.zoijcleaow zoijcleaowVar) {
        List listPpxfxbqfkf = zoijcleaowVar.b().ppxfxbqfkf();
        int size = listPpxfxbqfkf.size();
        boolean z13 = false;
        for (int i13 = 0; i13 < size; i13++) {
            if (((t.pmvmpeiblj) listPpxfxbqfkf.get(i13)).dxjokdxxww()) {
                z13 = true;
                break;
            }
        }
        return !z13;
    }

    public static /* synthetic */ Object ppxfxbqfkf(t.zoijcleaow zoijcleaowVar, t.oxmwwwfdhm oxmwwwfdhmVar, lg.gxszxtbevo gxszxtbevoVar, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            oxmwwwfdhmVar = t.oxmwwwfdhm.Final;
        }
        return zoijcleaow(zoijcleaowVar, oxmwwwfdhmVar, gxszxtbevoVar);
    }

    public static final Object wkgbmnqykc(t.ylkuphrtab ylkuphrtabVar, tg.rgvfuqvkyq rgvfuqvkyqVar, lg.gxszxtbevo gxszxtbevoVar) {
        Object objX = ylkuphrtabVar.X(new zoijcleaow(gxszxtbevoVar.getContext(), rgvfuqvkyqVar, null), gxszxtbevoVar);
        return objX == mg.zoijcleaow.gxszxtbevo() ? objX : gg.wwaezpbzkn.f37140iobyxmoadg;
    }

    /* JADX WARN: Code duplicated, block: B:21:0x005f  */
    /* JADX WARN: Code duplicated, block: B:24:0x006c A[LOOP:0: B:20:0x005d->B:24:0x006c, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:27:0x006f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:28:0x0045 A[EDGE_INSN: B:28:0x0045->B:16:0x0045 BREAK  A[LOOP:0: B:20:0x005d->B:24:0x006c], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x004f -> B:19:0x0052). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public static final java.lang.Object zoijcleaow(t.zoijcleaow r7, t.oxmwwwfdhm r8, lg.gxszxtbevo r9) {
        /*
            boolean r0 = r9 instanceof jztzpxfvev.cllcsxoeiz.iobyxmoadg
            if (r0 == 0) goto L13
            r0 = r9
            jztzpxfvev.cllcsxoeiz$iobyxmoadg r0 = (jztzpxfvev.cllcsxoeiz.iobyxmoadg) r0
            int r1 = r0.f52641iwizpuwonk
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f52641iwizpuwonk = r1
            goto L18
        L13:
            jztzpxfvev.cllcsxoeiz$iobyxmoadg r0 = new jztzpxfvev.cllcsxoeiz$iobyxmoadg
            r0.<init>(r9)
        L18:
            java.lang.Object r9 = r0.f52642jyumaefscl
            java.lang.Object r1 = mg.zoijcleaow.gxszxtbevo()
            int r2 = r0.f52641iwizpuwonk
            r3 = 1
            if (r2 == 0) goto L3c
            if (r2 != r3) goto L34
            java.lang.Object r7 = r0.f52643yggfygwlhe
            t.oxmwwwfdhm r7 = (t.oxmwwwfdhm) r7
            java.lang.Object r8 = r0.f52644zdlpuopuiu
            t.zoijcleaow r8 = (t.zoijcleaow) r8
            gg.zdlpuopuiu.zoijcleaow(r9)
            r6 = r8
            r8 = r7
            r7 = r6
            goto L52
        L34:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L3c:
            gg.zdlpuopuiu.zoijcleaow(r9)
            boolean r9 = iobyxmoadg(r7)
            if (r9 != 0) goto L6f
        L45:
            r0.f52644zdlpuopuiu = r7
            r0.f52643yggfygwlhe = r8
            r0.f52641iwizpuwonk = r3
            java.lang.Object r9 = r7.yzdjzghtvl(r8, r0)
            if (r9 != r1) goto L52
            return r1
        L52:
            t.rgvfuqvkyq r9 = (t.rgvfuqvkyq) r9
            java.util.List r9 = r9.ppxfxbqfkf()
            int r2 = r9.size()
            r4 = 0
        L5d:
            if (r4 >= r2) goto L6f
            java.lang.Object r5 = r9.get(r4)
            t.pmvmpeiblj r5 = (t.pmvmpeiblj) r5
            boolean r5 = r5.dxjokdxxww()
            if (r5 == 0) goto L6c
            goto L45
        L6c:
            int r4 = r4 + 1
            goto L5d
        L6f:
            gg.wwaezpbzkn r7 = gg.wwaezpbzkn.f37140iobyxmoadg
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: jztzpxfvev.cllcsxoeiz.zoijcleaow(t.zoijcleaow, t.oxmwwwfdhm, lg.gxszxtbevo):java.lang.Object");
    }
}
