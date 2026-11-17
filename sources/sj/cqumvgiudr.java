package sj;

import kotlin.NoWhenBranchMatchedException;
import pj.auzgnhcxok;

/* JADX INFO: loaded from: classes3.dex */
abstract /* synthetic */ class cqumvgiudr {

    static final class iobyxmoadg extends kotlin.coroutines.jvm.internal.draadjrbmk implements tg.rgvfuqvkyq {

        /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
        final /* synthetic */ Object f106824cqumvgiudr;

        /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
        final /* synthetic */ pmvmpeiblj f106825iwizpuwonk;

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        final /* synthetic */ lqeggnwhkg f106826jyumaefscl;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        final /* synthetic */ jpowsppfya f106827yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        int f106828zdlpuopuiu;

        /* JADX INFO: renamed from: sj.cqumvgiudr$iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
        static final class C2615iobyxmoadg extends kotlin.coroutines.jvm.internal.draadjrbmk implements tg.rgvfuqvkyq {

            /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
            /* synthetic */ int f106829yggfygwlhe;

            /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
            int f106830zdlpuopuiu;

            C2615iobyxmoadg(lg.gxszxtbevo gxszxtbevoVar) {
                super(2, gxszxtbevoVar);
            }

            @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
            public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
                C2615iobyxmoadg c2615iobyxmoadg = new C2615iobyxmoadg(gxszxtbevoVar);
                c2615iobyxmoadg.f106829yggfygwlhe = ((Number) obj).intValue();
                return c2615iobyxmoadg;
            }

            @Override // tg.rgvfuqvkyq
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                return ojitshcjhn(((Number) obj).intValue(), (lg.gxszxtbevo) obj2);
            }

            @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
            public final Object invokeSuspend(Object obj) {
                mg.zoijcleaow.gxszxtbevo();
                if (this.f106830zdlpuopuiu != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                gg.zdlpuopuiu.zoijcleaow(obj);
                return kotlin.coroutines.jvm.internal.zoijcleaow.iobyxmoadg(this.f106829yggfygwlhe > 0);
            }

            public final Object ojitshcjhn(int i13, lg.gxszxtbevo gxszxtbevoVar) {
                return ((C2615iobyxmoadg) create(Integer.valueOf(i13), gxszxtbevoVar)).invokeSuspend(gg.wwaezpbzkn.f37140iobyxmoadg);
            }
        }

        static final class zoijcleaow extends kotlin.coroutines.jvm.internal.draadjrbmk implements tg.rgvfuqvkyq {

            /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
            final /* synthetic */ Object f106831cqumvgiudr;

            /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
            final /* synthetic */ pmvmpeiblj f106832iwizpuwonk;

            /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
            final /* synthetic */ lqeggnwhkg f106833jyumaefscl;

            /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
            /* synthetic */ Object f106834yggfygwlhe;

            /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
            int f106835zdlpuopuiu;

            /* JADX INFO: renamed from: sj.cqumvgiudr$iobyxmoadg$zoijcleaow$iobyxmoadg, reason: collision with other inner class name */
            public /* synthetic */ class C2616iobyxmoadg {

                /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
                public static final /* synthetic */ int[] f106836iobyxmoadg;

                static {
                    int[] iArr = new int[pkzmftpjix.values().length];
                    try {
                        iArr[pkzmftpjix.START.ordinal()] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    try {
                        iArr[pkzmftpjix.STOP.ordinal()] = 2;
                    } catch (NoSuchFieldError unused2) {
                    }
                    try {
                        iArr[pkzmftpjix.STOP_AND_RESET_REPLAY_CACHE.ordinal()] = 3;
                    } catch (NoSuchFieldError unused3) {
                    }
                    f106836iobyxmoadg = iArr;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            zoijcleaow(lqeggnwhkg lqeggnwhkgVar, pmvmpeiblj pmvmpeibljVar, Object obj, lg.gxszxtbevo gxszxtbevoVar) {
                super(2, gxszxtbevoVar);
                this.f106833jyumaefscl = lqeggnwhkgVar;
                this.f106832iwizpuwonk = pmvmpeibljVar;
                this.f106831cqumvgiudr = obj;
            }

            @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
            public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
                zoijcleaow zoijcleaowVar = new zoijcleaow(this.f106833jyumaefscl, this.f106832iwizpuwonk, this.f106831cqumvgiudr, gxszxtbevoVar);
                zoijcleaowVar.f106834yggfygwlhe = obj;
                return zoijcleaowVar;
            }

            @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
            public final Object invokeSuspend(Object obj) {
                Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
                int i13 = this.f106835zdlpuopuiu;
                if (i13 == 0) {
                    gg.zdlpuopuiu.zoijcleaow(obj);
                    int i14 = C2616iobyxmoadg.f106836iobyxmoadg[((pkzmftpjix) this.f106834yggfygwlhe).ordinal()];
                    if (i14 == 1) {
                        lqeggnwhkg lqeggnwhkgVar = this.f106833jyumaefscl;
                        pmvmpeiblj pmvmpeibljVar = this.f106832iwizpuwonk;
                        this.f106835zdlpuopuiu = 1;
                        if (lqeggnwhkgVar.collect(pmvmpeibljVar, this) == objGxszxtbevo) {
                            return objGxszxtbevo;
                        }
                    } else if (i14 != 2) {
                        if (i14 != 3) {
                            throw new NoWhenBranchMatchedException();
                        }
                        Object obj2 = this.f106831cqumvgiudr;
                        if (obj2 == wwaezpbzkn.f107053iobyxmoadg) {
                            this.f106832iwizpuwonk.btonecajqb();
                        } else {
                            kotlin.coroutines.jvm.internal.zoijcleaow.iobyxmoadg(this.f106832iwizpuwonk.iobyxmoadg(obj2));
                        }
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
            public final Object invoke(pkzmftpjix pkzmftpjixVar, lg.gxszxtbevo gxszxtbevoVar) {
                return ((zoijcleaow) create(pkzmftpjixVar, gxszxtbevoVar)).invokeSuspend(gg.wwaezpbzkn.f37140iobyxmoadg);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        iobyxmoadg(jpowsppfya jpowsppfyaVar, lqeggnwhkg lqeggnwhkgVar, pmvmpeiblj pmvmpeibljVar, Object obj, lg.gxszxtbevo gxszxtbevoVar) {
            super(2, gxszxtbevoVar);
            this.f106827yggfygwlhe = jpowsppfyaVar;
            this.f106826jyumaefscl = lqeggnwhkgVar;
            this.f106825iwizpuwonk = pmvmpeibljVar;
            this.f106824cqumvgiudr = obj;
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
            return new iobyxmoadg(this.f106827yggfygwlhe, this.f106826jyumaefscl, this.f106825iwizpuwonk, this.f106824cqumvgiudr, gxszxtbevoVar);
        }

        /* JADX WARN: Code duplicated, block: B:25:0x0068 A[RETURN] */
        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            lqeggnwhkg lqeggnwhkgVar;
            pmvmpeiblj pmvmpeibljVar;
            Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
            int i13 = this.f106828zdlpuopuiu;
            if (i13 != 0) {
                if (i13 != 1) {
                    if (i13 == 2) {
                        gg.zdlpuopuiu.zoijcleaow(obj);
                        lqeggnwhkgVar = this.f106826jyumaefscl;
                        pmvmpeibljVar = this.f106825iwizpuwonk;
                        this.f106828zdlpuopuiu = 3;
                        if (lqeggnwhkgVar.collect(pmvmpeibljVar, this) == objGxszxtbevo) {
                            return objGxszxtbevo;
                        }
                    } else if (i13 != 3 && i13 != 4) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                }
                gg.zdlpuopuiu.zoijcleaow(obj);
            } else {
                gg.zdlpuopuiu.zoijcleaow(obj);
                jpowsppfya jpowsppfyaVar = this.f106827yggfygwlhe;
                jpowsppfya.iobyxmoadg iobyxmoadgVar = jpowsppfya.f106926iobyxmoadg;
                if (jpowsppfyaVar == iobyxmoadgVar.ppxfxbqfkf()) {
                    lqeggnwhkg lqeggnwhkgVar2 = this.f106826jyumaefscl;
                    pmvmpeiblj pmvmpeibljVar2 = this.f106825iwizpuwonk;
                    this.f106828zdlpuopuiu = 1;
                    if (lqeggnwhkgVar2.collect(pmvmpeibljVar2, this) == objGxszxtbevo) {
                        return objGxszxtbevo;
                    }
                } else if (this.f106827yggfygwlhe == iobyxmoadgVar.wkgbmnqykc()) {
                    wypolnanlu wypolnanluVarLqeggnwhkg = this.f106825iwizpuwonk.lqeggnwhkg();
                    C2615iobyxmoadg c2615iobyxmoadg = new C2615iobyxmoadg(null);
                    this.f106828zdlpuopuiu = 2;
                    if (dxjokdxxww.zynmafqrjb(wypolnanluVarLqeggnwhkg, c2615iobyxmoadg, this) == objGxszxtbevo) {
                        return objGxszxtbevo;
                    }
                    lqeggnwhkgVar = this.f106826jyumaefscl;
                    pmvmpeibljVar = this.f106825iwizpuwonk;
                    this.f106828zdlpuopuiu = 3;
                    if (lqeggnwhkgVar.collect(pmvmpeibljVar, this) == objGxszxtbevo) {
                        return objGxszxtbevo;
                    }
                } else {
                    lqeggnwhkg lqeggnwhkgVarVdvldrhtss = dxjokdxxww.vdvldrhtss(this.f106827yggfygwlhe.iobyxmoadg(this.f106825iwizpuwonk.lqeggnwhkg()));
                    zoijcleaow zoijcleaowVar = new zoijcleaow(this.f106826jyumaefscl, this.f106825iwizpuwonk, this.f106824cqumvgiudr, null);
                    this.f106828zdlpuopuiu = 4;
                    if (dxjokdxxww.btonecajqb(lqeggnwhkgVarVdvldrhtss, zoijcleaowVar, this) == objGxszxtbevo) {
                        return objGxszxtbevo;
                    }
                }
            }
            return gg.wwaezpbzkn.f37140iobyxmoadg;
        }

        @Override // tg.rgvfuqvkyq
        public final Object invoke(pj.cllcsxoeiz cllcsxoeizVar, lg.gxszxtbevo gxszxtbevoVar) {
            return ((iobyxmoadg) create(cllcsxoeizVar, gxszxtbevoVar)).invokeSuspend(gg.wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    public static final wypolnanlu eablkybsjg(lqeggnwhkg lqeggnwhkgVar, pj.cllcsxoeiz cllcsxoeizVar, jpowsppfya jpowsppfyaVar, Object obj) {
        hcddaimhww hcddaimhwwVarPpxfxbqfkf = ppxfxbqfkf(lqeggnwhkgVar, 1);
        zynmafqrjb zynmafqrjbVarIobyxmoadg = kegysxyocb.iobyxmoadg(obj);
        return new cdpycssgdh(zynmafqrjbVarIobyxmoadg, wkgbmnqykc(cllcsxoeizVar, hcddaimhwwVarPpxfxbqfkf.f106896wkgbmnqykc, hcddaimhwwVarPpxfxbqfkf.f106894iobyxmoadg, zynmafqrjbVarIobyxmoadg, jpowsppfyaVar, obj));
    }

    public static final iozdgvuglv iobyxmoadg(pmvmpeiblj pmvmpeibljVar) {
        return new istkbnxepw(pmvmpeibljVar, null);
    }

    /* JADX WARN: Code duplicated, block: B:15:0x002f  */
    private static final hcddaimhww ppxfxbqfkf(lqeggnwhkg lqeggnwhkgVar, int i13) {
        tj.wkgbmnqykc wkgbmnqykcVar;
        lqeggnwhkg lqeggnwhkgVarNufgyqmvbu;
        int iGxszxtbevo = zg.gtknphoqwx.gxszxtbevo(i13, rj.lqeggnwhkg.f82908draadjrbmk.iobyxmoadg()) - i13;
        if (!(lqeggnwhkgVar instanceof tj.wkgbmnqykc) || (lqeggnwhkgVarNufgyqmvbu = (wkgbmnqykcVar = (tj.wkgbmnqykc) lqeggnwhkgVar).nufgyqmvbu()) == null) {
            return new hcddaimhww(lqeggnwhkgVar, iGxszxtbevo, rj.iobyxmoadg.SUSPEND, lg.gtknphoqwx.f62507zdlpuopuiu);
        }
        int i14 = wkgbmnqykcVar.f110703yggfygwlhe;
        if (i14 != -3 && i14 != -2 && i14 != 0) {
            iGxszxtbevo = i14;
        } else if (wkgbmnqykcVar.f110702jyumaefscl == rj.iobyxmoadg.SUSPEND) {
            if (i14 == 0) {
                iGxszxtbevo = 0;
            }
        } else if (i13 == 0) {
            iGxszxtbevo = 1;
        } else {
            iGxszxtbevo = 0;
        }
        return new hcddaimhww(lqeggnwhkgVarNufgyqmvbu, iGxszxtbevo, wkgbmnqykcVar.f110702jyumaefscl, wkgbmnqykcVar.f110704zdlpuopuiu);
    }

    private static final auzgnhcxok wkgbmnqykc(pj.cllcsxoeiz cllcsxoeizVar, lg.btonecajqb btonecajqbVar, lqeggnwhkg lqeggnwhkgVar, pmvmpeiblj pmvmpeibljVar, jpowsppfya jpowsppfyaVar, Object obj) {
        return pj.dxjokdxxww.ppxfxbqfkf(cllcsxoeizVar, btonecajqbVar, kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(jpowsppfyaVar, jpowsppfya.f106926iobyxmoadg.ppxfxbqfkf()) ? pj.wypolnanlu.DEFAULT : pj.wypolnanlu.UNDISPATCHED, new iobyxmoadg(jpowsppfyaVar, lqeggnwhkgVar, pmvmpeibljVar, obj, null));
    }

    public static final wypolnanlu zoijcleaow(zynmafqrjb zynmafqrjbVar) {
        return new cdpycssgdh(zynmafqrjbVar, null);
    }
}
