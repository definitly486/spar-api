package sj;

/* JADX INFO: loaded from: classes3.dex */
abstract /* synthetic */ class esjtqupxsv {

    public static final class iobyxmoadg implements lqeggnwhkg {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final /* synthetic */ lqeggnwhkg f106856zdlpuopuiu;

        /* JADX INFO: renamed from: sj.esjtqupxsv$iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
        public static final class C2618iobyxmoadg implements nufgyqmvbu {

            /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
            final /* synthetic */ nufgyqmvbu f106857zdlpuopuiu;

            /* JADX INFO: renamed from: sj.esjtqupxsv$iobyxmoadg$iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
            public static final class C2619iobyxmoadg extends kotlin.coroutines.jvm.internal.wkgbmnqykc {

                /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
                int f106859yggfygwlhe;

                /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
                /* synthetic */ Object f106860zdlpuopuiu;

                public C2619iobyxmoadg(lg.gxszxtbevo gxszxtbevoVar) {
                    super(gxszxtbevoVar);
                }

                @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
                public final Object invokeSuspend(Object obj) {
                    this.f106860zdlpuopuiu = obj;
                    this.f106859yggfygwlhe |= Integer.MIN_VALUE;
                    return C2618iobyxmoadg.this.emit(null, this);
                }
            }

            public C2618iobyxmoadg(nufgyqmvbu nufgyqmvbuVar) {
                this.f106857zdlpuopuiu = nufgyqmvbuVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // sj.nufgyqmvbu
            public final Object emit(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
                C2619iobyxmoadg c2619iobyxmoadg;
                if (gxszxtbevoVar instanceof C2619iobyxmoadg) {
                    c2619iobyxmoadg = (C2619iobyxmoadg) gxszxtbevoVar;
                    int i13 = c2619iobyxmoadg.f106859yggfygwlhe;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        c2619iobyxmoadg.f106859yggfygwlhe = i13 - Integer.MIN_VALUE;
                    } else {
                        c2619iobyxmoadg = new C2619iobyxmoadg(gxszxtbevoVar);
                    }
                } else {
                    c2619iobyxmoadg = new C2619iobyxmoadg(gxszxtbevoVar);
                }
                Object obj2 = c2619iobyxmoadg.f106860zdlpuopuiu;
                Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
                int i14 = c2619iobyxmoadg.f106859yggfygwlhe;
                if (i14 == 0) {
                    gg.zdlpuopuiu.zoijcleaow(obj2);
                    nufgyqmvbu nufgyqmvbuVar = this.f106857zdlpuopuiu;
                    if (obj != null) {
                        c2619iobyxmoadg.f106859yggfygwlhe = 1;
                        if (nufgyqmvbuVar.emit(obj, c2619iobyxmoadg) == objGxszxtbevo) {
                            return objGxszxtbevo;
                        }
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

        public iobyxmoadg(lqeggnwhkg lqeggnwhkgVar) {
            this.f106856zdlpuopuiu = lqeggnwhkgVar;
        }

        @Override // sj.lqeggnwhkg
        public Object collect(nufgyqmvbu nufgyqmvbuVar, lg.gxszxtbevo gxszxtbevoVar) {
            Object objCollect = this.f106856zdlpuopuiu.collect(new C2618iobyxmoadg(nufgyqmvbuVar), gxszxtbevoVar);
            return objCollect == mg.zoijcleaow.gxszxtbevo() ? objCollect : gg.wwaezpbzkn.f37140iobyxmoadg;
        }
    }

    public static final class ppxfxbqfkf implements lqeggnwhkg {

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        final /* synthetic */ tg.vdvldrhtss f106861jyumaefscl;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        final /* synthetic */ lqeggnwhkg f106862yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final /* synthetic */ Object f106863zdlpuopuiu;

        public static final class iobyxmoadg extends kotlin.coroutines.jvm.internal.wkgbmnqykc {

            /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
            Object f106864cqumvgiudr;

            /* JADX INFO: renamed from: esjtqupxsv, reason: collision with root package name */
            Object f106865esjtqupxsv;

            /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
            Object f106866iwizpuwonk;

            /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
            int f106868yggfygwlhe;

            /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
            /* synthetic */ Object f106869zdlpuopuiu;

            public iobyxmoadg(lg.gxszxtbevo gxszxtbevoVar) {
                super(gxszxtbevoVar);
            }

            @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
            public final Object invokeSuspend(Object obj) {
                this.f106869zdlpuopuiu = obj;
                this.f106868yggfygwlhe |= Integer.MIN_VALUE;
                return ppxfxbqfkf.this.collect(null, this);
            }
        }

        public ppxfxbqfkf(Object obj, lqeggnwhkg lqeggnwhkgVar, tg.vdvldrhtss vdvldrhtssVar) {
            this.f106863zdlpuopuiu = obj;
            this.f106862yggfygwlhe = lqeggnwhkgVar;
            this.f106861jyumaefscl = vdvldrhtssVar;
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        @Override // sj.lqeggnwhkg
        public Object collect(nufgyqmvbu nufgyqmvbuVar, lg.gxszxtbevo gxszxtbevoVar) {
            iobyxmoadg iobyxmoadgVar;
            ppxfxbqfkf ppxfxbqfkfVar;
            nufgyqmvbu nufgyqmvbuVar2;
            kotlin.jvm.internal.hkdspvbjdz hkdspvbjdzVar;
            if (gxszxtbevoVar instanceof iobyxmoadg) {
                iobyxmoadgVar = (iobyxmoadg) gxszxtbevoVar;
                int i13 = iobyxmoadgVar.f106868yggfygwlhe;
                if ((i13 & Integer.MIN_VALUE) != 0) {
                    iobyxmoadgVar.f106868yggfygwlhe = i13 - Integer.MIN_VALUE;
                } else {
                    iobyxmoadgVar = new iobyxmoadg(gxszxtbevoVar);
                }
            } else {
                iobyxmoadgVar = new iobyxmoadg(gxszxtbevoVar);
            }
            Object obj = iobyxmoadgVar.f106869zdlpuopuiu;
            Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
            int i14 = iobyxmoadgVar.f106868yggfygwlhe;
            if (i14 != 0) {
                if (i14 == 1) {
                    hkdspvbjdzVar = (kotlin.jvm.internal.hkdspvbjdz) iobyxmoadgVar.f106865esjtqupxsv;
                    nufgyqmvbuVar2 = (nufgyqmvbu) iobyxmoadgVar.f106864cqumvgiudr;
                    ppxfxbqfkfVar = (ppxfxbqfkf) iobyxmoadgVar.f106866iwizpuwonk;
                    gg.zdlpuopuiu.zoijcleaow(obj);
                } else {
                    if (i14 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    gg.zdlpuopuiu.zoijcleaow(obj);
                }
                return gg.wwaezpbzkn.f37140iobyxmoadg;
            }
            gg.zdlpuopuiu.zoijcleaow(obj);
            kotlin.jvm.internal.hkdspvbjdz hkdspvbjdzVar2 = new kotlin.jvm.internal.hkdspvbjdz();
            Object obj2 = this.f106863zdlpuopuiu;
            hkdspvbjdzVar2.f60015zdlpuopuiu = obj2;
            iobyxmoadgVar.f106866iwizpuwonk = this;
            iobyxmoadgVar.f106864cqumvgiudr = nufgyqmvbuVar;
            iobyxmoadgVar.f106865esjtqupxsv = hkdspvbjdzVar2;
            iobyxmoadgVar.f106868yggfygwlhe = 1;
            if (nufgyqmvbuVar.emit(obj2, iobyxmoadgVar) == objGxszxtbevo) {
                return objGxszxtbevo;
            }
            ppxfxbqfkfVar = this;
            nufgyqmvbuVar2 = nufgyqmvbuVar;
            hkdspvbjdzVar = hkdspvbjdzVar2;
            lqeggnwhkg lqeggnwhkgVar = ppxfxbqfkfVar.f106862yggfygwlhe;
            wkgbmnqykc wkgbmnqykcVar = new wkgbmnqykc(hkdspvbjdzVar, ppxfxbqfkfVar.f106861jyumaefscl, nufgyqmvbuVar2);
            iobyxmoadgVar.f106866iwizpuwonk = null;
            iobyxmoadgVar.f106864cqumvgiudr = null;
            iobyxmoadgVar.f106865esjtqupxsv = null;
            iobyxmoadgVar.f106868yggfygwlhe = 2;
            if (lqeggnwhkgVar.collect(wkgbmnqykcVar, iobyxmoadgVar) == objGxszxtbevo) {
                return objGxszxtbevo;
            }
            return gg.wwaezpbzkn.f37140iobyxmoadg;
        }
    }

    static final class wkgbmnqykc implements nufgyqmvbu {

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        final /* synthetic */ nufgyqmvbu f106870jyumaefscl;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        final /* synthetic */ tg.vdvldrhtss f106871yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final /* synthetic */ kotlin.jvm.internal.hkdspvbjdz f106872zdlpuopuiu;

        static final class iobyxmoadg extends kotlin.coroutines.jvm.internal.wkgbmnqykc {

            /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
            int f106873cqumvgiudr;

            /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
            /* synthetic */ Object f106875jyumaefscl;

            /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
            Object f106876yggfygwlhe;

            /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
            Object f106877zdlpuopuiu;

            iobyxmoadg(lg.gxszxtbevo gxszxtbevoVar) {
                super(gxszxtbevoVar);
            }

            @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
            public final Object invokeSuspend(Object obj) {
                this.f106875jyumaefscl = obj;
                this.f106873cqumvgiudr |= Integer.MIN_VALUE;
                return wkgbmnqykc.this.emit(null, this);
            }
        }

        wkgbmnqykc(kotlin.jvm.internal.hkdspvbjdz hkdspvbjdzVar, tg.vdvldrhtss vdvldrhtssVar, nufgyqmvbu nufgyqmvbuVar) {
            this.f106872zdlpuopuiu = hkdspvbjdzVar;
            this.f106871yggfygwlhe = vdvldrhtssVar;
            this.f106870jyumaefscl = nufgyqmvbuVar;
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        @Override // sj.nufgyqmvbu
        public final Object emit(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
            iobyxmoadg iobyxmoadgVar;
            wkgbmnqykc wkgbmnqykcVar;
            kotlin.jvm.internal.hkdspvbjdz hkdspvbjdzVar;
            if (gxszxtbevoVar instanceof iobyxmoadg) {
                iobyxmoadgVar = (iobyxmoadg) gxszxtbevoVar;
                int i13 = iobyxmoadgVar.f106873cqumvgiudr;
                if ((i13 & Integer.MIN_VALUE) != 0) {
                    iobyxmoadgVar.f106873cqumvgiudr = i13 - Integer.MIN_VALUE;
                } else {
                    iobyxmoadgVar = new iobyxmoadg(gxszxtbevoVar);
                }
            } else {
                iobyxmoadgVar = new iobyxmoadg(gxszxtbevoVar);
            }
            Object obj2 = iobyxmoadgVar.f106875jyumaefscl;
            Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
            int i14 = iobyxmoadgVar.f106873cqumvgiudr;
            if (i14 != 0) {
                if (i14 == 1) {
                    hkdspvbjdzVar = (kotlin.jvm.internal.hkdspvbjdz) iobyxmoadgVar.f106876yggfygwlhe;
                    wkgbmnqykcVar = (wkgbmnqykc) iobyxmoadgVar.f106877zdlpuopuiu;
                    gg.zdlpuopuiu.zoijcleaow(obj2);
                } else {
                    if (i14 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    gg.zdlpuopuiu.zoijcleaow(obj2);
                }
                return gg.wwaezpbzkn.f37140iobyxmoadg;
            }
            gg.zdlpuopuiu.zoijcleaow(obj2);
            kotlin.jvm.internal.hkdspvbjdz hkdspvbjdzVar2 = this.f106872zdlpuopuiu;
            tg.vdvldrhtss vdvldrhtssVar = this.f106871yggfygwlhe;
            Object obj3 = hkdspvbjdzVar2.f60015zdlpuopuiu;
            iobyxmoadgVar.f106877zdlpuopuiu = this;
            iobyxmoadgVar.f106876yggfygwlhe = hkdspvbjdzVar2;
            iobyxmoadgVar.f106873cqumvgiudr = 1;
            Object objInvoke = vdvldrhtssVar.invoke(obj3, obj, iobyxmoadgVar);
            if (objInvoke == objGxszxtbevo) {
                return objGxszxtbevo;
            }
            wkgbmnqykcVar = this;
            obj2 = objInvoke;
            hkdspvbjdzVar = hkdspvbjdzVar2;
            hkdspvbjdzVar.f60015zdlpuopuiu = obj2;
            nufgyqmvbu nufgyqmvbuVar = wkgbmnqykcVar.f106870jyumaefscl;
            Object obj4 = wkgbmnqykcVar.f106872zdlpuopuiu.f60015zdlpuopuiu;
            iobyxmoadgVar.f106877zdlpuopuiu = null;
            iobyxmoadgVar.f106876yggfygwlhe = null;
            iobyxmoadgVar.f106873cqumvgiudr = 2;
            if (nufgyqmvbuVar.emit(obj4, iobyxmoadgVar) == objGxszxtbevo) {
                return objGxszxtbevo;
            }
            return gg.wwaezpbzkn.f37140iobyxmoadg;
        }
    }

    public static final class zoijcleaow implements lqeggnwhkg {

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        final /* synthetic */ tg.rgvfuqvkyq f106878yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final /* synthetic */ lqeggnwhkg f106879zdlpuopuiu;

        public static final class iobyxmoadg implements nufgyqmvbu {

            /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
            final /* synthetic */ tg.rgvfuqvkyq f106880yggfygwlhe;

            /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
            final /* synthetic */ nufgyqmvbu f106881zdlpuopuiu;

            /* JADX INFO: renamed from: sj.esjtqupxsv$zoijcleaow$iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
            public static final class C2620iobyxmoadg extends kotlin.coroutines.jvm.internal.wkgbmnqykc {

                /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
                Object f106882cqumvgiudr;

                /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
                Object f106883iwizpuwonk;

                /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
                int f106885yggfygwlhe;

                /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
                /* synthetic */ Object f106886zdlpuopuiu;

                public C2620iobyxmoadg(lg.gxszxtbevo gxszxtbevoVar) {
                    super(gxszxtbevoVar);
                }

                @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
                public final Object invokeSuspend(Object obj) {
                    this.f106886zdlpuopuiu = obj;
                    this.f106885yggfygwlhe |= Integer.MIN_VALUE;
                    return iobyxmoadg.this.emit(null, this);
                }
            }

            public iobyxmoadg(nufgyqmvbu nufgyqmvbuVar, tg.rgvfuqvkyq rgvfuqvkyqVar) {
                this.f106881zdlpuopuiu = nufgyqmvbuVar;
                this.f106880yggfygwlhe = rgvfuqvkyqVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // sj.nufgyqmvbu
            public final Object emit(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
                C2620iobyxmoadg c2620iobyxmoadg;
                Object obj2;
                nufgyqmvbu nufgyqmvbuVar;
                if (gxszxtbevoVar instanceof C2620iobyxmoadg) {
                    c2620iobyxmoadg = (C2620iobyxmoadg) gxszxtbevoVar;
                    int i13 = c2620iobyxmoadg.f106885yggfygwlhe;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        c2620iobyxmoadg.f106885yggfygwlhe = i13 - Integer.MIN_VALUE;
                    } else {
                        c2620iobyxmoadg = new C2620iobyxmoadg(gxszxtbevoVar);
                    }
                } else {
                    c2620iobyxmoadg = new C2620iobyxmoadg(gxszxtbevoVar);
                }
                Object obj3 = c2620iobyxmoadg.f106886zdlpuopuiu;
                Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
                int i14 = c2620iobyxmoadg.f106885yggfygwlhe;
                if (i14 != 0) {
                    if (i14 == 1) {
                        nufgyqmvbuVar = (nufgyqmvbu) c2620iobyxmoadg.f106882cqumvgiudr;
                        obj2 = c2620iobyxmoadg.f106883iwizpuwonk;
                        gg.zdlpuopuiu.zoijcleaow(obj3);
                    } else {
                        if (i14 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        gg.zdlpuopuiu.zoijcleaow(obj3);
                    }
                    return gg.wwaezpbzkn.f37140iobyxmoadg;
                }
                gg.zdlpuopuiu.zoijcleaow(obj3);
                nufgyqmvbu nufgyqmvbuVar2 = this.f106881zdlpuopuiu;
                tg.rgvfuqvkyq rgvfuqvkyqVar = this.f106880yggfygwlhe;
                c2620iobyxmoadg.f106883iwizpuwonk = obj;
                c2620iobyxmoadg.f106882cqumvgiudr = nufgyqmvbuVar2;
                c2620iobyxmoadg.f106885yggfygwlhe = 1;
                kotlin.jvm.internal.oxmwwwfdhm.ppxfxbqfkf(6);
                Object objInvoke = rgvfuqvkyqVar.invoke(obj, c2620iobyxmoadg);
                kotlin.jvm.internal.oxmwwwfdhm.ppxfxbqfkf(7);
                if (objInvoke == objGxszxtbevo) {
                    return objGxszxtbevo;
                }
                obj2 = obj;
                nufgyqmvbuVar = nufgyqmvbuVar2;
                c2620iobyxmoadg.f106883iwizpuwonk = null;
                c2620iobyxmoadg.f106882cqumvgiudr = null;
                c2620iobyxmoadg.f106885yggfygwlhe = 2;
                if (nufgyqmvbuVar.emit(obj2, c2620iobyxmoadg) == objGxszxtbevo) {
                    return objGxszxtbevo;
                }
                return gg.wwaezpbzkn.f37140iobyxmoadg;
            }
        }

        public zoijcleaow(lqeggnwhkg lqeggnwhkgVar, tg.rgvfuqvkyq rgvfuqvkyqVar) {
            this.f106879zdlpuopuiu = lqeggnwhkgVar;
            this.f106878yggfygwlhe = rgvfuqvkyqVar;
        }

        @Override // sj.lqeggnwhkg
        public Object collect(nufgyqmvbu nufgyqmvbuVar, lg.gxszxtbevo gxszxtbevoVar) {
            Object objCollect = this.f106879zdlpuopuiu.collect(new iobyxmoadg(nufgyqmvbuVar, this.f106878yggfygwlhe), gxszxtbevoVar);
            return objCollect == mg.zoijcleaow.gxszxtbevo() ? objCollect : gg.wwaezpbzkn.f37140iobyxmoadg;
        }
    }

    public static final lqeggnwhkg iobyxmoadg(lqeggnwhkg lqeggnwhkgVar) {
        return new iobyxmoadg(lqeggnwhkgVar);
    }

    public static final lqeggnwhkg ppxfxbqfkf(lqeggnwhkg lqeggnwhkgVar, Object obj, tg.vdvldrhtss vdvldrhtssVar) {
        return new ppxfxbqfkf(obj, lqeggnwhkgVar, vdvldrhtssVar);
    }

    public static final lqeggnwhkg wkgbmnqykc(lqeggnwhkg lqeggnwhkgVar, Object obj, tg.vdvldrhtss vdvldrhtssVar) {
        return dxjokdxxww.crxdokpmqz(lqeggnwhkgVar, obj, vdvldrhtssVar);
    }

    public static final lqeggnwhkg zoijcleaow(lqeggnwhkg lqeggnwhkgVar, tg.rgvfuqvkyq rgvfuqvkyqVar) {
        return new zoijcleaow(lqeggnwhkgVar, rgvfuqvkyqVar);
    }
}
