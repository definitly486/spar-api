package sj;

import kotlinx.coroutines.flow.internal.AbortFlowException;

/* JADX INFO: loaded from: classes3.dex */
abstract /* synthetic */ class yggfygwlhe {

    public static final class dxjokdxxww implements sj.nufgyqmvbu {

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        final /* synthetic */ sj.nufgyqmvbu f107055yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final /* synthetic */ tg.rgvfuqvkyq f107056zdlpuopuiu;

        public static final class iobyxmoadg extends kotlin.coroutines.jvm.internal.wkgbmnqykc {

            /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
            Object f107057cqumvgiudr;

            /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
            int f107059jyumaefscl;

            /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
            /* synthetic */ Object f107060yggfygwlhe;

            /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
            Object f107061zdlpuopuiu;

            public iobyxmoadg(lg.gxszxtbevo gxszxtbevoVar) {
                super(gxszxtbevoVar);
            }

            @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
            public final Object invokeSuspend(Object obj) {
                this.f107060yggfygwlhe = obj;
                this.f107059jyumaefscl |= Integer.MIN_VALUE;
                return dxjokdxxww.this.emit(null, this);
            }
        }

        public dxjokdxxww(tg.rgvfuqvkyq rgvfuqvkyqVar, sj.nufgyqmvbu nufgyqmvbuVar) {
            this.f107056zdlpuopuiu = rgvfuqvkyqVar;
            this.f107055yggfygwlhe = nufgyqmvbuVar;
        }

        /* JADX WARN: Code duplicated, block: B:27:0x007e  */
        /* JADX WARN: Code duplicated, block: B:29:0x0081  */
        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        @Override // sj.nufgyqmvbu
        public Object emit(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
            iobyxmoadg iobyxmoadgVar;
            Object obj2;
            Object obj3;
            dxjokdxxww dxjokdxxwwVar;
            if (gxszxtbevoVar instanceof iobyxmoadg) {
                iobyxmoadgVar = (iobyxmoadg) gxszxtbevoVar;
                int i13 = iobyxmoadgVar.f107059jyumaefscl;
                if ((i13 & Integer.MIN_VALUE) != 0) {
                    iobyxmoadgVar.f107059jyumaefscl = i13 - Integer.MIN_VALUE;
                } else {
                    iobyxmoadgVar = new iobyxmoadg(gxszxtbevoVar);
                }
            } else {
                iobyxmoadgVar = new iobyxmoadg(gxszxtbevoVar);
            }
            Object obj4 = iobyxmoadgVar.f107060yggfygwlhe;
            Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
            int i14 = iobyxmoadgVar.f107059jyumaefscl;
            boolean z13 = true;
            if (i14 != 0) {
                if (i14 == 1) {
                    Object obj5 = iobyxmoadgVar.f107057cqumvgiudr;
                    dxjokdxxww dxjokdxxwwVar2 = (dxjokdxxww) iobyxmoadgVar.f107061zdlpuopuiu;
                    gg.zdlpuopuiu.zoijcleaow(obj4);
                    obj3 = obj5;
                    dxjokdxxwwVar = dxjokdxxwwVar2;
                    obj2 = obj4;
                } else {
                    if (i14 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    dxjokdxxwwVar = (dxjokdxxww) iobyxmoadgVar.f107061zdlpuopuiu;
                    gg.zdlpuopuiu.zoijcleaow(obj4);
                }
                if (z13) {
                    return gg.wwaezpbzkn.f37140iobyxmoadg;
                }
                throw new AbortFlowException(dxjokdxxwwVar);
            }
            gg.zdlpuopuiu.zoijcleaow(obj4);
            tg.rgvfuqvkyq rgvfuqvkyqVar = this.f107056zdlpuopuiu;
            iobyxmoadgVar.f107061zdlpuopuiu = this;
            iobyxmoadgVar.f107057cqumvgiudr = obj;
            iobyxmoadgVar.f107059jyumaefscl = 1;
            kotlin.jvm.internal.oxmwwwfdhm.ppxfxbqfkf(6);
            Object objInvoke = rgvfuqvkyqVar.invoke(obj, iobyxmoadgVar);
            kotlin.jvm.internal.oxmwwwfdhm.ppxfxbqfkf(7);
            if (objInvoke == objGxszxtbevo) {
                return objGxszxtbevo;
            }
            obj2 = objInvoke;
            obj3 = obj;
            dxjokdxxwwVar = this;
            if (((Boolean) obj2).booleanValue()) {
                sj.nufgyqmvbu nufgyqmvbuVar = dxjokdxxwwVar.f107055yggfygwlhe;
                iobyxmoadgVar.f107061zdlpuopuiu = dxjokdxxwwVar;
                iobyxmoadgVar.f107057cqumvgiudr = null;
                iobyxmoadgVar.f107059jyumaefscl = 2;
                if (nufgyqmvbuVar.emit(obj3, iobyxmoadgVar) == objGxszxtbevo) {
                    return objGxszxtbevo;
                }
            } else {
                z13 = false;
            }
            if (z13) {
                return gg.wwaezpbzkn.f37140iobyxmoadg;
            }
            throw new AbortFlowException(dxjokdxxwwVar);
        }
    }

    static final class eablkybsjg extends kotlin.coroutines.jvm.internal.wkgbmnqykc {

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        int f107062jyumaefscl;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        /* synthetic */ Object f107063yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        Object f107064zdlpuopuiu;

        eablkybsjg(lg.gxszxtbevo gxszxtbevoVar) {
            super(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            this.f107063yggfygwlhe = obj;
            this.f107062jyumaefscl |= Integer.MIN_VALUE;
            return yggfygwlhe.wkgbmnqykc(null, null, null, this);
        }
    }

    public static final class gxszxtbevo implements sj.lqeggnwhkg {

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        final /* synthetic */ int f107065yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final /* synthetic */ sj.lqeggnwhkg f107066zdlpuopuiu;

        public static final class iobyxmoadg extends kotlin.coroutines.jvm.internal.wkgbmnqykc {

            /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
            Object f107067iwizpuwonk;

            /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
            int f107069yggfygwlhe;

            /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
            /* synthetic */ Object f107070zdlpuopuiu;

            public iobyxmoadg(lg.gxszxtbevo gxszxtbevoVar) {
                super(gxszxtbevoVar);
            }

            @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
            public final Object invokeSuspend(Object obj) {
                this.f107070zdlpuopuiu = obj;
                this.f107069yggfygwlhe |= Integer.MIN_VALUE;
                return gxszxtbevo.this.collect(null, this);
            }
        }

        public gxszxtbevo(sj.lqeggnwhkg lqeggnwhkgVar, int i13) {
            this.f107066zdlpuopuiu = lqeggnwhkgVar;
            this.f107065yggfygwlhe = i13;
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        @Override // sj.lqeggnwhkg
        public Object collect(sj.nufgyqmvbu nufgyqmvbuVar, lg.gxszxtbevo gxszxtbevoVar) {
            iobyxmoadg iobyxmoadgVar;
            AbortFlowException e13;
            Object obj;
            if (gxszxtbevoVar instanceof iobyxmoadg) {
                iobyxmoadgVar = (iobyxmoadg) gxszxtbevoVar;
                int i13 = iobyxmoadgVar.f107069yggfygwlhe;
                if ((i13 & Integer.MIN_VALUE) != 0) {
                    iobyxmoadgVar.f107069yggfygwlhe = i13 - Integer.MIN_VALUE;
                } else {
                    iobyxmoadgVar = new iobyxmoadg(gxszxtbevoVar);
                }
            } else {
                iobyxmoadgVar = new iobyxmoadg(gxszxtbevoVar);
            }
            Object obj2 = iobyxmoadgVar.f107070zdlpuopuiu;
            Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
            int i14 = iobyxmoadgVar.f107069yggfygwlhe;
            if (i14 == 0) {
                gg.zdlpuopuiu.zoijcleaow(obj2);
                Object obj3 = new Object();
                kotlin.jvm.internal.hcddaimhww hcddaimhwwVar = new kotlin.jvm.internal.hcddaimhww();
                try {
                    sj.lqeggnwhkg lqeggnwhkgVar = this.f107066zdlpuopuiu;
                    lqeggnwhkg lqeggnwhkgVar2 = new lqeggnwhkg(hcddaimhwwVar, this.f107065yggfygwlhe, nufgyqmvbuVar, obj3);
                    iobyxmoadgVar.f107067iwizpuwonk = obj3;
                    iobyxmoadgVar.f107069yggfygwlhe = 1;
                    if (lqeggnwhkgVar.collect(lqeggnwhkgVar2, iobyxmoadgVar) == objGxszxtbevo) {
                        return objGxszxtbevo;
                    }
                } catch (AbortFlowException e14) {
                    e13 = e14;
                    obj = obj3;
                    tj.ojitshcjhn.iobyxmoadg(e13, obj);
                }
            } else {
                if (i14 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                obj = iobyxmoadgVar.f107067iwizpuwonk;
                try {
                    gg.zdlpuopuiu.zoijcleaow(obj2);
                } catch (AbortFlowException e15) {
                    e13 = e15;
                    tj.ojitshcjhn.iobyxmoadg(e13, obj);
                }
            }
            return gg.wwaezpbzkn.f37140iobyxmoadg;
        }
    }

    public static final class iobyxmoadg implements sj.lqeggnwhkg {

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        final /* synthetic */ int f107071yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final /* synthetic */ sj.lqeggnwhkg f107072zdlpuopuiu;

        public iobyxmoadg(sj.lqeggnwhkg lqeggnwhkgVar, int i13) {
            this.f107072zdlpuopuiu = lqeggnwhkgVar;
            this.f107071yggfygwlhe = i13;
        }

        @Override // sj.lqeggnwhkg
        public Object collect(sj.nufgyqmvbu nufgyqmvbuVar, lg.gxszxtbevo gxszxtbevoVar) {
            Object objCollect = this.f107072zdlpuopuiu.collect(new zoijcleaow(new kotlin.jvm.internal.hcddaimhww(), this.f107071yggfygwlhe, nufgyqmvbuVar), gxszxtbevoVar);
            return objCollect == mg.zoijcleaow.gxszxtbevo() ? objCollect : gg.wwaezpbzkn.f37140iobyxmoadg;
        }
    }

    static final class lqeggnwhkg implements sj.nufgyqmvbu {

        /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
        final /* synthetic */ Object f107073iwizpuwonk;

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        final /* synthetic */ sj.nufgyqmvbu f107074jyumaefscl;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        final /* synthetic */ int f107075yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final /* synthetic */ kotlin.jvm.internal.hcddaimhww f107076zdlpuopuiu;

        static final class iobyxmoadg extends kotlin.coroutines.jvm.internal.wkgbmnqykc {

            /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
            int f107077jyumaefscl;

            /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
            /* synthetic */ Object f107079zdlpuopuiu;

            iobyxmoadg(lg.gxszxtbevo gxszxtbevoVar) {
                super(gxszxtbevoVar);
            }

            @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
            public final Object invokeSuspend(Object obj) {
                this.f107079zdlpuopuiu = obj;
                this.f107077jyumaefscl |= Integer.MIN_VALUE;
                return lqeggnwhkg.this.emit(null, this);
            }
        }

        lqeggnwhkg(kotlin.jvm.internal.hcddaimhww hcddaimhwwVar, int i13, sj.nufgyqmvbu nufgyqmvbuVar, Object obj) {
            this.f107076zdlpuopuiu = hcddaimhwwVar;
            this.f107075yggfygwlhe = i13;
            this.f107074jyumaefscl = nufgyqmvbuVar;
            this.f107073iwizpuwonk = obj;
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        @Override // sj.nufgyqmvbu
        public final Object emit(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
            iobyxmoadg iobyxmoadgVar;
            if (gxszxtbevoVar instanceof iobyxmoadg) {
                iobyxmoadgVar = (iobyxmoadg) gxszxtbevoVar;
                int i13 = iobyxmoadgVar.f107077jyumaefscl;
                if ((i13 & Integer.MIN_VALUE) != 0) {
                    iobyxmoadgVar.f107077jyumaefscl = i13 - Integer.MIN_VALUE;
                } else {
                    iobyxmoadgVar = new iobyxmoadg(gxszxtbevoVar);
                }
            } else {
                iobyxmoadgVar = new iobyxmoadg(gxszxtbevoVar);
            }
            Object obj2 = iobyxmoadgVar.f107079zdlpuopuiu;
            Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
            int i14 = iobyxmoadgVar.f107077jyumaefscl;
            if (i14 != 0) {
                if (i14 == 1) {
                    gg.zdlpuopuiu.zoijcleaow(obj2);
                    return gg.wwaezpbzkn.f37140iobyxmoadg;
                }
                if (i14 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                gg.zdlpuopuiu.zoijcleaow(obj2);
                return gg.wwaezpbzkn.f37140iobyxmoadg;
            }
            gg.zdlpuopuiu.zoijcleaow(obj2);
            kotlin.jvm.internal.hcddaimhww hcddaimhwwVar = this.f107076zdlpuopuiu;
            int i15 = hcddaimhwwVar.f60014zdlpuopuiu + 1;
            hcddaimhwwVar.f60014zdlpuopuiu = i15;
            if (i15 < this.f107075yggfygwlhe) {
                sj.nufgyqmvbu nufgyqmvbuVar = this.f107074jyumaefscl;
                iobyxmoadgVar.f107077jyumaefscl = 1;
                if (nufgyqmvbuVar.emit(obj, iobyxmoadgVar) == objGxszxtbevo) {
                    return objGxszxtbevo;
                }
                return gg.wwaezpbzkn.f37140iobyxmoadg;
            }
            sj.nufgyqmvbu nufgyqmvbuVar2 = this.f107074jyumaefscl;
            Object obj3 = this.f107073iwizpuwonk;
            iobyxmoadgVar.f107077jyumaefscl = 2;
            if (yggfygwlhe.wkgbmnqykc(nufgyqmvbuVar2, obj, obj3, iobyxmoadgVar) == objGxszxtbevo) {
                return objGxszxtbevo;
            }
            return gg.wwaezpbzkn.f37140iobyxmoadg;
        }
    }

    public static final class nufgyqmvbu implements sj.lqeggnwhkg {

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        final /* synthetic */ tg.rgvfuqvkyq f107080yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final /* synthetic */ sj.lqeggnwhkg f107081zdlpuopuiu;

        public static final class iobyxmoadg extends kotlin.coroutines.jvm.internal.wkgbmnqykc {

            /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
            Object f107082iwizpuwonk;

            /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
            int f107084yggfygwlhe;

            /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
            /* synthetic */ Object f107085zdlpuopuiu;

            public iobyxmoadg(lg.gxszxtbevo gxszxtbevoVar) {
                super(gxszxtbevoVar);
            }

            @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
            public final Object invokeSuspend(Object obj) {
                this.f107085zdlpuopuiu = obj;
                this.f107084yggfygwlhe |= Integer.MIN_VALUE;
                return nufgyqmvbu.this.collect(null, this);
            }
        }

        public nufgyqmvbu(sj.lqeggnwhkg lqeggnwhkgVar, tg.rgvfuqvkyq rgvfuqvkyqVar) {
            this.f107081zdlpuopuiu = lqeggnwhkgVar;
            this.f107080yggfygwlhe = rgvfuqvkyqVar;
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        @Override // sj.lqeggnwhkg
        public Object collect(sj.nufgyqmvbu nufgyqmvbuVar, lg.gxszxtbevo gxszxtbevoVar) {
            iobyxmoadg iobyxmoadgVar;
            dxjokdxxww dxjokdxxwwVar;
            if (gxszxtbevoVar instanceof iobyxmoadg) {
                iobyxmoadgVar = (iobyxmoadg) gxszxtbevoVar;
                int i13 = iobyxmoadgVar.f107084yggfygwlhe;
                if ((i13 & Integer.MIN_VALUE) != 0) {
                    iobyxmoadgVar.f107084yggfygwlhe = i13 - Integer.MIN_VALUE;
                } else {
                    iobyxmoadgVar = new iobyxmoadg(gxszxtbevoVar);
                }
            } else {
                iobyxmoadgVar = new iobyxmoadg(gxszxtbevoVar);
            }
            Object obj = iobyxmoadgVar.f107085zdlpuopuiu;
            Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
            int i14 = iobyxmoadgVar.f107084yggfygwlhe;
            if (i14 == 0) {
                gg.zdlpuopuiu.zoijcleaow(obj);
                sj.lqeggnwhkg lqeggnwhkgVar = this.f107081zdlpuopuiu;
                dxjokdxxww dxjokdxxwwVar2 = new dxjokdxxww(this.f107080yggfygwlhe, nufgyqmvbuVar);
                try {
                    iobyxmoadgVar.f107082iwizpuwonk = dxjokdxxwwVar2;
                    iobyxmoadgVar.f107084yggfygwlhe = 1;
                    if (lqeggnwhkgVar.collect(dxjokdxxwwVar2, iobyxmoadgVar) == objGxszxtbevo) {
                        return objGxszxtbevo;
                    }
                } catch (AbortFlowException e13) {
                    e = e13;
                    dxjokdxxwwVar = dxjokdxxwwVar2;
                    tj.ojitshcjhn.iobyxmoadg(e, dxjokdxxwwVar);
                }
            } else {
                if (i14 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                dxjokdxxwwVar = (dxjokdxxww) iobyxmoadgVar.f107082iwizpuwonk;
                try {
                    gg.zdlpuopuiu.zoijcleaow(obj);
                } catch (AbortFlowException e14) {
                    e = e14;
                    tj.ojitshcjhn.iobyxmoadg(e, dxjokdxxwwVar);
                }
            }
            return gg.wwaezpbzkn.f37140iobyxmoadg;
        }
    }

    public static final class ppxfxbqfkf implements sj.lqeggnwhkg {

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        final /* synthetic */ tg.rgvfuqvkyq f107086yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final /* synthetic */ sj.lqeggnwhkg f107087zdlpuopuiu;

        public ppxfxbqfkf(sj.lqeggnwhkg lqeggnwhkgVar, tg.rgvfuqvkyq rgvfuqvkyqVar) {
            this.f107087zdlpuopuiu = lqeggnwhkgVar;
            this.f107086yggfygwlhe = rgvfuqvkyqVar;
        }

        @Override // sj.lqeggnwhkg
        public Object collect(sj.nufgyqmvbu nufgyqmvbuVar, lg.gxszxtbevo gxszxtbevoVar) {
            Object objCollect = this.f107087zdlpuopuiu.collect(new wkgbmnqykc(new kotlin.jvm.internal.ylkuphrtab(), nufgyqmvbuVar, this.f107086yggfygwlhe), gxszxtbevoVar);
            return objCollect == mg.zoijcleaow.gxszxtbevo() ? objCollect : gg.wwaezpbzkn.f37140iobyxmoadg;
        }
    }

    static final class wkgbmnqykc implements sj.nufgyqmvbu {

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        final /* synthetic */ tg.rgvfuqvkyq f107088jyumaefscl;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        final /* synthetic */ sj.nufgyqmvbu f107089yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final /* synthetic */ kotlin.jvm.internal.ylkuphrtab f107090zdlpuopuiu;

        static final class iobyxmoadg extends kotlin.coroutines.jvm.internal.wkgbmnqykc {

            /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
            int f107091cqumvgiudr;

            /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
            /* synthetic */ Object f107093jyumaefscl;

            /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
            Object f107094yggfygwlhe;

            /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
            Object f107095zdlpuopuiu;

            iobyxmoadg(lg.gxszxtbevo gxszxtbevoVar) {
                super(gxszxtbevoVar);
            }

            @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
            public final Object invokeSuspend(Object obj) {
                this.f107093jyumaefscl = obj;
                this.f107091cqumvgiudr |= Integer.MIN_VALUE;
                return wkgbmnqykc.this.emit(null, this);
            }
        }

        wkgbmnqykc(kotlin.jvm.internal.ylkuphrtab ylkuphrtabVar, sj.nufgyqmvbu nufgyqmvbuVar, tg.rgvfuqvkyq rgvfuqvkyqVar) {
            this.f107090zdlpuopuiu = ylkuphrtabVar;
            this.f107089yggfygwlhe = nufgyqmvbuVar;
            this.f107088jyumaefscl = rgvfuqvkyqVar;
        }

        /* JADX WARN: Code duplicated, block: B:31:0x0074  */
        /* JADX WARN: Code duplicated, block: B:33:0x0087 A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:36:0x008b  */
        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        @Override // sj.nufgyqmvbu
        public final Object emit(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
            iobyxmoadg iobyxmoadgVar;
            wkgbmnqykc wkgbmnqykcVar;
            sj.nufgyqmvbu nufgyqmvbuVar;
            if (gxszxtbevoVar instanceof iobyxmoadg) {
                iobyxmoadgVar = (iobyxmoadg) gxszxtbevoVar;
                int i13 = iobyxmoadgVar.f107091cqumvgiudr;
                if ((i13 & Integer.MIN_VALUE) != 0) {
                    iobyxmoadgVar.f107091cqumvgiudr = i13 - Integer.MIN_VALUE;
                } else {
                    iobyxmoadgVar = new iobyxmoadg(gxszxtbevoVar);
                }
            } else {
                iobyxmoadgVar = new iobyxmoadg(gxszxtbevoVar);
            }
            Object objInvoke = iobyxmoadgVar.f107093jyumaefscl;
            Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
            int i14 = iobyxmoadgVar.f107091cqumvgiudr;
            if (i14 == 0) {
                gg.zdlpuopuiu.zoijcleaow(objInvoke);
                if (this.f107090zdlpuopuiu.f60038zdlpuopuiu) {
                    sj.nufgyqmvbu nufgyqmvbuVar2 = this.f107089yggfygwlhe;
                    iobyxmoadgVar.f107091cqumvgiudr = 1;
                    if (nufgyqmvbuVar2.emit(obj, iobyxmoadgVar) == objGxszxtbevo) {
                        return objGxszxtbevo;
                    }
                    return gg.wwaezpbzkn.f37140iobyxmoadg;
                }
                tg.rgvfuqvkyq rgvfuqvkyqVar = this.f107088jyumaefscl;
                iobyxmoadgVar.f107095zdlpuopuiu = this;
                iobyxmoadgVar.f107094yggfygwlhe = obj;
                iobyxmoadgVar.f107091cqumvgiudr = 2;
                objInvoke = rgvfuqvkyqVar.invoke(obj, iobyxmoadgVar);
                if (objInvoke == objGxszxtbevo) {
                    return objGxszxtbevo;
                }
                wkgbmnqykcVar = this;
                if (!((Boolean) objInvoke).booleanValue()) {
                    return gg.wwaezpbzkn.f37140iobyxmoadg;
                }
                wkgbmnqykcVar.f107090zdlpuopuiu.f60038zdlpuopuiu = true;
                nufgyqmvbuVar = wkgbmnqykcVar.f107089yggfygwlhe;
                iobyxmoadgVar.f107095zdlpuopuiu = null;
                iobyxmoadgVar.f107094yggfygwlhe = null;
                iobyxmoadgVar.f107091cqumvgiudr = 3;
                if (nufgyqmvbuVar.emit(obj, iobyxmoadgVar) == objGxszxtbevo) {
                    return objGxszxtbevo;
                }
            } else {
                if (i14 == 1) {
                    gg.zdlpuopuiu.zoijcleaow(objInvoke);
                    return gg.wwaezpbzkn.f37140iobyxmoadg;
                }
                if (i14 == 2) {
                    obj = iobyxmoadgVar.f107094yggfygwlhe;
                    wkgbmnqykcVar = (wkgbmnqykc) iobyxmoadgVar.f107095zdlpuopuiu;
                    gg.zdlpuopuiu.zoijcleaow(objInvoke);
                    if (!((Boolean) objInvoke).booleanValue()) {
                        return gg.wwaezpbzkn.f37140iobyxmoadg;
                    }
                    wkgbmnqykcVar.f107090zdlpuopuiu.f60038zdlpuopuiu = true;
                    nufgyqmvbuVar = wkgbmnqykcVar.f107089yggfygwlhe;
                    iobyxmoadgVar.f107095zdlpuopuiu = null;
                    iobyxmoadgVar.f107094yggfygwlhe = null;
                    iobyxmoadgVar.f107091cqumvgiudr = 3;
                    if (nufgyqmvbuVar.emit(obj, iobyxmoadgVar) == objGxszxtbevo) {
                        return objGxszxtbevo;
                    }
                } else {
                    if (i14 != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    gg.zdlpuopuiu.zoijcleaow(objInvoke);
                }
            }
            return gg.wwaezpbzkn.f37140iobyxmoadg;
        }
    }

    static final class zoijcleaow implements sj.nufgyqmvbu {

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        final /* synthetic */ sj.nufgyqmvbu f107096jyumaefscl;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        final /* synthetic */ int f107097yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final /* synthetic */ kotlin.jvm.internal.hcddaimhww f107098zdlpuopuiu;

        static final class iobyxmoadg extends kotlin.coroutines.jvm.internal.wkgbmnqykc {

            /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
            int f107099jyumaefscl;

            /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
            /* synthetic */ Object f107101zdlpuopuiu;

            iobyxmoadg(lg.gxszxtbevo gxszxtbevoVar) {
                super(gxszxtbevoVar);
            }

            @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
            public final Object invokeSuspend(Object obj) {
                this.f107101zdlpuopuiu = obj;
                this.f107099jyumaefscl |= Integer.MIN_VALUE;
                return zoijcleaow.this.emit(null, this);
            }
        }

        zoijcleaow(kotlin.jvm.internal.hcddaimhww hcddaimhwwVar, int i13, sj.nufgyqmvbu nufgyqmvbuVar) {
            this.f107098zdlpuopuiu = hcddaimhwwVar;
            this.f107097yggfygwlhe = i13;
            this.f107096jyumaefscl = nufgyqmvbuVar;
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        @Override // sj.nufgyqmvbu
        public final Object emit(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
            iobyxmoadg iobyxmoadgVar;
            if (gxszxtbevoVar instanceof iobyxmoadg) {
                iobyxmoadgVar = (iobyxmoadg) gxszxtbevoVar;
                int i13 = iobyxmoadgVar.f107099jyumaefscl;
                if ((i13 & Integer.MIN_VALUE) != 0) {
                    iobyxmoadgVar.f107099jyumaefscl = i13 - Integer.MIN_VALUE;
                } else {
                    iobyxmoadgVar = new iobyxmoadg(gxszxtbevoVar);
                }
            } else {
                iobyxmoadgVar = new iobyxmoadg(gxszxtbevoVar);
            }
            Object obj2 = iobyxmoadgVar.f107101zdlpuopuiu;
            Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
            int i14 = iobyxmoadgVar.f107099jyumaefscl;
            if (i14 == 0) {
                gg.zdlpuopuiu.zoijcleaow(obj2);
                kotlin.jvm.internal.hcddaimhww hcddaimhwwVar = this.f107098zdlpuopuiu;
                int i15 = hcddaimhwwVar.f60014zdlpuopuiu;
                if (i15 < this.f107097yggfygwlhe) {
                    hcddaimhwwVar.f60014zdlpuopuiu = i15 + 1;
                    return gg.wwaezpbzkn.f37140iobyxmoadg;
                }
                sj.nufgyqmvbu nufgyqmvbuVar = this.f107096jyumaefscl;
                iobyxmoadgVar.f107099jyumaefscl = 1;
                if (nufgyqmvbuVar.emit(obj, iobyxmoadgVar) == objGxszxtbevo) {
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

    public static final sj.lqeggnwhkg eablkybsjg(sj.lqeggnwhkg lqeggnwhkgVar, int i13) {
        if (i13 > 0) {
            return new gxszxtbevo(lqeggnwhkgVar, i13);
        }
        throw new IllegalArgumentException(("Requested element count " + i13 + " should be positive").toString());
    }

    public static final sj.lqeggnwhkg gxszxtbevo(sj.lqeggnwhkg lqeggnwhkgVar, tg.rgvfuqvkyq rgvfuqvkyqVar) {
        return new nufgyqmvbu(lqeggnwhkgVar, rgvfuqvkyqVar);
    }

    public static final sj.lqeggnwhkg ppxfxbqfkf(sj.lqeggnwhkg lqeggnwhkgVar, tg.rgvfuqvkyq rgvfuqvkyqVar) {
        return new ppxfxbqfkf(lqeggnwhkgVar, rgvfuqvkyqVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Object wkgbmnqykc(sj.nufgyqmvbu nufgyqmvbuVar, Object obj, Object obj2, lg.gxszxtbevo gxszxtbevoVar) {
        eablkybsjg eablkybsjgVar;
        if (gxszxtbevoVar instanceof eablkybsjg) {
            eablkybsjgVar = (eablkybsjg) gxszxtbevoVar;
            int i13 = eablkybsjgVar.f107062jyumaefscl;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                eablkybsjgVar.f107062jyumaefscl = i13 - Integer.MIN_VALUE;
            } else {
                eablkybsjgVar = new eablkybsjg(gxszxtbevoVar);
            }
        } else {
            eablkybsjgVar = new eablkybsjg(gxszxtbevoVar);
        }
        Object obj3 = eablkybsjgVar.f107063yggfygwlhe;
        Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
        int i14 = eablkybsjgVar.f107062jyumaefscl;
        if (i14 == 0) {
            gg.zdlpuopuiu.zoijcleaow(obj3);
            eablkybsjgVar.f107064zdlpuopuiu = obj2;
            eablkybsjgVar.f107062jyumaefscl = 1;
            if (nufgyqmvbuVar.emit(obj, eablkybsjgVar) == objGxszxtbevo) {
                return objGxszxtbevo;
            }
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            obj2 = eablkybsjgVar.f107064zdlpuopuiu;
            gg.zdlpuopuiu.zoijcleaow(obj3);
        }
        throw new AbortFlowException(obj2);
    }

    public static final sj.lqeggnwhkg zoijcleaow(sj.lqeggnwhkg lqeggnwhkgVar, int i13) {
        if (i13 >= 0) {
            return new iobyxmoadg(lqeggnwhkgVar, i13);
        }
        throw new IllegalArgumentException(("Drop count should be non-negative, but had " + i13).toString());
    }
}
