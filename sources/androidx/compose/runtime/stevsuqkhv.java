package androidx.compose.runtime;

/* JADX INFO: loaded from: classes.dex */
final class stevsuqkhv extends yzdjzghtvl.pmvmpeiblj implements kegysxyocb {

    /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
    private iobyxmoadg f6041iwizpuwonk = new iobyxmoadg(androidx.compose.runtime.snapshots.btonecajqb.hkdspvbjdz().dxjokdxxww());

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
    private final u0 f6042jyumaefscl;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    private final tg.iobyxmoadg f6043yggfygwlhe;

    public static final class iobyxmoadg extends yzdjzghtvl.zynmafqrjb implements kegysxyocb.iobyxmoadg {

        /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
        private androidx.collection.kegysxyocb f6047eablkybsjg;

        /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
        private Object f6048gxszxtbevo;

        /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
        private int f6049lqeggnwhkg;

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        private long f6050ppxfxbqfkf;

        /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
        private int f6051wkgbmnqykc;

        /* JADX INFO: renamed from: nufgyqmvbu, reason: collision with root package name */
        public static final C0106iobyxmoadg f6046nufgyqmvbu = new C0106iobyxmoadg(null);

        /* JADX INFO: renamed from: dxjokdxxww, reason: collision with root package name */
        public static final int f6045dxjokdxxww = 8;

        /* JADX INFO: renamed from: btonecajqb, reason: collision with root package name */
        private static final Object f6044btonecajqb = new Object();

        /* JADX INFO: renamed from: androidx.compose.runtime.stevsuqkhv$iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
        public static final class C0106iobyxmoadg {
            public /* synthetic */ C0106iobyxmoadg(kotlin.jvm.internal.gtknphoqwx gtknphoqwxVar) {
                this();
            }

            public final Object iobyxmoadg() {
                return iobyxmoadg.f6044btonecajqb;
            }

            private C0106iobyxmoadg() {
            }
        }

        public iobyxmoadg(long j13) {
            super(j13);
            this.f6047eablkybsjg = androidx.collection.tzroggbefp.iobyxmoadg();
            this.f6048gxszxtbevo = f6044btonecajqb;
        }

        public final void agtfadlqog(Object obj) {
            this.f6048gxszxtbevo = obj;
        }

        public final Object btonecajqb() {
            return this.f6048gxszxtbevo;
        }

