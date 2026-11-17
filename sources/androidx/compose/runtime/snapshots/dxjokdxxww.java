package androidx.compose.runtime.snapshots;

import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import gg.wwaezpbzkn;
import hg.jyumaefscl;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.zdlpuopuiu;
import tg.rgvfuqvkyq;

/* JADX INFO: loaded from: classes.dex */
public final class dxjokdxxww implements Iterable, ug.iobyxmoadg {

    /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
    public static final iobyxmoadg f5967cqumvgiudr = new iobyxmoadg(null);

    /* JADX INFO: renamed from: esjtqupxsv, reason: collision with root package name */
    private static final dxjokdxxww f5968esjtqupxsv = new dxjokdxxww(0, 0, 0, null);

    /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
    private final long[] f5969iwizpuwonk;

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
    private final long f5970jyumaefscl;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    private final long f5971yggfygwlhe;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    private final long f5972zdlpuopuiu;

    public static final class iobyxmoadg {
        public /* synthetic */ iobyxmoadg(kotlin.jvm.internal.gtknphoqwx gtknphoqwxVar) {
            this();
        }

        public final dxjokdxxww iobyxmoadg() {
            return dxjokdxxww.f5968esjtqupxsv;
        }

        private iobyxmoadg() {
        }
    }

    static final class zoijcleaow extends kotlin.coroutines.jvm.internal.gtknphoqwx implements rgvfuqvkyq {

        /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
        int f5973cqumvgiudr;

        /* JADX INFO: renamed from: esjtqupxsv, reason: collision with root package name */
        private /* synthetic */ Object f5974esjtqupxsv;

        /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
        int f5975iwizpuwonk;

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        int f5976jyumaefscl;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        Object f5978yggfygwlhe;

