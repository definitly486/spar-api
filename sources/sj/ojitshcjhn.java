package sj;

import pj.crxdokpmqz;

/* JADX INFO: loaded from: classes3.dex */
abstract /* synthetic */ class ojitshcjhn {

    static final class iobyxmoadg extends kotlin.coroutines.jvm.internal.draadjrbmk implements tg.vdvldrhtss {

        /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
        /* synthetic */ Object f107009cqumvgiudr;

        /* JADX INFO: renamed from: esjtqupxsv, reason: collision with root package name */
        final /* synthetic */ tg.draadjrbmk f107010esjtqupxsv;

        /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
        private /* synthetic */ Object f107011iwizpuwonk;

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        int f107012jyumaefscl;

        /* JADX INFO: renamed from: lereixgezr, reason: collision with root package name */
        final /* synthetic */ lqeggnwhkg f107013lereixgezr;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        Object f107014yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        Object f107015zdlpuopuiu;

        /* JADX INFO: renamed from: sj.ojitshcjhn$iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
        static final class C2625iobyxmoadg extends kotlin.coroutines.jvm.internal.draadjrbmk implements tg.draadjrbmk {

            /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
            final /* synthetic */ kotlin.jvm.internal.hkdspvbjdz f107016jyumaefscl;

            /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
            final /* synthetic */ nufgyqmvbu f107017yggfygwlhe;

            /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
            int f107018zdlpuopuiu;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C2625iobyxmoadg(nufgyqmvbu nufgyqmvbuVar, kotlin.jvm.internal.hkdspvbjdz hkdspvbjdzVar, lg.gxszxtbevo gxszxtbevoVar) {
                super(1, gxszxtbevoVar);
                this.f107017yggfygwlhe = nufgyqmvbuVar;
                this.f107016jyumaefscl = hkdspvbjdzVar;
            }

            @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
            public final lg.gxszxtbevo create(lg.gxszxtbevo gxszxtbevoVar) {
                return new C2625iobyxmoadg(this.f107017yggfygwlhe, this.f107016jyumaefscl, gxszxtbevoVar);
            }

            @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
            public final Object invokeSuspend(Object obj) {
                Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
                int i13 = this.f107018zdlpuopuiu;
                if (i13 == 0) {
                    gg.zdlpuopuiu.zoijcleaow(obj);
                    nufgyqmvbu nufgyqmvbuVar = this.f107017yggfygwlhe;
                    uj.istkbnxepw istkbnxepwVar = tj.kcexrzcfyt.f110690iobyxmoadg;
                    Object obj2 = this.f107016jyumaefscl.f60015zdlpuopuiu;
                    if (obj2 == istkbnxepwVar) {
                        obj2 = null;
                    }
                    this.f107018zdlpuopuiu = 1;
                    if (nufgyqmvbuVar.emit(obj2, this) == objGxszxtbevo) {
                        return objGxszxtbevo;
                    }
                } else {
                    if (i13 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    gg.zdlpuopuiu.zoijcleaow(obj);
                }
                this.f107016jyumaefscl.f60015zdlpuopuiu = null;
                return gg.wwaezpbzkn.f37140iobyxmoadg;
            }

            @Override // tg.draadjrbmk
            public final Object invoke(lg.gxszxtbevo gxszxtbevoVar) {
                return ((C2625iobyxmoadg) create(gxszxtbevoVar)).invokeSuspend(gg.wwaezpbzkn.f37140iobyxmoadg);
            }
        }

        static final class ppxfxbqfkf extends kotlin.coroutines.jvm.internal.draadjrbmk implements tg.rgvfuqvkyq {

            /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
            final /* synthetic */ lqeggnwhkg f107019jyumaefscl;

            /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
            private /* synthetic */ Object f107020yggfygwlhe;

            /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
            int f107021zdlpuopuiu;

            /* JADX INFO: renamed from: sj.ojitshcjhn$iobyxmoadg$ppxfxbqfkf$iobyxmoadg, reason: collision with other inner class name */
            static final class C2626iobyxmoadg implements nufgyqmvbu {

                /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
                final /* synthetic */ rj.zdlpuopuiu f107022zdlpuopuiu;

                /* JADX INFO: renamed from: sj.ojitshcjhn$iobyxmoadg$ppxfxbqfkf$iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
                static final class C2627iobyxmoadg extends kotlin.coroutines.jvm.internal.wkgbmnqykc {

                    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
                    int f107023jyumaefscl;

                    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
                    /* synthetic */ Object f107025zdlpuopuiu;

                    C2627iobyxmoadg(lg.gxszxtbevo gxszxtbevoVar) {
                        super(gxszxtbevoVar);
                    }

                    @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
                    public final Object invokeSuspend(Object obj) {
                        this.f107025zdlpuopuiu = obj;
                        this.f107023jyumaefscl |= Integer.MIN_VALUE;
                        return C2626iobyxmoadg.this.emit(null, this);
                    }
                }

                C2626iobyxmoadg(rj.zdlpuopuiu zdlpuopuiuVar) {
                    this.f107022zdlpuopuiu = zdlpuopuiuVar;
                }

                /* JADX WARN: Code duplicated, block: B:7:0x0013  */
                @Override // sj.nufgyqmvbu
                public final Object emit(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
                    C2627iobyxmoadg c2627iobyxmoadg;
                    if (gxszxtbevoVar instanceof C2627iobyxmoadg) {
                        c2627iobyxmoadg = (C2627iobyxmoadg) gxszxtbevoVar;
                        int i13 = c2627iobyxmoadg.f107023jyumaefscl;
                        if ((i13 & Integer.MIN_VALUE) != 0) {
                            c2627iobyxmoadg.f107023jyumaefscl = i13 - Integer.MIN_VALUE;
                        } else {
                            c2627iobyxmoadg = new C2627iobyxmoadg(gxszxtbevoVar);
                        }
                    } else {
                        c2627iobyxmoadg = new C2627iobyxmoadg(gxszxtbevoVar);
                    }
                    Object obj2 = c2627iobyxmoadg.f107025zdlpuopuiu;
                    Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
                    int i14 = c2627iobyxmoadg.f107023jyumaefscl;
                    if (i14 == 0) {
                        gg.zdlpuopuiu.zoijcleaow(obj2);
                        rj.zdlpuopuiu zdlpuopuiuVar = this.f107022zdlpuopuiu;
                        if (obj == null) {
                            obj = tj.kcexrzcfyt.f110690iobyxmoadg;
                        }
                        c2627iobyxmoadg.f107023jyumaefscl = 1;
                        if (zdlpuopuiuVar.gxszxtbevo(obj, c2627iobyxmoadg) == objGxszxtbevo) {
                            return objGxszxtbevo;
                        }
                    } else {
                        if (i14 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        gg.zdlpuopuiu.zoijcleaow(obj2);
                    }
                    return gg.wwaezpbzkn.f37140iobyxmoadg;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            ppxfxbqfkf(lqeggnwhkg lqeggnwhkgVar, lg.gxszxtbevo gxszxtbevoVar) {
                super(2, gxszxtbevoVar);
                this.f107019jyumaefscl = lqeggnwhkgVar;
            }

            @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
            public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
                ppxfxbqfkf ppxfxbqfkfVar = new ppxfxbqfkf(this.f107019jyumaefscl, gxszxtbevoVar);
                ppxfxbqfkfVar.f107020yggfygwlhe = obj;
                return ppxfxbqfkfVar;
            }

            @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
            public final Object invokeSuspend(Object obj) {
                Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
                int i13 = this.f107021zdlpuopuiu;
                if (i13 == 0) {
                    gg.zdlpuopuiu.zoijcleaow(obj);
                    rj.zdlpuopuiu zdlpuopuiuVar = (rj.zdlpuopuiu) this.f107020yggfygwlhe;
                    lqeggnwhkg lqeggnwhkgVar = this.f107019jyumaefscl;
                    C2626iobyxmoadg c2626iobyxmoadg = new C2626iobyxmoadg(zdlpuopuiuVar);
                    this.f107021zdlpuopuiu = 1;
                    if (lqeggnwhkgVar.collect(c2626iobyxmoadg, this) == objGxszxtbevo) {
                        return objGxszxtbevo;
                    }
                } else {
                    if (i13 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    gg.zdlpuopuiu.zoijcleaow(obj);
                }
                return gg.wwaezpbzkn.f37140iobyxmoadg;
            }

            @Override // tg.rgvfuqvkyq
            /* JADX INFO: renamed from: ojitshcjhn, reason: merged with bridge method [inline-methods] */
            public final Object invoke(rj.zdlpuopuiu zdlpuopuiuVar, lg.gxszxtbevo gxszxtbevoVar) {
                return ((ppxfxbqfkf) create(zdlpuopuiuVar, gxszxtbevoVar)).invokeSuspend(gg.wwaezpbzkn.f37140iobyxmoadg);
            }
        }

        static final class zoijcleaow extends kotlin.coroutines.jvm.internal.draadjrbmk implements tg.rgvfuqvkyq {

            /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
            final /* synthetic */ nufgyqmvbu f107026cqumvgiudr;

            /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
            final /* synthetic */ kotlin.jvm.internal.hkdspvbjdz f107027iwizpuwonk;

            /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
            /* synthetic */ Object f107028jyumaefscl;

            /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
            int f107029yggfygwlhe;

            /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
            Object f107030zdlpuopuiu;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            zoijcleaow(kotlin.jvm.internal.hkdspvbjdz hkdspvbjdzVar, nufgyqmvbu nufgyqmvbuVar, lg.gxszxtbevo gxszxtbevoVar) {
                super(2, gxszxtbevoVar);
                this.f107027iwizpuwonk = hkdspvbjdzVar;
                this.f107026cqumvgiudr = nufgyqmvbuVar;
            }

            @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
            public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
                zoijcleaow zoijcleaowVar = new zoijcleaow(this.f107027iwizpuwonk, this.f107026cqumvgiudr, gxszxtbevoVar);
                zoijcleaowVar.f107028jyumaefscl = obj;
                return zoijcleaowVar;
            }

            @Override // tg.rgvfuqvkyq
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                return ojitshcjhn(((rj.gtknphoqwx) obj).gtknphoqwx(), (lg.gxszxtbevo) obj2);
            }

            @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
            public final Object invokeSuspend(Object obj) throws Throwable {
                kotlin.jvm.internal.hkdspvbjdz hkdspvbjdzVar;
                kotlin.jvm.internal.hkdspvbjdz hkdspvbjdzVar2;
                Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
                int i13 = this.f107029yggfygwlhe;
                if (i13 == 0) {
                    gg.zdlpuopuiu.zoijcleaow(obj);
                    Object objGtknphoqwx = ((rj.gtknphoqwx) this.f107028jyumaefscl).gtknphoqwx();
                    hkdspvbjdzVar = this.f107027iwizpuwonk;
                    boolean z13 = objGtknphoqwx instanceof rj.gtknphoqwx.ppxfxbqfkf;
                    if (!z13) {
                        hkdspvbjdzVar.f60015zdlpuopuiu = objGtknphoqwx;
                    }
                    nufgyqmvbu nufgyqmvbuVar = this.f107026cqumvgiudr;
                    if (z13) {
                        Throwable thEablkybsjg = rj.gtknphoqwx.eablkybsjg(objGtknphoqwx);
                        if (thEablkybsjg != null) {
                            throw thEablkybsjg;
                        }
                        Object obj2 = hkdspvbjdzVar.f60015zdlpuopuiu;
                        if (obj2 != null) {
                            if (obj2 == tj.kcexrzcfyt.f110690iobyxmoadg) {
                                obj2 = null;
                            }
                            this.f107028jyumaefscl = objGtknphoqwx;
                            this.f107030zdlpuopuiu = hkdspvbjdzVar;
                            this.f107029yggfygwlhe = 1;
                            if (nufgyqmvbuVar.emit(obj2, this) == objGxszxtbevo) {
                                return objGxszxtbevo;
                            }
                            hkdspvbjdzVar2 = hkdspvbjdzVar;
                        }
                        hkdspvbjdzVar.f60015zdlpuopuiu = tj.kcexrzcfyt.f110691ppxfxbqfkf;
                    }
                    return gg.wwaezpbzkn.f37140iobyxmoadg;
                }
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                hkdspvbjdzVar2 = (kotlin.jvm.internal.hkdspvbjdz) this.f107030zdlpuopuiu;
                gg.zdlpuopuiu.zoijcleaow(obj);
                hkdspvbjdzVar = hkdspvbjdzVar2;
                hkdspvbjdzVar.f60015zdlpuopuiu = tj.kcexrzcfyt.f110691ppxfxbqfkf;
                return gg.wwaezpbzkn.f37140iobyxmoadg;
            }

            public final Object ojitshcjhn(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
                return ((zoijcleaow) create(rj.gtknphoqwx.zoijcleaow(obj), gxszxtbevoVar)).invokeSuspend(gg.wwaezpbzkn.f37140iobyxmoadg);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        iobyxmoadg(tg.draadjrbmk draadjrbmkVar, lqeggnwhkg lqeggnwhkgVar, lg.gxszxtbevo gxszxtbevoVar) {
            super(3, gxszxtbevoVar);
            this.f107010esjtqupxsv = draadjrbmkVar;
            this.f107013lereixgezr = lqeggnwhkgVar;
        }

        /* JADX WARN: Code duplicated, block: B:14:0x0066  */
        /* JADX WARN: Code duplicated, block: B:16:0x006f  */
        /* JADX WARN: Code duplicated, block: B:18:0x0075  */
        /* JADX WARN: Code duplicated, block: B:21:0x0088  */
        /* JADX WARN: Code duplicated, block: B:23:0x008c  */
        /* JADX WARN: Code duplicated, block: B:25:0x0090  */
        /* JADX WARN: Code duplicated, block: B:28:0x00a1 A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:31:0x00a9  */
        /* JADX WARN: Code duplicated, block: B:35:0x00be  */
        /* JADX WARN: Code duplicated, block: B:38:0x00e4 A[RETURN] */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:37:0x00e2 -> B:7:0x001e). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:38:0x00e4
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final java.lang.Object invokeSuspend(java.lang.Object r15) {
            /*
                Method dump skipped, instruction units count: 232
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: sj.ojitshcjhn.iobyxmoadg.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // tg.vdvldrhtss
        /* JADX INFO: renamed from: ojitshcjhn, reason: merged with bridge method [inline-methods] */
        public final Object invoke(pj.cllcsxoeiz cllcsxoeizVar, nufgyqmvbu nufgyqmvbuVar, lg.gxszxtbevo gxszxtbevoVar) {
            iobyxmoadg iobyxmoadgVar = new iobyxmoadg(this.f107010esjtqupxsv, this.f107013lereixgezr, gxszxtbevoVar);
            iobyxmoadgVar.f107011iwizpuwonk = cllcsxoeizVar;
            iobyxmoadgVar.f107009cqumvgiudr = nufgyqmvbuVar;
            return iobyxmoadgVar.invokeSuspend(gg.wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    private static final lqeggnwhkg eablkybsjg(lqeggnwhkg lqeggnwhkgVar, tg.draadjrbmk draadjrbmkVar) {
        return tj.agtfadlqog.zoijcleaow(new iobyxmoadg(draadjrbmkVar, lqeggnwhkgVar, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long ppxfxbqfkf(long j13, Object obj) {
        return j13;
    }

    public static final lqeggnwhkg wkgbmnqykc(lqeggnwhkg lqeggnwhkgVar, long j13) {
        return dxjokdxxww.ojitshcjhn(lqeggnwhkgVar, crxdokpmqz.eablkybsjg(j13));
    }

    public static final lqeggnwhkg zoijcleaow(lqeggnwhkg lqeggnwhkgVar, final long j13) {
        if (j13 >= 0) {
            return j13 == 0 ? lqeggnwhkgVar : eablkybsjg(lqeggnwhkgVar, new tg.draadjrbmk() { // from class: sj.agtfadlqog
                @Override // tg.draadjrbmk
                public final Object invoke(Object obj) {
                    return Long.valueOf(ojitshcjhn.ppxfxbqfkf(j13, obj));
                }
            });
        }
        throw new IllegalArgumentException("Debounce timeout should not be negative");
    }
}
