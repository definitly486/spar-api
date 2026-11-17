package sj;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: loaded from: classes3.dex */
final class stevsuqkhv extends tj.iobyxmoadg implements zynmafqrjb, lqeggnwhkg, tj.rgvfuqvkyq {

    /* JADX INFO: renamed from: esjtqupxsv, reason: collision with root package name */
    private static final /* synthetic */ AtomicReferenceFieldUpdater f107041esjtqupxsv = AtomicReferenceFieldUpdater.newUpdater(stevsuqkhv.class, Object.class, "_state$volatile");
    private volatile /* synthetic */ Object _state$volatile;

    /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
    private int f107042cqumvgiudr;

    static final class iobyxmoadg extends kotlin.coroutines.jvm.internal.wkgbmnqykc {

        /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
        Object f107043cqumvgiudr;

        /* JADX INFO: renamed from: esjtqupxsv, reason: collision with root package name */
        /* synthetic */ Object f107044esjtqupxsv;

        /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
        Object f107045iwizpuwonk;

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        Object f107046jyumaefscl;

        /* JADX INFO: renamed from: pmvmpeiblj, reason: collision with root package name */
        int f107048pmvmpeiblj;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        Object f107049yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        Object f107050zdlpuopuiu;

        iobyxmoadg(lg.gxszxtbevo gxszxtbevoVar) {
            super(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            this.f107044esjtqupxsv = obj;
            this.f107048pmvmpeiblj |= Integer.MIN_VALUE;
            return stevsuqkhv.this.collect(null, this);
        }
    }

    public stevsuqkhv(Object obj) {
        this._state$volatile = obj;
    }

