package d2;

import androidx.appcompat.app.yggfygwlhe;
import gg.wwaezpbzkn;
import gg.zdlpuopuiu;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.hkdspvbjdz;
import tg.rgvfuqvkyq;

/* JADX INFO: loaded from: classes.dex */
public abstract class wkgbmnqykc {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    public static final iobyxmoadg f26809iobyxmoadg = new iobyxmoadg(null);

    public static final class iobyxmoadg {

        /* JADX INFO: renamed from: d2.wkgbmnqykc$iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
        static final class C0483iobyxmoadg extends kotlin.coroutines.jvm.internal.draadjrbmk implements rgvfuqvkyq {

            /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
            final /* synthetic */ List f26810jyumaefscl;

            /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
            /* synthetic */ Object f26811yggfygwlhe;

            /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
            int f26812zdlpuopuiu;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0483iobyxmoadg(List list, lg.gxszxtbevo gxszxtbevoVar) {
                super(2, gxszxtbevoVar);
                this.f26810jyumaefscl = list;
            }

            @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
            public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
                C0483iobyxmoadg c0483iobyxmoadg = new C0483iobyxmoadg(this.f26810jyumaefscl, gxszxtbevoVar);
                c0483iobyxmoadg.f26811yggfygwlhe = obj;
                return c0483iobyxmoadg;
            }

            @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
            public final Object invokeSuspend(Object obj) {
                Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
                int i13 = this.f26812zdlpuopuiu;
                if (i13 == 0) {
                    zdlpuopuiu.zoijcleaow(obj);
                    nufgyqmvbu nufgyqmvbuVar = (nufgyqmvbu) this.f26811yggfygwlhe;
                    iobyxmoadg iobyxmoadgVar = wkgbmnqykc.f26809iobyxmoadg;
                    List list = this.f26810jyumaefscl;
                    this.f26812zdlpuopuiu = 1;
                    if (iobyxmoadgVar.ppxfxbqfkf(list, nufgyqmvbuVar, this) == objGxszxtbevo) {
                        return objGxszxtbevo;
                    }
                } else {
                    if (i13 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    zdlpuopuiu.zoijcleaow(obj);
                }
                return wwaezpbzkn.f37140iobyxmoadg;
            }

            @Override // tg.rgvfuqvkyq
            /* JADX INFO: renamed from: ojitshcjhn, reason: merged with bridge method [inline-methods] */
            public final Object invoke(nufgyqmvbu nufgyqmvbuVar, lg.gxszxtbevo gxszxtbevoVar) {
                return ((C0483iobyxmoadg) create(nufgyqmvbuVar, gxszxtbevoVar)).invokeSuspend(wwaezpbzkn.f37140iobyxmoadg);
            }
        }

        static final class ppxfxbqfkf extends kotlin.coroutines.jvm.internal.draadjrbmk implements rgvfuqvkyq {

            /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
            /* synthetic */ Object f26813cqumvgiudr;

            /* JADX INFO: renamed from: esjtqupxsv, reason: collision with root package name */
            final /* synthetic */ List f26814esjtqupxsv;

            /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
            int f26815iwizpuwonk;

            /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
            Object f26816jyumaefscl;

            /* JADX INFO: renamed from: lereixgezr, reason: collision with root package name */
            final /* synthetic */ List f26817lereixgezr;

            /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
            Object f26818yggfygwlhe;

            /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
            Object f26819zdlpuopuiu;

            /* JADX INFO: renamed from: d2.wkgbmnqykc$iobyxmoadg$ppxfxbqfkf$iobyxmoadg, reason: collision with other inner class name */
            static final class C0484iobyxmoadg extends kotlin.coroutines.jvm.internal.draadjrbmk implements tg.draadjrbmk {

                /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
                int f26820zdlpuopuiu;

                C0484iobyxmoadg(d2.ppxfxbqfkf ppxfxbqfkfVar, lg.gxszxtbevo gxszxtbevoVar) {
                    super(1, gxszxtbevoVar);
                }

                @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
                public final lg.gxszxtbevo create(lg.gxszxtbevo gxszxtbevoVar) {
                    return new C0484iobyxmoadg(null, gxszxtbevoVar);
                }

