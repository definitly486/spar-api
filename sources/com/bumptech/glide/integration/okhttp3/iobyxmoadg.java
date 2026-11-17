package com.bumptech.glide.integration.okhttp3;

import l8.lqeggnwhkg;
import lk.eablkybsjg;
import lk.lereixgezr;
import r8.agtfadlqog;
import r8.nufgyqmvbu;
import r8.ojitshcjhn;
import r8.oxmwwwfdhm;

/* JADX INFO: loaded from: classes2.dex */
public class iobyxmoadg implements agtfadlqog {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final eablkybsjg.iobyxmoadg f20765iobyxmoadg;

    /* JADX INFO: renamed from: com.bumptech.glide.integration.okhttp3.iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
    public static class C0381iobyxmoadg implements ojitshcjhn {

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private static volatile eablkybsjg.iobyxmoadg f20766zoijcleaow;

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final eablkybsjg.iobyxmoadg f20767iobyxmoadg;

        public C0381iobyxmoadg() {
            this(iobyxmoadg());
        }

        private static eablkybsjg.iobyxmoadg iobyxmoadg() {
            if (f20766zoijcleaow == null) {
                synchronized (C0381iobyxmoadg.class) {
                    try {
                        if (f20766zoijcleaow == null) {
                            f20766zoijcleaow = new lereixgezr();
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
            }
            return f20766zoijcleaow;
        }

        @Override // r8.ojitshcjhn
        public void eablkybsjg() {
        }

        @Override // r8.ojitshcjhn
        public agtfadlqog wkgbmnqykc(oxmwwwfdhm oxmwwwfdhmVar) {
            return new iobyxmoadg(this.f20767iobyxmoadg);
        }

        public C0381iobyxmoadg(eablkybsjg.iobyxmoadg iobyxmoadgVar) {
            this.f20767iobyxmoadg = iobyxmoadgVar;
        }
    }

    public iobyxmoadg(eablkybsjg.iobyxmoadg iobyxmoadgVar) {
        this.f20765iobyxmoadg = iobyxmoadgVar;
    }

    @Override // r8.agtfadlqog
    /* JADX INFO: renamed from: ppxfxbqfkf, reason: merged with bridge method [inline-methods] */
    public agtfadlqog.iobyxmoadg zoijcleaow(nufgyqmvbu nufgyqmvbuVar, int i13, int i14, lqeggnwhkg lqeggnwhkgVar) {
        return new agtfadlqog.iobyxmoadg(nufgyqmvbuVar, new k8.iobyxmoadg(this.f20765iobyxmoadg, nufgyqmvbuVar));
    }

    @Override // r8.agtfadlqog
    /* JADX INFO: renamed from: wkgbmnqykc, reason: merged with bridge method [inline-methods] */
    public boolean iobyxmoadg(nufgyqmvbu nufgyqmvbuVar) {
        return true;
    }
}
