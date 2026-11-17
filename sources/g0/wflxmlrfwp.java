package g0;

import androidx.collection.dsvhmnatus;
import androidx.collection.jhduphickx;
import androidx.collection.ribwqtqdhb;
import androidx.collection.vipkmwdibw;
import androidx.collection.wypolnanlu;
import androidx.compose.ui.platform.ezmngbhpjk;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class wflxmlrfwp implements yadqdtsiqt, Iterable, ug.iobyxmoadg {

    /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
    private boolean f35744cqumvgiudr;

    /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
    private boolean f35745iwizpuwonk;

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
    private wypolnanlu f35746jyumaefscl;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    private Map f35747yggfygwlhe;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    private final dsvhmnatus f35748zdlpuopuiu = ribwqtqdhb.zoijcleaow();

    public final boolean agtfadlqog() {
        return this.f35745iwizpuwonk;
    }

    public final Object btonecajqb(cdpycssgdh cdpycssgdhVar, tg.iobyxmoadg iobyxmoadgVar) {
        Object objEablkybsjg = this.f35748zdlpuopuiu.eablkybsjg(cdpycssgdhVar);
        return objEablkybsjg == null ? iobyxmoadgVar.invoke() : objEablkybsjg;
    }

    public final dsvhmnatus draadjrbmk() {
        return this.f35748zdlpuopuiu;
    }

    public final vipkmwdibw dxjokdxxww() {
        return this.f35746jyumaefscl;
    }

    public final wflxmlrfwp eablkybsjg() {
        wflxmlrfwp wflxmlrfwpVar = new wflxmlrfwp();
        wflxmlrfwpVar.f35745iwizpuwonk = this.f35745iwizpuwonk;
        wflxmlrfwpVar.f35744cqumvgiudr = this.f35744cqumvgiudr;
        wflxmlrfwpVar.f35748zdlpuopuiu.kcexrzcfyt(this.f35748zdlpuopuiu);
        return wflxmlrfwpVar;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wflxmlrfwp)) {
            return false;
        }
        wflxmlrfwp wflxmlrfwpVar = (wflxmlrfwp) obj;
        return kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f35748zdlpuopuiu, wflxmlrfwpVar.f35748zdlpuopuiu) && this.f35745iwizpuwonk == wflxmlrfwpVar.f35745iwizpuwonk && this.f35744cqumvgiudr == wflxmlrfwpVar.f35744cqumvgiudr;
    }

    public final Object gtknphoqwx(cdpycssgdh cdpycssgdhVar, tg.iobyxmoadg iobyxmoadgVar) {
        Object objEablkybsjg = this.f35748zdlpuopuiu.eablkybsjg(cdpycssgdhVar);
        return objEablkybsjg == null ? iobyxmoadgVar.invoke() : objEablkybsjg;
    }

    public final Object gxszxtbevo(cdpycssgdh cdpycssgdhVar) {
        Object objEablkybsjg = this.f35748zdlpuopuiu.eablkybsjg(cdpycssgdhVar);
        if (objEablkybsjg != null) {
            return objEablkybsjg;
        }
        throw new IllegalStateException("Key not present: " + cdpycssgdhVar + " - consider getOrElse or getOrNull");
    }

    public int hashCode() {
        return (((this.f35748zdlpuopuiu.hashCode() * 31) + Boolean.hashCode(this.f35745iwizpuwonk)) * 31) + Boolean.hashCode(this.f35744cqumvgiudr);
    }

    @Override // g0.yadqdtsiqt
    public void iobyxmoadg(cdpycssgdh cdpycssgdhVar, Object obj) {
        if ((obj instanceof iobyxmoadg) && ppxfxbqfkf(cdpycssgdhVar)) {
            Object objEablkybsjg = this.f35748zdlpuopuiu.eablkybsjg(cdpycssgdhVar);
            kotlin.jvm.internal.zdlpuopuiu.nufgyqmvbu(objEablkybsjg, "null cannot be cast to non-null type androidx.compose.ui.semantics.AccessibilityAction<*>");
            iobyxmoadg iobyxmoadgVar = (iobyxmoadg) objEablkybsjg;
            dsvhmnatus dsvhmnatusVar = this.f35748zdlpuopuiu;
            iobyxmoadg iobyxmoadgVar2 = (iobyxmoadg) obj;
            String strZoijcleaow = iobyxmoadgVar2.zoijcleaow();
            if (strZoijcleaow == null) {
                strZoijcleaow = iobyxmoadgVar.zoijcleaow();
            }
            gg.dxjokdxxww dxjokdxxwwVarIobyxmoadg = iobyxmoadgVar2.iobyxmoadg();
            if (dxjokdxxwwVarIobyxmoadg == null) {
                dxjokdxxwwVarIobyxmoadg = iobyxmoadgVar.iobyxmoadg();
            }
            dsvhmnatusVar.cqumvgiudr(cdpycssgdhVar, new iobyxmoadg(strZoijcleaow, dxjokdxxwwVarIobyxmoadg));
        } else {
            this.f35748zdlpuopuiu.cqumvgiudr(cdpycssgdhVar, obj);
        }
        if (cdpycssgdhVar.iobyxmoadg() != null) {
            if (this.f35746jyumaefscl == null) {
                this.f35746jyumaefscl = jhduphickx.zoijcleaow();
            }
            wypolnanlu wypolnanluVar = this.f35746jyumaefscl;
            if (wypolnanluVar != null) {
                wypolnanluVar.nufgyqmvbu(cdpycssgdhVar);
            }
        }
    }

    @Override // java.lang.Iterable
    public Iterator iterator() {
        Map mapIobyxmoadg = this.f35747yggfygwlhe;
        if (mapIobyxmoadg == null) {
            mapIobyxmoadg = this.f35748zdlpuopuiu.iobyxmoadg();
            this.f35747yggfygwlhe = mapIobyxmoadg;
        }
        return mapIobyxmoadg.entrySet().iterator();
    }

    public final void ojitshcjhn(wflxmlrfwp wflxmlrfwpVar) {
        dsvhmnatus dsvhmnatusVar = wflxmlrfwpVar.f35748zdlpuopuiu;
        Object[] objArr = dsvhmnatusVar.f4302zoijcleaow;
        Object[] objArr2 = dsvhmnatusVar.f4300ppxfxbqfkf;
        long[] jArr = dsvhmnatusVar.f4299iobyxmoadg;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i13 = 0;
        while (true) {
            long j13 = jArr[i13];
            if ((((~j13) << 7) & j13 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i14 = 8 - ((~(i13 - length)) >>> 31);
                for (int i15 = 0; i15 < i14; i15++) {
                    if ((255 & j13) < 128) {
                        int i16 = (i13 << 3) + i15;
                        Object obj = objArr[i16];
                        Object obj2 = objArr2[i16];
                        cdpycssgdh cdpycssgdhVar = (cdpycssgdh) obj;
                        Object objEablkybsjg = this.f35748zdlpuopuiu.eablkybsjg(cdpycssgdhVar);
                        kotlin.jvm.internal.zdlpuopuiu.nufgyqmvbu(cdpycssgdhVar, "null cannot be cast to non-null type androidx.compose.ui.semantics.SemanticsPropertyKey<kotlin.Any?>");
                        Object objWkgbmnqykc = cdpycssgdhVar.wkgbmnqykc(objEablkybsjg, obj2);
                        if (objWkgbmnqykc != null) {
                            this.f35748zdlpuopuiu.cqumvgiudr(cdpycssgdhVar, objWkgbmnqykc);
                        }
                    }
                    j13 >>= 8;
                }
                if (i14 != 8) {
                    return;
                }
            }
            if (i13 == length) {
                return;
            } else {
                i13++;
            }
        }
    }

    public final boolean ppxfxbqfkf(cdpycssgdh cdpycssgdhVar) {
        return this.f35748zdlpuopuiu.ppxfxbqfkf(cdpycssgdhVar);
    }

    public final void rgvfuqvkyq(boolean z13) {
        this.f35744cqumvgiudr = z13;
    }

    /* JADX WARN: Code duplicated, block: B:20:0x007b A[DONT_INVERT, PHI: r4
      0x007b: PHI (r4v4 java.lang.String) = (r4v3 java.lang.String), (r4v5 java.lang.String) binds: [B:12:0x0042, B:19:0x0079] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:21:0x007d A[LOOP:0: B:11:0x0034->B:21:0x007d, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:25:0x0080 A[EDGE_INSN: B:25:0x0080->B:22:0x0080 BREAK  A[LOOP:0: B:11:0x0034->B:21:0x007d], SYNTHETIC] */
    public String toString() {
        StringBuilder sb3 = new StringBuilder();
        String str = "";
        if (this.f35745iwizpuwonk) {
            sb3.append("");
            sb3.append("mergeDescendants=true");
            str = ", ";
        }
        if (this.f35744cqumvgiudr) {
            sb3.append(str);
            sb3.append("isClearingSemantics=true");
            str = ", ";
        }
        dsvhmnatus dsvhmnatusVar = this.f35748zdlpuopuiu;
        Object[] objArr = dsvhmnatusVar.f4302zoijcleaow;
        Object[] objArr2 = dsvhmnatusVar.f4300ppxfxbqfkf;
        long[] jArr = dsvhmnatusVar.f4299iobyxmoadg;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i13 = 0;
            while (true) {
                long j13 = jArr[i13];
                if ((((~j13) << 7) & j13 & (-9187201950435737472L)) == -9187201950435737472L) {
                    if (i13 != length) {
                        break;
                        break;
                    }
                    i13++;
                } else {
                    int i14 = 8 - ((~(i13 - length)) >>> 31);
                    for (int i15 = 0; i15 < i14; i15++) {
                        if ((255 & j13) < 128) {
                            int i16 = (i13 << 3) + i15;
                            Object obj = objArr[i16];
                            Object obj2 = objArr2[i16];
                            sb3.append(str);
                            sb3.append(((cdpycssgdh) obj).zoijcleaow());
                            sb3.append(" : ");
                            sb3.append(obj2);
                            str = ", ";
                        }
                        j13 >>= 8;
                    }
                    if (i14 != 8) {
                        break;
                    }
                    if (i13 != length) {
                        break;
                    }
                    i13++;
                }
            }
        }
        return ezmngbhpjk.iobyxmoadg(this, null) + "{ " + ((Object) sb3) + " }";
    }

    public final void vdvldrhtss(boolean z13) {
        this.f35745iwizpuwonk = z13;
    }

    public final boolean wflxmlrfwp() {
        return this.f35744cqumvgiudr;
    }

    public final boolean wkgbmnqykc() {
        dsvhmnatus dsvhmnatusVar = this.f35748zdlpuopuiu;
        Object[] objArr = dsvhmnatusVar.f4302zoijcleaow;
        Object[] objArr2 = dsvhmnatusVar.f4300ppxfxbqfkf;
        long[] jArr = dsvhmnatusVar.f4299iobyxmoadg;
        int length = jArr.length - 2;
        if (length < 0) {
            return false;
        }
        int i13 = 0;
        while (true) {
            long j13 = jArr[i13];
            if ((((~j13) << 7) & j13 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i14 = 8 - ((~(i13 - length)) >>> 31);
                for (int i15 = 0; i15 < i14; i15++) {
                    if ((255 & j13) < 128) {
                        int i16 = (i13 << 3) + i15;
                        Object obj = objArr[i16];
                        Object obj2 = objArr2[i16];
                        if (((cdpycssgdh) obj).ppxfxbqfkf()) {
                            return true;
                        }
                    }
                    j13 >>= 8;
                }
                if (i14 != 8) {
                    return false;
                }
            }
            if (i13 == length) {
                return false;
            }
            i13++;
        }
    }

    public final void zoijcleaow(wflxmlrfwp wflxmlrfwpVar) {
        int i13;
        if (wflxmlrfwpVar.f35745iwizpuwonk) {
            this.f35745iwizpuwonk = true;
        }
        if (wflxmlrfwpVar.f35744cqumvgiudr) {
            this.f35744cqumvgiudr = true;
        }
        dsvhmnatus dsvhmnatusVar = wflxmlrfwpVar.f35748zdlpuopuiu;
        Object[] objArr = dsvhmnatusVar.f4302zoijcleaow;
        Object[] objArr2 = dsvhmnatusVar.f4300ppxfxbqfkf;
        long[] jArr = dsvhmnatusVar.f4299iobyxmoadg;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i14 = 0;
        while (true) {
            long j13 = jArr[i14];
            if ((((~j13) << 7) & j13 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i15 = 8;
                int i16 = 8 - ((~(i14 - length)) >>> 31);
                int i17 = 0;
                while (i17 < i16) {
                    if ((255 & j13) < 128) {
                        int i18 = (i14 << 3) + i17;
                        Object obj = objArr[i18];
                        Object obj2 = objArr2[i18];
                        cdpycssgdh cdpycssgdhVar = (cdpycssgdh) obj;
                        if (!this.f35748zdlpuopuiu.zoijcleaow(cdpycssgdhVar)) {
                            this.f35748zdlpuopuiu.cqumvgiudr(cdpycssgdhVar, obj2);
                        } else if (obj2 instanceof iobyxmoadg) {
                            Object objEablkybsjg = this.f35748zdlpuopuiu.eablkybsjg(cdpycssgdhVar);
                            kotlin.jvm.internal.zdlpuopuiu.nufgyqmvbu(objEablkybsjg, "null cannot be cast to non-null type androidx.compose.ui.semantics.AccessibilityAction<*>");
                            iobyxmoadg iobyxmoadgVar = (iobyxmoadg) objEablkybsjg;
                            dsvhmnatus dsvhmnatusVar2 = this.f35748zdlpuopuiu;
                            String strZoijcleaow = iobyxmoadgVar.zoijcleaow();
                            if (strZoijcleaow == null) {
                                strZoijcleaow = ((iobyxmoadg) obj2).zoijcleaow();
                            }
                            String str = strZoijcleaow;
                            gg.dxjokdxxww dxjokdxxwwVarIobyxmoadg = iobyxmoadgVar.iobyxmoadg();
                            if (dxjokdxxwwVarIobyxmoadg == null) {
                                dxjokdxxwwVarIobyxmoadg = ((iobyxmoadg) obj2).iobyxmoadg();
                            }
                            dsvhmnatusVar2.cqumvgiudr(cdpycssgdhVar, new iobyxmoadg(str, dxjokdxxwwVarIobyxmoadg));
                        }
                        i13 = 8;
                    } else {
                        i13 = i15;
                    }
                    j13 >>= i13;
                    i17++;
                    i15 = i13;
                }
                if (i16 != i15) {
                    return;
                }
            }
            if (i14 == length) {
                return;
            } else {
                i14++;
            }
        }
    }
}