    private final boolean rgvfuqvkyq(Object obj, Object obj2) {
        int i13;
        tj.ppxfxbqfkf[] ppxfxbqfkfVarArrDraadjrbmk;
        synchronized (this) {
            Object obj3 = f107041esjtqupxsv.get(this);
            if (obj != null && !kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(obj3, obj)) {
                return false;
            }
            if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(obj3, obj2)) {
                return true;
            }
            f107041esjtqupxsv.set(this, obj2);
            int i14 = this.f107042cqumvgiudr;
            if ((i14 & 1) != 0) {
                this.f107042cqumvgiudr = i14 + 2;
                return true;
            }
            int i15 = i14 + 1;
            this.f107042cqumvgiudr = i15;
            tj.ppxfxbqfkf[] ppxfxbqfkfVarArrDraadjrbmk2 = draadjrbmk();
            gg.wwaezpbzkn wwaezpbzknVar = gg.wwaezpbzkn.f37140iobyxmoadg;
            while (true) {
                tzroggbefp[] tzroggbefpVarArr = (tzroggbefp[]) ppxfxbqfkfVarArrDraadjrbmk2;
                if (tzroggbefpVarArr != null) {
                    for (tzroggbefp tzroggbefpVar : tzroggbefpVarArr) {
                        if (tzroggbefpVar != null) {
                            tzroggbefpVar.lqeggnwhkg();
                        }
                    }
                }
                synchronized (this) {
                    i13 = this.f107042cqumvgiudr;
                    if (i13 == i15) {
                        this.f107042cqumvgiudr = i15 + 1;
                        return true;
                    }
                    ppxfxbqfkfVarArrDraadjrbmk = draadjrbmk();
                    gg.wwaezpbzkn wwaezpbzknVar2 = gg.wwaezpbzkn.f37140iobyxmoadg;
                }
                ppxfxbqfkfVarArrDraadjrbmk2 = ppxfxbqfkfVarArrDraadjrbmk;
                i15 = i13;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // tj.iobyxmoadg
    /* JADX INFO: renamed from: agtfadlqog, reason: merged with bridge method [inline-methods] */
    public tzroggbefp[] nufgyqmvbu(int i13) {
        return new tzroggbefp[i13];
    }

    @Override // sj.pmvmpeiblj
    public void btonecajqb() {
        throw new UnsupportedOperationException("MutableStateFlow.resetReplayCache is not supported");
    }

    /* JADX WARN: Code duplicated, block: B:31:0x0099 A[Catch: all -> 0x0042, TryCatch #0 {all -> 0x0042, blocks: (B:15:0x003e, B:29:0x008f, B:31:0x0099, B:33:0x009e, B:43:0x00bf, B:45:0x00c5, B:35:0x00a4, B:39:0x00ab, B:22:0x005f, B:25:0x0071, B:28:0x0080), top: B:50:0x0023 }] */
    /* JADX WARN: Code duplicated, block: B:33:0x009e A[Catch: all -> 0x0042, TryCatch #0 {all -> 0x0042, blocks: (B:15:0x003e, B:29:0x008f, B:31:0x0099, B:33:0x009e, B:43:0x00bf, B:45:0x00c5, B:35:0x00a4, B:39:0x00ab, B:22:0x005f, B:25:0x0071, B:28:0x0080), top: B:50:0x0023 }] */
    /* JADX WARN: Code duplicated, block: B:35:0x00a4 A[Catch: all -> 0x0042, TryCatch #0 {all -> 0x0042, blocks: (B:15:0x003e, B:29:0x008f, B:31:0x0099, B:33:0x009e, B:43:0x00bf, B:45:0x00c5, B:35:0x00a4, B:39:0x00ab, B:22:0x005f, B:25:0x0071, B:28:0x0080), top: B:50:0x0023 }] */
    /* JADX WARN: Code duplicated, block: B:37:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:38:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:41:0x00bd A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:42:0x00be  */
    /* JADX WARN: Code duplicated, block: B:45:0x00c5 A[Catch: all -> 0x0042, TRY_LEAVE, TryCatch #0 {all -> 0x0042, blocks: (B:15:0x003e, B:29:0x008f, B:31:0x0099, B:33:0x009e, B:43:0x00bf, B:45:0x00c5, B:35:0x00a4, B:39:0x00ab, B:22:0x005f, B:25:0x0071, B:28:0x0080), top: B:50:0x0023 }] */
    /* JADX WARN: Code duplicated, block: B:47:0x00d7 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:44:0x00c3 -> B:29:0x008f). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:46:0x00d5 -> B:29:0x008f). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:42:0x00be
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // sj.iozdgvuglv, sj.lqeggnwhkg
    public java.lang.Object collect(sj.nufgyqmvbu r11, lg.gxszxtbevo r12) {
        /*
            Method dump skipped, instruction units count: 220
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: sj.stevsuqkhv.collect(sj.nufgyqmvbu, lg.gxszxtbevo):java.lang.Object");
    }

    @Override // sj.zynmafqrjb
    public boolean compareAndSet(Object obj, Object obj2) {
        if (obj == null) {
            obj = tj.kcexrzcfyt.f110690iobyxmoadg;
        }
        if (obj2 == null) {
            obj2 = tj.kcexrzcfyt.f110690iobyxmoadg;
        }
        return rgvfuqvkyq(obj, obj2);
    }

    @Override // sj.pmvmpeiblj, sj.nufgyqmvbu
    public Object emit(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
        setValue(obj);
        return gg.wwaezpbzkn.f37140iobyxmoadg;
    }

    @Override // sj.zynmafqrjb, sj.wypolnanlu
    public Object getValue() {
        uj.istkbnxepw istkbnxepwVar = tj.kcexrzcfyt.f110690iobyxmoadg;
        Object obj = f107041esjtqupxsv.get(this);
        if (obj == istkbnxepwVar) {
            return null;
        }
        return obj;
    }

    @Override // sj.pmvmpeiblj
    public boolean iobyxmoadg(Object obj) {
        setValue(obj);
        return true;
    }

    @Override // sj.zynmafqrjb
    public void setValue(Object obj) {
        if (obj == null) {
            obj = tj.kcexrzcfyt.f110690iobyxmoadg;
        }
        rgvfuqvkyq(null, obj);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // tj.iobyxmoadg
    /* JADX INFO: renamed from: wflxmlrfwp, reason: merged with bridge method [inline-methods] */
    public tzroggbefp gxszxtbevo() {
        return new tzroggbefp();
    }

    @Override // tj.rgvfuqvkyq
    public lqeggnwhkg zoijcleaow(lg.btonecajqb btonecajqbVar, int i13, rj.iobyxmoadg iobyxmoadgVar) {
        return kegysxyocb.wkgbmnqykc(this, btonecajqbVar, i13, iobyxmoadgVar);
    }
}
