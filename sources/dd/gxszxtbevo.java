package dd;

/* JADX INFO: loaded from: classes2.dex */
public final class gxszxtbevo implements com.google.firebase.perf.application.iobyxmoadg.InterfaceC0419iobyxmoadg {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private static final gd.iobyxmoadg f27848iobyxmoadg = gd.iobyxmoadg.eablkybsjg();

    @Override // com.google.firebase.perf.application.iobyxmoadg.InterfaceC0419iobyxmoadg
    public void iobyxmoadg() {
        try {
            eablkybsjg.ppxfxbqfkf();
        } catch (IllegalStateException e13) {
            f27848iobyxmoadg.gtknphoqwx("FirebaseApp is not initialized. Firebase Performance will not be collecting any performance metrics until initialized. %s", e13);
        }
    }
}