        zoijcleaow(lg.gxszxtbevo gxszxtbevoVar) {
            super(2, gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
            zoijcleaow zoijcleaowVar = dxjokdxxww.this.new zoijcleaow(gxszxtbevoVar);
            zoijcleaowVar.f5974esjtqupxsv = obj;
            return zoijcleaowVar;
        }

        /* JADX WARN: Code duplicated, block: B:36:0x00c3  */
        /* JADX WARN: Code duplicated, block: B:38:0x00d2  */
        /* JADX WARN: Code duplicated, block: B:40:0x00ee A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:41:0x00ef  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x0073 -> B:19:0x0076). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:26:0x0093 -> B:30:0x00b0). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:28:0x00ad -> B:30:0x00b0). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:37:0x00d0 -> B:43:0x00f1). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:41:0x00ef -> B:42:0x00f0). Please report as a decompilation issue!!! */
        /*  JADX ERROR: StackOverflowError in pass: RegionMakerVisitor
            java.lang.StackOverflowError
            	at jadx.core.utils.BlockUtils.traverseSuccessorsUntil(BlockUtils.java:731)
            	at jadx.core.utils.BlockUtils.traverseSuccessorsUntil(BlockUtils.java:749)
            */
        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final java.lang.Object invokeSuspend(java.lang.Object r19) {
            /*
                Method dump skipped, instruction units count: 248
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.snapshots.dxjokdxxww.zoijcleaow.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // tg.rgvfuqvkyq
        /* JADX INFO: renamed from: ojitshcjhn, reason: merged with bridge method [inline-methods] */
        public final Object invoke(lj.draadjrbmk draadjrbmkVar, lg.gxszxtbevo gxszxtbevoVar) {
            return ((zoijcleaow) create(draadjrbmkVar, gxszxtbevoVar)).invokeSuspend(wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    private dxjokdxxww(long j13, long j14, long j15, long[] jArr) {
        this.f5972zdlpuopuiu = j13;
        this.f5971yggfygwlhe = j14;
        this.f5970jyumaefscl = j15;
        this.f5969iwizpuwonk = jArr;
    }

    public final boolean btonecajqb(long j13) {
        long[] jArr;
        long j14 = j13 - this.f5970jyumaefscl;
        long j15 = 0;
        return zdlpuopuiu.wflxmlrfwp(j14, j15) < 0 || zdlpuopuiu.wflxmlrfwp(j14, (long) 64) >= 0 ? zdlpuopuiu.wflxmlrfwp(j14, (long) 64) < 0 || zdlpuopuiu.wflxmlrfwp(j14, (long) UserVerificationMethods.USER_VERIFY_PATTERN) >= 0 ? zdlpuopuiu.wflxmlrfwp(j14, j15) <= 0 && (jArr = this.f5969iwizpuwonk) != null && yzdjzghtvl.nufgyqmvbu.iobyxmoadg(jArr, j13) >= 0 : ((1 << (((int) j14) - 64)) & this.f5972zdlpuopuiu) != 0 : ((1 << ((int) j14)) & this.f5971yggfygwlhe) != 0;
    }

    public final dxjokdxxww draadjrbmk(dxjokdxxww dxjokdxxwwVar) {
        dxjokdxxww dxjokdxxwwVarWflxmlrfwp;
        dxjokdxxww dxjokdxxwwVar2 = f5968esjtqupxsv;
        if (dxjokdxxwwVar == dxjokdxxwwVar2) {
            return this;
        }
        if (this == dxjokdxxwwVar2) {
            return dxjokdxxwwVar;
        }
        long j13 = dxjokdxxwwVar.f5970jyumaefscl;
        long j14 = this.f5970jyumaefscl;
        if (j13 == j14) {
            long[] jArr = dxjokdxxwwVar.f5969iwizpuwonk;
            long[] jArr2 = this.f5969iwizpuwonk;
            if (jArr == jArr2) {
                return new dxjokdxxww(dxjokdxxwwVar.f5972zdlpuopuiu | this.f5972zdlpuopuiu, dxjokdxxwwVar.f5971yggfygwlhe | this.f5971yggfygwlhe, j14, jArr2);
            }
        }
        int i13 = 0;
        if (this.f5969iwizpuwonk == null) {
            long[] jArr3 = this.f5969iwizpuwonk;
            if (jArr3 != null) {
                for (long j15 : jArr3) {
                    dxjokdxxwwVar = dxjokdxxwwVar.wflxmlrfwp(j15);
                }
            }
            if (this.f5971yggfygwlhe != 0) {
                for (int i14 = 0; i14 < 64; i14++) {
                    if ((this.f5971yggfygwlhe & (1 << i14)) != 0) {
                        dxjokdxxwwVar = dxjokdxxwwVar.wflxmlrfwp(this.f5970jyumaefscl + ((long) i14));
                    }
                }
            }
            if (this.f5972zdlpuopuiu != 0) {
                while (i13 < 64) {
                    if ((this.f5972zdlpuopuiu & (1 << i13)) != 0) {
                        dxjokdxxwwVar = dxjokdxxwwVar.wflxmlrfwp(this.f5970jyumaefscl + ((long) i13) + ((long) 64));
                    }
                    i13++;
                }
            }
            return dxjokdxxwwVar;
        }
        long[] jArr4 = dxjokdxxwwVar.f5969iwizpuwonk;
        if (jArr4 != null) {
            dxjokdxxwwVarWflxmlrfwp = this;
            for (long j16 : jArr4) {
                dxjokdxxwwVarWflxmlrfwp = dxjokdxxwwVarWflxmlrfwp.wflxmlrfwp(j16);
            }
        } else {
            dxjokdxxwwVarWflxmlrfwp = this;
        }
        if (dxjokdxxwwVar.f5971yggfygwlhe != 0) {
            for (int i15 = 0; i15 < 64; i15++) {
                if ((dxjokdxxwwVar.f5971yggfygwlhe & (1 << i15)) != 0) {
                    dxjokdxxwwVarWflxmlrfwp = dxjokdxxwwVarWflxmlrfwp.wflxmlrfwp(dxjokdxxwwVar.f5970jyumaefscl + ((long) i15));
                }
            }
        }
        if (dxjokdxxwwVar.f5972zdlpuopuiu != 0) {
            while (i13 < 64) {
                if ((dxjokdxxwwVar.f5972zdlpuopuiu & (1 << i13)) != 0) {
                    dxjokdxxwwVarWflxmlrfwp = dxjokdxxwwVarWflxmlrfwp.wflxmlrfwp(dxjokdxxwwVar.f5970jyumaefscl + ((long) i13) + ((long) 64));
                }
                i13++;
            }
        }
        return dxjokdxxwwVarWflxmlrfwp;
    }

    public final dxjokdxxww dxjokdxxww(long j13) {
        long[] jArr;
        int iIobyxmoadg;
        long j14 = j13 - this.f5970jyumaefscl;
        long j15 = 0;
        if (zdlpuopuiu.wflxmlrfwp(j14, j15) >= 0 && zdlpuopuiu.wflxmlrfwp(j14, 64) < 0) {
            long j16 = 1 << ((int) j14);
            long j17 = this.f5971yggfygwlhe;
            if ((j17 & j16) != 0) {
                return new dxjokdxxww(this.f5972zdlpuopuiu, j17 & (~j16), this.f5970jyumaefscl, this.f5969iwizpuwonk);
            }
        } else if (zdlpuopuiu.wflxmlrfwp(j14, 64) >= 0 && zdlpuopuiu.wflxmlrfwp(j14, UserVerificationMethods.USER_VERIFY_PATTERN) < 0) {
            long j18 = 1 << (((int) j14) - 64);
            long j19 = this.f5972zdlpuopuiu;
            if ((j19 & j18) != 0) {
                return new dxjokdxxww(j19 & (~j18), this.f5971yggfygwlhe, this.f5970jyumaefscl, this.f5969iwizpuwonk);
            }
        } else if (zdlpuopuiu.wflxmlrfwp(j14, j15) < 0 && (jArr = this.f5969iwizpuwonk) != null && (iIobyxmoadg = yzdjzghtvl.nufgyqmvbu.iobyxmoadg(jArr, j13)) >= 0) {
            return new dxjokdxxww(this.f5972zdlpuopuiu, this.f5971yggfygwlhe, this.f5970jyumaefscl, yzdjzghtvl.nufgyqmvbu.eablkybsjg(jArr, iIobyxmoadg));
        }
        return this;
    }

    public final long gtknphoqwx(long j13) {
        long[] jArr = this.f5969iwizpuwonk;
        if (jArr != null) {
            return jArr[0];
        }
        long j14 = this.f5971yggfygwlhe;
        if (j14 != 0) {
            return this.f5970jyumaefscl + ((long) Long.numberOfTrailingZeros(j14));
        }
        long j15 = this.f5972zdlpuopuiu;
        return j15 != 0 ? this.f5970jyumaefscl + ((long) 64) + ((long) Long.numberOfTrailingZeros(j15)) : j13;
    }

    public final dxjokdxxww gxszxtbevo(dxjokdxxww dxjokdxxwwVar) {
        dxjokdxxww dxjokdxxwwVarDxjokdxxww;
        dxjokdxxww dxjokdxxwwVar2 = f5968esjtqupxsv;
        if (dxjokdxxwwVar == dxjokdxxwwVar2) {
            return this;
        }
        if (this == dxjokdxxwwVar2) {
            return dxjokdxxwwVar2;
        }
        long j13 = dxjokdxxwwVar.f5970jyumaefscl;
        long j14 = this.f5970jyumaefscl;
        if (j13 == j14) {
            long[] jArr = dxjokdxxwwVar.f5969iwizpuwonk;
            long[] jArr2 = this.f5969iwizpuwonk;
            if (jArr == jArr2) {
                return new dxjokdxxww((~dxjokdxxwwVar.f5972zdlpuopuiu) & this.f5972zdlpuopuiu, (~dxjokdxxwwVar.f5971yggfygwlhe) & this.f5971yggfygwlhe, j14, jArr2);
            }
        }
        long[] jArr3 = dxjokdxxwwVar.f5969iwizpuwonk;
        if (jArr3 != null) {
            dxjokdxxwwVarDxjokdxxww = this;
            for (long j15 : jArr3) {
                dxjokdxxwwVarDxjokdxxww = dxjokdxxwwVarDxjokdxxww.dxjokdxxww(j15);
            }
        } else {
            dxjokdxxwwVarDxjokdxxww = this;
        }
        if (dxjokdxxwwVar.f5971yggfygwlhe != 0) {
            for (int i13 = 0; i13 < 64; i13++) {
                if ((dxjokdxxwwVar.f5971yggfygwlhe & (1 << i13)) != 0) {
                    dxjokdxxwwVarDxjokdxxww = dxjokdxxwwVarDxjokdxxww.dxjokdxxww(dxjokdxxwwVar.f5970jyumaefscl + ((long) i13));
                }
            }
        }
        if (dxjokdxxwwVar.f5972zdlpuopuiu != 0) {
            for (int i14 = 0; i14 < 64; i14++) {
                if ((dxjokdxxwwVar.f5972zdlpuopuiu & (1 << i14)) != 0) {
                    dxjokdxxwwVarDxjokdxxww = dxjokdxxwwVarDxjokdxxww.dxjokdxxww(dxjokdxxwwVar.f5970jyumaefscl + ((long) i14) + ((long) 64));
                }
            }
        }
        return dxjokdxxwwVarDxjokdxxww;
    }

    @Override // java.lang.Iterable
    public Iterator iterator() {
        return lj.wflxmlrfwp.zoijcleaow(new zoijcleaow(null)).iterator();
    }

    public String toString() {
        StringBuilder sb3 = new StringBuilder();
        sb3.append(super.toString());
        sb3.append(" [");
        ArrayList arrayList = new ArrayList(jyumaefscl.cqumvgiudr(this, 10));
        Iterator it = iterator();
        while (it.hasNext()) {
            arrayList.add(String.valueOf(((Number) it.next()).longValue()));
        }
        sb3.append(yzdjzghtvl.zoijcleaow.wkgbmnqykc(arrayList, null, null, null, 0, null, null, 63, null));
        sb3.append(']');
        return sb3.toString();
    }

    public final dxjokdxxww wflxmlrfwp(long j13) {
        long j14;
        long j15;
        long[] jArrZoijcleaow;
        long j16 = j13 - this.f5970jyumaefscl;
        long j17 = 0;
        if (zdlpuopuiu.wflxmlrfwp(j16, j17) < 0 || zdlpuopuiu.wflxmlrfwp(j16, 64) >= 0) {
            long j18 = 64;
            if (zdlpuopuiu.wflxmlrfwp(j16, j18) < 0 || zdlpuopuiu.wflxmlrfwp(j16, UserVerificationMethods.USER_VERIFY_PATTERN) >= 0) {
                long j19 = UserVerificationMethods.USER_VERIFY_PATTERN;
                if (zdlpuopuiu.wflxmlrfwp(j16, j19) < 0) {
                    long[] jArr = this.f5969iwizpuwonk;
                    if (jArr == null) {
                        return new dxjokdxxww(this.f5972zdlpuopuiu, this.f5971yggfygwlhe, this.f5970jyumaefscl, new long[]{j13});
                    }
                    int iIobyxmoadg = yzdjzghtvl.nufgyqmvbu.iobyxmoadg(jArr, j13);
                    if (iIobyxmoadg < 0) {
                        return new dxjokdxxww(this.f5972zdlpuopuiu, this.f5971yggfygwlhe, this.f5970jyumaefscl, yzdjzghtvl.nufgyqmvbu.wkgbmnqykc(jArr, -(iIobyxmoadg + 1), j13));
                    }
                } else if (!btonecajqb(j13)) {
                    long j23 = this.f5972zdlpuopuiu;
                    long j24 = this.f5971yggfygwlhe;
                    long j25 = this.f5970jyumaefscl;
                    long j26 = j24;
                    long j27 = 1;
                    long j28 = ((j13 + j27) / j18) * j18;
                    if (zdlpuopuiu.wflxmlrfwp(j28, j17) < 0) {
                        j28 = (Long.MAX_VALUE - j19) + j27;
                    }
                    yzdjzghtvl.lqeggnwhkg lqeggnwhkgVar = null;
                    long j29 = j23;
                    while (true) {
                        if (zdlpuopuiu.wflxmlrfwp(j25, j28) >= 0) {
                            j14 = j25;
                            j15 = j26;
                            break;
                        }
                        if (j26 != 0) {
                            if (lqeggnwhkgVar == null) {
                                lqeggnwhkgVar = new yzdjzghtvl.lqeggnwhkg(this.f5969iwizpuwonk);
                            }
                            for (int i13 = 0; i13 < 64; i13++) {
                                if ((j26 & (1 << i13)) != 0) {
                                    lqeggnwhkgVar.iobyxmoadg(((long) i13) + j25);
                                }
                            }
                        }
                        if (j29 == 0) {
                            j14 = j28;
                            j15 = 0;
                            break;
                        }
                        j25 += j18;
                        j26 = j29;
                        j29 = 0;
                    }
                    if (lqeggnwhkgVar == null || (jArrZoijcleaow = lqeggnwhkgVar.zoijcleaow()) == null) {
                        jArrZoijcleaow = this.f5969iwizpuwonk;
                    }
                    return new dxjokdxxww(j29, j15, j14, jArrZoijcleaow).wflxmlrfwp(j13);
                }
            } else {
                long j33 = 1 << (((int) j16) - 64);
                long j34 = this.f5972zdlpuopuiu;
                if ((j34 & j33) == 0) {
                    return new dxjokdxxww(j34 | j33, this.f5971yggfygwlhe, this.f5970jyumaefscl, this.f5969iwizpuwonk);
                }
            }
        } else {
            long j35 = 1 << ((int) j16);
            long j36 = this.f5971yggfygwlhe;
            if ((j36 & j35) == 0) {
                return new dxjokdxxww(this.f5972zdlpuopuiu, j36 | j35, this.f5970jyumaefscl, this.f5969iwizpuwonk);
            }
        }
        return this;
    }
}
