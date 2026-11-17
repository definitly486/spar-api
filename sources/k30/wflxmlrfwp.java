package k30;

import android.content.Context;
import gg.wwaezpbzkn;
import gg.zdlpuopuiu;
import java.util.concurrent.TimeUnit;
import pj.auzgnhcxok;
import pj.cllcsxoeiz;
import tg.rgvfuqvkyq;
import tg.vdvldrhtss;

/* JADX INFO: loaded from: classes4.dex */
public abstract class wflxmlrfwp {

    static final class eablkybsjg extends kotlin.coroutines.jvm.internal.draadjrbmk implements rgvfuqvkyq {

        /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
        final /* synthetic */ int f53691cqumvgiudr;

        /* JADX INFO: renamed from: esjtqupxsv, reason: collision with root package name */
        final /* synthetic */ tg.draadjrbmk f53692esjtqupxsv;

        /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
        final /* synthetic */ tg.iobyxmoadg f53693iwizpuwonk;

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        final /* synthetic */ long f53694jyumaefscl;

        /* JADX INFO: renamed from: lereixgezr, reason: collision with root package name */
        final /* synthetic */ rgvfuqvkyq f53695lereixgezr;

        /* JADX INFO: renamed from: pmvmpeiblj, reason: collision with root package name */
        final /* synthetic */ rgvfuqvkyq f53696pmvmpeiblj;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        final /* synthetic */ long f53697yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        int f53698zdlpuopuiu;

        /* JADX INFO: renamed from: zynmafqrjb, reason: collision with root package name */
        final /* synthetic */ tg.draadjrbmk f53699zynmafqrjb;

        /* JADX INFO: renamed from: k30.wflxmlrfwp$eablkybsjg$eablkybsjg, reason: collision with other inner class name */
        static final class C1145eablkybsjg implements sj.nufgyqmvbu {

            /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
            final /* synthetic */ tg.draadjrbmk f53700zdlpuopuiu;

            C1145eablkybsjg(tg.draadjrbmk draadjrbmkVar) {
                this.f53700zdlpuopuiu = draadjrbmkVar;
            }

            @Override // sj.nufgyqmvbu
            /* JADX INFO: renamed from: zoijcleaow, reason: merged with bridge method [inline-methods] */
            public final Object emit(wwaezpbzkn wwaezpbzknVar, lg.gxszxtbevo gxszxtbevoVar) {
                Object objInvoke = this.f53700zdlpuopuiu.invoke(gxszxtbevoVar);
                return objInvoke == mg.zoijcleaow.gxszxtbevo() ? objInvoke : wwaezpbzkn.f37140iobyxmoadg;
            }
        }

        static final class iobyxmoadg extends kotlin.coroutines.jvm.internal.draadjrbmk implements rgvfuqvkyq {

            /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
            final /* synthetic */ tg.iobyxmoadg f53701yggfygwlhe;

            /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
            int f53702zdlpuopuiu;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            iobyxmoadg(tg.iobyxmoadg iobyxmoadgVar, lg.gxszxtbevo gxszxtbevoVar) {
                super(2, gxszxtbevoVar);
                this.f53701yggfygwlhe = iobyxmoadgVar;
            }

            @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
            public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
                return new iobyxmoadg(this.f53701yggfygwlhe, gxszxtbevoVar);
            }

            @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
            public final Object invokeSuspend(Object obj) {
                mg.zoijcleaow.gxszxtbevo();
                if (this.f53702zdlpuopuiu != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                zdlpuopuiu.zoijcleaow(obj);
                return this.f53701yggfygwlhe.invoke();
            }

            @Override // tg.rgvfuqvkyq
            /* JADX INFO: renamed from: ojitshcjhn, reason: merged with bridge method [inline-methods] */
            public final Object invoke(wwaezpbzkn wwaezpbzknVar, lg.gxszxtbevo gxszxtbevoVar) {
                return ((iobyxmoadg) create(wwaezpbzknVar, gxszxtbevoVar)).invokeSuspend(wwaezpbzkn.f37140iobyxmoadg);
            }
        }