        /* JADX WARN: Code duplicated, block: B:38:0x00a5 A[Catch: all -> 0x0079, LOOP:1: B:14:0x0039->B:38:0x00a5, LOOP_END, TryCatch #1 {all -> 0x0079, blocks: (B:11:0x002c, B:14:0x0039, B:16:0x0049, B:18:0x0055, B:20:0x005f, B:32:0x0099, B:23:0x006e, B:25:0x0072, B:29:0x0083, B:28:0x007b, B:40:0x00a9, B:38:0x00a5), top: B:56:0x002c }] */
        /* JADX WARN: Code duplicated, block: B:59:0x00a1 A[EDGE_INSN: B:59:0x00a1->B:36:0x00a1 BREAK  A[LOOP:1: B:14:0x0039->B:38:0x00a5], SYNTHETIC] */
        public final int draadjrbmk(kegysxyocb kegysxyocbVar, androidx.compose.runtime.snapshots.lqeggnwhkg lqeggnwhkgVar) {
            androidx.collection.kegysxyocb kegysxyocbVarZoijcleaow;
            int i13;
            int i14;
            synchronized (androidx.compose.runtime.snapshots.btonecajqb.dsvhmnatus()) {
                kegysxyocbVarZoijcleaow = zoijcleaow();
            }
            char c13 = 7;
            if (!kegysxyocbVarZoijcleaow.nufgyqmvbu()) {
                return 7;
            }
            ipoelvxyzq.ppxfxbqfkf ppxfxbqfkfVarPpxfxbqfkf = v0.ppxfxbqfkf();
            Object[] objArr = ppxfxbqfkfVarPpxfxbqfkf.f49169zdlpuopuiu;
            int iDraadjrbmk = ppxfxbqfkfVarPpxfxbqfkf.draadjrbmk();
            for (int i15 = 0; i15 < iDraadjrbmk; i15++) {
                ((tzroggbefp) objArr[i15]).zoijcleaow(kegysxyocbVar);
            }
            try {
                Object[] objArr2 = kegysxyocbVarZoijcleaow.f4329zoijcleaow;
                int[] iArr = kegysxyocbVarZoijcleaow.f4327ppxfxbqfkf;
                long[] jArr = kegysxyocbVarZoijcleaow.f4326iobyxmoadg;
                int length = jArr.length - 2;
                if (length >= 0) {
                    int iIobyxmoadg = 7;
                    int i16 = 0;
                    while (true) {
                        long j13 = jArr[i16];
                        if ((((~j13) << c13) & j13 & (-9187201950435737472L)) == -9187201950435737472L) {
                            if (i16 != length) {
                                break;
                                break;
                            }
                            i16++;
                            c13 = 7;
                        } else {
                            int i17 = 8;
                            int i18 = 8 - ((~(i16 - length)) >>> 31);
                            int i19 = 0;
                            while (i19 < i18) {
                                if ((j13 & 255) < 128) {
                                    int i23 = (i16 << 3) + i19;
                                    yzdjzghtvl.lereixgezr lereixgezrVar = (yzdjzghtvl.lereixgezr) objArr2[i23];
                                    if (iArr[i23] == 1) {
                                        yzdjzghtvl.zynmafqrjb zynmafqrjbVarJhduphickx = lereixgezrVar instanceof stevsuqkhv ? ((stevsuqkhv) lereixgezrVar).jhduphickx(lqeggnwhkgVar) : androidx.compose.runtime.snapshots.btonecajqb.jpowsppfya(lereixgezrVar.getFirstStateRecord(), lqeggnwhkgVar);
                                        iIobyxmoadg = (((iIobyxmoadg * 31) + ezmngbhpjk.oxmwwwfdhm.iobyxmoadg(zynmafqrjbVarJhduphickx)) * 31) + Long.hashCode(zynmafqrjbVarJhduphickx.gxszxtbevo());
                                    }
                                    i14 = 8;
                                } else {
                                    i14 = i17;
                                }
                                j13 >>= i14;
                                i19++;
                                i17 = i14;
                            }
                            if (i18 != i17) {
                                break;
                            }
                            if (i16 != length) {
                                break;
                            }
                            i16++;
                            c13 = 7;
                        }
                    }
                    i13 = iIobyxmoadg;
                } else {
                    i13 = 7;
                }
                gg.wwaezpbzkn wwaezpbzknVar = gg.wwaezpbzkn.f37140iobyxmoadg;
                return i13;
            } finally {
                Object[] objArr3 = ppxfxbqfkfVarPpxfxbqfkf.f49169zdlpuopuiu;
                int iDraadjrbmk2 = ppxfxbqfkfVarPpxfxbqfkf.draadjrbmk();
                for (int i24 = 0; i24 < iDraadjrbmk2; i24++) {
                    ((tzroggbefp) objArr3[i24]).iobyxmoadg(kegysxyocbVar);
                }
            }
        }

        public final boolean gtknphoqwx(kegysxyocb kegysxyocbVar, androidx.compose.runtime.snapshots.lqeggnwhkg lqeggnwhkgVar) {
            boolean z13;
            boolean z14;
            synchronized (androidx.compose.runtime.snapshots.btonecajqb.dsvhmnatus()) {
                z13 = true;
                z14 = (this.f6050ppxfxbqfkf == lqeggnwhkgVar.dxjokdxxww() && this.f6051wkgbmnqykc == lqeggnwhkgVar.btonecajqb()) ? false : true;
            }
            if (this.f6048gxszxtbevo == f6044btonecajqb || (z14 && this.f6049lqeggnwhkg != draadjrbmk(kegysxyocbVar, lqeggnwhkgVar))) {
                z13 = false;
            }
            if (z13 && z14) {
                synchronized (androidx.compose.runtime.snapshots.btonecajqb.dsvhmnatus()) {
                    this.f6050ppxfxbqfkf = lqeggnwhkgVar.dxjokdxxww();
                    this.f6051wkgbmnqykc = lqeggnwhkgVar.btonecajqb();
                    gg.wwaezpbzkn wwaezpbzknVar = gg.wwaezpbzkn.f37140iobyxmoadg;
                }
            }
            return z13;
        }

