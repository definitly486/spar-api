package androidx.collection;

import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
final class stevsuqkhv extends ikoacuggdj implements Set, ug.gxszxtbevo {

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    private final wypolnanlu f4366yggfygwlhe;

    public static final class iobyxmoadg implements Iterator, ug.iobyxmoadg {

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        private final Iterator f4368yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        private int f4369zdlpuopuiu = -1;

        /* JADX INFO: renamed from: androidx.collection.stevsuqkhv$iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
        static final class C0077iobyxmoadg extends kotlin.coroutines.jvm.internal.gtknphoqwx implements tg.rgvfuqvkyq {

            /* JADX INFO: renamed from: cdpycssgdh, reason: collision with root package name */
            private /* synthetic */ Object f4370cdpycssgdh;

            /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
            int f4371cqumvgiudr;

            /* JADX INFO: renamed from: esjtqupxsv, reason: collision with root package name */
            int f4372esjtqupxsv;

            /* JADX INFO: renamed from: iozdgvuglv, reason: collision with root package name */
            final /* synthetic */ iobyxmoadg f4373iozdgvuglv;

            /* JADX INFO: renamed from: istkbnxepw, reason: collision with root package name */
            int f4374istkbnxepw;

            /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
            Object f4375iwizpuwonk;

            /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
            Object f4376jyumaefscl;

            /* JADX INFO: renamed from: lereixgezr, reason: collision with root package name */
            int f4377lereixgezr;

            /* JADX INFO: renamed from: pmvmpeiblj, reason: collision with root package name */
            int f4378pmvmpeiblj;

            /* JADX INFO: renamed from: yadqdtsiqt, reason: collision with root package name */
            final /* synthetic */ stevsuqkhv f4379yadqdtsiqt;

            /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
            Object f4380yggfygwlhe;

            /* JADX INFO: renamed from: zynmafqrjb, reason: collision with root package name */
            long f4381zynmafqrjb;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0077iobyxmoadg(stevsuqkhv stevsuqkhvVar, iobyxmoadg iobyxmoadgVar, lg.gxszxtbevo gxszxtbevoVar) {
                super(2, gxszxtbevoVar);
                this.f4379yadqdtsiqt = stevsuqkhvVar;
                this.f4373iozdgvuglv = iobyxmoadgVar;
            }

            @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
            public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
                C0077iobyxmoadg c0077iobyxmoadg = new C0077iobyxmoadg(this.f4379yadqdtsiqt, this.f4373iozdgvuglv, gxszxtbevoVar);
                c0077iobyxmoadg.f4370cdpycssgdh = obj;
                return c0077iobyxmoadg;
            }

