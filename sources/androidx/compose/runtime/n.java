package androidx.compose.runtime;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes.dex */
public final class n extends cqumvgiudr {

    /* JADX INFO: renamed from: agtfadlqog, reason: collision with root package name */
    private final androidx.collection.dsvhmnatus f5740agtfadlqog;

    /* JADX INFO: renamed from: btonecajqb, reason: collision with root package name */
    private final List f5741btonecajqb;

    /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
    private final ezmngbhpjk.rgvfuqvkyq f5742cqumvgiudr;

    /* JADX INFO: renamed from: draadjrbmk, reason: collision with root package name */
    private final androidx.collection.dsvhmnatus f5743draadjrbmk;

    /* JADX INFO: renamed from: dxjokdxxww, reason: collision with root package name */
    private final ipoelvxyzq.ppxfxbqfkf f5744dxjokdxxww;

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private Throwable f5745eablkybsjg;

    /* JADX INFO: renamed from: esjtqupxsv, reason: collision with root package name */
    private final pj.pmvmpeiblj f5746esjtqupxsv;

    /* JADX INFO: renamed from: gtknphoqwx, reason: collision with root package name */
    private final List f5747gtknphoqwx;

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    private final List f5748gxszxtbevo;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private long f5749iobyxmoadg;

    /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
    private final sj.zynmafqrjb f5750iwizpuwonk;

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
    private boolean f5751jyumaefscl;

    /* JADX INFO: renamed from: kcexrzcfyt, reason: collision with root package name */
    private int f5752kcexrzcfyt;

    /* JADX INFO: renamed from: lereixgezr, reason: collision with root package name */
    private final lg.btonecajqb f5753lereixgezr;

    /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
    private List f5754lqeggnwhkg;

    /* JADX INFO: renamed from: nufgyqmvbu, reason: collision with root package name */
    private androidx.collection.wypolnanlu f5755nufgyqmvbu;

    /* JADX INFO: renamed from: ojitshcjhn, reason: collision with root package name */
    private final androidx.collection.dsvhmnatus f5756ojitshcjhn;

    /* JADX INFO: renamed from: oxmwwwfdhm, reason: collision with root package name */
    private pj.agtfadlqog f5757oxmwwwfdhm;

    /* JADX INFO: renamed from: pmvmpeiblj, reason: collision with root package name */
    private androidx.collection.jpowsppfya f5758pmvmpeiblj;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final Object f5759ppxfxbqfkf;

    /* JADX INFO: renamed from: rgvfuqvkyq, reason: collision with root package name */
    private List f5760rgvfuqvkyq;

    /* JADX INFO: renamed from: vdvldrhtss, reason: collision with root package name */
    private Set f5761vdvldrhtss;

    /* JADX INFO: renamed from: wflxmlrfwp, reason: collision with root package name */
    private final skhdrjzrfn f5762wflxmlrfwp;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private pj.auzgnhcxok f5763wkgbmnqykc;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    private zoijcleaow f5764yggfygwlhe;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    private boolean f5765zdlpuopuiu;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final androidx.compose.runtime.eablkybsjg f5766zoijcleaow;

    /* JADX INFO: renamed from: zynmafqrjb, reason: collision with root package name */
    private final ppxfxbqfkf f5767zynmafqrjb;

    /* JADX INFO: renamed from: istkbnxepw, reason: collision with root package name */
    public static final iobyxmoadg f5738istkbnxepw = new iobyxmoadg(null);

    /* JADX INFO: renamed from: cdpycssgdh, reason: collision with root package name */
    public static final int f5736cdpycssgdh = 8;

    /* JADX INFO: renamed from: yadqdtsiqt, reason: collision with root package name */
    private static final sj.zynmafqrjb f5739yadqdtsiqt = sj.kegysxyocb.iobyxmoadg(grlcpdaxtj.iobyxmoadg.zoijcleaow());

    /* JADX INFO: renamed from: iozdgvuglv, reason: collision with root package name */
    private static final AtomicReference f5737iozdgvuglv = new AtomicReference(Boolean.FALSE);

    static final class eablkybsjg extends kotlin.coroutines.jvm.internal.draadjrbmk implements tg.rgvfuqvkyq {

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        /* synthetic */ Object f5768yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        int f5769zdlpuopuiu;