        @Override // androidx.compose.runtime.kegysxyocb.iobyxmoadg
        public Object iobyxmoadg() {
            return this.f6048gxszxtbevo;
        }

        public final void ojitshcjhn(int i13) {
            this.f6049lqeggnwhkg = i13;
        }

        @Override // yzdjzghtvl.zynmafqrjb
        public void ppxfxbqfkf(yzdjzghtvl.zynmafqrjb zynmafqrjbVar) {
            kotlin.jvm.internal.zdlpuopuiu.nufgyqmvbu(zynmafqrjbVar, "null cannot be cast to non-null type androidx.compose.runtime.DerivedSnapshotState.ResultRecord<T of androidx.compose.runtime.DerivedSnapshotState.ResultRecord>");
            iobyxmoadg iobyxmoadgVar = (iobyxmoadg) zynmafqrjbVar;
            wflxmlrfwp(iobyxmoadgVar.zoijcleaow());
            this.f6048gxszxtbevo = iobyxmoadgVar.f6048gxszxtbevo;
            this.f6049lqeggnwhkg = iobyxmoadgVar.f6049lqeggnwhkg;
        }

        public final void rgvfuqvkyq(long j13) {
            this.f6050ppxfxbqfkf = j13;
        }

        public final void vdvldrhtss(int i13) {
            this.f6051wkgbmnqykc = i13;
        }

        public void wflxmlrfwp(androidx.collection.kegysxyocb kegysxyocbVar) {
            this.f6047eablkybsjg = kegysxyocbVar;
        }

        @Override // yzdjzghtvl.zynmafqrjb
        public yzdjzghtvl.zynmafqrjb wkgbmnqykc(long j13) {
            return new iobyxmoadg(j13);
        }

