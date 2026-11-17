package mj;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes3.dex */
final class eablkybsjg implements lj.btonecajqb {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final CharSequence f67257iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final int f67258ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final tg.rgvfuqvkyq f67259wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final int f67260zoijcleaow;

    public static final class iobyxmoadg implements Iterator, ug.iobyxmoadg {

        /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
        private int f67261cqumvgiudr;

        /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
        private zg.btonecajqb f67263iwizpuwonk;

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        private int f67264jyumaefscl;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        private int f67265yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        private int f67266zdlpuopuiu = -1;

        iobyxmoadg() {
            int iAgtfadlqog = zg.gtknphoqwx.agtfadlqog(eablkybsjg.this.f67260zoijcleaow, 0, eablkybsjg.this.f67257iobyxmoadg.length());
            this.f67265yggfygwlhe = iAgtfadlqog;
            this.f67264jyumaefscl = iAgtfadlqog;
        }

        /* JADX WARN: Code duplicated, block: B:11:0x0031 A[ADDED_TO_REGION, REMOVE] */
        /* JADX WARN: Code duplicated, block: B:17:0x0098  */
        /* JADX WARN: Code duplicated, block: B:9:0x0023  */
        private final void iobyxmoadg() {
            gg.vdvldrhtss vdvldrhtssVar;
            if (this.f67264jyumaefscl < 0) {
                this.f67266zdlpuopuiu = 0;
                this.f67263iwizpuwonk = null;
                return;
            }
            if (eablkybsjg.this.f67258ppxfxbqfkf > 0) {
                int i13 = this.f67261cqumvgiudr + 1;
                this.f67261cqumvgiudr = i13;
                if (i13 >= eablkybsjg.this.f67258ppxfxbqfkf) {
                    this.f67263iwizpuwonk = new zg.btonecajqb(this.f67265yggfygwlhe, kcexrzcfyt.xrmfcynszj(eablkybsjg.this.f67257iobyxmoadg));
                    this.f67264jyumaefscl = -1;
                } else if (this.f67264jyumaefscl > eablkybsjg.this.f67257iobyxmoadg.length() && (vdvldrhtssVar = (gg.vdvldrhtss) eablkybsjg.this.f67259wkgbmnqykc.invoke(eablkybsjg.this.f67257iobyxmoadg, Integer.valueOf(this.f67264jyumaefscl))) != null) {
                    int iIntValue = ((Number) vdvldrhtssVar.iobyxmoadg()).intValue();
                    int iIntValue2 = ((Number) vdvldrhtssVar.wkgbmnqykc()).intValue();
                    this.f67263iwizpuwonk = zg.gtknphoqwx.jyumaefscl(this.f67265yggfygwlhe, iIntValue);
                    int i14 = iIntValue + iIntValue2;
                    this.f67265yggfygwlhe = i14;
                    this.f67264jyumaefscl = i14 + (iIntValue2 == 0 ? 1 : 0);
                } else {
                    this.f67263iwizpuwonk = new zg.btonecajqb(this.f67265yggfygwlhe, kcexrzcfyt.xrmfcynszj(eablkybsjg.this.f67257iobyxmoadg));
                    this.f67264jyumaefscl = -1;
                }
            } else if (this.f67264jyumaefscl > eablkybsjg.this.f67257iobyxmoadg.length()) {
                this.f67263iwizpuwonk = new zg.btonecajqb(this.f67265yggfygwlhe, kcexrzcfyt.xrmfcynszj(eablkybsjg.this.f67257iobyxmoadg));
                this.f67264jyumaefscl = -1;
            } else {
                int iIntValue3 = ((Number) vdvldrhtssVar.iobyxmoadg()).intValue();
                int iIntValue4 = ((Number) vdvldrhtssVar.wkgbmnqykc()).intValue();
                this.f67263iwizpuwonk = zg.gtknphoqwx.jyumaefscl(this.f67265yggfygwlhe, iIntValue3);
                int i15 = iIntValue3 + iIntValue4;
                this.f67265yggfygwlhe = i15;
                this.f67264jyumaefscl = i15 + (iIntValue4 == 0 ? 1 : 0);
            }
            this.f67266zdlpuopuiu = 1;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            if (this.f67266zdlpuopuiu == -1) {
                iobyxmoadg();
            }
            return this.f67266zdlpuopuiu == 1;
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.Iterator
        /* JADX INFO: renamed from: zoijcleaow, reason: merged with bridge method [inline-methods] */
        public zg.btonecajqb next() {
            if (this.f67266zdlpuopuiu == -1) {
                iobyxmoadg();
            }
            if (this.f67266zdlpuopuiu == 0) {
                throw new NoSuchElementException();
            }
            zg.btonecajqb btonecajqbVar = this.f67263iwizpuwonk;
            kotlin.jvm.internal.zdlpuopuiu.nufgyqmvbu(btonecajqbVar, "null cannot be cast to non-null type kotlin.ranges.IntRange");
            this.f67263iwizpuwonk = null;
            this.f67266zdlpuopuiu = -1;
            return btonecajqbVar;
        }
    }

    public eablkybsjg(CharSequence input, int i13, int i14, tg.rgvfuqvkyq getNextMatch) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(input, "input");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(getNextMatch, "getNextMatch");
        this.f67257iobyxmoadg = input;
        this.f67260zoijcleaow = i13;
        this.f67258ppxfxbqfkf = i14;
        this.f67259wkgbmnqykc = getNextMatch;
    }

    @Override // lj.btonecajqb
    public Iterator iterator() {
        return new iobyxmoadg();
    }
}
