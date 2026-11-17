package uk1;

import gg.cqumvgiudr;
import gg.vdvldrhtss;
import gg.wwaezpbzkn;
import gg.zdlpuopuiu;
import hg.jyumaefscl;
import hg.tzroggbefp;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.coroutines.jvm.internal.draadjrbmk;
import lg.gxszxtbevo;
import ru.myspar.proloyalty.core.network.model.BasicResponse;
import ru.myspar.proloyalty.qr.domain.model.QrModel;
import sj.dxjokdxxww;
import sj.lqeggnwhkg;
import sj.nufgyqmvbu;
import sk1.QrsResponse;
import zg.gtknphoqwx;

/* JADX INFO: loaded from: classes6.dex */
public final class zoijcleaow implements zk1.zoijcleaow {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final qk1.iobyxmoadg f113805iobyxmoadg;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final rk1.ppxfxbqfkf f113806zoijcleaow;

    static final class eablkybsjg extends draadjrbmk implements tg.draadjrbmk {

        /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
        final /* synthetic */ List f113807iwizpuwonk;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        int f113809yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        Object f113810zdlpuopuiu;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        eablkybsjg(List list, gxszxtbevo gxszxtbevoVar) {
            super(1, gxszxtbevoVar);
            this.f113807iwizpuwonk = list;
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final gxszxtbevo create(gxszxtbevo gxszxtbevoVar) {
            return zoijcleaow.this.new eablkybsjg(this.f113807iwizpuwonk, gxszxtbevoVar);
        }

        /* JADX WARN: Code duplicated, block: B:34:0x00de A[RETURN] */
        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            List list;
            tk1.iobyxmoadg iobyxmoadgVarZoijcleaow;
            rk1.ppxfxbqfkf ppxfxbqfkfVar;
            Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
            int i13 = this.f113809yggfygwlhe;
            if (i13 != 0) {
                if (i13 == 1) {
                    zdlpuopuiu.zoijcleaow(obj);
                } else if (i13 == 2) {
                    list = (List) this.f113810zdlpuopuiu;
                    zdlpuopuiu.zoijcleaow(obj);
                    ppxfxbqfkfVar = zoijcleaow.this.f113806zoijcleaow;
                    this.f113810zdlpuopuiu = null;
                    this.f113809yggfygwlhe = 3;
                    if (ppxfxbqfkfVar.eablkybsjg(list, this) == objGxszxtbevo) {
                        return objGxszxtbevo;
                    }
                } else {
                    if (i13 != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    zdlpuopuiu.zoijcleaow(obj);
                }
                return wwaezpbzkn.f37140iobyxmoadg;
            }
            zdlpuopuiu.zoijcleaow(obj);
            rk1.ppxfxbqfkf ppxfxbqfkfVar2 = zoijcleaow.this.f113806zoijcleaow;
            this.f113809yggfygwlhe = 1;
            obj = ppxfxbqfkfVar2.nufgyqmvbu(this);
            if (obj == objGxszxtbevo) {
                return objGxszxtbevo;
            }
            Iterable<tk1.iobyxmoadg> iterable = (Iterable) obj;
            LinkedHashMap linkedHashMap = new LinkedHashMap(gtknphoqwx.gxszxtbevo(tzroggbefp.eablkybsjg(jyumaefscl.cqumvgiudr(iterable, 10)), 16));
            for (tk1.iobyxmoadg iobyxmoadgVar : iterable) {
                vdvldrhtss vdvldrhtssVarIobyxmoadg = cqumvgiudr.iobyxmoadg(iobyxmoadgVar.wkgbmnqykc(), iobyxmoadgVar.gxszxtbevo());
                linkedHashMap.put(vdvldrhtssVarIobyxmoadg.lqeggnwhkg(), vdvldrhtssVarIobyxmoadg.nufgyqmvbu());
            }
            List list2 = this.f113807iwizpuwonk;
            ArrayList arrayList = new ArrayList(jyumaefscl.cqumvgiudr(list2, 10));
            Iterator it = list2.iterator();
            while (it.hasNext()) {
                tk1.iobyxmoadg iobyxmoadgVarZoijcleaow2 = tk1.zoijcleaow.zoijcleaow((QrModel) it.next());
                tk1.eablkybsjg eablkybsjgVar = (tk1.eablkybsjg) linkedHashMap.get(iobyxmoadgVarZoijcleaow2.wkgbmnqykc());
                if (eablkybsjgVar != null && (iobyxmoadgVarZoijcleaow = tk1.iobyxmoadg.zoijcleaow(iobyxmoadgVarZoijcleaow2, null, null, eablkybsjgVar, null, null, 27, null)) != null) {
                    iobyxmoadgVarZoijcleaow2 = iobyxmoadgVarZoijcleaow;
                }
                arrayList.add(iobyxmoadgVarZoijcleaow2);
            }
            rk1.ppxfxbqfkf ppxfxbqfkfVar3 = zoijcleaow.this.f113806zoijcleaow;
            this.f113810zdlpuopuiu = arrayList;
            this.f113809yggfygwlhe = 2;
            if (ppxfxbqfkfVar3.gxszxtbevo(this) == objGxszxtbevo) {
                return objGxszxtbevo;
            }
            list = arrayList;
            ppxfxbqfkfVar = zoijcleaow.this.f113806zoijcleaow;
            this.f113810zdlpuopuiu = null;
            this.f113809yggfygwlhe = 3;
            if (ppxfxbqfkfVar.eablkybsjg(list, this) == objGxszxtbevo) {
                return objGxszxtbevo;
            }
            return wwaezpbzkn.f37140iobyxmoadg;
        }

        @Override // tg.draadjrbmk
        public final Object invoke(gxszxtbevo gxszxtbevoVar) {
            return ((eablkybsjg) create(gxszxtbevoVar)).invokeSuspend(wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    static final class iobyxmoadg extends kotlin.coroutines.jvm.internal.wkgbmnqykc {

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        int f113811jyumaefscl;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        /* synthetic */ Object f113813zdlpuopuiu;

        iobyxmoadg(gxszxtbevo gxszxtbevoVar) {
            super(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            this.f113813zdlpuopuiu = obj;
            this.f113811jyumaefscl |= Integer.MIN_VALUE;
            return zoijcleaow.this.eablkybsjg(null, this);
        }
    }

    public static final class ppxfxbqfkf implements lqeggnwhkg {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final /* synthetic */ lqeggnwhkg f113814zdlpuopuiu;

        public static final class iobyxmoadg implements nufgyqmvbu {

            /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
            final /* synthetic */ nufgyqmvbu f113815zdlpuopuiu;

            /* JADX INFO: renamed from: uk1.zoijcleaow$ppxfxbqfkf$iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
            public static final class C2822iobyxmoadg extends kotlin.coroutines.jvm.internal.wkgbmnqykc {

                /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
                int f113817yggfygwlhe;

                /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
                /* synthetic */ Object f113818zdlpuopuiu;

                public C2822iobyxmoadg(gxszxtbevo gxszxtbevoVar) {
                    super(gxszxtbevoVar);
                }

                @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
                public final Object invokeSuspend(Object obj) {
                    this.f113818zdlpuopuiu = obj;
                    this.f113817yggfygwlhe |= Integer.MIN_VALUE;
                    return iobyxmoadg.this.emit(null, this);
                }
            }

            public iobyxmoadg(nufgyqmvbu nufgyqmvbuVar) {
                this.f113815zdlpuopuiu = nufgyqmvbuVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // sj.nufgyqmvbu
            public final Object emit(Object obj, gxszxtbevo gxszxtbevoVar) {
                C2822iobyxmoadg c2822iobyxmoadg;
                if (gxszxtbevoVar instanceof C2822iobyxmoadg) {
                    c2822iobyxmoadg = (C2822iobyxmoadg) gxszxtbevoVar;
                    int i13 = c2822iobyxmoadg.f113817yggfygwlhe;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        c2822iobyxmoadg.f113817yggfygwlhe = i13 - Integer.MIN_VALUE;
                    } else {
                        c2822iobyxmoadg = new C2822iobyxmoadg(gxszxtbevoVar);
                    }
                } else {
                    c2822iobyxmoadg = new C2822iobyxmoadg(gxszxtbevoVar);
                }
                Object obj2 = c2822iobyxmoadg.f113818zdlpuopuiu;
                Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
                int i14 = c2822iobyxmoadg.f113817yggfygwlhe;
                if (i14 == 0) {
                    zdlpuopuiu.zoijcleaow(obj2);
                    nufgyqmvbu nufgyqmvbuVar = this.f113815zdlpuopuiu;
                    List list = (List) obj;
                    ArrayList arrayList = new ArrayList(jyumaefscl.cqumvgiudr(list, 10));
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        arrayList.add(tk1.zoijcleaow.iobyxmoadg((tk1.iobyxmoadg) it.next()));
                    }
                    c2822iobyxmoadg.f113817yggfygwlhe = 1;
                    if (nufgyqmvbuVar.emit(arrayList, c2822iobyxmoadg) == objGxszxtbevo) {
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

        public ppxfxbqfkf(lqeggnwhkg lqeggnwhkgVar) {
            this.f113814zdlpuopuiu = lqeggnwhkgVar;
        }

        @Override // sj.lqeggnwhkg
        public Object collect(nufgyqmvbu nufgyqmvbuVar, gxszxtbevo gxszxtbevoVar) {
            Object objCollect = this.f113814zdlpuopuiu.collect(new iobyxmoadg(nufgyqmvbuVar), gxszxtbevoVar);
            return objCollect == mg.zoijcleaow.gxszxtbevo() ? objCollect : wwaezpbzkn.f37140iobyxmoadg;
        }
    }

    static final class wkgbmnqykc extends kotlin.coroutines.jvm.internal.wkgbmnqykc {

        /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
        int f113819iwizpuwonk;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        /* synthetic */ Object f113821yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        Object f113822zdlpuopuiu;

        wkgbmnqykc(gxszxtbevo gxszxtbevoVar) {
            super(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            this.f113821yggfygwlhe = obj;
            this.f113819iwizpuwonk |= Integer.MIN_VALUE;
            return zoijcleaow.this.gxszxtbevo(this);
        }
    }

    /* JADX INFO: renamed from: uk1.zoijcleaow$zoijcleaow, reason: collision with other inner class name */
    static final class C2823zoijcleaow extends kotlin.coroutines.jvm.internal.wkgbmnqykc {

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        int f113823jyumaefscl;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        /* synthetic */ Object f113825zdlpuopuiu;

        C2823zoijcleaow(gxszxtbevo gxszxtbevoVar) {
            super(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            this.f113825zdlpuopuiu = obj;
            this.f113823jyumaefscl |= Integer.MIN_VALUE;
            return zoijcleaow.this.zoijcleaow(this);
        }
    }

    public zoijcleaow(qk1.iobyxmoadg api, rk1.ppxfxbqfkf dao) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(api, "api");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(dao, "dao");
        this.f113805iobyxmoadg = api;
        this.f113806zoijcleaow = dao;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // zk1.zoijcleaow
    public Object eablkybsjg(String str, gxszxtbevo gxszxtbevoVar) {
        iobyxmoadg iobyxmoadgVar;
        if (gxszxtbevoVar instanceof iobyxmoadg) {
            iobyxmoadgVar = (iobyxmoadg) gxszxtbevoVar;
            int i13 = iobyxmoadgVar.f113811jyumaefscl;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                iobyxmoadgVar.f113811jyumaefscl = i13 - Integer.MIN_VALUE;
            } else {
                iobyxmoadgVar = new iobyxmoadg(gxszxtbevoVar);
            }
        } else {
            iobyxmoadgVar = new iobyxmoadg(gxszxtbevoVar);
        }
        Object objLqeggnwhkg = iobyxmoadgVar.f113813zdlpuopuiu;
        Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
        int i14 = iobyxmoadgVar.f113811jyumaefscl;
        if (i14 == 0) {
            zdlpuopuiu.zoijcleaow(objLqeggnwhkg);
            rk1.ppxfxbqfkf ppxfxbqfkfVar = this.f113806zoijcleaow;
            iobyxmoadgVar.f113811jyumaefscl = 1;
            objLqeggnwhkg = ppxfxbqfkfVar.lqeggnwhkg(str, iobyxmoadgVar);
            if (objLqeggnwhkg == objGxszxtbevo) {
                return objGxszxtbevo;
            }
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            zdlpuopuiu.zoijcleaow(objLqeggnwhkg);
        }
        tk1.iobyxmoadg iobyxmoadgVar2 = (tk1.iobyxmoadg) objLqeggnwhkg;
        if (iobyxmoadgVar2 != null) {
            return tk1.zoijcleaow.iobyxmoadg(iobyxmoadgVar2);
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // zk1.zoijcleaow
    public Object gxszxtbevo(gxszxtbevo gxszxtbevoVar) {
        wkgbmnqykc wkgbmnqykcVar;
        zoijcleaow zoijcleaowVar;
        if (gxszxtbevoVar instanceof wkgbmnqykc) {
            wkgbmnqykcVar = (wkgbmnqykc) gxszxtbevoVar;
            int i13 = wkgbmnqykcVar.f113819iwizpuwonk;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                wkgbmnqykcVar.f113819iwizpuwonk = i13 - Integer.MIN_VALUE;
            } else {
                wkgbmnqykcVar = new wkgbmnqykc(gxszxtbevoVar);
            }
        } else {
            wkgbmnqykcVar = new wkgbmnqykc(gxszxtbevoVar);
        }
        Object objIobyxmoadg = wkgbmnqykcVar.f113821yggfygwlhe;
        Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
        int i14 = wkgbmnqykcVar.f113819iwizpuwonk;
        if (i14 != 0) {
            if (i14 == 1) {
                zoijcleaowVar = (zoijcleaow) wkgbmnqykcVar.f113822zdlpuopuiu;
                zdlpuopuiu.zoijcleaow(objIobyxmoadg);
            } else {
                if (i14 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                zdlpuopuiu.zoijcleaow(objIobyxmoadg);
            }
            return wwaezpbzkn.f37140iobyxmoadg;
        }
        zdlpuopuiu.zoijcleaow(objIobyxmoadg);
        qk1.iobyxmoadg iobyxmoadgVar = this.f113805iobyxmoadg;
        wkgbmnqykcVar.f113822zdlpuopuiu = this;
        wkgbmnqykcVar.f113819iwizpuwonk = 1;
        objIobyxmoadg = iobyxmoadgVar.iobyxmoadg(wkgbmnqykcVar);
        if (objIobyxmoadg == objGxszxtbevo) {
            return objGxszxtbevo;
        }
        zoijcleaowVar = this;
        List listIobyxmoadg = sk1.lqeggnwhkg.iobyxmoadg((QrsResponse) x21.wkgbmnqykc.oxmwwwfdhm((BasicResponse) objIobyxmoadg, null, 1, null));
        rk1.ppxfxbqfkf ppxfxbqfkfVar = zoijcleaowVar.f113806zoijcleaow;
        eablkybsjg eablkybsjgVar = zoijcleaowVar.new eablkybsjg(listIobyxmoadg, null);
        wkgbmnqykcVar.f113822zdlpuopuiu = listIobyxmoadg;
        wkgbmnqykcVar.f113819iwizpuwonk = 2;
        if (ppxfxbqfkfVar.ppxfxbqfkf(eablkybsjgVar, wkgbmnqykcVar) == objGxszxtbevo) {
            return objGxszxtbevo;
        }
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    @Override // zk1.zoijcleaow
    public Object iobyxmoadg(gxszxtbevo gxszxtbevoVar) {
        Object objGxszxtbevo = this.f113806zoijcleaow.gxszxtbevo(gxszxtbevoVar);
        return objGxszxtbevo == mg.zoijcleaow.gxszxtbevo() ? objGxszxtbevo : wwaezpbzkn.f37140iobyxmoadg;
    }

    @Override // zk1.zoijcleaow
    public Object lqeggnwhkg(QrModel qrModel, gxszxtbevo gxszxtbevoVar) {
        Object objGtknphoqwx = this.f113806zoijcleaow.gtknphoqwx(tk1.zoijcleaow.zoijcleaow(qrModel), gxszxtbevoVar);
        return objGtknphoqwx == mg.zoijcleaow.gxszxtbevo() ? objGtknphoqwx : wwaezpbzkn.f37140iobyxmoadg;
    }

    @Override // zk1.zoijcleaow
    public lqeggnwhkg ppxfxbqfkf() {
        return new ppxfxbqfkf(dxjokdxxww.vdvldrhtss(this.f113806zoijcleaow.dxjokdxxww()));
    }

    @Override // zk1.zoijcleaow
    public Object wkgbmnqykc(List list, gxszxtbevo gxszxtbevoVar) {
        rk1.ppxfxbqfkf ppxfxbqfkfVar = this.f113806zoijcleaow;
        ArrayList arrayList = new ArrayList(jyumaefscl.cqumvgiudr(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(tk1.zoijcleaow.zoijcleaow((QrModel) it.next()));
        }
        Object objBtonecajqb = ppxfxbqfkfVar.btonecajqb(arrayList, gxszxtbevoVar);
        return objBtonecajqb == mg.zoijcleaow.gxszxtbevo() ? objBtonecajqb : wwaezpbzkn.f37140iobyxmoadg;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // zk1.zoijcleaow
    public Object zoijcleaow(gxszxtbevo gxszxtbevoVar) {
        C2823zoijcleaow c2823zoijcleaow;
        if (gxszxtbevoVar instanceof C2823zoijcleaow) {
            c2823zoijcleaow = (C2823zoijcleaow) gxszxtbevoVar;
            int i13 = c2823zoijcleaow.f113823jyumaefscl;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                c2823zoijcleaow.f113823jyumaefscl = i13 - Integer.MIN_VALUE;
            } else {
                c2823zoijcleaow = new C2823zoijcleaow(gxszxtbevoVar);
            }
        } else {
            c2823zoijcleaow = new C2823zoijcleaow(gxszxtbevoVar);
        }
        Object objNufgyqmvbu = c2823zoijcleaow.f113825zdlpuopuiu;
        Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
        int i14 = c2823zoijcleaow.f113823jyumaefscl;
        if (i14 == 0) {
            zdlpuopuiu.zoijcleaow(objNufgyqmvbu);
            rk1.ppxfxbqfkf ppxfxbqfkfVar = this.f113806zoijcleaow;
            c2823zoijcleaow.f113823jyumaefscl = 1;
            objNufgyqmvbu = ppxfxbqfkfVar.nufgyqmvbu(c2823zoijcleaow);
            if (objNufgyqmvbu == objGxszxtbevo) {
                return objGxszxtbevo;
            }
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            zdlpuopuiu.zoijcleaow(objNufgyqmvbu);
        }
        Iterable iterable = (Iterable) objNufgyqmvbu;
        ArrayList arrayList = new ArrayList(jyumaefscl.cqumvgiudr(iterable, 10));
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            arrayList.add(tk1.zoijcleaow.iobyxmoadg((tk1.iobyxmoadg) it.next()));
        }
        return arrayList;
    }
}
