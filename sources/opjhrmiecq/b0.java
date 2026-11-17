package opjhrmiecq;

import androidx.compose.ui.input.pointer.PointerInputEventHandler;

/* JADX INFO: loaded from: classes.dex */
public abstract class b0 {

    static final class iobyxmoadg implements tg.vdvldrhtss {

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        final /* synthetic */ metgxyhuhe.draadjrbmk f73454yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final /* synthetic */ tg.draadjrbmk f73455zdlpuopuiu;

        /* JADX INFO: renamed from: opjhrmiecq.b0$iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
        static final class C1603iobyxmoadg implements PointerInputEventHandler {

            /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
            final /* synthetic */ pj.cllcsxoeiz f73456iobyxmoadg;

            /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
            final /* synthetic */ metgxyhuhe.draadjrbmk f73457ppxfxbqfkf;

            /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
            final /* synthetic */ androidx.compose.runtime.i1 f73458wkgbmnqykc;

            /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
            final /* synthetic */ androidx.compose.runtime.iwxlajgraz f73459zoijcleaow;

            /* JADX INFO: renamed from: opjhrmiecq.b0$iobyxmoadg$iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
            static final class C1604iobyxmoadg extends kotlin.coroutines.jvm.internal.draadjrbmk implements tg.vdvldrhtss {

                /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
                final /* synthetic */ androidx.compose.runtime.iwxlajgraz f73460cqumvgiudr;

                /* JADX INFO: renamed from: esjtqupxsv, reason: collision with root package name */
                final /* synthetic */ metgxyhuhe.draadjrbmk f73461esjtqupxsv;

                /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
                final /* synthetic */ pj.cllcsxoeiz f73462iwizpuwonk;

                /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
                /* synthetic */ long f73463jyumaefscl;

                /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
                private /* synthetic */ Object f73464yggfygwlhe;

                /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
                int f73465zdlpuopuiu;

                /* JADX INFO: renamed from: opjhrmiecq.b0$iobyxmoadg$iobyxmoadg$iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
                static final class C1605iobyxmoadg extends kotlin.coroutines.jvm.internal.draadjrbmk implements tg.rgvfuqvkyq {

                    /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
                    final /* synthetic */ metgxyhuhe.draadjrbmk f73466cqumvgiudr;

                    /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
                    final /* synthetic */ long f73467iwizpuwonk;

                    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
                    final /* synthetic */ androidx.compose.runtime.iwxlajgraz f73468jyumaefscl;

                    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
                    int f73469yggfygwlhe;

                    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
                    Object f73470zdlpuopuiu;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    C1605iobyxmoadg(androidx.compose.runtime.iwxlajgraz iwxlajgrazVar, long j13, metgxyhuhe.draadjrbmk draadjrbmkVar, lg.gxszxtbevo gxszxtbevoVar) {
                        super(2, gxszxtbevoVar);
                        this.f73468jyumaefscl = iwxlajgrazVar;
                        this.f73467iwizpuwonk = j13;
                        this.f73466cqumvgiudr = draadjrbmkVar;
                    }

                    @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
                    public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
                        return new C1605iobyxmoadg(this.f73468jyumaefscl, this.f73467iwizpuwonk, this.f73466cqumvgiudr, gxszxtbevoVar);
                    }

