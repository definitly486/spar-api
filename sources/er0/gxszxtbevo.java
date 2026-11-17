package er0;

import gg.wwaezpbzkn;
import gg.zdlpuopuiu;
import hg.jyumaefscl;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.ylkuphrtab;
import sj.dxjokdxxww;
import sj.nufgyqmvbu;

/* JADX INFO: loaded from: classes5.dex */
final class gxszxtbevo implements sj.lqeggnwhkg {

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    private final sj.lqeggnwhkg f31807yggfygwlhe;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    private final sj.lqeggnwhkg f31808zdlpuopuiu;

    public static final class iobyxmoadg implements sj.lqeggnwhkg {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final /* synthetic */ sj.lqeggnwhkg f31809zdlpuopuiu;

        /* JADX INFO: renamed from: er0.gxszxtbevo$iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
        public static final class C0684iobyxmoadg implements nufgyqmvbu {

            /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
            final /* synthetic */ nufgyqmvbu f31810zdlpuopuiu;

            /* JADX INFO: renamed from: er0.gxszxtbevo$iobyxmoadg$iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
            public static final class C0685iobyxmoadg extends kotlin.coroutines.jvm.internal.wkgbmnqykc {

                /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
                int f31812yggfygwlhe;

                /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
                /* synthetic */ Object f31813zdlpuopuiu;

                public C0685iobyxmoadg(lg.gxszxtbevo gxszxtbevoVar) {
                    super(gxszxtbevoVar);
                }

                @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
                public final Object invokeSuspend(Object obj) {
                    this.f31813zdlpuopuiu = obj;
                    this.f31812yggfygwlhe |= Integer.MIN_VALUE;
                    return C0684iobyxmoadg.this.emit(null, this);
                }
            }

