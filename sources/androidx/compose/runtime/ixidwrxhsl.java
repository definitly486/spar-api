package androidx.compose.runtime;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
final class ixidwrxhsl {

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private final androidx.collection.iozdgvuglv f5687eablkybsjg;

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    private final gg.gtknphoqwx f5688gxszxtbevo;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final List f5689iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private int f5690ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final List f5691wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final int f5692zoijcleaow;

    static final class iobyxmoadg implements tg.iobyxmoadg {
        iobyxmoadg() {
        }

        @Override // tg.iobyxmoadg
        public /* bridge */ /* synthetic */ Object invoke() {
            return ipoelvxyzq.zoijcleaow.zoijcleaow(iobyxmoadg());
        }

        public final androidx.collection.dsvhmnatus iobyxmoadg() {
            androidx.collection.dsvhmnatus dsvhmnatusVarHkdspvbjdz = jyumaefscl.hkdspvbjdz(ixidwrxhsl.this.zoijcleaow().size());
            ixidwrxhsl ixidwrxhslVar = ixidwrxhsl.this;
            int size = ixidwrxhslVar.zoijcleaow().size();
            for (int i13 = 0; i13 < size; i13++) {
                yfnezrywwk yfnezrywwkVar = (yfnezrywwk) ixidwrxhslVar.zoijcleaow().get(i13);
                ipoelvxyzq.zoijcleaow.iobyxmoadg(dsvhmnatusVarHkdspvbjdz, jyumaefscl.yadqdtsiqt(yfnezrywwkVar), yfnezrywwkVar);
            }
            return dsvhmnatusVarHkdspvbjdz;
        }
    }

    public ixidwrxhsl(List list, int i13) {
        this.f5689iobyxmoadg = list;
        this.f5692zoijcleaow = i13;
        if (!(i13 >= 0)) {
            fmlbqenlif.iobyxmoadg("Invalid start index");
        }
        this.f5691wkgbmnqykc = new ArrayList();
        androidx.collection.iozdgvuglv iozdgvuglvVar = new androidx.collection.iozdgvuglv(0, 1, null);
        int size = list.size();
        int iPpxfxbqfkf = 0;
        for (int i14 = 0; i14 < size; i14++) {
            yfnezrywwk yfnezrywwkVar = (yfnezrywwk) this.f5689iobyxmoadg.get(i14);
            iozdgvuglvVar.oxmwwwfdhm(yfnezrywwkVar.zoijcleaow(), new jhduphickx(i14, iPpxfxbqfkf, yfnezrywwkVar.ppxfxbqfkf()));
            iPpxfxbqfkf += yfnezrywwkVar.ppxfxbqfkf();
        }
        this.f5687eablkybsjg = iozdgvuglvVar;
        this.f5688gxszxtbevo = gg.draadjrbmk.zoijcleaow(new iobyxmoadg());
    }

