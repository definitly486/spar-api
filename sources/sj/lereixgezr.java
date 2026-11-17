package sj;

/* JADX INFO: loaded from: classes3.dex */
abstract /* synthetic */ class lereixgezr {

    static final class eablkybsjg implements tg.iobyxmoadg {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        public static final eablkybsjg f106968zdlpuopuiu = new eablkybsjg();

        eablkybsjg() {
        }

        @Override // tg.iobyxmoadg
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public final Void invoke() {
            return null;
        }
    }

    public static final class iobyxmoadg implements lqeggnwhkg {

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        final /* synthetic */ tg.oxmwwwfdhm f106969yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final /* synthetic */ lqeggnwhkg[] f106970zdlpuopuiu;

        /* JADX INFO: renamed from: sj.lereixgezr$iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
        public static final class C2624iobyxmoadg extends kotlin.coroutines.jvm.internal.draadjrbmk implements tg.vdvldrhtss {

            /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
            final /* synthetic */ tg.oxmwwwfdhm f106971iwizpuwonk;

            /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
            /* synthetic */ Object f106972jyumaefscl;

            /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
            private /* synthetic */ Object f106973yggfygwlhe;

            /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
            int f106974zdlpuopuiu;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C2624iobyxmoadg(lg.gxszxtbevo gxszxtbevoVar, tg.oxmwwwfdhm oxmwwwfdhmVar) {
                super(3, gxszxtbevoVar);
                this.f106971iwizpuwonk = oxmwwwfdhmVar;
            }

            @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
            public final Object invokeSuspend(Object obj) {
                nufgyqmvbu nufgyqmvbuVar;
                Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
                int i13 = this.f106974zdlpuopuiu;
                if (i13 != 0) {
                    if (i13 == 1) {
                        nufgyqmvbuVar = (nufgyqmvbu) this.f106973yggfygwlhe;
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
                nufgyqmvbuVar = (nufgyqmvbu) this.f106973yggfygwlhe;
                Object[] objArr = (Object[]) this.f106972jyumaefscl;
                tg.oxmwwwfdhm oxmwwwfdhmVar = this.f106971iwizpuwonk;
                Object obj2 = objArr[0];
                Object obj3 = objArr[1];
                Object obj4 = objArr[2];
                this.f106973yggfygwlhe = nufgyqmvbuVar;
                this.f106974zdlpuopuiu = 1;
                kotlin.jvm.internal.oxmwwwfdhm.ppxfxbqfkf(6);
                obj = oxmwwwfdhmVar.invoke(obj2, obj3, obj4, this);
                kotlin.jvm.internal.oxmwwwfdhm.ppxfxbqfkf(7);
                if (obj == objGxszxtbevo) {
                    return objGxszxtbevo;
                }
                this.f106973yggfygwlhe = null;
                this.f106974zdlpuopuiu = 2;
                if (nufgyqmvbuVar.emit(obj, this) == objGxszxtbevo) {
                    return objGxszxtbevo;
                }
                return gg.wwaezpbzkn.f37140iobyxmoadg;
            }

            @Override // tg.vdvldrhtss
            /* JADX INFO: renamed from: ojitshcjhn, reason: merged with bridge method [inline-methods] */
            public final Object invoke(nufgyqmvbu nufgyqmvbuVar, Object[] objArr, lg.gxszxtbevo gxszxtbevoVar) {
                C2624iobyxmoadg c2624iobyxmoadg = new C2624iobyxmoadg(gxszxtbevoVar, this.f106971iwizpuwonk);
                c2624iobyxmoadg.f106973yggfygwlhe = nufgyqmvbuVar;
                c2624iobyxmoadg.f106972jyumaefscl = objArr;
                return c2624iobyxmoadg.invokeSuspend(gg.wwaezpbzkn.f37140iobyxmoadg);
            }
        }

        public iobyxmoadg(lqeggnwhkg[] lqeggnwhkgVarArr, tg.oxmwwwfdhm oxmwwwfdhmVar) {
            this.f106970zdlpuopuiu = lqeggnwhkgVarArr;
            this.f106969yggfygwlhe = oxmwwwfdhmVar;
        }

        @Override // sj.lqeggnwhkg
        public Object collect(nufgyqmvbu nufgyqmvbuVar, lg.gxszxtbevo gxszxtbevoVar) {
            Object objIobyxmoadg = tj.gtknphoqwx.iobyxmoadg(nufgyqmvbuVar, this.f106970zdlpuopuiu, lereixgezr.gxszxtbevo(), new C2624iobyxmoadg(null, this.f106969yggfygwlhe), gxszxtbevoVar);
            return objIobyxmoadg == mg.zoijcleaow.gxszxtbevo() ? objIobyxmoadg : gg.wwaezpbzkn.f37140iobyxmoadg;
        }
    }

    public static final class ppxfxbqfkf implements lqeggnwhkg {

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        final /* synthetic */ tg.vdvldrhtss f106975jyumaefscl;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        final /* synthetic */ lqeggnwhkg f106976yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final /* synthetic */ lqeggnwhkg f106977zdlpuopuiu;

        public ppxfxbqfkf(lqeggnwhkg lqeggnwhkgVar, lqeggnwhkg lqeggnwhkgVar2, tg.vdvldrhtss vdvldrhtssVar) {
            this.f106977zdlpuopuiu = lqeggnwhkgVar;
            this.f106976yggfygwlhe = lqeggnwhkgVar2;
            this.f106975jyumaefscl = vdvldrhtssVar;
        }

        @Override // sj.lqeggnwhkg
        public Object collect(nufgyqmvbu nufgyqmvbuVar, lg.gxszxtbevo gxszxtbevoVar) {
            Object objIobyxmoadg = tj.gtknphoqwx.iobyxmoadg(nufgyqmvbuVar, new lqeggnwhkg[]{this.f106977zdlpuopuiu, this.f106976yggfygwlhe}, lereixgezr.gxszxtbevo(), new wkgbmnqykc(this.f106975jyumaefscl, null), gxszxtbevoVar);
            return objIobyxmoadg == mg.zoijcleaow.gxszxtbevo() ? objIobyxmoadg : gg.wwaezpbzkn.f37140iobyxmoadg;
        }
    }

    static final class wkgbmnqykc extends kotlin.coroutines.jvm.internal.draadjrbmk implements tg.vdvldrhtss {

        /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
        final /* synthetic */ tg.vdvldrhtss f106978iwizpuwonk;

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        /* synthetic */ Object f106979jyumaefscl;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        private /* synthetic */ Object f106980yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        int f106981zdlpuopuiu;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        wkgbmnqykc(tg.vdvldrhtss vdvldrhtssVar, lg.gxszxtbevo gxszxtbevoVar) {
            super(3, gxszxtbevoVar);
            this.f106978iwizpuwonk = vdvldrhtssVar;
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            nufgyqmvbu nufgyqmvbuVar;
            Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
            int i13 = this.f106981zdlpuopuiu;
            if (i13 != 0) {
                if (i13 == 1) {
                    nufgyqmvbuVar = (nufgyqmvbu) this.f106980yggfygwlhe;
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
            nufgyqmvbuVar = (nufgyqmvbu) this.f106980yggfygwlhe;
            Object[] objArr = (Object[]) this.f106979jyumaefscl;
            tg.vdvldrhtss vdvldrhtssVar = this.f106978iwizpuwonk;
            Object obj2 = objArr[0];
            Object obj3 = objArr[1];
            this.f106980yggfygwlhe = nufgyqmvbuVar;
            this.f106981zdlpuopuiu = 1;
            obj = vdvldrhtssVar.invoke(obj2, obj3, this);
            if (obj == objGxszxtbevo) {
                return objGxszxtbevo;
            }
            this.f106980yggfygwlhe = null;
            this.f106981zdlpuopuiu = 2;
            if (nufgyqmvbuVar.emit(obj, this) == objGxszxtbevo) {
                return objGxszxtbevo;
            }
            return gg.wwaezpbzkn.f37140iobyxmoadg;
        }

        @Override // tg.vdvldrhtss
        /* JADX INFO: renamed from: ojitshcjhn, reason: merged with bridge method [inline-methods] */
        public final Object invoke(nufgyqmvbu nufgyqmvbuVar, Object[] objArr, lg.gxszxtbevo gxszxtbevoVar) {
            wkgbmnqykc wkgbmnqykcVar = new wkgbmnqykc(this.f106978iwizpuwonk, gxszxtbevoVar);
            wkgbmnqykcVar.f106980yggfygwlhe = nufgyqmvbuVar;
            wkgbmnqykcVar.f106979jyumaefscl = objArr;
            return wkgbmnqykcVar.invokeSuspend(gg.wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    public static final class zoijcleaow implements lqeggnwhkg {

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        final /* synthetic */ tg.kcexrzcfyt f106982yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final /* synthetic */ lqeggnwhkg[] f106983zdlpuopuiu;

        public static final class iobyxmoadg extends kotlin.coroutines.jvm.internal.draadjrbmk implements tg.vdvldrhtss {

            /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
            final /* synthetic */ tg.kcexrzcfyt f106984iwizpuwonk;

            /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
            /* synthetic */ Object f106985jyumaefscl;

            /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
            private /* synthetic */ Object f106986yggfygwlhe;

            /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
            int f106987zdlpuopuiu;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public iobyxmoadg(lg.gxszxtbevo gxszxtbevoVar, tg.kcexrzcfyt kcexrzcfytVar) {
                super(3, gxszxtbevoVar);
                this.f106984iwizpuwonk = kcexrzcfytVar;
            }

            @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
            public final Object invokeSuspend(Object obj) {
                nufgyqmvbu nufgyqmvbuVar;
                Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
                int i13 = this.f106987zdlpuopuiu;
                if (i13 != 0) {
                    if (i13 == 1) {
                        nufgyqmvbuVar = (nufgyqmvbu) this.f106986yggfygwlhe;
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
                nufgyqmvbuVar = (nufgyqmvbu) this.f106986yggfygwlhe;
                Object[] objArr = (Object[]) this.f106985jyumaefscl;
                tg.kcexrzcfyt kcexrzcfytVar = this.f106984iwizpuwonk;
                Object obj2 = objArr[0];
                Object obj3 = objArr[1];
                Object obj4 = objArr[2];
                Object obj5 = objArr[3];
                this.f106986yggfygwlhe = nufgyqmvbuVar;
                this.f106987zdlpuopuiu = 1;
                kotlin.jvm.internal.oxmwwwfdhm.ppxfxbqfkf(6);
                obj = kcexrzcfytVar.invoke(obj2, obj3, obj4, obj5, this);
                kotlin.jvm.internal.oxmwwwfdhm.ppxfxbqfkf(7);
                if (obj == objGxszxtbevo) {
                    return objGxszxtbevo;
                }
                this.f106986yggfygwlhe = null;
                this.f106987zdlpuopuiu = 2;
                if (nufgyqmvbuVar.emit(obj, this) == objGxszxtbevo) {
                    return objGxszxtbevo;
                }
                return gg.wwaezpbzkn.f37140iobyxmoadg;
            }

            @Override // tg.vdvldrhtss
            /* JADX INFO: renamed from: ojitshcjhn, reason: merged with bridge method [inline-methods] */
            public final Object invoke(nufgyqmvbu nufgyqmvbuVar, Object[] objArr, lg.gxszxtbevo gxszxtbevoVar) {
                iobyxmoadg iobyxmoadgVar = new iobyxmoadg(gxszxtbevoVar, this.f106984iwizpuwonk);
                iobyxmoadgVar.f106986yggfygwlhe = nufgyqmvbuVar;
                iobyxmoadgVar.f106985jyumaefscl = objArr;
                return iobyxmoadgVar.invokeSuspend(gg.wwaezpbzkn.f37140iobyxmoadg);
            }
        }

        public zoijcleaow(lqeggnwhkg[] lqeggnwhkgVarArr, tg.kcexrzcfyt kcexrzcfytVar) {
            this.f106983zdlpuopuiu = lqeggnwhkgVarArr;
            this.f106982yggfygwlhe = kcexrzcfytVar;
        }

        @Override // sj.lqeggnwhkg
        public Object collect(nufgyqmvbu nufgyqmvbuVar, lg.gxszxtbevo gxszxtbevoVar) {
            Object objIobyxmoadg = tj.gtknphoqwx.iobyxmoadg(nufgyqmvbuVar, this.f106983zdlpuopuiu, lereixgezr.gxszxtbevo(), new iobyxmoadg(null, this.f106982yggfygwlhe), gxszxtbevoVar);
            return objIobyxmoadg == mg.zoijcleaow.gxszxtbevo() ? objIobyxmoadg : gg.wwaezpbzkn.f37140iobyxmoadg;
        }
    }

    public static final lqeggnwhkg eablkybsjg(lqeggnwhkg lqeggnwhkgVar, lqeggnwhkg lqeggnwhkgVar2, tg.vdvldrhtss vdvldrhtssVar) {
        return new ppxfxbqfkf(lqeggnwhkgVar, lqeggnwhkgVar2, vdvldrhtssVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final tg.iobyxmoadg gxszxtbevo() {
        return eablkybsjg.f106968zdlpuopuiu;
    }

    public static final lqeggnwhkg lqeggnwhkg(lqeggnwhkg lqeggnwhkgVar, lqeggnwhkg lqeggnwhkgVar2, tg.vdvldrhtss vdvldrhtssVar) {
        return tj.gtknphoqwx.zoijcleaow(lqeggnwhkgVar, lqeggnwhkgVar2, vdvldrhtssVar);
    }

    public static final lqeggnwhkg ppxfxbqfkf(lqeggnwhkg lqeggnwhkgVar, lqeggnwhkg lqeggnwhkgVar2, lqeggnwhkg lqeggnwhkgVar3, tg.oxmwwwfdhm oxmwwwfdhmVar) {
        return new iobyxmoadg(new lqeggnwhkg[]{lqeggnwhkgVar, lqeggnwhkgVar2, lqeggnwhkgVar3}, oxmwwwfdhmVar);
    }

    public static final lqeggnwhkg wkgbmnqykc(lqeggnwhkg lqeggnwhkgVar, lqeggnwhkg lqeggnwhkgVar2, tg.vdvldrhtss vdvldrhtssVar) {
        return dxjokdxxww.ylkuphrtab(lqeggnwhkgVar, lqeggnwhkgVar2, vdvldrhtssVar);
    }

    public static final lqeggnwhkg zoijcleaow(lqeggnwhkg lqeggnwhkgVar, lqeggnwhkg lqeggnwhkgVar2, lqeggnwhkg lqeggnwhkgVar3, lqeggnwhkg lqeggnwhkgVar4, tg.kcexrzcfyt kcexrzcfytVar) {
        return new zoijcleaow(new lqeggnwhkg[]{lqeggnwhkgVar, lqeggnwhkgVar2, lqeggnwhkgVar3, lqeggnwhkgVar4}, kcexrzcfytVar);
    }
}
