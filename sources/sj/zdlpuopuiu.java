package sj;

import java.util.concurrent.CancellationException;
import pj.auzgnhcxok;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: loaded from: classes3.dex */
public abstract /* synthetic */ class zdlpuopuiu {

    static final class eablkybsjg extends kotlin.coroutines.jvm.internal.draadjrbmk implements tg.oxmwwwfdhm {

        /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
        final /* synthetic */ tg.rgvfuqvkyq f107104cqumvgiudr;

        /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
        final /* synthetic */ long f107105iwizpuwonk;

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        /* synthetic */ long f107106jyumaefscl;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        /* synthetic */ Object f107107yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        int f107108zdlpuopuiu;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        eablkybsjg(long j13, tg.rgvfuqvkyq rgvfuqvkyqVar, lg.gxszxtbevo gxszxtbevoVar) {
            super(4, gxszxtbevoVar);
            this.f107105iwizpuwonk = j13;
            this.f107104cqumvgiudr = rgvfuqvkyqVar;
        }

        @Override // tg.oxmwwwfdhm
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
            return ojitshcjhn((nufgyqmvbu) obj, (Throwable) obj2, ((Number) obj3).longValue(), (lg.gxszxtbevo) obj4);
        }

        /* JADX WARN: Code duplicated, block: B:16:0x003a  */
        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
            int i13 = this.f107108zdlpuopuiu;
            if (i13 == 0) {
                gg.zdlpuopuiu.zoijcleaow(obj);
                Throwable th2 = (Throwable) this.f107107yggfygwlhe;
                if (this.f107106jyumaefscl < this.f107105iwizpuwonk) {
                    tg.rgvfuqvkyq rgvfuqvkyqVar = this.f107104cqumvgiudr;
                    this.f107108zdlpuopuiu = 1;
                    obj = rgvfuqvkyqVar.invoke(th2, this);
                    if (obj == objGxszxtbevo) {
                        return objGxszxtbevo;
                    }
                }
                return kotlin.coroutines.jvm.internal.zoijcleaow.iobyxmoadg(z);
            }
            if (i13 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            gg.zdlpuopuiu.zoijcleaow(obj);
            boolean z13 = ((Boolean) obj).booleanValue();
            return kotlin.coroutines.jvm.internal.zoijcleaow.iobyxmoadg(z13);
        }

        public final Object ojitshcjhn(nufgyqmvbu nufgyqmvbuVar, Throwable th2, long j13, lg.gxszxtbevo gxszxtbevoVar) {
            eablkybsjg eablkybsjgVar = new eablkybsjg(this.f107105iwizpuwonk, this.f107104cqumvgiudr, gxszxtbevoVar);
            eablkybsjgVar.f107107yggfygwlhe = th2;
            eablkybsjgVar.f107106jyumaefscl = j13;
            return eablkybsjgVar.invokeSuspend(gg.wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    public static final class gxszxtbevo implements lqeggnwhkg {

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        final /* synthetic */ tg.oxmwwwfdhm f107109yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final /* synthetic */ lqeggnwhkg f107110zdlpuopuiu;

        public static final class iobyxmoadg extends kotlin.coroutines.jvm.internal.wkgbmnqykc {

            /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
            Object f107111cqumvgiudr;

            /* JADX INFO: renamed from: esjtqupxsv, reason: collision with root package name */
            Object f107112esjtqupxsv;

            /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
            Object f107113iwizpuwonk;

            /* JADX INFO: renamed from: lereixgezr, reason: collision with root package name */
            long f107115lereixgezr;

            /* JADX INFO: renamed from: pmvmpeiblj, reason: collision with root package name */
            int f107116pmvmpeiblj;

            /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
            int f107117yggfygwlhe;

            /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
            /* synthetic */ Object f107118zdlpuopuiu;

            public iobyxmoadg(lg.gxszxtbevo gxszxtbevoVar) {
                super(gxszxtbevoVar);
            }

            @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
            public final Object invokeSuspend(Object obj) {
                this.f107118zdlpuopuiu = obj;
                this.f107117yggfygwlhe |= Integer.MIN_VALUE;
                return gxszxtbevo.this.collect(null, this);
            }
        }

        public gxszxtbevo(lqeggnwhkg lqeggnwhkgVar, tg.oxmwwwfdhm oxmwwwfdhmVar) {
            this.f107110zdlpuopuiu = lqeggnwhkgVar;
            this.f107109yggfygwlhe = oxmwwwfdhmVar;
        }

        /* JADX WARN: Code duplicated, block: B:19:0x006e A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:20:0x006f  */
        /* JADX WARN: Code duplicated, block: B:23:0x0078  */
        /* JADX WARN: Code duplicated, block: B:25:0x0096 A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:26:0x0097  */
        /* JADX WARN: Code duplicated, block: B:33:0x00ab  */
        /* JADX WARN: Code duplicated, block: B:35:0x00ae  */
        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x0076 -> B:30:0x00a6). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:26:0x0097 -> B:27:0x009a). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        @Override // sj.lqeggnwhkg
        public java.lang.Object collect(sj.nufgyqmvbu r12, lg.gxszxtbevo r13) {
            /*
                r11 = this;
                boolean r0 = r13 instanceof sj.zdlpuopuiu.gxszxtbevo.iobyxmoadg
                if (r0 == 0) goto L13
                r0 = r13
                sj.zdlpuopuiu$gxszxtbevo$iobyxmoadg r0 = (sj.zdlpuopuiu.gxszxtbevo.iobyxmoadg) r0
                int r1 = r0.f107117yggfygwlhe
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.f107117yggfygwlhe = r1
                goto L18
            L13:
                sj.zdlpuopuiu$gxszxtbevo$iobyxmoadg r0 = new sj.zdlpuopuiu$gxszxtbevo$iobyxmoadg
                r0.<init>(r13)
            L18:
                java.lang.Object r13 = r0.f107118zdlpuopuiu
                java.lang.Object r1 = mg.zoijcleaow.gxszxtbevo()
                int r2 = r0.f107117yggfygwlhe
                r3 = 2
                r4 = 1
                if (r2 == 0) goto L52
                if (r2 == r4) goto L42
                if (r2 != r3) goto L3a
                long r5 = r0.f107115lereixgezr
                java.lang.Object r12 = r0.f107112esjtqupxsv
                java.lang.Throwable r12 = (java.lang.Throwable) r12
                java.lang.Object r2 = r0.f107111cqumvgiudr
                sj.nufgyqmvbu r2 = (sj.nufgyqmvbu) r2
                java.lang.Object r7 = r0.f107113iwizpuwonk
                sj.zdlpuopuiu$gxszxtbevo r7 = (sj.zdlpuopuiu.gxszxtbevo) r7
                gg.zdlpuopuiu.zoijcleaow(r13)
                goto L9a
            L3a:
                java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
                java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
                r12.<init>(r13)
                throw r12
            L42:
                int r12 = r0.f107116pmvmpeiblj
                long r5 = r0.f107115lereixgezr
                java.lang.Object r2 = r0.f107111cqumvgiudr
                sj.nufgyqmvbu r2 = (sj.nufgyqmvbu) r2
                java.lang.Object r7 = r0.f107113iwizpuwonk
                sj.zdlpuopuiu$gxszxtbevo r7 = (sj.zdlpuopuiu.gxszxtbevo) r7
                gg.zdlpuopuiu.zoijcleaow(r13)
                goto L74
            L52:
                gg.zdlpuopuiu.zoijcleaow(r13)
                r5 = 0
                r13 = r11
            L58:
                sj.lqeggnwhkg r2 = r13.f107110zdlpuopuiu
                r0.f107113iwizpuwonk = r13
                r0.f107111cqumvgiudr = r12
                r7 = 0
                r0.f107112esjtqupxsv = r7
                r0.f107115lereixgezr = r5
                r7 = 0
                r0.f107116pmvmpeiblj = r7
                r0.f107117yggfygwlhe = r4
                java.lang.Object r2 = sj.dxjokdxxww.lqeggnwhkg(r2, r12, r0)
                if (r2 != r1) goto L6f
                return r1
            L6f:
                r10 = r2
                r2 = r12
                r12 = r7
                r7 = r13
                r13 = r10
            L74:
                java.lang.Throwable r13 = (java.lang.Throwable) r13
                if (r13 == 0) goto La6
                tg.oxmwwwfdhm r12 = r7.f107109yggfygwlhe
                java.lang.Long r8 = kotlin.coroutines.jvm.internal.zoijcleaow.eablkybsjg(r5)
                r0.f107113iwizpuwonk = r7
                r0.f107111cqumvgiudr = r2
                r0.f107112esjtqupxsv = r13
                r0.f107115lereixgezr = r5
                r0.f107117yggfygwlhe = r3
                r9 = 6
                kotlin.jvm.internal.oxmwwwfdhm.ppxfxbqfkf(r9)
                java.lang.Object r12 = r12.invoke(r2, r13, r8, r0)
                r8 = 7
                kotlin.jvm.internal.oxmwwwfdhm.ppxfxbqfkf(r8)
                if (r12 != r1) goto L97
                return r1
            L97:
                r10 = r13
                r13 = r12
                r12 = r10
            L9a:
                java.lang.Boolean r13 = (java.lang.Boolean) r13
                boolean r13 = r13.booleanValue()
                if (r13 == 0) goto La8
                r12 = 1
                long r5 = r5 + r12
                r12 = r4
            La6:
                r13 = r7
                goto La9
            La8:
                throw r12
            La9:
                if (r12 != 0) goto Lae
                gg.wwaezpbzkn r12 = gg.wwaezpbzkn.f37140iobyxmoadg
                return r12
            Lae:
                r12 = r2
                goto L58
            */
            throw new UnsupportedOperationException("Method not decompiled: sj.zdlpuopuiu.gxszxtbevo.collect(sj.nufgyqmvbu, lg.gxszxtbevo):java.lang.Object");
        }
    }

    public static final class iobyxmoadg implements lqeggnwhkg {

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        final /* synthetic */ tg.vdvldrhtss f107119yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final /* synthetic */ lqeggnwhkg f107120zdlpuopuiu;

        /* JADX INFO: renamed from: sj.zdlpuopuiu$iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
        public static final class C2628iobyxmoadg extends kotlin.coroutines.jvm.internal.wkgbmnqykc {

            /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
            Object f107121cqumvgiudr;

            /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
            Object f107122iwizpuwonk;

            /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
            int f107124yggfygwlhe;

            /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
            /* synthetic */ Object f107125zdlpuopuiu;

            public C2628iobyxmoadg(lg.gxszxtbevo gxszxtbevoVar) {
                super(gxszxtbevoVar);
            }

            @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
            public final Object invokeSuspend(Object obj) {
                this.f107125zdlpuopuiu = obj;
                this.f107124yggfygwlhe |= Integer.MIN_VALUE;
                return iobyxmoadg.this.collect(null, this);
            }
        }

        public iobyxmoadg(lqeggnwhkg lqeggnwhkgVar, tg.vdvldrhtss vdvldrhtssVar) {
            this.f107120zdlpuopuiu = lqeggnwhkgVar;
            this.f107119yggfygwlhe = vdvldrhtssVar;
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        @Override // sj.lqeggnwhkg
        public Object collect(nufgyqmvbu nufgyqmvbuVar, lg.gxszxtbevo gxszxtbevoVar) throws Throwable {
            C2628iobyxmoadg c2628iobyxmoadg;
            iobyxmoadg iobyxmoadgVar;
            if (gxszxtbevoVar instanceof C2628iobyxmoadg) {
                c2628iobyxmoadg = (C2628iobyxmoadg) gxszxtbevoVar;
                int i13 = c2628iobyxmoadg.f107124yggfygwlhe;
                if ((i13 & Integer.MIN_VALUE) != 0) {
                    c2628iobyxmoadg.f107124yggfygwlhe = i13 - Integer.MIN_VALUE;
                } else {
                    c2628iobyxmoadg = new C2628iobyxmoadg(gxszxtbevoVar);
                }
            } else {
                c2628iobyxmoadg = new C2628iobyxmoadg(gxszxtbevoVar);
            }
            Object objLqeggnwhkg = c2628iobyxmoadg.f107125zdlpuopuiu;
            Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
            int i14 = c2628iobyxmoadg.f107124yggfygwlhe;
            if (i14 != 0) {
                if (i14 == 1) {
                    nufgyqmvbuVar = (nufgyqmvbu) c2628iobyxmoadg.f107121cqumvgiudr;
                    iobyxmoadgVar = (iobyxmoadg) c2628iobyxmoadg.f107122iwizpuwonk;
                    gg.zdlpuopuiu.zoijcleaow(objLqeggnwhkg);
                } else {
                    if (i14 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    gg.zdlpuopuiu.zoijcleaow(objLqeggnwhkg);
                }
                return gg.wwaezpbzkn.f37140iobyxmoadg;
            }
            gg.zdlpuopuiu.zoijcleaow(objLqeggnwhkg);
            lqeggnwhkg lqeggnwhkgVar = this.f107120zdlpuopuiu;
            c2628iobyxmoadg.f107122iwizpuwonk = this;
            c2628iobyxmoadg.f107121cqumvgiudr = nufgyqmvbuVar;
            c2628iobyxmoadg.f107124yggfygwlhe = 1;
            objLqeggnwhkg = dxjokdxxww.lqeggnwhkg(lqeggnwhkgVar, nufgyqmvbuVar, c2628iobyxmoadg);
            if (objLqeggnwhkg == objGxszxtbevo) {
                return objGxszxtbevo;
            }
            iobyxmoadgVar = this;
            Throwable th2 = (Throwable) objLqeggnwhkg;
            if (th2 != null) {
                tg.vdvldrhtss vdvldrhtssVar = iobyxmoadgVar.f107119yggfygwlhe;
                c2628iobyxmoadg.f107122iwizpuwonk = null;
                c2628iobyxmoadg.f107121cqumvgiudr = null;
                c2628iobyxmoadg.f107124yggfygwlhe = 2;
                kotlin.jvm.internal.oxmwwwfdhm.ppxfxbqfkf(6);
                Object objInvoke = vdvldrhtssVar.invoke(nufgyqmvbuVar, th2, c2628iobyxmoadg);
                kotlin.jvm.internal.oxmwwwfdhm.ppxfxbqfkf(7);
                if (objInvoke == objGxszxtbevo) {
                    return objGxszxtbevo;
                }
            }
            return gg.wwaezpbzkn.f37140iobyxmoadg;
        }
    }

    static final class ppxfxbqfkf implements nufgyqmvbu {

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        final /* synthetic */ kotlin.jvm.internal.hkdspvbjdz f107126yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final /* synthetic */ nufgyqmvbu f107127zdlpuopuiu;

        static final class iobyxmoadg extends kotlin.coroutines.jvm.internal.wkgbmnqykc {

            /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
            int f107128iwizpuwonk;

            /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
            /* synthetic */ Object f107130yggfygwlhe;

            /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
            Object f107131zdlpuopuiu;

            iobyxmoadg(lg.gxszxtbevo gxszxtbevoVar) {
                super(gxszxtbevoVar);
            }

            @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
            public final Object invokeSuspend(Object obj) {
                this.f107130yggfygwlhe = obj;
                this.f107128iwizpuwonk |= Integer.MIN_VALUE;
                return ppxfxbqfkf.this.emit(null, this);
            }
        }

        ppxfxbqfkf(nufgyqmvbu nufgyqmvbuVar, kotlin.jvm.internal.hkdspvbjdz hkdspvbjdzVar) {
            this.f107127zdlpuopuiu = nufgyqmvbuVar;
            this.f107126yggfygwlhe = hkdspvbjdzVar;
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        @Override // sj.nufgyqmvbu
        public final Object emit(Object obj, lg.gxszxtbevo gxszxtbevoVar) throws Throwable {
            iobyxmoadg iobyxmoadgVar;
            ppxfxbqfkf ppxfxbqfkfVar;
            if (gxszxtbevoVar instanceof iobyxmoadg) {
                iobyxmoadgVar = (iobyxmoadg) gxszxtbevoVar;
                int i13 = iobyxmoadgVar.f107128iwizpuwonk;
                if ((i13 & Integer.MIN_VALUE) != 0) {
                    iobyxmoadgVar.f107128iwizpuwonk = i13 - Integer.MIN_VALUE;
                } else {
                    iobyxmoadgVar = new iobyxmoadg(gxszxtbevoVar);
                }
            } else {
                iobyxmoadgVar = new iobyxmoadg(gxszxtbevoVar);
            }
            Object obj2 = iobyxmoadgVar.f107130yggfygwlhe;
            Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
            int i14 = iobyxmoadgVar.f107128iwizpuwonk;
            if (i14 != 0) {
                if (i14 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ppxfxbqfkfVar = (ppxfxbqfkf) iobyxmoadgVar.f107131zdlpuopuiu;
                try {
                    gg.zdlpuopuiu.zoijcleaow(obj2);
                    return gg.wwaezpbzkn.f37140iobyxmoadg;
                } catch (Throwable th2) {
                    th = th2;
                    ppxfxbqfkfVar.f107126yggfygwlhe.f60015zdlpuopuiu = th;
                    throw th;
                }
            }
            gg.zdlpuopuiu.zoijcleaow(obj2);
            try {
                nufgyqmvbu nufgyqmvbuVar = this.f107127zdlpuopuiu;
                iobyxmoadgVar.f107131zdlpuopuiu = this;
                iobyxmoadgVar.f107128iwizpuwonk = 1;
                if (nufgyqmvbuVar.emit(obj, iobyxmoadgVar) == objGxszxtbevo) {
                    return objGxszxtbevo;
                }
                return gg.wwaezpbzkn.f37140iobyxmoadg;
            } catch (Throwable th3) {
                th = th3;
                ppxfxbqfkfVar = this;
                ppxfxbqfkfVar.f107126yggfygwlhe.f60015zdlpuopuiu = th;
                throw th;
            }
        }
    }

    static final class wkgbmnqykc extends kotlin.coroutines.jvm.internal.draadjrbmk implements tg.rgvfuqvkyq {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        int f107132zdlpuopuiu;

        wkgbmnqykc(lg.gxszxtbevo gxszxtbevoVar) {
            super(2, gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
            return new wkgbmnqykc(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            mg.zoijcleaow.gxszxtbevo();
            if (this.f107132zdlpuopuiu != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            gg.zdlpuopuiu.zoijcleaow(obj);
            return kotlin.coroutines.jvm.internal.zoijcleaow.iobyxmoadg(true);
        }

        @Override // tg.rgvfuqvkyq
        /* JADX INFO: renamed from: ojitshcjhn, reason: merged with bridge method [inline-methods] */
        public final Object invoke(Throwable th2, lg.gxszxtbevo gxszxtbevoVar) {
            return ((wkgbmnqykc) create(th2, gxszxtbevoVar)).invokeSuspend(gg.wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    static final class zoijcleaow extends kotlin.coroutines.jvm.internal.wkgbmnqykc {

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        int f107133jyumaefscl;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        /* synthetic */ Object f107134yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        Object f107135zdlpuopuiu;

        zoijcleaow(lg.gxszxtbevo gxszxtbevoVar) {
            super(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            this.f107134yggfygwlhe = obj;
            this.f107133jyumaefscl |= Integer.MIN_VALUE;
            return dxjokdxxww.lqeggnwhkg(null, null, this);
        }
    }

    public static final lqeggnwhkg eablkybsjg(lqeggnwhkg lqeggnwhkgVar, long j13, tg.rgvfuqvkyq rgvfuqvkyqVar) {
        if (j13 > 0) {
            return dxjokdxxww.sopmlzcsov(lqeggnwhkgVar, new eablkybsjg(j13, rgvfuqvkyqVar, null));
        }
        throw new IllegalArgumentException(("Expected positive amount of retries, but had " + j13).toString());
    }

    public static /* synthetic */ lqeggnwhkg gxszxtbevo(lqeggnwhkg lqeggnwhkgVar, long j13, tg.rgvfuqvkyq rgvfuqvkyqVar, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            j13 = Long.MAX_VALUE;
        }
        if ((i13 & 2) != 0) {
            rgvfuqvkyqVar = new wkgbmnqykc(null);
        }
        return dxjokdxxww.ntlheqmsrt(lqeggnwhkgVar, j13, rgvfuqvkyqVar);
    }

    public static final lqeggnwhkg iobyxmoadg(lqeggnwhkg lqeggnwhkgVar, tg.vdvldrhtss vdvldrhtssVar) {
        return new iobyxmoadg(lqeggnwhkgVar, vdvldrhtssVar);
    }

    public static final lqeggnwhkg lqeggnwhkg(lqeggnwhkg lqeggnwhkgVar, tg.oxmwwwfdhm oxmwwwfdhmVar) {
        return new gxszxtbevo(lqeggnwhkgVar, oxmwwwfdhmVar);
    }

    private static final boolean ppxfxbqfkf(Throwable th2, lg.btonecajqb btonecajqbVar) {
        auzgnhcxok auzgnhcxokVar = (auzgnhcxok) btonecajqbVar.get(auzgnhcxok.f76671gtknphoqwx);
        if (auzgnhcxokVar == null || !auzgnhcxokVar.isCancelled()) {
            return false;
        }
        return wkgbmnqykc(th2, auzgnhcxokVar.vdvldrhtss());
    }

    private static final boolean wkgbmnqykc(Throwable th2, Throwable th3) {
        return th3 != null && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(th3, th2);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Object zoijcleaow(lqeggnwhkg lqeggnwhkgVar, nufgyqmvbu nufgyqmvbuVar, lg.gxszxtbevo gxszxtbevoVar) throws Throwable {
        zoijcleaow zoijcleaowVar;
        kotlin.jvm.internal.hkdspvbjdz hkdspvbjdzVar;
        if (gxszxtbevoVar instanceof zoijcleaow) {
            zoijcleaowVar = (zoijcleaow) gxszxtbevoVar;
            int i13 = zoijcleaowVar.f107133jyumaefscl;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                zoijcleaowVar.f107133jyumaefscl = i13 - Integer.MIN_VALUE;
            } else {
                zoijcleaowVar = new zoijcleaow(gxszxtbevoVar);
            }
        } else {
            zoijcleaowVar = new zoijcleaow(gxszxtbevoVar);
        }
        Object obj = zoijcleaowVar.f107134yggfygwlhe;
        Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
        int i14 = zoijcleaowVar.f107133jyumaefscl;
        if (i14 == 0) {
            gg.zdlpuopuiu.zoijcleaow(obj);
            kotlin.jvm.internal.hkdspvbjdz hkdspvbjdzVar2 = new kotlin.jvm.internal.hkdspvbjdz();
            try {
                nufgyqmvbu ppxfxbqfkfVar = new ppxfxbqfkf(nufgyqmvbuVar, hkdspvbjdzVar2);
                zoijcleaowVar.f107135zdlpuopuiu = hkdspvbjdzVar2;
                zoijcleaowVar.f107133jyumaefscl = 1;
                if (lqeggnwhkgVar.collect(ppxfxbqfkfVar, zoijcleaowVar) == objGxszxtbevo) {
                    return objGxszxtbevo;
                }
                return null;
            } catch (Throwable th2) {
                th = th2;
                hkdspvbjdzVar = hkdspvbjdzVar2;
            }
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            hkdspvbjdzVar = (kotlin.jvm.internal.hkdspvbjdz) zoijcleaowVar.f107135zdlpuopuiu;
            try {
                gg.zdlpuopuiu.zoijcleaow(obj);
                return null;
            } catch (Throwable th3) {
                th = th3;
            }
        }
        Throwable th4 = (Throwable) hkdspvbjdzVar.f60015zdlpuopuiu;
        if (wkgbmnqykc(th, th4) || ppxfxbqfkf(th, zoijcleaowVar.getContext())) {
            throw th;
        }
        if (th4 == null) {
            return th;
        }
        if (th instanceof CancellationException) {
            gg.lqeggnwhkg.iobyxmoadg(th4, th);
            throw th4;
        }
        gg.lqeggnwhkg.iobyxmoadg(th, th4);
        throw th;
    }
}