        @Override // androidx.compose.runtime.kegysxyocb.iobyxmoadg
        public androidx.collection.kegysxyocb zoijcleaow() {
            return this.f6047eablkybsjg;
        }
    }

    public stevsuqkhv(tg.iobyxmoadg iobyxmoadgVar, u0 u0Var) {
        this.f6043yggfygwlhe = iobyxmoadgVar;
        this.f6042jyumaefscl = u0Var;
    }

    private final iobyxmoadg ikoacuggdj(iobyxmoadg iobyxmoadgVar, androidx.compose.runtime.snapshots.lqeggnwhkg lqeggnwhkgVar, boolean z13, tg.iobyxmoadg iobyxmoadgVar2) {
        androidx.compose.runtime.snapshots.lqeggnwhkg.iobyxmoadg iobyxmoadgVar3;
        u0 u0VarEablkybsjg;
        int i13;
        int i14;
        iobyxmoadg iobyxmoadgVar4 = iobyxmoadgVar;
        int i15 = 1;
        if (!iobyxmoadgVar4.gtknphoqwx(this, lqeggnwhkgVar)) {
            int i16 = 0;
            final androidx.collection.hcddaimhww hcddaimhwwVar = new androidx.collection.hcddaimhww(0, 1, null);
            final ezmngbhpjk.btonecajqb btonecajqbVar = (ezmngbhpjk.btonecajqb) w0.f6070iobyxmoadg.iobyxmoadg();
            if (btonecajqbVar == null) {
                btonecajqbVar = new ezmngbhpjk.btonecajqb(0);
                w0.f6070iobyxmoadg.zoijcleaow(btonecajqbVar);
            }
            final int iIobyxmoadg = btonecajqbVar.iobyxmoadg();
            ipoelvxyzq.ppxfxbqfkf ppxfxbqfkfVarPpxfxbqfkf = v0.ppxfxbqfkf();
            Object[] objArr = ppxfxbqfkfVarPpxfxbqfkf.f49169zdlpuopuiu;
            int iDraadjrbmk = ppxfxbqfkfVarPpxfxbqfkf.draadjrbmk();
            for (int i17 = 0; i17 < iDraadjrbmk; i17++) {
                ((tzroggbefp) objArr[i17]).zoijcleaow(this);
            }
            try {
                btonecajqbVar.zoijcleaow(iIobyxmoadg + 1);
                Object objNufgyqmvbu = androidx.compose.runtime.snapshots.lqeggnwhkg.f6010eablkybsjg.nufgyqmvbu(new tg.draadjrbmk() { // from class: androidx.compose.runtime.wypolnanlu
                    @Override // tg.draadjrbmk
                    public final Object invoke(Object obj) {
                        return stevsuqkhv.jztzpxfvev(this.f6085zdlpuopuiu, btonecajqbVar, hcddaimhwwVar, iIobyxmoadg, obj);
                    }
                }, null, iobyxmoadgVar2);
                btonecajqbVar.zoijcleaow(iIobyxmoadg);
                Object[] objArr2 = ppxfxbqfkfVarPpxfxbqfkf.f49169zdlpuopuiu;
                int iDraadjrbmk2 = ppxfxbqfkfVarPpxfxbqfkf.draadjrbmk();
                while (i16 < iDraadjrbmk2) {
                    ((tzroggbefp) objArr2[i16]).iobyxmoadg(this);
                    i16++;
                }
                synchronized (androidx.compose.runtime.snapshots.btonecajqb.dsvhmnatus()) {
                    try {
                        iobyxmoadgVar3 = androidx.compose.runtime.snapshots.lqeggnwhkg.f6010eablkybsjg;
                        androidx.compose.runtime.snapshots.lqeggnwhkg lqeggnwhkgVarPpxfxbqfkf = iobyxmoadgVar3.ppxfxbqfkf();
                        if (iobyxmoadgVar.btonecajqb() == iobyxmoadg.f6046nufgyqmvbu.iobyxmoadg() || (u0VarEablkybsjg = eablkybsjg()) == null || !u0VarEablkybsjg.zoijcleaow(objNufgyqmvbu, iobyxmoadgVar.btonecajqb())) {
                            iobyxmoadgVar4 = (iobyxmoadg) androidx.compose.runtime.snapshots.btonecajqb.ulzqkzuiru(this.f6041iwizpuwonk, this, lqeggnwhkgVarPpxfxbqfkf);
                            iobyxmoadgVar4.wflxmlrfwp(hcddaimhwwVar);
                            iobyxmoadgVar4.ojitshcjhn(iobyxmoadgVar4.draadjrbmk(this, lqeggnwhkgVarPpxfxbqfkf));
                            iobyxmoadgVar4.agtfadlqog(objNufgyqmvbu);
                        } else {
                            iobyxmoadgVar4.wflxmlrfwp(hcddaimhwwVar);
                            iobyxmoadgVar4.ojitshcjhn(iobyxmoadgVar4.draadjrbmk(this, lqeggnwhkgVarPpxfxbqfkf));
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                ezmngbhpjk.btonecajqb btonecajqbVar2 = (ezmngbhpjk.btonecajqb) w0.f6070iobyxmoadg.iobyxmoadg();
                if (btonecajqbVar2 != null && btonecajqbVar2.iobyxmoadg() == 0) {
                    iobyxmoadgVar3.lqeggnwhkg();
                    synchronized (androidx.compose.runtime.snapshots.btonecajqb.dsvhmnatus()) {
                        androidx.compose.runtime.snapshots.lqeggnwhkg lqeggnwhkgVarPpxfxbqfkf2 = iobyxmoadgVar3.ppxfxbqfkf();
                        iobyxmoadgVar4.rgvfuqvkyq(lqeggnwhkgVarPpxfxbqfkf2.dxjokdxxww());
                        iobyxmoadgVar4.vdvldrhtss(lqeggnwhkgVarPpxfxbqfkf2.btonecajqb());
                        gg.wwaezpbzkn wwaezpbzknVar = gg.wwaezpbzkn.f37140iobyxmoadg;
                    }
                }
                return iobyxmoadgVar4;
            } catch (Throwable th3) {
                Object[] objArr3 = ppxfxbqfkfVarPpxfxbqfkf.f49169zdlpuopuiu;
                int iDraadjrbmk3 = ppxfxbqfkfVarPpxfxbqfkf.draadjrbmk();
                while (i16 < iDraadjrbmk3) {
                    ((tzroggbefp) objArr3[i16]).iobyxmoadg(this);
                    i16++;
                }
                throw th3;
            }
        }
        if (z13) {
            ipoelvxyzq.ppxfxbqfkf ppxfxbqfkfVarPpxfxbqfkf2 = v0.ppxfxbqfkf();
            Object[] objArr4 = ppxfxbqfkfVarPpxfxbqfkf2.f49169zdlpuopuiu;
            int iDraadjrbmk4 = ppxfxbqfkfVarPpxfxbqfkf2.draadjrbmk();
            for (int i18 = 0; i18 < iDraadjrbmk4; i18++) {
                ((tzroggbefp) objArr4[i18]).zoijcleaow(this);
            }
            try {
                androidx.collection.kegysxyocb kegysxyocbVarZoijcleaow = iobyxmoadgVar.zoijcleaow();
                ezmngbhpjk.btonecajqb btonecajqbVar3 = (ezmngbhpjk.btonecajqb) w0.f6070iobyxmoadg.iobyxmoadg();
                if (btonecajqbVar3 == null) {
                    btonecajqbVar3 = new ezmngbhpjk.btonecajqb(0);
                    w0.f6070iobyxmoadg.zoijcleaow(btonecajqbVar3);
                }
                int iIobyxmoadg2 = btonecajqbVar3.iobyxmoadg();
                Object[] objArr5 = kegysxyocbVarZoijcleaow.f4329zoijcleaow;
                int[] iArr = kegysxyocbVarZoijcleaow.f4327ppxfxbqfkf;
                long[] jArr = kegysxyocbVarZoijcleaow.f4326iobyxmoadg;
                int length = jArr.length - 2;
                if (length >= 0) {
                    int i19 = 0;
                    while (true) {
                        long j13 = jArr[i19];
                        long[] jArr2 = jArr;
                        if ((((~j13) << 7) & j13 & (-9187201950435737472L)) != -9187201950435737472L) {
                            int i23 = 8;
                            int i24 = 8 - ((~(i19 - length)) >>> 31);
                            int i25 = 0;
                            while (i25 < i24) {
                                if ((j13 & 255) < 128) {
                                    int i26 = (i19 << 3) + i25;
                                    yzdjzghtvl.lereixgezr lereixgezrVar = (yzdjzghtvl.lereixgezr) objArr5[i26];
                                    btonecajqbVar3.zoijcleaow(iIobyxmoadg2 + iArr[i26]);
                                    tg.draadjrbmk draadjrbmkVarLqeggnwhkg = lqeggnwhkgVar.lqeggnwhkg();
                                    if (draadjrbmkVarLqeggnwhkg != null) {
                                        draadjrbmkVarLqeggnwhkg.invoke(lereixgezrVar);
                                    }
                                    i14 = 8;
                                } else {
                                    i14 = i23;
                                }
                                j13 >>= i14;
                                i25++;
                                i23 = i14;
                                i15 = 1;
                            }
                            int i27 = i23;
                            i13 = i15;
                            if (i24 != i27) {
                                break;
                            }
                        } else {
                            i13 = i15;
                        }
                        if (i19 == length) {
                            break;
                        }
                        i19 += i13;
                        i15 = i13;
                        jArr = jArr2;
                    }
                }
                btonecajqbVar3.zoijcleaow(iIobyxmoadg2);
                gg.wwaezpbzkn wwaezpbzknVar2 = gg.wwaezpbzkn.f37140iobyxmoadg;
            } finally {
                Object[] objArr6 = ppxfxbqfkfVarPpxfxbqfkf2.f49169zdlpuopuiu;
                int iDraadjrbmk5 = ppxfxbqfkfVarPpxfxbqfkf2.draadjrbmk();
                for (int i28 = 0; i28 < iDraadjrbmk5; i28++) {
                    ((tzroggbefp) objArr6[i28]).iobyxmoadg(this);
                }
            }
        }
        return iobyxmoadgVar4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final gg.wwaezpbzkn jztzpxfvev(stevsuqkhv stevsuqkhvVar, ezmngbhpjk.btonecajqb btonecajqbVar, androidx.collection.hcddaimhww hcddaimhwwVar, int i13, Object obj) {
        if (obj == stevsuqkhvVar) {
            throw new IllegalStateException("A derived state calculation cannot read itself");
        }
        if (obj instanceof yzdjzghtvl.lereixgezr) {
            hcddaimhwwVar.yggfygwlhe(obj, Math.min(btonecajqbVar.iobyxmoadg() - i13, hcddaimhwwVar.eablkybsjg(obj, Integer.MAX_VALUE)));
        }
        return gg.wwaezpbzkn.f37140iobyxmoadg;
    }

    private final String metgxyhuhe() {
        iobyxmoadg iobyxmoadgVar = (iobyxmoadg) androidx.compose.runtime.snapshots.btonecajqb.hcddaimhww(this.f6041iwizpuwonk);
        return iobyxmoadgVar.gtknphoqwx(this, androidx.compose.runtime.snapshots.lqeggnwhkg.f6010eablkybsjg.ppxfxbqfkf()) ? String.valueOf(iobyxmoadgVar.btonecajqb()) : "<Not calculated>";
    }

    @Override // yzdjzghtvl.lereixgezr
    public void cllcsxoeiz(yzdjzghtvl.zynmafqrjb zynmafqrjbVar) {
        kotlin.jvm.internal.zdlpuopuiu.nufgyqmvbu(zynmafqrjbVar, "null cannot be cast to non-null type androidx.compose.runtime.DerivedSnapshotState.ResultRecord<T of androidx.compose.runtime.DerivedSnapshotState>");
        this.f6041iwizpuwonk = (iobyxmoadg) zynmafqrjbVar;
    }

    @Override // androidx.compose.runtime.kegysxyocb
    public u0 eablkybsjg() {
        return this.f6042jyumaefscl;
    }

    @Override // androidx.compose.runtime.i1
    public Object getValue() {
        androidx.compose.runtime.snapshots.lqeggnwhkg.iobyxmoadg iobyxmoadgVar = androidx.compose.runtime.snapshots.lqeggnwhkg.f6010eablkybsjg;
        tg.draadjrbmk draadjrbmkVarLqeggnwhkg = iobyxmoadgVar.ppxfxbqfkf().lqeggnwhkg();
        if (draadjrbmkVarLqeggnwhkg != null) {
            draadjrbmkVarLqeggnwhkg.invoke(this);
        }
        androidx.compose.runtime.snapshots.lqeggnwhkg lqeggnwhkgVarPpxfxbqfkf = iobyxmoadgVar.ppxfxbqfkf();
        return ikoacuggdj((iobyxmoadg) androidx.compose.runtime.snapshots.btonecajqb.jpowsppfya(this.f6041iwizpuwonk, lqeggnwhkgVarPpxfxbqfkf), lqeggnwhkgVarPpxfxbqfkf, true, this.f6043yggfygwlhe).btonecajqb();
    }

    @Override // yzdjzghtvl.lereixgezr
    /* JADX INFO: renamed from: iozdgvuglv */
    public yzdjzghtvl.zynmafqrjb getFirstStateRecord() {
        return this.f6041iwizpuwonk;
    }

    public final yzdjzghtvl.zynmafqrjb jhduphickx(androidx.compose.runtime.snapshots.lqeggnwhkg lqeggnwhkgVar) {
        return ikoacuggdj((iobyxmoadg) androidx.compose.runtime.snapshots.btonecajqb.jpowsppfya(this.f6041iwizpuwonk, lqeggnwhkgVar), lqeggnwhkgVar, false, this.f6043yggfygwlhe);
    }

    @Override // androidx.compose.runtime.kegysxyocb
    public kegysxyocb.iobyxmoadg sopmlzcsov() {
        androidx.compose.runtime.snapshots.lqeggnwhkg lqeggnwhkgVarPpxfxbqfkf = androidx.compose.runtime.snapshots.lqeggnwhkg.f6010eablkybsjg.ppxfxbqfkf();
        return ikoacuggdj((iobyxmoadg) androidx.compose.runtime.snapshots.btonecajqb.jpowsppfya(this.f6041iwizpuwonk, lqeggnwhkgVarPpxfxbqfkf), lqeggnwhkgVarPpxfxbqfkf, false, this.f6043yggfygwlhe);
    }

    public String toString() {
        return "DerivedState(value=" + metgxyhuhe() + ")@" + hashCode();
    }
}
