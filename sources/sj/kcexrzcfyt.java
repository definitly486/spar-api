package sj;

/* JADX INFO: loaded from: classes3.dex */
abstract /* synthetic */ class kcexrzcfyt {

    static final class iobyxmoadg extends kotlin.coroutines.jvm.internal.wkgbmnqykc {

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        int f106948jyumaefscl;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        /* synthetic */ Object f106949yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        Object f106950zdlpuopuiu;

        iobyxmoadg(lg.gxszxtbevo gxszxtbevoVar) {
            super(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            this.f106949yggfygwlhe = obj;
            this.f106948jyumaefscl |= Integer.MIN_VALUE;
            return kcexrzcfyt.ppxfxbqfkf(null, null, null, this);
        }
    }

    public static final class ppxfxbqfkf implements lqeggnwhkg {

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        final /* synthetic */ lqeggnwhkg f106951yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final /* synthetic */ tg.rgvfuqvkyq f106952zdlpuopuiu;

        public static final class iobyxmoadg extends kotlin.coroutines.jvm.internal.wkgbmnqykc {

            /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
            Object f106953cqumvgiudr;

            /* JADX INFO: renamed from: esjtqupxsv, reason: collision with root package name */
            Object f106954esjtqupxsv;

            /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
            Object f106955iwizpuwonk;

            /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
            int f106957yggfygwlhe;

            /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
            /* synthetic */ Object f106958zdlpuopuiu;

            public iobyxmoadg(lg.gxszxtbevo gxszxtbevoVar) {
                super(gxszxtbevoVar);
            }

            @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
            public final Object invokeSuspend(Object obj) {
                this.f106958zdlpuopuiu = obj;
                this.f106957yggfygwlhe |= Integer.MIN_VALUE;
                return ppxfxbqfkf.this.collect(null, this);
            }
        }

        public ppxfxbqfkf(tg.rgvfuqvkyq rgvfuqvkyqVar, lqeggnwhkg lqeggnwhkgVar) {
            this.f106952zdlpuopuiu = rgvfuqvkyqVar;
            this.f106951yggfygwlhe = lqeggnwhkgVar;
        }

        /* JADX WARN: Code duplicated, block: B:27:0x0082 A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        @Override // sj.lqeggnwhkg
        public Object collect(nufgyqmvbu nufgyqmvbuVar, lg.gxszxtbevo gxszxtbevoVar) throws Throwable {
            iobyxmoadg iobyxmoadgVar;
            Throwable th2;
            tj.yggfygwlhe yggfygwlheVar;
            ppxfxbqfkf ppxfxbqfkfVar;
            nufgyqmvbu nufgyqmvbuVar2;
            lqeggnwhkg lqeggnwhkgVar;
            if (gxszxtbevoVar instanceof iobyxmoadg) {
                iobyxmoadgVar = (iobyxmoadg) gxszxtbevoVar;
                int i13 = iobyxmoadgVar.f106957yggfygwlhe;
                if ((i13 & Integer.MIN_VALUE) != 0) {
                    iobyxmoadgVar.f106957yggfygwlhe = i13 - Integer.MIN_VALUE;
                } else {
                    iobyxmoadgVar = new iobyxmoadg(gxszxtbevoVar);
                }
            } else {
                iobyxmoadgVar = new iobyxmoadg(gxszxtbevoVar);
            }
            Object obj = iobyxmoadgVar.f106958zdlpuopuiu;
            Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
            int i14 = iobyxmoadgVar.f106957yggfygwlhe;
            if (i14 == 0) {
                gg.zdlpuopuiu.zoijcleaow(obj);
                tj.yggfygwlhe yggfygwlheVar2 = new tj.yggfygwlhe(nufgyqmvbuVar, iobyxmoadgVar.getContext());
                try {
                    tg.rgvfuqvkyq rgvfuqvkyqVar = this.f106952zdlpuopuiu;
                    iobyxmoadgVar.f106955iwizpuwonk = this;
                    iobyxmoadgVar.f106953cqumvgiudr = nufgyqmvbuVar;
                    iobyxmoadgVar.f106954esjtqupxsv = yggfygwlheVar2;
                    iobyxmoadgVar.f106957yggfygwlhe = 1;
                    kotlin.jvm.internal.oxmwwwfdhm.ppxfxbqfkf(6);
                    Object objInvoke = rgvfuqvkyqVar.invoke(yggfygwlheVar2, iobyxmoadgVar);
                    kotlin.jvm.internal.oxmwwwfdhm.ppxfxbqfkf(7);
                    if (objInvoke == objGxszxtbevo) {
                        return objGxszxtbevo;
                    }
                    ppxfxbqfkfVar = this;
                    nufgyqmvbuVar2 = nufgyqmvbuVar;
                    yggfygwlheVar = yggfygwlheVar2;
                    yggfygwlheVar.releaseIntercepted();
                    lqeggnwhkgVar = ppxfxbqfkfVar.f106951yggfygwlhe;
                    iobyxmoadgVar.f106955iwizpuwonk = null;
                    iobyxmoadgVar.f106953cqumvgiudr = null;
                    iobyxmoadgVar.f106954esjtqupxsv = null;
                    iobyxmoadgVar.f106957yggfygwlhe = 2;
                    if (lqeggnwhkgVar.collect(nufgyqmvbuVar2, iobyxmoadgVar) == objGxszxtbevo) {
                        return objGxszxtbevo;
                    }
                } catch (Throwable th3) {
                    th2 = th3;
                    yggfygwlheVar = yggfygwlheVar2;
                    yggfygwlheVar.releaseIntercepted();
                    throw th2;
                }
            } else if (i14 == 1) {
                yggfygwlheVar = (tj.yggfygwlhe) iobyxmoadgVar.f106954esjtqupxsv;
                nufgyqmvbuVar2 = (nufgyqmvbu) iobyxmoadgVar.f106953cqumvgiudr;
                ppxfxbqfkfVar = (ppxfxbqfkf) iobyxmoadgVar.f106955iwizpuwonk;
                try {
                    gg.zdlpuopuiu.zoijcleaow(obj);
                    yggfygwlheVar.releaseIntercepted();
                    lqeggnwhkgVar = ppxfxbqfkfVar.f106951yggfygwlhe;
                    iobyxmoadgVar.f106955iwizpuwonk = null;
                    iobyxmoadgVar.f106953cqumvgiudr = null;
                    iobyxmoadgVar.f106954esjtqupxsv = null;
                    iobyxmoadgVar.f106957yggfygwlhe = 2;
                    if (lqeggnwhkgVar.collect(nufgyqmvbuVar2, iobyxmoadgVar) == objGxszxtbevo) {
                        return objGxszxtbevo;
                    }
                } catch (Throwable th4) {
                    th2 = th4;
                    yggfygwlheVar.releaseIntercepted();
                    throw th2;
                }
            } else {
                if (i14 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                gg.zdlpuopuiu.zoijcleaow(obj);
            }
            return gg.wwaezpbzkn.f37140iobyxmoadg;
        }
    }

    public static final class zoijcleaow implements lqeggnwhkg {

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        final /* synthetic */ tg.vdvldrhtss f106959yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final /* synthetic */ lqeggnwhkg f106960zdlpuopuiu;

        public static final class iobyxmoadg extends kotlin.coroutines.jvm.internal.wkgbmnqykc {

            /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
            Object f106961cqumvgiudr;

            /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
            Object f106962iwizpuwonk;

            /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
            int f106964yggfygwlhe;

            /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
            /* synthetic */ Object f106965zdlpuopuiu;

            public iobyxmoadg(lg.gxszxtbevo gxszxtbevoVar) {
                super(gxszxtbevoVar);
            }

            @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
            public final Object invokeSuspend(Object obj) {
                this.f106965zdlpuopuiu = obj;
                this.f106964yggfygwlhe |= Integer.MIN_VALUE;
                return zoijcleaow.this.collect(null, this);
            }
        }

        public zoijcleaow(lqeggnwhkg lqeggnwhkgVar, tg.vdvldrhtss vdvldrhtssVar) {
            this.f106960zdlpuopuiu = lqeggnwhkgVar;
            this.f106959yggfygwlhe = vdvldrhtssVar;
        }

        /* JADX WARN: Code duplicated, block: B:34:0x0086 A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:35:0x0087  */
        /* JADX WARN: Code duplicated, block: B:46:0x00ab A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:56:? A[RETURN, SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        @Override // sj.lqeggnwhkg
        public Object collect(nufgyqmvbu nufgyqmvbuVar, lg.gxszxtbevo gxszxtbevoVar) throws Throwable {
            iobyxmoadg iobyxmoadgVar;
            zoijcleaow zoijcleaowVar;
            mbcevpiqjq mbcevpiqjqVar;
            tg.vdvldrhtss vdvldrhtssVar;
            tj.yggfygwlhe yggfygwlheVar;
            Throwable th2;
            tj.yggfygwlhe yggfygwlheVar2;
            Object objInvoke;
            if (gxszxtbevoVar instanceof iobyxmoadg) {
                iobyxmoadgVar = (iobyxmoadg) gxszxtbevoVar;
                int i13 = iobyxmoadgVar.f106964yggfygwlhe;
                if ((i13 & Integer.MIN_VALUE) != 0) {
                    iobyxmoadgVar.f106964yggfygwlhe = i13 - Integer.MIN_VALUE;
                } else {
                    iobyxmoadgVar = new iobyxmoadg(gxszxtbevoVar);
                }
            } else {
                iobyxmoadgVar = new iobyxmoadg(gxszxtbevoVar);
            }
            Object obj = iobyxmoadgVar.f106965zdlpuopuiu;
            Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
            int i14 = iobyxmoadgVar.f106964yggfygwlhe;
            if (i14 == 0) {
                gg.zdlpuopuiu.zoijcleaow(obj);
                try {
                    lqeggnwhkg lqeggnwhkgVar = this.f106960zdlpuopuiu;
                    iobyxmoadgVar.f106962iwizpuwonk = this;
                    iobyxmoadgVar.f106961cqumvgiudr = nufgyqmvbuVar;
                    iobyxmoadgVar.f106964yggfygwlhe = 1;
                    if (lqeggnwhkgVar.collect(nufgyqmvbuVar, iobyxmoadgVar) == objGxszxtbevo) {
                        return objGxszxtbevo;
                    }
                    zoijcleaowVar = this;
                    yggfygwlheVar = new tj.yggfygwlhe(nufgyqmvbuVar, iobyxmoadgVar.getContext());
                    tg.vdvldrhtss vdvldrhtssVar2 = zoijcleaowVar.f106959yggfygwlhe;
                    iobyxmoadgVar.f106962iwizpuwonk = yggfygwlheVar;
                    iobyxmoadgVar.f106961cqumvgiudr = null;
                    iobyxmoadgVar.f106964yggfygwlhe = 3;
                    kotlin.jvm.internal.oxmwwwfdhm.ppxfxbqfkf(6);
                    objInvoke = vdvldrhtssVar2.invoke(yggfygwlheVar, null, iobyxmoadgVar);
                    kotlin.jvm.internal.oxmwwwfdhm.ppxfxbqfkf(7);
                    if (objInvoke == objGxszxtbevo) {
                        return objGxszxtbevo;
                    }
                    yggfygwlheVar2 = yggfygwlheVar;
                    yggfygwlheVar2.releaseIntercepted();
                    return gg.wwaezpbzkn.f37140iobyxmoadg;
                } catch (Throwable th3) {
                    th = th3;
                    zoijcleaowVar = this;
                    mbcevpiqjqVar = new mbcevpiqjq(th);
                    vdvldrhtssVar = zoijcleaowVar.f106959yggfygwlhe;
                    iobyxmoadgVar.f106962iwizpuwonk = th;
                    iobyxmoadgVar.f106961cqumvgiudr = null;
                    iobyxmoadgVar.f106964yggfygwlhe = 2;
                    if (kcexrzcfyt.ppxfxbqfkf(mbcevpiqjqVar, vdvldrhtssVar, th, iobyxmoadgVar) == objGxszxtbevo) {
                        return objGxszxtbevo;
                    }
                    throw th;
                }
            }
            if (i14 != 1) {
                if (i14 == 2) {
                    Throwable th4 = (Throwable) iobyxmoadgVar.f106962iwizpuwonk;
                    gg.zdlpuopuiu.zoijcleaow(obj);
                    throw th4;
                }
                if (i14 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                yggfygwlheVar2 = (tj.yggfygwlhe) iobyxmoadgVar.f106962iwizpuwonk;
                try {
                    gg.zdlpuopuiu.zoijcleaow(obj);
                    yggfygwlheVar2.releaseIntercepted();
                    return gg.wwaezpbzkn.f37140iobyxmoadg;
                } catch (Throwable th5) {
                    th2 = th5;
                    yggfygwlheVar2.releaseIntercepted();
                    throw th2;
                }
            }
            nufgyqmvbuVar = (nufgyqmvbu) iobyxmoadgVar.f106961cqumvgiudr;
            zoijcleaowVar = (zoijcleaow) iobyxmoadgVar.f106962iwizpuwonk;
            try {
                gg.zdlpuopuiu.zoijcleaow(obj);
                yggfygwlheVar = new tj.yggfygwlhe(nufgyqmvbuVar, iobyxmoadgVar.getContext());
                try {
                    tg.vdvldrhtss vdvldrhtssVar3 = zoijcleaowVar.f106959yggfygwlhe;
                    iobyxmoadgVar.f106962iwizpuwonk = yggfygwlheVar;
                    iobyxmoadgVar.f106961cqumvgiudr = null;
                    iobyxmoadgVar.f106964yggfygwlhe = 3;
                    kotlin.jvm.internal.oxmwwwfdhm.ppxfxbqfkf(6);
                    objInvoke = vdvldrhtssVar3.invoke(yggfygwlheVar, null, iobyxmoadgVar);
                    kotlin.jvm.internal.oxmwwwfdhm.ppxfxbqfkf(7);
                    if (objInvoke == objGxszxtbevo) {
                        return objGxszxtbevo;
                    }
                    yggfygwlheVar2 = yggfygwlheVar;
                    yggfygwlheVar2.releaseIntercepted();
                    return gg.wwaezpbzkn.f37140iobyxmoadg;
                } catch (Throwable th6) {
                    th2 = th6;
                    yggfygwlheVar2 = yggfygwlheVar;
                    yggfygwlheVar2.releaseIntercepted();
                    throw th2;
                }
            } catch (Throwable th7) {
                th = th7;
                mbcevpiqjqVar = new mbcevpiqjq(th);
                vdvldrhtssVar = zoijcleaowVar.f106959yggfygwlhe;
                iobyxmoadgVar.f106962iwizpuwonk = th;
                iobyxmoadgVar.f106961cqumvgiudr = null;
                iobyxmoadgVar.f106964yggfygwlhe = 2;
                if (kcexrzcfyt.ppxfxbqfkf(mbcevpiqjqVar, vdvldrhtssVar, th, iobyxmoadgVar) == objGxszxtbevo) {
                    return objGxszxtbevo;
                }
                throw th;
            }
        }
    }

    public static final lqeggnwhkg eablkybsjg(lqeggnwhkg lqeggnwhkgVar, tg.rgvfuqvkyq rgvfuqvkyqVar) {
        return new ppxfxbqfkf(rgvfuqvkyqVar, lqeggnwhkgVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Object ppxfxbqfkf(nufgyqmvbu nufgyqmvbuVar, tg.vdvldrhtss vdvldrhtssVar, Throwable th2, lg.gxszxtbevo gxszxtbevoVar) {
        iobyxmoadg iobyxmoadgVar;
        if (gxszxtbevoVar instanceof iobyxmoadg) {
            iobyxmoadgVar = (iobyxmoadg) gxszxtbevoVar;
            int i13 = iobyxmoadgVar.f106948jyumaefscl;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                iobyxmoadgVar.f106948jyumaefscl = i13 - Integer.MIN_VALUE;
            } else {
                iobyxmoadgVar = new iobyxmoadg(gxszxtbevoVar);
            }
        } else {
            iobyxmoadgVar = new iobyxmoadg(gxszxtbevoVar);
        }
        Object obj = iobyxmoadgVar.f106949yggfygwlhe;
        Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
        int i14 = iobyxmoadgVar.f106948jyumaefscl;
        try {
            if (i14 == 0) {
                gg.zdlpuopuiu.zoijcleaow(obj);
                iobyxmoadgVar.f106950zdlpuopuiu = th2;
                iobyxmoadgVar.f106948jyumaefscl = 1;
                if (vdvldrhtssVar.invoke(nufgyqmvbuVar, th2, iobyxmoadgVar) == objGxszxtbevo) {
                    return objGxszxtbevo;
                }
            } else {
                if (i14 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                th2 = (Throwable) iobyxmoadgVar.f106950zdlpuopuiu;
                gg.zdlpuopuiu.zoijcleaow(obj);
            }
            return gg.wwaezpbzkn.f37140iobyxmoadg;
        } catch (Throwable th3) {
            if (th2 != null && th2 != th3) {
                gg.lqeggnwhkg.iobyxmoadg(th3, th2);
            }
            throw th3;
        }
    }

    public static final lqeggnwhkg wkgbmnqykc(lqeggnwhkg lqeggnwhkgVar, tg.vdvldrhtss vdvldrhtssVar) {
        return new zoijcleaow(lqeggnwhkgVar, vdvldrhtssVar);
    }

    public static final void zoijcleaow(nufgyqmvbu nufgyqmvbuVar) {
        if (nufgyqmvbuVar instanceof mbcevpiqjq) {
            throw ((mbcevpiqjq) nufgyqmvbuVar).f107008zdlpuopuiu;
        }
    }
}