        static final class ppxfxbqfkf extends kotlin.coroutines.jvm.internal.draadjrbmk implements vdvldrhtss {

            /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
            final /* synthetic */ rgvfuqvkyq f53703jyumaefscl;

            /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
            /* synthetic */ Object f53704yggfygwlhe;

            /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
            int f53705zdlpuopuiu;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            ppxfxbqfkf(rgvfuqvkyq rgvfuqvkyqVar, lg.gxszxtbevo gxszxtbevoVar) {
                super(3, gxszxtbevoVar);
                this.f53703jyumaefscl = rgvfuqvkyqVar;
            }

            @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
            public final Object invokeSuspend(Object obj) {
                Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
                int i13 = this.f53705zdlpuopuiu;
                if (i13 == 0) {
                    zdlpuopuiu.zoijcleaow(obj);
                    Throwable th2 = (Throwable) this.f53704yggfygwlhe;
                    rgvfuqvkyq rgvfuqvkyqVar = this.f53703jyumaefscl;
                    this.f53705zdlpuopuiu = 1;
                    if (rgvfuqvkyqVar.invoke(th2, this) == objGxszxtbevo) {
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

            @Override // tg.vdvldrhtss
            /* JADX INFO: renamed from: ojitshcjhn, reason: merged with bridge method [inline-methods] */
            public final Object invoke(sj.nufgyqmvbu nufgyqmvbuVar, Throwable th2, lg.gxszxtbevo gxszxtbevoVar) {
                ppxfxbqfkf ppxfxbqfkfVar = new ppxfxbqfkf(this.f53703jyumaefscl, gxszxtbevoVar);
                ppxfxbqfkfVar.f53704yggfygwlhe = th2;
                return ppxfxbqfkfVar.invokeSuspend(wwaezpbzkn.f37140iobyxmoadg);
            }
        }

        static final class wkgbmnqykc extends kotlin.coroutines.jvm.internal.draadjrbmk implements vdvldrhtss {

            /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
            final /* synthetic */ rgvfuqvkyq f53706jyumaefscl;

            /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
            /* synthetic */ Object f53707yggfygwlhe;

            /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
            int f53708zdlpuopuiu;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            wkgbmnqykc(rgvfuqvkyq rgvfuqvkyqVar, lg.gxszxtbevo gxszxtbevoVar) {
                super(3, gxszxtbevoVar);
                this.f53706jyumaefscl = rgvfuqvkyqVar;
            }

            @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
            public final Object invokeSuspend(Object obj) {
                Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
                int i13 = this.f53708zdlpuopuiu;
                if (i13 == 0) {
                    zdlpuopuiu.zoijcleaow(obj);
                    Throwable th2 = (Throwable) this.f53707yggfygwlhe;
                    rgvfuqvkyq rgvfuqvkyqVar = this.f53706jyumaefscl;
                    this.f53708zdlpuopuiu = 1;
                    if (rgvfuqvkyqVar.invoke(th2, this) == objGxszxtbevo) {
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

            @Override // tg.vdvldrhtss
            /* JADX INFO: renamed from: ojitshcjhn, reason: merged with bridge method [inline-methods] */
            public final Object invoke(sj.nufgyqmvbu nufgyqmvbuVar, Throwable th2, lg.gxszxtbevo gxszxtbevoVar) {
                wkgbmnqykc wkgbmnqykcVar = new wkgbmnqykc(this.f53706jyumaefscl, gxszxtbevoVar);
                wkgbmnqykcVar.f53707yggfygwlhe = th2;
                return wkgbmnqykcVar.invokeSuspend(wwaezpbzkn.f37140iobyxmoadg);
            }
        }

        static final class zoijcleaow extends kotlin.coroutines.jvm.internal.draadjrbmk implements rgvfuqvkyq {

            /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
            final /* synthetic */ tg.draadjrbmk f53709yggfygwlhe;

            /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
            int f53710zdlpuopuiu;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            zoijcleaow(tg.draadjrbmk draadjrbmkVar, lg.gxszxtbevo gxszxtbevoVar) {
                super(2, gxszxtbevoVar);
                this.f53709yggfygwlhe = draadjrbmkVar;
            }

            @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
            public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
                return new zoijcleaow(this.f53709yggfygwlhe, gxszxtbevoVar);
            }

            @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
            public final Object invokeSuspend(Object obj) {
                Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
                int i13 = this.f53710zdlpuopuiu;
                if (i13 == 0) {
                    zdlpuopuiu.zoijcleaow(obj);
                    tg.draadjrbmk draadjrbmkVar = this.f53709yggfygwlhe;
                    this.f53710zdlpuopuiu = 1;
                    if (draadjrbmkVar.invoke(this) == objGxszxtbevo) {
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
            /* JADX INFO: renamed from: ojitshcjhn, reason: merged with bridge method [inline-methods] */
            public final Object invoke(sj.nufgyqmvbu nufgyqmvbuVar, lg.gxszxtbevo gxszxtbevoVar) {
                return ((zoijcleaow) create(nufgyqmvbuVar, gxszxtbevoVar)).invokeSuspend(wwaezpbzkn.f37140iobyxmoadg);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        eablkybsjg(long j13, long j14, tg.iobyxmoadg iobyxmoadgVar, int i13, tg.draadjrbmk draadjrbmkVar, rgvfuqvkyq rgvfuqvkyqVar, rgvfuqvkyq rgvfuqvkyqVar2, tg.draadjrbmk draadjrbmkVar2, lg.gxszxtbevo gxszxtbevoVar) {
            super(2, gxszxtbevoVar);
            this.f53697yggfygwlhe = j13;
            this.f53694jyumaefscl = j14;
            this.f53693iwizpuwonk = iobyxmoadgVar;
            this.f53691cqumvgiudr = i13;
            this.f53692esjtqupxsv = draadjrbmkVar;
            this.f53695lereixgezr = rgvfuqvkyqVar;
            this.f53696pmvmpeiblj = rgvfuqvkyqVar2;
            this.f53699zynmafqrjb = draadjrbmkVar2;
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
            return new eablkybsjg(this.f53697yggfygwlhe, this.f53694jyumaefscl, this.f53693iwizpuwonk, this.f53691cqumvgiudr, this.f53692esjtqupxsv, this.f53695lereixgezr, this.f53696pmvmpeiblj, this.f53699zynmafqrjb, gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
            int i13 = this.f53698zdlpuopuiu;
            if (i13 == 0) {
                zdlpuopuiu.zoijcleaow(obj);
                sj.lqeggnwhkg lqeggnwhkgVarAgtfadlqog = sj.dxjokdxxww.agtfadlqog(wflxmlrfwp.gxszxtbevo(this.f53697yggfygwlhe, this.f53694jyumaefscl));
                tg.iobyxmoadg iobyxmoadgVar = this.f53693iwizpuwonk;
                sj.lqeggnwhkg lqeggnwhkgVarStevsuqkhv = sj.dxjokdxxww.stevsuqkhv(sj.dxjokdxxww.gxszxtbevo(sj.dxjokdxxww.tzroggbefp(iobyxmoadgVar != null ? sj.dxjokdxxww.jhduphickx(lqeggnwhkgVarAgtfadlqog, new iobyxmoadg(iobyxmoadgVar, null)) : sj.dxjokdxxww.vipkmwdibw(lqeggnwhkgVarAgtfadlqog, this.f53691cqumvgiudr), new zoijcleaow(this.f53692esjtqupxsv, null)), new ppxfxbqfkf(this.f53695lereixgezr, null)), new wkgbmnqykc(this.f53696pmvmpeiblj, null));
                C1145eablkybsjg c1145eablkybsjg = new C1145eablkybsjg(this.f53699zynmafqrjb);
                this.f53698zdlpuopuiu = 1;
                if (lqeggnwhkgVarStevsuqkhv.collect(c1145eablkybsjg, this) == objGxszxtbevo) {
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
            return ((eablkybsjg) create(cllcsxoeizVar, gxszxtbevoVar)).invokeSuspend(wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    static final class gxszxtbevo extends kotlin.coroutines.jvm.internal.draadjrbmk implements rgvfuqvkyq {

        /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
        final /* synthetic */ long f53711iwizpuwonk;

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        final /* synthetic */ long f53712jyumaefscl;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        private /* synthetic */ Object f53713yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        int f53714zdlpuopuiu;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        gxszxtbevo(long j13, long j14, lg.gxszxtbevo gxszxtbevoVar) {
            super(2, gxszxtbevoVar);
            this.f53712jyumaefscl = j13;
            this.f53711iwizpuwonk = j14;
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
            gxszxtbevo gxszxtbevoVar2 = new gxszxtbevo(this.f53712jyumaefscl, this.f53711iwizpuwonk, gxszxtbevoVar);
            gxszxtbevoVar2.f53713yggfygwlhe = obj;
            return gxszxtbevoVar2;
        }

        /* JADX WARN: Code duplicated, block: B:17:0x004b A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:20:0x0058 A[RETURN] */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:19:0x0056 -> B:15:0x003f). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:20:0x0058
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final java.lang.Object invokeSuspend(java.lang.Object r8) {
            /*
                r7 = this;
                java.lang.Object r0 = mg.zoijcleaow.gxszxtbevo()
                int r1 = r7.f53714zdlpuopuiu
                r2 = 3
                r3 = 2
                r4 = 1
                if (r1 == 0) goto L2a
                if (r1 == r4) goto L22
                if (r1 == r3) goto L1a
                if (r1 != r2) goto L12
                goto L22
            L12:
                java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r8.<init>(r0)
                throw r8
            L1a:
                java.lang.Object r1 = r7.f53713yggfygwlhe
                sj.nufgyqmvbu r1 = (sj.nufgyqmvbu) r1
                gg.zdlpuopuiu.zoijcleaow(r8)
                goto L4c
            L22:
                java.lang.Object r1 = r7.f53713yggfygwlhe
                sj.nufgyqmvbu r1 = (sj.nufgyqmvbu) r1
                gg.zdlpuopuiu.zoijcleaow(r8)
                goto L3f
            L2a:
                gg.zdlpuopuiu.zoijcleaow(r8)
                java.lang.Object r8 = r7.f53713yggfygwlhe
                r1 = r8
                sj.nufgyqmvbu r1 = (sj.nufgyqmvbu) r1
                long r5 = r7.f53712jyumaefscl
                r7.f53713yggfygwlhe = r1
                r7.f53714zdlpuopuiu = r4
                java.lang.Object r8 = pj.crxdokpmqz.zoijcleaow(r5, r7)
                if (r8 != r0) goto L3f
                return r0
            L3f:
                gg.wwaezpbzkn r8 = gg.wwaezpbzkn.f37140iobyxmoadg
                r7.f53713yggfygwlhe = r1
                r7.f53714zdlpuopuiu = r3
                java.lang.Object r8 = r1.emit(r8, r7)
                if (r8 != r0) goto L4c
                return r0
            L4c:
                long r4 = r7.f53711iwizpuwonk
                r7.f53713yggfygwlhe = r1
                r7.f53714zdlpuopuiu = r2
                java.lang.Object r8 = pj.crxdokpmqz.zoijcleaow(r4, r7)
                if (r8 != r0) goto L3f
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: k30.wflxmlrfwp.gxszxtbevo.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // tg.rgvfuqvkyq
        /* JADX INFO: renamed from: ojitshcjhn, reason: merged with bridge method [inline-methods] */
        public final Object invoke(sj.nufgyqmvbu nufgyqmvbuVar, lg.gxszxtbevo gxszxtbevoVar) {
            return ((gxszxtbevo) create(nufgyqmvbuVar, gxszxtbevoVar)).invokeSuspend(wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final class iobyxmoadg extends kotlin.coroutines.jvm.internal.draadjrbmk implements tg.draadjrbmk {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        int f53715zdlpuopuiu;

        iobyxmoadg(lg.gxszxtbevo gxszxtbevoVar) {
            super(1, gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final lg.gxszxtbevo create(lg.gxszxtbevo gxszxtbevoVar) {
            return new iobyxmoadg(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            mg.zoijcleaow.gxszxtbevo();
            if (this.f53715zdlpuopuiu != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            zdlpuopuiu.zoijcleaow(obj);
            return wwaezpbzkn.f37140iobyxmoadg;
        }

        @Override // tg.draadjrbmk
        public final Object invoke(lg.gxszxtbevo gxszxtbevoVar) {
            return ((iobyxmoadg) create(gxszxtbevoVar)).invokeSuspend(wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    public static final class lqeggnwhkg implements sj.lqeggnwhkg {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final /* synthetic */ sj.lqeggnwhkg f53716zdlpuopuiu;

        public static final class iobyxmoadg implements sj.nufgyqmvbu {

            /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
            final /* synthetic */ sj.nufgyqmvbu f53717zdlpuopuiu;

            /* JADX INFO: renamed from: k30.wflxmlrfwp$lqeggnwhkg$iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
            public static final class C1146iobyxmoadg extends kotlin.coroutines.jvm.internal.wkgbmnqykc {

                /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
                int f53719yggfygwlhe;

                /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
                /* synthetic */ Object f53720zdlpuopuiu;

                public C1146iobyxmoadg(lg.gxszxtbevo gxszxtbevoVar) {
                    super(gxszxtbevoVar);
                }

                @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
                public final Object invokeSuspend(Object obj) {
                    this.f53720zdlpuopuiu = obj;
                    this.f53719yggfygwlhe |= Integer.MIN_VALUE;
                    return iobyxmoadg.this.emit(null, this);
                }
            }

            public iobyxmoadg(sj.nufgyqmvbu nufgyqmvbuVar) {
                this.f53717zdlpuopuiu = nufgyqmvbuVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // sj.nufgyqmvbu
            public final Object emit(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
                C1146iobyxmoadg c1146iobyxmoadg;
                if (gxszxtbevoVar instanceof C1146iobyxmoadg) {
                    c1146iobyxmoadg = (C1146iobyxmoadg) gxszxtbevoVar;
                    int i13 = c1146iobyxmoadg.f53719yggfygwlhe;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        c1146iobyxmoadg.f53719yggfygwlhe = i13 - Integer.MIN_VALUE;
                    } else {
                        c1146iobyxmoadg = new C1146iobyxmoadg(gxszxtbevoVar);
                    }
                } else {
                    c1146iobyxmoadg = new C1146iobyxmoadg(gxszxtbevoVar);
                }
                Object obj2 = c1146iobyxmoadg.f53720zdlpuopuiu;
                Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
                int i14 = c1146iobyxmoadg.f53719yggfygwlhe;
                if (i14 == 0) {
                    zdlpuopuiu.zoijcleaow(obj2);
                    sj.nufgyqmvbu nufgyqmvbuVar = this.f53717zdlpuopuiu;
                    Long lEablkybsjg = kotlin.coroutines.jvm.internal.zoijcleaow.eablkybsjg(Math.max(0L, ((Number) obj).longValue()));
                    c1146iobyxmoadg.f53719yggfygwlhe = 1;
                    if (nufgyqmvbuVar.emit(lEablkybsjg, c1146iobyxmoadg) == objGxszxtbevo) {
                        return objGxszxtbevo;
                    }
                } else {
                    if (i14 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    zdlpuopuiu.zoijcleaow(obj2);
                }
                return wwaezpbzkn.f37140iobyxmoadg;
            }
        }

        public lqeggnwhkg(sj.lqeggnwhkg lqeggnwhkgVar) {
            this.f53716zdlpuopuiu = lqeggnwhkgVar;
        }

        @Override // sj.lqeggnwhkg
        public Object collect(sj.nufgyqmvbu nufgyqmvbuVar, lg.gxszxtbevo gxszxtbevoVar) {
            Object objCollect = this.f53716zdlpuopuiu.collect(new iobyxmoadg(nufgyqmvbuVar), gxszxtbevoVar);
            return objCollect == mg.zoijcleaow.gxszxtbevo() ? objCollect : wwaezpbzkn.f37140iobyxmoadg;
        }
    }

    static final class nufgyqmvbu extends kotlin.coroutines.jvm.internal.draadjrbmk implements rgvfuqvkyq {

        /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
        final /* synthetic */ long f53721cqumvgiudr;

        /* JADX INFO: renamed from: esjtqupxsv, reason: collision with root package name */
        final /* synthetic */ long f53722esjtqupxsv;

        /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
        private /* synthetic */ Object f53723iwizpuwonk;

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        int f53724jyumaefscl;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        long f53725yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        long f53726zdlpuopuiu;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        nufgyqmvbu(long j13, long j14, lg.gxszxtbevo gxszxtbevoVar) {
            super(2, gxszxtbevoVar);
            this.f53721cqumvgiudr = j13;
            this.f53722esjtqupxsv = j14;
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
            nufgyqmvbu nufgyqmvbuVar = new nufgyqmvbu(this.f53721cqumvgiudr, this.f53722esjtqupxsv, gxszxtbevoVar);
            nufgyqmvbuVar.f53723iwizpuwonk = obj;
            return nufgyqmvbuVar;
        }

        /* JADX WARN: Code duplicated, block: B:18:0x0059  */
        /* JADX WARN: Code duplicated, block: B:20:0x0067 A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:23:0x0080 A[RETURN] */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x007e -> B:16:0x0055). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final java.lang.Object invokeSuspend(java.lang.Object r13) {
            /*
                r12 = this;
                java.lang.Object r0 = mg.zoijcleaow.gxszxtbevo()
                int r1 = r12.f53724jyumaefscl
                r2 = 3
                r3 = 2
                r4 = 1
                if (r1 == 0) goto L30
                if (r1 == r4) goto L24
                if (r1 == r3) goto L1a
                if (r1 != r2) goto L12
                goto L24
            L12:
                java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r13.<init>(r0)
                throw r13
            L1a:
                long r4 = r12.f53726zdlpuopuiu
                java.lang.Object r1 = r12.f53723iwizpuwonk
                sj.nufgyqmvbu r1 = (sj.nufgyqmvbu) r1
                gg.zdlpuopuiu.zoijcleaow(r13)
                goto L68
            L24:
                long r4 = r12.f53725yggfygwlhe
                long r6 = r12.f53726zdlpuopuiu
                java.lang.Object r1 = r12.f53723iwizpuwonk
                sj.nufgyqmvbu r1 = (sj.nufgyqmvbu) r1
                gg.zdlpuopuiu.zoijcleaow(r13)
                goto L55
            L30:
                gg.zdlpuopuiu.zoijcleaow(r13)
                java.lang.Object r13 = r12.f53723iwizpuwonk
                r1 = r13
                sj.nufgyqmvbu r1 = (sj.nufgyqmvbu) r1
                long r6 = java.lang.System.currentTimeMillis()
                long r8 = r12.f53721cqumvgiudr
                long r8 = r8 + r6
                long r10 = r8 - r6
                java.lang.Long r13 = kotlin.coroutines.jvm.internal.zoijcleaow.eablkybsjg(r10)
                r12.f53723iwizpuwonk = r1
                r12.f53726zdlpuopuiu = r6
                r12.f53725yggfygwlhe = r8
                r12.f53724jyumaefscl = r4
                java.lang.Object r13 = r1.emit(r13, r12)
                if (r13 != r0) goto L54
                return r0
            L54:
                r4 = r8
            L55:
                int r13 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
                if (r13 >= 0) goto L81
                long r6 = r12.f53722esjtqupxsv
                r12.f53723iwizpuwonk = r1
                r12.f53726zdlpuopuiu = r4
                r12.f53724jyumaefscl = r3
                java.lang.Object r13 = pj.crxdokpmqz.zoijcleaow(r6, r12)
                if (r13 != r0) goto L68
                return r0
            L68:
                long r6 = java.lang.System.currentTimeMillis()
                long r8 = r4 - r6
                java.lang.Long r13 = kotlin.coroutines.jvm.internal.zoijcleaow.eablkybsjg(r8)
                r12.f53723iwizpuwonk = r1
                r12.f53726zdlpuopuiu = r6
                r12.f53725yggfygwlhe = r4
                r12.f53724jyumaefscl = r2
                java.lang.Object r13 = r1.emit(r13, r12)
                if (r13 != r0) goto L55
                return r0
            L81:
                gg.wwaezpbzkn r13 = gg.wwaezpbzkn.f37140iobyxmoadg
                return r13
            */
            throw new UnsupportedOperationException("Method not decompiled: k30.wflxmlrfwp.nufgyqmvbu.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // tg.rgvfuqvkyq
        /* JADX INFO: renamed from: ojitshcjhn, reason: merged with bridge method [inline-methods] */
        public final Object invoke(sj.nufgyqmvbu nufgyqmvbuVar, lg.gxszxtbevo gxszxtbevoVar) {
            return ((nufgyqmvbu) create(nufgyqmvbuVar, gxszxtbevoVar)).invokeSuspend(wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final class ppxfxbqfkf extends kotlin.coroutines.jvm.internal.draadjrbmk implements rgvfuqvkyq {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        int f53727zdlpuopuiu;

        ppxfxbqfkf(lg.gxszxtbevo gxszxtbevoVar) {
            super(2, gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
            return new ppxfxbqfkf(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            mg.zoijcleaow.gxszxtbevo();
            if (this.f53727zdlpuopuiu != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            zdlpuopuiu.zoijcleaow(obj);
            return wwaezpbzkn.f37140iobyxmoadg;
        }

        @Override // tg.rgvfuqvkyq
        /* JADX INFO: renamed from: ojitshcjhn, reason: merged with bridge method [inline-methods] */
        public final Object invoke(Throwable th2, lg.gxszxtbevo gxszxtbevoVar) {
            return ((ppxfxbqfkf) create(th2, gxszxtbevoVar)).invokeSuspend(wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final class wkgbmnqykc extends kotlin.coroutines.jvm.internal.draadjrbmk implements tg.draadjrbmk {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        int f53728zdlpuopuiu;

        wkgbmnqykc(lg.gxszxtbevo gxszxtbevoVar) {
            super(1, gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final lg.gxszxtbevo create(lg.gxszxtbevo gxszxtbevoVar) {
            return new wkgbmnqykc(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            mg.zoijcleaow.gxszxtbevo();
            if (this.f53728zdlpuopuiu != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            zdlpuopuiu.zoijcleaow(obj);
            return wwaezpbzkn.f37140iobyxmoadg;
        }

        @Override // tg.draadjrbmk
        public final Object invoke(lg.gxszxtbevo gxszxtbevoVar) {
            return ((wkgbmnqykc) create(gxszxtbevoVar)).invokeSuspend(wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final class zoijcleaow extends kotlin.coroutines.jvm.internal.draadjrbmk implements rgvfuqvkyq {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        int f53729zdlpuopuiu;

        zoijcleaow(lg.gxszxtbevo gxszxtbevoVar) {
            super(2, gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
            return new zoijcleaow(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            mg.zoijcleaow.gxszxtbevo();
            if (this.f53729zdlpuopuiu != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            zdlpuopuiu.zoijcleaow(obj);
            return wwaezpbzkn.f37140iobyxmoadg;
        }

        @Override // tg.rgvfuqvkyq
        /* JADX INFO: renamed from: ojitshcjhn, reason: merged with bridge method [inline-methods] */
        public final Object invoke(Throwable th2, lg.gxszxtbevo gxszxtbevoVar) {
            return ((zoijcleaow) create(th2, gxszxtbevoVar)).invokeSuspend(wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final sj.lqeggnwhkg gxszxtbevo(long j13, long j14) {
        return sj.dxjokdxxww.wwaezpbzkn(new gxszxtbevo(j13, j14, null));
    }

    public static final sj.lqeggnwhkg lqeggnwhkg(long j13, long j14) {
        return sj.dxjokdxxww.vdvldrhtss(new lqeggnwhkg(sj.dxjokdxxww.wwaezpbzkn(new nufgyqmvbu(j13, j14, null))));
    }

    public static /* synthetic */ sj.lqeggnwhkg nufgyqmvbu(long j13, long j14, int i13, Object obj) {
        if ((i13 & 2) != 0) {
            j14 = 500;
        }
        return lqeggnwhkg(j13, j14);
    }

    public static final auzgnhcxok wkgbmnqykc(cllcsxoeiz coroutineScope, long j13, long j14, tg.iobyxmoadg iobyxmoadgVar, int i13, tg.draadjrbmk onStartAction, rgvfuqvkyq onCatchAction, rgvfuqvkyq onCompletionAction, tg.draadjrbmk onCollectAction) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(coroutineScope, "coroutineScope");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(onStartAction, "onStartAction");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(onCatchAction, "onCatchAction");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(onCompletionAction, "onCompletionAction");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(onCollectAction, "onCollectAction");
        return pj.gtknphoqwx.wkgbmnqykc(coroutineScope, null, null, new eablkybsjg(j13, j14, iobyxmoadgVar, i13, onStartAction, onCatchAction, onCompletionAction, onCollectAction, null), 3, null);
    }

    public static final String zoijcleaow(long j13, boolean z13, boolean z14, boolean z15, boolean z16, int i13, int i14, int i15, int i16, String divider, Context context) {
        String str;
        Context context2;
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(divider, "divider");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(context, "context");
        TimeUnit timeUnit = TimeUnit.SECONDS;
        long days = timeUnit.toDays(j13);
        long hours = timeUnit.toHours(j13) % ((long) 24);
        long j14 = 60;
        long minutes = timeUnit.toMinutes(j13) % j14;
        long jLqeggnwhkg = zg.gtknphoqwx.lqeggnwhkg(j13 % j14, 0L);
        StringBuilder sb3 = new StringBuilder();
        boolean z17 = false;
        boolean z18 = (days != 0 || z13) && i13 != -1;
        boolean z19 = (z18 || hours != 0 || z14) && i14 != -1;
        boolean z23 = (z19 || minutes != 0 || z15) && i15 != -1;
        if ((jLqeggnwhkg != 0 || z16) && i16 != -1) {
            z17 = true;
        }
        if (z18) {
            context2 = context;
            sb3.append(context2.getString(i13, Long.valueOf(days)));
            str = divider;
            sb3.append(str);
        } else {
            str = divider;
            context2 = context;
        }
        if (z19) {
            sb3.append(context2.getString(i14, Long.valueOf(hours)));
            sb3.append(str);
        }
        if (z23) {
            sb3.append(context2.getString(i15, Long.valueOf(minutes)));
            sb3.append(str);
        }
        if (z17) {
            sb3.append(context2.getString(i16, Long.valueOf(jLqeggnwhkg)));
        }
        return sb3.toString();
    }
}
