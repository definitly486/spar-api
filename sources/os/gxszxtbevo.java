package os;

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

/* JADX INFO: loaded from: classes4.dex */
final class gxszxtbevo implements sj.lqeggnwhkg {

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    private final sj.lqeggnwhkg f74626yggfygwlhe;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    private final sj.lqeggnwhkg f74627zdlpuopuiu;

    public static final class iobyxmoadg implements sj.lqeggnwhkg {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final /* synthetic */ sj.lqeggnwhkg f74628zdlpuopuiu;

        /* JADX INFO: renamed from: os.gxszxtbevo$iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
        public static final class C1615iobyxmoadg implements nufgyqmvbu {

            /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
            final /* synthetic */ nufgyqmvbu f74629zdlpuopuiu;

            /* JADX INFO: renamed from: os.gxszxtbevo$iobyxmoadg$iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
            public static final class C1616iobyxmoadg extends kotlin.coroutines.jvm.internal.wkgbmnqykc {

                /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
                int f74631yggfygwlhe;

                /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
                /* synthetic */ Object f74632zdlpuopuiu;

                public C1616iobyxmoadg(lg.gxszxtbevo gxszxtbevoVar) {
                    super(gxszxtbevoVar);
                }

                @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
                public final Object invokeSuspend(Object obj) {
                    this.f74632zdlpuopuiu = obj;
                    this.f74631yggfygwlhe |= Integer.MIN_VALUE;
                    return C1615iobyxmoadg.this.emit(null, this);
                }
            }