            public C0684iobyxmoadg(nufgyqmvbu nufgyqmvbuVar) {
                this.f31810zdlpuopuiu = nufgyqmvbuVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // sj.nufgyqmvbu
            public final Object emit(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
                C0685iobyxmoadg c0685iobyxmoadg;
                if (gxszxtbevoVar instanceof C0685iobyxmoadg) {
                    c0685iobyxmoadg = (C0685iobyxmoadg) gxszxtbevoVar;
                    int i13 = c0685iobyxmoadg.f31812yggfygwlhe;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        c0685iobyxmoadg.f31812yggfygwlhe = i13 - Integer.MIN_VALUE;
                    } else {
                        c0685iobyxmoadg = new C0685iobyxmoadg(gxszxtbevoVar);
                    }
                } else {
                    c0685iobyxmoadg = new C0685iobyxmoadg(gxszxtbevoVar);
                }
                Object obj2 = c0685iobyxmoadg.f31813zdlpuopuiu;
                Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
                int i14 = c0685iobyxmoadg.f31812yggfygwlhe;
                if (i14 == 0) {
                    zdlpuopuiu.zoijcleaow(obj2);
                    nufgyqmvbu nufgyqmvbuVar = this.f31810zdlpuopuiu;
                    eablkybsjg.iobyxmoadg iobyxmoadgVar = new eablkybsjg.iobyxmoadg((er0.iobyxmoadg) obj);
                    c0685iobyxmoadg.f31812yggfygwlhe = 1;
                    if (nufgyqmvbuVar.emit(iobyxmoadgVar, c0685iobyxmoadg) == objGxszxtbevo) {
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

        public iobyxmoadg(sj.lqeggnwhkg lqeggnwhkgVar) {
            this.f31809zdlpuopuiu = lqeggnwhkgVar;
        }

        @Override // sj.lqeggnwhkg
        public Object collect(nufgyqmvbu nufgyqmvbuVar, lg.gxszxtbevo gxszxtbevoVar) {
            Object objCollect = this.f31809zdlpuopuiu.collect(new C0684iobyxmoadg(nufgyqmvbuVar), gxszxtbevoVar);
            return objCollect == mg.zoijcleaow.gxszxtbevo() ? objCollect : wwaezpbzkn.f37140iobyxmoadg;
        }
    }

    static final class ppxfxbqfkf implements nufgyqmvbu {

        /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
        final /* synthetic */ Map f31814iwizpuwonk;

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        final /* synthetic */ nufgyqmvbu f31815jyumaefscl;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        final /* synthetic */ Map f31816yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final /* synthetic */ ylkuphrtab f31817zdlpuopuiu;

        static final class iobyxmoadg extends kotlin.coroutines.jvm.internal.wkgbmnqykc {

            /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
            int f31818cqumvgiudr;

            /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
            /* synthetic */ Object f31820jyumaefscl;

            /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
            Object f31821yggfygwlhe;

            /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
            Object f31822zdlpuopuiu;

            iobyxmoadg(lg.gxszxtbevo gxszxtbevoVar) {
                super(gxszxtbevoVar);
            }

            @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
            public final Object invokeSuspend(Object obj) {
                this.f31820jyumaefscl = obj;
                this.f31818cqumvgiudr |= Integer.MIN_VALUE;
                return ppxfxbqfkf.this.emit(null, this);
            }
        }

        ppxfxbqfkf(ylkuphrtab ylkuphrtabVar, Map map, nufgyqmvbu nufgyqmvbuVar, Map map2) {
            this.f31817zdlpuopuiu = ylkuphrtabVar;
            this.f31816yggfygwlhe = map;
            this.f31815jyumaefscl = nufgyqmvbuVar;
            this.f31814iwizpuwonk = map2;
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        @Override // sj.nufgyqmvbu
        /* JADX INFO: renamed from: zoijcleaow, reason: merged with bridge method [inline-methods] */
        public final Object emit(eablkybsjg eablkybsjgVar, lg.gxszxtbevo gxszxtbevoVar) {
            iobyxmoadg iobyxmoadgVar;
            ppxfxbqfkf ppxfxbqfkfVar;
            if (gxszxtbevoVar instanceof iobyxmoadg) {
                iobyxmoadgVar = (iobyxmoadg) gxszxtbevoVar;
                int i13 = iobyxmoadgVar.f31818cqumvgiudr;
                if ((i13 & Integer.MIN_VALUE) != 0) {
                    iobyxmoadgVar.f31818cqumvgiudr = i13 - Integer.MIN_VALUE;
                } else {
                    iobyxmoadgVar = new iobyxmoadg(gxszxtbevoVar);
                }
            } else {
                iobyxmoadgVar = new iobyxmoadg(gxszxtbevoVar);
            }
            Object obj = iobyxmoadgVar.f31820jyumaefscl;
            Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
            int i14 = iobyxmoadgVar.f31818cqumvgiudr;
            if (i14 == 0) {
                zdlpuopuiu.zoijcleaow(obj);
                if (eablkybsjgVar instanceof eablkybsjg.iobyxmoadg) {
                    if (this.f31817zdlpuopuiu.f60038zdlpuopuiu) {
                        eablkybsjg.iobyxmoadg iobyxmoadgVar2 = (eablkybsjg.iobyxmoadg) eablkybsjgVar;
                        this.f31816yggfygwlhe.put(iobyxmoadgVar2.iobyxmoadg().getKey(), iobyxmoadgVar2.iobyxmoadg());
                        nufgyqmvbu nufgyqmvbuVar = this.f31815jyumaefscl;
                        List listEablkybsjg = jyumaefscl.eablkybsjg(iobyxmoadgVar2.iobyxmoadg());
                        iobyxmoadgVar.f31818cqumvgiudr = 1;
                        if (nufgyqmvbuVar.emit(listEablkybsjg, iobyxmoadgVar) == objGxszxtbevo) {
                            return objGxszxtbevo;
                        }
                        return wwaezpbzkn.f37140iobyxmoadg;
                    }
                    eablkybsjg.iobyxmoadg iobyxmoadgVar3 = (eablkybsjg.iobyxmoadg) eablkybsjgVar;
                    this.f31814iwizpuwonk.put(iobyxmoadgVar3.iobyxmoadg().getKey(), iobyxmoadgVar3.iobyxmoadg());
                } else {
                    if (!(eablkybsjgVar instanceof eablkybsjg.zoijcleaow)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    eablkybsjg.zoijcleaow zoijcleaowVar = (eablkybsjg.zoijcleaow) eablkybsjgVar;
                    this.f31817zdlpuopuiu.f60038zdlpuopuiu = zoijcleaowVar.iobyxmoadg();
                    if (zoijcleaowVar.iobyxmoadg()) {
                        Map map = this.f31814iwizpuwonk;
                        Map map2 = this.f31816yggfygwlhe;
                        LinkedHashMap linkedHashMap = new LinkedHashMap();
                        for (Map.Entry entry : map.entrySet()) {
                            if (!kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(map2.get(entry.getKey()), entry.getValue())) {
                                linkedHashMap.put(entry.getKey(), entry.getValue());
                            }
                        }
                        Map map3 = this.f31816yggfygwlhe;
                        for (Map.Entry entry2 : linkedHashMap.entrySet()) {
                            map3.put(entry2.getKey(), entry2.getValue());
                        }
                        if (linkedHashMap.isEmpty()) {
                            linkedHashMap = null;
                        }
                        if (linkedHashMap != null) {
                            nufgyqmvbu nufgyqmvbuVar2 = this.f31815jyumaefscl;
                            List listM = jyumaefscl.m(linkedHashMap.values());
                            iobyxmoadgVar.f31822zdlpuopuiu = this;
                            iobyxmoadgVar.f31821yggfygwlhe = linkedHashMap;
                            iobyxmoadgVar.f31818cqumvgiudr = 2;
                            if (nufgyqmvbuVar2.emit(listM, iobyxmoadgVar) == objGxszxtbevo) {
                                return objGxszxtbevo;
                            }
                        }
                        ppxfxbqfkfVar = this;
                        ppxfxbqfkfVar.f31814iwizpuwonk.clear();
                    }
                }
            } else {
                if (i14 == 1) {
                    zdlpuopuiu.zoijcleaow(obj);
                    return wwaezpbzkn.f37140iobyxmoadg;
                }
                if (i14 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ppxfxbqfkfVar = (ppxfxbqfkf) iobyxmoadgVar.f31822zdlpuopuiu;
                zdlpuopuiu.zoijcleaow(obj);
                ppxfxbqfkfVar.f31814iwizpuwonk.clear();
            }
            return wwaezpbzkn.f37140iobyxmoadg;
        }
    }

    public static final class zoijcleaow implements sj.lqeggnwhkg {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final /* synthetic */ sj.lqeggnwhkg f31823zdlpuopuiu;

        public static final class iobyxmoadg implements nufgyqmvbu {

            /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
            final /* synthetic */ nufgyqmvbu f31824zdlpuopuiu;

            /* JADX INFO: renamed from: er0.gxszxtbevo$zoijcleaow$iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
            public static final class C0686iobyxmoadg extends kotlin.coroutines.jvm.internal.wkgbmnqykc {

                /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
                int f31826yggfygwlhe;

                /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
                /* synthetic */ Object f31827zdlpuopuiu;

                public C0686iobyxmoadg(lg.gxszxtbevo gxszxtbevoVar) {
                    super(gxszxtbevoVar);
                }

                @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
                public final Object invokeSuspend(Object obj) {
                    this.f31827zdlpuopuiu = obj;
                    this.f31826yggfygwlhe |= Integer.MIN_VALUE;
                    return iobyxmoadg.this.emit(null, this);
                }
            }

            public iobyxmoadg(nufgyqmvbu nufgyqmvbuVar) {
                this.f31824zdlpuopuiu = nufgyqmvbuVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // sj.nufgyqmvbu
            public final Object emit(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
                C0686iobyxmoadg c0686iobyxmoadg;
                if (gxszxtbevoVar instanceof C0686iobyxmoadg) {
                    c0686iobyxmoadg = (C0686iobyxmoadg) gxszxtbevoVar;
                    int i13 = c0686iobyxmoadg.f31826yggfygwlhe;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        c0686iobyxmoadg.f31826yggfygwlhe = i13 - Integer.MIN_VALUE;
                    } else {
                        c0686iobyxmoadg = new C0686iobyxmoadg(gxszxtbevoVar);
                    }
                } else {
                    c0686iobyxmoadg = new C0686iobyxmoadg(gxszxtbevoVar);
                }
                Object obj2 = c0686iobyxmoadg.f31827zdlpuopuiu;
                Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
                int i14 = c0686iobyxmoadg.f31826yggfygwlhe;
                if (i14 == 0) {
                    zdlpuopuiu.zoijcleaow(obj2);
                    nufgyqmvbu nufgyqmvbuVar = this.f31824zdlpuopuiu;
                    eablkybsjg.zoijcleaow zoijcleaowVar = new eablkybsjg.zoijcleaow(((Boolean) obj).booleanValue());
                    c0686iobyxmoadg.f31826yggfygwlhe = 1;
                    if (nufgyqmvbuVar.emit(zoijcleaowVar, c0686iobyxmoadg) == objGxszxtbevo) {
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

        public zoijcleaow(sj.lqeggnwhkg lqeggnwhkgVar) {
            this.f31823zdlpuopuiu = lqeggnwhkgVar;
        }

        @Override // sj.lqeggnwhkg
        public Object collect(nufgyqmvbu nufgyqmvbuVar, lg.gxszxtbevo gxszxtbevoVar) {
            Object objCollect = this.f31823zdlpuopuiu.collect(new iobyxmoadg(nufgyqmvbuVar), gxszxtbevoVar);
            return objCollect == mg.zoijcleaow.gxszxtbevo() ? objCollect : wwaezpbzkn.f37140iobyxmoadg;
        }
    }

    public gxszxtbevo(sj.lqeggnwhkg upstream, sj.lqeggnwhkg visibilityScreenFlow) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(upstream, "upstream");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(visibilityScreenFlow, "visibilityScreenFlow");
        this.f31808zdlpuopuiu = upstream;
        this.f31807yggfygwlhe = visibilityScreenFlow;
    }

    @Override // sj.lqeggnwhkg
    public Object collect(nufgyqmvbu nufgyqmvbuVar, lg.gxszxtbevo gxszxtbevoVar) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Object objCollect = dxjokdxxww.wypolnanlu(new iobyxmoadg(this.f31808zdlpuopuiu), new zoijcleaow(this.f31807yggfygwlhe)).collect(new ppxfxbqfkf(new ylkuphrtab(), new LinkedHashMap(), nufgyqmvbuVar, linkedHashMap), gxszxtbevoVar);
        return objCollect == mg.zoijcleaow.gxszxtbevo() ? objCollect : wwaezpbzkn.f37140iobyxmoadg;
    }
}
