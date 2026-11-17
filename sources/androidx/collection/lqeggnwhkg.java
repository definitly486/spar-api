package androidx.collection;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
final class lqeggnwhkg implements Set, ug.iobyxmoadg {

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    private final jlmebxxoox f4332zdlpuopuiu;

    static final class iobyxmoadg extends kotlin.coroutines.jvm.internal.gtknphoqwx implements tg.rgvfuqvkyq {

        /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
        int f4334cqumvgiudr;

        /* JADX INFO: renamed from: esjtqupxsv, reason: collision with root package name */
        int f4335esjtqupxsv;

        /* JADX INFO: renamed from: istkbnxepw, reason: collision with root package name */
        private /* synthetic */ Object f4336istkbnxepw;

        /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
        int f4337iwizpuwonk;

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        Object f4338jyumaefscl;

        /* JADX INFO: renamed from: lereixgezr, reason: collision with root package name */
        int f4339lereixgezr;

        /* JADX INFO: renamed from: pmvmpeiblj, reason: collision with root package name */
        long f4340pmvmpeiblj;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        Object f4341yggfygwlhe;

        /* JADX INFO: renamed from: zynmafqrjb, reason: collision with root package name */
        int f4342zynmafqrjb;

        iobyxmoadg(lg.gxszxtbevo gxszxtbevoVar) {
            super(2, gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
            iobyxmoadg iobyxmoadgVar = lqeggnwhkg.this.new iobyxmoadg(gxszxtbevoVar);
            iobyxmoadgVar.f4336istkbnxepw = obj;
            return iobyxmoadgVar;
        }

        /* JADX WARN: Code duplicated, block: B:13:0x0059  */
        /* JADX WARN: Code duplicated, block: B:26:0x00b6  */
        /* JADX WARN: Code duplicated, block: B:28:0x00b9  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:13:0x0059 -> B:14:0x006a). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:18:0x00a3 -> B:20:0x00a6). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:21:0x00a9 -> B:22:0x00aa). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:26:0x00b6 -> B:27:0x00b7). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final java.lang.Object invokeSuspend(java.lang.Object r21) {
            /*
                r20 = this;
                r0 = r20
                java.lang.Object r1 = mg.zoijcleaow.gxszxtbevo()
                int r2 = r0.f4342zynmafqrjb
                r4 = 8
                r5 = 1
                if (r2 == 0) goto L32
                if (r2 != r5) goto L2a
                int r2 = r0.f4339lereixgezr
                int r6 = r0.f4335esjtqupxsv
                long r7 = r0.f4340pmvmpeiblj
                int r9 = r0.f4334cqumvgiudr
                int r10 = r0.f4337iwizpuwonk
                java.lang.Object r11 = r0.f4338jyumaefscl
                long[] r11 = (long[]) r11
                java.lang.Object r12 = r0.f4341yggfygwlhe
                androidx.collection.lqeggnwhkg r12 = (androidx.collection.lqeggnwhkg) r12
                java.lang.Object r13 = r0.f4336istkbnxepw
                lj.draadjrbmk r13 = (lj.draadjrbmk) r13
                gg.zdlpuopuiu.zoijcleaow(r21)
                goto La6
            L2a:
                java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
                java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
                r1.<init>(r2)
                throw r1
            L32:
                gg.zdlpuopuiu.zoijcleaow(r21)
                java.lang.Object r2 = r0.f4336istkbnxepw
                lj.draadjrbmk r2 = (lj.draadjrbmk) r2
                androidx.collection.lqeggnwhkg r6 = androidx.collection.lqeggnwhkg.this
                androidx.collection.jlmebxxoox r6 = androidx.collection.lqeggnwhkg.iobyxmoadg(r6)
                androidx.collection.lqeggnwhkg r7 = androidx.collection.lqeggnwhkg.this
                long[] r6 = r6.f4299iobyxmoadg
                int r8 = r6.length
                int r8 = r8 + (-2)
                if (r8 < 0) goto Lbd
                r9 = 0
            L49:
                r10 = r6[r9]
                long r12 = ~r10
                r14 = 7
                long r12 = r12 << r14
                long r12 = r12 & r10
                r14 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
                long r12 = r12 & r14
                int r12 = (r12 > r14 ? 1 : (r12 == r14 ? 0 : -1))
                if (r12 == 0) goto Lb6
                int r12 = r9 - r8
                int r12 = ~r12
                int r12 = r12 >>> 31
                int r12 = 8 - r12
                r13 = r2
                r2 = 0
                r18 = r10
                r11 = r6
                r10 = r8
                r6 = r12
                r12 = r7
                r7 = r18
            L6a:
                if (r2 >= r6) goto Lae
                r14 = 255(0xff, double:1.26E-321)
                long r14 = r14 & r7
                r16 = 128(0x80, double:6.32E-322)
                int r14 = (r14 > r16 ? 1 : (r14 == r16 ? 0 : -1))
                if (r14 >= 0) goto La9
                int r14 = r9 << 3
                int r14 = r14 + r2
                androidx.collection.zynmafqrjb r15 = new androidx.collection.zynmafqrjb
                androidx.collection.jlmebxxoox r3 = androidx.collection.lqeggnwhkg.iobyxmoadg(r12)
                java.lang.Object[] r3 = r3.f4302zoijcleaow
                r3 = r3[r14]
                androidx.collection.jlmebxxoox r4 = androidx.collection.lqeggnwhkg.iobyxmoadg(r12)
                java.lang.Object[] r4 = r4.f4300ppxfxbqfkf
                r4 = r4[r14]
                r15.<init>(r3, r4)
                r0.f4336istkbnxepw = r13
                r0.f4341yggfygwlhe = r12
                r0.f4338jyumaefscl = r11
                r0.f4337iwizpuwonk = r10
                r0.f4334cqumvgiudr = r9
                r0.f4340pmvmpeiblj = r7
                r0.f4335esjtqupxsv = r6
                r0.f4339lereixgezr = r2
                r0.f4342zynmafqrjb = r5
                java.lang.Object r3 = r13.iobyxmoadg(r15, r0)
                if (r3 != r1) goto La6
                return r1
            La6:
                r3 = 8
                goto Laa
            La9:
                r3 = r4
            Laa:
                long r7 = r7 >> r3
                int r2 = r2 + r5
                r4 = r3
                goto L6a
            Lae:
                r3 = r4
                if (r6 != r3) goto Lbd
                r8 = r10
                r6 = r11
                r7 = r12
                r2 = r13
                goto Lb7
            Lb6:
                r3 = r4
            Lb7:
                if (r9 == r8) goto Lbd
                int r9 = r9 + 1
                r4 = r3
                goto L49
            Lbd:
                gg.wwaezpbzkn r1 = gg.wwaezpbzkn.f37140iobyxmoadg
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.collection.lqeggnwhkg.iobyxmoadg.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // tg.rgvfuqvkyq
        /* JADX INFO: renamed from: ojitshcjhn, reason: merged with bridge method [inline-methods] */
        public final Object invoke(lj.draadjrbmk draadjrbmkVar, lg.gxszxtbevo gxszxtbevoVar) {
            return ((iobyxmoadg) create(draadjrbmkVar, gxszxtbevoVar)).invokeSuspend(gg.wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    public lqeggnwhkg(jlmebxxoox parent) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(parent, "parent");
        this.f4332zdlpuopuiu = parent;
    }

    @Override // java.util.Set, java.util.Collection
    public /* bridge */ /* synthetic */ boolean add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Set, java.util.Collection
    public boolean addAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Set, java.util.Collection
    public void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Set, java.util.Collection
    public final /* bridge */ boolean contains(Object obj) {
        if (obj instanceof Map.Entry) {
            return zoijcleaow((Map.Entry) obj);
        }
        return false;
    }

    @Override // java.util.Set, java.util.Collection
    public boolean containsAll(Collection elements) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(elements, "elements");
        Collection<Map.Entry> collection = elements;
        if (collection.isEmpty()) {
            return true;
        }
        for (Map.Entry entry : collection) {
            if (!kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f4332zdlpuopuiu.eablkybsjg(entry.getKey()), entry.getValue())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Set, java.util.Collection
    public boolean isEmpty() {
        return this.f4332zdlpuopuiu.nufgyqmvbu();
    }

    @Override // java.util.Set, java.util.Collection, java.lang.Iterable
    public Iterator iterator() {
        return lj.wflxmlrfwp.iobyxmoadg(new iobyxmoadg(null));
    }

    public int ppxfxbqfkf() {
        return this.f4332zdlpuopuiu.f4298eablkybsjg;
    }

    @Override // java.util.Set, java.util.Collection
    public boolean remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Set, java.util.Collection
    public boolean removeAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Set, java.util.Collection
    public boolean retainAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Set, java.util.Collection
    public final /* bridge */ int size() {
        return ppxfxbqfkf();
    }

    @Override // java.util.Set, java.util.Collection
    public Object[] toArray() {
        return kotlin.jvm.internal.btonecajqb.iobyxmoadg(this);
    }

    public boolean zoijcleaow(Map.Entry element) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(element, "element");
        return kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f4332zdlpuopuiu.eablkybsjg(element.getKey()), element.getValue());
    }

    @Override // java.util.Set, java.util.Collection
    public Object[] toArray(Object[] array) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(array, "array");
        return kotlin.jvm.internal.btonecajqb.zoijcleaow(this, array);
    }
}
