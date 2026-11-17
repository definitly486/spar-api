package bl;

/* JADX INFO: loaded from: classes3.dex */
public final class lereixgezr implements wwaezpbzkn {

    /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
    private boolean f16710cqumvgiudr;

    /* JADX INFO: renamed from: esjtqupxsv, reason: collision with root package name */
    private long f16711esjtqupxsv;

    /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
    private int f16712iwizpuwonk;

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
    private istkbnxepw f16713jyumaefscl;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    private final ppxfxbqfkf f16714yggfygwlhe;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    private final eablkybsjg f16715zdlpuopuiu;

    public lereixgezr(eablkybsjg upstream) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(upstream, "upstream");
        this.f16715zdlpuopuiu = upstream;
        ppxfxbqfkf ppxfxbqfkfVarZoijcleaow = upstream.zoijcleaow();
        this.f16714yggfygwlhe = ppxfxbqfkfVarZoijcleaow;
        istkbnxepw istkbnxepwVar = ppxfxbqfkfVarZoijcleaow.f16740zdlpuopuiu;
        this.f16713jyumaefscl = istkbnxepwVar;
        this.f16712iwizpuwonk = istkbnxepwVar != null ? istkbnxepwVar.f16704zoijcleaow : -1;
    }

    @Override // bl.wwaezpbzkn, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f16710cqumvgiudr = true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0020, code lost:
    
        if (r3 == r4.f16704zoijcleaow) goto L15;
     */
    @Override // bl.wwaezpbzkn
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public long fmlbqenlif(bl.ppxfxbqfkf r9, long r10) {
        /*
            r8 = this;
            java.lang.String r0 = "sink"
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(r9, r0)
            r0 = 0
            int r2 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
            if (r2 < 0) goto L75
            boolean r3 = r8.f16710cqumvgiudr
            if (r3 != 0) goto L6d
            bl.istkbnxepw r3 = r8.f16713jyumaefscl
            if (r3 == 0) goto L2b
            bl.ppxfxbqfkf r4 = r8.f16714yggfygwlhe
            bl.istkbnxepw r4 = r4.f16740zdlpuopuiu
            if (r3 != r4) goto L23
            int r3 = r8.f16712iwizpuwonk
            kotlin.jvm.internal.zdlpuopuiu.lqeggnwhkg(r4)
            int r4 = r4.f16704zoijcleaow
            if (r3 != r4) goto L23
            goto L2b
        L23:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "Peek source is invalid because upstream source was used"
            r9.<init>(r10)
            throw r9
        L2b:
            if (r2 != 0) goto L2e
            return r0
        L2e:
            bl.eablkybsjg r0 = r8.f16715zdlpuopuiu
            long r1 = r8.f16711esjtqupxsv
            r3 = 1
            long r1 = r1 + r3
            boolean r0 = r0.lrnfpwlwnk(r1)
            if (r0 != 0) goto L3e
            r9 = -1
            return r9
        L3e:
            bl.istkbnxepw r0 = r8.f16713jyumaefscl
            if (r0 != 0) goto L51
            bl.ppxfxbqfkf r0 = r8.f16714yggfygwlhe
            bl.istkbnxepw r0 = r0.f16740zdlpuopuiu
            if (r0 == 0) goto L51
            r8.f16713jyumaefscl = r0
            kotlin.jvm.internal.zdlpuopuiu.lqeggnwhkg(r0)
            int r0 = r0.f16704zoijcleaow
            r8.f16712iwizpuwonk = r0
        L51:
            bl.ppxfxbqfkf r0 = r8.f16714yggfygwlhe
            long r0 = r0.dsvhmnatus()
            long r2 = r8.f16711esjtqupxsv
            long r0 = r0 - r2
            long r10 = java.lang.Math.min(r10, r0)
            bl.ppxfxbqfkf r2 = r8.f16714yggfygwlhe
            long r4 = r8.f16711esjtqupxsv
            r3 = r9
            r6 = r10
            r2.draadjrbmk(r3, r4, r6)
            long r0 = r8.f16711esjtqupxsv
            long r0 = r0 + r10
            r8.f16711esjtqupxsv = r0
            return r10
        L6d:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "closed"
            r9.<init>(r10)
            throw r9
        L75:
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.String r0 = "byteCount < 0: "
            r9.append(r0)
            r9.append(r10)
            java.lang.String r9 = r9.toString()
            java.lang.IllegalArgumentException r10 = new java.lang.IllegalArgumentException
            java.lang.String r9 = r9.toString()
            r10.<init>(r9)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: bl.lereixgezr.fmlbqenlif(bl.ppxfxbqfkf, long):long");
    }

    @Override // bl.wwaezpbzkn
    public ylkuphrtab ppxfxbqfkf() {
        return this.f16715zdlpuopuiu.ppxfxbqfkf();
    }
}