                    /* JADX WARN: Code duplicated, block: B:22:0x005a  */
                    /* JADX WARN: Code duplicated, block: B:24:0x0064 A[RETURN] */
                    /* JADX WARN: Code duplicated, block: B:25:0x0065  */
                    @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
                    public final Object invokeSuspend(Object obj) {
                        androidx.compose.runtime.iwxlajgraz iwxlajgrazVar;
                        androidx.compose.runtime.iwxlajgraz iwxlajgrazVar2;
                        metgxyhuhe.agtfadlqog.zoijcleaow zoijcleaowVar;
                        metgxyhuhe.draadjrbmk draadjrbmkVar;
                        metgxyhuhe.agtfadlqog.zoijcleaow zoijcleaowVar2;
                        Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
                        int i13 = this.f73469yggfygwlhe;
                        if (i13 != 0) {
                            if (i13 == 1) {
                                iwxlajgrazVar2 = (androidx.compose.runtime.iwxlajgraz) this.f73470zdlpuopuiu;
                                gg.zdlpuopuiu.zoijcleaow(obj);
                            } else {
                                if (i13 != 2) {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                zoijcleaowVar2 = (metgxyhuhe.agtfadlqog.zoijcleaow) this.f73470zdlpuopuiu;
                                gg.zdlpuopuiu.zoijcleaow(obj);
                            }
                            zoijcleaowVar = zoijcleaowVar2;
                            this.f73468jyumaefscl.setValue(zoijcleaowVar);
                            return gg.wwaezpbzkn.f37140iobyxmoadg;
                        }
                        gg.zdlpuopuiu.zoijcleaow(obj);
                        metgxyhuhe.agtfadlqog.zoijcleaow zoijcleaowVar3 = (metgxyhuhe.agtfadlqog.zoijcleaow) this.f73468jyumaefscl.getValue();
                        if (zoijcleaowVar3 != null) {
                            metgxyhuhe.draadjrbmk draadjrbmkVar2 = this.f73466cqumvgiudr;
                            iwxlajgrazVar = this.f73468jyumaefscl;
                            metgxyhuhe.agtfadlqog.iobyxmoadg iobyxmoadgVar = new metgxyhuhe.agtfadlqog.iobyxmoadg(zoijcleaowVar3);
                            if (draadjrbmkVar2 != null) {
                                this.f73470zdlpuopuiu = iwxlajgrazVar;
                                this.f73469yggfygwlhe = 1;
                                if (draadjrbmkVar2.zoijcleaow(iobyxmoadgVar, this) == objGxszxtbevo) {
                                    return objGxszxtbevo;
                                }
                                iwxlajgrazVar2 = iwxlajgrazVar;
                            }
                            iwxlajgrazVar.setValue(null);
                            zoijcleaowVar = new metgxyhuhe.agtfadlqog.zoijcleaow(this.f73467iwizpuwonk, null);
                            draadjrbmkVar = this.f73466cqumvgiudr;
                            if (draadjrbmkVar != null) {
                                this.f73470zdlpuopuiu = zoijcleaowVar;
                                this.f73469yggfygwlhe = 2;
                                if (draadjrbmkVar.zoijcleaow(zoijcleaowVar, this) == objGxszxtbevo) {
                                    return objGxszxtbevo;
                                }
                                zoijcleaowVar2 = zoijcleaowVar;
                                zoijcleaowVar = zoijcleaowVar2;
                            }
                        } else {
                            zoijcleaowVar = new metgxyhuhe.agtfadlqog.zoijcleaow(this.f73467iwizpuwonk, null);
                            draadjrbmkVar = this.f73466cqumvgiudr;
                            if (draadjrbmkVar != null) {
                                this.f73470zdlpuopuiu = zoijcleaowVar;
                                this.f73469yggfygwlhe = 2;
                                if (draadjrbmkVar.zoijcleaow(zoijcleaowVar, this) == objGxszxtbevo) {
                                    return objGxszxtbevo;
                                }
                                zoijcleaowVar2 = zoijcleaowVar;
                                zoijcleaowVar = zoijcleaowVar2;
                            }
                        }
                        this.f73468jyumaefscl.setValue(zoijcleaowVar);
                        return gg.wwaezpbzkn.f37140iobyxmoadg;
                        iwxlajgrazVar = iwxlajgrazVar2;
                        iwxlajgrazVar.setValue(null);
                        zoijcleaowVar = new metgxyhuhe.agtfadlqog.zoijcleaow(this.f73467iwizpuwonk, null);
                        draadjrbmkVar = this.f73466cqumvgiudr;
                        if (draadjrbmkVar != null) {
                            this.f73470zdlpuopuiu = zoijcleaowVar;
                            this.f73469yggfygwlhe = 2;
                            if (draadjrbmkVar.zoijcleaow(zoijcleaowVar, this) == objGxszxtbevo) {
                                return objGxszxtbevo;
                            }
                            zoijcleaowVar2 = zoijcleaowVar;
                            zoijcleaowVar = zoijcleaowVar2;
                        }
                        this.f73468jyumaefscl.setValue(zoijcleaowVar);
                        return gg.wwaezpbzkn.f37140iobyxmoadg;
                    }

                    @Override // tg.rgvfuqvkyq
                    public final Object invoke(pj.cllcsxoeiz cllcsxoeizVar, lg.gxszxtbevo gxszxtbevoVar) {
                        return ((C1605iobyxmoadg) create(cllcsxoeizVar, gxszxtbevoVar)).invokeSuspend(gg.wwaezpbzkn.f37140iobyxmoadg);
                    }
                }

