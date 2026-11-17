package h9;

/* JADX INFO: loaded from: classes2.dex */
public abstract class ppxfxbqfkf {

    private static class zoijcleaow extends ppxfxbqfkf {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private volatile boolean f39927iobyxmoadg;

        zoijcleaow() {
            super();
        }

        @Override // h9.ppxfxbqfkf
        public void ppxfxbqfkf() {
            if (this.f39927iobyxmoadg) {
                throw new IllegalStateException("Already released");
            }
        }

        @Override // h9.ppxfxbqfkf
        public void zoijcleaow(boolean z13) {
            this.f39927iobyxmoadg = z13;
        }
    }

    public static ppxfxbqfkf iobyxmoadg() {
        return new zoijcleaow();
    }

    public abstract void ppxfxbqfkf();

    abstract void zoijcleaow(boolean z13);

    private ppxfxbqfkf() {
    }
}