        eablkybsjg(lg.gxszxtbevo gxszxtbevoVar) {
            super(2, gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
            eablkybsjg eablkybsjgVar = new eablkybsjg(gxszxtbevoVar);
            eablkybsjgVar.f5768yggfygwlhe = obj;
            return eablkybsjgVar;
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            mg.zoijcleaow.gxszxtbevo();
            if (this.f5769zdlpuopuiu != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            gg.zdlpuopuiu.zoijcleaow(obj);
            return kotlin.coroutines.jvm.internal.zoijcleaow.iobyxmoadg(((wkgbmnqykc) this.f5768yggfygwlhe) == wkgbmnqykc.ShutDown);
        }

        @Override // tg.rgvfuqvkyq
        /* JADX INFO: renamed from: ojitshcjhn, reason: merged with bridge method [inline-methods] */
        public final Object invoke(wkgbmnqykc wkgbmnqykcVar, lg.gxszxtbevo gxszxtbevoVar) {
            return ((eablkybsjg) create(wkgbmnqykcVar, gxszxtbevoVar)).invokeSuspend(gg.wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    static final class gxszxtbevo extends kotlin.coroutines.jvm.internal.draadjrbmk implements tg.rgvfuqvkyq {

        /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
        final /* synthetic */ tg.vdvldrhtss f5770cqumvgiudr;

        /* JADX INFO: renamed from: esjtqupxsv, reason: collision with root package name */
        final /* synthetic */ opjhrmiecq f5771esjtqupxsv;

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        private /* synthetic */ Object f5773jyumaefscl;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        int f5774yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        Object f5775zdlpuopuiu;

        static final class iobyxmoadg extends kotlin.coroutines.jvm.internal.draadjrbmk implements tg.rgvfuqvkyq {

            /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
            final /* synthetic */ opjhrmiecq f5776iwizpuwonk;

            /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
            final /* synthetic */ tg.vdvldrhtss f5777jyumaefscl;

            /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
            private /* synthetic */ Object f5778yggfygwlhe;

            /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
            int f5779zdlpuopuiu;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            iobyxmoadg(tg.vdvldrhtss vdvldrhtssVar, opjhrmiecq opjhrmiecqVar, lg.gxszxtbevo gxszxtbevoVar) {
                super(2, gxszxtbevoVar);
                this.f5777jyumaefscl = vdvldrhtssVar;
                this.f5776iwizpuwonk = opjhrmiecqVar;
            }

            @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
            public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
                iobyxmoadg iobyxmoadgVar = new iobyxmoadg(this.f5777jyumaefscl, this.f5776iwizpuwonk, gxszxtbevoVar);
                iobyxmoadgVar.f5778yggfygwlhe = obj;
                return iobyxmoadgVar;
            }

            @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
            public final Object invokeSuspend(Object obj) {
                Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
                int i13 = this.f5779zdlpuopuiu;
                if (i13 == 0) {
                    gg.zdlpuopuiu.zoijcleaow(obj);
                    pj.cllcsxoeiz cllcsxoeizVar = (pj.cllcsxoeiz) this.f5778yggfygwlhe;
                    tg.vdvldrhtss vdvldrhtssVar = this.f5777jyumaefscl;
                    opjhrmiecq opjhrmiecqVar = this.f5776iwizpuwonk;
                    this.f5779zdlpuopuiu = 1;
                    if (vdvldrhtssVar.invoke(cllcsxoeizVar, opjhrmiecqVar, this) == objGxszxtbevo) {
                        return objGxszxtbevo;
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
            public final Object invoke(pj.cllcsxoeiz cllcsxoeizVar, lg.gxszxtbevo gxszxtbevoVar) {
                return ((iobyxmoadg) create(cllcsxoeizVar, gxszxtbevoVar)).invokeSuspend(gg.wwaezpbzkn.f37140iobyxmoadg);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        gxszxtbevo(tg.vdvldrhtss vdvldrhtssVar, opjhrmiecq opjhrmiecqVar, lg.gxszxtbevo gxszxtbevoVar) {
            super(2, gxszxtbevoVar);
            this.f5770cqumvgiudr = vdvldrhtssVar;
            this.f5771esjtqupxsv = opjhrmiecqVar;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX WARN: Code duplicated, block: B:27:0x0079 A[DONT_INVERT] */
        /* JADX WARN: Code duplicated, block: B:28:0x007b A[Catch: all -> 0x006f, LOOP:0: B:11:0x0033->B:28:0x007b, LOOP_END, TryCatch #0 {all -> 0x006f, blocks: (B:4:0x0008, B:6:0x001a, B:8:0x0022, B:11:0x0033, B:13:0x0043, B:15:0x004f, B:17:0x0058, B:19:0x0061, B:24:0x0071, B:25:0x0074, B:28:0x007b, B:38:0x00a3, B:29:0x007d, B:30:0x0083, B:32:0x0089, B:34:0x0091, B:37:0x009f), top: B:48:0x0008 }] */
        /* JADX WARN: Code duplicated, block: B:51:0x00a3 A[EDGE_INSN: B:51:0x00a3->B:38:0x00a3 BREAK  A[LOOP:0: B:11:0x0033->B:28:0x007b], SYNTHETIC] */
        public static final gg.wwaezpbzkn kcexrzcfyt(n nVar, Set set, androidx.compose.runtime.snapshots.lqeggnwhkg lqeggnwhkgVar) {
            pj.agtfadlqog agtfadlqogVarCzzsidtyhn;
            synchronized (nVar.f5759ppxfxbqfkf) {
                try {
                    if (((wkgbmnqykc) nVar.f5750iwizpuwonk.getValue()).compareTo(wkgbmnqykc.Idle) >= 0) {
                        androidx.collection.wypolnanlu wypolnanluVar = nVar.f5755nufgyqmvbu;
                        if (set instanceof ipoelvxyzq.eablkybsjg) {
                            androidx.collection.vipkmwdibw vipkmwdibwVarIobyxmoadg = ((ipoelvxyzq.eablkybsjg) set).iobyxmoadg();
                            Object[] objArr = vipkmwdibwVarIobyxmoadg.f4398zoijcleaow;
                            long[] jArr = vipkmwdibwVarIobyxmoadg.f4395iobyxmoadg;
                            int length = jArr.length - 2;
                            if (length >= 0) {
                                int i13 = 0;
                                while (true) {
                                    long j13 = jArr[i13];
                                    if ((((~j13) << 7) & j13 & (-9187201950435737472L)) == -9187201950435737472L) {
                                        if (i13 != length) {
                                            break;
                                            break;
                                        }
                                        i13++;
                                    } else {
                                        int i14 = 8 - ((~(i13 - length)) >>> 31);
                                        for (int i15 = 0; i15 < i14; i15++) {
                                            if ((255 & j13) < 128) {
                                                Object obj = objArr[(i13 << 3) + i15];
                                                if (!(obj instanceof yzdjzghtvl.pmvmpeiblj) || ((yzdjzghtvl.pmvmpeiblj) obj).jlmebxxoox(androidx.compose.runtime.snapshots.eablkybsjg.iobyxmoadg(1))) {
                                                    wypolnanluVar.nufgyqmvbu(obj);
                                                }
                                            }
                                            j13 >>= 8;
                                        }
                                        if (i14 != 8) {
                                            break;
                                        }
                                        if (i13 != length) {
                                            break;
                                        }
                                        i13++;
                                    }
                                }
                            }
                        } else {
                            for (Object obj2 : set) {
                                if (!(obj2 instanceof yzdjzghtvl.pmvmpeiblj) || ((yzdjzghtvl.pmvmpeiblj) obj2).jlmebxxoox(androidx.compose.runtime.snapshots.eablkybsjg.iobyxmoadg(1))) {
                                    wypolnanluVar.nufgyqmvbu(obj2);
                                }
                            }
                        }
                        agtfadlqogVarCzzsidtyhn = nVar.czzsidtyhn();
                    } else {
                        agtfadlqogVarCzzsidtyhn = null;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            if (agtfadlqogVarCzzsidtyhn != null) {
                gg.kcexrzcfyt.iobyxmoadg iobyxmoadgVar = gg.kcexrzcfyt.f37117yggfygwlhe;
                agtfadlqogVarCzzsidtyhn.resumeWith(gg.kcexrzcfyt.wkgbmnqykc(gg.wwaezpbzkn.f37140iobyxmoadg));
            }
            return gg.wwaezpbzkn.f37140iobyxmoadg;
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
            gxszxtbevo gxszxtbevoVar2 = n.this.new gxszxtbevo(this.f5770cqumvgiudr, this.f5771esjtqupxsv, gxszxtbevoVar);
            gxszxtbevoVar2.f5773jyumaefscl = obj;
            return gxszxtbevoVar2;
        }

        /* JADX WARN: Code duplicated, block: B:26:0x0096 A[Catch: all -> 0x009a, TryCatch #3 {all -> 0x009a, blocks: (B:24:0x0090, B:26:0x0096, B:29:0x009c), top: B:54:0x0090 }] */
        /* JADX WARN: Code duplicated, block: B:39:0x00c2 A[Catch: all -> 0x00c6, TryCatch #0 {all -> 0x00c6, blocks: (B:37:0x00bc, B:39:0x00c2, B:42:0x00c8), top: B:48:0x00bc }] */
        /* JADX WARN: Code duplicated, block: B:48:0x00bc A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:54:0x0090 A[EXC_TOP_SPLITTER, SYNTHETIC] */
        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) throws Throwable {
            pj.auzgnhcxok auzgnhcxokVarGtknphoqwx;
            yzdjzghtvl.ppxfxbqfkf ppxfxbqfkfVar;
            Throwable th2;
            Object obj2;
            n nVar;
            Object obj3;
            n nVar2;
            Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
            int i13 = this.f5774yggfygwlhe;
            if (i13 != 0) {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ppxfxbqfkfVar = (yzdjzghtvl.ppxfxbqfkf) this.f5775zdlpuopuiu;
                auzgnhcxokVarGtknphoqwx = (pj.auzgnhcxok) this.f5773jyumaefscl;
                try {
                    gg.zdlpuopuiu.zoijcleaow(obj);
                    ppxfxbqfkfVar.iobyxmoadg();
                    obj3 = n.this.f5759ppxfxbqfkf;
                    nVar2 = n.this;
                    synchronized (obj3) {
                        try {
                            if (nVar2.f5763wkgbmnqykc == auzgnhcxokVarGtknphoqwx) {
                                nVar2.f5763wkgbmnqykc = null;
                            }
                            nVar2.czzsidtyhn();
                        } catch (Throwable th3) {
                            throw th3;
                        }
                    }
                    n.f5738istkbnxepw.wkgbmnqykc(n.this.f5767zynmafqrjb);
                    return gg.wwaezpbzkn.f37140iobyxmoadg;
                } catch (Throwable th4) {
                    th2 = th4;
                    ppxfxbqfkfVar.iobyxmoadg();
                    obj2 = n.this.f5759ppxfxbqfkf;
                    nVar = n.this;
                    synchronized (obj2) {
                        try {
                            if (nVar.f5763wkgbmnqykc == auzgnhcxokVarGtknphoqwx) {
                                nVar.f5763wkgbmnqykc = null;
                            }
                            nVar.czzsidtyhn();
                            n.f5738istkbnxepw.wkgbmnqykc(n.this.f5767zynmafqrjb);
                            throw th2;
                        } catch (Throwable th5) {
                            throw th5;
                        }
                    }
                }
            }
            gg.zdlpuopuiu.zoijcleaow(obj);
            auzgnhcxokVarGtknphoqwx = pj.dvvnrvtcbc.gtknphoqwx(((pj.cllcsxoeiz) this.f5773jyumaefscl).getCoroutineContext());
            n.this.ipoelvxyzq(auzgnhcxokVarGtknphoqwx);
            androidx.compose.runtime.snapshots.lqeggnwhkg.iobyxmoadg iobyxmoadgVar = androidx.compose.runtime.snapshots.lqeggnwhkg.f6010eablkybsjg;
            final n nVar3 = n.this;
            yzdjzghtvl.ppxfxbqfkf ppxfxbqfkfVarDxjokdxxww = iobyxmoadgVar.dxjokdxxww(new tg.rgvfuqvkyq() { // from class: androidx.compose.runtime.o
                @Override // tg.rgvfuqvkyq
                public final Object invoke(Object obj4, Object obj5) {
                    return n.gxszxtbevo.kcexrzcfyt(nVar3, (Set) obj4, (androidx.compose.runtime.snapshots.lqeggnwhkg) obj5);
                }
            });
            n.f5738istkbnxepw.ppxfxbqfkf(n.this.f5767zynmafqrjb);
            try {
                List listZeieaojujs = n.this.zeieaojujs();
                int size = listZeieaojujs.size();
                for (int i14 = 0; i14 < size; i14++) {
                    ((dsvhmnatus) listZeieaojujs.get(i14)).pmvmpeiblj();
                }
                iobyxmoadg iobyxmoadgVar2 = new iobyxmoadg(this.f5770cqumvgiudr, this.f5771esjtqupxsv, null);
                this.f5773jyumaefscl = auzgnhcxokVarGtknphoqwx;
                this.f5775zdlpuopuiu = ppxfxbqfkfVarDxjokdxxww;
                this.f5774yggfygwlhe = 1;
                if (pj.dsvhmnatus.gxszxtbevo(iobyxmoadgVar2, this) == objGxszxtbevo) {
                    return objGxszxtbevo;
                }
                ppxfxbqfkfVar = ppxfxbqfkfVarDxjokdxxww;
                ppxfxbqfkfVar.iobyxmoadg();
                obj3 = n.this.f5759ppxfxbqfkf;
                nVar2 = n.this;
                synchronized (obj3) {
                    if (nVar2.f5763wkgbmnqykc == auzgnhcxokVarGtknphoqwx) {
                        nVar2.f5763wkgbmnqykc = null;
                    }
                    nVar2.czzsidtyhn();
                    n.f5738istkbnxepw.wkgbmnqykc(n.this.f5767zynmafqrjb);
                    return gg.wwaezpbzkn.f37140iobyxmoadg;
                }
            } catch (Throwable th6) {
                ppxfxbqfkfVar = ppxfxbqfkfVarDxjokdxxww;
                th2 = th6;
                ppxfxbqfkfVar.iobyxmoadg();
                obj2 = n.this.f5759ppxfxbqfkf;
                nVar = n.this;
                synchronized (obj2) {
                    if (nVar.f5763wkgbmnqykc == auzgnhcxokVarGtknphoqwx) {
                        nVar.f5763wkgbmnqykc = null;
                    }
                    nVar.czzsidtyhn();
                }
                n.f5738istkbnxepw.wkgbmnqykc(n.this.f5767zynmafqrjb);
                throw th2;
            }
        }

        @Override // tg.rgvfuqvkyq
        public final Object invoke(pj.cllcsxoeiz cllcsxoeizVar, lg.gxszxtbevo gxszxtbevoVar) {
            return ((gxszxtbevo) create(cllcsxoeizVar, gxszxtbevoVar)).invokeSuspend(gg.wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    public static final class iobyxmoadg {
        public /* synthetic */ iobyxmoadg(kotlin.jvm.internal.gtknphoqwx gtknphoqwxVar) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void ppxfxbqfkf(ppxfxbqfkf ppxfxbqfkfVar) {
            grlcpdaxtj.gxszxtbevo gxszxtbevoVar;
            grlcpdaxtj.gxszxtbevo gxszxtbevoVarAdd;
            do {
                gxszxtbevoVar = (grlcpdaxtj.gxszxtbevo) n.f5739yadqdtsiqt.getValue();
                gxszxtbevoVarAdd = gxszxtbevoVar.add((Object) ppxfxbqfkfVar);
                if (gxszxtbevoVar == gxszxtbevoVarAdd) {
                    return;
                }
            } while (!n.f5739yadqdtsiqt.compareAndSet(gxszxtbevoVar, gxszxtbevoVarAdd));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void wkgbmnqykc(ppxfxbqfkf ppxfxbqfkfVar) {
            grlcpdaxtj.gxszxtbevo gxszxtbevoVar;
            grlcpdaxtj.gxszxtbevo gxszxtbevoVarRemove;
            do {
                gxszxtbevoVar = (grlcpdaxtj.gxszxtbevo) n.f5739yadqdtsiqt.getValue();
                gxszxtbevoVarRemove = gxszxtbevoVar.remove((Object) ppxfxbqfkfVar);
                if (gxszxtbevoVar == gxszxtbevoVarRemove) {
                    return;
                }
            } while (!n.f5739yadqdtsiqt.compareAndSet(gxszxtbevoVar, gxszxtbevoVarRemove));
        }

        private iobyxmoadg() {
        }
    }

    static final class lqeggnwhkg extends kotlin.coroutines.jvm.internal.draadjrbmk implements tg.vdvldrhtss {

        /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
        Object f5781cqumvgiudr;

        /* JADX INFO: renamed from: esjtqupxsv, reason: collision with root package name */
        Object f5782esjtqupxsv;

        /* JADX INFO: renamed from: istkbnxepw, reason: collision with root package name */
        /* synthetic */ Object f5783istkbnxepw;

        /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
        Object f5784iwizpuwonk;

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        Object f5785jyumaefscl;

        /* JADX INFO: renamed from: lereixgezr, reason: collision with root package name */
        Object f5786lereixgezr;

        /* JADX INFO: renamed from: pmvmpeiblj, reason: collision with root package name */
        Object f5787pmvmpeiblj;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        Object f5788yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        Object f5789zdlpuopuiu;

        /* JADX INFO: renamed from: zynmafqrjb, reason: collision with root package name */
        int f5790zynmafqrjb;

        lqeggnwhkg(lg.gxszxtbevo gxszxtbevoVar) {
            super(3, gxszxtbevoVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX WARN: Code duplicated, block: B:117:0x01f7  */
        /* JADX WARN: Code duplicated, block: B:120:0x0204 A[Catch: all -> 0x0226, TryCatch #6 {all -> 0x0226, blocks: (B:115:0x01ee, B:118:0x01f8, B:120:0x0204, B:122:0x0210, B:124:0x0218), top: B:257:0x01ee, outer: #0 }] */
        /* JADX WARN: Code duplicated, block: B:122:0x0210 A[Catch: all -> 0x0226, TryCatch #6 {all -> 0x0226, blocks: (B:115:0x01ee, B:118:0x01f8, B:120:0x0204, B:122:0x0210, B:124:0x0218), top: B:257:0x01ee, outer: #0 }] */
        /* JADX WARN: Code duplicated, block: B:124:0x0218 A[Catch: all -> 0x0226, TRY_LEAVE, TryCatch #6 {all -> 0x0226, blocks: (B:115:0x01ee, B:118:0x01f8, B:120:0x0204, B:122:0x0210, B:124:0x0218), top: B:257:0x01ee, outer: #0 }] */
        /* JADX WARN: Code duplicated, block: B:132:0x0239  */
        /* JADX WARN: Code duplicated, block: B:134:0x0241 A[LOOP:2: B:118:0x01f8->B:134:0x0241, LOOP_END] */
        /* JADX WARN: Code duplicated, block: B:257:0x01ee A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:292:0x0282 A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:301:0x0246 A[EDGE_INSN: B:301:0x0246->B:135:0x0246 BREAK  A[LOOP:2: B:118:0x01f8->B:134:0x0241], SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:302:0x0246 A[EDGE_INSN: B:302:0x0246->B:135:0x0246 BREAK  A[LOOP:2: B:118:0x01f8->B:134:0x0241], SYNTHETIC] */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v0 */
        /* JADX WARN: Type inference failed for: r0v3, types: [boolean, int] */
        /* JADX WARN: Type inference failed for: r11v0 */
        /* JADX WARN: Type inference failed for: r11v1 */
        /* JADX WARN: Type inference failed for: r11v10, types: [androidx.compose.runtime.snapshots.lqeggnwhkg] */
        /* JADX WARN: Type inference failed for: r11v11 */
        /* JADX WARN: Type inference failed for: r11v12 */
        /* JADX WARN: Type inference failed for: r11v13, types: [androidx.compose.runtime.snapshots.lqeggnwhkg] */
        /* JADX WARN: Type inference failed for: r11v14 */
        /* JADX WARN: Type inference failed for: r11v15 */
        /* JADX WARN: Type inference failed for: r11v16 */
        /* JADX WARN: Type inference failed for: r11v17 */
        /* JADX WARN: Type inference failed for: r11v18, types: [androidx.compose.runtime.snapshots.lqeggnwhkg] */
        /* JADX WARN: Type inference failed for: r11v20, types: [androidx.compose.runtime.snapshots.lqeggnwhkg] */
        /* JADX WARN: Type inference failed for: r11v21 */
        /* JADX WARN: Type inference failed for: r11v22 */
        /* JADX WARN: Type inference failed for: r11v23 */
        /* JADX WARN: Type inference failed for: r11v4 */
        /* JADX WARN: Type inference failed for: r11v5 */
        /* JADX WARN: Type inference failed for: r11v6 */
        /* JADX WARN: Type inference failed for: r12v0 */
        /* JADX WARN: Type inference failed for: r12v1, types: [androidx.collection.vipkmwdibw] */
        /* JADX WARN: Type inference failed for: r12v12 */
        /* JADX WARN: Type inference failed for: r12v13 */
        /* JADX WARN: Type inference failed for: r12v14, types: [androidx.compose.runtime.snapshots.lqeggnwhkg] */
        /* JADX WARN: Type inference failed for: r12v15 */
        /* JADX WARN: Type inference failed for: r12v16 */
        /* JADX WARN: Type inference failed for: r12v17 */
        /* JADX WARN: Type inference failed for: r12v18, types: [androidx.compose.runtime.snapshots.lqeggnwhkg] */
        /* JADX WARN: Type inference failed for: r12v28, types: [int] */
        /* JADX WARN: Type inference failed for: r12v29, types: [androidx.compose.runtime.snapshots.lqeggnwhkg] */
        /* JADX WARN: Type inference failed for: r14v0 */
        /* JADX WARN: Type inference failed for: r14v1, types: [androidx.collection.vipkmwdibw, androidx.collection.wypolnanlu] */
        /* JADX WARN: Type inference failed for: r28v0, types: [androidx.collection.vipkmwdibw, androidx.collection.wypolnanlu] */
        /* JADX WARN: Type inference failed for: r31v0, types: [androidx.collection.vipkmwdibw, androidx.collection.wypolnanlu] */
        /* JADX WARN: Type inference failed for: r33v0, types: [androidx.collection.vipkmwdibw, androidx.collection.wypolnanlu] */
        /* JADX WARN: Type inference failed for: r6v11 */
        /* JADX WARN: Type inference failed for: r6v14 */
        /* JADX WARN: Type inference failed for: r6v15, types: [androidx.compose.runtime.snapshots.lqeggnwhkg] */
        /* JADX WARN: Type inference failed for: r6v16 */
        /* JADX WARN: Type inference failed for: r6v17 */
        /* JADX WARN: Type inference failed for: r6v18 */
        /* JADX WARN: Type inference failed for: r6v19 */
        /* JADX WARN: Type inference failed for: r6v2 */
        /* JADX WARN: Type inference failed for: r6v20 */
        /* JADX WARN: Type inference failed for: r6v22, types: [androidx.collection.wypolnanlu] */
        /* JADX WARN: Type inference failed for: r6v23 */
        /* JADX WARN: Type inference failed for: r6v39 */
        /* JADX WARN: Type inference failed for: r6v40 */
        /* JADX WARN: Type inference failed for: r6v41 */
        public static final gg.wwaezpbzkn jyumaefscl(n nVar, androidx.collection.wypolnanlu wypolnanluVar, androidx.collection.wypolnanlu wypolnanluVar2, List list, List list2, androidx.collection.wypolnanlu wypolnanluVar3, List list3, androidx.collection.wypolnanlu wypolnanluVar4, Set set, long j13) {
            boolean z13;
            gg.wwaezpbzkn wwaezpbzknVar;
            int i13;
            ?? r13;
            androidx.compose.runtime.snapshots.lqeggnwhkg lqeggnwhkgVar;
            ?? r14;
            Object[] objArr;
            long[] jArr;
            int length;
            int i14;
            long j14;
            int i15;
            int i16;
            ?? r15 = list2;
            wypolnanluVar3 = wypolnanluVar3;
            wypolnanluVar4 = wypolnanluVar4;
            ?? r16 = 1;
            if (nVar.oipsdeybqn()) {
                ezmngbhpjk.jyumaefscl jyumaefsclVar = ezmngbhpjk.jyumaefscl.f32436iobyxmoadg;
                Object objIobyxmoadg = jyumaefsclVar.iobyxmoadg("Recomposer:animation");
                try {
                    nVar.f5766zoijcleaow.kcexrzcfyt(j13);
                    androidx.compose.runtime.snapshots.lqeggnwhkg.f6010eablkybsjg.agtfadlqog();
                    gg.wwaezpbzkn wwaezpbzknVar2 = gg.wwaezpbzkn.f37140iobyxmoadg;
                    jyumaefsclVar.zoijcleaow(objIobyxmoadg);
                } catch (Throwable th2) {
                    ezmngbhpjk.jyumaefscl.f32436iobyxmoadg.zoijcleaow(objIobyxmoadg);
                    throw th2;
                }
            }
            Object objIobyxmoadg2 = ezmngbhpjk.jyumaefscl.f32436iobyxmoadg.iobyxmoadg("Recomposer:recompose");
            try {
                nVar.fiwbwshyhd();
                synchronized (nVar.f5759ppxfxbqfkf) {
                    try {
                        ipoelvxyzq.ppxfxbqfkf ppxfxbqfkfVar = nVar.f5744dxjokdxxww;
                        Object[] objArr2 = ppxfxbqfkfVar.f49169zdlpuopuiu;
                        int iDraadjrbmk = ppxfxbqfkfVar.draadjrbmk();
                        z13 = false;
                        for (int i17 = 0; i17 < iDraadjrbmk; i17++) {
                            list.add((dsvhmnatus) objArr2[i17]);
                        }
                        nVar.f5744dxjokdxxww.nufgyqmvbu();
                        gg.wwaezpbzkn wwaezpbzknVar3 = gg.wwaezpbzkn.f37140iobyxmoadg;
                    } catch (Throwable th3) {
                        throw th3;
                    }
                }
                wypolnanluVar.wflxmlrfwp();
                wypolnanluVar2.wflxmlrfwp();
                while (true) {
                    if (list.isEmpty() && list2.isEmpty()) {
                        break;
                    }
                    try {
                        int size = list.size();
                        for (int i18 = 0; i18 < size; i18++) {
                            try {
                                dsvhmnatus dsvhmnatusVar = (dsvhmnatus) list.get(i18);
                                dsvhmnatus dsvhmnatusVarIwxlajgraz = nVar.iwxlajgraz(dsvhmnatusVar, wypolnanluVar);
                                if (dsvhmnatusVarIwxlajgraz != null) {
                                    try {
                                        list3.add(dsvhmnatusVarIwxlajgraz);
                                        gg.wwaezpbzkn wwaezpbzknVar4 = gg.wwaezpbzkn.f37140iobyxmoadg;
                                    } catch (Throwable th4) {
                                        th = th4;
                                        try {
                                            n.igdgnonuha(nVar, th, null, true, 2, null);
                                            zdlpuopuiu(nVar, list, list2, list3, wypolnanluVar3, wypolnanluVar4, wypolnanluVar, wypolnanluVar2);
                                            wwaezpbzknVar = gg.wwaezpbzkn.f37140iobyxmoadg;
                                            list.clear();
                                            ezmngbhpjk.jyumaefscl.f32436iobyxmoadg.zoijcleaow(objIobyxmoadg2);
                                            return wwaezpbzknVar;
                                        } catch (Throwable th5) {
                                            list.clear();
                                            throw th5;
                                        }
                                    }
                                }
                                wypolnanluVar2.nufgyqmvbu(dsvhmnatusVar);
                            } catch (Throwable th6) {
                                th = th6;
                            }
                        }
                        list.clear();
                        if (wypolnanluVar.eablkybsjg() || nVar.f5744dxjokdxxww.draadjrbmk() != 0) {
                            synchronized (nVar.f5759ppxfxbqfkf) {
                                try {
                                    List listNuxfzjnpeb = nVar.nuxfzjnpeb();
                                    int size2 = listNuxfzjnpeb.size();
                                    for (int i19 = 0; i19 < size2; i19++) {
                                        dsvhmnatus dsvhmnatusVar2 = (dsvhmnatus) listNuxfzjnpeb.get(i19);
                                        if (!wypolnanluVar2.iobyxmoadg(dsvhmnatusVar2) && dsvhmnatusVar2.rgvfuqvkyq(set)) {
                                            list.add(dsvhmnatusVar2);
                                        }
                                    }
                                    ipoelvxyzq.ppxfxbqfkf ppxfxbqfkfVar2 = nVar.f5744dxjokdxxww;
                                    int iDraadjrbmk2 = ppxfxbqfkfVar2.draadjrbmk();
                                    int i23 = 0;
                                    int i24 = 0;
                                    while (i23 < iDraadjrbmk2) {
                                        dsvhmnatus dsvhmnatusVar3 = (dsvhmnatus) ppxfxbqfkfVar2.f49169zdlpuopuiu[i23];
                                        if (wypolnanluVar2.iobyxmoadg(dsvhmnatusVar3) || list.contains(dsvhmnatusVar3)) {
                                            if (i24 > 0) {
                                                Object[] objArr3 = ppxfxbqfkfVar2.f49169zdlpuopuiu;
                                                objArr3[i23 - i24] = objArr3[i23];
                                            }
                                            i13 = 1;
                                        } else {
                                            list.add(dsvhmnatusVar3);
                                            i13 = 1;
                                            i24++;
                                        }
                                        i23 += i13;
                                    }
                                    r16 = 1;
                                    int i25 = iDraadjrbmk2 - i24;
                                    hg.agtfadlqog.lereixgezr(ppxfxbqfkfVar2.f49169zdlpuopuiu, null, i25, iDraadjrbmk2);
                                    ppxfxbqfkfVar2.iwizpuwonk(i25);
                                    gg.wwaezpbzkn wwaezpbzknVar5 = gg.wwaezpbzkn.f37140iobyxmoadg;
                                } catch (Throwable th7) {
                                    throw th7;
                                }
                            }
                        } else {
                            r16 = 1;
                        }
                        if (list.isEmpty()) {
                            try {
                                yggfygwlhe(list2, nVar);
                                while (!list2.isEmpty()) {
                                    try {
                                        wypolnanluVar3.iwizpuwonk(nVar.auzgnhcxok(list2, wypolnanluVar));
                                        yggfygwlhe(list2, nVar);
                                    } catch (Throwable th8) {
                                        th = th8;
                                        n.igdgnonuha(nVar, th, null, true, 2, null);
                                        zdlpuopuiu(nVar, list, list2, list3, wypolnanluVar3, wypolnanluVar4, wypolnanluVar, wypolnanluVar2);
                                        wwaezpbzknVar = gg.wwaezpbzkn.f37140iobyxmoadg;
                                        ezmngbhpjk.jyumaefscl.f32436iobyxmoadg.zoijcleaow(objIobyxmoadg2);
                                        return wwaezpbzknVar;
                                    }
                                }
                                r15 = list2;
                                z13 = false;
                            } catch (Throwable th9) {
                                th = th9;
                            }
                        } else {
                            z13 = false;
                            r15 = list2;
                        }
                    } catch (Throwable th10) {
                        th = th10;
                    }
                    ezmngbhpjk.jyumaefscl.f32436iobyxmoadg.zoijcleaow(objIobyxmoadg2);
                    return wwaezpbzknVar;
                }
                androidx.compose.runtime.snapshots.lqeggnwhkg lqeggnwhkgVarPpxfxbqfkf = androidx.compose.runtime.snapshots.lqeggnwhkg.f6010eablkybsjg.ppxfxbqfkf();
                ?? wflxmlrfwpVar = lqeggnwhkgVarPpxfxbqfkf instanceof androidx.compose.runtime.snapshots.zoijcleaow ? new androidx.compose.runtime.snapshots.wflxmlrfwp((androidx.compose.runtime.snapshots.zoijcleaow) lqeggnwhkgVarPpxfxbqfkf, null, null, true, false) : new androidx.compose.runtime.snapshots.agtfadlqog(lqeggnwhkgVarPpxfxbqfkf, null, r16, z13);
                try {
                    try {
                        androidx.compose.runtime.snapshots.lqeggnwhkg lqeggnwhkgVarDraadjrbmk = wflxmlrfwpVar.draadjrbmk();
                        try {
                            try {
                                if (list3.isEmpty()) {
                                    lqeggnwhkgVar = lqeggnwhkgVarDraadjrbmk;
                                } else {
                                    try {
                                        try {
                                            nVar.f5749iobyxmoadg = nVar.sflfametgt() + 1;
                                            try {
                                                int size3 = list3.size();
                                                for (int i26 = 0; i26 < size3; i26 += r16) {
                                                    wypolnanluVar4.nufgyqmvbu((dsvhmnatus) list3.get(i26));
                                                }
                                                int size4 = list3.size();
                                                for (int i27 = 0; i27 < size4; i27 += r16) {
                                                    ((dsvhmnatus) list3.get(i27)).kcexrzcfyt();
                                                }
                                                try {
                                                    list3.clear();
                                                    lqeggnwhkgVar = lqeggnwhkgVarDraadjrbmk;
                                                } catch (Throwable th11) {
                                                    th = th11;
                                                    wypolnanluVar3 = lqeggnwhkgVarDraadjrbmk;
                                                    wflxmlrfwpVar = wflxmlrfwpVar;
                                                    wflxmlrfwpVar.kcexrzcfyt(wypolnanluVar3);
                                                    throw th;
                                                }
                                            } catch (Throwable th12) {
                                                r15 = wflxmlrfwpVar;
                                                wflxmlrfwpVar = 0;
                                                try {
                                                    n.igdgnonuha(nVar, th12, null, false, 6, null);
                                                    wflxmlrfwpVar = wypolnanluVar4;
                                                    zdlpuopuiu(nVar, list, list2, list3, wypolnanluVar3, wflxmlrfwpVar, wypolnanluVar, wypolnanluVar2);
                                                    wwaezpbzknVar = gg.wwaezpbzkn.f37140iobyxmoadg;
                                                    try {
                                                        list3.clear();
                                                        r15.kcexrzcfyt(lqeggnwhkgVarDraadjrbmk);
                                                        r14 = r15;
                                                        r14.wkgbmnqykc();
                                                        ezmngbhpjk.jyumaefscl.f32436iobyxmoadg.zoijcleaow(objIobyxmoadg2);
                                                        return wwaezpbzknVar;
                                                    } catch (Throwable th13) {
                                                        th = th13;
                                                        r13 = lqeggnwhkgVarDraadjrbmk;
                                                        wflxmlrfwpVar = r15;
                                                        wypolnanluVar3 = r13;
                                                        wflxmlrfwpVar.kcexrzcfyt(wypolnanluVar3);
                                                        throw th;
                                                    }
                                                } catch (Throwable th14) {
                                                    list3.clear();
                                                    throw th14;
                                                }
                                            }
                                        } catch (Throwable th15) {
                                            th = th15;
                                            wflxmlrfwpVar = wflxmlrfwpVar;
                                            r13 = lqeggnwhkgVarDraadjrbmk;
                                        }
                                    } catch (Throwable th16) {
                                        th = th16;
                                        wflxmlrfwpVar = wflxmlrfwpVar;
                                        r13 = lqeggnwhkgVarDraadjrbmk;
                                    }
                                }
                                char c13 = 7;
                                try {
                                    if (!wypolnanluVar3.eablkybsjg()) {
                                        wypolnanluVar3 = lqeggnwhkgVar;
                                        if (wypolnanluVar4.eablkybsjg()) {
                                            objArr = wypolnanluVar4.f4398zoijcleaow;
                                            jArr = wypolnanluVar4.f4395iobyxmoadg;
                                            length = jArr.length - 2;
                                            if (length >= 0) {
                                                i14 = 0;
                                                while (true) {
                                                    j14 = jArr[i14];
                                                    if ((((~j14) << 7) & j14 & (-9187201950435737472L)) != -9187201950435737472L) {
                                                        i15 = 8 - ((~(i14 - length)) >>> 31);
                                                        for (i16 = 0; i16 < i15; i16++) {
                                                            if ((j14 & 255) < 128) {
                                                                ((dsvhmnatus) objArr[(i14 << 3) + i16]).lereixgezr();
                                                            }
                                                            j14 >>= 8;
                                                        }
                                                        if (i15 == 8) {
                                                            break;
                                                            break;
                                                        }
                                                    }
                                                    if (i14 != length) {
                                                        break;
                                                        break;
                                                    }
                                                    i14++;
                                                }
                                            }
                                            wypolnanluVar4.wflxmlrfwp();
                                        }
                                        gg.wwaezpbzkn wwaezpbzknVar6 = gg.wwaezpbzkn.f37140iobyxmoadg;
                                        wflxmlrfwpVar.kcexrzcfyt(wypolnanluVar3);
                                        wflxmlrfwpVar.wkgbmnqykc();
                                        synchronized (nVar.f5759ppxfxbqfkf) {
                                            nVar.czzsidtyhn();
                                            androidx.compose.runtime.snapshots.lqeggnwhkg.f6010eablkybsjg.lqeggnwhkg();
                                            wypolnanluVar2.wflxmlrfwp();
                                            wypolnanluVar.wflxmlrfwp();
                                            nVar.f5761vdvldrhtss = null;
                                            ezmngbhpjk.jyumaefscl.f32436iobyxmoadg.zoijcleaow(objIobyxmoadg2);
                                            return gg.wwaezpbzkn.f37140iobyxmoadg;
                                        }
                                    }
                                    try {
                                        wypolnanluVar4.jyumaefscl(wypolnanluVar3);
                                        Object[] objArr4 = wypolnanluVar3.f4398zoijcleaow;
                                        long[] jArr2 = wypolnanluVar3.f4395iobyxmoadg;
                                        int length2 = jArr2.length - 2;
                                        if (length2 >= 0) {
                                            int i28 = length2;
                                            int i29 = 0;
                                            while (true) {
                                                long j15 = jArr2[i29];
                                                if ((((~j15) << c13) & j15 & (-9187201950435737472L)) != -9187201950435737472L) {
                                                    wypolnanluVar3 = 8 - ((~(i29 - i28)) >>> 31);
                                                    for (int i33 = 0; i33 < wypolnanluVar3; i33++) {
                                                        if ((j15 & 255) < 128) {
                                                            ((dsvhmnatus) objArr4[(i29 << 3) + i33]).dxjokdxxww();
                                                        }
                                                        j15 >>= 8;
                                                    }
                                                    if (wypolnanluVar3 != 8) {
                                                        break;
                                                    }
                                                }
                                                int i34 = i28;
                                                if (i29 == i34) {
                                                    break;
                                                }
                                                i29++;
                                                i28 = i34;
                                                c13 = 7;
                                            }
                                        }
                                        wypolnanluVar3.wflxmlrfwp();
                                        wypolnanluVar3 = lqeggnwhkgVar;
                                        if (wypolnanluVar4.eablkybsjg()) {
                                            try {
                                                objArr = wypolnanluVar4.f4398zoijcleaow;
                                                jArr = wypolnanluVar4.f4395iobyxmoadg;
                                                length = jArr.length - 2;
                                                if (length >= 0) {
                                                    i14 = 0;
                                                    while (true) {
                                                        j14 = jArr[i14];
                                                        if ((((~j14) << 7) & j14 & (-9187201950435737472L)) != -9187201950435737472L) {
                                                            i15 = 8 - ((~(i14 - length)) >>> 31);
                                                            while (i16 < i15) {
                                                                if ((j14 & 255) < 128) {
                                                                    ((dsvhmnatus) objArr[(i14 << 3) + i16]).lereixgezr();
                                                                }
                                                                j14 >>= 8;
                                                            }
                                                            if (i15 == 8) {
                                                                break;
                                                            }
                                                        }
                                                        if (i14 != length) {
                                                            break;
                                                        }
                                                        i14++;
                                                    }
                                                }
                                                wypolnanluVar4.wflxmlrfwp();
                                            } catch (Throwable th17) {
                                                try {
                                                    n.igdgnonuha(nVar, th17, null, false, 6, null);
                                                    zdlpuopuiu(nVar, list, list2, list3, wypolnanluVar3, wypolnanluVar4, wypolnanluVar, wypolnanluVar2);
                                                    wwaezpbzknVar = gg.wwaezpbzkn.f37140iobyxmoadg;
                                                    wypolnanluVar4.wflxmlrfwp();
                                                    wflxmlrfwpVar.kcexrzcfyt(wypolnanluVar3);
                                                    r14 = wflxmlrfwpVar;
                                                    r14.wkgbmnqykc();
                                                    ezmngbhpjk.jyumaefscl.f32436iobyxmoadg.zoijcleaow(objIobyxmoadg2);
                                                    return wwaezpbzknVar;
                                                } catch (Throwable th18) {
                                                    wypolnanluVar4.wflxmlrfwp();
                                                    throw th18;
                                                }
                                            }
                                        }
                                        gg.wwaezpbzkn wwaezpbzknVar7 = gg.wwaezpbzkn.f37140iobyxmoadg;
                                        wflxmlrfwpVar.kcexrzcfyt(wypolnanluVar3);
                                        wflxmlrfwpVar.wkgbmnqykc();
                                        synchronized (nVar.f5759ppxfxbqfkf) {
                                            nVar.czzsidtyhn();
                                        }
                                        androidx.compose.runtime.snapshots.lqeggnwhkg.f6010eablkybsjg.lqeggnwhkg();
                                        wypolnanluVar2.wflxmlrfwp();
                                        wypolnanluVar.wflxmlrfwp();
                                        nVar.f5761vdvldrhtss = null;
                                        ezmngbhpjk.jyumaefscl.f32436iobyxmoadg.zoijcleaow(objIobyxmoadg2);
                                        return gg.wwaezpbzkn.f37140iobyxmoadg;
                                    } catch (Throwable th19) {
                                        wypolnanluVar3 = lqeggnwhkgVar;
                                        try {
                                            n.igdgnonuha(nVar, th19, null, false, 6, null);
                                            zdlpuopuiu(nVar, list, list2, list3, wypolnanluVar3, wypolnanluVar4, wypolnanluVar, wypolnanluVar2);
                                            wwaezpbzknVar = gg.wwaezpbzkn.f37140iobyxmoadg;
                                            wypolnanluVar3.wflxmlrfwp();
                                            wflxmlrfwpVar.kcexrzcfyt(wypolnanluVar3);
                                            r14 = wflxmlrfwpVar;
                                            r14.wkgbmnqykc();
                                            ezmngbhpjk.jyumaefscl.f32436iobyxmoadg.zoijcleaow(objIobyxmoadg2);
                                            return wwaezpbzknVar;
                                        } catch (Throwable th20) {
                                            wypolnanluVar3.wflxmlrfwp();
                                            throw th20;
                                        }
                                    }
                                } catch (Throwable th21) {
                                    th = th21;
                                    wflxmlrfwpVar.kcexrzcfyt(wypolnanluVar3);
                                    throw th;
                                }
                            } catch (Throwable th22) {
                                th = th22;
                                r13 = wflxmlrfwpVar;
                                wflxmlrfwpVar = r15;
                            }
                        } catch (Throwable th23) {
                            th = th23;
                            wypolnanluVar3 = lqeggnwhkgVarDraadjrbmk;
                        }
                    } catch (Throwable th24) {
                        th = th24;
                        r15 = wflxmlrfwpVar;
                        r15.wkgbmnqykc();
                        throw th;
                    }
                } catch (Throwable th25) {
                    th = th25;
                    r15.wkgbmnqykc();
                    throw th;
                }
                ezmngbhpjk.jyumaefscl.f32436iobyxmoadg.zoijcleaow(objIobyxmoadg2);
                return wwaezpbzknVar;
            } catch (Throwable th26) {
                ezmngbhpjk.jyumaefscl.f32436iobyxmoadg.zoijcleaow(objIobyxmoadg2);
                throw th26;
            }
        }

        private static final void yggfygwlhe(List list, n nVar) {
            list.clear();
            synchronized (nVar.f5759ppxfxbqfkf) {
                try {
                    List list2 = nVar.f5747gtknphoqwx;
                    int size = list2.size();
                    for (int i13 = 0; i13 < size; i13++) {
                        list.add((nuxfzjnpeb) list2.get(i13));
                    }
                    nVar.f5747gtknphoqwx.clear();
                    gg.wwaezpbzkn wwaezpbzknVar = gg.wwaezpbzkn.f37140iobyxmoadg;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        /* JADX WARN: Code duplicated, block: B:22:0x0083 A[DONT_INVERT] */
        /* JADX WARN: Code duplicated, block: B:23:0x0085 A[Catch: all -> 0x002b, LOOP:1: B:12:0x0043->B:23:0x0085, LOOP_END, TryCatch #0 {all -> 0x002b, blocks: (B:4:0x000d, B:6:0x001a, B:9:0x002e, B:12:0x0043, B:14:0x004e, B:16:0x005a, B:18:0x0064, B:19:0x0074, B:23:0x0085, B:24:0x008e, B:27:0x009b, B:29:0x00aa, B:31:0x00b6, B:33:0x00c0, B:34:0x00ca, B:38:0x00d6, B:39:0x00d9, B:42:0x00e9, B:44:0x00f8, B:46:0x0104, B:48:0x010e, B:49:0x011e, B:55:0x013a, B:56:0x013d), top: B:61:0x000d }] */
        /* JADX WARN: Code duplicated, block: B:37:0x00d4 A[DONT_INVERT] */
        /* JADX WARN: Code duplicated, block: B:38:0x00d6 A[Catch: all -> 0x002b, LOOP:3: B:27:0x009b->B:38:0x00d6, LOOP_END, TryCatch #0 {all -> 0x002b, blocks: (B:4:0x000d, B:6:0x001a, B:9:0x002e, B:12:0x0043, B:14:0x004e, B:16:0x005a, B:18:0x0064, B:19:0x0074, B:23:0x0085, B:24:0x008e, B:27:0x009b, B:29:0x00aa, B:31:0x00b6, B:33:0x00c0, B:34:0x00ca, B:38:0x00d6, B:39:0x00d9, B:42:0x00e9, B:44:0x00f8, B:46:0x0104, B:48:0x010e, B:49:0x011e, B:55:0x013a, B:56:0x013d), top: B:61:0x000d }] */
        /* JADX WARN: Code duplicated, block: B:65:0x008e A[EDGE_INSN: B:65:0x008e->B:24:0x008e BREAK  A[LOOP:1: B:12:0x0043->B:23:0x0085], SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:70:0x00d9 A[EDGE_INSN: B:70:0x00d9->B:39:0x00d9 BREAK  A[LOOP:3: B:27:0x009b->B:38:0x00d6], SYNTHETIC] */
        private static final void zdlpuopuiu(n nVar, List list, List list2, List list3, androidx.collection.wypolnanlu wypolnanluVar, androidx.collection.wypolnanlu wypolnanluVar2, androidx.collection.wypolnanlu wypolnanluVar3, androidx.collection.wypolnanlu wypolnanluVar4) {
            synchronized (nVar.f5759ppxfxbqfkf) {
                try {
                    list.clear();
                    list2.clear();
                    int size = list3.size();
                    for (int i13 = 0; i13 < size; i13++) {
                        dsvhmnatus dsvhmnatusVar = (dsvhmnatus) list3.get(i13);
                        dsvhmnatusVar.esjtqupxsv();
                        nVar.ageimvtcrz(dsvhmnatusVar);
                    }
                    list3.clear();
                    Object[] objArr = wypolnanluVar.f4398zoijcleaow;
                    long[] jArr = wypolnanluVar.f4395iobyxmoadg;
                    int length = jArr.length - 2;
                    long j13 = -9187201950435737472L;
                    if (length >= 0) {
                        int i14 = 0;
                        while (true) {
                            long j14 = jArr[i14];
                            long[] jArr2 = jArr;
                            if ((((~j14) << 7) & j14 & j13) != j13) {
                                int i15 = 8 - ((~(i14 - length)) >>> 31);
                                for (int i16 = 0; i16 < i15; i16++) {
                                    if ((j14 & 255) < 128) {
                                        dsvhmnatus dsvhmnatusVar2 = (dsvhmnatus) objArr[(i14 << 3) + i16];
                                        dsvhmnatusVar2.esjtqupxsv();
                                        nVar.ageimvtcrz(dsvhmnatusVar2);
                                    }
                                    j14 >>= 8;
                                }
                                if (i15 != 8) {
                                    break;
                                }
                                if (i14 != length) {
                                    break;
                                }
                                i14++;
                                jArr = jArr2;
                                j13 = -9187201950435737472L;
                            } else if (i14 != length) {
                                break;
                                break;
                            } else {
                                i14++;
                                jArr = jArr2;
                                j13 = -9187201950435737472L;
                            }
                        }
                    }
                    wypolnanluVar.wflxmlrfwp();
                    Object[] objArr2 = wypolnanluVar2.f4398zoijcleaow;
                    long[] jArr3 = wypolnanluVar2.f4395iobyxmoadg;
                    int length2 = jArr3.length - 2;
                    if (length2 >= 0) {
                        int i17 = 0;
                        while (true) {
                            long j15 = jArr3[i17];
                            if ((((~j15) << 7) & j15 & (-9187201950435737472L)) == -9187201950435737472L) {
                                if (i17 != length2) {
                                    break;
                                    break;
                                }
                                i17++;
                            } else {
                                int i18 = 8 - ((~(i17 - length2)) >>> 31);
                                for (int i19 = 0; i19 < i18; i19++) {
                                    if ((j15 & 255) < 128) {
                                        ((dsvhmnatus) objArr2[(i17 << 3) + i19]).lereixgezr();
                                    }
                                    j15 >>= 8;
                                }
                                if (i18 != 8) {
                                    break;
                                } else if (i17 != length2) {
                                    break;
                                } else {
                                    i17++;
                                }
                            }
                        }
                    }
                    wypolnanluVar2.wflxmlrfwp();
                    wypolnanluVar3.wflxmlrfwp();
                    Object[] objArr3 = wypolnanluVar4.f4398zoijcleaow;
                    long[] jArr4 = wypolnanluVar4.f4395iobyxmoadg;
                    int length3 = jArr4.length - 2;
                    if (length3 >= 0) {
                        int i23 = 0;
                        while (true) {
                            long j16 = jArr4[i23];
                            if ((((~j16) << 7) & j16 & (-9187201950435737472L)) != -9187201950435737472L) {
                                int i24 = 8 - ((~(i23 - length3)) >>> 31);
                                for (int i25 = 0; i25 < i24; i25++) {
                                    if ((j16 & 255) < 128) {
                                        dsvhmnatus dsvhmnatusVar3 = (dsvhmnatus) objArr3[(i23 << 3) + i25];
                                        dsvhmnatusVar3.esjtqupxsv();
                                        nVar.ageimvtcrz(dsvhmnatusVar3);
                                    }
                                    j16 >>= 8;
                                }
                                if (i24 != 8) {
                                    break;
                                }
                            }
                            if (i23 == length3) {
                                break;
                            } else {
                                i23++;
                            }
                        }
                    }
                    wypolnanluVar4.wflxmlrfwp();
                    gg.wwaezpbzkn wwaezpbzknVar = gg.wwaezpbzkn.f37140iobyxmoadg;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        /* JADX WARN: Code duplicated, block: B:13:0x00be  */
        /* JADX WARN: Code duplicated, block: B:15:0x00da A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:16:0x00db  */
        /* JADX WARN: Code duplicated, block: B:19:0x00ed  */
        /* JADX WARN: Code duplicated, block: B:21:0x0138 A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:22:0x0139  */
        /* JADX WARN: Code duplicated, block: B:25:0x0151  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x0139 -> B:23:0x0142). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:25:0x0151 -> B:24:0x014d). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final java.lang.Object invokeSuspend(java.lang.Object r26) {
            /*
                Method dump skipped, instruction units count: 361
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.n.lqeggnwhkg.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // tg.vdvldrhtss
        /* JADX INFO: renamed from: kcexrzcfyt, reason: merged with bridge method [inline-methods] */
        public final Object invoke(pj.cllcsxoeiz cllcsxoeizVar, opjhrmiecq opjhrmiecqVar, lg.gxszxtbevo gxszxtbevoVar) {
            lqeggnwhkg lqeggnwhkgVar = n.this.new lqeggnwhkg(gxszxtbevoVar);
            lqeggnwhkgVar.f5783istkbnxepw = opjhrmiecqVar;
            return lqeggnwhkgVar.invokeSuspend(gg.wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    private final class ppxfxbqfkf {
        public ppxfxbqfkf() {
        }
    }

    public enum wkgbmnqykc {
        ShutDown,
        ShuttingDown,
        Inactive,
        InactivePendingWork,
        Idle,
        PendingWork;


        /* JADX INFO: renamed from: pmvmpeiblj, reason: collision with root package name */
        private static final /* synthetic */ ng.iobyxmoadg f5797pmvmpeiblj = ng.zoijcleaow.iobyxmoadg(iobyxmoadg());
    }

    private static final class zoijcleaow {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final boolean f5800iobyxmoadg;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final Throwable f5801zoijcleaow;

        public zoijcleaow(boolean z13, Throwable th2) {
            this.f5800iobyxmoadg = z13;
            this.f5801zoijcleaow = th2;
        }

        public Throwable iobyxmoadg() {
            return this.f5801zoijcleaow;
        }
    }

    public n(lg.btonecajqb btonecajqbVar) {
        androidx.compose.runtime.eablkybsjg eablkybsjgVar = new androidx.compose.runtime.eablkybsjg(new tg.iobyxmoadg() { // from class: androidx.compose.runtime.i
            @Override // tg.iobyxmoadg
            public final Object invoke() {
                return n.xrmfcynszj(this.f5674zdlpuopuiu);
            }
        });
        this.f5766zoijcleaow = eablkybsjgVar;
        this.f5759ppxfxbqfkf = new Object();
        this.f5748gxszxtbevo = new ArrayList();
        this.f5755nufgyqmvbu = new androidx.collection.wypolnanlu(0, 1, null);
        this.f5744dxjokdxxww = new ipoelvxyzq.ppxfxbqfkf(new dsvhmnatus[16], 0);
        this.f5741btonecajqb = new ArrayList();
        this.f5747gtknphoqwx = new ArrayList();
        this.f5743draadjrbmk = ipoelvxyzq.zoijcleaow.eablkybsjg(null, 1, null);
        this.f5762wflxmlrfwp = new skhdrjzrfn();
        this.f5740agtfadlqog = androidx.collection.ribwqtqdhb.zoijcleaow();
        this.f5756ojitshcjhn = ipoelvxyzq.zoijcleaow.eablkybsjg(null, 1, null);
        this.f5750iwizpuwonk = sj.kegysxyocb.iobyxmoadg(wkgbmnqykc.Inactive);
        this.f5742cqumvgiudr = new ezmngbhpjk.rgvfuqvkyq();
        pj.pmvmpeiblj pmvmpeibljVarIobyxmoadg = pj.dvvnrvtcbc.iobyxmoadg((pj.auzgnhcxok) btonecajqbVar.get(pj.auzgnhcxok.f76671gtknphoqwx));
        pmvmpeibljVarIobyxmoadg.pmvmpeiblj(new tg.draadjrbmk() { // from class: androidx.compose.runtime.j
            @Override // tg.draadjrbmk
            public final Object invoke(Object obj) {
                return n.yfnezrywwk(this.f5695zdlpuopuiu, (Throwable) obj);
            }
        });
        this.f5746esjtqupxsv = pmvmpeibljVarIobyxmoadg;
        this.f5753lereixgezr = btonecajqbVar.plus(eablkybsjgVar).plus(pmvmpeibljVarIobyxmoadg);
        this.f5767zynmafqrjb = new ppxfxbqfkf();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void ageimvtcrz(dsvhmnatus dsvhmnatusVar) {
        List arrayList = this.f5760rgvfuqvkyq;
        if (arrayList == null) {
            arrayList = new ArrayList();
            this.f5760rgvfuqvkyq = arrayList;
        }
        if (!arrayList.contains(dsvhmnatusVar)) {
            arrayList.add(dsvhmnatusVar);
        }
        grlcpdaxtj(dsvhmnatusVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final List auzgnhcxok(List list, androidx.collection.wypolnanlu wypolnanluVar) {
        ArrayList<gg.vdvldrhtss> arrayList;
        HashMap map = new HashMap(list.size());
        int size = list.size();
        for (int i13 = 0; i13 < size; i13++) {
            Object obj = list.get(i13);
            dsvhmnatus dsvhmnatusVarZoijcleaow = ((nuxfzjnpeb) obj).zoijcleaow();
            Object arrayList2 = map.get(dsvhmnatusVarZoijcleaow);
            if (arrayList2 == null) {
                arrayList2 = new ArrayList();
                map.put(dsvhmnatusVarZoijcleaow, arrayList2);
            }
            ((ArrayList) arrayList2).add(obj);
        }
        for (Map.Entry entry : map.entrySet()) {
            dsvhmnatus dsvhmnatusVar = (dsvhmnatus) entry.getKey();
            List list2 = (List) entry.getValue();
            if (dsvhmnatusVar.zdlpuopuiu()) {
                jyumaefscl.zdlpuopuiu("Check failed");
            }
            androidx.compose.runtime.snapshots.zoijcleaow zoijcleaowVarOjitshcjhn = androidx.compose.runtime.snapshots.lqeggnwhkg.f6010eablkybsjg.ojitshcjhn(lxfrhoxuzk(dsvhmnatusVar), fmlbqenlif(dsvhmnatusVar, wypolnanluVar));
            try {
                androidx.compose.runtime.snapshots.lqeggnwhkg lqeggnwhkgVarDraadjrbmk = zoijcleaowVarOjitshcjhn.draadjrbmk();
                try {
                    synchronized (this.f5759ppxfxbqfkf) {
                        try {
                            arrayList = new ArrayList(list2.size());
                            int size2 = list2.size();
                            for (int i14 = 0; i14 < size2; i14++) {
                                nuxfzjnpeb nuxfzjnpebVar = (nuxfzjnpeb) list2.get(i14);
                                androidx.collection.dsvhmnatus dsvhmnatusVar2 = this.f5743draadjrbmk;
                                nuxfzjnpebVar.ppxfxbqfkf();
                                Object objDraadjrbmk = ipoelvxyzq.zoijcleaow.draadjrbmk(dsvhmnatusVar2, null);
                                nuxfzjnpeb nuxfzjnpebVar2 = (nuxfzjnpeb) objDraadjrbmk;
                                if (nuxfzjnpebVar2 != null) {
                                    this.f5762wflxmlrfwp.eablkybsjg(nuxfzjnpebVar2);
                                }
                                arrayList.add(gg.cqumvgiudr.iobyxmoadg(nuxfzjnpebVar, objDraadjrbmk));
                            }
                            if (gtknphoqwx.f5643zoijcleaow) {
                                int size3 = arrayList.size();
                                for (int i15 = 0; i15 < size3; i15++) {
                                    gg.vdvldrhtss vdvldrhtssVar = (gg.vdvldrhtss) arrayList.get(i15);
                                    if (vdvldrhtssVar.nufgyqmvbu() == null) {
                                        skhdrjzrfn skhdrjzrfnVar = this.f5762wflxmlrfwp;
                                        ((nuxfzjnpeb) vdvldrhtssVar.lqeggnwhkg()).ppxfxbqfkf();
                                        if (skhdrjzrfnVar.ppxfxbqfkf(null)) {
                                            ArrayList arrayList3 = new ArrayList(hg.jyumaefscl.cqumvgiudr(arrayList, 10));
                                            for (gg.vdvldrhtss vdvldrhtssVar2 : arrayList) {
                                                if (vdvldrhtssVar2.nufgyqmvbu() == null) {
                                                    skhdrjzrfn skhdrjzrfnVar2 = this.f5762wflxmlrfwp;
                                                    ((nuxfzjnpeb) vdvldrhtssVar2.lqeggnwhkg()).ppxfxbqfkf();
                                                    skhdrjzrfnVar2.wkgbmnqykc(null);
                                                }
                                                arrayList3.add(vdvldrhtssVar2);
                                            }
                                            arrayList = arrayList3;
                                            break;
                                        }
                                    }
                                }
                            }
                        } catch (Throwable th2) {
                            throw th2;
                        }
                    }
                    int size4 = arrayList.size();
                    for (int i16 = 0; i16 < size4; i16++) {
                        if (((gg.vdvldrhtss) arrayList.get(i16)).nufgyqmvbu() != null) {
                            int size5 = arrayList.size();
                            for (int i17 = 0; i17 < size5; i17++) {
                                if (((gg.vdvldrhtss) arrayList.get(i17)).nufgyqmvbu() == null) {
                                    ArrayList arrayList4 = new ArrayList(arrayList.size());
                                    int size6 = arrayList.size();
                                    for (int i18 = 0; i18 < size6; i18++) {
                                        gg.vdvldrhtss vdvldrhtssVar3 = (gg.vdvldrhtss) arrayList.get(i18);
                                        nuxfzjnpeb nuxfzjnpebVar3 = vdvldrhtssVar3.nufgyqmvbu() == null ? (nuxfzjnpeb) vdvldrhtssVar3.lqeggnwhkg() : null;
                                        if (nuxfzjnpebVar3 != null) {
                                            arrayList4.add(nuxfzjnpebVar3);
                                        }
                                    }
                                    synchronized (this.f5759ppxfxbqfkf) {
                                        hg.jyumaefscl.istkbnxepw(this.f5747gtknphoqwx, arrayList4);
                                        gg.wwaezpbzkn wwaezpbzknVar = gg.wwaezpbzkn.f37140iobyxmoadg;
                                    }
                                    ArrayList arrayList5 = new ArrayList(arrayList.size());
                                    int size7 = arrayList.size();
                                    for (int i19 = 0; i19 < size7; i19++) {
                                        Object obj2 = arrayList.get(i19);
                                        if (((gg.vdvldrhtss) obj2).nufgyqmvbu() != null) {
                                            arrayList5.add(obj2);
                                        }
                                    }
                                    arrayList = arrayList5;
                                    break;
                                }
                            }
                            break;
                        }
                    }
                    dsvhmnatusVar.gtknphoqwx(arrayList);
                    gg.wwaezpbzkn wwaezpbzknVar2 = gg.wwaezpbzkn.f37140iobyxmoadg;
                    zoijcleaowVarOjitshcjhn.kcexrzcfyt(lqeggnwhkgVarDraadjrbmk);
                    okpsazkaxt(zoijcleaowVarOjitshcjhn);
                } catch (Throwable th3) {
                    zoijcleaowVarOjitshcjhn.kcexrzcfyt(lqeggnwhkgVarDraadjrbmk);
                    throw th3;
                }
            } catch (Throwable th4) {
                okpsazkaxt(zoijcleaowVarOjitshcjhn);
                throw th4;
            }
        }
        return hg.jyumaefscl.m(map.keySet());
    }

    private final boolean bfopjjpdmp() {
        return !this.f5751jyumaefscl && this.f5766zoijcleaow.oxmwwwfdhm();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final pj.agtfadlqog czzsidtyhn() {
        wkgbmnqykc wkgbmnqykcVar;
        int i13 = 0;
        int i14 = 1;
        kotlin.jvm.internal.gtknphoqwx gtknphoqwxVar = null;
        if (((wkgbmnqykc) this.f5750iwizpuwonk.getValue()).compareTo(wkgbmnqykc.ShuttingDown) <= 0) {
            rlfsiqarku();
            this.f5755nufgyqmvbu = new androidx.collection.wypolnanlu(i13, i14, gtknphoqwxVar);
            this.f5744dxjokdxxww.nufgyqmvbu();
            this.f5741btonecajqb.clear();
            this.f5747gtknphoqwx.clear();
            this.f5760rgvfuqvkyq = null;
            pj.agtfadlqog agtfadlqogVar = this.f5757oxmwwwfdhm;
            if (agtfadlqogVar != null) {
                pj.agtfadlqog.iobyxmoadg.iobyxmoadg(agtfadlqogVar, null, 1, null);
            }
            this.f5757oxmwwwfdhm = null;
            this.f5764yggfygwlhe = null;
            return null;
        }
        if (this.f5764yggfygwlhe != null) {
            wkgbmnqykcVar = wkgbmnqykc.Inactive;
        } else if (this.f5763wkgbmnqykc == null) {
            this.f5755nufgyqmvbu = new androidx.collection.wypolnanlu(i13, i14, gtknphoqwxVar);
            this.f5744dxjokdxxww.nufgyqmvbu();
            wkgbmnqykcVar = bfopjjpdmp() ? wkgbmnqykc.InactivePendingWork : wkgbmnqykc.Inactive;
        } else {
            wkgbmnqykcVar = (this.f5744dxjokdxxww.draadjrbmk() == 0 && !this.f5755nufgyqmvbu.eablkybsjg() && this.f5741btonecajqb.isEmpty() && this.f5747gtknphoqwx.isEmpty() && this.f5752kcexrzcfyt <= 0 && !bfopjjpdmp() && !ipoelvxyzq.zoijcleaow.btonecajqb(this.f5743draadjrbmk)) ? wkgbmnqykc.Idle : wkgbmnqykc.PendingWork;
        }
        this.f5750iwizpuwonk.setValue(wkgbmnqykcVar);
        if (wkgbmnqykcVar != wkgbmnqykc.PendingWork) {
            return null;
        }
        pj.agtfadlqog agtfadlqogVar2 = this.f5757oxmwwwfdhm;
        this.f5757oxmwwwfdhm = null;
        return agtfadlqogVar2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:14:0x003e A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:15:0x0040 A[LOOP:0: B:5:0x000b->B:15:0x0040, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:19:0x0043 A[EDGE_INSN: B:19:0x0043->B:16:0x0043 BREAK  A[LOOP:0: B:5:0x000b->B:15:0x0040], SYNTHETIC] */
    public static final gg.wwaezpbzkn dvvnrvtcbc(androidx.collection.wypolnanlu wypolnanluVar, dsvhmnatus dsvhmnatusVar) {
        Object[] objArr = wypolnanluVar.f4398zoijcleaow;
        long[] jArr = wypolnanluVar.f4395iobyxmoadg;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i13 = 0;
            while (true) {
                long j13 = jArr[i13];
                if ((((~j13) << 7) & j13 & (-9187201950435737472L)) == -9187201950435737472L) {
                    if (i13 != length) {
                        break;
                        break;
                    }
                    i13++;
                } else {
                    int i14 = 8 - ((~(i13 - length)) >>> 31);
                    for (int i15 = 0; i15 < i14; i15++) {
                        if ((255 & j13) < 128) {
                            dsvhmnatusVar.jyumaefscl(objArr[(i13 << 3) + i15]);
                        }
                        j13 >>= 8;
                    }
                    if (i14 != 8) {
                        break;
                    }
                    if (i13 != length) {
                        break;
                    }
                    i13++;
                }
            }
        }
        return gg.wwaezpbzkn.f37140iobyxmoadg;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final gg.wwaezpbzkn ezmngbhpjk(dsvhmnatus dsvhmnatusVar, androidx.collection.wypolnanlu wypolnanluVar, Object obj) {
        dsvhmnatusVar.jyumaefscl(obj);
        if (wypolnanluVar != null) {
            wypolnanluVar.nufgyqmvbu(obj);
        }
        return gg.wwaezpbzkn.f37140iobyxmoadg;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean fiwbwshyhd() {
        boolean zOpjhrmiecq;
        hg.jyumaefscl.wflxmlrfwp();
        synchronized (this.f5759ppxfxbqfkf) {
            if (this.f5755nufgyqmvbu.wkgbmnqykc()) {
                return opjhrmiecq();
            }
            List listNuxfzjnpeb = nuxfzjnpeb();
            Set setIobyxmoadg = ipoelvxyzq.gxszxtbevo.iobyxmoadg(this.f5755nufgyqmvbu);
            int i13 = 0;
            this.f5755nufgyqmvbu = new androidx.collection.wypolnanlu(i13, 1, null);
            try {
                int size = listNuxfzjnpeb.size();
                while (i13 < size) {
                    ((dsvhmnatus) listNuxfzjnpeb.get(i13)).oxmwwwfdhm(setIobyxmoadg);
                    if (((wkgbmnqykc) this.f5750iwizpuwonk.getValue()).compareTo(wkgbmnqykc.ShuttingDown) <= 0) {
                        break;
                    }
                    i13++;
                }
                synchronized (this.f5759ppxfxbqfkf) {
                    if (czzsidtyhn() != null) {
                        throw new IllegalStateException("called outside of runRecomposeAndApplyChanges");
                    }
                    zOpjhrmiecq = opjhrmiecq();
                }
                return zOpjhrmiecq;
            } catch (Throwable th2) {
                synchronized (this.f5759ppxfxbqfkf) {
                    this.f5755nufgyqmvbu.btonecajqb(setIobyxmoadg);
                    throw th2;
                }
            }
        }
    }

    private final tg.draadjrbmk fmlbqenlif(final dsvhmnatus dsvhmnatusVar, final androidx.collection.wypolnanlu wypolnanluVar) {
        return new tg.draadjrbmk() { // from class: androidx.compose.runtime.k
            @Override // tg.draadjrbmk
            public final Object invoke(Object obj) {
                return n.ezmngbhpjk(dsvhmnatusVar, wypolnanluVar, obj);
            }
        };
    }

    private final void fyldjkxazc(dsvhmnatus dsvhmnatusVar) {
        androidx.collection.jpowsppfya jpowsppfyaVar = this.f5758pmvmpeiblj;
        if (jpowsppfyaVar != null) {
            Object[] objArr = jpowsppfyaVar.f4343iobyxmoadg;
            int i13 = jpowsppfyaVar.f4344zoijcleaow;
            for (int i14 = 0; i14 < i13; i14++) {
                androidx.appcompat.app.yggfygwlhe.iobyxmoadg(objArr[i14]);
                if (dsvhmnatusVar instanceof krqnebusok.vdvldrhtss) {
                    throw null;
                }
            }
        }
    }

    private final void grlcpdaxtj(dsvhmnatus dsvhmnatusVar) {
        if (this.f5748gxszxtbevo.remove(dsvhmnatusVar)) {
            this.f5754lqeggnwhkg = null;
            jrbgnlbqoe(dsvhmnatusVar);
        }
    }

    private final Object hszhottldk(tg.vdvldrhtss vdvldrhtssVar, lg.gxszxtbevo gxszxtbevoVar) {
        Object objLqeggnwhkg = pj.dxjokdxxww.lqeggnwhkg(this.f5766zoijcleaow, new gxszxtbevo(vdvldrhtssVar, weqkydbzbr.iobyxmoadg(gxszxtbevoVar.getContext()), null), gxszxtbevoVar);
        return objLqeggnwhkg == mg.zoijcleaow.gxszxtbevo() ? objLqeggnwhkg : gg.wwaezpbzkn.f37140iobyxmoadg;
    }

    static /* synthetic */ void igdgnonuha(n nVar, Throwable th2, dsvhmnatus dsvhmnatusVar, boolean z13, int i13, Object obj) throws Throwable {
        if ((i13 & 2) != 0) {
            dsvhmnatusVar = null;
        }
        if ((i13 & 4) != 0) {
            z13 = false;
        }
        nVar.skhdrjzrfn(th2, dsvhmnatusVar, z13);
    }

    private final void ikoacuggdj(dsvhmnatus dsvhmnatusVar) {
        this.f5748gxszxtbevo.add(dsvhmnatusVar);
        this.f5754lqeggnwhkg = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void ipoelvxyzq(pj.auzgnhcxok auzgnhcxokVar) {
        synchronized (this.f5759ppxfxbqfkf) {
            Throwable th2 = this.f5745eablkybsjg;
            if (th2 != null) {
                throw th2;
            }
            if (((wkgbmnqykc) this.f5750iwizpuwonk.getValue()).compareTo(wkgbmnqykc.ShuttingDown) <= 0) {
                throw new IllegalStateException("Recomposer shut down");
            }
            if (this.f5763wkgbmnqykc != null) {
                throw new IllegalStateException("Recomposer already running");
            }
            this.f5763wkgbmnqykc = auzgnhcxokVar;
            czzsidtyhn();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final dsvhmnatus iwxlajgraz(final dsvhmnatus dsvhmnatusVar, final androidx.collection.wypolnanlu wypolnanluVar) {
        Set set;
        if (dsvhmnatusVar.zdlpuopuiu() || dsvhmnatusVar.zoijcleaow() || ((set = this.f5761vdvldrhtss) != null && set.contains(dsvhmnatusVar))) {
            return null;
        }
        androidx.compose.runtime.snapshots.zoijcleaow zoijcleaowVarOjitshcjhn = androidx.compose.runtime.snapshots.lqeggnwhkg.f6010eablkybsjg.ojitshcjhn(lxfrhoxuzk(dsvhmnatusVar), fmlbqenlif(dsvhmnatusVar, wypolnanluVar));
        try {
            androidx.compose.runtime.snapshots.lqeggnwhkg lqeggnwhkgVarDraadjrbmk = zoijcleaowVarOjitshcjhn.draadjrbmk();
            if (wypolnanluVar != null) {
                try {
                    if (wypolnanluVar.eablkybsjg()) {
                        dsvhmnatusVar.ojitshcjhn(new tg.iobyxmoadg() { // from class: androidx.compose.runtime.m
                            @Override // tg.iobyxmoadg
                            public final Object invoke() {
                                return n.dvvnrvtcbc(wypolnanluVar, dsvhmnatusVar);
                            }
                        });
                    }
                } catch (Throwable th2) {
                    zoijcleaowVarOjitshcjhn.kcexrzcfyt(lqeggnwhkgVarDraadjrbmk);
                    throw th2;
                }
            }
            boolean zAgtfadlqog = dsvhmnatusVar.agtfadlqog();
            zoijcleaowVarOjitshcjhn.kcexrzcfyt(lqeggnwhkgVarDraadjrbmk);
            okpsazkaxt(zoijcleaowVarOjitshcjhn);
            if (zAgtfadlqog) {
                return dsvhmnatusVar;
            }
            return null;
        } catch (Throwable th3) {
            okpsazkaxt(zoijcleaowVarOjitshcjhn);
            throw th3;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean iyctptxqzt() {
        boolean z13;
        synchronized (this.f5759ppxfxbqfkf) {
            z13 = this.f5755nufgyqmvbu.eablkybsjg() || this.f5744dxjokdxxww.draadjrbmk() != 0 || bfopjjpdmp();
        }
        return z13;
    }

    private final void jrbgnlbqoe(dsvhmnatus dsvhmnatusVar) {
        androidx.collection.jpowsppfya jpowsppfyaVar = this.f5758pmvmpeiblj;
        if (jpowsppfyaVar != null) {
            Object[] objArr = jpowsppfyaVar.f4343iobyxmoadg;
            int i13 = jpowsppfyaVar.f4344zoijcleaow;
            for (int i14 = 0; i14 < i13; i14++) {
                androidx.appcompat.app.yggfygwlhe.iobyxmoadg(objArr[i14]);
                if (dsvhmnatusVar instanceof krqnebusok.vdvldrhtss) {
                    throw null;
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object jztzpxfvev(lg.gxszxtbevo gxszxtbevoVar) {
        pj.rgvfuqvkyq rgvfuqvkyqVar;
        if (iyctptxqzt()) {
            return gg.wwaezpbzkn.f37140iobyxmoadg;
        }
        pj.rgvfuqvkyq rgvfuqvkyqVar2 = new pj.rgvfuqvkyq(mg.zoijcleaow.ppxfxbqfkf(gxszxtbevoVar), 1);
        rgvfuqvkyqVar2.lereixgezr();
        synchronized (this.f5759ppxfxbqfkf) {
            if (iyctptxqzt()) {
                rgvfuqvkyqVar = rgvfuqvkyqVar2;
            } else {
                this.f5757oxmwwwfdhm = rgvfuqvkyqVar2;
                rgvfuqvkyqVar = null;
            }
        }
        if (rgvfuqvkyqVar != null) {
            gg.kcexrzcfyt.iobyxmoadg iobyxmoadgVar = gg.kcexrzcfyt.f37117yggfygwlhe;
            rgvfuqvkyqVar.resumeWith(gg.kcexrzcfyt.wkgbmnqykc(gg.wwaezpbzkn.f37140iobyxmoadg));
        }
        Object objZdlpuopuiu = rgvfuqvkyqVar2.zdlpuopuiu();
        if (objZdlpuopuiu == mg.zoijcleaow.gxszxtbevo()) {
            kotlin.coroutines.jvm.internal.nufgyqmvbu.ppxfxbqfkf(gxszxtbevoVar);
        }
        return objZdlpuopuiu == mg.zoijcleaow.gxszxtbevo() ? objZdlpuopuiu : gg.wwaezpbzkn.f37140iobyxmoadg;
    }

    private final tg.draadjrbmk lxfrhoxuzk(final dsvhmnatus dsvhmnatusVar) {
        return new tg.draadjrbmk() { // from class: androidx.compose.runtime.h
            @Override // tg.draadjrbmk
            public final Object invoke(Object obj) {
                return n.wizcaqwiak(dsvhmnatusVar, obj);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final List nuxfzjnpeb() {
        List list = this.f5754lqeggnwhkg;
        if (list != null) {
            return list;
        }
        List list2 = this.f5748gxszxtbevo;
        List listWflxmlrfwp = list2.isEmpty() ? hg.jyumaefscl.wflxmlrfwp() : new ArrayList(list2);
        this.f5754lqeggnwhkg = listWflxmlrfwp;
        return listWflxmlrfwp;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean oipsdeybqn() {
        boolean zBfopjjpdmp;
        synchronized (this.f5759ppxfxbqfkf) {
            zBfopjjpdmp = bfopjjpdmp();
        }
        return zBfopjjpdmp;
    }

    private final void okpsazkaxt(androidx.compose.runtime.snapshots.zoijcleaow zoijcleaowVar) {
        try {
            if (zoijcleaowVar.istkbnxepw() instanceof androidx.compose.runtime.snapshots.nufgyqmvbu.iobyxmoadg) {
                throw new IllegalStateException("Unsupported concurrent change during composition. A state object was modified by composition as well as being modified outside composition.");
            }
            zoijcleaowVar.wkgbmnqykc();
        } catch (Throwable th2) {
            zoijcleaowVar.wkgbmnqykc();
            throw th2;
        }
    }

    private final boolean opjhrmiecq() {
        return this.f5744dxjokdxxww.draadjrbmk() != 0 || bfopjjpdmp() || ipoelvxyzq.zoijcleaow.btonecajqb(this.f5743draadjrbmk);
    }

    private final void rlfsiqarku() {
        Iterator it = nuxfzjnpeb().iterator();
        while (it.hasNext()) {
            jrbgnlbqoe((dsvhmnatus) it.next());
        }
        this.f5748gxszxtbevo.clear();
        this.f5754lqeggnwhkg = hg.jyumaefscl.wflxmlrfwp();
    }

    private final void roivzttewh(dsvhmnatus dsvhmnatusVar) {
        synchronized (this.f5759ppxfxbqfkf) {
            List list = this.f5747gtknphoqwx;
            int size = list.size();
            for (int i13 = 0; i13 < size; i13++) {
                if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(((nuxfzjnpeb) list.get(i13)).zoijcleaow(), dsvhmnatusVar)) {
                    gg.wwaezpbzkn wwaezpbzknVar = gg.wwaezpbzkn.f37140iobyxmoadg;
                    ArrayList arrayList = new ArrayList();
                    uawqvzlxes(arrayList, this, dsvhmnatusVar);
                    while (!arrayList.isEmpty()) {
                        auzgnhcxok(arrayList, null);
                        uawqvzlxes(arrayList, this, dsvhmnatusVar);
                    }
                    return;
                }
            }
        }
    }

    private final void skhdrjzrfn(Throwable th2, dsvhmnatus dsvhmnatusVar, boolean z13) throws Throwable {
        int i13 = 0;
        if (!((Boolean) f5737iozdgvuglv.get()).booleanValue() || (th2 instanceof ComposeRuntimeError)) {
            synchronized (this.f5759ppxfxbqfkf) {
                zoijcleaow zoijcleaowVar = this.f5764yggfygwlhe;
                if (zoijcleaowVar != null) {
                    throw zoijcleaowVar.iobyxmoadg();
                }
                this.f5764yggfygwlhe = new zoijcleaow(false, th2);
                gg.wwaezpbzkn wwaezpbzknVar = gg.wwaezpbzkn.f37140iobyxmoadg;
            }
            throw th2;
        }
        synchronized (this.f5759ppxfxbqfkf) {
            try {
                ezmngbhpjk.iwizpuwonk.iobyxmoadg("Error was captured in composition while live edit was enabled.", th2);
                this.f5741btonecajqb.clear();
                this.f5744dxjokdxxww.nufgyqmvbu();
                this.f5755nufgyqmvbu = new androidx.collection.wypolnanlu(i13, 1, null);
                this.f5747gtknphoqwx.clear();
                ipoelvxyzq.zoijcleaow.ppxfxbqfkf(this.f5743draadjrbmk);
                this.f5740agtfadlqog.gtknphoqwx();
                this.f5764yggfygwlhe = new zoijcleaow(z13, th2);
                if (dsvhmnatusVar != null) {
                    ageimvtcrz(dsvhmnatusVar);
                }
                czzsidtyhn();
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    private static final void uawqvzlxes(List list, n nVar, dsvhmnatus dsvhmnatusVar) {
        list.clear();
        synchronized (nVar.f5759ppxfxbqfkf) {
            try {
                Iterator it = nVar.f5747gtknphoqwx.iterator();
                while (it.hasNext()) {
                    nuxfzjnpeb nuxfzjnpebVar = (nuxfzjnpeb) it.next();
                    if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(nuxfzjnpebVar.zoijcleaow(), dsvhmnatusVar)) {
                        list.add(nuxfzjnpebVar);
                        it.remove();
                    }
                }
                gg.wwaezpbzkn wwaezpbzknVar = gg.wwaezpbzkn.f37140iobyxmoadg;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void uwvvkdfqfp() {
        int i13;
        androidx.collection.mbcevpiqjq mbcevpiqjqVarGxszxtbevo;
        synchronized (this.f5759ppxfxbqfkf) {
            try {
                if (ipoelvxyzq.zoijcleaow.btonecajqb(this.f5743draadjrbmk)) {
                    androidx.collection.mbcevpiqjq mbcevpiqjqVarRgvfuqvkyq = ipoelvxyzq.zoijcleaow.rgvfuqvkyq(this.f5743draadjrbmk);
                    ipoelvxyzq.zoijcleaow.ppxfxbqfkf(this.f5743draadjrbmk);
                    this.f5762wflxmlrfwp.zoijcleaow();
                    ipoelvxyzq.zoijcleaow.ppxfxbqfkf(this.f5756ojitshcjhn);
                    androidx.collection.jpowsppfya jpowsppfyaVar = new androidx.collection.jpowsppfya(mbcevpiqjqVarRgvfuqvkyq.eablkybsjg());
                    Object[] objArr = mbcevpiqjqVarRgvfuqvkyq.f4343iobyxmoadg;
                    int i14 = mbcevpiqjqVarRgvfuqvkyq.f4344zoijcleaow;
                    for (int i15 = 0; i15 < i14; i15++) {
                        nuxfzjnpeb nuxfzjnpebVar = (nuxfzjnpeb) objArr[i15];
                        jpowsppfyaVar.agtfadlqog(gg.cqumvgiudr.iobyxmoadg(nuxfzjnpebVar, this.f5740agtfadlqog.eablkybsjg(nuxfzjnpebVar)));
                    }
                    this.f5740agtfadlqog.gtknphoqwx();
                    mbcevpiqjqVarGxszxtbevo = jpowsppfyaVar;
                } else {
                    mbcevpiqjqVarGxszxtbevo = androidx.collection.ntlheqmsrt.gxszxtbevo();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        Object[] objArr2 = mbcevpiqjqVarGxszxtbevo.f4343iobyxmoadg;
        int i16 = mbcevpiqjqVarGxszxtbevo.f4344zoijcleaow;
        for (i13 = 0; i13 < i16; i13++) {
            gg.vdvldrhtss vdvldrhtssVar = (gg.vdvldrhtss) objArr2[i13];
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean weqkydbzbr() {
        boolean z13;
        synchronized (this.f5759ppxfxbqfkf) {
            z13 = this.f5765zdlpuopuiu;
        }
        if (z13) {
            Iterator it = this.f5746esjtqupxsv.iobyxmoadg().iterator();
            while (it.hasNext()) {
                if (((pj.auzgnhcxok) it.next()).isActive()) {
                }
            }
            return false;
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final gg.wwaezpbzkn wizcaqwiak(dsvhmnatus dsvhmnatusVar, Object obj) {
        dsvhmnatusVar.ppxfxbqfkf(obj);
        return gg.wwaezpbzkn.f37140iobyxmoadg;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final gg.wwaezpbzkn xrmfcynszj(n nVar) {
        pj.agtfadlqog agtfadlqogVarCzzsidtyhn;
        synchronized (nVar.f5759ppxfxbqfkf) {
            agtfadlqogVarCzzsidtyhn = nVar.czzsidtyhn();
            if (((wkgbmnqykc) nVar.f5750iwizpuwonk.getValue()).compareTo(wkgbmnqykc.ShuttingDown) <= 0) {
                throw pj.zfvoamnweg.iobyxmoadg("Recomposer shutdown; frame clock awaiter will never resume", nVar.f5745eablkybsjg);
            }
        }
        if (agtfadlqogVarCzzsidtyhn != null) {
            gg.kcexrzcfyt.iobyxmoadg iobyxmoadgVar = gg.kcexrzcfyt.f37117yggfygwlhe;
            agtfadlqogVarCzzsidtyhn.resumeWith(gg.kcexrzcfyt.wkgbmnqykc(gg.wwaezpbzkn.f37140iobyxmoadg));
        }
        return gg.wwaezpbzkn.f37140iobyxmoadg;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final gg.wwaezpbzkn ydmasvzmpa(n nVar, Throwable th2, Throwable th3) {
        synchronized (nVar.f5759ppxfxbqfkf) {
            if (th2 == null) {
                th2 = null;
            } else if (th3 != null) {
                try {
                    if (th3 instanceof CancellationException) {
                        th3 = null;
                    }
                    if (th3 != null) {
                        gg.lqeggnwhkg.iobyxmoadg(th2, th3);
                    }
                } catch (Throwable th4) {
                    throw th4;
                }
            }
            nVar.f5745eablkybsjg = th2;
            nVar.f5750iwizpuwonk.setValue(wkgbmnqykc.ShutDown);
        }
        return gg.wwaezpbzkn.f37140iobyxmoadg;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final gg.wwaezpbzkn yfnezrywwk(final n nVar, final Throwable th2) {
        pj.agtfadlqog agtfadlqogVar;
        pj.agtfadlqog agtfadlqogVar2;
        CancellationException cancellationExceptionIobyxmoadg = pj.zfvoamnweg.iobyxmoadg("Recomposer effect job completed", th2);
        synchronized (nVar.f5759ppxfxbqfkf) {
            try {
                pj.auzgnhcxok auzgnhcxokVar = nVar.f5763wkgbmnqykc;
                agtfadlqogVar = null;
                if (auzgnhcxokVar != null) {
                    nVar.f5750iwizpuwonk.setValue(wkgbmnqykc.ShuttingDown);
                    if (nVar.f5765zdlpuopuiu) {
                        agtfadlqogVar2 = nVar.f5757oxmwwwfdhm;
                        if (agtfadlqogVar2 != null) {
                        }
                        nVar.f5757oxmwwwfdhm = null;
                        auzgnhcxokVar.pmvmpeiblj(new tg.draadjrbmk() { // from class: androidx.compose.runtime.l
                            @Override // tg.draadjrbmk
                            public final Object invoke(Object obj) {
                                return n.ydmasvzmpa(this.f5714zdlpuopuiu, th2, (Throwable) obj);
                            }
                        });
                        agtfadlqogVar = agtfadlqogVar2;
                    } else {
                        auzgnhcxokVar.nufgyqmvbu(cancellationExceptionIobyxmoadg);
                    }
                    agtfadlqogVar2 = null;
                    nVar.f5757oxmwwwfdhm = null;
                    auzgnhcxokVar.pmvmpeiblj(new tg.draadjrbmk() { // from class: androidx.compose.runtime.l
                        @Override // tg.draadjrbmk
                        public final Object invoke(Object obj) {
                            return n.ydmasvzmpa(this.f5714zdlpuopuiu, th2, (Throwable) obj);
                        }
                    });
                    agtfadlqogVar = agtfadlqogVar2;
                } else {
                    nVar.f5745eablkybsjg = cancellationExceptionIobyxmoadg;
                    nVar.f5750iwizpuwonk.setValue(wkgbmnqykc.ShutDown);
                    gg.wwaezpbzkn wwaezpbzknVar = gg.wwaezpbzkn.f37140iobyxmoadg;
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
        if (agtfadlqogVar != null) {
            gg.kcexrzcfyt.iobyxmoadg iobyxmoadgVar = gg.kcexrzcfyt.f37117yggfygwlhe;
            agtfadlqogVar.resumeWith(gg.kcexrzcfyt.wkgbmnqykc(gg.wwaezpbzkn.f37140iobyxmoadg));
        }
        return gg.wwaezpbzkn.f37140iobyxmoadg;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final List zeieaojujs() {
        List listNuxfzjnpeb;
        synchronized (this.f5759ppxfxbqfkf) {
            listNuxfzjnpeb = nuxfzjnpeb();
        }
        return listNuxfzjnpeb;
    }

    @Override // androidx.compose.runtime.cqumvgiudr
    public zeieaojujs agtfadlqog(nuxfzjnpeb nuxfzjnpebVar) {
        zeieaojujs zeieaojujsVar;
        synchronized (this.f5759ppxfxbqfkf) {
            zeieaojujsVar = (zeieaojujs) this.f5740agtfadlqog.yggfygwlhe(nuxfzjnpebVar);
        }
        return zeieaojujsVar;
    }

    @Override // androidx.compose.runtime.cqumvgiudr
    public lg.btonecajqb btonecajqb() {
        return this.f5753lereixgezr;
    }

    @Override // androidx.compose.runtime.cqumvgiudr
    public void draadjrbmk(nuxfzjnpeb nuxfzjnpebVar) {
        pj.agtfadlqog agtfadlqogVarCzzsidtyhn;
        synchronized (this.f5759ppxfxbqfkf) {
            this.f5747gtknphoqwx.add(nuxfzjnpebVar);
            agtfadlqogVarCzzsidtyhn = czzsidtyhn();
        }
        if (agtfadlqogVarCzzsidtyhn != null) {
            gg.kcexrzcfyt.iobyxmoadg iobyxmoadgVar = gg.kcexrzcfyt.f37117yggfygwlhe;
            agtfadlqogVarCzzsidtyhn.resumeWith(gg.kcexrzcfyt.wkgbmnqykc(gg.wwaezpbzkn.f37140iobyxmoadg));
        }
    }

    @Override // androidx.compose.runtime.cqumvgiudr
    public boolean eablkybsjg() {
        return false;
    }

    @Override // androidx.compose.runtime.cqumvgiudr
    public boolean gxszxtbevo() {
        return jyumaefscl.zynmafqrjb();
    }

    @Override // androidx.compose.runtime.cqumvgiudr
    public void iobyxmoadg(dsvhmnatus dsvhmnatusVar, tg.rgvfuqvkyq rgvfuqvkyqVar) throws Throwable {
        wkgbmnqykc wkgbmnqykcVar;
        boolean z13;
        boolean zZdlpuopuiu = dsvhmnatusVar.zdlpuopuiu();
        synchronized (this.f5759ppxfxbqfkf) {
            wkgbmnqykc wkgbmnqykcVar2 = (wkgbmnqykc) this.f5750iwizpuwonk.getValue();
            wkgbmnqykcVar = wkgbmnqykc.ShuttingDown;
            if (wkgbmnqykcVar2.compareTo(wkgbmnqykcVar) > 0) {
                boolean zContains = nuxfzjnpeb().contains(dsvhmnatusVar);
                z13 = !zContains;
                if (!zContains) {
                    fyldjkxazc(dsvhmnatusVar);
                }
            } else {
                z13 = true;
            }
        }
        try {
            androidx.compose.runtime.snapshots.lqeggnwhkg.iobyxmoadg iobyxmoadgVar = androidx.compose.runtime.snapshots.lqeggnwhkg.f6010eablkybsjg;
            androidx.compose.runtime.snapshots.zoijcleaow zoijcleaowVarOjitshcjhn = iobyxmoadgVar.ojitshcjhn(lxfrhoxuzk(dsvhmnatusVar), fmlbqenlif(dsvhmnatusVar, null));
            try {
                androidx.compose.runtime.snapshots.lqeggnwhkg lqeggnwhkgVarDraadjrbmk = zoijcleaowVarOjitshcjhn.draadjrbmk();
                try {
                    dsvhmnatusVar.gxszxtbevo(rgvfuqvkyqVar);
                    gg.wwaezpbzkn wwaezpbzknVar = gg.wwaezpbzkn.f37140iobyxmoadg;
                    zoijcleaowVarOjitshcjhn.kcexrzcfyt(lqeggnwhkgVarDraadjrbmk);
                    okpsazkaxt(zoijcleaowVarOjitshcjhn);
                    synchronized (this.f5759ppxfxbqfkf) {
                        try {
                            if (((wkgbmnqykc) this.f5750iwizpuwonk.getValue()).compareTo(wkgbmnqykcVar) <= 0) {
                                jrbgnlbqoe(dsvhmnatusVar);
                            } else if (!nuxfzjnpeb().contains(dsvhmnatusVar)) {
                                ikoacuggdj(dsvhmnatusVar);
                            }
                        } catch (Throwable th2) {
                            throw th2;
                        }
                    }
                    if (!zZdlpuopuiu) {
                        iobyxmoadgVar.lqeggnwhkg();
                    }
                    try {
                        roivzttewh(dsvhmnatusVar);
                        try {
                            dsvhmnatusVar.kcexrzcfyt();
                            dsvhmnatusVar.dxjokdxxww();
                            if (zZdlpuopuiu) {
                                return;
                            }
                            iobyxmoadgVar.lqeggnwhkg();
                        } catch (Throwable th3) {
                            igdgnonuha(this, th3, null, false, 6, null);
                        }
                    } catch (Throwable th4) {
                        skhdrjzrfn(th4, dsvhmnatusVar, true);
                    }
                } catch (Throwable th5) {
                    zoijcleaowVarOjitshcjhn.kcexrzcfyt(lqeggnwhkgVarDraadjrbmk);
                    throw th5;
                }
            } catch (Throwable th6) {
                okpsazkaxt(zoijcleaowVarOjitshcjhn);
                throw th6;
            }
        } catch (Throwable th7) {
            if (z13) {
                synchronized (this.f5759ppxfxbqfkf) {
                    jrbgnlbqoe(dsvhmnatusVar);
                    gg.wwaezpbzkn wwaezpbzknVar2 = gg.wwaezpbzkn.f37140iobyxmoadg;
                }
            }
            skhdrjzrfn(th7, dsvhmnatusVar, true);
        }
    }

    public final Object ixidwrxhsl(lg.gxszxtbevo gxszxtbevoVar) {
        Object objHszhottldk = hszhottldk(new lqeggnwhkg(null), gxszxtbevoVar);
        return objHszhottldk == mg.zoijcleaow.gxszxtbevo() ? objHszhottldk : gg.wwaezpbzkn.f37140iobyxmoadg;
    }

    @Override // androidx.compose.runtime.cqumvgiudr
    public void jyumaefscl(dsvhmnatus dsvhmnatusVar) {
        synchronized (this.f5759ppxfxbqfkf) {
            grlcpdaxtj(dsvhmnatusVar);
            this.f5744dxjokdxxww.rgvfuqvkyq(dsvhmnatusVar);
            this.f5741btonecajqb.remove(dsvhmnatusVar);
            gg.wwaezpbzkn wwaezpbzknVar = gg.wwaezpbzkn.f37140iobyxmoadg;
        }
    }

    @Override // androidx.compose.runtime.cqumvgiudr
    public void kcexrzcfyt(dsvhmnatus dsvhmnatusVar) {
        synchronized (this.f5759ppxfxbqfkf) {
            try {
                Set linkedHashSet = this.f5761vdvldrhtss;
                if (linkedHashSet == null) {
                    linkedHashSet = new LinkedHashSet();
                    this.f5761vdvldrhtss = linkedHashSet;
                }
                linkedHashSet.add(dsvhmnatusVar);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // androidx.compose.runtime.cqumvgiudr
    public long lqeggnwhkg() {
        return 1000;
    }

    public final Object lrnfpwlwnk(lg.gxszxtbevo gxszxtbevoVar) {
        Object objZynmafqrjb = sj.dxjokdxxww.zynmafqrjb(zfvoamnweg(), new eablkybsjg(null), gxszxtbevoVar);
        return objZynmafqrjb == mg.zoijcleaow.gxszxtbevo() ? objZynmafqrjb : gg.wwaezpbzkn.f37140iobyxmoadg;
    }

    public final void metgxyhuhe() {
        synchronized (this.f5759ppxfxbqfkf) {
            try {
                if (((wkgbmnqykc) this.f5750iwizpuwonk.getValue()).compareTo(wkgbmnqykc.Idle) >= 0) {
                    this.f5750iwizpuwonk.setValue(wkgbmnqykc.ShuttingDown);
                }
                gg.wwaezpbzkn wwaezpbzknVar = gg.wwaezpbzkn.f37140iobyxmoadg;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        pj.auzgnhcxok.iobyxmoadg.iobyxmoadg(this.f5746esjtqupxsv, null, 1, null);
    }

    public final void mhtqkkgtqm() {
        pj.agtfadlqog agtfadlqogVarCzzsidtyhn;
        synchronized (this.f5759ppxfxbqfkf) {
            if (this.f5751jyumaefscl) {
                this.f5751jyumaefscl = false;
                agtfadlqogVarCzzsidtyhn = czzsidtyhn();
            } else {
                agtfadlqogVarCzzsidtyhn = null;
            }
        }
        if (agtfadlqogVarCzzsidtyhn != null) {
            gg.kcexrzcfyt.iobyxmoadg iobyxmoadgVar = gg.kcexrzcfyt.f37117yggfygwlhe;
            agtfadlqogVarCzzsidtyhn.resumeWith(gg.kcexrzcfyt.wkgbmnqykc(gg.wwaezpbzkn.f37140iobyxmoadg));
        }
    }

    @Override // androidx.compose.runtime.cqumvgiudr
    public iwizpuwonk nufgyqmvbu() {
        return null;
    }

    @Override // androidx.compose.runtime.cqumvgiudr
    public androidx.collection.vipkmwdibw ojitshcjhn(dsvhmnatus dsvhmnatusVar, b0 b0Var, androidx.collection.vipkmwdibw vipkmwdibwVar) {
        try {
            fiwbwshyhd();
            dsvhmnatusVar.oxmwwwfdhm(ipoelvxyzq.gxszxtbevo.iobyxmoadg(vipkmwdibwVar));
            b0 b0VarWflxmlrfwp = dsvhmnatusVar.wflxmlrfwp(b0Var);
            try {
                dsvhmnatus dsvhmnatusVarIwxlajgraz = iwxlajgraz(dsvhmnatusVar, null);
                if (dsvhmnatusVarIwxlajgraz != null) {
                    roivzttewh(dsvhmnatusVar);
                    dsvhmnatusVarIwxlajgraz.kcexrzcfyt();
                    dsvhmnatusVarIwxlajgraz.dxjokdxxww();
                }
                androidx.collection.vipkmwdibw vipkmwdibwVarIobyxmoadg = (androidx.collection.wypolnanlu) this.f5742cqumvgiudr.iobyxmoadg();
                if (vipkmwdibwVarIobyxmoadg == null) {
                    vipkmwdibwVarIobyxmoadg = androidx.collection.jhduphickx.iobyxmoadg();
                }
                dsvhmnatusVar.wflxmlrfwp(b0VarWflxmlrfwp);
                this.f5742cqumvgiudr.zoijcleaow(null);
                return vipkmwdibwVarIobyxmoadg;
            } catch (Throwable th2) {
                dsvhmnatusVar.wflxmlrfwp(b0VarWflxmlrfwp);
                throw th2;
            }
        } catch (Throwable th3) {
            this.f5742cqumvgiudr.zoijcleaow(null);
            throw th3;
        }
    }

    @Override // androidx.compose.runtime.cqumvgiudr
    public void oxmwwwfdhm(e eVar) {
        androidx.collection.wypolnanlu wypolnanluVarZoijcleaow = (androidx.collection.wypolnanlu) this.f5742cqumvgiudr.iobyxmoadg();
        if (wypolnanluVarZoijcleaow == null) {
            wypolnanluVarZoijcleaow = androidx.collection.jhduphickx.zoijcleaow();
            this.f5742cqumvgiudr.zoijcleaow(wypolnanluVarZoijcleaow);
        }
        wypolnanluVarZoijcleaow.nufgyqmvbu(eVar);
    }

    @Override // androidx.compose.runtime.cqumvgiudr
    public void rgvfuqvkyq(Set set) {
    }

    public final long sflfametgt() {
        return this.f5749iobyxmoadg;
    }

    public final void tbqsvytpvh() {
        synchronized (this.f5759ppxfxbqfkf) {
            this.f5751jyumaefscl = true;
            gg.wwaezpbzkn wwaezpbzknVar = gg.wwaezpbzkn.f37140iobyxmoadg;
        }
    }

    @Override // androidx.compose.runtime.cqumvgiudr
    public void wflxmlrfwp(dsvhmnatus dsvhmnatusVar) {
        pj.agtfadlqog agtfadlqogVarCzzsidtyhn;
        synchronized (this.f5759ppxfxbqfkf) {
            if (this.f5744dxjokdxxww.dxjokdxxww(dsvhmnatusVar)) {
                agtfadlqogVarCzzsidtyhn = null;
            } else {
                this.f5744dxjokdxxww.zoijcleaow(dsvhmnatusVar);
                agtfadlqogVarCzzsidtyhn = czzsidtyhn();
            }
        }
        if (agtfadlqogVarCzzsidtyhn != null) {
            gg.kcexrzcfyt.iobyxmoadg iobyxmoadgVar = gg.kcexrzcfyt.f37117yggfygwlhe;
            agtfadlqogVarCzzsidtyhn.resumeWith(gg.kcexrzcfyt.wkgbmnqykc(gg.wwaezpbzkn.f37140iobyxmoadg));
        }
    }

    @Override // androidx.compose.runtime.cqumvgiudr
    public boolean wkgbmnqykc() {
        return ((Boolean) f5737iozdgvuglv.get()).booleanValue();
    }

    public final sj.wypolnanlu zfvoamnweg() {
        return this.f5750iwizpuwonk;
    }

    @Override // androidx.compose.runtime.cqumvgiudr
    public androidx.collection.vipkmwdibw zoijcleaow(dsvhmnatus dsvhmnatusVar, b0 b0Var, tg.rgvfuqvkyq rgvfuqvkyqVar) {
        try {
            b0 b0VarWflxmlrfwp = dsvhmnatusVar.wflxmlrfwp(b0Var);
            try {
                iobyxmoadg(dsvhmnatusVar, rgvfuqvkyqVar);
                androidx.collection.vipkmwdibw vipkmwdibwVarIobyxmoadg = (androidx.collection.wypolnanlu) this.f5742cqumvgiudr.iobyxmoadg();
                if (vipkmwdibwVarIobyxmoadg == null) {
                    vipkmwdibwVarIobyxmoadg = androidx.collection.jhduphickx.iobyxmoadg();
                }
                dsvhmnatusVar.wflxmlrfwp(b0VarWflxmlrfwp);
                this.f5742cqumvgiudr.zoijcleaow(null);
                return vipkmwdibwVarIobyxmoadg;
            } catch (Throwable th2) {
                dsvhmnatusVar.wflxmlrfwp(b0VarWflxmlrfwp);
                throw th2;
            }
        } catch (Throwable th3) {
            this.f5742cqumvgiudr.zoijcleaow(null);
            throw th3;
        }
    }
}