                /* JADX INFO: renamed from: opjhrmiecq.b0$iobyxmoadg$iobyxmoadg$iobyxmoadg$zoijcleaow */
                static final class zoijcleaow extends kotlin.coroutines.jvm.internal.draadjrbmk implements tg.rgvfuqvkyq {

                    /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
                    final /* synthetic */ metgxyhuhe.draadjrbmk f73471cqumvgiudr;

                    /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
                    final /* synthetic */ boolean f73472iwizpuwonk;

                    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
                    final /* synthetic */ androidx.compose.runtime.iwxlajgraz f73473jyumaefscl;

                    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
                    int f73474yggfygwlhe;

                    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
                    Object f73475zdlpuopuiu;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    zoijcleaow(androidx.compose.runtime.iwxlajgraz iwxlajgrazVar, boolean z13, metgxyhuhe.draadjrbmk draadjrbmkVar, lg.gxszxtbevo gxszxtbevoVar) {
                        super(2, gxszxtbevoVar);
                        this.f73473jyumaefscl = iwxlajgrazVar;
                        this.f73472iwizpuwonk = z13;
                        this.f73471cqumvgiudr = draadjrbmkVar;
                    }

                    @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
                    public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
                        return new zoijcleaow(this.f73473jyumaefscl, this.f73472iwizpuwonk, this.f73471cqumvgiudr, gxszxtbevoVar);
                    }

