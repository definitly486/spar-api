package androidx.collection;

import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
final class cllcsxoeiz extends crxdokpmqz implements Set, ug.gxszxtbevo {

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    private final hkdspvbjdz f4232yggfygwlhe;

    public static final class iobyxmoadg implements Iterator, ug.iobyxmoadg {

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        private final Iterator f4234yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        private int f4235zdlpuopuiu = -1;

        /* JADX INFO: renamed from: androidx.collection.cllcsxoeiz$iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
        static final class C0075iobyxmoadg extends kotlin.coroutines.jvm.internal.gtknphoqwx implements tg.rgvfuqvkyq {

            /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
            int f4236cqumvgiudr;

            /* JADX INFO: renamed from: esjtqupxsv, reason: collision with root package name */
            int f4237esjtqupxsv;

            /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
            Object f4238iwizpuwonk;

            /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
            Object f4239jyumaefscl;

            /* JADX INFO: renamed from: lereixgezr, reason: collision with root package name */
            private /* synthetic */ Object f4240lereixgezr;

            /* JADX INFO: renamed from: pmvmpeiblj, reason: collision with root package name */
            final /* synthetic */ cllcsxoeiz f4241pmvmpeiblj;

            /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
            Object f4242yggfygwlhe;

            /* JADX INFO: renamed from: zynmafqrjb, reason: collision with root package name */
            final /* synthetic */ iobyxmoadg f4243zynmafqrjb;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0075iobyxmoadg(cllcsxoeiz cllcsxoeizVar, iobyxmoadg iobyxmoadgVar, lg.gxszxtbevo gxszxtbevoVar) {
                super(2, gxszxtbevoVar);
                this.f4241pmvmpeiblj = cllcsxoeizVar;
                this.f4243zynmafqrjb = iobyxmoadgVar;
            }

            @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
            public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
                C0075iobyxmoadg c0075iobyxmoadg = new C0075iobyxmoadg(this.f4241pmvmpeiblj, this.f4243zynmafqrjb, gxszxtbevoVar);
                c0075iobyxmoadg.f4240lereixgezr = obj;
                return c0075iobyxmoadg;
            }

            @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
            public final Object invokeSuspend(Object obj) {
                cllcsxoeiz cllcsxoeizVar;
                int i13;
                lj.draadjrbmk draadjrbmkVar;
                iobyxmoadg iobyxmoadgVar;
                long[] jArr;
                Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
                int i14 = this.f4237esjtqupxsv;
                if (i14 == 0) {
                    gg.zdlpuopuiu.zoijcleaow(obj);
                    lj.draadjrbmk draadjrbmkVar2 = (lj.draadjrbmk) this.f4240lereixgezr;
                    hkdspvbjdz hkdspvbjdzVar = this.f4241pmvmpeiblj.f4232yggfygwlhe;
                    iobyxmoadg iobyxmoadgVar2 = this.f4243zynmafqrjb;
                    cllcsxoeizVar = this.f4241pmvmpeiblj;
                    long[] jArr2 = hkdspvbjdzVar.f4387ppxfxbqfkf;
                    i13 = hkdspvbjdzVar.f4383eablkybsjg;
                    draadjrbmkVar = draadjrbmkVar2;
                    iobyxmoadgVar = iobyxmoadgVar2;
                    jArr = jArr2;
                } else {
                    if (i14 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    i13 = this.f4236cqumvgiudr;
                    jArr = (long[]) this.f4238iwizpuwonk;
                    cllcsxoeizVar = (cllcsxoeiz) this.f4239jyumaefscl;
                    iobyxmoadgVar = (iobyxmoadg) this.f4242yggfygwlhe;
                    draadjrbmkVar = (lj.draadjrbmk) this.f4240lereixgezr;
                    gg.zdlpuopuiu.zoijcleaow(obj);
                }
                while (i13 != Integer.MAX_VALUE) {
                    int i15 = (int) ((jArr[i13] >> 31) & 2147483647L);
                    iobyxmoadgVar.iobyxmoadg(i13);
                    Object obj2 = cllcsxoeizVar.f4232yggfygwlhe.f4389zoijcleaow[i13];
                    this.f4240lereixgezr = draadjrbmkVar;
                    this.f4242yggfygwlhe = iobyxmoadgVar;
                    this.f4239jyumaefscl = cllcsxoeizVar;
                    this.f4238iwizpuwonk = jArr;
                    this.f4236cqumvgiudr = i15;
                    this.f4237esjtqupxsv = 1;
                    if (draadjrbmkVar.iobyxmoadg(obj2, this) == objGxszxtbevo) {
                        return objGxszxtbevo;
                    }
                    i13 = i15;
                }
                return gg.wwaezpbzkn.f37140iobyxmoadg;
            }

            @Override // tg.rgvfuqvkyq
            /* JADX INFO: renamed from: ojitshcjhn, reason: merged with bridge method [inline-methods] */
            public final Object invoke(lj.draadjrbmk draadjrbmkVar, lg.gxszxtbevo gxszxtbevoVar) {
                return ((C0075iobyxmoadg) create(draadjrbmkVar, gxszxtbevoVar)).invokeSuspend(gg.wwaezpbzkn.f37140iobyxmoadg);
            }
        }

        iobyxmoadg() {
            this.f4234yggfygwlhe = lj.wflxmlrfwp.iobyxmoadg(new C0075iobyxmoadg(cllcsxoeiz.this, this, null));
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f4234yggfygwlhe.hasNext();
        }

        public final void iobyxmoadg(int i13) {
            this.f4235zdlpuopuiu = i13;
        }

        @Override // java.util.Iterator
        public Object next() {
            return this.f4234yggfygwlhe.next();
        }

        @Override // java.util.Iterator
        public void remove() {
            if (this.f4235zdlpuopuiu != -1) {
                cllcsxoeiz.this.f4232yggfygwlhe.lereixgezr(this.f4235zdlpuopuiu);
                this.f4235zdlpuopuiu = -1;
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cllcsxoeiz(hkdspvbjdz parent) {
        super(parent);
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(parent, "parent");
        this.f4232yggfygwlhe = parent;
    }

    @Override // java.util.Set, java.util.Collection
    public boolean add(Object obj) {
        return this.f4232yggfygwlhe.lqeggnwhkg(obj);
    }

    @Override // java.util.Set, java.util.Collection
    public boolean addAll(Collection elements) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(elements, "elements");
        return this.f4232yggfygwlhe.nufgyqmvbu(elements);
    }

    @Override // java.util.Set, java.util.Collection
    public void clear() {
        this.f4232yggfygwlhe.gtknphoqwx();
    }

    @Override // java.util.Set, java.util.Collection, java.lang.Iterable
    public Iterator iterator() {
        return new iobyxmoadg();
    }

    @Override // java.util.Set, java.util.Collection
    public boolean remove(Object obj) {
        return this.f4232yggfygwlhe.cqumvgiudr(obj);
    }

    @Override // java.util.Set, java.util.Collection
    public boolean removeAll(Collection elements) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(elements, "elements");
        return this.f4232yggfygwlhe.esjtqupxsv(elements);
    }

    @Override // java.util.Set, java.util.Collection
    public boolean retainAll(Collection elements) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(elements, "elements");
        return this.f4232yggfygwlhe.zynmafqrjb(elements);
    }
}
