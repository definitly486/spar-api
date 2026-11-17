package al1;

import gg.cqumvgiudr;
import gg.vdvldrhtss;
import gg.wwaezpbzkn;
import gg.zdlpuopuiu;
import hg.jyumaefscl;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import pj.pkzmftpjix;
import ru.myspar.proloyalty.qr.domain.model.QrModel;
import sj.dxjokdxxww;
import sj.lqeggnwhkg;
import sj.nufgyqmvbu;

/* JADX INFO: loaded from: classes6.dex */
public final class eablkybsjg extends zr0.iobyxmoadg {

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final zk1.zoijcleaow f2156zoijcleaow;

    public static final class iobyxmoadg implements lqeggnwhkg {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final /* synthetic */ lqeggnwhkg f2157zdlpuopuiu;

        /* JADX INFO: renamed from: al1.eablkybsjg$iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
        public static final class C0050iobyxmoadg implements nufgyqmvbu {

            /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
            final /* synthetic */ nufgyqmvbu f2158zdlpuopuiu;

            /* JADX INFO: renamed from: al1.eablkybsjg$iobyxmoadg$iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
            public static final class C0051iobyxmoadg extends kotlin.coroutines.jvm.internal.wkgbmnqykc {

                /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
                int f2160yggfygwlhe;

                /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
                /* synthetic */ Object f2161zdlpuopuiu;

                public C0051iobyxmoadg(lg.gxszxtbevo gxszxtbevoVar) {
                    super(gxszxtbevoVar);
                }

                @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
                public final Object invokeSuspend(Object obj) {
                    this.f2161zdlpuopuiu = obj;
                    this.f2160yggfygwlhe |= Integer.MIN_VALUE;
                    return C0050iobyxmoadg.this.emit(null, this);
                }
            }

            public C0050iobyxmoadg(nufgyqmvbu nufgyqmvbuVar) {
                this.f2158zdlpuopuiu = nufgyqmvbuVar;
            }

