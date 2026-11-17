package ac;

import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes2.dex */
class istkbnxepw implements Thread.UncaughtExceptionHandler {

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private final AtomicBoolean f1365eablkybsjg = new AtomicBoolean(false);

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final iobyxmoadg f1366iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final Thread.UncaughtExceptionHandler f1367ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final xb.iobyxmoadg f1368wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final ic.btonecajqb f1369zoijcleaow;

    interface iobyxmoadg {
        void iobyxmoadg(ic.btonecajqb btonecajqbVar, Thread thread, Throwable th2);
    }

    public istkbnxepw(iobyxmoadg iobyxmoadgVar, ic.btonecajqb btonecajqbVar, Thread.UncaughtExceptionHandler uncaughtExceptionHandler, xb.iobyxmoadg iobyxmoadgVar2) {
        this.f1366iobyxmoadg = iobyxmoadgVar;
        this.f1369zoijcleaow = btonecajqbVar;
        this.f1367ppxfxbqfkf = uncaughtExceptionHandler;
        this.f1368wkgbmnqykc = iobyxmoadgVar2;
    }

    private boolean zoijcleaow(Thread thread, Throwable th2) {
        if (thread == null) {
            xb.lqeggnwhkg.gxszxtbevo().wkgbmnqykc("Crashlytics will not record uncaught exception; null thread");
            return false;
        }
        if (th2 == null) {
            xb.lqeggnwhkg.gxszxtbevo().wkgbmnqykc("Crashlytics will not record uncaught exception; null throwable");
            return false;
        }
        if (!this.f1368wkgbmnqykc.zoijcleaow()) {
            return true;
        }
        xb.lqeggnwhkg.gxszxtbevo().zoijcleaow("Crashlytics will not record uncaught exception; native crash exists for session.");
        return false;
    }

    boolean iobyxmoadg() {
        return this.f1365eablkybsjg.get();
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0037  */
    /* JADX WARN: Undo finally extract visitor
    java.lang.NullPointerException: Cannot invoke "Object.hashCode()" because "this.second" is null
    	at jadx.core.utils.Pair.hashCode(Pair.java:35)
    	at java.base/java.util.HashMap.hash(HashMap.java:338)
    	at java.base/java.util.HashMap.getNode(HashMap.java:568)
    	at java.base/java.util.HashMap.containsKey(HashMap.java:594)
    	at jadx.core.dex.visitors.finaly.traverser.state.TraverserGlobalCommonState.hasBlocksBeenCached(TraverserGlobalCommonState.java:35)
    	at jadx.core.dex.visitors.finaly.traverser.handlers.MergePathActivePathTraverserHandler.handle(MergePathActivePathTraverserHandler.java:174)
    	at jadx.core.dex.visitors.finaly.traverser.handlers.AbstractActivePathTraverserHandler.process(AbstractActivePathTraverserHandler.java:19)
    	at jadx.core.dex.visitors.finaly.traverser.TraverserController.processHandlerImplementations(TraverserController.java:43)
    	at jadx.core.dex.visitors.finaly.traverser.TraverserController.advance(TraverserController.java:156)
    	at jadx.core.dex.visitors.finaly.traverser.TraverserController.process(TraverserController.java:79)
    	at jadx.core.dex.visitors.finaly.MarkFinallyVisitor.findCommonInsns(MarkFinallyVisitor.java:404)
    	at jadx.core.dex.visitors.finaly.MarkFinallyVisitor.extractFinally(MarkFinallyVisitor.java:284)
    	at jadx.core.dex.visitors.finaly.MarkFinallyVisitor.processTryBlock(MarkFinallyVisitor.java:202)
    	at jadx.core.dex.visitors.finaly.MarkFinallyVisitor.visit(MarkFinallyVisitor.java:135)
     */
    @Override // java.lang.Thread.UncaughtExceptionHandler
    public void uncaughtException(Thread thread, Throwable th2) {
        this.f1365eablkybsjg.set(true);
        try {
            try {
                if (zoijcleaow(thread, th2)) {
                    this.f1366iobyxmoadg.iobyxmoadg(this.f1369zoijcleaow, thread, th2);
                } else {
                    xb.lqeggnwhkg.gxszxtbevo().zoijcleaow("Uncaught exception will not be recorded by Crashlytics.");
                }
                if (this.f1367ppxfxbqfkf != null) {
                    xb.lqeggnwhkg.gxszxtbevo().zoijcleaow("Completed exception processing. Invoking default exception handler.");
                    this.f1367ppxfxbqfkf.uncaughtException(thread, th2);
                } else {
                    xb.lqeggnwhkg.gxszxtbevo().zoijcleaow("Completed exception processing, but no default exception handler.");
                    System.exit(1);
                }
            } catch (Exception e13) {
                xb.lqeggnwhkg.gxszxtbevo().eablkybsjg("An error occurred in the uncaught exception handler", e13);
                if (this.f1367ppxfxbqfkf == null) {
                    xb.lqeggnwhkg.gxszxtbevo().zoijcleaow("Completed exception processing, but no default exception handler.");
                    System.exit(1);
                }
            }
            this.f1365eablkybsjg.set(false);
        } catch (Throwable th3) {
            if (this.f1367ppxfxbqfkf != null) {
                xb.lqeggnwhkg.gxszxtbevo().zoijcleaow("Completed exception processing. Invoking default exception handler.");
                this.f1367ppxfxbqfkf.uncaughtException(thread, th2);
            } else {
                xb.lqeggnwhkg.gxszxtbevo().zoijcleaow("Completed exception processing, but no default exception handler.");
                System.exit(1);
            }
            this.f1365eablkybsjg.set(false);
            throw th3;
        }
    }
}
