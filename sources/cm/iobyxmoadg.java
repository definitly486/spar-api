package cm;

import java.io.Serializable;

/* JADX INFO: loaded from: classes3.dex */
public abstract class iobyxmoadg {

    /* JADX INFO: renamed from: cm.iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
    static final class C0374iobyxmoadg extends iobyxmoadg implements Serializable {
        private static final long serialVersionUID = 6740630888130243051L;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        private final rgvfuqvkyq f20101zdlpuopuiu;

        C0374iobyxmoadg(rgvfuqvkyq rgvfuqvkyqVar) {
            this.f20101zdlpuopuiu = rgvfuqvkyqVar;
        }

        public long dxjokdxxww() {
            return System.currentTimeMillis();
        }

        public boolean equals(Object obj) {
            if (obj instanceof C0374iobyxmoadg) {
                return this.f20101zdlpuopuiu.equals(((C0374iobyxmoadg) obj).f20101zdlpuopuiu);
            }
            return false;
        }

        public int hashCode() {
            return this.f20101zdlpuopuiu.hashCode() + 1;
        }

        @Override // cm.iobyxmoadg
        public rgvfuqvkyq iobyxmoadg() {
            return this.f20101zdlpuopuiu;
        }

        public String toString() {
            return "SystemClock[" + this.f20101zdlpuopuiu + "]";
        }

        @Override // cm.iobyxmoadg
        public wkgbmnqykc wkgbmnqykc() {
            return wkgbmnqykc.pmvmpeiblj(dxjokdxxww());
        }
    }

    protected iobyxmoadg() {
    }

    public static iobyxmoadg lqeggnwhkg(rgvfuqvkyq rgvfuqvkyqVar) {
        fm.ppxfxbqfkf.dxjokdxxww(rgvfuqvkyqVar, "zone");
        return new C0374iobyxmoadg(rgvfuqvkyqVar);
    }

    public static iobyxmoadg nufgyqmvbu() {
        return new C0374iobyxmoadg(rgvfuqvkyq.pmvmpeiblj());
    }

    public abstract rgvfuqvkyq iobyxmoadg();

    public abstract wkgbmnqykc wkgbmnqykc();
}