                @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
                public final Object invokeSuspend(Object obj) {
                    mg.zoijcleaow.gxszxtbevo();
                    int i13 = this.f26820zdlpuopuiu;
                    if (i13 == 0) {
                        zdlpuopuiu.zoijcleaow(obj);
                        this.f26820zdlpuopuiu = 1;
                        throw null;
                    }
                    if (i13 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    zdlpuopuiu.zoijcleaow(obj);
                    return wwaezpbzkn.f37140iobyxmoadg;
                }

                @Override // tg.draadjrbmk
                public final Object invoke(lg.gxszxtbevo gxszxtbevoVar) {
                    return ((C0484iobyxmoadg) create(gxszxtbevoVar)).invokeSuspend(wwaezpbzkn.f37140iobyxmoadg);
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            ppxfxbqfkf(List list, List list2, lg.gxszxtbevo gxszxtbevoVar) {
                super(2, gxszxtbevoVar);
                this.f26814esjtqupxsv = list;
                this.f26817lereixgezr = list2;
            }

            @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
            public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
                ppxfxbqfkf ppxfxbqfkfVar = new ppxfxbqfkf(this.f26814esjtqupxsv, this.f26817lereixgezr, gxszxtbevoVar);
                ppxfxbqfkfVar.f26813cqumvgiudr = obj;
                return ppxfxbqfkfVar;
            }

            @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
            public final Object invokeSuspend(Object obj) {
                List list;
                Iterator it;
                mg.zoijcleaow.gxszxtbevo();
                int i13 = this.f26815iwizpuwonk;
                if (i13 == 0) {
                    zdlpuopuiu.zoijcleaow(obj);
                    obj = this.f26813cqumvgiudr;
                    List list2 = this.f26814esjtqupxsv;
                    list = this.f26817lereixgezr;
                    it = list2.iterator();
                } else if (i13 == 1) {
                    Object obj2 = this.f26816jyumaefscl;
                    yggfygwlhe.iobyxmoadg(this.f26818yggfygwlhe);
                    Iterator it2 = (Iterator) this.f26819zdlpuopuiu;
                    List list3 = (List) this.f26813cqumvgiudr;
                    zdlpuopuiu.zoijcleaow(obj);
                    if (((Boolean) obj).booleanValue()) {
                        list3.add(new C0484iobyxmoadg(null, null));
                        this.f26813cqumvgiudr = list3;
                        this.f26819zdlpuopuiu = it2;
                        this.f26818yggfygwlhe = null;
                        this.f26816jyumaefscl = null;
                        this.f26815iwizpuwonk = 2;
                        throw null;
                    }
                    obj = obj2;
                    it = it2;
                    list = list3;
                } else {
                    if (i13 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    it = (Iterator) this.f26819zdlpuopuiu;
                    list = (List) this.f26813cqumvgiudr;
                    zdlpuopuiu.zoijcleaow(obj);
                }
                if (!it.hasNext()) {
                    return obj;
                }
                yggfygwlhe.iobyxmoadg(it.next());
                this.f26813cqumvgiudr = list;
                this.f26819zdlpuopuiu = it;
                this.f26818yggfygwlhe = null;
                this.f26816jyumaefscl = obj;
                this.f26815iwizpuwonk = 1;
                throw null;
            }

            @Override // tg.rgvfuqvkyq
            /* JADX INFO: renamed from: ojitshcjhn, reason: merged with bridge method [inline-methods] */
            public final Object invoke(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
                return ((ppxfxbqfkf) create(obj, gxszxtbevoVar)).invokeSuspend(wwaezpbzkn.f37140iobyxmoadg);
            }
        }

        static final class zoijcleaow extends kotlin.coroutines.jvm.internal.wkgbmnqykc {

            /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
            int f26821cqumvgiudr;

            /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
            /* synthetic */ Object f26823jyumaefscl;

            /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
            Object f26824yggfygwlhe;

            /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
            Object f26825zdlpuopuiu;

            zoijcleaow(lg.gxszxtbevo gxszxtbevoVar) {
                super(gxszxtbevoVar);
            }

            @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
            public final Object invokeSuspend(Object obj) {
                this.f26823jyumaefscl = obj;
                this.f26821cqumvgiudr |= Integer.MIN_VALUE;
                return iobyxmoadg.this.ppxfxbqfkf(null, null, this);
            }
        }

        public /* synthetic */ iobyxmoadg(kotlin.jvm.internal.gtknphoqwx gtknphoqwxVar) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX WARN: Code duplicated, block: B:27:0x006f  */
        /* JADX WARN: Code duplicated, block: B:37:0x009a  */
        /* JADX WARN: Code duplicated, block: B:39:0x009d  */
        /* JADX WARN: Code duplicated, block: B:43:0x0081 A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:45:? A[LOOP:0: B:25:0x0069->B:45:?, LOOP_END, SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:33:0x0086 -> B:25:0x0069). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:34:0x0089 -> B:25:0x0069). Please report as a decompilation issue!!! */
        public final Object ppxfxbqfkf(List list, nufgyqmvbu nufgyqmvbuVar, lg.gxszxtbevo gxszxtbevoVar) throws Throwable {
            zoijcleaow zoijcleaowVar;
            List list2;
            hkdspvbjdz hkdspvbjdzVar;
            Iterator it;
            Throwable th2;
            tg.draadjrbmk draadjrbmkVar;
            if (gxszxtbevoVar instanceof zoijcleaow) {
                zoijcleaowVar = (zoijcleaow) gxszxtbevoVar;
                int i13 = zoijcleaowVar.f26821cqumvgiudr;
                if ((i13 & Integer.MIN_VALUE) != 0) {
                    zoijcleaowVar.f26821cqumvgiudr = i13 - Integer.MIN_VALUE;
                } else {
                    zoijcleaowVar = new zoijcleaow(gxszxtbevoVar);
                }
            } else {
                zoijcleaowVar = new zoijcleaow(gxszxtbevoVar);
            }
            Object obj = zoijcleaowVar.f26823jyumaefscl;
            Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
            int i14 = zoijcleaowVar.f26821cqumvgiudr;
            if (i14 != 0) {
                if (i14 == 1) {
                    list2 = (List) zoijcleaowVar.f26825zdlpuopuiu;
                    zdlpuopuiu.zoijcleaow(obj);
                } else {
                    if (i14 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    it = (Iterator) zoijcleaowVar.f26824yggfygwlhe;
                    hkdspvbjdzVar = (hkdspvbjdz) zoijcleaowVar.f26825zdlpuopuiu;
                    try {
                        zdlpuopuiu.zoijcleaow(obj);
                    } catch (Throwable th3) {
                        Object obj2 = hkdspvbjdzVar.f60015zdlpuopuiu;
                        if (obj2 == null) {
                            hkdspvbjdzVar.f60015zdlpuopuiu = th3;
                        } else {
                            kotlin.jvm.internal.zdlpuopuiu.lqeggnwhkg(obj2);
                            gg.lqeggnwhkg.iobyxmoadg((Throwable) hkdspvbjdzVar.f60015zdlpuopuiu, th3);
                        }
                    }
                }
                while (it.hasNext()) {
                    draadjrbmkVar = (tg.draadjrbmk) it.next();
                    zoijcleaowVar.f26825zdlpuopuiu = hkdspvbjdzVar;
                    zoijcleaowVar.f26824yggfygwlhe = it;
                    zoijcleaowVar.f26821cqumvgiudr = 2;
                    if (draadjrbmkVar.invoke(zoijcleaowVar) == objGxszxtbevo) {
                        return objGxszxtbevo;
                    }
                }
                th2 = (Throwable) hkdspvbjdzVar.f60015zdlpuopuiu;
                if (th2 == null) {
                    return wwaezpbzkn.f37140iobyxmoadg;
                }
                throw th2;
            }
            zdlpuopuiu.zoijcleaow(obj);
            ArrayList arrayList = new ArrayList();
            rgvfuqvkyq ppxfxbqfkfVar = new ppxfxbqfkf(list, arrayList, null);
            zoijcleaowVar.f26825zdlpuopuiu = arrayList;
            zoijcleaowVar.f26821cqumvgiudr = 1;
            if (nufgyqmvbuVar.iobyxmoadg(ppxfxbqfkfVar, zoijcleaowVar) == objGxszxtbevo) {
                return objGxszxtbevo;
            }
            list2 = arrayList;
            hkdspvbjdzVar = new hkdspvbjdz();
            it = list2.iterator();
            while (it.hasNext()) {
                draadjrbmkVar = (tg.draadjrbmk) it.next();
                zoijcleaowVar.f26825zdlpuopuiu = hkdspvbjdzVar;
                zoijcleaowVar.f26824yggfygwlhe = it;
                zoijcleaowVar.f26821cqumvgiudr = 2;
                if (draadjrbmkVar.invoke(zoijcleaowVar) == objGxszxtbevo) {
                    return objGxszxtbevo;
                }
            }
            th2 = (Throwable) hkdspvbjdzVar.f60015zdlpuopuiu;
            if (th2 == null) {
                return wwaezpbzkn.f37140iobyxmoadg;
            }
            throw th2;
        }

        public final rgvfuqvkyq zoijcleaow(List migrations) {
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(migrations, "migrations");
            return new C0483iobyxmoadg(migrations, null);
        }

        private iobyxmoadg() {
        }
    }
}
