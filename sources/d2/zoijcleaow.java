package d2;

/* JADX INFO: loaded from: classes.dex */
final class zoijcleaow extends wflxmlrfwp {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final Object f26826iobyxmoadg;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final int f26827zoijcleaow;

    public zoijcleaow(Object obj, int i13) {
        super(null);
        this.f26826iobyxmoadg = obj;
        this.f26827zoijcleaow = i13;
    }

    public final void iobyxmoadg() {
        Object obj = this.f26826iobyxmoadg;
        if (!((obj != null ? obj.hashCode() : 0) == this.f26827zoijcleaow)) {
            throw new IllegalStateException("Data in DataStore was mutated but DataStore is only compatible with Immutable types.");
        }
    }

    public final Object zoijcleaow() {
        return this.f26826iobyxmoadg;
    }
}
