package istkbnxepw;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public final class ikoacuggdj {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final ntlheqmsrt f49333iobyxmoadg = ntlheqmsrt.nufgyqmvbu(f49332zoijcleaow);

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    public static final jhduphickx f49332zoijcleaow = jhduphickx.zoijcleaow();

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private static final ikoacuggdj f49331ppxfxbqfkf = new ikoacuggdj();

    private static class iobyxmoadg implements sopmlzcsov.iobyxmoadg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final u1.iobyxmoadg f49334iobyxmoadg;

        iobyxmoadg(u1.iobyxmoadg iobyxmoadgVar) {
            this.f49334iobyxmoadg = iobyxmoadgVar;
        }

        @Override // istkbnxepw.sopmlzcsov.iobyxmoadg
        public void ppxfxbqfkf(Throwable th2) {
            lereixgezr.sopmlzcsov.wkgbmnqykc("ObserverToConsumerAdapter", "Unexpected error in Observable", th2);
        }

        @Override // istkbnxepw.sopmlzcsov.iobyxmoadg
        public void wkgbmnqykc(Object obj) {
            this.f49334iobyxmoadg.accept(obj);
        }
    }

    public static ikoacuggdj zoijcleaow() {
        return f49331ppxfxbqfkf;
    }

    public jhduphickx iobyxmoadg() {
        try {
            return (jhduphickx) this.f49333iobyxmoadg.ppxfxbqfkf().get();
        } catch (InterruptedException | ExecutionException e13) {
            throw new AssertionError("Unexpected error in QuirkSettings StateObservable", e13);
        }
    }

    public void ppxfxbqfkf(Executor executor, u1.iobyxmoadg iobyxmoadgVar) {
        this.f49333iobyxmoadg.zoijcleaow(executor, new iobyxmoadg(iobyxmoadgVar));
    }

    public void wkgbmnqykc(jhduphickx jhduphickxVar) {
        this.f49333iobyxmoadg.lqeggnwhkg(jhduphickxVar);
    }
}
