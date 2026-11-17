package yi;

/* JADX INFO: loaded from: classes3.dex */
class draadjrbmk {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final Object f125301iobyxmoadg;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final Thread f125302zoijcleaow = Thread.currentThread();

    draadjrbmk(Object obj) {
        this.f125301iobyxmoadg = obj;
    }

    public Object iobyxmoadg() {
        if (zoijcleaow()) {
            return this.f125301iobyxmoadg;
        }
        throw new IllegalStateException("No value in this thread (hasValue should be checked before)");
    }

    public boolean zoijcleaow() {
        return this.f125302zoijcleaow == Thread.currentThread();
    }
}