    public final boolean agtfadlqog(int i13, int i14) {
        int iZoijcleaow;
        jhduphickx jhduphickxVar = (jhduphickx) this.f5687eablkybsjg.zoijcleaow(i13);
        if (jhduphickxVar == null) {
            return false;
        }
        int iZoijcleaow2 = jhduphickxVar.zoijcleaow();
        int iIobyxmoadg = i14 - jhduphickxVar.iobyxmoadg();
        jhduphickxVar.wkgbmnqykc(i14);
        if (iIobyxmoadg == 0) {
            return true;
        }
        androidx.collection.iozdgvuglv iozdgvuglvVar = this.f5687eablkybsjg;
        Object[] objArr = iozdgvuglvVar.f4351ppxfxbqfkf;
        long[] jArr = iozdgvuglvVar.f4350iobyxmoadg;
        int length = jArr.length - 2;
        if (length < 0) {
            return true;
        }
        int i15 = 0;
        while (true) {
            long j13 = jArr[i15];
            if ((((~j13) << 7) & j13 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i16 = 8 - ((~(i15 - length)) >>> 31);
                for (int i17 = 0; i17 < i16; i17++) {
                    if ((255 & j13) < 128) {
                        jhduphickx jhduphickxVar2 = (jhduphickx) objArr[(i15 << 3) + i17];
                        if (jhduphickxVar2.zoijcleaow() >= iZoijcleaow2 && !kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(jhduphickxVar2, jhduphickxVar) && (iZoijcleaow = jhduphickxVar2.zoijcleaow() + iIobyxmoadg) >= 0) {
                            jhduphickxVar2.eablkybsjg(iZoijcleaow);
                        }
                    }
                    j13 >>= 8;
                }
                if (i16 != 8) {
                    return true;
                }
            }
            if (i15 == length) {
                return true;
            }
            i15++;
        }
    }

    public final void btonecajqb(int i13, int i14, int i15) {
        char c13 = 7;
        long j13 = -9187201950435737472L;
        if (i13 > i14) {
            androidx.collection.iozdgvuglv iozdgvuglvVar = this.f5687eablkybsjg;
            Object[] objArr = iozdgvuglvVar.f4351ppxfxbqfkf;
            long[] jArr = iozdgvuglvVar.f4350iobyxmoadg;
            int length = jArr.length - 2;
            if (length < 0) {
                return;
            }
            int i16 = 0;
            while (true) {
                long j14 = jArr[i16];
                if ((((~j14) << 7) & j14 & j13) != j13) {
                    int i17 = 8 - ((~(i16 - length)) >>> 31);
                    for (int i18 = 0; i18 < i17; i18++) {
                        if ((j14 & 255) < 128) {
                            jhduphickx jhduphickxVar = (jhduphickx) objArr[(i16 << 3) + i18];
                            int iZoijcleaow = jhduphickxVar.zoijcleaow();
                            if (i13 <= iZoijcleaow && iZoijcleaow < i13 + i15) {
                                jhduphickxVar.eablkybsjg((iZoijcleaow - i13) + i14);
                            } else if (i14 <= iZoijcleaow && iZoijcleaow < i13) {
                                jhduphickxVar.eablkybsjg(iZoijcleaow + i15);
                            }
                        }
                        j14 >>= 8;
                    }
                    if (i17 != 8) {
                        return;
                    }
                }
                if (i16 == length) {
                    return;
                }
                i16++;
                j13 = -9187201950435737472L;
            }
        } else {
            if (i14 <= i13) {
                return;
            }
            androidx.collection.iozdgvuglv iozdgvuglvVar2 = this.f5687eablkybsjg;
            Object[] objArr2 = iozdgvuglvVar2.f4351ppxfxbqfkf;
            long[] jArr2 = iozdgvuglvVar2.f4350iobyxmoadg;
            int length2 = jArr2.length - 2;
            if (length2 < 0) {
                return;
            }
            int i19 = 0;
            while (true) {
                long j15 = jArr2[i19];
                if ((((~j15) << c13) & j15 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i23 = 8 - ((~(i19 - length2)) >>> 31);
                    for (int i24 = 0; i24 < i23; i24++) {
                        if ((j15 & 255) < 128) {
                            jhduphickx jhduphickxVar2 = (jhduphickx) objArr2[(i19 << 3) + i24];
                            int iZoijcleaow2 = jhduphickxVar2.zoijcleaow();
                            if (i13 <= iZoijcleaow2 && iZoijcleaow2 < i13 + i15) {
                                jhduphickxVar2.eablkybsjg((iZoijcleaow2 - i13) + i14);
                            } else if (i13 + 1 <= iZoijcleaow2 && iZoijcleaow2 < i14) {
                                jhduphickxVar2.eablkybsjg(iZoijcleaow2 - i15);
                            }
                        }
                        j15 >>= 8;
                    }
                    if (i23 != 8) {
                        return;
                    }
                }
                if (i19 == length2) {
                    return;
                }
                i19++;
                c13 = 7;
            }
        }
    }

    public final void draadjrbmk(int i13) {
        this.f5690ppxfxbqfkf = i13;
    }

    public final void dxjokdxxww(yfnezrywwk yfnezrywwkVar, int i13) {
        this.f5687eablkybsjg.oxmwwwfdhm(yfnezrywwkVar.zoijcleaow(), new jhduphickx(-1, i13, 0));
    }

    public final int eablkybsjg() {
        return this.f5692zoijcleaow;
    }

    public final void gtknphoqwx(int i13, int i14) {
        char c13 = 7;
        long j13 = -9187201950435737472L;
        if (i13 > i14) {
            androidx.collection.iozdgvuglv iozdgvuglvVar = this.f5687eablkybsjg;
            Object[] objArr = iozdgvuglvVar.f4351ppxfxbqfkf;
            long[] jArr = iozdgvuglvVar.f4350iobyxmoadg;
            int length = jArr.length - 2;
            if (length < 0) {
                return;
            }
            int i15 = 0;
            while (true) {
                long j14 = jArr[i15];
                if ((((~j14) << 7) & j14 & j13) != j13) {
                    int i16 = 8 - ((~(i15 - length)) >>> 31);
                    for (int i17 = 0; i17 < i16; i17++) {
                        if ((j14 & 255) < 128) {
                            jhduphickx jhduphickxVar = (jhduphickx) objArr[(i15 << 3) + i17];
                            int iPpxfxbqfkf = jhduphickxVar.ppxfxbqfkf();
                            if (iPpxfxbqfkf == i13) {
                                jhduphickxVar.gxszxtbevo(i14);
                            } else if (i14 <= iPpxfxbqfkf && iPpxfxbqfkf < i13) {
                                jhduphickxVar.gxszxtbevo(iPpxfxbqfkf + 1);
                            }
                        }
                        j14 >>= 8;
                    }
                    if (i16 != 8) {
                        return;
                    }
                }
                if (i15 == length) {
                    return;
                }
                i15++;
                j13 = -9187201950435737472L;
            }
        } else {
            if (i14 <= i13) {
                return;
            }
            androidx.collection.iozdgvuglv iozdgvuglvVar2 = this.f5687eablkybsjg;
            Object[] objArr2 = iozdgvuglvVar2.f4351ppxfxbqfkf;
            long[] jArr2 = iozdgvuglvVar2.f4350iobyxmoadg;
            int length2 = jArr2.length - 2;
            if (length2 < 0) {
                return;
            }
            int i18 = 0;
            while (true) {
                long j15 = jArr2[i18];
                if ((((~j15) << c13) & j15 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i19 = 8 - ((~(i18 - length2)) >>> 31);
                    for (int i23 = 0; i23 < i19; i23++) {
                        if ((j15 & 255) < 128) {
                            jhduphickx jhduphickxVar2 = (jhduphickx) objArr2[(i18 << 3) + i23];
                            int iPpxfxbqfkf2 = jhduphickxVar2.ppxfxbqfkf();
                            if (iPpxfxbqfkf2 == i13) {
                                jhduphickxVar2.gxszxtbevo(i14);
                            } else if (i13 + 1 <= iPpxfxbqfkf2 && iPpxfxbqfkf2 < i14) {
                                jhduphickxVar2.gxszxtbevo(iPpxfxbqfkf2 - 1);
                            }
                        }
                        j15 >>= 8;
                    }
                    if (i19 != 8) {
                        return;
                    }
                }
                if (i18 == length2) {
                    return;
                }
                i18++;
                c13 = 7;
            }
        }
    }

    public final List gxszxtbevo() {
        return this.f5691wkgbmnqykc;
    }

    public final int iobyxmoadg() {
        return this.f5690ppxfxbqfkf;
    }

    public final int lqeggnwhkg(yfnezrywwk yfnezrywwkVar) {
        jhduphickx jhduphickxVar = (jhduphickx) this.f5687eablkybsjg.zoijcleaow(yfnezrywwkVar.zoijcleaow());
        if (jhduphickxVar != null) {
            return jhduphickxVar.zoijcleaow();
        }
        return -1;
    }

    public final boolean nufgyqmvbu(yfnezrywwk yfnezrywwkVar) {
        return this.f5691wkgbmnqykc.add(yfnezrywwkVar);
    }

    public final int ojitshcjhn(yfnezrywwk yfnezrywwkVar) {
        jhduphickx jhduphickxVar = (jhduphickx) this.f5687eablkybsjg.zoijcleaow(yfnezrywwkVar.zoijcleaow());
        return jhduphickxVar != null ? jhduphickxVar.iobyxmoadg() : yfnezrywwkVar.ppxfxbqfkf();
    }

    public final androidx.collection.dsvhmnatus ppxfxbqfkf() {
        return ((ipoelvxyzq.zoijcleaow) this.f5688gxszxtbevo.getValue()).ojitshcjhn();
    }

    public final int wflxmlrfwp(yfnezrywwk yfnezrywwkVar) {
        jhduphickx jhduphickxVar = (jhduphickx) this.f5687eablkybsjg.zoijcleaow(yfnezrywwkVar.zoijcleaow());
        if (jhduphickxVar != null) {
            return jhduphickxVar.ppxfxbqfkf();
        }
        return -1;
    }

    public final yfnezrywwk wkgbmnqykc(int i13, Object obj) {
        return (yfnezrywwk) ipoelvxyzq.zoijcleaow.gtknphoqwx(ppxfxbqfkf(), obj != null ? new uwvvkdfqfp(Integer.valueOf(i13), obj) : Integer.valueOf(i13));
    }

    public final List zoijcleaow() {
        return this.f5689iobyxmoadg;
    }
}