            public C1615iobyxmoadg(nufgyqmvbu nufgyqmvbuVar) {
                this.f74629zdlpuopuiu = nufgyqmvbuVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // sj.nufgyqmvbu
            public final Object emit(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
                C1616iobyxmoadg c1616iobyxmoadg;
                if (gxszxtbevoVar instanceof C1616iobyxmoadg) {
                    c1616iobyxmoadg = (C1616iobyxmoadg) gxszxtbevoVar;
                    int i13 = c1616iobyxmoadg.f74631yggfygwlhe;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        c1616iobyxmoadg.f74631yggfygwlhe = i13 - Integer.MIN_VALUE;
                    } else {
                        c1616iobyxmoadg = new C1616iobyxmoadg(gxszxtbevoVar);
                    }
                } else {
                    c1616iobyxmoadg = new C1616iobyxmoadg(gxszxtbevoVar);
                }
                Object obj2 = c1616iobyxmoadg.f74632zdlpuopuiu;
                Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
                int i14 = c1616iobyxmoadg.f74631yggfygwlhe;
                if (i14 == 0) {
                    zdlpuopuiu.zoijcleaow(obj2);
                    nufgyqmvbu nufgyqmvbuVar = this.f74629zdlpuopuiu;
                    eablkybsjg.iobyxmoadg iobyxmoadgVar = new eablkybsjg.iobyxmoadg((os.iobyxmoadg) obj);
                    c1616iobyxmoadg.f74631yggfygwlhe = 1;
                    if (nufgyqmvbuVar.emit(iobyxmoadgVar, c1616iobyxmoadg) == objGxszxtbevo) {
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
            this.f74628zdlpuopuiu = lqeggnwhkgVar;
        }

        @Override // sj.lqeggnwhkg
        public Object collect(nufgyqmvbu nufgyqmvbuVar, lg.gxszxtbevo gxszxtbevoVar) {
            Object objCollect = this.f74628zdlpuopuiu.collect(new C1615iobyxmoadg(nufgyqmvbuVar), gxszxtbevoVar);
            return objCollect == mg.zoijcleaow.gxszxtbevo() ? objCollect : wwaezpbzkn.f37140iobyxmoadg;
        }
    }

    static final class ppxfxbqfkf implements nufgyqmvbu {

        /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
        final /* synthetic */ Map f74633iwizpuwonk;

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        final /* synthetic */ nufgyqmvbu f74634jyumaefscl;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        final /* synthetic */ Map f74635yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final /* synthetic */ ylkuphrtab f74636zdlpuopuiu;

        static final class iobyxmoadg extends kotlin.coroutines.jvm.internal.wkgbmnqykc {

            /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
            int f74637cqumvgiudr;

            /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
            /* synthetic */ Object f74639jyumaefscl;

            /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
            Object f74640yggfygwlhe;

            /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
            Object f74641zdlpuopuiu;

            iobyxmoadg(lg.gxszxtbevo gxszxtbevoVar) {
                super(gxszxtbevoVar);
            }

            @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
            public final Object invokeSuspend(Object obj) {
                this.f74639jyumaefscl = obj;
                this.f74637cqumvgiudr |= Integer.MIN_VALUE;
                return ppxfxbqfkf.this.emit(null, this);
            }
        }

        ppxfxbqfkf(ylkuphrtab ylkuphrtabVar, Map map, nufgyqmvbu nufgyqmvbuVar, Map map2) {
            this.f74636zdlpuopuiu = ylkuphrtabVar;
            this.f74635yggfygwlhe = map;
            this.f74634jyumaefscl = nufgyqmvbuVar;
            this.f74633iwizpuwonk = map2;
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        @Override // sj.nufgyqmvbu
        /* JADX INFO: renamed from: zoijcleaow, reason: merged with bridge method [inline-methods] */
        public final Object emit(eablkybsjg eablkybsjgVar, lg.gxszxtbevo gxszxtbevoVar) {
            iobyxmoadg iobyxmoadgVar;
            ppxfxbqfkf ppxfxbqfkfVar;
            if (gxszxtbevoVar instanceof iobyxmoadg) {
                iobyxmoadgVar = (iobyxmoadg) gxszxtbevoVar;
                int i13 = iobyxmoadgVar.f74637cqumvgiudr;
                if ((i13 & Integer.MIN_VALUE) != 0) {
                    iobyxmoadgVar.f74637cqumvgiudr = i13 - Integer.MIN_VALUE;
                } else {
                    iobyxmoadgVar = new iobyxmoadg(gxszxtbevoVar);
                }
            } else {
                iobyxmoadgVar = new iobyxmoadg(gxszxtbevoVar);
            }
            Object obj = iobyxmoadgVar.f74639jyumaefscl;
            Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
            int i14 = iobyxmoadgVar.f74637cqumvgiudr;
            if (i14 == 0) {
                zdlpuopuiu.zoijcleaow(obj);
                if (eablkybsjgVar instanceof eablkybsjg.iobyxmoadg) {
                    if (this.f74636zdlpuopuiu.f60038zdlpuopuiu) {
                        eablkybsjg.iobyxmoadg iobyxmoadgVar2 = (eablkybsjg.iobyxmoadg) eablkybsjgVar;
                        this.f74635yggfygwlhe.put(iobyxmoadgVar2.iobyxmoadg().getKey(), iobyxmoadgVar2.iobyxmoadg());
                        nufgyqmvbu nufgyqmvbuVar = this.f74634jyumaefscl;
                        List listEablkybsjg = jyumaefscl.eablkybsjg(iobyxmoadgVar2.iobyxmoadg());
                        iobyxmoadgVar.f74637cqumvgiudr = 1;
                        if (nufgyqmvbuVar.emit(listEablkybsjg, iobyxmoadgVar) == objGxszxtbevo) {
                            return objGxszxtbevo;
                        }
                        return wwaezpbzkn.f37140iobyxmoadg;
                    }
                    eablkybsjg.iobyxmoadg iobyxmoadgVar3 = (eablkybsjg.iobyxmoadg) eablkybsjgVar;
                    this.f74633iwizpuwonk.put(iobyxmoadgVar3.iobyxmoadg().getKey(), iobyxmoadgVar3.iobyxmoadg());
                } else {
                    if (!(eablkybsjgVar instanceof eablkybsjg.zoijcleaow)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    eablkybsjg.zoijcleaow zoijcleaowVar = (eablkybsjg.zoijcleaow) eablkybsjgVar;
                    this.f74636zdlpuopuiu.f60038zdlpuopuiu = zoijcleaowVar.iobyxmoadg();
                    if (zoijcleaowVar.iobyxmoadg()) {
                        Map map = this.f74633iwizpuwonk;
                        Map map2 = this.f74635yggfygwlhe;
                        LinkedHashMap linkedHashMap = new LinkedHashMap();
                        for (Map.Entry entry : map.entrySet()) {
                            if (!kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(map2.get(entry.getKey()), entry.getValue())) {
                                linkedHashMap.put(entry.getKey(), entry.getValue());
                            }
                        }
                        Map map3 = this.f74635yggfygwlhe;
                        for (Map.Entry entry2 : linkedHashMap.entrySet()) {
                            map3.put(entry2.getKey(), entry2.getValue());
                        }
                        if (linkedHashMap.isEmpty()) {
                            linkedHashMap = null;
                        }
                        if (linkedHashMap != null) {
                            nufgyqmvbu nufgyqmvbuVar2 = this.f74634jyumaefscl;
                            List listM = jyumaefscl.m(linkedHashMap.values());
                            iobyxmoadgVar.f74641zdlpuopuiu = this;
                            iobyxmoadgVar.f74640yggfygwlhe = linkedHashMap;
                            iobyxmoadgVar.f74637cqumvgiudr = 2;
                            if (nufgyqmvbuVar2.emit(listM, iobyxmoadgVar) == objGxszxtbevo) {
                                return objGxszxtbevo;
                            }
                        }
                        ppxfxbqfkfVar = this;
                        ppxfxbqfkfVar.f74633iwizpuwonk.clear();
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
                ppxfxbqfkfVar = (ppxfxbqfkf) iobyxmoadgVar.f74641zdlpuopuiu;
                zdlpuopuiu.zoijcleaow(obj);
                ppxfxbqfkfVar.f74633iwizpuwonk.clear();
            }
            return wwaezpbzkn.f37140iobyxmoadg;
        }
    }

    public static final class zoijcleaow implements sj.lqeggnwhkg {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final /* synthetic */ sj.lqeggnwhkg f74642zdlpuopuiu;

        public static final class iobyxmoadg implements nufgyqmvbu {

            /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
            final /* synthetic */ nufgyqmvbu f74643zdlpuopuiu;

            /* JADX INFO: renamed from: os.gxszxtbevo$zoijcleaow$iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
            public static final class C1617iobyxmoadg extends kotlin.coroutines.jvm.internal.wkgbmnqykc {

                /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
                int f74645yggfygwlhe;

                /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
                /* synthetic */ Object f74646zdlpuopuiu;

                public C1617iobyxmoadg(lg.gxszxtbevo gxszxtbevoVar) {
                    super(gxszxtbevoVar);
                }

                @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
                public final Object invokeSuspend(Object obj) {
                    this.f74646zdlpuopuiu = obj;
                    this.f74645yggfygwlhe |= Integer.MIN_VALUE;
                    return iobyxmoadg.this.emit(null, this);
                }
            }

            public iobyxmoadg(nufgyqmvbu nufgyqmvbuVar) {
                this.f74643zdlpuopuiu = nufgyqmvbuVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // sj.nufgyqmvbu
            public final Object emit(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
                C1617iobyxmoadg c1617iobyxmoadg;
                if (gxszxtbevoVar instanceof C1617iobyxmoadg) {
                    c1617iobyxmoadg = (C1617iobyxmoadg) gxszxtbevoVar;
                    int i13 = c1617iobyxmoadg.f74645yggfygwlhe;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        c1617iobyxmoadg.f74645yggfygwlhe = i13 - Integer.MIN_VALUE;
                    } else {
                        c1617iobyxmoadg = new C1617iobyxmoadg(gxszxtbevoVar);
                    }
                } else {
                    c1617iobyxmoadg = new C1617iobyxmoadg(gxszxtbevoVar);
                }
                Object obj2 = c1617iobyxmoadg.f74646zdlpuopuiu;
                Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
                int i14 = c1617iobyxmoadg.f74645yggfygwlhe;
                if (i14 == 0) {
                    zdlpuopuiu.zoijcleaow(obj2);
                    nufgyqmvbu nufgyqmvbuVar = this.f74643zdlpuopuiu;
                    eablkybsjg.zoijcleaow zoijcleaowVar = new eablkybsjg.zoijcleaow(((Boolean) obj).booleanValue());
                    c1617iobyxmoadg.f74645yggfygwlhe = 1;
                    if (nufgyqmvbuVar.emit(zoijcleaowVar, c1617iobyxmoadg) == objGxszxtbevo) {
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
            this.f74642zdlpuopuiu = lqeggnwhkgVar;
        }

        @Override // sj.lqeggnwhkg
        public Object collect(nufgyqmvbu nufgyqmvbuVar, lg.gxszxtbevo gxszxtbevoVar) {
            Object objCollect = this.f74642zdlpuopuiu.collect(new iobyxmoadg(nufgyqmvbuVar), gxszxtbevoVar);
            return objCollect == mg.zoijcleaow.gxszxtbevo() ? objCollect : wwaezpbzkn.f37140iobyxmoadg;
        }
    }

    public gxszxtbevo(sj.lqeggnwhkg upstream, sj.lqeggnwhkg visibilityScreenFlow) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(upstream, "upstream");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(visibilityScreenFlow, "visibilityScreenFlow");
        this.f74627zdlpuopuiu = upstream;
        this.f74626yggfygwlhe = visibilityScreenFlow;
    }

    @Override // sj.lqeggnwhkg
    public Object collect(nufgyqmvbu nufgyqmvbuVar, lg.gxszxtbevo gxszxtbevoVar) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Object objCollect = dxjokdxxww.wypolnanlu(new iobyxmoadg(this.f74627zdlpuopuiu), new zoijcleaow(this.f74626yggfygwlhe)).collect(new ppxfxbqfkf(new ylkuphrtab(), new LinkedHashMap(), nufgyqmvbuVar, linkedHashMap), gxszxtbevoVar);
        return objCollect == mg.zoijcleaow.gxszxtbevo() ? objCollect : wwaezpbzkn.f37140iobyxmoadg;
    }
}
