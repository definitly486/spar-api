package sj;

import kotlin.KotlinNothingValueException;

/* JADX INFO: loaded from: classes3.dex */
final class cllcsxoeiz implements jpowsppfya {

    static final class iobyxmoadg extends kotlin.coroutines.jvm.internal.draadjrbmk implements tg.rgvfuqvkyq {

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        final /* synthetic */ wypolnanlu f106816jyumaefscl;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        private /* synthetic */ Object f106817yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        int f106818zdlpuopuiu;

        /* JADX INFO: renamed from: sj.cllcsxoeiz$iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
        static final class C2613iobyxmoadg implements nufgyqmvbu {

            /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
            final /* synthetic */ nufgyqmvbu f106819yggfygwlhe;

            /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
            final /* synthetic */ kotlin.jvm.internal.ylkuphrtab f106820zdlpuopuiu;

            /* JADX INFO: renamed from: sj.cllcsxoeiz$iobyxmoadg$iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
            static final class C2614iobyxmoadg extends kotlin.coroutines.jvm.internal.wkgbmnqykc {

                /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
                int f106821jyumaefscl;

                /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
                /* synthetic */ Object f106823zdlpuopuiu;

                C2614iobyxmoadg(lg.gxszxtbevo gxszxtbevoVar) {
                    super(gxszxtbevoVar);
                }

                @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
                public final Object invokeSuspend(Object obj) {
                    this.f106823zdlpuopuiu = obj;
                    this.f106821jyumaefscl |= Integer.MIN_VALUE;
                    return C2613iobyxmoadg.this.zoijcleaow(0, this);
                }
            }

            C2613iobyxmoadg(kotlin.jvm.internal.ylkuphrtab ylkuphrtabVar, nufgyqmvbu nufgyqmvbuVar) {
                this.f106820zdlpuopuiu = ylkuphrtabVar;
                this.f106819yggfygwlhe = nufgyqmvbuVar;
            }

            @Override // sj.nufgyqmvbu
            public /* bridge */ /* synthetic */ Object emit(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
                return zoijcleaow(((Number) obj).intValue(), gxszxtbevoVar);
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            public final Object zoijcleaow(int i13, lg.gxszxtbevo gxszxtbevoVar) {
                C2614iobyxmoadg c2614iobyxmoadg;
                if (gxszxtbevoVar instanceof C2614iobyxmoadg) {
                    c2614iobyxmoadg = (C2614iobyxmoadg) gxszxtbevoVar;
                    int i14 = c2614iobyxmoadg.f106821jyumaefscl;
                    if ((i14 & Integer.MIN_VALUE) != 0) {
                        c2614iobyxmoadg.f106821jyumaefscl = i14 - Integer.MIN_VALUE;
                    } else {
                        c2614iobyxmoadg = new C2614iobyxmoadg(gxszxtbevoVar);
                    }
                } else {
                    c2614iobyxmoadg = new C2614iobyxmoadg(gxszxtbevoVar);
                }
                Object obj = c2614iobyxmoadg.f106823zdlpuopuiu;
                Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
                int i15 = c2614iobyxmoadg.f106821jyumaefscl;
                if (i15 == 0) {
                    gg.zdlpuopuiu.zoijcleaow(obj);
                    if (i13 > 0) {
                        kotlin.jvm.internal.ylkuphrtab ylkuphrtabVar = this.f106820zdlpuopuiu;
                        if (!ylkuphrtabVar.f60038zdlpuopuiu) {
                            ylkuphrtabVar.f60038zdlpuopuiu = true;
                            nufgyqmvbu nufgyqmvbuVar = this.f106819yggfygwlhe;
                            pkzmftpjix pkzmftpjixVar = pkzmftpjix.START;
                            c2614iobyxmoadg.f106821jyumaefscl = 1;
                            if (nufgyqmvbuVar.emit(pkzmftpjixVar, c2614iobyxmoadg) == objGxszxtbevo) {
                                return objGxszxtbevo;
                            }
                        }
                    }
                    return gg.wwaezpbzkn.f37140iobyxmoadg;
                }
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                gg.zdlpuopuiu.zoijcleaow(obj);
                return gg.wwaezpbzkn.f37140iobyxmoadg;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        iobyxmoadg(wypolnanlu wypolnanluVar, lg.gxszxtbevo gxszxtbevoVar) {
            super(2, gxszxtbevoVar);
            this.f106816jyumaefscl = wypolnanluVar;
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
            iobyxmoadg iobyxmoadgVar = new iobyxmoadg(this.f106816jyumaefscl, gxszxtbevoVar);
            iobyxmoadgVar.f106817yggfygwlhe = obj;
            return iobyxmoadgVar;
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
            int i13 = this.f106818zdlpuopuiu;
            if (i13 == 0) {
                gg.zdlpuopuiu.zoijcleaow(obj);
                nufgyqmvbu nufgyqmvbuVar = (nufgyqmvbu) this.f106817yggfygwlhe;
                kotlin.jvm.internal.ylkuphrtab ylkuphrtabVar = new kotlin.jvm.internal.ylkuphrtab();
                wypolnanlu wypolnanluVar = this.f106816jyumaefscl;
                C2613iobyxmoadg c2613iobyxmoadg = new C2613iobyxmoadg(ylkuphrtabVar, nufgyqmvbuVar);
                this.f106818zdlpuopuiu = 1;
                if (wypolnanluVar.collect(c2613iobyxmoadg, this) == objGxszxtbevo) {
                    return objGxszxtbevo;
                }
            } else {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                gg.zdlpuopuiu.zoijcleaow(obj);
            }
            throw new KotlinNothingValueException();
        }

        @Override // tg.rgvfuqvkyq
        /* JADX INFO: renamed from: ojitshcjhn, reason: merged with bridge method [inline-methods] */
        public final Object invoke(nufgyqmvbu nufgyqmvbuVar, lg.gxszxtbevo gxszxtbevoVar) {
            return ((iobyxmoadg) create(nufgyqmvbuVar, gxszxtbevoVar)).invokeSuspend(gg.wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    @Override // sj.jpowsppfya
    public lqeggnwhkg iobyxmoadg(wypolnanlu wypolnanluVar) {
        return dxjokdxxww.wwaezpbzkn(new iobyxmoadg(wypolnanluVar, null));
    }

    public String toString() {
        return "SharingStarted.Lazily";
    }
}
