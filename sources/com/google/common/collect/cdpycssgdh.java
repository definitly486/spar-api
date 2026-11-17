package com.google.common.collect;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/* JADX INFO: loaded from: classes2.dex */
public abstract class cdpycssgdh {

    public static abstract class eablkybsjg {

        class iobyxmoadg extends wkgbmnqykc {

            /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
            final /* synthetic */ int f23620iobyxmoadg;

            /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
            final /* synthetic */ eablkybsjg f23621zoijcleaow;

            iobyxmoadg(eablkybsjg eablkybsjgVar, int i13) {
                this.f23620iobyxmoadg = i13;
                this.f23621zoijcleaow = eablkybsjgVar;
            }

            @Override // com.google.common.collect.cdpycssgdh.wkgbmnqykc
            public esjtqupxsv eablkybsjg() {
                return yadqdtsiqt.zoijcleaow(this.f23621zoijcleaow.ppxfxbqfkf(), new ppxfxbqfkf(this.f23620iobyxmoadg));
            }
        }

        eablkybsjg() {
        }

        public wkgbmnqykc iobyxmoadg() {
            return zoijcleaow(2);
        }

        abstract Map ppxfxbqfkf();

        public wkgbmnqykc zoijcleaow(int i13) {
            nufgyqmvbu.zoijcleaow(i13, "expectedValuesPerKey");
            return new iobyxmoadg(this, i13);
        }
    }

    class iobyxmoadg extends eablkybsjg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        final /* synthetic */ int f23622iobyxmoadg;

        iobyxmoadg(int i13) {
            this.f23622iobyxmoadg = i13;
        }

        @Override // com.google.common.collect.cdpycssgdh.eablkybsjg
        Map ppxfxbqfkf() {
            return hcddaimhww.ppxfxbqfkf(this.f23622iobyxmoadg);
        }
    }

    private static final class ppxfxbqfkf implements xa.vdvldrhtss, Serializable {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        private final int f23623zdlpuopuiu;

        ppxfxbqfkf(int i13) {
            this.f23623zdlpuopuiu = nufgyqmvbu.zoijcleaow(i13, "expectedValuesPerKey");
        }

        @Override // xa.vdvldrhtss
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public List get() {
            return new ArrayList(this.f23623zdlpuopuiu);
        }
    }

    public static abstract class wkgbmnqykc extends cdpycssgdh {
        wkgbmnqykc() {
            super(null);
        }

        public abstract esjtqupxsv eablkybsjg();
    }

    class zoijcleaow extends eablkybsjg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        final /* synthetic */ Comparator f23624iobyxmoadg;

        zoijcleaow(Comparator comparator) {
            this.f23624iobyxmoadg = comparator;
        }

        @Override // com.google.common.collect.cdpycssgdh.eablkybsjg
        Map ppxfxbqfkf() {
            return new TreeMap(this.f23624iobyxmoadg);
        }
    }

    /* synthetic */ cdpycssgdh(iobyxmoadg iobyxmoadgVar) {
        this();
    }

    public static eablkybsjg iobyxmoadg() {
        return zoijcleaow(8);
    }

    public static eablkybsjg ppxfxbqfkf() {
        return wkgbmnqykc(pkzmftpjix.lqeggnwhkg());
    }

    public static eablkybsjg wkgbmnqykc(Comparator comparator) {
        xa.draadjrbmk.btonecajqb(comparator);
        return new zoijcleaow(comparator);
    }

    public static eablkybsjg zoijcleaow(int i13) {
        nufgyqmvbu.zoijcleaow(i13, "expectedKeys");
        return new iobyxmoadg(i13);
    }

    private cdpycssgdh() {
    }
}