                    @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
                    public final Object invokeSuspend(Object obj) {
                        androidx.compose.runtime.iwxlajgraz iwxlajgrazVar;
                        androidx.compose.runtime.iwxlajgraz iwxlajgrazVar2;
                        Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
                        int i13 = this.f73474yggfygwlhe;
                        if (i13 == 0) {
                            gg.zdlpuopuiu.zoijcleaow(obj);
                            metgxyhuhe.agtfadlqog.zoijcleaow zoijcleaowVar = (metgxyhuhe.agtfadlqog.zoijcleaow) this.f73473jyumaefscl.getValue();
                            if (zoijcleaowVar != null) {
                                boolean z13 = this.f73472iwizpuwonk;
                                metgxyhuhe.draadjrbmk draadjrbmkVar = this.f73471cqumvgiudr;
                                iwxlajgrazVar = this.f73473jyumaefscl;
                                metgxyhuhe.dxjokdxxww ppxfxbqfkfVar = z13 ? new metgxyhuhe.agtfadlqog.ppxfxbqfkf(zoijcleaowVar) : new metgxyhuhe.agtfadlqog.iobyxmoadg(zoijcleaowVar);
                                if (draadjrbmkVar != null) {
                                    this.f73475zdlpuopuiu = iwxlajgrazVar;
                                    this.f73474yggfygwlhe = 1;
                                    if (draadjrbmkVar.zoijcleaow(ppxfxbqfkfVar, this) == objGxszxtbevo) {
                                        return objGxszxtbevo;
                                    }
                                    iwxlajgrazVar2 = iwxlajgrazVar;
                                }
                                iwxlajgrazVar.setValue(null);
                            }
                            return gg.wwaezpbzkn.f37140iobyxmoadg;
                        }
                        if (i13 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        iwxlajgrazVar2 = (androidx.compose.runtime.iwxlajgraz) this.f73475zdlpuopuiu;
                        gg.zdlpuopuiu.zoijcleaow(obj);
                        iwxlajgrazVar = iwxlajgrazVar2;
                        iwxlajgrazVar.setValue(null);
                        return gg.wwaezpbzkn.f37140iobyxmoadg;
                    }

                    @Override // tg.rgvfuqvkyq
                    public final Object invoke(pj.cllcsxoeiz cllcsxoeizVar, lg.gxszxtbevo gxszxtbevoVar) {
                        return ((zoijcleaow) create(cllcsxoeizVar, gxszxtbevoVar)).invokeSuspend(gg.wwaezpbzkn.f37140iobyxmoadg);
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C1604iobyxmoadg(pj.cllcsxoeiz cllcsxoeizVar, androidx.compose.runtime.iwxlajgraz iwxlajgrazVar, metgxyhuhe.draadjrbmk draadjrbmkVar, lg.gxszxtbevo gxszxtbevoVar) {
                    super(3, gxszxtbevoVar);
                    this.f73462iwizpuwonk = cllcsxoeizVar;
                    this.f73460cqumvgiudr = iwxlajgrazVar;
                    this.f73461esjtqupxsv = draadjrbmkVar;
                }

                @Override // tg.vdvldrhtss
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                    return ojitshcjhn((jztzpxfvev.ribwqtqdhb) obj, ((g.eablkybsjg) obj2).zdlpuopuiu(), (lg.gxszxtbevo) obj3);
                }

                @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
                public final Object invokeSuspend(Object obj) {
                    Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
                    int i13 = this.f73465zdlpuopuiu;
                    if (i13 == 0) {
                        gg.zdlpuopuiu.zoijcleaow(obj);
                        jztzpxfvev.ribwqtqdhb ribwqtqdhbVar = (jztzpxfvev.ribwqtqdhb) this.f73464yggfygwlhe;
                        pj.gtknphoqwx.wkgbmnqykc(this.f73462iwizpuwonk, null, null, new C1605iobyxmoadg(this.f73460cqumvgiudr, this.f73463jyumaefscl, this.f73461esjtqupxsv, null), 3, null);
                        this.f73465zdlpuopuiu = 1;
                        obj = ribwqtqdhbVar.U(this);
                        if (obj == objGxszxtbevo) {
                            return objGxszxtbevo;
                        }
                    } else {
                        if (i13 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        gg.zdlpuopuiu.zoijcleaow(obj);
                    }
                    pj.gtknphoqwx.wkgbmnqykc(this.f73462iwizpuwonk, null, null, new zoijcleaow(this.f73460cqumvgiudr, ((Boolean) obj).booleanValue(), this.f73461esjtqupxsv, null), 3, null);
                    return gg.wwaezpbzkn.f37140iobyxmoadg;
                }

                public final Object ojitshcjhn(jztzpxfvev.ribwqtqdhb ribwqtqdhbVar, long j13, lg.gxszxtbevo gxszxtbevoVar) {
                    C1604iobyxmoadg c1604iobyxmoadg = new C1604iobyxmoadg(this.f73462iwizpuwonk, this.f73460cqumvgiudr, this.f73461esjtqupxsv, gxszxtbevoVar);
                    c1604iobyxmoadg.f73464yggfygwlhe = ribwqtqdhbVar;
                    c1604iobyxmoadg.f73463jyumaefscl = j13;
                    return c1604iobyxmoadg.invokeSuspend(gg.wwaezpbzkn.f37140iobyxmoadg);
                }
            }

            C1603iobyxmoadg(pj.cllcsxoeiz cllcsxoeizVar, androidx.compose.runtime.iwxlajgraz iwxlajgrazVar, metgxyhuhe.draadjrbmk draadjrbmkVar, androidx.compose.runtime.i1 i1Var) {
                this.f73456iobyxmoadg = cllcsxoeizVar;
                this.f73459zoijcleaow = iwxlajgrazVar;
                this.f73457ppxfxbqfkf = draadjrbmkVar;
                this.f73458wkgbmnqykc = i1Var;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final gg.wwaezpbzkn zoijcleaow(androidx.compose.runtime.i1 i1Var, g.eablkybsjg eablkybsjgVar) {
                ((tg.draadjrbmk) i1Var.getValue()).invoke(eablkybsjgVar);
                return gg.wwaezpbzkn.f37140iobyxmoadg;
            }

            @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
            public final Object invoke(t.ylkuphrtab ylkuphrtabVar, lg.gxszxtbevo gxszxtbevoVar) {
                C1604iobyxmoadg c1604iobyxmoadg = new C1604iobyxmoadg(this.f73456iobyxmoadg, this.f73459zoijcleaow, this.f73457ppxfxbqfkf, null);
                final androidx.compose.runtime.i1 i1Var = this.f73458wkgbmnqykc;
                Object objDxjokdxxww = jztzpxfvev.nuxfzjnpeb.dxjokdxxww(ylkuphrtabVar, c1604iobyxmoadg, new tg.draadjrbmk() { // from class: opjhrmiecq.a0
                    @Override // tg.draadjrbmk
                    public final Object invoke(Object obj) {
                        return b0.iobyxmoadg.C1603iobyxmoadg.zoijcleaow(i1Var, (g.eablkybsjg) obj);
                    }
                }, gxszxtbevoVar);
                return objDxjokdxxww == mg.zoijcleaow.gxszxtbevo() ? objDxjokdxxww : gg.wwaezpbzkn.f37140iobyxmoadg;
            }
        }

        public static final class zoijcleaow implements androidx.compose.runtime.ntlheqmsrt {

            /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
            final /* synthetic */ androidx.compose.runtime.iwxlajgraz f73476iobyxmoadg;

            /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
            final /* synthetic */ metgxyhuhe.draadjrbmk f73477zoijcleaow;

            public zoijcleaow(androidx.compose.runtime.iwxlajgraz iwxlajgrazVar, metgxyhuhe.draadjrbmk draadjrbmkVar) {
                this.f73476iobyxmoadg = iwxlajgrazVar;
                this.f73477zoijcleaow = draadjrbmkVar;
            }

            @Override // androidx.compose.runtime.ntlheqmsrt
            public void iobyxmoadg() {
                metgxyhuhe.agtfadlqog.zoijcleaow zoijcleaowVar = (metgxyhuhe.agtfadlqog.zoijcleaow) this.f73476iobyxmoadg.getValue();
                if (zoijcleaowVar != null) {
                    metgxyhuhe.agtfadlqog.iobyxmoadg iobyxmoadgVar = new metgxyhuhe.agtfadlqog.iobyxmoadg(zoijcleaowVar);
                    metgxyhuhe.draadjrbmk draadjrbmkVar = this.f73477zoijcleaow;
                    if (draadjrbmkVar != null) {
                        draadjrbmkVar.iobyxmoadg(iobyxmoadgVar);
                    }
                    this.f73476iobyxmoadg.setValue(null);
                }
            }
        }

        iobyxmoadg(tg.draadjrbmk draadjrbmkVar, metgxyhuhe.draadjrbmk draadjrbmkVar2) {
            this.f73455zdlpuopuiu = draadjrbmkVar;
            this.f73454yggfygwlhe = draadjrbmkVar2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final androidx.compose.runtime.ntlheqmsrt ppxfxbqfkf(androidx.compose.runtime.iwxlajgraz iwxlajgrazVar, metgxyhuhe.draadjrbmk draadjrbmkVar, androidx.compose.runtime.ulzqkzuiru ulzqkzuiruVar) {
            return new zoijcleaow(iwxlajgrazVar, draadjrbmkVar);
        }

        @Override // tg.vdvldrhtss
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            return zoijcleaow((androidx.compose.ui.wkgbmnqykc) obj, (androidx.compose.runtime.draadjrbmk) obj2, ((Number) obj3).intValue());
        }

        public final androidx.compose.ui.wkgbmnqykc zoijcleaow(androidx.compose.ui.wkgbmnqykc wkgbmnqykcVar, androidx.compose.runtime.draadjrbmk draadjrbmkVar, int i13) {
            draadjrbmkVar.sopmlzcsov(-102778667);
            if (androidx.compose.runtime.jyumaefscl.jpowsppfya()) {
                androidx.compose.runtime.jyumaefscl.ntlheqmsrt(-102778667, i13, -1, "androidx.compose.foundation.text.tapPressTextFieldModifier.<anonymous> (TextFieldPressGestureFilter.kt:40)");
            }
            Object objYadqdtsiqt = draadjrbmkVar.yadqdtsiqt();
            androidx.compose.runtime.draadjrbmk.iobyxmoadg iobyxmoadgVar = androidx.compose.runtime.draadjrbmk.f5569iobyxmoadg;
            if (objYadqdtsiqt == iobyxmoadgVar.iobyxmoadg()) {
                objYadqdtsiqt = androidx.compose.runtime.jlmebxxoox.dxjokdxxww(lg.gtknphoqwx.f62507zdlpuopuiu, draadjrbmkVar);
                draadjrbmkVar.jyumaefscl(objYadqdtsiqt);
            }
            pj.cllcsxoeiz cllcsxoeizVar = (pj.cllcsxoeiz) objYadqdtsiqt;
            Object objYadqdtsiqt2 = draadjrbmkVar.yadqdtsiqt();
            if (objYadqdtsiqt2 == iobyxmoadgVar.iobyxmoadg()) {
                objYadqdtsiqt2 = androidx.compose.runtime.c1.ppxfxbqfkf(null, null, 2, null);
                draadjrbmkVar.jyumaefscl(objYadqdtsiqt2);
            }
            final androidx.compose.runtime.iwxlajgraz iwxlajgrazVar = (androidx.compose.runtime.iwxlajgraz) objYadqdtsiqt2;
            androidx.compose.runtime.i1 i1VarAgtfadlqog = androidx.compose.runtime.v0.agtfadlqog(this.f73455zdlpuopuiu, draadjrbmkVar, 0);
            metgxyhuhe.draadjrbmk draadjrbmkVar2 = this.f73454yggfygwlhe;
            boolean zUlzqkzuiru = draadjrbmkVar.ulzqkzuiru(this.f73454yggfygwlhe);
            final metgxyhuhe.draadjrbmk draadjrbmkVar3 = this.f73454yggfygwlhe;
            Object objYadqdtsiqt3 = draadjrbmkVar.yadqdtsiqt();
            if (zUlzqkzuiru || objYadqdtsiqt3 == iobyxmoadgVar.iobyxmoadg()) {
                objYadqdtsiqt3 = new tg.draadjrbmk() { // from class: opjhrmiecq.z
                    @Override // tg.draadjrbmk
                    public final Object invoke(Object obj) {
                        return b0.iobyxmoadg.ppxfxbqfkf(iwxlajgrazVar, draadjrbmkVar3, (androidx.compose.runtime.ulzqkzuiru) obj);
                    }
                };
                draadjrbmkVar.jyumaefscl(objYadqdtsiqt3);
            }
            androidx.compose.runtime.jlmebxxoox.zoijcleaow(draadjrbmkVar2, (tg.draadjrbmk) objYadqdtsiqt3, draadjrbmkVar, 0);
            androidx.compose.ui.wkgbmnqykc.iobyxmoadg iobyxmoadgVar2 = androidx.compose.ui.wkgbmnqykc.f7471iobyxmoadg;
            metgxyhuhe.draadjrbmk draadjrbmkVar4 = this.f73454yggfygwlhe;
            boolean zLmojexxdyd = draadjrbmkVar.lmojexxdyd(cllcsxoeizVar) | draadjrbmkVar.ulzqkzuiru(this.f73454yggfygwlhe) | draadjrbmkVar.ulzqkzuiru(i1VarAgtfadlqog);
            metgxyhuhe.draadjrbmk draadjrbmkVar5 = this.f73454yggfygwlhe;
            Object objYadqdtsiqt4 = draadjrbmkVar.yadqdtsiqt();
            if (zLmojexxdyd || objYadqdtsiqt4 == iobyxmoadgVar.iobyxmoadg()) {
                objYadqdtsiqt4 = new C1603iobyxmoadg(cllcsxoeizVar, iwxlajgrazVar, draadjrbmkVar5, i1VarAgtfadlqog);
                draadjrbmkVar.jyumaefscl(objYadqdtsiqt4);
            }
            androidx.compose.ui.wkgbmnqykc wkgbmnqykcVarPpxfxbqfkf = t.tzroggbefp.ppxfxbqfkf(iobyxmoadgVar2, draadjrbmkVar4, (PointerInputEventHandler) objYadqdtsiqt4);
            if (androidx.compose.runtime.jyumaefscl.jpowsppfya()) {
                androidx.compose.runtime.jyumaefscl.mbcevpiqjq();
            }
            draadjrbmkVar.stevsuqkhv();
            return wkgbmnqykcVarPpxfxbqfkf;
        }
    }

    public static final androidx.compose.ui.wkgbmnqykc iobyxmoadg(androidx.compose.ui.wkgbmnqykc wkgbmnqykcVar, metgxyhuhe.draadjrbmk draadjrbmkVar, boolean z13, tg.draadjrbmk draadjrbmkVar2) {
        return z13 ? androidx.compose.ui.ppxfxbqfkf.ppxfxbqfkf(wkgbmnqykcVar, null, new iobyxmoadg(draadjrbmkVar2, draadjrbmkVar), 1, null) : wkgbmnqykcVar;
    }
}
