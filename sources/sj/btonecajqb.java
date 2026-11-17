package sj;

/* JADX INFO: loaded from: classes3.dex */
abstract /* synthetic */ class btonecajqb {

    public static final class iobyxmoadg implements lqeggnwhkg {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final /* synthetic */ Object[] f106805zdlpuopuiu;

        /* JADX INFO: renamed from: sj.btonecajqb$iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
        public static final class C2612iobyxmoadg extends kotlin.coroutines.jvm.internal.wkgbmnqykc {

            /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
            Object f106806cqumvgiudr;

            /* JADX INFO: renamed from: esjtqupxsv, reason: collision with root package name */
            int f106807esjtqupxsv;

            /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
            Object f106808iwizpuwonk;

            /* JADX INFO: renamed from: lereixgezr, reason: collision with root package name */
            int f106810lereixgezr;

            /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
            int f106811yggfygwlhe;

            /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
            /* synthetic */ Object f106812zdlpuopuiu;

            public C2612iobyxmoadg(lg.gxszxtbevo gxszxtbevoVar) {
                super(gxszxtbevoVar);
            }

            @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
            public final Object invokeSuspend(Object obj) {
                this.f106812zdlpuopuiu = obj;
                this.f106811yggfygwlhe |= Integer.MIN_VALUE;
                return iobyxmoadg.this.collect(null, this);
            }
        }

        public iobyxmoadg(Object[] objArr) {
            this.f106805zdlpuopuiu = objArr;
        }

        /* JADX WARN: Code duplicated, block: B:16:0x004b  */
        /* JADX WARN: Code duplicated, block: B:18:0x005f A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x005d -> B:19:0x0060). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        @Override // sj.lqeggnwhkg
        public java.lang.Object collect(sj.nufgyqmvbu r8, lg.gxszxtbevo r9) {
            /*
                r7 = this;
                boolean r0 = r9 instanceof sj.btonecajqb.iobyxmoadg.C2612iobyxmoadg
                if (r0 == 0) goto L13
                r0 = r9
                sj.btonecajqb$iobyxmoadg$iobyxmoadg r0 = (sj.btonecajqb.iobyxmoadg.C2612iobyxmoadg) r0
                int r1 = r0.f106811yggfygwlhe
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.f106811yggfygwlhe = r1
                goto L18
            L13:
                sj.btonecajqb$iobyxmoadg$iobyxmoadg r0 = new sj.btonecajqb$iobyxmoadg$iobyxmoadg
                r0.<init>(r9)
            L18:
                java.lang.Object r9 = r0.f106812zdlpuopuiu
                java.lang.Object r1 = mg.zoijcleaow.gxszxtbevo()
                int r2 = r0.f106811yggfygwlhe
                r3 = 1
                if (r2 == 0) goto L3e
                if (r2 != r3) goto L36
                int r8 = r0.f106810lereixgezr
                int r2 = r0.f106807esjtqupxsv
                java.lang.Object r4 = r0.f106806cqumvgiudr
                sj.nufgyqmvbu r4 = (sj.nufgyqmvbu) r4
                java.lang.Object r5 = r0.f106808iwizpuwonk
                sj.btonecajqb$iobyxmoadg r5 = (sj.btonecajqb.iobyxmoadg) r5
                gg.zdlpuopuiu.zoijcleaow(r9)
                r9 = r4
                goto L60
            L36:
                java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
                r8.<init>(r9)
                throw r8
            L3e:
                gg.zdlpuopuiu.zoijcleaow(r9)
                java.lang.Object[] r9 = r7.f106805zdlpuopuiu
                int r9 = r9.length
                r2 = 0
                r5 = r7
                r6 = r9
                r9 = r8
                r8 = r6
            L49:
                if (r2 >= r8) goto L62
                java.lang.Object[] r4 = r5.f106805zdlpuopuiu
                r4 = r4[r2]
                r0.f106808iwizpuwonk = r5
                r0.f106806cqumvgiudr = r9
                r0.f106807esjtqupxsv = r2
                r0.f106810lereixgezr = r8
                r0.f106811yggfygwlhe = r3
                java.lang.Object r4 = r9.emit(r4, r0)
                if (r4 != r1) goto L60
                return r1
            L60:
                int r2 = r2 + r3
                goto L49
            L62:
                gg.wwaezpbzkn r8 = gg.wwaezpbzkn.f37140iobyxmoadg
                return r8
            */
            throw new UnsupportedOperationException("Method not decompiled: sj.btonecajqb.iobyxmoadg.collect(sj.nufgyqmvbu, lg.gxszxtbevo):java.lang.Object");
        }
    }

    public static final class zoijcleaow implements lqeggnwhkg {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final /* synthetic */ Object f106813zdlpuopuiu;

        public zoijcleaow(Object obj) {
            this.f106813zdlpuopuiu = obj;
        }

        @Override // sj.lqeggnwhkg
        public Object collect(nufgyqmvbu nufgyqmvbuVar, lg.gxszxtbevo gxszxtbevoVar) {
            Object objEmit = nufgyqmvbuVar.emit(this.f106813zdlpuopuiu, gxszxtbevoVar);
            return objEmit == mg.zoijcleaow.gxszxtbevo() ? objEmit : gg.wwaezpbzkn.f37140iobyxmoadg;
        }
    }

    public static final lqeggnwhkg eablkybsjg(Object obj) {
        return new zoijcleaow(obj);
    }

    public static final lqeggnwhkg gxszxtbevo(Object... objArr) {
        return new iobyxmoadg(objArr);
    }

    public static final lqeggnwhkg iobyxmoadg(tg.rgvfuqvkyq rgvfuqvkyqVar) {
        return new sj.zoijcleaow(rgvfuqvkyqVar, null, 0, null, 14, null);
    }

    public static final lqeggnwhkg ppxfxbqfkf() {
        return gxszxtbevo.f106893zdlpuopuiu;
    }

    public static final lqeggnwhkg wkgbmnqykc(tg.rgvfuqvkyq rgvfuqvkyqVar) {
        return new yadqdtsiqt(rgvfuqvkyqVar);
    }

    public static final lqeggnwhkg zoijcleaow(tg.rgvfuqvkyq rgvfuqvkyqVar) {
        return new wkgbmnqykc(rgvfuqvkyqVar, null, 0, null, 14, null);
    }
}
