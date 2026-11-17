package g9;

/* JADX INFO: loaded from: classes2.dex */
public abstract class gxszxtbevo {

    class iobyxmoadg implements zoijcleaow {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private volatile Object f36689iobyxmoadg;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        final /* synthetic */ zoijcleaow f36690zoijcleaow;

        iobyxmoadg(zoijcleaow zoijcleaowVar) {
            this.f36690zoijcleaow = zoijcleaowVar;
        }

        @Override // g9.gxszxtbevo.zoijcleaow
        public Object get() {
            if (this.f36689iobyxmoadg == null) {
                synchronized (this) {
                    try {
                        if (this.f36689iobyxmoadg == null) {
                            this.f36689iobyxmoadg = gtknphoqwx.eablkybsjg(this.f36690zoijcleaow.get());
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
            }
            return this.f36689iobyxmoadg;
        }
    }

    public interface zoijcleaow {
        Object get();
    }

    public static zoijcleaow iobyxmoadg(zoijcleaow zoijcleaowVar) {
        return new iobyxmoadg(zoijcleaowVar);
    }
}
