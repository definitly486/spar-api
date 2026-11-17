package sj;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: loaded from: classes3.dex */
public abstract /* synthetic */ class jyumaefscl {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private static final int f106930iobyxmoadg = uj.cdpycssgdh.zoijcleaow("kotlinx.coroutines.flow.defaultConcurrency", 16, 1, Integer.MAX_VALUE);

    public static final class iobyxmoadg implements lqeggnwhkg {

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        final /* synthetic */ tg.rgvfuqvkyq f106931yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final /* synthetic */ lqeggnwhkg f106932zdlpuopuiu;

        /* JADX INFO: renamed from: sj.jyumaefscl$iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
        public static final class C2622iobyxmoadg implements nufgyqmvbu {

            /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
            final /* synthetic */ tg.rgvfuqvkyq f106933yggfygwlhe;

            /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
            final /* synthetic */ nufgyqmvbu f106934zdlpuopuiu;

            /* JADX INFO: renamed from: sj.jyumaefscl$iobyxmoadg$iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
            public static final class C2623iobyxmoadg extends kotlin.coroutines.jvm.internal.wkgbmnqykc {

                /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
                Object f106936jyumaefscl;

                /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
                int f106937yggfygwlhe;

                /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
                /* synthetic */ Object f106938zdlpuopuiu;

                public C2623iobyxmoadg(lg.gxszxtbevo gxszxtbevoVar) {
                    super(gxszxtbevoVar);
                }

                @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
                public final Object invokeSuspend(Object obj) {
                    this.f106938zdlpuopuiu = obj;
                    this.f106937yggfygwlhe |= Integer.MIN_VALUE;
                    return C2622iobyxmoadg.this.emit(null, this);
                }
            }

            public C2622iobyxmoadg(nufgyqmvbu nufgyqmvbuVar, tg.rgvfuqvkyq rgvfuqvkyqVar) {
                this.f106934zdlpuopuiu = nufgyqmvbuVar;
                this.f106933yggfygwlhe = rgvfuqvkyqVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // sj.nufgyqmvbu
            public final Object emit(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
                C2623iobyxmoadg c2623iobyxmoadg;
                nufgyqmvbu nufgyqmvbuVar;
                if (gxszxtbevoVar instanceof C2623iobyxmoadg) {
                    c2623iobyxmoadg = (C2623iobyxmoadg) gxszxtbevoVar;
                    int i13 = c2623iobyxmoadg.f106937yggfygwlhe;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        c2623iobyxmoadg.f106937yggfygwlhe = i13 - Integer.MIN_VALUE;
                    } else {
                        c2623iobyxmoadg = new C2623iobyxmoadg(gxszxtbevoVar);
                    }
                } else {
                    c2623iobyxmoadg = new C2623iobyxmoadg(gxszxtbevoVar);
                }
                Object obj2 = c2623iobyxmoadg.f106938zdlpuopuiu;
                Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
                int i14 = c2623iobyxmoadg.f106937yggfygwlhe;
                if (i14 != 0) {
                    if (i14 == 1) {
                        nufgyqmvbuVar = (nufgyqmvbu) c2623iobyxmoadg.f106936jyumaefscl;
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
                nufgyqmvbu nufgyqmvbuVar2 = this.f106934zdlpuopuiu;
                tg.rgvfuqvkyq rgvfuqvkyqVar = this.f106933yggfygwlhe;
                c2623iobyxmoadg.f106936jyumaefscl = nufgyqmvbuVar2;
                c2623iobyxmoadg.f106937yggfygwlhe = 1;
                Object objInvoke = rgvfuqvkyqVar.invoke(obj, c2623iobyxmoadg);
                if (objInvoke == objGxszxtbevo) {
                    return objGxszxtbevo;
                }
                obj2 = objInvoke;
                nufgyqmvbuVar = nufgyqmvbuVar2;
                c2623iobyxmoadg.f106936jyumaefscl = null;
                c2623iobyxmoadg.f106937yggfygwlhe = 2;
                if (nufgyqmvbuVar.emit(obj2, c2623iobyxmoadg) == objGxszxtbevo) {
                    return objGxszxtbevo;
                }
                return gg.wwaezpbzkn.f37140iobyxmoadg;
            }
        }

        public iobyxmoadg(lqeggnwhkg lqeggnwhkgVar, tg.rgvfuqvkyq rgvfuqvkyqVar) {
            this.f106932zdlpuopuiu = lqeggnwhkgVar;
            this.f106931yggfygwlhe = rgvfuqvkyqVar;
        }

        @Override // sj.lqeggnwhkg
        public Object collect(nufgyqmvbu nufgyqmvbuVar, lg.gxszxtbevo gxszxtbevoVar) {
            Object objCollect = this.f106932zdlpuopuiu.collect(new C2622iobyxmoadg(nufgyqmvbuVar, this.f106931yggfygwlhe), gxszxtbevoVar);
            return objCollect == mg.zoijcleaow.gxszxtbevo() ? objCollect : gg.wwaezpbzkn.f37140iobyxmoadg;
        }
    }

    static final class ppxfxbqfkf implements nufgyqmvbu {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final /* synthetic */ nufgyqmvbu f106939zdlpuopuiu;

        static final class iobyxmoadg extends kotlin.coroutines.jvm.internal.wkgbmnqykc {

            /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
            int f106940jyumaefscl;

            /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
            /* synthetic */ Object f106942zdlpuopuiu;

            iobyxmoadg(lg.gxszxtbevo gxszxtbevoVar) {
                super(gxszxtbevoVar);
            }

            @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
            public final Object invokeSuspend(Object obj) {
                this.f106942zdlpuopuiu = obj;
                this.f106940jyumaefscl |= Integer.MIN_VALUE;
                return ppxfxbqfkf.this.emit(null, this);
            }
        }

        ppxfxbqfkf(nufgyqmvbu nufgyqmvbuVar) {
            this.f106939zdlpuopuiu = nufgyqmvbuVar;
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        @Override // sj.nufgyqmvbu
        /* JADX INFO: renamed from: zoijcleaow, reason: merged with bridge method [inline-methods] */
        public final Object emit(lqeggnwhkg lqeggnwhkgVar, lg.gxszxtbevo gxszxtbevoVar) {
            iobyxmoadg iobyxmoadgVar;
            if (gxszxtbevoVar instanceof iobyxmoadg) {
                iobyxmoadgVar = (iobyxmoadg) gxszxtbevoVar;
                int i13 = iobyxmoadgVar.f106940jyumaefscl;
                if ((i13 & Integer.MIN_VALUE) != 0) {
                    iobyxmoadgVar.f106940jyumaefscl = i13 - Integer.MIN_VALUE;
                } else {
                    iobyxmoadgVar = new iobyxmoadg(gxszxtbevoVar);
                }
            } else {
                iobyxmoadgVar = new iobyxmoadg(gxszxtbevoVar);
            }
            Object obj = iobyxmoadgVar.f106942zdlpuopuiu;
            Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
            int i14 = iobyxmoadgVar.f106940jyumaefscl;
            if (i14 == 0) {
                gg.zdlpuopuiu.zoijcleaow(obj);
                nufgyqmvbu nufgyqmvbuVar = this.f106939zdlpuopuiu;
                iobyxmoadgVar.f106940jyumaefscl = 1;
                if (dxjokdxxww.iwizpuwonk(nufgyqmvbuVar, lqeggnwhkgVar, iobyxmoadgVar) == objGxszxtbevo) {
                    return objGxszxtbevo;
                }
            } else {
                if (i14 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                gg.zdlpuopuiu.zoijcleaow(obj);
            }
            return gg.wwaezpbzkn.f37140iobyxmoadg;
        }
    }

    static final class wkgbmnqykc extends kotlin.coroutines.jvm.internal.draadjrbmk implements tg.vdvldrhtss {

        /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
        final /* synthetic */ tg.rgvfuqvkyq f106943iwizpuwonk;

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        /* synthetic */ Object f106944jyumaefscl;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        private /* synthetic */ Object f106945yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        int f106946zdlpuopuiu;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        wkgbmnqykc(tg.rgvfuqvkyq rgvfuqvkyqVar, lg.gxszxtbevo gxszxtbevoVar) {
            super(3, gxszxtbevoVar);
            this.f106943iwizpuwonk = rgvfuqvkyqVar;
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            nufgyqmvbu nufgyqmvbuVar;
            Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
            int i13 = this.f106946zdlpuopuiu;
            if (i13 != 0) {
                if (i13 == 1) {
                    nufgyqmvbuVar = (nufgyqmvbu) this.f106945yggfygwlhe;
                    gg.zdlpuopuiu.zoijcleaow(obj);
                } else {
                    if (i13 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    gg.zdlpuopuiu.zoijcleaow(obj);
                }
                return gg.wwaezpbzkn.f37140iobyxmoadg;
            }
            gg.zdlpuopuiu.zoijcleaow(obj);
            nufgyqmvbuVar = (nufgyqmvbu) this.f106945yggfygwlhe;
            Object obj2 = this.f106944jyumaefscl;
            tg.rgvfuqvkyq rgvfuqvkyqVar = this.f106943iwizpuwonk;
            this.f106945yggfygwlhe = nufgyqmvbuVar;
            this.f106946zdlpuopuiu = 1;
            obj = rgvfuqvkyqVar.invoke(obj2, this);
            if (obj == objGxszxtbevo) {
                return objGxszxtbevo;
            }
            this.f106945yggfygwlhe = null;
            this.f106946zdlpuopuiu = 2;
            if (nufgyqmvbuVar.emit(obj, this) == objGxszxtbevo) {
                return objGxszxtbevo;
            }
            return gg.wwaezpbzkn.f37140iobyxmoadg;
        }

        @Override // tg.vdvldrhtss
        /* JADX INFO: renamed from: ojitshcjhn, reason: merged with bridge method [inline-methods] */
        public final Object invoke(nufgyqmvbu nufgyqmvbuVar, Object obj, lg.gxszxtbevo gxszxtbevoVar) {
            wkgbmnqykc wkgbmnqykcVar = new wkgbmnqykc(this.f106943iwizpuwonk, gxszxtbevoVar);
            wkgbmnqykcVar.f106945yggfygwlhe = nufgyqmvbuVar;
            wkgbmnqykcVar.f106944jyumaefscl = obj;
            return wkgbmnqykcVar.invokeSuspend(gg.wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    public static final class zoijcleaow implements lqeggnwhkg {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final /* synthetic */ lqeggnwhkg f106947zdlpuopuiu;

        public zoijcleaow(lqeggnwhkg lqeggnwhkgVar) {
            this.f106947zdlpuopuiu = lqeggnwhkgVar;
        }

        @Override // sj.lqeggnwhkg
        public Object collect(nufgyqmvbu nufgyqmvbuVar, lg.gxszxtbevo gxszxtbevoVar) {
            Object objCollect = this.f106947zdlpuopuiu.collect(new ppxfxbqfkf(nufgyqmvbuVar), gxszxtbevoVar);
            return objCollect == mg.zoijcleaow.gxszxtbevo() ? objCollect : gg.wwaezpbzkn.f37140iobyxmoadg;
        }
    }

    public static final lqeggnwhkg eablkybsjg(lqeggnwhkg lqeggnwhkgVar, tg.rgvfuqvkyq rgvfuqvkyqVar) {
        return dxjokdxxww.ikoacuggdj(lqeggnwhkgVar, new wkgbmnqykc(rgvfuqvkyqVar, null));
    }

    public static final lqeggnwhkg gxszxtbevo(Iterable iterable) {
        return new tj.btonecajqb(iterable, null, 0, null, 14, null);
    }

    public static final lqeggnwhkg iobyxmoadg(lqeggnwhkg lqeggnwhkgVar, int i13, tg.rgvfuqvkyq rgvfuqvkyqVar) {
        return dxjokdxxww.lmojexxdyd(new iobyxmoadg(lqeggnwhkgVar, rgvfuqvkyqVar), i13);
    }

    public static final lqeggnwhkg lqeggnwhkg(lqeggnwhkg... lqeggnwhkgVarArr) {
        return dxjokdxxww.dsvhmnatus(hg.agtfadlqog.crxdokpmqz(lqeggnwhkgVarArr));
    }

    public static final lqeggnwhkg nufgyqmvbu(lqeggnwhkg lqeggnwhkgVar, tg.vdvldrhtss vdvldrhtssVar) {
        return new tj.dxjokdxxww(vdvldrhtssVar, lqeggnwhkgVar, null, 0, null, 28, null);
    }

    public static final lqeggnwhkg ppxfxbqfkf(lqeggnwhkg lqeggnwhkgVar) {
        return new zoijcleaow(lqeggnwhkgVar);
    }

    public static final lqeggnwhkg wkgbmnqykc(lqeggnwhkg lqeggnwhkgVar, int i13) {
        if (i13 <= 0) {
            throw new IllegalArgumentException(("Expected positive concurrency level, but had " + i13).toString());
        }
        if (i13 == 1) {
            return dxjokdxxww.iozdgvuglv(lqeggnwhkgVar);
        }
        return new tj.gxszxtbevo(lqeggnwhkgVar, i13, null, 0, null, 28, null);
    }

    public static /* synthetic */ lqeggnwhkg zoijcleaow(lqeggnwhkg lqeggnwhkgVar, int i13, tg.rgvfuqvkyq rgvfuqvkyqVar, int i14, Object obj) {
        if ((i14 & 1) != 0) {
            i13 = f106930iobyxmoadg;
        }
        return dxjokdxxww.cdpycssgdh(lqeggnwhkgVar, i13, rgvfuqvkyqVar);
    }
}