            /* JADX WARN: Code duplicated, block: B:27:0x005f A[RETURN] */
            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // sj.nufgyqmvbu
            public final Object emit(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
                C0051iobyxmoadg c0051iobyxmoadg;
                if (gxszxtbevoVar instanceof C0051iobyxmoadg) {
                    c0051iobyxmoadg = (C0051iobyxmoadg) gxszxtbevoVar;
                    int i13 = c0051iobyxmoadg.f2160yggfygwlhe;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        c0051iobyxmoadg.f2160yggfygwlhe = i13 - Integer.MIN_VALUE;
                    } else {
                        c0051iobyxmoadg = new C0051iobyxmoadg(gxszxtbevoVar);
                    }
                } else {
                    c0051iobyxmoadg = new C0051iobyxmoadg(gxszxtbevoVar);
                }
                Object obj2 = c0051iobyxmoadg.f2161zdlpuopuiu;
                Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
                int i14 = c0051iobyxmoadg.f2160yggfygwlhe;
                if (i14 == 0) {
                    zdlpuopuiu.zoijcleaow(obj2);
                    nufgyqmvbu nufgyqmvbuVar = this.f2158zdlpuopuiu;
                    List list = (List) obj;
                    if (list == null || !list.isEmpty()) {
                        Iterator it = list.iterator();
                        while (it.hasNext()) {
                            if (((QrModel) it.next()) instanceof QrModel.Static) {
                            }
                        }
                        c0051iobyxmoadg.f2160yggfygwlhe = 1;
                        if (nufgyqmvbuVar.emit(obj, c0051iobyxmoadg) == objGxszxtbevo) {
                            return objGxszxtbevo;
                        }
                    } else {
                        c0051iobyxmoadg.f2160yggfygwlhe = 1;
                        if (nufgyqmvbuVar.emit(obj, c0051iobyxmoadg) == objGxszxtbevo) {
                            return objGxszxtbevo;
                        }
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

        public iobyxmoadg(lqeggnwhkg lqeggnwhkgVar) {
            this.f2157zdlpuopuiu = lqeggnwhkgVar;
        }

        @Override // sj.lqeggnwhkg
        public Object collect(nufgyqmvbu nufgyqmvbuVar, lg.gxszxtbevo gxszxtbevoVar) {
            Object objCollect = this.f2157zdlpuopuiu.collect(new C0050iobyxmoadg(nufgyqmvbuVar), gxszxtbevoVar);
            return objCollect == mg.zoijcleaow.gxszxtbevo() ? objCollect : wwaezpbzkn.f37140iobyxmoadg;
        }
    }

    public static final class ppxfxbqfkf implements lqeggnwhkg {

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        final /* synthetic */ eablkybsjg f2162yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final /* synthetic */ lqeggnwhkg f2163zdlpuopuiu;

        public static final class iobyxmoadg implements nufgyqmvbu {

            /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
            final /* synthetic */ eablkybsjg f2164yggfygwlhe;

            /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
            final /* synthetic */ nufgyqmvbu f2165zdlpuopuiu;

            /* JADX INFO: renamed from: al1.eablkybsjg$ppxfxbqfkf$iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
            public static final class C0052iobyxmoadg extends kotlin.coroutines.jvm.internal.wkgbmnqykc {

                /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
                int f2167yggfygwlhe;

                /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
                /* synthetic */ Object f2168zdlpuopuiu;

                public C0052iobyxmoadg(lg.gxszxtbevo gxszxtbevoVar) {
                    super(gxszxtbevoVar);
                }

                @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
                public final Object invokeSuspend(Object obj) {
                    this.f2168zdlpuopuiu = obj;
                    this.f2167yggfygwlhe |= Integer.MIN_VALUE;
                    return iobyxmoadg.this.emit(null, this);
                }
            }

            public iobyxmoadg(nufgyqmvbu nufgyqmvbuVar, eablkybsjg eablkybsjgVar) {
                this.f2165zdlpuopuiu = nufgyqmvbuVar;
                this.f2164yggfygwlhe = eablkybsjgVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // sj.nufgyqmvbu
            public final Object emit(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
                C0052iobyxmoadg c0052iobyxmoadg;
                if (gxszxtbevoVar instanceof C0052iobyxmoadg) {
                    c0052iobyxmoadg = (C0052iobyxmoadg) gxszxtbevoVar;
                    int i13 = c0052iobyxmoadg.f2167yggfygwlhe;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        c0052iobyxmoadg.f2167yggfygwlhe = i13 - Integer.MIN_VALUE;
                    } else {
                        c0052iobyxmoadg = new C0052iobyxmoadg(gxszxtbevoVar);
                    }
                } else {
                    c0052iobyxmoadg = new C0052iobyxmoadg(gxszxtbevoVar);
                }
                Object obj2 = c0052iobyxmoadg.f2168zdlpuopuiu;
                Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
                int i14 = c0052iobyxmoadg.f2167yggfygwlhe;
                if (i14 == 0) {
                    zdlpuopuiu.zoijcleaow(obj2);
                    nufgyqmvbu nufgyqmvbuVar = this.f2165zdlpuopuiu;
                    vdvldrhtss vdvldrhtssVar = (vdvldrhtss) obj;
                    Boolean boolIobyxmoadg = kotlin.coroutines.jvm.internal.zoijcleaow.iobyxmoadg(this.f2164yggfygwlhe.eablkybsjg(((Number) vdvldrhtssVar.iobyxmoadg()).intValue(), ((Number) vdvldrhtssVar.wkgbmnqykc()).intValue()));
                    c0052iobyxmoadg.f2167yggfygwlhe = 1;
                    if (nufgyqmvbuVar.emit(boolIobyxmoadg, c0052iobyxmoadg) == objGxszxtbevo) {
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

        public ppxfxbqfkf(lqeggnwhkg lqeggnwhkgVar, eablkybsjg eablkybsjgVar) {
            this.f2163zdlpuopuiu = lqeggnwhkgVar;
            this.f2162yggfygwlhe = eablkybsjgVar;
        }

        @Override // sj.lqeggnwhkg
        public Object collect(nufgyqmvbu nufgyqmvbuVar, lg.gxszxtbevo gxszxtbevoVar) {
            Object objCollect = this.f2163zdlpuopuiu.collect(new iobyxmoadg(nufgyqmvbuVar, this.f2162yggfygwlhe), gxszxtbevoVar);
            return objCollect == mg.zoijcleaow.gxszxtbevo() ? objCollect : wwaezpbzkn.f37140iobyxmoadg;
        }
    }

    public static final class zoijcleaow implements lqeggnwhkg {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final /* synthetic */ lqeggnwhkg f2169zdlpuopuiu;

        public static final class iobyxmoadg implements nufgyqmvbu {

            /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
            final /* synthetic */ nufgyqmvbu f2170zdlpuopuiu;

            /* JADX INFO: renamed from: al1.eablkybsjg$zoijcleaow$iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
            public static final class C0053iobyxmoadg extends kotlin.coroutines.jvm.internal.wkgbmnqykc {

                /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
                int f2172yggfygwlhe;

                /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
                /* synthetic */ Object f2173zdlpuopuiu;

                public C0053iobyxmoadg(lg.gxszxtbevo gxszxtbevoVar) {
                    super(gxszxtbevoVar);
                }

                @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
                public final Object invokeSuspend(Object obj) {
                    this.f2173zdlpuopuiu = obj;
                    this.f2172yggfygwlhe |= Integer.MIN_VALUE;
                    return iobyxmoadg.this.emit(null, this);
                }
            }

            public iobyxmoadg(nufgyqmvbu nufgyqmvbuVar) {
                this.f2170zdlpuopuiu = nufgyqmvbuVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // sj.nufgyqmvbu
            public final Object emit(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
                C0053iobyxmoadg c0053iobyxmoadg;
                if (gxszxtbevoVar instanceof C0053iobyxmoadg) {
                    c0053iobyxmoadg = (C0053iobyxmoadg) gxszxtbevoVar;
                    int i13 = c0053iobyxmoadg.f2172yggfygwlhe;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        c0053iobyxmoadg.f2172yggfygwlhe = i13 - Integer.MIN_VALUE;
                    } else {
                        c0053iobyxmoadg = new C0053iobyxmoadg(gxszxtbevoVar);
                    }
                } else {
                    c0053iobyxmoadg = new C0053iobyxmoadg(gxszxtbevoVar);
                }
                Object obj2 = c0053iobyxmoadg.f2173zdlpuopuiu;
                Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
                int i14 = c0053iobyxmoadg.f2172yggfygwlhe;
                if (i14 == 0) {
                    zdlpuopuiu.zoijcleaow(obj2);
                    nufgyqmvbu nufgyqmvbuVar = this.f2170zdlpuopuiu;
                    ArrayList arrayList = new ArrayList();
                    for (Object obj3 : (List) obj) {
                        if (obj3 instanceof QrModel.Dynamic) {
                            arrayList.add(obj3);
                        }
                    }
                    int i15 = 0;
                    if (!arrayList.isEmpty()) {
                        Iterator it = arrayList.iterator();
                        while (it.hasNext()) {
                            if (((QrModel.Dynamic) it.next()).getStatus() == null && (i15 = i15 + 1) < 0) {
                                jyumaefscl.jyumaefscl();
                            }
                        }
                    }
                    vdvldrhtss vdvldrhtssVarIobyxmoadg = cqumvgiudr.iobyxmoadg(kotlin.coroutines.jvm.internal.zoijcleaow.wkgbmnqykc(arrayList.size()), kotlin.coroutines.jvm.internal.zoijcleaow.wkgbmnqykc(i15));
                    c0053iobyxmoadg.f2172yggfygwlhe = 1;
                    if (nufgyqmvbuVar.emit(vdvldrhtssVarIobyxmoadg, c0053iobyxmoadg) == objGxszxtbevo) {
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

        public zoijcleaow(lqeggnwhkg lqeggnwhkgVar) {
            this.f2169zdlpuopuiu = lqeggnwhkgVar;
        }

        @Override // sj.lqeggnwhkg
        public Object collect(nufgyqmvbu nufgyqmvbuVar, lg.gxszxtbevo gxszxtbevoVar) {
            Object objCollect = this.f2169zdlpuopuiu.collect(new iobyxmoadg(nufgyqmvbuVar), gxszxtbevoVar);
            return objCollect == mg.zoijcleaow.gxszxtbevo() ? objCollect : wwaezpbzkn.f37140iobyxmoadg;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public eablkybsjg(zk1.zoijcleaow qrsRepository, pkzmftpjix coroutineDispatcher) {
        super(coroutineDispatcher);
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(qrsRepository, "qrsRepository");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(coroutineDispatcher, "coroutineDispatcher");
        this.f2156zoijcleaow = qrsRepository;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean eablkybsjg(int i13, int i14) {
        return i14 == 0 || (i13 > 0 && i13 / i14 > 3);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // zr0.iobyxmoadg
    /* JADX INFO: renamed from: wkgbmnqykc, reason: merged with bridge method [inline-methods] */
    public lqeggnwhkg iobyxmoadg(wwaezpbzkn parameters) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(parameters, "parameters");
        return new ppxfxbqfkf(dxjokdxxww.vdvldrhtss(new zoijcleaow(new iobyxmoadg(this.f2156zoijcleaow.ppxfxbqfkf()))), this);
    }
}