            /* JADX WARN: Code duplicated, block: B:13:0x005f  */
            /* JADX WARN: Code duplicated, block: B:21:0x00ac A[DONT_INVERT] */
            /* JADX WARN: Code duplicated, block: B:22:0x00ae  */
            /* JADX WARN: Code duplicated, block: B:24:0x00b9  */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:12:0x005d -> B:23:0x00b7). Please report as a decompilation issue!!! */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:13:0x005f -> B:14:0x0075). Please report as a decompilation issue!!! */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x007e -> B:20:0x00a9). Please report as a decompilation issue!!! */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:18:0x00a6 -> B:20:0x00a9). Please report as a decompilation issue!!! */
            /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
                jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
                	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
                	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
                	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
                */
            @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
            public final java.lang.Object invokeSuspend(java.lang.Object r23) {
                /*
                    r22 = this;
                    r0 = r22
                    java.lang.Object r1 = mg.zoijcleaow.gxszxtbevo()
                    int r2 = r0.f4374istkbnxepw
                    r4 = 8
                    r5 = 1
                    if (r2 == 0) goto L36
                    if (r2 != r5) goto L2e
                    int r2 = r0.f4378pmvmpeiblj
                    int r6 = r0.f4377lereixgezr
                    long r7 = r0.f4381zynmafqrjb
                    int r9 = r0.f4372esjtqupxsv
                    int r10 = r0.f4371cqumvgiudr
                    java.lang.Object r11 = r0.f4375iwizpuwonk
                    long[] r11 = (long[]) r11
                    java.lang.Object r12 = r0.f4376jyumaefscl
                    androidx.collection.stevsuqkhv r12 = (androidx.collection.stevsuqkhv) r12
                    java.lang.Object r13 = r0.f4380yggfygwlhe
                    androidx.collection.stevsuqkhv$iobyxmoadg r13 = (androidx.collection.stevsuqkhv.iobyxmoadg) r13
                    java.lang.Object r14 = r0.f4370cdpycssgdh
                    lj.draadjrbmk r14 = (lj.draadjrbmk) r14
                    gg.zdlpuopuiu.zoijcleaow(r23)
                    goto La9
                L2e:
                    java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
                    java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
                    r1.<init>(r2)
                    throw r1
                L36:
                    gg.zdlpuopuiu.zoijcleaow(r23)
                    java.lang.Object r2 = r0.f4370cdpycssgdh
                    lj.draadjrbmk r2 = (lj.draadjrbmk) r2
                    androidx.collection.stevsuqkhv r6 = r0.f4379yadqdtsiqt
                    androidx.collection.wypolnanlu r6 = androidx.collection.stevsuqkhv.zoijcleaow(r6)
                    androidx.collection.stevsuqkhv$iobyxmoadg r7 = r0.f4373iozdgvuglv
                    androidx.collection.stevsuqkhv r8 = r0.f4379yadqdtsiqt
                    long[] r6 = r6.f4395iobyxmoadg
                    int r9 = r6.length
                    int r9 = r9 + (-2)
                    if (r9 < 0) goto Lbc
                    r10 = 0
                L4f:
                    r11 = r6[r10]
                    long r13 = ~r11
                    r15 = 7
                    long r13 = r13 << r15
                    long r13 = r13 & r11
                    r15 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
                    long r13 = r13 & r15
                    int r13 = (r13 > r15 ? 1 : (r13 == r15 ? 0 : -1))
                    if (r13 == 0) goto Lb7
                    int r13 = r10 - r9
                    int r13 = ~r13
                    int r13 = r13 >>> 31
                    int r13 = 8 - r13
                    r14 = r2
                    r2 = 0
                    r19 = r11
                    r11 = r6
                    r12 = r8
                    r6 = r13
                    r13 = r7
                    r7 = r19
                    r21 = r10
                    r10 = r9
                    r9 = r21
                L75:
                    if (r2 >= r6) goto Lac
                    r15 = 255(0xff, double:1.26E-321)
                    long r15 = r15 & r7
                    r17 = 128(0x80, double:6.32E-322)
                    int r15 = (r15 > r17 ? 1 : (r15 == r17 ? 0 : -1))
                    if (r15 >= 0) goto La9
                    int r15 = r9 << 3
                    int r15 = r15 + r2
                    r13.iobyxmoadg(r15)
                    androidx.collection.wypolnanlu r3 = androidx.collection.stevsuqkhv.zoijcleaow(r12)
                    java.lang.Object[] r3 = r3.f4398zoijcleaow
                    r3 = r3[r15]
                    r0.f4370cdpycssgdh = r14
                    r0.f4380yggfygwlhe = r13
                    r0.f4376jyumaefscl = r12
                    r0.f4375iwizpuwonk = r11
                    r0.f4371cqumvgiudr = r10
                    r0.f4372esjtqupxsv = r9
                    r0.f4381zynmafqrjb = r7
                    r0.f4377lereixgezr = r6
                    r0.f4378pmvmpeiblj = r2
                    r0.f4374istkbnxepw = r5
                    java.lang.Object r3 = r14.iobyxmoadg(r3, r0)
                    if (r3 != r1) goto La9
                    return r1
                La9:
                    long r7 = r7 >> r4
                    int r2 = r2 + r5
                    goto L75
                Lac:
                    if (r6 != r4) goto Lbc
                    r6 = r11
                    r8 = r12
                    r7 = r13
                    r2 = r14
                    r19 = r10
                    r10 = r9
                    r9 = r19
                Lb7:
                    if (r10 == r9) goto Lbc
                    int r10 = r10 + 1
                    goto L4f
                Lbc:
                    gg.wwaezpbzkn r1 = gg.wwaezpbzkn.f37140iobyxmoadg
                    return r1
                */
                throw new UnsupportedOperationException("Method not decompiled: androidx.collection.stevsuqkhv.iobyxmoadg.C0077iobyxmoadg.invokeSuspend(java.lang.Object):java.lang.Object");
            }

            @Override // tg.rgvfuqvkyq
            /* JADX INFO: renamed from: ojitshcjhn, reason: merged with bridge method [inline-methods] */
            public final Object invoke(lj.draadjrbmk draadjrbmkVar, lg.gxszxtbevo gxszxtbevoVar) {
                return ((C0077iobyxmoadg) create(draadjrbmkVar, gxszxtbevoVar)).invokeSuspend(gg.wwaezpbzkn.f37140iobyxmoadg);
            }
        }

        iobyxmoadg() {
            this.f4368yggfygwlhe = lj.wflxmlrfwp.iobyxmoadg(new C0077iobyxmoadg(stevsuqkhv.this, this, null));
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f4368yggfygwlhe.hasNext();
        }

        public final void iobyxmoadg(int i13) {
            this.f4369zdlpuopuiu = i13;
        }

        @Override // java.util.Iterator
        public Object next() {
            return this.f4368yggfygwlhe.next();
        }

        @Override // java.util.Iterator
        public void remove() {
            if (this.f4369zdlpuopuiu != -1) {
                stevsuqkhv.this.f4366yggfygwlhe.pmvmpeiblj(this.f4369zdlpuopuiu);
                this.f4369zdlpuopuiu = -1;
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public stevsuqkhv(wypolnanlu parent) {
        super(parent);
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(parent, "parent");
        this.f4366yggfygwlhe = parent;
    }

    @Override // java.util.Set, java.util.Collection
    public boolean add(Object obj) {
        return this.f4366yggfygwlhe.nufgyqmvbu(obj);
    }

    @Override // java.util.Set, java.util.Collection
    public boolean addAll(Collection elements) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(elements, "elements");
        return this.f4366yggfygwlhe.btonecajqb(elements);
    }

    @Override // java.util.Set, java.util.Collection
    public void clear() {
        this.f4366yggfygwlhe.wflxmlrfwp();
    }

    @Override // java.util.Set, java.util.Collection, java.lang.Iterable
    public Iterator iterator() {
        return new iobyxmoadg();
    }

    @Override // java.util.Set, java.util.Collection
    public boolean remove(Object obj) {
        return this.f4366yggfygwlhe.esjtqupxsv(obj);
    }

    @Override // java.util.Set, java.util.Collection
    public boolean removeAll(Collection elements) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(elements, "elements");
        return this.f4366yggfygwlhe.lereixgezr(elements);
    }

    @Override // java.util.Set, java.util.Collection
    public boolean retainAll(Collection elements) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(elements, "elements");
        return this.f4366yggfygwlhe.istkbnxepw(elements);
    }
}
